package com.viewpagerindicator;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.HorizontalScrollView;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.viewpager.widget.ViewPager;
import java.util.Locale;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes6.dex */
public class PagerSlidingTabStrip extends HorizontalScrollView implements com.viewpagerindicator.c {
    public static final int[] C = {android.R.attr.textSize, android.R.attr.textColor};
    public int A;
    public Locale B;

    /* renamed from: a, reason: collision with root package name */
    public LinearLayout.LayoutParams f44776a;

    /* renamed from: b, reason: collision with root package name */
    public LinearLayout.LayoutParams f44777b;

    /* renamed from: c, reason: collision with root package name */
    public ViewPager.OnPageChangeListener f44778c;

    /* renamed from: d, reason: collision with root package name */
    public LinearLayout f44779d;

    /* renamed from: e, reason: collision with root package name */
    public ViewPager f44780e;

    /* renamed from: f, reason: collision with root package name */
    public int f44781f;

    /* renamed from: g, reason: collision with root package name */
    public int f44782g;

    /* renamed from: h, reason: collision with root package name */
    public float f44783h;

    /* renamed from: i, reason: collision with root package name */
    public Paint f44784i;

    /* renamed from: j, reason: collision with root package name */
    public Paint f44785j;

    /* renamed from: k, reason: collision with root package name */
    public int f44786k;

    /* renamed from: l, reason: collision with root package name */
    public int f44787l;

    /* renamed from: m, reason: collision with root package name */
    public int f44788m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f44789n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f44790o;

    /* renamed from: p, reason: collision with root package name */
    public int f44791p;

    /* renamed from: q, reason: collision with root package name */
    public int f44792q;

    /* renamed from: r, reason: collision with root package name */
    public int f44793r;

    /* renamed from: s, reason: collision with root package name */
    public int f44794s;

    /* renamed from: t, reason: collision with root package name */
    public int f44795t;

    /* renamed from: u, reason: collision with root package name */
    public int f44796u;

    /* renamed from: v, reason: collision with root package name */
    public int f44797v;

    /* renamed from: w, reason: collision with root package name */
    public ColorStateList f44798w;

    /* renamed from: x, reason: collision with root package name */
    public Typeface f44799x;

    /* renamed from: y, reason: collision with root package name */
    public int f44800y;

    /* renamed from: z, reason: collision with root package name */
    public int f44801z;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class SavedState extends View.BaseSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new a();

