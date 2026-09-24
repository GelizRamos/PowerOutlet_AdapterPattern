public class Main {
    public static void main(String[] args) {

        Laptop myLaptop = new Laptop();
        Refrigerator myFridge = new Refrigerator();
        SmartphoneCharger myCharger = new SmartphoneCharger();

        PowerOutlet outlet1 = new LaptopAdapter(myLaptop);
        PowerOutlet outlet2 = new RefrigeratorAdapter(myFridge);
        PowerOutlet outlet3 = new SmartphoneAdapter(myCharger);

        outlet1.plugIn();
        outlet2.plugIn();
        outlet3.plugIn();
    }
}