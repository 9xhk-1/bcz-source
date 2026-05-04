package com.google.android.material.snackbar;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityManager;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.annotation.ColorInt;
import androidx.annotation.Dimension;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.annotation.StringRes;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.R;
import com.google.android.material.snackbar.BaseTransientBottomBar;
import com.google.android.material.snackbar.Snackbar;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public class Snackbar extends BaseTransientBottomBar<Snackbar> {
    public static final int[] W;
    public static final int[] X;

    @Nullable
    public final AccessibilityManager T;
    public boolean U;

    @Nullable
    public BaseTransientBottomBar.s<Snackbar> V;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public static final class SnackbarLayout extends BaseTransientBottomBar.SnackbarBaseLayout {
        public SnackbarLayout(Context context) {
            super(context);
        }

        @Override // com.google.android.material.snackbar.BaseTransientBottomBar.SnackbarBaseLayout, android.widget.FrameLayout, android.view.View
        public void onMeasure(int i11, int i12) {
            super.onMeasure(i11, i12);
            int childCount = getChildCount();
            int measuredWidth = (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
            for (int i13 = 0; i13 < childCount; i13++) {
                View childAt = getChildAt(i13);
                if (childAt.getLayoutParams().width == -1) {
                    childAt.measure(View.MeasureSpec.makeMeasureSpec(measuredWidth, 1073741824), View.MeasureSpec.makeMeasureSpec(childAt.getMeasuredHeight(), 1073741824));
                }
            }
        }

        @Override // com.google.android.material.snackbar.BaseTransientBottomBar.SnackbarBaseLayout, android.view.View
        public /* bridge */ /* synthetic */ void setBackground(@Nullable Drawable drawable) {
            super.setBackground(drawable);
        }

        @Override // com.google.android.material.snackbar.BaseTransientBottomBar.SnackbarBaseLayout, android.view.View
        public /* bridge */ /* synthetic */ void setBackgroundDrawable(@Nullable Drawable drawable) {
            super.setBackgroundDrawable(drawable);
        }

        @Override // com.google.android.material.snackbar.BaseTransientBottomBar.SnackbarBaseLayout, android.view.View
        public /* bridge */ /* synthetic */ void setBackgroundTintList(@Nullable ColorStateList colorStateList) {
            super.setBackgroundTintList(colorStateList);
        }

        @Override // com.google.android.material.snackbar.BaseTransientBottomBar.SnackbarBaseLayout, android.view.View
        public /* bridge */ /* synthetic */ void setBackgroundTintMode(@Nullable PorterDuff.Mode mode) {
            super.setBackgroundTintMode(mode);
        }

        @Override // com.google.android.material.snackbar.BaseTransientBottomBar.SnackbarBaseLayout, android.view.View
        public /* bridge */ /* synthetic */ void setLayoutParams(ViewGroup.LayoutParams layoutParams) {
            super.setLayoutParams(layoutParams);
        }

        @Override // com.google.android.material.snackbar.BaseTransientBottomBar.SnackbarBaseLayout, android.view.View
        public /* bridge */ /* synthetic */ void setOnClickListener(@Nullable View.OnClickListener onClickListener) {
            super.setOnClickListener(onClickListener);
        }

        public SnackbarLayout(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }
    }

    static {
        int i11 = R.attr.snackbarButtonStyle;
        W = new int[]{i11};
        X = new int[]{i11, R.attr.snackbarTextViewStyle};
    }

    public Snackbar(@NonNull Context context, @NonNull ViewGroup viewGroup, @NonNull View view, @NonNull xn.a aVar) {
        super(context, viewGroup, view, aVar);
        this.T = (AccessibilityManager) viewGroup.getContext().getSystemService("accessibility");
    }

    public static boolean A0(@NonNull Context context) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(X);
        int resourceId = obtainStyledAttributes.getResourceId(0, -1);
        int resourceId2 = obtainStyledAttributes.getResourceId(1, -1);
        obtainStyledAttributes.recycle();
        return (resourceId == -1 || resourceId2 == -1) ? false : true;
    }

    @NonNull
    public static Snackbar B0(@NonNull Context context, @NonNull View view, @NonNull CharSequence charSequence, int i11) {
        return E0(context, view, charSequence, i11);
    }

    @NonNull
    public static Snackbar C0(@NonNull View view, @StringRes int i11, int i12) {
        return D0(view, view.getResources().getText(i11), i12);
    }

    @NonNull
    public static Snackbar D0(@NonNull View view, @NonNull CharSequence charSequence, int i11) {
        return E0(null, view, charSequence, i11);
    }

    @NonNull
    public static Snackbar E0(@Nullable Context context, @NonNull View view, @NonNull CharSequence charSequence, int i11) {
        ViewGroup v02 = v0(view);
        if (v02 == null) {
            throw new IllegalArgumentException("No suitable parent found from the given view. Please provide a valid view.");
        }
        if (context == null) {
            context = v02.getContext();
        }
        SnackbarContentLayout snackbarContentLayout = (SnackbarContentLayout) LayoutInflater.from(context).inflate(A0(context) ? R.layout.mtrl_layout_snackbar_include : R.layout.design_layout_snackbar_include, v02, false);
        Snackbar snackbar = new Snackbar(context, v02, snackbarContentLayout, snackbarContentLayout);
        snackbar.P0(charSequence);
        snackbar.h0(i11);
        return snackbar;
    }

    public static /* synthetic */ void u0(Snackbar snackbar, View.OnClickListener onClickListener, View view) {
        snackbar.getClass();
        onClickListener.onClick(view);
        snackbar.B(1);
    }

    @Nullable
    public static ViewGroup v0(View view) {
        ViewGroup viewGroup = null;
        while (!(view instanceof CoordinatorLayout)) {
            if (view instanceof FrameLayout) {
                if (view.getId() == 16908290) {
                    return (ViewGroup) view;
                }
                viewGroup = (ViewGroup) view;
            }
            if (view != null) {
                Object parent = view.getParent();
                view = parent instanceof View ? (View) parent : null;
            }
            if (view == null) {
                return viewGroup;
            }
        }
        return (ViewGroup) view;
    }

    @Deprecated
    public static boolean z0(@NonNull Context context) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(W);
        int resourceId = obtainStyledAttributes.getResourceId(0, -1);
        obtainStyledAttributes.recycle();
        return resourceId != -1;
    }

    @Override // com.google.android.material.snackbar.BaseTransientBottomBar
    public void A() {
        super.A();
    }

    @NonNull
    @uo.a
    public Snackbar F0(@StringRes int i11, View.OnClickListener onClickListener) {
        return G0(G().getText(i11), onClickListener);
    }

    @NonNull
    @uo.a
    public Snackbar G0(@Nullable CharSequence charSequence, @Nullable final View.OnClickListener onClickListener) {
        Button w02 = w0();
        if (TextUtils.isEmpty(charSequence) || onClickListener == null) {
            w02.setVisibility(8);
            w02.setOnClickListener(null);
            this.U = false;
            return this;
        }
        this.U = true;
        w02.setVisibility(0);
        w02.setText(charSequence);
        w02.setOnClickListener(new View.OnClickListener() { // from class: xn.c
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                Snackbar.u0(Snackbar.this, onClickListener, view);
            }
        });
        return this;
    }

    @Override // com.google.android.material.snackbar.BaseTransientBottomBar
    public int H() {
        int recommendedTimeoutMillis;
        int H = super.H();
        if (H == -2) {
            return -2;
        }
        if (Build.VERSION.SDK_INT >= 29) {
            recommendedTimeoutMillis = this.T.getRecommendedTimeoutMillis(H, (this.U ? 4 : 0) | 3);
            return recommendedTimeoutMillis;
        }
        if (this.U && this.T.isTouchExplorationEnabled()) {
            return -2;
        }
        return H;
    }

    @NonNull
    @uo.a
    public Snackbar H0(@ColorInt int i11) {
        w0().setTextColor(i11);
        return this;
    }

    @NonNull
    @uo.a
    public Snackbar I0(ColorStateList colorStateList) {
        w0().setTextColor(colorStateList);
        return this;
    }

    @NonNull
    @uo.a
    public Snackbar J0(@ColorInt int i11) {
        return K0(ColorStateList.valueOf(i11));
    }

    @NonNull
    @uo.a
    public Snackbar K0(@Nullable ColorStateList colorStateList) {
        this.f32141i.setBackgroundTintList(colorStateList);
        return this;
    }

    @NonNull
    @uo.a
    public Snackbar L0(@Nullable PorterDuff.Mode mode) {
        this.f32141i.setBackgroundTintMode(mode);
        return this;
    }

    @NonNull
    @Deprecated
    @uo.a
    public Snackbar M0(@Nullable a aVar) {
        BaseTransientBottomBar.s<Snackbar> sVar = this.V;
        if (sVar != null) {
            b0(sVar);
        }
        if (aVar != null) {
            u(aVar);
        }
        this.V = aVar;
        return this;
    }

    @NonNull
    @uo.a
    public Snackbar N0(@Dimension int i11) {
        x0().setMaxInlineActionWidth(i11);
        return this;
    }

    @NonNull
    @uo.a
    public Snackbar O0(@StringRes int i11) {
        return P0(G().getText(i11));
    }

    @NonNull
    @uo.a
    public Snackbar P0(@NonNull CharSequence charSequence) {
        y0().setText(charSequence);
        return this;
    }

    @NonNull
    @uo.a
    public Snackbar Q0(@ColorInt int i11) {
        y0().setTextColor(i11);
        return this;
    }

    @NonNull
    @uo.a
    public Snackbar R0(ColorStateList colorStateList) {
        y0().setTextColor(colorStateList);
        return this;
    }

    @Override // com.google.android.material.snackbar.BaseTransientBottomBar
    public boolean S() {
        return super.S();
    }

    @NonNull
    @uo.a
    public Snackbar S0(int i11) {
        y0().setMaxLines(i11);
        return this;
    }

    @Override // com.google.android.material.snackbar.BaseTransientBottomBar
    public void m0() {
        super.m0();
    }

    public final Button w0() {
        return x0().getActionView();
    }

    public final SnackbarContentLayout x0() {
        return (SnackbarContentLayout) this.f32141i.getChildAt(0);
    }

    public final TextView y0() {
        return x0().getMessageView();
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class a extends BaseTransientBottomBar.s<Snackbar> {

        /* renamed from: f, reason: collision with root package name */
        public static final int f32200f = 0;

        /* renamed from: g, reason: collision with root package name */
        public static final int f32201g = 1;

        /* renamed from: h, reason: collision with root package name */
        public static final int f32202h = 2;

        /* renamed from: i, reason: collision with root package name */
        public static final int f32203i = 3;

        /* renamed from: j, reason: collision with root package name */
        public static final int f32204j = 4;

        @Override // com.google.android.material.snackbar.BaseTransientBottomBar.s
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public void b(Snackbar snackbar) {
        }

        @Override // com.google.android.material.snackbar.BaseTransientBottomBar.s
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public void a(Snackbar snackbar, int i11) {
        }
    }
}
