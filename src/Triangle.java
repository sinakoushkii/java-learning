public class Triangle extends Shape {
    double base;
    double height;
    Triangle(double base,double height) {
        this.base = base;
        this.height = height;
    }
    @Override
    double area(){
        return 0.5 * base * height;
    }
    @Override
    void display(){
        System.out.println("This is a Triangle with base: " + base + " and height: " + height);
    }

}
