package com.soundcloud.android.crop;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.widget.ImageView;
import androidx.appcompat.widget.AppCompatImageView;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
abstract class ImageViewTouchBase extends AppCompatImageView {

    /* renamed from: l, reason: collision with root package name */
    public static final float f41641l = 1.25f;

    /* renamed from: a, reason: collision with root package name */
    public Matrix f41642a;

    /* renamed from: b, reason: collision with root package name */
    public Matrix f41643b;

    /* renamed from: c, reason: collision with root package name */
    public final Matrix f41644c;

    /* renamed from: d, reason: collision with root package name */
    public final float[] f41645d;

    /* renamed from: e, reason: collision with root package name */
    public final h f41646e;

    /* renamed from: f, reason: collision with root package name */
    public int f41647f;

    /* renamed from: g, reason: collision with root package name */
    public int f41648g;

    /* renamed from: h, reason: collision with root package name */
    public float f41649h;

    /* renamed from: i, reason: collision with root package name */
    public Runnable f41650i;

    /* renamed from: j, reason: collision with root package name */
    public Handler f41651j;

    /* renamed from: k, reason: collision with root package name */
    public c f41652k;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class a implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ h f41653a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ boolean f41654b;

        public a(final h val$bitmap, final boolean val$resetSupp) {
            this.f41653a = val$bitmap;
            this.f41654b = val$resetSupp;
        }

