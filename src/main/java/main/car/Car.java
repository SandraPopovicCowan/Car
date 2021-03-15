
package main.car;


public class Car {
   public String brand;
   public String model;
   public String color;
   private int buildYear;
   
   public Car() {
       
   }
   public Car(int year) {
       this.buildYear = year;
   }
   
   public Car(String brand, String model, String color, int buildYear){
       this.brand = brand;
       this.color = color;
       this.model = model;
       this.buildYear = buildYear;
   }
   public int getBuildYear() {
       return this.buildYear;
   }
   
   public void printAttributs () {
       System.out.println("Brand: " + this.brand);
       System.out.println("Model: " + this.model);
       System.out.println("Color: " + this.color);
       System.out.println("Build Year: " + this.getBuildYear());
   }
}
