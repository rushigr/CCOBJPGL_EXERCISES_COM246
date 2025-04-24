public class App {
    public static void main(String[] args) throws Exception {
        HybridSedan car1 = new HybridSedan();
        car1.carname = "Sedan";

        Hybrid hcar1 = new Hybrid();
        System.out.println("Sedan Status:");
        hcar1.chargebattery();
        hcar1.fillgas();
        
        HybridPickup car2 = new HybridPickup();
        car2.carname = "Pickup";

        Hybrid hcar2 = new Hybrid();
        System.out.println("\nPickup Status:");
        hcar2.chargebattery();
        hcar2.fillgas();
     
        Carwash wcar1 = new Carwash();
        System.out.println("\nCars Washed:");
        wcar1.Carwash(car1);
        wcar1.Carwash(car2);
        
    }
}
