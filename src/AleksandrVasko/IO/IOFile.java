package AleksandrVasko.IO;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;


public class IOFile {
    public static void main(String[] args) throws IOException {
        renameFileOrDirectory(new File("/home/art/Documents/dir/filename.txt"));

        createFileOrDirectory(new File("C:\\Users/Nikolay/dir"));

        deleteDirRecursively(new File("C:\\Users/Nikolay/dir"));
    }

    /**метод удаляет каталог(дирректорию) но перед этим удаляет все что внутри каталога,возвращает true только если он был удален.*/
    public static void deleteDirRecursively(File dir) {
        File[] children = dir.listFiles();//передвем все внутренние файлы и каталоги в массив
        if(children.length>0){
            for (File child : children) {
                if (child.isDirectory()) {//проверяем, если элемент каталог(папка)
                    deleteDirRecursively(child);//тогда вызываем на ней наш метод еще раз
                } else {
                    child.delete();//если элемент не каталог, то просто удаляем его
                }
            }
        }else{
            dir.delete();//когда кталог пуст удаляем и его.
        }

        dir.delete();//когда кталог пуст удаляем и его.
    }

    /**метод переименовывает каталог(дирректорию)или файл, так же перемещает,возвращает true только если он был переименован или перемещен.*/
    public static boolean renameFileOrDirectory(File file){
       return  file.renameTo(new File("/home/art/Documents/dir/newname.txt"));
    }

    /**метод создает каталог(дирректорию)или файл, возвращает true только если он был создан.*/
    public static boolean createFileOrDirectory(File file) throws IOException {
        // boolean createdNewDirectory2 = file.mkdirs();//создается каталог и все его родительские каталоги если их не сущ.
        boolean createdNewDirectory = file.mkdir();//Создается каталог, если он был создан то возвращает true, если нет false в том числе есмли он уже существовал.
        if (createdNewDirectory) {
            System.out.println("It was successfully created.");
            BufferedWriter files = Files.newBufferedWriter((Path.of("C:\\Users/Nikolay/dir/test.txt")) );
            files.write("Опа...");
            files.close();
        } else {
            System.out.println("It was not created.");
        }
        return createdNewDirectory;
    }
}
