package com.google.android.material.slider;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import android.view.accessibility.AccessibilityManager;
import android.widget.SeekBar;
import androidx.annotation.ColorInt;
import androidx.annotation.ColorRes;
import androidx.annotation.DimenRes;
import androidx.annotation.Dimension;
import androidx.annotation.DrawableRes;
import androidx.annotation.IntRange;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.Px;
import androidx.annotation.VisibleForTesting;
import androidx.appcompat.content.res.AppCompatResources;
import androidx.core.graphics.drawable.DrawableCompat;
import androidx.core.math.MathUtils;
import androidx.core.view.ViewCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import androidx.customview.widget.ExploreByTouchHelper;
import com.google.android.material.R;
import com.google.android.material.internal.d0;
import com.google.android.material.internal.k0;
import com.google.android.material.internal.m0;
import com.google.android.material.slider.BaseSlider;
import com.google.android.material.slider.a;
import com.google.android.material.slider.b;
import java.math.BigDecimal;
import java.math.MathContext;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import pn.j;
import vn.k;
import vn.p;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
abstract class BaseSlider<S extends BaseSlider<S, L, T>, L extends com.google.android.material.slider.a<S>, T extends com.google.android.material.slider.b<S>> extends View {
    public static final String B1 = "BaseSlider";
    public static final String C1 = "Slider value(%s) must be greater or equal to valueFrom(%s), and lower or equal to valueTo(%s)";
    public static final String D1 = "Value(%s) must be equal to valueFrom(%s) plus a multiple of stepSize(%s) when using stepSize(%s)";
    public static final String E1 = "valueFrom(%s) must be smaller than valueTo(%s)";
    public static final String F1 = "valueTo(%s) must be greater than valueFrom(%s)";
    public static final String G1 = "The stepSize(%s) must be 0, or a factor of the valueFrom(%s)-valueTo(%s) range";
    public static final String H1 = "minSeparation(%s) must be greater or equal to 0";
    public static final String I1 = "minSeparation(%s) cannot be set as a dimension when using stepSize(%s)";
    public static final String J1 = "minSeparation(%s) must be greater or equal and a multiple of stepSize(%s) when using stepSize(%s)";
    public static final String K1 = "Floating point value used for %s(%s). Using floats can have rounding errors which may result in incorrect values. Instead, consider using integers with a custom LabelFormatter to display the value correctly.";
    public static final int L1 = 200;
    public static final int M1 = 63;
    public static final double N1 = 1.0E-4d;
    public static final float O1 = 0.5f;
    public static final int Q1 = 1;
    public static final int R1 = 0;
    public static final int S1 = 83;
    public static final int T1 = 117;

    @Dimension(unit = 0)
    public static final int Y1 = 48;
    public int A;

    @NonNull
    public final ViewTreeObserver.OnScrollChangedListener A1;
    public int B;
    public int C;
    public int D;
    public int E;
    public int F;
    public int G;
    public int H;
    public int I;
    public int J;
    public int K;
    public int L;
    public int M;
    public float N;
    public MotionEvent O;
    public com.google.android.material.slider.e P;
    public boolean Q;
    public float R;
    public float S;
    public ArrayList<Float> T;
    public int U;
    public int V;
    public float W;

    /* renamed from: a, reason: collision with root package name */
    @NonNull
    public final Paint f32057a;

    /* renamed from: b, reason: collision with root package name */
    @NonNull
    public final Paint f32058b;

    /* renamed from: c, reason: collision with root package name */
    @NonNull
    public final Paint f32059c;

    /* renamed from: d, reason: collision with root package name */
    @NonNull
    public final Paint f32060d;

    /* renamed from: e, reason: collision with root package name */
    @NonNull
    public final Paint f32061e;

    /* renamed from: f, reason: collision with root package name */
    @NonNull
    public final Paint f32062f;

    /* renamed from: f0, reason: collision with root package name */
    public float[] f32063f0;

    /* renamed from: f1, reason: collision with root package name */
    public boolean f32064f1;

    /* renamed from: g, reason: collision with root package name */
    @NonNull
    public final Paint f32065g;

    /* renamed from: h, reason: collision with root package name */
    @NonNull
    public final e f32066h;

    /* renamed from: h1, reason: collision with root package name */
    public int f32067h1;

    /* renamed from: i, reason: collision with root package name */
    public final AccessibilityManager f32068i;

    /* renamed from: i1, reason: collision with root package name */
    public int f32069i1;

    /* renamed from: j, reason: collision with root package name */
    public BaseSlider<S, L, T>.d f32070j;

    /* renamed from: j1, reason: collision with root package name */
    public int f32071j1;

    /* renamed from: k, reason: collision with root package name */
    public int f32072k;

    /* renamed from: k1, reason: collision with root package name */
    public boolean f32073k1;

    /* renamed from: l, reason: collision with root package name */
    @NonNull
    public final List<ao.a> f32074l;

    /* renamed from: l1, reason: collision with root package name */
    public boolean f32075l1;

    /* renamed from: m, reason: collision with root package name */
    @NonNull
    public final List<L> f32076m;

    /* renamed from: m1, reason: collision with root package name */
    public boolean f32077m1;

    /* renamed from: n, reason: collision with root package name */
    @NonNull
    public final List<T> f32078n;

    /* renamed from: n1, reason: collision with root package name */
    @NonNull
    public ColorStateList f32079n1;

    /* renamed from: o, reason: collision with root package name */
    public boolean f32080o;

    /* renamed from: o1, reason: collision with root package name */
    @NonNull
    public ColorStateList f32081o1;

    /* renamed from: p, reason: collision with root package name */
    public ValueAnimator f32082p;

    /* renamed from: p1, reason: collision with root package name */
    @NonNull
    public ColorStateList f32083p1;

    /* renamed from: q, reason: collision with root package name */
    public ValueAnimator f32084q;

    /* renamed from: q1, reason: collision with root package name */
    @NonNull
    public ColorStateList f32085q1;

    /* renamed from: r, reason: collision with root package name */
    public final int f32086r;

    /* renamed from: r1, reason: collision with root package name */
    @NonNull
    public ColorStateList f32087r1;

    /* renamed from: s, reason: collision with root package name */
    public int f32088s;

    /* renamed from: s1, reason: collision with root package name */
    @NonNull
    public final Path f32089s1;

    /* renamed from: t, reason: collision with root package name */
    public int f32090t;

    /* renamed from: t1, reason: collision with root package name */
    @NonNull
    public final RectF f32091t1;

    /* renamed from: u, reason: collision with root package name */
    public int f32092u;

    /* renamed from: u1, reason: collision with root package name */
    @NonNull
    public final RectF f32093u1;

    /* renamed from: v, reason: collision with root package name */
    public int f32094v;

    /* renamed from: v1, reason: collision with root package name */
    @NonNull
    public final k f32095v1;

    /* renamed from: w, reason: collision with root package name */
    public int f32096w;

    /* renamed from: w1, reason: collision with root package name */
    @Nullable
    public Drawable f32097w1;

    /* renamed from: x, reason: collision with root package name */
    public int f32098x;

    /* renamed from: x1, reason: collision with root package name */
    @NonNull
    public List<Drawable> f32099x1;

    /* renamed from: y, reason: collision with root package name */
    @Px
    public int f32100y;

    /* renamed from: y1, reason: collision with root package name */
    public float f32101y1;

    /* renamed from: z, reason: collision with root package name */
    public int f32102z;

