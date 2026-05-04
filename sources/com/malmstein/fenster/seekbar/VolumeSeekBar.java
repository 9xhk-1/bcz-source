package com.malmstein.fenster.seekbar;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.media.AudioManager;
import android.util.AttributeSet;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.SeekBar;
import androidx.appcompat.widget.AppCompatSeekBar;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public class VolumeSeekBar extends AppCompatSeekBar {

    /* renamed from: a, reason: collision with root package name */
    public final SeekBar.OnSeekBarChangeListener f39197a;

    /* renamed from: b, reason: collision with root package name */
    public AudioManager f39198b;

    /* renamed from: c, reason: collision with root package name */
    public c f39199c;

    /* renamed from: d, reason: collision with root package name */
    public BroadcastReceiver f39200d;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class a implements SeekBar.OnSeekBarChangeListener {
        public a() {
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onProgressChanged(SeekBar seekBar, int vol, boolean fromUser) {
            VolumeSeekBar.this.f39198b.setStreamVolume(3, vol, 0);
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onStartTrackingTouch(SeekBar seekBar) {
            VolumeSeekBar.this.f39199c.d();
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onStopTrackingTouch(SeekBar seekBar) {
            VolumeSeekBar.this.f39199c.h();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class b extends BroadcastReceiver {
        public b() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            VolumeSeekBar.this.h();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public interface c {
        void d();

        void h();
    }

    public VolumeSeekBar(Context context) {
        super(context);
        this.f39197a = new a();
        this.f39200d = new b();
    }

    public void d(final c volumeListener) {
        AudioManager audioManager = (AudioManager) getContext().getSystemService("audio");
        this.f39198b = audioManager;
        this.f39199c = volumeListener;
        setMax(audioManager.getStreamMaxVolume(3));
        setProgress(this.f39198b.getStreamVolume(3));
        setOnSeekBarChangeListener(this.f39197a);
    }

    public void e(int update) {
        this.f39197a.onProgressChanged(this, update, true);
    }

    public final void f() {
        getContext().registerReceiver(this.f39200d, new IntentFilter("android.media.VOLUME_CHANGED_ACTION"));
    }

    public final void g() {
        getContext().unregisterReceiver(this.f39200d);
    }

    public final void h() {
        setProgress(this.f39198b.getStreamVolume(3));
    }

    @Override // android.widget.ProgressBar, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        f();
    }

    @Override // android.widget.ProgressBar, android.view.View
    public void onDetachedFromWindow() {
        g();
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public void onInitializeAccessibilityEvent(final AccessibilityEvent event) {
        super.onInitializeAccessibilityEvent(event);
        event.setClassName(VolumeSeekBar.class.getName());
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(final AccessibilityNodeInfo info) {
        super.onInitializeAccessibilityNodeInfo(info);
        info.setClassName(VolumeSeekBar.class.getName());
    }

    public VolumeSeekBar(Context context, AttributeSet attrs) {
        super(context, attrs);
        this.f39197a = new a();
        this.f39200d = new b();
    }

    public VolumeSeekBar(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
        this.f39197a = new a();
        this.f39200d = new b();
    }
}
