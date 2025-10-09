public class Address {
    private final String city;
    private final String street;

    Address(String city, String street) {
        this.city = city;
        this.street = street;
    }

    void showAddress(){
        System.out.println(this.city+" "+this.street+" street");
    }
}
