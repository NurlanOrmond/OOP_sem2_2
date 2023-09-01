package sem201;

public class Chocolates extends Product {
   private double calories;
   private double weight;


   public Chocolates(String name, String brand, double price, double calories, double weight) {
      super(name, brand, price);
      this.calories = calories;
      this.weight = weight;
   }

   public double getCalories() {
      return calories;
   }

   public void setCalories(double calories) {
      this.calories = calories;
   }

   public double getWeight() {
      return weight;
   }

   public void setWeight(double weight) {
      this.weight = weight;
   }

   @Override
   public String toString() {
      return "Chocolates{" +
              "calories=" + calories +
              ", weight=" + weight +
              ", name='" + name + '\'' +
              ", brand='" + brand + '\'' +
              ", price=" + price +
              '}';
   }
}
