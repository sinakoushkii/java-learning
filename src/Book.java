public class Book {
    private final String title;
    private final int pages;

    Book(String title,int pages){
        this.title=title;
        this.pages=pages;
    }


    void displayBookInfo(){
        System.out.println("The book: "+this.title+",has "+this.pages+" pages ");
    }
}
