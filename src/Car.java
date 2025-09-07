public class Car {

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

    void setPrice(int price) {
        if (price < 0) {
            System.out.println("Price cannot be negative");
            return;
        } else {
            this.price = price;
        }
    }
}
