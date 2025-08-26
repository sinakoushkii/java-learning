public class Car {
    String name;
    String company;
    String color;
    int model;

    Car(String name,String company,String color,int model){
        this.name=name;
        this.company=company;
        this.color=color;
        this.model=model;
    }

    @Override
    public String toString(){
        return name+" "+company+" "+color+" "+model;
    }
}
