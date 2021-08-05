package AleksandrVasko.IO;

import AleksandrVasko.Collections.Map.TreeMap.PredmetGrade;
import AleksandrVasko.Collections.Map.TreeMap.Student;

import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        var map = Student.addStudent();
       // Writer.bfWriteStudent(map,"Student.txt");
       // Writer.bfWriteBankAccaunt("BankAccaunt");
       // Writer.bfWriteFormatter("BankAccaunt2");
       // Reader.FileReader("BankAccaunt");

        Writer.objectWriter(map,"Object.bin");
        Reader.objectReader("Object.bin");

    }
}
