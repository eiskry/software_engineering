package task1;

public class Book {
	// フィールド
    String author;
    String title;

    /*
     * オブジェクト生成時にauthorフィールドとtitleフィールドをセットする．
     */
    Book(String bookAuthor, String bookTitle)
    {
        author = bookAuthor;
        title = bookTitle;
    }

    // さらにメソッドを追加…
    // 1
    String getAuthor() {
    	return author;
    }
    
    String getTitle() {
    	return title;
    }
    
    // 2
    void printAuthor() {
    	System.out.println(getAuthor());
    }
    
     void printTitle() {
    	 System.out.println(getTitle());
     }
     
     // 3
     int pages;
     
     int getPages() {
    	 return pages;
     }
     
     void printPages() {
    	 System.out.println(getPages());
     }
     
     // 4
     void printDetails() {
    	 printAuthor();
    	 printTitle();
    	 printPages();
     }
     
     // 5
     void setPages( int n ) {
    	 pages = n;
     }
    
    public static void main(String[] args) {
        Book b = new Book("夏目漱石", "坊っちゃん");
        b.setPages(500);
        b.printDetails();
        Book b2 = new Book("Charles Dickens", "A Tale of Two Cities");
        b2.setPages(400);
        b2.printDetails();
      }

}
