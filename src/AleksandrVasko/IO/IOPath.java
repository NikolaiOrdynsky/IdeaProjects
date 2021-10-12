package AleksandrVasko.IO;

/**
 * The type Io path.
 */
/*
1.int compareTo(Path other)-Compares two abstract paths lexicographically.
2.default boolean endsWith(String other)-Tests if this path ends with a Path, constructed by converting the given path string, in exactly the manner specified by the endsWith(Path) method.
3.boolean endsWith(Path other)-Tests if this path ends with the given path.
4.boolean equals(Object other)-Tests this path for equality with the given object.
5.Path getFileName()-Returns the name of the file or directory denoted by this path as a Path object.
6.FileSystem getFileSystem()-Returns the file system that created this object.
7.Path getName(int index)-Returns a name element of this path as a Path object.
8.int getNameCount()-Returns the number of name elements in the path.
9.Path getParent()-Returns the parent path, or null if this path does not have a parent.
10.Path getRoot()-Returns the root component of this path as a Path object, or null if this path does not have a root component.
11.int hashCode()-Computes a hash code for this path.
12.boolean isAbsolute()-Tells whether or not this path is absolute.
13.default Iterator<Path> iterator()-Returns an iterator over the name elements of this path.
14.Path normalize()-Returns a path that is this path with redundant name elements eliminated.
15.static Path of(String first, String... more) -Возвращает путь путем преобразования строки пути или последовательности строк, которые при соединении образуют строку пути.
16.static Path of(URI uri)-Returns a Path by converting a URI.
17.default WatchKey register(WatchService watcher, WatchEvent.Kind<?>... events)-Registers the file located by this path with a watch service.
18.WatchKey register(WatchService watcher, WatchEvent.Kind<?>[] events, WatchEvent.Modifier... modifiers)-Registers the file located by this path with a watch service.
19.Path relativize(Path other)-Constructs a relative path between this path and a given path.
20.default Path resolve(String other)-Converts a given path string to a Path and resolves it against this Path in exactly the manner specified by the resolve method.
21.Path resolve(Path other)-Resolve the given path against this path.
22.default Path resolveSibling(String other)-Converts a given path string to a Path and resolves it against this path's parent path in exactly the manner specified by the resolveSibling method.
23.default Path resolveSibling(Path other)-Resolves the given path against this path's parent path.
24.default boolean startsWith(String other)-Tests if this path starts with a Path, constructed by converting the given path string, in exactly the manner specified by the startsWith(Path) method.
25.boolean startsWith(Path other)-Tests if this path starts with the given path.
26.Path subpath(int beginIndex, int endIndex)-Returns a relative Path that is a subsequence of the name elements of this path.
27.Path toAbsolutePath()-Returns a Path object representing the absolute path of this path.
28.default File toFile()-Returns a File object representing this path.
29.Path toRealPath(LinkOption... options)-Returns the real path of an existing file.
30.String toString()-Returns the string representation of this path.
31.URI toUri()-Returns a URI to represent this path.*/
public class IOPath {
}
