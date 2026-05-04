package com.baicizhan.client.framework.audio;

import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.content.res.AssetManager;
import android.media.AudioAttributes;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.media.PlaybackParams;
import android.net.Uri;
import android.text.TextUtils;
import com.baicizhan.client.framework.audio.IAudioPlayer;
import java.io.File;
import java.io.FileDescriptor;
import java.io.FileInputStream;
import java.io.IOException;
import kb.e;
import kb.f;
import qb.c;
import qb.d;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public class a implements IAudioPlayer, f, MediaPlayer.OnPreparedListener, MediaPlayer.OnCompletionListener, MediaPlayer.OnErrorListener {

    /* renamed from: k, reason: collision with root package name */
    public static final String f17559k = "AudioPlayer";

    /* renamed from: l, reason: collision with root package name */
    public static final float f17560l = 0.1f;

    /* renamed from: a, reason: collision with root package name */
    public Context f17561a;

    /* renamed from: e, reason: collision with root package name */
    public e f17565e;

    /* renamed from: g, reason: collision with root package name */
    public IAudioPlayer.b f17567g;

    /* renamed from: h, reason: collision with root package name */
    public IAudioPlayer.a f17568h;

    /* renamed from: i, reason: collision with root package name */
    public f f17569i;

    /* renamed from: j, reason: collision with root package name */
    public AssetManager f17570j;

    /* renamed from: b, reason: collision with root package name */
    public IAudioPlayer.State f17562b = IAudioPlayer.State.Stopped;

    /* renamed from: c, reason: collision with root package name */
    public float f17563c = 1.0f;

    /* renamed from: d, reason: collision with root package name */
    public MediaPlayer f17564d = null;

    /* renamed from: f, reason: collision with root package name */
    public IAudioPlayer.AudioFocus f17566f = IAudioPlayer.AudioFocus.NoFocusNoDuck;

    public a(Context context) {
        this.f17565e = null;
        this.f17561a = context;
        this.f17565e = new e(context.getApplicationContext(), this);
    }

    @Override // com.baicizhan.client.framework.audio.IAudioPlayer
    public boolean a(int resId) {
        try {
            AssetFileDescriptor openRawResourceFd = this.f17561a.getResources().openRawResourceFd(resId);
            boolean d11 = d(openRawResourceFd.getFileDescriptor(), openRawResourceFd.getStartOffset(), openRawResourceFd.getLength());
            openRawResourceFd.close();
            return d11;
        } catch (Exception e11) {
            c.c(f17559k, "", e11);
            return false;
        }
    }

    @Override // com.baicizhan.client.framework.audio.IAudioPlayer
    public void b(float speed) {
        MediaPlayer mediaPlayer = this.f17564d;
        c.i(f17559k, "setSpeed [%s] [%f][%f]", mediaPlayer == null ? "null" : Integer.valueOf(mediaPlayer.hashCode()), Float.valueOf(this.f17563c), Float.valueOf(speed));
        this.f17563c = speed;
        MediaPlayer mediaPlayer2 = this.f17564d;
        if (mediaPlayer2 != null) {
            try {
                PlaybackParams playbackParams = mediaPlayer2.getPlaybackParams();
                playbackParams.setSpeed(speed);
                this.f17564d.setPlaybackParams(playbackParams);
            } catch (IllegalStateException unused) {
            }
        }
    }

    @Override // com.baicizhan.client.framework.audio.IAudioPlayer
    public boolean c(String path) {
        return e(new File(path));
    }

    @Override // com.baicizhan.client.framework.audio.IAudioPlayer
    public boolean d(FileDescriptor fd2, long offset, long length) {
        MediaPlayer mediaPlayer = this.f17564d;
        c.i(f17559k, "play [%s]", mediaPlayer == null ? "null" : Integer.valueOf(mediaPlayer.hashCode()));
        q();
        p(IAudioPlayer.State.Stopped);
        n(false);
        try {
            l();
            o();
            c.i(f17559k, "setDataSource [%d]", Integer.valueOf(this.f17564d.hashCode()));
            this.f17564d.setDataSource(fd2, offset, length);
            p(IAudioPlayer.State.Preparing);
            c.i(f17559k, "prepareAsync [%d]", Integer.valueOf(this.f17564d.hashCode()));
            this.f17564d.prepareAsync();
            return true;
        } catch (IOException e11) {
            if (d.b()) {
                c.c(f17559k, "IOException prepare playing song: ", e11);
            }
            return false;
        } catch (IllegalStateException e12) {
            c.c(f17559k, "IllegalStateException prepare playing song: ", e12);
            return false;
        }
    }

    @Override // com.baicizhan.client.framework.audio.IAudioPlayer
    public void destroy() {
        stop();
        p(IAudioPlayer.State.Stopped);
        n(true);
        m();
        this.f17561a = null;
        this.f17567g = null;
    }

    @Override // com.baicizhan.client.framework.audio.IAudioPlayer
    public boolean e(File file) {
        if (file != null && file.exists() && file.length() != 0) {
            try {
                FileInputStream fileInputStream = new FileInputStream(file);
                boolean d11 = d(fileInputStream.getFD(), 0L, file.length());
                fileInputStream.close();
                return d11;
            } catch (Exception e11) {
                c.c(f17559k, "", e11);
            }
        }
        return false;
    }

    @Override // com.baicizhan.client.framework.audio.IAudioPlayer
    public void f(IAudioPlayer.b l11) {
        this.f17567g = l11;
    }

    @Override // com.baicizhan.client.framework.audio.IAudioPlayer
    public boolean g(String url) {
        q();
        p(IAudioPlayer.State.Stopped);
        n(false);
        try {
            l();
            o();
            c.i(f17559k, "setDataSource [%d]", Integer.valueOf(this.f17564d.hashCode()));
            this.f17564d.setDataSource(this.f17561a, Uri.parse(url));
            p(IAudioPlayer.State.Preparing);
            c.i(f17559k, "prepareAsync [%d]", Integer.valueOf(this.f17564d.hashCode()));
            this.f17564d.prepareAsync();
            return true;
        } catch (IOException e11) {
            if (d.b()) {
                c.c(f17559k, "IOException prepare playing song: ", e11);
            }
            return false;
        } catch (IllegalStateException e12) {
            c.c(f17559k, "IllegalStateException prepare playing song: ", e12);
            return false;
        }
    }

    @Override // com.baicizhan.client.framework.audio.IAudioPlayer
    public int getDuration() {
        MediaPlayer mediaPlayer = this.f17564d;
        if (mediaPlayer == null) {
            return 0;
        }
        int duration = mediaPlayer.getDuration();
        c.i(f17559k, "getPosition [%s] [%d]", Integer.valueOf(this.f17564d.hashCode()), Integer.valueOf(duration));
        return duration;
    }

    @Override // com.baicizhan.client.framework.audio.IAudioPlayer
    public long getPosition() {
        MediaPlayer mediaPlayer = this.f17564d;
        if (mediaPlayer == null) {
            return 0L;
        }
        long currentPosition = mediaPlayer.getCurrentPosition();
        c.i(f17559k, "getPosition [%s] [%d]", Integer.valueOf(this.f17564d.hashCode()), Long.valueOf(currentPosition));
        return currentPosition;
    }

    @Override // com.baicizhan.client.framework.audio.IAudioPlayer
    public void h(f focusable) {
        this.f17569i = focusable;
    }

    @Override // com.baicizhan.client.framework.audio.IAudioPlayer
    public boolean i(String path, boolean repeat) {
        if (TextUtils.isEmpty(path)) {
            return false;
        }
        try {
            l();
            AssetFileDescriptor openFd = this.f17570j.openFd(path);
            try {
                boolean d11 = d(openFd.getFileDescriptor(), openFd.getStartOffset(), openFd.getLength());
                openFd.close();
                c.i(f17559k, "setLooping [%d]", Integer.valueOf(this.f17564d.hashCode()));
                this.f17564d.setLooping(repeat);
                return d11;
            } catch (Exception e11) {
                e = e11;
                c.c(f17559k, "", e);
                return false;
            }
        } catch (Exception e12) {
            e = e12;
        }
    }

    @Override // com.baicizhan.client.framework.audio.IAudioPlayer
    public void j(IAudioPlayer.a l11) {
        this.f17568h = l11;
    }

    public final void k() {
        PlaybackParams playbackParams;
        Float valueOf = Float.valueOf(0.1f);
        if (this.f17564d == null) {
            return;
        }
        c.i(f17559k, "configAndStartMediaPlayer [focus, isPlay][%s, %b]", this.f17566f.toString(), Boolean.valueOf(this.f17564d.isPlaying()));
        IAudioPlayer.AudioFocus audioFocus = IAudioPlayer.AudioFocus.NoFocusNoDuck;
        IAudioPlayer.AudioFocus audioFocus2 = this.f17566f;
        if (audioFocus == audioFocus2) {
            if (this.f17564d.isPlaying()) {
                c.i(f17559k, "pause [%s]", Integer.valueOf(this.f17564d.hashCode()));
                this.f17564d.pause();
                return;
            }
            return;
        }
        if (IAudioPlayer.AudioFocus.NoFocusCanDuck == audioFocus2) {
            MediaPlayer mediaPlayer = this.f17564d;
            c.i(f17559k, "setVolume [%s] [%f][%f]", mediaPlayer != null ? Integer.valueOf(mediaPlayer.hashCode()) : "null", valueOf, valueOf);
            this.f17564d.setVolume(0.1f, 0.1f);
        } else {
            MediaPlayer mediaPlayer2 = this.f17564d;
            c.i(f17559k, "setVolume [%s] [1.0][1.0]", mediaPlayer2 != null ? Integer.valueOf(mediaPlayer2.hashCode()) : "null");
            this.f17564d.setVolume(1.0f, 1.0f);
        }
        if (this.f17564d.isPlaying()) {
            return;
        }
        try {
            playbackParams = this.f17564d.getPlaybackParams();
        } catch (Exception e11) {
            c.c(f17559k, "", e11);
            playbackParams = null;
        }
        if (playbackParams != null) {
            float speed = playbackParams.getSpeed();
            float f11 = this.f17563c;
            if (speed != f11) {
                playbackParams.setSpeed(f11);
                this.f17564d.setPlaybackParams(playbackParams);
                c.i(f17559k, "setPlaybackParams [%s][%f]", Integer.valueOf(this.f17564d.hashCode()), Float.valueOf(this.f17563c));
                return;
            }
        }
        c.i(f17559k, "start [%s]", Integer.valueOf(this.f17564d.hashCode()));
        this.f17564d.start();
    }

    public final void l() {
        int i11;
        int i12;
        if (this.f17561a == null) {
            return;
        }
        MediaPlayer mediaPlayer = this.f17564d;
        if (mediaPlayer != null) {
            c.i(f17559k, "reset [%d]", Integer.valueOf(mediaPlayer.hashCode()));
            this.f17564d.reset();
            return;
        }
        this.f17564d = new MediaPlayer();
        AudioManager audioManager = (AudioManager) this.f17561a.getSystemService("audio");
        if (audioManager != null) {
            i11 = audioManager.getStreamMaxVolume(3);
            i12 = audioManager.getStreamVolume(3);
        } else {
            i11 = -100;
            i12 = -100;
        }
        c.i(f17559k, "created[hash][max][current] [%d][%d][%d]", Integer.valueOf(this.f17564d.hashCode()), Integer.valueOf(i11), Integer.valueOf(i12));
        this.f17564d.setWakeMode(this.f17561a.getApplicationContext(), 1);
        this.f17564d.setOnPreparedListener(this);
        this.f17564d.setOnCompletionListener(this);
        this.f17564d.setOnErrorListener(this);
        this.f17570j = this.f17561a.getAssets();
    }

    public final void m() {
        e eVar;
        if (this.f17566f == IAudioPlayer.AudioFocus.Focused && (eVar = this.f17565e) != null && eVar.a()) {
            this.f17566f = IAudioPlayer.AudioFocus.NoFocusNoDuck;
        }
    }

    public final void n(boolean releaseMediaPlayer) {
        MediaPlayer mediaPlayer;
        if (!releaseMediaPlayer || (mediaPlayer = this.f17564d) == null) {
            return;
        }
        mediaPlayer.reset();
        this.f17564d.release();
        c.i(f17559k, "release %d", Integer.valueOf(this.f17564d.hashCode()));
        this.f17564d = null;
    }

    public final void o() {
        this.f17564d.setAudioAttributes(new AudioAttributes.Builder().setUsage(1).setContentType(2).build());
    }

    @Override // android.media.MediaPlayer.OnCompletionListener
    public void onCompletion(MediaPlayer arg0) {
        p(IAudioPlayer.State.Completed);
    }

    @Override // android.media.MediaPlayer.OnErrorListener
    public boolean onError(MediaPlayer mp2, int what, int extra) {
        if (d.b()) {
            c.d(f17559k, "Error: what=" + String.valueOf(what) + ", extra=" + String.valueOf(extra), new Object[0]);
        }
        IAudioPlayer.a aVar = this.f17568h;
        if (aVar != null) {
            aVar.onPlayError(what, extra);
        }
        p(IAudioPlayer.State.Stopped);
        try {
            n(true);
        } catch (Throwable th2) {
            c.c(f17559k, "", th2);
        }
        m();
        return true;
    }

    @Override // android.media.MediaPlayer.OnPreparedListener
    public void onPrepared(MediaPlayer arg0) {
        p(IAudioPlayer.State.Playing);
        k();
    }

    public final void p(IAudioPlayer.State state) {
        IAudioPlayer.State state2 = this.f17562b;
        c.i(f17559k, "old %s, new %s", state2 == null ? "null" : state2.toString(), state != null ? state.toString() : "null");
        this.f17562b = state;
        IAudioPlayer.b bVar = this.f17567g;
        if (bVar != null) {
            bVar.onPlayStateChanged(state);
        }
    }

    @Override // kb.f
    public void p0(boolean canDuck) {
        c.i(f17559k, "onLostAudioFocus %b", Boolean.valueOf(canDuck));
        this.f17566f = canDuck ? IAudioPlayer.AudioFocus.NoFocusCanDuck : IAudioPlayer.AudioFocus.NoFocusNoDuck;
        try {
            MediaPlayer mediaPlayer = this.f17564d;
            if (mediaPlayer != null && mediaPlayer.isPlaying()) {
                k();
            }
            f fVar = this.f17569i;
            if (fVar != null) {
                fVar.p0(canDuck);
            }
        } catch (Exception e11) {
            c.h(f17559k, "", e11);
        }
    }

    @Override // com.baicizhan.client.framework.audio.IAudioPlayer
    public void pause() {
        if (IAudioPlayer.State.Playing == this.f17562b) {
            p(IAudioPlayer.State.Paused);
            c.i(f17559k, "pause [%d]", Integer.valueOf(this.f17564d.hashCode()));
            this.f17564d.pause();
            n(false);
        }
    }

    @Override // com.baicizhan.client.framework.audio.IAudioPlayer
    public void play() {
        q();
        if (IAudioPlayer.State.Paused == this.f17562b) {
            p(IAudioPlayer.State.Playing);
            k();
        }
    }

    public final void q() {
        e eVar;
        IAudioPlayer.AudioFocus audioFocus = this.f17566f;
        IAudioPlayer.AudioFocus audioFocus2 = IAudioPlayer.AudioFocus.Focused;
        if (audioFocus == audioFocus2 || (eVar = this.f17565e) == null || !eVar.b()) {
            return;
        }
        this.f17566f = audioFocus2;
    }

    @Override // com.baicizhan.client.framework.audio.IAudioPlayer
    public void seekTo(int msc) {
        MediaPlayer mediaPlayer = this.f17564d;
        c.i(f17559k, "seekTo [%s] [%d]", mediaPlayer == null ? "null" : Integer.valueOf(mediaPlayer.hashCode()), Integer.valueOf(msc));
        MediaPlayer mediaPlayer2 = this.f17564d;
        if (mediaPlayer2 != null) {
            mediaPlayer2.seekTo(msc);
        }
    }

    @Override // com.baicizhan.client.framework.audio.IAudioPlayer
    public void setVolume(float volumeLeft, float volumeRight) {
        MediaPlayer mediaPlayer = this.f17564d;
        c.i(f17559k, "setVolume [%s] [%f][%f]", mediaPlayer == null ? "null" : Integer.valueOf(mediaPlayer.hashCode()), Float.valueOf(volumeLeft), Float.valueOf(volumeRight));
        MediaPlayer mediaPlayer2 = this.f17564d;
        if (mediaPlayer2 != null) {
            mediaPlayer2.setVolume(volumeLeft, volumeRight);
        }
    }

    @Override // com.baicizhan.client.framework.audio.IAudioPlayer
    public void stop() {
        IAudioPlayer.State state = IAudioPlayer.State.Playing;
        IAudioPlayer.State state2 = this.f17562b;
        if (state == state2 || IAudioPlayer.State.Paused == state2) {
            p(IAudioPlayer.State.Stopped);
            n(true);
            m();
        }
    }

    @Override // kb.f
    public void t() {
        c.i(f17559k, "onGainedAudioFocus", new Object[0]);
        this.f17566f = IAudioPlayer.AudioFocus.Focused;
        if (IAudioPlayer.State.Playing == this.f17562b) {
            k();
        }
        f fVar = this.f17569i;
        if (fVar != null) {
            fVar.t();
        }
    }
}
