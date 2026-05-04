package com.google.android.material.button;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.Layout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;
import android.widget.Checkable;
import android.widget.CompoundButton;
import androidx.annotation.ColorInt;
import androidx.annotation.ColorRes;
import androidx.annotation.DimenRes;
import androidx.annotation.Dimension;
import androidx.annotation.DrawableRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.Px;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.appcompat.content.res.AppCompatResources;
import androidx.appcompat.widget.AppCompatButton;
import androidx.core.graphics.drawable.DrawableCompat;
import androidx.core.view.GravityCompat;
import androidx.core.view.ViewCompat;
import androidx.core.widget.TextViewCompat;
import androidx.customview.view.AbsSavedState;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.Iterator;
import java.util.LinkedHashSet;
import vn.l;
import vn.p;
import vn.t;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public class MaterialButton extends AppCompatButton implements Checkable, t {

    /* renamed from: q, reason: collision with root package name */
    public static final int f30804q = 1;

    /* renamed from: r, reason: collision with root package name */
    public static final int f30805r = 2;

    /* renamed from: s, reason: collision with root package name */
    public static final int f30806s = 3;

    /* renamed from: t, reason: collision with root package name */
    public static final int f30807t = 4;

    /* renamed from: u, reason: collision with root package name */
    public static final int f30808u = 16;

    /* renamed from: v, reason: collision with root package name */
    public static final int f30809v = 32;

    /* renamed from: w, reason: collision with root package name */
    public static final String f30810w = "MaterialButton";

    /* renamed from: a, reason: collision with root package name */
    @NonNull
    public final e f30812a;

    /* renamed from: b, reason: collision with root package name */
    @NonNull
    public final LinkedHashSet<b> f30813b;

    /* renamed from: c, reason: collision with root package name */
    @Nullable
    public c f30814c;

    /* renamed from: d, reason: collision with root package name */
    @Nullable
    public PorterDuff.Mode f30815d;

    /* renamed from: e, reason: collision with root package name */
    @Nullable
    public ColorStateList f30816e;

    /* renamed from: f, reason: collision with root package name */
    @Nullable
    public Drawable f30817f;

    /* renamed from: g, reason: collision with root package name */
    @Nullable
    public String f30818g;

    /* renamed from: h, reason: collision with root package name */
    @Px
    public int f30819h;

    /* renamed from: i, reason: collision with root package name */
    @Px
    public int f30820i;

    /* renamed from: j, reason: collision with root package name */
    @Px
    public int f30821j;

    /* renamed from: k, reason: collision with root package name */
    @Px
    public int f30822k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f30823l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f30824m;

    /* renamed from: n, reason: collision with root package name */
    public int f30825n;

    /* renamed from: o, reason: collision with root package name */
    public static final int[] f30802o = {R.attr.state_checkable};

    /* renamed from: p, reason: collision with root package name */
    public static final int[] f30803p = {R.attr.state_checked};

    /* renamed from: x, reason: collision with root package name */
    public static final int f30811x = com.google.android.material.R.style.Widget_MaterialComponents_Button;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new a();

        /* renamed from: a, reason: collision with root package name */
        public boolean f30826a;

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public class a implements Parcelable.ClassLoaderCreator<SavedState> {
            @Override // android.os.Parcelable.Creator
            @NonNull
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

        public final void a(@NonNull Parcel parcel) {
            this.f30826a = parcel.readInt() == 1;
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(@NonNull Parcel parcel, int i11) {
            super.writeToParcel(parcel, i11);
            parcel.writeInt(this.f30826a ? 1 : 0);
        }

        public SavedState(@NonNull Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            if (classLoader == null) {
                getClass().getClassLoader();
            }
            a(parcel);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @Retention(RetentionPolicy.SOURCE)
    public @interface a {
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public interface b {
        void a(MaterialButton materialButton, boolean z11);
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public interface c {
        void a(MaterialButton materialButton, boolean z11);
    }

    public MaterialButton(@NonNull Context context) {
        this(context, null);
    }

    private Layout.Alignment getActualTextAlignment() {
        int textAlignment = getTextAlignment();
        return textAlignment != 1 ? (textAlignment == 6 || textAlignment == 3) ? Layout.Alignment.ALIGN_OPPOSITE : textAlignment != 4 ? Layout.Alignment.ALIGN_NORMAL : Layout.Alignment.ALIGN_CENTER : getGravityTextAlignment();
    }

    private Layout.Alignment getGravityTextAlignment() {
        int gravity = getGravity() & GravityCompat.RELATIVE_HORIZONTAL_GRAVITY_MASK;
        return gravity != 1 ? (gravity == 5 || gravity == 8388613) ? Layout.Alignment.ALIGN_OPPOSITE : Layout.Alignment.ALIGN_NORMAL : Layout.Alignment.ALIGN_CENTER;
    }

    private int getTextHeight() {
        if (getLineCount() > 1) {
            return getLayout().getHeight();
        }
        TextPaint paint = getPaint();
        String charSequence = getText().toString();
        if (getTransformationMethod() != null) {
            charSequence = getTransformationMethod().getTransformation(charSequence, this).toString();
        }
        Rect rect = new Rect();
        paint.getTextBounds(charSequence, 0, charSequence.length(), rect);
        return Math.min(rect.height(), getLayout().getHeight());
    }

    private int getTextLayoutWidth() {
        int lineCount = getLineCount();
        float f11 = 0.0f;
        for (int i11 = 0; i11 < lineCount; i11++) {
            f11 = Math.max(f11, getLayout().getLineWidth(i11));
        }
        return (int) Math.ceil(f11);
    }

    public void a(@NonNull b bVar) {
        this.f30813b.add(bVar);
    }

    public void b() {
        this.f30813b.clear();
    }

    public boolean c() {
        e eVar = this.f30812a;
        return eVar != null && eVar.p();
    }

    public final boolean d() {
        int i11 = this.f30825n;
        return i11 == 3 || i11 == 4;
    }

    public final boolean e() {
        int i11 = this.f30825n;
        return i11 == 1 || i11 == 2;
    }

    public final boolean f() {
        int i11 = this.f30825n;
        return i11 == 16 || i11 == 32;
    }

    public final boolean g() {
        return ViewCompat.getLayoutDirection(this) == 1;
    }

    @NonNull
    public String getA11yClassName() {
        if (TextUtils.isEmpty(this.f30818g)) {
            return (c() ? CompoundButton.class : Button.class).getName();
        }
        return this.f30818g;
    }

    @Override // android.view.View
    @Nullable
    public ColorStateList getBackgroundTintList() {
        return getSupportBackgroundTintList();
    }

    @Override // android.view.View
    @Nullable
    public PorterDuff.Mode getBackgroundTintMode() {
        return getSupportBackgroundTintMode();
    }

    @Px
    public int getCornerRadius() {
        if (i()) {
            return this.f30812a.b();
        }
        return 0;
    }

    public Drawable getIcon() {
        return this.f30817f;
    }

    public int getIconGravity() {
        return this.f30825n;
    }

    @Px
    public int getIconPadding() {
        return this.f30822k;
    }

    @Px
    public int getIconSize() {
        return this.f30819h;
    }

    public ColorStateList getIconTint() {
        return this.f30816e;
    }

    public PorterDuff.Mode getIconTintMode() {
        return this.f30815d;
    }

    @Dimension
    public int getInsetBottom() {
        return this.f30812a.c();
    }

    @Dimension
    public int getInsetTop() {
        return this.f30812a.d();
    }

    @Nullable
    public ColorStateList getRippleColor() {
        if (i()) {
            return this.f30812a.h();
        }
        return null;
    }

    @Override // vn.t
    @NonNull
    public p getShapeAppearanceModel() {
        if (i()) {
            return this.f30812a.i();
        }
        throw new IllegalStateException("Attempted to get ShapeAppearanceModel from a MaterialButton which has an overwritten background.");
    }

    public ColorStateList getStrokeColor() {
        if (i()) {
            return this.f30812a.j();
        }
        return null;
    }

    @Px
    public int getStrokeWidth() {
        if (i()) {
            return this.f30812a.k();
        }
        return 0;
    }

    @Override // androidx.appcompat.widget.AppCompatButton, androidx.core.view.TintableBackgroundView
    @Nullable
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public ColorStateList getSupportBackgroundTintList() {
        return i() ? this.f30812a.l() : super.getSupportBackgroundTintList();
    }

    @Override // androidx.appcompat.widget.AppCompatButton, androidx.core.view.TintableBackgroundView
    @Nullable
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public PorterDuff.Mode getSupportBackgroundTintMode() {
        return i() ? this.f30812a.m() : super.getSupportBackgroundTintMode();
    }

    public boolean h() {
        return this.f30812a.q();
    }

    public final boolean i() {
        e eVar = this.f30812a;
        return (eVar == null || eVar.o()) ? false : true;
    }

    @Override // android.widget.Checkable
    public boolean isChecked() {
        return this.f30823l;
    }

    public void j(@NonNull b bVar) {
        this.f30813b.remove(bVar);
    }

    public final void k() {
        if (e()) {
            TextViewCompat.setCompoundDrawablesRelative(this, this.f30817f, null, null, null);
        } else if (d()) {
            TextViewCompat.setCompoundDrawablesRelative(this, null, null, this.f30817f, null);
        } else if (f()) {
            TextViewCompat.setCompoundDrawablesRelative(this, null, this.f30817f, null, null);
        }
    }

    public final void l(boolean z11) {
        Drawable drawable = this.f30817f;
        if (drawable != null) {
            Drawable mutate = DrawableCompat.wrap(drawable).mutate();
            this.f30817f = mutate;
            DrawableCompat.setTintList(mutate, this.f30816e);
            PorterDuff.Mode mode = this.f30815d;
            if (mode != null) {
                DrawableCompat.setTintMode(this.f30817f, mode);
            }
            int i11 = this.f30819h;
            if (i11 == 0) {
                i11 = this.f30817f.getIntrinsicWidth();
            }
            int i12 = this.f30819h;
            if (i12 == 0) {
                i12 = this.f30817f.getIntrinsicHeight();
            }
            Drawable drawable2 = this.f30817f;
            int i13 = this.f30820i;
            int i14 = this.f30821j;
            drawable2.setBounds(i13, i14, i11 + i13, i12 + i14);
            this.f30817f.setVisible(true, z11);
        }
        if (z11) {
            k();
            return;
        }
        Drawable[] compoundDrawablesRelative = TextViewCompat.getCompoundDrawablesRelative(this);
        Drawable drawable3 = compoundDrawablesRelative[0];
        Drawable drawable4 = compoundDrawablesRelative[1];
        Drawable drawable5 = compoundDrawablesRelative[2];
        if ((!e() || drawable3 == this.f30817f) && ((!d() || drawable5 == this.f30817f) && (!f() || drawable4 == this.f30817f))) {
            return;
        }
        k();
    }

    public final void m(int i11, int i12) {
        if (this.f30817f == null || getLayout() == null) {
            return;
        }
        if (!e() && !d()) {
            if (f()) {
                this.f30820i = 0;
                if (this.f30825n == 16) {
                    this.f30821j = 0;
                    l(false);
                    return;
                }
                int i13 = this.f30819h;
                if (i13 == 0) {
                    i13 = this.f30817f.getIntrinsicHeight();
                }
                int max = Math.max(0, (((((i12 - getTextHeight()) - getPaddingTop()) - i13) - this.f30822k) - getPaddingBottom()) / 2);
                if (this.f30821j != max) {
                    this.f30821j = max;
                    l(false);
                    return;
                }
                return;
            }
            return;
        }
        this.f30821j = 0;
        Layout.Alignment actualTextAlignment = getActualTextAlignment();
        int i14 = this.f30825n;
        if (i14 == 1 || i14 == 3 || ((i14 == 2 && actualTextAlignment == Layout.Alignment.ALIGN_NORMAL) || (i14 == 4 && actualTextAlignment == Layout.Alignment.ALIGN_OPPOSITE))) {
            this.f30820i = 0;
            l(false);
            return;
        }
        int i15 = this.f30819h;
        if (i15 == 0) {
            i15 = this.f30817f.getIntrinsicWidth();
        }
        int textLayoutWidth = ((((i11 - getTextLayoutWidth()) - ViewCompat.getPaddingEnd(this)) - i15) - this.f30822k) - ViewCompat.getPaddingStart(this);
        if (actualTextAlignment == Layout.Alignment.ALIGN_CENTER) {
            textLayoutWidth /= 2;
        }
        if (g() != (this.f30825n == 4)) {
            textLayoutWidth = -textLayoutWidth;
        }
        if (this.f30820i != textLayoutWidth) {
            this.f30820i = textLayoutWidth;
            l(false);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (i()) {
            l.f(this, this.f30812a.f());
        }
    }

    @Override // android.widget.TextView, android.view.View
    public int[] onCreateDrawableState(int i11) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i11 + 2);
        if (c()) {
            View.mergeDrawableStates(onCreateDrawableState, f30802o);
        }
        if (isChecked()) {
            View.mergeDrawableStates(onCreateDrawableState, f30803p);
        }
        return onCreateDrawableState;
    }

    @Override // androidx.appcompat.widget.AppCompatButton, android.view.View
    public void onInitializeAccessibilityEvent(@NonNull AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(getA11yClassName());
        accessibilityEvent.setChecked(isChecked());
    }

    @Override // androidx.appcompat.widget.AppCompatButton, android.view.View
    public void onInitializeAccessibilityNodeInfo(@NonNull AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(getA11yClassName());
        accessibilityNodeInfo.setCheckable(c());
        accessibilityNodeInfo.setChecked(isChecked());
        accessibilityNodeInfo.setClickable(isClickable());
    }

    @Override // androidx.appcompat.widget.AppCompatButton, android.widget.TextView, android.view.View
    public void onLayout(boolean z11, int i11, int i12, int i13, int i14) {
        super.onLayout(z11, i11, i12, i13, i14);
        m(getMeasuredWidth(), getMeasuredHeight());
    }

    @Override // android.widget.TextView, android.view.View
    public void onRestoreInstanceState(@Nullable Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        setChecked(savedState.f30826a);
    }

    @Override // android.widget.TextView, android.view.View
    @NonNull
    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.f30826a = this.f30823l;
        return savedState;
    }

    @Override // androidx.appcompat.widget.AppCompatButton, android.widget.TextView
    public void onTextChanged(CharSequence charSequence, int i11, int i12, int i13) {
        super.onTextChanged(charSequence, i11, i12, i13);
        m(getMeasuredWidth(), getMeasuredHeight());
    }

    @Override // android.view.View
    public boolean performClick() {
        if (this.f30812a.q()) {
            toggle();
        }
        return super.performClick();
    }

    @Override // android.view.View
    public void refreshDrawableState() {
        super.refreshDrawableState();
        if (this.f30817f != null) {
            if (this.f30817f.setState(getDrawableState())) {
                invalidate();
            }
        }
    }

    public void setA11yClassName(@Nullable String str) {
        this.f30818g = str;
    }

    @Override // android.view.View
    public void setBackground(@NonNull Drawable drawable) {
        setBackgroundDrawable(drawable);
    }

    @Override // android.view.View
    public void setBackgroundColor(@ColorInt int i11) {
        if (i()) {
            this.f30812a.s(i11);
        } else {
            super.setBackgroundColor(i11);
        }
    }

    @Override // androidx.appcompat.widget.AppCompatButton, android.view.View
    public void setBackgroundDrawable(@NonNull Drawable drawable) {
        if (!i()) {
            super.setBackgroundDrawable(drawable);
        } else {
            if (drawable == getBackground()) {
                getBackground().setState(drawable.getState());
                return;
            }
            Log.w(f30810w, "MaterialButton manages its own background to control elevation, shape, color and states. Consider using backgroundTint, shapeAppearance and other attributes where available. A custom background will ignore these attributes and you should consider handling interaction states such as pressed, focused and disabled");
            this.f30812a.t();
            super.setBackgroundDrawable(drawable);
        }
    }

    @Override // androidx.appcompat.widget.AppCompatButton, android.view.View
    public void setBackgroundResource(@DrawableRes int i11) {
        setBackgroundDrawable(i11 != 0 ? AppCompatResources.getDrawable(getContext(), i11) : null);
    }

    @Override // android.view.View
    public void setBackgroundTintList(@Nullable ColorStateList colorStateList) {
        setSupportBackgroundTintList(colorStateList);
    }

    @Override // android.view.View
    public void setBackgroundTintMode(@Nullable PorterDuff.Mode mode) {
        setSupportBackgroundTintMode(mode);
    }

    public void setCheckable(boolean z11) {
        if (i()) {
            this.f30812a.u(z11);
        }
    }

    @Override // android.widget.Checkable
    public void setChecked(boolean z11) {
        if (c() && isEnabled() && this.f30823l != z11) {
            this.f30823l = z11;
            refreshDrawableState();
            if (getParent() instanceof MaterialButtonToggleGroup) {
                ((MaterialButtonToggleGroup) getParent()).p(this, this.f30823l);
            }
            if (this.f30824m) {
                return;
            }
            this.f30824m = true;
            Iterator<b> it = this.f30813b.iterator();
            while (it.hasNext()) {
                it.next().a(this, this.f30823l);
            }
            this.f30824m = false;
        }
    }

    public void setCornerRadius(@Px int i11) {
        if (i()) {
            this.f30812a.v(i11);
        }
    }

    public void setCornerRadiusResource(@DimenRes int i11) {
        if (i()) {
            setCornerRadius(getResources().getDimensionPixelSize(i11));
        }
    }

    @Override // android.view.View
    @RequiresApi(21)
    public void setElevation(float f11) {
        super.setElevation(f11);
        if (i()) {
            this.f30812a.f().o0(f11);
        }
    }

    public void setIcon(@Nullable Drawable drawable) {
        if (this.f30817f != drawable) {
            this.f30817f = drawable;
            l(true);
            m(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    public void setIconGravity(int i11) {
        if (this.f30825n != i11) {
            this.f30825n = i11;
            m(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    public void setIconPadding(@Px int i11) {
        if (this.f30822k != i11) {
            this.f30822k = i11;
            setCompoundDrawablePadding(i11);
        }
    }

    public void setIconResource(@DrawableRes int i11) {
        setIcon(i11 != 0 ? AppCompatResources.getDrawable(getContext(), i11) : null);
    }

    public void setIconSize(@Px int i11) {
        if (i11 < 0) {
            throw new IllegalArgumentException("iconSize cannot be less than 0");
        }
        if (this.f30819h != i11) {
            this.f30819h = i11;
            l(true);
        }
    }

    public void setIconTint(@Nullable ColorStateList colorStateList) {
        if (this.f30816e != colorStateList) {
            this.f30816e = colorStateList;
            l(false);
        }
    }

    public void setIconTintMode(PorterDuff.Mode mode) {
        if (this.f30815d != mode) {
            this.f30815d = mode;
            l(false);
        }
    }

    public void setIconTintResource(@ColorRes int i11) {
        setIconTint(AppCompatResources.getColorStateList(getContext(), i11));
    }

    public void setInsetBottom(@Dimension int i11) {
        this.f30812a.w(i11);
    }

    public void setInsetTop(@Dimension int i11) {
        this.f30812a.x(i11);
    }

    public void setInternalBackground(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
    }

    public void setOnPressedChangeListenerInternal(@Nullable c cVar) {
        this.f30814c = cVar;
    }

    @Override // android.view.View
    public void setPressed(boolean z11) {
        c cVar = this.f30814c;
        if (cVar != null) {
            cVar.a(this, z11);
        }
        super.setPressed(z11);
    }

    public void setRippleColor(@Nullable ColorStateList colorStateList) {
        if (i()) {
            this.f30812a.y(colorStateList);
        }
    }

    public void setRippleColorResource(@ColorRes int i11) {
        if (i()) {
            setRippleColor(AppCompatResources.getColorStateList(getContext(), i11));
        }
    }

    @Override // vn.t
    public void setShapeAppearanceModel(@NonNull p pVar) {
        if (!i()) {
            throw new IllegalStateException("Attempted to set ShapeAppearanceModel on a MaterialButton which has an overwritten background.");
        }
        this.f30812a.z(pVar);
    }

    public void setShouldDrawSurfaceColorStroke(boolean z11) {
        if (i()) {
            this.f30812a.A(z11);
        }
    }

    public void setStrokeColor(@Nullable ColorStateList colorStateList) {
        if (i()) {
            this.f30812a.B(colorStateList);
        }
    }

    public void setStrokeColorResource(@ColorRes int i11) {
        if (i()) {
            setStrokeColor(AppCompatResources.getColorStateList(getContext(), i11));
        }
    }

    public void setStrokeWidth(@Px int i11) {
        if (i()) {
            this.f30812a.C(i11);
        }
    }

    public void setStrokeWidthResource(@DimenRes int i11) {
        if (i()) {
            setStrokeWidth(getResources().getDimensionPixelSize(i11));
        }
    }

    @Override // androidx.appcompat.widget.AppCompatButton, androidx.core.view.TintableBackgroundView
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public void setSupportBackgroundTintList(@Nullable ColorStateList colorStateList) {
        if (i()) {
            this.f30812a.D(colorStateList);
        } else {
            super.setSupportBackgroundTintList(colorStateList);
        }
    }

    @Override // androidx.appcompat.widget.AppCompatButton, androidx.core.view.TintableBackgroundView
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public void setSupportBackgroundTintMode(@Nullable PorterDuff.Mode mode) {
        if (i()) {
            this.f30812a.E(mode);
        } else {
            super.setSupportBackgroundTintMode(mode);
        }
    }

    @Override // android.view.View
    @RequiresApi(17)
    public void setTextAlignment(int i11) {
        super.setTextAlignment(i11);
        m(getMeasuredWidth(), getMeasuredHeight());
    }

    public void setToggleCheckedStateOnClick(boolean z11) {
        this.f30812a.F(z11);
    }

    @Override // android.widget.Checkable
    public void toggle() {
        setChecked(!this.f30823l);
    }

    public MaterialButton(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, com.google.android.material.R.attr.materialButtonStyle);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public MaterialButton(@androidx.annotation.NonNull android.content.Context r7, @androidx.annotation.Nullable android.util.AttributeSet r8, int r9) {
        /*
            r6 = this;
            int r4 = com.google.android.material.button.MaterialButton.f30811x
            android.content.Context r7 = zn.a.c(r7, r8, r9, r4)
            r6.<init>(r7, r8, r9)
            java.util.LinkedHashSet r7 = new java.util.LinkedHashSet
            r7.<init>()
            r6.f30813b = r7
            r7 = 0
            r6.f30823l = r7
            r6.f30824m = r7
            android.content.Context r0 = r6.getContext()
            int[] r2 = com.google.android.material.R.styleable.MaterialButton
            int[] r5 = new int[r7]
            r1 = r8
            r3 = r9
            android.content.res.TypedArray r8 = com.google.android.material.internal.d0.k(r0, r1, r2, r3, r4, r5)
            int r9 = com.google.android.material.R.styleable.MaterialButton_iconPadding
            int r9 = r8.getDimensionPixelSize(r9, r7)
            r6.f30822k = r9
            int r9 = com.google.android.material.R.styleable.MaterialButton_iconTintMode
            r2 = -1
            int r9 = r8.getInt(r9, r2)
            android.graphics.PorterDuff$Mode r2 = android.graphics.PorterDuff.Mode.SRC_IN
            android.graphics.PorterDuff$Mode r9 = com.google.android.material.internal.m0.t(r9, r2)
            r6.f30815d = r9
            android.content.Context r9 = r6.getContext()
            int r2 = com.google.android.material.R.styleable.MaterialButton_iconTint
            android.content.res.ColorStateList r9 = sn.c.a(r9, r8, r2)
            r6.f30816e = r9
            android.content.Context r9 = r6.getContext()
            int r2 = com.google.android.material.R.styleable.MaterialButton_icon
            android.graphics.drawable.Drawable r9 = sn.c.e(r9, r8, r2)
            r6.f30817f = r9
            int r9 = com.google.android.material.R.styleable.MaterialButton_iconGravity
            r2 = 1
            int r9 = r8.getInteger(r9, r2)
            r6.f30825n = r9
            int r9 = com.google.android.material.R.styleable.MaterialButton_iconSize
            int r9 = r8.getDimensionPixelSize(r9, r7)
            r6.f30819h = r9
            vn.p$b r9 = vn.p.e(r0, r1, r3, r4)
            vn.p r9 = r9.m()
            com.google.android.material.button.e r0 = new com.google.android.material.button.e
            r0.<init>(r6, r9)
            r6.f30812a = r0
            r0.r(r8)
            r8.recycle()
            int r8 = r6.f30822k
            r6.setCompoundDrawablePadding(r8)
            android.graphics.drawable.Drawable r8 = r6.f30817f
            if (r8 == 0) goto L82
            r7 = r2
        L82:
            r6.l(r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.button.MaterialButton.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }
}
