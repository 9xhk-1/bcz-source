package com.google.android.material.textfield;

import android.animation.ValueAnimator;
import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStructure;
import android.view.ViewTreeObserver;
import android.view.accessibility.AccessibilityEvent;
import android.view.autofill.AutofillId;
import android.widget.AutoCompleteTextView;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.ColorInt;
import androidx.annotation.ColorRes;
import androidx.annotation.DimenRes;
import androidx.annotation.DrawableRes;
import androidx.annotation.IntRange;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.Px;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.annotation.StringRes;
import androidx.annotation.StyleRes;
import androidx.annotation.VisibleForTesting;
import androidx.appcompat.content.res.AppCompatResources;
import androidx.appcompat.widget.AppCompatDrawableManager;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.appcompat.widget.DrawableUtils;
import androidx.core.content.ContextCompat;
import androidx.core.graphics.drawable.DrawableCompat;
import androidx.core.text.BidiFormatter;
import androidx.core.view.AccessibilityDelegateCompat;
import androidx.core.view.MarginLayoutParamsCompat;
import androidx.core.view.ViewCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import androidx.core.widget.TextViewCompat;
import androidx.customview.view.AbsSavedState;
import androidx.transition.Fade;
import androidx.transition.TransitionManager;
import com.google.android.material.R;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.internal.m0;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.Iterator;
import java.util.LinkedHashSet;
import org.junit.jupiter.api.j2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public class TextInputLayout extends LinearLayout implements ViewTreeObserver.OnGlobalLayoutListener {
    public static final int I1 = 167;
    public static final int J1 = 87;
    public static final int K1 = 67;
    public static final int L1 = -1;
    public static final int M1 = -1;
    public static final String O1 = "TextInputLayout";
    public static final int P1 = 0;
    public static final int Q1 = 1;
    public static final int R1 = 2;
    public static final int S1 = -1;
    public static final int T1 = 0;
    public static final int U1 = 1;
    public static final int V1 = 2;
    public static final int W1 = 3;

    @Nullable
    public ColorStateList A;
    public final com.google.android.material.internal.b A1;

    @Nullable
    public ColorStateList B;
    public boolean B1;
    public boolean C;
    public boolean C1;
    public CharSequence D;
    public ValueAnimator D1;
    public boolean E;
    public boolean E1;

    @Nullable
    public vn.k F;
    public boolean F1;
    public vn.k G;
    public boolean G1;
    public StateListDrawable H;
    public boolean I;

    @Nullable
    public vn.k J;

    @Nullable
    public vn.k K;

    @NonNull
    public vn.p L;
    public boolean M;
    public final int N;
    public int O;
    public int P;
    public int Q;
    public int R;
    public int S;

    @ColorInt
    public int T;

    @ColorInt
    public int U;
    public final Rect V;
    public final Rect W;

    /* renamed from: a, reason: collision with root package name */
    @NonNull
    public final FrameLayout f32349a;

    /* renamed from: b, reason: collision with root package name */
    @NonNull
    public final y f32350b;

    /* renamed from: c, reason: collision with root package name */
    @NonNull
    public final r f32351c;

    /* renamed from: d, reason: collision with root package name */
    public EditText f32352d;

    /* renamed from: e, reason: collision with root package name */
    public CharSequence f32353e;

    /* renamed from: f, reason: collision with root package name */
    public int f32354f;

    /* renamed from: f0, reason: collision with root package name */
    public final RectF f32355f0;

    /* renamed from: f1, reason: collision with root package name */
    public Typeface f32356f1;

    /* renamed from: g, reason: collision with root package name */
    public int f32357g;

    /* renamed from: h, reason: collision with root package name */
    public int f32358h;

    /* renamed from: h1, reason: collision with root package name */
    @Nullable
    public Drawable f32359h1;

    /* renamed from: i, reason: collision with root package name */
    public int f32360i;

    /* renamed from: i1, reason: collision with root package name */
    public int f32361i1;

    /* renamed from: j, reason: collision with root package name */
    public final u f32362j;

    /* renamed from: j1, reason: collision with root package name */
    public final LinkedHashSet<h> f32363j1;

    /* renamed from: k, reason: collision with root package name */
    public boolean f32364k;

    /* renamed from: k1, reason: collision with root package name */
    @Nullable
    public Drawable f32365k1;

    /* renamed from: l, reason: collision with root package name */
    public int f32366l;

    /* renamed from: l1, reason: collision with root package name */
    public int f32367l1;

    /* renamed from: m, reason: collision with root package name */
    public boolean f32368m;

    /* renamed from: m1, reason: collision with root package name */
    public Drawable f32369m1;

    /* renamed from: n, reason: collision with root package name */
    @NonNull
    public g f32370n;

    /* renamed from: n1, reason: collision with root package name */
    public ColorStateList f32371n1;

    /* renamed from: o, reason: collision with root package name */
    @Nullable
    public TextView f32372o;

    /* renamed from: o1, reason: collision with root package name */
    public ColorStateList f32373o1;

    /* renamed from: p, reason: collision with root package name */
    public int f32374p;

    /* renamed from: p1, reason: collision with root package name */
    @ColorInt
    public int f32375p1;

    /* renamed from: q, reason: collision with root package name */
    public int f32376q;

    /* renamed from: q1, reason: collision with root package name */
    @ColorInt
    public int f32377q1;

    /* renamed from: r, reason: collision with root package name */
    public CharSequence f32378r;

    /* renamed from: r1, reason: collision with root package name */
    @ColorInt
    public int f32379r1;

    /* renamed from: s, reason: collision with root package name */
    public boolean f32380s;

    /* renamed from: s1, reason: collision with root package name */
    public ColorStateList f32381s1;

    /* renamed from: t, reason: collision with root package name */
    public TextView f32382t;

    /* renamed from: t1, reason: collision with root package name */
    @ColorInt
    public int f32383t1;

    /* renamed from: u, reason: collision with root package name */
    @Nullable
    public ColorStateList f32384u;

    /* renamed from: u1, reason: collision with root package name */
    @ColorInt
    public int f32385u1;

    /* renamed from: v, reason: collision with root package name */
    public int f32386v;

    /* renamed from: v1, reason: collision with root package name */
    @ColorInt
    public int f32387v1;

    /* renamed from: w, reason: collision with root package name */
    @Nullable
    public Fade f32388w;

    /* renamed from: w1, reason: collision with root package name */
    @ColorInt
    public int f32389w1;

    /* renamed from: x, reason: collision with root package name */
    @Nullable
    public Fade f32390x;

    /* renamed from: x1, reason: collision with root package name */
    @ColorInt
    public int f32391x1;

    /* renamed from: y, reason: collision with root package name */
    @Nullable
    public ColorStateList f32392y;

    /* renamed from: y1, reason: collision with root package name */
    public int f32393y1;

    /* renamed from: z, reason: collision with root package name */
    @Nullable
    public ColorStateList f32394z;

    /* renamed from: z1, reason: collision with root package name */
    public boolean f32395z1;
    public static final int H1 = R.style.Widget_Design_TextInputLayout;
    public static final int[][] N1 = {new int[]{android.R.attr.state_pressed}, new int[0]};

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new a();

        /* renamed from: a, reason: collision with root package name */
        @Nullable
        public CharSequence f32396a;

        /* renamed from: b, reason: collision with root package name */
        public boolean f32397b;

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public class a implements Parcelable.ClassLoaderCreator<SavedState> {
            @Override // android.os.Parcelable.Creator
            @Nullable
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public SavedState createFromParcel(@NonNull Parcel parcel) {
                return new SavedState(parcel, null);
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            @NonNull
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public SavedState createFromParcel(@NonNull Parcel parcel, ClassLoader classLoader) {
                return new SavedState(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            @NonNull
            /* renamed from: c, reason: merged with bridge method [inline-methods] */
            public SavedState[] newArray(int i11) {
                return new SavedState[i11];
            }
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        @NonNull
        public String toString() {
            return "TextInputLayout.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " error=" + ((Object) this.f32396a) + com.alipay.sdk.m.u.i.f11099d;
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(@NonNull Parcel parcel, int i11) {
            super.writeToParcel(parcel, i11);
            TextUtils.writeToParcel(this.f32396a, parcel, i11);
            parcel.writeInt(this.f32397b ? 1 : 0);
        }

        public SavedState(@NonNull Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f32396a = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
            this.f32397b = parcel.readInt() == 1;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            TextInputLayout.this.f32351c.i();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class c implements ValueAnimator.AnimatorUpdateListener {
        public c() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(@NonNull ValueAnimator valueAnimator) {
            TextInputLayout.this.A1.A0(((Float) valueAnimator.getAnimatedValue()).floatValue());
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class d extends AccessibilityDelegateCompat {

        /* renamed from: a, reason: collision with root package name */
        public final TextInputLayout f32403a;

        public d(@NonNull TextInputLayout textInputLayout) {
            this.f32403a = textInputLayout;
        }

        @Override // androidx.core.view.AccessibilityDelegateCompat
        public void onInitializeAccessibilityNodeInfo(@NonNull View view, @NonNull AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
            super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfoCompat);
            EditText editText = this.f32403a.getEditText();
            CharSequence text = editText != null ? editText.getText() : null;
            CharSequence hint = this.f32403a.getHint();
            CharSequence error = this.f32403a.getError();
            CharSequence placeholderText = this.f32403a.getPlaceholderText();
            int counterMaxLength = this.f32403a.getCounterMaxLength();
            CharSequence counterOverflowDescription = this.f32403a.getCounterOverflowDescription();
            boolean isEmpty = TextUtils.isEmpty(text);
            boolean isEmpty2 = TextUtils.isEmpty(hint);
            boolean Z = this.f32403a.Z();
            boolean isEmpty3 = TextUtils.isEmpty(error);
            boolean z11 = (isEmpty3 && TextUtils.isEmpty(counterOverflowDescription)) ? false : true;
            String charSequence = !isEmpty2 ? hint.toString() : "";
            this.f32403a.f32350b.B(accessibilityNodeInfoCompat);
            if (!isEmpty) {
                accessibilityNodeInfoCompat.setText(text);
            } else if (!TextUtils.isEmpty(charSequence)) {
                accessibilityNodeInfoCompat.setText(charSequence);
                if (!Z && placeholderText != null) {
                    accessibilityNodeInfoCompat.setText(charSequence + j2.O + ((Object) placeholderText));
                }
            } else if (placeholderText != null) {
                accessibilityNodeInfoCompat.setText(placeholderText);
            }
            if (!TextUtils.isEmpty(charSequence)) {
                if (Build.VERSION.SDK_INT >= 26) {
                    accessibilityNodeInfoCompat.setHintText(charSequence);
                } else {
                    if (!isEmpty) {
                        charSequence = ((Object) text) + j2.O + charSequence;
                    }
                    accessibilityNodeInfoCompat.setText(charSequence);
                }
                accessibilityNodeInfoCompat.setShowingHintText(isEmpty);
            }
            if (text == null || text.length() != counterMaxLength) {
                counterMaxLength = -1;
            }
            accessibilityNodeInfoCompat.setMaxTextLength(counterMaxLength);
            if (z11) {
                if (isEmpty3) {
                    error = counterOverflowDescription;
                }
                accessibilityNodeInfoCompat.setError(error);
            }
            View u11 = this.f32403a.f32362j.u();
            if (u11 != null) {
                accessibilityNodeInfoCompat.setLabelFor(u11);
            }
            this.f32403a.f32351c.o().o(view, accessibilityNodeInfoCompat);
        }

        @Override // androidx.core.view.AccessibilityDelegateCompat
        public void onPopulateAccessibilityEvent(@NonNull View view, @NonNull AccessibilityEvent accessibilityEvent) {
            super.onPopulateAccessibilityEvent(view, accessibilityEvent);
            this.f32403a.f32351c.o().p(view, accessibilityEvent);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @Retention(RetentionPolicy.SOURCE)
    public @interface e {
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public @interface f {
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public interface g {
        int a(@Nullable Editable editable);
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public interface h {
        void a(@NonNull TextInputLayout textInputLayout);
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public interface i {
        void a(@NonNull TextInputLayout textInputLayout, int i11);
    }

    public TextInputLayout(@NonNull Context context) {
        this(context, null);
    }

    public static void D0(@NonNull Context context, @NonNull TextView textView, int i11, int i12, boolean z11) {
        textView.setContentDescription(context.getString(z11 ? R.string.character_counter_overflowed_content_description : R.string.character_counter_content_description, Integer.valueOf(i11), Integer.valueOf(i12)));
    }

    public static Drawable L(vn.k kVar, int i11, int i12, int[][] iArr) {
        return new RippleDrawable(new ColorStateList(iArr, new int[]{en.u.t(i12, i11, 0.1f), i11}), kVar, kVar);
    }

    public static Drawable O(Context context, vn.k kVar, int i11, int[][] iArr) {
        int c11 = en.u.c(context, R.attr.colorSurface, O1);
        vn.k kVar2 = new vn.k(kVar.getShapeAppearanceModel());
        int t11 = en.u.t(i11, c11, 0.1f);
        kVar2.p0(new ColorStateList(iArr, new int[]{t11, 0}));
        kVar2.setTint(c11);
        ColorStateList colorStateList = new ColorStateList(iArr, new int[]{t11, c11});
        vn.k kVar3 = new vn.k(kVar.getShapeAppearanceModel());
        kVar3.setTint(-1);
        return new LayerDrawable(new Drawable[]{new RippleDrawable(colorStateList, kVar2, kVar3), kVar});
    }

    public static /* synthetic */ int b(Editable editable) {
        if (editable != null) {
            return editable.length();
        }
        return 0;
    }

    @Nullable
    private Drawable getEditTextBoxBackground() {
        EditText editText = this.f32352d;
        if (!(editText instanceof AutoCompleteTextView) || q.a(editText)) {
            return this.F;
        }
        int d11 = en.u.d(this.f32352d, R.attr.colorControlHighlight);
        int i11 = this.O;
        if (i11 == 2) {
            return O(getContext(), this.F, d11, N1);
        }
        if (i11 == 1) {
            return L(this.F, this.U, d11, N1);
        }
        return null;
    }

    private Drawable getOrCreateFilledDropDownMenuBackground() {
        if (this.H == null) {
            StateListDrawable stateListDrawable = new StateListDrawable();
            this.H = stateListDrawable;
            stateListDrawable.addState(new int[]{android.R.attr.state_above_anchor}, getOrCreateOutlinedDropDownMenuBackground());
            this.H.addState(new int[0], K(false));
        }
        return this.H;
    }

    private Drawable getOrCreateOutlinedDropDownMenuBackground() {
        if (this.G == null) {
            this.G = K(true);
        }
        return this.G;
    }

    public static void k0(@NonNull ViewGroup viewGroup, boolean z11) {
        int childCount = viewGroup.getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = viewGroup.getChildAt(i11);
            childAt.setEnabled(z11);
            if (childAt instanceof ViewGroup) {
                k0((ViewGroup) childAt, z11);
            }
        }
    }

    private void setEditText(EditText editText) {
        if (this.f32352d != null) {
            throw new IllegalArgumentException("We already have an EditText, can only have one");
        }
        if (getEndIconMode() != 3 && !(editText instanceof TextInputEditText)) {
            Log.i(O1, "EditText added is not a TextInputEditText. Please switch to using that class instead.");
        }
        this.f32352d = editText;
        int i11 = this.f32354f;
        if (i11 != -1) {
            setMinEms(i11);
        } else {
            setMinWidth(this.f32358h);
        }
        int i12 = this.f32357g;
        if (i12 != -1) {
            setMaxEms(i12);
        } else {
            setMaxWidth(this.f32360i);
        }
        this.I = false;
        g0();
        setTextInputAccessibilityDelegate(new d(this));
        this.A1.P0(this.f32352d.getTypeface());
        this.A1.x0(this.f32352d.getTextSize());
        int i13 = Build.VERSION.SDK_INT;
        this.A1.s0(this.f32352d.getLetterSpacing());
        int gravity = this.f32352d.getGravity();
        this.A1.l0((gravity & (-113)) | 48);
        this.A1.w0(gravity);
        this.f32393y1 = ViewCompat.getMinimumHeight(editText);
        this.f32352d.addTextChangedListener(new a(editText));
        if (this.f32371n1 == null) {
            this.f32371n1 = this.f32352d.getHintTextColors();
        }
        if (this.C) {
            if (TextUtils.isEmpty(this.D)) {
                CharSequence hint = this.f32352d.getHint();
                this.f32353e = hint;
                setHint(hint);
                this.f32352d.setHint((CharSequence) null);
            }
            this.E = true;
        }
        if (i13 >= 29) {
            F0();
        }
        if (this.f32372o != null) {
            C0(this.f32352d.getText());
        }
        H0();
        this.f32362j.f();
        this.f32350b.bringToFront();
        this.f32351c.bringToFront();
        G();
        this.f32351c.D0();
        if (!isEnabled()) {
            editText.setEnabled(false);
        }
        N0(false, true);
    }

    private void setHintInternal(CharSequence charSequence) {
        if (TextUtils.equals(charSequence, this.D)) {
            return;
        }
        this.D = charSequence;
        this.A1.M0(charSequence);
        if (this.f32395z1) {
            return;
        }
        h0();
    }

    private void setPlaceholderTextEnabled(boolean z11) {
        if (this.f32380s == z11) {
            return;
        }
        if (z11) {
            k();
        } else {
            q0();
            this.f32382t = null;
        }
        this.f32380s = z11;
    }

    public void A() {
        this.f32351c.j();
    }

    public final void A0(@NonNull Rect rect) {
        vn.k kVar = this.J;
        if (kVar != null) {
            int i11 = rect.bottom;
            kVar.setBounds(rect.left, i11 - this.R, rect.right, i11);
        }
        vn.k kVar2 = this.K;
        if (kVar2 != null) {
            int i12 = rect.bottom;
            kVar2.setBounds(rect.left, i12 - this.S, rect.right, i12);
        }
    }

    public final void B() {
        if (E()) {
            ((com.google.android.material.textfield.h) this.F).U0();
        }
    }

    public final void B0() {
        if (this.f32372o != null) {
            EditText editText = this.f32352d;
            C0(editText == null ? null : editText.getText());
        }
    }

    public final void C(boolean z11) {
        ValueAnimator valueAnimator = this.D1;
        if (valueAnimator != null && valueAnimator.isRunning()) {
            this.D1.cancel();
        }
        if (z11 && this.C1) {
            m(1.0f);
        } else {
            this.A1.A0(1.0f);
        }
        this.f32395z1 = false;
        if (E()) {
            h0();
        }
        P0();
        this.f32350b.m(false);
        this.f32351c.L(false);
    }

    public void C0(@Nullable Editable editable) {
        int a11 = this.f32370n.a(editable);
        boolean z11 = this.f32368m;
        int i11 = this.f32366l;
        if (i11 == -1) {
            this.f32372o.setText(String.valueOf(a11));
            this.f32372o.setContentDescription(null);
            this.f32368m = false;
        } else {
            this.f32368m = a11 > i11;
            D0(getContext(), this.f32372o, a11, this.f32366l, this.f32368m);
            if (z11 != this.f32368m) {
                E0();
            }
            this.f32372o.setText(BidiFormatter.getInstance().unicodeWrap(getContext().getString(R.string.character_counter_pattern, Integer.valueOf(a11), Integer.valueOf(this.f32366l))));
        }
        if (this.f32352d == null || z11 == this.f32368m) {
            return;
        }
        M0(false);
        S0();
        H0();
    }

    public final Fade D() {
        Fade fade = new Fade();
        fade.setDuration(pn.j.f(getContext(), R.attr.motionDurationShort2, 87));
        fade.setInterpolator(pn.j.g(getContext(), R.attr.motionEasingLinearInterpolator, vm.b.f94060a));
        return fade;
    }

    public final boolean E() {
        return this.C && !TextUtils.isEmpty(this.D) && (this.F instanceof com.google.android.material.textfield.h);
    }

    public final void E0() {
        ColorStateList colorStateList;
        ColorStateList colorStateList2;
        TextView textView = this.f32372o;
        if (textView != null) {
            u0(textView, this.f32368m ? this.f32374p : this.f32376q);
            if (!this.f32368m && (colorStateList2 = this.f32392y) != null) {
                this.f32372o.setTextColor(colorStateList2);
            }
            if (!this.f32368m || (colorStateList = this.f32394z) == null) {
                return;
            }
            this.f32372o.setTextColor(colorStateList);
        }
    }

    @VisibleForTesting
    public boolean F() {
        return E() && ((com.google.android.material.textfield.h) this.F).T0();
    }

    @RequiresApi(29)
    public final void F0() {
        Drawable textCursorDrawable;
        Drawable textCursorDrawable2;
        ColorStateList colorStateList;
        ColorStateList colorStateList2 = this.A;
        if (colorStateList2 == null) {
            colorStateList2 = en.u.l(getContext(), R.attr.colorControlActivated);
        }
        EditText editText = this.f32352d;
        if (editText != null) {
            textCursorDrawable = editText.getTextCursorDrawable();
            if (textCursorDrawable == null) {
                return;
            }
            textCursorDrawable2 = this.f32352d.getTextCursorDrawable();
            Drawable mutate = DrawableCompat.wrap(textCursorDrawable2).mutate();
            if (a0() && (colorStateList = this.B) != null) {
                colorStateList2 = colorStateList;
            }
            DrawableCompat.setTintList(mutate, colorStateList2);
        }
    }

    public final void G() {
        Iterator<h> it = this.f32363j1.iterator();
        while (it.hasNext()) {
            it.next().a(this);
        }
    }

    public boolean G0() {
        boolean z11;
        if (this.f32352d == null) {
            return false;
        }
        boolean z12 = true;
        if (x0()) {
            int measuredWidth = this.f32350b.getMeasuredWidth() - this.f32352d.getPaddingLeft();
            if (this.f32359h1 == null || this.f32361i1 != measuredWidth) {
                ColorDrawable colorDrawable = new ColorDrawable();
                this.f32359h1 = colorDrawable;
                this.f32361i1 = measuredWidth;
                colorDrawable.setBounds(0, 0, measuredWidth, 1);
            }
            Drawable[] compoundDrawablesRelative = TextViewCompat.getCompoundDrawablesRelative(this.f32352d);
            Drawable drawable = compoundDrawablesRelative[0];
            Drawable drawable2 = this.f32359h1;
            if (drawable != drawable2) {
                TextViewCompat.setCompoundDrawablesRelative(this.f32352d, drawable2, compoundDrawablesRelative[1], compoundDrawablesRelative[2], compoundDrawablesRelative[3]);
                z11 = true;
            }
            z11 = false;
        } else {
            if (this.f32359h1 != null) {
                Drawable[] compoundDrawablesRelative2 = TextViewCompat.getCompoundDrawablesRelative(this.f32352d);
                TextViewCompat.setCompoundDrawablesRelative(this.f32352d, null, compoundDrawablesRelative2[1], compoundDrawablesRelative2[2], compoundDrawablesRelative2[3]);
                this.f32359h1 = null;
                z11 = true;
            }
            z11 = false;
        }
        if (w0()) {
            int measuredWidth2 = this.f32351c.B().getMeasuredWidth() - this.f32352d.getPaddingRight();
            CheckableImageButton m11 = this.f32351c.m();
            if (m11 != null) {
                measuredWidth2 = measuredWidth2 + m11.getMeasuredWidth() + MarginLayoutParamsCompat.getMarginStart((ViewGroup.MarginLayoutParams) m11.getLayoutParams());
            }
            Drawable[] compoundDrawablesRelative3 = TextViewCompat.getCompoundDrawablesRelative(this.f32352d);
            Drawable drawable3 = this.f32365k1;
            if (drawable3 != null && this.f32367l1 != measuredWidth2) {
                this.f32367l1 = measuredWidth2;
                drawable3.setBounds(0, 0, measuredWidth2, 1);
                TextViewCompat.setCompoundDrawablesRelative(this.f32352d, compoundDrawablesRelative3[0], compoundDrawablesRelative3[1], this.f32365k1, compoundDrawablesRelative3[3]);
                return true;
            }
            if (drawable3 == null) {
                ColorDrawable colorDrawable2 = new ColorDrawable();
                this.f32365k1 = colorDrawable2;
                this.f32367l1 = measuredWidth2;
                colorDrawable2.setBounds(0, 0, measuredWidth2, 1);
            }
            Drawable drawable4 = compoundDrawablesRelative3[2];
            Drawable drawable5 = this.f32365k1;
            if (drawable4 != drawable5) {
                this.f32369m1 = drawable4;
                TextViewCompat.setCompoundDrawablesRelative(this.f32352d, compoundDrawablesRelative3[0], compoundDrawablesRelative3[1], drawable5, compoundDrawablesRelative3[3]);
                return true;
            }
        } else if (this.f32365k1 != null) {
            Drawable[] compoundDrawablesRelative4 = TextViewCompat.getCompoundDrawablesRelative(this.f32352d);
            if (compoundDrawablesRelative4[2] == this.f32365k1) {
                TextViewCompat.setCompoundDrawablesRelative(this.f32352d, compoundDrawablesRelative4[0], compoundDrawablesRelative4[1], this.f32369m1, compoundDrawablesRelative4[3]);
            } else {
                z12 = z11;
            }
            this.f32365k1 = null;
            return z12;
        }
        return z11;
    }

    public final void H(Canvas canvas) {
        vn.k kVar;
        if (this.K == null || (kVar = this.J) == null) {
            return;
        }
        kVar.draw(canvas);
        if (this.f32352d.isFocused()) {
            Rect bounds = this.K.getBounds();
            Rect bounds2 = this.J.getBounds();
            float G = this.A1.G();
            int centerX = bounds2.centerX();
            bounds.left = vm.b.c(centerX, bounds2.left, G);
            bounds.right = vm.b.c(centerX, bounds2.right, G);
            this.K.draw(canvas);
        }
    }

    public void H0() {
        Drawable background;
        TextView textView;
        EditText editText = this.f32352d;
        if (editText == null || this.O != 0 || (background = editText.getBackground()) == null) {
            return;
        }
        if (DrawableUtils.canSafelyMutateDrawable(background)) {
            background = background.mutate();
        }
        if (v0()) {
            background.setColorFilter(AppCompatDrawableManager.getPorterDuffColorFilter(getErrorCurrentTextColors(), PorterDuff.Mode.SRC_IN));
        } else if (this.f32368m && (textView = this.f32372o) != null) {
            background.setColorFilter(AppCompatDrawableManager.getPorterDuffColorFilter(textView.getCurrentTextColor(), PorterDuff.Mode.SRC_IN));
        } else {
            DrawableCompat.clearColorFilter(background);
            this.f32352d.refreshDrawableState();
        }
    }

    public final void I(@NonNull Canvas canvas) {
        if (this.C) {
            this.A1.l(canvas);
        }
    }

    public final void I0() {
        ViewCompat.setBackground(this.f32352d, getEditTextBoxBackground());
    }

    public final void J(boolean z11) {
        ValueAnimator valueAnimator = this.D1;
        if (valueAnimator != null && valueAnimator.isRunning()) {
            this.D1.cancel();
        }
        if (z11 && this.C1) {
            m(0.0f);
        } else {
            this.A1.A0(0.0f);
        }
        if (E() && ((com.google.android.material.textfield.h) this.F).T0()) {
            B();
        }
        this.f32395z1 = true;
        P();
        this.f32350b.m(true);
        this.f32351c.L(true);
    }

    public void J0() {
        EditText editText = this.f32352d;
        if (editText == null || this.F == null) {
            return;
        }
        if ((this.I || editText.getBackground() == null) && this.O != 0) {
            I0();
            this.I = true;
        }
    }

    public final vn.k K(boolean z11) {
        float dimensionPixelOffset = getResources().getDimensionPixelOffset(R.dimen.mtrl_shape_corner_size_small_component);
        float f11 = z11 ? dimensionPixelOffset : 0.0f;
        EditText editText = this.f32352d;
        float popupElevation = editText instanceof MaterialAutoCompleteTextView ? ((MaterialAutoCompleteTextView) editText).getPopupElevation() : getResources().getDimensionPixelOffset(R.dimen.m3_comp_outlined_autocomplete_menu_container_elevation);
        int dimensionPixelOffset2 = getResources().getDimensionPixelOffset(R.dimen.mtrl_exposed_dropdown_menu_popup_vertical_padding);
        vn.p m11 = vn.p.a().K(f11).P(f11).x(dimensionPixelOffset).C(dimensionPixelOffset).m();
        EditText editText2 = this.f32352d;
        vn.k o11 = vn.k.o(getContext(), popupElevation, editText2 instanceof MaterialAutoCompleteTextView ? ((MaterialAutoCompleteTextView) editText2).getDropDownBackgroundTintList() : null);
        o11.setShapeAppearanceModel(m11);
        o11.r0(0, dimensionPixelOffset2, 0, dimensionPixelOffset2);
        return o11;
    }

    public final boolean K0() {
        int max;
        if (this.f32352d == null || this.f32352d.getMeasuredHeight() >= (max = Math.max(this.f32351c.getMeasuredHeight(), this.f32350b.getMeasuredHeight()))) {
            return false;
        }
        this.f32352d.setMinimumHeight(max);
        return true;
    }

    public final void L0() {
        if (this.O != 1) {
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.f32349a.getLayoutParams();
            int w11 = w();
            if (w11 != layoutParams.topMargin) {
                layoutParams.topMargin = w11;
                this.f32349a.requestLayout();
            }
        }
    }

    public final int M(int i11, boolean z11) {
        return i11 + ((z11 || getPrefixText() == null) ? (!z11 || getSuffixText() == null) ? this.f32352d.getCompoundPaddingLeft() : this.f32351c.A() : this.f32350b.c());
    }

    public void M0(boolean z11) {
        N0(z11, false);
    }

    public final int N(int i11, boolean z11) {
        return i11 - ((z11 || getSuffixText() == null) ? (!z11 || getPrefixText() == null) ? this.f32352d.getCompoundPaddingRight() : this.f32350b.c() : this.f32351c.A());
    }

    public final void N0(boolean z11, boolean z12) {
        ColorStateList colorStateList;
        TextView textView;
        boolean isEnabled = isEnabled();
        EditText editText = this.f32352d;
        boolean z13 = false;
        boolean z14 = (editText == null || TextUtils.isEmpty(editText.getText())) ? false : true;
        EditText editText2 = this.f32352d;
        if (editText2 != null && editText2.hasFocus()) {
            z13 = true;
        }
        ColorStateList colorStateList2 = this.f32371n1;
        if (colorStateList2 != null) {
            this.A1.f0(colorStateList2);
        }
        if (!isEnabled) {
            ColorStateList colorStateList3 = this.f32371n1;
            this.A1.f0(ColorStateList.valueOf(colorStateList3 != null ? colorStateList3.getColorForState(new int[]{-16842910}, this.f32391x1) : this.f32391x1));
        } else if (v0()) {
            this.A1.f0(this.f32362j.s());
        } else if (this.f32368m && (textView = this.f32372o) != null) {
            this.A1.f0(textView.getTextColors());
        } else if (z13 && (colorStateList = this.f32373o1) != null) {
            this.A1.k0(colorStateList);
        }
        if (z14 || !this.B1 || (isEnabled() && z13)) {
            if (z12 || this.f32395z1) {
                C(z11);
                return;
            }
            return;
        }
        if (z12 || !this.f32395z1) {
            J(z11);
        }
    }

    public final void O0() {
        EditText editText;
        if (this.f32382t == null || (editText = this.f32352d) == null) {
            return;
        }
        this.f32382t.setGravity(editText.getGravity());
        this.f32382t.setPadding(this.f32352d.getCompoundPaddingLeft(), this.f32352d.getCompoundPaddingTop(), this.f32352d.getCompoundPaddingRight(), this.f32352d.getCompoundPaddingBottom());
    }

    public final void P() {
        TextView textView = this.f32382t;
        if (textView == null || !this.f32380s) {
            return;
        }
        textView.setText((CharSequence) null);
        TransitionManager.beginDelayedTransition(this.f32349a, this.f32390x);
        this.f32382t.setVisibility(4);
    }

    public final void P0() {
        EditText editText = this.f32352d;
        Q0(editText == null ? null : editText.getText());
    }

    public boolean Q() {
        return this.f32364k;
    }

    public final void Q0(@Nullable Editable editable) {
        if (this.f32370n.a(editable) != 0 || this.f32395z1) {
            P();
        } else {
            y0();
        }
    }

    public boolean R() {
        return this.f32351c.G();
    }

    public final void R0(boolean z11, boolean z12) {
        int defaultColor = this.f32381s1.getDefaultColor();
        int colorForState = this.f32381s1.getColorForState(new int[]{android.R.attr.state_hovered, android.R.attr.state_enabled}, defaultColor);
        int colorForState2 = this.f32381s1.getColorForState(new int[]{android.R.attr.state_activated, android.R.attr.state_enabled}, defaultColor);
        if (z11) {
            this.T = colorForState2;
        } else if (z12) {
            this.T = colorForState;
        } else {
            this.T = defaultColor;
        }
    }

    public boolean S() {
        return this.f32351c.I();
    }

    public void S0() {
        TextView textView;
        EditText editText;
        EditText editText2;
        if (this.F == null || this.O == 0) {
            return;
        }
        boolean z11 = false;
        boolean z12 = isFocused() || ((editText2 = this.f32352d) != null && editText2.hasFocus());
        if (isHovered() || ((editText = this.f32352d) != null && editText.isHovered())) {
            z11 = true;
        }
        if (!isEnabled()) {
            this.T = this.f32391x1;
        } else if (v0()) {
            if (this.f32381s1 != null) {
                R0(z12, z11);
            } else {
                this.T = getErrorCurrentTextColors();
            }
        } else if (!this.f32368m || (textView = this.f32372o) == null) {
            if (z12) {
                this.T = this.f32379r1;
            } else if (z11) {
                this.T = this.f32377q1;
            } else {
                this.T = this.f32375p1;
            }
        } else if (this.f32381s1 != null) {
            R0(z12, z11);
        } else {
            this.T = textView.getCurrentTextColor();
        }
        if (Build.VERSION.SDK_INT >= 29) {
            F0();
        }
        this.f32351c.M();
        n0();
        if (this.O == 2) {
            int i11 = this.Q;
            if (z12 && isEnabled()) {
                this.Q = this.S;
            } else {
                this.Q = this.R;
            }
            if (this.Q != i11) {
                j0();
            }
        }
        if (this.O == 1) {
            if (!isEnabled()) {
                this.U = this.f32385u1;
            } else if (z11 && !z12) {
                this.U = this.f32389w1;
            } else if (z12) {
                this.U = this.f32387v1;
            } else {
                this.U = this.f32383t1;
            }
        }
        n();
    }

    public boolean T() {
        return this.f32362j.F();
    }

    public boolean U() {
        return this.B1;
    }

    @VisibleForTesting
    public final boolean V() {
        return this.f32362j.y();
    }

    public boolean W() {
        return this.f32362j.G();
    }

    public boolean X() {
        return this.C1;
    }

    public boolean Y() {
        return this.C;
    }

    public final boolean Z() {
        return this.f32395z1;
    }

    public final boolean a0() {
        if (v0()) {
            return true;
        }
        return this.f32372o != null && this.f32368m;
    }

    @Override // android.view.ViewGroup
    public void addView(@NonNull View view, int i11, @NonNull ViewGroup.LayoutParams layoutParams) {
        if (!(view instanceof EditText)) {
            super.addView(view, i11, layoutParams);
            return;
        }
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(layoutParams);
        layoutParams2.gravity = (layoutParams2.gravity & (-113)) | 16;
        this.f32349a.addView(view, layoutParams2);
        this.f32349a.setLayoutParams(layoutParams);
        L0();
        setEditText((EditText) view);
    }

    @Deprecated
    public boolean b0() {
        return this.f32351c.K();
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public boolean c0() {
        return this.E;
    }

    public final boolean d0() {
        return this.O == 1 && this.f32352d.getMinLines() <= 1;
    }

    @Override // android.view.ViewGroup, android.view.View
    @TargetApi(26)
    public void dispatchProvideAutofillStructure(@NonNull ViewStructure viewStructure, int i11) {
        AutofillId autofillId;
        EditText editText = this.f32352d;
        if (editText == null) {
            super.dispatchProvideAutofillStructure(viewStructure, i11);
            return;
        }
        if (this.f32353e != null) {
            boolean z11 = this.E;
            this.E = false;
            CharSequence hint = editText.getHint();
            this.f32352d.setHint(this.f32353e);
            try {
                super.dispatchProvideAutofillStructure(viewStructure, i11);
                return;
            } finally {
                this.f32352d.setHint(hint);
                this.E = z11;
            }
        }
        autofillId = getAutofillId();
        viewStructure.setAutofillId(autofillId);
        onProvideAutofillStructure(viewStructure, i11);
        onProvideAutofillVirtualStructure(viewStructure, i11);
        viewStructure.setChildCount(this.f32349a.getChildCount());
        for (int i12 = 0; i12 < this.f32349a.getChildCount(); i12++) {
            View childAt = this.f32349a.getChildAt(i12);
            ViewStructure newChild = viewStructure.newChild(i12);
            childAt.dispatchProvideAutofillStructure(newChild, i11);
            if (childAt == this.f32352d) {
                newChild.setHint(getHint());
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchRestoreInstanceState(@NonNull SparseArray<Parcelable> sparseArray) {
        this.F1 = true;
        super.dispatchRestoreInstanceState(sparseArray);
        this.F1 = false;
    }

    @Override // android.view.View
    public void draw(@NonNull Canvas canvas) {
        super.draw(canvas);
        I(canvas);
        H(canvas);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void drawableStateChanged() {
        if (this.E1) {
            return;
        }
        this.E1 = true;
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        com.google.android.material.internal.b bVar = this.A1;
        boolean K0 = bVar != null ? bVar.K0(drawableState) : false;
        if (this.f32352d != null) {
            M0(ViewCompat.isLaidOut(this) && isEnabled());
        }
        H0();
        S0();
        if (K0) {
            invalidate();
        }
        this.E1 = false;
    }

    public boolean e0() {
        return this.f32350b.k();
    }

    public boolean f0() {
        return this.f32350b.l();
    }

    public final void g0() {
        q();
        J0();
        S0();
        z0();
        l();
        if (this.O != 0) {
            L0();
        }
        t0();
    }

    @Override // android.widget.LinearLayout, android.view.View
    public int getBaseline() {
        EditText editText = this.f32352d;
        return editText != null ? editText.getBaseline() + getPaddingTop() + w() : super.getBaseline();
    }

    @NonNull
    public vn.k getBoxBackground() {
        int i11 = this.O;
        if (i11 == 1 || i11 == 2) {
            return this.F;
        }
        throw new IllegalStateException();
    }

    public int getBoxBackgroundColor() {
        return this.U;
    }

    public int getBoxBackgroundMode() {
        return this.O;
    }

    public int getBoxCollapsedPaddingTop() {
        return this.P;
    }

    public float getBoxCornerRadiusBottomEnd() {
        return m0.s(this) ? this.L.j().a(this.f32355f0) : this.L.l().a(this.f32355f0);
    }

    public float getBoxCornerRadiusBottomStart() {
        return m0.s(this) ? this.L.l().a(this.f32355f0) : this.L.j().a(this.f32355f0);
    }

    public float getBoxCornerRadiusTopEnd() {
        return m0.s(this) ? this.L.r().a(this.f32355f0) : this.L.t().a(this.f32355f0);
    }

    public float getBoxCornerRadiusTopStart() {
        return m0.s(this) ? this.L.t().a(this.f32355f0) : this.L.r().a(this.f32355f0);
    }

    public int getBoxStrokeColor() {
        return this.f32379r1;
    }

    @Nullable
    public ColorStateList getBoxStrokeErrorColor() {
        return this.f32381s1;
    }

    public int getBoxStrokeWidth() {
        return this.R;
    }

    public int getBoxStrokeWidthFocused() {
        return this.S;
    }

    public int getCounterMaxLength() {
        return this.f32366l;
    }

    @Nullable
    public CharSequence getCounterOverflowDescription() {
        TextView textView;
        if (this.f32364k && this.f32368m && (textView = this.f32372o) != null) {
            return textView.getContentDescription();
        }
        return null;
    }

    @Nullable
    public ColorStateList getCounterOverflowTextColor() {
        return this.f32394z;
    }

    @Nullable
    public ColorStateList getCounterTextColor() {
        return this.f32392y;
    }

    @Nullable
    @RequiresApi(29)
    public ColorStateList getCursorColor() {
        return this.A;
    }

    @Nullable
    @RequiresApi(29)
    public ColorStateList getCursorErrorColor() {
        return this.B;
    }

    @Nullable
    public ColorStateList getDefaultHintTextColor() {
        return this.f32371n1;
    }

    @Nullable
    public EditText getEditText() {
        return this.f32352d;
    }

    @Nullable
    public CharSequence getEndIconContentDescription() {
        return this.f32351c.n();
    }

    @Nullable
    public Drawable getEndIconDrawable() {
        return this.f32351c.p();
    }

    public int getEndIconMinSize() {
        return this.f32351c.q();
    }

    public int getEndIconMode() {
        return this.f32351c.r();
    }

    @NonNull
    public ImageView.ScaleType getEndIconScaleType() {
        return this.f32351c.s();
    }

    @NonNull
    public CheckableImageButton getEndIconView() {
        return this.f32351c.t();
    }

    @Nullable
    public CharSequence getError() {
        if (this.f32362j.F()) {
            return this.f32362j.q();
        }
        return null;
    }

    public int getErrorAccessibilityLiveRegion() {
        return this.f32362j.o();
    }

    @Nullable
    public CharSequence getErrorContentDescription() {
        return this.f32362j.p();
    }

    @ColorInt
    public int getErrorCurrentTextColors() {
        return this.f32362j.r();
    }

    @Nullable
    public Drawable getErrorIconDrawable() {
        return this.f32351c.u();
    }

    @Nullable
    public CharSequence getHelperText() {
        if (this.f32362j.G()) {
            return this.f32362j.t();
        }
        return null;
    }

    @ColorInt
    public int getHelperTextCurrentTextColor() {
        return this.f32362j.w();
    }

    @Nullable
    public CharSequence getHint() {
        if (this.C) {
            return this.D;
        }
        return null;
    }

    @VisibleForTesting
    public final float getHintCollapsedTextHeight() {
        return this.A1.r();
    }

    @VisibleForTesting
    public final int getHintCurrentCollapsedTextColor() {
        return this.A1.w();
    }

    @Nullable
    public ColorStateList getHintTextColor() {
        return this.f32373o1;
    }

    @NonNull
    public g getLengthCounter() {
        return this.f32370n;
    }

    public int getMaxEms() {
        return this.f32357g;
    }

    @Px
    public int getMaxWidth() {
        return this.f32360i;
    }

    public int getMinEms() {
        return this.f32354f;
    }

    @Px
    public int getMinWidth() {
        return this.f32358h;
    }

    @Nullable
    @Deprecated
    public CharSequence getPasswordVisibilityToggleContentDescription() {
        return this.f32351c.w();
    }

    @Nullable
    @Deprecated
    public Drawable getPasswordVisibilityToggleDrawable() {
        return this.f32351c.x();
    }

    @Nullable
    public CharSequence getPlaceholderText() {
        if (this.f32380s) {
            return this.f32378r;
        }
        return null;
    }

    @StyleRes
    public int getPlaceholderTextAppearance() {
        return this.f32386v;
    }

    @Nullable
    public ColorStateList getPlaceholderTextColor() {
        return this.f32384u;
    }

    @Nullable
    public CharSequence getPrefixText() {
        return this.f32350b.a();
    }

    @Nullable
    public ColorStateList getPrefixTextColor() {
        return this.f32350b.b();
    }

    @NonNull
    public TextView getPrefixTextView() {
        return this.f32350b.d();
    }

    @NonNull
    public vn.p getShapeAppearanceModel() {
        return this.L;
    }

    @Nullable
    public CharSequence getStartIconContentDescription() {
        return this.f32350b.e();
    }

    @Nullable
    public Drawable getStartIconDrawable() {
        return this.f32350b.f();
    }

    public int getStartIconMinSize() {
        return this.f32350b.g();
    }

    @NonNull
    public ImageView.ScaleType getStartIconScaleType() {
        return this.f32350b.h();
    }

    @Nullable
    public CharSequence getSuffixText() {
        return this.f32351c.y();
    }

    @Nullable
    public ColorStateList getSuffixTextColor() {
        return this.f32351c.z();
    }

    @NonNull
    public TextView getSuffixTextView() {
        return this.f32351c.B();
    }

    @Nullable
    public Typeface getTypeface() {
        return this.f32356f1;
    }

    public final void h0() {
        if (E()) {
            RectF rectF = this.f32355f0;
            this.A1.o(rectF, this.f32352d.getWidth(), this.f32352d.getGravity());
            if (rectF.width() <= 0.0f || rectF.height() <= 0.0f) {
                return;
            }
            p(rectF);
            rectF.offset(-getPaddingLeft(), ((-getPaddingTop()) - (rectF.height() / 2.0f)) + this.Q);
            ((com.google.android.material.textfield.h) this.F).W0(rectF);
        }
    }

    public void i(@NonNull h hVar) {
        this.f32363j1.add(hVar);
        if (this.f32352d != null) {
            hVar.a(this);
        }
    }

    @Deprecated
    public void i0(boolean z11) {
        this.f32351c.A0(z11);
    }

    public void j(@NonNull i iVar) {
        this.f32351c.g(iVar);
    }

    public final void j0() {
        if (!E() || this.f32395z1) {
            return;
        }
        B();
        h0();
    }

    public final void k() {
        TextView textView = this.f32382t;
        if (textView != null) {
            this.f32349a.addView(textView);
            this.f32382t.setVisibility(0);
        }
    }

    public final void l() {
        if (this.f32352d == null || this.O != 1) {
            return;
        }
        if (sn.c.k(getContext())) {
            EditText editText = this.f32352d;
            ViewCompat.setPaddingRelative(editText, ViewCompat.getPaddingStart(editText), getResources().getDimensionPixelSize(R.dimen.material_filled_edittext_font_2_0_padding_top), ViewCompat.getPaddingEnd(this.f32352d), getResources().getDimensionPixelSize(R.dimen.material_filled_edittext_font_2_0_padding_bottom));
        } else if (sn.c.j(getContext())) {
            EditText editText2 = this.f32352d;
            ViewCompat.setPaddingRelative(editText2, ViewCompat.getPaddingStart(editText2), getResources().getDimensionPixelSize(R.dimen.material_filled_edittext_font_1_3_padding_top), ViewCompat.getPaddingEnd(this.f32352d), getResources().getDimensionPixelSize(R.dimen.material_filled_edittext_font_1_3_padding_bottom));
        }
    }

    public void l0() {
        this.f32351c.N();
    }

    @VisibleForTesting
    public void m(float f11) {
        if (this.A1.G() == f11) {
            return;
        }
        if (this.D1 == null) {
            ValueAnimator valueAnimator = new ValueAnimator();
            this.D1 = valueAnimator;
            valueAnimator.setInterpolator(pn.j.g(getContext(), R.attr.motionEasingEmphasizedInterpolator, vm.b.f94061b));
            this.D1.setDuration(pn.j.f(getContext(), R.attr.motionDurationMedium4, 167));
            this.D1.addUpdateListener(new c());
        }
        this.D1.setFloatValues(this.A1.G(), f11);
        this.D1.start();
    }

    public void m0() {
        this.f32351c.O();
    }

    public final void n() {
        vn.k kVar = this.F;
        if (kVar == null) {
            return;
        }
        vn.p shapeAppearanceModel = kVar.getShapeAppearanceModel();
        vn.p pVar = this.L;
        if (shapeAppearanceModel != pVar) {
            this.F.setShapeAppearanceModel(pVar);
        }
        if (x()) {
            this.F.E0(this.Q, this.T);
        }
        int r11 = r();
        this.U = r11;
        this.F.p0(ColorStateList.valueOf(r11));
        o();
        J0();
    }

    public void n0() {
        this.f32350b.n();
    }

    public final void o() {
        if (this.J == null || this.K == null) {
            return;
        }
        if (y()) {
            this.J.p0(this.f32352d.isFocused() ? ColorStateList.valueOf(this.f32375p1) : ColorStateList.valueOf(this.T));
            this.K.p0(ColorStateList.valueOf(this.T));
        }
        invalidate();
    }

    public void o0(@NonNull h hVar) {
        this.f32363j1.remove(hVar);
    }

    @Override // android.view.View
    public void onConfigurationChanged(@NonNull Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.A1.a0(configuration);
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public void onGlobalLayout() {
        this.f32351c.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        this.G1 = false;
        boolean K0 = K0();
        boolean G0 = G0();
        if (K0 || G0) {
            this.f32352d.post(new Runnable() { // from class: com.google.android.material.textfield.f0
                @Override // java.lang.Runnable
                public final void run() {
                    TextInputLayout.this.f32352d.requestLayout();
                }
            });
        }
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z11, int i11, int i12, int i13, int i14) {
        super.onLayout(z11, i11, i12, i13, i14);
        EditText editText = this.f32352d;
        if (editText != null) {
            Rect rect = this.V;
            com.google.android.material.internal.d.a(this, editText, rect);
            A0(rect);
            if (this.C) {
                this.A1.x0(this.f32352d.getTextSize());
                int gravity = this.f32352d.getGravity();
                this.A1.l0((gravity & (-113)) | 48);
                this.A1.w0(gravity);
                this.A1.h0(s(rect));
                this.A1.r0(v(rect));
                this.A1.c0();
                if (!E() || this.f32395z1) {
                    return;
                }
                h0();
            }
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    public void onMeasure(int i11, int i12) {
        super.onMeasure(i11, i12);
        if (!this.G1) {
            this.f32351c.getViewTreeObserver().addOnGlobalLayoutListener(this);
            this.G1 = true;
        }
        O0();
        this.f32351c.D0();
    }

    @Override // android.view.View
    public void onRestoreInstanceState(@Nullable Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        setError(savedState.f32396a);
        if (savedState.f32397b) {
            post(new b());
        }
        requestLayout();
    }

    @Override // android.widget.LinearLayout, android.view.View
    public void onRtlPropertiesChanged(int i11) {
        super.onRtlPropertiesChanged(i11);
        boolean z11 = i11 == 1;
        if (z11 != this.M) {
            float a11 = this.L.r().a(this.f32355f0);
            float a12 = this.L.t().a(this.f32355f0);
            vn.p m11 = vn.p.a().J(this.L.s()).O(this.L.q()).w(this.L.k()).B(this.L.i()).K(a12).P(a11).x(this.L.l().a(this.f32355f0)).C(this.L.j().a(this.f32355f0)).m();
            this.M = z11;
            setShapeAppearanceModel(m11);
        }
    }

    @Override // android.view.View
    @Nullable
    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        if (v0()) {
            savedState.f32396a = getError();
        }
        savedState.f32397b = this.f32351c.H();
        return savedState;
    }

    public final void p(@NonNull RectF rectF) {
        float f11 = rectF.left;
        int i11 = this.N;
        rectF.left = f11 - i11;
        rectF.right += i11;
    }

    public void p0(@NonNull i iVar) {
        this.f32351c.Q(iVar);
    }

    public final void q() {
        int i11 = this.O;
        if (i11 == 0) {
            this.F = null;
            this.J = null;
            this.K = null;
            return;
        }
        if (i11 == 1) {
            this.F = new vn.k(this.L);
            this.J = new vn.k();
            this.K = new vn.k();
        } else {
            if (i11 != 2) {
                throw new IllegalArgumentException(this.O + " is illegal; only @BoxBackgroundMode constants are supported.");
            }
            if (!this.C || (this.F instanceof com.google.android.material.textfield.h)) {
                this.F = new vn.k(this.L);
            } else {
                this.F = com.google.android.material.textfield.h.S0(this.L);
            }
            this.J = null;
            this.K = null;
        }
    }

    public final void q0() {
        TextView textView = this.f32382t;
        if (textView != null) {
            textView.setVisibility(8);
        }
    }

    public final int r() {
        return this.O == 1 ? en.u.s(en.u.e(this, R.attr.colorSurface, 0), this.U) : this.U;
    }

    public void r0(float f11, float f12, float f13, float f14) {
        boolean s11 = m0.s(this);
        this.M = s11;
        float f15 = s11 ? f12 : f11;
        if (!s11) {
            f11 = f12;
        }
        float f16 = s11 ? f14 : f13;
        if (!s11) {
            f13 = f14;
        }
        vn.k kVar = this.F;
        if (kVar != null && kVar.T() == f15 && this.F.U() == f11 && this.F.u() == f16 && this.F.v() == f13) {
            return;
        }
        this.L = this.L.v().K(f15).P(f11).x(f16).C(f13).m();
        n();
    }

    @NonNull
    public final Rect s(@NonNull Rect rect) {
        if (this.f32352d == null) {
            throw new IllegalStateException();
        }
        Rect rect2 = this.W;
        boolean s11 = m0.s(this);
        rect2.bottom = rect.bottom;
        int i11 = this.O;
        if (i11 == 1) {
            rect2.left = M(rect.left, s11);
            rect2.top = rect.top + this.P;
            rect2.right = N(rect.right, s11);
            return rect2;
        }
        if (i11 != 2) {
            rect2.left = M(rect.left, s11);
            rect2.top = getPaddingTop();
            rect2.right = N(rect.right, s11);
            return rect2;
        }
        rect2.left = rect.left + this.f32352d.getPaddingLeft();
        rect2.top = rect.top - w();
        rect2.right = rect.right - this.f32352d.getPaddingRight();
        return rect2;
    }

    public void s0(@DimenRes int i11, @DimenRes int i12, @DimenRes int i13, @DimenRes int i14) {
        r0(getContext().getResources().getDimension(i11), getContext().getResources().getDimension(i12), getContext().getResources().getDimension(i14), getContext().getResources().getDimension(i13));
    }

    public void setBoxBackgroundColor(@ColorInt int i11) {
        if (this.U != i11) {
            this.U = i11;
            this.f32383t1 = i11;
            this.f32387v1 = i11;
            this.f32389w1 = i11;
            n();
        }
    }

    public void setBoxBackgroundColorResource(@ColorRes int i11) {
        setBoxBackgroundColor(ContextCompat.getColor(getContext(), i11));
    }

    public void setBoxBackgroundColorStateList(@NonNull ColorStateList colorStateList) {
        int defaultColor = colorStateList.getDefaultColor();
        this.f32383t1 = defaultColor;
        this.U = defaultColor;
        this.f32385u1 = colorStateList.getColorForState(new int[]{-16842910}, -1);
        this.f32387v1 = colorStateList.getColorForState(new int[]{android.R.attr.state_focused, android.R.attr.state_enabled}, -1);
        this.f32389w1 = colorStateList.getColorForState(new int[]{android.R.attr.state_hovered, android.R.attr.state_enabled}, -1);
        n();
    }

    public void setBoxBackgroundMode(int i11) {
        if (i11 == this.O) {
            return;
        }
        this.O = i11;
        if (this.f32352d != null) {
            g0();
        }
    }

    public void setBoxCollapsedPaddingTop(int i11) {
        this.P = i11;
    }

    public void setBoxCornerFamily(int i11) {
        this.L = this.L.v().I(i11, this.L.r()).N(i11, this.L.t()).v(i11, this.L.j()).A(i11, this.L.l()).m();
        n();
    }

    public void setBoxStrokeColor(@ColorInt int i11) {
        if (this.f32379r1 != i11) {
            this.f32379r1 = i11;
            S0();
        }
    }

    public void setBoxStrokeColorStateList(@NonNull ColorStateList colorStateList) {
        if (colorStateList.isStateful()) {
            this.f32375p1 = colorStateList.getDefaultColor();
            this.f32391x1 = colorStateList.getColorForState(new int[]{-16842910}, -1);
            this.f32377q1 = colorStateList.getColorForState(new int[]{android.R.attr.state_hovered, android.R.attr.state_enabled}, -1);
            this.f32379r1 = colorStateList.getColorForState(new int[]{android.R.attr.state_focused, android.R.attr.state_enabled}, -1);
        } else if (this.f32379r1 != colorStateList.getDefaultColor()) {
            this.f32379r1 = colorStateList.getDefaultColor();
        }
        S0();
    }

    public void setBoxStrokeErrorColor(@Nullable ColorStateList colorStateList) {
        if (this.f32381s1 != colorStateList) {
            this.f32381s1 = colorStateList;
            S0();
        }
    }

    public void setBoxStrokeWidth(int i11) {
        this.R = i11;
        S0();
    }

    public void setBoxStrokeWidthFocused(int i11) {
        this.S = i11;
        S0();
    }

    public void setBoxStrokeWidthFocusedResource(@DimenRes int i11) {
        setBoxStrokeWidthFocused(getResources().getDimensionPixelSize(i11));
    }

    public void setBoxStrokeWidthResource(@DimenRes int i11) {
        setBoxStrokeWidth(getResources().getDimensionPixelSize(i11));
    }

    public void setCounterEnabled(boolean z11) {
        if (this.f32364k != z11) {
            if (z11) {
                AppCompatTextView appCompatTextView = new AppCompatTextView(getContext());
                this.f32372o = appCompatTextView;
                appCompatTextView.setId(R.id.textinput_counter);
                Typeface typeface = this.f32356f1;
                if (typeface != null) {
                    this.f32372o.setTypeface(typeface);
                }
                this.f32372o.setMaxLines(1);
                this.f32362j.e(this.f32372o, 2);
                MarginLayoutParamsCompat.setMarginStart((ViewGroup.MarginLayoutParams) this.f32372o.getLayoutParams(), getResources().getDimensionPixelOffset(R.dimen.mtrl_textinput_counter_margin_start));
                E0();
                B0();
            } else {
                this.f32362j.H(this.f32372o, 2);
                this.f32372o = null;
            }
            this.f32364k = z11;
        }
    }

    public void setCounterMaxLength(int i11) {
        if (this.f32366l != i11) {
            if (i11 > 0) {
                this.f32366l = i11;
            } else {
                this.f32366l = -1;
            }
            if (this.f32364k) {
                B0();
            }
        }
    }

    public void setCounterOverflowTextAppearance(int i11) {
        if (this.f32374p != i11) {
            this.f32374p = i11;
            E0();
        }
    }

    public void setCounterOverflowTextColor(@Nullable ColorStateList colorStateList) {
        if (this.f32394z != colorStateList) {
            this.f32394z = colorStateList;
            E0();
        }
    }

    public void setCounterTextAppearance(int i11) {
        if (this.f32376q != i11) {
            this.f32376q = i11;
            E0();
        }
    }

    public void setCounterTextColor(@Nullable ColorStateList colorStateList) {
        if (this.f32392y != colorStateList) {
            this.f32392y = colorStateList;
            E0();
        }
    }

    @RequiresApi(29)
    public void setCursorColor(@Nullable ColorStateList colorStateList) {
        if (this.A != colorStateList) {
            this.A = colorStateList;
            F0();
        }
    }

    @RequiresApi(29)
    public void setCursorErrorColor(@Nullable ColorStateList colorStateList) {
        if (this.B != colorStateList) {
            this.B = colorStateList;
            if (a0()) {
                F0();
            }
        }
    }

    public void setDefaultHintTextColor(@Nullable ColorStateList colorStateList) {
        this.f32371n1 = colorStateList;
        this.f32373o1 = colorStateList;
        if (this.f32352d != null) {
            M0(false);
        }
    }

    @Override // android.view.View
    public void setEnabled(boolean z11) {
        k0(this, z11);
        super.setEnabled(z11);
    }

    public void setEndIconActivated(boolean z11) {
        this.f32351c.S(z11);
    }

    public void setEndIconCheckable(boolean z11) {
        this.f32351c.T(z11);
    }

    public void setEndIconContentDescription(@StringRes int i11) {
        this.f32351c.U(i11);
    }

    public void setEndIconDrawable(@DrawableRes int i11) {
        this.f32351c.W(i11);
    }

    public void setEndIconMinSize(@IntRange(from = 0) int i11) {
        this.f32351c.Y(i11);
    }

    public void setEndIconMode(int i11) {
        this.f32351c.Z(i11);
    }

    public void setEndIconOnClickListener(@Nullable View.OnClickListener onClickListener) {
        this.f32351c.a0(onClickListener);
    }

    public void setEndIconOnLongClickListener(@Nullable View.OnLongClickListener onLongClickListener) {
        this.f32351c.b0(onLongClickListener);
    }

    public void setEndIconScaleType(@NonNull ImageView.ScaleType scaleType) {
        this.f32351c.c0(scaleType);
    }

    public void setEndIconTintList(@Nullable ColorStateList colorStateList) {
        this.f32351c.d0(colorStateList);
    }

    public void setEndIconTintMode(@Nullable PorterDuff.Mode mode) {
        this.f32351c.e0(mode);
    }

    public void setEndIconVisible(boolean z11) {
        this.f32351c.f0(z11);
    }

    public void setError(@Nullable CharSequence charSequence) {
        if (!this.f32362j.F()) {
            if (TextUtils.isEmpty(charSequence)) {
                return;
            } else {
                setErrorEnabled(true);
            }
        }
        if (TextUtils.isEmpty(charSequence)) {
            this.f32362j.A();
        } else {
            this.f32362j.V(charSequence);
        }
    }

    public void setErrorAccessibilityLiveRegion(int i11) {
        this.f32362j.J(i11);
    }

    public void setErrorContentDescription(@Nullable CharSequence charSequence) {
        this.f32362j.K(charSequence);
    }

    public void setErrorEnabled(boolean z11) {
        this.f32362j.L(z11);
    }

    public void setErrorIconDrawable(@DrawableRes int i11) {
        this.f32351c.g0(i11);
    }

    public void setErrorIconOnClickListener(@Nullable View.OnClickListener onClickListener) {
        this.f32351c.i0(onClickListener);
    }

    public void setErrorIconOnLongClickListener(@Nullable View.OnLongClickListener onLongClickListener) {
        this.f32351c.j0(onLongClickListener);
    }

    public void setErrorIconTintList(@Nullable ColorStateList colorStateList) {
        this.f32351c.k0(colorStateList);
    }

    public void setErrorIconTintMode(@Nullable PorterDuff.Mode mode) {
        this.f32351c.l0(mode);
    }

    public void setErrorTextAppearance(@StyleRes int i11) {
        this.f32362j.M(i11);
    }

    public void setErrorTextColor(@Nullable ColorStateList colorStateList) {
        this.f32362j.N(colorStateList);
    }

    public void setExpandedHintEnabled(boolean z11) {
        if (this.B1 != z11) {
            this.B1 = z11;
            M0(false);
        }
    }

    public void setHelperText(@Nullable CharSequence charSequence) {
        if (TextUtils.isEmpty(charSequence)) {
            if (W()) {
                setHelperTextEnabled(false);
            }
        } else {
            if (!W()) {
                setHelperTextEnabled(true);
            }
            this.f32362j.W(charSequence);
        }
    }

    public void setHelperTextColor(@Nullable ColorStateList colorStateList) {
        this.f32362j.Q(colorStateList);
    }

    public void setHelperTextEnabled(boolean z11) {
        this.f32362j.P(z11);
    }

    public void setHelperTextTextAppearance(@StyleRes int i11) {
        this.f32362j.O(i11);
    }

    public void setHint(@Nullable CharSequence charSequence) {
        if (this.C) {
            setHintInternal(charSequence);
            sendAccessibilityEvent(2048);
        }
    }

    public void setHintAnimationEnabled(boolean z11) {
        this.C1 = z11;
    }

    public void setHintEnabled(boolean z11) {
        if (z11 != this.C) {
            this.C = z11;
            if (z11) {
                CharSequence hint = this.f32352d.getHint();
                if (!TextUtils.isEmpty(hint)) {
                    if (TextUtils.isEmpty(this.D)) {
                        setHint(hint);
                    }
                    this.f32352d.setHint((CharSequence) null);
                }
                this.E = true;
            } else {
                this.E = false;
                if (!TextUtils.isEmpty(this.D) && TextUtils.isEmpty(this.f32352d.getHint())) {
                    this.f32352d.setHint(this.D);
                }
                setHintInternal(null);
            }
            if (this.f32352d != null) {
                L0();
            }
        }
    }

    public void setHintTextAppearance(@StyleRes int i11) {
        this.A1.i0(i11);
        this.f32373o1 = this.A1.p();
        if (this.f32352d != null) {
            M0(false);
            L0();
        }
    }

    public void setHintTextColor(@Nullable ColorStateList colorStateList) {
        if (this.f32373o1 != colorStateList) {
            if (this.f32371n1 == null) {
                this.A1.k0(colorStateList);
            }
            this.f32373o1 = colorStateList;
            if (this.f32352d != null) {
                M0(false);
            }
        }
    }

    public void setLengthCounter(@NonNull g gVar) {
        this.f32370n = gVar;
    }

    public void setMaxEms(int i11) {
        this.f32357g = i11;
        EditText editText = this.f32352d;
        if (editText == null || i11 == -1) {
            return;
        }
        editText.setMaxEms(i11);
    }

    public void setMaxWidth(@Px int i11) {
        this.f32360i = i11;
        EditText editText = this.f32352d;
        if (editText == null || i11 == -1) {
            return;
        }
        editText.setMaxWidth(i11);
    }

    public void setMaxWidthResource(@DimenRes int i11) {
        setMaxWidth(getContext().getResources().getDimensionPixelSize(i11));
    }

    public void setMinEms(int i11) {
        this.f32354f = i11;
        EditText editText = this.f32352d;
        if (editText == null || i11 == -1) {
            return;
        }
        editText.setMinEms(i11);
    }

    public void setMinWidth(@Px int i11) {
        this.f32358h = i11;
        EditText editText = this.f32352d;
        if (editText == null || i11 == -1) {
            return;
        }
        editText.setMinWidth(i11);
    }

    public void setMinWidthResource(@DimenRes int i11) {
        setMinWidth(getContext().getResources().getDimensionPixelSize(i11));
    }

    @Deprecated
    public void setPasswordVisibilityToggleContentDescription(@StringRes int i11) {
        this.f32351c.n0(i11);
    }

    @Deprecated
    public void setPasswordVisibilityToggleDrawable(@DrawableRes int i11) {
        this.f32351c.p0(i11);
    }

    @Deprecated
    public void setPasswordVisibilityToggleEnabled(boolean z11) {
        this.f32351c.r0(z11);
    }

    @Deprecated
    public void setPasswordVisibilityToggleTintList(@Nullable ColorStateList colorStateList) {
        this.f32351c.s0(colorStateList);
    }

    @Deprecated
    public void setPasswordVisibilityToggleTintMode(@Nullable PorterDuff.Mode mode) {
        this.f32351c.t0(mode);
    }

    public void setPlaceholderText(@Nullable CharSequence charSequence) {
        if (this.f32382t == null) {
            AppCompatTextView appCompatTextView = new AppCompatTextView(getContext());
            this.f32382t = appCompatTextView;
            appCompatTextView.setId(R.id.textinput_placeholder);
            ViewCompat.setImportantForAccessibility(this.f32382t, 2);
            Fade D = D();
            this.f32388w = D;
            D.setStartDelay(67L);
            this.f32390x = D();
            setPlaceholderTextAppearance(this.f32386v);
            setPlaceholderTextColor(this.f32384u);
        }
        if (TextUtils.isEmpty(charSequence)) {
            setPlaceholderTextEnabled(false);
        } else {
            if (!this.f32380s) {
                setPlaceholderTextEnabled(true);
            }
            this.f32378r = charSequence;
        }
        P0();
    }

    public void setPlaceholderTextAppearance(@StyleRes int i11) {
        this.f32386v = i11;
        TextView textView = this.f32382t;
        if (textView != null) {
            TextViewCompat.setTextAppearance(textView, i11);
        }
    }

    public void setPlaceholderTextColor(@Nullable ColorStateList colorStateList) {
        if (this.f32384u != colorStateList) {
            this.f32384u = colorStateList;
            TextView textView = this.f32382t;
            if (textView == null || colorStateList == null) {
                return;
            }
            textView.setTextColor(colorStateList);
        }
    }

    public void setPrefixText(@Nullable CharSequence charSequence) {
        this.f32350b.o(charSequence);
    }

    public void setPrefixTextAppearance(@StyleRes int i11) {
        this.f32350b.p(i11);
    }

    public void setPrefixTextColor(@NonNull ColorStateList colorStateList) {
        this.f32350b.q(colorStateList);
    }

    public void setShapeAppearanceModel(@NonNull vn.p pVar) {
        vn.k kVar = this.F;
        if (kVar == null || kVar.getShapeAppearanceModel() == pVar) {
            return;
        }
        this.L = pVar;
        n();
    }

    public void setStartIconCheckable(boolean z11) {
        this.f32350b.r(z11);
    }

    public void setStartIconContentDescription(@StringRes int i11) {
        setStartIconContentDescription(i11 != 0 ? getResources().getText(i11) : null);
    }

    public void setStartIconDrawable(@DrawableRes int i11) {
        setStartIconDrawable(i11 != 0 ? AppCompatResources.getDrawable(getContext(), i11) : null);
    }

    public void setStartIconMinSize(@IntRange(from = 0) int i11) {
        this.f32350b.u(i11);
    }

    public void setStartIconOnClickListener(@Nullable View.OnClickListener onClickListener) {
        this.f32350b.v(onClickListener);
    }

    public void setStartIconOnLongClickListener(@Nullable View.OnLongClickListener onLongClickListener) {
        this.f32350b.w(onLongClickListener);
    }

    public void setStartIconScaleType(@NonNull ImageView.ScaleType scaleType) {
        this.f32350b.x(scaleType);
    }

    public void setStartIconTintList(@Nullable ColorStateList colorStateList) {
        this.f32350b.y(colorStateList);
    }

    public void setStartIconTintMode(@Nullable PorterDuff.Mode mode) {
        this.f32350b.z(mode);
    }

    public void setStartIconVisible(boolean z11) {
        this.f32350b.A(z11);
    }

    public void setSuffixText(@Nullable CharSequence charSequence) {
        this.f32351c.u0(charSequence);
    }

    public void setSuffixTextAppearance(@StyleRes int i11) {
        this.f32351c.v0(i11);
    }

    public void setSuffixTextColor(@NonNull ColorStateList colorStateList) {
        this.f32351c.w0(colorStateList);
    }

    public void setTextInputAccessibilityDelegate(@Nullable d dVar) {
        EditText editText = this.f32352d;
        if (editText != null) {
            ViewCompat.setAccessibilityDelegate(editText, dVar);
        }
    }

    public void setTypeface(@Nullable Typeface typeface) {
        if (typeface != this.f32356f1) {
            this.f32356f1 = typeface;
            this.A1.P0(typeface);
            this.f32362j.S(typeface);
            TextView textView = this.f32372o;
            if (textView != null) {
                textView.setTypeface(typeface);
            }
        }
    }

    public final int t(@NonNull Rect rect, @NonNull Rect rect2, float f11) {
        return d0() ? (int) (rect2.top + f11) : rect.bottom - this.f32352d.getCompoundPaddingBottom();
    }

    public final void t0() {
        EditText editText = this.f32352d;
        if (editText instanceof AutoCompleteTextView) {
            AutoCompleteTextView autoCompleteTextView = (AutoCompleteTextView) editText;
            if (autoCompleteTextView.getDropDownBackground() == null) {
                int i11 = this.O;
                if (i11 == 2) {
                    autoCompleteTextView.setDropDownBackgroundDrawable(getOrCreateOutlinedDropDownMenuBackground());
                } else if (i11 == 1) {
                    autoCompleteTextView.setDropDownBackgroundDrawable(getOrCreateFilledDropDownMenuBackground());
                }
            }
        }
    }

    public final int u(@NonNull Rect rect, float f11) {
        return d0() ? (int) (rect.centerY() - (f11 / 2.0f)) : rect.top + this.f32352d.getCompoundPaddingTop();
    }

    public void u0(@NonNull TextView textView, @StyleRes int i11) {
        try {
            TextViewCompat.setTextAppearance(textView, i11);
            if (textView.getTextColors().getDefaultColor() != -65281) {
                return;
            }
        } catch (Exception unused) {
        }
        TextViewCompat.setTextAppearance(textView, R.style.TextAppearance_AppCompat_Caption);
        textView.setTextColor(ContextCompat.getColor(getContext(), R.color.design_error));
    }

    @NonNull
    public final Rect v(@NonNull Rect rect) {
        if (this.f32352d == null) {
            throw new IllegalStateException();
        }
        Rect rect2 = this.W;
        float D = this.A1.D();
        rect2.left = rect.left + this.f32352d.getCompoundPaddingLeft();
        rect2.top = u(rect, D);
        rect2.right = rect.right - this.f32352d.getCompoundPaddingRight();
        rect2.bottom = t(rect, rect2, D);
        return rect2;
    }

    public boolean v0() {
        return this.f32362j.m();
    }

    public final int w() {
        float r11;
        if (!this.C) {
            return 0;
        }
        int i11 = this.O;
        if (i11 == 0) {
            r11 = this.A1.r();
        } else {
            if (i11 != 2) {
                return 0;
            }
            r11 = this.A1.r() / 2.0f;
        }
        return (int) r11;
    }

    public final boolean w0() {
        return (this.f32351c.J() || ((this.f32351c.C() && S()) || this.f32351c.y() != null)) && this.f32351c.getMeasuredWidth() > 0;
    }

    public final boolean x() {
        return this.O == 2 && y();
    }

    public final boolean x0() {
        return (getStartIconDrawable() != null || (getPrefixText() != null && getPrefixTextView().getVisibility() == 0)) && this.f32350b.getMeasuredWidth() > 0;
    }

    public final boolean y() {
        return this.Q > -1 && this.T != 0;
    }

    public final void y0() {
        if (this.f32382t == null || !this.f32380s || TextUtils.isEmpty(this.f32378r)) {
            return;
        }
        this.f32382t.setText(this.f32378r);
        TransitionManager.beginDelayedTransition(this.f32349a, this.f32388w);
        this.f32382t.setVisibility(0);
        this.f32382t.bringToFront();
        announceForAccessibility(this.f32378r);
    }

    public void z() {
        this.f32363j1.clear();
    }

    public final void z0() {
        if (this.O == 1) {
            if (sn.c.k(getContext())) {
                this.P = getResources().getDimensionPixelSize(R.dimen.material_font_2_0_box_collapsed_padding_top);
            } else if (sn.c.j(getContext())) {
                this.P = getResources().getDimensionPixelSize(R.dimen.material_font_1_3_box_collapsed_padding_top);
            }
        }
    }

    public TextInputLayout(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.textInputStyle);
    }

    public void setEndIconContentDescription(@Nullable CharSequence charSequence) {
        this.f32351c.V(charSequence);
    }

    public void setEndIconDrawable(@Nullable Drawable drawable) {
        this.f32351c.X(drawable);
    }

    public void setErrorIconDrawable(@Nullable Drawable drawable) {
        this.f32351c.h0(drawable);
    }

    @Deprecated
    public void setPasswordVisibilityToggleContentDescription(@Nullable CharSequence charSequence) {
        this.f32351c.o0(charSequence);
    }

    @Deprecated
    public void setPasswordVisibilityToggleDrawable(@Nullable Drawable drawable) {
        this.f32351c.q0(drawable);
    }

    public void setStartIconContentDescription(@Nullable CharSequence charSequence) {
        this.f32350b.s(charSequence);
    }

    public void setStartIconDrawable(@Nullable Drawable drawable) {
        this.f32350b.t(drawable);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public TextInputLayout(@androidx.annotation.NonNull android.content.Context r20, @androidx.annotation.Nullable android.util.AttributeSet r21, int r22) {
        /*
            Method dump skipped, instructions count: 858
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.textfield.TextInputLayout.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }

    public void setHint(@StringRes int i11) {
        setHint(i11 != 0 ? getResources().getText(i11) : null);
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class a implements TextWatcher {

        /* renamed from: a, reason: collision with root package name */
        public int f32398a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ EditText f32399b;

        public a(EditText editText) {
            this.f32399b = editText;
            this.f32398a = editText.getLineCount();
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(@NonNull Editable editable) {
            TextInputLayout.this.M0(!r0.F1);
            TextInputLayout textInputLayout = TextInputLayout.this;
            if (textInputLayout.f32364k) {
                textInputLayout.C0(editable);
            }
            if (TextInputLayout.this.f32380s) {
                TextInputLayout.this.Q0(editable);
            }
            int lineCount = this.f32399b.getLineCount();
            int i11 = this.f32398a;
            if (lineCount != i11) {
                if (lineCount < i11) {
                    int minimumHeight = ViewCompat.getMinimumHeight(this.f32399b);
                    int i12 = TextInputLayout.this.f32393y1;
                    if (minimumHeight != i12) {
                        this.f32399b.setMinimumHeight(i12);
                    }
                }
                this.f32398a = lineCount;
            }
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i11, int i12, int i13) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i11, int i12, int i13) {
        }
    }
}
