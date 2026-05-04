package com.ogaclejapan.smarttablayout;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.HorizontalScrollView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.core.view.ViewCompat;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public class SmartTabLayout extends HorizontalScrollView {

    /* renamed from: p, reason: collision with root package name */
    public static final boolean f41488p = false;

    /* renamed from: q, reason: collision with root package name */
    public static final int f41489q = 24;

    /* renamed from: r, reason: collision with root package name */
    public static final int f41490r = -1;

    /* renamed from: s, reason: collision with root package name */
    public static final int f41491s = 16;

    /* renamed from: t, reason: collision with root package name */
    public static final boolean f41492t = true;

    /* renamed from: u, reason: collision with root package name */
    public static final int f41493u = 12;

    /* renamed from: v, reason: collision with root package name */
    public static final int f41494v = -67108864;

    /* renamed from: w, reason: collision with root package name */
    public static final int f41495w = 0;

    /* renamed from: x, reason: collision with root package name */
    public static final boolean f41496x = true;

    /* renamed from: a, reason: collision with root package name */
    public final com.ogaclejapan.smarttablayout.a f41497a;

    /* renamed from: b, reason: collision with root package name */
    public int f41498b;

    /* renamed from: c, reason: collision with root package name */
    public int f41499c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f41500d;

    /* renamed from: e, reason: collision with root package name */
    public ColorStateList f41501e;

    /* renamed from: f, reason: collision with root package name */
    public float f41502f;

    /* renamed from: g, reason: collision with root package name */
    public int f41503g;

    /* renamed from: h, reason: collision with root package name */
    public int f41504h;

    /* renamed from: i, reason: collision with root package name */
    public ViewPager f41505i;

    /* renamed from: j, reason: collision with root package name */
    public ViewPager.OnPageChangeListener f41506j;

    /* renamed from: k, reason: collision with root package name */
    public d f41507k;

    /* renamed from: l, reason: collision with root package name */
    public h f41508l;

    /* renamed from: m, reason: collision with root package name */
    public b f41509m;

    /* renamed from: n, reason: collision with root package name */
    public e f41510n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f41511o;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class b implements View.OnClickListener {
        public b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            for (int i11 = 0; i11 < SmartTabLayout.this.f41497a.getChildCount(); i11++) {
                if (view == SmartTabLayout.this.f41497a.getChildAt(i11)) {
                    if (SmartTabLayout.this.f41510n != null) {
                        SmartTabLayout.this.f41510n.a(i11);
                    }
                    SmartTabLayout.this.f41505i.setCurrentItem(i11);
                    return;
                }
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class c implements ViewPager.OnPageChangeListener {

        /* renamed from: a, reason: collision with root package name */
        public int f41513a;

        public c() {
        }

        @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
        public void onPageScrollStateChanged(int i11) {
            this.f41513a = i11;
            if (SmartTabLayout.this.f41506j != null) {
                SmartTabLayout.this.f41506j.onPageScrollStateChanged(i11);
            }
        }

        @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
        public void onPageScrolled(int i11, float f11, int i12) {
            int childCount = SmartTabLayout.this.f41497a.getChildCount();
            if (childCount == 0 || i11 < 0 || i11 >= childCount) {
                return;
            }
            SmartTabLayout.this.f41497a.i(i11, f11);
            SmartTabLayout.this.h(i11, f11);
            if (SmartTabLayout.this.f41506j != null) {
                SmartTabLayout.this.f41506j.onPageScrolled(i11, f11, i12);
            }
        }

        @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
        public void onPageSelected(int i11) {
            if (this.f41513a == 0) {
                SmartTabLayout.this.f41497a.i(i11, 0.0f);
                SmartTabLayout.this.h(i11, 0.0f);
            }
            int childCount = SmartTabLayout.this.f41497a.getChildCount();
            int i12 = 0;
            while (i12 < childCount) {
                SmartTabLayout.this.f41497a.getChildAt(i12).setSelected(i11 == i12);
                i12++;
            }
            if (SmartTabLayout.this.f41506j != null) {
                SmartTabLayout.this.f41506j.onPageSelected(i11);
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public interface d {
        void a(int i11, int i12);
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public interface e {
        void a(int i11);
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class f implements h {

        /* renamed from: a, reason: collision with root package name */
        public final LayoutInflater f41515a;

        /* renamed from: b, reason: collision with root package name */
        public final int f41516b;

        /* renamed from: c, reason: collision with root package name */
        public final int f41517c;

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r6v3, types: [android.view.View] */
        @Override // com.ogaclejapan.smarttablayout.SmartTabLayout.h
        public View a(ViewGroup viewGroup, int i11, PagerAdapter pagerAdapter) {
            int i12 = this.f41516b;
            TextView textView = null;
            TextView inflate = i12 != -1 ? this.f41515a.inflate(i12, viewGroup, false) : null;
            int i13 = this.f41517c;
            if (i13 != -1 && inflate != null) {
                textView = (TextView) inflate.findViewById(i13);
            }
            if (textView == null && TextView.class.isInstance(inflate)) {
                textView = inflate;
            }
            if (textView != null) {
                textView.setText(pagerAdapter.getPageTitle(i11));
            }
            return inflate;
        }

        public f(Context context, int i11, int i12) {
            this.f41515a = LayoutInflater.from(context);
            this.f41516b = i11;
            this.f41517c = i12;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public interface g {
        int a(int i11);

        int b(int i11);
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public interface h {
        View a(ViewGroup viewGroup, int i11, PagerAdapter pagerAdapter);
    }

    public SmartTabLayout(Context context) {
        this(context, null);
    }

    public TextView e(CharSequence charSequence) {
        TextView textView = new TextView(getContext());
        textView.setGravity(17);
        textView.setText(charSequence);
        textView.setTextColor(this.f41501e);
        textView.setTextSize(0, this.f41502f);
        textView.setTypeface(Typeface.DEFAULT_BOLD);
        textView.setLayoutParams(new LinearLayout.LayoutParams(-2, -1));
        int i11 = this.f41499c;
        if (i11 != -1) {
            textView.setBackgroundResource(i11);
        } else {
            TypedValue typedValue = new TypedValue();
            getContext().getTheme().resolveAttribute(android.R.attr.selectableItemBackground, typedValue, true);
            textView.setBackgroundResource(typedValue.resourceId);
        }
        textView.setAllCaps(this.f41500d);
        int i12 = this.f41503g;
        textView.setPadding(i12, 0, i12, 0);
        int i13 = this.f41504h;
        if (i13 > 0) {
            textView.setMinWidth(i13);
        }
        return textView;
    }

    public View f(int i11) {
        return this.f41497a.getChildAt(i11);
    }

    public final void g() {
        PagerAdapter adapter = this.f41505i.getAdapter();
        for (int i11 = 0; i11 < adapter.getCount(); i11++) {
            h hVar = this.f41508l;
            View e11 = hVar == null ? e(adapter.getPageTitle(i11)) : hVar.a(this.f41497a, i11, adapter);
            if (e11 == null) {
                throw new IllegalStateException("tabView is null.");
            }
            if (this.f41511o) {
                LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) e11.getLayoutParams();
                layoutParams.width = 0;
                layoutParams.weight = 1.0f;
            }
            b bVar = this.f41509m;
            if (bVar != null) {
                e11.setOnClickListener(bVar);
            }
            this.f41497a.addView(e11);
            if (i11 == this.f41505i.getCurrentItem()) {
                e11.setSelected(true);
            }
        }
    }

    public final void h(int i11, float f11) {
        int i12;
        int j11;
        int i13;
        int childCount = this.f41497a.getChildCount();
        if (childCount == 0 || i11 < 0 || i11 >= childCount) {
            return;
        }
        boolean n11 = ft.c.n(this);
        View childAt = this.f41497a.getChildAt(i11);
        int l11 = (int) ((ft.c.l(childAt) + ft.c.d(childAt)) * f11);
        if (this.f41497a.h()) {
            if (0.0f < f11 && f11 < 1.0f) {
                View childAt2 = this.f41497a.getChildAt(i11 + 1);
                l11 = Math.round(f11 * ((ft.c.l(childAt) / 2) + ft.c.c(childAt) + (ft.c.l(childAt2) / 2) + ft.c.e(childAt2)));
            }
            View childAt3 = this.f41497a.getChildAt(0);
            if (n11) {
                int l12 = ft.c.l(childAt3) + ft.c.c(childAt3);
                int l13 = ft.c.l(childAt) + ft.c.c(childAt);
                j11 = (ft.c.a(childAt) - ft.c.c(childAt)) - l11;
                i13 = (l12 - l13) / 2;
            } else {
                int l14 = ft.c.l(childAt3) + ft.c.e(childAt3);
                int l15 = ft.c.l(childAt) + ft.c.e(childAt);
                j11 = (ft.c.j(childAt) - ft.c.e(childAt)) + l11;
                i13 = (l14 - l15) / 2;
            }
            scrollTo(j11 - i13, 0);
            return;
        }
        int i14 = this.f41498b;
        if (i14 == -1) {
            if (0.0f < f11 && f11 < 1.0f) {
                View childAt4 = this.f41497a.getChildAt(i11 + 1);
                l11 = Math.round(f11 * ((ft.c.l(childAt) / 2) + ft.c.c(childAt) + (ft.c.l(childAt4) / 2) + ft.c.e(childAt4)));
            }
            i12 = n11 ? (((-ft.c.m(childAt)) / 2) + (getWidth() / 2)) - ft.c.i(this) : ((ft.c.m(childAt) / 2) - (getWidth() / 2)) + ft.c.i(this);
        } else if (n11) {
            if (i11 <= 0 && f11 <= 0.0f) {
                i14 = 0;
            }
            i12 = i14;
        } else {
            i12 = (i11 > 0 || f11 > 0.0f) ? -i14 : 0;
        }
        int j12 = ft.c.j(childAt);
        int e11 = ft.c.e(childAt);
        scrollTo(i12 + (n11 ? (((j12 + e11) - l11) - getWidth()) + ft.c.h(this) : (j12 - e11) + l11), 0);
    }

    public void i(int i11, int i12) {
        this.f41508l = new f(getContext(), i11, i12);
    }

    @Override // android.widget.HorizontalScrollView, android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z11, int i11, int i12, int i13, int i14) {
        ViewPager viewPager;
        super.onLayout(z11, i11, i12, i13, i14);
        if (!z11 || (viewPager = this.f41505i) == null) {
            return;
        }
        h(viewPager.getCurrentItem(), 0.0f);
    }

    @Override // android.view.View
    public void onScrollChanged(int i11, int i12, int i13, int i14) {
        super.onScrollChanged(i11, i12, i13, i14);
        d dVar = this.f41507k;
        if (dVar != null) {
            dVar.a(i11, i13);
        }
    }

    @Override // android.widget.HorizontalScrollView, android.view.View
    public void onSizeChanged(int i11, int i12, int i13, int i14) {
        super.onSizeChanged(i11, i12, i13, i14);
        if (!this.f41497a.h() || this.f41497a.getChildCount() <= 0) {
            return;
        }
        View childAt = this.f41497a.getChildAt(0);
        View childAt2 = this.f41497a.getChildAt(r5.getChildCount() - 1);
        int f11 = ((i11 - ft.c.f(childAt)) / 2) - ft.c.e(childAt);
        int f12 = ((i11 - ft.c.f(childAt2)) / 2) - ft.c.c(childAt2);
        com.ogaclejapan.smarttablayout.a aVar = this.f41497a;
        aVar.setMinimumWidth(aVar.getMeasuredWidth());
        ViewCompat.setPaddingRelative(this, f11, getPaddingTop(), f12, getPaddingBottom());
        setClipToPadding(false);
    }

    public void setCustomTabColorizer(g gVar) {
        this.f41497a.k(gVar);
    }

    public void setCustomTabView(h hVar) {
        this.f41508l = hVar;
    }

    public void setDefaultTabTextColor(int i11) {
        this.f41501e = ColorStateList.valueOf(i11);
    }

    public void setDistributeEvenly(boolean z11) {
        this.f41511o = z11;
    }

    public void setDividerColors(int... iArr) {
        this.f41497a.l(iArr);
    }

    public void setIndicationInterpolator(ft.b bVar) {
        this.f41497a.m(bVar);
    }

    public void setOnPageChangeListener(ViewPager.OnPageChangeListener onPageChangeListener) {
        this.f41506j = onPageChangeListener;
    }

    public void setOnScrollChangeListener(d dVar) {
        this.f41507k = dVar;
    }

    public void setOnTabClickListener(e eVar) {
        this.f41510n = eVar;
    }

    public void setSelectedIndicatorColors(int... iArr) {
        this.f41497a.n(iArr);
    }

    public void setViewPager(ViewPager viewPager) {
        this.f41497a.removeAllViews();
        this.f41505i = viewPager;
        if (viewPager == null || viewPager.getAdapter() == null) {
            return;
        }
        viewPager.addOnPageChangeListener(new c());
        g();
    }

    public SmartTabLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public void setDefaultTabTextColor(ColorStateList colorStateList) {
        this.f41501e = colorStateList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public SmartTabLayout(Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        setHorizontalScrollBarEnabled(false);
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        float f11 = displayMetrics.density;
        float applyDimension = TypedValue.applyDimension(2, 12.0f, displayMetrics);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.stl_SmartTabLayout, i11, 0);
        int resourceId = obtainStyledAttributes.getResourceId(R.styleable.stl_SmartTabLayout_stl_defaultTabBackground, -1);
        boolean z11 = obtainStyledAttributes.getBoolean(R.styleable.stl_SmartTabLayout_stl_defaultTabTextAllCaps, true);
        ColorStateList colorStateList = obtainStyledAttributes.getColorStateList(R.styleable.stl_SmartTabLayout_stl_defaultTabTextColor);
        float dimension = obtainStyledAttributes.getDimension(R.styleable.stl_SmartTabLayout_stl_defaultTabTextSize, applyDimension);
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(R.styleable.stl_SmartTabLayout_stl_defaultTabTextHorizontalPadding, (int) (16.0f * f11));
        int dimensionPixelSize2 = obtainStyledAttributes.getDimensionPixelSize(R.styleable.stl_SmartTabLayout_stl_defaultTabTextMinWidth, (int) (0.0f * f11));
        int resourceId2 = obtainStyledAttributes.getResourceId(R.styleable.stl_SmartTabLayout_stl_customTabTextLayoutId, -1);
        int resourceId3 = obtainStyledAttributes.getResourceId(R.styleable.stl_SmartTabLayout_stl_customTabTextViewId, -1);
        boolean z12 = obtainStyledAttributes.getBoolean(R.styleable.stl_SmartTabLayout_stl_distributeEvenly, false);
        boolean z13 = obtainStyledAttributes.getBoolean(R.styleable.stl_SmartTabLayout_stl_clickable, true);
        int layoutDimension = obtainStyledAttributes.getLayoutDimension(R.styleable.stl_SmartTabLayout_stl_titleOffset, (int) (f11 * 24.0f));
        obtainStyledAttributes.recycle();
        this.f41498b = layoutDimension;
        this.f41499c = resourceId;
        this.f41500d = z11;
        this.f41501e = colorStateList == null ? ColorStateList.valueOf(f41494v) : colorStateList;
        this.f41502f = dimension;
        this.f41503g = dimensionPixelSize;
        this.f41504h = dimensionPixelSize2;
        this.f41509m = z13 ? new b() : null;
        this.f41511o = z12;
        if (resourceId2 != -1) {
            i(resourceId2, resourceId3);
        }
        com.ogaclejapan.smarttablayout.a aVar = new com.ogaclejapan.smarttablayout.a(context, attributeSet);
        this.f41497a = aVar;
        if (z12 && aVar.h()) {
            throw new UnsupportedOperationException("'distributeEvenly' and 'indicatorAlwaysInCenter' both use does not support");
        }
        setFillViewport(!aVar.h());
        addView(aVar, -1, -1);
    }
}
