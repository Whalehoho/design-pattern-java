package state;

//Concrete state class
public class PauseState implements State {
    @Override
    public void pressPlay(AudioPlayer player) {
        System.out.println("Resuming music...");
        player.setState(new PlayState());  // Transition back to PlayState
    }

    @Override
    public void pressPause(AudioPlayer player) {
        System.out.println("Music is already paused.");
    }

    @Override
    public void pressStop(AudioPlayer player) {
        System.out.println("Stopping music...");
        player.setState(new StopState());  // Transition to StopState
    }
}

