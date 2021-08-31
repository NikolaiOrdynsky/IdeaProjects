package AleksandrVasko.IO;

import AleksandrVasko.Collections.Map.TreeMap.PredmetGrade;
import AleksandrVasko.Collections.Map.TreeMap.Student;

import java.io.IOException;
import java.util.HashSet;
import java.util.NavigableMap;
import java.util.Set;

public class Main {
    public static void main(String[] args) throws IOException {
        //NavigableMap<Student, Set<PredmetGrade>> map = Student.addStudent();
        // Writer.bfWriteStudent(map,"Student.txt");
        // Writer.bfWriteBankAccaunt("BankAccaunt.txt");
        // Writer.bfWriteFormatter("BankAccaunt2.txt");
        // Reader.FileReader("BankAccaunt.txt");

        // Writer.objectWriter(map,"Object.bin");
        // Reader.objectReader("Object.bin");
Reader.chanelByteBufferRead("BankAccaunt.txt");
    }
}
