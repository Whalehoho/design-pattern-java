package command;

public class Client {
    public static void main(String[] args) {
        // Receivers
        Light livingRoomLight = new Light();
        Fan bedroomFan = new Fan();

        // Concrete Commands
        Command lightOn = new LightOnCommand(livingRoomLight);
        Command lightOff = new LightOffCommand(livingRoomLight);
        Command fanStart = new FanStartCommand(bedroomFan);
        Command fanStop = new FanStopCommand(bedroomFan);

        // Invoker
        RemoteControl remote = new RemoteControl();

        // Test Light ON
        remote.setCommand(lightOn);
        remote.pressButton(); // Output: The light is ON
        remote.pressUndo();   // Output: The light is OFF

        // Test Light OFF
        remote.setCommand(lightOff);
        remote.pressButton(); // Output: The light is OFF
        remote.pressUndo();   // Output: The light is ON

        // Test Fan Start
        remote.setCommand(fanStart);
        remote.pressButton(); // Output: The fan is spinning
        remote.pressUndo();   // Output: The fan is stopped

        // Test Fan Stop
        remote.setCommand(fanStop);
        remote.pressButton(); // Output: The fan is stopped
        remote.pressUndo();   // Output: The fan is spinning
    }
}
