package com.baicizhan.client.business.widget;

import android.app.Activity;
import android.content.Context;
import android.media.MediaPlayer;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.SeekBar;
import android.widget.TextView;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.baicizhan.client.business.widget.FullscreenVideoView;
import com.jiongji.andriod.card.R;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public class FullscreenVideoLayout extends FullscreenVideoView implements View.OnClickListener, SeekBar.OnSeekBarChangeListener, MediaPlayer.OnPreparedListener {
    public static final String J = "FullscreenVideoLayout";
    public static final String K = "00:00:00";
    public static final String L = "00:00";
    public View A;
    public SeekBar B;
    public ImageView C;
    public ImageView D;
    public TextView E;
    public TextView F;
    public View.OnTouchListener G;
    public Runnable H;
    public Runnable I;

    /* renamed from: z, reason: collision with root package name */
    public View f17100z;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            FullscreenVideoLayout.this.z();
            FullscreenVideoLayout.this.postDelayed(this, 200L);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            FullscreenVideoLayout.this.s();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class c implements Runnable {
        public c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            FullscreenVideoLayout.this.n();
        }
    }

    public FullscreenVideoLayout(Context context) {
        super(context);
        this.H = new a();
        this.I = new b();
    }

    @Override // com.baicizhan.client.business.widget.FullscreenVideoView
    public void b() throws IllegalStateException {
        DisplayMetrics displayMetrics = this.f17106b.getResources().getDisplayMetrics();
        if (this.f17119o) {
            RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.A.getLayoutParams();
            float f11 = displayMetrics.density;
            layoutParams.height = (int) (35.0f * f11);
            int i11 = (int) (f11 * 16.0f);
            this.A.setPadding(i11, 0, i11, 0);
            ((Activity) getContext()).getWindow().addFlags(1024);
        } else {
            RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) this.A.getLayoutParams();
            float f12 = displayMetrics.density;
            layoutParams2.height = (int) (50.0f * f12);
            this.A.setPadding((int) (66.0f * f12), 0, (int) (f12 * 30.0f), 0);
            ((Activity) getContext()).getWindow().clearFlags(1024);
        }
        if (!f()) {
            super.b();
            return;
        }
        h();
        super.b();
        post(new c());
    }

    @Override // com.baicizhan.client.business.widget.FullscreenVideoView
    public void c() {
        Log.d(J, "init");
        super.c();
        this.f17100z = ((LayoutInflater) this.f17106b.getSystemService("layout_inflater")).inflate(R.layout.view_videocontrols, (ViewGroup) null);
        addView(this.f17100z, new RelativeLayout.LayoutParams(-1, -1));
        this.A = this.f17100z.findViewById(R.id.bottom_line);
        this.D = (ImageView) this.f17100z.findViewById(R.id.vcv_play);
        this.B = (SeekBar) this.f17100z.findViewById(R.id.vcv_seekbar);
        this.C = (ImageView) this.f17100z.findViewById(R.id.vcv_img_fullscreen);
        this.E = (TextView) this.f17100z.findViewById(R.id.vcv_txt_total);
        this.F = (TextView) this.f17100z.findViewById(R.id.vcv_txt_elapsed);
        this.D.setOnClickListener(this);
        this.C.setOnClickListener(this);
        this.B.setOnSeekBarChangeListener(this);
        this.f17100z.setVisibility(4);
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent ev2) {
        boolean dispatchTouchEvent = super.dispatchTouchEvent(ev2);
        if (dispatchTouchEvent || ev2.getAction() != 0) {
            if (ev2.getAction() != 1) {
                return dispatchTouchEvent;
            }
            postDelayed(this.I, 2000L);
            return true;
        }
        View view = this.f17100z;
        if (view != null) {
            if (view.getVisibility() == 0) {
                s();
            } else if (d()) {
                v();
            }
        }
        return true;
    }

    @Override // com.baicizhan.client.business.widget.FullscreenVideoView
    public void h() throws IllegalStateException {
        Log.d(J, ma.b.L);
        if (f()) {
            if (getContext() instanceof Activity) {
                ((Activity) getContext()).getWindow().clearFlags(128);
            }
            x();
            super.h();
            return;
        }
        if (this.f17114j == FullscreenVideoView.State.PREPARING && this.f17120p) {
            this.f17124t = true;
        }
    }

    @Override // com.baicizhan.client.business.widget.FullscreenVideoView
    public void j() {
        Log.d(J, "reset");
        if (getContext() instanceof Activity) {
            ((Activity) getContext()).getWindow().clearFlags(128);
        }
        super.j();
        x();
    }

    @Override // com.baicizhan.client.business.widget.FullscreenVideoView
    public void n() throws IllegalStateException {
        Log.d(J, TtmlNode.START);
        if (f()) {
            return;
        }
        if (getContext() instanceof Activity) {
            ((Activity) getContext()).getWindow().addFlags(128);
        }
        super.n();
        w();
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View v11) {
        int id2 = v11.getId();
        if (id2 != R.id.vcv_play) {
            if (id2 == R.id.vcv_img_fullscreen) {
                b();
            }
        } else {
            if (f()) {
                h();
            } else {
                n();
            }
            y();
        }
    }

    @Override // com.baicizhan.client.business.widget.FullscreenVideoView, android.media.MediaPlayer.OnCompletionListener
    public void onCompletion(MediaPlayer mp2) {
        Log.d(J, "onCompletion");
        super.onCompletion(mp2);
        x();
        z();
    }

    @Override // com.baicizhan.client.business.widget.FullscreenVideoView, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (getCurrentState() == FullscreenVideoView.State.END) {
            Log.d(J, "onDetachedFromWindow END");
            x();
        }
    }

    @Override // com.baicizhan.client.business.widget.FullscreenVideoView, android.media.MediaPlayer.OnErrorListener
    public boolean onError(MediaPlayer mp2, int what, int extra) {
        boolean onError = super.onError(mp2, what, extra);
        x();
        return onError;
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public void onStartTrackingTouch(SeekBar seekBar) {
        x();
        Log.d(J, "onStartTrackingTouch");
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public void onStopTrackingTouch(SeekBar seekBar) {
        l(seekBar.getProgress());
        Log.d(J, "onStopTrackingTouch");
    }

    @Override // com.baicizhan.client.business.widget.FullscreenVideoView
    public void p() throws IllegalStateException {
        Log.d(J, "stop");
        if (getContext() instanceof Activity) {
            ((Activity) getContext()).getWindow().clearFlags(128);
        }
        super.p();
        x();
    }

    @Override // com.baicizhan.client.business.widget.FullscreenVideoView
    public void r() {
        int duration;
        Log.d(J, "tryToPrepare");
        super.r();
        if ((getCurrentState() == FullscreenVideoView.State.PREPARED || getCurrentState() == FullscreenVideoView.State.STARTED) && (duration = getDuration()) > 0) {
            this.B.setMax(duration);
            this.B.setProgress(0);
            int i11 = duration / 1000;
            long j11 = i11 % 60;
            long j12 = (i11 / 60) % 60;
            long j13 = (i11 / 3600) % 24;
            if (j13 > 0) {
                this.F.setText(K);
                this.E.setText(String.format("%d:%02d:%02d", Long.valueOf(j13), Long.valueOf(j12), Long.valueOf(j11)));
            } else {
                this.F.setText(L);
                this.E.setText(String.format("%02d:%02d", Long.valueOf(j12), Long.valueOf(j11)));
            }
        }
    }

    public void s() {
        Log.d(J, "hideControls");
        View view = this.f17100z;
        if (view != null) {
            view.setVisibility(4);
            removeCallbacks(this.I);
        }
    }

    @Override // android.view.View
    public void setOnTouchListener(View.OnTouchListener l11) {
        this.G = l11;
    }

    public boolean t() {
        return this.f17119o;
    }

    public void u() {
        if (this.f17120p) {
            if (this.f17114j == FullscreenVideoView.State.PREPARED && this.f17124t) {
                n();
            }
            this.f17124t = false;
        }
    }

    public void v() {
        Log.d(J, "showControls");
        if (this.f17100z != null) {
            y();
            this.f17100z.setVisibility(0);
        }
    }

    public void w() {
        postDelayed(this.H, 200L);
    }

    public void x() {
        removeCallbacks(this.H);
    }

    public final void y() {
        if (f()) {
            this.D.setImageResource(R.drawable.tv_pausenew_normal_default);
        } else {
            this.D.setImageResource(R.drawable.tv_big_play_normal_default);
        }
    }

    public void z() {
        int currentPosition = getCurrentPosition();
        if (currentPosition <= 0 || currentPosition >= getDuration()) {
            return;
        }
        this.B.setProgress(currentPosition);
        int round = Math.round(currentPosition / 1000.0f);
        long j11 = round % 60;
        long j12 = (round / 60) % 60;
        long j13 = (round / 3600) % 24;
        if (j13 > 0) {
            this.F.setText(String.format("%d:%02d:%02d", Long.valueOf(j13), Long.valueOf(j12), Long.valueOf(j11)));
        } else {
            this.F.setText(String.format("%02d:%02d", Long.valueOf(j12), Long.valueOf(j11)));
        }
    }

    public FullscreenVideoLayout(Context context, AttributeSet attrs) {
        super(context, attrs);
        this.H = new a();
        this.I = new b();
    }

    public FullscreenVideoLayout(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        this.H = new a();
        this.I = new b();
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
    }
}
