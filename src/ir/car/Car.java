package ir.car;

public class Car {
    private String model;
    private String color;
    private int year;
    private Engine engine;

    public Car(String model,String color, int year,String engineName,String engineModel){
        this.model=model;
        this.color=color;
        this.year=year;
        engine=new Engine(engineName,engineModel);
    }

    public void switchOn(){
        System.out.println("Switching On The "+this.model);
    }

    public void drive(){
        System.out.println("Driving The "+this.model);
    }

    public void ShowEngineInformation(){
        System.out.println("The "+this.model+" has "+this.engine.getName());
    }


    @Override
    public String toString(){
        return "Car Details: "+model+"\nColor: "+color+"\nYear: "+year;
    }


}
