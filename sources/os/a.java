package os;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public interface a {
    boolean canPause();

    boolean canSeekBackward();

    boolean canSeekForward();

    int getAudioSessionId();

    int getBufferPercentage();

    int getCurrentPosition();

    int getDuration();

    boolean isPlaying();

    void pause();

    void seekTo(int pos);

    void start();
}
