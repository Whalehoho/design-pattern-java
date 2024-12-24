package bridge;

// Refined Abstraction: BasicRemote
public class BasicRemote extends RemoteControl {
    public BasicRemote(Device device) {
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
}

