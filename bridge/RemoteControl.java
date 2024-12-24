package bridge;

// Abstraction
public abstract class RemoteControl {
    protected Device device;  // This is the bridge
    
    public RemoteControl(Device device) {
        this.device = device;
    }

    abstract void powerButton();
    abstract void volumeUpButton();
    abstract void volumeDownButton();
}
