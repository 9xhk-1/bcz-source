package com.baicizhan.main.customview;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.StateListDrawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;
import com.baicizhan.client.business.util.ThemeResUtil;
import com.jiongji.andriod.card.R;
import com.malmstein.fenster.videorender.gles.GeneratedTexture;
import com.wefika.flowlayout.FlowLayout;
import xb.f;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public class FlowPageIndicator extends FlowLayout implements com.viewpagerindicator.c {

    /* renamed from: e, reason: collision with root package name */
    public ViewPager f20025e;

    /* renamed from: f, reason: collision with root package name */
    public ViewPager.OnPageChangeListener f20026f;

    /* renamed from: g, reason: collision with root package name */
    public int f20027g;

    /* renamed from: h, reason: collision with root package name */
    public int f20028h;

    /* renamed from: i, reason: collision with root package name */
    public View.OnClickListener f20029i;

    /* renamed from: j, reason: collision with root package name */
    public ColorStateList f20030j;

    /* renamed from: k, reason: collision with root package name */
    public c f20031k;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class a implements View.OnClickListener {
        public a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View v11) {
            FlowPageIndicator.this.setCurrentItem(((Integer) v11.getTag()).intValue());
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class b implements c {
        @Override // com.baicizhan.main.customview.FlowPageIndicator.c
        public Drawable create(Context context) {
            GradientDrawable build = new ThemeResUtil.ShapeDrawableBuilder().with(context).setStroke(1.0f, R.attr.color_text4).setColor(GeneratedTexture.f39227d).setCorner(13).build();
            GradientDrawable build2 = new ThemeResUtil.ShapeDrawableBuilder().with(context).setColorAttr(R.attr.color_bcz_blue).setCorner(13).build();
            StateListDrawable stateListDrawable = new StateListDrawable();
            stateListDrawable.addState(new int[]{android.R.attr.state_pressed, android.R.attr.state_enabled}, build2);
            stateListDrawable.addState(new int[]{android.R.attr.state_selected, android.R.attr.state_enabled}, build2);
            stateListDrawable.addState(new int[0], build);
            return stateListDrawable;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public interface c {
        Drawable create(Context context);
    }

    public FlowPageIndicator(Context context) {
        super(context);
        this.f20029i = new a();
        this.f20030j = ColorStateList.valueOf(-1);
    }

    @Override // com.viewpagerindicator.c
    public void a() {
        removeAllViews();
        PagerAdapter adapter = this.f20025e.getAdapter();
        int count = adapter.getCount();
        int a11 = f.a(getContext(), 5.0f);
        int a12 = f.a(getContext(), 5.0f);
        int a13 = f.a(getContext(), 14.0f);
        int a14 = f.a(getContext(), 6.0f);
        for (int i11 = 0; i11 < count; i11++) {
            TextView textView = new TextView(getContext());
            FlowLayout.a aVar = new FlowLayout.a(-2, -2);
            ((ViewGroup.MarginLayoutParams) aVar).leftMargin = a11;
            ((ViewGroup.MarginLayoutParams) aVar).rightMargin = a11;
            ((ViewGroup.MarginLayoutParams) aVar).topMargin = a12;
            ((ViewGroup.MarginLayoutParams) aVar).bottomMargin = a12;
            textView.setLayoutParams(aVar);
            textView.setPadding(a13, a14, a13, a14);
            textView.setTextSize(0, this.f20028h);
            textView.setTextColor(this.f20030j);
            c cVar = this.f20031k;
            lq.c.b(textView, cVar != null ? cVar.create(getContext()) : null);
            textView.setGravity(17);
            textView.setText(adapter.getPageTitle(i11));
            textView.setTag(Integer.valueOf(i11));
            textView.setOnClickListener(this.f20029i);
            addView(textView);
        }
        if (this.f20027g > count) {
            this.f20027g = count - 1;
        }
        setCurrentItem(this.f20027g);
        requestLayout();
    }

    @Override // com.viewpagerindicator.c
    public void e0(ViewPager view, int initialPosition) {
        setViewPager(view);
        setCurrentItem(initialPosition);
    }

    @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
    public void onPageScrollStateChanged(int state) {
        ViewPager.OnPageChangeListener onPageChangeListener = this.f20026f;
        if (onPageChangeListener != null) {
            onPageChangeListener.onPageScrollStateChanged(state);
        }
    }

    @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
    public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {
        ViewPager.OnPageChangeListener onPageChangeListener = this.f20026f;
        if (onPageChangeListener != null) {
            onPageChangeListener.onPageScrolled(position, positionOffset, positionOffsetPixels);
        }
    }

    @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
    public void onPageSelected(int position) {
        setCurrentItem(position);
        ViewPager.OnPageChangeListener onPageChangeListener = this.f20026f;
        if (onPageChangeListener != null) {
            onPageChangeListener.onPageSelected(position);
        }
    }

    @Override // com.viewpagerindicator.c
    public void setCurrentItem(int item) {
        ViewPager viewPager = this.f20025e;
        if (viewPager == null) {
            throw new IllegalStateException("ViewPager has not been bound.");
        }
        this.f20027g = item;
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
        this.f20026f = listener;
    }

    public void setTextBackgroundCreator(c creator) {
        this.f20031k = creator;
    }

    public void setTextColor(ColorStateList textColor) {
        this.f20030j = textColor;
    }

    public void setTextSize(int textSizePx) {
        this.f20028h = textSizePx;
    }

    @Override // com.viewpagerindicator.c
    public void setViewPager(ViewPager view) {
        ViewPager viewPager = this.f20025e;
        if (viewPager == view) {
            return;
        }
        if (viewPager != null) {
            viewPager.setOnPageChangeListener(null);
        }
        if (view.getAdapter() == null) {
            throw new IllegalStateException("ViewPager does not have adapter instance.");
        }
        this.f20025e = view;
        view.setOnPageChangeListener(this);
        a();
    }

    public FlowPageIndicator(Context context, AttributeSet attrs) {
        super(context, attrs);
        this.f20029i = new a();
        this.f20030j = ColorStateList.valueOf(-1);
    }

    public FlowPageIndicator(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
        this.f20029i = new a();
        this.f20030j = ColorStateList.valueOf(-1);
    }
}
