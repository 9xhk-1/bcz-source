package com.baicizhan.client.business.widget;

import android.R;
import android.app.Activity;
import android.content.Context;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.RelativeLayout;
import androidx.media3.extractor.text.ttml.TtmlNode;
import java.io.IOException;
import org.junit.jupiter.api.j2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public class FullscreenVideoView extends RelativeLayout implements SurfaceHolder.Callback, MediaPlayer.OnPreparedListener, MediaPlayer.OnErrorListener, MediaPlayer.OnSeekCompleteListener, MediaPlayer.OnCompletionListener {

    /* renamed from: y, reason: collision with root package name */
    public static final String f17104y = "FullscreenVideoView";

    /* renamed from: a, reason: collision with root package name */
    public Uri f17105a;

    /* renamed from: b, reason: collision with root package name */
    public Context f17106b;

    /* renamed from: c, reason: collision with root package name */
    public Activity f17107c;

    /* renamed from: d, reason: collision with root package name */
    public MediaPlayer f17108d;

    /* renamed from: e, reason: collision with root package name */
    public SurfaceHolder f17109e;

    /* renamed from: f, reason: collision with root package name */
    public SurfaceView f17110f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f17111g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f17112h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f17113i;

    /* renamed from: j, reason: collision with root package name */
    public State f17114j;

    /* renamed from: k, reason: collision with root package name */
    public State f17115k;

    /* renamed from: l, reason: collision with root package name */
    public View f17116l;

    /* renamed from: m, reason: collision with root package name */
    public ViewGroup f17117m;

    /* renamed from: n, reason: collision with root package name */
    public ViewGroup.LayoutParams f17118n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f17119o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f17120p;

    /* renamed from: q, reason: collision with root package name */
    public int f17121q;

    /* renamed from: r, reason: collision with root package name */
    public int f17122r;

    /* renamed from: s, reason: collision with root package name */
    public int f17123s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f17124t;

    /* renamed from: u, reason: collision with root package name */
    public MediaPlayer.OnErrorListener f17125u;

    /* renamed from: v, reason: collision with root package name */
    public MediaPlayer.OnPreparedListener f17126v;

    /* renamed from: w, reason: collision with root package name */
    public MediaPlayer.OnSeekCompleteListener f17127w;

    /* renamed from: x, reason: collision with root package name */
    public MediaPlayer.OnCompletionListener f17128x;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public enum State {
        IDLE,
        INITIALIZED,
        PREPARED,
        PREPARING,
        STARTED,
        STOPPED,
        PAUSED,
        PLAYBACKCOMPLETED,
        ERROR,
        END
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            FullscreenVideoView.this.k();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                FullscreenVideoView fullscreenVideoView = FullscreenVideoView.this;
                fullscreenVideoView.setVideoURI(fullscreenVideoView.f17105a);
            } catch (Exception e11) {
                Log.e(FullscreenVideoView.f17104y, e11.toString());
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static /* synthetic */ class c {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f17131a;

        static {
            int[] iArr = new int[State.values().length];
            f17131a = iArr;
            try {
                iArr[State.STARTED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f17131a[State.PAUSED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f17131a[State.PLAYBACKCOMPLETED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f17131a[State.PREPARED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public FullscreenVideoView(Context context) {
        super(context);
        this.f17124t = false;
        this.f17106b = context;
        c();
    }

    public void b() throws IllegalStateException {
        MediaPlayer mediaPlayer = this.f17108d;
        if (mediaPlayer == null) {
            throw new RuntimeException("Media Player is not initialized");
        }
        boolean isPlaying = mediaPlayer.isPlaying();
        if (isPlaying) {
            h();
        }
        boolean z11 = false;
        if (this.f17119o) {
            this.f17119o = false;
            Activity activity = this.f17107c;
            if (activity != null) {
                activity.setRequestedOrientation(this.f17121q);
            }
            ViewParent parent = getParent();
            if (parent instanceof ViewGroup) {
                ViewGroup viewGroup = this.f17117m;
                if (viewGroup != null && viewGroup.getParent() != null) {
                    this.f17113i = true;
                    z11 = true;
                }
                ((ViewGroup) parent).removeView(this);
                if (z11) {
                    this.f17117m.addView(this);
                    setLayoutParams(this.f17118n);
                }
            }
        } else {
            this.f17119o = true;
            Activity activity2 = this.f17107c;
            if (activity2 != null) {
                activity2.setRequestedOrientation(0);
            }
            View findViewById = getRootView().findViewById(R.id.content);
            ViewParent parent2 = getParent();
            if (parent2 instanceof ViewGroup) {
                if (this.f17117m == null) {
                    this.f17117m = (ViewGroup) parent2;
                }
                this.f17113i = true;
                this.f17118n = getLayoutParams();
                this.f17117m.removeView(this);
            } else {
                Log.e(f17104y, "Parent View is not a ViewGroup");
            }
            if (findViewById instanceof ViewGroup) {
                ((ViewGroup) findViewById).addView(this);
            } else {
                Log.e(f17104y, "RootView is not a ViewGroup");
            }
        }
        k();
        if (!isPlaying || this.f17108d == null) {
            return;
        }
        n();
    }

    public void c() {
        if (isInEditMode()) {
            return;
        }
        this.f17120p = false;
        this.f17114j = State.IDLE;
        this.f17119o = false;
        this.f17121q = -1;
        setBackgroundColor(-16777216);
        this.f17108d = new MediaPlayer();
        this.f17110f = new SurfaceView(this.f17106b);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
        layoutParams.addRule(13);
        this.f17110f.setLayoutParams(layoutParams);
        addView(this.f17110f);
        SurfaceHolder holder = this.f17110f.getHolder();
        this.f17109e = holder;
        holder.setType(3);
        this.f17109e.addCallback(this);
        this.f17116l = LayoutInflater.from(this.f17106b).inflate(com.jiongji.andriod.card.R.layout.video_progress_bar, (ViewGroup) this, false);
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams2.addRule(13);
        this.f17116l.setLayoutParams(layoutParams2);
        addView(this.f17116l);
        q();
    }

    public boolean d() {
        State state;
        return (this.f17108d == null || (state = this.f17114j) == State.ERROR || state == State.IDLE || state == State.PREPARING) ? false : true;
    }

    public boolean e() {
        MediaPlayer mediaPlayer = this.f17108d;
        if (mediaPlayer != null) {
            return mediaPlayer.isLooping();
        }
        return false;
    }

    public boolean f() throws IllegalStateException {
        return this.f17108d != null && d() && this.f17108d.isPlaying();
    }

    public boolean g() {
        return this.f17120p;
    }

    public int getCurrentPosition() {
        MediaPlayer mediaPlayer = this.f17108d;
        if (mediaPlayer != null) {
            return mediaPlayer.getCurrentPosition();
        }
        return 0;
    }

    public synchronized State getCurrentState() {
        return this.f17114j;
    }

    public int getDuration() {
        MediaPlayer mediaPlayer = this.f17108d;
        if (mediaPlayer != null) {
            return mediaPlayer.getDuration();
        }
        return 0;
    }

    public int getVideoHeight() {
        MediaPlayer mediaPlayer = this.f17108d;
        if (mediaPlayer != null) {
            return mediaPlayer.getVideoHeight();
        }
        return 0;
    }

    public int getVideoWidth() {
        MediaPlayer mediaPlayer = this.f17108d;
        if (mediaPlayer != null) {
            return mediaPlayer.getVideoWidth();
        }
        return 0;
    }

    public void h() throws IllegalStateException {
        Log.d(f17104y, ma.b.L);
        MediaPlayer mediaPlayer = this.f17108d;
        if (mediaPlayer != null) {
            this.f17114j = State.PAUSED;
            mediaPlayer.pause();
        }
    }

    public void i() throws IllegalStateException {
        Log.d(f17104y, "prepare " + this.f17114j);
        o();
        this.f17111g = false;
        this.f17123s = -1;
        this.f17122r = -1;
        this.f17108d.setOnPreparedListener(this);
        this.f17108d.setOnErrorListener(this);
        this.f17108d.setOnSeekCompleteListener(this);
        this.f17108d.setAudioStreamType(3);
        this.f17114j = State.PREPARING;
        this.f17108d.prepareAsync();
    }

    public void j() {
        Log.d(f17104y, "reset");
        if (this.f17108d != null) {
            this.f17114j = State.IDLE;
            if (d()) {
                this.f17108d.stop();
            }
            this.f17108d.reset();
            this.f17108d.release();
            this.f17108d = null;
        }
    }

    public void k() {
        View view;
        int i11;
        int i12;
        if (this.f17123s == -1 || this.f17122r == -1 || (view = (View) getParent()) == null) {
            return;
        }
        float f11 = this.f17122r / this.f17123s;
        int width = view.getWidth();
        int height = view.getHeight();
        float f12 = width;
        float f13 = height;
        if (f11 > f12 / f13) {
            i12 = (int) (f12 / f11);
            i11 = width;
        } else {
            i11 = (int) (f11 * f13);
            i12 = height;
        }
        ViewGroup.LayoutParams layoutParams = this.f17110f.getLayoutParams();
        if (layoutParams.width != i11 || layoutParams.height != i12) {
            layoutParams.width = i11;
            layoutParams.height = i12;
            this.f17110f.setLayoutParams(layoutParams);
        }
        Log.d(f17104y, "Resizing: initialMovieWidth: " + this.f17122r + " - initialMovieHeight: " + this.f17123s);
        Log.d(f17104y, "Resizing: screenWidth: " + width + " - screenHeight: " + height);
    }

    public void l(int msec) throws IllegalStateException {
        Log.d(f17104y, "seekTo = " + msec);
        MediaPlayer mediaPlayer = this.f17108d;
        if (mediaPlayer == null || mediaPlayer.getDuration() <= -1 || msec > this.f17108d.getDuration()) {
            return;
        }
        this.f17115k = this.f17114j;
        h();
        this.f17108d.seekTo(msec);
        o();
    }

    public void m(float leftVolume, float rightVolume) {
        MediaPlayer mediaPlayer = this.f17108d;
        if (mediaPlayer != null) {
            mediaPlayer.setVolume(leftVolume, rightVolume);
        }
    }

    public void n() throws IllegalStateException {
        Log.d(f17104y, TtmlNode.START);
        MediaPlayer mediaPlayer = this.f17108d;
        if (mediaPlayer != null) {
            this.f17114j = State.STARTED;
            mediaPlayer.setOnCompletionListener(this);
            this.f17108d.start();
        }
    }

    public void o() {
        this.f17116l.setVisibility(0);
    }

    public void onCompletion(MediaPlayer mp2) {
        Log.d(f17104y, "onCompletion");
        if (this.f17108d.isLooping()) {
            n();
        } else {
            this.f17114j = State.PLAYBACKCOMPLETED;
        }
        MediaPlayer.OnCompletionListener onCompletionListener = this.f17128x;
        if (onCompletionListener != null) {
            onCompletionListener.onCompletion(mp2);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        Log.d(f17104y, "onDetachedFromWindow - detachedByFullscreen: " + this.f17113i);
        super.onDetachedFromWindow();
        if (!this.f17113i) {
            MediaPlayer mediaPlayer = this.f17108d;
            if (mediaPlayer != null) {
                mediaPlayer.setOnPreparedListener(null);
                this.f17108d.setOnErrorListener(null);
                this.f17108d.setOnSeekCompleteListener(null);
                this.f17108d.setOnCompletionListener(null);
                if (this.f17108d.isPlaying()) {
                    this.f17108d.stop();
                }
                this.f17108d.release();
                this.f17108d = null;
            }
            this.f17111g = false;
            this.f17112h = false;
            this.f17114j = State.END;
        }
        this.f17113i = false;
    }

    public boolean onError(MediaPlayer mp2, int what, int extra) {
        Log.d(f17104y, "onError called - " + what + " - " + extra);
        q();
        this.f17114j = State.ERROR;
        MediaPlayer.OnErrorListener onErrorListener = this.f17125u;
        if (onErrorListener != null) {
            return onErrorListener.onError(mp2, what, extra);
        }
        return false;
    }

    @Override // android.media.MediaPlayer.OnPreparedListener
    public synchronized void onPrepared(MediaPlayer mp2) {
        try {
            Log.d(f17104y, "onPrepared called " + mp2.getVideoWidth() + j2.O + mp2.getVideoHeight());
            if (mp2.getVideoWidth() == 0 || getVideoHeight() == 0) {
                postDelayed(new b(), 1000L);
            } else {
                this.f17111g = true;
                r();
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable state) {
        Log.d(f17104y, "onRestoreInstanceState");
        super.onRestoreInstanceState(state);
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        Log.d(f17104y, "onSaveInstanceState");
        return super.onSaveInstanceState();
    }

    @Override // android.media.MediaPlayer.OnSeekCompleteListener
    public void onSeekComplete(MediaPlayer mp2) {
        Log.d(f17104y, "onSeekComplete");
        q();
        State state = this.f17115k;
        if (state != null) {
            int i11 = c.f17131a[state.ordinal()];
            if (i11 == 1) {
                n();
            } else if (i11 == 2) {
                h();
            } else if (i11 == 3) {
                this.f17114j = State.PLAYBACKCOMPLETED;
            } else if (i11 == 4) {
                this.f17114j = State.PREPARED;
            }
        }
        MediaPlayer.OnSeekCompleteListener onSeekCompleteListener = this.f17127w;
        if (onSeekCompleteListener != null) {
            onSeekCompleteListener.onSeekComplete(mp2);
        }
    }

    public void p() throws IllegalStateException {
        Log.d(f17104y, "stop");
        MediaPlayer mediaPlayer = this.f17108d;
        if (mediaPlayer != null) {
            this.f17114j = State.STOPPED;
            mediaPlayer.stop();
        }
    }

    public void q() {
        this.f17116l.setVisibility(8);
    }

    public void r() {
        Log.d(f17104y, "tryToPrepare" + this.f17114j + this.f17112h + j2.O + this.f17111g);
        if (this.f17112h && this.f17111g) {
            MediaPlayer mediaPlayer = this.f17108d;
            if (mediaPlayer != null) {
                this.f17122r = mediaPlayer.getVideoWidth();
                this.f17123s = this.f17108d.getVideoHeight();
            }
            k();
            q();
            this.f17114j = State.PREPARED;
            if (this.f17120p && !this.f17124t) {
                n();
            }
            MediaPlayer.OnPreparedListener onPreparedListener = this.f17126v;
            if (onPreparedListener != null) {
                onPreparedListener.onPrepared(this.f17108d);
            }
        }
    }

    public void setActivity(Activity activity) {
        this.f17107c = activity;
        this.f17121q = activity.getRequestedOrientation();
    }

    public void setLooping(boolean looping) {
        MediaPlayer mediaPlayer = this.f17108d;
        if (mediaPlayer != null) {
            mediaPlayer.setLooping(looping);
        }
    }

    public void setOnBufferingUpdateListener(MediaPlayer.OnBufferingUpdateListener l11) {
        MediaPlayer mediaPlayer = this.f17108d;
        if (mediaPlayer != null) {
            mediaPlayer.setOnBufferingUpdateListener(l11);
        }
    }

    public void setOnCompletionListener(MediaPlayer.OnCompletionListener l11) {
        if (this.f17108d != null) {
            this.f17128x = l11;
        }
    }

    public void setOnErrorListener(MediaPlayer.OnErrorListener l11) {
        if (this.f17108d != null) {
            this.f17125u = l11;
        }
    }

    public void setOnInfoListener(MediaPlayer.OnInfoListener l11) {
        MediaPlayer mediaPlayer = this.f17108d;
        if (mediaPlayer != null) {
            mediaPlayer.setOnInfoListener(l11);
        }
    }

    public void setOnPreparedListener(MediaPlayer.OnPreparedListener l11) {
        if (this.f17108d != null) {
            this.f17126v = l11;
        }
    }

    public void setOnSeekCompleteListener(MediaPlayer.OnSeekCompleteListener l11) {
        if (this.f17108d != null) {
            this.f17127w = l11;
        }
    }

    public void setOnVideoSizeChangedListener(MediaPlayer.OnVideoSizeChangedListener l11) {
        MediaPlayer mediaPlayer = this.f17108d;
        if (mediaPlayer != null) {
            mediaPlayer.setOnVideoSizeChangedListener(l11);
        }
    }

    public void setShouldAutoplay(boolean shouldAutoplay) {
        this.f17120p = shouldAutoplay;
    }

    public void setVideoPath(String path) throws IOException, RuntimeException {
        setVideoURI(Uri.parse(path));
    }

    public void setVideoURI(Uri uri) throws IOException, RuntimeException {
        Log.d(f17104y, "setVideoURI " + uri);
        this.f17105a = uri;
        if (this.f17108d != null) {
            j();
        }
        ((AudioManager) getContext().getApplicationContext().getSystemService("audio")).requestAudioFocus(null, 3, 1);
        MediaPlayer mediaPlayer = new MediaPlayer();
        this.f17108d = mediaPlayer;
        mediaPlayer.setDisplay(this.f17109e);
        this.f17108d.setDataSource(this.f17106b, uri);
        this.f17108d.setScreenOnWhilePlaying(true);
        this.f17114j = State.INITIALIZED;
        i();
        if (getContext() instanceof Activity) {
            ((Activity) getContext()).getWindow().addFlags(128);
        }
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceChanged(SurfaceHolder holder, int format, int width, int height) {
        Log.d(f17104y, "surfaceChanged called " + width + j2.O + height);
        new Handler(Looper.getMainLooper()).post(new a());
    }

    @Override // android.view.SurfaceHolder.Callback
    public synchronized void surfaceCreated(SurfaceHolder holder) {
        Log.d(f17104y, "surfaceCreated called = " + this.f17114j);
        this.f17108d.setDisplay(this.f17109e);
        if (!this.f17112h) {
            this.f17112h = true;
            State state = this.f17114j;
            if (state != State.PREPARED && state != State.PAUSED && state != State.STARTED && state != State.PLAYBACKCOMPLETED) {
                r();
            }
        }
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceDestroyed(SurfaceHolder holder) {
        Log.d(f17104y, "surfaceDestroyed called");
        MediaPlayer mediaPlayer = this.f17108d;
        if (mediaPlayer != null && mediaPlayer.isPlaying()) {
            this.f17108d.pause();
        }
        this.f17112h = false;
    }

    public FullscreenVideoView(Context context, AttributeSet attrs) {
        super(context, attrs);
        this.f17124t = false;
        this.f17106b = context;
        c();
    }

    public FullscreenVideoView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        this.f17124t = false;
        this.f17106b = context;
        c();
    }
}
