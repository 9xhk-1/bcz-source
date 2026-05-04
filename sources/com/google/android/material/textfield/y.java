package com.google.android.material.textfield;

import android.annotation.SuppressLint;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.Px;
import androidx.annotation.StyleRes;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.appcompat.widget.TintTypedArray;
import androidx.core.view.GravityCompat;
import androidx.core.view.MarginLayoutParamsCompat;
import androidx.core.view.ViewCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import androidx.core.widget.TextViewCompat;
import com.google.android.material.R;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.internal.m0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@SuppressLint({"ViewConstructor"})
/* loaded from: classes7.dex */
public class y extends LinearLayout {

    /* renamed from: a, reason: collision with root package name */
    public final TextInputLayout f32520a;

    /* renamed from: b, reason: collision with root package name */
    public final TextView f32521b;

    /* renamed from: c, reason: collision with root package name */
    @Nullable
    public CharSequence f32522c;

    /* renamed from: d, reason: collision with root package name */
    public final CheckableImageButton f32523d;

    /* renamed from: e, reason: collision with root package name */
    public ColorStateList f32524e;

    /* renamed from: f, reason: collision with root package name */
    public PorterDuff.Mode f32525f;

    /* renamed from: g, reason: collision with root package name */
    public int f32526g;

    /* renamed from: h, reason: collision with root package name */
    @NonNull
    public ImageView.ScaleType f32527h;

    /* renamed from: i, reason: collision with root package name */
    public View.OnLongClickListener f32528i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f32529j;

    public y(TextInputLayout textInputLayout, TintTypedArray tintTypedArray) {
        super(textInputLayout.getContext());
        this.f32520a = textInputLayout;
        setVisibility(8);
        setOrientation(0);
        setLayoutParams(new FrameLayout.LayoutParams(-2, -1, GravityCompat.START));
        CheckableImageButton checkableImageButton = (CheckableImageButton) LayoutInflater.from(getContext()).inflate(R.layout.design_text_input_start_icon, (ViewGroup) this, false);
        this.f32523d = checkableImageButton;
        t.e(checkableImageButton);
        AppCompatTextView appCompatTextView = new AppCompatTextView(getContext());
        this.f32521b = appCompatTextView;
        j(tintTypedArray);
        i(tintTypedArray);
        addView(checkableImageButton);
        addView(appCompatTextView);
    }

    public void A(boolean z11) {
        if (l() != z11) {
            this.f32523d.setVisibility(z11 ? 0 : 8);
            C();
            D();
        }
    }

    public void B(@NonNull AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
        if (this.f32521b.getVisibility() != 0) {
            accessibilityNodeInfoCompat.setTraversalAfter(this.f32523d);
        } else {
            accessibilityNodeInfoCompat.setLabelFor(this.f32521b);
            accessibilityNodeInfoCompat.setTraversalAfter(this.f32521b);
        }
    }

    public void C() {
        EditText editText = this.f32520a.f32352d;
        if (editText == null) {
            return;
        }
        ViewCompat.setPaddingRelative(this.f32521b, l() ? 0 : ViewCompat.getPaddingStart(editText), editText.getCompoundPaddingTop(), getContext().getResources().getDimensionPixelSize(R.dimen.material_input_text_to_prefix_suffix_padding), editText.getCompoundPaddingBottom());
    }

    public final void D() {
        int i11 = (this.f32522c == null || this.f32529j) ? 8 : 0;
        setVisibility((this.f32523d.getVisibility() == 0 || i11 == 0) ? 0 : 8);
        this.f32521b.setVisibility(i11);
        this.f32520a.G0();
    }

    @Nullable
    public CharSequence a() {
        return this.f32522c;
    }

    @Nullable
    public ColorStateList b() {
        return this.f32521b.getTextColors();
    }

    public int c() {
        return ViewCompat.getPaddingStart(this) + ViewCompat.getPaddingStart(this.f32521b) + (l() ? this.f32523d.getMeasuredWidth() + MarginLayoutParamsCompat.getMarginEnd((ViewGroup.MarginLayoutParams) this.f32523d.getLayoutParams()) : 0);
    }

    @NonNull
    public TextView d() {
        return this.f32521b;
    }

    @Nullable
    public CharSequence e() {
        return this.f32523d.getContentDescription();
    }

    @Nullable
    public Drawable f() {
        return this.f32523d.getDrawable();
    }

    public int g() {
        return this.f32526g;
    }

    @NonNull
    public ImageView.ScaleType h() {
        return this.f32527h;
    }

