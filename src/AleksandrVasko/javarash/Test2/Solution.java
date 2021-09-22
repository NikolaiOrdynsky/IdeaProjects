package AleksandrVasko.javarash.Test2;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;

public class Solution {
    public static volatile List<Person> allPeople = new ArrayList<>();

    static {
        allPeople.add(Person.createMale("Иванов Иван", new Date()));
        allPeople.add(Person.createMale("Петров Пётр", new Date()));
    }

    public static void main(String[] args) throws ParseException {
        if (args[0] == null || args.length < 2) {
            throw new RuntimeException("Неверные параметры программы.");
        }
        SimpleDateFormat formatIn = new SimpleDateFormat("dd/MM/yyyy", Locale.ENGLISH);
        SimpleDateFormat formatOut = new SimpleDateFormat("dd-MMM-yyyy", Locale.ENGLISH);
        Person person;
        Date date;
        switch (args[0]) {
            case "-c": {
               synchronized (allPeople){
                   for (int i = 1; i < args.length - 1; i = i + 3) {
                       if (args[i + 1].equals("м")) {
                           person = Person.createMale(args[i], formatIn.parse(args[i + 2]));
                           allPeople.add(person);
                           System.out.println(allPeople.size() - 1);
                       } else if (args[i + 1].equals("ж")) {
                           person = Person.createFemale(args[i], formatIn.parse(args[i + 2]));
                           allPeople.add(person);
                           System.out.println(allPeople.size() - 1);
                       }
                   }
               }
                break;
            }
            case "-u": {
               synchronized (allPeople){
                   for (int i = 1; i < args.length - 1; i = i + 4) {
                       int i1 = 0;
                       try {
                           i1 = Integer.parseInt(args[i]);
                       } catch (NumberFormatException s) {
                           s.printStackTrace();
                       }
                       if (i1 <= allPeople.size()) {
                           String dat = formatIn.format(formatIn.parse(args[i + 3]));
                           if (args[i + 2].equals("м")) {
                               person = Person.createMale(args[i + 1], formatIn.parse(dat));
                               if (allPeople.get(i1) != null) {
                                   allPeople.set(i1, person);
                               }
                           } else if (args[i + 2].equals("ж")) {
                               person = Person.createFemale(args[i + 1], formatIn.parse(dat));
                               if (allPeople.get(i1) != null) {
                                   allPeople.set(i1, person);
                               }
                           }

                       }
                   }
               }
                break;
            }
            case "-d": {
              synchronized (allPeople){
                  for (int i = 1; i <= args.length-1; i++) {
                      int id = 0;
                      try {
                          id = Integer.parseInt(args[i]);
                      } catch (NumberFormatException s) {
                          s.printStackTrace();
                      }
                      if (allPeople.get(id) != null) {
                          allPeople.get(id).setName(null);
                          allPeople.get(id).setBirthDate(null);
                          allPeople.get(id).setSex(null);
                      }
                  }
              }
                break;
            }
            case "-i": {
              synchronized (allPeople){
                  for (int i = 1; i <= args.length-1; i++) {
                      int id = 0;
                      try {
                          id = Integer.parseInt(args[i]);
                      } catch (NumberFormatException s) {
                          s.printStackTrace();
                      }
                      try {
                          if (allPeople.get(id) != null && allPeople.size() >= id) {
                              person = allPeople.get(id);
                              date = person.getBirthDate();
                              String dataBd = formatOut.format(date);
                              String sex = "";
                              if (person.getSex() == Sex.MALE) {
                                  sex = "м";
                              } else if (person.getSex() == Sex.FEMALE) {
                                  sex = "ж";
                              }
                              System.out.println(person.getName() + " " + sex + " " + dataBd);
                          }
                      } catch (IndexOutOfBoundsException s) {
                          throw new IndexOutOfBoundsException("нет Person с таким id");
                      }
                  }
              }
                break;
            }
        }
    }
}

