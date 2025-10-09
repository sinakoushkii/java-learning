public class Car {
    private final String name;
    private final String color;
    private final Engine engine;

    Car(String name,String color,String engineType){
        this.name=name;
        this.color=color;
        engine=new Engine(engineType);
    }

    public void displayCarInformation(){
        System.out.println("This is a "+color+" "+name+" car with "+engine.type+" engine");
    }

    public void carStarts(){
        engine.startEngine();
        System.out.println("Car is ready to go...");
    }
}
