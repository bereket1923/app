package POP.lesson3;

public class Main {
    public static void main(String[] args) {
        //create laptop object
        Laptop laptop;
        laptop = new Laptop ();
        //Initialize (assigning value) data for laptop
        laptop.setBrand("Apple");
        laptop.setRam(16);
        //Retrieving (access) and print Values in two row
        System.out.println(laptop.getBrand());
        System.out.println("RAM is "+laptop.getRam() + "GB");
        //creat another laptop object (object creation and data initialization in one row)
        Laptop laptop2 = new Laptop( "samsung", 8);
        //Retrieve and print the values in one row
        System.out.println(laptop2.getBrand() + " " + laptop2.getRam() + "GB");
        // Print the brand and RAM of the first laptop again to check for conflicts
        System.out.println(laptop.getBrand());
        System.out.println("RAM is "+laptop.getRam() + "GB");
        //Print the total count of laptops created
        System.out.println("No.of laptop: "+ Laptop.getCount());

    }
}