        /* renamed from: a, reason: collision with root package name */
        public int f44802a;

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public class a implements Parcelable.Creator<SavedState> {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public SavedState createFromParcel(Parcel in2) {
                return new SavedState(in2, null);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public SavedState[] newArray(int size) {
                return new SavedState[size];
            }
        }

        public /* synthetic */ SavedState(Parcel parcel, a aVar) {
            this(parcel);
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel dest, int flags) {
            super.writeToParcel(dest, flags);
            dest.writeInt(this.f44802a);
        }

        public SavedState(Parcelable superState) {
            super(superState);
        }

        public SavedState(Parcel in2) {
            super(in2);
            this.f44802a = in2.readInt();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class a implements ViewTreeObserver.OnGlobalLayoutListener {
        public a() {
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        @SuppressLint({"NewApi"})
        public void onGlobalLayout() {
            PagerSlidingTabStrip.this.getViewTreeObserver().removeOnGlobalLayoutListener(this);
            PagerSlidingTabStrip pagerSlidingTabStrip = PagerSlidingTabStrip.this;
            pagerSlidingTabStrip.f44782g = pagerSlidingTabStrip.f44780e.getCurrentItem();
            PagerSlidingTabStrip pagerSlidingTabStrip2 = PagerSlidingTabStrip.this;
            pagerSlidingTabStrip2.onPageSelected(pagerSlidingTabStrip2.f44782g);
            PagerSlidingTabStrip pagerSlidingTabStrip3 = PagerSlidingTabStrip.this;
            pagerSlidingTabStrip3.j(pagerSlidingTabStrip3.f44782g, 0);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class b implements View.OnClickListener {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ int f44804a;

        public b(final int val$position) {
            this.f44804a = val$position;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View v11) {
            PagerSlidingTabStrip.this.setCurrentItem(this.f44804a);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public interface c {
        int a(int position);
    }

    public PagerSlidingTabStrip(Context context) {
        this(context, null);
    }

    @Override // com.viewpagerindicator.c
    public void a() {
        this.f44779d.removeAllViews();
        this.f44781f = this.f44780e.getAdapter().getCount();
        for (int i11 = 0; i11 < this.f44781f; i11++) {
            if (this.f44780e.getAdapter() instanceof c) {
                f(i11, ((c) this.f44780e.getAdapter()).a(i11));
            } else {
                h(i11, this.f44780e.getAdapter().getPageTitle(i11).toString());
            }
        }
        l();
        getViewTreeObserver().addOnGlobalLayoutListener(new a());
    }

    public final void f(final int position, int resId) {
        ImageButton imageButton = new ImageButton(getContext());
        imageButton.setImageResource(resId);
        g(position, imageButton);
    }

    public final void g(final int position, View tab) {
        tab.setFocusable(true);
        tab.setOnClickListener(new b(position));
        int i11 = this.f44795t;
        tab.setPadding(i11, 0, i11, 0);
        this.f44779d.addView(tab, position, this.f44789n ? this.f44777b : this.f44776a);
    }

    public int getDividerColor() {
        return this.f44788m;
    }

    public int getDividerPadding() {
        return this.f44794s;
    }

    public int getDividerWidth() {
        return this.f44796u;
    }

    public int getIndicatorColor() {
        return this.f44786k;
    }

    public int getIndicatorHeight() {
        return this.f44792q;
    }

    public int getScrollOffset() {
        return this.f44791p;
    }

    public boolean getShouldExpand() {
        return this.f44789n;
    }

    public int getTabBackground() {
        return this.A;
    }

    public int getTabPaddingLeftRight() {
        return this.f44795t;
    }

    public ColorStateList getTextColor() {
        return this.f44798w;
    }

    public int getTextSize() {
        return this.f44797v;
    }

    public int getUnderlineColor() {
        return this.f44787l;
    }

    public int getUnderlineHeight() {
        return this.f44793r;
    }

    public final void h(final int position, String title) {
        TextView textView = new TextView(getContext());
        textView.setText(title);
        textView.setGravity(17);
        textView.setSingleLine();
        g(position, textView);
    }

    public boolean i() {
        return this.f44790o;
    }

    public final void j(int position, int offset) {
        if (this.f44781f == 0) {
            return;
        }
        int left = this.f44779d.getChildAt(position).getLeft() + offset;
        if (position > 0 || offset > 0) {
            left -= this.f44791p;
        }
        if (left != this.f44801z) {
            this.f44801z = left;
            scrollTo(left, 0);
        }
    }

    public void k(Typeface typeface, int style) {
        this.f44799x = typeface;
        this.f44800y = style;
        l();
    }

    public final void l() {
        for (int i11 = 0; i11 < this.f44781f; i11++) {
            View childAt = this.f44779d.getChildAt(i11);
            childAt.setBackgroundResource(this.A);
            if (childAt instanceof TextView) {
                TextView textView = (TextView) childAt;
                textView.setTextSize(0, this.f44797v);
                textView.setTypeface(this.f44799x, this.f44800y);
                textView.setTextColor(this.f44798w);
                if (this.f44790o) {
                    textView.setAllCaps(true);
                }
            }
        }
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        int i11;
        super.onDraw(canvas);
        if (isInEditMode() || this.f44781f == 0) {
            return;
        }
        int height = getHeight();
        this.f44784i.setColor(this.f44786k);
        View childAt = this.f44779d.getChildAt(this.f44782g);
        float left = childAt.getLeft();
        float right = childAt.getRight();
        if (this.f44783h > 0.0f && (i11 = this.f44782g) < this.f44781f - 1) {
            View childAt2 = this.f44779d.getChildAt(i11 + 1);
            float left2 = childAt2.getLeft();
            float right2 = childAt2.getRight();
            float f11 = this.f44783h;
            left = (left2 * f11) + ((1.0f - f11) * left);
            right = (right2 * f11) + ((1.0f - f11) * right);
        }
        float f12 = height;
        canvas.drawRect(left, height - this.f44792q, right, f12, this.f44784i);
        this.f44784i.setColor(this.f44787l);
        canvas.drawRect(0.0f, height - this.f44793r, this.f44779d.getWidth(), f12, this.f44784i);
        if (this.f44796u > 0) {
            this.f44785j.setColor(this.f44788m);
            for (int i12 = 0; i12 < this.f44781f - 1; i12++) {
                View childAt3 = this.f44779d.getChildAt(i12);
                canvas.drawLine(childAt3.getRight(), this.f44794s, childAt3.getRight(), height - this.f44794s, this.f44785j);
            }
        }
    }

    @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
    public void onPageScrollStateChanged(int state) {
        if (state == 0) {
            j(this.f44780e.getCurrentItem(), 0);
        }
        ViewPager.OnPageChangeListener onPageChangeListener = this.f44778c;
        if (onPageChangeListener != null) {
            onPageChangeListener.onPageScrollStateChanged(state);
        }
    }

    @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
    public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {
        this.f44782g = position;
        this.f44783h = positionOffset;
        j(position, (int) (this.f44779d.getChildAt(position).getWidth() * positionOffset));
        invalidate();
        ViewPager.OnPageChangeListener onPageChangeListener = this.f44778c;
        if (onPageChangeListener != null) {
            onPageChangeListener.onPageScrolled(position, positionOffset, positionOffsetPixels);
        }
    }

    @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
    public void onPageSelected(int position) {
        ViewPager.OnPageChangeListener onPageChangeListener = this.f44778c;
        if (onPageChangeListener != null) {
            onPageChangeListener.onPageSelected(position);
        }
        int childCount = this.f44779d.getChildCount();
        int i11 = 0;
        while (i11 < childCount) {
            this.f44779d.getChildAt(i11).setSelected(i11 == position);
            i11++;
        }
    }

    @Override // android.widget.HorizontalScrollView, android.view.View
    public void onRestoreInstanceState(Parcelable state) {
        SavedState savedState = (SavedState) state;
        super.onRestoreInstanceState(savedState.getSuperState());
        int i11 = savedState.f44802a;
        this.f44782g = i11;
        onPageSelected(i11);
        requestLayout();
    }

    @Override // android.widget.HorizontalScrollView, android.view.View
    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.f44802a = this.f44782g;
        return savedState;
    }

    public void setAllCaps(boolean textAllCaps) {
        this.f44790o = textAllCaps;
    }

    @Override // com.viewpagerindicator.c
    public void setCurrentItem(int item) {
        this.f44780e.setCurrentItem(item);
    }

    public void setDividerColor(int dividerColor) {
        this.f44788m = dividerColor;
        invalidate();
    }

    public void setDividerColorResource(int resId) {
        this.f44788m = getResources().getColor(resId);
        invalidate();
    }

    public void setDividerPadding(int dividerPaddingPx) {
        this.f44794s = dividerPaddingPx;
        invalidate();
    }

    public void setDividerWidth(int dividerWidth) {
        this.f44796u = dividerWidth;
        this.f44785j.setStrokeWidth(dividerWidth);
        invalidate();
    }

    public void setIndicatorColor(int indicatorColor) {
        this.f44786k = indicatorColor;
        invalidate();
    }

    public void setIndicatorColorResource(int resId) {
        this.f44786k = getResources().getColor(resId);
        invalidate();
    }

    public void setIndicatorHeight(int indicatorLineHeightPx) {
        this.f44792q = indicatorLineHeightPx;
        invalidate();
    }

    @Override // com.viewpagerindicator.c
    public void setOnPageChangeListener(ViewPager.OnPageChangeListener listener) {
        this.f44778c = listener;
    }

    public void setScrollOffset(int scrollOffsetPx) {
        this.f44791p = scrollOffsetPx;
        invalidate();
    }

    public void setShouldExpand(boolean shouldExpand) {
        this.f44789n = shouldExpand;
        requestLayout();
    }

    public void setTabBackground(int resId) {
        this.A = resId;
    }

    public void setTabPaddingLeftRight(int paddingPx) {
        this.f44795t = paddingPx;
        l();
    }

    public void setTextColor(int textColor) {
        this.f44798w = ColorStateList.valueOf(textColor);
        l();
    }

    public void setTextSize(int textSizePx) {
        this.f44797v = textSizePx;
        l();
    }

    public void setUnderlineColor(int underlineColor) {
        this.f44787l = underlineColor;
        invalidate();
    }

    public void setUnderlineColorResource(int resId) {
        this.f44787l = getResources().getColor(resId);
        invalidate();
    }

    public void setUnderlineHeight(int underlineHeightPx) {
        this.f44793r = underlineHeightPx;
        invalidate();
    }

    @Override // com.viewpagerindicator.c
    public void setViewPager(ViewPager pager) {
        this.f44780e = pager;
        if (pager.getAdapter() == null) {
            throw new IllegalStateException("ViewPager does not have adapter instance.");
        }
        pager.setOnPageChangeListener(this);
        a();
    }

    public PagerSlidingTabStrip(Context context, AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public PagerSlidingTabStrip(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
        this.f44782g = 0;
        this.f44783h = 0.0f;
        this.f44786k = -10066330;
        this.f44787l = 436207616;
        this.f44788m = 436207616;
        this.f44789n = false;
        this.f44790o = true;
        this.f44791p = 52;
        this.f44792q = 8;
        this.f44793r = 2;
        this.f44794s = 12;
        this.f44795t = 24;
        this.f44796u = 1;
        this.f44797v = 12;
        this.f44798w = ColorStateList.valueOf(-10066330);
        this.f44799x = null;
        this.f44800y = 1;
        this.f44801z = 0;
        this.A = R.drawable.background_tab;
        setFillViewport(true);
        setWillNotDraw(false);
        LinearLayout linearLayout = new LinearLayout(context);
        this.f44779d = linearLayout;
        linearLayout.setOrientation(0);
        this.f44779d.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        addView(this.f44779d);
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        this.f44791p = (int) TypedValue.applyDimension(1, this.f44791p, displayMetrics);
        this.f44792q = (int) TypedValue.applyDimension(1, this.f44792q, displayMetrics);
        this.f44793r = (int) TypedValue.applyDimension(1, this.f44793r, displayMetrics);
        this.f44794s = (int) TypedValue.applyDimension(1, this.f44794s, displayMetrics);
        this.f44795t = (int) TypedValue.applyDimension(1, this.f44795t, displayMetrics);
        this.f44796u = (int) TypedValue.applyDimension(1, this.f44796u, displayMetrics);
        this.f44797v = (int) TypedValue.applyDimension(2, this.f44797v, displayMetrics);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attrs, C);
        this.f44797v = obtainStyledAttributes.getDimensionPixelSize(0, this.f44797v);
        ColorStateList colorStateList = obtainStyledAttributes.getColorStateList(1);
        this.f44798w = colorStateList == null ? ColorStateList.valueOf(-1) : colorStateList;
        obtainStyledAttributes.recycle();
        TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(attrs, R.styleable.PagerSlidingTabStrip);
        this.f44786k = obtainStyledAttributes2.getColor(R.styleable.PagerSlidingTabStrip_pstsIndicatorColor, this.f44786k);
        this.f44787l = obtainStyledAttributes2.getColor(R.styleable.PagerSlidingTabStrip_pstsUnderlineColor, this.f44787l);
        this.f44788m = obtainStyledAttributes2.getColor(R.styleable.PagerSlidingTabStrip_pstsDividerColor, this.f44788m);
        this.f44792q = obtainStyledAttributes2.getDimensionPixelSize(R.styleable.PagerSlidingTabStrip_pstsIndicatorHeight, this.f44792q);
        this.f44793r = obtainStyledAttributes2.getDimensionPixelSize(R.styleable.PagerSlidingTabStrip_pstsUnderlineHeight, this.f44793r);
        this.f44794s = obtainStyledAttributes2.getDimensionPixelSize(R.styleable.PagerSlidingTabStrip_pstsDividerPadding, this.f44794s);
        this.f44795t = obtainStyledAttributes2.getDimensionPixelSize(R.styleable.PagerSlidingTabStrip_pstsTabPaddingLeftRight, this.f44795t);
        this.A = obtainStyledAttributes2.getResourceId(R.styleable.PagerSlidingTabStrip_pstsTabBackground, this.A);
        this.f44789n = obtainStyledAttributes2.getBoolean(R.styleable.PagerSlidingTabStrip_pstsShouldExpand, this.f44789n);
        this.f44791p = obtainStyledAttributes2.getDimensionPixelSize(R.styleable.PagerSlidingTabStrip_pstsScrollOffset, this.f44791p);
        this.f44790o = obtainStyledAttributes2.getBoolean(R.styleable.PagerSlidingTabStrip_pstsTextAllCaps, this.f44790o);
        obtainStyledAttributes2.recycle();
        Paint paint = new Paint();
        this.f44784i = paint;
        paint.setAntiAlias(true);
        this.f44784i.setStyle(Paint.Style.FILL);
        Paint paint2 = new Paint();
        this.f44785j = paint2;
        paint2.setAntiAlias(true);
        this.f44785j.setStrokeWidth(this.f44796u);
        this.f44776a = new LinearLayout.LayoutParams(-2, -1);
        this.f44777b = new LinearLayout.LayoutParams(0, -1, 1.0f);
        if (this.B == null) {
            this.B = getResources().getConfiguration().locale;
        }
    }

    public void setTextColor(ColorStateList textColor) {
        this.f44798w = textColor;
        l();
    }

    @Override // com.viewpagerindicator.c
    public void e0(ViewPager view, int initialPosition) {
    }
}
