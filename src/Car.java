public class Car extends Vehicle {
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
    @Override
    void go() {
        System.out.println("Car is driving");
    }


//    @Override
//    public boolean equals(Object obj) {
//        return this.name.equals(((Car)obj).name) && this.company.equals(((Car)obj).company) && this.color.equals(((Car)obj).color) && this.model==((Car)obj).model;
//    }
//
//    @Override
//    public int hashCode() {
//        return name.hashCode()+company.hashCode()+color.hashCode()+Integer.valueOf(model).hashCode();
//    }
}
