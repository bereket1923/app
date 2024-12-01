package POP.lesson4;
public class CarDealer {
    // Method to get a car comes from the first class to connect each other
    public CarS getCar(String carModel, String color) {

        CarS car = new CarS(carModel, color);// Create a Car object
        //CarS car = car.getCar;  has its own getters and setters
        car.setModel("Toyota");//Initialize (assign) values to the car
        car.setColor("White");//or overwrite the value
        return car;//Return the car object
    }
    public static void main(String[] args) {
        // Create CarDealer object to access getCar method
        CarDealer dealer = new CarDealer();
        CarS car = dealer.getCar("Toyota", "White");// Get a car

        // Output car details
        System.out.println("Car Model: " + car.getModel());//comes from CarS class &
        System.out.println("Car Color: " + car.getColor());//car is object under class CarS
    }
}

