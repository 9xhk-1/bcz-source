package com.google.android.material.card;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Checkable;
import androidx.annotation.ColorInt;
import androidx.annotation.ColorRes;
import androidx.annotation.DimenRes;
import androidx.annotation.Dimension;
import androidx.annotation.DrawableRes;
import androidx.annotation.FloatRange;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.content.res.AppCompatResources;
import androidx.cardview.widget.CardView;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import vn.l;
import vn.p;
import vn.t;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public class MaterialCardView extends CardView implements Checkable, t {

    /* renamed from: f, reason: collision with root package name */
    public static final int[] f30871f = {R.attr.state_checkable};

    /* renamed from: g, reason: collision with root package name */
    public static final int[] f30872g = {R.attr.state_checked};

    /* renamed from: h, reason: collision with root package name */
    public static final int[] f30873h = {com.google.android.material.R.attr.state_dragged};

    /* renamed from: i, reason: collision with root package name */
    public static final int f30874i = com.google.android.material.R.style.Widget_MaterialComponents_CardView;

    /* renamed from: j, reason: collision with root package name */
    public static final String f30875j = "MaterialCardView";

    /* renamed from: k, reason: collision with root package name */
    public static final String f30876k = "androidx.cardview.widget.CardView";

    /* renamed from: l, reason: collision with root package name */
    public static final int f30877l = 8388659;

    /* renamed from: m, reason: collision with root package name */
    public static final int f30878m = 8388691;

    /* renamed from: n, reason: collision with root package name */
    public static final int f30879n = 8388661;

    /* renamed from: o, reason: collision with root package name */
    public static final int f30880o = 8388693;

    /* renamed from: a, reason: collision with root package name */
    @NonNull
    public final bn.b f30881a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f30882b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f30883c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f30884d;

    /* renamed from: e, reason: collision with root package name */
    public b f30885e;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @Retention(RetentionPolicy.SOURCE)
    public @interface a {
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public interface b {
        void a(MaterialCardView materialCardView, boolean z11);
    }

    public MaterialCardView(Context context) {
        this(context, null);
    }

    @NonNull
    private RectF getBoundsAsRectF() {
        RectF rectF = new RectF();
        rectF.set(this.f30881a.l().getBounds());
        return rectF;
    }

    public final void f() {
        if (Build.VERSION.SDK_INT > 26) {
            this.f30881a.k();
        }
    }

    public boolean g() {
        bn.b bVar = this.f30881a;
        return bVar != null && bVar.F();
    }

    @Override // androidx.cardview.widget.CardView
    @NonNull
    public ColorStateList getCardBackgroundColor() {
        return this.f30881a.m();
    }

    @NonNull
    public ColorStateList getCardForegroundColor() {
        return this.f30881a.n();
    }

    public float getCardViewRadius() {
        return super.getRadius();
    }

    @Nullable
    public Drawable getCheckedIcon() {
        return this.f30881a.o();
    }

    public int getCheckedIconGravity() {
        return this.f30881a.p();
    }

    @Dimension
    public int getCheckedIconMargin() {
        return this.f30881a.q();
    }

    @Dimension
    public int getCheckedIconSize() {
        return this.f30881a.r();
    }

    @Nullable
    public ColorStateList getCheckedIconTint() {
        return this.f30881a.s();
    }

    @Override // androidx.cardview.widget.CardView
    public int getContentPaddingBottom() {
        return this.f30881a.C().bottom;
    }

    @Override // androidx.cardview.widget.CardView
    public int getContentPaddingLeft() {
        return this.f30881a.C().left;
    }

    @Override // androidx.cardview.widget.CardView
    public int getContentPaddingRight() {
        return this.f30881a.C().right;
    }

    @Override // androidx.cardview.widget.CardView
    public int getContentPaddingTop() {
        return this.f30881a.C().top;
    }

    @FloatRange(from = 0.0d, to = 1.0d)
    public float getProgress() {
        return this.f30881a.w();
    }

    @Override // androidx.cardview.widget.CardView
    public float getRadius() {
        return this.f30881a.u();
    }

    public ColorStateList getRippleColor() {
        return this.f30881a.x();
    }

    @Override // vn.t
    @NonNull
    public p getShapeAppearanceModel() {
        return this.f30881a.y();
    }

    @ColorInt
    @Deprecated
    public int getStrokeColor() {
        return this.f30881a.z();
    }

    @Nullable
    public ColorStateList getStrokeColorStateList() {
        return this.f30881a.A();
    }

    @Dimension
    public int getStrokeWidth() {
        return this.f30881a.B();
    }

    public boolean h() {
        return this.f30884d;
    }

    public void i(int i11, int i12, int i13, int i14) {
        super.setContentPadding(i11, i12, i13, i14);
    }

    @Override // android.widget.Checkable
    public boolean isChecked() {
        return this.f30883c;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f30881a.f0();
        l.f(this, this.f30881a.l());
    }

    @Override // android.view.ViewGroup, android.view.View
    public int[] onCreateDrawableState(int i11) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i11 + 3);
        if (g()) {
            View.mergeDrawableStates(onCreateDrawableState, f30871f);
        }
        if (isChecked()) {
            View.mergeDrawableStates(onCreateDrawableState, f30872g);
        }
        if (h()) {
            View.mergeDrawableStates(onCreateDrawableState, f30873h);
        }
        return onCreateDrawableState;
    }

    @Override // android.view.View
    public void onInitializeAccessibilityEvent(@NonNull AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(f30876k);
        accessibilityEvent.setChecked(isChecked());
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(@NonNull AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(f30876k);
        accessibilityNodeInfo.setCheckable(g());
        accessibilityNodeInfo.setClickable(isClickable());
        accessibilityNodeInfo.setChecked(isChecked());
    }

    @Override // androidx.cardview.widget.CardView, android.widget.FrameLayout, android.view.View
    public void onMeasure(int i11, int i12) {
        super.onMeasure(i11, i12);
        this.f30881a.J(getMeasuredWidth(), getMeasuredHeight());
    }

    @Override // android.view.View
    public void setBackground(Drawable drawable) {
        setBackgroundDrawable(drawable);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        if (this.f30882b) {
            if (!this.f30881a.E()) {
                Log.i(f30875j, "Setting a custom background is not supported.");
                this.f30881a.K(true);
            }
            super.setBackgroundDrawable(drawable);
        }
    }

    public void setBackgroundInternal(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
    }

    @Override // androidx.cardview.widget.CardView
    public void setCardBackgroundColor(@ColorInt int i11) {
        this.f30881a.L(ColorStateList.valueOf(i11));
    }

    @Override // androidx.cardview.widget.CardView
    public void setCardElevation(float f11) {
        super.setCardElevation(f11);
        this.f30881a.h0();
    }

    public void setCardForegroundColor(@Nullable ColorStateList colorStateList) {
        this.f30881a.M(colorStateList);
    }

    public void setCheckable(boolean z11) {
        this.f30881a.N(z11);
    }

    @Override // android.widget.Checkable
    public void setChecked(boolean z11) {
        if (this.f30883c != z11) {
            toggle();
        }
    }

    public void setCheckedIcon(@Nullable Drawable drawable) {
        this.f30881a.Q(drawable);
    }

    public void setCheckedIconGravity(int i11) {
        if (this.f30881a.p() != i11) {
            this.f30881a.R(i11);
        }
    }

    public void setCheckedIconMargin(@Dimension int i11) {
        this.f30881a.S(i11);
    }

    public void setCheckedIconMarginResource(@DimenRes int i11) {
        if (i11 != -1) {
            this.f30881a.S(getResources().getDimensionPixelSize(i11));
        }
    }

    public void setCheckedIconResource(@DrawableRes int i11) {
        this.f30881a.Q(AppCompatResources.getDrawable(getContext(), i11));
    }

    public void setCheckedIconSize(@Dimension int i11) {
        this.f30881a.T(i11);
    }

    public void setCheckedIconSizeResource(@DimenRes int i11) {
        if (i11 != 0) {
            this.f30881a.T(getResources().getDimensionPixelSize(i11));
        }
    }

    public void setCheckedIconTint(@Nullable ColorStateList colorStateList) {
        this.f30881a.U(colorStateList);
    }

    @Override // android.view.View
    public void setClickable(boolean z11) {
        super.setClickable(z11);
        bn.b bVar = this.f30881a;
        if (bVar != null) {
            bVar.f0();
        }
    }

    @Override // androidx.cardview.widget.CardView
    public void setContentPadding(int i11, int i12, int i13, int i14) {
        this.f30881a.b0(i11, i12, i13, i14);
    }

    public void setDragged(boolean z11) {
        if (this.f30884d != z11) {
            this.f30884d = z11;
            refreshDrawableState();
            f();
            invalidate();
        }
    }

    @Override // androidx.cardview.widget.CardView
    public void setMaxCardElevation(float f11) {
        super.setMaxCardElevation(f11);
        this.f30881a.j0();
    }

    public void setOnCheckedChangeListener(@Nullable b bVar) {
        this.f30885e = bVar;
    }

    @Override // androidx.cardview.widget.CardView
    public void setPreventCornerOverlap(boolean z11) {
        super.setPreventCornerOverlap(z11);
        this.f30881a.j0();
        this.f30881a.g0();
    }

    public void setProgress(@FloatRange(from = 0.0d, to = 1.0d) float f11) {
        this.f30881a.W(f11);
    }

    @Override // androidx.cardview.widget.CardView
    public void setRadius(float f11) {
        super.setRadius(f11);
        this.f30881a.V(f11);
    }

    public void setRippleColor(@Nullable ColorStateList colorStateList) {
        this.f30881a.X(colorStateList);
    }

    public void setRippleColorResource(@ColorRes int i11) {
        this.f30881a.X(AppCompatResources.getColorStateList(getContext(), i11));
    }

    @Override // vn.t
    public void setShapeAppearanceModel(@NonNull p pVar) {
        setClipToOutline(pVar.u(getBoundsAsRectF()));
        this.f30881a.Y(pVar);
    }

    public void setStrokeColor(@ColorInt int i11) {
        setStrokeColor(ColorStateList.valueOf(i11));
    }

    public void setStrokeWidth(@Dimension int i11) {
        this.f30881a.a0(i11);
        invalidate();
    }

    @Override // androidx.cardview.widget.CardView
    public void setUseCompatPadding(boolean z11) {
        super.setUseCompatPadding(z11);
        this.f30881a.j0();
        this.f30881a.g0();
    }

    @Override // android.widget.Checkable
    public void toggle() {
        if (g() && isEnabled()) {
            this.f30883c = !this.f30883c;
            refreshDrawableState();
            f();
            this.f30881a.P(this.f30883c, true);
            b bVar = this.f30885e;
            if (bVar != null) {
                bVar.a(this, this.f30883c);
            }
        }
    }

    public MaterialCardView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, com.google.android.material.R.attr.materialCardViewStyle);
    }

    @Override // androidx.cardview.widget.CardView
    public void setCardBackgroundColor(@Nullable ColorStateList colorStateList) {
        this.f30881a.L(colorStateList);
    }

    public void setStrokeColor(ColorStateList colorStateList) {
        this.f30881a.Z(colorStateList);
        invalidate();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public MaterialCardView(android.content.Context r7, android.util.AttributeSet r8, int r9) {
        /*
            r6 = this;
            int r4 = com.google.android.material.card.MaterialCardView.f30874i
            android.content.Context r7 = zn.a.c(r7, r8, r9, r4)
            r6.<init>(r7, r8, r9)
            r7 = 0
            r6.f30883c = r7
            r6.f30884d = r7
            r0 = 1
            r6.f30882b = r0
            android.content.Context r0 = r6.getContext()
            int[] r2 = com.google.android.material.R.styleable.MaterialCardView
            int[] r5 = new int[r7]
            r1 = r8
            r3 = r9
            android.content.res.TypedArray r7 = com.google.android.material.internal.d0.k(r0, r1, r2, r3, r4, r5)
            bn.b r8 = new bn.b
            r8.<init>(r6, r1, r3, r4)
            r6.f30881a = r8
            android.content.res.ColorStateList r9 = super.getCardBackgroundColor()
            r8.L(r9)
            int r9 = super.getContentPaddingLeft()
            int r0 = super.getContentPaddingTop()
            int r1 = super.getContentPaddingRight()
            int r2 = super.getContentPaddingBottom()
            r8.b0(r9, r0, r1, r2)
            r8.I(r7)
            r7.recycle()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.card.MaterialCardView.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }
}
