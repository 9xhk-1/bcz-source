package com.baicizhan.client.business.managers.ad.view;

import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.graphics.Matrix;
import android.graphics.SurfaceTexture;
import android.media.MediaPlayer;
import android.net.Uri;
import android.util.AttributeSet;
import android.view.Surface;
import android.view.TextureView;
import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.baicizhan.client.business.managers.ad.view.SplashVideoView;
import qb.c;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public class SplashVideoView extends FrameLayout {

    /* renamed from: l, reason: collision with root package name */
    public static final String f16420l = "SplashVideoView";

    /* renamed from: a, reason: collision with root package name */
    public TextureView f16421a;

    /* renamed from: b, reason: collision with root package name */
    public MediaPlayer f16422b;

    /* renamed from: c, reason: collision with root package name */
    public View f16423c;

    /* renamed from: d, reason: collision with root package name */
    public b f16424d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f16425e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f16426f;

    /* renamed from: g, reason: collision with root package name */
    public int f16427g;

    /* renamed from: h, reason: collision with root package name */
    public String f16428h;

    /* renamed from: i, reason: collision with root package name */
    public Surface f16429i;

    /* renamed from: j, reason: collision with root package name */
    public int f16430j;

    /* renamed from: k, reason: collision with root package name */
    public int f16431k;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public interface b {
        void onCompleted();

        void onError();

        void onPrepared();
    }

    public SplashVideoView(@NonNull Context context) {
        this(context, null);
    }

    public final void k(int viewWidth, int viewHeight) {
        int i11;
        int i12 = this.f16430j;
        if (i12 == 0 || (i11 = this.f16431k) == 0 || viewWidth == 0 || viewHeight == 0) {
            return;
        }
        int i13 = (int) (viewWidth / (i12 / i11));
        Matrix matrix = new Matrix();
        this.f16421a.getTransform(matrix);
        float f11 = viewWidth;
        matrix.setScale(f11 / f11, i13 / viewHeight);
        matrix.postTranslate(0, (viewHeight - i13) / 2);
        this.f16421a.setTransform(matrix);
    }

    public final void l() {
        this.f16421a = new TextureView(getContext());
        addView(this.f16421a, new FrameLayout.LayoutParams(-1, -1, 17));
        View view = new View(getContext());
        this.f16423c = view;
        view.setBackgroundColor(-16777216);
        addView(this.f16423c, new FrameLayout.LayoutParams(-1, -1));
        this.f16421a.setSurfaceTextureListener(new a());
    }

    public final /* synthetic */ void m(MediaPlayer mediaPlayer, int i11, int i12) {
        c.i(f16420l, "Video size changed: " + i11 + "x" + i12, new Object[0]);
        this.f16430j = i11;
        this.f16431k = i12;
        k(this.f16421a.getWidth(), this.f16421a.getHeight());
    }

    public final /* synthetic */ void n(MediaPlayer mediaPlayer) {
        c.i(f16420l, "Video prepared", new Object[0]);
        this.f16426f = true;
        int i11 = this.f16427g;
        if (i11 > 0) {
            this.f16422b.seekTo(i11);
        }
        this.f16423c.setVisibility(8);
        if (!this.f16425e) {
            v();
        }
        b bVar = this.f16424d;
        if (bVar != null) {
            bVar.onPrepared();
        }
    }

    public final /* synthetic */ void o(MediaPlayer mediaPlayer) {
        c.i(f16420l, "Video completed", new Object[0]);
        this.f16425e = false;
        b bVar = this.f16424d;
        if (bVar != null) {
            bVar.onCompleted();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        t();
    }

    @Override // android.view.View
    public void onSizeChanged(int w11, int h11, int oldw, int oldh) {
        super.onSizeChanged(w11, h11, oldw, oldh);
        k(w11, h11);
    }

    public final /* synthetic */ boolean p(MediaPlayer mediaPlayer, int i11, int i12) {
        c.d(f16420l, "Video error: what=" + i11 + ", extra=" + i12, new Object[0]);
        this.f16425e = false;
        b bVar = this.f16424d;
        if (bVar == null) {
            return true;
        }
        bVar.onError();
        return true;
    }

    public final /* synthetic */ boolean q(MediaPlayer mediaPlayer, int i11, int i12) {
        if (i11 != 3) {
            return true;
        }
        this.f16423c.setVisibility(8);
        return true;
    }

    public void r() {
        MediaPlayer mediaPlayer = this.f16422b;
        if (mediaPlayer == null || !this.f16425e) {
            return;
        }
        try {
            this.f16427g = mediaPlayer.getCurrentPosition();
            this.f16422b.pause();
            this.f16425e = false;
        } catch (IllegalStateException e11) {
            c.c(f16420l, "pause error", e11);
        }
    }

    public final void s() {
        try {
            MediaPlayer mediaPlayer = this.f16422b;
            if (mediaPlayer == null) {
                this.f16422b = new MediaPlayer();
            } else {
                mediaPlayer.reset();
            }
            this.f16422b.setVolume(0.0f, 0.0f);
            this.f16422b.setOnVideoSizeChangedListener(new MediaPlayer.OnVideoSizeChangedListener() { // from class: t9.a
                @Override // android.media.MediaPlayer.OnVideoSizeChangedListener
                public final void onVideoSizeChanged(MediaPlayer mediaPlayer2, int i11, int i12) {
                    SplashVideoView.this.m(mediaPlayer2, i11, i12);
                }
            });
            this.f16422b.setOnPreparedListener(new MediaPlayer.OnPreparedListener() { // from class: t9.b
                @Override // android.media.MediaPlayer.OnPreparedListener
                public final void onPrepared(MediaPlayer mediaPlayer2) {
                    SplashVideoView.this.n(mediaPlayer2);
                }
            });
            this.f16422b.setOnCompletionListener(new MediaPlayer.OnCompletionListener() { // from class: t9.c
                @Override // android.media.MediaPlayer.OnCompletionListener
                public final void onCompletion(MediaPlayer mediaPlayer2) {
                    SplashVideoView.this.o(mediaPlayer2);
                }
            });
            this.f16422b.setOnErrorListener(new MediaPlayer.OnErrorListener() { // from class: t9.d
                @Override // android.media.MediaPlayer.OnErrorListener
                public final boolean onError(MediaPlayer mediaPlayer2, int i11, int i12) {
                    boolean p11;
                    p11 = SplashVideoView.this.p(mediaPlayer2, i11, i12);
                    return p11;
                }
            });
            this.f16422b.setOnInfoListener(new MediaPlayer.OnInfoListener() { // from class: t9.e
                @Override // android.media.MediaPlayer.OnInfoListener
                public final boolean onInfo(MediaPlayer mediaPlayer2, int i11, int i12) {
                    boolean q11;
                    q11 = SplashVideoView.this.q(mediaPlayer2, i11, i12);
                    return q11;
                }
            });
            Surface surface = this.f16429i;
            if (surface != null) {
                this.f16422b.setSurface(surface);
                if (this.f16428h.startsWith("file:///android_asset/")) {
                    AssetFileDescriptor openFd = getContext().getAssets().openFd(this.f16428h.substring(22));
                    this.f16422b.setDataSource(openFd.getFileDescriptor(), openFd.getStartOffset(), openFd.getLength());
                    openFd.close();
                } else {
                    this.f16422b.setDataSource(getContext(), Uri.parse(this.f16428h));
                }
                this.f16422b.prepareAsync();
            }
        } catch (Exception e11) {
            c.c(f16420l, "prepareMediaPlayer error", e11);
            b bVar = this.f16424d;
            if (bVar != null) {
                bVar.onError();
            }
        }
    }

    public void setOnVideoListener(b listener) {
        this.f16424d = listener;
    }

    public void setVideoPath(String path) {
        this.f16428h = path;
        this.f16423c.setVisibility(0);
        if (this.f16429i != null) {
            s();
        }
    }

    public void t() {
        MediaPlayer mediaPlayer = this.f16422b;
        if (mediaPlayer != null) {
            mediaPlayer.release();
            this.f16422b = null;
        }
        Surface surface = this.f16429i;
        if (surface != null) {
            surface.release();
            this.f16429i = null;
        }
        this.f16427g = 0;
        this.f16425e = false;
        this.f16426f = false;
        this.f16430j = 0;
        this.f16431k = 0;
    }

    public void u() {
        MediaPlayer mediaPlayer = this.f16422b;
        if (mediaPlayer != null) {
            try {
                if (mediaPlayer.isPlaying()) {
                    return;
                }
                if (!this.f16426f) {
                    if (this.f16428h != null) {
                        s();
                    }
                } else {
                    int i11 = this.f16427g;
                    if (i11 > 0) {
                        this.f16422b.seekTo(i11);
                    }
                    v();
                }
            } catch (IllegalStateException e11) {
                c.c(f16420l, "resume error", e11);
                if (this.f16428h != null) {
                    s();
                }
            }
        }
    }

    public void v() {
        MediaPlayer mediaPlayer = this.f16422b;
        if (mediaPlayer == null || this.f16425e || !this.f16426f) {
            return;
        }
        mediaPlayer.start();
        this.f16425e = true;
    }

    public void w() {
        MediaPlayer mediaPlayer = this.f16422b;
        if (mediaPlayer != null) {
            mediaPlayer.stop();
            this.f16425e = false;
            this.f16426f = false;
        }
    }

    public SplashVideoView(@NonNull Context context, @Nullable AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public SplashVideoView(@NonNull Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        this.f16425e = false;
        this.f16426f = false;
        this.f16427g = 0;
        l();
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class a implements TextureView.SurfaceTextureListener {
        public a() {
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public void onSurfaceTextureAvailable(@NonNull SurfaceTexture surface, int width, int height) {
            SplashVideoView.this.f16429i = new Surface(surface);
            if (SplashVideoView.this.f16428h != null) {
                SplashVideoView.this.s();
            }
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public boolean onSurfaceTextureDestroyed(@NonNull SurfaceTexture surface) {
            if (SplashVideoView.this.f16429i == null) {
                return true;
            }
            SplashVideoView.this.f16429i.release();
            SplashVideoView.this.f16429i = null;
            return true;
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public void onSurfaceTextureSizeChanged(@NonNull SurfaceTexture surface, int width, int height) {
            SplashVideoView.this.k(width, height);
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public void onSurfaceTextureUpdated(@NonNull SurfaceTexture surface) {
        }
    }
}
