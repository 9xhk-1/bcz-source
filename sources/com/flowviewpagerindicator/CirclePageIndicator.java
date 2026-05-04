package com.flowviewpagerindicator;

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
import com.flowviewpagerindicator.FlowableViewPager;
import com.viewpagerindicator.R;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes6.dex */
public class CirclePageIndicator extends View implements com.flowviewpagerindicator.a {

    /* renamed from: s, reason: collision with root package name */
    public static final int f29591s = -1;

    /* renamed from: a, reason: collision with root package name */
    public float f29592a;

    /* renamed from: b, reason: collision with root package name */
    public float f29593b;

    /* renamed from: c, reason: collision with root package name */
    public final Paint f29594c;

    /* renamed from: d, reason: collision with root package name */
    public final Paint f29595d;

    /* renamed from: e, reason: collision with root package name */
    public final Paint f29596e;

    /* renamed from: f, reason: collision with root package name */
    public FlowableViewPager f29597f;

    /* renamed from: g, reason: collision with root package name */
    public FlowableViewPager.i f29598g;

    /* renamed from: h, reason: collision with root package name */
    public int f29599h;

    /* renamed from: i, reason: collision with root package name */
    public int f29600i;

    /* renamed from: j, reason: collision with root package name */
    public float f29601j;

    /* renamed from: k, reason: collision with root package name */
    public int f29602k;

    /* renamed from: l, reason: collision with root package name */
    public int f29603l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f29604m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f29605n;

    /* renamed from: o, reason: collision with root package name */
    public int f29606o;

    /* renamed from: p, reason: collision with root package name */
    public float f29607p;

    /* renamed from: q, reason: collision with root package name */
    public int f29608q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f29609r;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class SavedState extends View.BaseSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new a();

