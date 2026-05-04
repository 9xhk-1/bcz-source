package com.malmstein.fenster.view;

import android.content.Context;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public final class FensterTouchRoot extends FrameLayout {

    /* renamed from: c, reason: collision with root package name */
    public static final int f39266c = 1000;

    /* renamed from: a, reason: collision with root package name */
    public long f39267a;

    /* renamed from: b, reason: collision with root package name */
    public a f39268b;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public interface a {
        void b();
    }

    public FensterTouchRoot(final Context context) {
        super(context);
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(final MotionEvent ev2) {
        if (this.f39268b != null) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            if (elapsedRealtime - this.f39267a > 1000) {
                this.f39267a = elapsedRealtime;
                this.f39268b.b();
            }
        }
        return super.dispatchTouchEvent(ev2);
    }

    public void setOnTouchReceiver(final a receiver) {
        this.f39268b = receiver;
    }

    public FensterTouchRoot(final Context context, final AttributeSet attrs) {
        super(context, attrs);
    }

    public FensterTouchRoot(final Context context, final AttributeSet attrs, final int defStyle) {
        super(context, attrs, defStyle);
    }
}