        @Override // java.lang.Runnable
        public void run() {
            ImageViewTouchBase.this.n(this.f41653a, this.f41654b);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class b implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ float f41656a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ long f41657b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ float f41658c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ float f41659d;

        /* renamed from: e, reason: collision with root package name */
        public final /* synthetic */ float f41660e;

        /* renamed from: f, reason: collision with root package name */
        public final /* synthetic */ float f41661f;

        public b(final float val$durationMs, final long val$startTime, final float val$oldScale, final float val$incrementPerMs, final float val$centerX, final float val$centerY) {
            this.f41656a = val$durationMs;
            this.f41657b = val$startTime;
            this.f41658c = val$oldScale;
            this.f41659d = val$incrementPerMs;
            this.f41660e = val$centerX;
            this.f41661f = val$centerY;
        }

        @Override // java.lang.Runnable
        public void run() {
            float min = Math.min(this.f41656a, System.currentTimeMillis() - this.f41657b);
            ImageViewTouchBase.this.t(this.f41658c + (this.f41659d * min), this.f41660e, this.f41661f);
            if (min < this.f41656a) {
                ImageViewTouchBase.this.f41651j.post(this);
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public interface c {
        void a(Bitmap b11);
    }

    public ImageViewTouchBase(Context context) {
        super(context);
        this.f41642a = new Matrix();
        this.f41643b = new Matrix();
        this.f41644c = new Matrix();
        this.f41645d = new float[9];
        this.f41646e = new h(null, 0);
        this.f41647f = -1;
        this.f41648g = -1;
        this.f41651j = new Handler();
        i();
    }

    private void i() {
        setScaleType(ImageView.ScaleType.MATRIX);
    }

    public float a() {
        if (this.f41646e.a() == null) {
            return 1.0f;
        }
        return Math.max(this.f41646e.e() / this.f41647f, this.f41646e.b() / this.f41648g) * 4.0f;
    }

    public void b() {
        if (this.f41646e.a() == null) {
            return;
        }
        Matrix imageViewMatrix = getImageViewMatrix();
        RectF rectF = new RectF(0.0f, 0.0f, r0.getWidth(), r0.getHeight());
        imageViewMatrix.mapRect(rectF);
        float height = rectF.height();
        k(c(rectF, rectF.width(), 0.0f), d(rectF, height, 0.0f));
        setImageMatrix(getImageViewMatrix());
    }

    public final float c(RectF rect, float width, float deltaX) {
        float width2 = getWidth();
        if (width < width2) {
            return ((width2 - width) / 2.0f) - rect.left;
        }
        float f11 = rect.left;
        if (f11 > 0.0f) {
            return -f11;
        }
        float f12 = rect.right;
        return f12 < width2 ? width2 - f12 : deltaX;
    }

    public final float d(RectF rect, float height, float deltaY) {
        float height2 = getHeight();
        if (height < height2) {
            return ((height2 - height) / 2.0f) - rect.top;
        }
        float f11 = rect.top;
        return f11 > 0.0f ? -f11 : rect.bottom < height2 ? getHeight() - rect.bottom : deltaY;
    }

    public void e() {
        m(null, true);
    }

    public final void f(h bitmap, Matrix matrix, boolean includeRotation) {
        float width = getWidth();
        float height = getHeight();
        float e11 = bitmap.e();
        float b11 = bitmap.b();
        matrix.reset();
        float min = Math.min(Math.min(width / e11, 3.0f), Math.min(height / b11, 3.0f));
        if (includeRotation) {
            matrix.postConcat(bitmap.c());
        }
        matrix.postScale(min, min);
        matrix.postTranslate((width - (e11 * min)) / 2.0f, (height - (b11 * min)) / 2.0f);
    }

    public float g(Matrix matrix) {
        return h(matrix, 0);
    }

    public Matrix getImageViewMatrix() {
        this.f41644c.set(this.f41642a);
        this.f41644c.postConcat(this.f41643b);
        return this.f41644c;
    }

    public float getScale() {
        return g(this.f41643b);
    }

    public Matrix getUnrotatedMatrix() {
        Matrix matrix = new Matrix();
        f(this.f41646e, matrix, false);
        matrix.postConcat(this.f41643b);
        return matrix;
    }

    public float h(Matrix matrix, int whichValue) {
        matrix.getValues(this.f41645d);
        return this.f41645d[whichValue];
    }

    public void j(float dx2, float dy2) {
        k(dx2, dy2);
        setImageMatrix(getImageViewMatrix());
    }

    public void k(float dx2, float dy2) {
        this.f41643b.postTranslate(dx2, dy2);
    }

    public final void l(Bitmap bitmap, int rotation) {
        c cVar;
        super.setImageBitmap(bitmap);
        Drawable drawable = getDrawable();
        if (drawable != null) {
            drawable.setDither(true);
        }
        Bitmap a11 = this.f41646e.a();
        this.f41646e.h(bitmap);
        this.f41646e.i(rotation);
        if (a11 == null || a11 == bitmap || (cVar = this.f41652k) == null) {
            return;
        }
        cVar.a(a11);
    }

    public void m(final Bitmap bitmap, final boolean resetSupp) {
        n(new h(bitmap, 0), resetSupp);
    }

    public void n(final h bitmap, final boolean resetSupp) {
        if (getWidth() <= 0) {
            this.f41650i = new a(bitmap, resetSupp);
            return;
        }
        if (bitmap.a() != null) {
            f(bitmap, this.f41642a, true);
            l(bitmap.a(), bitmap.d());
        } else {
            this.f41642a.reset();
            setImageBitmap(null);
        }
        if (resetSupp) {
            this.f41643b.reset();
        }
        setImageMatrix(getImageViewMatrix());
        this.f41649h = a();
    }

    public void o() {
        p(1.25f);
    }

    @Override // android.view.View, android.view.KeyEvent.Callback
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        if (keyCode != 4 || event.getRepeatCount() != 0) {
            return super.onKeyDown(keyCode, event);
        }
        event.startTracking();
        return true;
    }

    @Override // android.view.View, android.view.KeyEvent.Callback
    public boolean onKeyUp(int keyCode, KeyEvent event) {
        if (keyCode != 4 || !event.isTracking() || event.isCanceled() || getScale() <= 1.0f) {
            return super.onKeyUp(keyCode, event);
        }
        s(1.0f);
        return true;
    }

    @Override // android.view.View
    public void onLayout(boolean changed, int left, int top, int right, int bottom) {
        super.onLayout(changed, left, top, right, bottom);
        this.f41647f = right - left;
        this.f41648g = bottom - top;
        Runnable runnable = this.f41650i;
        if (runnable != null) {
            this.f41650i = null;
            runnable.run();
        }
        if (this.f41646e.a() != null) {
            f(this.f41646e, this.f41642a, true);
            setImageMatrix(getImageViewMatrix());
        }
    }

    public void p(float rate) {
        if (getScale() < this.f41649h && this.f41646e.a() != null) {
            this.f41643b.postScale(rate, rate, getWidth() / 2.0f, getHeight() / 2.0f);
            setImageMatrix(getImageViewMatrix());
        }
    }

    public void q() {
        r(1.25f);
    }

    public void r(float rate) {
        if (this.f41646e.a() == null) {
            return;
        }
        float width = getWidth() / 2.0f;
        float height = getHeight() / 2.0f;
        Matrix matrix = new Matrix(this.f41643b);
        float f11 = 1.0f / rate;
        matrix.postScale(f11, f11, width, height);
        if (g(matrix) < 1.0f) {
            this.f41643b.setScale(1.0f, 1.0f, width, height);
        } else {
            this.f41643b.postScale(f11, f11, width, height);
        }
        setImageMatrix(getImageViewMatrix());
        b();
    }

    public void s(float scale) {
        t(scale, getWidth() / 2.0f, getHeight() / 2.0f);
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView
    public void setImageBitmap(Bitmap bitmap) {
        l(bitmap, 0);
    }

    public void setRecycler(c recycler) {
        this.f41652k = recycler;
    }

    public void t(float scale, float centerX, float centerY) {
        float f11 = this.f41649h;
        if (scale > f11) {
            scale = f11;
        }
        float scale2 = scale / getScale();
        this.f41643b.postScale(scale2, scale2, centerX, centerY);
        setImageMatrix(getImageViewMatrix());
        b();
    }

    public void u(final float scale, final float centerX, final float centerY, final float durationMs) {
        float scale2 = (scale - getScale()) / durationMs;
        float scale3 = getScale();
        this.f41651j.post(new b(durationMs, System.currentTimeMillis(), scale3, scale2, centerX, centerY));
    }

    public ImageViewTouchBase(Context context, AttributeSet attrs) {
        super(context, attrs);
        this.f41642a = new Matrix();
        this.f41643b = new Matrix();
        this.f41644c = new Matrix();
        this.f41645d = new float[9];
        this.f41646e = new h(null, 0);
        this.f41647f = -1;
        this.f41648g = -1;
        this.f41651j = new Handler();
        i();
    }

    public ImageViewTouchBase(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
        this.f41642a = new Matrix();
        this.f41643b = new Matrix();
        this.f41644c = new Matrix();
        this.f41645d = new float[9];
        this.f41646e = new h(null, 0);
        this.f41647f = -1;
        this.f41648g = -1;
        this.f41651j = new Handler();
        i();
    }
}
