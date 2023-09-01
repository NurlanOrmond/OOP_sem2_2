package sem201;

public class Grocery extends Product {

    private double volume;
    private double alcohol;

    public Grocery(String name, String brand, double price, double volume, double alcohol) {
        super(name, brand, price);
        this.volume = volume;
        this.alcohol = alcohol;
    }

    public double getVolume() {
        return volume;
    }

    public double getAlcohol() {
        return alcohol;
    }


    @Override
    public String toString() {
        return "Grocery{" +
                "volume=" + volume +
                ", alcohol=" + alcohol +
                ", name='" + name + '\'' +
                ", brand='" + brand + '\'' +
                ", price=" + price +
                '}';
    }
}

