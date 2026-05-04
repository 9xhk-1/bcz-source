package com.ogaclejapan.smarttablayout;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.View;
import android.widget.LinearLayout;
import com.ogaclejapan.smarttablayout.SmartTabLayout;
import ft.c;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public class a extends LinearLayout {
    public static final int A = 2;
    public static final int B = -1;
    public static final int C = 0;
    public static final byte D = 38;
    public static final int E = 2;
    public static final byte F = 38;
    public static final int G = 8;
    public static final int H = -13388315;
    public static final float I = 0.0f;
    public static final int J = 1;
    public static final byte K = 32;
    public static final float L = 0.5f;
    public static final boolean M = false;
    public static final boolean N = false;
    public static final boolean O = false;
    public static final int P = 0;
    public static final boolean Q = false;

    /* renamed from: y, reason: collision with root package name */
    public static final int f41518y = 0;

    /* renamed from: z, reason: collision with root package name */
    public static final int f41519z = 1;

    /* renamed from: a, reason: collision with root package name */
    public final int f41520a;

    /* renamed from: b, reason: collision with root package name */
    public final int f41521b;

    /* renamed from: c, reason: collision with root package name */
    public final int f41522c;

    /* renamed from: d, reason: collision with root package name */
    public final int f41523d;

    /* renamed from: e, reason: collision with root package name */
    public final Paint f41524e;

    /* renamed from: f, reason: collision with root package name */
    public final RectF f41525f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f41526g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f41527h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f41528i;

    /* renamed from: j, reason: collision with root package name */
    public final int f41529j;

    /* renamed from: k, reason: collision with root package name */
    public final int f41530k;

    /* renamed from: l, reason: collision with root package name */
    public final int f41531l;

    /* renamed from: m, reason: collision with root package name */
    public final float f41532m;

    /* renamed from: n, reason: collision with root package name */
    public final Paint f41533n;

    /* renamed from: o, reason: collision with root package name */
    public final int f41534o;

    /* renamed from: p, reason: collision with root package name */
    public final Paint f41535p;

    /* renamed from: q, reason: collision with root package name */
    public final float f41536q;

    /* renamed from: r, reason: collision with root package name */
    public final b f41537r;

    /* renamed from: s, reason: collision with root package name */
    public final boolean f41538s;

    /* renamed from: t, reason: collision with root package name */
    public int f41539t;

    /* renamed from: u, reason: collision with root package name */
    public int f41540u;

    /* renamed from: v, reason: collision with root package name */
    public float f41541v;

    /* renamed from: w, reason: collision with root package name */
    public ft.b f41542w;

    /* renamed from: x, reason: collision with root package name */
    public SmartTabLayout.g f41543x;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class b implements SmartTabLayout.g {

        /* renamed from: a, reason: collision with root package name */
        public int[] f41544a;

        /* renamed from: b, reason: collision with root package name */
        public int[] f41545b;

        public b() {
        }

        @Override // com.ogaclejapan.smarttablayout.SmartTabLayout.g
        public final int a(int i11) {
            int[] iArr = this.f41544a;
            return iArr[i11 % iArr.length];
        }

        @Override // com.ogaclejapan.smarttablayout.SmartTabLayout.g
        public final int b(int i11) {
            int[] iArr = this.f41545b;
            return iArr[i11 % iArr.length];
        }

        public void c(int... iArr) {
            this.f41545b = iArr;
        }

        public void d(int... iArr) {
            this.f41544a = iArr;
        }
    }

    public a(Context context, AttributeSet attributeSet) {
        super(context);
        char c11;
        int[] intArray;
        int[] intArray2;
        this.f41525f = new RectF();
        setWillNotDraw(false);
        float f11 = getResources().getDisplayMetrics().density;
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(android.R.attr.colorForeground, typedValue, true);
        int i11 = typedValue.data;
        float f12 = 0.0f * f11;
        int j11 = j(i11, (byte) 38);
        int i12 = (int) f12;
        int j12 = j(i11, (byte) 38);
        int j13 = j(i11, (byte) 32);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.stl_SmartTabLayout);
        boolean z11 = obtainStyledAttributes.getBoolean(R.styleable.stl_SmartTabLayout_stl_indicatorAlwaysInCenter, false);
        boolean z12 = obtainStyledAttributes.getBoolean(R.styleable.stl_SmartTabLayout_stl_indicatorWithoutPadding, false);
        boolean z13 = obtainStyledAttributes.getBoolean(R.styleable.stl_SmartTabLayout_stl_indicatorInFront, false);
        int i13 = obtainStyledAttributes.getInt(R.styleable.stl_SmartTabLayout_stl_indicatorInterpolation, 0);
        int i14 = obtainStyledAttributes.getInt(R.styleable.stl_SmartTabLayout_stl_indicatorGravity, 0);
        int color = obtainStyledAttributes.getColor(R.styleable.stl_SmartTabLayout_stl_indicatorColor, -13388315);
        int resourceId = obtainStyledAttributes.getResourceId(R.styleable.stl_SmartTabLayout_stl_indicatorColors, -1);
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(R.styleable.stl_SmartTabLayout_stl_indicatorThickness, (int) (8.0f * f11));
        int layoutDimension = obtainStyledAttributes.getLayoutDimension(R.styleable.stl_SmartTabLayout_stl_indicatorWidth, -1);
        float dimension = obtainStyledAttributes.getDimension(R.styleable.stl_SmartTabLayout_stl_indicatorCornerRadius, f12);
        int color2 = obtainStyledAttributes.getColor(R.styleable.stl_SmartTabLayout_stl_overlineColor, j11);
        int dimensionPixelSize2 = obtainStyledAttributes.getDimensionPixelSize(R.styleable.stl_SmartTabLayout_stl_overlineThickness, i12);
        int color3 = obtainStyledAttributes.getColor(R.styleable.stl_SmartTabLayout_stl_underlineColor, j12);
        int dimensionPixelSize3 = obtainStyledAttributes.getDimensionPixelSize(R.styleable.stl_SmartTabLayout_stl_underlineThickness, (int) (2.0f * f11));
        int color4 = obtainStyledAttributes.getColor(R.styleable.stl_SmartTabLayout_stl_dividerColor, j13);
        int resourceId2 = obtainStyledAttributes.getResourceId(R.styleable.stl_SmartTabLayout_stl_dividerColors, -1);
        int dimensionPixelSize4 = obtainStyledAttributes.getDimensionPixelSize(R.styleable.stl_SmartTabLayout_stl_dividerThickness, (int) (f11 * 1.0f));
        boolean z14 = obtainStyledAttributes.getBoolean(R.styleable.stl_SmartTabLayout_stl_drawDecorationAfterTab, false);
        obtainStyledAttributes.recycle();
        if (resourceId == -1) {
            c11 = 0;
            intArray = new int[]{color};
        } else {
            c11 = 0;
            intArray = getResources().getIntArray(resourceId);
        }
        if (resourceId2 == -1) {
            intArray2 = new int[1];
            intArray2[c11] = color4;
        } else {
            intArray2 = getResources().getIntArray(resourceId2);
        }
        b bVar = new b();
        this.f41537r = bVar;
        bVar.d(intArray);
        bVar.c(intArray2);
        this.f41520a = dimensionPixelSize2;
        this.f41521b = color2;
        this.f41522c = dimensionPixelSize3;
        this.f41523d = color3;
        this.f41524e = new Paint(1);
        this.f41527h = z11;
        this.f41526g = z12;
        this.f41528i = z13;
        this.f41529j = dimensionPixelSize;
        this.f41530k = layoutDimension;
        this.f41533n = new Paint(1);
        this.f41532m = dimension;
        this.f41531l = i14;
        this.f41536q = 0.5f;
        Paint paint = new Paint(1);
        this.f41535p = paint;
        paint.setStrokeWidth(dimensionPixelSize4);
        this.f41534o = dimensionPixelSize4;
        this.f41538s = z14;
        this.f41542w = ft.b.d(i13);
    }

    public static int a(int i11, int i12, float f11) {
        float f12 = 1.0f - f11;
        return Color.rgb((int) ((Color.red(i11) * f11) + (Color.red(i12) * f12)), (int) ((Color.green(i11) * f11) + (Color.green(i12) * f12)), (int) ((Color.blue(i11) * f11) + (Color.blue(i12) * f12)));
    }

    public static int j(int i11, byte b11) {
        return Color.argb((int) b11, Color.red(i11), Color.green(i11), Color.blue(i11));
    }

    public final void b(Canvas canvas) {
        int height = getHeight();
        int width = getWidth();
        int childCount = getChildCount();
        SmartTabLayout.g g11 = g();
        boolean n11 = c.n(this);
        if (this.f41528i) {
            d(canvas, 0, width);
            f(canvas, 0, width, height);
        }
        if (childCount > 0) {
            View childAt = getChildAt(this.f41540u);
            int k11 = c.k(childAt, this.f41526g);
            int b11 = c.b(childAt, this.f41526g);
            if (n11) {
                k11 = b11;
                b11 = k11;
            }
            int a11 = g11.a(this.f41540u);
            float f11 = this.f41529j;
            if (this.f41541v > 0.0f && this.f41540u < getChildCount() - 1) {
                int a12 = g11.a(this.f41540u + 1);
                if (a11 != a12) {
                    a11 = a(a12, a11, this.f41541v);
                }
                float a13 = this.f41542w.a(this.f41541v);
                float b12 = this.f41542w.b(this.f41541v);
                float c11 = this.f41542w.c(this.f41541v);
                View childAt2 = getChildAt(this.f41540u + 1);
                int k12 = c.k(childAt2, this.f41526g);
                int b13 = c.b(childAt2, this.f41526g);
                if (n11) {
                    b11 = (int) ((k12 * a13) + ((1.0f - a13) * b11));
                    k11 = (int) ((b13 * b12) + ((1.0f - b12) * k11));
                } else {
                    k11 = (int) ((k12 * a13) + ((1.0f - a13) * k11));
                    b11 = (int) ((b13 * b12) + ((1.0f - b12) * b11));
                }
                f11 *= c11;
            }
            c(canvas, k11, b11, height, f11, a11);
        }
        if (!this.f41528i) {
            d(canvas, 0, width);
            f(canvas, 0, getWidth(), height);
        }
        e(canvas, height, childCount);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x002b  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0033  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void c(android.graphics.Canvas r5, int r6, int r7, int r8, float r9, int r10) {
        /*
            r4 = this;
            int r0 = r4.f41529j
            if (r0 <= 0) goto L5d
            int r1 = r4.f41530k
            if (r1 != 0) goto L9
            goto L5d
        L9:
            int r1 = r4.f41531l
            r2 = 1
            r3 = 1073741824(0x40000000, float:2.0)
            if (r1 == r2) goto L1f
            r2 = 2
            if (r1 == r2) goto L1c
            float r8 = (float) r8
            float r0 = (float) r0
            float r0 = r0 / r3
            float r8 = r8 - r0
        L17:
            float r9 = r9 / r3
            float r0 = r8 - r9
            float r8 = r8 + r9
            goto L21
        L1c:
            float r8 = (float) r8
        L1d:
            float r8 = r8 / r3
            goto L17
        L1f:
            float r8 = (float) r0
            goto L1d
        L21:
            android.graphics.Paint r9 = r4.f41533n
            r9.setColor(r10)
            int r9 = r4.f41530k
            r10 = -1
            if (r9 != r10) goto L33
            android.graphics.RectF r9 = r4.f41525f
            float r6 = (float) r6
            float r7 = (float) r7
            r9.set(r6, r0, r7, r8)
            goto L47
        L33:
            int r9 = r6 - r7
            int r9 = java.lang.Math.abs(r9)
            int r10 = r4.f41530k
            int r9 = r9 - r10
            float r9 = (float) r9
            float r9 = r9 / r3
            android.graphics.RectF r10 = r4.f41525f
            float r6 = (float) r6
            float r6 = r6 + r9
            float r7 = (float) r7
            float r7 = r7 - r9
            r10.set(r6, r0, r7, r8)
        L47:
            float r6 = r4.f41532m
            r7 = 0
            int r7 = (r6 > r7 ? 1 : (r6 == r7 ? 0 : -1))
            if (r7 <= 0) goto L56
            android.graphics.RectF r7 = r4.f41525f
            android.graphics.Paint r8 = r4.f41533n
            r5.drawRoundRect(r7, r6, r6, r8)
            return
        L56:
            android.graphics.RectF r6 = r4.f41525f
            android.graphics.Paint r7 = r4.f41533n
            r5.drawRect(r6, r7)
        L5d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ogaclejapan.smarttablayout.a.c(android.graphics.Canvas, int, int, int, float, int):void");
    }

    public final void d(Canvas canvas, int i11, int i12) {
        if (this.f41520a <= 0) {
            return;
        }
        this.f41524e.setColor(this.f41521b);
        canvas.drawRect(i11, 0.0f, i12, this.f41520a, this.f41524e);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        if (this.f41538s) {
            b(canvas);
        }
    }

    public final void e(Canvas canvas, int i11, int i12) {
        if (this.f41534o <= 0) {
            return;
        }
        int min = (int) (Math.min(Math.max(0.0f, this.f41536q), 1.0f) * i11);
        SmartTabLayout.g g11 = g();
        int i13 = (i11 - min) / 2;
        int i14 = min + i13;
        boolean n11 = c.n(this);
        for (int i15 = 0; i15 < i12 - 1; i15++) {
            View childAt = getChildAt(i15);
            int a11 = c.a(childAt);
            int c11 = c.c(childAt);
            int i16 = n11 ? a11 - c11 : a11 + c11;
            this.f41535p.setColor(g11.b(i15));
            float f11 = i16;
            canvas.drawLine(f11, i13, f11, i14, this.f41535p);
        }
    }

    public final void f(Canvas canvas, int i11, int i12, int i13) {
        if (this.f41522c <= 0) {
            return;
        }
        this.f41524e.setColor(this.f41523d);
        canvas.drawRect(i11, i13 - this.f41522c, i12, i13, this.f41524e);
    }

    public SmartTabLayout.g g() {
        SmartTabLayout.g gVar = this.f41543x;
        return gVar != null ? gVar : this.f41537r;
    }

    public boolean h() {
        return this.f41527h;
    }

    public void i(int i11, float f11) {
        this.f41540u = i11;
        this.f41541v = f11;
        if (f11 == 0.0f && this.f41539t != i11) {
            this.f41539t = i11;
        }
        invalidate();
    }

    public void k(SmartTabLayout.g gVar) {
        this.f41543x = gVar;
        invalidate();
    }

    public void l(int... iArr) {
        this.f41543x = null;
        this.f41537r.c(iArr);
        invalidate();
    }

    public void m(ft.b bVar) {
        this.f41542w = bVar;
        invalidate();
    }

    public void n(int... iArr) {
        this.f41543x = null;
        this.f41537r.d(iArr);
        invalidate();
    }

    @Override // android.widget.LinearLayout, android.view.View
    public void onDraw(Canvas canvas) {
        if (this.f41538s) {
            return;
        }
        b(canvas);
    }
}
