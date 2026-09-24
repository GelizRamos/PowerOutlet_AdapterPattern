public class SmartphoneAdapter implements PowerOutlet {
    private SmartphoneCharger phoneCharger;

    public SmartphoneAdapter(SmartphoneCharger phoneCharger) {
        this.phoneCharger = phoneCharger;
    }

    @Override
    public void plugIn() {
        phoneCharger.chargePhone();
    }
}