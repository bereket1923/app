package POP.Assignmen4Part2;

public class Address {
    private String street;
    private String city;
    private String state;
    private String zipcode;

    // Constructor to initialize address
    public Address(String street, String city, String state, String zipcode) {
        this.street = street;
        this.city = city;
        this.state = state;
        this.zipcode = zipcode;
    }

    // Method to print the address details if needed
    public void printAddress() {
        System.out.println(street + ", " + city + ", " + state + " " + zipcode);
    }

    // Getters and Setters if needed
    public String getStreet() {
        return street;
    }
    public String getCity() {
        return city;
    }
    public String getState() {
        return state;
    }
    public String getZipcode() {
        return zipcode;
    }
}
