package com.viewpagerindicator;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.HorizontalScrollView;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes6.dex */
public class TabPageIndicator extends HorizontalScrollView implements com.viewpagerindicator.c {

    /* renamed from: i, reason: collision with root package name */
    public static final CharSequence f44808i = "";

    /* renamed from: a, reason: collision with root package name */
    public Runnable f44809a;

    /* renamed from: b, reason: collision with root package name */
    public final View.OnClickListener f44810b;

    /* renamed from: c, reason: collision with root package name */
    public final IcsLinearLayout f44811c;

    /* renamed from: d, reason: collision with root package name */
    public ViewPager f44812d;

    /* renamed from: e, reason: collision with root package name */
    public ViewPager.OnPageChangeListener f44813e;

    /* renamed from: f, reason: collision with root package name */
    public int f44814f;

    /* renamed from: g, reason: collision with root package name */
    public int f44815g;

    /* renamed from: h, reason: collision with root package name */
    public c f44816h;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class a implements View.OnClickListener {
        public a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            int currentItem = TabPageIndicator.this.f44812d.getCurrentItem();
            int d11 = ((d) view).d();
            TabPageIndicator.this.f44812d.setCurrentItem(d11);
            if (currentItem != d11 || TabPageIndicator.this.f44816h == null) {
                return;
            }
            TabPageIndicator.this.f44816h.a(d11);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class b implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ View f44818a;

        public b(final View val$tabView) {
            this.f44818a = val$tabView;
        }

        @Override // java.lang.Runnable
        public void run() {
            TabPageIndicator.this.smoothScrollTo(this.f44818a.getLeft() - ((TabPageIndicator.this.getWidth() - this.f44818a.getWidth()) / 2), 0);
            TabPageIndicator.this.f44809a = null;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public interface c {
        void a(int position);
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class d extends AppCompatTextView {

        /* renamed from: a, reason: collision with root package name */
        public int f44820a;

        public d(Context context) {
            super(context, null, R.attr.vpiTabPageIndicatorStyle);
        }

        public int d() {
            return this.f44820a;
        }

        @Override // androidx.appcompat.widget.AppCompatTextView, android.widget.TextView, android.view.View
        public void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
            super.onMeasure(widthMeasureSpec, heightMeasureSpec);
            if (TabPageIndicator.this.f44814f <= 0 || getMeasuredWidth() <= TabPageIndicator.this.f44814f) {
                return;
            }
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(TabPageIndicator.this.f44814f, 1073741824), heightMeasureSpec);
        }
    }

    public TabPageIndicator(Context context) {
        this(context, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.viewpagerindicator.c
    public void a() {
        this.f44811c.removeAllViews();
        PagerAdapter adapter = this.f44812d.getAdapter();
        com.viewpagerindicator.b bVar = adapter instanceof com.viewpagerindicator.b ? (com.viewpagerindicator.b) adapter : null;
        int count = adapter.getCount();
        for (int i11 = 0; i11 < count; i11++) {
            CharSequence pageTitle = adapter.getPageTitle(i11);
            if (pageTitle == null) {
                pageTitle = f44808i;
            }
            f(i11, pageTitle, bVar != null ? bVar.a(i11) : 0);
        }
        if (this.f44815g > count) {
            this.f44815g = count - 1;
        }
        setCurrentItem(this.f44815g);
        requestLayout();
    }

    @Override // com.viewpagerindicator.c
    public void e0(ViewPager view, int initialPosition) {
        setViewPager(view);
        setCurrentItem(initialPosition);
    }

    public final void f(int index, CharSequence text, int iconResId) {
        d dVar = new d(getContext());
        dVar.f44820a = index;
        dVar.setFocusable(true);
        dVar.setOnClickListener(this.f44810b);
        dVar.setText(text);
        if (iconResId != 0) {
            dVar.setCompoundDrawablesWithIntrinsicBounds(iconResId, 0, 0, 0);
        }
        this.f44811c.addView(dVar, new LinearLayout.LayoutParams(0, -1, 1.0f));
    }

    public final void g(final int position) {
        View childAt = this.f44811c.getChildAt(position);
        Runnable runnable = this.f44809a;
        if (runnable != null) {
            removeCallbacks(runnable);
        }
        b bVar = new b(childAt);
        this.f44809a = bVar;
        post(bVar);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        Runnable runnable = this.f44809a;
        if (runnable != null) {
            post(runnable);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        Runnable runnable = this.f44809a;
        if (runnable != null) {
            removeCallbacks(runnable);
        }
    }

    @Override // android.widget.HorizontalScrollView, android.widget.FrameLayout, android.view.View
    public void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        int mode = View.MeasureSpec.getMode(widthMeasureSpec);
        boolean z11 = mode == 1073741824;
        setFillViewport(z11);
        int childCount = this.f44811c.getChildCount();
        if (childCount <= 1 || !(mode == 1073741824 || mode == Integer.MIN_VALUE)) {
            this.f44814f = -1;
        } else if (childCount > 2) {
            this.f44814f = (int) (View.MeasureSpec.getSize(widthMeasureSpec) * 0.4f);
        } else {
            this.f44814f = View.MeasureSpec.getSize(widthMeasureSpec) / 2;
        }
        int measuredWidth = getMeasuredWidth();
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        int measuredWidth2 = getMeasuredWidth();
        if (!z11 || measuredWidth == measuredWidth2) {
            return;
        }
        setCurrentItem(this.f44815g);
    }

    @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
    public void onPageScrollStateChanged(int arg0) {
        ViewPager.OnPageChangeListener onPageChangeListener = this.f44813e;
        if (onPageChangeListener != null) {
            onPageChangeListener.onPageScrollStateChanged(arg0);
        }
    }

    @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
    public void onPageScrolled(int arg0, float arg1, int arg2) {
        ViewPager.OnPageChangeListener onPageChangeListener = this.f44813e;
        if (onPageChangeListener != null) {
            onPageChangeListener.onPageScrolled(arg0, arg1, arg2);
        }
    }

    @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
    public void onPageSelected(int arg0) {
        setCurrentItem(arg0);
        ViewPager.OnPageChangeListener onPageChangeListener = this.f44813e;
        if (onPageChangeListener != null) {
            onPageChangeListener.onPageSelected(arg0);
        }
    }

    @Override // com.viewpagerindicator.c
    public void setCurrentItem(int item) {
        ViewPager viewPager = this.f44812d;
        if (viewPager == null) {
            throw new IllegalStateException("ViewPager has not been bound.");
        }
        this.f44815g = item;
        viewPager.setCurrentItem(item);
        int childCount = this.f44811c.getChildCount();
        int i11 = 0;
        while (i11 < childCount) {
            View childAt = this.f44811c.getChildAt(i11);
            boolean z11 = i11 == item;
            childAt.setSelected(z11);
            if (z11) {
                g(item);
            }
            i11++;
        }
    }

    @Override // com.viewpagerindicator.c
    public void setOnPageChangeListener(ViewPager.OnPageChangeListener listener) {
        this.f44813e = listener;
    }

    public void setOnTabReselectedListener(c listener) {
        this.f44816h = listener;
    }

    @Override // com.viewpagerindicator.c
    public void setViewPager(ViewPager view) {
        ViewPager viewPager = this.f44812d;
        if (viewPager == view) {
            return;
        }
        if (viewPager != null) {
            viewPager.setOnPageChangeListener(null);
        }
        if (view.getAdapter() == null) {
            throw new IllegalStateException("ViewPager does not have adapter instance.");
        }
        this.f44812d = view;
        view.setOnPageChangeListener(this);
        a();
    }

    public TabPageIndicator(Context context, AttributeSet attrs) {
        super(context, attrs);
        this.f44810b = new a();
        setHorizontalScrollBarEnabled(false);
        IcsLinearLayout icsLinearLayout = new IcsLinearLayout(context, R.attr.vpiTabPageIndicatorStyle);
        this.f44811c = icsLinearLayout;
        addView(icsLinearLayout, new ViewGroup.LayoutParams(-2, -1));
    }
}
