package com.google.android.material.checkbox;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.AnimatedStateListDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.autofill.AutofillManager;
import android.widget.CompoundButton;
import androidx.annotation.DrawableRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.annotation.StringRes;
import androidx.appcompat.content.res.AppCompatResources;
import androidx.appcompat.widget.AppCompatCheckBox;
import androidx.appcompat.widget.TintTypedArray;
import androidx.core.graphics.drawable.DrawableCompat;
import androidx.core.widget.CompoundButtonCompat;
import androidx.vectordrawable.graphics.drawable.Animatable2Compat;
import androidx.vectordrawable.graphics.drawable.AnimatedVectorDrawableCompat;
import com.alipay.sdk.m.u.i;
import com.google.android.material.R;
import com.google.android.material.internal.m0;
import en.u;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.Iterator;
import java.util.LinkedHashSet;
import org.junit.jupiter.api.j2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public class MaterialCheckBox extends AppCompatCheckBox {
    public static final int[][] A;

    @SuppressLint({"DiscouragedApi"})
    public static final int B;

    /* renamed from: v, reason: collision with root package name */
    public static final int f30958v = 0;

    /* renamed from: w, reason: collision with root package name */
    public static final int f30959w = 1;

    /* renamed from: x, reason: collision with root package name */
    public static final int f30960x = 2;

    /* renamed from: z, reason: collision with root package name */
    public static final int[] f30962z;

    /* renamed from: a, reason: collision with root package name */
    @NonNull
    public final LinkedHashSet<d> f30963a;

    /* renamed from: b, reason: collision with root package name */
    @NonNull
    public final LinkedHashSet<c> f30964b;

    /* renamed from: c, reason: collision with root package name */
    @Nullable
    public ColorStateList f30965c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f30966d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f30967e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f30968f;

    /* renamed from: g, reason: collision with root package name */
    @Nullable
    public CharSequence f30969g;

    /* renamed from: h, reason: collision with root package name */
    @Nullable
    public Drawable f30970h;

    /* renamed from: i, reason: collision with root package name */
    @Nullable
    public Drawable f30971i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f30972j;

    /* renamed from: k, reason: collision with root package name */
    @Nullable
    public ColorStateList f30973k;

    /* renamed from: l, reason: collision with root package name */
    @Nullable
    public ColorStateList f30974l;

    /* renamed from: m, reason: collision with root package name */
    @NonNull
    public PorterDuff.Mode f30975m;

    /* renamed from: n, reason: collision with root package name */
    public int f30976n;

    /* renamed from: o, reason: collision with root package name */
    public int[] f30977o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f30978p;

    /* renamed from: q, reason: collision with root package name */
    @Nullable
    public CharSequence f30979q;

    /* renamed from: r, reason: collision with root package name */
    @Nullable
    public CompoundButton.OnCheckedChangeListener f30980r;

    /* renamed from: s, reason: collision with root package name */
    @Nullable
    public final AnimatedVectorDrawableCompat f30981s;

    /* renamed from: t, reason: collision with root package name */
    public final Animatable2Compat.AnimationCallback f30982t;

    /* renamed from: u, reason: collision with root package name */
    public static final int f30957u = R.style.Widget_MaterialComponents_CompoundButton_CheckBox;

    /* renamed from: y, reason: collision with root package name */
    public static final int[] f30961y = {R.attr.state_indeterminate};

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class SavedState extends View.BaseSavedState {

        @NonNull
        public static final Parcelable.Creator<SavedState> CREATOR = new a();

        /* renamed from: a, reason: collision with root package name */
        public int f30983a;

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public class a implements Parcelable.Creator<SavedState> {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel, null);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public SavedState[] newArray(int i11) {
                return new SavedState[i11];
            }
        }

        public /* synthetic */ SavedState(Parcel parcel, a aVar) {
            this(parcel);
        }

        @NonNull
        public final String a() {
            int i11 = this.f30983a;
            return i11 != 1 ? i11 != 2 ? "unchecked" : "indeterminate" : "checked";
        }

        @NonNull
        public String toString() {
            return "MaterialCheckBox.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " CheckedState=" + a() + i.f11099d;
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i11) {
            super.writeToParcel(parcel, i11);
            parcel.writeValue(Integer.valueOf(this.f30983a));
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        public SavedState(Parcel parcel) {
            super(parcel);
            this.f30983a = ((Integer) parcel.readValue(getClass().getClassLoader())).intValue();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class a extends Animatable2Compat.AnimationCallback {
        public a() {
        }

        @Override // androidx.vectordrawable.graphics.drawable.Animatable2Compat.AnimationCallback
        public void onAnimationEnd(Drawable drawable) {
            super.onAnimationEnd(drawable);
            ColorStateList colorStateList = MaterialCheckBox.this.f30973k;
            if (colorStateList != null) {
                DrawableCompat.setTintList(drawable, colorStateList);
            }
        }

        @Override // androidx.vectordrawable.graphics.drawable.Animatable2Compat.AnimationCallback
        public void onAnimationStart(Drawable drawable) {
            super.onAnimationStart(drawable);
            MaterialCheckBox materialCheckBox = MaterialCheckBox.this;
            ColorStateList colorStateList = materialCheckBox.f30973k;
            if (colorStateList != null) {
                DrawableCompat.setTint(drawable, colorStateList.getColorForState(materialCheckBox.f30977o, MaterialCheckBox.this.f30973k.getDefaultColor()));
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public @interface b {
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public interface c {
        void a(@NonNull MaterialCheckBox materialCheckBox, int i11);
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public interface d {
        void a(@NonNull MaterialCheckBox materialCheckBox, boolean z11);
    }

    static {
        int i11 = R.attr.state_error;
        f30962z = new int[]{i11};
        A = new int[][]{new int[]{android.R.attr.state_enabled, i11}, new int[]{android.R.attr.state_enabled, android.R.attr.state_checked}, new int[]{android.R.attr.state_enabled, -16842912}, new int[]{-16842910, android.R.attr.state_checked}, new int[]{-16842910, -16842912}};
        B = Resources.getSystem().getIdentifier("btn_check_material_anim", "drawable", "android");
    }

    public MaterialCheckBox(Context context) {
        this(context, null);
    }

    @NonNull
    private String getButtonStateDescription() {
        int i11 = this.f30976n;
        return i11 == 1 ? getResources().getString(R.string.mtrl_checkbox_state_description_checked) : i11 == 0 ? getResources().getString(R.string.mtrl_checkbox_state_description_unchecked) : getResources().getString(R.string.mtrl_checkbox_state_description_indeterminate);
    }

    private ColorStateList getMaterialThemeColorsTintList() {
        if (this.f30965c == null) {
            int[][] iArr = A;
            int[] iArr2 = new int[iArr.length];
            int d11 = u.d(this, R.attr.colorControlActivated);
            int d12 = u.d(this, R.attr.colorError);
            int d13 = u.d(this, R.attr.colorSurface);
            int d14 = u.d(this, R.attr.colorOnSurface);
            iArr2[0] = u.t(d13, d12, 1.0f);
            iArr2[1] = u.t(d13, d11, 1.0f);
            iArr2[2] = u.t(d13, d14, 0.54f);
            iArr2[3] = u.t(d13, d14, 0.38f);
            iArr2[4] = u.t(d13, d14, 0.38f);
            this.f30965c = new ColorStateList(iArr, iArr2);
        }
        return this.f30965c;
    }

    @Nullable
    private ColorStateList getSuperButtonTintList() {
        ColorStateList colorStateList = this.f30973k;
        return colorStateList != null ? colorStateList : super.getButtonTintList() != null ? super.getButtonTintList() : getSupportButtonTintList();
    }

    public void d(@NonNull c cVar) {
        this.f30964b.add(cVar);
    }

    public void e(@NonNull d dVar) {
        this.f30963a.add(dVar);
    }

    public void f() {
        this.f30964b.clear();
    }

    public void g() {
        this.f30963a.clear();
    }

    @Override // android.widget.CompoundButton
    @Nullable
    public Drawable getButtonDrawable() {
        return this.f30970h;
    }

    @Nullable
    public Drawable getButtonIconDrawable() {
        return this.f30971i;
    }

    @Nullable
    public ColorStateList getButtonIconTintList() {
        return this.f30974l;
    }

    @NonNull
    public PorterDuff.Mode getButtonIconTintMode() {
        return this.f30975m;
    }

    @Override // android.widget.CompoundButton
    @Nullable
    public ColorStateList getButtonTintList() {
        return this.f30973k;
    }

    public int getCheckedState() {
        return this.f30976n;
    }

    @Nullable
    public CharSequence getErrorAccessibilityLabel() {
        return this.f30969g;
    }

    public final boolean h(TintTypedArray tintTypedArray) {
        return tintTypedArray.getResourceId(R.styleable.MaterialCheckBox_android_button, 0) == B && tintTypedArray.getResourceId(R.styleable.MaterialCheckBox_buttonCompat, 0) == 0;
    }

    public boolean i() {
        return this.f30967e;
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public boolean isChecked() {
        return this.f30976n == 1;
    }

    public boolean j() {
        return this.f30968f;
    }

    public boolean k() {
        return this.f30966d;
    }

    public final void l() {
        this.f30970h = kn.d.d(this.f30970h, this.f30973k, CompoundButtonCompat.getButtonTintMode(this));
        this.f30971i = kn.d.d(this.f30971i, this.f30974l, this.f30975m);
        p();
        q();
        super.setButtonDrawable(kn.d.a(this.f30970h, this.f30971i));
        refreshDrawableState();
    }

    public void m(@NonNull c cVar) {
        this.f30964b.remove(cVar);
    }

    public void n(@NonNull d dVar) {
        this.f30963a.remove(dVar);
    }

    public final void o() {
        if (Build.VERSION.SDK_INT < 30 || this.f30979q != null) {
            return;
        }
        super.setStateDescription(getButtonStateDescription());
    }

    @Override // android.widget.TextView, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f30966d && this.f30973k == null && this.f30974l == null) {
            setUseMaterialThemeColors(true);
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public int[] onCreateDrawableState(int i11) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i11 + 2);
        if (getCheckedState() == 2) {
            View.mergeDrawableStates(onCreateDrawableState, f30961y);
        }
        if (j()) {
            View.mergeDrawableStates(onCreateDrawableState, f30962z);
        }
        this.f30977o = kn.d.f(onCreateDrawableState);
        r();
        return onCreateDrawableState;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public void onDraw(Canvas canvas) {
        Drawable buttonDrawable;
        if (!this.f30967e || !TextUtils.isEmpty(getText()) || (buttonDrawable = CompoundButtonCompat.getButtonDrawable(this)) == null) {
            super.onDraw(canvas);
            return;
        }
        int width = ((getWidth() - buttonDrawable.getIntrinsicWidth()) / 2) * (m0.s(this) ? -1 : 1);
        int save = canvas.save();
        canvas.translate(width, 0.0f);
        super.onDraw(canvas);
        canvas.restoreToCount(save);
        if (getBackground() != null) {
            Rect bounds = buttonDrawable.getBounds();
            DrawableCompat.setHotspotBounds(getBackground(), bounds.left + width, bounds.top, bounds.right + width, bounds.bottom);
        }
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(@Nullable AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        if (accessibilityNodeInfo != null && j()) {
            accessibilityNodeInfo.setText(((Object) accessibilityNodeInfo.getText()) + j2.O + ((Object) this.f30969g));
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public void onRestoreInstanceState(@Nullable Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        setCheckedState(savedState.f30983a);
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    @Nullable
    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.f30983a = getCheckedState();
        return savedState;
    }

    public final void p() {
        AnimatedVectorDrawableCompat animatedVectorDrawableCompat;
        if (this.f30972j) {
            AnimatedVectorDrawableCompat animatedVectorDrawableCompat2 = this.f30981s;
            if (animatedVectorDrawableCompat2 != null) {
                animatedVectorDrawableCompat2.unregisterAnimationCallback(this.f30982t);
                this.f30981s.registerAnimationCallback(this.f30982t);
            }
            Drawable drawable = this.f30970h;
            if (!(drawable instanceof AnimatedStateListDrawable) || (animatedVectorDrawableCompat = this.f30981s) == null) {
                return;
            }
            int i11 = R.id.checked;
            int i12 = R.id.unchecked;
            ((AnimatedStateListDrawable) drawable).addTransition(i11, i12, animatedVectorDrawableCompat, false);
            ((AnimatedStateListDrawable) this.f30970h).addTransition(R.id.indeterminate, i12, this.f30981s, false);
        }
    }

    public final void q() {
        ColorStateList colorStateList;
        ColorStateList colorStateList2;
        Drawable drawable = this.f30970h;
        if (drawable != null && (colorStateList2 = this.f30973k) != null) {
            DrawableCompat.setTintList(drawable, colorStateList2);
        }
        Drawable drawable2 = this.f30971i;
        if (drawable2 == null || (colorStateList = this.f30974l) == null) {
            return;
        }
        DrawableCompat.setTintList(drawable2, colorStateList);
    }

    @Override // androidx.appcompat.widget.AppCompatCheckBox, android.widget.CompoundButton
    public void setButtonDrawable(@DrawableRes int i11) {
        setButtonDrawable(AppCompatResources.getDrawable(getContext(), i11));
    }

    public void setButtonIconDrawable(@Nullable Drawable drawable) {
        this.f30971i = drawable;
        l();
    }

    public void setButtonIconDrawableResource(@DrawableRes int i11) {
        setButtonIconDrawable(AppCompatResources.getDrawable(getContext(), i11));
    }

    public void setButtonIconTintList(@Nullable ColorStateList colorStateList) {
        if (this.f30974l == colorStateList) {
            return;
        }
        this.f30974l = colorStateList;
        l();
    }

    public void setButtonIconTintMode(@NonNull PorterDuff.Mode mode) {
        if (this.f30975m == mode) {
            return;
        }
        this.f30975m = mode;
        l();
    }

    @Override // android.widget.CompoundButton
    public void setButtonTintList(@Nullable ColorStateList colorStateList) {
        if (this.f30973k == colorStateList) {
            return;
        }
        this.f30973k = colorStateList;
        l();
    }

    @Override // android.widget.CompoundButton
    public void setButtonTintMode(@Nullable PorterDuff.Mode mode) {
        setSupportButtonTintMode(mode);
        l();
    }

    public void setCenterIfNoTextEnabled(boolean z11) {
        this.f30967e = z11;
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public void setChecked(boolean z11) {
        setCheckedState(z11 ? 1 : 0);
    }

    public void setCheckedState(int i11) {
        AutofillManager a11;
        CompoundButton.OnCheckedChangeListener onCheckedChangeListener;
        if (this.f30976n != i11) {
            this.f30976n = i11;
            super.setChecked(i11 == 1);
            refreshDrawableState();
            o();
            if (this.f30978p) {
                return;
            }
            this.f30978p = true;
            LinkedHashSet<c> linkedHashSet = this.f30964b;
            if (linkedHashSet != null) {
                Iterator<c> it = linkedHashSet.iterator();
                while (it.hasNext()) {
                    it.next().a(this, this.f30976n);
                }
            }
            if (this.f30976n != 2 && (onCheckedChangeListener = this.f30980r) != null) {
                onCheckedChangeListener.onCheckedChanged(this, isChecked());
            }
            if (Build.VERSION.SDK_INT >= 26 && (a11 = androidx.compose.ui.autofill.d.a(getContext().getSystemService(androidx.compose.ui.autofill.c.a()))) != null) {
                a11.notifyValueChanged(this);
            }
            this.f30978p = false;
        }
    }

    @Override // android.widget.TextView, android.view.View
    public void setEnabled(boolean z11) {
        super.setEnabled(z11);
        r();
    }

    public void setErrorAccessibilityLabel(@Nullable CharSequence charSequence) {
        this.f30969g = charSequence;
    }

    public void setErrorAccessibilityLabelResource(@StringRes int i11) {
        setErrorAccessibilityLabel(i11 != 0 ? getResources().getText(i11) : null);
    }

    public void setErrorShown(boolean z11) {
        if (this.f30968f == z11) {
            return;
        }
        this.f30968f = z11;
        refreshDrawableState();
        Iterator<d> it = this.f30963a.iterator();
        while (it.hasNext()) {
            it.next().a(this, this.f30968f);
        }
    }

    @Override // android.widget.CompoundButton
    public void setOnCheckedChangeListener(@Nullable CompoundButton.OnCheckedChangeListener onCheckedChangeListener) {
        this.f30980r = onCheckedChangeListener;
    }

    @Override // android.widget.CompoundButton, android.view.View
    @RequiresApi(30)
    public void setStateDescription(@Nullable CharSequence charSequence) {
        this.f30979q = charSequence;
        if (charSequence == null) {
            o();
        } else {
            super.setStateDescription(charSequence);
        }
    }

    public void setUseMaterialThemeColors(boolean z11) {
        this.f30966d = z11;
        if (z11) {
            CompoundButtonCompat.setButtonTintList(this, getMaterialThemeColorsTintList());
        } else {
            CompoundButtonCompat.setButtonTintList(this, null);
        }
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public void toggle() {
        setChecked(!isChecked());
    }

    public MaterialCheckBox(Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.checkboxStyle);
    }

    @Override // androidx.appcompat.widget.AppCompatCheckBox, android.widget.CompoundButton
    public void setButtonDrawable(@Nullable Drawable drawable) {
        this.f30970h = drawable;
        this.f30972j = false;
        l();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public MaterialCheckBox(android.content.Context r8, @androidx.annotation.Nullable android.util.AttributeSet r9, int r10) {
        /*
            r7 = this;
            int r4 = com.google.android.material.checkbox.MaterialCheckBox.f30957u
            android.content.Context r8 = zn.a.c(r8, r9, r10, r4)
            r7.<init>(r8, r9, r10)
            java.util.LinkedHashSet r8 = new java.util.LinkedHashSet
            r8.<init>()
            r7.f30963a = r8
            java.util.LinkedHashSet r8 = new java.util.LinkedHashSet
            r8.<init>()
            r7.f30964b = r8
            android.content.Context r8 = r7.getContext()
            int r0 = com.google.android.material.R.drawable.mtrl_checkbox_button_checked_unchecked
            androidx.vectordrawable.graphics.drawable.AnimatedVectorDrawableCompat r8 = androidx.vectordrawable.graphics.drawable.AnimatedVectorDrawableCompat.create(r8, r0)
            r7.f30981s = r8
            com.google.android.material.checkbox.MaterialCheckBox$a r8 = new com.google.android.material.checkbox.MaterialCheckBox$a
            r8.<init>()
            r7.f30982t = r8
            android.content.Context r0 = r7.getContext()
            android.graphics.drawable.Drawable r8 = androidx.core.widget.CompoundButtonCompat.getButtonDrawable(r7)
            r7.f30970h = r8
            android.content.res.ColorStateList r8 = r7.getSuperButtonTintList()
            r7.f30973k = r8
            r8 = 0
            r7.setSupportButtonTintList(r8)
            int[] r2 = com.google.android.material.R.styleable.MaterialCheckBox
            r6 = 0
            int[] r5 = new int[r6]
            r1 = r9
            r3 = r10
            androidx.appcompat.widget.TintTypedArray r9 = com.google.android.material.internal.d0.l(r0, r1, r2, r3, r4, r5)
            int r10 = com.google.android.material.R.styleable.MaterialCheckBox_buttonIcon
            android.graphics.drawable.Drawable r10 = r9.getDrawable(r10)
            r7.f30971i = r10
            android.graphics.drawable.Drawable r10 = r7.f30970h
            r1 = 1
            if (r10 == 0) goto L7b
            boolean r10 = com.google.android.material.internal.d0.h(r0)
            if (r10 == 0) goto L7b
            boolean r10 = r7.h(r9)
            if (r10 == 0) goto L7b
            super.setButtonDrawable(r8)
            int r8 = com.google.android.material.R.drawable.mtrl_checkbox_button
            android.graphics.drawable.Drawable r8 = androidx.appcompat.content.res.AppCompatResources.getDrawable(r0, r8)
            r7.f30970h = r8
            r7.f30972j = r1
            android.graphics.drawable.Drawable r8 = r7.f30971i
            if (r8 != 0) goto L7b
            int r8 = com.google.android.material.R.drawable.mtrl_checkbox_button_icon
            android.graphics.drawable.Drawable r8 = androidx.appcompat.content.res.AppCompatResources.getDrawable(r0, r8)
            r7.f30971i = r8
        L7b:
            int r8 = com.google.android.material.R.styleable.MaterialCheckBox_buttonIconTint
            android.content.res.ColorStateList r8 = sn.c.b(r0, r9, r8)
            r7.f30974l = r8
            int r8 = com.google.android.material.R.styleable.MaterialCheckBox_buttonIconTintMode
            r10 = -1
            int r8 = r9.getInt(r8, r10)
            android.graphics.PorterDuff$Mode r10 = android.graphics.PorterDuff.Mode.SRC_IN
            android.graphics.PorterDuff$Mode r8 = com.google.android.material.internal.m0.t(r8, r10)
            r7.f30975m = r8
            int r8 = com.google.android.material.R.styleable.MaterialCheckBox_useMaterialThemeColors
            boolean r8 = r9.getBoolean(r8, r6)
            r7.f30966d = r8
            int r8 = com.google.android.material.R.styleable.MaterialCheckBox_centerIfNoTextEnabled
            boolean r8 = r9.getBoolean(r8, r1)
            r7.f30967e = r8
            int r8 = com.google.android.material.R.styleable.MaterialCheckBox_errorShown
            boolean r8 = r9.getBoolean(r8, r6)
            r7.f30968f = r8
            int r8 = com.google.android.material.R.styleable.MaterialCheckBox_errorAccessibilityLabel
            java.lang.CharSequence r8 = r9.getText(r8)
            r7.f30969g = r8
            int r8 = com.google.android.material.R.styleable.MaterialCheckBox_checkedState
            boolean r10 = r9.hasValue(r8)
            if (r10 == 0) goto Lc1
            int r8 = r9.getInt(r8, r6)
            r7.setCheckedState(r8)
        Lc1:
            r9.recycle()
            r7.l()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.checkbox.MaterialCheckBox.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }

    public final void r() {
    }
}