    public final void i(TintTypedArray tintTypedArray) {
        this.f32521b.setVisibility(8);
        this.f32521b.setId(R.id.textinput_prefix_text);
        this.f32521b.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
        ViewCompat.setAccessibilityLiveRegion(this.f32521b, 1);
        p(tintTypedArray.getResourceId(R.styleable.TextInputLayout_prefixTextAppearance, 0));
        int i11 = R.styleable.TextInputLayout_prefixTextColor;
        if (tintTypedArray.hasValue(i11)) {
            q(tintTypedArray.getColorStateList(i11));
        }
        o(tintTypedArray.getText(R.styleable.TextInputLayout_prefixText));
    }

    public final void j(TintTypedArray tintTypedArray) {
        if (sn.c.j(getContext())) {
            MarginLayoutParamsCompat.setMarginEnd((ViewGroup.MarginLayoutParams) this.f32523d.getLayoutParams(), 0);
        }
        v(null);
        w(null);
        int i11 = R.styleable.TextInputLayout_startIconTint;
        if (tintTypedArray.hasValue(i11)) {
            this.f32524e = sn.c.b(getContext(), tintTypedArray, i11);
        }
        int i12 = R.styleable.TextInputLayout_startIconTintMode;
        if (tintTypedArray.hasValue(i12)) {
            this.f32525f = m0.t(tintTypedArray.getInt(i12, -1), null);
        }
        int i13 = R.styleable.TextInputLayout_startIconDrawable;
        if (tintTypedArray.hasValue(i13)) {
            t(tintTypedArray.getDrawable(i13));
            int i14 = R.styleable.TextInputLayout_startIconContentDescription;
            if (tintTypedArray.hasValue(i14)) {
                s(tintTypedArray.getText(i14));
            }
            r(tintTypedArray.getBoolean(R.styleable.TextInputLayout_startIconCheckable, true));
        }
        u(tintTypedArray.getDimensionPixelSize(R.styleable.TextInputLayout_startIconMinSize, getResources().getDimensionPixelSize(R.dimen.mtrl_min_touch_target_size)));
        int i15 = R.styleable.TextInputLayout_startIconScaleType;
        if (tintTypedArray.hasValue(i15)) {
            x(t.b(tintTypedArray.getInt(i15, -1)));
        }
    }

    public boolean k() {
        return this.f32523d.a();
    }

    public boolean l() {
        return this.f32523d.getVisibility() == 0;
    }

    public void m(boolean z11) {
        this.f32529j = z11;
        D();
    }

    public void n() {
        t.d(this.f32520a, this.f32523d, this.f32524e);
    }

    public void o(@Nullable CharSequence charSequence) {
        this.f32522c = TextUtils.isEmpty(charSequence) ? null : charSequence;
        this.f32521b.setText(charSequence);
        D();
    }

    @Override // android.widget.LinearLayout, android.view.View
    public void onMeasure(int i11, int i12) {
        super.onMeasure(i11, i12);
        C();
    }

    public void p(@StyleRes int i11) {
        TextViewCompat.setTextAppearance(this.f32521b, i11);
    }

    public void q(@NonNull ColorStateList colorStateList) {
        this.f32521b.setTextColor(colorStateList);
    }

    public void r(boolean z11) {
        this.f32523d.setCheckable(z11);
    }

    public void s(@Nullable CharSequence charSequence) {
        if (e() != charSequence) {
            this.f32523d.setContentDescription(charSequence);
        }
    }

    public void t(@Nullable Drawable drawable) {
        this.f32523d.setImageDrawable(drawable);
        if (drawable != null) {
            t.a(this.f32520a, this.f32523d, this.f32524e, this.f32525f);
            A(true);
            n();
        } else {
            A(false);
            v(null);
            w(null);
            s(null);
        }
    }

    public void u(@Px int i11) {
        if (i11 < 0) {
            throw new IllegalArgumentException("startIconSize cannot be less than 0");
        }
        if (i11 != this.f32526g) {
            this.f32526g = i11;
            t.g(this.f32523d, i11);
        }
    }

    public void v(@Nullable View.OnClickListener onClickListener) {
        t.h(this.f32523d, onClickListener, this.f32528i);
    }

    public void w(@Nullable View.OnLongClickListener onLongClickListener) {
        this.f32528i = onLongClickListener;
        t.i(this.f32523d, onLongClickListener);
    }

    public void x(@NonNull ImageView.ScaleType scaleType) {
        this.f32527h = scaleType;
        t.j(this.f32523d, scaleType);
    }

    public void y(@Nullable ColorStateList colorStateList) {
        if (this.f32524e != colorStateList) {
            this.f32524e = colorStateList;
            t.a(this.f32520a, this.f32523d, colorStateList, this.f32525f);
        }
    }

    public void z(@Nullable PorterDuff.Mode mode) {
        if (this.f32525f != mode) {
            this.f32525f = mode;
            t.a(this.f32520a, this.f32523d, this.f32524e, mode);
        }
    }
}
