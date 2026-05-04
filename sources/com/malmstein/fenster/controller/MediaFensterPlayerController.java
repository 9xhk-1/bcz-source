package com.malmstein.fenster.controller;

import android.content.Context;
import android.os.Handler;
import android.os.Message;
import android.util.AttributeSet;
import android.util.Log;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.ImageButton;
import android.widget.RelativeLayout;
import android.widget.SeekBar;
import android.widget.TextView;
import com.malmstein.fenster.R;
import com.malmstein.fenster.gestures.FensterGestureControllerView;
import com.malmstein.fenster.seekbar.BrightnessSeekBar;
import com.malmstein.fenster.seekbar.VolumeSeekBar;
import java.util.Formatter;
import java.util.Locale;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public final class MediaFensterPlayerController extends RelativeLayout implements ls.a, ms.a, VolumeSeekBar.c, BrightnessSeekBar.b {
    public static final int A = 100;
    public static final int B = 5000;
    public static final int C = 1;
    public static final int D = 2;

    /* renamed from: w, reason: collision with root package name */
    public static final String f39132w = "PlayerController";

    /* renamed from: x, reason: collision with root package name */
    public static final int f39133x = 0;

    /* renamed from: y, reason: collision with root package name */
    public static final int f39134y = 1;

    /* renamed from: z, reason: collision with root package name */
    public static final int f39135z = 1000;

    /* renamed from: a, reason: collision with root package name */
    public final View.OnClickListener f39136a;

    /* renamed from: b, reason: collision with root package name */
    public ls.b f39137b;

    /* renamed from: c, reason: collision with root package name */
    public os.a f39138c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f39139d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f39140e;

    /* renamed from: f, reason: collision with root package name */
    public final Handler f39141f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f39142g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f39143h;

    /* renamed from: i, reason: collision with root package name */
    public StringBuilder f39144i;

    /* renamed from: j, reason: collision with root package name */
    public Formatter f39145j;

    /* renamed from: k, reason: collision with root package name */
    public FensterGestureControllerView f39146k;

    /* renamed from: l, reason: collision with root package name */
    public View f39147l;

    /* renamed from: m, reason: collision with root package name */
    public SeekBar f39148m;

    /* renamed from: n, reason: collision with root package name */
    public BrightnessSeekBar f39149n;

    /* renamed from: o, reason: collision with root package name */
    public VolumeSeekBar f39150o;

    /* renamed from: p, reason: collision with root package name */
    public TextView f39151p;

    /* renamed from: q, reason: collision with root package name */
    public TextView f39152q;

    /* renamed from: r, reason: collision with root package name */
    public final SeekBar.OnSeekBarChangeListener f39153r;

    /* renamed from: s, reason: collision with root package name */
    public ImageButton f39154s;

    /* renamed from: t, reason: collision with root package name */
    public ImageButton f39155t;

    /* renamed from: u, reason: collision with root package name */
    public ImageButton f39156u;

    /* renamed from: v, reason: collision with root package name */
    public int f39157v;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class a implements View.OnClickListener {
        public a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(final View v11) {
            MediaFensterPlayerController.this.x();
            MediaFensterPlayerController.this.show(5000);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class b extends Handler {
        public b() {
        }

        @Override // android.os.Handler
        public void handleMessage(final Message msg) {
            int i11 = msg.what;
            if (i11 == 1) {
                if (MediaFensterPlayerController.this.f39138c.isPlaying()) {
                    MediaFensterPlayerController.this.hide();
                    return;
                }
                Message obtainMessage = obtainMessage(1);
                removeMessages(1);
                sendMessageDelayed(obtainMessage, 5000L);
                return;
            }
            if (i11 != 2) {
                return;
            }
            int F = MediaFensterPlayerController.this.F();
            if (!MediaFensterPlayerController.this.f39140e && MediaFensterPlayerController.this.f39139d && MediaFensterPlayerController.this.f39138c.isPlaying()) {
                sendMessageDelayed(obtainMessage(2), 1000 - (F % 1000));
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class c implements SeekBar.OnSeekBarChangeListener {
        public c() {
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onProgressChanged(final SeekBar bar, final int progress, final boolean fromuser) {
            if (fromuser || MediaFensterPlayerController.this.f39142g) {
                int duration = (int) ((MediaFensterPlayerController.this.f39138c.getDuration() * progress) / 1000);
                MediaFensterPlayerController.this.f39138c.seekTo(duration);
                if (MediaFensterPlayerController.this.f39152q != null) {
                    MediaFensterPlayerController.this.f39152q.setText(MediaFensterPlayerController.this.J(duration));
                }
            }
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onStartTrackingTouch(final SeekBar bar) {
            MediaFensterPlayerController.this.show(3600000);
            MediaFensterPlayerController.this.f39140e = true;
            MediaFensterPlayerController.this.f39141f.removeMessages(2);
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onStopTrackingTouch(final SeekBar bar) {
            MediaFensterPlayerController.this.f39140e = false;
            MediaFensterPlayerController.this.F();
            MediaFensterPlayerController.this.L();
            MediaFensterPlayerController.this.show(5000);
            MediaFensterPlayerController.this.f39141f.sendEmptyMessage(2);
        }
    }

    public MediaFensterPlayerController(final Context context) {
        this(context, null);
    }

    private void C() {
        this.f39147l = findViewById(R.id.media_controller_bottom_root);
        FensterGestureControllerView fensterGestureControllerView = (FensterGestureControllerView) findViewById(R.id.media_controller_gestures_area);
        this.f39146k = fensterGestureControllerView;
        fensterGestureControllerView.setFensterEventsListener(this);
        ImageButton imageButton = (ImageButton) findViewById(R.id.media_controller_pause);
        this.f39154s = imageButton;
        imageButton.requestFocus();
        this.f39154s.setOnClickListener(this.f39136a);
        this.f39155t = (ImageButton) findViewById(R.id.media_controller_next);
        this.f39156u = (ImageButton) findViewById(R.id.media_controller_previous);
        SeekBar seekBar = (SeekBar) findViewById(R.id.media_controller_progress);
        this.f39148m = seekBar;
        seekBar.setOnSeekBarChangeListener(this.f39153r);
        this.f39148m.setMax(1000);
        VolumeSeekBar volumeSeekBar = (VolumeSeekBar) findViewById(R.id.media_controller_volume);
        this.f39150o = volumeSeekBar;
        volumeSeekBar.d(this);
        BrightnessSeekBar brightnessSeekBar = (BrightnessSeekBar) findViewById(R.id.media_controller_brightness);
        this.f39149n = brightnessSeekBar;
        brightnessSeekBar.b(this);
        this.f39151p = (TextView) findViewById(R.id.media_controller_time);
        this.f39152q = (TextView) findViewById(R.id.media_controller_time_current);
        this.f39144i = new StringBuilder();
        this.f39145j = new Formatter(this.f39144i, Locale.getDefault());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int F() {
        os.a aVar = this.f39138c;
        if (aVar == null || this.f39140e) {
            return 0;
        }
        int currentPosition = aVar.getCurrentPosition();
        int duration = this.f39138c.getDuration();
        SeekBar seekBar = this.f39148m;
        if (seekBar != null) {
            if (duration > 0) {
                seekBar.setProgress((int) ((currentPosition * 1000) / duration));
            }
            this.f39148m.setSecondaryProgress(this.f39138c.getBufferPercentage() * 10);
        }
        TextView textView = this.f39151p;
        if (textView != null) {
            textView.setText(J(duration));
        }
        TextView textView2 = this.f39152q;
        if (textView2 != null) {
            textView2.setText(J(currentPosition));
        }
        int i11 = currentPosition / 1000;
        if (this.f39157v != i11) {
            this.f39157v = i11;
        }
        return currentPosition;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String J(final int timeMs) {
        int i11 = timeMs / 1000;
        int i12 = i11 % 60;
        int i13 = (i11 / 60) % 60;
        int i14 = i11 / 3600;
        this.f39144i.setLength(0);
        return i14 > 0 ? this.f39145j.format("%d:%02d:%02d", Integer.valueOf(i14), Integer.valueOf(i13), Integer.valueOf(i12)).toString() : this.f39145j.format("%02d:%02d", Integer.valueOf(i13), Integer.valueOf(i12)).toString();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void L() {
        if (this.f39154s == null) {
            return;
        }
        if (this.f39138c.isPlaying()) {
            this.f39154s.setImageResource(android.R.drawable.ic_media_pause);
        } else {
            this.f39154s.setImageResource(android.R.drawable.ic_media_play);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void x() {
        if (this.f39138c.isPlaying()) {
            this.f39138c.pause();
        } else {
            this.f39138c.start();
        }
        L();
    }

    public final int A(float deltaY, SeekBar seekbar) {
        return y(getHeight(), deltaY, seekbar);
    }

    public final int B() {
        return this.f39148m.getProgress() + 100;
    }

    public boolean D() {
        return this.f39143h;
    }

    public boolean E() {
        return this.f39139d;
    }

    public final void G() {
        this.f39147l.setVisibility(0);
    }

    public final void H() {
        this.f39153r.onProgressChanged(this.f39148m, w(), true);
    }

    public final void I() {
        this.f39153r.onProgressChanged(this.f39148m, B(), true);
    }

    public final void K(float delta) {
        this.f39149n.c((int) delta);
    }

    public final void M(float delta) {
        SeekBar.OnSeekBarChangeListener onSeekBarChangeListener = this.f39153r;
        SeekBar seekBar = this.f39148m;
        onSeekBarChangeListener.onProgressChanged(seekBar, z(delta, seekBar), true);
    }

    public final void N(float delta) {
        VolumeSeekBar volumeSeekBar = this.f39150o;
        volumeSeekBar.e(A(delta, volumeSeekBar));
    }

    @Override // com.malmstein.fenster.seekbar.BrightnessSeekBar.b
    public void a() {
        this.f39140e = true;
    }

    @Override // com.malmstein.fenster.seekbar.BrightnessSeekBar.b
    public void b() {
        this.f39140e = false;
    }

    @Override // com.malmstein.fenster.seekbar.VolumeSeekBar.c
    public void d() {
        this.f39140e = true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchKeyEvent(final KeyEvent event) {
        int keyCode = event.getKeyCode();
        boolean z11 = event.getRepeatCount() == 0 && event.getAction() == 0;
        if (keyCode == 79 || keyCode == 85 || keyCode == 62) {
            if (z11) {
                x();
                show(5000);
                ImageButton imageButton = this.f39154s;
                if (imageButton != null) {
                    imageButton.requestFocus();
                }
            }
            return true;
        }
        if (keyCode == 126) {
            if (z11 && !this.f39138c.isPlaying()) {
                this.f39138c.start();
                L();
                show(5000);
            }
            return true;
        }
        if (keyCode == 86 || keyCode == 127) {
            if (z11 && this.f39138c.isPlaying()) {
                this.f39138c.pause();
                L();
                show(5000);
            }
            return true;
        }
        if (keyCode == 25 || keyCode == 24 || keyCode == 164 || keyCode == 27) {
            return super.dispatchKeyEvent(event);
        }
        if (keyCode != 4 && keyCode != 82) {
            show(5000);
            return super.dispatchKeyEvent(event);
        }
        if (z11) {
            hide();
        }
        return true;
    }

    @Override // ms.a
    public void e(MotionEvent event, float delta) {
        if (event.getPointerCount() == 1) {
            M(delta);
        } else if (delta > 0.0f) {
            I();
        } else {
            H();
        }
    }

    @Override // ms.a
    public void f(MotionEvent event, float delta) {
        if (event.getPointerCount() == 1) {
            N(-delta);
        } else {
            K(-delta);
        }
    }

    @Override // com.malmstein.fenster.seekbar.VolumeSeekBar.c
    public void h() {
        this.f39140e = false;
    }

    @Override // ls.a
    public void hide() {
        if (this.f39140e) {
            return;
        }
        if (this.f39139d) {
            try {
                this.f39141f.removeMessages(2);
                setVisibility(4);
            } catch (IllegalArgumentException unused) {
                Log.w("MediaController", "already removed");
            }
            this.f39139d = false;
        }
        ls.b bVar = this.f39137b;
        if (bVar != null) {
            bVar.a(false);
        }
    }

    @Override // ms.a
    public void i() {
        Log.i("PlayerController", "Single Tap Up");
    }

    @Override // ms.a
    public void j() {
        H();
    }

    @Override // ms.a
    public void k() {
        I();
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        LayoutInflater.from(getContext()).inflate(R.layout.view_media_controller, this);
        C();
    }

    @Override // android.view.View
    public void onInitializeAccessibilityEvent(final AccessibilityEvent event) {
        super.onInitializeAccessibilityEvent(event);
        event.setClassName(MediaFensterPlayerController.class.getName());
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(final AccessibilityNodeInfo info) {
        super.onInitializeAccessibilityNodeInfo(info);
        info.setClassName(MediaFensterPlayerController.class.getName());
    }

    @Override // android.view.View
    public boolean onTrackballEvent(final MotionEvent ev2) {
        show(5000);
        return false;
    }

    @Override // android.view.View, ls.a
    public void setEnabled(final boolean enabled) {
        ImageButton imageButton = this.f39154s;
        if (imageButton != null) {
            imageButton.setEnabled(enabled);
        }
        ImageButton imageButton2 = this.f39155t;
        if (imageButton2 != null) {
            imageButton2.setEnabled(enabled);
        }
        ImageButton imageButton3 = this.f39156u;
        if (imageButton3 != null) {
            imageButton3.setEnabled(enabled);
        }
        SeekBar seekBar = this.f39148m;
        if (seekBar != null) {
            seekBar.setEnabled(enabled);
        }
        VolumeSeekBar volumeSeekBar = this.f39150o;
        if (volumeSeekBar != null) {
            volumeSeekBar.setEnabled(enabled);
        }
        BrightnessSeekBar brightnessSeekBar = this.f39149n;
        if (brightnessSeekBar != null) {
            brightnessSeekBar.setEnabled(enabled);
        }
        super.setEnabled(enabled);
    }

    @Override // ls.a
    public void setMediaPlayer(final os.a fensterPlayer) {
        this.f39138c = fensterPlayer;
        L();
    }

    @Override // ls.a
    public void setVisibilityListener(final ls.b visibilityListener) {
        this.f39137b = visibilityListener;
    }

    @Override // ls.a
    public void show() {
        show(5000);
    }

    public final int w() {
        return this.f39148m.getProgress() - 100;
    }

    public final int y(int availableSpace, float deltaX, SeekBar seekbar) {
        int i11 = (int) deltaX;
        float progress = seekbar.getProgress();
        return (int) (i11 < 0 ? progress - ((i11 / (r4 - availableSpace)) * progress) : progress + ((i11 / availableSpace) * seekbar.getMax()));
    }

    public final int z(float deltaX, SeekBar seekbar) {
        return y(getWidth(), deltaX, seekbar);
    }

    public MediaFensterPlayerController(final Context context, final AttributeSet attrs) {
        this(context, attrs, 0);
    }

    @Override // ls.a
    public void show(final int timeInMilliSeconds) {
        if (!this.f39139d) {
            G();
            F();
            ImageButton imageButton = this.f39154s;
            if (imageButton != null) {
                imageButton.requestFocus();
            }
            this.f39139d = true;
            setVisibility(0);
        }
        L();
        this.f39141f.sendEmptyMessage(2);
        Message obtainMessage = this.f39141f.obtainMessage(1);
        if (timeInMilliSeconds != 0) {
            this.f39141f.removeMessages(1);
            this.f39141f.sendMessageDelayed(obtainMessage, timeInMilliSeconds);
        }
        ls.b bVar = this.f39137b;
        if (bVar != null) {
            bVar.a(true);
        }
    }

    public MediaFensterPlayerController(final Context context, final AttributeSet attrs, final int defStyle) {
        super(context, attrs, defStyle);
        this.f39136a = new a();
        this.f39141f = new b();
        this.f39143h = true;
        this.f39153r = new c();
        this.f39157v = -1;
    }

    @Override // ms.a
    public void c() {
    }

    @Override // ms.a
    public void g() {
    }
}
