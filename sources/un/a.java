package un;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RadialGradient;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import androidx.annotation.NonNull;
import androidx.appcompat.graphics.drawable.DrawableWrapperCompat;
import androidx.core.content.ContextCompat;
import com.google.android.material.R;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@Deprecated
/* loaded from: classes7.dex */
public class a extends DrawableWrapperCompat {

    /* renamed from: q, reason: collision with root package name */
    public static final double f92363q = Math.cos(Math.toRadians(45.0d));

    /* renamed from: r, reason: collision with root package name */
    public static final float f92364r = 1.5f;

    /* renamed from: s, reason: collision with root package name */
    public static final float f92365s = 0.25f;

    /* renamed from: t, reason: collision with root package name */
    public static final float f92366t = 0.5f;

    /* renamed from: u, reason: collision with root package name */
    public static final float f92367u = 1.0f;

    /* renamed from: a, reason: collision with root package name */
    @NonNull
    public final Paint f92368a;

    /* renamed from: b, reason: collision with root package name */
    @NonNull
    public final Paint f92369b;

    /* renamed from: c, reason: collision with root package name */
    @NonNull
    public final RectF f92370c;

    /* renamed from: d, reason: collision with root package name */
    public float f92371d;

    /* renamed from: e, reason: collision with root package name */
    public Path f92372e;

    /* renamed from: f, reason: collision with root package name */
    public float f92373f;

    /* renamed from: g, reason: collision with root package name */
    public float f92374g;

    /* renamed from: h, reason: collision with root package name */
    public float f92375h;

    /* renamed from: i, reason: collision with root package name */
    public float f92376i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f92377j;

    /* renamed from: k, reason: collision with root package name */
    public final int f92378k;

    /* renamed from: l, reason: collision with root package name */
    public final int f92379l;

    /* renamed from: m, reason: collision with root package name */
    public final int f92380m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f92381n;

    /* renamed from: o, reason: collision with root package name */
    public float f92382o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f92383p;

    public a(Context context, Drawable drawable, float f11, float f12, float f13) {
        super(drawable);
        this.f92377j = true;
        this.f92381n = true;
        this.f92383p = false;
        this.f92378k = ContextCompat.getColor(context, R.color.design_fab_shadow_start_color);
        this.f92379l = ContextCompat.getColor(context, R.color.design_fab_shadow_mid_color);
        this.f92380m = ContextCompat.getColor(context, R.color.design_fab_shadow_end_color);
        Paint paint = new Paint(5);
        this.f92368a = paint;
        paint.setStyle(Paint.Style.FILL);
        this.f92371d = Math.round(f11);
        this.f92370c = new RectF();
        Paint paint2 = new Paint(paint);
        this.f92369b = paint2;
        paint2.setAntiAlias(false);
        p(f12, f13);
    }

    public static float c(float f11, float f12, boolean z11) {
        return z11 ? (float) (f11 + ((1.0d - f92363q) * f12)) : f11;
    }

    public static float d(float f11, float f12, boolean z11) {
        return z11 ? (float) ((f11 * 1.5f) + ((1.0d - f92363q) * f12)) : f11 * 1.5f;
    }

    public static int q(float f11) {
        int round = Math.round(f11);
        return round % 2 == 1 ? round - 1 : round;
    }

