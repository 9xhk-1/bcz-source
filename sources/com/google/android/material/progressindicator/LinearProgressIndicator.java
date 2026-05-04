package com.google.android.material.progressindicator;

import android.content.Context;
import android.util.AttributeSet;
import androidx.annotation.AttrRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.Px;
import androidx.annotation.RestrictTo;
import androidx.core.view.ViewCompat;
import com.google.android.material.R;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import rn.e;
import rn.i;
import rn.j;
import rn.k;
import rn.l;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public class LinearProgressIndicator extends BaseProgressIndicator<LinearProgressIndicatorSpec> {
    public static final int A = 0;
    public static final int B = 1;
    public static final int C = 0;
    public static final int D = 1;
    public static final int E = 2;
    public static final int F = 3;

    /* renamed from: z, reason: collision with root package name */
    public static final int f31873z = R.style.Widget_MaterialComponents_LinearProgressIndicator;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public @interface a {
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public @interface b {
    }

    public LinearProgressIndicator(@NonNull Context context) {
        this(context, null);
    }

    private void u() {
        j jVar = new j((LinearProgressIndicatorSpec) this.f31851a);
        setIndeterminateDrawable(i.y(getContext(), (LinearProgressIndicatorSpec) this.f31851a, jVar));
        setProgressDrawable(e.B(getContext(), (LinearProgressIndicatorSpec) this.f31851a, jVar));
    }

    public int getIndeterminateAnimationType() {
        return ((LinearProgressIndicatorSpec) this.f31851a).f31874h;
    }

    public int getIndicatorDirection() {
        return ((LinearProgressIndicatorSpec) this.f31851a).f31875i;
    }

    @Px
    public int getTrackStopIndicatorSize() {
        return ((LinearProgressIndicatorSpec) this.f31851a).f31877k;
    }

    @Override // android.view.View
    public void onLayout(boolean z11, int i11, int i12, int i13, int i14) {
        super.onLayout(z11, i11, i12, i13, i14);
        S s11 = this.f31851a;
        LinearProgressIndicatorSpec linearProgressIndicatorSpec = (LinearProgressIndicatorSpec) s11;
        boolean z12 = true;
        if (((LinearProgressIndicatorSpec) s11).f31875i != 1 && ((ViewCompat.getLayoutDirection(this) != 1 || ((LinearProgressIndicatorSpec) this.f31851a).f31875i != 2) && (ViewCompat.getLayoutDirection(this) != 0 || ((LinearProgressIndicatorSpec) this.f31851a).f31875i != 3))) {
            z12 = false;
        }
        linearProgressIndicatorSpec.f31876j = z12;
    }

    @Override // android.widget.ProgressBar, android.view.View
    public void onSizeChanged(int i11, int i12, int i13, int i14) {
        int paddingLeft = i11 - (getPaddingLeft() + getPaddingRight());
        int paddingTop = i12 - (getPaddingTop() + getPaddingBottom());
        i<LinearProgressIndicatorSpec> indeterminateDrawable = getIndeterminateDrawable();
        if (indeterminateDrawable != null) {
            indeterminateDrawable.setBounds(0, 0, paddingLeft, paddingTop);
        }
        e<LinearProgressIndicatorSpec> progressDrawable = getProgressDrawable();
        if (progressDrawable != null) {
            progressDrawable.setBounds(0, 0, paddingLeft, paddingTop);
        }
    }

    @Override // com.google.android.material.progressindicator.BaseProgressIndicator
    public void p(int i11, boolean z11) {
        S s11 = this.f31851a;
        if (s11 != 0 && ((LinearProgressIndicatorSpec) s11).f31874h == 0 && isIndeterminate()) {
            return;
        }
        super.p(i11, z11);
    }

    public void setIndeterminateAnimationType(int i11) {
        if (((LinearProgressIndicatorSpec) this.f31851a).f31874h == i11) {
            return;
        }
        if (s() && isIndeterminate()) {
            throw new IllegalStateException("Cannot change indeterminate animation type while the progress indicator is show in indeterminate mode.");
        }
        S s11 = this.f31851a;
        ((LinearProgressIndicatorSpec) s11).f31874h = i11;
        ((LinearProgressIndicatorSpec) s11).e();
        if (i11 == 0) {
            getIndeterminateDrawable().D(new k((LinearProgressIndicatorSpec) this.f31851a));
        } else {
            getIndeterminateDrawable().D(new l(getContext(), (LinearProgressIndicatorSpec) this.f31851a));
        }
        invalidate();
    }

    @Override // com.google.android.material.progressindicator.BaseProgressIndicator
    public void setIndicatorColor(@NonNull int... iArr) {
        super.setIndicatorColor(iArr);
        ((LinearProgressIndicatorSpec) this.f31851a).e();
    }

    public void setIndicatorDirection(int i11) {
        S s11 = this.f31851a;
        ((LinearProgressIndicatorSpec) s11).f31875i = i11;
        LinearProgressIndicatorSpec linearProgressIndicatorSpec = (LinearProgressIndicatorSpec) s11;
        boolean z11 = true;
        if (i11 != 1 && ((ViewCompat.getLayoutDirection(this) != 1 || ((LinearProgressIndicatorSpec) this.f31851a).f31875i != 2) && (ViewCompat.getLayoutDirection(this) != 0 || i11 != 3))) {
            z11 = false;
        }
        linearProgressIndicatorSpec.f31876j = z11;
        invalidate();
    }

    @Override // com.google.android.material.progressindicator.BaseProgressIndicator
    public void setTrackCornerRadius(int i11) {
        super.setTrackCornerRadius(i11);
        ((LinearProgressIndicatorSpec) this.f31851a).e();
        invalidate();
    }

    public void setTrackStopIndicatorSize(@Px int i11) {
        S s11 = this.f31851a;
        if (((LinearProgressIndicatorSpec) s11).f31877k != i11) {
            ((LinearProgressIndicatorSpec) s11).f31877k = Math.min(i11, ((LinearProgressIndicatorSpec) s11).f84320a);
            ((LinearProgressIndicatorSpec) this.f31851a).e();
            invalidate();
        }
    }

    @Override // com.google.android.material.progressindicator.BaseProgressIndicator
    /* renamed from: t, reason: merged with bridge method [inline-methods] */
    public LinearProgressIndicatorSpec i(@NonNull Context context, @NonNull AttributeSet attributeSet) {
        return new LinearProgressIndicatorSpec(context, attributeSet);
    }

    public LinearProgressIndicator(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.linearProgressIndicatorStyle);
    }

    public LinearProgressIndicator(@NonNull Context context, @Nullable AttributeSet attributeSet, @AttrRes int i11) {
        super(context, attributeSet, i11, f31873z);
        u();
    }
}
