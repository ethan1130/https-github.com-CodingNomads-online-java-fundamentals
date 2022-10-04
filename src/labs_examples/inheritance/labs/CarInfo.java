package labs_examples.inheritance.labs;

public class CarInfo extends Fluids {
    private String color;
    private String brand;

    public void setColor(String color) {
        this.color = "Gray";
    }

    public void setBrand(String brand) {
        this.brand = "Nissan";
    }

    public String getColor() {
        return color;
    }
    public String getBrand() {
        return brand;
    }

}
