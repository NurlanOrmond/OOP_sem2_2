package sem202;

public class Cat {
    private String name;
    private int appetite;
    private boolean isFed;

    public Cat(String name, int appetite, boolean isFed) {
        this.name = name;
        this.appetite = appetite;
        this.isFed = isFed;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAppetite() {
        return appetite;
    }

    public void setAppetite(int appetite) {
        if (appetite <= 0) {
            this.appetite = 0;
        } else {
            this.appetite = appetite;
        }
    }

    public boolean isFed(boolean b) {
        return isFed;
    }

    public void setFed(boolean fed) {
       isFed = fed;
    }

    public void eat() {
        System.out.println("The " + name + " start to eat!\n");
    }

    public void catInfo() {
        System.out.println("The " + name + " cat has appetite = " + appetite + ", is fed = " + isFed + ".\n");
    }
}
