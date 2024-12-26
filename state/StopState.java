package state;

//Concrete state class
public class StopState implements State {
    @Override
    public void pressPlay(AudioPlayer player) {
        System.out.println("Starting music...");
        player.setState(new PlayState());  // Transition to PlayState
    }

    @Override
    public void pressPause(AudioPlayer player) {
        System.out.println("Music is stopped. Can't pause.");
    }

    @Override
    public void pressStop(AudioPlayer player) {
        System.out.println("Music is already stopped.");
    }
}

