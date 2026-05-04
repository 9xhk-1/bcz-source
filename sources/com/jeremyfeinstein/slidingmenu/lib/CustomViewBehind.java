package com.jeremyfeinstein.slidingmenu.lib;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import com.jeremyfeinstein.slidingmenu.lib.SlidingMenu;
import com.jiongji.andriod.card.R;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public class CustomViewBehind extends ViewGroup {

    /* renamed from: t, reason: collision with root package name */
    public static final String f38841t = "CustomViewBehind";

    /* renamed from: u, reason: collision with root package name */
    public static final int f38842u = 48;

    /* renamed from: a, reason: collision with root package name */
    public int f38843a;

    /* renamed from: b, reason: collision with root package name */
    public CustomViewAbove f38844b;

    /* renamed from: c, reason: collision with root package name */
    public View f38845c;

    /* renamed from: d, reason: collision with root package name */
    public View f38846d;

    /* renamed from: e, reason: collision with root package name */
    public int f38847e;

    /* renamed from: f, reason: collision with root package name */
    public int f38848f;

    /* renamed from: g, reason: collision with root package name */
    public SlidingMenu.c f38849g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f38850h;

    /* renamed from: i, reason: collision with root package name */
    public int f38851i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f38852j;

    /* renamed from: k, reason: collision with root package name */
    public final Paint f38853k;

    /* renamed from: l, reason: collision with root package name */
    public float f38854l;

    /* renamed from: m, reason: collision with root package name */
    public Drawable f38855m;

    /* renamed from: n, reason: collision with root package name */
    public Drawable f38856n;

    /* renamed from: o, reason: collision with root package name */
    public int f38857o;

    /* renamed from: p, reason: collision with root package name */
    public float f38858p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f38859q;

    /* renamed from: r, reason: collision with root package name */
    public Bitmap f38860r;

    /* renamed from: s, reason: collision with root package name */
    public View f38861s;

    public CustomViewBehind(Context context) {
        this(context, null);
    }

    private int getSelectorTop() {
        return this.f38861s.getTop() + ((this.f38861s.getHeight() - this.f38860r.getHeight()) / 2);
    }

    public void a(View content, Canvas canvas, float openPercent) {
        int i11;
        int right;
        int behindWidth;
        if (this.f38852j) {
            int i12 = 0;
            this.f38853k.setColor(Color.argb((int) (this.f38858p * 255.0f * Math.abs(1.0f - openPercent)), 0, 0, 0));
            int i13 = this.f38851i;
            if (i13 == 0) {
                int left = getLeft();
                i11 = content.getRight();
                this.f38853k.setColor(Color.argb((int) (255.0f * openPercent * this.f38858p), 0, 0, 0));
                i12 = left;
            } else {
                if (i13 == 1) {
                    i12 = content.getRight();
                    right = content.getRight();
                    behindWidth = getBehindWidth();
                } else if (i13 == 2) {
                    canvas.drawRect(content.getLeft() - getBehindWidth(), 0.0f, content.getLeft(), getHeight(), this.f38853k);
                    i12 = content.getRight();
                    right = content.getRight();
                    behindWidth = getBehindWidth();
                } else {
                    i11 = 0;
                }
                i11 = right + behindWidth;
            }
            canvas.drawRect(i12, 0.0f, i11, getHeight(), this.f38853k);
        }
    }

    public void b(View content, Canvas canvas, float openPercent) {
        View view;
        if (this.f38859q && this.f38860r != null && (view = this.f38861s) != null && ((String) view.getTag(R.id.selected_view)).equals("CustomViewBehindSelectedView")) {
            canvas.save();
            int width = (int) (this.f38860r.getWidth() * openPercent);
            int i11 = this.f38851i;
            if (i11 == 0) {
                int left = content.getLeft();
                int i12 = left - width;
                canvas.clipRect(i12, 0, left, getHeight());
                canvas.drawBitmap(this.f38860r, i12, getSelectorTop(), (Paint) null);
            } else if (i11 == 1) {
                int right = content.getRight();
                canvas.clipRect(right, 0, width + right, getHeight());
                canvas.drawBitmap(this.f38860r, r7 - r5.getWidth(), getSelectorTop(), (Paint) null);
            }
            canvas.restore();
        }
    }

    public void c(View content, Canvas canvas) {
        int i11;
        int left;
        int i12;
        if (this.f38855m == null || this.f38857o <= 0) {
            return;
        }
        int i13 = this.f38851i;
        if (i13 != 0) {
            if (i13 == 1) {
                i11 = content.getRight();
            } else if (i13 == 2) {
                if (this.f38856n != null) {
                    int right = content.getRight();
                    this.f38856n.setBounds(right, 0, this.f38857o + right, getHeight());
                    this.f38856n.draw(canvas);
                }
                left = content.getLeft();
                i12 = this.f38857o;
            } else {
                i11 = 0;
            }
            this.f38855m.setBounds(i11, 0, this.f38857o + i11, getHeight());
            this.f38855m.draw(canvas);
        }
        left = content.getLeft();
        i12 = this.f38857o;
        i11 = left - i12;
        this.f38855m.setBounds(i11, 0, this.f38857o + i11, getHeight());
        this.f38855m.draw(canvas);
    }

    public int d(View content) {
        int i11 = this.f38851i;
        if (i11 == 0 || i11 == 2) {
            return content.getLeft() - getBehindWidth();
        }
        if (i11 == 1) {
            return content.getLeft();
        }
        return 0;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        if (this.f38849g == null) {
            super.dispatchDraw(canvas);
            return;
        }
        canvas.save();
        this.f38849g.a(canvas, this.f38844b.getPercentOpen());
        super.dispatchDraw(canvas);
        canvas.restore();
    }

    public int e(View content) {
        int i11 = this.f38851i;
        if (i11 == 0) {
            return content.getLeft();
        }
        if (i11 == 1 || i11 == 2) {
            return content.getLeft() + getBehindWidth();
        }
        return 0;
    }

    public int f(View content, int page) {
        int i11 = this.f38851i;
        if (i11 == 0) {
            if (page == 0) {
                return content.getLeft() - getBehindWidth();
            }
            if (page == 2) {
                return content.getLeft();
            }
        } else if (i11 == 1) {
            if (page == 0) {
                return content.getLeft();
            }
            if (page == 2) {
                return content.getLeft() + getBehindWidth();
            }
        } else if (i11 == 2) {
            if (page == 0) {
                return content.getLeft() - getBehindWidth();
            }
            if (page == 2) {
                return content.getLeft() + getBehindWidth();
            }
        }
        return content.getLeft();
    }

    public int g(int page) {
        if (page > 1) {
            page = 2;
        } else if (page < 1) {
            page = 0;
        }
        int i11 = this.f38851i;
        if (i11 == 0 && page > 1) {
            return 0;
        }
        if (i11 != 1 || page >= 1) {
            return page;
        }
        return 2;
    }

    public int getBehindWidth() {
        return this.f38845c.getWidth();
    }

    public View getContent() {
        return this.f38845c;
    }

    public int getMarginThreshold() {
        return this.f38847e;
    }

    public int getMode() {
        return this.f38851i;
    }

    public float getScrollScale() {
        return this.f38854l;
    }

    public View getSecondaryContent() {
        return this.f38846d;
    }

    public boolean h(View content, int x11) {
        int left = content.getLeft();
        int right = content.getRight();
        int i11 = this.f38851i;
        return i11 == 0 ? x11 >= left && x11 <= this.f38847e + left : i11 == 1 ? x11 <= right && x11 >= right - this.f38847e : i11 == 2 && ((x11 >= left && x11 <= this.f38847e + left) || (x11 <= right && x11 >= right - this.f38847e));
    }

    public boolean i(float dx2) {
        int i11 = this.f38851i;
        return i11 == 0 ? dx2 > 0.0f : i11 == 1 ? dx2 < 0.0f : i11 == 2;
    }

    public boolean j(float dx2) {
        int i11 = this.f38851i;
        return i11 == 0 ? dx2 < 0.0f : i11 == 1 ? dx2 > 0.0f : i11 == 2;
    }

    public boolean k(View content, int currPage, float x11) {
        int i11 = this.f38843a;
        return i11 != 0 ? i11 == 1 : l(content, currPage, x11);
    }

    public boolean l(View content, int currPage, float x11) {
        int i11 = this.f38851i;
        return (i11 == 0 || (i11 == 2 && currPage == 0)) ? x11 >= ((float) content.getLeft()) : (i11 == 1 || (i11 == 2 && currPage == 2)) && x11 <= ((float) content.getRight());
    }

    public void m(View content, int x11, int y11) {
        int i11 = this.f38851i;
        if (i11 == 0) {
            r2 = x11 >= content.getLeft() ? 4 : 0;
            scrollTo((int) ((x11 + getBehindWidth()) * this.f38854l), y11);
        } else if (i11 == 1) {
            r2 = x11 <= content.getLeft() ? 4 : 0;
            scrollTo((int) ((getBehindWidth() - getWidth()) + ((x11 - getBehindWidth()) * this.f38854l)), y11);
        } else if (i11 == 2) {
            this.f38845c.setVisibility(x11 >= content.getLeft() ? 4 : 0);
            this.f38846d.setVisibility(x11 <= content.getLeft() ? 4 : 0);
            r2 = x11 == 0 ? 4 : 0;
            if (x11 <= content.getLeft()) {
                scrollTo((int) ((x11 + getBehindWidth()) * this.f38854l), y11);
            } else {
                scrollTo((int) ((getBehindWidth() - getWidth()) + ((x11 - getBehindWidth()) * this.f38854l)), y11);
            }
        }
        if (r2 == 4) {
            Log.v(f38841t, "behind INVISIBLE");
        }
        setVisibility(r2);
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent e11) {
        return !this.f38850h;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean changed, int l11, int t11, int r11, int b11) {
        int i11 = r11 - l11;
        int i12 = b11 - t11;
        this.f38845c.layout(0, 0, i11 - this.f38848f, i12);
        View view = this.f38846d;
        if (view != null) {
            view.layout(0, 0, i11 - this.f38848f, i12);
        }
    }

    @Override // android.view.View
    public void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        int defaultSize = View.getDefaultSize(0, widthMeasureSpec);
        int defaultSize2 = View.getDefaultSize(0, heightMeasureSpec);
        setMeasuredDimension(defaultSize, defaultSize2);
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(widthMeasureSpec, 0, defaultSize - this.f38848f);
        int childMeasureSpec2 = ViewGroup.getChildMeasureSpec(heightMeasureSpec, 0, defaultSize2);
        this.f38845c.measure(childMeasureSpec, childMeasureSpec2);
        View view = this.f38846d;
        if (view != null) {
            view.measure(childMeasureSpec, childMeasureSpec2);
        }
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent e11) {
        return !this.f38850h;
    }

    @Override // android.view.View
    public void scrollTo(int x11, int y11) {
        super.scrollTo(x11, y11);
        if (this.f38849g != null) {
            invalidate();
        }
    }

    public void setCanvasTransformer(SlidingMenu.c t11) {
        this.f38849g = t11;
    }

    public void setChildrenEnabled(boolean enabled) {
        this.f38850h = enabled;
    }

    public void setContent(View v11) {
        View view = this.f38845c;
        if (view != null) {
            removeView(view);
        }
        this.f38845c = v11;
        addView(v11);
    }

    public void setCustomViewAbove(CustomViewAbove customViewAbove) {
        this.f38844b = customViewAbove;
    }

    public void setFadeDegree(float degree) {
        if (degree > 1.0f || degree < 0.0f) {
            throw new IllegalStateException("The BehindFadeDegree must be between 0.0f and 1.0f");
        }
        this.f38858p = degree;
    }

    public void setFadeEnabled(boolean b11) {
        this.f38852j = b11;
    }

    public void setMarginThreshold(int marginThreshold) {
        this.f38847e = marginThreshold;
    }

    public void setMode(int mode) {
        if (mode == 0 || mode == 1) {
            View view = this.f38845c;
            if (view != null) {
                view.setVisibility(0);
            }
            View view2 = this.f38846d;
            if (view2 != null) {
                view2.setVisibility(4);
            }
        }
        this.f38851i = mode;
    }

    public void setScrollScale(float scrollScale) {
        this.f38854l = scrollScale;
    }

    public void setSecondaryContent(View v11) {
        View view = this.f38846d;
        if (view != null) {
            removeView(view);
        }
        this.f38846d = v11;
        addView(v11);
    }

    public void setSecondaryShadowDrawable(Drawable shadow) {
        this.f38856n = shadow;
        invalidate();
    }

    public void setSelectedView(View v11) {
        View view = this.f38861s;
        if (view != null) {
            view.setTag(R.id.selected_view, null);
            this.f38861s = null;
        }
        if (v11 == null || v11.getParent() == null) {
            return;
        }
        this.f38861s = v11;
        v11.setTag(R.id.selected_view, "CustomViewBehindSelectedView");
        invalidate();
    }

    public void setSelectorBitmap(Bitmap b11) {
        this.f38860r = b11;
        refreshDrawableState();
    }

    public void setSelectorEnabled(boolean b11) {
        this.f38859q = b11;
    }

    public void setShadowDrawable(Drawable shadow) {
        this.f38855m = shadow;
        invalidate();
    }

    public void setShadowWidth(int width) {
        this.f38857o = width;
        invalidate();
    }

    public void setTouchMode(int i11) {
        this.f38843a = i11;
    }

    public void setWidthOffset(int i11) {
        this.f38848f = i11;
        requestLayout();
    }

    public CustomViewBehind(Context context, AttributeSet attrs) {
        super(context, attrs);
        this.f38843a = 0;
        this.f38853k = new Paint();
        this.f38859q = true;
        this.f38847e = (int) TypedValue.applyDimension(1, 48.0f, getResources().getDisplayMetrics());
    }
}
