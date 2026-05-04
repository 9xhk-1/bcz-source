package com.google.android.material.progressindicator;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import androidx.annotation.AttrRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.Px;
import androidx.annotation.StyleRes;
import com.google.android.material.R;
import com.google.android.material.internal.d0;
import rn.b;
import sn.c;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public final class CircularProgressIndicatorSpec extends b {

    /* renamed from: h, reason: collision with root package name */
    @Px
    public int f31870h;

    /* renamed from: i, reason: collision with root package name */
    @Px
    public int f31871i;

    /* renamed from: j, reason: collision with root package name */
    public int f31872j;

    public CircularProgressIndicatorSpec(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.circularProgressIndicatorStyle);
    }

    public int f() {
        if (this.f84326g == 0) {
            return 0;
        }
        return (int) Math.round(360.0d / ((((this.f31870h - (this.f31871i * 2)) - this.f84320a) * 3.141592653589793d) / (r0 + this.f84321b)));
    }

    public CircularProgressIndicatorSpec(@NonNull Context context, @Nullable AttributeSet attributeSet, @AttrRes int i11) {
        this(context, attributeSet, i11, CircularProgressIndicator.f31869z);
    }

    public CircularProgressIndicatorSpec(@NonNull Context context, @Nullable AttributeSet attributeSet, @AttrRes int i11, @StyleRes int i12) {
        super(context, attributeSet, i11, i12);
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.mtrl_progress_circular_size_medium);
        int dimensionPixelSize2 = context.getResources().getDimensionPixelSize(R.dimen.mtrl_progress_circular_inset_medium);
        TypedArray k11 = d0.k(context, attributeSet, R.styleable.CircularProgressIndicator, i11, i12, new int[0]);
        this.f31870h = Math.max(c.d(context, k11, R.styleable.CircularProgressIndicator_indicatorSize, dimensionPixelSize), this.f84320a * 2);
        this.f31871i = c.d(context, k11, R.styleable.CircularProgressIndicator_indicatorInset, dimensionPixelSize2);
        this.f31872j = k11.getInt(R.styleable.CircularProgressIndicator_indicatorDirectionCircular, 0);
        k11.recycle();
        e();
    }
}
