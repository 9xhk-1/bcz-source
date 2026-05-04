package com.google.android.material.snackbar;

import android.animation.TimeInterpolator;
import android.content.Context;
import android.text.Layout;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.core.view.ViewCompat;
import com.google.android.material.R;
import en.u;
import pn.j;
import vm.b;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes7.dex */
public class SnackbarContentLayout extends LinearLayout implements xn.a {

    /* renamed from: a, reason: collision with root package name */
    public TextView f32205a;

    /* renamed from: b, reason: collision with root package name */
    public Button f32206b;

    /* renamed from: c, reason: collision with root package name */
    public final TimeInterpolator f32207c;

    /* renamed from: d, reason: collision with root package name */
    public int f32208d;

    public SnackbarContentLayout(@NonNull Context context) {
        this(context, null);
    }

    public static void d(@NonNull View view, int i11, int i12) {
        if (ViewCompat.isPaddingRelative(view)) {
            ViewCompat.setPaddingRelative(view, ViewCompat.getPaddingStart(view), i11, ViewCompat.getPaddingEnd(view), i12);
        } else {
            view.setPadding(view.getPaddingLeft(), i11, view.getPaddingRight(), i12);
        }
    }

    @Override // xn.a
    public void a(int i11, int i12) {
        this.f32205a.setAlpha(0.0f);
        long j11 = i12;
        long j12 = i11;
        this.f32205a.animate().alpha(1.0f).setDuration(j11).setInterpolator(this.f32207c).setStartDelay(j12).start();
        if (this.f32206b.getVisibility() == 0) {
            this.f32206b.setAlpha(0.0f);
            this.f32206b.animate().alpha(1.0f).setDuration(j11).setInterpolator(this.f32207c).setStartDelay(j12).start();
        }
    }

    @Override // xn.a
    public void b(int i11, int i12) {
        this.f32205a.setAlpha(1.0f);
        long j11 = i12;
        long j12 = i11;
        this.f32205a.animate().alpha(0.0f).setDuration(j11).setInterpolator(this.f32207c).setStartDelay(j12).start();
        if (this.f32206b.getVisibility() == 0) {
            this.f32206b.setAlpha(1.0f);
            this.f32206b.animate().alpha(0.0f).setDuration(j11).setInterpolator(this.f32207c).setStartDelay(j12).start();
        }
    }

    public void c(float f11) {
        if (f11 != 1.0f) {
            this.f32206b.setTextColor(u.t(u.d(this, R.attr.colorSurface), this.f32206b.getCurrentTextColor(), f11));
        }
    }

    public final boolean e(int i11, int i12, int i13) {
        boolean z11;
        if (i11 != getOrientation()) {
            setOrientation(i11);
            z11 = true;
        } else {
            z11 = false;
        }
        if (this.f32205a.getPaddingTop() == i12 && this.f32205a.getPaddingBottom() == i13) {
            return z11;
        }
        d(this.f32205a, i12, i13);
        return true;
    }

    public Button getActionView() {
        return this.f32206b;
    }

    public TextView getMessageView() {
        return this.f32205a;
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        this.f32205a = (TextView) findViewById(R.id.snackbar_text);
        this.f32206b = (Button) findViewById(R.id.snackbar_action);
    }

    @Override // android.widget.LinearLayout, android.view.View
    public void onMeasure(int i11, int i12) {
        super.onMeasure(i11, i12);
        if (getOrientation() == 1) {
            return;
        }
        int dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.design_snackbar_padding_vertical_2lines);
        int dimensionPixelSize2 = getResources().getDimensionPixelSize(R.dimen.design_snackbar_padding_vertical);
        Layout layout = this.f32205a.getLayout();
        boolean z11 = layout != null && layout.getLineCount() > 1;
        if (!z11 || this.f32208d <= 0 || this.f32206b.getMeasuredWidth() <= this.f32208d) {
            if (!z11) {
                dimensionPixelSize = dimensionPixelSize2;
            }
            if (!e(0, dimensionPixelSize, dimensionPixelSize)) {
                return;
            }
        } else if (!e(1, dimensionPixelSize, dimensionPixelSize - dimensionPixelSize2)) {
            return;
        }
        super.onMeasure(i11, i12);
    }

    public void setMaxInlineActionWidth(int i11) {
        this.f32208d = i11;
    }

    public SnackbarContentLayout(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f32207c = j.g(context, R.attr.motionEasingEmphasizedInterpolator, b.f94061b);
    }
}
