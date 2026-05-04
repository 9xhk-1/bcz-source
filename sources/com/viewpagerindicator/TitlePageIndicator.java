package com.viewpagerindicator;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.Typeface;
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
import java.util.ArrayList;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes6.dex */
public class TitlePageIndicator extends View implements c {
    public static final float B = 0.25f;
    public static final float C = 0.05f;
    public static final String D = "";
    public static final int E = -1;
    public b A;

    /* renamed from: a, reason: collision with root package name */
    public ViewPager f44822a;

    /* renamed from: b, reason: collision with root package name */
    public ViewPager.OnPageChangeListener f44823b;

    /* renamed from: c, reason: collision with root package name */
    public int f44824c;

    /* renamed from: d, reason: collision with root package name */
    public float f44825d;

    /* renamed from: e, reason: collision with root package name */
    public int f44826e;

    /* renamed from: f, reason: collision with root package name */
    public final Paint f44827f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f44828g;

    /* renamed from: h, reason: collision with root package name */
    public int f44829h;

    /* renamed from: i, reason: collision with root package name */
    public int f44830i;

    /* renamed from: j, reason: collision with root package name */
    public Path f44831j;

    /* renamed from: k, reason: collision with root package name */
    public final Rect f44832k;

    /* renamed from: l, reason: collision with root package name */
    public final Paint f44833l;

    /* renamed from: m, reason: collision with root package name */
    public IndicatorStyle f44834m;

    /* renamed from: n, reason: collision with root package name */
    public LinePosition f44835n;

    /* renamed from: o, reason: collision with root package name */
    public final Paint f44836o;

    /* renamed from: p, reason: collision with root package name */
    public float f44837p;

    /* renamed from: q, reason: collision with root package name */
    public float f44838q;

    /* renamed from: r, reason: collision with root package name */
    public float f44839r;

    /* renamed from: s, reason: collision with root package name */
    public float f44840s;

    /* renamed from: t, reason: collision with root package name */
    public float f44841t;

    /* renamed from: u, reason: collision with root package name */
    public float f44842u;

    /* renamed from: v, reason: collision with root package name */
    public float f44843v;

    /* renamed from: w, reason: collision with root package name */
    public int f44844w;

    /* renamed from: x, reason: collision with root package name */
    public float f44845x;

    /* renamed from: y, reason: collision with root package name */
    public int f44846y;

