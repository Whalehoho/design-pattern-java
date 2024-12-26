package state;

// The context class
public class AudioPlayer {
    private State currentState;  // The current state of the player

    public AudioPlayer() {
        // Initially, the audio player is in the StopState
        this.currentState = new StopState();
    }

    // Set a new state (transition)
    public void setState(State newState) {
        this.currentState = newState;
    }

    // Delegate the action to the current state's method
    public void pressPlay() {
        currentState.pressPlay(this);
    }

    public void pressPause() {
        currentState.pressPause(this);
    }

    public void pressStop() {
        currentState.pressStop(this);
    }
}

