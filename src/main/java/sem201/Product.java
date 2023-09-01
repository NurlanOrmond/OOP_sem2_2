package sem201;

public class Product {

    protected String name;
    protected String brand;
    protected double price;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        checkName(name);
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        checkBrand(brand);
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if (price < 50) {
            throw new RuntimeException("Некорректная цена товара.");
        }
        this.price = price;
    }

    public Product(String name, String brand, double price) {
        if (price < 50) {
            throw new RuntimeException("Некорректная цена товара.");
        }
        this.price = price;
        checkName(name);
        checkBrand(brand);
    }

    private void checkName(String name) {
        if (name == null || name.length() < 3) {
            this.name = "Unknown product";
        } else {
            this.name = name;
        }
    }

    private void checkBrand(String brand) {
        if (brand == null || brand.length() < 3) {
            this.brand = "Unknown producer";
        } else {
            this.brand = brand;
        }
    }


}
