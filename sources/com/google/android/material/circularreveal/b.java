package com.google.android.material.circularreveal;

import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.view.View;
import androidx.annotation.ColorInt;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.material.circularreveal.c;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public class b {

    /* renamed from: k, reason: collision with root package name */
    public static final boolean f31053k = false;

    /* renamed from: l, reason: collision with root package name */
    public static final int f31054l = 0;

    /* renamed from: m, reason: collision with root package name */
    public static final int f31055m = 1;

    /* renamed from: n, reason: collision with root package name */
    public static final int f31056n = 2;

    /* renamed from: o, reason: collision with root package name */
    public static final int f31057o = 2;

    /* renamed from: a, reason: collision with root package name */
    public final a f31058a;

    /* renamed from: b, reason: collision with root package name */
    @NonNull
    public final View f31059b;

    /* renamed from: c, reason: collision with root package name */
    @NonNull
    public final Path f31060c;

    /* renamed from: d, reason: collision with root package name */
    @NonNull
    public final Paint f31061d;

    /* renamed from: e, reason: collision with root package name */
    @NonNull
    public final Paint f31062e;

    /* renamed from: f, reason: collision with root package name */
    @Nullable
    public c.e f31063f;

    /* renamed from: g, reason: collision with root package name */
    @Nullable
    public Drawable f31064g;

    /* renamed from: h, reason: collision with root package name */
    public Paint f31065h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f31066i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f31067j;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public interface a {
        void b(Canvas canvas);

        boolean c();
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @Retention(RetentionPolicy.SOURCE)
    /* renamed from: com.google.android.material.circularreveal.b$b, reason: collision with other inner class name */
    public @interface InterfaceC0371b {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public b(a aVar) {
        this.f31058a = aVar;
        View view = (View) aVar;
        this.f31059b = view;
        view.setWillNotDraw(false);
        this.f31060c = new Path();
        this.f31061d = new Paint(7);
        Paint paint = new Paint(1);
        this.f31062e = paint;
        paint.setColor(0);
    }

    public void a() {
        if (f31057o == 0) {
            this.f31066i = true;
            this.f31067j = false;
            this.f31059b.buildDrawingCache();
            Bitmap drawingCache = this.f31059b.getDrawingCache();
            if (drawingCache == null && this.f31059b.getWidth() != 0 && this.f31059b.getHeight() != 0) {
                drawingCache = Bitmap.createBitmap(this.f31059b.getWidth(), this.f31059b.getHeight(), Bitmap.Config.ARGB_8888);
                this.f31059b.draw(new Canvas(drawingCache));
            }
            if (drawingCache != null) {
                Paint paint = this.f31061d;
                Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                paint.setShader(new BitmapShader(drawingCache, tileMode, tileMode));
            }
            this.f31066i = false;
            this.f31067j = true;
        }
    }

    public void b() {
        if (f31057o == 0) {
            this.f31067j = false;
            this.f31059b.destroyDrawingCache();
            this.f31061d.setShader(null);
            this.f31059b.invalidate();
        }
    }

    public void c(@NonNull Canvas canvas) {
        Canvas canvas2;
        if (p()) {
            int i11 = f31057o;
            if (i11 == 0) {
                canvas2 = canvas;
                c.e eVar = this.f31063f;
                canvas2.drawCircle(eVar.f31073a, eVar.f31074b, eVar.f31075c, this.f31061d);
                if (r()) {
                    c.e eVar2 = this.f31063f;
                    canvas2.drawCircle(eVar2.f31073a, eVar2.f31074b, eVar2.f31075c, this.f31062e);
                }
            } else if (i11 == 1) {
                canvas2 = canvas;
                int save = canvas2.save();
                canvas2.clipPath(this.f31060c);
                this.f31058a.b(canvas2);
                if (r()) {
                    canvas2.drawRect(0.0f, 0.0f, this.f31059b.getWidth(), this.f31059b.getHeight(), this.f31062e);
                }
                canvas2.restoreToCount(save);
            } else {
                if (i11 != 2) {
                    throw new IllegalStateException("Unsupported strategy " + i11);
                }
                this.f31058a.b(canvas);
                if (r()) {
                    canvas.drawRect(0.0f, 0.0f, this.f31059b.getWidth(), this.f31059b.getHeight(), this.f31062e);
                    canvas2 = canvas;
                } else {
                    canvas2 = canvas;
                }
            }
        } else {
            canvas2 = canvas;
            this.f31058a.b(canvas2);
            if (r()) {
                canvas2.drawRect(0.0f, 0.0f, this.f31059b.getWidth(), this.f31059b.getHeight(), this.f31062e);
            }
        }
        f(canvas2);
    }

    public final void d(@NonNull Canvas canvas, int i11, float f11) {
        this.f31065h.setColor(i11);
        this.f31065h.setStrokeWidth(f11);
        c.e eVar = this.f31063f;
        canvas.drawCircle(eVar.f31073a, eVar.f31074b, eVar.f31075c - (f11 / 2.0f), this.f31065h);
    }

    public final void e(@NonNull Canvas canvas) {
        this.f31058a.b(canvas);
        if (r()) {
            c.e eVar = this.f31063f;
            canvas.drawCircle(eVar.f31073a, eVar.f31074b, eVar.f31075c, this.f31062e);
        }
        if (p()) {
            d(canvas, -16777216, 10.0f);
            d(canvas, -65536, 5.0f);
        }
        f(canvas);
    }

    public final void f(@NonNull Canvas canvas) {
        if (q()) {
            Rect bounds = this.f31064g.getBounds();
            float width = this.f31063f.f31073a - (bounds.width() / 2.0f);
            float height = this.f31063f.f31074b - (bounds.height() / 2.0f);
            canvas.translate(width, height);
            this.f31064g.draw(canvas);
            canvas.translate(-width, -height);
        }
    }

    @Nullable
    public Drawable g() {
        return this.f31064g;
    }

    @ColorInt
    public int h() {
        return this.f31062e.getColor();
    }

    public final float i(@NonNull c.e eVar) {
        return on.a.b(eVar.f31073a, eVar.f31074b, 0.0f, 0.0f, this.f31059b.getWidth(), this.f31059b.getHeight());
    }

    @Nullable
    public c.e j() {
        c.e eVar = this.f31063f;
        if (eVar == null) {
            return null;
        }
        c.e eVar2 = new c.e(eVar);
        if (eVar2.a()) {
            eVar2.f31075c = i(eVar2);
        }
        return eVar2;
    }

    public final void k() {
        if (f31057o == 1) {
            this.f31060c.rewind();
            c.e eVar = this.f31063f;
            if (eVar != null) {
                this.f31060c.addCircle(eVar.f31073a, eVar.f31074b, eVar.f31075c, Path.Direction.CW);
            }
        }
        this.f31059b.invalidate();
    }

    public boolean l() {
        return this.f31058a.c() && !p();
    }

    public void m(@Nullable Drawable drawable) {
        this.f31064g = drawable;
        this.f31059b.invalidate();
    }

    public void n(@ColorInt int i11) {
        this.f31062e.setColor(i11);
        this.f31059b.invalidate();
    }

    public void o(@Nullable c.e eVar) {
        if (eVar == null) {
            this.f31063f = null;
        } else {
            c.e eVar2 = this.f31063f;
            if (eVar2 == null) {
                this.f31063f = new c.e(eVar);
            } else {
                eVar2.c(eVar);
            }
            if (on.a.e(eVar.f31075c, i(eVar), 1.0E-4f)) {
                this.f31063f.f31075c = Float.MAX_VALUE;
            }
        }
        k();
    }

    public final boolean p() {
        c.e eVar = this.f31063f;
        boolean z11 = eVar == null || eVar.a();
        return f31057o == 0 ? !z11 && this.f31067j : !z11;
    }

    public final boolean q() {
        return (this.f31066i || this.f31064g == null || this.f31063f == null) ? false : true;
    }

    public final boolean r() {
        return (this.f31066i || Color.alpha(this.f31062e.getColor()) == 0) ? false : true;
    }
}
