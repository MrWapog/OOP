import java.util.Scanner;


abstract class LibraryItem {

    
    private String title;
    private String author;

    
    public LibraryItem(String title, String author) {
        this.title = title;
        this.author = author;
    }

    
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

   
    public void displayInfo() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
    }

    
    public abstract void showItemType();
}



class Book extends LibraryItem {

    private String genre;
    private int numberOfPages;

    public Book(String title, String author, String genre, int numberOfPages) {
        super(title, author);
        this.genre = genre;
        this.numberOfPages = numberOfPages;
    }

    
    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public int getNumberOfPages() {
        return numberOfPages;
    }

    public void setNumberOfPages(int numberOfPages) {
        this.numberOfPages = numberOfPages;
    }

    
    @Override
    public void displayInfo() {
        System.out.println("\n===== BOOK INFORMATION =====");
        System.out.println("Title: " + getTitle());
        System.out.println("Author: " + getAuthor());
        System.out.println("Genre: " + genre);
        System.out.println("Number of Pages: " + numberOfPages);
    }

    
    @Override
    public void showItemType() {
        System.out.println("Item Type: Book");
    }
}



class Magazine extends LibraryItem {

    
    private int issueNumber;
    private String monthPublished;

    
    public Magazine(String title, String author, int issueNumber, String monthPublished) {
        super(title, author);
        this.issueNumber = issueNumber;
        this.monthPublished = monthPublished;
    }

    
    public int getIssueNumber() {
        return issueNumber;
    }

    public void setIssueNumber(int issueNumber) {
        this.issueNumber = issueNumber;
    }

    public String getMonthPublished() {
        return monthPublished;
    }

    public void setMonthPublished(String monthPublished) {
        this.monthPublished = monthPublished;
    }

    
    @Override
    public void displayInfo() {
        System.out.println("\n===== MAGAZINE INFORMATION =====");
        System.out.println("Title: " + getTitle());
        System.out.println("Author: " + getAuthor());
        System.out.println("Issue Number: " + issueNumber);
        System.out.println("Month Published: " + monthPublished);
    }

    
    @Override
    public void showItemType() {
        System.out.println("Item Type: Magazine");
    }
}



public class Library {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        
        System.out.println("Enter Book Details:");
        System.out.print("Title: ");
        String bTitle = sc.nextLine();

        System.out.print("Author: ");
        String bAuthor = sc.nextLine();

        System.out.print("Genre: ");
        String genre = sc.nextLine();

        System.out.print("Number of Pages: ");
        int pages = sc.nextInt();
        sc.nextLine(); 

        
        LibraryItem book = new Book(bTitle, bAuthor, genre, pages);

        
        System.out.println("\nEnter Magazine Details:");
        System.out.print("Title: ");
        String mTitle = sc.nextLine();

        System.out.print("Author: ");
        String mAuthor = sc.nextLine();

        System.out.print("Issue Number: ");
        int issue = sc.nextInt();
        sc.nextLine();

        System.out.print("Month Published: ");
        String month = sc.nextLine();

        
        LibraryItem magazine = new Magazine(mTitle, mAuthor, issue, month);

       
        book.displayInfo();
        book.showItemType();

        magazine.displayInfo();
        magazine.showItemType();

        sc.close();
    }
}

