package com.baicizhan.client.business.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import androidx.viewpager.widget.ViewPager;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public class LockableViewPager extends ViewPager {

    /* renamed from: a, reason: collision with root package name */
    public boolean f17132a;

    public LockableViewPager(Context context) {
        super(context);
        this.f17132a = false;
    }

    @Override // androidx.viewpager.widget.ViewPager, android.view.View
    public boolean canScrollHorizontally(int direction) {
        return !this.f17132a;
    }

    @Override // androidx.viewpager.widget.ViewPager, android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent event) {
        return !this.f17132a && super.onInterceptTouchEvent(event);
    }

    @Override // androidx.viewpager.widget.ViewPager, android.view.View
    public boolean onTouchEvent(MotionEvent event) {
        return !this.f17132a && super.onTouchEvent(event);
    }

    public void setLocked(boolean locked) {
        this.f17132a = locked;
    }

    public LockableViewPager(Context context, AttributeSet attrs) {
        super(context, attrs);
        this.f17132a = false;
    }
}
