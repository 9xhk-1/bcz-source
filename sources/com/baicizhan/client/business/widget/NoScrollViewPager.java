package com.baicizhan.client.business.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import androidx.viewpager.widget.ViewPager;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public class NoScrollViewPager extends ViewPager {

    /* renamed from: a, reason: collision with root package name */
    public boolean f17134a;

    public NoScrollViewPager(Context context) {
        super(context);
        this.f17134a = false;
    }

    @Override // androidx.viewpager.widget.ViewPager, android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent ev2) {
        return this.f17134a && super.onInterceptTouchEvent(ev2);
    }

    @Override // androidx.viewpager.widget.ViewPager, android.view.View
    public boolean onTouchEvent(MotionEvent ev2) {
        return this.f17134a && super.onTouchEvent(ev2);
    }

    @Override // androidx.viewpager.widget.ViewPager
    public void setCurrentItem(int item) {
        super.setCurrentItem(item, false);
    }

    public void setScanScroll(boolean isCanScroll) {
        this.f17134a = isCanScroll;
    }

    @Override // androidx.viewpager.widget.ViewPager
    public void setCurrentItem(int item, boolean smooth) {
        super.setCurrentItem(item, false);
    }

    public NoScrollViewPager(Context context, AttributeSet attrs) {
        super(context, attrs);
        this.f17134a = false;
    }
}
