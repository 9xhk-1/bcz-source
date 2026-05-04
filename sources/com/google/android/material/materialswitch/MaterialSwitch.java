package com.google.android.material.materialswitch;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.util.AttributeSet;
import android.view.View;
import androidx.annotation.DrawableRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.Px;
import androidx.appcompat.content.res.AppCompatResources;
import androidx.appcompat.widget.SwitchCompat;
import androidx.core.graphics.ColorUtils;
import androidx.core.graphics.drawable.DrawableCompat;
import com.google.android.material.R;
import kn.d;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public class MaterialSwitch extends SwitchCompat {

    /* renamed from: n, reason: collision with root package name */
    public static final int f31703n = R.style.Widget_Material3_CompoundButton_MaterialSwitch;

    /* renamed from: o, reason: collision with root package name */
    public static final int[] f31704o = {R.attr.state_with_icon};

    /* renamed from: a, reason: collision with root package name */
    @Nullable
    public Drawable f31705a;

    /* renamed from: b, reason: collision with root package name */
    @Nullable
    public Drawable f31706b;

    /* renamed from: c, reason: collision with root package name */
    @Px
    public int f31707c;

    /* renamed from: d, reason: collision with root package name */
    @Nullable
    public Drawable f31708d;

    /* renamed from: e, reason: collision with root package name */
    @Nullable
    public Drawable f31709e;

    /* renamed from: f, reason: collision with root package name */
    @Nullable
    public ColorStateList f31710f;

    /* renamed from: g, reason: collision with root package name */
    @Nullable
    public ColorStateList f31711g;

    /* renamed from: h, reason: collision with root package name */
    @NonNull
    public PorterDuff.Mode f31712h;

    /* renamed from: i, reason: collision with root package name */
    @Nullable
    public ColorStateList f31713i;

    /* renamed from: j, reason: collision with root package name */
    @Nullable
    public ColorStateList f31714j;

    /* renamed from: k, reason: collision with root package name */
    @NonNull
    public PorterDuff.Mode f31715k;

    /* renamed from: l, reason: collision with root package name */
    public int[] f31716l;

    /* renamed from: m, reason: collision with root package name */
    public int[] f31717m;

    public MaterialSwitch(@NonNull Context context) {
        this(context, null);
    }

    public static void c(@Nullable Drawable drawable, @Nullable ColorStateList colorStateList, @NonNull int[] iArr, @NonNull int[] iArr2, float f11) {
        if (drawable == null || colorStateList == null) {
            return;
        }
        DrawableCompat.setTint(drawable, ColorUtils.blendARGB(colorStateList.getColorForState(iArr, 0), colorStateList.getColorForState(iArr2, 0), f11));
    }

    public final void a() {
        this.f31705a = d.c(this.f31705a, this.f31710f, getThumbTintMode());
        this.f31706b = d.c(this.f31706b, this.f31711g, this.f31712h);
        d();
        Drawable drawable = this.f31705a;
        Drawable drawable2 = this.f31706b;
        int i11 = this.f31707c;
        super.setThumbDrawable(d.b(drawable, drawable2, i11, i11));
        refreshDrawableState();
    }

    public final void b() {
        this.f31708d = d.c(this.f31708d, this.f31713i, getTrackTintMode());
        this.f31709e = d.c(this.f31709e, this.f31714j, this.f31715k);
        d();
        Drawable drawable = this.f31708d;
        if (drawable != null && this.f31709e != null) {
            drawable = new LayerDrawable(new Drawable[]{this.f31708d, this.f31709e});
        } else if (drawable == null) {
            drawable = this.f31709e;
        }
        if (drawable != null) {
            setSwitchMinWidth(drawable.getIntrinsicWidth());
        }
        super.setTrackDrawable(drawable);
    }

    public final void d() {
        if (this.f31710f == null && this.f31711g == null && this.f31713i == null && this.f31714j == null) {
            return;
        }
        float thumbPosition = getThumbPosition();
        ColorStateList colorStateList = this.f31710f;
        if (colorStateList != null) {
            c(this.f31705a, colorStateList, this.f31716l, this.f31717m, thumbPosition);
        }
        ColorStateList colorStateList2 = this.f31711g;
        if (colorStateList2 != null) {
            c(this.f31706b, colorStateList2, this.f31716l, this.f31717m, thumbPosition);
        }
        ColorStateList colorStateList3 = this.f31713i;
        if (colorStateList3 != null) {
            c(this.f31708d, colorStateList3, this.f31716l, this.f31717m, thumbPosition);
        }
        ColorStateList colorStateList4 = this.f31714j;
        if (colorStateList4 != null) {
            c(this.f31709e, colorStateList4, this.f31716l, this.f31717m, thumbPosition);
        }
    }

    @Override // androidx.appcompat.widget.SwitchCompat
    @Nullable
    public Drawable getThumbDrawable() {
        return this.f31705a;
    }

    @Nullable
    public Drawable getThumbIconDrawable() {
        return this.f31706b;
    }

    @Px
    public int getThumbIconSize() {
        return this.f31707c;
    }

    @Nullable
    public ColorStateList getThumbIconTintList() {
        return this.f31711g;
    }

    @NonNull
    public PorterDuff.Mode getThumbIconTintMode() {
        return this.f31712h;
    }

    @Override // androidx.appcompat.widget.SwitchCompat
    @Nullable
    public ColorStateList getThumbTintList() {
        return this.f31710f;
    }

    @Nullable
    public Drawable getTrackDecorationDrawable() {
        return this.f31709e;
    }

    @Nullable
    public ColorStateList getTrackDecorationTintList() {
        return this.f31714j;
    }

    @NonNull
    public PorterDuff.Mode getTrackDecorationTintMode() {
        return this.f31715k;
    }

    @Override // androidx.appcompat.widget.SwitchCompat
    @Nullable
    public Drawable getTrackDrawable() {
        return this.f31708d;
    }

    @Override // androidx.appcompat.widget.SwitchCompat
    @Nullable
    public ColorStateList getTrackTintList() {
        return this.f31713i;
    }

    @Override // android.view.View
    public void invalidate() {
        d();
        super.invalidate();
    }

    @Override // androidx.appcompat.widget.SwitchCompat, android.widget.CompoundButton, android.widget.TextView, android.view.View
    public int[] onCreateDrawableState(int i11) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i11 + 1);
        if (this.f31706b != null) {
            View.mergeDrawableStates(onCreateDrawableState, f31704o);
        }
        this.f31716l = d.j(onCreateDrawableState);
        this.f31717m = d.f(onCreateDrawableState);
        return onCreateDrawableState;
    }

    @Override // androidx.appcompat.widget.SwitchCompat
    public void setThumbDrawable(@Nullable Drawable drawable) {
        this.f31705a = drawable;
        a();
    }

    public void setThumbIconDrawable(@Nullable Drawable drawable) {
        this.f31706b = drawable;
        a();
    }

    public void setThumbIconResource(@DrawableRes int i11) {
        setThumbIconDrawable(AppCompatResources.getDrawable(getContext(), i11));
    }

    public void setThumbIconSize(@Px int i11) {
        if (this.f31707c != i11) {
            this.f31707c = i11;
            a();
        }
    }

    public void setThumbIconTintList(@Nullable ColorStateList colorStateList) {
        this.f31711g = colorStateList;
        a();
    }

    public void setThumbIconTintMode(@NonNull PorterDuff.Mode mode) {
        this.f31712h = mode;
        a();
    }

    @Override // androidx.appcompat.widget.SwitchCompat
    public void setThumbTintList(@Nullable ColorStateList colorStateList) {
        this.f31710f = colorStateList;
        a();
    }

    @Override // androidx.appcompat.widget.SwitchCompat
    public void setThumbTintMode(@Nullable PorterDuff.Mode mode) {
        super.setThumbTintMode(mode);
        a();
    }

    public void setTrackDecorationDrawable(@Nullable Drawable drawable) {
        this.f31709e = drawable;
        b();
    }

    public void setTrackDecorationResource(@DrawableRes int i11) {
        setTrackDecorationDrawable(AppCompatResources.getDrawable(getContext(), i11));
    }

    public void setTrackDecorationTintList(@Nullable ColorStateList colorStateList) {
        this.f31714j = colorStateList;
        b();
    }

    public void setTrackDecorationTintMode(@NonNull PorterDuff.Mode mode) {
        this.f31715k = mode;
        b();
    }

    @Override // androidx.appcompat.widget.SwitchCompat
    public void setTrackDrawable(@Nullable Drawable drawable) {
        this.f31708d = drawable;
        b();
    }

    @Override // androidx.appcompat.widget.SwitchCompat
    public void setTrackTintList(@Nullable ColorStateList colorStateList) {
        this.f31713i = colorStateList;
        b();
    }

    @Override // androidx.appcompat.widget.SwitchCompat
    public void setTrackTintMode(@Nullable PorterDuff.Mode mode) {
        super.setTrackTintMode(mode);
        b();
    }

    public MaterialSwitch(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.materialSwitchStyle);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public MaterialSwitch(@androidx.annotation.NonNull android.content.Context r8, @androidx.annotation.Nullable android.util.AttributeSet r9, int r10) {
        /*
            r7 = this;
            int r4 = com.google.android.material.materialswitch.MaterialSwitch.f31703n
            android.content.Context r8 = zn.a.c(r8, r9, r10, r4)
            r7.<init>(r8, r9, r10)
            r8 = -1
            r7.f31707c = r8
            android.content.Context r0 = r7.getContext()
            android.graphics.drawable.Drawable r1 = super.getThumbDrawable()
            r7.f31705a = r1
            android.content.res.ColorStateList r1 = super.getThumbTintList()
            r7.f31710f = r1
            r1 = 0
            super.setThumbTintList(r1)
            android.graphics.drawable.Drawable r2 = super.getTrackDrawable()
            r7.f31708d = r2
            android.content.res.ColorStateList r2 = super.getTrackTintList()
            r7.f31713i = r2
            super.setTrackTintList(r1)
            int[] r2 = com.google.android.material.R.styleable.MaterialSwitch
            r6 = 0
            int[] r5 = new int[r6]
            r1 = r9
            r3 = r10
            androidx.appcompat.widget.TintTypedArray r9 = com.google.android.material.internal.d0.l(r0, r1, r2, r3, r4, r5)
            int r10 = com.google.android.material.R.styleable.MaterialSwitch_thumbIcon
            android.graphics.drawable.Drawable r10 = r9.getDrawable(r10)
            r7.f31706b = r10
            int r10 = com.google.android.material.R.styleable.MaterialSwitch_thumbIconSize
            int r10 = r9.getDimensionPixelSize(r10, r8)
            r7.f31707c = r10
            int r10 = com.google.android.material.R.styleable.MaterialSwitch_thumbIconTint
            android.content.res.ColorStateList r10 = r9.getColorStateList(r10)
            r7.f31711g = r10
            int r10 = com.google.android.material.R.styleable.MaterialSwitch_thumbIconTintMode
            int r10 = r9.getInt(r10, r8)
            android.graphics.PorterDuff$Mode r0 = android.graphics.PorterDuff.Mode.SRC_IN
            android.graphics.PorterDuff$Mode r10 = com.google.android.material.internal.m0.t(r10, r0)
            r7.f31712h = r10
            int r10 = com.google.android.material.R.styleable.MaterialSwitch_trackDecoration
            android.graphics.drawable.Drawable r10 = r9.getDrawable(r10)
            r7.f31709e = r10
            int r10 = com.google.android.material.R.styleable.MaterialSwitch_trackDecorationTint
            android.content.res.ColorStateList r10 = r9.getColorStateList(r10)
            r7.f31714j = r10
            int r10 = com.google.android.material.R.styleable.MaterialSwitch_trackDecorationTintMode
            int r8 = r9.getInt(r10, r8)
            android.graphics.PorterDuff$Mode r8 = com.google.android.material.internal.m0.t(r8, r0)
            r7.f31715k = r8
            r9.recycle()
            r7.setEnforceSwitchWidth(r6)
            r7.a()
            r7.b()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.materialswitch.MaterialSwitch.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }
}
