package com.google.android.material.tabs;

import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.View;
import androidx.annotation.Dimension;
import androidx.annotation.FloatRange;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.material.internal.m0;
import com.google.android.material.tabs.TabLayout;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    @Dimension(unit = 0)
    public static final int f32316a = 24;

    public static RectF a(TabLayout tabLayout, @Nullable View view) {
        return view == null ? new RectF() : (tabLayout.H() || !(view instanceof TabLayout.TabView)) ? new RectF(view.getLeft(), view.getTop(), view.getRight(), view.getBottom()) : b((TabLayout.TabView) view, 24);
    }

    public static RectF b(@NonNull TabLayout.TabView tabView, @Dimension(unit = 0) int i11) {
        int contentWidth = tabView.getContentWidth();
        int contentHeight = tabView.getContentHeight();
        int i12 = (int) m0.i(tabView.getContext(), i11);
        if (contentWidth < i12) {
            contentWidth = i12;
        }
        int left = (tabView.getLeft() + tabView.getRight()) / 2;
        int top = (tabView.getTop() + tabView.getBottom()) / 2;
        int i13 = contentWidth / 2;
        return new RectF(left - i13, top - (contentHeight / 2), i13 + left, top + (left / 2));
    }

    public void c(TabLayout tabLayout, View view, @NonNull Drawable drawable) {
        RectF a11 = a(tabLayout, view);
        drawable.setBounds((int) a11.left, drawable.getBounds().top, (int) a11.right, drawable.getBounds().bottom);
    }

    public void d(TabLayout tabLayout, View view, View view2, @FloatRange(from = 0.0d, to = 1.0d) float f11, @NonNull Drawable drawable) {
        RectF a11 = a(tabLayout, view);
        RectF a12 = a(tabLayout, view2);
        drawable.setBounds(vm.b.c((int) a11.left, (int) a12.left, f11), drawable.getBounds().top, vm.b.c((int) a11.right, (int) a12.right, f11), drawable.getBounds().bottom);
    }
}
