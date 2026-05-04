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
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.ProgressBar;
import android.widget.SeekBar;
import android.widget.TextView;
import com.malmstein.fenster.R;
import com.malmstein.fenster.view.FensterTouchRoot;
import java.util.Formatter;
import java.util.Locale;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public final class SimpleMediaFensterPlayerController extends FrameLayout implements ls.a, os.c, FensterTouchRoot.a {

    /* renamed from: v, reason: collision with root package name */
    public static final String f39161v = "PlayerController";

    /* renamed from: w, reason: collision with root package name */
    public static final int f39162w = 0;

    /* renamed from: x, reason: collision with root package name */
    public static final int f39163x = 5000;

    /* renamed from: y, reason: collision with root package name */
    public static final int f39164y = 1;

    /* renamed from: z, reason: collision with root package name */
    public static final int f39165z = 2;

    /* renamed from: a, reason: collision with root package name */
    public ls.b f39166a;

    /* renamed from: b, reason: collision with root package name */
    public os.a f39167b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f39168c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f39169d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f39170e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f39171f;

    /* renamed from: g, reason: collision with root package name */
    public StringBuilder f39172g;

    /* renamed from: h, reason: collision with root package name */
    public Formatter f39173h;

    /* renamed from: i, reason: collision with root package name */
    public View f39174i;

    /* renamed from: j, reason: collision with root package name */
    public View f39175j;

    /* renamed from: k, reason: collision with root package name */
    public ProgressBar f39176k;

    /* renamed from: l, reason: collision with root package name */
    public TextView f39177l;

    /* renamed from: m, reason: collision with root package name */
    public TextView f39178m;

    /* renamed from: n, reason: collision with root package name */
    public ImageButton f39179n;

    /* renamed from: o, reason: collision with root package name */
    public ImageButton f39180o;

    /* renamed from: p, reason: collision with root package name */
    public ImageButton f39181p;

    /* renamed from: q, reason: collision with root package name */
    public ProgressBar f39182q;

    /* renamed from: r, reason: collision with root package name */
    public int f39183r;

    /* renamed from: s, reason: collision with root package name */
    public final SeekBar.OnSeekBarChangeListener f39184s;

    /* renamed from: t, reason: collision with root package name */
    public final Handler f39185t;

    /* renamed from: u, reason: collision with root package name */
    public final View.OnClickListener f39186u;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class a implements SeekBar.OnSeekBarChangeListener {
        public a() {
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onProgressChanged(final SeekBar bar, final int progress, final boolean fromuser) {
            if (fromuser) {
                int duration = (int) ((SimpleMediaFensterPlayerController.this.f39167b.getDuration() * progress) / 1000);
                SimpleMediaFensterPlayerController.this.f39167b.seekTo(duration);
                if (SimpleMediaFensterPlayerController.this.f39178m != null) {
                    SimpleMediaFensterPlayerController.this.f39178m.setText(SimpleMediaFensterPlayerController.this.x(duration));
                }
            }
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onStartTrackingTouch(final SeekBar bar) {
            SimpleMediaFensterPlayerController.this.show(3600000);
            SimpleMediaFensterPlayerController.this.f39169d = true;
            SimpleMediaFensterPlayerController.this.f39185t.removeMessages(2);
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onStopTrackingTouch(final SeekBar bar) {
            SimpleMediaFensterPlayerController.this.f39169d = false;
            SimpleMediaFensterPlayerController.this.v();
            SimpleMediaFensterPlayerController.this.y();
            SimpleMediaFensterPlayerController.this.show(5000);
            SimpleMediaFensterPlayerController.this.f39185t.sendEmptyMessage(2);
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
                if (SimpleMediaFensterPlayerController.this.f39167b.isPlaying()) {
                    SimpleMediaFensterPlayerController.this.hide();
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
            int v11 = SimpleMediaFensterPlayerController.this.v();
            if (!SimpleMediaFensterPlayerController.this.f39169d && SimpleMediaFensterPlayerController.this.f39168c && SimpleMediaFensterPlayerController.this.f39167b.isPlaying()) {
                sendMessageDelayed(obtainMessage(2), 1000 - (v11 % 1000));
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class c implements View.OnClickListener {
        public c() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(final View v11) {
            SimpleMediaFensterPlayerController.this.p();
            SimpleMediaFensterPlayerController.this.show(5000);
        }
    }

    public SimpleMediaFensterPlayerController(final Context context) {
        this(context, null);
    }

    @Override // os.c
    public void a() {
        q();
    }

    @Override // com.malmstein.fenster.view.FensterTouchRoot.a
    public void b() {
        if (this.f39168c) {
            Log.d("PlayerController", "controller ui touch received!");
            show();
        }
    }

    @Override // os.c
    public void c() {
        w();
    }

    @Override // os.c
    public boolean d(int position) {
        return false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchKeyEvent(final KeyEvent event) {
        int keyCode = event.getKeyCode();
        boolean z11 = event.getRepeatCount() == 0 && event.getAction() == 0;
        if (keyCode == 79 || keyCode == 85 || keyCode == 62) {
            if (z11) {
                p();
                show(5000);
                ImageButton imageButton = this.f39179n;
                if (imageButton != null) {
                    imageButton.requestFocus();
                }
            }
            return true;
        }
        if (keyCode == 126) {
            if (z11 && !this.f39167b.isPlaying()) {
                this.f39167b.start();
                y();
                show(5000);
            }
            return true;
        }
        if (keyCode == 86 || keyCode == 127) {
            if (z11 && this.f39167b.isPlaying()) {
                this.f39167b.pause();
                y();
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

    @Override // os.c
    public void e() {
        this.f39175j.setVisibility(0);
        this.f39174i.setVisibility(0);
        this.f39171f = false;
    }

    @Override // ls.a
    public void hide() {
        if (this.f39168c) {
            try {
                this.f39185t.removeMessages(2);
                setVisibility(4);
            } catch (IllegalArgumentException unused) {
                Log.w("MediaController", "already removed");
            }
            this.f39168c = false;
        }
        ls.b bVar = this.f39166a;
        if (bVar != null) {
            bVar.a(false);
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        LayoutInflater.from(getContext()).inflate(R.layout.view_simple_media_controller, this);
        r();
    }

    @Override // android.view.View
    public void onInitializeAccessibilityEvent(final AccessibilityEvent event) {
        super.onInitializeAccessibilityEvent(event);
        event.setClassName(SimpleMediaFensterPlayerController.class.getName());
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(final AccessibilityNodeInfo info) {
        super.onInitializeAccessibilityNodeInfo(info);
        info.setClassName(SimpleMediaFensterPlayerController.class.getName());
    }

    @Override // android.view.View
    public boolean onTrackballEvent(final MotionEvent ev2) {
        show(5000);
        return false;
    }

    public final void p() {
        if (this.f39167b.isPlaying()) {
            this.f39167b.pause();
        } else {
            this.f39167b.start();
        }
        y();
    }

    public final void q() {
        hide();
        this.f39182q.setVisibility(8);
        this.f39170e = false;
    }

    public final void r() {
        ImageButton imageButton = (ImageButton) findViewById(R.id.media_controller_pause);
        this.f39179n = imageButton;
        imageButton.requestFocus();
        this.f39179n.setOnClickListener(this.f39186u);
        this.f39180o = (ImageButton) findViewById(R.id.media_controller_next);
        this.f39181p = (ImageButton) findViewById(R.id.media_controller_previous);
        SeekBar seekBar = (SeekBar) findViewById(R.id.media_controller_progress);
        this.f39176k = seekBar;
        seekBar.setOnSeekBarChangeListener(this.f39184s);
        this.f39176k.setMax(1000);
        this.f39177l = (TextView) findViewById(R.id.media_controller_time);
        this.f39178m = (TextView) findViewById(R.id.media_controller_time_current);
        this.f39172g = new StringBuilder();
        this.f39173h = new Formatter(this.f39172g, Locale.getDefault());
        ((FensterTouchRoot) findViewById(R.id.media_controller_touch_root)).setOnTouchReceiver(this);
        View findViewById = findViewById(R.id.media_controller_bottom_area);
        this.f39174i = findViewById;
        findViewById.setVisibility(4);
        View findViewById2 = findViewById(R.id.media_controller_controls_root);
        this.f39175j = findViewById2;
        findViewById2.setVisibility(4);
        this.f39182q = (ProgressBar) findViewById(R.id.media_controller_loading_view);
    }

    public boolean s() {
        return this.f39171f;
    }

    @Override // android.view.View, ls.a
    public void setEnabled(final boolean enabled) {
        ImageButton imageButton = this.f39179n;
        if (imageButton != null) {
            imageButton.setEnabled(enabled);
        }
        ImageButton imageButton2 = this.f39180o;
        if (imageButton2 != null) {
            imageButton2.setEnabled(enabled);
        }
        ImageButton imageButton3 = this.f39181p;
        if (imageButton3 != null) {
            imageButton3.setEnabled(enabled);
        }
        ProgressBar progressBar = this.f39176k;
        if (progressBar != null) {
            progressBar.setEnabled(enabled);
        }
        super.setEnabled(enabled);
    }

    @Override // ls.a
    public void setMediaPlayer(final os.a fensterPlayer) {
        this.f39167b = fensterPlayer;
        y();
    }

    @Override // ls.a
    public void setVisibilityListener(final ls.b visibilityListener) {
        this.f39166a = visibilityListener;
    }

    @Override // ls.a
    public void show() {
        show(5000);
    }

    public boolean t() {
        return this.f39170e;
    }

    public boolean u() {
        return this.f39168c;
    }

    public final int v() {
        os.a aVar = this.f39167b;
        if (aVar == null || this.f39169d) {
            return 0;
        }
        int currentPosition = aVar.getCurrentPosition();
        int duration = this.f39167b.getDuration();
        ProgressBar progressBar = this.f39176k;
        if (progressBar != null) {
            if (duration > 0) {
                progressBar.setProgress((int) ((currentPosition * 1000) / duration));
            }
            this.f39176k.setSecondaryProgress(this.f39167b.getBufferPercentage() * 10);
        }
        TextView textView = this.f39177l;
        if (textView != null) {
            textView.setText(x(duration));
        }
        TextView textView2 = this.f39178m;
        if (textView2 != null) {
            textView2.setText(x(currentPosition));
        }
        int i11 = currentPosition / 1000;
        if (this.f39183r != i11) {
            this.f39183r = i11;
        }
        return currentPosition;
    }

    public final void w() {
        this.f39170e = true;
        this.f39182q.setVisibility(0);
    }

    public final String x(final int timeMs) {
        int i11 = timeMs / 1000;
        int i12 = i11 % 60;
        int i13 = (i11 / 60) % 60;
        int i14 = i11 / 3600;
        this.f39172g.setLength(0);
        return i14 > 0 ? this.f39173h.format("%d:%02d:%02d", Integer.valueOf(i14), Integer.valueOf(i13), Integer.valueOf(i12)).toString() : this.f39173h.format("%02d:%02d", Integer.valueOf(i13), Integer.valueOf(i12)).toString();
    }

    public final void y() {
        if (this.f39179n == null) {
            return;
        }
        if (this.f39167b.isPlaying()) {
            this.f39179n.setImageResource(android.R.drawable.ic_media_pause);
        } else {
            this.f39179n.setImageResource(android.R.drawable.ic_media_play);
        }
    }

    public SimpleMediaFensterPlayerController(final Context context, final AttributeSet attrs) {
        this(context, attrs, 0);
    }

    @Override // ls.a
    public void show(final int timeInMilliSeconds) {
        if (!this.f39168c) {
            v();
            ImageButton imageButton = this.f39179n;
            if (imageButton != null) {
                imageButton.requestFocus();
            }
            this.f39168c = true;
            setVisibility(0);
        }
        y();
        this.f39185t.sendEmptyMessage(2);
        Message obtainMessage = this.f39185t.obtainMessage(1);
        if (timeInMilliSeconds != 0) {
            this.f39185t.removeMessages(1);
            this.f39185t.sendMessageDelayed(obtainMessage, timeInMilliSeconds);
        }
        ls.b bVar = this.f39166a;
        if (bVar != null) {
            bVar.a(true);
        }
    }

    public SimpleMediaFensterPlayerController(final Context context, final AttributeSet attrs, final int defStyle) {
        super(context, attrs, defStyle);
        this.f39171f = true;
        this.f39183r = -1;
        this.f39184s = new a();
        this.f39185t = new b();
        this.f39186u = new c();
    }
}
