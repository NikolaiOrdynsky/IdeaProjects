package AleksandrVasko.IO;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
/*
1.static long	copy(InputStream in, Path target, CopyOption... options)
Копирует все байты из входного потока в файл.
2.static long	copy(Path source, OutputStream out)
Копирует все байты из файла в выходной поток.
3.static Path	copy(Path source, Path target, CopyOption... options)
Copy a file to a target file.
4.static Path	createDirectories(Path dir, FileAttribute<?>... attrs)
Creates a directory by creating all nonexistent parent directories first.
5.static Path	createDirectory(Path dir, FileAttribute<?>... attrs)
Creates a new directory.
6.static Path	createFile(Path path, FileAttribute<?>... attrs)
Creates a new and empty file, failing if the file already exists.
7.static Path	createLink(Path link, Path existing)
Creates a new link (directory entry) for an existing file (optional operation).
8.static Path	createSymbolicLink(Path link, Path target, FileAttribute<?>... attrs)
Creates a symbolic link to a target (optional operation).
9.static Path	createTempDirectory(Path dir, String prefix, FileAttribute<?>... attrs)
Creates a new directory in the specified directory, using the given prefix to generate its name.
10.static Path	createTempDirectory(String prefix, FileAttribute<?>... attrs)
Creates a new directory in the default temporary-file directory, using the given prefix to generate its name.
11.static Path	createTempFile(Path dir, String prefix, String suffix, FileAttribute<?>... attrs)
Creates a new empty file in the specified directory, using the given prefix and suffix strings to generate its name.
12.static Path	createTempFile(String prefix, String suffix, FileAttribute<?>... attrs)
Creates an empty file in the default temporary-file directory, using the given prefix and suffix to generate its name.
13.static void	delete(Path path)
Deletes a file.
14.static boolean	deleteIfExists(Path path)
Deletes a file if it exists.
15.static boolean	exists(Path path, LinkOption... options)
Tests whether a file exists.
16.static Object	getAttribute(Path path, String attribute, LinkOption... options)
Reads the value of a file attribute.
17.static <V extends FileAttributeView>
V	getFileAttributeView(Path path, Class<V> type, LinkOption... options)
Returns a file attribute view of a given type.
18.static FileStore	getFileStore(Path path)
Returns the FileStore representing the file store where a file is located.
19.static FileTime	getLastModifiedTime(Path path, LinkOption... options)
Returns a file's last modified time.
20.static UserPrincipal	getOwner(Path path, LinkOption... options)
Returns the owner of a file.
21.static Set<PosixFilePermission>	getPosixFilePermissions(Path path, LinkOption... options)
Returns a file's POSIX file permissions.
22.static boolean	isDirectory(Path path, LinkOption... options)
Tests whether a file is a directory.
23.static boolean	isExecutable(Path path)
Tests whether a file is executable.
24.static boolean	isHidden(Path path)
Tells whether or not a file is considered hidden.
25.static boolean	isReadable(Path path)
Tests whether a file is readable.
26.static boolean	isRegularFile(Path path, LinkOption... options)
Tests whether a file is a regular file with opaque content.
27.static boolean	isSameFile(Path path, Path path2)
Tests if two paths locate the same file.
28.static boolean	isSymbolicLink(Path path)
Tests whether a file is a symbolic link.
29.static boolean	isWritable(Path path)
Tests whether a file is writable.
30.static Path	move(Path source, Path target, CopyOption... options)
Move or rename a file to a target file.
31.static BufferedReader	newBufferedReader(Path path, Charset cs)
Opens a file for reading, returning a BufferedReader that may be used to read text from the file in an efficient manner.
32.static BufferedWriter	newBufferedWriter(Path path, Charset cs, OpenOption... options)
Opens or creates a file for writing, returning a BufferedWriter that may be used to write text to the file in an efficient manner.
33.static SeekableByteChannel	newByteChannel(Path path, OpenOption... options)
Opens or creates a file, returning a seekable byte channel to access the file.
34.static SeekableByteChannel	newByteChannel(Path path, Set<? extends OpenOption> options, FileAttribute<?>... attrs)
Opens or creates a file, returning a seekable byte channel to access the file.
35.static DirectoryStream<Path>	newDirectoryStream(Path dir)
Opens a directory, returning a DirectoryStream to iterate over all entries in the directory.
36.static DirectoryStream<Path>	newDirectoryStream(Path dir, DirectoryStream.Filter<? super Path> filter)
Opens a directory, returning a DirectoryStream to iterate over the entries in the directory.
37.static DirectoryStream<Path>	newDirectoryStream(Path dir, String glob)
Opens a directory, returning a DirectoryStream to iterate over the entries in the directory.
38.static InputStream	newInputStream(Path path, OpenOption... options)
Opens a file, returning an input stream to read from the file.
39.static OutputStream	newOutputStream(Path path, OpenOption... options)
Opens or creates a file, returning an output stream that may be used to write bytes to the file.
40.static boolean	notExists(Path path, LinkOption... options)
Tests whether the file located by this path does not exist.
41.static String	probeContentType(Path path)
Probes the content type of a file.
42.static byte[]	readAllBytes(Path path)
Reads all the bytes from a file.
43.static List<String>	readAllLines(Path path, Charset cs)
Read all lines from a file.
44.static <A extends BasicFileAttributes>
A	readAttributes(Path path, Class<A> type, LinkOption... options)
Reads a file's attributes as a bulk operation.
45.static Map<String,Object>	readAttributes(Path path, String attributes, LinkOption... options)
Reads a set of file attributes as a bulk operation.
46.static Path	readSymbolicLink(Path link)
Reads the target of a symbolic link (optional operation).
47.static Path	setAttribute(Path path, String attribute, Object value, LinkOption... options)
Sets the value of a file attribute.
48.static Path	setLastModifiedTime(Path path, FileTime time)
Updates a file's last modified time attribute.
49.static Path	setOwner(Path path, UserPrincipal owner)
Updates the file owner.
50.static Path	setPosixFilePermissions(Path path, Set<PosixFilePermission> perms)
Sets a file's POSIX permissions.
51.static long	size(Path path)
Returns the size of a file (in bytes).
52.static Path	walkFileTree(Path start, FileVisitor<? super Path> visitor)
Walks a file tree.
53.static Path	walkFileTree(Path start, Set<FileVisitOption> options, int maxDepth, FileVisitor<? super Path> visitor)
Walks a file tree.
54.static Path	write(Path path, byte[] bytes, OpenOption... options)
Writes bytes to a file.
55.static Path	write(Path path, Iterable<? extends CharSequence> lines, Charset cs, OpenOption... options)
Write lines of text to a file.

Этот класс состоит исключительно из статических методов, которые работают с файлами, каталогами или файлами других типов.
В большинстве случаев методы, определенные здесь, делегируют выполнение файловых операций соответствующему поставщику файловой системы.


*/

/**
 * The type Nio files.
 */
public class NIOFiles {
    /**
     * The entry point of application.
     *
     * @param args the input arguments
     */
    public static void main(String[] args) {
      try(  BufferedReader bufferedReader = Files.newBufferedReader(Paths.get("BankAccaunt.txt"))){
          List<String> list = Files.readAllLines(Paths.get("BankAccaunt.txt"));
          System.out.println(list.toString());

      }catch(IOException e){
          e.printStackTrace();
      }

    }
}