    /* renamed from: z, reason: collision with root package name */
    public boolean f44847z;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public enum IndicatorStyle {
        None(0),
        Triangle(1),
        Underline(2);

        public final int value;

        IndicatorStyle(int value) {
            this.value = value;
        }

        public static IndicatorStyle fromValue(int value) {
            for (IndicatorStyle indicatorStyle : values()) {
                if (indicatorStyle.value == value) {
                    return indicatorStyle;
                }
            }
            return null;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public enum LinePosition {
        Bottom(0),
        Top(1);

        public final int value;

        LinePosition(int value) {
            this.value = value;
        }

        public static LinePosition fromValue(int value) {
            for (LinePosition linePosition : values()) {
                if (linePosition.value == value) {
                    return linePosition;
                }
            }
            return null;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class SavedState extends View.BaseSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new a();

        /* renamed from: a, reason: collision with root package name */
        public int f44848a;

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
            dest.writeInt(this.f44848a);
        }

        public SavedState(Parcelable superState) {
            super(superState);
        }

        public SavedState(Parcel in2) {
            super(in2);
            this.f44848a = in2.readInt();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f44849a;

        static {
            int[] iArr = new int[IndicatorStyle.values().length];
            f44849a = iArr;
            try {
                iArr[IndicatorStyle.Triangle.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f44849a[IndicatorStyle.Underline.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public interface b {
        void a(int position);
    }

    public TitlePageIndicator(Context context) {
        this(context, null);
    }

    @Override // com.viewpagerindicator.c
    public void a() {
        invalidate();
    }

    public final Rect b(int index, Paint paint) {
        Rect rect = new Rect();
        CharSequence f11 = f(index);
        rect.right = (int) paint.measureText(f11, 0, f11.length());
        rect.bottom = (int) (paint.descent() - paint.ascent());
        return rect;
    }

    public final ArrayList<Rect> c(Paint paint) {
        ArrayList<Rect> arrayList = new ArrayList<>();
        int count = this.f44822a.getAdapter().getCount();
        int width = getWidth();
        int i11 = width / 2;
        for (int i12 = 0; i12 < count; i12++) {
            Rect b11 = b(i12, paint);
            int i13 = b11.right - b11.left;
            int i14 = b11.bottom - b11.top;
            int i15 = (int) ((i11 - (i13 / 2.0f)) + (((i12 - this.f44824c) - this.f44825d) * width));
            b11.left = i15;
            b11.right = i15 + i13;
            b11.top = 0;
            b11.bottom = i14;
            arrayList.add(b11);
        }
        return arrayList;
    }

    public final void d(Rect curViewBound, float curViewWidth, int left) {
        float f11 = this.f44842u;
        curViewBound.left = (int) (left + f11);
        curViewBound.right = (int) (f11 + curViewWidth);
    }

    public final void e(Rect curViewBound, float curViewWidth, int right) {
        int i11 = (int) (right - this.f44842u);
        curViewBound.right = i11;
        curViewBound.left = (int) (i11 - curViewWidth);
    }

    @Override // com.viewpagerindicator.c
    public void e0(ViewPager view, int initialPosition) {
        setViewPager(view);
        setCurrentItem(initialPosition);
    }

    public final CharSequence f(int i11) {
        CharSequence pageTitle = this.f44822a.getAdapter().getPageTitle(i11);
        return pageTitle == null ? "" : pageTitle;
    }

    public boolean g() {
        return this.f44828g;
    }

    public float getClipPadding() {
        return this.f44842u;
    }

    public int getFooterColor() {
        return this.f44833l.getColor();
    }

    public float getFooterIndicatorHeight() {
        return this.f44837p;
    }

    public float getFooterIndicatorPadding() {
        return this.f44839r;
    }

    public IndicatorStyle getFooterIndicatorStyle() {
        return this.f44834m;
    }

    public float getFooterLineHeight() {
        return this.f44843v;
    }

    public LinePosition getLinePosition() {
        return this.f44835n;
    }

    public int getSelectedColor() {
        return this.f44830i;
    }

    public int getTextColor() {
        return this.f44829h;
    }

    public float getTextSize() {
        return this.f44827f.getTextSize();
    }

    public float getTitlePadding() {
        return this.f44840s;
    }

    public float getTopPadding() {
        return this.f44841t;
    }

    public Typeface getTypeface() {
        return this.f44827f.getTypeface();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        int count;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        float f11;
        ViewPager viewPager;
        super.onDraw(canvas);
        ViewPager viewPager2 = this.f44822a;
        if (viewPager2 == null || (count = viewPager2.getAdapter().getCount()) == 0) {
            return;
        }
        if (this.f44824c == -1 && (viewPager = this.f44822a) != null) {
            this.f44824c = viewPager.getCurrentItem();
        }
        ArrayList<Rect> c11 = c(this.f44827f);
        int size = c11.size();
        int i18 = 1;
        if (this.f44824c >= size) {
            setCurrentItem(size - 1);
            return;
        }
        int i19 = count - 1;
        float width = getWidth() / 2.0f;
        int left = getLeft();
        float f12 = left + this.f44842u;
        int width2 = getWidth();
        int height = getHeight();
        int i21 = left + width2;
        float f13 = i21 - this.f44842u;
        int i22 = this.f44824c;
        float f14 = this.f44825d;
        if (f14 <= 0.5d) {
            i11 = i22;
        } else {
            f14 = 1.0f - f14;
            i11 = i22 + 1;
        }
        boolean z11 = f14 <= 0.25f;
        boolean z12 = f14 <= 0.05f;
        float f15 = (0.25f - f14) / 0.25f;
        Rect rect = c11.get(i22);
        int i23 = rect.right;
        int i24 = rect.left;
        float f16 = i23 - i24;
        if (i24 < f12) {
            d(rect, f16, left);
        }
        if (rect.right > f13) {
            e(rect, f16, i21);
        }
        int i25 = this.f44824c;
        if (i25 > 0) {
            int i26 = i25 - 1;
            while (i26 >= 0) {
                Rect rect2 = c11.get(i26);
                int i27 = rect2.left;
                int i28 = i18;
                if (i27 < f12) {
                    int i29 = rect2.right - i27;
                    d(rect2, i29, left);
                    Rect rect3 = c11.get(i26 + 1);
                    f11 = f12;
                    float f17 = rect2.right;
                    float f18 = this.f44840s;
                    if (f17 + f18 > rect3.left) {
                        int i31 = (int) ((r7 - i29) - f18);
                        rect2.left = i31;
                        rect2.right = i31 + i29;
                    }
                } else {
                    f11 = f12;
                }
                i26--;
                i18 = i28;
                f12 = f11;
            }
        }
        int i32 = i18;
        int i33 = this.f44824c;
        if (i33 < i19) {
            int i34 = i33 + 1;
            while (i34 < count) {
                Rect rect4 = c11.get(i34);
                int i35 = rect4.right;
                if (i35 > f13) {
                    int i36 = i35 - rect4.left;
                    e(rect4, i36, i21);
                    Rect rect5 = c11.get(i34 - 1);
                    float f19 = rect4.left;
                    float f21 = this.f44840s;
                    float f22 = f19 - f21;
                    int i37 = rect5.right;
                    i17 = i34;
                    if (f22 < i37) {
                        int i38 = (int) (i37 + f21);
                        rect4.left = i38;
                        rect4.right = i38 + i36;
                    }
                } else {
                    i17 = i34;
                }
                i34 = i17 + 1;
            }
        }
        int i39 = this.f44829h >>> 24;
        int i41 = 0;
        while (i41 < count) {
            Rect rect6 = c11.get(i41);
            int i42 = rect6.left;
            if ((i42 <= left || i42 >= i21) && ((i13 = rect6.right) <= left || i13 >= i21)) {
                i14 = i41;
                i15 = i21;
                i16 = count;
            } else {
                int i43 = i41 == i11 ? i32 : 0;
                CharSequence f23 = f(i41);
                this.f44827f.setFakeBoldText((i43 != 0 && z12 && this.f44828g) ? i32 : 0);
                this.f44827f.setColor(this.f44829h);
                if (i43 != 0 && z11) {
                    this.f44827f.setAlpha(i39 - ((int) (i39 * f15)));
                }
                if (i41 < size - 1) {
                    Rect rect7 = c11.get(i41 + 1);
                    int i44 = rect6.right;
                    i14 = i41;
                    float f24 = this.f44840s;
                    if (i44 + f24 > rect7.left) {
                        int i45 = i44 - rect6.left;
                        int i46 = (int) ((r5 - i45) - f24);
                        rect6.left = i46;
                        rect6.right = i46 + i45;
                    }
                } else {
                    i14 = i41;
                }
                i15 = i21;
                i16 = count;
                canvas.drawText(f23, 0, f23.length(), rect6.left, rect6.bottom + this.f44841t, this.f44827f);
                if (i43 != 0 && z11) {
                    this.f44827f.setColor(this.f44830i);
                    this.f44827f.setAlpha((int) ((this.f44830i >>> 24) * f15));
                    canvas.drawText(f23, 0, f23.length(), rect6.left, rect6.bottom + this.f44841t, this.f44827f);
                    i41 = i14 + 1;
                    i21 = i15;
                    count = i16;
                }
            }
            i41 = i14 + 1;
            i21 = i15;
            count = i16;
        }
        float f25 = this.f44843v;
        float f26 = this.f44837p;
        if (this.f44835n == LinePosition.Top) {
            f25 = -f25;
            f26 = -f26;
            i12 = 0;
        } else {
            i12 = height;
        }
        this.f44831j.reset();
        float f27 = i12;
        float f28 = f27 - (f25 / 2.0f);
        this.f44831j.moveTo(0.0f, f28);
        this.f44831j.lineTo(width2, f28);
        this.f44831j.close();
        canvas.drawPath(this.f44831j, this.f44833l);
        float f29 = f27 - f25;
        int i47 = a.f44849a[this.f44834m.ordinal()];
        if (i47 == i32) {
            this.f44831j.reset();
            this.f44831j.moveTo(width, f29 - f26);
            this.f44831j.lineTo(width + f26, f29);
            this.f44831j.lineTo(width - f26, f29);
            this.f44831j.close();
            canvas.drawPath(this.f44831j, this.f44836o);
            return;
        }
        if (i47 == 2 && z11 && i11 < size) {
            float f31 = c11.get(i11).right;
            float f32 = this.f44838q;
            float f33 = f31 + f32;
            float f34 = r2.left - f32;
            float f35 = f29 - f26;
            this.f44831j.reset();
            this.f44831j.moveTo(f34, f29);
            this.f44831j.lineTo(f33, f29);
            this.f44831j.lineTo(f33, f35);
            this.f44831j.lineTo(f34, f35);
            this.f44831j.close();
            this.f44836o.setAlpha((int) (255.0f * f15));
            canvas.drawPath(this.f44831j, this.f44836o);
            this.f44836o.setAlpha(255);
        }
    }

    @Override // android.view.View
    public void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        float f11;
        int size = View.MeasureSpec.getSize(widthMeasureSpec);
        if (View.MeasureSpec.getMode(heightMeasureSpec) == 1073741824) {
            f11 = View.MeasureSpec.getSize(heightMeasureSpec);
        } else {
            this.f44832k.setEmpty();
            this.f44832k.bottom = (int) (this.f44827f.descent() - this.f44827f.ascent());
            Rect rect = this.f44832k;
            f11 = (rect.bottom - rect.top) + this.f44843v + this.f44839r + this.f44841t;
            if (this.f44834m != IndicatorStyle.None) {
                f11 += this.f44837p;
            }
        }
        setMeasuredDimension(size, (int) f11);
    }

    @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
    public void onPageScrollStateChanged(int state) {
        this.f44826e = state;
        ViewPager.OnPageChangeListener onPageChangeListener = this.f44823b;
        if (onPageChangeListener != null) {
            onPageChangeListener.onPageScrollStateChanged(state);
        }
    }

    @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
    public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {
        this.f44824c = position;
        this.f44825d = positionOffset;
        invalidate();
        ViewPager.OnPageChangeListener onPageChangeListener = this.f44823b;
        if (onPageChangeListener != null) {
            onPageChangeListener.onPageScrolled(position, positionOffset, positionOffsetPixels);
        }
    }

    @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
    public void onPageSelected(int position) {
        if (this.f44826e == 0) {
            this.f44824c = position;
            invalidate();
        }
        ViewPager.OnPageChangeListener onPageChangeListener = this.f44823b;
        if (onPageChangeListener != null) {
            onPageChangeListener.onPageSelected(position);
        }
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable state) {
        SavedState savedState = (SavedState) state;
        super.onRestoreInstanceState(savedState.getSuperState());
        this.f44824c = savedState.f44848a;
        requestLayout();
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.f44848a = this.f44824c;
        return savedState;
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent ev2) {
        if (super.onTouchEvent(ev2)) {
            return true;
        }
        ViewPager viewPager = this.f44822a;
        if (viewPager == null || viewPager.getAdapter().getCount() == 0) {
            return false;
        }
        int action = ev2.getAction() & 255;
        if (action != 0) {
            if (action != 1) {
                if (action == 2) {
                    float x11 = MotionEventCompat.getX(ev2, MotionEventCompat.findPointerIndex(ev2, this.f44846y));
                    float f11 = x11 - this.f44845x;
                    if (!this.f44847z && Math.abs(f11) > this.f44844w) {
                        this.f44847z = true;
                    }
                    if (this.f44847z) {
                        this.f44845x = x11;
                        if (this.f44822a.isFakeDragging() || this.f44822a.beginFakeDrag()) {
                            this.f44822a.fakeDragBy(f11);
                        }
                    }
                } else if (action != 3) {
                    if (action == 5) {
                        int actionIndex = MotionEventCompat.getActionIndex(ev2);
                        this.f44845x = MotionEventCompat.getX(ev2, actionIndex);
                        this.f44846y = MotionEventCompat.getPointerId(ev2, actionIndex);
                    } else if (action == 6) {
                        int actionIndex2 = MotionEventCompat.getActionIndex(ev2);
                        if (MotionEventCompat.getPointerId(ev2, actionIndex2) == this.f44846y) {
                            this.f44846y = MotionEventCompat.getPointerId(ev2, actionIndex2 == 0 ? 1 : 0);
                        }
                        this.f44845x = MotionEventCompat.getX(ev2, MotionEventCompat.findPointerIndex(ev2, this.f44846y));
                    }
                }
            }
            if (!this.f44847z) {
                int count = this.f44822a.getAdapter().getCount();
                float width = getWidth();
                float f12 = width / 2.0f;
                float f13 = width / 6.0f;
                float f14 = f12 - f13;
                float f15 = f12 + f13;
                float x12 = ev2.getX();
                if (x12 < f14) {
                    int i11 = this.f44824c;
                    if (i11 > 0) {
                        if (action != 3) {
                            this.f44822a.setCurrentItem(i11 - 1);
                        }
                        return true;
                    }
                } else if (x12 > f15) {
                    int i12 = this.f44824c;
                    if (i12 < count - 1) {
                        if (action != 3) {
                            this.f44822a.setCurrentItem(i12 + 1);
                        }
                        return true;
                    }
                } else {
                    b bVar = this.A;
                    if (bVar != null && action != 3) {
                        bVar.a(this.f44824c);
                    }
                }
            }
            this.f44847z = false;
            this.f44846y = -1;
            if (this.f44822a.isFakeDragging()) {
                this.f44822a.endFakeDrag();
            }
        } else {
            this.f44846y = MotionEventCompat.getPointerId(ev2, 0);
            this.f44845x = ev2.getX();
        }
        return true;
    }

    public void setClipPadding(float clipPadding) {
        this.f44842u = clipPadding;
        invalidate();
    }

    @Override // com.viewpagerindicator.c
    public void setCurrentItem(int item) {
        ViewPager viewPager = this.f44822a;
        if (viewPager == null) {
            throw new IllegalStateException("ViewPager has not been bound.");
        }
        viewPager.setCurrentItem(item);
        this.f44824c = item;
        invalidate();
    }

    public void setFooterColor(int footerColor) {
        this.f44833l.setColor(footerColor);
        this.f44836o.setColor(footerColor);
        invalidate();
    }

    public void setFooterIndicatorHeight(float footerTriangleHeight) {
        this.f44837p = footerTriangleHeight;
        invalidate();
    }

    public void setFooterIndicatorPadding(float footerIndicatorPadding) {
        this.f44839r = footerIndicatorPadding;
        invalidate();
    }

    public void setFooterIndicatorStyle(IndicatorStyle indicatorStyle) {
        this.f44834m = indicatorStyle;
        invalidate();
    }

    public void setFooterLineHeight(float footerLineHeight) {
        this.f44843v = footerLineHeight;
        this.f44833l.setStrokeWidth(footerLineHeight);
        invalidate();
    }

    public void setLinePosition(LinePosition linePosition) {
        this.f44835n = linePosition;
        invalidate();
    }

    public void setOnCenterItemClickListener(b listener) {
        this.A = listener;
    }

    @Override // com.viewpagerindicator.c
    public void setOnPageChangeListener(ViewPager.OnPageChangeListener listener) {
        this.f44823b = listener;
    }

    public void setSelectedBold(boolean selectedBold) {
        this.f44828g = selectedBold;
        invalidate();
    }

    public void setSelectedColor(int selectedColor) {
        this.f44830i = selectedColor;
        invalidate();
    }

    public void setTextColor(int textColor) {
        this.f44827f.setColor(textColor);
        this.f44829h = textColor;
        invalidate();
    }

    public void setTextSize(float textSize) {
        this.f44827f.setTextSize(textSize);
        invalidate();
    }

    public void setTitlePadding(float titlePadding) {
        this.f44840s = titlePadding;
        invalidate();
    }

    public void setTopPadding(float topPadding) {
        this.f44841t = topPadding;
        invalidate();
    }

    public void setTypeface(Typeface typeface) {
        this.f44827f.setTypeface(typeface);
        invalidate();
    }

    @Override // com.viewpagerindicator.c
    public void setViewPager(ViewPager view) {
        ViewPager viewPager = this.f44822a;
        if (viewPager == view) {
            return;
        }
        if (viewPager != null) {
            viewPager.setOnPageChangeListener(null);
        }
        if (view.getAdapter() == null) {
            throw new IllegalStateException("ViewPager does not have adapter instance.");
        }
        this.f44822a = view;
        view.setOnPageChangeListener(this);
        invalidate();
    }

    public TitlePageIndicator(Context context, AttributeSet attrs) {
        this(context, attrs, R.attr.vpiTitlePageIndicatorStyle);
    }

    public TitlePageIndicator(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
        this.f44824c = -1;
        Paint paint = new Paint();
        this.f44827f = paint;
        this.f44831j = new Path();
        this.f44832k = new Rect();
        Paint paint2 = new Paint();
        this.f44833l = paint2;
        Paint paint3 = new Paint();
        this.f44836o = paint3;
        this.f44845x = -1.0f;
        this.f44846y = -1;
        if (isInEditMode()) {
            return;
        }
        Resources resources = getResources();
        int color = resources.getColor(R.color.default_title_indicator_footer_color);
        float dimension = resources.getDimension(R.dimen.default_title_indicator_footer_line_height);
        int integer = resources.getInteger(R.integer.default_title_indicator_footer_indicator_style);
        float dimension2 = resources.getDimension(R.dimen.default_title_indicator_footer_indicator_height);
        float dimension3 = resources.getDimension(R.dimen.default_title_indicator_footer_indicator_underline_padding);
        float dimension4 = resources.getDimension(R.dimen.default_title_indicator_footer_padding);
        int integer2 = resources.getInteger(R.integer.default_title_indicator_line_position);
        int color2 = resources.getColor(R.color.default_title_indicator_selected_color);
        boolean z11 = resources.getBoolean(R.bool.default_title_indicator_selected_bold);
        int color3 = resources.getColor(R.color.default_title_indicator_text_color);
        float dimension5 = resources.getDimension(R.dimen.default_title_indicator_text_size);
        float dimension6 = resources.getDimension(R.dimen.default_title_indicator_title_padding);
        float dimension7 = resources.getDimension(R.dimen.default_title_indicator_clip_padding);
        float dimension8 = resources.getDimension(R.dimen.default_title_indicator_top_padding);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attrs, R.styleable.TitlePageIndicator, defStyle, 0);
        this.f44843v = obtainStyledAttributes.getDimension(R.styleable.TitlePageIndicator_footerLineHeight, dimension);
        this.f44834m = IndicatorStyle.fromValue(obtainStyledAttributes.getInteger(R.styleable.TitlePageIndicator_footerIndicatorStyle, integer));
        this.f44837p = obtainStyledAttributes.getDimension(R.styleable.TitlePageIndicator_footerIndicatorHeight, dimension2);
        this.f44838q = obtainStyledAttributes.getDimension(R.styleable.TitlePageIndicator_footerIndicatorUnderlinePadding, dimension3);
        this.f44839r = obtainStyledAttributes.getDimension(R.styleable.TitlePageIndicator_footerPadding, dimension4);
        this.f44835n = LinePosition.fromValue(obtainStyledAttributes.getInteger(R.styleable.TitlePageIndicator_linePosition, integer2));
        this.f44841t = obtainStyledAttributes.getDimension(R.styleable.TitlePageIndicator_topPadding, dimension8);
        this.f44840s = obtainStyledAttributes.getDimension(R.styleable.TitlePageIndicator_titlePadding, dimension6);
        this.f44842u = obtainStyledAttributes.getDimension(R.styleable.TitlePageIndicator_clipPadding, dimension7);
        this.f44830i = obtainStyledAttributes.getColor(R.styleable.TitlePageIndicator_vpiSelectedColor, color2);
        this.f44829h = obtainStyledAttributes.getColor(R.styleable.TitlePageIndicator_android_textColor, color3);
        this.f44828g = obtainStyledAttributes.getBoolean(R.styleable.TitlePageIndicator_selectedBold, z11);
        float dimension9 = obtainStyledAttributes.getDimension(R.styleable.TitlePageIndicator_android_textSize, dimension5);
        int color4 = obtainStyledAttributes.getColor(R.styleable.TitlePageIndicator_footerColor, color);
        paint.setTextSize(dimension9);
        paint.setAntiAlias(true);
        Paint.Style style = Paint.Style.FILL_AND_STROKE;
        paint2.setStyle(style);
        paint2.setStrokeWidth(this.f44843v);
        paint2.setColor(color4);
        paint3.setStyle(style);
        paint3.setColor(color4);
        Drawable drawable = obtainStyledAttributes.getDrawable(R.styleable.TitlePageIndicator_android_background);
        if (drawable != null) {
            setBackgroundDrawable(drawable);
        }
        obtainStyledAttributes.recycle();
        this.f44844w = ViewConfigurationCompat.getScaledPagingTouchSlop(ViewConfiguration.get(context));
    }
}
