package com.google.android.material.chip;

import android.R;
import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.text.TextUtils;
import android.util.AttributeSet;
import androidx.annotation.AnimatorRes;
import androidx.annotation.AttrRes;
import androidx.annotation.BoolRes;
import androidx.annotation.ColorInt;
import androidx.annotation.ColorRes;
import androidx.annotation.DimenRes;
import androidx.annotation.Dimension;
import androidx.annotation.DrawableRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.Px;
import androidx.annotation.StringRes;
import androidx.annotation.StyleRes;
import androidx.annotation.XmlRes;
import androidx.appcompat.content.res.AppCompatResources;
import androidx.core.graphics.ColorUtils;
import androidx.core.graphics.drawable.DrawableCompat;
import androidx.core.graphics.drawable.TintAwareDrawable;
import androidx.core.text.BidiFormatter;
import com.google.android.material.internal.a0;
import com.google.android.material.internal.d0;
import com.google.android.material.internal.m0;
import en.u;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import kn.d;
import sn.c;
import tn.b;
import vm.i;
import vn.k;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public class a extends k implements TintAwareDrawable, Drawable.Callback, a0.b {
    public static final boolean T1 = false;
    public static final String V1 = "http://schemas.android.com/apk/res-auto";
    public static final int W1 = 24;

    @ColorInt
    public int A1;

    @ColorInt
    public int B1;

    @ColorInt
    public int C1;

    @ColorInt
    public int D1;

    @Nullable
    public ColorStateList E;
    public boolean E1;

    @Nullable
    public ColorStateList F;

    @ColorInt
    public int F1;
    public float G;
    public int G1;
    public float H;

    @Nullable
    public ColorFilter H1;

    @Nullable
    public ColorStateList I;

    @Nullable
    public PorterDuffColorFilter I1;
    public float J;

    @Nullable
    public ColorStateList J1;

    @Nullable
    public ColorStateList K;

    @Nullable
    public PorterDuff.Mode K1;

    @Nullable
    public CharSequence L;
    public int[] L1;
    public boolean M;
    public boolean M1;

    @Nullable
    public Drawable N;

    @Nullable
    public ColorStateList N1;

    @Nullable
    public ColorStateList O;

    @NonNull
    public WeakReference<InterfaceC0369a> O1;
    public float P;
    public TextUtils.TruncateAt P1;
    public boolean Q;
    public boolean Q1;
    public boolean R;
    public int R1;

    @Nullable
    public Drawable S;
    public boolean S1;

    @Nullable
    public Drawable T;

    @Nullable
    public ColorStateList U;
    public float V;

    @Nullable
    public CharSequence W;
    public boolean X;
    public boolean Y;

    @Nullable
    public Drawable Z;

    /* renamed from: f0, reason: collision with root package name */
    @Nullable
    public ColorStateList f31027f0;

    /* renamed from: f1, reason: collision with root package name */
    @Nullable
    public i f31028f1;

    /* renamed from: h1, reason: collision with root package name */
    @Nullable
    public i f31029h1;

    /* renamed from: i1, reason: collision with root package name */
    public float f31030i1;

    /* renamed from: j1, reason: collision with root package name */
    public float f31031j1;

    /* renamed from: k1, reason: collision with root package name */
    public float f31032k1;

    /* renamed from: l1, reason: collision with root package name */
    public float f31033l1;

    /* renamed from: m1, reason: collision with root package name */
    public float f31034m1;

    /* renamed from: n1, reason: collision with root package name */
    public float f31035n1;

    /* renamed from: o1, reason: collision with root package name */
    public float f31036o1;

    /* renamed from: p1, reason: collision with root package name */
    public float f31037p1;

    /* renamed from: q1, reason: collision with root package name */
    @NonNull
    public final Context f31038q1;

    /* renamed from: r1, reason: collision with root package name */
    public final Paint f31039r1;

    /* renamed from: s1, reason: collision with root package name */
    @Nullable
    public final Paint f31040s1;

    /* renamed from: t1, reason: collision with root package name */
    public final Paint.FontMetrics f31041t1;

    /* renamed from: u1, reason: collision with root package name */
    public final RectF f31042u1;

    /* renamed from: v1, reason: collision with root package name */
    public final PointF f31043v1;

    /* renamed from: w1, reason: collision with root package name */
    public final Path f31044w1;

    /* renamed from: x1, reason: collision with root package name */
    @NonNull
    public final a0 f31045x1;

    /* renamed from: y1, reason: collision with root package name */
    @ColorInt
    public int f31046y1;

    /* renamed from: z1, reason: collision with root package name */
    @ColorInt
    public int f31047z1;
    public static final int[] U1 = {R.attr.state_enabled};
    public static final ShapeDrawable X1 = new ShapeDrawable(new OvalShape());

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    /* renamed from: com.google.android.material.chip.a$a, reason: collision with other inner class name */
    public interface InterfaceC0369a {
        void a();
    }

    public a(@NonNull Context context, AttributeSet attributeSet, @AttrRes int i11, @StyleRes int i12) {
        super(context, attributeSet, i11, i12);
        this.H = -1.0f;
        this.f31039r1 = new Paint(1);
        this.f31041t1 = new Paint.FontMetrics();
        this.f31042u1 = new RectF();
        this.f31043v1 = new PointF();
        this.f31044w1 = new Path();
        this.G1 = 255;
        this.K1 = PorterDuff.Mode.SRC_IN;
        this.O1 = new WeakReference<>(null);
        a0(context);
        this.f31038q1 = context;
        a0 a0Var = new a0(this);
        this.f31045x1 = a0Var;
        this.L = "";
        a0Var.g().density = context.getResources().getDisplayMetrics().density;
        this.f31040s1 = null;
        int[] iArr = U1;
        setState(iArr);
        g3(iArr);
        this.Q1 = true;
        if (b.f90831a) {
            X1.setTint(-1);
        }
    }

    public static boolean W1(@Nullable int[] iArr, @AttrRes int i11) {
        if (iArr == null) {
            return false;
        }
        for (int i12 : iArr) {
            if (i12 == i11) {
                return true;
            }
        }
        return false;
    }

    @NonNull
    public static a b1(@NonNull Context context, @Nullable AttributeSet attributeSet, @AttrRes int i11, @StyleRes int i12) {
        a aVar = new a(context, attributeSet, i11, i12);
        aVar.j2(attributeSet, i11, i12);
        return aVar;
    }

    @NonNull
    public static a c1(@NonNull Context context, @XmlRes int i11) {
        AttributeSet k11 = d.k(context, i11, "chip");
        int styleAttribute = k11.getStyleAttribute();
        if (styleAttribute == 0) {
            styleAttribute = com.google.android.material.R.style.Widget_MaterialComponents_Chip_Entry;
        }
        return b1(context, k11, com.google.android.material.R.attr.chipStandaloneStyle, styleAttribute);
    }

    public static boolean g2(@Nullable ColorStateList colorStateList) {
        return colorStateList != null && colorStateList.isStateful();
    }

    public static boolean h2(@Nullable Drawable drawable) {
        return drawable != null && drawable.isStateful();
    }

    public static boolean i2(@Nullable sn.d dVar) {
        return (dVar == null || dVar.i() == null || !dVar.i().isStateful()) ? false : true;
    }

    @Nullable
    public CharSequence A1() {
        return this.W;
    }

    public void A2(float f11) {
        if (this.f31037p1 != f11) {
            this.f31037p1 = f11;
            invalidateSelf();
            k2();
        }
    }

    public void A3(@Nullable sn.d dVar) {
        this.f31045x1.l(dVar, this.f31038q1);
    }

    public float B1() {
        return this.f31036o1;
    }

    public void B2(@DimenRes int i11) {
        A2(this.f31038q1.getResources().getDimension(i11));
    }

    public void B3(@StyleRes int i11) {
        A3(new sn.d(this.f31038q1, i11));
    }

    public float C1() {
        return this.V;
    }

    public void C2(@Nullable Drawable drawable) {
        Drawable r12 = r1();
        if (r12 != drawable) {
            float S0 = S0();
            this.N = drawable != null ? DrawableCompat.wrap(drawable).mutate() : null;
            float S02 = S0();
            P3(r12);
            if (N3()) {
                Q0(this.N);
            }
            invalidateSelf();
            if (S0 != S02) {
                k2();
            }
        }
    }

    public void C3(@ColorInt int i11) {
        D3(ColorStateList.valueOf(i11));
    }

    public float D1() {
        return this.f31035n1;
    }

    @Deprecated
    public void D2(boolean z11) {
        L2(z11);
    }

    public void D3(@Nullable ColorStateList colorStateList) {
        sn.d R1 = R1();
        if (R1 != null) {
            R1.k(colorStateList);
            invalidateSelf();
        }
    }

    @NonNull
    public int[] E1() {
        return this.L1;
    }

    @Deprecated
    public void E2(@BoolRes int i11) {
        K2(i11);
    }

    public void E3(float f11) {
        if (this.f31034m1 != f11) {
            this.f31034m1 = f11;
            invalidateSelf();
            k2();
        }
    }

    @Nullable
    public ColorStateList F1() {
        return this.U;
    }

    public void F2(@DrawableRes int i11) {
        C2(AppCompatResources.getDrawable(this.f31038q1, i11));
    }

    public void F3(@DimenRes int i11) {
        E3(this.f31038q1.getResources().getDimension(i11));
    }

    public void G1(@NonNull RectF rectF) {
        V0(getBounds(), rectF);
    }

    public void G2(float f11) {
        if (this.P != f11) {
            float S0 = S0();
            this.P = f11;
            float S02 = S0();
            invalidateSelf();
            if (S0 != S02) {
                k2();
            }
        }
    }

    public void G3(@StringRes int i11) {
        z3(this.f31038q1.getResources().getString(i11));
    }

    public final float H1() {
        Drawable drawable = this.E1 ? this.Z : this.N;
        float f11 = this.P;
        if (f11 <= 0.0f && drawable != null) {
            f11 = (float) Math.ceil(m0.i(this.f31038q1, 24));
            if (drawable.getIntrinsicHeight() <= f11) {
                return drawable.getIntrinsicHeight();
            }
        }
        return f11;
    }

    public void H2(@DimenRes int i11) {
        G2(this.f31038q1.getResources().getDimension(i11));
    }

    public void H3(@Dimension float f11) {
        sn.d R1 = R1();
        if (R1 != null) {
            R1.l(f11);
            this.f31045x1.g().setTextSize(f11);
            a();
        }
    }

    public final float I1() {
        Drawable drawable = this.E1 ? this.Z : this.N;
        float f11 = this.P;
        return (f11 > 0.0f || drawable == null) ? f11 : drawable.getIntrinsicWidth();
    }

    public void I2(@Nullable ColorStateList colorStateList) {
        this.Q = true;
        if (this.O != colorStateList) {
            this.O = colorStateList;
            if (N3()) {
                DrawableCompat.setTintList(this.N, colorStateList);
            }
            onStateChange(getState());
        }
    }

    public void I3(float f11) {
        if (this.f31033l1 != f11) {
            this.f31033l1 = f11;
            invalidateSelf();
            k2();
        }
    }

    public TextUtils.TruncateAt J1() {
        return this.P1;
    }

    public void J2(@ColorRes int i11) {
        I2(AppCompatResources.getColorStateList(this.f31038q1, i11));
    }

    public void J3(@DimenRes int i11) {
        I3(this.f31038q1.getResources().getDimension(i11));
    }

    @Nullable
    public i K1() {
        return this.f31029h1;
    }

    public void K2(@BoolRes int i11) {
        L2(this.f31038q1.getResources().getBoolean(i11));
    }

    public void K3(boolean z11) {
        if (this.M1 != z11) {
            this.M1 = z11;
            Q3();
            onStateChange(getState());
        }
    }

    public float L1() {
        return this.f31032k1;
    }

    public void L2(boolean z11) {
        if (this.M != z11) {
            boolean N3 = N3();
            this.M = z11;
            boolean N32 = N3();
            if (N3 != N32) {
                if (N32) {
                    Q0(this.N);
                } else {
                    P3(this.N);
                }
                invalidateSelf();
                k2();
            }
        }
    }

    public boolean L3() {
        return this.Q1;
    }

    public float M1() {
        return this.f31031j1;
    }

    public void M2(float f11) {
        if (this.G != f11) {
            this.G = f11;
            invalidateSelf();
            k2();
        }
    }

    public final boolean M3() {
        return this.Y && this.Z != null && this.E1;
    }

    @Px
    public int N1() {
        return this.R1;
    }

    public void N2(@DimenRes int i11) {
        M2(this.f31038q1.getResources().getDimension(i11));
    }

    public final boolean N3() {
        return this.M && this.N != null;
    }

    @Nullable
    public ColorStateList O1() {
        return this.K;
    }

    public void O2(float f11) {
        if (this.f31030i1 != f11) {
            this.f31030i1 = f11;
            invalidateSelf();
            k2();
        }
    }

    public final boolean O3() {
        return this.R && this.S != null;
    }

    @Nullable
    public i P1() {
        return this.f31028f1;
    }

    public void P2(@DimenRes int i11) {
        O2(this.f31038q1.getResources().getDimension(i11));
    }

    public final void P3(@Nullable Drawable drawable) {
        if (drawable != null) {
            drawable.setCallback(null);
        }
    }

    public final void Q0(@Nullable Drawable drawable) {
        if (drawable == null) {
            return;
        }
        drawable.setCallback(this);
        DrawableCompat.setLayoutDirection(drawable, DrawableCompat.getLayoutDirection(this));
        drawable.setLevel(getLevel());
        drawable.setVisible(isVisible(), false);
        if (drawable == this.S) {
            if (drawable.isStateful()) {
                drawable.setState(E1());
            }
            DrawableCompat.setTintList(drawable, this.U);
            return;
        }
        Drawable drawable2 = this.N;
        if (drawable == drawable2 && this.Q) {
            DrawableCompat.setTintList(drawable2, this.O);
        }
        if (drawable.isStateful()) {
            drawable.setState(getState());
        }
    }

    @Nullable
    public CharSequence Q1() {
        return this.L;
    }

    public void Q2(@Nullable ColorStateList colorStateList) {
        if (this.I != colorStateList) {
            this.I = colorStateList;
            if (this.S1) {
                G0(colorStateList);
            }
            onStateChange(getState());
        }
    }

    public final void Q3() {
        this.N1 = this.M1 ? b.e(this.K) : null;
    }

    public final void R0(@NonNull Rect rect, @NonNull RectF rectF) {
        rectF.setEmpty();
        if (N3() || M3()) {
            float f11 = this.f31030i1 + this.f31031j1;
            float I1 = I1();
            if (DrawableCompat.getLayoutDirection(this) == 0) {
                float f12 = rect.left + f11;
                rectF.left = f12;
                rectF.right = f12 + I1;
            } else {
                float f13 = rect.right - f11;
                rectF.right = f13;
                rectF.left = f13 - I1;
            }
            float H1 = H1();
            float exactCenterY = rect.exactCenterY() - (H1 / 2.0f);
            rectF.top = exactCenterY;
            rectF.bottom = exactCenterY + H1;
        }
    }

    @Nullable
    public sn.d R1() {
        return this.f31045x1.e();
    }

    public void R2(@ColorRes int i11) {
        Q2(AppCompatResources.getColorStateList(this.f31038q1, i11));
    }

    @TargetApi(21)
    public final void R3() {
        this.T = new RippleDrawable(b.e(O1()), this.S, X1);
    }

    public float S0() {
        if (N3() || M3()) {
            return this.f31031j1 + I1() + this.f31032k1;
        }
        return 0.0f;
    }

    public float S1() {
        return this.f31034m1;
    }

    public void S2(float f11) {
        if (this.J != f11) {
            this.J = f11;
            this.f31039r1.setStrokeWidth(f11);
            if (this.S1) {
                super.J0(f11);
            }
            invalidateSelf();
        }
    }

    public final void T0(@NonNull Rect rect, @NonNull RectF rectF) {
        rectF.set(rect);
        if (O3()) {
            float f11 = this.f31037p1 + this.f31036o1 + this.V + this.f31035n1 + this.f31034m1;
            if (DrawableCompat.getLayoutDirection(this) == 0) {
                rectF.right = rect.right - f11;
            } else {
                rectF.left = rect.left + f11;
            }
        }
    }

    public float T1() {
        return this.f31033l1;
    }

    public void T2(@DimenRes int i11) {
        S2(this.f31038q1.getResources().getDimension(i11));
    }

    public final void U0(@NonNull Rect rect, @NonNull RectF rectF) {
        rectF.setEmpty();
        if (O3()) {
            float f11 = this.f31037p1 + this.f31036o1;
            if (DrawableCompat.getLayoutDirection(this) == 0) {
                float f12 = rect.right - f11;
                rectF.right = f12;
                rectF.left = f12 - this.V;
            } else {
                float f13 = rect.left + f11;
                rectF.left = f13;
                rectF.right = f13 + this.V;
            }
            float exactCenterY = rect.exactCenterY();
            float f14 = this.V;
            float f15 = exactCenterY - (f14 / 2.0f);
            rectF.top = f15;
            rectF.bottom = f15 + f14;
        }
    }

    @Nullable
    public final ColorFilter U1() {
        ColorFilter colorFilter = this.H1;
        return colorFilter != null ? colorFilter : this.I1;
    }

    public final void U2(@Nullable ColorStateList colorStateList) {
        if (this.E != colorStateList) {
            this.E = colorStateList;
            onStateChange(getState());
        }
    }

    public final void V0(@NonNull Rect rect, @NonNull RectF rectF) {
        rectF.setEmpty();
        if (O3()) {
            float f11 = this.f31037p1 + this.f31036o1 + this.V + this.f31035n1 + this.f31034m1;
            if (DrawableCompat.getLayoutDirection(this) == 0) {
                float f12 = rect.right;
                rectF.right = f12;
                rectF.left = f12 - f11;
            } else {
                int i11 = rect.left;
                rectF.left = i11;
                rectF.right = i11 + f11;
            }
            rectF.top = rect.top;
            rectF.bottom = rect.bottom;
        }
    }

    public boolean V1() {
        return this.M1;
    }

    public void V2(@Nullable Drawable drawable) {
        Drawable z12 = z1();
        if (z12 != drawable) {
            float W0 = W0();
            this.S = drawable != null ? DrawableCompat.wrap(drawable).mutate() : null;
            if (b.f90831a) {
                R3();
            }
            float W02 = W0();
            P3(z12);
            if (O3()) {
                Q0(this.S);
            }
            invalidateSelf();
            if (W0 != W02) {
                k2();
            }
        }
    }

    public float W0() {
        if (O3()) {
            return this.f31035n1 + this.V + this.f31036o1;
        }
        return 0.0f;
    }

    public void W2(@Nullable CharSequence charSequence) {
        if (this.W != charSequence) {
            this.W = BidiFormatter.getInstance().unicodeWrap(charSequence);
            invalidateSelf();
        }
    }

    public final void X0(@NonNull Rect rect, @NonNull RectF rectF) {
        rectF.setEmpty();
        if (this.L != null) {
            float S0 = this.f31030i1 + S0() + this.f31033l1;
            float W0 = this.f31037p1 + W0() + this.f31034m1;
            if (DrawableCompat.getLayoutDirection(this) == 0) {
                rectF.left = rect.left + S0;
                rectF.right = rect.right - W0;
            } else {
                rectF.left = rect.left + W0;
                rectF.right = rect.right - S0;
            }
            rectF.top = rect.top;
            rectF.bottom = rect.bottom;
        }
    }

    public boolean X1() {
        return this.X;
    }

    @Deprecated
    public void X2(boolean z11) {
        k3(z11);
    }

    public final float Y0() {
        this.f31045x1.g().getFontMetrics(this.f31041t1);
        Paint.FontMetrics fontMetrics = this.f31041t1;
        return (fontMetrics.descent + fontMetrics.ascent) / 2.0f;
    }

    @Deprecated
    public boolean Y1() {
        return Z1();
    }

    @Deprecated
    public void Y2(@BoolRes int i11) {
        j3(i11);
    }

    @NonNull
    public Paint.Align Z0(@NonNull Rect rect, @NonNull PointF pointF) {
        pointF.set(0.0f, 0.0f);
        Paint.Align align = Paint.Align.LEFT;
        if (this.L != null) {
            float S0 = this.f31030i1 + S0() + this.f31033l1;
            if (DrawableCompat.getLayoutDirection(this) == 0) {
                pointF.x = rect.left + S0;
            } else {
                pointF.x = rect.right - S0;
                align = Paint.Align.RIGHT;
            }
            pointF.y = rect.centerY() - Y0();
        }
        return align;
    }

    public boolean Z1() {
        return this.Y;
    }

    public void Z2(float f11) {
        if (this.f31036o1 != f11) {
            this.f31036o1 = f11;
            invalidateSelf();
            if (O3()) {
                k2();
            }
        }
    }

    @Override // com.google.android.material.internal.a0.b
    public void a() {
        k2();
        invalidateSelf();
    }

    public final boolean a1() {
        return this.Y && this.Z != null && this.X;
    }

    @Deprecated
    public boolean a2() {
        return b2();
    }

    public void a3(@DimenRes int i11) {
        Z2(this.f31038q1.getResources().getDimension(i11));
    }

    public boolean b2() {
        return this.M;
    }

    public void b3(@DrawableRes int i11) {
        V2(AppCompatResources.getDrawable(this.f31038q1, i11));
    }

    @Deprecated
    public boolean c2() {
        return e2();
    }

    public void c3(float f11) {
        if (this.V != f11) {
            this.V = f11;
            invalidateSelf();
            if (O3()) {
                k2();
            }
        }
    }

    public final void d1(@NonNull Canvas canvas, @NonNull Rect rect) {
        if (M3()) {
            R0(rect, this.f31042u1);
            RectF rectF = this.f31042u1;
            float f11 = rectF.left;
            float f12 = rectF.top;
            canvas.translate(f11, f12);
            this.Z.setBounds(0, 0, (int) this.f31042u1.width(), (int) this.f31042u1.height());
            this.Z.draw(canvas);
            canvas.translate(-f11, -f12);
        }
    }

    public boolean d2() {
        return h2(this.S);
    }

    public void d3(@DimenRes int i11) {
        c3(this.f31038q1.getResources().getDimension(i11));
    }

    @Override // vn.k, android.graphics.drawable.Drawable
    public void draw(@NonNull Canvas canvas) {
        Canvas canvas2;
        int i11;
        Rect bounds = getBounds();
        if (bounds.isEmpty() || getAlpha() == 0) {
            return;
        }
        int i12 = this.G1;
        if (i12 < 255) {
            canvas2 = canvas;
            i11 = an.a.a(canvas2, bounds.left, bounds.top, bounds.right, bounds.bottom, i12);
        } else {
            canvas2 = canvas;
            i11 = 0;
        }
        h1(canvas2, bounds);
        e1(canvas2, bounds);
        if (this.S1) {
            super.draw(canvas2);
        }
        g1(canvas2, bounds);
        j1(canvas2, bounds);
        f1(canvas2, bounds);
        d1(canvas2, bounds);
        if (this.Q1) {
            l1(canvas2, bounds);
        }
        i1(canvas2, bounds);
        k1(canvas2, bounds);
        if (this.G1 < 255) {
            canvas2.restoreToCount(i11);
        }
    }

    public final void e1(@NonNull Canvas canvas, @NonNull Rect rect) {
        if (this.S1) {
            return;
        }
        this.f31039r1.setColor(this.f31047z1);
        this.f31039r1.setStyle(Paint.Style.FILL);
        this.f31039r1.setColorFilter(U1());
        this.f31042u1.set(rect);
        canvas.drawRoundRect(this.f31042u1, p1(), p1(), this.f31039r1);
    }

    public boolean e2() {
        return this.R;
    }

    public void e3(float f11) {
        if (this.f31035n1 != f11) {
            this.f31035n1 = f11;
            invalidateSelf();
            if (O3()) {
                k2();
            }
        }
    }

    public final void f1(@NonNull Canvas canvas, @NonNull Rect rect) {
        if (N3()) {
            R0(rect, this.f31042u1);
            RectF rectF = this.f31042u1;
            float f11 = rectF.left;
            float f12 = rectF.top;
            canvas.translate(f11, f12);
            this.N.setBounds(0, 0, (int) this.f31042u1.width(), (int) this.f31042u1.height());
            this.N.draw(canvas);
            canvas.translate(-f11, -f12);
        }
    }

    public boolean f2() {
        return this.S1;
    }

    public void f3(@DimenRes int i11) {
        e3(this.f31038q1.getResources().getDimension(i11));
    }

    public final void g1(@NonNull Canvas canvas, @NonNull Rect rect) {
        if (this.J <= 0.0f || this.S1) {
            return;
        }
        this.f31039r1.setColor(this.B1);
        this.f31039r1.setStyle(Paint.Style.STROKE);
        if (!this.S1) {
            this.f31039r1.setColorFilter(U1());
        }
        RectF rectF = this.f31042u1;
        float f11 = rect.left;
        float f12 = this.J;
        rectF.set(f11 + (f12 / 2.0f), rect.top + (f12 / 2.0f), rect.right - (f12 / 2.0f), rect.bottom - (f12 / 2.0f));
        float f13 = this.H - (this.J / 2.0f);
        canvas.drawRoundRect(this.f31042u1, f13, f13, this.f31039r1);
    }

    public boolean g3(@NonNull int[] iArr) {
        if (Arrays.equals(this.L1, iArr)) {
            return false;
        }
        this.L1 = iArr;
        if (O3()) {
            return l2(getState(), iArr);
        }
        return false;
    }

    @Override // vn.k, android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.G1;
    }

    @Override // android.graphics.drawable.Drawable
    @Nullable
    public ColorFilter getColorFilter() {
        return this.H1;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return (int) this.G;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return Math.min(Math.round(this.f31030i1 + S0() + this.f31033l1 + this.f31045x1.h(Q1().toString()) + this.f31034m1 + W0() + this.f31037p1), this.R1);
    }

    @Override // vn.k, android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @Override // vn.k, android.graphics.drawable.Drawable
    @TargetApi(21)
    public void getOutline(@NonNull Outline outline) {
        Outline outline2;
        if (this.S1) {
            super.getOutline(outline);
            return;
        }
        Rect bounds = getBounds();
        if (bounds.isEmpty()) {
            outline2 = outline;
            outline2.setRoundRect(0, 0, getIntrinsicWidth(), getIntrinsicHeight(), this.H);
        } else {
            outline.setRoundRect(bounds, this.H);
            outline2 = outline;
        }
        outline2.setAlpha(getAlpha() / 255.0f);
    }

    public final void h1(@NonNull Canvas canvas, @NonNull Rect rect) {
        if (this.S1) {
            return;
        }
        this.f31039r1.setColor(this.f31046y1);
        this.f31039r1.setStyle(Paint.Style.FILL);
        this.f31042u1.set(rect);
        canvas.drawRoundRect(this.f31042u1, p1(), p1(), this.f31039r1);
    }

    public void h3(@Nullable ColorStateList colorStateList) {
        if (this.U != colorStateList) {
            this.U = colorStateList;
            if (O3()) {
                DrawableCompat.setTintList(this.S, colorStateList);
            }
            onStateChange(getState());
        }
    }

    public final void i1(@NonNull Canvas canvas, @NonNull Rect rect) {
        if (O3()) {
            U0(rect, this.f31042u1);
            RectF rectF = this.f31042u1;
            float f11 = rectF.left;
            float f12 = rectF.top;
            canvas.translate(f11, f12);
            this.S.setBounds(0, 0, (int) this.f31042u1.width(), (int) this.f31042u1.height());
            if (b.f90831a) {
                this.T.setBounds(this.S.getBounds());
                this.T.jumpToCurrentState();
                this.T.draw(canvas);
            } else {
                this.S.draw(canvas);
            }
            canvas.translate(-f11, -f12);
        }
    }

    public void i3(@ColorRes int i11) {
        h3(AppCompatResources.getColorStateList(this.f31038q1, i11));
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void invalidateDrawable(@NonNull Drawable drawable) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.invalidateDrawable(this);
        }
    }

    @Override // vn.k, android.graphics.drawable.Drawable
    public boolean isStateful() {
        if (g2(this.E) || g2(this.F) || g2(this.I)) {
            return true;
        }
        return (this.M1 && g2(this.N1)) || i2(this.f31045x1.e()) || a1() || h2(this.N) || h2(this.Z) || g2(this.J1);
    }

    public final void j1(@NonNull Canvas canvas, @NonNull Rect rect) {
        this.f31039r1.setColor(this.C1);
        this.f31039r1.setStyle(Paint.Style.FILL);
        this.f31042u1.set(rect);
        if (!this.S1) {
            canvas.drawRoundRect(this.f31042u1, p1(), p1(), this.f31039r1);
        } else {
            h(new RectF(rect), this.f31044w1);
            super.r(canvas, this.f31039r1, this.f31044w1, w());
        }
    }

    public final void j2(@Nullable AttributeSet attributeSet, @AttrRes int i11, @StyleRes int i12) {
        TypedArray k11 = d0.k(this.f31038q1, attributeSet, com.google.android.material.R.styleable.Chip, i11, i12, new int[0]);
        this.S1 = k11.hasValue(com.google.android.material.R.styleable.Chip_shapeAppearance);
        U2(c.a(this.f31038q1, k11, com.google.android.material.R.styleable.Chip_chipSurfaceColor));
        w2(c.a(this.f31038q1, k11, com.google.android.material.R.styleable.Chip_chipBackgroundColor));
        M2(k11.getDimension(com.google.android.material.R.styleable.Chip_chipMinHeight, 0.0f));
        int i13 = com.google.android.material.R.styleable.Chip_chipCornerRadius;
        if (k11.hasValue(i13)) {
            y2(k11.getDimension(i13, 0.0f));
        }
        Q2(c.a(this.f31038q1, k11, com.google.android.material.R.styleable.Chip_chipStrokeColor));
        S2(k11.getDimension(com.google.android.material.R.styleable.Chip_chipStrokeWidth, 0.0f));
        u3(c.a(this.f31038q1, k11, com.google.android.material.R.styleable.Chip_rippleColor));
        z3(k11.getText(com.google.android.material.R.styleable.Chip_android_text));
        sn.d h11 = c.h(this.f31038q1, k11, com.google.android.material.R.styleable.Chip_android_textAppearance);
        h11.l(k11.getDimension(com.google.android.material.R.styleable.Chip_android_textSize, h11.j()));
        A3(h11);
        int i14 = k11.getInt(com.google.android.material.R.styleable.Chip_android_ellipsize, 0);
        if (i14 == 1) {
            m3(TextUtils.TruncateAt.START);
        } else if (i14 == 2) {
            m3(TextUtils.TruncateAt.MIDDLE);
        } else if (i14 == 3) {
            m3(TextUtils.TruncateAt.END);
        }
        L2(k11.getBoolean(com.google.android.material.R.styleable.Chip_chipIconVisible, false));
        if (attributeSet != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "chipIconEnabled") != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "chipIconVisible") == null) {
            L2(k11.getBoolean(com.google.android.material.R.styleable.Chip_chipIconEnabled, false));
        }
        C2(c.e(this.f31038q1, k11, com.google.android.material.R.styleable.Chip_chipIcon));
        int i15 = com.google.android.material.R.styleable.Chip_chipIconTint;
        if (k11.hasValue(i15)) {
            I2(c.a(this.f31038q1, k11, i15));
        }
        G2(k11.getDimension(com.google.android.material.R.styleable.Chip_chipIconSize, -1.0f));
        k3(k11.getBoolean(com.google.android.material.R.styleable.Chip_closeIconVisible, false));
        if (attributeSet != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "closeIconEnabled") != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "closeIconVisible") == null) {
            k3(k11.getBoolean(com.google.android.material.R.styleable.Chip_closeIconEnabled, false));
        }
        V2(c.e(this.f31038q1, k11, com.google.android.material.R.styleable.Chip_closeIcon));
        h3(c.a(this.f31038q1, k11, com.google.android.material.R.styleable.Chip_closeIconTint));
        c3(k11.getDimension(com.google.android.material.R.styleable.Chip_closeIconSize, 0.0f));
        m2(k11.getBoolean(com.google.android.material.R.styleable.Chip_android_checkable, false));
        v2(k11.getBoolean(com.google.android.material.R.styleable.Chip_checkedIconVisible, false));
        if (attributeSet != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "checkedIconEnabled") != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "checkedIconVisible") == null) {
            v2(k11.getBoolean(com.google.android.material.R.styleable.Chip_checkedIconEnabled, false));
        }
        o2(c.e(this.f31038q1, k11, com.google.android.material.R.styleable.Chip_checkedIcon));
        int i16 = com.google.android.material.R.styleable.Chip_checkedIconTint;
        if (k11.hasValue(i16)) {
            s2(c.a(this.f31038q1, k11, i16));
        }
        x3(i.c(this.f31038q1, k11, com.google.android.material.R.styleable.Chip_showMotionSpec));
        n3(i.c(this.f31038q1, k11, com.google.android.material.R.styleable.Chip_hideMotionSpec));
        O2(k11.getDimension(com.google.android.material.R.styleable.Chip_chipStartPadding, 0.0f));
        r3(k11.getDimension(com.google.android.material.R.styleable.Chip_iconStartPadding, 0.0f));
        p3(k11.getDimension(com.google.android.material.R.styleable.Chip_iconEndPadding, 0.0f));
        I3(k11.getDimension(com.google.android.material.R.styleable.Chip_textStartPadding, 0.0f));
        E3(k11.getDimension(com.google.android.material.R.styleable.Chip_textEndPadding, 0.0f));
        e3(k11.getDimension(com.google.android.material.R.styleable.Chip_closeIconStartPadding, 0.0f));
        Z2(k11.getDimension(com.google.android.material.R.styleable.Chip_closeIconEndPadding, 0.0f));
        A2(k11.getDimension(com.google.android.material.R.styleable.Chip_chipEndPadding, 0.0f));
        t3(k11.getDimensionPixelSize(com.google.android.material.R.styleable.Chip_android_maxWidth, Integer.MAX_VALUE));
        k11.recycle();
    }

    public void j3(@BoolRes int i11) {
        k3(this.f31038q1.getResources().getBoolean(i11));
    }

    public final void k1(@NonNull Canvas canvas, @NonNull Rect rect) {
        Canvas canvas2;
        Paint paint = this.f31040s1;
        if (paint != null) {
            paint.setColor(ColorUtils.setAlphaComponent(-16777216, 127));
            canvas.drawRect(rect, this.f31040s1);
            if (N3() || M3()) {
                R0(rect, this.f31042u1);
                canvas.drawRect(this.f31042u1, this.f31040s1);
            }
            if (this.L != null) {
                canvas2 = canvas;
                canvas2.drawLine(rect.left, rect.exactCenterY(), rect.right, rect.exactCenterY(), this.f31040s1);
            } else {
                canvas2 = canvas;
            }
            if (O3()) {
                U0(rect, this.f31042u1);
                canvas2.drawRect(this.f31042u1, this.f31040s1);
            }
            this.f31040s1.setColor(ColorUtils.setAlphaComponent(-65536, 127));
            T0(rect, this.f31042u1);
            canvas2.drawRect(this.f31042u1, this.f31040s1);
            this.f31040s1.setColor(ColorUtils.setAlphaComponent(-16711936, 127));
            V0(rect, this.f31042u1);
            canvas2.drawRect(this.f31042u1, this.f31040s1);
        }
    }

    public void k2() {
        InterfaceC0369a interfaceC0369a = this.O1.get();
        if (interfaceC0369a != null) {
            interfaceC0369a.a();
        }
    }

    public void k3(boolean z11) {
        if (this.R != z11) {
            boolean O3 = O3();
            this.R = z11;
            boolean O32 = O3();
            if (O3 != O32) {
                if (O32) {
                    Q0(this.S);
                } else {
                    P3(this.S);
                }
                invalidateSelf();
                k2();
            }
        }
    }

    public final void l1(@NonNull Canvas canvas, @NonNull Rect rect) {
        if (this.L != null) {
            Paint.Align Z0 = Z0(rect, this.f31043v1);
            X0(rect, this.f31042u1);
            if (this.f31045x1.e() != null) {
                this.f31045x1.g().drawableState = getState();
                this.f31045x1.o(this.f31038q1);
            }
            this.f31045x1.g().setTextAlign(Z0);
            int i11 = 0;
            boolean z11 = Math.round(this.f31045x1.h(Q1().toString())) > Math.round(this.f31042u1.width());
            if (z11) {
                i11 = canvas.save();
                canvas.clipRect(this.f31042u1);
            }
            CharSequence charSequence = this.L;
            if (z11 && this.P1 != null) {
                charSequence = TextUtils.ellipsize(charSequence, this.f31045x1.g(), this.f31042u1.width(), this.P1);
            }
            CharSequence charSequence2 = charSequence;
            int length = charSequence2.length();
            PointF pointF = this.f31043v1;
            canvas.drawText(charSequence2, 0, length, pointF.x, pointF.y, this.f31045x1.g());
            if (z11) {
                canvas.restoreToCount(i11);
            }
        }
    }

    public final boolean l2(@NonNull int[] iArr, @NonNull int[] iArr2) {
        boolean z11;
        boolean onStateChange = super.onStateChange(iArr);
        ColorStateList colorStateList = this.E;
        int l11 = l(colorStateList != null ? colorStateList.getColorForState(iArr, this.f31046y1) : 0);
        boolean z12 = true;
        if (this.f31046y1 != l11) {
            this.f31046y1 = l11;
            onStateChange = true;
        }
        ColorStateList colorStateList2 = this.F;
        int l12 = l(colorStateList2 != null ? colorStateList2.getColorForState(iArr, this.f31047z1) : 0);
        if (this.f31047z1 != l12) {
            this.f31047z1 = l12;
            onStateChange = true;
        }
        int s11 = u.s(l11, l12);
        if ((this.A1 != s11) | (z() == null)) {
            this.A1 = s11;
            p0(ColorStateList.valueOf(s11));
            onStateChange = true;
        }
        ColorStateList colorStateList3 = this.I;
        int colorForState = colorStateList3 != null ? colorStateList3.getColorForState(iArr, this.B1) : 0;
        if (this.B1 != colorForState) {
            this.B1 = colorForState;
            onStateChange = true;
        }
        int colorForState2 = (this.N1 == null || !b.f(iArr)) ? 0 : this.N1.getColorForState(iArr, this.C1);
        if (this.C1 != colorForState2) {
            this.C1 = colorForState2;
            if (this.M1) {
                onStateChange = true;
            }
        }
        int colorForState3 = (this.f31045x1.e() == null || this.f31045x1.e().i() == null) ? 0 : this.f31045x1.e().i().getColorForState(iArr, this.D1);
        if (this.D1 != colorForState3) {
            this.D1 = colorForState3;
            onStateChange = true;
        }
        boolean z13 = W1(getState(), R.attr.state_checked) && this.X;
        if (this.E1 == z13 || this.Z == null) {
            z11 = false;
        } else {
            float S0 = S0();
            this.E1 = z13;
            if (S0 != S0()) {
                onStateChange = true;
                z11 = true;
            } else {
                z11 = false;
                onStateChange = true;
            }
        }
        ColorStateList colorStateList4 = this.J1;
        int colorForState4 = colorStateList4 != null ? colorStateList4.getColorForState(iArr, this.F1) : 0;
        if (this.F1 != colorForState4) {
            this.F1 = colorForState4;
            this.I1 = d.o(this, this.J1, this.K1);
        } else {
            z12 = onStateChange;
        }
        if (h2(this.N)) {
            z12 |= this.N.setState(iArr);
        }
        if (h2(this.Z)) {
            z12 |= this.Z.setState(iArr);
        }
        if (h2(this.S)) {
            int[] iArr3 = new int[iArr.length + iArr2.length];
            System.arraycopy(iArr, 0, iArr3, 0, iArr.length);
            System.arraycopy(iArr2, 0, iArr3, iArr.length, iArr2.length);
            z12 |= this.S.setState(iArr3);
        }
        if (b.f90831a && h2(this.T)) {
            z12 |= this.T.setState(iArr2);
        }
        if (z12) {
            invalidateSelf();
        }
        if (z11) {
            k2();
        }
        return z12;
    }

    public void l3(@Nullable InterfaceC0369a interfaceC0369a) {
        this.O1 = new WeakReference<>(interfaceC0369a);
    }

    @Nullable
    public Drawable m1() {
        return this.Z;
    }

    public void m2(boolean z11) {
        if (this.X != z11) {
            this.X = z11;
            float S0 = S0();
            if (!z11 && this.E1) {
                this.E1 = false;
            }
            float S02 = S0();
            invalidateSelf();
            if (S0 != S02) {
                k2();
            }
        }
    }

    public void m3(@Nullable TextUtils.TruncateAt truncateAt) {
        this.P1 = truncateAt;
    }

    @Nullable
    public ColorStateList n1() {
        return this.f31027f0;
    }

    public void n2(@BoolRes int i11) {
        m2(this.f31038q1.getResources().getBoolean(i11));
    }

    public void n3(@Nullable i iVar) {
        this.f31029h1 = iVar;
    }

    @Nullable
    public ColorStateList o1() {
        return this.F;
    }

    public void o2(@Nullable Drawable drawable) {
        if (this.Z != drawable) {
            float S0 = S0();
            this.Z = drawable;
            float S02 = S0();
            P3(this.Z);
            Q0(this.Z);
            invalidateSelf();
            if (S0 != S02) {
                k2();
            }
        }
    }

    public void o3(@AnimatorRes int i11) {
        n3(i.d(this.f31038q1, i11));
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onLayoutDirectionChanged(int i11) {
        boolean onLayoutDirectionChanged = super.onLayoutDirectionChanged(i11);
        if (N3()) {
            onLayoutDirectionChanged |= DrawableCompat.setLayoutDirection(this.N, i11);
        }
        if (M3()) {
            onLayoutDirectionChanged |= DrawableCompat.setLayoutDirection(this.Z, i11);
        }
        if (O3()) {
            onLayoutDirectionChanged |= DrawableCompat.setLayoutDirection(this.S, i11);
        }
        if (!onLayoutDirectionChanged) {
            return true;
        }
        invalidateSelf();
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onLevelChange(int i11) {
        boolean onLevelChange = super.onLevelChange(i11);
        if (N3()) {
            onLevelChange |= this.N.setLevel(i11);
        }
        if (M3()) {
            onLevelChange |= this.Z.setLevel(i11);
        }
        if (O3()) {
            onLevelChange |= this.S.setLevel(i11);
        }
        if (onLevelChange) {
            invalidateSelf();
        }
        return onLevelChange;
    }

    @Override // vn.k, android.graphics.drawable.Drawable, com.google.android.material.internal.a0.b
    public boolean onStateChange(@NonNull int[] iArr) {
        if (this.S1) {
            super.onStateChange(iArr);
        }
        return l2(iArr, E1());
    }

    public float p1() {
        return this.S1 ? T() : this.H;
    }

    @Deprecated
    public void p2(boolean z11) {
        v2(z11);
    }

    public void p3(float f11) {
        if (this.f31032k1 != f11) {
            float S0 = S0();
            this.f31032k1 = f11;
            float S02 = S0();
            invalidateSelf();
            if (S0 != S02) {
                k2();
            }
        }
    }

    public float q1() {
        return this.f31037p1;
    }

    @Deprecated
    public void q2(@BoolRes int i11) {
        v2(this.f31038q1.getResources().getBoolean(i11));
    }

    public void q3(@DimenRes int i11) {
        p3(this.f31038q1.getResources().getDimension(i11));
    }

    @Nullable
    public Drawable r1() {
        Drawable drawable = this.N;
        if (drawable != null) {
            return DrawableCompat.unwrap(drawable);
        }
        return null;
    }

    public void r2(@DrawableRes int i11) {
        o2(AppCompatResources.getDrawable(this.f31038q1, i11));
    }

    public void r3(float f11) {
        if (this.f31031j1 != f11) {
            float S0 = S0();
            this.f31031j1 = f11;
            float S02 = S0();
            invalidateSelf();
            if (S0 != S02) {
                k2();
            }
        }
    }

    public float s1() {
        return this.P;
    }

    public void s2(@Nullable ColorStateList colorStateList) {
        if (this.f31027f0 != colorStateList) {
            this.f31027f0 = colorStateList;
            if (a1()) {
                DrawableCompat.setTintList(this.Z, colorStateList);
            }
            onStateChange(getState());
        }
    }

    public void s3(@DimenRes int i11) {
        r3(this.f31038q1.getResources().getDimension(i11));
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void scheduleDrawable(@NonNull Drawable drawable, @NonNull Runnable runnable, long j11) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.scheduleDrawable(this, runnable, j11);
        }
    }

    @Override // vn.k, android.graphics.drawable.Drawable
    public void setAlpha(int i11) {
        if (this.G1 != i11) {
            this.G1 = i11;
            invalidateSelf();
        }
    }

    @Override // vn.k, android.graphics.drawable.Drawable
    public void setColorFilter(@Nullable ColorFilter colorFilter) {
        if (this.H1 != colorFilter) {
            this.H1 = colorFilter;
            invalidateSelf();
        }
    }

    @Override // vn.k, android.graphics.drawable.Drawable, androidx.core.graphics.drawable.TintAwareDrawable
    public void setTintList(@Nullable ColorStateList colorStateList) {
        if (this.J1 != colorStateList) {
            this.J1 = colorStateList;
            onStateChange(getState());
        }
    }

    @Override // vn.k, android.graphics.drawable.Drawable, androidx.core.graphics.drawable.TintAwareDrawable
    public void setTintMode(@NonNull PorterDuff.Mode mode) {
        if (this.K1 != mode) {
            this.K1 = mode;
            this.I1 = d.o(this, this.J1, mode);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setVisible(boolean z11, boolean z12) {
        boolean visible = super.setVisible(z11, z12);
        if (N3()) {
            visible |= this.N.setVisible(z11, z12);
        }
        if (M3()) {
            visible |= this.Z.setVisible(z11, z12);
        }
        if (O3()) {
            visible |= this.S.setVisible(z11, z12);
        }
        if (visible) {
            invalidateSelf();
        }
        return visible;
    }

    @Nullable
    public ColorStateList t1() {
        return this.O;
    }

    public void t2(@ColorRes int i11) {
        s2(AppCompatResources.getColorStateList(this.f31038q1, i11));
    }

    public void t3(@Px int i11) {
        this.R1 = i11;
    }

    public float u1() {
        return this.G;
    }

    public void u2(@BoolRes int i11) {
        v2(this.f31038q1.getResources().getBoolean(i11));
    }

    public void u3(@Nullable ColorStateList colorStateList) {
        if (this.K != colorStateList) {
            this.K = colorStateList;
            Q3();
            onStateChange(getState());
        }
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void unscheduleDrawable(@NonNull Drawable drawable, @NonNull Runnable runnable) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.unscheduleDrawable(this, runnable);
        }
    }

    public float v1() {
        return this.f31030i1;
    }

    public void v2(boolean z11) {
        if (this.Y != z11) {
            boolean M3 = M3();
            this.Y = z11;
            boolean M32 = M3();
            if (M3 != M32) {
                if (M32) {
                    Q0(this.Z);
                } else {
                    P3(this.Z);
                }
                invalidateSelf();
                k2();
            }
        }
    }

    public void v3(@ColorRes int i11) {
        u3(AppCompatResources.getColorStateList(this.f31038q1, i11));
    }

    @Nullable
    public ColorStateList w1() {
        return this.I;
    }

    public void w2(@Nullable ColorStateList colorStateList) {
        if (this.F != colorStateList) {
            this.F = colorStateList;
            onStateChange(getState());
        }
    }

    public void w3(boolean z11) {
        this.Q1 = z11;
    }

    public float x1() {
        return this.J;
    }

    public void x2(@ColorRes int i11) {
        w2(AppCompatResources.getColorStateList(this.f31038q1, i11));
    }

    public void x3(@Nullable i iVar) {
        this.f31028f1 = iVar;
    }

    public void y1(@NonNull RectF rectF) {
        T0(getBounds(), rectF);
    }

    @Deprecated
    public void y2(float f11) {
        if (this.H != f11) {
            this.H = f11;
            setShapeAppearanceModel(getShapeAppearanceModel().w(f11));
        }
    }

    public void y3(@AnimatorRes int i11) {
        x3(i.d(this.f31038q1, i11));
    }

    @Nullable
    public Drawable z1() {
        Drawable drawable = this.S;
        if (drawable != null) {
            return DrawableCompat.unwrap(drawable);
        }
        return null;
    }

    @Deprecated
    public void z2(@DimenRes int i11) {
        y2(this.f31038q1.getResources().getDimension(i11));
    }

    public void z3(@Nullable CharSequence charSequence) {
        if (charSequence == null) {
            charSequence = "";
        }
        if (TextUtils.equals(this.L, charSequence)) {
            return;
        }
        this.L = charSequence;
        this.f31045x1.n(true);
        invalidateSelf();
        k2();
    }
}
