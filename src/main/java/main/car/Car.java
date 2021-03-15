
package main.car;


public class Car {
   public String brand;
   public String model;
   public String color;
   private int buildYear;
   private int milage = 0;
   private int fuel;
   private int consumption = 5;
   
   
   public Car() {
       this.brand = "";
       this.color = "";
       this.model = "";
       this.buildYear = 0;
   }
   public Car(int year) {
       this.buildYear = year;
   }
   
   public Car(String brand, String model, String color, int buildYear, int milage, int fuel, int consumption){
       this.brand = brand;
       this.color = color;
       this.model = model;
       this.buildYear = buildYear;
       this.milage = milage;
       this.fuel= fuel;
       this.consumption = consumption;
   }
   public int getBuildYear() {
       return this.buildYear;
   }
   
   private int getMilage(){
       return this.milage;
   }
   
   private void setMilage(int newMilage){
       this.milage = newMilage;
   }
   
   private int getConsumption () {
       return this.consumption;
   }
   private int getFuel(){
       return this.fuel;
   }
        
private void setFuel(int Fuel) {
    this.fuel = Fuel;
    }  
  
   public void printAttributs () {
       System.out.println("Brand: " + this.brand);
       System.out.println("Model: " + this.model);
       System.out.println("Color: " + this.color);
       System.out.println("Build Year: " + this.getBuildYear());
       System.out.println("Milage: " + this.getMilage());
       System.out.println("Fuel: " + this.getFuel());
       System.out.println("");
       
   }
   
   public void  travel(int distance){
       int fuelForTrip = this.getConsumption() * distance/100;
       if (this.getFuel() >= fuelForTrip) {
           this.setMilage(this.getMilage() + distance);
           this.setFuel(this.getFuel() - fuelForTrip);
           System.out.println("Uspesno je predjen put od " + distance + "km");
       } else {
           System.out.println("Nema dovoljno goriva za put");
       }
       //int newMilage = this.getMilage() + distance;
       //this.setMilage(newMilage);
       
       //this.setMilage(this.getMilage() + distance);
       
       //int usedFuel = this.getConsumption() * distance/100;
       //this.setFuel(this.getFuel() - usedFuel);
       
      // this.setFuel(this.getFuel() - this.getConsumption() * distance/100);
       
       
      
   }
   
   // public fuelUp(int amountOfFeul
   //maxFuel (capacity) dopuniti samo koliko ima mesta 
   //imamo 20l kapacitet 50l mozemo dopuniti samo 20
   
   //
}


