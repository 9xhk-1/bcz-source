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
public class UnderlinePageIndicator extends View implements c {

    /* renamed from: p, reason: collision with root package name */
    public static final int f44850p = -1;

    /* renamed from: q, reason: collision with root package name */
    public static final int f44851q = 30;

    /* renamed from: a, reason: collision with root package name */
    public final Paint f44852a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f44853b;

    /* renamed from: c, reason: collision with root package name */
    public int f44854c;

    /* renamed from: d, reason: collision with root package name */
    public int f44855d;

    /* renamed from: e, reason: collision with root package name */
    public int f44856e;

    /* renamed from: f, reason: collision with root package name */
    public ViewPager f44857f;

    /* renamed from: g, reason: collision with root package name */
    public ViewPager.OnPageChangeListener f44858g;

    /* renamed from: h, reason: collision with root package name */
    public int f44859h;

    /* renamed from: i, reason: collision with root package name */
    public int f44860i;

    /* renamed from: j, reason: collision with root package name */
    public float f44861j;

    /* renamed from: k, reason: collision with root package name */
    public int f44862k;

    /* renamed from: l, reason: collision with root package name */
    public float f44863l;

    /* renamed from: m, reason: collision with root package name */
    public int f44864m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f44865n;

    /* renamed from: o, reason: collision with root package name */
    public final Runnable f44866o;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class SavedState extends View.BaseSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new a();

