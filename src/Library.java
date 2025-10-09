public class Library {
    private final Book[] books;
    private final Address address;

    Library(Book[] books){
        this.books = books;
        address=new Address("Tehran","Freshte");
    }
    void showLibraryInfo(){
        System.out.println("The books are:");
        for(Book book:this.books){
            book.showInfo();
        }
        System.out.println("--------------------------");
        System.out.println("Library Address:");
        address.showAddress();
    }
}
