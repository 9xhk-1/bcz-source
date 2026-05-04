package com.aurelhubert.ahbottomnavigation;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import androidx.viewpager.widget.ViewPager;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public class AHBottomNavigationViewPager extends ViewPager {

    /* renamed from: a, reason: collision with root package name */
    public boolean f11304a;

    public AHBottomNavigationViewPager(Context context, AttributeSet attrs) {
        super(context, attrs);
        this.f11304a = false;
    }

    @Override // androidx.viewpager.widget.ViewPager, android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent event) {
        if (this.f11304a) {
            return super.onInterceptTouchEvent(event);
        }
        return false;
    }

    @Override // androidx.viewpager.widget.ViewPager, android.view.View
    public boolean onTouchEvent(MotionEvent event) {
        if (this.f11304a) {
            return super.onTouchEvent(event);
        }
        return false;
    }

    public void setPagingEnabled(boolean enabled) {
        this.f11304a = enabled;
    }
}
