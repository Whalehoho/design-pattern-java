package bridge;

// Refined Abstraction: AdvancedRemote
public class AdvancedRemote extends RemoteControl {
    public AdvancedRemote(Device device) {
        super(device);
    }

    @Override
    void powerButton() {
        device.powerOn();
    }

    @Override
    void volumeUpButton() {
        device.volumeUp();
    }

    @Override
    void volumeDownButton() {
        device.volumeDown();
    }

    // Additional functionality unique to AdvancedRemote
    void mute() {
        System.out.println("Muting the device");
    }
}
