import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        // implement here the program that allows the user to enter 
        // book information and to examine them
        ArrayList<Book>bookList = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        
        while(true){
            System.out.println("Title: ");
            String name = sc.nextLine();
            if(name.equals("")){
                break;
            }
            
            System.out.println("Pages: ");
            int pages = Integer.valueOf(sc.nextLine());
            System.out.println("Publication year: ");
            int publicationYear = Integer.valueOf(sc.nextLine());
            bookList.add(new Book(name, pages, publicationYear));
        }
        
        System.out.println("What information will be printed?");
        String input = sc.nextLine();
        if(input.equalsIgnoreCase("everything")){
            for(Book book:bookList){
                System.out.println(book);
            }
        }
        
        if(input.equalsIgnoreCase("name")){
            for(Book book:bookList){
                System.out.println(book.getName());
            }
        }

    }
}
