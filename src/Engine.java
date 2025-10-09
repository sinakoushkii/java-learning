public class Engine {
    String type;

    Engine(String type) {
        this.type = type;
    }

    public void startEngine(){
        System.out.println("Start the "+type+" Engine");
    }
}
