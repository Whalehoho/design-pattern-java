package state;

public interface State {
    void pressPlay(AudioPlayer player);   // Press play button
    void pressPause(AudioPlayer player);  // Press pause button
    void pressStop(AudioPlayer player);   // Press stop button
}

