package com.viewpagerindicator;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import androidx.core.view.MotionEventCompat;
import androidx.core.view.ViewConfigurationCompat;
import androidx.viewpager.widget.ViewPager;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes6.dex */
public class CirclePageIndicator extends View implements c {

    /* renamed from: s, reason: collision with root package name */
    public static final int f44726s = -1;

    /* renamed from: a, reason: collision with root package name */
    public float f44727a;

    /* renamed from: b, reason: collision with root package name */
    public float f44728b;

    /* renamed from: c, reason: collision with root package name */
    public final Paint f44729c;

    /* renamed from: d, reason: collision with root package name */
    public final Paint f44730d;

    /* renamed from: e, reason: collision with root package name */
    public final Paint f44731e;

    /* renamed from: f, reason: collision with root package name */
    public ViewPager f44732f;

    /* renamed from: g, reason: collision with root package name */
    public ViewPager.OnPageChangeListener f44733g;

    /* renamed from: h, reason: collision with root package name */
    public int f44734h;

    /* renamed from: i, reason: collision with root package name */
    public int f44735i;

    /* renamed from: j, reason: collision with root package name */
    public float f44736j;

    /* renamed from: k, reason: collision with root package name */
    public int f44737k;

    /* renamed from: l, reason: collision with root package name */
    public int f44738l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f44739m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f44740n;

    /* renamed from: o, reason: collision with root package name */
    public int f44741o;

    /* renamed from: p, reason: collision with root package name */
    public float f44742p;

    /* renamed from: q, reason: collision with root package name */
    public int f44743q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f44744r;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class SavedState extends View.BaseSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new a();

        /* renamed from: a, reason: collision with root package name */
        public int f44745a;

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public class a implements Parcelable.Creator<SavedState> {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public SavedState createFromParcel(Parcel in2) {
                return new SavedState(in2);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public SavedState[] newArray(int size) {
                return new SavedState[size];
            }
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel dest, int flags) {
            super.writeToParcel(dest, flags);
            dest.writeInt(this.f44745a);
        }

        public SavedState(Parcelable superState) {
            super(superState);
        }

        public SavedState(Parcel in2) {
            super(in2);
            this.f44745a = in2.readInt();
        }
    }

    public CirclePageIndicator(Context context) {
        this(context, null);
    }

    @Override // com.viewpagerindicator.c
    public void a() {
        invalidate();
    }

    public boolean b() {
        return this.f44739m;
    }

    public boolean c() {
        return this.f44740n;
    }

    public final int d(int measureSpec) {
        ViewPager viewPager;
        int mode = View.MeasureSpec.getMode(measureSpec);
        int size = View.MeasureSpec.getSize(measureSpec);
        if (mode == 1073741824 || (viewPager = this.f44732f) == null) {
            return size;
        }
        int count = viewPager.getAdapter().getCount();
        float paddingLeft = getPaddingLeft() + getPaddingRight();
        float f11 = this.f44727a;
        int i11 = (int) (paddingLeft + (count * 2 * f11) + ((count - 1) * f11) + 1.0f);
        return mode == Integer.MIN_VALUE ? Math.min(i11, size) : i11;
    }

    public final int e(int measureSpec) {
        int mode = View.MeasureSpec.getMode(measureSpec);
        int size = View.MeasureSpec.getSize(measureSpec);
        if (mode == 1073741824) {
            return size;
        }
        int paddingTop = (int) ((this.f44727a * 2.0f) + getPaddingTop() + getPaddingBottom() + 1.0f);
        return mode == Integer.MIN_VALUE ? Math.min(paddingTop, size) : paddingTop;
    }

    @Override // com.viewpagerindicator.c
    public void e0(ViewPager view, int initialPosition) {
        setViewPager(view);
        setCurrentItem(initialPosition);
    }

    public int getFillColor() {
        return this.f44731e.getColor();
    }

    public int getOrientation() {
        return this.f44738l;
    }

