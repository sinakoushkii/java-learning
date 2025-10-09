import java.util.Scanner;
import java.util.Random;

public class Main {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        Book book1=new Book("atomic habits","James Clear");
        Book book2=new Book("Harry Potter","Jenn Rowling");


        Book[] books={book1,book2};

        Library library=new Library(books);
        library.showLibraryInfo();

        System.out.println("********************************");
        Car myCar=new Car("mostung","black","V8");
        myCar.displayCarInformation();
        System.out.println("===============");
        myCar.carStarts();
    }
}
