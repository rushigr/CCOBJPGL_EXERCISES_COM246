public class Hybrid implements Electric, InternalCombustion {
    
    @Override
    public void chargebattery() {
        System.out.println("Charging Battery");
    }

    @Override
    public void fillgas() {
        System.out.println("Refueling Gas");
    }
}
