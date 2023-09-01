package sem201;

public class Dairy extends Product {

    private double volume;
    private double fat;

    public Dairy(String name, String brand, double price, double volume, double fat) {
        super(name, brand, price);
        this.volume = volume;
        this.fat = fat;
    }

    public double getVolume() {
        return volume;
    }

    public double getFat() {
        return fat;
    }


    @Override
    public String toString() {
        return "Dairy{" +
                "volume=" + volume +
                ", fat=" + fat +
                ", name='" + name + '\'' +
                ", brand='" + brand + '\'' +
                ", price=" + price +
                '}';
    }
}
