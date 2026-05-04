package com.google.android.material.timepicker;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.RadialGradient;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.os.Bundle;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.TextView;
import androidx.annotation.FloatRange;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.StringRes;
import androidx.appcompat.content.res.AppCompatResources;
import androidx.core.view.AccessibilityDelegateCompat;
import androidx.core.view.ViewCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import com.google.android.material.R;
import com.google.android.material.timepicker.ClockHandView;
import java.util.Arrays;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
class ClockFaceView extends RadialViewGroup implements ClockHandView.c {

    /* renamed from: w, reason: collision with root package name */
    public static final float f32537w = 0.001f;

    /* renamed from: x, reason: collision with root package name */
    public static final int f32538x = 12;

    /* renamed from: y, reason: collision with root package name */
    public static final String f32539y = "";

    /* renamed from: h, reason: collision with root package name */
    public final ClockHandView f32540h;

    /* renamed from: i, reason: collision with root package name */
    public final Rect f32541i;

    /* renamed from: j, reason: collision with root package name */
    public final RectF f32542j;

    /* renamed from: k, reason: collision with root package name */
    public final Rect f32543k;

    /* renamed from: l, reason: collision with root package name */
    public final SparseArray<TextView> f32544l;

    /* renamed from: m, reason: collision with root package name */
    public final AccessibilityDelegateCompat f32545m;

    /* renamed from: n, reason: collision with root package name */
    public final int[] f32546n;

    /* renamed from: o, reason: collision with root package name */
    public final float[] f32547o;

    /* renamed from: p, reason: collision with root package name */
    public final int f32548p;

    /* renamed from: q, reason: collision with root package name */
    public final int f32549q;

    /* renamed from: r, reason: collision with root package name */
    public final int f32550r;

    /* renamed from: s, reason: collision with root package name */
    public final int f32551s;

    /* renamed from: t, reason: collision with root package name */
    public String[] f32552t;

    /* renamed from: u, reason: collision with root package name */
    public float f32553u;

