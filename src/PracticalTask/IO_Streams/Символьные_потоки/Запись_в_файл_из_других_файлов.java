package PracticalTask.IO_Streams.Символьные_потоки;

import java.io.*;
import java.util.*;

public class Запись_в_файл_из_других_файлов {


    public static class LionAvi implements Comparable<LionAvi> {

        private String name;
        private String type;
        private int part;
        private String path;


        public LionAvi(String name, String type, int part, String path) {
            this.name = name;
            this.type = type;
            this.part = part;
            this.path = path;
        }

        public String getPath() {
            return path;
        }

        public String getName() {
            return name;
        }


        public String getType() {
            return type;
        }


        public int getPart() {
            return part;
        }


        @Override
        public int compareTo(LionAvi o) {
            return this.part - o.getPart();
        }
    }

    public static void setPath(String line, Set<LionAvi> collection) {
        String[] split = line.split("\\.");
        if ("Lion".equals(split[0])) {
            if ("avi".equals(split[1])) {
                String part = split[2].replace("part", "");
                try {
                    int parseInt = Integer.parseInt(part);
                    collection.add(new LionAvi(split[0], split[1], parseInt, line));
                } catch (NumberFormatException e) {
                    System.out.println("Вы ввели название файла - не Lion.avi.part№ ");
                }
            }
        }
    }

    public static void main(String[] args) throws IOException {
        SortedSet<LionAvi> set = new TreeSet<>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        while (true) {
            String path = reader.readLine();
            if (!path.equals("end")) {
                setPath(path, set);
            } else {
                break;
            }
        }


        for (LionAvi el : set) {
            BufferedInputStream read = new BufferedInputStream(new FileInputStream(el.path));
            String path = el.name+el.type;
            BufferedOutputStream write = new BufferedOutputStream(new FileOutputStream(path,true));
            byte[] buffer = new byte[read.available()];
            while (read.available()>0) {
                int read1 = read.read(buffer);
                write.write(buffer,0,read1);
            }
            read.close();
            write.close();
        }

    }
}
