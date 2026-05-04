package tn;

import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import androidx.annotation.ColorInt;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.core.graphics.drawable.TintAwareDrawable;
import vn.k;
import vn.p;
import vn.t;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes7.dex */
public class a extends Drawable implements t, TintAwareDrawable {

    /* renamed from: a, reason: collision with root package name */
    public b f90828a;

    @Override // android.graphics.drawable.Drawable
    @NonNull
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public a mutate() {
        this.f90828a = new b(this.f90828a);
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        b bVar = this.f90828a;
        if (bVar.f90830b) {
            bVar.f90829a.draw(canvas);
        }
    }

    @Override // android.graphics.drawable.Drawable
    @Nullable
    public Drawable.ConstantState getConstantState() {
        return this.f90828a;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return this.f90828a.f90829a.getOpacity();
    }

    @Override // vn.t
    @NonNull
    public p getShapeAppearanceModel() {
        return this.f90828a.f90829a.getShapeAppearanceModel();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public void onBoundsChange(@NonNull Rect rect) {
        super.onBoundsChange(rect);
        this.f90828a.f90829a.setBounds(rect);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onStateChange(@NonNull int[] iArr) {
        boolean onStateChange = super.onStateChange(iArr);
        if (this.f90828a.f90829a.setState(iArr)) {
            onStateChange = true;
        }
        boolean f11 = tn.b.f(iArr);
        b bVar = this.f90828a;
        if (bVar.f90830b == f11) {
            return onStateChange;
        }
        bVar.f90830b = f11;
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i11) {
        this.f90828a.f90829a.setAlpha(i11);
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(@Nullable ColorFilter colorFilter) {
        this.f90828a.f90829a.setColorFilter(colorFilter);
    }

    @Override // vn.t
    public void setShapeAppearanceModel(@NonNull p pVar) {
        this.f90828a.f90829a.setShapeAppearanceModel(pVar);
    }

    @Override // android.graphics.drawable.Drawable, androidx.core.graphics.drawable.TintAwareDrawable
    public void setTint(@ColorInt int i11) {
        this.f90828a.f90829a.setTint(i11);
    }

    @Override // android.graphics.drawable.Drawable, androidx.core.graphics.drawable.TintAwareDrawable
    public void setTintList(@Nullable ColorStateList colorStateList) {
        this.f90828a.f90829a.setTintList(colorStateList);
    }

    @Override // android.graphics.drawable.Drawable, androidx.core.graphics.drawable.TintAwareDrawable
    public void setTintMode(@Nullable PorterDuff.Mode mode) {
        this.f90828a.f90829a.setTintMode(mode);
    }

    public a(p pVar) {
        this(new b(new k(pVar)));
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class b extends Drawable.ConstantState {

        /* renamed from: a, reason: collision with root package name */
        @NonNull
        public k f90829a;

        /* renamed from: b, reason: collision with root package name */
        public boolean f90830b;

        public b(k kVar) {
            this.f90829a = kVar;
            this.f90830b = false;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        @NonNull
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public a newDrawable() {
            return new a(new b(this));
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            return 0;
        }

        public b(@NonNull b bVar) {
            this.f90829a = (k) bVar.f90829a.getConstantState().newDrawable();
            this.f90830b = bVar.f90830b;
        }
    }

    public a(b bVar) {
        this.f90828a = bVar;
    }
}
