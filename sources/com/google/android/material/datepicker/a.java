package com.google.android.material.datepicker;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.RippleDrawable;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.StyleRes;
import androidx.core.util.Preconditions;
import androidx.core.view.ViewCompat;
import com.google.android.material.R;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    @NonNull
    public final Rect f31137a;

    /* renamed from: b, reason: collision with root package name */
    public final ColorStateList f31138b;

    /* renamed from: c, reason: collision with root package name */
    public final ColorStateList f31139c;

    /* renamed from: d, reason: collision with root package name */
    public final ColorStateList f31140d;

    /* renamed from: e, reason: collision with root package name */
    public final int f31141e;

    /* renamed from: f, reason: collision with root package name */
    public final vn.p f31142f;

    public a(ColorStateList colorStateList, ColorStateList colorStateList2, ColorStateList colorStateList3, int i11, vn.p pVar, @NonNull Rect rect) {
        Preconditions.checkArgumentNonnegative(rect.left);
        Preconditions.checkArgumentNonnegative(rect.top);
        Preconditions.checkArgumentNonnegative(rect.right);
        Preconditions.checkArgumentNonnegative(rect.bottom);
        this.f31137a = rect;
        this.f31138b = colorStateList2;
        this.f31139c = colorStateList;
        this.f31140d = colorStateList3;
        this.f31141e = i11;
        this.f31142f = pVar;
    }

    @NonNull
    public static a a(@NonNull Context context, @StyleRes int i11) {
        Preconditions.checkArgument(i11 != 0, "Cannot create a CalendarItemStyle with a styleResId of 0");
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(i11, R.styleable.MaterialCalendarItem);
        Rect rect = new Rect(obtainStyledAttributes.getDimensionPixelOffset(R.styleable.MaterialCalendarItem_android_insetLeft, 0), obtainStyledAttributes.getDimensionPixelOffset(R.styleable.MaterialCalendarItem_android_insetTop, 0), obtainStyledAttributes.getDimensionPixelOffset(R.styleable.MaterialCalendarItem_android_insetRight, 0), obtainStyledAttributes.getDimensionPixelOffset(R.styleable.MaterialCalendarItem_android_insetBottom, 0));
        ColorStateList a11 = sn.c.a(context, obtainStyledAttributes, R.styleable.MaterialCalendarItem_itemFillColor);
        ColorStateList a12 = sn.c.a(context, obtainStyledAttributes, R.styleable.MaterialCalendarItem_itemTextColor);
        ColorStateList a13 = sn.c.a(context, obtainStyledAttributes, R.styleable.MaterialCalendarItem_itemStrokeColor);
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(R.styleable.MaterialCalendarItem_itemStrokeWidth, 0);
        vn.p m11 = vn.p.b(context, obtainStyledAttributes.getResourceId(R.styleable.MaterialCalendarItem_itemShapeAppearance, 0), obtainStyledAttributes.getResourceId(R.styleable.MaterialCalendarItem_itemShapeAppearanceOverlay, 0)).m();
        obtainStyledAttributes.recycle();
        return new a(a11, a12, a13, dimensionPixelSize, m11, rect);
    }

    public int b() {
        return this.f31137a.bottom;
    }

    public int c() {
        return this.f31137a.left;
    }

    public int d() {
        return this.f31137a.right;
    }

    public int e() {
        return this.f31137a.top;
    }

    public void f(@NonNull TextView textView) {
        g(textView, null, null);
    }

    public void g(@NonNull TextView textView, @Nullable ColorStateList colorStateList, @Nullable ColorStateList colorStateList2) {
        vn.k kVar = new vn.k();
        vn.k kVar2 = new vn.k();
        kVar.setShapeAppearanceModel(this.f31142f);
        kVar2.setShapeAppearanceModel(this.f31142f);
        if (colorStateList == null) {
            colorStateList = this.f31139c;
        }
        kVar.p0(colorStateList);
        kVar.F0(this.f31141e, this.f31140d);
        if (colorStateList2 == null) {
            colorStateList2 = this.f31138b;
        }
        textView.setTextColor(colorStateList2);
        RippleDrawable rippleDrawable = new RippleDrawable(this.f31138b.withAlpha(30), kVar, kVar2);
        Rect rect = this.f31137a;
        ViewCompat.setBackground(textView, new InsetDrawable((Drawable) rippleDrawable, rect.left, rect.top, rect.right, rect.bottom));
    }
}