    public int getPageColor() {
        return this.f44729c.getColor();
    }

    public float getRadius() {
        return this.f44727a;
    }

    public int getStrokeColor() {
        return this.f44730d.getColor();
    }

    public float getStrokeWidth() {
        return this.f44730d.getStrokeWidth();
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        int count;
        int height;
        int paddingTop;
        int paddingBottom;
        int paddingLeft;
        float f11;
        float f12;
        super.onDraw(canvas);
        ViewPager viewPager = this.f44732f;
        if (viewPager == null || (count = viewPager.getAdapter().getCount()) == 0) {
            return;
        }
        if (this.f44734h >= count) {
            setCurrentItem(count - 1);
            return;
        }
        if (this.f44738l == 0) {
            height = getWidth();
            paddingTop = getPaddingLeft();
            paddingBottom = getPaddingRight();
            paddingLeft = getPaddingTop();
        } else {
            height = getHeight();
            paddingTop = getPaddingTop();
            paddingBottom = getPaddingBottom();
            paddingLeft = getPaddingLeft();
        }
        float f13 = this.f44727a;
        float f14 = (f13 * 2.0f) + this.f44728b;
        float f15 = paddingLeft + f13;
        float f16 = paddingTop + f13;
        if (this.f44739m) {
            f16 += (((height - paddingTop) - paddingBottom) / 2.0f) - ((count * f14) / 2.0f);
        }
        if (this.f44730d.getStrokeWidth() > 0.0f) {
            f13 -= this.f44730d.getStrokeWidth() / 2.0f;
        }
        for (int i11 = 0; i11 < count; i11++) {
            float f17 = (i11 * f14) + f16;
            if (this.f44738l == 0) {
                f12 = f15;
            } else {
                f12 = f17;
                f17 = f15;
            }
            if (this.f44729c.getAlpha() > 0) {
                canvas.drawCircle(f17, f12, f13, this.f44729c);
            }
            float f18 = this.f44727a;
            if (f13 != f18) {
                canvas.drawCircle(f17, f12, f18, this.f44730d);
            }
        }
        boolean z11 = this.f44740n;
        float f19 = (z11 ? this.f44735i : this.f44734h) * f14;
        if (!z11) {
            f19 += this.f44736j * f14;
        }
        if (this.f44738l == 0) {
            float f21 = f16 + f19;
            f11 = f15;
            f15 = f21;
        } else {
            f11 = f16 + f19;
        }
        canvas.drawCircle(f15, f11, this.f44727a, this.f44731e);
    }

