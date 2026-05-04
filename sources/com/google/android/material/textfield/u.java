package com.google.android.material.textfield;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Typeface;
import android.text.TextUtils;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.ColorInt;
import androidx.annotation.DimenRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.StyleRes;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.core.view.ViewCompat;
import androidx.core.widget.TextViewCompat;
import com.google.android.material.R;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public final class u {
    public static final int C = 217;
    public static final int D = 167;
    public static final int E = 0;
    public static final int F = 1;
    public static final int G = 2;
    public static final int H = 0;
    public static final int I = 1;
    public static final int J = 2;

    @Nullable
    public ColorStateList A;
    public Typeface B;

    /* renamed from: a, reason: collision with root package name */
    public final int f32484a;

    /* renamed from: b, reason: collision with root package name */
    public final int f32485b;

    /* renamed from: c, reason: collision with root package name */
    public final int f32486c;

    /* renamed from: d, reason: collision with root package name */
    @NonNull
    public final TimeInterpolator f32487d;

    /* renamed from: e, reason: collision with root package name */
    @NonNull
    public final TimeInterpolator f32488e;

    /* renamed from: f, reason: collision with root package name */
    @NonNull
    public final TimeInterpolator f32489f;

    /* renamed from: g, reason: collision with root package name */
    public final Context f32490g;

    /* renamed from: h, reason: collision with root package name */
    @NonNull
    public final TextInputLayout f32491h;

    /* renamed from: i, reason: collision with root package name */
    public LinearLayout f32492i;

    /* renamed from: j, reason: collision with root package name */
    public int f32493j;

    /* renamed from: k, reason: collision with root package name */
    public FrameLayout f32494k;

    /* renamed from: l, reason: collision with root package name */
    @Nullable
    public Animator f32495l;

    /* renamed from: m, reason: collision with root package name */
    public final float f32496m;

    /* renamed from: n, reason: collision with root package name */
    public int f32497n;

    /* renamed from: o, reason: collision with root package name */
    public int f32498o;

    /* renamed from: p, reason: collision with root package name */
    @Nullable
    public CharSequence f32499p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f32500q;

    /* renamed from: r, reason: collision with root package name */
    @Nullable
    public TextView f32501r;

    /* renamed from: s, reason: collision with root package name */
    @Nullable
    public CharSequence f32502s;

    /* renamed from: t, reason: collision with root package name */
    public int f32503t;

    /* renamed from: u, reason: collision with root package name */
    public int f32504u;

    /* renamed from: v, reason: collision with root package name */
    @Nullable
    public ColorStateList f32505v;

    /* renamed from: w, reason: collision with root package name */
    public CharSequence f32506w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f32507x;

    /* renamed from: y, reason: collision with root package name */
    @Nullable
    public TextView f32508y;

    /* renamed from: z, reason: collision with root package name */
    public int f32509z;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class a extends AnimatorListenerAdapter {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ int f32510a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ TextView f32511b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ int f32512c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ TextView f32513d;

        public a(int i11, TextView textView, int i12, TextView textView2) {
            this.f32510a = i11;
            this.f32511b = textView;
            this.f32512c = i12;
            this.f32513d = textView2;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            u.this.f32497n = this.f32510a;
            u.this.f32495l = null;
            TextView textView = this.f32511b;
            if (textView != null) {
                textView.setVisibility(4);
                if (this.f32512c == 1 && u.this.f32501r != null) {
                    u.this.f32501r.setText((CharSequence) null);
                }
            }
            TextView textView2 = this.f32513d;
            if (textView2 != null) {
                textView2.setTranslationY(0.0f);
                this.f32513d.setAlpha(1.0f);
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            TextView textView = this.f32513d;
            if (textView != null) {
                textView.setVisibility(0);
                this.f32513d.setAlpha(0.0f);
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class b extends View.AccessibilityDelegate {
        public b() {
        }

        @Override // android.view.View.AccessibilityDelegate
        public void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfo accessibilityNodeInfo) {
            super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
            EditText editText = u.this.f32491h.getEditText();
            if (editText != null) {
                accessibilityNodeInfo.setLabeledBy(editText);
            }
        }
    }

    public u(@NonNull TextInputLayout textInputLayout) {
        Context context = textInputLayout.getContext();
        this.f32490g = context;
        this.f32491h = textInputLayout;
        this.f32496m = context.getResources().getDimensionPixelSize(R.dimen.design_textinput_caption_translate_y);
        int i11 = R.attr.motionDurationShort4;
        this.f32484a = pn.j.f(context, i11, 217);
        this.f32485b = pn.j.f(context, R.attr.motionDurationMedium4, 167);
        this.f32486c = pn.j.f(context, i11, 167);
        int i12 = R.attr.motionEasingEmphasizedDecelerateInterpolator;
        this.f32487d = pn.j.g(context, i12, vm.b.f94063d);
        TimeInterpolator timeInterpolator = vm.b.f94060a;
        this.f32488e = pn.j.g(context, i12, timeInterpolator);
        this.f32489f = pn.j.g(context, R.attr.motionEasingLinearInterpolator, timeInterpolator);
    }

    public void A() {
        this.f32499p = null;
        h();
        if (this.f32497n == 1) {
            if (!this.f32507x || TextUtils.isEmpty(this.f32506w)) {
                this.f32498o = 0;
            } else {
                this.f32498o = 2;
            }
        }
        X(this.f32497n, this.f32498o, U(this.f32501r, ""));
    }

    public void B() {
        h();
        int i11 = this.f32497n;
        if (i11 == 2) {
            this.f32498o = 0;
        }
        X(i11, this.f32498o, U(this.f32508y, ""));
    }

    public final boolean C(int i11) {
        return (i11 != 1 || this.f32501r == null || TextUtils.isEmpty(this.f32499p)) ? false : true;
    }

    public final boolean D(int i11) {
        return (i11 != 2 || this.f32508y == null || TextUtils.isEmpty(this.f32506w)) ? false : true;
    }

    public boolean E(int i11) {
        return i11 == 0 || i11 == 1;
    }

    public boolean F() {
        return this.f32500q;
    }

    public boolean G() {
        return this.f32507x;
    }

    public void H(TextView textView, int i11) {
        FrameLayout frameLayout;
        if (this.f32492i == null) {
            return;
        }
        if (!E(i11) || (frameLayout = this.f32494k) == null) {
            this.f32492i.removeView(textView);
        } else {
            frameLayout.removeView(textView);
        }
        int i12 = this.f32493j - 1;
        this.f32493j = i12;
        T(this.f32492i, i12);
    }

    public final void I(int i11, int i12) {
        TextView n11;
        TextView n12;
        if (i11 == i12) {
            return;
        }
        if (i12 != 0 && (n12 = n(i12)) != null) {
            n12.setVisibility(0);
            n12.setAlpha(1.0f);
        }
        if (i11 != 0 && (n11 = n(i11)) != null) {
            n11.setVisibility(4);
            if (i11 == 1) {
                n11.setText((CharSequence) null);
            }
        }
        this.f32497n = i12;
    }

    public void J(int i11) {
        this.f32503t = i11;
        TextView textView = this.f32501r;
        if (textView != null) {
            ViewCompat.setAccessibilityLiveRegion(textView, i11);
        }
    }

    public void K(@Nullable CharSequence charSequence) {
        this.f32502s = charSequence;
        TextView textView = this.f32501r;
        if (textView != null) {
            textView.setContentDescription(charSequence);
        }
    }

    public void L(boolean z11) {
        if (this.f32500q == z11) {
            return;
        }
        h();
        if (z11) {
            AppCompatTextView appCompatTextView = new AppCompatTextView(this.f32490g);
            this.f32501r = appCompatTextView;
            appCompatTextView.setId(R.id.textinput_error);
            this.f32501r.setTextAlignment(5);
            Typeface typeface = this.B;
            if (typeface != null) {
                this.f32501r.setTypeface(typeface);
            }
            M(this.f32504u);
            N(this.f32505v);
            K(this.f32502s);
            J(this.f32503t);
            this.f32501r.setVisibility(4);
            e(this.f32501r, 0);
        } else {
            A();
            H(this.f32501r, 0);
            this.f32501r = null;
            this.f32491h.H0();
            this.f32491h.S0();
        }
        this.f32500q = z11;
    }

    public void M(@StyleRes int i11) {
        this.f32504u = i11;
        TextView textView = this.f32501r;
        if (textView != null) {
            this.f32491h.u0(textView, i11);
        }
    }

    public void N(@Nullable ColorStateList colorStateList) {
        this.f32505v = colorStateList;
        TextView textView = this.f32501r;
        if (textView == null || colorStateList == null) {
            return;
        }
        textView.setTextColor(colorStateList);
    }

    public void O(@StyleRes int i11) {
        this.f32509z = i11;
        TextView textView = this.f32508y;
        if (textView != null) {
            TextViewCompat.setTextAppearance(textView, i11);
        }
    }

    public void P(boolean z11) {
        if (this.f32507x == z11) {
            return;
        }
        h();
        if (z11) {
            AppCompatTextView appCompatTextView = new AppCompatTextView(this.f32490g);
            this.f32508y = appCompatTextView;
            appCompatTextView.setId(R.id.textinput_helper_text);
            this.f32508y.setTextAlignment(5);
            Typeface typeface = this.B;
            if (typeface != null) {
                this.f32508y.setTypeface(typeface);
            }
            this.f32508y.setVisibility(4);
            ViewCompat.setAccessibilityLiveRegion(this.f32508y, 1);
            O(this.f32509z);
            Q(this.A);
            e(this.f32508y, 1);
            this.f32508y.setAccessibilityDelegate(new b());
        } else {
            B();
            H(this.f32508y, 1);
            this.f32508y = null;
            this.f32491h.H0();
            this.f32491h.S0();
        }
        this.f32507x = z11;
    }

    public void Q(@Nullable ColorStateList colorStateList) {
        this.A = colorStateList;
        TextView textView = this.f32508y;
        if (textView == null || colorStateList == null) {
            return;
        }
        textView.setTextColor(colorStateList);
    }

    public final void R(@Nullable TextView textView, Typeface typeface) {
        if (textView != null) {
            textView.setTypeface(typeface);
        }
    }

    public void S(Typeface typeface) {
        if (typeface != this.B) {
            this.B = typeface;
            R(this.f32501r, typeface);
            R(this.f32508y, typeface);
        }
    }

    public final void T(@NonNull ViewGroup viewGroup, int i11) {
        if (i11 == 0) {
            viewGroup.setVisibility(8);
        }
    }

    public final boolean U(@Nullable TextView textView, @NonNull CharSequence charSequence) {
        if (ViewCompat.isLaidOut(this.f32491h) && this.f32491h.isEnabled()) {
            return (this.f32498o == this.f32497n && textView != null && TextUtils.equals(textView.getText(), charSequence)) ? false : true;
        }
        return false;
    }

    public void V(CharSequence charSequence) {
        h();
        this.f32499p = charSequence;
        this.f32501r.setText(charSequence);
        int i11 = this.f32497n;
        if (i11 != 1) {
            this.f32498o = 1;
        }
        X(i11, this.f32498o, U(this.f32501r, charSequence));
    }

    public void W(CharSequence charSequence) {
        h();
        this.f32506w = charSequence;
        this.f32508y.setText(charSequence);
        int i11 = this.f32497n;
        if (i11 != 2) {
            this.f32498o = 2;
        }
        X(i11, this.f32498o, U(this.f32508y, charSequence));
    }

    public final void X(int i11, int i12, boolean z11) {
        u uVar;
        if (i11 == i12) {
            return;
        }
        if (z11) {
            AnimatorSet animatorSet = new AnimatorSet();
            this.f32495l = animatorSet;
            ArrayList arrayList = new ArrayList();
            uVar = this;
            uVar.i(arrayList, this.f32507x, this.f32508y, 2, i11, i12);
            uVar.i(arrayList, uVar.f32500q, uVar.f32501r, 1, i11, i12);
            vm.c.a(animatorSet, arrayList);
            animatorSet.addListener(uVar.new a(i12, n(i11), i11, n(i12)));
            animatorSet.start();
        } else {
            uVar = this;
            I(i11, i12);
        }
        uVar.f32491h.H0();
        uVar.f32491h.M0(z11);
        uVar.f32491h.S0();
    }

    public void e(TextView textView, int i11) {
        if (this.f32492i == null && this.f32494k == null) {
            LinearLayout linearLayout = new LinearLayout(this.f32490g);
            this.f32492i = linearLayout;
            linearLayout.setOrientation(0);
            this.f32491h.addView(this.f32492i, -1, -2);
            this.f32494k = new FrameLayout(this.f32490g);
            this.f32492i.addView(this.f32494k, new LinearLayout.LayoutParams(0, -2, 1.0f));
            if (this.f32491h.getEditText() != null) {
                f();
            }
        }
        if (E(i11)) {
            this.f32494k.setVisibility(0);
            this.f32494k.addView(textView);
        } else {
            this.f32492i.addView(textView, new LinearLayout.LayoutParams(-2, -2));
        }
        this.f32492i.setVisibility(0);
        this.f32493j++;
    }

    public void f() {
        if (g()) {
            EditText editText = this.f32491h.getEditText();
            boolean j11 = sn.c.j(this.f32490g);
            LinearLayout linearLayout = this.f32492i;
            int i11 = R.dimen.material_helper_text_font_1_3_padding_horizontal;
            ViewCompat.setPaddingRelative(linearLayout, x(j11, i11, ViewCompat.getPaddingStart(editText)), x(j11, R.dimen.material_helper_text_font_1_3_padding_top, this.f32490g.getResources().getDimensionPixelSize(R.dimen.material_helper_text_default_padding_top)), x(j11, i11, ViewCompat.getPaddingEnd(editText)), 0);
        }
    }

    public final boolean g() {
        return (this.f32492i == null || this.f32491h.getEditText() == null) ? false : true;
    }

    public void h() {
        Animator animator = this.f32495l;
        if (animator != null) {
            animator.cancel();
        }
    }

    public final void i(@NonNull List<Animator> list, boolean z11, @Nullable TextView textView, int i11, int i12, int i13) {
        if (textView == null || !z11) {
            return;
        }
        if (i11 == i13 || i11 == i12) {
            ObjectAnimator j11 = j(textView, i13 == i11);
            if (i11 == i13 && i12 != 0) {
                j11.setStartDelay(this.f32486c);
            }
            list.add(j11);
            if (i13 != i11 || i12 == 0) {
                return;
            }
            ObjectAnimator k11 = k(textView);
            k11.setStartDelay(this.f32486c);
            list.add(k11);
        }
    }

    public final ObjectAnimator j(TextView textView, boolean z11) {
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(textView, (Property<TextView, Float>) View.ALPHA, z11 ? 1.0f : 0.0f);
        ofFloat.setDuration(z11 ? this.f32485b : this.f32486c);
        ofFloat.setInterpolator(z11 ? this.f32488e : this.f32489f);
        return ofFloat;
    }

    public final ObjectAnimator k(TextView textView) {
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(textView, (Property<TextView, Float>) View.TRANSLATION_Y, -this.f32496m, 0.0f);
        ofFloat.setDuration(this.f32484a);
        ofFloat.setInterpolator(this.f32487d);
        return ofFloat;
    }

    public boolean l() {
        return C(this.f32497n);
    }

    public boolean m() {
        return C(this.f32498o);
    }

    @Nullable
    public final TextView n(int i11) {
        if (i11 == 1) {
            return this.f32501r;
        }
        if (i11 != 2) {
            return null;
        }
        return this.f32508y;
    }

    public int o() {
        return this.f32503t;
    }

    @Nullable
    public CharSequence p() {
        return this.f32502s;
    }

    @Nullable
    public CharSequence q() {
        return this.f32499p;
    }

    @ColorInt
    public int r() {
        TextView textView = this.f32501r;
        if (textView != null) {
            return textView.getCurrentTextColor();
        }
        return -1;
    }

    @Nullable
    public ColorStateList s() {
        TextView textView = this.f32501r;
        if (textView != null) {
            return textView.getTextColors();
        }
        return null;
    }

    public CharSequence t() {
        return this.f32506w;
    }

    @Nullable
    public View u() {
        return this.f32508y;
    }

    @Nullable
    public ColorStateList v() {
        TextView textView = this.f32508y;
        if (textView != null) {
            return textView.getTextColors();
        }
        return null;
    }

    @ColorInt
    public int w() {
        TextView textView = this.f32508y;
        if (textView != null) {
            return textView.getCurrentTextColor();
        }
        return -1;
    }

    public final int x(boolean z11, @DimenRes int i11, int i12) {
        return z11 ? this.f32490g.getResources().getDimensionPixelSize(i11) : i12;
    }

    public boolean y() {
        return D(this.f32497n);
    }

    public boolean z() {
        return D(this.f32498o);
    }
}
