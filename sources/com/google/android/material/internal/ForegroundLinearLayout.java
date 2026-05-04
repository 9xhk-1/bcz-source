package com.google.android.material.internal;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.Gravity;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.core.view.GravityCompat;
import com.google.android.material.R;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes7.dex */
public class ForegroundLinearLayout extends LinearLayoutCompat {

    /* renamed from: a, reason: collision with root package name */
    @Nullable
    public Drawable f31469a;

    /* renamed from: b, reason: collision with root package name */
    public final Rect f31470b;

    /* renamed from: c, reason: collision with root package name */
    public final Rect f31471c;

    /* renamed from: d, reason: collision with root package name */
    public int f31472d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f31473e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f31474f;

    public ForegroundLinearLayout(@NonNull Context context) {
        this(context, null);
    }

    @Override // android.view.View
    public void draw(@NonNull Canvas canvas) {
        super.draw(canvas);
        Drawable drawable = this.f31469a;
        if (drawable != null) {
            if (this.f31474f) {
                this.f31474f = false;
                Rect rect = this.f31470b;
                Rect rect2 = this.f31471c;
                int right = getRight() - getLeft();
                int bottom = getBottom() - getTop();
                if (this.f31473e) {
                    rect.set(0, 0, right, bottom);
                } else {
                    rect.set(getPaddingLeft(), getPaddingTop(), right - getPaddingRight(), bottom - getPaddingBottom());
                }
                Gravity.apply(this.f31472d, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight(), rect, rect2);
                drawable.setBounds(rect2);
            }
            drawable.draw(canvas);
        }
    }

    @Override // android.view.View
    @RequiresApi(21)
    @TargetApi(21)
    public void drawableHotspotChanged(float f11, float f12) {
        super.drawableHotspotChanged(f11, f12);
        Drawable drawable = this.f31469a;
        if (drawable != null) {
            drawable.setHotspot(f11, f12);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.f31469a;
        if (drawable == null || !drawable.isStateful()) {
            return;
        }
        this.f31469a.setState(getDrawableState());
    }

    @Override // android.view.View
    @Nullable
    public Drawable getForeground() {
        return this.f31469a;
    }

    @Override // android.view.View
    public int getForegroundGravity() {
        return this.f31472d;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.f31469a;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
    }

    @Override // androidx.appcompat.widget.LinearLayoutCompat, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z11, int i11, int i12, int i13, int i14) {
        super.onLayout(z11, i11, i12, i13, i14);
        this.f31474f = z11 | this.f31474f;
    }

    @Override // android.view.View
    public void onSizeChanged(int i11, int i12, int i13, int i14) {
        super.onSizeChanged(i11, i12, i13, i14);
        this.f31474f = true;
    }

    @Override // android.view.View
    public void setForeground(@Nullable Drawable drawable) {
        Drawable drawable2 = this.f31469a;
        if (drawable2 != drawable) {
            if (drawable2 != null) {
                drawable2.setCallback(null);
                unscheduleDrawable(this.f31469a);
            }
            this.f31469a = drawable;
            this.f31474f = true;
            if (drawable != null) {
                setWillNotDraw(false);
                drawable.setCallback(this);
                if (drawable.isStateful()) {
                    drawable.setState(getDrawableState());
                }
                if (this.f31472d == 119) {
                    drawable.getPadding(new Rect());
                }
            } else {
                setWillNotDraw(true);
            }
            requestLayout();
            invalidate();
        }
    }

    @Override // android.view.View
    public void setForegroundGravity(int i11) {
        if (this.f31472d != i11) {
            if ((8388615 & i11) == 0) {
                i11 |= GravityCompat.START;
            }
            if ((i11 & 112) == 0) {
                i11 |= 48;
            }
            this.f31472d = i11;
            if (i11 == 119 && this.f31469a != null) {
                this.f31469a.getPadding(new Rect());
            }
            requestLayout();
        }
    }

    @Override // android.view.View
    public boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.f31469a;
    }

    public ForegroundLinearLayout(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ForegroundLinearLayout(@NonNull Context context, @Nullable AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        this.f31470b = new Rect();
        this.f31471c = new Rect();
        this.f31472d = 119;
        this.f31473e = true;
        this.f31474f = false;
        TypedArray k11 = d0.k(context, attributeSet, R.styleable.ForegroundLinearLayout, i11, 0, new int[0]);
        this.f31472d = k11.getInt(R.styleable.ForegroundLinearLayout_android_foregroundGravity, this.f31472d);
        Drawable drawable = k11.getDrawable(R.styleable.ForegroundLinearLayout_android_foreground);
        if (drawable != null) {
            setForeground(drawable);
        }
        this.f31473e = k11.getBoolean(R.styleable.ForegroundLinearLayout_foregroundInsidePadding, true);
        k11.recycle();
    }
}
