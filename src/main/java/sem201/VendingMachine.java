package sem201;

import java.util.List;

public class VendingMachine {

    private final List<Product> products;

    public VendingMachine(List<Product> products) {
        this.products = products;
    }

    public Product getProductByName(String name) {
        for (Product product : products) {
            if (product instanceof Grocery grocery) {
                if (grocery.getName().equals(name)) {
                    return grocery;
                }
            } else if (product instanceof Dairy dairy) {
                if (dairy.getName().equals(name)) {
                    return dairy;
                }

            } else if (product instanceof Chocolates chocolates) {
                if (chocolates.getName().equals(name)) {
                    return chocolates;
                }
            }

        }
        return null;
    }


}
