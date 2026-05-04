package com.malmstein.fenster.view;

import android.R;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.SurfaceTexture;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.net.Uri;
import android.util.AttributeSet;
import android.util.Log;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.Surface;
import android.view.TextureView;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.MediaController;
import com.heytap.mcssdk.constant.IntentConstant;
import com.malmstein.fenster.view.a;
import java.io.IOException;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public class FensterVideoView extends TextureView implements MediaController.MediaPlayerControl, os.a {
    public static final String F = "TextureVideoView";
    public static final int G = 0;
    public static final int I = -1;
    public static final int J = 0;
    public static final int K = 1;
    public static final int L = 2;
    public static final int M = 3;
    public static final int N = 4;
    public static final int O = 5;
    public static final int P = 1000;
    public MediaPlayer.OnInfoListener A;
    public MediaPlayer.OnErrorListener B;
    public MediaPlayer.OnBufferingUpdateListener C;
    public TextureView.SurfaceTextureListener D;
    public final MediaPlayer.OnInfoListener E;

    /* renamed from: a, reason: collision with root package name */
    public final com.malmstein.fenster.view.a f39269a;

    /* renamed from: b, reason: collision with root package name */
    public int f39270b;

    /* renamed from: c, reason: collision with root package name */
    public int f39271c;

    /* renamed from: d, reason: collision with root package name */
    public Uri f39272d;

    /* renamed from: e, reason: collision with root package name */
    public Map<String, String> f39273e;

    /* renamed from: f, reason: collision with root package name */
    public SurfaceTexture f39274f;

    /* renamed from: g, reason: collision with root package name */
    public int f39275g;

    /* renamed from: h, reason: collision with root package name */
    public int f39276h;

    /* renamed from: i, reason: collision with root package name */
    public ps.a f39277i;

    /* renamed from: j, reason: collision with root package name */
    public int f39278j;

    /* renamed from: k, reason: collision with root package name */
    public ls.a f39279k;

    /* renamed from: l, reason: collision with root package name */
    public MediaPlayer.OnCompletionListener f39280l;

    /* renamed from: m, reason: collision with root package name */
    public MediaPlayer.OnPreparedListener f39281m;

    /* renamed from: n, reason: collision with root package name */
    public int f39282n;

    /* renamed from: o, reason: collision with root package name */
    public MediaPlayer.OnErrorListener f39283o;

    /* renamed from: p, reason: collision with root package name */
    public MediaPlayer.OnInfoListener f39284p;

    /* renamed from: q, reason: collision with root package name */
    public int f39285q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f39286r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f39287s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f39288t;

    /* renamed from: u, reason: collision with root package name */
    public os.c f39289u;

    /* renamed from: v, reason: collision with root package name */
    public AlertDialog f39290v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f39291w;

    /* renamed from: x, reason: collision with root package name */
    public MediaPlayer.OnVideoSizeChangedListener f39292x;

    /* renamed from: y, reason: collision with root package name */
    public MediaPlayer.OnPreparedListener f39293y;

    /* renamed from: z, reason: collision with root package name */
    public MediaPlayer.OnCompletionListener f39294z;
    public static final m H = new d();
    public static final long Q = TimeUnit.MINUTES.toMillis(10);

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class a implements TextureView.SurfaceTextureListener {
        public a() {
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public void onSurfaceTextureAvailable(final SurfaceTexture surface, final int width, final int height) {
            Log.i(FensterVideoView.F, "onSurfaceTextureAvailable " + surface.hashCode() + " h = " + height + " w = " + width);
            FensterVideoView.this.f39274f = surface;
            FensterVideoView.this.f39275g = width;
            FensterVideoView.this.f39276h = height;
            if (FensterVideoView.this.f39277i == null || !FensterVideoView.this.f39291w) {
                FensterVideoView.this.U();
            } else {
                FensterVideoView.this.f39277i.setSurface(new Surface(FensterVideoView.this.f39274f));
                FensterVideoView.this.f39277i.a(FensterVideoView.this.f39275g, FensterVideoView.this.f39276h);
            }
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public boolean onSurfaceTextureDestroyed(final SurfaceTexture surface) {
            Log.i(FensterVideoView.F, "onSurfaceTextureDestroyed " + surface.hashCode());
            if (FensterVideoView.this.f39291w) {
                return false;
            }
            FensterVideoView.this.f39274f = null;
            FensterVideoView.this.O();
            FensterVideoView.this.W(true);
            return false;
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public void onSurfaceTextureSizeChanged(final SurfaceTexture surface, final int width, final int height) {
            FensterVideoView.this.f39275g = width;
            FensterVideoView.this.f39276h = height;
            boolean z11 = false;
            boolean z12 = FensterVideoView.this.f39271c == 3;
            boolean a11 = FensterVideoView.this.f39269a.a(width, height);
            StringBuilder sb2 = new StringBuilder();
            sb2.append("onSurfaceTextureSizeChanged ");
            if (FensterVideoView.this.f39277i != null && z12 && a11) {
                z11 = true;
            }
            sb2.append(z11);
            sb2.append("  seek ");
            sb2.append(FensterVideoView.this.f39285q);
            Log.i(FensterVideoView.F, sb2.toString());
            if (FensterVideoView.this.f39277i != null) {
                FensterVideoView.this.f39277i.a(width, height);
            }
            if (FensterVideoView.this.f39277i != null && z12 && a11) {
                if (FensterVideoView.this.f39285q != 0) {
                    FensterVideoView fensterVideoView = FensterVideoView.this;
                    fensterVideoView.seekTo(fensterVideoView.f39285q);
                }
                FensterVideoView.this.start();
            }
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public void onSurfaceTextureUpdated(final SurfaceTexture surface) {
            FensterVideoView.this.f39274f = surface;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class b implements MediaPlayer.OnSeekCompleteListener {
        public b() {
        }

        @Override // android.media.MediaPlayer.OnSeekCompleteListener
        public void onSeekComplete(final MediaPlayer mp2) {
            Log.i(FensterVideoView.F, "seek completed");
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class c implements MediaPlayer.OnInfoListener {
        public c() {
        }

        @Override // android.media.MediaPlayer.OnInfoListener
        public boolean onInfo(final MediaPlayer mp2, final int what, final int extra) {
            if (FensterVideoView.this.R()) {
                return false;
            }
            if (3 == what) {
                FensterVideoView.this.f39289u.e();
                FensterVideoView.this.f39289u.a();
            }
            if (701 == what) {
                FensterVideoView.this.f39289u.c();
            }
            if (702 == what) {
                FensterVideoView.this.f39289u.a();
            }
            return false;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class e implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ MediaPlayer f39298a;

        public e(final MediaPlayer val$player) {
            this.f39298a = val$player;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f39298a.stop();
            this.f39298a.release();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class f implements MediaPlayer.OnVideoSizeChangedListener {
        public f() {
        }

        @Override // android.media.MediaPlayer.OnVideoSizeChangedListener
        public void onVideoSizeChanged(final MediaPlayer mp2, final int width, final int height) {
            FensterVideoView.this.f39269a.e(mp2.getVideoWidth(), mp2.getVideoHeight());
            if (FensterVideoView.this.f39269a.b()) {
                FensterVideoView.this.requestLayout();
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class g implements MediaPlayer.OnPreparedListener {
        public g() {
        }

        @Override // android.media.MediaPlayer.OnPreparedListener
        public void onPrepared(final MediaPlayer mp2) {
            FensterVideoView.this.f39270b = 2;
            FensterVideoView.this.f39286r = true;
            FensterVideoView.this.f39287s = true;
            FensterVideoView.this.f39288t = true;
            if (FensterVideoView.this.f39281m != null) {
                FensterVideoView.this.f39281m.onPrepared(FensterVideoView.this.f39277i);
            }
            if (FensterVideoView.this.f39279k != null) {
                FensterVideoView.this.f39279k.setEnabled(true);
            }
            FensterVideoView.this.f39269a.e(mp2.getVideoWidth(), mp2.getVideoHeight());
            int i11 = FensterVideoView.this.f39285q;
            if (i11 != 0) {
                FensterVideoView.this.seekTo(i11);
            }
            if (FensterVideoView.this.f39271c == 3) {
                FensterVideoView.this.start();
                FensterVideoView.this.d0();
            } else if (FensterVideoView.this.V(i11)) {
                FensterVideoView.this.e0();
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class h implements MediaPlayer.OnCompletionListener {
        public h() {
        }

        @Override // android.media.MediaPlayer.OnCompletionListener
        public void onCompletion(final MediaPlayer mp2) {
            FensterVideoView.this.setKeepScreenOn(false);
            FensterVideoView.this.f39270b = 5;
            FensterVideoView.this.f39271c = 5;
            FensterVideoView.this.O();
            if (FensterVideoView.this.f39280l != null) {
                FensterVideoView.this.f39280l.onCompletion(FensterVideoView.this.f39277i);
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class i implements MediaPlayer.OnInfoListener {
        public i() {
        }

        @Override // android.media.MediaPlayer.OnInfoListener
        public boolean onInfo(final MediaPlayer mp2, final int arg1, final int arg2) {
            if (FensterVideoView.this.f39284p == null) {
                return true;
            }
            FensterVideoView.this.f39284p.onInfo(mp2, arg1, arg2);
            return true;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class j implements MediaPlayer.OnErrorListener {
        public j() {
        }

        @Override // android.media.MediaPlayer.OnErrorListener
        public boolean onError(final MediaPlayer mp2, final int frameworkError, final int implError) {
            Log.d(FensterVideoView.F, "Error: " + frameworkError + "," + implError);
            if (FensterVideoView.this.f39270b == -1) {
                return true;
            }
            FensterVideoView.this.f39270b = -1;
            FensterVideoView.this.f39271c = -1;
            FensterVideoView.this.O();
            if (FensterVideoView.this.I(frameworkError) || FensterVideoView.this.H(frameworkError, implError)) {
                return true;
            }
            FensterVideoView.this.M(frameworkError);
            return true;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class k implements DialogInterface.OnClickListener {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ MediaPlayer.OnCompletionListener f39305a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ MediaPlayer f39306b;

        public k(final MediaPlayer.OnCompletionListener val$completionListener, final MediaPlayer val$mediaPlayer) {
            this.f39305a = val$completionListener;
            this.f39306b = val$mediaPlayer;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(final DialogInterface dialog, final int whichButton) {
            MediaPlayer.OnCompletionListener onCompletionListener = this.f39305a;
            if (onCompletionListener != null) {
                onCompletionListener.onCompletion(this.f39306b);
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class l implements MediaPlayer.OnBufferingUpdateListener {
        public l() {
        }

        @Override // android.media.MediaPlayer.OnBufferingUpdateListener
        public void onBufferingUpdate(final MediaPlayer mp2, final int percent) {
            FensterVideoView.this.f39282n = percent;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public interface m {
        void a();
    }

    public FensterVideoView(final Context context, final AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public static AlertDialog K(final Context context, final MediaPlayer.OnCompletionListener completionListener, final MediaPlayer mediaPlayer, final int errorMessage) {
        return new AlertDialog.Builder(context).setMessage(errorMessage).setPositiveButton(R.string.ok, new k(completionListener, mediaPlayer)).setCancelable(false).create();
    }

    public static int L(final int frameworkError) {
        int i11 = com.malmstein.fenster.R.string.play_error_message;
        if (frameworkError == -1004) {
            Log.e(F, "TextureVideoView error. File or network related operation errors.");
            return i11;
        }
        if (frameworkError == -1007) {
            Log.e(F, "TextureVideoView error. Bitstream is not conforming to the related coding standard or file spec.");
            return i11;
        }
        if (frameworkError == 100) {
            Log.e(F, "TextureVideoView error. Media server died. In this case, the application must release the MediaPlayer object and instantiate a new one.");
            return i11;
        }
        if (frameworkError == -110) {
            Log.e(F, "TextureVideoView error. Some operation takes too long to complete, usually more than 3-5 seconds.");
            return i11;
        }
        if (frameworkError == 1) {
            Log.e(F, "TextureVideoView error. Unspecified media player error.");
            return i11;
        }
        if (frameworkError == -1010) {
            Log.e(F, "TextureVideoView error. Bitstream is conforming to the related coding standard or file spec, but the media framework does not support the feature.");
            return i11;
        }
        if (frameworkError != 200) {
            return i11;
        }
        Log.e(F, "TextureVideoView error. The video is streamed and its container is not valid for progressive playback i.e the video's index (e.g moov atom) is not at the start of the file.");
        return com.malmstein.fenster.R.string.play_progressive_error_message;
    }

    private void setOnInfoListener(final MediaPlayer.OnInfoListener l11) {
        this.f39284p = l11;
    }

    public final boolean H(final int frameworkError, final int implError) {
        MediaPlayer.OnErrorListener onErrorListener = this.f39283o;
        if (onErrorListener != null) {
            return onErrorListener.onError(this.f39277i, frameworkError, implError);
        }
        return false;
    }

    public final boolean I(final int frameworkError) {
        if (frameworkError != 1 && frameworkError != -1004) {
            return false;
        }
        Log.e(F, "TextureVideoView error. File or network related operation errors.");
        if (N()) {
            return this.f39289u.d(this.f39277i.getCurrentPosition() / 1000);
        }
        return false;
    }

    public final void J() {
        ls.a aVar;
        if (this.f39277i == null || (aVar = this.f39279k) == null) {
            return;
        }
        aVar.setMediaPlayer(this);
        this.f39279k.setEnabled(Q());
    }

    public final void M(final int frameworkError) {
        if (getWindowToken() != null) {
            AlertDialog alertDialog = this.f39290v;
            if (alertDialog != null && alertDialog.isShowing()) {
                Log.d(F, "Dismissing last error dialog for a new one");
                this.f39290v.dismiss();
            }
            AlertDialog K2 = K(getContext(), this.f39280l, this.f39277i, L(frameworkError));
            this.f39290v = K2;
            K2.show();
        }
    }

    public final boolean N() {
        return this.f39289u != null;
    }

    public final void O() {
        ls.a aVar = this.f39279k;
        if (aVar != null) {
            aVar.hide();
        }
    }

    public final void P() {
        this.f39269a.e(0, 0);
        setSurfaceTextureListener(this.D);
        setFocusable(true);
        setFocusableInTouchMode(true);
        requestFocus();
        this.f39270b = 0;
        this.f39271c = 0;
        setOnInfoListener(this.E);
    }

    public final boolean Q() {
        int i11;
        return (this.f39277i == null || (i11 = this.f39270b) == -1 || i11 == 0 || i11 == 1) ? false : true;
    }

    public final boolean R() {
        return !N();
    }

    public final boolean S() {
        return this.f39272d == null || this.f39274f == null;
    }

    public final void T(final Exception ex2) {
        Log.w("FensterVideoView", "Unable to open content: " + this.f39272d, ex2);
        this.f39270b = -1;
        this.f39271c = -1;
        this.B.onError(this.f39277i, 1, 0);
    }

    public final void U() {
        if (S()) {
            return;
        }
        h0();
        W(false);
        ((AudioManager) getContext().getSystemService("audio")).requestAudioFocus(null, 3, 1);
        try {
            ps.a a11 = ps.c.a();
            this.f39277i = a11;
            int i11 = this.f39278j;
            if (i11 != 0) {
                a11.setAudioSessionId(i11);
            } else {
                this.f39278j = a11.getAudioSessionId();
            }
            this.f39277i.setOnPreparedListener(this.f39293y);
            this.f39277i.setOnVideoSizeChangedListener(this.f39292x);
            this.f39277i.setOnCompletionListener(this.f39294z);
            this.f39277i.setOnErrorListener(this.B);
            this.f39277i.setOnInfoListener(this.A);
            this.f39277i.setOnBufferingUpdateListener(this.C);
            this.f39282n = 0;
            this.f39277i.setDataSource(getContext(), this.f39272d, this.f39273e);
            this.f39277i.setSurface(new Surface(this.f39274f));
            this.f39277i.setAudioStreamType(3);
            this.f39277i.setScreenOnWhilePlaying(true);
            this.f39277i.prepareAsync();
            this.f39270b = 1;
            J();
        } catch (IOException e11) {
            T(e11);
        } catch (IllegalArgumentException e12) {
            T(e12);
        } catch (IllegalStateException e13) {
            T(e13);
        }
    }

    public final boolean V(final int seekToPosition) {
        if (isPlaying()) {
            return false;
        }
        return seekToPosition != 0 || getCurrentPosition() > 0;
    }

    public final void W(final boolean clearTargetState) {
        ps.a aVar = this.f39277i;
        if (aVar != null) {
            aVar.reset();
            this.f39277i.release();
            this.f39277i = null;
            this.f39270b = 0;
            if (clearTargetState) {
                this.f39271c = 0;
            }
        }
    }

    public int X(final int desiredSize, final int measureSpec) {
        return View.getDefaultSize(desiredSize, measureSpec);
    }

    public void Y() {
        U();
    }

    public void Z(final int seconds) {
        seekTo(seconds * 1000);
        this.f39277i.setOnSeekCompleteListener(new b());
    }

    public void a0(final Uri uri, final int seekInSeconds) {
        c0(uri, null, seekInSeconds);
    }

    public void b0(final String url, final int seekInSeconds) {
        c0(Uri.parse(url), null, seekInSeconds);
    }

    public final void c0(final Uri uri, final Map<String, String> headers, final int seekInSeconds) {
        Log.d(F, "start playing: " + uri);
        this.f39272d = uri;
        this.f39273e = headers;
        this.f39285q = seekInSeconds * 1000;
        U();
        requestLayout();
        invalidate();
    }

    @Override // android.widget.MediaController.MediaPlayerControl, os.a
    public boolean canPause() {
        return this.f39286r;
    }

    @Override // android.widget.MediaController.MediaPlayerControl, os.a
    public boolean canSeekBackward() {
        return this.f39287s;
    }

    @Override // android.widget.MediaController.MediaPlayerControl, os.a
    public boolean canSeekForward() {
        return this.f39288t;
    }

    public final void d0() {
        ls.a aVar = this.f39279k;
        if (aVar != null) {
            aVar.show();
        }
    }

    public final void e0() {
        ls.a aVar = this.f39279k;
        if (aVar != null) {
            aVar.show(0);
        }
    }

    public void f0() {
        ps.a aVar = this.f39277i;
        if (aVar != null) {
            new Thread(new e(aVar)).start();
            this.f39277i = null;
            setKeepScreenOn(false);
            this.f39270b = 0;
            this.f39271c = 0;
            this.f39272d = null;
        }
    }

    public void g0() {
        W(false);
    }

    @Override // android.widget.MediaController.MediaPlayerControl, os.a
    public int getAudioSessionId() {
        if (this.f39278j == 0) {
            MediaPlayer mediaPlayer = new MediaPlayer();
            this.f39278j = mediaPlayer.getAudioSessionId();
            mediaPlayer.release();
        }
        return this.f39278j;
    }

    @Override // android.widget.MediaController.MediaPlayerControl, os.a
    public int getBufferPercentage() {
        if (this.f39277i != null) {
            return this.f39282n;
        }
        return 0;
    }

    @Override // android.widget.MediaController.MediaPlayerControl, os.a
    public int getCurrentPosition() {
        if (Q()) {
            return this.f39277i.getCurrentPosition();
        }
        return 0;
    }

    public int getCurrentPositionInSeconds() {
        return getCurrentPosition() / 1000;
    }

    public String getCurrentStream() {
        return this.f39272d.toString();
    }

    @Override // android.widget.MediaController.MediaPlayerControl, os.a
    public int getDuration() {
        if (Q()) {
            return this.f39277i.getDuration();
        }
        return -1;
    }

    public final void h0() {
        Intent intent = new Intent("com.android.music.musicservicecommand");
        intent.putExtra(IntentConstant.COMMAND, ma.b.L);
        getContext().sendBroadcast(intent);
    }

    @Override // android.widget.MediaController.MediaPlayerControl, os.a
    public boolean isPlaying() {
        return Q() && this.f39277i.isPlaying();
    }

    @Override // android.view.View
    public void onInitializeAccessibilityEvent(final AccessibilityEvent event) {
        super.onInitializeAccessibilityEvent(event);
        event.setClassName(FensterVideoView.class.getName());
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(final AccessibilityNodeInfo info) {
        super.onInitializeAccessibilityNodeInfo(info);
        info.setClassName(FensterVideoView.class.getName());
    }

    @Override // android.view.View, android.view.KeyEvent.Callback
    public boolean onKeyDown(final int keyCode, final KeyEvent event) {
        ls.a aVar;
        boolean z11 = (keyCode == 4 || keyCode == 24 || keyCode == 25 || keyCode == 164 || keyCode == 82 || keyCode == 5 || keyCode == 6) ? false : true;
        if (Q() && z11 && (aVar = this.f39279k) != null) {
            if (keyCode == 79 || keyCode == 85) {
                if (this.f39277i.isPlaying()) {
                    pause();
                    d0();
                } else {
                    start();
                    O();
                }
                return true;
            }
            if (keyCode == 126) {
                if (!this.f39277i.isPlaying()) {
                    start();
                    O();
                }
                return true;
            }
            if (keyCode == 86 || keyCode == 127) {
                if (this.f39277i.isPlaying()) {
                    pause();
                    d0();
                }
                return true;
            }
            aVar.show();
        }
        return super.onKeyDown(keyCode, event);
    }

    @Override // android.view.View
    public void onMeasure(final int widthMeasureSpec, final int heightMeasureSpec) {
        a.C0471a c11 = this.f39269a.c(widthMeasureSpec, heightMeasureSpec);
        setMeasuredDimension(c11.b(), c11.a());
    }

    @Override // android.view.View
    public boolean onTrackballEvent(final MotionEvent ev2) {
        ls.a aVar;
        if (!Q() || (aVar = this.f39279k) == null) {
            return false;
        }
        aVar.show();
        return false;
    }

    @Override // android.widget.MediaController.MediaPlayerControl, os.a
    public void pause() {
        if (Q() && this.f39277i.isPlaying()) {
            this.f39277i.pause();
            this.f39270b = 4;
            setKeepScreenOn(false);
        }
        this.f39271c = 4;
    }

    @Override // android.widget.MediaController.MediaPlayerControl, os.a
    public void seekTo(final int millis) {
        if (!Q()) {
            this.f39285q = millis;
        } else {
            this.f39277i.seekTo(millis);
            this.f39285q = 0;
        }
    }

    public void setIsolateMediaSuface(boolean isolateMediaSuface) {
        this.f39291w = isolateMediaSuface;
    }

    public void setMediaController(final ls.a controller) {
        O();
        this.f39279k = controller;
        J();
    }

    public void setOnCompletionListener(final MediaPlayer.OnCompletionListener l11) {
        this.f39280l = l11;
    }

    public void setOnErrorListener(final MediaPlayer.OnErrorListener l11) {
        this.f39283o = l11;
    }

    public void setOnPlayStateListener(final os.c onPlayStateListener) {
        this.f39289u = onPlayStateListener;
    }

    public void setOnPreparedListener(final MediaPlayer.OnPreparedListener l11) {
        this.f39281m = l11;
    }

    public void setStretchVideo(boolean stretch) {
        this.f39269a.d(stretch);
    }

    public void setVideoFromBeginning(final String path) {
        a0(Uri.parse(path), 0);
    }

    @Override // android.widget.MediaController.MediaPlayerControl, os.a
    public void start() {
        if (Q()) {
            this.f39277i.start();
            this.f39277i.a(this.f39275g, this.f39276h);
            setKeepScreenOn(true);
            this.f39270b = 3;
        }
        this.f39271c = 3;
    }

    public FensterVideoView(final Context context, final AttributeSet attrs, final int defStyle) {
        super(context, attrs, defStyle);
        this.f39270b = 0;
        this.f39271c = 0;
        this.f39277i = null;
        this.f39291w = false;
        this.f39292x = new f();
        this.f39293y = new g();
        this.f39294z = new h();
        this.A = new i();
        this.B = new j();
        this.C = new l();
        this.D = new a();
        this.E = new c();
        this.f39269a = new com.malmstein.fenster.view.a();
        P();
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class d implements m {
        @Override // com.malmstein.fenster.view.FensterVideoView.m
        public void a() {
        }
    }
}