        /* renamed from: a, reason: collision with root package name */
        public int f44867a;

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
            dest.writeInt(this.f44867a);
        }

        public SavedState(Parcelable superState) {
            super(superState);
        }

        public SavedState(Parcel in2) {
            super(in2);
            this.f44867a = in2.readInt();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (UnderlinePageIndicator.this.f44853b) {
                int max = Math.max(UnderlinePageIndicator.this.f44852a.getAlpha() - UnderlinePageIndicator.this.f44856e, 0);
                UnderlinePageIndicator.this.f44852a.setAlpha(max);
                UnderlinePageIndicator.this.invalidate();
                if (max > 0) {
                    UnderlinePageIndicator.this.postDelayed(this, 30L);
                }
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (UnderlinePageIndicator.this.f44853b) {
                UnderlinePageIndicator underlinePageIndicator = UnderlinePageIndicator.this;
                underlinePageIndicator.post(underlinePageIndicator.f44866o);
            }
        }
    }

    public UnderlinePageIndicator(Context context) {
        this(context, null);
    }

    @Override // com.viewpagerindicator.c
    public void a() {
        invalidate();
    }

    @Override // com.viewpagerindicator.c
    public void e0(ViewPager view, int initialPosition) {
        setViewPager(view);
        setCurrentItem(initialPosition);
    }

    public int getFadeDelay() {
        return this.f44854c;
    }

    public int getFadeLength() {
        return this.f44855d;
    }

    public boolean getFades() {
        return this.f44853b;
    }

    public int getSelectedColor() {
        return this.f44852a.getColor();
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        int count;
        super.onDraw(canvas);
        ViewPager viewPager = this.f44857f;
        if (viewPager == null || (count = viewPager.getAdapter().getCount()) == 0) {
            return;
        }
        if (this.f44860i >= count) {
            setCurrentItem(count - 1);
            return;
        }
        float width = ((getWidth() - r1) - getPaddingRight()) / (count * 1.0f);
        float paddingLeft = getPaddingLeft() + ((this.f44860i + this.f44861j) * width);
        canvas.drawRect(paddingLeft, getPaddingTop(), paddingLeft + width, getHeight() - getPaddingBottom(), this.f44852a);
    }

    @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
    public void onPageScrollStateChanged(int state) {
        this.f44859h = state;
        ViewPager.OnPageChangeListener onPageChangeListener = this.f44858g;
        if (onPageChangeListener != null) {
            onPageChangeListener.onPageScrollStateChanged(state);
        }
    }

    @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
    public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {
        this.f44860i = position;
        this.f44861j = positionOffset;
        if (this.f44853b) {
            if (positionOffsetPixels > 0) {
                removeCallbacks(this.f44866o);
                this.f44852a.setAlpha(255);
            } else if (this.f44859h != 1) {
                postDelayed(this.f44866o, this.f44854c);
            }
        }
        invalidate();
        ViewPager.OnPageChangeListener onPageChangeListener = this.f44858g;
        if (onPageChangeListener != null) {
            onPageChangeListener.onPageScrolled(position, positionOffset, positionOffsetPixels);
        }
    }

    @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
    public void onPageSelected(int position) {
        if (this.f44859h == 0) {
            this.f44860i = position;
            this.f44861j = 0.0f;
            invalidate();
            this.f44866o.run();
        }
        ViewPager.OnPageChangeListener onPageChangeListener = this.f44858g;
        if (onPageChangeListener != null) {
            onPageChangeListener.onPageSelected(position);
        }
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable state) {
        SavedState savedState = (SavedState) state;
        super.onRestoreInstanceState(savedState.getSuperState());
        this.f44860i = savedState.f44867a;
        requestLayout();
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.f44867a = this.f44860i;
        return savedState;
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent ev2) {
        if (super.onTouchEvent(ev2)) {
            return true;
        }
        ViewPager viewPager = this.f44857f;
        if (viewPager == null || viewPager.getAdapter().getCount() == 0) {
            return false;
        }
        int action = ev2.getAction() & 255;
        if (action != 0) {
            if (action != 1) {
                if (action == 2) {
                    float x11 = MotionEventCompat.getX(ev2, MotionEventCompat.findPointerIndex(ev2, this.f44864m));
                    float f11 = x11 - this.f44863l;
                    if (!this.f44865n && Math.abs(f11) > this.f44862k) {
                        this.f44865n = true;
                    }
                    if (this.f44865n) {
                        this.f44863l = x11;
                        if (this.f44857f.isFakeDragging() || this.f44857f.beginFakeDrag()) {
                            this.f44857f.fakeDragBy(f11);
                        }
                    }
                } else if (action != 3) {
                    if (action == 5) {
                        int actionIndex = MotionEventCompat.getActionIndex(ev2);
                        this.f44863l = MotionEventCompat.getX(ev2, actionIndex);
                        this.f44864m = MotionEventCompat.getPointerId(ev2, actionIndex);
                    } else if (action == 6) {
                        int actionIndex2 = MotionEventCompat.getActionIndex(ev2);
                        if (MotionEventCompat.getPointerId(ev2, actionIndex2) == this.f44864m) {
                            this.f44864m = MotionEventCompat.getPointerId(ev2, actionIndex2 == 0 ? 1 : 0);
                        }
                        this.f44863l = MotionEventCompat.getX(ev2, MotionEventCompat.findPointerIndex(ev2, this.f44864m));
                    }
                }
            }
            if (!this.f44865n) {
                int count = this.f44857f.getAdapter().getCount();
                float width = getWidth();
                float f12 = width / 2.0f;
                float f13 = width / 6.0f;
                if (this.f44860i > 0 && ev2.getX() < f12 - f13) {
                    if (action != 3) {
                        this.f44857f.setCurrentItem(this.f44860i - 1);
                    }
                    return true;
                }
                if (this.f44860i < count - 1 && ev2.getX() > f12 + f13) {
                    if (action != 3) {
                        this.f44857f.setCurrentItem(this.f44860i + 1);
                    }
                    return true;
                }
            }
            this.f44865n = false;
            this.f44864m = -1;
            if (this.f44857f.isFakeDragging()) {
                this.f44857f.endFakeDrag();
            }
        } else {
            this.f44864m = MotionEventCompat.getPointerId(ev2, 0);
            this.f44863l = ev2.getX();
        }
        return true;
    }

    @Override // com.viewpagerindicator.c
    public void setCurrentItem(int item) {
        ViewPager viewPager = this.f44857f;
        if (viewPager == null) {
            throw new IllegalStateException("ViewPager has not been bound.");
        }
        viewPager.setCurrentItem(item);
        this.f44860i = item;
        invalidate();
    }

    public void setFadeDelay(int fadeDelay) {
        this.f44854c = fadeDelay;
    }

    public void setFadeLength(int fadeLength) {
        this.f44855d = fadeLength;
        this.f44856e = 255 / (fadeLength / 30);
    }

    public void setFades(boolean fades) {
        if (fades != this.f44853b) {
            this.f44853b = fades;
            if (fades) {
                post(this.f44866o);
                return;
            }
            removeCallbacks(this.f44866o);
            this.f44852a.setAlpha(255);
            invalidate();
        }
    }

    @Override // com.viewpagerindicator.c
    public void setOnPageChangeListener(ViewPager.OnPageChangeListener listener) {
        this.f44858g = listener;
    }

    public void setSelectedColor(int selectedColor) {
        this.f44852a.setColor(selectedColor);
        invalidate();
    }

    @Override // com.viewpagerindicator.c
    public void setViewPager(ViewPager viewPager) {
        ViewPager viewPager2 = this.f44857f;
        if (viewPager2 == viewPager) {
            return;
        }
        if (viewPager2 != null) {
            viewPager2.setOnPageChangeListener(null);
        }
        if (viewPager.getAdapter() == null) {
            throw new IllegalStateException("ViewPager does not have adapter instance.");
        }
        this.f44857f = viewPager;
        viewPager.setOnPageChangeListener(this);
        invalidate();
        post(new b());
    }

    public UnderlinePageIndicator(Context context, AttributeSet attrs) {
        this(context, attrs, R.attr.vpiUnderlinePageIndicatorStyle);
    }

    public UnderlinePageIndicator(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
        this.f44852a = new Paint(1);
        this.f44863l = -1.0f;
        this.f44864m = -1;
        this.f44866o = new a();
        if (isInEditMode()) {
            return;
        }
        Resources resources = getResources();
        boolean z11 = resources.getBoolean(R.bool.default_underline_indicator_fades);
        int integer = resources.getInteger(R.integer.default_underline_indicator_fade_delay);
        int integer2 = resources.getInteger(R.integer.default_underline_indicator_fade_length);
        int color = resources.getColor(R.color.default_underline_indicator_selected_color);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attrs, R.styleable.UnderlinePageIndicator, defStyle, 0);
        setFades(obtainStyledAttributes.getBoolean(R.styleable.UnderlinePageIndicator_fades, z11));
        setSelectedColor(obtainStyledAttributes.getColor(R.styleable.UnderlinePageIndicator_vpiSelectedColor, color));
        setFadeDelay(obtainStyledAttributes.getInteger(R.styleable.UnderlinePageIndicator_fadeDelay, integer));
        setFadeLength(obtainStyledAttributes.getInteger(R.styleable.UnderlinePageIndicator_fadeLength, integer2));
        Drawable drawable = obtainStyledAttributes.getDrawable(R.styleable.UnderlinePageIndicator_android_background);
        if (drawable != null) {
            setBackgroundDrawable(drawable);
        }
        obtainStyledAttributes.recycle();
        this.f44862k = ViewConfigurationCompat.getScaledPagingTouchSlop(ViewConfiguration.get(context));
    }
}
