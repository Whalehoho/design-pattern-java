package bridge;

// Client Code
public class Main {
    public static void main(String[] args) {
        Device tv = new TV();  // TV as the device
        Device radio = new Radio();  // Radio as the device

        RemoteControl basicRemote = new BasicRemote(tv);  // TV controlled by BasicRemote
        basicRemote.powerButton();  // TV is powered ON
        basicRemote.volumeUpButton();  // TV volume is turned UP

        System.out.println();

        RemoteControl advancedRemote = new AdvancedRemote(radio);  // Radio controlled by AdvancedRemote
        advancedRemote.powerButton();  // Radio is powered ON
        advancedRemote.volumeDownButton();  // Radio volume is turned DOWN
        ((AdvancedRemote) advancedRemote).mute();  // Muting the device
    }
}