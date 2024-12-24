package bridge;

// Concrete Implementor: TV
public class TV implements Device {
    @Override
    public void powerOn() {
        System.out.println("TV is powered ON");
    }

    @Override
    public void powerOff() {
        System.out.println("TV is powered OFF");
    }

    @Override
    public void volumeUp() {
        System.out.println("TV volume is turned UP");
    }

    @Override
    public void volumeDown() {
        System.out.println("TV volume is turned DOWN");
    }
}
