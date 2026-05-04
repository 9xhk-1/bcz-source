package rn;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import androidx.annotation.ColorInt;
import androidx.annotation.FloatRange;
import androidx.annotation.IntRange;
import androidx.annotation.NonNull;
import androidx.annotation.Px;
import com.google.android.material.progressindicator.CircularProgressIndicatorSpec;
import en.u;
import rn.g;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public final class c extends g<CircularProgressIndicatorSpec> {

    /* renamed from: g, reason: collision with root package name */
    public static final float f84327g = 0.01f;

    /* renamed from: b, reason: collision with root package name */
    public float f84328b;

    /* renamed from: c, reason: collision with root package name */
    public float f84329c;

    /* renamed from: d, reason: collision with root package name */
    public float f84330d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f84331e;

    /* renamed from: f, reason: collision with root package name */
    @FloatRange(from = 0.0d, to = 1.0d)
    public float f84332f;

    public c(@NonNull CircularProgressIndicatorSpec circularProgressIndicatorSpec) {
        super(circularProgressIndicatorSpec);
    }

    @Override // rn.g
    public void a(@NonNull Canvas canvas, @NonNull Rect rect, @FloatRange(from = 0.0d, to = 1.0d) float f11, boolean z11, boolean z12) {
        float width = rect.width() / f();
        float height = rect.height() / e();
        S s11 = this.f84385a;
        float f12 = (((CircularProgressIndicatorSpec) s11).f31870h / 2.0f) + ((CircularProgressIndicatorSpec) s11).f31871i;
        canvas.translate((f12 * width) + rect.left, (f12 * height) + rect.top);
        canvas.rotate(-90.0f);
        canvas.scale(width, height);
        if (((CircularProgressIndicatorSpec) this.f84385a).f31872j != 0) {
            canvas.scale(1.0f, -1.0f);
        }
        float f13 = -f12;
        canvas.clipRect(f13, f13, f12, f12);
        S s12 = this.f84385a;
        this.f84331e = ((CircularProgressIndicatorSpec) s12).f84320a / 2 <= ((CircularProgressIndicatorSpec) s12).f84321b;
        this.f84328b = ((CircularProgressIndicatorSpec) s12).f84320a * f11;
        this.f84329c = Math.min(((CircularProgressIndicatorSpec) s12).f84320a / 2, ((CircularProgressIndicatorSpec) s12).f84321b) * f11;
        S s13 = this.f84385a;
        float f14 = (((CircularProgressIndicatorSpec) s13).f31870h - ((CircularProgressIndicatorSpec) s13).f84320a) / 2.0f;
        this.f84330d = f14;
        if (z11 || z12) {
            if ((z11 && ((CircularProgressIndicatorSpec) s13).f84324e == 2) || (z12 && ((CircularProgressIndicatorSpec) s13).f84325f == 1)) {
                this.f84330d = f14 + (((1.0f - f11) * ((CircularProgressIndicatorSpec) s13).f84320a) / 2.0f);
            } else if ((z11 && ((CircularProgressIndicatorSpec) s13).f84324e == 1) || (z12 && ((CircularProgressIndicatorSpec) s13).f84325f == 2)) {
                this.f84330d = f14 - (((1.0f - f11) * ((CircularProgressIndicatorSpec) s13).f84320a) / 2.0f);
            }
        }
        if (z12 && ((CircularProgressIndicatorSpec) s13).f84325f == 3) {
            this.f84332f = f11;
        } else {
            this.f84332f = 1.0f;
        }
    }

    @Override // rn.g
    public void c(@NonNull Canvas canvas, @NonNull Paint paint, @NonNull g.a aVar, @IntRange(from = 0, to = 255) int i11) {
        int a11 = u.a(aVar.f84388c, i11);
        float f11 = aVar.f84386a;
        float f12 = aVar.f84387b;
        int i12 = aVar.f84389d;
        h(canvas, paint, f11, f12, a11, i12, i12);
    }

    @Override // rn.g
    public void d(@NonNull Canvas canvas, @NonNull Paint paint, float f11, float f12, @ColorInt int i11, @IntRange(from = 0, to = 255) int i12, int i13) {
        h(canvas, paint, f11, f12, u.a(i11, i12), i13, i13);
    }

    @Override // rn.g
    public int e() {
        return k();
    }

    @Override // rn.g
    public int f() {
        return k();
    }

    public final void h(@NonNull Canvas canvas, @NonNull Paint paint, float f11, float f12, @ColorInt int i11, @Px int i12, @Px int i13) {
        float f13 = f12 >= f11 ? f12 - f11 : (f12 + 1.0f) - f11;
        float f14 = f11 % 1.0f;
        if (this.f84332f < 1.0f) {
            float f15 = f14 + f13;
            if (f15 > 1.0f) {
                h(canvas, paint, f14, 1.0f, i11, i12, 0);
                h(canvas, paint, 1.0f, f15, i11, 0, i13);
                return;
            }
        }
        float degrees = (float) Math.toDegrees(this.f84329c / this.f84330d);
        if (f14 == 0.0f && f13 >= 0.99f) {
            f13 += ((f13 - 0.99f) * ((degrees * 2.0f) / 360.0f)) / 0.01f;
        }
        float f16 = on.a.f(1.0f - this.f84332f, 1.0f, f14);
        float f17 = on.a.f(0.0f, this.f84332f, f13);
        float degrees2 = (float) Math.toDegrees(i12 / this.f84330d);
        float degrees3 = ((f17 * 360.0f) - degrees2) - ((float) Math.toDegrees(i13 / this.f84330d));
        float f18 = (f16 * 360.0f) + degrees2;
        if (degrees3 <= 0.0f) {
            return;
        }
        paint.setAntiAlias(true);
        paint.setColor(i11);
        paint.setStrokeWidth(this.f84328b);
        float f19 = degrees * 2.0f;
        if (degrees3 < f19) {
            float f21 = degrees3 / f19;
            paint.setStyle(Paint.Style.FILL);
            j(canvas, paint, f18 + (degrees * f21), this.f84329c * 2.0f, this.f84328b, f21);
            return;
        }
        float f22 = this.f84330d;
        RectF rectF = new RectF(-f22, -f22, f22, f22);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeCap(this.f84331e ? Paint.Cap.ROUND : Paint.Cap.BUTT);
        float f23 = f18 + degrees;
        canvas.drawArc(rectF, f23, degrees3 - f19, false, paint);
        if (this.f84331e || this.f84329c <= 0.0f) {
            return;
        }
        paint.setStyle(Paint.Style.FILL);
        i(canvas, paint, f23, this.f84329c * 2.0f, this.f84328b);
        i(canvas, paint, (f18 + degrees3) - degrees, this.f84329c * 2.0f, this.f84328b);
    }

    public final void i(@NonNull Canvas canvas, @NonNull Paint paint, float f11, float f12, float f13) {
        j(canvas, paint, f11, f12, f13, 1.0f);
    }

    public final void j(@NonNull Canvas canvas, @NonNull Paint paint, float f11, float f12, float f13, float f14) {
        float min = (int) Math.min(f13, this.f84328b);
        float f15 = f12 / 2.0f;
        float min2 = Math.min(f15, (this.f84329c * min) / this.f84328b);
        RectF rectF = new RectF((-min) / 2.0f, (-f12) / 2.0f, min / 2.0f, f15);
        canvas.save();
        double d11 = f11;
        canvas.translate((float) (this.f84330d * Math.cos(Math.toRadians(d11))), (float) (this.f84330d * Math.sin(Math.toRadians(d11))));
        canvas.rotate(f11);
        canvas.scale(f14, f14);
        canvas.drawRoundRect(rectF, min2, min2, paint);
        canvas.restore();
    }

    public final int k() {
        S s11 = this.f84385a;
        return ((CircularProgressIndicatorSpec) s11).f31870h + (((CircularProgressIndicatorSpec) s11).f31871i * 2);
    }

    @Override // rn.g
    public void b(@NonNull Canvas canvas, @NonNull Paint paint, @ColorInt int i11, @IntRange(from = 0, to = 255) int i12) {
    }
}
