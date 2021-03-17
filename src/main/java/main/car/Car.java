
package main.car;


public class Car {
   public String brand;
   public String model;
   public String color;
   private int buildYear;
   private int milage = 0;
   private int fuel = 0;
   private int consumption = 5;
   private int maxFuelCapacity = 50;
   private int maxSeat = 5;
   private int numberOfpassangers = 1;
   
   
   
   public Car() {
       this.brand = "";
       this.color = "";
       this.model = "";
       this.buildYear = 0;
   }
   public Car(int year) {
       this.buildYear = year;
   }
   
   public Car(String brand, String model, String color, int buildYear, int milage, int fuel, int consumption, int maxFuelCapacity, int maxSeat, int numberOfpassangers){
       this.brand = brand;
       this.color = color;
       this.model = model;
       this.buildYear = buildYear;
       this.milage = milage;
       this.fuel= fuel;
       this.consumption = consumption;
       this.maxFuelCapacity = maxFuelCapacity;
       this.maxSeat = maxSeat;
       this.numberOfpassangers = numberOfpassangers;
   }
   public int getBuildYear() {
       return this.buildYear;
   }
   
   private int getMilage() {
       return this.milage;
   }
   
   private void setMilage(int newMilage) {
       this.milage = newMilage;
   }
   
   private int getConsumption () {
       return this.consumption;
   }
   
   private int getFuel() {
       return this.fuel;
   }
    
   private int getMaxFuelCapacity() {
       return this.maxFuelCapacity;
   }
   
   private void setMaxFuelCapacity( int setMaxFuel) {
       this.maxFuelCapacity = setMaxFuel; 
   }
   
   private int getMaxSeat() {
       return this.maxSeat;
   }
   
   private void setMaxSeat (int maxSeat) {
      this.maxSeat = maxSeat; 
   }
   
   private int getNumberOfPassengers () {
       return this.numberOfpassangers;
   }
   
   private void setNumberOfPassengers (int NewNumberOfPassengers) {
       this.numberOfpassangers = NewNumberOfPassengers;
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
        if (this.getFuel() >= fuelForTrip && this.getNumberOfPassengers() > 0 ) {
           this.setMilage(this.getMilage() + distance);
           this.setFuel(this.getFuel() - fuelForTrip);
           System.out.println("Uspesno je predjen put od " + distance + "km");
       } else {
           System.out.println("Nema dovoljno goriva za put ili nema vozaca.");
       }
   }
       //int newMilage = this.getMilage() + distance;
       //this.setMilage(newMilage);
       
       //this.setMilage(this.getMilage() + distance);
       
       //int usedFuel = this.getConsumption() * distance/100;
       //this.setFuel(this.getFuel() - usedFuel);
       
      // this.setFuel(this.getFuel() - this.getConsumption() * distance/100);
       
    public void fuelUp(int amountOfFuel){
        if ((this.getFuel() + amountOfFuel) > this.getMaxFuelCapacity()) {
             System.out.println("Vas rezervoar je pun. Sipali ste: " + (this.getMaxFuelCapacity() - this.getFuel()) + " litara goriva.");
             System.out.println("U vas rezervoar nije moglo da stane: "  + (this.getFuel() + amountOfFuel - this.getMaxFuelCapacity()) + " litara goriva.");
             this.setFuel(this.getMaxFuelCapacity());
         }
             
             //sipamo do punog rezervoara
             //ispisujemo poruku Sipali ste X litara. Ostalih Y litara nije moguce jer je rezervorar pun
             //recimo imali ste 40, max 60, sipali ste 20 a 10 nije moglo
         //System.out.println("Nemate dovoljan kapacitet rezorvoara");
         else {
            this.setFuel(this.getFuel() + amountOfFuel);
             System.out.println("U vasem rezervoaru trenutno ima: " + this.getFuel() + "litara goriva.");
             }
    }
     public void enteringpassenger (int numberOfEnteringPassengers) {
         if (this.getNumberOfPassengers() + numberOfEnteringPassengers > this.getMaxSeat()) {
             System.out.println("U vozilo ne moze da udje toliko putnik(a).");
             System.out.println("U vozilu se vec nalazi: " + this.getNumberOfPassengers() + " putnik(a).");
             System.out.println("U vozilo moze da udje jos: " + (this.getMaxSeat() - this.getNumberOfPassengers()) + " putnik(a).");
         } else {
             this.setNumberOfPassengers (this.getNumberOfPassengers() + numberOfEnteringPassengers);
             System.out.println("U vozilu se sada nalazi: " + this.getNumberOfPassengers() + " putnik(a).");
         }
       
     }
     
     public void exitingpassenger (int numberOfExitingPassengers) {
         if (this.getNumberOfPassengers() - numberOfExitingPassengers < 0) {
             System.out.println("Nije moguce da iz vozila izadje vise putnika nego sto je unutra.");
         } else {
             this.setNumberOfPassengers (this.getNumberOfPassengers() - numberOfExitingPassengers);
             System.out.println("U vozilu se sada nalazi " + this.getNumberOfPassengers() + " putnik(a).");
         }
        
     }
     
      
   
   
   // public fuelUp(int amountOfFeul)
   //maxFuel (capacity) dopuniti samo koliko ima mesta 
   //imamo 20l kapacitet 50l mozemo dopuniti samo 20
   
   //broj putnika u automobilu, bar jedan vozac
     
     //broj putnika po default fabricki max 5 max mesta u automobilu
     //atribut za broj mesta
     //atribut koji prati broj putnika u svakom trenutku
     //metoda koja ce da prosledi broj putnika, proverava da li moze da udje u svakom trenutku x broj putnika
     //ako ima 3 putnika, hoce da udje 3 a max je 5 ne moze da udje
     //izlazak putnika iz automobila, imam 3 a hoce da izadje 4 ne moze vise nego sto postoji
     //broj putnika i max broj sedista to je samo dovoljno
     
     
     //zadatak 3 metoda travel refaktorisati da ne moze da se ide na put ako nema bar jedan putnik
     //ako je broj putnika 0 auto ne moze da se krene na put
     //nad tim autom naziv metode za ulazak putnika prosledimo broj putnika i onda proveravamo
     //
    }

//


