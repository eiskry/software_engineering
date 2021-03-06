package task4;


public class Main {
    public static void main(String[] args) {
	FileSystem fs = FileSystem.getInstance();
	Directory root = fs.createDirectory("root");
	root.addObserver(new CountingObserver());
	root.addObserver(new IndentObserver());
	Directory subdir1 = fs.createDirectory("bin");
	Directory subdir2 = fs.createDirectory("usr");
	subdir1.add(fs.createFile("command1"));
	subdir1.add(fs.createFile("command2"));
	subdir2.add(fs.createFile("data.txt"));
	root.add(subdir1);
	root.add(subdir2);
    }
}