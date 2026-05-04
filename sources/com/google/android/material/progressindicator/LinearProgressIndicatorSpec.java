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

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public final class LinearProgressIndicatorSpec extends b {

    /* renamed from: h, reason: collision with root package name */
    public int f31874h;

    /* renamed from: i, reason: collision with root package name */
    public int f31875i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f31876j;

    /* renamed from: k, reason: collision with root package name */
    @Px
    public int f31877k;

    public LinearProgressIndicatorSpec(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.linearProgressIndicatorStyle);
    }

    @Override // rn.b
    public void e() {
        super.e();
        if (this.f31877k < 0) {
            throw new IllegalArgumentException("Stop indicator size must be >= 0.");
        }
        if (this.f31874h == 0) {
            if (this.f84321b > 0 && this.f84326g == 0) {
                throw new IllegalArgumentException("Rounded corners without gap are not supported in contiguous indeterminate animation.");
            }
            if (this.f84322c.length < 3) {
                throw new IllegalArgumentException("Contiguous indeterminate animation must be used with 3 or more indicator colors.");
            }
        }
    }

    public LinearProgressIndicatorSpec(@NonNull Context context, @Nullable AttributeSet attributeSet, @AttrRes int i11) {
        this(context, attributeSet, i11, LinearProgressIndicator.f31873z);
    }

    public LinearProgressIndicatorSpec(@NonNull Context context, @Nullable AttributeSet attributeSet, @AttrRes int i11, @StyleRes int i12) {
        super(context, attributeSet, i11, i12);
        TypedArray k11 = d0.k(context, attributeSet, R.styleable.LinearProgressIndicator, R.attr.linearProgressIndicatorStyle, LinearProgressIndicator.f31873z, new int[0]);
        this.f31874h = k11.getInt(R.styleable.LinearProgressIndicator_indeterminateAnimationType, 1);
        this.f31875i = k11.getInt(R.styleable.LinearProgressIndicator_indicatorDirectionLinear, 0);
        this.f31877k = Math.min(k11.getDimensionPixelSize(R.styleable.LinearProgressIndicator_trackStopIndicatorSize, 0), this.f84320a);
        k11.recycle();
        e();
        this.f31876j = this.f31875i == 1;
    }
}
