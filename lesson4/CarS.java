package POP.lesson4;
public class CarS {
    private String model;
    private String color;


    // Constructor
    public CarS(String model, String color) {
        this.model = model;
        this.color = color;
    }

    // Getter and Setter for model
    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    // Getter and Setter for color
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}