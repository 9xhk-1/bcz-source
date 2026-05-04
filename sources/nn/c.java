package nn;

import android.annotation.TargetApi;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import androidx.annotation.ColorInt;
import androidx.annotation.Dimension;
import androidx.annotation.IntRange;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.core.graphics.ColorUtils;
import vn.p;
import vn.q;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes7.dex */
public class c extends Drawable {

    /* renamed from: q, reason: collision with root package name */
    public static final float f75194q = 1.3333f;

    /* renamed from: b, reason: collision with root package name */
    @NonNull
    public final Paint f75196b;

    /* renamed from: h, reason: collision with root package name */
    @Dimension
    public float f75202h;

    /* renamed from: i, reason: collision with root package name */
    @ColorInt
    public int f75203i;

    /* renamed from: j, reason: collision with root package name */
    @ColorInt
    public int f75204j;

    /* renamed from: k, reason: collision with root package name */
    @ColorInt
    public int f75205k;

    /* renamed from: l, reason: collision with root package name */
    @ColorInt
    public int f75206l;

    /* renamed from: m, reason: collision with root package name */
    @ColorInt
    public int f75207m;

    /* renamed from: o, reason: collision with root package name */
    public p f75209o;

    /* renamed from: p, reason: collision with root package name */
    @Nullable
    public ColorStateList f75210p;

    /* renamed from: a, reason: collision with root package name */
    public final q f75195a = q.k();

    /* renamed from: c, reason: collision with root package name */
    public final Path f75197c = new Path();

    /* renamed from: d, reason: collision with root package name */
    public final Rect f75198d = new Rect();

    /* renamed from: e, reason: collision with root package name */
    public final RectF f75199e = new RectF();

    /* renamed from: f, reason: collision with root package name */
    public final RectF f75200f = new RectF();

    /* renamed from: g, reason: collision with root package name */
    public final b f75201g = new b();

    /* renamed from: n, reason: collision with root package name */
    public boolean f75208n = true;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class b extends Drawable.ConstantState {
        public b() {
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            return 0;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        @NonNull
        public Drawable newDrawable() {
            return c.this;
        }
    }

    public c(p pVar) {
        this.f75209o = pVar;
        Paint paint = new Paint(1);
        this.f75196b = paint;
        paint.setStyle(Paint.Style.STROKE);
    }

    @NonNull
    public final Shader a() {
        copyBounds(this.f75198d);
        float height = this.f75202h / r1.height();
        return new LinearGradient(0.0f, r1.top, 0.0f, r1.bottom, new int[]{ColorUtils.compositeColors(this.f75203i, this.f75207m), ColorUtils.compositeColors(this.f75204j, this.f75207m), ColorUtils.compositeColors(ColorUtils.setAlphaComponent(this.f75204j, 0), this.f75207m), ColorUtils.compositeColors(ColorUtils.setAlphaComponent(this.f75206l, 0), this.f75207m), ColorUtils.compositeColors(this.f75206l, this.f75207m), ColorUtils.compositeColors(this.f75205k, this.f75207m)}, new float[]{0.0f, height, 0.5f, 0.5f, 1.0f - height, 1.0f}, Shader.TileMode.CLAMP);
    }

    @NonNull
    public RectF b() {
        this.f75200f.set(getBounds());
        return this.f75200f;
    }

    public p c() {
        return this.f75209o;
    }

    public void d(@Nullable ColorStateList colorStateList) {
        if (colorStateList != null) {
            this.f75207m = colorStateList.getColorForState(getState(), this.f75207m);
        }
        this.f75210p = colorStateList;
        this.f75208n = true;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(@NonNull Canvas canvas) {
        if (this.f75208n) {
            this.f75196b.setShader(a());
            this.f75208n = false;
        }
        float strokeWidth = this.f75196b.getStrokeWidth() / 2.0f;
        copyBounds(this.f75198d);
        this.f75199e.set(this.f75198d);
        float min = Math.min(this.f75209o.r().a(b()), this.f75199e.width() / 2.0f);
        if (this.f75209o.u(b())) {
            this.f75199e.inset(strokeWidth, strokeWidth);
            canvas.drawRoundRect(this.f75199e, min, min, this.f75196b);
        }
    }

    public void e(@Dimension float f11) {
        if (this.f75202h != f11) {
            this.f75202h = f11;
            this.f75196b.setStrokeWidth(f11 * 1.3333f);
            this.f75208n = true;
            invalidateSelf();
        }
    }

    public void f(@ColorInt int i11, @ColorInt int i12, @ColorInt int i13, @ColorInt int i14) {
        this.f75203i = i11;
        this.f75204j = i12;
        this.f75205k = i13;
        this.f75206l = i14;
    }

    public void g(p pVar) {
        this.f75209o = pVar;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    @Nullable
    public Drawable.ConstantState getConstantState() {
        return this.f75201g;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return this.f75202h > 0.0f ? -3 : -2;
    }

    @Override // android.graphics.drawable.Drawable
    @TargetApi(21)
    public void getOutline(@NonNull Outline outline) {
        if (this.f75209o.u(b())) {
            outline.setRoundRect(getBounds(), this.f75209o.r().a(b()));
        } else {
            copyBounds(this.f75198d);
            this.f75199e.set(this.f75198d);
            this.f75195a.d(this.f75209o, 1.0f, this.f75199e, this.f75197c);
            kn.d.l(outline, this.f75197c);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean getPadding(@NonNull Rect rect) {
        if (!this.f75209o.u(b())) {
            return true;
        }
        int round = Math.round(this.f75202h);
        rect.set(round, round, round, round);
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        ColorStateList colorStateList = this.f75210p;
        return (colorStateList != null && colorStateList.isStateful()) || super.isStateful();
    }

    @Override // android.graphics.drawable.Drawable
    public void onBoundsChange(Rect rect) {
        this.f75208n = true;
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onStateChange(int[] iArr) {
        int colorForState;
        ColorStateList colorStateList = this.f75210p;
        if (colorStateList != null && (colorForState = colorStateList.getColorForState(iArr, this.f75207m)) != this.f75207m) {
            this.f75208n = true;
            this.f75207m = colorForState;
        }
        if (this.f75208n) {
            invalidateSelf();
        }
        return this.f75208n;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(@IntRange(from = 0, to = 255) int i11) {
        this.f75196b.setAlpha(i11);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(@Nullable ColorFilter colorFilter) {
        this.f75196b.setColorFilter(colorFilter);
        invalidateSelf();
    }
}
