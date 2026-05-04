package h0;

import android.content.res.ColorStateList;
import android.graphics.BlendMode;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import androidx.annotation.RequiresApi;
import coil.size.Scale;
import f0.g;
import kotlin.jvm.internal.u0;
import kotlin.jvm.internal.v;
import m80.k;
import m80.l;
import yz.n;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nScaleDrawable.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ScaleDrawable.kt\ncoil/drawable/ScaleDrawable\n+ 2 Canvas.kt\nandroidx/core/graphics/CanvasKt\n*L\n1#1,120:1\n30#2,7:121\n*S KotlinDebug\n*F\n+ 1 ScaleDrawable.kt\ncoil/drawable/ScaleDrawable\n*L\n38#1:121,7\n*E\n"})
/* loaded from: classes3.dex */
public final class d extends Drawable implements Drawable.Callback, Animatable {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final Drawable f57881a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final Scale f57882b;

    /* renamed from: c, reason: collision with root package name */
    public float f57883c;

    /* renamed from: d, reason: collision with root package name */
    public float f57884d;

    /* renamed from: e, reason: collision with root package name */
    public float f57885e;

    /* JADX WARN: Multi-variable type inference failed */
    @w00.k
    public d(@k Drawable drawable) {
        this(drawable, null, 2, 0 == true ? 1 : 0);
    }

    @k
    public final Drawable a() {
        return this.f57881a;
    }

    @k
    public final Scale b() {
        return this.f57882b;
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(@k Canvas canvas) {
        int save = canvas.save();
        try {
            canvas.translate(this.f57883c, this.f57884d);
            float f11 = this.f57885e;
            canvas.scale(f11, f11);
            this.f57881a.draw(canvas);
        } finally {
            canvas.restoreToCount(save);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.f57881a.getAlpha();
    }

    @Override // android.graphics.drawable.Drawable
    @l
    public ColorFilter getColorFilter() {
        return this.f57881a.getColorFilter();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return this.f57881a.getIntrinsicHeight();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return this.f57881a.getIntrinsicWidth();
    }

    @Override // android.graphics.drawable.Drawable
    @n(message = "Deprecated in Java")
    public int getOpacity() {
        return this.f57881a.getOpacity();
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void invalidateDrawable(@k Drawable drawable) {
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Animatable
    public boolean isRunning() {
        Object obj = this.f57881a;
        return (obj instanceof Animatable) && ((Animatable) obj).isRunning();
    }

    @Override // android.graphics.drawable.Drawable
    public void onBoundsChange(@k Rect rect) {
        int intrinsicWidth = this.f57881a.getIntrinsicWidth();
        int intrinsicHeight = this.f57881a.getIntrinsicHeight();
        if (intrinsicWidth <= 0 || intrinsicHeight <= 0) {
            this.f57881a.setBounds(rect);
            this.f57883c = 0.0f;
            this.f57884d = 0.0f;
            this.f57885e = 1.0f;
            return;
        }
        int width = rect.width();
        int height = rect.height();
        double c11 = g.c(intrinsicWidth, intrinsicHeight, width, height, this.f57882b);
        double d11 = 2;
        int K0 = c10.d.K0((width - (intrinsicWidth * c11)) / d11);
        int K02 = c10.d.K0((height - (intrinsicHeight * c11)) / d11);
        this.f57881a.setBounds(K0, K02, intrinsicWidth + K0, intrinsicHeight + K02);
        this.f57883c = rect.left;
        this.f57884d = rect.top;
        this.f57885e = (float) c11;
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onLevelChange(int i11) {
        return this.f57881a.setLevel(i11);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onStateChange(@k int[] iArr) {
        return this.f57881a.setState(iArr);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void scheduleDrawable(@k Drawable drawable, @k Runnable runnable, long j11) {
        scheduleSelf(runnable, j11);
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i11) {
        this.f57881a.setAlpha(i11);
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(@l ColorFilter colorFilter) {
        this.f57881a.setColorFilter(colorFilter);
    }

    @Override // android.graphics.drawable.Drawable
    public void setTint(int i11) {
        this.f57881a.setTint(i11);
    }

    @Override // android.graphics.drawable.Drawable
    @RequiresApi(29)
    public void setTintBlendMode(@l BlendMode blendMode) {
        this.f57881a.setTintBlendMode(blendMode);
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintList(@l ColorStateList colorStateList) {
        this.f57881a.setTintList(colorStateList);
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintMode(@l PorterDuff.Mode mode) {
        this.f57881a.setTintMode(mode);
    }

    @Override // android.graphics.drawable.Animatable
    public void start() {
        Object obj = this.f57881a;
        if (obj instanceof Animatable) {
            ((Animatable) obj).start();
        }
    }

    @Override // android.graphics.drawable.Animatable
    public void stop() {
        Object obj = this.f57881a;
        if (obj instanceof Animatable) {
            ((Animatable) obj).stop();
        }
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void unscheduleDrawable(@k Drawable drawable, @k Runnable runnable) {
        unscheduleSelf(runnable);
    }

    public /* synthetic */ d(Drawable drawable, Scale scale, int i11, v vVar) {
        this(drawable, (i11 & 2) != 0 ? Scale.FIT : scale);
    }

    @w00.k
    public d(@k Drawable drawable, @k Scale scale) {
        this.f57881a = drawable;
        this.f57882b = scale;
        this.f57885e = 1.0f;
        drawable.setCallback(this);
    }
}
