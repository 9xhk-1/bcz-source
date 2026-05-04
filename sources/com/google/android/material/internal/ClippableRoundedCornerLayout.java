package com.google.android.material.internal;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes7.dex */
public class ClippableRoundedCornerLayout extends FrameLayout {

    /* renamed from: a, reason: collision with root package name */
    @Nullable
    public Path f31463a;

    /* renamed from: b, reason: collision with root package name */
    public float f31464b;

    public ClippableRoundedCornerLayout(@NonNull Context context) {
        super(context);
    }

    public void a() {
        this.f31463a = null;
        this.f31464b = 0.0f;
        invalidate();
    }

    public void b(float f11, float f12, float f13, float f14, float f15) {
        d(new RectF(f11, f12, f13, f14), f15);
    }

    public void c(@NonNull Rect rect, float f11) {
        b(rect.left, rect.top, rect.right, rect.bottom, f11);
    }

    public void d(@NonNull RectF rectF, float f11) {
        if (this.f31463a == null) {
            this.f31463a = new Path();
        }
        this.f31464b = f11;
        this.f31463a.reset();
        this.f31463a.addRoundRect(rectF, f11, f11, Path.Direction.CW);
        this.f31463a.close();
        invalidate();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        if (this.f31463a == null) {
            super.dispatchDraw(canvas);
            return;
        }
        int save = canvas.save();
        canvas.clipPath(this.f31463a);
        super.dispatchDraw(canvas);
        canvas.restoreToCount(save);
    }

    public void e(float f11) {
        b(getLeft(), getTop(), getRight(), getBottom(), f11);
    }

    public float getCornerRadius() {
        return this.f31464b;
    }

    public ClippableRoundedCornerLayout(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public ClippableRoundedCornerLayout(@NonNull Context context, @Nullable AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
    }
}
