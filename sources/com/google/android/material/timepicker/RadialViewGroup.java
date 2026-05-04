package com.google.android.material.timepicker;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.ColorInt;
import androidx.annotation.Dimension;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.ConstraintSet;
import androidx.core.view.ViewCompat;
import com.google.android.material.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
class RadialViewGroup extends ConstraintLayout {

    /* renamed from: d, reason: collision with root package name */
    public static final String f32580d = "skip";

    /* renamed from: e, reason: collision with root package name */
    public static final int f32581e = 1;

    /* renamed from: f, reason: collision with root package name */
    public static final int f32582f = 2;

    /* renamed from: g, reason: collision with root package name */
    public static final float f32583g = 0.66f;

    /* renamed from: a, reason: collision with root package name */
    public final Runnable f32584a;

    /* renamed from: b, reason: collision with root package name */
    public int f32585b;

    /* renamed from: c, reason: collision with root package name */
    public vn.k f32586c;

    public RadialViewGroup(@NonNull Context context) {
        this(context, null);
    }

    public static boolean l(View view) {
        return f32580d.equals(view.getTag());
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i11, ViewGroup.LayoutParams layoutParams) {
        super.addView(view, i11, layoutParams);
        if (view.getId() == -1) {
            view.setId(ViewCompat.generateViewId());
        }
        n();
    }

    public final void g(List<View> list, ConstraintSet constraintSet, int i11) {
        Iterator<View> it = list.iterator();
        float f11 = 0.0f;
        while (it.hasNext()) {
            constraintSet.constrainCircle(it.next().getId(), R.id.circle_center, i11, f11);
            f11 += 360.0f / list.size();
        }
    }

    public final Drawable h() {
        vn.k kVar = new vn.k();
        this.f32586c = kVar;
        kVar.m0(new vn.n(0.5f));
        this.f32586c.p0(ColorStateList.valueOf(-1));
        return this.f32586c;
    }

    @Dimension
    public int i(int i11) {
        return i11 == 2 ? Math.round(this.f32585b * 0.66f) : this.f32585b;
    }

    @Dimension
    public int j() {
        return this.f32585b;
    }

    public void k(@Dimension int i11) {
        this.f32585b = i11;
        m();
    }

    public void m() {
        ConstraintSet constraintSet = new ConstraintSet();
        constraintSet.clone(this);
        HashMap hashMap = new HashMap();
        for (int i11 = 0; i11 < getChildCount(); i11++) {
            View childAt = getChildAt(i11);
            if (childAt.getId() != R.id.circle_center && !l(childAt)) {
                int i12 = (Integer) childAt.getTag(R.id.material_clock_level);
                if (i12 == null) {
                    i12 = 1;
                }
                if (!hashMap.containsKey(i12)) {
                    hashMap.put(i12, new ArrayList());
                }
                ((List) hashMap.get(i12)).add(childAt);
            }
        }
        for (Map.Entry entry : hashMap.entrySet()) {
            g((List) entry.getValue(), constraintSet, i(((Integer) entry.getKey()).intValue()));
        }
        constraintSet.applyTo(this);
    }

    public final void n() {
        Handler handler = getHandler();
        if (handler != null) {
            handler.removeCallbacks(this.f32584a);
            handler.post(this.f32584a);
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m();
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup
    public void onViewRemoved(View view) {
        super.onViewRemoved(view);
        n();
    }

    @Override // android.view.View
    public void setBackgroundColor(@ColorInt int i11) {
        this.f32586c.p0(ColorStateList.valueOf(i11));
    }

    public RadialViewGroup(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public RadialViewGroup(@NonNull Context context, @Nullable AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        LayoutInflater.from(context).inflate(R.layout.material_radial_view_group, this);
        ViewCompat.setBackground(this, h());
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.RadialViewGroup, i11, 0);
        this.f32585b = obtainStyledAttributes.getDimensionPixelSize(R.styleable.RadialViewGroup_materialCircleRadius, 0);
        this.f32584a = new Runnable() { // from class: com.google.android.material.timepicker.f
            @Override // java.lang.Runnable
            public final void run() {
                RadialViewGroup.this.m();
            }
        };
        obtainStyledAttributes.recycle();
    }
}
