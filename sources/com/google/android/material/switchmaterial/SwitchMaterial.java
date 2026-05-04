package com.google.android.material.switchmaterial;

import android.content.Context;
import android.content.res.ColorStateList;
import android.util.AttributeSet;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.SwitchCompat;
import com.google.android.material.R;
import com.google.android.material.internal.m0;
import en.u;
import ln.a;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public class SwitchMaterial extends SwitchCompat {

    /* renamed from: e, reason: collision with root package name */
    public static final int f32222e = R.style.Widget_MaterialComponents_CompoundButton_Switch;

    /* renamed from: f, reason: collision with root package name */
    public static final int[][] f32223f = {new int[]{android.R.attr.state_enabled, android.R.attr.state_checked}, new int[]{android.R.attr.state_enabled, -16842912}, new int[]{-16842910, android.R.attr.state_checked}, new int[]{-16842910, -16842912}};

    /* renamed from: a, reason: collision with root package name */
    @NonNull
    public final a f32224a;

    /* renamed from: b, reason: collision with root package name */
    @Nullable
    public ColorStateList f32225b;

    /* renamed from: c, reason: collision with root package name */
    @Nullable
    public ColorStateList f32226c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f32227d;

    public SwitchMaterial(@NonNull Context context) {
        this(context, null);
    }

    private ColorStateList getMaterialThemeColorsThumbTintList() {
        if (this.f32225b == null) {
            int d11 = u.d(this, R.attr.colorSurface);
            int d12 = u.d(this, R.attr.colorControlActivated);
            float dimension = getResources().getDimension(R.dimen.mtrl_switch_thumb_elevation);
            if (this.f32224a.l()) {
                dimension += m0.p(this);
            }
            int e11 = this.f32224a.e(d11, dimension);
            int[][] iArr = f32223f;
            int[] iArr2 = new int[iArr.length];
            iArr2[0] = u.t(d11, d12, 1.0f);
            iArr2[1] = e11;
            iArr2[2] = u.t(d11, d12, 0.38f);
            iArr2[3] = e11;
            this.f32225b = new ColorStateList(iArr, iArr2);
        }
        return this.f32225b;
    }

    private ColorStateList getMaterialThemeColorsTrackTintList() {
        if (this.f32226c == null) {
            int[][] iArr = f32223f;
            int[] iArr2 = new int[iArr.length];
            int d11 = u.d(this, R.attr.colorSurface);
            int d12 = u.d(this, R.attr.colorControlActivated);
            int d13 = u.d(this, R.attr.colorOnSurface);
            iArr2[0] = u.t(d11, d12, 0.54f);
            iArr2[1] = u.t(d11, d13, 0.32f);
            iArr2[2] = u.t(d11, d12, 0.12f);
            iArr2[3] = u.t(d11, d13, 0.12f);
            this.f32226c = new ColorStateList(iArr, iArr2);
        }
        return this.f32226c;
    }

    public boolean a() {
        return this.f32227d;
    }

    @Override // android.widget.TextView, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f32227d && getThumbTintList() == null) {
            setThumbTintList(getMaterialThemeColorsThumbTintList());
        }
        if (this.f32227d && getTrackTintList() == null) {
            setTrackTintList(getMaterialThemeColorsTrackTintList());
        }
    }

    public void setUseMaterialThemeColors(boolean z11) {
        this.f32227d = z11;
        if (z11) {
            setThumbTintList(getMaterialThemeColorsThumbTintList());
            setTrackTintList(getMaterialThemeColorsTrackTintList());
        } else {
            setThumbTintList(null);
            setTrackTintList(null);
        }
    }

    public SwitchMaterial(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.switchStyle);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public SwitchMaterial(@androidx.annotation.NonNull android.content.Context r7, @androidx.annotation.Nullable android.util.AttributeSet r8, int r9) {
        /*
            r6 = this;
            int r4 = com.google.android.material.switchmaterial.SwitchMaterial.f32222e
            android.content.Context r7 = zn.a.c(r7, r8, r9, r4)
            r6.<init>(r7, r8, r9)
            android.content.Context r0 = r6.getContext()
            ln.a r7 = new ln.a
            r7.<init>(r0)
            r6.f32224a = r7
            int[] r2 = com.google.android.material.R.styleable.SwitchMaterial
            r7 = 0
            int[] r5 = new int[r7]
            r1 = r8
            r3 = r9
            android.content.res.TypedArray r8 = com.google.android.material.internal.d0.k(r0, r1, r2, r3, r4, r5)
            int r9 = com.google.android.material.R.styleable.SwitchMaterial_useMaterialThemeColors
            boolean r7 = r8.getBoolean(r9, r7)
            r6.f32227d = r7
            r8.recycle()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.switchmaterial.SwitchMaterial.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }
}
