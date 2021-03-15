
package main.car;


public class Main {

    
    public static void main(String[] args) {
        int a = 5;
        int b = 6;
        Car audi = new Car();
        audi.printAttributs();
        audi.brand = "Audi";
        audi.model = "A4";
        audi.color = "black";
        //audi.buildYear = 2005;
    
        audi.printAttributs();
        audi.travel(150);
        //audi.fuelUp(30);
        //aud.travel(300);
        
        //System.out.println("Brand: " + audi.brand);
        //System.out.println("Model: " + audi.model);
        //System.out.println("Model: " + audi.getBuildYear());
        
        
        Car bmw = new Car();
        bmw.brand = "BMW";
        bmw.model = "X5";
        
        bmw.printAttributs();
        
        //System.out.println("Brand: " + bmw.brand);
        //System.out.println("Model: " + bmw.model);
        
        Car fiat = new Car(2010);
        System.out.println("Godinja proizvodnje: " + fiat.getBuildYear()); 
        
        
        Car lada = new Car("Lada", "Niva", "green", 2018, 0, 20, 5);
        lada.printAttributs();
        lada.travel(100);
        lada.printAttributs();
        
        lada.travel(200);
        lada.printAttributs();
        
        lada.travel(100);
        lada.printAttributs();
        
        lada.travel(50);
        lada.printAttributs();
        
        
    }
        
        
    
}
