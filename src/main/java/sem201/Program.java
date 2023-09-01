package sem201;

import java.util.ArrayList;
import java.util.List;

public class Program {

    public static void main(String[] args) {

        List <Product> products = new ArrayList<>();

        products.add(new Dairy("Milk", "Prostokvashno", 75.0, 1.0, 3.2));
        products.add(new Dairy("Cheese", "Brest-Loitovski", 160.99, 0.3, 20.2));
        products.add(new Grocery("Vine", "Kidzmaraulli", 888.55, 0.7, 12.2));
        products.add(new Grocery("Beer", "Baltica", 50.8, 0.5, 9.0));
        products.add(new Chocolates("Chocolate", "Aliyonka", 80.99, 650.0, 100));
        products.add(new Chocolates("Candies", "Chupa-Chups", 90.5, 500, 50.0));


        VendingMachine mega = new VendingMachine(products);

        System.out.println(mega.getBottleOfWater("Candies"));



    }


}

