package state;

public class Main {
    public static void main(String[] args) {
        AudioPlayer player = new AudioPlayer();

        // Test transitions through different states
        player.pressPlay();    // Starting music (transitions to PlayState)
        player.pressPause();   // Pausing music (transitions to PauseState)
        player.pressStop();    // Stopping music (transitions to StopState)
        player.pressPause();   // Pausing music but it's already stopped
        player.pressPlay();    // Starting music again (transitions to PlayState)
    }
}
