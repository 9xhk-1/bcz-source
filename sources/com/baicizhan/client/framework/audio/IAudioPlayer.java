package com.baicizhan.client.framework.audio;

import android.media.MediaPlayer;
import java.io.File;
import java.io.FileDescriptor;
import kb.e;
import kb.f;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public interface IAudioPlayer {

    /* renamed from: j0, reason: collision with root package name */
    public static final float f17555j0 = 0.1f;

    /* renamed from: k0, reason: collision with root package name */
    public static final MediaPlayer f17556k0 = null;

    /* renamed from: l0, reason: collision with root package name */
    public static final e f17557l0 = null;

    /* renamed from: m0, reason: collision with root package name */
    public static final AudioFocus f17558m0 = AudioFocus.NoFocusNoDuck;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public enum AudioFocus {
        NoFocusNoDuck,
        NoFocusCanDuck,
        Focused
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public enum State {
        Completed,
        Stopped,
        Preparing,
        Playing,
        Paused
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public interface a {
        void onPlayError(int what, int extra);
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public interface b {
        void onPlayStateChanged(State state);
    }

    boolean a(int resId);

    void b(float speed);

    boolean c(String path);

    boolean d(FileDescriptor fd2, long offset, long length);

    void destroy();

    boolean e(File file);

    void f(b l11);

    boolean g(String url);

    int getDuration();

    long getPosition();

    void h(f focusable);

    boolean i(String path, boolean repeat);

    void j(a l11);

    void pause();

    void play();

    void seekTo(int msc);

    void setVolume(float volumeLeft, float volumeRight);

    void stop();
}