    public final void a(@NonNull Rect rect) {
        float f11 = this.f92374g;
        float f12 = 1.5f * f11;
        this.f92370c.set(rect.left + f11, rect.top + f12, rect.right - f11, rect.bottom - f12);
        Drawable drawable = getDrawable();
        RectF rectF = this.f92370c;
        drawable.setBounds((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
        b();
    }

    public final void b() {
        float f11 = this.f92371d;
        RectF rectF = new RectF(-f11, -f11, f11, f11);
        RectF rectF2 = new RectF(rectF);
        float f12 = this.f92375h;
        rectF2.inset(-f12, -f12);
        Path path = this.f92372e;
        if (path == null) {
            this.f92372e = new Path();
        } else {
            path.reset();
        }
        this.f92372e.setFillType(Path.FillType.EVEN_ODD);
        this.f92372e.moveTo(-this.f92371d, 0.0f);
        this.f92372e.rLineTo(-this.f92375h, 0.0f);
        this.f92372e.arcTo(rectF2, 180.0f, 90.0f, false);
        this.f92372e.arcTo(rectF, 270.0f, -90.0f, false);
        this.f92372e.close();
        float f13 = -rectF2.top;
        if (f13 > 0.0f) {
            float f14 = this.f92371d / f13;
            this.f92368a.setShader(new RadialGradient(0.0f, 0.0f, f13, new int[]{0, this.f92378k, this.f92379l, this.f92380m}, new float[]{0.0f, f14, ((1.0f - f14) / 2.0f) + f14, 1.0f}, Shader.TileMode.CLAMP));
        }
        this.f92369b.setShader(new LinearGradient(0.0f, rectF.top, 0.0f, rectF2.top, new int[]{this.f92378k, this.f92379l, this.f92380m}, new float[]{0.0f, 0.5f, 1.0f}, Shader.TileMode.CLAMP));
        this.f92369b.setAntiAlias(false);
    }

    @Override // androidx.appcompat.graphics.drawable.DrawableWrapperCompat, android.graphics.drawable.Drawable
    public void draw(@NonNull Canvas canvas) {
        if (this.f92377j) {
            a(getBounds());
            this.f92377j = false;
        }
        e(canvas);
        super.draw(canvas);
    }

    public final void e(@NonNull Canvas canvas) {
        float f11;
        int i11;
        int save = canvas.save();
        canvas.rotate(this.f92382o, this.f92370c.centerX(), this.f92370c.centerY());
        float f12 = this.f92371d;
        float f13 = (-f12) - this.f92375h;
        float f14 = f12 * 2.0f;
        boolean z11 = this.f92370c.width() - f14 > 0.0f;
        boolean z12 = this.f92370c.height() - f14 > 0.0f;
        float f15 = this.f92376i;
        float f16 = f12 / ((f15 - (0.5f * f15)) + f12);
        float f17 = f12 / ((f15 - (0.25f * f15)) + f12);
        float f18 = f12 / ((f15 - (f15 * 1.0f)) + f12);
        int save2 = canvas.save();
        RectF rectF = this.f92370c;
        canvas.translate(rectF.left + f12, rectF.top + f12);
        canvas.scale(f16, f17);
        canvas.drawPath(this.f92372e, this.f92368a);
        if (z11) {
            canvas.scale(1.0f / f16, 1.0f);
            f11 = 1.0f;
            i11 = save2;
            canvas.drawRect(0.0f, f13, this.f92370c.width() - f14, -this.f92371d, this.f92369b);
        } else {
            f11 = 1.0f;
            i11 = save2;
        }
        canvas.restoreToCount(i11);
        int save3 = canvas.save();
        RectF rectF2 = this.f92370c;
        canvas.translate(rectF2.right - f12, rectF2.bottom - f12);
        canvas.scale(f16, f18);
        canvas.rotate(180.0f);
        canvas.drawPath(this.f92372e, this.f92368a);
        if (z11) {
            canvas.scale(f11 / f16, f11);
            canvas.drawRect(0.0f, f13, this.f92370c.width() - f14, this.f92375h + (-this.f92371d), this.f92369b);
        }
        canvas.restoreToCount(save3);
        int save4 = canvas.save();
        RectF rectF3 = this.f92370c;
        canvas.translate(rectF3.left + f12, rectF3.bottom - f12);
        canvas.scale(f16, f18);
        canvas.rotate(270.0f);
        canvas.drawPath(this.f92372e, this.f92368a);
        if (z12) {
            canvas.scale(1.0f / f18, 1.0f);
            canvas.drawRect(0.0f, f13, this.f92370c.height() - f14, -this.f92371d, this.f92369b);
        }
        canvas.restoreToCount(save4);
        int save5 = canvas.save();
        RectF rectF4 = this.f92370c;
        canvas.translate(rectF4.right - f12, rectF4.top + f12);
        canvas.scale(f16, f17);
        canvas.rotate(90.0f);
        canvas.drawPath(this.f92372e, this.f92368a);
        if (z12) {
            canvas.scale(1.0f / f17, 1.0f);
            canvas.drawRect(0.0f, f13, this.f92370c.height() - f14, -this.f92371d, this.f92369b);
        }
        canvas.restoreToCount(save5);
        canvas.restoreToCount(save);
    }

    public float f() {
        return this.f92371d;
    }

    public float g() {
        return this.f92374g;
    }

    @Override // androidx.appcompat.graphics.drawable.DrawableWrapperCompat, android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @Override // androidx.appcompat.graphics.drawable.DrawableWrapperCompat, android.graphics.drawable.Drawable
    public boolean getPadding(@NonNull Rect rect) {
        int ceil = (int) Math.ceil(d(this.f92374g, this.f92371d, this.f92381n));
        int ceil2 = (int) Math.ceil(c(this.f92374g, this.f92371d, this.f92381n));
        rect.set(ceil2, ceil, ceil2, ceil);
        return true;
    }

    public float h() {
        float f11 = this.f92374g;
        return (Math.max(f11, this.f92371d + ((f11 * 1.5f) / 2.0f)) * 2.0f) + (this.f92374g * 1.5f * 2.0f);
    }

    public float i() {
        float f11 = this.f92374g;
        return (Math.max(f11, this.f92371d + (f11 / 2.0f)) * 2.0f) + (this.f92374g * 2.0f);
    }

    public float j() {
        return this.f92376i;
    }

    public void k(boolean z11) {
        this.f92381n = z11;
        invalidateSelf();
    }

    public void l(float f11) {
        float round = Math.round(f11);
        if (this.f92371d == round) {
            return;
        }
        this.f92371d = round;
        this.f92377j = true;
        invalidateSelf();
    }

    public void m(float f11) {
        p(this.f92376i, f11);
    }

    public final void n(float f11) {
        if (this.f92382o != f11) {
            this.f92382o = f11;
            invalidateSelf();
        }
    }

    public void o(float f11) {
        p(f11, this.f92374g);
    }

    @Override // androidx.appcompat.graphics.drawable.DrawableWrapperCompat, android.graphics.drawable.Drawable
    public void onBoundsChange(Rect rect) {
        this.f92377j = true;
    }

    public void p(float f11, float f12) {
        if (f11 < 0.0f || f12 < 0.0f) {
            throw new IllegalArgumentException("invalid shadow size");
        }
        float q11 = q(f11);
        float q12 = q(f12);
        if (q11 > q12) {
            if (!this.f92383p) {
                this.f92383p = true;
            }
            q11 = q12;
        }
        if (this.f92376i == q11 && this.f92374g == q12) {
            return;
        }
        this.f92376i = q11;
        this.f92374g = q12;
        this.f92375h = Math.round(q11 * 1.5f);
        this.f92373f = q12;
        this.f92377j = true;
        invalidateSelf();
    }

    @Override // androidx.appcompat.graphics.drawable.DrawableWrapperCompat, android.graphics.drawable.Drawable
    public void setAlpha(int i11) {
        super.setAlpha(i11);
        this.f92368a.setAlpha(i11);
        this.f92369b.setAlpha(i11);
    }
}
