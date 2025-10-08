public class Car implements Vehicle {

    private String name;
    private final String model;
    private int price;

    Car(String name, String model, int price) {
        this.name = name;
        this.model = model;
        this.price = price;
    }

    String getName() {
        return this.name;
    }

    String getModel() {
        return this.model;
    }

    String getPrice() {
        return this.price + " USD";
    }

    void setName(String name) {
        this.name = name;
    }

    @Override
    public void go() {
        System.out.println(this.name + " is going");
    }

    void setPrice(int price) {
        if (price < 0) {
            System.out.println("Price cannot be negative");
            return;
        } else {
            this.price = price;
        }
    }

    void setModel(String model) {
//        because model is final, it cannot be changed
        System.out.println("Model cannot be changed");
//        this.model=model;
    }
}
