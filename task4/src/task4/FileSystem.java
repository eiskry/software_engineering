package task4;

public abstract class FileSystem {
    private static FileSystem instance = null;
    public static FileSystem getInstance() {
      // 唯一のインスタンスを(必要なら生成して)返す．
    	
    	if (instance == null ) {
    		instance = new SimpleFileSystem();
    	}
   		return instance;
    	}
		public abstract Directory createDirectory(String name);
		public abstract File createFile(String name);
}

