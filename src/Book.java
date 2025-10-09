public class Book {
    private final String name;
    private final String author;

    Book(String name,String author){
        this.name=name;
        this.author=author;
    }

    void showInfo(){
        System.out.println("The book "+name+" is written by "+author);
    }
}
