package com.baicizhan.client.business.widget;

import android.content.Context;
import android.content.Intent;
import android.graphics.Canvas;
import android.media.MediaFormat;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.AsyncTask;
import android.util.AttributeSet;
import android.util.Pair;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.MediaController;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.baicizhan.main.activity.aiclass.video.BczVideoView;
import com.heytap.mcssdk.constant.IntentConstant;
import java.io.IOException;
import java.io.InputStream;
import java.util.Map;
import java.util.Vector;
import org.junit.jupiter.api.j2;
import pn.j;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public class VideoView extends SurfaceView implements MediaController.MediaPlayerControl {
    public static final int E = -1;
    public static final int F = 0;
    public static final int G = 1;
    public static final int H = 2;
    public static final int I = 3;
    public static final int J = 4;
    public static final int K = 5;
    public MediaPlayer.OnInfoListener A;
    public MediaPlayer.OnErrorListener B;
    public MediaPlayer.OnBufferingUpdateListener C;
    public SurfaceHolder.Callback D;

    /* renamed from: a, reason: collision with root package name */
    public String f17188a;

    /* renamed from: b, reason: collision with root package name */
    public Uri f17189b;

    /* renamed from: c, reason: collision with root package name */
    public int f17190c;

    /* renamed from: d, reason: collision with root package name */
    public int f17191d;

    /* renamed from: e, reason: collision with root package name */
    public SurfaceHolder f17192e;

    /* renamed from: f, reason: collision with root package name */
    public MediaPlayer f17193f;

    /* renamed from: g, reason: collision with root package name */
    public int f17194g;

    /* renamed from: h, reason: collision with root package name */
    public int f17195h;

    /* renamed from: i, reason: collision with root package name */
    public int f17196i;

    /* renamed from: j, reason: collision with root package name */
    public int f17197j;

    /* renamed from: k, reason: collision with root package name */
    public int f17198k;

    /* renamed from: l, reason: collision with root package name */
    public MediaController f17199l;

    /* renamed from: m, reason: collision with root package name */
    public MediaPlayer.OnCompletionListener f17200m;

    /* renamed from: n, reason: collision with root package name */
    public MediaPlayer.OnPreparedListener f17201n;

    /* renamed from: o, reason: collision with root package name */
    public int f17202o;

    /* renamed from: p, reason: collision with root package name */
    public MediaPlayer.OnErrorListener f17203p;

    /* renamed from: q, reason: collision with root package name */
    public MediaPlayer.OnInfoListener f17204q;

    /* renamed from: r, reason: collision with root package name */
    public int f17205r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f17206s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f17207t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f17208u;

    /* renamed from: v, reason: collision with root package name */
    public Context f17209v;

    /* renamed from: w, reason: collision with root package name */
    public Vector<Pair<InputStream, MediaFormat>> f17210w;

    /* renamed from: x, reason: collision with root package name */
    public MediaPlayer.OnVideoSizeChangedListener f17211x;

    /* renamed from: y, reason: collision with root package name */
    public MediaPlayer.OnPreparedListener f17212y;

    /* renamed from: z, reason: collision with root package name */
    public MediaPlayer.OnCompletionListener f17213z;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class a implements MediaPlayer.OnVideoSizeChangedListener {
        public a() {
        }

        @Override // android.media.MediaPlayer.OnVideoSizeChangedListener
        public void onVideoSizeChanged(MediaPlayer mp2, int width, int height) {
            VideoView.this.f17195h = mp2.getVideoWidth();
            VideoView.this.f17196i = mp2.getVideoHeight();
            if (VideoView.this.f17195h == 0 || VideoView.this.f17196i == 0) {
                return;
            }
            qb.c.b(VideoView.this.f17188a, "OnVideoSizeChangedListener " + VideoView.this.f17195h + "/" + VideoView.this.f17196i, new Object[0]);
            VideoView.this.requestLayout();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class b implements MediaPlayer.OnPreparedListener {
        public b() {
        }

        @Override // android.media.MediaPlayer.OnPreparedListener
        public void onPrepared(MediaPlayer mp2) {
            VideoView.this.f17190c = 2;
            VideoView videoView = VideoView.this;
            videoView.f17208u = true;
            videoView.f17207t = true;
            videoView.f17206s = true;
            if (VideoView.this.f17201n != null) {
                VideoView.this.f17201n.onPrepared(VideoView.this.f17193f);
            }
            if (VideoView.this.f17199l != null) {
                VideoView.this.f17199l.setEnabled(true);
            }
            VideoView.this.f17195h = mp2.getVideoWidth();
            VideoView.this.f17196i = mp2.getVideoHeight();
            int i11 = VideoView.this.f17205r;
            if (i11 != 0) {
                VideoView.this.seekTo(i11);
            }
            if (VideoView.this.f17195h == 0 || VideoView.this.f17196i == 0) {
                if (VideoView.this.f17191d == 3) {
                    VideoView.this.start();
                    return;
                }
                return;
            }
            qb.c.i(VideoView.this.f17188a, "video size: " + VideoView.this.f17195h + "/" + VideoView.this.f17196i + ", surfaceSize " + VideoView.this.f17197j + "/" + VideoView.this.f17198k + j2.O, new Object[0]);
            if (VideoView.this.f17191d == 3) {
                VideoView.this.start();
                if (VideoView.this.f17199l != null) {
                    VideoView.this.f17199l.show();
                    return;
                }
                return;
            }
            if (VideoView.this.isPlaying()) {
                return;
            }
            if ((i11 != 0 || VideoView.this.getCurrentPosition() > 0) && VideoView.this.f17199l != null) {
                VideoView.this.f17199l.show(0);
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class c implements MediaPlayer.OnCompletionListener {
        public c() {
        }

        @Override // android.media.MediaPlayer.OnCompletionListener
        public void onCompletion(MediaPlayer mp2) {
            VideoView.this.f17190c = 5;
            VideoView.this.f17191d = 5;
            if (VideoView.this.f17199l != null) {
                VideoView.this.f17199l.hide();
            }
            if (VideoView.this.f17200m != null) {
                VideoView.this.f17200m.onCompletion(VideoView.this.f17193f);
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class d implements MediaPlayer.OnInfoListener {
        public d() {
        }

        @Override // android.media.MediaPlayer.OnInfoListener
        public boolean onInfo(MediaPlayer mp2, int arg1, int arg2) {
            if (VideoView.this.f17204q == null) {
                return true;
            }
            VideoView.this.f17204q.onInfo(mp2, arg1, arg2);
            return true;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class e implements MediaPlayer.OnErrorListener {
        public e() {
        }

        @Override // android.media.MediaPlayer.OnErrorListener
        public boolean onError(MediaPlayer mp2, int framework_err, int impl_err) {
            qb.c.b(VideoView.this.f17188a, "Error: " + framework_err + "," + impl_err, new Object[0]);
            VideoView.this.f17190c = -1;
            VideoView.this.f17191d = -1;
            if (VideoView.this.f17199l != null) {
                VideoView.this.f17199l.hide();
            }
            if (VideoView.this.f17203p != null) {
                VideoView.this.f17203p.onError(VideoView.this.f17193f, framework_err, impl_err);
            }
            return true;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class f implements MediaPlayer.OnBufferingUpdateListener {
        public f() {
        }

        @Override // android.media.MediaPlayer.OnBufferingUpdateListener
        public void onBufferingUpdate(MediaPlayer mp2, int percent) {
            VideoView.this.f17202o = percent;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class g implements SurfaceHolder.Callback {
        public g() {
        }

        @Override // android.view.SurfaceHolder.Callback
        public void surfaceChanged(SurfaceHolder holder, int format, int w11, int h11) {
            VideoView.this.f17197j = w11;
            VideoView.this.f17198k = h11;
            boolean z11 = VideoView.this.f17191d == 3;
            boolean z12 = VideoView.this.f17195h == w11 && VideoView.this.f17196i == h11;
            qb.c.b(VideoView.this.f17188a, "surfaceChanged " + w11 + "/" + h11 + j2.O + z11 + j2.O + z12, new Object[0]);
            if (VideoView.this.f17193f != null && z11 && z12) {
                if (VideoView.this.f17205r != 0) {
                    VideoView videoView = VideoView.this;
                    videoView.seekTo(videoView.f17205r);
                }
                VideoView.this.start();
            }
        }

        @Override // android.view.SurfaceHolder.Callback
        public void surfaceCreated(SurfaceHolder holder) {
            qb.c.b(VideoView.this.f17188a, "surfaceCreated", new Object[0]);
            VideoView.this.f17192e = holder;
            VideoView.this.E();
        }

        @Override // android.view.SurfaceHolder.Callback
        public void surfaceDestroyed(SurfaceHolder holder) {
            qb.c.b(VideoView.this.f17188a, "surfaceDestroyed", new Object[0]);
            VideoView.this.f17192e = null;
            if (VideoView.this.f17199l != null) {
                VideoView.this.f17199l.hide();
            }
            VideoView.this.F(true);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class h extends AsyncTask<MediaPlayer, Void, Void> {
        public h() {
        }

        @Override // android.os.AsyncTask
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Void doInBackground(MediaPlayer... mediaPlayers) {
            try {
                MediaPlayer mediaPlayer = mediaPlayers[0];
                mediaPlayer.reset();
                mediaPlayer.release();
                return null;
            } catch (Exception unused) {
                return null;
            }
        }
    }

    public VideoView(Context context) {
        super(context);
        this.f17188a = BczVideoView.f18252g;
        this.f17190c = 0;
        this.f17191d = 0;
        this.f17192e = null;
        this.f17193f = null;
        this.f17211x = new a();
        this.f17212y = new b();
        this.f17213z = new c();
        this.A = new d();
        this.B = new e();
        this.C = new f();
        this.D = new g();
        B();
    }

    public final void A() {
        MediaController mediaController;
        if (this.f17193f == null || (mediaController = this.f17199l) == null) {
            return;
        }
        mediaController.setMediaPlayer(this);
        this.f17199l.setAnchorView(getParent() instanceof View ? (View) getParent() : this);
        this.f17199l.setEnabled(C());
    }

    public final void B() {
        this.f17209v = getContext();
        this.f17195h = 0;
        this.f17196i = 0;
        getHolder().addCallback(this.D);
        getHolder().setType(3);
        setFocusable(true);
        setFocusableInTouchMode(true);
        requestFocus();
        this.f17210w = new Vector<>();
        this.f17190c = 0;
        this.f17191d = 0;
    }

    public final boolean C() {
        int i11;
        return (this.f17193f == null || (i11 = this.f17190c) == -1 || i11 == 0 || i11 == 1) ? false : true;
    }

    public final void D() {
        getWidth();
        getPaddingLeft();
        getPaddingRight();
        getHeight();
        getPaddingTop();
        getPaddingBottom();
    }

    public final void E() {
        if (this.f17189b == null || this.f17192e == null) {
            qb.c.b(this.f17188a, "openVideo SurfaceHolder null", new Object[0]);
            return;
        }
        qb.c.b(this.f17188a, "openVideo", new Object[0]);
        Intent intent = new Intent("com.android.music.musicservicecommand");
        intent.putExtra(IntentConstant.COMMAND, ma.b.L);
        this.f17209v.sendBroadcast(intent);
        F(false);
        try {
            try {
                this.f17193f = new MediaPlayer();
                getContext();
                int i11 = this.f17194g;
                if (i11 != 0) {
                    this.f17193f.setAudioSessionId(i11);
                } else {
                    this.f17194g = this.f17193f.getAudioSessionId();
                }
                this.f17193f.setOnPreparedListener(this.f17212y);
                this.f17193f.setOnVideoSizeChangedListener(this.f17211x);
                this.f17193f.setOnCompletionListener(this.f17213z);
                this.f17193f.setOnErrorListener(this.B);
                this.f17193f.setOnInfoListener(this.A);
                this.f17193f.setOnBufferingUpdateListener(this.C);
                this.f17202o = 0;
                this.f17193f.setDataSource(this.f17209v, this.f17189b);
                this.f17193f.setDisplay(this.f17192e);
                this.f17193f.setAudioStreamType(3);
                this.f17193f.setScreenOnWhilePlaying(true);
                this.f17193f.prepareAsync();
                this.f17190c = 1;
                A();
                this.f17210w.clear();
            } catch (IOException e11) {
                qb.c.p(this.f17188a, "Unable to open content: " + this.f17189b, e11);
                this.f17190c = -1;
                this.f17191d = -1;
                this.B.onError(this.f17193f, 1, 0);
                this.f17210w.clear();
            } catch (IllegalArgumentException e12) {
                qb.c.p(this.f17188a, "Unable to open content: " + this.f17189b, e12);
                this.f17190c = -1;
                this.f17191d = -1;
                this.B.onError(this.f17193f, 1, 0);
                this.f17210w.clear();
            }
        } catch (Throwable th2) {
            this.f17210w.clear();
            throw th2;
        }
    }

    public final void F(boolean cleartargetstate) {
        if (this.f17193f != null) {
            new h().execute(this.f17193f);
            this.f17193f = null;
            this.f17210w.clear();
            this.f17190c = 0;
            if (cleartargetstate) {
                this.f17191d = 0;
            }
        }
    }

    public int G(int desiredSize, int measureSpec) {
        return View.getDefaultSize(desiredSize, measureSpec);
    }

    public void H() {
        E();
    }

    public void I(Uri uri, Map<String, String> headers) {
        this.f17189b = uri;
        this.f17205r = 0;
        E();
        requestLayout();
        invalidate();
    }

    public void J() {
        MediaPlayer mediaPlayer = this.f17193f;
        if (mediaPlayer != null) {
            mediaPlayer.stop();
            this.f17193f.release();
            this.f17193f = null;
            this.f17190c = 0;
            this.f17191d = 0;
        }
    }

    public void K() {
        F(false);
    }

    public final void L() {
        if (this.f17199l.isShowing()) {
            this.f17199l.hide();
        } else {
            this.f17199l.show();
        }
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public boolean canPause() {
        return this.f17206s;
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public boolean canSeekBackward() {
        return this.f17207t;
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public boolean canSeekForward() {
        return this.f17208u;
    }

    @Override // android.view.SurfaceView, android.view.View
    public void draw(Canvas canvas) {
        super.draw(canvas);
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public int getAudioSessionId() {
        if (this.f17194g == 0) {
            MediaPlayer mediaPlayer = new MediaPlayer();
            this.f17194g = mediaPlayer.getAudioSessionId();
            mediaPlayer.release();
        }
        return this.f17194g;
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public int getBufferPercentage() {
        if (this.f17193f != null) {
            return this.f17202o;
        }
        return 0;
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public int getCurrentPosition() {
        if (C()) {
            return this.f17193f.getCurrentPosition();
        }
        return 0;
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public int getDuration() {
        if (C()) {
            return this.f17193f.getDuration();
        }
        return -1;
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public boolean isPlaying() {
        return C() && this.f17193f.isPlaying();
    }

    @Override // android.view.SurfaceView, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
    }

    @Override // android.view.SurfaceView, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public void onInitializeAccessibilityEvent(AccessibilityEvent event) {
        super.onInitializeAccessibilityEvent(event);
        event.setClassName(VideoView.class.getName());
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo info) {
        super.onInitializeAccessibilityNodeInfo(info);
    }

    @Override // android.view.View, android.view.KeyEvent.Callback
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        boolean z11 = (keyCode == 4 || keyCode == 24 || keyCode == 25 || keyCode == 164 || keyCode == 82 || keyCode == 5 || keyCode == 6) ? false : true;
        if (C() && z11 && this.f17199l != null) {
            if (keyCode == 79 || keyCode == 85) {
                if (this.f17193f.isPlaying()) {
                    pause();
                    this.f17199l.show();
                } else {
                    start();
                    this.f17199l.hide();
                }
                return true;
            }
            if (keyCode == 126) {
                if (!this.f17193f.isPlaying()) {
                    start();
                    this.f17199l.hide();
                }
                return true;
            }
            if (keyCode == 86 || keyCode == 127) {
                if (this.f17193f.isPlaying()) {
                    pause();
                    this.f17199l.show();
                }
                return true;
            }
            L();
        }
        return super.onKeyDown(keyCode, event);
    }

    @Override // android.view.View
    public void onLayout(boolean changed, int left, int top, int right, int bottom) {
        super.onLayout(changed, left, top, right, bottom);
    }

    @Override // android.view.SurfaceView, android.view.View
    public void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        qb.c.i(this.f17188a, "onMeasure(" + View.MeasureSpec.toString(widthMeasureSpec) + j2.O + View.MeasureSpec.toString(heightMeasureSpec) + j.f81007d, new Object[0]);
        setMeasuredDimension(View.getDefaultSize(this.f17195h, widthMeasureSpec), View.getDefaultSize(this.f17196i, heightMeasureSpec));
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent ev2) {
        if (!C() || this.f17199l == null) {
            return false;
        }
        L();
        return false;
    }

    @Override // android.view.View
    public boolean onTrackballEvent(MotionEvent ev2) {
        if (!C() || this.f17199l == null) {
            return false;
        }
        L();
        return false;
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public void pause() {
        if (C() && this.f17193f.isPlaying()) {
            this.f17193f.pause();
            this.f17190c = 4;
        }
        this.f17191d = 4;
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public void seekTo(int msec) {
        if (!C()) {
            this.f17205r = msec;
        } else {
            this.f17193f.seekTo(msec);
            this.f17205r = 0;
        }
    }

    public void setMediaController(MediaController controller) {
        MediaController mediaController = this.f17199l;
        if (mediaController != null) {
            mediaController.hide();
        }
        this.f17199l = controller;
        A();
    }

    public void setOnCompletionListener(MediaPlayer.OnCompletionListener l11) {
        this.f17200m = l11;
    }

    public void setOnErrorListener(MediaPlayer.OnErrorListener l11) {
        this.f17203p = l11;
    }

    public void setOnInfoListener(MediaPlayer.OnInfoListener l11) {
        this.f17204q = l11;
    }

    public void setOnPreparedListener(MediaPlayer.OnPreparedListener l11) {
        this.f17201n = l11;
    }

    public void setVideoPath(String path) {
        setVideoURI(Uri.parse(path));
    }

    public void setVideoURI(Uri uri) {
        I(uri, null);
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public void start() {
        qb.c.i(this.f17188a, TtmlNode.START, new Object[0]);
        if (C()) {
            this.f17193f.start();
            this.f17190c = 3;
        }
        this.f17191d = 3;
    }

    public VideoView(Context context, AttributeSet attrs) {
        this(context, attrs, 0);
        B();
    }

    public VideoView(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
        this.f17188a = BczVideoView.f18252g;
        this.f17190c = 0;
        this.f17191d = 0;
        this.f17192e = null;
        this.f17193f = null;
        this.f17211x = new a();
        this.f17212y = new b();
        this.f17213z = new c();
        this.A = new d();
        this.B = new e();
        this.C = new f();
        this.D = new g();
        B();
    }
}
