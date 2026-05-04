package rn;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.RectF;
import androidx.annotation.ColorInt;
import androidx.annotation.FloatRange;
import androidx.annotation.IntRange;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.Px;
import androidx.core.math.MathUtils;
import com.google.android.material.progressindicator.LinearProgressIndicatorSpec;
import en.u;
import rn.g;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public final class j extends g<LinearProgressIndicatorSpec> {

    /* renamed from: b, reason: collision with root package name */
    public float f84395b;

    /* renamed from: c, reason: collision with root package name */
    public float f84396c;

    /* renamed from: d, reason: collision with root package name */
    public float f84397d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f84398e;

    /* renamed from: f, reason: collision with root package name */
    @FloatRange(from = 0.0d, to = 1.0d)
    public float f84399f;

    public j(@NonNull LinearProgressIndicatorSpec linearProgressIndicatorSpec) {
        super(linearProgressIndicatorSpec);
        this.f84395b = 300.0f;
    }

    @Override // rn.g
    public void a(@NonNull Canvas canvas, @NonNull Rect rect, @FloatRange(from = 0.0d, to = 1.0d) float f11, boolean z11, boolean z12) {
        this.f84395b = rect.width();
        float f12 = ((LinearProgressIndicatorSpec) this.f84385a).f84320a;
        canvas.translate(rect.left + (rect.width() / 2.0f), rect.top + (rect.height() / 2.0f) + Math.max(0.0f, (rect.height() - f12) / 2.0f));
        if (((LinearProgressIndicatorSpec) this.f84385a).f31876j) {
            canvas.scale(-1.0f, 1.0f);
        }
        float f13 = this.f84395b / 2.0f;
        float f14 = f12 / 2.0f;
        canvas.clipRect(-f13, -f14, f13, f14);
        S s11 = this.f84385a;
        this.f84398e = ((LinearProgressIndicatorSpec) s11).f84320a / 2 == ((LinearProgressIndicatorSpec) s11).f84321b;
        this.f84396c = ((LinearProgressIndicatorSpec) s11).f84320a * f11;
        this.f84397d = Math.min(((LinearProgressIndicatorSpec) s11).f84320a / 2, ((LinearProgressIndicatorSpec) s11).f84321b) * f11;
        if (z11 || z12) {
            if ((z11 && ((LinearProgressIndicatorSpec) this.f84385a).f84324e == 2) || (z12 && ((LinearProgressIndicatorSpec) this.f84385a).f84325f == 1)) {
                canvas.scale(1.0f, -1.0f);
            }
            if (z11 || (z12 && ((LinearProgressIndicatorSpec) this.f84385a).f84325f != 3)) {
                canvas.translate(0.0f, (((LinearProgressIndicatorSpec) this.f84385a).f84320a * (1.0f - f11)) / 2.0f);
            }
        }
        if (z12 && ((LinearProgressIndicatorSpec) this.f84385a).f84325f == 3) {
            this.f84399f = f11;
        } else {
            this.f84399f = 1.0f;
        }
    }

    @Override // rn.g
    public void b(@NonNull Canvas canvas, @NonNull Paint paint, @ColorInt int i11, @IntRange(from = 0, to = 255) int i12) {
        int a11 = u.a(i11, i12);
        if (((LinearProgressIndicatorSpec) this.f84385a).f31877k <= 0 || a11 == 0) {
            return;
        }
        paint.setStyle(Paint.Style.FILL);
        paint.setColor(a11);
        PointF pointF = new PointF((this.f84395b / 2.0f) - (this.f84396c / 2.0f), 0.0f);
        S s11 = this.f84385a;
        i(canvas, paint, pointF, ((LinearProgressIndicatorSpec) s11).f31877k, ((LinearProgressIndicatorSpec) s11).f31877k);
    }

    @Override // rn.g
    public void c(@NonNull Canvas canvas, @NonNull Paint paint, @NonNull g.a aVar, int i11) {
        int a11 = u.a(aVar.f84388c, i11);
        float f11 = aVar.f84386a;
        float f12 = aVar.f84387b;
        int i12 = aVar.f84389d;
        h(canvas, paint, f11, f12, a11, i12, i12);
    }

    @Override // rn.g
    public void d(@NonNull Canvas canvas, @NonNull Paint paint, float f11, float f12, int i11, int i12, @Px int i13) {
        h(canvas, paint, f11, f12, u.a(i11, i12), i13, i13);
    }

    @Override // rn.g
    public int e() {
        return ((LinearProgressIndicatorSpec) this.f84385a).f84320a;
    }

    @Override // rn.g
    public int f() {
        return -1;
    }

    public final void h(@NonNull Canvas canvas, @NonNull Paint paint, float f11, float f12, @ColorInt int i11, @Px int i12, @Px int i13) {
        float f13;
        float clamp = MathUtils.clamp(f11, 0.0f, 1.0f);
        float clamp2 = MathUtils.clamp(f12, 0.0f, 1.0f);
        float f14 = on.a.f(1.0f - this.f84399f, 1.0f, clamp);
        float f15 = on.a.f(1.0f - this.f84399f, 1.0f, clamp2);
        int clamp3 = (int) ((i12 * MathUtils.clamp(f14, 0.0f, 0.01f)) / 0.01f);
        int clamp4 = (int) ((i13 * (1.0f - MathUtils.clamp(f15, 0.99f, 1.0f))) / 0.01f);
        float f16 = this.f84395b;
        int i14 = (int) ((f14 * f16) + clamp3);
        int i15 = (int) ((f15 * f16) - clamp4);
        float f17 = (-f16) / 2.0f;
        if (i14 <= i15) {
            float f18 = this.f84397d;
            float f19 = i14 + f18;
            float f21 = i15 - f18;
            float f22 = f18 * 2.0f;
            paint.setColor(i11);
            paint.setAntiAlias(true);
            paint.setStrokeWidth(this.f84396c);
            if (f19 >= f21) {
                j(canvas, paint, new PointF(f19 + f17, 0.0f), new PointF(f21 + f17, 0.0f), f22, this.f84396c);
                return;
            }
            paint.setStyle(Paint.Style.STROKE);
            paint.setStrokeCap(this.f84398e ? Paint.Cap.ROUND : Paint.Cap.BUTT);
            float f23 = f19 + f17;
            float f24 = f21 + f17;
            canvas.drawLine(f23, 0.0f, f24, 0.0f, paint);
            if (this.f84398e || this.f84397d <= 0.0f) {
                return;
            }
            paint.setStyle(Paint.Style.FILL);
            if (f19 > 0.0f) {
                f13 = f22;
                i(canvas, paint, new PointF(f23, 0.0f), f13, this.f84396c);
            } else {
                f13 = f22;
            }
            if (f21 < this.f84395b) {
                i(canvas, paint, new PointF(f24, 0.0f), f13, this.f84396c);
            }
        }
    }

    public final void i(@NonNull Canvas canvas, @NonNull Paint paint, @NonNull PointF pointF, float f11, float f12) {
        j(canvas, paint, pointF, null, f11, f12);
    }

    public final void j(@NonNull Canvas canvas, @NonNull Paint paint, @NonNull PointF pointF, @Nullable PointF pointF2, float f11, float f12) {
        float min = Math.min(f12, this.f84396c);
        float f13 = f11 / 2.0f;
        float min2 = Math.min(f13, (this.f84397d * min) / this.f84396c);
        RectF rectF = new RectF((-f11) / 2.0f, (-min) / 2.0f, f13, min / 2.0f);
        paint.setStyle(Paint.Style.FILL);
        canvas.save();
        if (pointF2 != null) {
            canvas.translate(pointF2.x, pointF2.y);
            Path path = new Path();
            path.addRoundRect(rectF, min2, min2, Path.Direction.CCW);
            canvas.clipPath(path);
            canvas.translate(-pointF2.x, -pointF2.y);
        }
        canvas.translate(pointF.x, pointF.y);
        canvas.drawRoundRect(rectF, min2, min2, paint);
        canvas.restore();
    }
}
