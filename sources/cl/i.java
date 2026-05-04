package cl;

import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes6.dex */
public class i extends Drawable {

    /* renamed from: a, reason: collision with root package name */
    public final Matrix f8750a;

    /* renamed from: b, reason: collision with root package name */
    public final RectF f8751b;

    /* renamed from: c, reason: collision with root package name */
    public final RectF f8752c;

    /* renamed from: d, reason: collision with root package name */
    public Drawable f8753d;

    /* renamed from: e, reason: collision with root package name */
    public a f8754e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f8755f;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a extends Drawable.ConstantState {

        /* renamed from: a, reason: collision with root package name */
        public final Drawable.ConstantState f8756a;

        /* renamed from: b, reason: collision with root package name */
        public final int f8757b;

        /* renamed from: c, reason: collision with root package name */
        public final int f8758c;

        public a(a aVar) {
            this(aVar.f8756a, aVar.f8757b, aVar.f8758c);
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            return 0;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        @NonNull
        public Drawable newDrawable() {
            return new i(this, this.f8756a.newDrawable());
        }

        public a(Drawable.ConstantState constantState, int i11, int i12) {
            this.f8756a = constantState;
            this.f8757b = i11;
            this.f8758c = i12;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        @NonNull
        public Drawable newDrawable(Resources resources) {
            return new i(this, this.f8756a.newDrawable(resources));
        }
    }

    public i(Drawable drawable, int i11, int i12) {
        this(new a(drawable.getConstantState(), i11, i12), drawable);
    }

    public final void a() {
        this.f8750a.setRectToRect(this.f8751b, this.f8752c, Matrix.ScaleToFit.CENTER);
    }

    @Override // android.graphics.drawable.Drawable
    public void clearColorFilter() {
        this.f8753d.clearColorFilter();
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(@NonNull Canvas canvas) {
        canvas.save();
        canvas.concat(this.f8750a);
        this.f8753d.draw(canvas);
        canvas.restore();
    }

    @Override // android.graphics.drawable.Drawable
    @RequiresApi(19)
    public int getAlpha() {
        return this.f8753d.getAlpha();
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable.Callback getCallback() {
        return this.f8753d.getCallback();
    }

    @Override // android.graphics.drawable.Drawable
    public int getChangingConfigurations() {
        return this.f8753d.getChangingConfigurations();
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable.ConstantState getConstantState() {
        return this.f8754e;
    }

    @Override // android.graphics.drawable.Drawable
    @NonNull
    public Drawable getCurrent() {
        return this.f8753d.getCurrent();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return this.f8754e.f8758c;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return this.f8754e.f8757b;
    }

    @Override // android.graphics.drawable.Drawable
    public int getMinimumHeight() {
        return this.f8753d.getMinimumHeight();
    }

    @Override // android.graphics.drawable.Drawable
    public int getMinimumWidth() {
        return this.f8753d.getMinimumWidth();
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return this.f8753d.getOpacity();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean getPadding(@NonNull Rect rect) {
        return this.f8753d.getPadding(rect);
    }

    @Override // android.graphics.drawable.Drawable
    public void invalidateSelf() {
        super.invalidateSelf();
        this.f8753d.invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    @NonNull
    public Drawable mutate() {
        if (!this.f8755f && super.mutate() == this) {
            this.f8753d = this.f8753d.mutate();
            this.f8754e = new a(this.f8754e);
            this.f8755f = true;
        }
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    public void scheduleSelf(@NonNull Runnable runnable, long j11) {
        super.scheduleSelf(runnable, j11);
        this.f8753d.scheduleSelf(runnable, j11);
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i11) {
        this.f8753d.setAlpha(i11);
    }

    @Override // android.graphics.drawable.Drawable
    public void setBounds(int i11, int i12, int i13, int i14) {
        super.setBounds(i11, i12, i13, i14);
        this.f8752c.set(i11, i12, i13, i14);
        a();
    }

    @Override // android.graphics.drawable.Drawable
    public void setChangingConfigurations(int i11) {
        this.f8753d.setChangingConfigurations(i11);
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(int i11, @NonNull PorterDuff.Mode mode) {
        this.f8753d.setColorFilter(i11, mode);
    }

    @Override // android.graphics.drawable.Drawable
    @Deprecated
    public void setDither(boolean z11) {
        this.f8753d.setDither(z11);
    }

    @Override // android.graphics.drawable.Drawable
    public void setFilterBitmap(boolean z11) {
        this.f8753d.setFilterBitmap(z11);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setVisible(boolean z11, boolean z12) {
        return this.f8753d.setVisible(z11, z12);
    }

    @Override // android.graphics.drawable.Drawable
    public void unscheduleSelf(@NonNull Runnable runnable) {
        super.unscheduleSelf(runnable);
        this.f8753d.unscheduleSelf(runnable);
    }

    public i(a aVar, Drawable drawable) {
        this.f8754e = (a) fl.m.e(aVar);
        this.f8753d = (Drawable) fl.m.e(drawable);
        drawable.setBounds(0, 0, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
        this.f8750a = new Matrix();
        this.f8751b = new RectF(0.0f, 0.0f, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
        this.f8752c = new RectF();
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.f8753d.setColorFilter(colorFilter);
    }

    @Override // android.graphics.drawable.Drawable
    public void setBounds(@NonNull Rect rect) {
        super.setBounds(rect);
        this.f8752c.set(rect);
        a();
    }
}
