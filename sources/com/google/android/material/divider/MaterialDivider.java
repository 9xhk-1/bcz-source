package com.google.android.material.divider;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;
import androidx.annotation.ColorInt;
import androidx.annotation.ColorRes;
import androidx.annotation.DimenRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.Px;
import androidx.core.content.ContextCompat;
import androidx.core.view.ViewCompat;
import com.google.android.material.R;
import vn.k;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public class MaterialDivider extends View {

    /* renamed from: f, reason: collision with root package name */
    public static final int f31306f = R.style.Widget_MaterialComponents_MaterialDivider;

    /* renamed from: a, reason: collision with root package name */
    @NonNull
    public final k f31307a;

    /* renamed from: b, reason: collision with root package name */
    public int f31308b;

    /* renamed from: c, reason: collision with root package name */
    @ColorInt
    public int f31309c;

    /* renamed from: d, reason: collision with root package name */
    public int f31310d;

    /* renamed from: e, reason: collision with root package name */
    public int f31311e;

    public MaterialDivider(@NonNull Context context) {
        this(context, null);
    }

    public int getDividerColor() {
        return this.f31309c;
    }

    @Px
    public int getDividerInsetEnd() {
        return this.f31311e;
    }

    @Px
    public int getDividerInsetStart() {
        return this.f31310d;
    }

    public int getDividerThickness() {
        return this.f31308b;
    }

    @Override // android.view.View
    public void onDraw(@NonNull Canvas canvas) {
        int width;
        int i11;
        super.onDraw(canvas);
        boolean z11 = ViewCompat.getLayoutDirection(this) == 1;
        int i12 = z11 ? this.f31311e : this.f31310d;
        if (z11) {
            width = getWidth();
            i11 = this.f31310d;
        } else {
            width = getWidth();
            i11 = this.f31311e;
        }
        this.f31307a.setBounds(i12, 0, width - i11, getBottom() - getTop());
        this.f31307a.draw(canvas);
    }

    @Override // android.view.View
    public void onMeasure(int i11, int i12) {
        super.onMeasure(i11, i12);
        int mode = View.MeasureSpec.getMode(i12);
        int measuredHeight = getMeasuredHeight();
        if (mode == Integer.MIN_VALUE || mode == 0) {
            int i13 = this.f31308b;
            if (i13 > 0 && measuredHeight != i13) {
                measuredHeight = i13;
            }
            setMeasuredDimension(getMeasuredWidth(), measuredHeight);
        }
    }

    public void setDividerColor(@ColorInt int i11) {
        if (this.f31309c != i11) {
            this.f31309c = i11;
            this.f31307a.p0(ColorStateList.valueOf(i11));
            invalidate();
        }
    }

    public void setDividerColorResource(@ColorRes int i11) {
        setDividerColor(ContextCompat.getColor(getContext(), i11));
    }

    public void setDividerInsetEnd(@Px int i11) {
        this.f31311e = i11;
    }

    public void setDividerInsetEndResource(@DimenRes int i11) {
        setDividerInsetEnd(getContext().getResources().getDimensionPixelOffset(i11));
    }

    public void setDividerInsetStart(@Px int i11) {
        this.f31310d = i11;
    }

    public void setDividerInsetStartResource(@DimenRes int i11) {
        setDividerInsetStart(getContext().getResources().getDimensionPixelOffset(i11));
    }

    public void setDividerThickness(@Px int i11) {
        if (this.f31308b != i11) {
            this.f31308b = i11;
            requestLayout();
        }
    }

    public void setDividerThicknessResource(@DimenRes int i11) {
        setDividerThickness(getContext().getResources().getDimensionPixelSize(i11));
    }

    public MaterialDivider(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.materialDividerStyle);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public MaterialDivider(@androidx.annotation.NonNull android.content.Context r7, @androidx.annotation.Nullable android.util.AttributeSet r8, int r9) {
        /*
            r6 = this;
            int r4 = com.google.android.material.divider.MaterialDivider.f31306f
            android.content.Context r7 = zn.a.c(r7, r8, r9, r4)
            r6.<init>(r7, r8, r9)
            android.content.Context r0 = r6.getContext()
            vn.k r7 = new vn.k
            r7.<init>()
            r6.f31307a = r7
            int[] r2 = com.google.android.material.R.styleable.MaterialDivider
            r7 = 0
            int[] r5 = new int[r7]
            r1 = r8
            r3 = r9
            android.content.res.TypedArray r8 = com.google.android.material.internal.d0.k(r0, r1, r2, r3, r4, r5)
            int r9 = com.google.android.material.R.styleable.MaterialDivider_dividerThickness
            android.content.res.Resources r1 = r6.getResources()
            int r2 = com.google.android.material.R.dimen.material_divider_thickness
            int r1 = r1.getDimensionPixelSize(r2)
            int r9 = r8.getDimensionPixelSize(r9, r1)
            r6.f31308b = r9
            int r9 = com.google.android.material.R.styleable.MaterialDivider_dividerInsetStart
            int r9 = r8.getDimensionPixelOffset(r9, r7)
            r6.f31310d = r9
            int r9 = com.google.android.material.R.styleable.MaterialDivider_dividerInsetEnd
            int r7 = r8.getDimensionPixelOffset(r9, r7)
            r6.f31311e = r7
            int r7 = com.google.android.material.R.styleable.MaterialDivider_dividerColor
            android.content.res.ColorStateList r7 = sn.c.a(r0, r8, r7)
            int r7 = r7.getDefaultColor()
            r6.setDividerColor(r7)
            r8.recycle()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.divider.MaterialDivider.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }
}
