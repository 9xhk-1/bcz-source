package com.viewpagerindicator;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import androidx.viewpager.widget.ViewPager;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes6.dex */
public class IconPageIndicator extends HorizontalScrollView implements c {

    /* renamed from: a, reason: collision with root package name */
    public final IcsLinearLayout f44746a;

    /* renamed from: b, reason: collision with root package name */
    public ViewPager f44747b;

    /* renamed from: c, reason: collision with root package name */
    public ViewPager.OnPageChangeListener f44748c;

    /* renamed from: d, reason: collision with root package name */
    public Runnable f44749d;

    /* renamed from: e, reason: collision with root package name */
    public int f44750e;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class a implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ View f44751a;

        public a(final View val$iconView) {
            this.f44751a = val$iconView;
        }

        @Override // java.lang.Runnable
        public void run() {
            IconPageIndicator.this.smoothScrollTo(this.f44751a.getLeft() - ((IconPageIndicator.this.getWidth() - this.f44751a.getWidth()) / 2), 0);
            IconPageIndicator.this.f44749d = null;
        }
    }

    public IconPageIndicator(Context context) {
        this(context, null);
    }

    @Override // com.viewpagerindicator.c
    public void a() {
        this.f44746a.removeAllViews();
        b bVar = (b) this.f44747b.getAdapter();
        int count = bVar.getCount();
        for (int i11 = 0; i11 < count; i11++) {
            ImageView imageView = new ImageView(getContext(), null, R.attr.vpiIconPageIndicatorStyle);
            imageView.setImageResource(bVar.a(i11));
            this.f44746a.addView(imageView);
        }
        if (this.f44750e > count) {
            this.f44750e = count - 1;
        }
        setCurrentItem(this.f44750e);
        requestLayout();
    }

    public final void c(final int position) {
        View childAt = this.f44746a.getChildAt(position);
        Runnable runnable = this.f44749d;
        if (runnable != null) {
            removeCallbacks(runnable);
        }
        a aVar = new a(childAt);
        this.f44749d = aVar;
        post(aVar);
    }

    @Override // com.viewpagerindicator.c
    public void e0(ViewPager view, int initialPosition) {
        setViewPager(view);
        setCurrentItem(initialPosition);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        Runnable runnable = this.f44749d;
        if (runnable != null) {
            post(runnable);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        Runnable runnable = this.f44749d;
        if (runnable != null) {
            removeCallbacks(runnable);
        }
    }

    @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
    public void onPageScrollStateChanged(int arg0) {
        ViewPager.OnPageChangeListener onPageChangeListener = this.f44748c;
        if (onPageChangeListener != null) {
            onPageChangeListener.onPageScrollStateChanged(arg0);
        }
    }

    @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
    public void onPageScrolled(int arg0, float arg1, int arg2) {
        ViewPager.OnPageChangeListener onPageChangeListener = this.f44748c;
        if (onPageChangeListener != null) {
            onPageChangeListener.onPageScrolled(arg0, arg1, arg2);
        }
    }

    @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
    public void onPageSelected(int arg0) {
        setCurrentItem(arg0);
        ViewPager.OnPageChangeListener onPageChangeListener = this.f44748c;
        if (onPageChangeListener != null) {
            onPageChangeListener.onPageSelected(arg0);
        }
    }

    @Override // com.viewpagerindicator.c
    public void setCurrentItem(int item) {
        ViewPager viewPager = this.f44747b;
        if (viewPager == null) {
            throw new IllegalStateException("ViewPager has not been bound.");
        }
        this.f44750e = item;
        viewPager.setCurrentItem(item);
        int childCount = this.f44746a.getChildCount();
        int i11 = 0;
        while (i11 < childCount) {
            View childAt = this.f44746a.getChildAt(i11);
            boolean z11 = i11 == item;
            childAt.setSelected(z11);
            if (z11) {
                c(item);
            }
            i11++;
        }
    }

    @Override // com.viewpagerindicator.c
    public void setOnPageChangeListener(ViewPager.OnPageChangeListener listener) {
        this.f44748c = listener;
    }

    @Override // com.viewpagerindicator.c
    public void setViewPager(ViewPager view) {
        ViewPager viewPager = this.f44747b;
        if (viewPager == view) {
            return;
        }
        if (viewPager != null) {
            viewPager.setOnPageChangeListener(null);
        }
        if (view.getAdapter() == null) {
            throw new IllegalStateException("ViewPager does not have adapter instance.");
        }
        this.f44747b = view;
        view.setOnPageChangeListener(this);
        a();
    }

    public IconPageIndicator(Context context, AttributeSet attrs) {
        super(context, attrs);
        setHorizontalScrollBarEnabled(false);
        IcsLinearLayout icsLinearLayout = new IcsLinearLayout(context, R.attr.vpiIconPageIndicatorStyle);
        this.f44746a = icsLinearLayout;
        addView(icsLinearLayout, new FrameLayout.LayoutParams(-2, -1, 17));
    }
}