    @Override // android.view.View
    public void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        if (this.f44738l == 0) {
            setMeasuredDimension(d(widthMeasureSpec), e(heightMeasureSpec));
        } else {
            setMeasuredDimension(e(widthMeasureSpec), d(heightMeasureSpec));
        }
    }

    @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
    public void onPageScrollStateChanged(int state) {
        this.f44737k = state;
        ViewPager.OnPageChangeListener onPageChangeListener = this.f44733g;
        if (onPageChangeListener != null) {
            onPageChangeListener.onPageScrollStateChanged(state);
        }
    }

    @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
    public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {
        this.f44734h = position;
        this.f44736j = positionOffset;
        invalidate();
        ViewPager.OnPageChangeListener onPageChangeListener = this.f44733g;
        if (onPageChangeListener != null) {
            onPageChangeListener.onPageScrolled(position, positionOffset, positionOffsetPixels);
        }
    }

    @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
    public void onPageSelected(int position) {
        if (this.f44740n || this.f44737k == 0) {
            this.f44734h = position;
            this.f44735i = position;
            invalidate();
        }
        ViewPager.OnPageChangeListener onPageChangeListener = this.f44733g;
        if (onPageChangeListener != null) {
            onPageChangeListener.onPageSelected(position);
        }
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable state) {
        SavedState savedState = (SavedState) state;
        super.onRestoreInstanceState(savedState.getSuperState());
        int i11 = savedState.f44745a;
        this.f44734h = i11;
        this.f44735i = i11;
        requestLayout();
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.f44745a = this.f44734h;
        return savedState;
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent ev2) {
        if (super.onTouchEvent(ev2)) {
            return true;
        }
        ViewPager viewPager = this.f44732f;
        if (viewPager == null || viewPager.getAdapter().getCount() == 0) {
            return false;
        }
        int action = ev2.getAction() & 255;
        if (action != 0) {
            if (action != 1) {
                if (action == 2) {
                    float x11 = MotionEventCompat.getX(ev2, MotionEventCompat.findPointerIndex(ev2, this.f44743q));
                    float f11 = x11 - this.f44742p;
                    if (!this.f44744r && Math.abs(f11) > this.f44741o) {
                        this.f44744r = true;
                    }
                    if (this.f44744r) {
                        this.f44742p = x11;
                        if (this.f44732f.isFakeDragging() || this.f44732f.beginFakeDrag()) {
                            this.f44732f.fakeDragBy(f11);
                        }
                    }
                } else if (action != 3) {
                    if (action == 5) {
                        int actionIndex = MotionEventCompat.getActionIndex(ev2);
                        this.f44742p = MotionEventCompat.getX(ev2, actionIndex);
                        this.f44743q = MotionEventCompat.getPointerId(ev2, actionIndex);
                    } else if (action == 6) {
                        int actionIndex2 = MotionEventCompat.getActionIndex(ev2);
                        if (MotionEventCompat.getPointerId(ev2, actionIndex2) == this.f44743q) {
                            this.f44743q = MotionEventCompat.getPointerId(ev2, actionIndex2 == 0 ? 1 : 0);
                        }
                        this.f44742p = MotionEventCompat.getX(ev2, MotionEventCompat.findPointerIndex(ev2, this.f44743q));
                    }
                }
            }
            if (!this.f44744r) {
                int count = this.f44732f.getAdapter().getCount();
                float width = getWidth();
                float f12 = width / 2.0f;
                float f13 = width / 6.0f;
                if (this.f44734h > 0 && ev2.getX() < f12 - f13) {
                    if (action != 3) {
                        this.f44732f.setCurrentItem(this.f44734h - 1);
                    }
                    return true;
                }
                if (this.f44734h < count - 1 && ev2.getX() > f12 + f13) {
                    if (action != 3) {
                        this.f44732f.setCurrentItem(this.f44734h + 1);
                    }
                    return true;
                }
            }
            this.f44744r = false;
            this.f44743q = -1;
            if (this.f44732f.isFakeDragging()) {
                this.f44732f.endFakeDrag();
            }
        } else {
            this.f44743q = MotionEventCompat.getPointerId(ev2, 0);
            this.f44742p = ev2.getX();
        }
        return true;
    }

    public void setCentered(boolean centered) {
        this.f44739m = centered;
        invalidate();
    }

    @Override // com.viewpagerindicator.c
    public void setCurrentItem(int item) {
        ViewPager viewPager = this.f44732f;
        if (viewPager == null) {
            throw new IllegalStateException("ViewPager has not been bound.");
        }
        viewPager.setCurrentItem(item);
        this.f44734h = item;
        invalidate();
    }

    public void setFillColor(int fillColor) {
        this.f44731e.setColor(fillColor);
        invalidate();
    }

    @Override // com.viewpagerindicator.c
    public void setOnPageChangeListener(ViewPager.OnPageChangeListener listener) {
        this.f44733g = listener;
    }

    public void setOrientation(int orientation) {
        if (orientation != 0 && orientation != 1) {
            throw new IllegalArgumentException("Orientation must be either HORIZONTAL or VERTICAL.");
        }
        this.f44738l = orientation;
        requestLayout();
    }

    public void setPageColor(int pageColor) {
        this.f44729c.setColor(pageColor);
        invalidate();
    }

    public void setRadius(float radius) {
        this.f44727a = radius;
        invalidate();
    }

    public void setSnap(boolean snap) {
        this.f44740n = snap;
        invalidate();
    }

    public void setStrokeColor(int strokeColor) {
        this.f44730d.setColor(strokeColor);
        invalidate();
    }

    public void setStrokeWidth(float strokeWidth) {
        this.f44730d.setStrokeWidth(strokeWidth);
        invalidate();
    }

    @Override // com.viewpagerindicator.c
    public void setViewPager(ViewPager view) {
        ViewPager viewPager = this.f44732f;
        if (viewPager == view) {
            return;
        }
        if (viewPager != null) {
            viewPager.setOnPageChangeListener(null);
        }
        if (view.getAdapter() == null) {
            throw new IllegalStateException("ViewPager does not have adapter instance.");
        }
        this.f44732f = view;
        view.setOnPageChangeListener(this);
        invalidate();
    }

    public CirclePageIndicator(Context context, AttributeSet attrs) {
        this(context, attrs, R.attr.vpiCirclePageIndicatorStyle);
    }

    public CirclePageIndicator(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
        Paint paint = new Paint(1);
        this.f44729c = paint;
        Paint paint2 = new Paint(1);
        this.f44730d = paint2;
        Paint paint3 = new Paint(1);
        this.f44731e = paint3;
        this.f44742p = -1.0f;
        this.f44743q = -1;
        if (isInEditMode()) {
            return;
        }
        Resources resources = getResources();
        int color = resources.getColor(R.color.default_circle_indicator_page_color);
        int color2 = resources.getColor(R.color.default_circle_indicator_fill_color);
        int integer = resources.getInteger(R.integer.default_circle_indicator_orientation);
        int color3 = resources.getColor(R.color.default_circle_indicator_stroke_color);
        float dimension = resources.getDimension(R.dimen.default_circle_indicator_stroke_width);
        float dimension2 = resources.getDimension(R.dimen.default_circle_indicator_radius);
        boolean z11 = resources.getBoolean(R.bool.default_circle_indicator_centered);
        boolean z12 = resources.getBoolean(R.bool.default_circle_indicator_snap);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attrs, R.styleable.CirclePageIndicator, defStyle, 0);
        this.f44739m = obtainStyledAttributes.getBoolean(R.styleable.CirclePageIndicator_vpiCentered, z11);
        this.f44738l = obtainStyledAttributes.getInt(R.styleable.CirclePageIndicator_android_orientation, integer);
        Paint.Style style = Paint.Style.FILL;
        paint.setStyle(style);
        paint.setColor(obtainStyledAttributes.getColor(R.styleable.CirclePageIndicator_vpiPageColor, color));
        paint2.setStyle(Paint.Style.STROKE);
        paint2.setColor(obtainStyledAttributes.getColor(R.styleable.CirclePageIndicator_vpiStrokeColor, color3));
        paint2.setStrokeWidth(obtainStyledAttributes.getDimension(R.styleable.CirclePageIndicator_vpiStrokeWidth, dimension));
        paint3.setStyle(style);
        paint3.setColor(obtainStyledAttributes.getColor(R.styleable.CirclePageIndicator_vpiFillColor, color2));
        float dimension3 = obtainStyledAttributes.getDimension(R.styleable.CirclePageIndicator_vpiRadius, dimension2);
        this.f44727a = dimension3;
        this.f44728b = obtainStyledAttributes.getDimension(R.styleable.CirclePageIndicator_vpiCircleSpacing, dimension3);
        this.f44740n = obtainStyledAttributes.getBoolean(R.styleable.CirclePageIndicator_vpiSnap, z12);
        Drawable drawable = obtainStyledAttributes.getDrawable(R.styleable.CirclePageIndicator_android_background);
        if (drawable != null) {
            setBackgroundDrawable(drawable);
        }
        obtainStyledAttributes.recycle();
        this.f44741o = ViewConfigurationCompat.getScaledPagingTouchSlop(ViewConfiguration.get(context));
    }
}