    /* renamed from: v, reason: collision with root package name */
    public final ColorStateList f32554v;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class a implements ViewTreeObserver.OnPreDrawListener {
        public a() {
        }

        @Override // android.view.ViewTreeObserver.OnPreDrawListener
        public boolean onPreDraw() {
            if (!ClockFaceView.this.isShown()) {
                return true;
            }
            ClockFaceView.this.getViewTreeObserver().removeOnPreDrawListener(this);
            ClockFaceView.this.k(((ClockFaceView.this.getHeight() / 2) - ClockFaceView.this.f32540h.j()) - ClockFaceView.this.f32548p);
            return true;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class b extends AccessibilityDelegateCompat {
        public b() {
        }

        @Override // androidx.core.view.AccessibilityDelegateCompat
        public void onInitializeAccessibilityNodeInfo(View view, @NonNull AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
            super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfoCompat);
            int intValue = ((Integer) view.getTag(R.id.material_value_index)).intValue();
            if (intValue > 0) {
                accessibilityNodeInfoCompat.setTraversalAfter((View) ClockFaceView.this.f32544l.get(intValue - 1));
            }
            accessibilityNodeInfoCompat.setCollectionItemInfo(AccessibilityNodeInfoCompat.CollectionItemInfoCompat.obtain(0, 1, intValue, 1, false, view.isSelected()));
            accessibilityNodeInfoCompat.setClickable(true);
            accessibilityNodeInfoCompat.addAction(AccessibilityNodeInfoCompat.AccessibilityActionCompat.ACTION_CLICK);
        }

        @Override // androidx.core.view.AccessibilityDelegateCompat
        public boolean performAccessibilityAction(View view, int i11, Bundle bundle) {
            if (i11 != 16) {
                return super.performAccessibilityAction(view, i11, bundle);
            }
            long uptimeMillis = SystemClock.uptimeMillis();
            view.getHitRect(ClockFaceView.this.f32541i);
            float centerX = ClockFaceView.this.f32541i.centerX();
            float centerY = ClockFaceView.this.f32541i.centerY();
            ClockFaceView.this.f32540h.onTouchEvent(MotionEvent.obtain(uptimeMillis, uptimeMillis, 0, centerX, centerY, 0));
            ClockFaceView.this.f32540h.onTouchEvent(MotionEvent.obtain(uptimeMillis, uptimeMillis, 1, centerX, centerY, 0));
            return true;
        }
    }

    public ClockFaceView(@NonNull Context context) {
        this(context, null);
    }

    public static float w(float f11, float f12, float f13) {
        return Math.max(Math.max(f11, f12), f13);
    }

    public void c(String[] strArr, @StringRes int i11) {
        this.f32552t = strArr;
        y(i11);
    }

    @Override // com.google.android.material.timepicker.ClockHandView.c
    public void d(float f11, boolean z11) {
        if (Math.abs(this.f32553u - f11) > 0.001f) {
            this.f32553u = f11;
            s();
        }
    }

    public void f(@FloatRange(from = 0.0d, to = 360.0d) float f11) {
        this.f32540h.p(f11);
        s();
    }

    @Override // com.google.android.material.timepicker.RadialViewGroup
    public void k(int i11) {
        if (i11 != j()) {
            super.k(i11);
            this.f32540h.n(j());
        }
    }

    @Override // com.google.android.material.timepicker.RadialViewGroup
    public void m() {
        super.m();
        for (int i11 = 0; i11 < this.f32544l.size(); i11++) {
            this.f32544l.get(i11).setVisibility(0);
        }
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(@NonNull AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        AccessibilityNodeInfoCompat.wrap(accessibilityNodeInfo).setCollectionInfo(AccessibilityNodeInfoCompat.CollectionInfoCompat.obtain(1, this.f32552t.length, false, 1));
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z11, int i11, int i12, int i13, int i14) {
        super.onLayout(z11, i11, i12, i13, i14);
        s();
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.View
    public void onMeasure(int i11, int i12) {
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        int w11 = (int) (this.f32551s / w(this.f32549q / displayMetrics.heightPixels, this.f32550r / displayMetrics.widthPixels, 1.0f));
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(w11, 1073741824);
        setMeasuredDimension(w11, w11);
        super.onMeasure(makeMeasureSpec, makeMeasureSpec);
    }

    public final void s() {
        RectF f11 = this.f32540h.f();
        TextView v11 = v(f11);
        for (int i11 = 0; i11 < this.f32544l.size(); i11++) {
            TextView textView = this.f32544l.get(i11);
            if (textView != null) {
                textView.setSelected(textView == v11);
                textView.getPaint().setShader(u(f11, textView));
                textView.invalidate();
            }
        }
    }

    public int t() {
        return this.f32540h.e();
    }

    @Nullable
    public final RadialGradient u(RectF rectF, TextView textView) {
        textView.getHitRect(this.f32541i);
        this.f32542j.set(this.f32541i);
        textView.getLineBounds(0, this.f32543k);
        RectF rectF2 = this.f32542j;
        Rect rect = this.f32543k;
        rectF2.inset(rect.left, rect.top);
        if (RectF.intersects(rectF, this.f32542j)) {
            return new RadialGradient(rectF.centerX() - this.f32542j.left, rectF.centerY() - this.f32542j.top, rectF.width() * 0.5f, this.f32546n, this.f32547o, Shader.TileMode.CLAMP);
        }
        return null;
    }

    @Nullable
    public final TextView v(RectF rectF) {
        float f11 = Float.MAX_VALUE;
        TextView textView = null;
        for (int i11 = 0; i11 < this.f32544l.size(); i11++) {
            TextView textView2 = this.f32544l.get(i11);
            if (textView2 != null) {
                textView2.getHitRect(this.f32541i);
                this.f32542j.set(this.f32541i);
                this.f32542j.union(rectF);
                float width = this.f32542j.width() * this.f32542j.height();
                if (width < f11) {
                    textView = textView2;
                    f11 = width;
                }
            }
        }
        return textView;
    }

    public void x(int i11) {
        this.f32540h.o(i11);
    }

    public final void y(@StringRes int i11) {
        LayoutInflater from = LayoutInflater.from(getContext());
        int size = this.f32544l.size();
        boolean z11 = false;
        for (int i12 = 0; i12 < Math.max(this.f32552t.length, size); i12++) {
            TextView textView = this.f32544l.get(i12);
            if (i12 >= this.f32552t.length) {
                removeView(textView);
                this.f32544l.remove(i12);
            } else {
                if (textView == null) {
                    textView = (TextView) from.inflate(R.layout.material_clockface_textview, (ViewGroup) this, false);
                    this.f32544l.put(i12, textView);
                    addView(textView);
                }
                textView.setText(this.f32552t[i12]);
                textView.setTag(R.id.material_value_index, Integer.valueOf(i12));
                int i13 = (i12 / 12) + 1;
                textView.setTag(R.id.material_clock_level, Integer.valueOf(i13));
                if (i13 > 1) {
                    z11 = true;
                }
                ViewCompat.setAccessibilityDelegate(textView, this.f32545m);
                textView.setTextColor(this.f32554v);
                if (i11 != 0) {
                    textView.setContentDescription(getResources().getString(i11, this.f32552t[i12]));
                }
            }
        }
        this.f32540h.s(z11);
    }

    public ClockFaceView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.materialClockStyle);
    }

    @SuppressLint({"ClickableViewAccessibility"})
    public ClockFaceView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        this.f32541i = new Rect();
        this.f32542j = new RectF();
        this.f32543k = new Rect();
        this.f32544l = new SparseArray<>();
        this.f32547o = new float[]{0.0f, 0.9f, 1.0f};
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.ClockFaceView, i11, R.style.Widget_MaterialComponents_TimePicker_Clock);
        Resources resources = getResources();
        ColorStateList a11 = sn.c.a(context, obtainStyledAttributes, R.styleable.ClockFaceView_clockNumberTextColor);
        this.f32554v = a11;
        LayoutInflater.from(context).inflate(R.layout.material_clockface_view, (ViewGroup) this, true);
        ClockHandView clockHandView = (ClockHandView) findViewById(R.id.material_clock_hand);
        this.f32540h = clockHandView;
        this.f32548p = resources.getDimensionPixelSize(R.dimen.material_clock_hand_padding);
        int colorForState = a11.getColorForState(new int[]{android.R.attr.state_selected}, a11.getDefaultColor());
        this.f32546n = new int[]{colorForState, colorForState, a11.getDefaultColor()};
        clockHandView.b(this);
        int defaultColor = AppCompatResources.getColorStateList(context, R.color.material_timepicker_clockface).getDefaultColor();
        ColorStateList a12 = sn.c.a(context, obtainStyledAttributes, R.styleable.ClockFaceView_clockFaceBackgroundColor);
        setBackgroundColor(a12 != null ? a12.getDefaultColor() : defaultColor);
        getViewTreeObserver().addOnPreDrawListener(new a());
        setFocusable(true);
        obtainStyledAttributes.recycle();
        this.f32545m = new b();
        String[] strArr = new String[12];
        Arrays.fill(strArr, "");
        c(strArr, 0);
        this.f32549q = resources.getDimensionPixelSize(R.dimen.material_time_picker_minimum_screen_height);
        this.f32550r = resources.getDimensionPixelSize(R.dimen.material_time_picker_minimum_screen_width);
        this.f32551s = resources.getDimensionPixelSize(R.dimen.material_clock_size);
    }
}
