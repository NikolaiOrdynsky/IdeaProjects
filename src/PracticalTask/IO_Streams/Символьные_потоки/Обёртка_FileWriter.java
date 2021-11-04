package PracticalTask.IO_Streams.Символьные_потоки;

import java.io.File;
import java.io.FileDescriptor;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.Arrays;

public class Обёртка_FileWriter {
    public static class FileConsoleWriter {
       private FileWriter fileWriter;

        public FileConsoleWriter(String fileName) throws IOException {
            this.fileWriter = new FileWriter(fileName);
        }

        public FileConsoleWriter(String fileName, boolean append) throws IOException {
            this.fileWriter = new FileWriter(fileName, append);
        }

        public FileConsoleWriter(File file) throws IOException {
            this.fileWriter = new FileWriter(file);
        }

        public FileConsoleWriter(FileDescriptor fd) throws IOException {
            this.fileWriter = new FileWriter(fd);
        }

        public FileConsoleWriter(String fileName, Charset charset) throws IOException {
            this.fileWriter = new FileWriter(fileName, charset);
        }

        public void write(char[]buff,int off,int len) throws IOException {
            try{
                this.fileWriter.write(buff,off,len);
                char[] x = Arrays.copyOfRange(buff, off, len);
                System.out.println(Arrays.toString(x));
            }catch (ArrayIndexOutOfBoundsException e){
                e.printStackTrace();
            }
        }
        public void write(String str) throws IOException {
            this.fileWriter.write(str);
            System.out.println(str);
        }
        public void write(int c) throws IOException {
            this.fileWriter.write(c);
            System.out.println(c);
        }
        public void write(char[] buff) throws IOException {
            this.fileWriter.write(buff);
            System.out.println(Arrays.toString(buff));
        }
        public void write(String str,int off, int len) throws IOException {
           if(str.length()>len&&off<len){
               this.fileWriter.write(str,off,len);
               System.out.println(str.substring(off,len));
           }

        }
        public void close() throws IOException {
            this.fileWriter.close();
        }
    }

    public static void main(String[] args) throws IOException {
        char[] buff = {'a','b','c'};
        String str = "hello";
        int c = 1000;
        FileConsoleWriter writer = new FileConsoleWriter("teasr.txt");
        writer.write(buff);
       writer.close();
    }
}
