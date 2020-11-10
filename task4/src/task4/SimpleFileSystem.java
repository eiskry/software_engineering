package task4;

class SimpleFileSystem extends FileSystem { // 他パッケージからはアクセスできない．
    protected SimpleFileSystem() { }  // クライアントクラスから直接生成することはできない．
    public Directory createDirectory(String name) {
        return new Directory(name);
    }
    public File createFile(String name) {
        return new File(name);
    }
}
