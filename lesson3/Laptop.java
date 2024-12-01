package POP.lesson3;

/***
 * this is a class represents laptop
 * @author Bereket
 * @version 2
 */
public class Laptop {

    //variable or field declaration
    private String brand;
    private int ram;

    // Track (count) the number of laptop objects created
    static int count = 0;

    // Default constructor
    public Laptop() {
        this.brand = "unknown";
        this.ram = 0;
        count = count + 1;  // Increment count whenever an object is created
    }

    // Constructor with brand parameter
    public Laptop(String brand) {
        this.brand = brand;  // Use the parameter passed
        this.ram = 0;
        count = count + 1;  // Increment count
    }

    /***
     * this is created for constructing brand and ram
     * @param brand
     * @param ram
     */
    // Constructor with both brand and ram parameters
    public Laptop(String brand, int ram) {
        this.brand = brand;
        this.ram = ram;
        count = count + 1;  // Increment count
    }

    // Setter for brand
    public void setBrand(String brand) {
        this.brand = brand;
    }

    /***
     * this represents setting laptop ram
     * @param ram
     */
    // Setter for RAM
    public void setRam(int ram) {
        this.ram = ram;
    }

    /***
     * this represents returning laptop brand
     * @return
     */
    // Getter for RAM
    public int getRam() {
        return ram;
    }

    // Getter for brand
    public String getBrand() {
        return brand;
    }

    // Static method to get the number of objects created
    public static int getCount() {
        return count;
    }
}