        /* renamed from: a, reason: collision with root package name */
        public int f29610a;

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
            dest.writeInt(this.f29610a);
        }

        public SavedState(Parcelable superState) {
            super(superState);
        }

        public SavedState(Parcel in2) {
            super(in2);
            this.f29610a = in2.readInt();
        }
    }

    public CirclePageIndicator(Context context) {
        this(context, null);
    }

    @Override // com.flowviewpagerindicator.a
    public void a() {
        invalidate();
    }

    @Override // com.flowviewpagerindicator.a
    public void b(FlowableViewPager view, int initialPosition) {
        setViewPager(view);
        setCurrentItem(initialPosition);
    }

    public boolean c() {
        return this.f29604m;
    }

    public boolean d() {
        return this.f29605n;
    }

    public final int e(int measureSpec) {
        FlowableViewPager flowableViewPager;
        int mode = View.MeasureSpec.getMode(measureSpec);
        int size = View.MeasureSpec.getSize(measureSpec);
        if (mode == 1073741824 || (flowableViewPager = this.f29597f) == null) {
            return size;
        }
        int count = flowableViewPager.getAdapter().getCount();
        float paddingLeft = getPaddingLeft() + getPaddingRight();
        float f11 = this.f29592a;
        int i11 = (int) (paddingLeft + (count * 2 * f11) + ((count - 1) * f11) + 1.0f);
        return mode == Integer.MIN_VALUE ? Math.min(i11, size) : i11;
    }

    public final int f(int measureSpec) {
        int mode = View.MeasureSpec.getMode(measureSpec);
        int size = View.MeasureSpec.getSize(measureSpec);
        if (mode == 1073741824) {
            return size;
        }
        int paddingTop = (int) ((this.f29592a * 2.0f) + getPaddingTop() + getPaddingBottom() + 1.0f);
        return mode == Integer.MIN_VALUE ? Math.min(paddingTop, size) : paddingTop;
    }

    public int getFillColor() {
        return this.f29596e.getColor();
    }

    public int getOrientation() {
        return this.f29603l;
    }

    public int getPageColor() {
        return this.f29594c.getColor();
    }

    public float getRadius() {
        return this.f29592a;
    }

    public int getStrokeColor() {
        return this.f29595d.getColor();
    }

    public float getStrokeWidth() {
        return this.f29595d.getStrokeWidth();
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
        FlowableViewPager flowableViewPager = this.f29597f;
        if (flowableViewPager == null || (count = flowableViewPager.getAdapter().getCount()) == 0) {
            return;
        }
        if (this.f29599h >= count) {
            setCurrentItem(count - 1);
            return;
        }
        if (this.f29603l == 0) {
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
        float f13 = this.f29592a;
        float f14 = (f13 * 2.0f) + this.f29593b;
        float f15 = paddingLeft + f13;
        float f16 = paddingTop + f13;
        if (this.f29604m) {
            f16 += (((height - paddingTop) - paddingBottom) / 2.0f) - ((count * f14) / 2.0f);
        }
        if (this.f29595d.getStrokeWidth() > 0.0f) {
            f13 -= this.f29595d.getStrokeWidth() / 2.0f;
        }
        for (int i11 = 0; i11 < count; i11++) {
            float f17 = (i11 * f14) + f16;
            if (this.f29603l == 0) {
                f12 = f15;
            } else {
                f12 = f17;
                f17 = f15;
            }
            if (this.f29594c.getAlpha() > 0) {
                canvas.drawCircle(f17, f12, f13, this.f29594c);
            }
            float f18 = this.f29592a;
            if (f13 != f18) {
                canvas.drawCircle(f17, f12, f18, this.f29595d);
            }
        }
        boolean z11 = this.f29605n;
        float f19 = (z11 ? this.f29600i : this.f29599h) * f14;
        if (!z11) {
            f19 += this.f29601j * f14;
        }
        if (this.f29603l == 0) {
            float f21 = f16 + f19;
            f11 = f15;
            f15 = f21;
        } else {
            f11 = f16 + f19;
        }
        canvas.drawCircle(f15, f11, this.f29592a, this.f29596e);
    }

    @Override // android.view.View
    public void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        if (this.f29603l == 0) {
            setMeasuredDimension(e(widthMeasureSpec), f(heightMeasureSpec));
        } else {
            setMeasuredDimension(f(widthMeasureSpec), e(heightMeasureSpec));
        }
    }

    @Override // com.flowviewpagerindicator.FlowableViewPager.i
    public void onPageScrollStateChanged(int state) {
        this.f29602k = state;
        FlowableViewPager.i iVar = this.f29598g;
        if (iVar != null) {
            iVar.onPageScrollStateChanged(state);
        }
    }

    @Override // com.flowviewpagerindicator.FlowableViewPager.i
    public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {
        this.f29599h = position;
        this.f29601j = positionOffset;
        invalidate();
        FlowableViewPager.i iVar = this.f29598g;
        if (iVar != null) {
            iVar.onPageScrolled(position, positionOffset, positionOffsetPixels);
        }
    }

    @Override // com.flowviewpagerindicator.FlowableViewPager.i
    public void onPageSelected(int position) {
        if (this.f29605n || this.f29602k == 0) {
            this.f29599h = position;
            this.f29600i = position;
            invalidate();
        }
        FlowableViewPager.i iVar = this.f29598g;
        if (iVar != null) {
            iVar.onPageSelected(position);
        }
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable state) {
        SavedState savedState = (SavedState) state;
        super.onRestoreInstanceState(savedState.getSuperState());
        int i11 = savedState.f29610a;
        this.f29599h = i11;
        this.f29600i = i11;
        requestLayout();
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.f29610a = this.f29599h;
        return savedState;
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent ev2) {
        if (super.onTouchEvent(ev2)) {
            return true;
        }
        FlowableViewPager flowableViewPager = this.f29597f;
        if (flowableViewPager == null || flowableViewPager.getAdapter().getCount() == 0) {
            return false;
        }
        int action = ev2.getAction() & 255;
        if (action != 0) {
            if (action != 1) {
                if (action == 2) {
                    float x11 = MotionEventCompat.getX(ev2, MotionEventCompat.findPointerIndex(ev2, this.f29608q));
                    float f11 = x11 - this.f29607p;
                    if (!this.f29609r && Math.abs(f11) > this.f29606o) {
                        this.f29609r = true;
                    }
                    if (this.f29609r) {
                        this.f29607p = x11;
                        if (this.f29597f.y() || this.f29597f.g()) {
                            this.f29597f.r(f11);
                        }
                    }
                } else if (action != 3) {
                    if (action == 5) {
                        int actionIndex = MotionEventCompat.getActionIndex(ev2);
                        this.f29607p = MotionEventCompat.getX(ev2, actionIndex);
                        this.f29608q = MotionEventCompat.getPointerId(ev2, actionIndex);
                    } else if (action == 6) {
                        int actionIndex2 = MotionEventCompat.getActionIndex(ev2);
                        if (MotionEventCompat.getPointerId(ev2, actionIndex2) == this.f29608q) {
                            this.f29608q = MotionEventCompat.getPointerId(ev2, actionIndex2 == 0 ? 1 : 0);
                        }
                        this.f29607p = MotionEventCompat.getX(ev2, MotionEventCompat.findPointerIndex(ev2, this.f29608q));
                    }
                }
            }
            if (!this.f29609r) {
                int count = this.f29597f.getAdapter().getCount();
                float width = getWidth();
                float f12 = width / 2.0f;
                float f13 = width / 6.0f;
                if (this.f29599h > 0 && ev2.getX() < f12 - f13) {
                    if (action != 3) {
                        this.f29597f.setCurrentItem(this.f29599h - 1);
                    }
                    return true;
                }
                if (this.f29599h < count - 1 && ev2.getX() > f12 + f13) {
                    if (action != 3) {
                        this.f29597f.setCurrentItem(this.f29599h + 1);
                    }
                    return true;
                }
            }
            this.f29609r = false;
            this.f29608q = -1;
            if (this.f29597f.y()) {
                this.f29597f.p();
            }
        } else {
            this.f29608q = MotionEventCompat.getPointerId(ev2, 0);
            this.f29607p = ev2.getX();
        }
        return true;
    }

    public void setCentered(boolean centered) {
        this.f29604m = centered;
        invalidate();
    }

    @Override // com.flowviewpagerindicator.a
    public void setCurrentItem(int item) {
        FlowableViewPager flowableViewPager = this.f29597f;
        if (flowableViewPager == null) {
            throw new IllegalStateException("ViewPager has not been bound.");
        }
        flowableViewPager.setCurrentItem(item);
        this.f29599h = item;
        invalidate();
    }

    public void setFillColor(int fillColor) {
        this.f29596e.setColor(fillColor);
        invalidate();
    }

    @Override // com.flowviewpagerindicator.a
    public void setOnPageChangeListener(FlowableViewPager.i listener) {
        this.f29598g = listener;
    }

    public void setOrientation(int orientation) {
        if (orientation != 0 && orientation != 1) {
            throw new IllegalArgumentException("Orientation must be either HORIZONTAL or VERTICAL.");
        }
        this.f29603l = orientation;
        requestLayout();
    }

    public void setPageColor(int pageColor) {
        this.f29594c.setColor(pageColor);
        invalidate();
    }

    public void setRadius(float radius) {
        this.f29592a = radius;
        invalidate();
    }

    public void setSnap(boolean snap) {
        this.f29605n = snap;
        invalidate();
    }

    public void setStrokeColor(int strokeColor) {
        this.f29595d.setColor(strokeColor);
        invalidate();
    }

    public void setStrokeWidth(float strokeWidth) {
        this.f29595d.setStrokeWidth(strokeWidth);
        invalidate();
    }

    @Override // com.flowviewpagerindicator.a
    public void setViewPager(FlowableViewPager view) {
        FlowableViewPager flowableViewPager = this.f29597f;
        if (flowableViewPager == view) {
            return;
        }
        if (flowableViewPager != null) {
            flowableViewPager.setOnPageChangeListener(null);
        }
        if (view.getAdapter() == null) {
            throw new IllegalStateException("ViewPager does not have adapter instance.");
        }
        this.f29597f = view;
        view.setOnPageChangeListener(this);
        invalidate();
    }

    public CirclePageIndicator(Context context, AttributeSet attrs) {
        this(context, attrs, R.attr.vpiCirclePageIndicatorStyle);
    }

    public CirclePageIndicator(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
        Paint paint = new Paint(1);
        this.f29594c = paint;
        Paint paint2 = new Paint(1);
        this.f29595d = paint2;
        Paint paint3 = new Paint(1);
        this.f29596e = paint3;
        this.f29607p = -1.0f;
        this.f29608q = -1;
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
        this.f29604m = obtainStyledAttributes.getBoolean(R.styleable.CirclePageIndicator_vpiCentered, z11);
        this.f29603l = obtainStyledAttributes.getInt(R.styleable.CirclePageIndicator_android_orientation, integer);
        Paint.Style style = Paint.Style.FILL;
        paint.setStyle(style);
        paint.setColor(obtainStyledAttributes.getColor(R.styleable.CirclePageIndicator_vpiPageColor, color));
        paint2.setStyle(Paint.Style.STROKE);
        paint2.setColor(obtainStyledAttributes.getColor(R.styleable.CirclePageIndicator_vpiStrokeColor, color3));
        paint2.setStrokeWidth(obtainStyledAttributes.getDimension(R.styleable.CirclePageIndicator_vpiStrokeWidth, dimension));
        paint3.setStyle(style);
        paint3.setColor(obtainStyledAttributes.getColor(R.styleable.CirclePageIndicator_vpiFillColor, color2));
        float dimension3 = obtainStyledAttributes.getDimension(R.styleable.CirclePageIndicator_vpiRadius, dimension2);
        this.f29592a = dimension3;
        this.f29593b = obtainStyledAttributes.getDimension(R.styleable.CirclePageIndicator_vpiCircleSpacing, dimension3);
        this.f29605n = obtainStyledAttributes.getBoolean(R.styleable.CirclePageIndicator_vpiSnap, z12);
        Drawable drawable = obtainStyledAttributes.getDrawable(R.styleable.CirclePageIndicator_android_background);
        if (drawable != null) {
            setBackgroundDrawable(drawable);
        }
        obtainStyledAttributes.recycle();
        this.f29606o = ViewConfigurationCompat.getScaledPagingTouchSlop(ViewConfiguration.get(context));
    }
}
