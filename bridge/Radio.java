package bridge;

// Concrete Implementor: Radio
public class Radio implements Device {
    @Override
    public void powerOn() {
        System.out.println("Radio is powered ON");
    }

    @Override
    public void powerOff() {
        System.out.println("Radio is powered OFF");
    }

    @Override
    public void volumeUp() {
        System.out.println("Radio volume is turned UP");
    }

    @Override
    public void volumeDown() {
        System.out.println("Radio volume is turned DOWN");
    }
}
