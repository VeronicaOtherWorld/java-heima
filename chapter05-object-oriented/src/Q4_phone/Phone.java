package Q4_phone;

public class Phone {
    private String brand;
    private String colour;
    private double price;

    public Phone() {
    }

    public Phone(String brand, String colour, double price) {
        this.brand = brand;
        this.colour = colour;
        this.price = price;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Phone{" +
                "brand='" + brand + '\'' +
                ", colour='" + colour + '\'' +
                ", price=" + price +
                '}';
    }
}
