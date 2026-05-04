package com.igexin.push.a;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Movie;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;

/* loaded from: classes7.dex */
public final class d extends ImageView {

    /* renamed from: e, reason: collision with root package name */
    private static final int f37309e = 1000;

    /* renamed from: a, reason: collision with root package name */
    Movie f37310a;

    /* renamed from: b, reason: collision with root package name */
    long f37311b;

    /* renamed from: c, reason: collision with root package name */
    int f37312c;

    /* renamed from: d, reason: collision with root package name */
    volatile boolean f37313d;

    /* renamed from: f, reason: collision with root package name */
    private float f37314f;

    /* renamed from: g, reason: collision with root package name */
    private float f37315g;

    /* renamed from: h, reason: collision with root package name */
    private float f37316h;

    public d(Context context) {
        super(context, null);
        this.f37313d = true;
    }

    private void a(Canvas canvas) {
        this.f37310a.setTime(this.f37312c);
        canvas.save();
        float f11 = this.f37316h;
        canvas.scale(f11, f11);
        Movie movie = this.f37310a;
        float f12 = this.f37314f;
        float f13 = this.f37316h;
        movie.draw(canvas, f12 / f13, this.f37315g / f13);
        canvas.restore();
    }

    private void b() {
        if (this.f37313d) {
            this.f37313d = false;
            if (this.f37310a != null) {
                this.f37311b = SystemClock.uptimeMillis() - this.f37312c;
                invalidate();
            }
        }
    }

    private void c() {
        if (this.f37313d) {
            return;
        }
        this.f37313d = true;
        if (this.f37310a != null) {
            invalidate();
        }
    }

    private void d() {
        if (getVisibility() == 0) {
            postInvalidateOnAnimation();
        }
    }

    private void e() {
        long uptimeMillis = SystemClock.uptimeMillis();
        if (this.f37311b == 0) {
            this.f37311b = uptimeMillis;
        }
        int duration = this.f37310a.duration();
        if (duration == 0) {
            duration = 1000;
        }
        this.f37312c = (int) ((uptimeMillis - this.f37311b) % duration);
    }

    private void setGifMovie$304a7d5c(Movie movie) {
        this.f37310a = movie;
        this.f37311b = 0L;
        this.f37312c = 0;
        setLayerType(1, null);
        setImageDrawable(null);
        requestLayout();
        invalidate();
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.f37310a != null) {
            if (this.f37313d) {
                a(canvas);
                return;
            }
            long uptimeMillis = SystemClock.uptimeMillis();
            if (this.f37311b == 0) {
                this.f37311b = uptimeMillis;
            }
            int duration = this.f37310a.duration();
            if (duration == 0) {
                duration = 1000;
            }
            this.f37312c = (int) ((uptimeMillis - this.f37311b) % duration);
            a(canvas);
            d();
        }
    }

    @Override // android.view.View
    public final void onLayout(boolean z11, int i11, int i12, int i13, int i14) {
        super.onLayout(z11, i11, i12, i13, i14);
        if (this.f37310a != null) {
            int width = getWidth();
            int height = getHeight();
            this.f37316h = 1.0f / Math.max(width != 0 ? this.f37310a.width() / width : 1.0f, height != 0 ? this.f37310a.height() / height : 1.0f);
            this.f37314f = (width - ((int) (r8 * r0))) / 2.0f;
            this.f37315g = (height - ((int) (r9 * r0))) / 2.0f;
        }
    }

    @Override // android.view.View
    public final void onScreenStateChanged(int i11) {
        super.onScreenStateChanged(i11);
        d();
    }

    @Override // android.view.View
    public final void onVisibilityChanged(View view, int i11) {
        super.onVisibilityChanged(view, i11);
        d();
    }

    @Override // android.view.View
    public final void onWindowVisibilityChanged(int i11) {
        super.onWindowVisibilityChanged(i11);
        d();
    }

    private d(Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        this.f37313d = true;
    }

    private boolean a() {
        return !this.f37313d;
    }
}