    /* renamed from: z1, reason: collision with root package name */
    public int f32103z1;
    public static final int P1 = R.style.Widget_MaterialComponents_Slider;
    public static final int U1 = R.attr.motionDurationMedium4;
    public static final int V1 = R.attr.motionDurationShort3;
    public static final int W1 = R.attr.motionEasingEmphasizedInterpolator;
    public static final int X1 = R.attr.motionEasingEmphasizedAccelerateInterpolator;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class SliderState extends View.BaseSavedState {
        public static final Parcelable.Creator<SliderState> CREATOR = new a();

        /* renamed from: a, reason: collision with root package name */
        public float f32104a;

        /* renamed from: b, reason: collision with root package name */
        public float f32105b;

        /* renamed from: c, reason: collision with root package name */
        public ArrayList<Float> f32106c;

        /* renamed from: d, reason: collision with root package name */
        public float f32107d;

        /* renamed from: e, reason: collision with root package name */
        public boolean f32108e;

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public class a implements Parcelable.Creator<SliderState> {
            @Override // android.os.Parcelable.Creator
            @NonNull
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public SliderState createFromParcel(@NonNull Parcel parcel) {
                return new SliderState(parcel, null);
            }

            @Override // android.os.Parcelable.Creator
            @NonNull
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public SliderState[] newArray(int i11) {
                return new SliderState[i11];
            }
        }

        public /* synthetic */ SliderState(Parcel parcel, a aVar) {
            this(parcel);
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(@NonNull Parcel parcel, int i11) {
            super.writeToParcel(parcel, i11);
            parcel.writeFloat(this.f32104a);
            parcel.writeFloat(this.f32105b);
            parcel.writeList(this.f32106c);
            parcel.writeFloat(this.f32107d);
            parcel.writeBooleanArray(new boolean[]{this.f32108e});
        }

        public SliderState(Parcelable parcelable) {
            super(parcelable);
        }

        public SliderState(@NonNull Parcel parcel) {
            super(parcel);
            this.f32104a = parcel.readFloat();
            this.f32105b = parcel.readFloat();
            ArrayList<Float> arrayList = new ArrayList<>();
            this.f32106c = arrayList;
            parcel.readList(arrayList, Float.class.getClassLoader());
            this.f32107d = parcel.readFloat();
            this.f32108e = parcel.createBooleanArray()[0];
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class a implements ValueAnimator.AnimatorUpdateListener {
        public a() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            Iterator it = BaseSlider.this.f32074l.iterator();
            while (it.hasNext()) {
                ((ao.a) it.next()).m1(floatValue);
            }
            ViewCompat.postInvalidateOnAnimation(BaseSlider.this);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class b extends AnimatorListenerAdapter {
        public b() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            super.onAnimationEnd(animator);
            k0 m11 = m0.m(BaseSlider.this);
            Iterator it = BaseSlider.this.f32074l.iterator();
            while (it.hasNext()) {
                m11.a((ao.a) it.next());
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static /* synthetic */ class c {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f32111a;

        static {
            int[] iArr = new int[f.values().length];
            f32111a = iArr;
            try {
                iArr[f.NONE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f32111a[f.LEFT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f32111a[f.RIGHT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f32111a[f.BOTH.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class e extends ExploreByTouchHelper {

        /* renamed from: a, reason: collision with root package name */
        public final BaseSlider<?, ?, ?> f32114a;

        /* renamed from: b, reason: collision with root package name */
        public final Rect f32115b;

        public e(BaseSlider<?, ?, ?> baseSlider) {
            super(baseSlider);
            this.f32115b = new Rect();
            this.f32114a = baseSlider;
        }

        @NonNull
        public final String a(int i11) {
            return i11 == this.f32114a.getValues().size() + (-1) ? this.f32114a.getContext().getString(R.string.material_slider_range_end) : i11 == 0 ? this.f32114a.getContext().getString(R.string.material_slider_range_start) : "";
        }

        @Override // androidx.customview.widget.ExploreByTouchHelper
        public int getVirtualViewAt(float f11, float f12) {
            for (int i11 = 0; i11 < this.f32114a.getValues().size(); i11++) {
                this.f32114a.z0(i11, this.f32115b);
                if (this.f32115b.contains((int) f11, (int) f12)) {
                    return i11;
                }
            }
            return -1;
        }

        @Override // androidx.customview.widget.ExploreByTouchHelper
        public void getVisibleVirtualViews(List<Integer> list) {
            for (int i11 = 0; i11 < this.f32114a.getValues().size(); i11++) {
                list.add(Integer.valueOf(i11));
            }
        }

        @Override // androidx.customview.widget.ExploreByTouchHelper
        public boolean onPerformActionForVirtualView(int i11, int i12, Bundle bundle) {
            if (!this.f32114a.isEnabled()) {
                return false;
            }
            if (i12 != 4096 && i12 != 8192) {
                if (i12 == 16908349 && bundle != null && bundle.containsKey(AccessibilityNodeInfoCompat.ACTION_ARGUMENT_PROGRESS_VALUE)) {
                    if (this.f32114a.x0(i11, bundle.getFloat(AccessibilityNodeInfoCompat.ACTION_ARGUMENT_PROGRESS_VALUE))) {
                        this.f32114a.A0();
                        this.f32114a.postInvalidate();
                        invalidateVirtualView(i11);
                        return true;
                    }
                }
                return false;
            }
            float n11 = this.f32114a.n(20);
            if (i12 == 8192) {
                n11 = -n11;
            }
            if (this.f32114a.V()) {
                n11 = -n11;
            }
            if (!this.f32114a.x0(i11, MathUtils.clamp(this.f32114a.getValues().get(i11).floatValue() + n11, this.f32114a.getValueFrom(), this.f32114a.getValueTo()))) {
                return false;
            }
            this.f32114a.A0();
            this.f32114a.postInvalidate();
            invalidateVirtualView(i11);
            return true;
        }

        @Override // androidx.customview.widget.ExploreByTouchHelper
        public void onPopulateNodeForVirtualView(int i11, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
            accessibilityNodeInfoCompat.addAction(AccessibilityNodeInfoCompat.AccessibilityActionCompat.ACTION_SET_PROGRESS);
            List<Float> values = this.f32114a.getValues();
            float floatValue = values.get(i11).floatValue();
            float valueFrom = this.f32114a.getValueFrom();
            float valueTo = this.f32114a.getValueTo();
            if (this.f32114a.isEnabled()) {
                if (floatValue > valueFrom) {
                    accessibilityNodeInfoCompat.addAction(8192);
                }
                if (floatValue < valueTo) {
                    accessibilityNodeInfoCompat.addAction(4096);
                }
            }
            accessibilityNodeInfoCompat.setRangeInfo(AccessibilityNodeInfoCompat.RangeInfoCompat.obtain(1, valueFrom, valueTo, floatValue));
            accessibilityNodeInfoCompat.setClassName(SeekBar.class.getName());
            StringBuilder sb2 = new StringBuilder();
            if (this.f32114a.getContentDescription() != null) {
                sb2.append(this.f32114a.getContentDescription());
                sb2.append(",");
            }
            String F = this.f32114a.F(floatValue);
            String string = this.f32114a.getContext().getString(R.string.material_slider_value);
            if (values.size() > 1) {
                string = a(i11);
            }
            sb2.append(String.format(Locale.US, "%s, %s", string, F));
            accessibilityNodeInfoCompat.setContentDescription(sb2.toString());
            this.f32114a.z0(i11, this.f32115b);
            accessibilityNodeInfoCompat.setBoundsInParent(this.f32115b);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public enum f {
        BOTH,
        LEFT,
        RIGHT,
        NONE
    }

    public BaseSlider(@NonNull Context context) {
        this(context, null);
    }

    public static float H(ValueAnimator valueAnimator, float f11) {
        if (valueAnimator == null || !valueAnimator.isRunning()) {
            return f11;
        }
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        valueAnimator.cancel();
        return floatValue;
    }

    public static boolean S(MotionEvent motionEvent) {
        return motionEvent.getToolType(0) == 3;
    }

    public final void A(@NonNull Canvas canvas, int i11, int i12) {
        Canvas canvas2;
        int i13;
        int i14;
        int i15 = 0;
        while (i15 < this.T.size()) {
            float floatValue = this.T.get(i15).floatValue();
            Drawable drawable = this.f32097w1;
            if (drawable != null) {
                canvas2 = canvas;
                i13 = i11;
                i14 = i12;
                z(canvas2, i13, i14, floatValue, drawable);
            } else {
                canvas2 = canvas;
                i13 = i11;
                i14 = i12;
                if (i15 < this.f32099x1.size()) {
                    z(canvas2, i13, i14, floatValue, this.f32099x1.get(i15));
                } else {
                    if (!isEnabled()) {
                        canvas2.drawCircle(this.D + (h0(floatValue) * i13), i14, getThumbRadius(), this.f32059c);
                    }
                    z(canvas2, i13, i14, floatValue, this.f32095v1);
                }
            }
            i15++;
            canvas = canvas2;
            i11 = i13;
            i12 = i14;
        }
    }

    public final void A0() {
        if (u0() || getMeasuredWidth() <= 0) {
            return;
        }
        Drawable background = getBackground();
        if (background instanceof RippleDrawable) {
            int h02 = (int) ((h0(this.T.get(this.V).floatValue()) * this.f32071j1) + this.D);
            int o11 = o();
            int i11 = this.G;
            DrawableCompat.setHotspotBounds(background, h02 - i11, o11 - i11, h02 + i11, o11 + i11);
        }
    }

    public final void B() {
        if (!this.f32080o) {
            this.f32080o = true;
            ValueAnimator r11 = r(true);
            this.f32082p = r11;
            this.f32084q = null;
            r11.start();
        }
        Iterator<ao.a> it = this.f32074l.iterator();
        for (int i11 = 0; i11 < this.T.size() && it.hasNext(); i11++) {
            if (i11 != this.V) {
                r0(it.next(), this.T.get(i11).floatValue());
            }
        }
        if (!it.hasNext()) {
            throw new IllegalStateException(String.format("Not enough labels(%d) to display all the values(%d)", Integer.valueOf(this.f32074l.size()), Integer.valueOf(this.T.size())));
        }
        r0(it.next(), this.T.get(this.V).floatValue());
    }

    public final void B0() {
        int i11 = this.B;
        if (i11 == 0 || i11 == 1) {
            if (this.U == -1 || !isEnabled()) {
                C();
                return;
            } else {
                B();
                return;
            }
        }
        if (i11 == 2) {
            C();
            return;
        }
        if (i11 != 3) {
            throw new IllegalArgumentException("Unexpected labelBehavior: " + this.B);
        }
        if (isEnabled() && W()) {
            B();
        } else {
            C();
        }
    }

    public final void C() {
        if (this.f32080o) {
            this.f32080o = false;
            ValueAnimator r11 = r(false);
            this.f32084q = r11;
            this.f32082p = null;
            r11.addListener(new b());
            this.f32084q.start();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0042  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void C0(android.graphics.Canvas r9, android.graphics.Paint r10, android.graphics.RectF r11, com.google.android.material.slider.BaseSlider.f r12) {
        /*
            r8 = this;
            int r0 = r8.C
            float r1 = (float) r0
            r2 = 1073741824(0x40000000, float:2.0)
            float r1 = r1 / r2
            float r0 = (float) r0
            float r0 = r0 / r2
            int[] r3 = com.google.android.material.slider.BaseSlider.c.f32111a
            int r4 = r12.ordinal()
            r4 = r3[r4]
            r5 = 3
            r6 = 2
            r7 = 1
            if (r4 == r7) goto L22
            if (r4 == r6) goto L1e
            if (r4 == r5) goto L1a
            goto L26
        L1a:
            int r1 = r8.L
            float r1 = (float) r1
            goto L26
        L1e:
            int r0 = r8.L
        L20:
            float r0 = (float) r0
            goto L26
        L22:
            int r0 = r8.L
            float r1 = (float) r0
            goto L20
        L26:
            android.graphics.Paint$Style r4 = android.graphics.Paint.Style.FILL
            r10.setStyle(r4)
            android.graphics.Paint$Cap r4 = android.graphics.Paint.Cap.BUTT
            r10.setStrokeCap(r4)
            r10.setAntiAlias(r7)
            android.graphics.Path r4 = r8.f32089s1
            r4.reset()
            float r4 = r11.width()
            float r7 = r1 + r0
            int r4 = (r4 > r7 ? 1 : (r4 == r7 ? 0 : -1))
            if (r4 < 0) goto L53
            android.graphics.Path r12 = r8.f32089s1
            float[] r0 = r8.K(r1, r0)
            android.graphics.Path$Direction r1 = android.graphics.Path.Direction.CW
            r12.addRoundRect(r11, r0, r1)
            android.graphics.Path r11 = r8.f32089s1
            r9.drawPath(r11, r10)
            return
        L53:
            float r4 = java.lang.Math.min(r1, r0)
            float r0 = java.lang.Math.max(r1, r0)
            r9.save()
            android.graphics.Path r1 = r8.f32089s1
            android.graphics.Path$Direction r7 = android.graphics.Path.Direction.CW
            r1.addRoundRect(r11, r4, r4, r7)
            android.graphics.Path r1 = r8.f32089s1
            r9.clipPath(r1)
            int r12 = r12.ordinal()
            r12 = r3[r12]
            if (r12 == r6) goto L97
            if (r12 == r5) goto L88
            android.graphics.RectF r12 = r8.f32093u1
            float r1 = r11.centerX()
            float r1 = r1 - r0
            float r2 = r11.top
            float r3 = r11.centerX()
            float r3 = r3 + r0
            float r11 = r11.bottom
            r12.set(r1, r2, r3, r11)
            goto La4
        L88:
            android.graphics.RectF r12 = r8.f32093u1
            float r1 = r11.right
            float r2 = r2 * r0
            float r2 = r1 - r2
            float r3 = r11.top
            float r11 = r11.bottom
            r12.set(r2, r3, r1, r11)
            goto La4
        L97:
            android.graphics.RectF r12 = r8.f32093u1
            float r1 = r11.left
            float r3 = r11.top
            float r2 = r2 * r0
            float r2 = r2 + r1
            float r11 = r11.bottom
            r12.set(r1, r3, r2, r11)
        La4:
            android.graphics.RectF r11 = r8.f32093u1
            r9.drawRoundRect(r11, r0, r0, r10)
            r9.restore()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.slider.BaseSlider.C0(android.graphics.Canvas, android.graphics.Paint, android.graphics.RectF, com.google.android.material.slider.BaseSlider$f):void");
    }

    public final void D(int i11) {
        if (i11 == 1) {
            f0(Integer.MAX_VALUE);
            return;
        }
        if (i11 == 2) {
            f0(Integer.MIN_VALUE);
        } else if (i11 == 17) {
            g0(Integer.MAX_VALUE);
        } else {
            if (i11 != 66) {
                return;
            }
            g0(Integer.MIN_VALUE);
        }
    }

    public final void D0(int i11) {
        this.f32071j1 = Math.max(i11 - (this.D * 2), 0);
        Z();
    }

    @VisibleForTesting
    public void E(boolean z11) {
        this.f32073k1 = z11;
    }

    public final void E0() {
        boolean e02 = e0();
        boolean d02 = d0();
        if (e02) {
            requestLayout();
        } else if (d02) {
            postInvalidate();
        }
    }

    public final String F(float f11) {
        if (O()) {
            return this.P.a(f11);
        }
        return String.format(((float) ((int) f11)) == f11 ? "%.0f" : "%.2f", Float.valueOf(f11));
    }

    public final void F0() {
        if (this.f32077m1) {
            I0();
            J0();
            H0();
            K0();
            G0();
            N0();
            this.f32077m1 = false;
        }
    }

    public final float[] G() {
        float floatValue = this.T.get(0).floatValue();
        ArrayList<Float> arrayList = this.T;
        float floatValue2 = arrayList.get(arrayList.size() - 1).floatValue();
        if (this.T.size() == 1) {
            floatValue = this.R;
        }
        float h02 = h0(floatValue);
        float h03 = h0(floatValue2);
        return V() ? new float[]{h03, h02} : new float[]{h02, h03};
    }

    public final void G0() {
        float minSeparation = getMinSeparation();
        if (minSeparation < 0.0f) {
            throw new IllegalStateException(String.format(H1, Float.valueOf(minSeparation)));
        }
        float f11 = this.W;
        if (f11 <= 0.0f || minSeparation <= 0.0f) {
            return;
        }
        if (this.f32103z1 != 1) {
            throw new IllegalStateException(String.format(I1, Float.valueOf(minSeparation), Float.valueOf(this.W)));
        }
        if (minSeparation < f11 || !T(minSeparation)) {
            throw new IllegalStateException(String.format(J1, Float.valueOf(minSeparation), Float.valueOf(this.W), Float.valueOf(this.W)));
        }
    }

    public final void H0() {
        if (this.W > 0.0f && !L0(this.S)) {
            throw new IllegalStateException(String.format(G1, Float.valueOf(this.W), Float.valueOf(this.R), Float.valueOf(this.S)));
        }
    }

    public final float I(int i11, float f11) {
        float minSeparation = getMinSeparation();
        if (this.f32103z1 == 0) {
            minSeparation = u(minSeparation);
        }
        if (V()) {
            minSeparation = -minSeparation;
        }
        int i12 = i11 + 1;
        int i13 = i11 - 1;
        return MathUtils.clamp(f11, i13 < 0 ? this.R : this.T.get(i13).floatValue() + minSeparation, i12 >= this.T.size() ? this.S : this.T.get(i12).floatValue() - minSeparation);
    }

    public final void I0() {
        if (this.R >= this.S) {
            throw new IllegalStateException(String.format(E1, Float.valueOf(this.R), Float.valueOf(this.S)));
        }
    }

    @ColorInt
    public final int J(@NonNull ColorStateList colorStateList) {
        return colorStateList.getColorForState(getDrawableState(), colorStateList.getDefaultColor());
    }

    public final void J0() {
        if (this.S <= this.R) {
            throw new IllegalStateException(String.format(F1, Float.valueOf(this.S), Float.valueOf(this.R)));
        }
    }

    public final float[] K(float f11, float f12) {
        return new float[]{f11, f11, f12, f12, f12, f12, f11, f11};
    }

    public final void K0() {
        Iterator<Float> it = this.T.iterator();
        while (it.hasNext()) {
            Float next = it.next();
            if (next.floatValue() < this.R || next.floatValue() > this.S) {
                throw new IllegalStateException(String.format(C1, next, Float.valueOf(this.R), Float.valueOf(this.S)));
            }
            if (this.W > 0.0f && !L0(next.floatValue())) {
                throw new IllegalStateException(String.format(D1, next, Float.valueOf(this.R), Float.valueOf(this.W), Float.valueOf(this.W)));
            }
        }
    }

    public final float L() {
        double w02 = w0(this.f32101y1);
        if (V()) {
            w02 = 1.0d - w02;
        }
        float f11 = this.S;
        return (float) ((w02 * (f11 - r3)) + this.R);
    }

    public final boolean L0(float f11) {
        return T(new BigDecimal(Float.toString(f11)).subtract(new BigDecimal(Float.toString(this.R)), MathContext.DECIMAL64).doubleValue());
    }

    public final float M() {
        float f11 = this.f32101y1;
        if (V()) {
            f11 = 1.0f - f11;
        }
        float f12 = this.S;
        float f13 = this.R;
        return (f11 * (f12 - f13)) + f13;
    }

    public final float M0(float f11) {
        return (h0(f11) * this.f32071j1) + this.D;
    }

    public final boolean N() {
        return this.H > 0;
    }

    public final void N0() {
        float f11 = this.W;
        if (f11 == 0.0f) {
            return;
        }
        if (((int) f11) != f11) {
            Log.w(B1, String.format(K1, "stepSize", Float.valueOf(f11)));
        }
        float f12 = this.R;
        if (((int) f12) != f12) {
            Log.w(B1, String.format(K1, "valueFrom", Float.valueOf(f12)));
        }
        float f13 = this.S;
        if (((int) f13) != f13) {
            Log.w(B1, String.format(K1, "valueTo", Float.valueOf(f13)));
        }
    }

    public boolean O() {
        return this.P != null;
    }

    public final Drawable P(Drawable drawable) {
        Drawable newDrawable = drawable.mutate().getConstantState().newDrawable();
        j(newDrawable);
        return newDrawable;
    }

    public final void Q() {
        this.f32057a.setStrokeWidth(this.C);
        this.f32058b.setStrokeWidth(this.C);
    }

    public final boolean R() {
        for (ViewParent parent = getParent(); parent instanceof ViewGroup; parent = parent.getParent()) {
            ViewGroup viewGroup = (ViewGroup) parent;
            if ((viewGroup.canScrollVertically(1) || viewGroup.canScrollVertically(-1)) && viewGroup.shouldDelayChildPressedState()) {
                return true;
            }
        }
        return false;
    }

    public final boolean T(double d11) {
        double doubleValue = new BigDecimal(Double.toString(d11)).divide(new BigDecimal(Float.toString(this.W)), MathContext.DECIMAL64).doubleValue();
        return Math.abs(((double) Math.round(doubleValue)) - doubleValue) < 1.0E-4d;
    }

    public final boolean U(MotionEvent motionEvent) {
        return !S(motionEvent) && R();
    }

    public final boolean V() {
        return ViewCompat.getLayoutDirection(this) == 1;
    }

    public final boolean W() {
        Rect rect = new Rect();
        m0.l(this).getHitRect(rect);
        return getLocalVisibleRect(rect);
    }

    public boolean X() {
        return this.f32064f1;
    }

    public final void Y(@NonNull Resources resources) {
        this.f32102z = resources.getDimensionPixelSize(R.dimen.mtrl_slider_widget_height);
        int dimensionPixelOffset = resources.getDimensionPixelOffset(R.dimen.mtrl_slider_track_side_padding);
        this.f32088s = dimensionPixelOffset;
        this.D = dimensionPixelOffset;
        this.f32090t = resources.getDimensionPixelSize(R.dimen.mtrl_slider_thumb_radius);
        this.f32092u = resources.getDimensionPixelSize(R.dimen.mtrl_slider_track_height);
        int i11 = R.dimen.mtrl_slider_tick_radius;
        this.f32094v = resources.getDimensionPixelSize(i11);
        this.f32096w = resources.getDimensionPixelSize(i11);
        this.f32098x = resources.getDimensionPixelSize(R.dimen.mtrl_slider_tick_min_spacing);
        this.M = resources.getDimensionPixelSize(R.dimen.mtrl_slider_label_padding);
    }

    public final void Z() {
        if (this.W <= 0.0f) {
            return;
        }
        F0();
        int min = Math.min((int) (((this.S - this.R) / this.W) + 1.0f), (this.f32071j1 / this.f32098x) + 1);
        float[] fArr = this.f32063f0;
        if (fArr == null || fArr.length != min * 2) {
            this.f32063f0 = new float[min * 2];
        }
        float f11 = this.f32071j1 / (min - 1);
        for (int i11 = 0; i11 < min * 2; i11 += 2) {
            float[] fArr2 = this.f32063f0;
            fArr2[i11] = this.D + ((i11 / 2.0f) * f11);
            fArr2[i11 + 1] = o();
        }
    }

    public final void a0(@NonNull Canvas canvas, int i11, int i12) {
        Canvas canvas2;
        if (u0()) {
            int h02 = (int) (this.D + (h0(this.T.get(this.V).floatValue()) * i11));
            if (Build.VERSION.SDK_INT < 28) {
                int i13 = this.G;
                canvas2 = canvas;
                canvas2.clipRect(h02 - i13, i12 - i13, h02 + i13, i13 + i12, Region.Op.UNION);
            } else {
                canvas2 = canvas;
            }
            canvas2.drawCircle(h02, i12, this.G, this.f32060d);
        }
    }

    public final void b0(@NonNull Canvas canvas, int i11) {
        if (this.K <= 0) {
            return;
        }
        if (this.T.size() >= 1) {
            ArrayList<Float> arrayList = this.T;
            float floatValue = arrayList.get(arrayList.size() - 1).floatValue();
            float f11 = this.S;
            if (floatValue < f11) {
                canvas.drawPoint(M0(f11), i11, this.f32065g);
            }
        }
        if (this.T.size() > 1) {
            float floatValue2 = this.T.get(0).floatValue();
            float f12 = this.R;
            if (floatValue2 > f12) {
                canvas.drawPoint(M0(f12), i11, this.f32065g);
            }
        }
    }

    public final void c0(@NonNull Canvas canvas) {
        if (!this.f32064f1 || this.W <= 0.0f) {
            return;
        }
        float[] G = G();
        int ceil = (int) Math.ceil(G[0] * ((this.f32063f0.length / 2.0f) - 1.0f));
        int floor = (int) Math.floor(G[1] * ((this.f32063f0.length / 2.0f) - 1.0f));
        if (ceil > 0) {
            canvas.drawPoints(this.f32063f0, 0, ceil * 2, this.f32061e);
        }
        if (ceil <= floor) {
            canvas.drawPoints(this.f32063f0, ceil * 2, ((floor - ceil) + 1) * 2, this.f32062f);
        }
        int i11 = (floor + 1) * 2;
        float[] fArr = this.f32063f0;
        if (i11 < fArr.length) {
            canvas.drawPoints(fArr, i11, fArr.length - i11, this.f32061e);
        }
    }

    public final boolean d0() {
        int max = this.f32088s + Math.max(Math.max(Math.max((this.E / 2) - this.f32090t, 0), Math.max((this.C - this.f32092u) / 2, 0)), Math.max(Math.max(this.f32067h1 - this.f32094v, 0), Math.max(this.f32069i1 - this.f32096w, 0)));
        if (this.D == max) {
            return false;
        }
        this.D = max;
        if (!ViewCompat.isLaidOut(this)) {
            return true;
        }
        D0(getWidth());
        return true;
    }

    @Override // android.view.View
    public boolean dispatchHoverEvent(@NonNull MotionEvent motionEvent) {
        return this.f32066h.dispatchHoverEvent(motionEvent) || super.dispatchHoverEvent(motionEvent);
    }

    @Override // android.view.View
    public boolean dispatchKeyEvent(@NonNull KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override // android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        this.f32057a.setColor(J(this.f32087r1));
        this.f32058b.setColor(J(this.f32085q1));
        this.f32061e.setColor(J(this.f32083p1));
        this.f32062f.setColor(J(this.f32081o1));
        this.f32065g.setColor(J(this.f32085q1));
        for (ao.a aVar : this.f32074l) {
            if (aVar.isStateful()) {
                aVar.setState(getDrawableState());
            }
        }
        if (this.f32095v1.isStateful()) {
            this.f32095v1.setState(getDrawableState());
        }
        this.f32060d.setColor(J(this.f32079n1));
        this.f32060d.setAlpha(63);
    }

    public final boolean e0() {
        int max = Math.max(this.f32102z, Math.max(this.C + getPaddingTop() + getPaddingBottom(), this.F + getPaddingTop() + getPaddingBottom()));
        if (max == this.A) {
            return false;
        }
        this.A = max;
        return true;
    }

    public final boolean f0(int i11) {
        int i12 = this.V;
        int clamp = (int) MathUtils.clamp(i12 + i11, 0L, this.T.size() - 1);
        this.V = clamp;
        if (clamp == i12) {
            return false;
        }
        if (this.U != -1) {
            this.U = clamp;
        }
        A0();
        postInvalidate();
        return true;
    }

    public final boolean g0(int i11) {
        if (V()) {
            i11 = i11 == Integer.MIN_VALUE ? Integer.MAX_VALUE : -i11;
        }
        return f0(i11);
    }

    @Override // android.view.View
    @NonNull
    public CharSequence getAccessibilityClassName() {
        return SeekBar.class.getName();
    }

    @VisibleForTesting
    public final int getAccessibilityFocusedVirtualViewId() {
        return this.f32066h.getAccessibilityFocusedVirtualViewId();
    }

    public int getActiveThumbIndex() {
        return this.U;
    }

    public int getFocusedThumbIndex() {
        return this.V;
    }

    @Px
    public int getHaloRadius() {
        return this.G;
    }

    @NonNull
    public ColorStateList getHaloTintList() {
        return this.f32079n1;
    }

    public int getLabelBehavior() {
        return this.B;
    }

    public float getMinSeparation() {
        return 0.0f;
    }

    public float getStepSize() {
        return this.W;
    }

    public float getThumbElevation() {
        return this.f32095v1.y();
    }

    @Px
    public int getThumbHeight() {
        return this.F;
    }

    @Px
    public int getThumbRadius() {
        return this.E / 2;
    }

    public ColorStateList getThumbStrokeColor() {
        return this.f32095v1.O();
    }

    public float getThumbStrokeWidth() {
        return this.f32095v1.R();
    }

    @NonNull
    public ColorStateList getThumbTintList() {
        return this.f32095v1.z();
    }

    public int getThumbTrackGapSize() {
        return this.H;
    }

    @Px
    public int getThumbWidth() {
        return this.E;
    }

    @Px
    public int getTickActiveRadius() {
        return this.f32067h1;
    }

    @NonNull
    public ColorStateList getTickActiveTintList() {
        return this.f32081o1;
    }

    @Px
    public int getTickInactiveRadius() {
        return this.f32069i1;
    }

    @NonNull
    public ColorStateList getTickInactiveTintList() {
        return this.f32083p1;
    }

    @NonNull
    public ColorStateList getTickTintList() {
        if (this.f32083p1.equals(this.f32081o1)) {
            return this.f32081o1;
        }
        throw new IllegalStateException("The inactive and active ticks are different colors. Use the getTickColorInactive() and getTickColorActive() methods instead.");
    }

    @NonNull
    public ColorStateList getTrackActiveTintList() {
        return this.f32085q1;
    }

    @Px
    public int getTrackHeight() {
        return this.C;
    }

    @NonNull
    public ColorStateList getTrackInactiveTintList() {
        return this.f32087r1;
    }

    public int getTrackInsideCornerSize() {
        return this.L;
    }

    @Px
    public int getTrackSidePadding() {
        return this.D;
    }

    public int getTrackStopIndicatorSize() {
        return this.K;
    }

    @NonNull
    public ColorStateList getTrackTintList() {
        if (this.f32087r1.equals(this.f32085q1)) {
            return this.f32085q1;
        }
        throw new IllegalStateException("The inactive and active parts of the track are different colors. Use the getInactiveTrackColor() and getActiveTrackColor() methods instead.");
    }

    @Px
    public int getTrackWidth() {
        return this.f32071j1;
    }

    public float getValueFrom() {
        return this.R;
    }

    public float getValueTo() {
        return this.S;
    }

    @NonNull
    public List<Float> getValues() {
        return new ArrayList(this.T);
    }

    public void h(@NonNull L l11) {
        this.f32076m.add(l11);
    }

    public final float h0(float f11) {
        float f12 = this.R;
        float f13 = (f11 - f12) / (this.S - f12);
        return V() ? 1.0f - f13 : f13;
    }

    public void i(@NonNull T t11) {
        this.f32078n.add(t11);
    }

    @Nullable
    public final Boolean i0(int i11, @NonNull KeyEvent keyEvent) {
        if (i11 == 61) {
            return keyEvent.hasNoModifiers() ? Boolean.valueOf(f0(1)) : keyEvent.isShiftPressed() ? Boolean.valueOf(f0(-1)) : Boolean.FALSE;
        }
        if (i11 != 66) {
            if (i11 != 81) {
                if (i11 == 69) {
                    f0(-1);
                    return Boolean.TRUE;
                }
                if (i11 != 70) {
                    switch (i11) {
                        case 21:
                            g0(-1);
                            break;
                        case 22:
                            g0(1);
                            break;
                    }
                    return Boolean.TRUE;
                }
            }
            f0(1);
            return Boolean.TRUE;
        }
        this.U = this.V;
        postInvalidate();
        return Boolean.TRUE;
    }

    public final void j(Drawable drawable) {
        int intrinsicWidth = drawable.getIntrinsicWidth();
        int intrinsicHeight = drawable.getIntrinsicHeight();
        if (intrinsicWidth == -1 && intrinsicHeight == -1) {
            drawable.setBounds(0, 0, this.E, this.F);
        } else {
            float max = Math.max(this.E, this.F) / Math.max(intrinsicWidth, intrinsicHeight);
            drawable.setBounds(0, 0, (int) (intrinsicWidth * max), (int) (intrinsicHeight * max));
        }
    }

    public final void j0() {
        Iterator<T> it = this.f32078n.iterator();
        while (it.hasNext()) {
            it.next().a(this);
        }
    }

    public final void k(ao.a aVar) {
        aVar.l1(m0.l(this));
    }

    public final void k0() {
        Iterator<T> it = this.f32078n.iterator();
        while (it.hasNext()) {
            it.next().b(this);
        }
    }

    @Nullable
    public final Float l(int i11) {
        float n11 = this.f32075l1 ? n(20) : m();
        if (i11 == 21) {
            if (!V()) {
                n11 = -n11;
            }
            return Float.valueOf(n11);
        }
        if (i11 == 22) {
            if (V()) {
                n11 = -n11;
            }
            return Float.valueOf(n11);
        }
        if (i11 == 69) {
            return Float.valueOf(-n11);
        }
        if (i11 == 70 || i11 == 81) {
            return Float.valueOf(n11);
        }
        return null;
    }

    public boolean l0() {
        if (this.U != -1) {
            return true;
        }
        float M = M();
        float M0 = M0(M);
        this.U = 0;
        float abs = Math.abs(this.T.get(0).floatValue() - M);
        for (int i11 = 1; i11 < this.T.size(); i11++) {
            float abs2 = Math.abs(this.T.get(i11).floatValue() - M);
            float M02 = M0(this.T.get(i11).floatValue());
            if (Float.compare(abs2, abs) > 0) {
                break;
            }
            boolean z11 = !V() ? M02 - M0 >= 0.0f : M02 - M0 <= 0.0f;
            if (Float.compare(abs2, abs) < 0) {
                this.U = i11;
            } else {
                if (Float.compare(abs2, abs) != 0) {
                    continue;
                } else {
                    if (Math.abs(M02 - M0) < this.f32086r) {
                        this.U = -1;
                        return false;
                    }
                    if (z11) {
                        this.U = i11;
                    }
                }
            }
            abs = abs2;
        }
        return this.U != -1;
    }

    public final float m() {
        float f11 = this.W;
        if (f11 == 0.0f) {
            return 1.0f;
        }
        return f11;
    }

    public final void m0(ao.a aVar, float f11) {
        int h02 = (this.D + ((int) (h0(f11) * this.f32071j1))) - (aVar.getIntrinsicWidth() / 2);
        int o11 = o() - (this.M + (this.F / 2));
        aVar.setBounds(h02, o11 - aVar.getIntrinsicHeight(), aVar.getIntrinsicWidth() + h02, o11);
        Rect rect = new Rect(aVar.getBounds());
        com.google.android.material.internal.d.c(m0.l(this), this, rect);
        aVar.setBounds(rect);
    }

    public final float n(int i11) {
        float m11 = m();
        return (this.S - this.R) / m11 <= i11 ? m11 : Math.round(r1 / r4) * m11;
    }

    public final void n0(Context context, AttributeSet attributeSet, int i11) {
        TypedArray k11 = d0.k(context, attributeSet, R.styleable.Slider, i11, P1, new int[0]);
        this.f32072k = k11.getResourceId(R.styleable.Slider_labelStyle, R.style.Widget_MaterialComponents_Tooltip);
        this.R = k11.getFloat(R.styleable.Slider_android_valueFrom, 0.0f);
        this.S = k11.getFloat(R.styleable.Slider_android_valueTo, 1.0f);
        setValues(Float.valueOf(this.R));
        this.W = k11.getFloat(R.styleable.Slider_android_stepSize, 0.0f);
        this.f32100y = (int) Math.ceil(k11.getDimension(R.styleable.Slider_minTouchTargetSize, (float) Math.ceil(m0.i(getContext(), 48))));
        int i12 = R.styleable.Slider_trackColor;
        boolean hasValue = k11.hasValue(i12);
        int i13 = hasValue ? i12 : R.styleable.Slider_trackColorInactive;
        if (!hasValue) {
            i12 = R.styleable.Slider_trackColorActive;
        }
        ColorStateList a11 = sn.c.a(context, k11, i13);
        if (a11 == null) {
            a11 = AppCompatResources.getColorStateList(context, R.color.material_slider_inactive_track_color);
        }
        setTrackInactiveTintList(a11);
        ColorStateList a12 = sn.c.a(context, k11, i12);
        if (a12 == null) {
            a12 = AppCompatResources.getColorStateList(context, R.color.material_slider_active_track_color);
        }
        setTrackActiveTintList(a12);
        this.f32095v1.p0(sn.c.a(context, k11, R.styleable.Slider_thumbColor));
        int i14 = R.styleable.Slider_thumbStrokeColor;
        if (k11.hasValue(i14)) {
            setThumbStrokeColor(sn.c.a(context, k11, i14));
        }
        setThumbStrokeWidth(k11.getDimension(R.styleable.Slider_thumbStrokeWidth, 0.0f));
        ColorStateList a13 = sn.c.a(context, k11, R.styleable.Slider_haloColor);
        if (a13 == null) {
            a13 = AppCompatResources.getColorStateList(context, R.color.material_slider_halo_color);
        }
        setHaloTintList(a13);
        this.f32064f1 = k11.getBoolean(R.styleable.Slider_tickVisible, true);
        int i15 = R.styleable.Slider_tickColor;
        boolean hasValue2 = k11.hasValue(i15);
        int i16 = hasValue2 ? i15 : R.styleable.Slider_tickColorInactive;
        if (!hasValue2) {
            i15 = R.styleable.Slider_tickColorActive;
        }
        ColorStateList a14 = sn.c.a(context, k11, i16);
        if (a14 == null) {
            a14 = AppCompatResources.getColorStateList(context, R.color.material_slider_inactive_tick_marks_color);
        }
        setTickInactiveTintList(a14);
        ColorStateList a15 = sn.c.a(context, k11, i15);
        if (a15 == null) {
            a15 = AppCompatResources.getColorStateList(context, R.color.material_slider_active_tick_marks_color);
        }
        setTickActiveTintList(a15);
        setThumbTrackGapSize(k11.getDimensionPixelSize(R.styleable.Slider_thumbTrackGapSize, 0));
        setTrackStopIndicatorSize(k11.getDimensionPixelSize(R.styleable.Slider_trackStopIndicatorSize, 0));
        setTrackInsideCornerSize(k11.getDimensionPixelSize(R.styleable.Slider_trackInsideCornerSize, 0));
        int dimensionPixelSize = k11.getDimensionPixelSize(R.styleable.Slider_thumbRadius, 0) * 2;
        int dimensionPixelSize2 = k11.getDimensionPixelSize(R.styleable.Slider_thumbWidth, dimensionPixelSize);
        int dimensionPixelSize3 = k11.getDimensionPixelSize(R.styleable.Slider_thumbHeight, dimensionPixelSize);
        setThumbWidth(dimensionPixelSize2);
        setThumbHeight(dimensionPixelSize3);
        setHaloRadius(k11.getDimensionPixelSize(R.styleable.Slider_haloRadius, 0));
        setThumbElevation(k11.getDimension(R.styleable.Slider_thumbElevation, 0.0f));
        setTrackHeight(k11.getDimensionPixelSize(R.styleable.Slider_trackHeight, 0));
        setTickActiveRadius(k11.getDimensionPixelSize(R.styleable.Slider_tickRadiusActive, this.K / 2));
        setTickInactiveRadius(k11.getDimensionPixelSize(R.styleable.Slider_tickRadiusInactive, this.K / 2));
        setLabelBehavior(k11.getInt(R.styleable.Slider_labelBehavior, 0));
        if (!k11.getBoolean(R.styleable.Slider_android_enabled, true)) {
            setEnabled(false);
        }
        k11.recycle();
    }

    public final int o() {
        return (this.A / 2) + ((this.B == 1 || t0()) ? this.f32074l.get(0).getIntrinsicHeight() : 0);
    }

    public void o0(@NonNull L l11) {
        this.f32076m.remove(l11);
    }

    @Override // android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        getViewTreeObserver().addOnScrollChangedListener(this.A1);
        Iterator<ao.a> it = this.f32074l.iterator();
        while (it.hasNext()) {
            k(it.next());
        }
    }

    @Override // android.view.View
    public void onDetachedFromWindow() {
        BaseSlider<S, L, T>.d dVar = this.f32070j;
        if (dVar != null) {
            removeCallbacks(dVar);
        }
        this.f32080o = false;
        Iterator<ao.a> it = this.f32074l.iterator();
        while (it.hasNext()) {
            t(it.next());
        }
        getViewTreeObserver().removeOnScrollChangedListener(this.A1);
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public void onDraw(@NonNull Canvas canvas) {
        if (this.f32077m1) {
            F0();
            Z();
        }
        super.onDraw(canvas);
        int o11 = o();
        float floatValue = this.T.get(0).floatValue();
        ArrayList<Float> arrayList = this.T;
        float floatValue2 = arrayList.get(arrayList.size() - 1).floatValue();
        if (floatValue2 < this.S || (this.T.size() > 1 && floatValue > this.R)) {
            y(canvas, this.f32071j1, o11);
        }
        if (floatValue2 > this.R) {
            x(canvas, this.f32071j1, o11);
        }
        c0(canvas);
        b0(canvas, o11);
        if ((this.Q || isFocused()) && isEnabled()) {
            a0(canvas, this.f32071j1, o11);
        }
        B0();
        A(canvas, this.f32071j1, o11);
    }

    @Override // android.view.View
    public void onFocusChanged(boolean z11, int i11, @Nullable Rect rect) {
        super.onFocusChanged(z11, i11, rect);
        if (z11) {
            D(i11);
            this.f32066h.requestKeyboardFocusForVirtualView(this.V);
        } else {
            this.U = -1;
            this.f32066h.clearKeyboardFocusForVirtualView(this.V);
        }
    }

    @Override // android.view.View, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i11, @NonNull KeyEvent keyEvent) {
        if (!isEnabled()) {
            return super.onKeyDown(i11, keyEvent);
        }
        if (this.T.size() == 1) {
            this.U = 0;
        }
        if (this.U == -1) {
            Boolean i02 = i0(i11, keyEvent);
            return i02 != null ? i02.booleanValue() : super.onKeyDown(i11, keyEvent);
        }
        this.f32075l1 |= keyEvent.isLongPress();
        Float l11 = l(i11);
        if (l11 != null) {
            if (v0(this.T.get(this.U).floatValue() + l11.floatValue())) {
                A0();
                postInvalidate();
            }
            return true;
        }
        if (i11 != 23) {
            if (i11 == 61) {
                if (keyEvent.hasNoModifiers()) {
                    return f0(1);
                }
                if (keyEvent.isShiftPressed()) {
                    return f0(-1);
                }
                return false;
            }
            if (i11 != 66) {
                return super.onKeyDown(i11, keyEvent);
            }
        }
        this.U = -1;
        postInvalidate();
        return true;
    }

    @Override // android.view.View, android.view.KeyEvent.Callback
    public boolean onKeyUp(int i11, @NonNull KeyEvent keyEvent) {
        this.f32075l1 = false;
        return super.onKeyUp(i11, keyEvent);
    }

    @Override // android.view.View
    public void onMeasure(int i11, int i12) {
        super.onMeasure(i11, View.MeasureSpec.makeMeasureSpec(this.A + ((this.B == 1 || t0()) ? this.f32074l.get(0).getIntrinsicHeight() : 0), 1073741824));
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        SliderState sliderState = (SliderState) parcelable;
        super.onRestoreInstanceState(sliderState.getSuperState());
        this.R = sliderState.f32104a;
        this.S = sliderState.f32105b;
        s0(sliderState.f32106c);
        this.W = sliderState.f32107d;
        if (sliderState.f32108e) {
            requestFocus();
        }
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        SliderState sliderState = new SliderState(super.onSaveInstanceState());
        sliderState.f32104a = this.R;
        sliderState.f32105b = this.S;
        sliderState.f32106c = new ArrayList<>(this.T);
        sliderState.f32107d = this.W;
        sliderState.f32108e = hasFocus();
        return sliderState;
    }

    @Override // android.view.View
    public void onSizeChanged(int i11, int i12, int i13, int i14) {
        D0(i11);
        A0();
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0033, code lost:
    
        if (r2 != 3) goto L56;
     */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean onTouchEvent(@androidx.annotation.NonNull android.view.MotionEvent r6) {
        /*
            Method dump skipped, instructions count: 305
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.slider.BaseSlider.onTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override // android.view.View
    public void onVisibilityChanged(@NonNull View view, int i11) {
        k0 m11;
        super.onVisibilityChanged(view, i11);
        if (i11 == 0 || (m11 = m0.m(this)) == null) {
            return;
        }
        Iterator<ao.a> it = this.f32074l.iterator();
        while (it.hasNext()) {
            m11.a(it.next());
        }
    }

    public void p() {
        this.f32076m.clear();
    }

    public void p0(@NonNull T t11) {
        this.f32078n.remove(t11);
    }

    public void q() {
        this.f32078n.clear();
    }

    public final void q0(int i11) {
        BaseSlider<S, L, T>.d dVar = this.f32070j;
        if (dVar == null) {
            this.f32070j = new d(this, null);
        } else {
            removeCallbacks(dVar);
        }
        this.f32070j.a(i11);
        postDelayed(this.f32070j, 200L);
    }

    public final ValueAnimator r(boolean z11) {
        int f11;
        TimeInterpolator g11;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(H(z11 ? this.f32084q : this.f32082p, z11 ? 0.0f : 1.0f), z11 ? 1.0f : 0.0f);
        if (z11) {
            f11 = j.f(getContext(), U1, 83);
            g11 = j.g(getContext(), W1, vm.b.f94064e);
        } else {
            f11 = j.f(getContext(), V1, 117);
            g11 = j.g(getContext(), X1, vm.b.f94062c);
        }
        ofFloat.setDuration(f11);
        ofFloat.setInterpolator(g11);
        ofFloat.addUpdateListener(new a());
        return ofFloat;
    }

    public final void r0(ao.a aVar, float f11) {
        aVar.n1(F(f11));
        m0(aVar, f11);
        m0.m(this).b(aVar);
    }

    public final void s() {
        if (this.f32074l.size() > this.T.size()) {
            List<ao.a> subList = this.f32074l.subList(this.T.size(), this.f32074l.size());
            for (ao.a aVar : subList) {
                if (ViewCompat.isAttachedToWindow(this)) {
                    t(aVar);
                }
            }
            subList.clear();
        }
        while (true) {
            if (this.f32074l.size() >= this.T.size()) {
                break;
            }
            ao.a W0 = ao.a.W0(getContext(), null, 0, this.f32072k);
            this.f32074l.add(W0);
            if (ViewCompat.isAttachedToWindow(this)) {
                k(W0);
            }
        }
        int i11 = this.f32074l.size() != 1 ? 1 : 0;
        Iterator<ao.a> it = this.f32074l.iterator();
        while (it.hasNext()) {
            it.next().J0(i11);
        }
    }

    public final void s0(@NonNull ArrayList<Float> arrayList) {
        if (arrayList.isEmpty()) {
            throw new IllegalArgumentException("At least one value must be set");
        }
        Collections.sort(arrayList);
        if (this.T.size() == arrayList.size() && this.T.equals(arrayList)) {
            return;
        }
        this.T = arrayList;
        this.f32077m1 = true;
        this.V = 0;
        A0();
        s();
        w();
        postInvalidate();
    }

    public void setActiveThumbIndex(int i11) {
        this.U = i11;
    }

    public void setCustomThumbDrawable(@DrawableRes int i11) {
        setCustomThumbDrawable(getResources().getDrawable(i11));
    }

    public void setCustomThumbDrawablesForValues(@NonNull @DrawableRes int... iArr) {
        Drawable[] drawableArr = new Drawable[iArr.length];
        for (int i11 = 0; i11 < iArr.length; i11++) {
            drawableArr[i11] = getResources().getDrawable(iArr[i11]);
        }
        setCustomThumbDrawablesForValues(drawableArr);
    }

    @Override // android.view.View
    public void setEnabled(boolean z11) {
        super.setEnabled(z11);
        setLayerType(z11 ? 0 : 2, null);
    }

    public void setFocusedThumbIndex(int i11) {
        if (i11 < 0 || i11 >= this.T.size()) {
            throw new IllegalArgumentException("index out of range");
        }
        this.V = i11;
        this.f32066h.requestKeyboardFocusForVirtualView(i11);
        postInvalidate();
    }

    public void setHaloRadius(@IntRange(from = 0) @Px int i11) {
        if (i11 == this.G) {
            return;
        }
        this.G = i11;
        Drawable background = getBackground();
        if (u0() || !(background instanceof RippleDrawable)) {
            postInvalidate();
        } else {
            kn.d.m((RippleDrawable) background, this.G);
        }
    }

    public void setHaloRadiusResource(@DimenRes int i11) {
        setHaloRadius(getResources().getDimensionPixelSize(i11));
    }

    public void setHaloTintList(@NonNull ColorStateList colorStateList) {
        if (colorStateList.equals(this.f32079n1)) {
            return;
        }
        this.f32079n1 = colorStateList;
        Drawable background = getBackground();
        if (!u0() && (background instanceof RippleDrawable)) {
            ((RippleDrawable) background).setColor(colorStateList);
            return;
        }
        this.f32060d.setColor(J(colorStateList));
        this.f32060d.setAlpha(63);
        invalidate();
    }

    public void setLabelBehavior(int i11) {
        if (this.B != i11) {
            this.B = i11;
            requestLayout();
        }
    }

    public void setLabelFormatter(@Nullable com.google.android.material.slider.e eVar) {
        this.P = eVar;
    }

    public void setSeparationUnit(int i11) {
        this.f32103z1 = i11;
        this.f32077m1 = true;
        postInvalidate();
    }

    public void setStepSize(float f11) {
        if (f11 < 0.0f) {
            throw new IllegalArgumentException(String.format(G1, Float.valueOf(f11), Float.valueOf(this.R), Float.valueOf(this.S)));
        }
        if (this.W != f11) {
            this.W = f11;
            this.f32077m1 = true;
            postInvalidate();
        }
    }

    public void setThumbElevation(float f11) {
        this.f32095v1.o0(f11);
    }

    public void setThumbElevationResource(@DimenRes int i11) {
        setThumbElevation(getResources().getDimension(i11));
    }

    public void setThumbHeight(@IntRange(from = 0) @Px int i11) {
        if (i11 == this.F) {
            return;
        }
        this.F = i11;
        this.f32095v1.setBounds(0, 0, this.E, i11);
        Drawable drawable = this.f32097w1;
        if (drawable != null) {
            j(drawable);
        }
        Iterator<Drawable> it = this.f32099x1.iterator();
        while (it.hasNext()) {
            j(it.next());
        }
        E0();
    }

    public void setThumbHeightResource(@DimenRes int i11) {
        setThumbHeight(getResources().getDimensionPixelSize(i11));
    }

    public void setThumbRadius(@IntRange(from = 0) @Px int i11) {
        int i12 = i11 * 2;
        setThumbWidth(i12);
        setThumbHeight(i12);
    }

    public void setThumbRadiusResource(@DimenRes int i11) {
        setThumbRadius(getResources().getDimensionPixelSize(i11));
    }

    public void setThumbStrokeColor(@Nullable ColorStateList colorStateList) {
        this.f32095v1.G0(colorStateList);
        postInvalidate();
    }

    public void setThumbStrokeColorResource(@ColorRes int i11) {
        if (i11 != 0) {
            setThumbStrokeColor(AppCompatResources.getColorStateList(getContext(), i11));
        }
    }

    public void setThumbStrokeWidth(float f11) {
        this.f32095v1.J0(f11);
        postInvalidate();
    }

    public void setThumbStrokeWidthResource(@DimenRes int i11) {
        if (i11 != 0) {
            setThumbStrokeWidth(getResources().getDimension(i11));
        }
    }

    public void setThumbTintList(@NonNull ColorStateList colorStateList) {
        if (colorStateList.equals(this.f32095v1.z())) {
            return;
        }
        this.f32095v1.p0(colorStateList);
        invalidate();
    }

    public void setThumbTrackGapSize(@Px int i11) {
        if (this.H == i11) {
            return;
        }
        this.H = i11;
        invalidate();
    }

    public void setThumbWidth(@IntRange(from = 0) @Px int i11) {
        if (i11 == this.E) {
            return;
        }
        this.E = i11;
        this.f32095v1.setShapeAppearanceModel(p.a().q(0, this.E / 2.0f).m());
        this.f32095v1.setBounds(0, 0, this.E, this.F);
        Drawable drawable = this.f32097w1;
        if (drawable != null) {
            j(drawable);
        }
        Iterator<Drawable> it = this.f32099x1.iterator();
        while (it.hasNext()) {
            j(it.next());
        }
        E0();
    }

    public void setThumbWidthResource(@DimenRes int i11) {
        setThumbWidth(getResources().getDimensionPixelSize(i11));
    }

    public void setTickActiveRadius(@IntRange(from = 0) @Px int i11) {
        if (this.f32067h1 != i11) {
            this.f32067h1 = i11;
            this.f32062f.setStrokeWidth(i11 * 2);
            E0();
        }
    }

    public void setTickActiveTintList(@NonNull ColorStateList colorStateList) {
        if (colorStateList.equals(this.f32081o1)) {
            return;
        }
        this.f32081o1 = colorStateList;
        this.f32062f.setColor(J(colorStateList));
        invalidate();
    }

    public void setTickInactiveRadius(@IntRange(from = 0) @Px int i11) {
        if (this.f32069i1 != i11) {
            this.f32069i1 = i11;
            this.f32061e.setStrokeWidth(i11 * 2);
            E0();
        }
    }

    public void setTickInactiveTintList(@NonNull ColorStateList colorStateList) {
        if (colorStateList.equals(this.f32083p1)) {
            return;
        }
        this.f32083p1 = colorStateList;
        this.f32061e.setColor(J(colorStateList));
        invalidate();
    }

    public void setTickTintList(@NonNull ColorStateList colorStateList) {
        setTickInactiveTintList(colorStateList);
        setTickActiveTintList(colorStateList);
    }

    public void setTickVisible(boolean z11) {
        if (this.f32064f1 != z11) {
            this.f32064f1 = z11;
            postInvalidate();
        }
    }

    public void setTrackActiveTintList(@NonNull ColorStateList colorStateList) {
        if (colorStateList.equals(this.f32085q1)) {
            return;
        }
        this.f32085q1 = colorStateList;
        this.f32058b.setColor(J(colorStateList));
        this.f32065g.setColor(J(this.f32085q1));
        invalidate();
    }

    public void setTrackHeight(@IntRange(from = 0) @Px int i11) {
        if (this.C != i11) {
            this.C = i11;
            Q();
            E0();
        }
    }

    public void setTrackInactiveTintList(@NonNull ColorStateList colorStateList) {
        if (colorStateList.equals(this.f32087r1)) {
            return;
        }
        this.f32087r1 = colorStateList;
        this.f32057a.setColor(J(colorStateList));
        invalidate();
    }

    public void setTrackInsideCornerSize(@Px int i11) {
        if (this.L == i11) {
            return;
        }
        this.L = i11;
        invalidate();
    }

    public void setTrackStopIndicatorSize(@Px int i11) {
        if (this.K == i11) {
            return;
        }
        this.K = i11;
        this.f32065g.setStrokeWidth(i11);
        invalidate();
    }

    public void setTrackTintList(@NonNull ColorStateList colorStateList) {
        setTrackInactiveTintList(colorStateList);
        setTrackActiveTintList(colorStateList);
    }

    public void setValueFrom(float f11) {
        this.R = f11;
        this.f32077m1 = true;
        postInvalidate();
    }

    public void setValueTo(float f11) {
        this.S = f11;
        this.f32077m1 = true;
        postInvalidate();
    }

    public void setValues(@NonNull Float... fArr) {
        ArrayList<Float> arrayList = new ArrayList<>();
        Collections.addAll(arrayList, fArr);
        s0(arrayList);
    }

    public final void t(ao.a aVar) {
        k0 m11 = m0.m(this);
        if (m11 != null) {
            m11.a(aVar);
            aVar.Y0(m0.l(this));
        }
    }

    public final boolean t0() {
        return this.B == 3;
    }

    public final float u(float f11) {
        if (f11 == 0.0f) {
            return 0.0f;
        }
        float f12 = (f11 - this.D) / this.f32071j1;
        float f13 = this.R;
        return (f12 * (f13 - this.S)) + f13;
    }

    public final boolean u0() {
        return this.f32073k1 || !(getBackground() instanceof RippleDrawable);
    }

    public final void v(int i11) {
        Iterator<L> it = this.f32076m.iterator();
        while (it.hasNext()) {
            it.next().a(this, this.T.get(i11).floatValue(), true);
        }
        AccessibilityManager accessibilityManager = this.f32068i;
        if (accessibilityManager == null || !accessibilityManager.isEnabled()) {
            return;
        }
        q0(i11);
    }

    public final boolean v0(float f11) {
        return x0(this.U, f11);
    }

    public final void w() {
        for (L l11 : this.f32076m) {
            Iterator<Float> it = this.T.iterator();
            while (it.hasNext()) {
                l11.a(this, it.next().floatValue(), false);
            }
        }
    }

    public final double w0(float f11) {
        float f12 = this.W;
        if (f12 <= 0.0f) {
            return f11;
        }
        return Math.round(f11 * r0) / ((int) ((this.S - this.R) / f12));
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00b5 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void x(@androidx.annotation.NonNull android.graphics.Canvas r12, int r13, int r14) {
        /*
            Method dump skipped, instructions count: 209
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.slider.BaseSlider.x(android.graphics.Canvas, int, int):void");
    }

    public final boolean x0(int i11, float f11) {
        this.V = i11;
        if (Math.abs(f11 - this.T.get(i11).floatValue()) < 1.0E-4d) {
            return false;
        }
        this.T.set(i11, Float.valueOf(I(i11, f11)));
        v(i11);
        return true;
    }

    public final void y(@NonNull Canvas canvas, int i11, int i12) {
        float[] G = G();
        float f11 = i11;
        float f12 = this.D + (G[1] * f11);
        if (f12 < r2 + i11) {
            if (N()) {
                float f13 = i12;
                int i13 = this.C;
                this.f32091t1.set(f12 + this.H, f13 - (i13 / 2.0f), this.D + i11 + (i13 / 2.0f), f13 + (i13 / 2.0f));
                C0(canvas, this.f32057a, this.f32091t1, f.RIGHT);
            } else {
                this.f32057a.setStyle(Paint.Style.STROKE);
                this.f32057a.setStrokeCap(Paint.Cap.ROUND);
                float f14 = i12;
                canvas.drawLine(f12, f14, this.D + i11, f14, this.f32057a);
            }
        }
        int i14 = this.D;
        float f15 = (G[0] * f11) + i14;
        if (f15 > i14) {
            if (!N()) {
                this.f32057a.setStyle(Paint.Style.STROKE);
                this.f32057a.setStrokeCap(Paint.Cap.ROUND);
                float f16 = i12;
                canvas.drawLine(this.D, f16, f15, f16, this.f32057a);
                return;
            }
            RectF rectF = this.f32091t1;
            float f17 = this.D;
            int i15 = this.C;
            float f18 = i12;
            rectF.set(f17 - (i15 / 2.0f), f18 - (i15 / 2.0f), f15 - this.H, f18 + (i15 / 2.0f));
            C0(canvas, this.f32057a, this.f32091t1, f.LEFT);
        }
    }

    public final boolean y0() {
        return v0(L());
    }

    public final void z(@NonNull Canvas canvas, int i11, int i12, float f11, @NonNull Drawable drawable) {
        canvas.save();
        canvas.translate((this.D + ((int) (h0(f11) * i11))) - (drawable.getBounds().width() / 2.0f), i12 - (drawable.getBounds().height() / 2.0f));
        drawable.draw(canvas);
        canvas.restore();
    }

    public void z0(int i11, Rect rect) {
        int h02 = this.D + ((int) (h0(getValues().get(i11).floatValue()) * this.f32071j1));
        int o11 = o();
        int max = Math.max(this.E / 2, this.f32100y / 2);
        int max2 = Math.max(this.F / 2, this.f32100y / 2);
        rect.set(h02 - max, o11 - max2, h02 + max, o11 + max2);
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class d implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        public int f32112a;

        public d() {
            this.f32112a = -1;
        }

        public void a(int i11) {
            this.f32112a = i11;
        }

        @Override // java.lang.Runnable
        public void run() {
            BaseSlider.this.f32066h.sendEventForVirtualView(this.f32112a, 4);
        }

        public /* synthetic */ d(BaseSlider baseSlider, a aVar) {
            this();
        }
    }

    public BaseSlider(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.sliderStyle);
    }

    public void setCustomThumbDrawable(@NonNull Drawable drawable) {
        this.f32097w1 = P(drawable);
        this.f32099x1.clear();
        postInvalidate();
    }

    public BaseSlider(@NonNull Context context, @Nullable AttributeSet attributeSet, int i11) {
        super(zn.a.c(context, attributeSet, i11, P1), attributeSet, i11);
        this.f32074l = new ArrayList();
        this.f32076m = new ArrayList();
        this.f32078n = new ArrayList();
        this.f32080o = false;
        this.I = -1;
        this.J = -1;
        this.Q = false;
        this.T = new ArrayList<>();
        this.U = -1;
        this.V = -1;
        this.W = 0.0f;
        this.f32064f1 = true;
        this.f32075l1 = false;
        this.f32089s1 = new Path();
        this.f32091t1 = new RectF();
        this.f32093u1 = new RectF();
        k kVar = new k();
        this.f32095v1 = kVar;
        this.f32099x1 = Collections.EMPTY_LIST;
        this.f32103z1 = 0;
        this.A1 = new ViewTreeObserver.OnScrollChangedListener() { // from class: com.google.android.material.slider.c
            @Override // android.view.ViewTreeObserver.OnScrollChangedListener
            public final void onScrollChanged() {
                BaseSlider.this.B0();
            }
        };
        Context context2 = getContext();
        this.f32057a = new Paint();
        this.f32058b = new Paint();
        Paint paint = new Paint(1);
        this.f32059c = paint;
        Paint.Style style = Paint.Style.FILL;
        paint.setStyle(style);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
        Paint paint2 = new Paint(1);
        this.f32060d = paint2;
        paint2.setStyle(style);
        Paint paint3 = new Paint();
        this.f32061e = paint3;
        Paint.Style style2 = Paint.Style.STROKE;
        paint3.setStyle(style2);
        Paint.Cap cap = Paint.Cap.ROUND;
        paint3.setStrokeCap(cap);
        Paint paint4 = new Paint();
        this.f32062f = paint4;
        paint4.setStyle(style2);
        paint4.setStrokeCap(cap);
        Paint paint5 = new Paint();
        this.f32065g = paint5;
        paint5.setStyle(style);
        paint5.setStrokeCap(cap);
        Y(context2.getResources());
        n0(context2, attributeSet, i11);
        setFocusable(true);
        setClickable(true);
        kVar.y0(2);
        this.f32086r = ViewConfiguration.get(context2).getScaledTouchSlop();
        e eVar = new e(this);
        this.f32066h = eVar;
        ViewCompat.setAccessibilityDelegate(this, eVar);
        this.f32068i = (AccessibilityManager) getContext().getSystemService("accessibility");
    }

    public void setValues(@NonNull List<Float> list) {
        s0(new ArrayList<>(list));
    }

    public void setCustomThumbDrawablesForValues(@NonNull Drawable... drawableArr) {
        this.f32097w1 = null;
        this.f32099x1 = new ArrayList();
        for (Drawable drawable : drawableArr) {
            this.f32099x1.add(P(drawable));
        }
        postInvalidate();
    }
}
