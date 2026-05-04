package com.baicizhan.main.customview;

import android.content.Context;
import android.content.res.ColorStateList;
import android.util.AttributeSet;
import android.view.View;
import android.widget.TextView;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;
import com.viewpagerindicator.c;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public class GridPageIndicator extends FixedGridLayout implements c {

    /* renamed from: k, reason: collision with root package name */
    public ViewPager f20045k;

    /* renamed from: l, reason: collision with root package name */
    public ViewPager.OnPageChangeListener f20046l;

    /* renamed from: m, reason: collision with root package name */
    public int f20047m;

    /* renamed from: n, reason: collision with root package name */
    public int f20048n;

    /* renamed from: o, reason: collision with root package name */
    public View.OnClickListener f20049o;

    /* renamed from: p, reason: collision with root package name */
    public ColorStateList f20050p;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class a implements View.OnClickListener {
        public a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View v11) {
            GridPageIndicator.this.setCurrentItem(((Integer) v11.getTag()).intValue());
        }
    }

    public GridPageIndicator(Context context) {
        super(context);
        this.f20049o = new a();
        this.f20050p = ColorStateList.valueOf(-1);
    }

    @Override // com.viewpagerindicator.c
    public void a() {
        removeAllViews();
        PagerAdapter adapter = this.f20045k.getAdapter();
        int count = adapter.getCount();
        for (int i11 = 0; i11 < count; i11++) {
            TextView textView = new TextView(getContext(), null);
            textView.setTextSize(0, this.f20048n);
            textView.setTextColor(this.f20050p);
            textView.setGravity(17);
            textView.setText(adapter.getPageTitle(i11));
            textView.setTag(Integer.valueOf(i11));
            textView.setOnClickListener(this.f20049o);
            addView(textView);
        }
        if (this.f20047m > count) {
            this.f20047m = count - 1;
        }
        setCurrentItem(this.f20047m);
        requestLayout();
    }

    @Override // com.viewpagerindicator.c
    public void e0(ViewPager view, int initialPosition) {
        setViewPager(view);
        setCurrentItem(initialPosition);
    }

    @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
    public void onPageScrollStateChanged(int state) {
        ViewPager.OnPageChangeListener onPageChangeListener = this.f20046l;
        if (onPageChangeListener != null) {
            onPageChangeListener.onPageScrollStateChanged(state);
        }
    }

    @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
    public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {
        ViewPager.OnPageChangeListener onPageChangeListener = this.f20046l;
        if (onPageChangeListener != null) {
            onPageChangeListener.onPageScrolled(position, positionOffset, positionOffsetPixels);
        }
    }

    @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
    public void onPageSelected(int position) {
        setCurrentItem(position);
        ViewPager.OnPageChangeListener onPageChangeListener = this.f20046l;
        if (onPageChangeListener != null) {
            onPageChangeListener.onPageSelected(position);
        }
    }

    @Override // com.viewpagerindicator.c
    public void setCurrentItem(int item) {
        ViewPager viewPager = this.f20045k;
        if (viewPager == null) {
            throw new IllegalStateException("ViewPager has not been bound.");
        }
        this.f20047m = item;
        viewPager.setCurrentItem(item);
        int childCount = getChildCount();
        int i11 = 0;
        while (i11 < childCount) {
            getChildAt(i11).setSelected(i11 == item);
            i11++;
        }
    }

    @Override // com.viewpagerindicator.c
    public void setOnPageChangeListener(ViewPager.OnPageChangeListener listener) {
        this.f20046l = listener;
    }

    public void setTextColor(ColorStateList textColor) {
        this.f20050p = textColor;
    }

    public void setTextSize(int textSizePx) {
        this.f20048n = textSizePx;
    }

    @Override // com.viewpagerindicator.c
    public void setViewPager(ViewPager view) {
        ViewPager viewPager = this.f20045k;
        if (viewPager == view) {
            return;
        }
        if (viewPager != null) {
            viewPager.setOnPageChangeListener(null);
        }
        if (view.getAdapter() == null) {
            throw new IllegalStateException("ViewPager does not have adapter instance.");
        }
        this.f20045k = view;
        view.setOnPageChangeListener(this);
        a();
    }

    public GridPageIndicator(Context context, AttributeSet attrs) {
        super(context, attrs);
        this.f20049o = new a();
        this.f20050p = ColorStateList.valueOf(-1);
    }

    public GridPageIndicator(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        this.f20049o = new a();
        this.f20050p = ColorStateList.valueOf(-1);
    }
}
