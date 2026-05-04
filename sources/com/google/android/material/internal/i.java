package com.google.android.material.internal;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.drawable.Drawable;
import androidx.annotation.FloatRange;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes7.dex */
public class i extends Drawable {

    /* renamed from: a, reason: collision with root package name */
    public final Drawable f31590a;

    /* renamed from: b, reason: collision with root package name */
    public final Drawable f31591b;

    /* renamed from: c, reason: collision with root package name */
    public final float[] f31592c;

    /* renamed from: d, reason: collision with root package name */
    public float f31593d;

    public i(@NonNull Drawable drawable, @NonNull Drawable drawable2) {
        this.f31590a = drawable.getConstantState().newDrawable().mutate();
        Drawable mutate = drawable2.getConstantState().newDrawable().mutate();
        this.f31591b = mutate;
        mutate.setAlpha(0);
        this.f31592c = new float[2];
    }

    public void a(@FloatRange(from = 0.0d, to = 1.0d) float f11) {
        if (this.f31593d != f11) {
            this.f31593d = f11;
            k.a(f11, this.f31592c);
            this.f31590a.setAlpha((int) (this.f31592c[0] * 255.0f));
            this.f31591b.setAlpha((int) (this.f31592c[1] * 255.0f));
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(@NonNull Canvas canvas) {
        this.f31590a.draw(canvas);
        this.f31591b.draw(canvas);
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return Math.max(this.f31590a.getIntrinsicHeight(), this.f31591b.getIntrinsicHeight());
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return Math.max(this.f31590a.getIntrinsicWidth(), this.f31591b.getIntrinsicWidth());
    }

    @Override // android.graphics.drawable.Drawable
    public int getMinimumHeight() {
        return Math.max(this.f31590a.getMinimumHeight(), this.f31591b.getMinimumHeight());
    }

    @Override // android.graphics.drawable.Drawable
    public int getMinimumWidth() {
        return Math.max(this.f31590a.getMinimumWidth(), this.f31591b.getMinimumWidth());
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        return this.f31590a.isStateful() || this.f31591b.isStateful();
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i11) {
        if (this.f31593d <= 0.5f) {
            this.f31590a.setAlpha(i11);
            this.f31591b.setAlpha(0);
        } else {
            this.f31590a.setAlpha(0);
            this.f31591b.setAlpha(i11);
        }
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setBounds(int i11, int i12, int i13, int i14) {
        super.setBounds(i11, i12, i13, i14);
        this.f31590a.setBounds(i11, i12, i13, i14);
        this.f31591b.setBounds(i11, i12, i13, i14);
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(@Nullable ColorFilter colorFilter) {
        this.f31590a.setColorFilter(colorFilter);
        this.f31591b.setColorFilter(colorFilter);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setState(int[] iArr) {
        return this.f31590a.setState(iArr) || this.f31591b.setState(iArr);
    }
}
