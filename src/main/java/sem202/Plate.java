package sem202;

public class Plate {
    private int food;

    public Plate(int food) {
        this.food = food;
    }

    public int getFood() {
        return food;
    }

    public void setFood(int food) {
        this.food = food;
    }

    public void info() {
        if (food > 0) {
            System.out.println("There are " + food + " kg of meat on the plate.\n");
        } else {
            System.out.println("The plate is empty! Top the plate!\n");
        }
    }
}
