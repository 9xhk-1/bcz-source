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
public class LinePageIndicator extends View implements c {

    /* renamed from: m, reason: collision with root package name */
    public static final int f44762m = -1;

    /* renamed from: a, reason: collision with root package name */
    public final Paint f44763a;

    /* renamed from: b, reason: collision with root package name */
    public final Paint f44764b;

    /* renamed from: c, reason: collision with root package name */
    public ViewPager f44765c;

    /* renamed from: d, reason: collision with root package name */
    public ViewPager.OnPageChangeListener f44766d;

    /* renamed from: e, reason: collision with root package name */
    public int f44767e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f44768f;

    /* renamed from: g, reason: collision with root package name */
    public float f44769g;

    /* renamed from: h, reason: collision with root package name */
    public float f44770h;

    /* renamed from: i, reason: collision with root package name */
    public int f44771i;

    /* renamed from: j, reason: collision with root package name */
    public float f44772j;

    /* renamed from: k, reason: collision with root package name */
    public int f44773k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f44774l;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class SavedState extends View.BaseSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new a();

        /* renamed from: a, reason: collision with root package name */
        public int f44775a;

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
            dest.writeInt(this.f44775a);
        }

        public SavedState(Parcelable superState) {
            super(superState);
        }

        public SavedState(Parcel in2) {
            super(in2);
            this.f44775a = in2.readInt();
        }
    }

    public LinePageIndicator(Context context) {
        this(context, null);
    }

    private int c(int measureSpec) {
        float min;
        int mode = View.MeasureSpec.getMode(measureSpec);
        int size = View.MeasureSpec.getSize(measureSpec);
        if (mode == 1073741824) {
            min = size;
        } else {
            float strokeWidth = this.f44764b.getStrokeWidth() + getPaddingTop() + getPaddingBottom();
            min = mode == Integer.MIN_VALUE ? Math.min(strokeWidth, size) : strokeWidth;
        }
        return (int) Math.ceil(min);
    }

    private int d(int measureSpec) {
        float f11;
        ViewPager viewPager;
        int mode = View.MeasureSpec.getMode(measureSpec);
        int size = View.MeasureSpec.getSize(measureSpec);
        if (mode == 1073741824 || (viewPager = this.f44765c) == null) {
            f11 = size;
        } else {
            f11 = getPaddingLeft() + getPaddingRight() + (viewPager.getAdapter().getCount() * this.f44769g) + ((r1 - 1) * this.f44770h);
            if (mode == Integer.MIN_VALUE) {
                f11 = Math.min(f11, size);
            }
        }
        return (int) Math.ceil(f11);
    }

    @Override // com.viewpagerindicator.c
    public void a() {
        invalidate();
    }

    public boolean b() {
        return this.f44768f;
    }

    @Override // com.viewpagerindicator.c
    public void e0(ViewPager view, int initialPosition) {
        setViewPager(view);
        setCurrentItem(initialPosition);
    }

    public float getGapWidth() {
        return this.f44770h;
    }

    public float getLineWidth() {
        return this.f44769g;
    }

    public int getSelectedColor() {
        return this.f44764b.getColor();
    }

    public float getStrokeWidth() {
        return this.f44764b.getStrokeWidth();
    }

    public int getUnselectedColor() {
        return this.f44763a.getColor();
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        int count;
        super.onDraw(canvas);
        ViewPager viewPager = this.f44765c;
        if (viewPager == null || (count = viewPager.getAdapter().getCount()) == 0) {
            return;
        }
        if (this.f44767e >= count) {
            setCurrentItem(count - 1);
            return;
        }
        float f11 = this.f44769g;
        float f12 = this.f44770h;
        float f13 = f11 + f12;
        float f14 = (count * f13) - f12;
        float paddingTop = getPaddingTop();
        float paddingLeft = getPaddingLeft();
        float paddingRight = getPaddingRight();
        float height = paddingTop + (((getHeight() - paddingTop) - getPaddingBottom()) / 2.0f);
        if (this.f44768f) {
            paddingLeft += (((getWidth() - paddingLeft) - paddingRight) / 2.0f) - (f14 / 2.0f);
        }
        int i11 = 0;
        while (i11 < count) {
            float f15 = paddingLeft + (i11 * f13);
            canvas.drawLine(f15, height, f15 + this.f44769g, height, i11 == this.f44767e ? this.f44764b : this.f44763a);
            i11++;
        }
    }

    @Override // android.view.View
    public void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        setMeasuredDimension(d(widthMeasureSpec), c(heightMeasureSpec));
    }

    @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
    public void onPageScrollStateChanged(int state) {
        ViewPager.OnPageChangeListener onPageChangeListener = this.f44766d;
        if (onPageChangeListener != null) {
            onPageChangeListener.onPageScrollStateChanged(state);
        }
    }

    @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
    public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {
        ViewPager.OnPageChangeListener onPageChangeListener = this.f44766d;
        if (onPageChangeListener != null) {
            onPageChangeListener.onPageScrolled(position, positionOffset, positionOffsetPixels);
        }
    }

    @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
    public void onPageSelected(int position) {
        this.f44767e = position;
        invalidate();
        ViewPager.OnPageChangeListener onPageChangeListener = this.f44766d;
        if (onPageChangeListener != null) {
            onPageChangeListener.onPageSelected(position);
        }
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable state) {
        SavedState savedState = (SavedState) state;
        super.onRestoreInstanceState(savedState.getSuperState());
        this.f44767e = savedState.f44775a;
        requestLayout();
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.f44775a = this.f44767e;
        return savedState;
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent ev2) {
        if (super.onTouchEvent(ev2)) {
            return true;
        }
        ViewPager viewPager = this.f44765c;
        if (viewPager == null || viewPager.getAdapter().getCount() == 0) {
            return false;
        }
        int action = ev2.getAction() & 255;
        if (action != 0) {
            if (action != 1) {
                if (action == 2) {
                    float x11 = MotionEventCompat.getX(ev2, MotionEventCompat.findPointerIndex(ev2, this.f44773k));
                    float f11 = x11 - this.f44772j;
                    if (!this.f44774l && Math.abs(f11) > this.f44771i) {
                        this.f44774l = true;
                    }
                    if (this.f44774l) {
                        this.f44772j = x11;
                        if (this.f44765c.isFakeDragging() || this.f44765c.beginFakeDrag()) {
                            this.f44765c.fakeDragBy(f11);
                        }
                    }
                } else if (action != 3) {
                    if (action == 5) {
                        int actionIndex = MotionEventCompat.getActionIndex(ev2);
                        this.f44772j = MotionEventCompat.getX(ev2, actionIndex);
                        this.f44773k = MotionEventCompat.getPointerId(ev2, actionIndex);
                    } else if (action == 6) {
                        int actionIndex2 = MotionEventCompat.getActionIndex(ev2);
                        if (MotionEventCompat.getPointerId(ev2, actionIndex2) == this.f44773k) {
                            this.f44773k = MotionEventCompat.getPointerId(ev2, actionIndex2 == 0 ? 1 : 0);
                        }
                        this.f44772j = MotionEventCompat.getX(ev2, MotionEventCompat.findPointerIndex(ev2, this.f44773k));
                    }
                }
            }
            if (!this.f44774l) {
                int count = this.f44765c.getAdapter().getCount();
                float width = getWidth();
                float f12 = width / 2.0f;
                float f13 = width / 6.0f;
                if (this.f44767e > 0 && ev2.getX() < f12 - f13) {
                    if (action != 3) {
                        this.f44765c.setCurrentItem(this.f44767e - 1);
                    }
                    return true;
                }
                if (this.f44767e < count - 1 && ev2.getX() > f12 + f13) {
                    if (action != 3) {
                        this.f44765c.setCurrentItem(this.f44767e + 1);
                    }
                    return true;
                }
            }
            this.f44774l = false;
            this.f44773k = -1;
            if (this.f44765c.isFakeDragging()) {
                this.f44765c.endFakeDrag();
            }
        } else {
            this.f44773k = MotionEventCompat.getPointerId(ev2, 0);
            this.f44772j = ev2.getX();
        }
        return true;
    }

    public void setCentered(boolean centered) {
        this.f44768f = centered;
        invalidate();
    }

    @Override // com.viewpagerindicator.c
    public void setCurrentItem(int item) {
        ViewPager viewPager = this.f44765c;
        if (viewPager == null) {
            throw new IllegalStateException("ViewPager has not been bound.");
        }
        viewPager.setCurrentItem(item);
        this.f44767e = item;
        invalidate();
    }

    public void setGapWidth(float gapWidth) {
        this.f44770h = gapWidth;
        invalidate();
    }

    public void setLineWidth(float lineWidth) {
        this.f44769g = lineWidth;
        invalidate();
    }

    @Override // com.viewpagerindicator.c
    public void setOnPageChangeListener(ViewPager.OnPageChangeListener listener) {
        this.f44766d = listener;
    }

    public void setSelectedColor(int selectedColor) {
        this.f44764b.setColor(selectedColor);
        invalidate();
    }

    public void setStrokeWidth(float lineHeight) {
        this.f44764b.setStrokeWidth(lineHeight);
        this.f44763a.setStrokeWidth(lineHeight);
        invalidate();
    }

    public void setUnselectedColor(int unselectedColor) {
        this.f44763a.setColor(unselectedColor);
        invalidate();
    }

    @Override // com.viewpagerindicator.c
    public void setViewPager(ViewPager viewPager) {
        ViewPager viewPager2 = this.f44765c;
        if (viewPager2 == viewPager) {
            return;
        }
        if (viewPager2 != null) {
            viewPager2.setOnPageChangeListener(null);
        }
        if (viewPager.getAdapter() == null) {
            throw new IllegalStateException("ViewPager does not have adapter instance.");
        }
        this.f44765c = viewPager;
        viewPager.setOnPageChangeListener(this);
        invalidate();
    }

    public LinePageIndicator(Context context, AttributeSet attrs) {
        this(context, attrs, R.attr.vpiLinePageIndicatorStyle);
    }

    public LinePageIndicator(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
        Paint paint = new Paint(1);
        this.f44763a = paint;
        Paint paint2 = new Paint(1);
        this.f44764b = paint2;
        this.f44772j = -1.0f;
        this.f44773k = -1;
        if (isInEditMode()) {
            return;
        }
        Resources resources = getResources();
        int color = resources.getColor(R.color.default_line_indicator_selected_color);
        int color2 = resources.getColor(R.color.default_line_indicator_unselected_color);
        float dimension = resources.getDimension(R.dimen.default_line_indicator_line_width);
        float dimension2 = resources.getDimension(R.dimen.default_line_indicator_gap_width);
        float dimension3 = resources.getDimension(R.dimen.default_line_indicator_stroke_width);
        boolean z11 = resources.getBoolean(R.bool.default_line_indicator_centered);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attrs, R.styleable.LinePageIndicator, defStyle, 0);
        this.f44768f = obtainStyledAttributes.getBoolean(R.styleable.LinePageIndicator_vpiCentered, z11);
        this.f44769g = obtainStyledAttributes.getDimension(R.styleable.LinePageIndicator_vpiLineWidth, dimension);
        this.f44770h = obtainStyledAttributes.getDimension(R.styleable.LinePageIndicator_vpiGapWidth, dimension2);
        setStrokeWidth(obtainStyledAttributes.getDimension(R.styleable.LinePageIndicator_vpiStrokeWidth, dimension3));
        paint.setColor(obtainStyledAttributes.getColor(R.styleable.LinePageIndicator_vpiUnSelectedColor, color2));
        paint2.setColor(obtainStyledAttributes.getColor(R.styleable.LinePageIndicator_vpiSelectedColor, color));
        Drawable drawable = obtainStyledAttributes.getDrawable(R.styleable.LinePageIndicator_android_background);
        if (drawable != null) {
            setBackgroundDrawable(drawable);
        }
        obtainStyledAttributes.recycle();
        this.f44771i = ViewConfigurationCompat.getScaledPagingTouchSlop(ViewConfiguration.get(context));
    }
}
