package com.google.android.material.radiobutton;

import android.content.Context;
import android.content.res.ColorStateList;
import android.util.AttributeSet;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatRadioButton;
import androidx.core.widget.CompoundButtonCompat;
import com.google.android.material.R;
import en.u;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public class MaterialRadioButton extends AppCompatRadioButton {

    /* renamed from: c, reason: collision with root package name */
    public static final int f31878c = R.style.Widget_MaterialComponents_CompoundButton_RadioButton;

    /* renamed from: d, reason: collision with root package name */
    public static final int[][] f31879d = {new int[]{android.R.attr.state_enabled, android.R.attr.state_checked}, new int[]{android.R.attr.state_enabled, -16842912}, new int[]{-16842910, android.R.attr.state_checked}, new int[]{-16842910, -16842912}};

    /* renamed from: a, reason: collision with root package name */
    @Nullable
    public ColorStateList f31880a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f31881b;

    public MaterialRadioButton(@NonNull Context context) {
        this(context, null);
    }

    private ColorStateList getMaterialThemeColorsTintList() {
        if (this.f31880a == null) {
            int d11 = u.d(this, R.attr.colorControlActivated);
            int d12 = u.d(this, R.attr.colorOnSurface);
            int d13 = u.d(this, R.attr.colorSurface);
            int[][] iArr = f31879d;
            int[] iArr2 = new int[iArr.length];
            iArr2[0] = u.t(d13, d11, 1.0f);
            iArr2[1] = u.t(d13, d12, 0.54f);
            iArr2[2] = u.t(d13, d12, 0.38f);
            iArr2[3] = u.t(d13, d12, 0.38f);
            this.f31880a = new ColorStateList(iArr, iArr2);
        }
        return this.f31880a;
    }

    public boolean a() {
        return this.f31881b;
    }

    @Override // android.widget.TextView, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f31881b && CompoundButtonCompat.getButtonTintList(this) == null) {
            setUseMaterialThemeColors(true);
        }
    }

    public void setUseMaterialThemeColors(boolean z11) {
        this.f31881b = z11;
        if (z11) {
            CompoundButtonCompat.setButtonTintList(this, getMaterialThemeColorsTintList());
        } else {
            CompoundButtonCompat.setButtonTintList(this, null);
        }
    }

    public MaterialRadioButton(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.radioButtonStyle);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public MaterialRadioButton(@androidx.annotation.NonNull android.content.Context r7, @androidx.annotation.Nullable android.util.AttributeSet r8, int r9) {
        /*
            r6 = this;
            int r4 = com.google.android.material.radiobutton.MaterialRadioButton.f31878c
            android.content.Context r7 = zn.a.c(r7, r8, r9, r4)
            r6.<init>(r7, r8, r9)
            android.content.Context r0 = r6.getContext()
            int[] r2 = com.google.android.material.R.styleable.MaterialRadioButton
            r7 = 0
            int[] r5 = new int[r7]
            r1 = r8
            r3 = r9
            android.content.res.TypedArray r8 = com.google.android.material.internal.d0.k(r0, r1, r2, r3, r4, r5)
            int r9 = com.google.android.material.R.styleable.MaterialRadioButton_buttonTint
            boolean r1 = r8.hasValue(r9)
            if (r1 == 0) goto L27
            android.content.res.ColorStateList r9 = sn.c.a(r0, r8, r9)
            androidx.core.widget.CompoundButtonCompat.setButtonTintList(r6, r9)
        L27:
            int r9 = com.google.android.material.R.styleable.MaterialRadioButton_useMaterialThemeColors
            boolean r7 = r8.getBoolean(r9, r7)
            r6.f31881b = r7
            r8.recycle()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.radiobutton.MaterialRadioButton.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }
}
