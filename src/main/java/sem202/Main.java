package sem202;

public class Main {
    public static void main(String[] args) {
        Cat cat = new Cat("Tiger", 10, false);
        Plate plate = new Plate(15);

        int initialAppetite = cat.getAppetite();

        cat.catInfo();
        plate.info();

        cat.eat();

        cat.setFed(cat.getAppetite() <= plate.getFood());
        cat.setAppetite(cat.getAppetite() - plate.getFood());
        plate.setFood(plate.getFood() - initialAppetite);

        cat.catInfo();
        plate.info();
    }
}
