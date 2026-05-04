package com.soundcloud.android.crop;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Region;
import android.util.TypedValue;
import android.view.View;
import com.jiongji.andriod.card.R;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public class e {
    public static final float A = 20.0f;
    public static final float B = 2.0f;
    public static final float C = 20.0f;

    /* renamed from: t, reason: collision with root package name */
    public static final int f41685t = 1;

    /* renamed from: u, reason: collision with root package name */
    public static final int f41686u = 2;

    /* renamed from: v, reason: collision with root package name */
    public static final int f41687v = 4;

    /* renamed from: w, reason: collision with root package name */
    public static final int f41688w = 8;

    /* renamed from: x, reason: collision with root package name */
    public static final int f41689x = 16;

    /* renamed from: y, reason: collision with root package name */
    public static final int f41690y = 32;

    /* renamed from: z, reason: collision with root package name */
    public static final int f41691z = -13388315;

    /* renamed from: a, reason: collision with root package name */
    public RectF f41692a;

    /* renamed from: b, reason: collision with root package name */
    public Rect f41693b;

    /* renamed from: c, reason: collision with root package name */
    public Matrix f41694c;

    /* renamed from: d, reason: collision with root package name */
    public RectF f41695d;

    /* renamed from: h, reason: collision with root package name */
    public View f41699h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f41700i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f41701j;

    /* renamed from: k, reason: collision with root package name */
    public int f41702k;

    /* renamed from: n, reason: collision with root package name */
    public boolean f41705n;

    /* renamed from: o, reason: collision with root package name */
    public float f41706o;

    /* renamed from: p, reason: collision with root package name */
    public float f41707p;

    /* renamed from: q, reason: collision with root package name */
    public float f41708q;

    /* renamed from: r, reason: collision with root package name */
    public float f41709r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f41710s;

    /* renamed from: e, reason: collision with root package name */
    public final Paint f41696e = new Paint();

    /* renamed from: f, reason: collision with root package name */
    public final Paint f41697f = new Paint();

    /* renamed from: g, reason: collision with root package name */
    public final Paint f41698g = new Paint();

    /* renamed from: l, reason: collision with root package name */
    public b f41703l = b.None;

    /* renamed from: m, reason: collision with root package name */
    public a f41704m = a.Changing;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public enum a {
        Changing,
        Always,
        Never
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public enum b {
        None,
        Move,
        Grow
    }

    public e(View context) {
        this.f41699h = context;
        m(context.getContext());
    }

    public final Rect a() {
        RectF rectF = this.f41692a;
        RectF rectF2 = new RectF(rectF.left, rectF.top, rectF.right, rectF.bottom);
        this.f41694c.mapRect(rectF2);
        return new Rect(Math.round(rectF2.left), Math.round(rectF2.top), Math.round(rectF2.right), Math.round(rectF2.bottom));
    }

    public final float b(float dp2) {
        return dp2 * this.f41699h.getResources().getDisplayMetrics().density;
    }

    public void c(Canvas canvas) {
        canvas.save();
        Path path = new Path();
        this.f41697f.setStrokeWidth(this.f41708q);
        if (!l()) {
            this.f41697f.setColor(-16777216);
            canvas.drawRect(this.f41693b, this.f41697f);
            return;
        }
        Rect rect = new Rect();
        this.f41699h.getDrawingRect(rect);
        path.addRect(new RectF(this.f41693b), Path.Direction.CW);
        this.f41697f.setARGB(125, 255, 255, 255);
        if (o(canvas)) {
            canvas.clipPath(path, Region.Op.DIFFERENCE);
            canvas.drawRect(rect, this.f41696e);
        } else {
            f(canvas);
        }
        canvas.restore();
        canvas.drawPath(path, this.f41697f);
        if (this.f41700i) {
            g(canvas);
        }
        if (this.f41701j) {
            d(canvas);
        }
        a aVar = this.f41704m;
        if (aVar == a.Always || (aVar == a.Changing && this.f41703l == b.Grow)) {
            e(canvas);
        }
    }

    public final void d(Canvas canvas) {
        this.f41697f.setStrokeWidth(1.0f);
        canvas.drawOval(new RectF(this.f41693b), this.f41697f);
    }

    public final void e(Canvas canvas) {
        this.f41698g.setStrokeWidth(b(3.0f));
        Path path = new Path();
        Rect rect = this.f41693b;
        path.moveTo(rect.left + this.f41707p, rect.top);
        Rect rect2 = this.f41693b;
        path.lineTo(rect2.left, rect2.top);
        Rect rect3 = this.f41693b;
        path.lineTo(rect3.left, rect3.top + this.f41707p);
        canvas.drawPath(path, this.f41698g);
        Rect rect4 = this.f41693b;
        path.moveTo(rect4.left + this.f41707p, rect4.bottom);
        Rect rect5 = this.f41693b;
        path.lineTo(rect5.left, rect5.bottom);
        Rect rect6 = this.f41693b;
        path.lineTo(rect6.left, rect6.bottom - this.f41707p);
        canvas.drawPath(path, this.f41698g);
        Rect rect7 = this.f41693b;
        path.moveTo(rect7.right - this.f41707p, rect7.top);
        Rect rect8 = this.f41693b;
        path.lineTo(rect8.right, rect8.top);
        Rect rect9 = this.f41693b;
        path.lineTo(rect9.right, rect9.top + this.f41707p);
        canvas.drawPath(path, this.f41698g);
        Rect rect10 = this.f41693b;
        path.moveTo(rect10.right - this.f41707p, rect10.bottom);
        Rect rect11 = this.f41693b;
        path.lineTo(rect11.right, rect11.bottom);
        Rect rect12 = this.f41693b;
        path.lineTo(rect12.right, rect12.bottom - this.f41707p);
        canvas.drawPath(path, this.f41698g);
    }

    public final void f(Canvas canvas) {
        canvas.drawRect(0.0f, 0.0f, canvas.getWidth(), this.f41693b.top, this.f41696e);
        canvas.drawRect(0.0f, this.f41693b.bottom, canvas.getWidth(), canvas.getHeight(), this.f41696e);
        Rect rect = this.f41693b;
        canvas.drawRect(0.0f, rect.top, rect.left, rect.bottom, this.f41696e);
        Rect rect2 = this.f41693b;
        canvas.drawRect(rect2.right, rect2.top, canvas.getWidth(), this.f41693b.bottom, this.f41696e);
    }

    public final void g(Canvas canvas) {
        this.f41697f.setStrokeWidth(1.0f);
        Rect rect = this.f41693b;
        int i11 = rect.right;
        int i12 = rect.left;
        float f11 = (i11 - i12) / 3;
        int i13 = rect.bottom;
        int i14 = rect.top;
        float f12 = (i13 - i14) / 3;
        canvas.drawLine(i12 + f11, i14, i12 + f11, i13, this.f41697f);
        int i15 = this.f41693b.left;
        float f13 = f11 * 2.0f;
        canvas.drawLine(i15 + f13, r1.top, i15 + f13, r1.bottom, this.f41697f);
        Rect rect2 = this.f41693b;
        float f14 = rect2.left;
        int i16 = rect2.top;
        canvas.drawLine(f14, i16 + f12, rect2.right, i16 + f12, this.f41697f);
        Rect rect3 = this.f41693b;
        float f15 = rect3.left;
        int i17 = rect3.top;
        float f16 = f12 * 2.0f;
        canvas.drawLine(f15, i17 + f16, rect3.right, i17 + f16, this.f41697f);
    }

    public int h(float x11, float y11) {
        Rect a11 = a();
        float f11 = this.f41709r;
        boolean z11 = false;
        boolean z12 = y11 >= ((float) a11.top) - f11 && y11 < ((float) a11.bottom) + f11;
        int i11 = a11.left;
        if (x11 >= i11 - f11 && x11 < a11.right + f11) {
            z11 = true;
        }
        int i12 = (Math.abs(((float) i11) - x11) >= f11 || !z12) ? 1 : 3;
        if (Math.abs(a11.right - x11) < f11 && z12) {
            i12 |= 4;
        }
        if (Math.abs(a11.top - y11) < f11 && z11) {
            i12 |= 8;
        }
        if (Math.abs(a11.bottom - y11) < f11 && z11) {
            i12 |= 16;
        }
        if (i12 == 1 && a11.contains((int) x11, (int) y11)) {
            return 32;
        }
        return i12;
    }

    public Rect i(float scale) {
        RectF rectF = this.f41692a;
        return new Rect((int) (rectF.left * scale), (int) (rectF.top * scale), (int) (rectF.right * scale), (int) (rectF.bottom * scale));
    }

    public void j(float dx2, float dy2) {
        if (this.f41705n) {
            if (dx2 != 0.0f) {
                dy2 = dx2 / this.f41706o;
            } else if (dy2 != 0.0f) {
                dx2 = this.f41706o * dy2;
            }
        }
        RectF rectF = new RectF(this.f41692a);
        if (dx2 > 0.0f && rectF.width() + (dx2 * 2.0f) > this.f41695d.width()) {
            dx2 = (this.f41695d.width() - rectF.width()) / 2.0f;
            if (this.f41705n) {
                dy2 = dx2 / this.f41706o;
            }
        }
        if (dy2 > 0.0f && rectF.height() + (dy2 * 2.0f) > this.f41695d.height()) {
            dy2 = (this.f41695d.height() - rectF.height()) / 2.0f;
            if (this.f41705n) {
                dx2 = this.f41706o * dy2;
            }
        }
        rectF.inset(-dx2, -dy2);
        if (rectF.width() < 25.0f) {
            rectF.inset((-(25.0f - rectF.width())) / 2.0f, 0.0f);
        }
        float f11 = this.f41705n ? 25.0f / this.f41706o : 25.0f;
        if (rectF.height() < f11) {
            rectF.inset(0.0f, (-(f11 - rectF.height())) / 2.0f);
        }
        float f12 = rectF.left;
        RectF rectF2 = this.f41695d;
        float f13 = rectF2.left;
        if (f12 < f13) {
            rectF.offset(f13 - f12, 0.0f);
        } else {
            float f14 = rectF.right;
            float f15 = rectF2.right;
            if (f14 > f15) {
                rectF.offset(-(f14 - f15), 0.0f);
            }
        }
        float f16 = rectF.top;
        RectF rectF3 = this.f41695d;
        float f17 = rectF3.top;
        if (f16 < f17) {
            rectF.offset(0.0f, f17 - f16);
        } else {
            float f18 = rectF.bottom;
            float f19 = rectF3.bottom;
            if (f18 > f19) {
                rectF.offset(0.0f, -(f18 - f19));
            }
        }
        this.f41692a.set(rectF);
        this.f41693b = a();
        this.f41699h.invalidate();
    }

    public void k(int edge, float dx2, float dy2) {
        Rect a11 = a();
        if (edge == 32) {
            p(dx2 * (this.f41692a.width() / a11.width()), dy2 * (this.f41692a.height() / a11.height()));
            return;
        }
        if ((edge & 6) == 0) {
            dx2 = 0.0f;
        }
        if ((edge & 24) == 0) {
            dy2 = 0.0f;
        }
        j(((edge & 2) != 0 ? -1 : 1) * dx2 * (this.f41692a.width() / a11.width()), ((edge & 8) != 0 ? -1 : 1) * dy2 * (this.f41692a.height() / a11.height()));
    }

    public boolean l() {
        return this.f41710s;
    }

    public final void m(Context context) {
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(R.attr.cropImageStyle, typedValue, true);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(typedValue.resourceId, R.styleable.CropImageView);
        try {
            this.f41700i = obtainStyledAttributes.getBoolean(3, false);
            this.f41701j = obtainStyledAttributes.getBoolean(1, false);
            this.f41702k = obtainStyledAttributes.getColor(0, -13388315);
            this.f41704m = a.values()[obtainStyledAttributes.getInt(2, 0)];
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    public void n() {
        this.f41693b = a();
    }

    @SuppressLint({"NewApi"})
    public final boolean o(Canvas canvas) {
        return true;
    }

    public void p(float dx2, float dy2) {
        Rect rect = new Rect(this.f41693b);
        this.f41692a.offset(dx2, dy2);
        RectF rectF = this.f41692a;
        rectF.offset(Math.max(0.0f, this.f41695d.left - rectF.left), Math.max(0.0f, this.f41695d.top - this.f41692a.top));
        RectF rectF2 = this.f41692a;
        rectF2.offset(Math.min(0.0f, this.f41695d.right - rectF2.right), Math.min(0.0f, this.f41695d.bottom - this.f41692a.bottom));
        Rect a11 = a();
        this.f41693b = a11;
        rect.union(a11);
        float f11 = this.f41707p;
        rect.inset(-((int) f11), -((int) f11));
        this.f41699h.invalidate(rect);
    }

    public void q(boolean isFocused) {
        this.f41710s = isFocused;
    }

    public void r(b mode) {
        if (mode != this.f41703l) {
            this.f41703l = mode;
            this.f41699h.invalidate();
        }
    }

    public void s(Matrix m11, Rect imageRect, RectF cropRect, boolean maintainAspectRatio) {
        this.f41694c = new Matrix(m11);
        this.f41692a = cropRect;
        this.f41695d = new RectF(imageRect);
        this.f41705n = maintainAspectRatio;
        this.f41706o = this.f41692a.width() / this.f41692a.height();
        this.f41693b = a();
        this.f41696e.setARGB(125, 50, 50, 50);
        Paint paint = this.f41697f;
        Paint.Style style = Paint.Style.STROKE;
        paint.setStyle(style);
        this.f41697f.setAntiAlias(true);
        this.f41708q = b(2.0f);
        this.f41698g.setColor(this.f41702k);
        this.f41698g.setStyle(style);
        this.f41698g.setAntiAlias(true);
        this.f41707p = b(20.0f);
        this.f41709r = b(20.0f);
        this.f41703l = b.None;
    }
}
