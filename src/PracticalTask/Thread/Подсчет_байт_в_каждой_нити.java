package PracticalTask.Thread;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Подсчет_байт_в_каждой_нити {

    public static Map<String, Integer> resultMap = new HashMap<>();

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        while (true) {
            String path = reader.readLine();
            if (!path.equals("exit")) {
                ReadThread thread = new ReadThread(path);
                thread.start();
            } else {
                break;
            }
        }
    }

    public static class ReadThread extends Thread {
        String fileName;
        Map<Integer, Integer> map = new TreeMap();

        public ReadThread(String fileName) {
            this.fileName = fileName;
        }

        // implement file reading here - реализуйте чтение из файла тут
        public void run() {
            try {
                FileInputStream reader = new FileInputStream(fileName);
                while (reader.available() > 0) {
                    int el = reader.read();
                    if (map.containsKey(el)) {
                        map.put(el, map.get(el) + 1);
                    } else {
                        map.put(el, 1);
                    }
                }
                reader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            int max = 0;
            int key = 0;
            for (Integer el : map.keySet()) {
                if (map.get(el) > max) {
                    max = map.get(el);
                    key = el;
                }
            }
            resultMap.put(fileName, key);

        }
    }
}































