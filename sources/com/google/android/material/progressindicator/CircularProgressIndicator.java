package com.google.android.material.progressindicator;

import android.content.Context;
import android.util.AttributeSet;
import androidx.annotation.AttrRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.Px;
import androidx.annotation.RestrictTo;
import com.google.android.material.R;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import rn.c;
import rn.e;
import rn.i;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public class CircularProgressIndicator extends BaseProgressIndicator<CircularProgressIndicatorSpec> {
    public static final int A = 0;
    public static final int B = 1;

    /* renamed from: z, reason: collision with root package name */
    public static final int f31869z = R.style.Widget_MaterialComponents_CircularProgressIndicator;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public @interface a {
    }

    public CircularProgressIndicator(@NonNull Context context) {
        this(context, null);
    }

    public int getIndicatorDirection() {
        return ((CircularProgressIndicatorSpec) this.f31851a).f31872j;
    }

    @Px
    public int getIndicatorInset() {
        return ((CircularProgressIndicatorSpec) this.f31851a).f31871i;
    }

    @Px
    public int getIndicatorSize() {
        return ((CircularProgressIndicatorSpec) this.f31851a).f31870h;
    }

    public void setIndicatorDirection(int i11) {
        ((CircularProgressIndicatorSpec) this.f31851a).f31872j = i11;
        invalidate();
    }

    public void setIndicatorInset(@Px int i11) {
        S s11 = this.f31851a;
        if (((CircularProgressIndicatorSpec) s11).f31871i != i11) {
            ((CircularProgressIndicatorSpec) s11).f31871i = i11;
            invalidate();
        }
    }

    public void setIndicatorSize(@Px int i11) {
        int max = Math.max(i11, getTrackThickness() * 2);
        S s11 = this.f31851a;
        if (((CircularProgressIndicatorSpec) s11).f31870h != max) {
            ((CircularProgressIndicatorSpec) s11).f31870h = max;
            ((CircularProgressIndicatorSpec) s11).e();
            requestLayout();
            invalidate();
        }
    }

    @Override // com.google.android.material.progressindicator.BaseProgressIndicator
    public void setTrackThickness(int i11) {
        super.setTrackThickness(i11);
        ((CircularProgressIndicatorSpec) this.f31851a).e();
    }

    @Override // com.google.android.material.progressindicator.BaseProgressIndicator
    /* renamed from: t, reason: merged with bridge method [inline-methods] */
    public CircularProgressIndicatorSpec i(@NonNull Context context, @NonNull AttributeSet attributeSet) {
        return new CircularProgressIndicatorSpec(context, attributeSet);
    }

    public final void u() {
        c cVar = new c((CircularProgressIndicatorSpec) this.f31851a);
        setIndeterminateDrawable(i.w(getContext(), (CircularProgressIndicatorSpec) this.f31851a, cVar));
        setProgressDrawable(e.z(getContext(), (CircularProgressIndicatorSpec) this.f31851a, cVar));
    }

    public CircularProgressIndicator(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.circularProgressIndicatorStyle);
    }

    public CircularProgressIndicator(@NonNull Context context, @Nullable AttributeSet attributeSet, @AttrRes int i11) {
        super(context, attributeSet, i11, f31869z);
        u();
    }
}
