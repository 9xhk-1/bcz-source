package com.malmstein.fenster.seekbar;

import android.content.Context;
import android.util.AttributeSet;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.SeekBar;
import androidx.appcompat.widget.AppCompatSeekBar;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public class BrightnessSeekBar extends AppCompatSeekBar {

    /* renamed from: c, reason: collision with root package name */
    public static final int f39192c = 255;

    /* renamed from: d, reason: collision with root package name */
    public static final int f39193d = 0;

    /* renamed from: a, reason: collision with root package name */
    public final SeekBar.OnSeekBarChangeListener f39194a;

    /* renamed from: b, reason: collision with root package name */
    public b f39195b;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class a implements SeekBar.OnSeekBarChangeListener {
        public a() {
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onProgressChanged(SeekBar seekBar, int brightness, boolean fromUser) {
            BrightnessSeekBar.this.setBrightness(brightness);
            BrightnessSeekBar.this.setProgress(brightness);
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onStartTrackingTouch(SeekBar seekBar) {
            BrightnessSeekBar.this.f39195b.a();
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onStopTrackingTouch(SeekBar seekBar) {
            BrightnessSeekBar.this.f39195b.b();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public interface b {
        void a();

        void b();
    }

    public BrightnessSeekBar(Context context) {
        super(context);
        this.f39194a = new a();
    }

    public void b(b brightnessListener) {
        setMax(255);
        setOnSeekBarChangeListener(this.f39194a);
        this.f39195b = brightnessListener;
        c(ns.a.a(getContext()));
    }

    public void c(int update) {
        this.f39194a.onProgressChanged(this, update, true);
    }

    @Override // android.view.View
    public void onInitializeAccessibilityEvent(final AccessibilityEvent event) {
        super.onInitializeAccessibilityEvent(event);
        event.setClassName(BrightnessSeekBar.class.getName());
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(final AccessibilityNodeInfo info) {
        super.onInitializeAccessibilityNodeInfo(info);
        info.setClassName(BrightnessSeekBar.class.getName());
    }

    public void setBrightness(int brightness) {
        if (brightness < 0) {
            brightness = 0;
        } else if (brightness > 255) {
            brightness = 255;
        }
        ns.a.b(getContext(), brightness);
    }

    public BrightnessSeekBar(Context context, AttributeSet attrs) {
        super(context, attrs);
        this.f39194a = new a();
    }

    public BrightnessSeekBar(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
        this.f39194a = new a();
    }
}
