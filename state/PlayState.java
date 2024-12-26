package state;

//Concrete state class
public class PlayState implements State {
    @Override
    public void pressPlay(AudioPlayer player) {
        System.out.println("Music is already playing.");
    }

    @Override
    public void pressPause(AudioPlayer player) {
        System.out.println("Pausing music...");
        player.setState(new PauseState());  // Transition to PauseState
    }

    @Override
    public void pressStop(AudioPlayer player) {
        System.out.println("Stopping music...");
        player.setState(new StopState());  // Transition to StopState
    }
}

