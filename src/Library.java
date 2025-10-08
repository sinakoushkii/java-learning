public class Library {
    private final String name;
    private final int year;
    private final Book[] books;
    Library(String name,int year,Book[] books){
        this.name=name;
        this.year=year;
        this.books=books;
    }

    void displayLibraryInfo(){
        System.out.println("The library "+this.name+" was established in "+this.year);
        System.out.println("It has the following books:");
        for(Book book:this.books){
            book.displayBookInfo();
        }
    }
}
