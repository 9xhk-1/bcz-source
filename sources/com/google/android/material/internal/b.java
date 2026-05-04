package com.google.android.material.internal;

import android.animation.TimeInterpolator;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.os.Build;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import androidx.annotation.ColorInt;
import androidx.annotation.FloatRange;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.core.math.MathUtils;
import androidx.core.text.TextDirectionHeuristicsCompat;
import androidx.core.util.Preconditions;
import androidx.core.view.GravityCompat;
import androidx.core.view.ViewCompat;
import com.google.android.material.internal.y;
import sn.a;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes7.dex */
public final class b {

    /* renamed from: v0, reason: collision with root package name */
    public static final String f31513v0 = "CollapsingTextHelper";

    /* renamed from: w0, reason: collision with root package name */
    public static final String f31514w0 = "…";

    /* renamed from: x0, reason: collision with root package name */
    public static final float f31515x0 = 0.5f;

    /* renamed from: y0, reason: collision with root package name */
    public static final boolean f31516y0 = false;
    public Typeface A;
    public Typeface B;
    public Typeface C;
    public sn.a D;
    public sn.a E;

    @Nullable
    public CharSequence G;

    @Nullable
    public CharSequence H;
    public boolean I;
    public boolean K;

    @Nullable
    public Bitmap L;
    public Paint M;
    public float N;
    public float O;
    public float P;
    public float Q;
    public float R;
    public int S;
    public int[] T;
    public boolean U;

    @NonNull
    public final TextPaint V;

    @NonNull
    public final TextPaint W;
    public TimeInterpolator X;
    public TimeInterpolator Y;
    public float Z;

    /* renamed from: a, reason: collision with root package name */
    public final View f31518a;

    /* renamed from: a0, reason: collision with root package name */
    public float f31519a0;

    /* renamed from: b, reason: collision with root package name */
    public float f31520b;

    /* renamed from: b0, reason: collision with root package name */
    public float f31521b0;

    /* renamed from: c, reason: collision with root package name */
    public boolean f31522c;

    /* renamed from: c0, reason: collision with root package name */
    public ColorStateList f31523c0;

    /* renamed from: d, reason: collision with root package name */
    public float f31524d;

    /* renamed from: d0, reason: collision with root package name */
    public float f31525d0;

    /* renamed from: e, reason: collision with root package name */
    public float f31526e;

    /* renamed from: e0, reason: collision with root package name */
    public float f31527e0;

    /* renamed from: f, reason: collision with root package name */
    public int f31528f;

    /* renamed from: f0, reason: collision with root package name */
    public float f31529f0;

    /* renamed from: g, reason: collision with root package name */
    @NonNull
    public final Rect f31530g;

    /* renamed from: g0, reason: collision with root package name */
    public ColorStateList f31531g0;

    /* renamed from: h, reason: collision with root package name */
    @NonNull
    public final Rect f31532h;

    /* renamed from: h0, reason: collision with root package name */
    public float f31533h0;

    /* renamed from: i, reason: collision with root package name */
    @NonNull
    public final RectF f31534i;

    /* renamed from: i0, reason: collision with root package name */
    public float f31535i0;

    /* renamed from: j0, reason: collision with root package name */
    public float f31537j0;

    /* renamed from: k0, reason: collision with root package name */
    public StaticLayout f31539k0;

    /* renamed from: l0, reason: collision with root package name */
    public float f31541l0;

    /* renamed from: m0, reason: collision with root package name */
    public float f31543m0;

    /* renamed from: n, reason: collision with root package name */
    public ColorStateList f31544n;

    /* renamed from: n0, reason: collision with root package name */
    public float f31545n0;

    /* renamed from: o, reason: collision with root package name */
    public ColorStateList f31546o;

    /* renamed from: o0, reason: collision with root package name */
    public CharSequence f31547o0;

    /* renamed from: p, reason: collision with root package name */
    public int f31548p;

    /* renamed from: q, reason: collision with root package name */
    public float f31550q;

    /* renamed from: r, reason: collision with root package name */
    public float f31552r;

    /* renamed from: s, reason: collision with root package name */
    public float f31554s;

    /* renamed from: t, reason: collision with root package name */
    public float f31556t;

    /* renamed from: t0, reason: collision with root package name */
    @Nullable
    public z f31557t0;

    /* renamed from: u, reason: collision with root package name */
    public float f31558u;

    /* renamed from: v, reason: collision with root package name */
    public float f31559v;

    /* renamed from: w, reason: collision with root package name */
    public Typeface f31560w;

    /* renamed from: x, reason: collision with root package name */
    public Typeface f31561x;

    /* renamed from: y, reason: collision with root package name */
    public Typeface f31562y;

    /* renamed from: z, reason: collision with root package name */
    public Typeface f31563z;

    /* renamed from: u0, reason: collision with root package name */
    public static final boolean f31512u0 = false;

    /* renamed from: z0, reason: collision with root package name */
    @NonNull
    public static final Paint f31517z0 = null;

    /* renamed from: j, reason: collision with root package name */
    public int f31536j = 16;

    /* renamed from: k, reason: collision with root package name */
    public int f31538k = 16;

    /* renamed from: l, reason: collision with root package name */
    public float f31540l = 15.0f;

    /* renamed from: m, reason: collision with root package name */
    public float f31542m = 15.0f;
    public TextUtils.TruncateAt F = TextUtils.TruncateAt.END;
    public boolean J = true;

    /* renamed from: p0, reason: collision with root package name */
    public int f31549p0 = 1;

    /* renamed from: q0, reason: collision with root package name */
    public float f31551q0 = 0.0f;

    /* renamed from: r0, reason: collision with root package name */
    public float f31553r0 = 1.0f;

    /* renamed from: s0, reason: collision with root package name */
    public int f31555s0 = y.f31679o;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class a implements a.InterfaceC1163a {
        public a() {
        }

        @Override // sn.a.InterfaceC1163a
        public void a(Typeface typeface) {
            b.this.n0(typeface);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    /* renamed from: com.google.android.material.internal.b$b, reason: collision with other inner class name */
    public class C0376b implements a.InterfaceC1163a {
        public C0376b() {
        }

        @Override // sn.a.InterfaceC1163a
        public void a(Typeface typeface) {
            b.this.y0(typeface);
        }
    }

    public b(View view) {
        this.f31518a = view;
        TextPaint textPaint = new TextPaint(129);
        this.V = textPaint;
        this.W = new TextPaint(textPaint);
        this.f31532h = new Rect();
        this.f31530g = new Rect();
        this.f31534i = new RectF();
        this.f31526e = e();
        a0(view.getContext().getResources().getConfiguration());
    }

    public static boolean U(float f11, float f12) {
        return Math.abs(f11 - f12) < 1.0E-5f;
    }

    public static float Z(float f11, float f12, float f13, @Nullable TimeInterpolator timeInterpolator) {
        if (timeInterpolator != null) {
            f13 = timeInterpolator.getInterpolation(f13);
        }
        return vm.b.a(f11, f12, f13);
    }

    @ColorInt
    public static int a(@ColorInt int i11, @ColorInt int i12, @FloatRange(from = 0.0d, to = 1.0d) float f11) {
        float f12 = 1.0f - f11;
        return Color.argb(Math.round((Color.alpha(i11) * f12) + (Color.alpha(i12) * f11)), Math.round((Color.red(i11) * f12) + (Color.red(i12) * f11)), Math.round((Color.green(i11) * f12) + (Color.green(i12) * f11)), Math.round((Color.blue(i11) * f12) + (Color.blue(i12) * f11)));
    }

    public static boolean e0(@NonNull Rect rect, int i11, int i12, int i13, int i14) {
        return rect.left == i11 && rect.top == i12 && rect.right == i13 && rect.bottom == i14;
    }

    public ColorStateList A() {
        return this.f31544n;
    }

    public void A0(float f11) {
        float clamp = MathUtils.clamp(f11, 0.0f, 1.0f);
        if (clamp != this.f31520b) {
            this.f31520b = clamp;
            c();
        }
    }

    public float B() {
        R(this.W);
        return (-this.W.ascent()) + this.W.descent();
    }

    public void B0(boolean z11) {
        this.f31522c = z11;
    }

    public int C() {
        return this.f31536j;
    }

    public void C0(float f11) {
        this.f31524d = f11;
        this.f31526e = e();
    }

    public float D() {
        R(this.W);
        return -this.W.ascent();
    }

    @RequiresApi(23)
    public void D0(int i11) {
        this.f31555s0 = i11;
    }

    public float E() {
        return this.f31540l;
    }

    public final void E0(float f11) {
        h(f11);
        boolean z11 = f31512u0 && this.N != 1.0f;
        this.K = z11;
        if (z11) {
            n();
        }
        ViewCompat.postInvalidateOnAnimation(this.f31518a);
    }

    public Typeface F() {
        Typeface typeface = this.f31563z;
        return typeface != null ? typeface : Typeface.DEFAULT;
    }

    @RequiresApi(23)
    public void F0(float f11) {
        this.f31551q0 = f11;
    }

    public float G() {
        return this.f31520b;
    }

    @RequiresApi(23)
    public void G0(@FloatRange(from = 0.0d) float f11) {
        this.f31553r0 = f11;
    }

    public float H() {
        return this.f31526e;
    }

    public void H0(int i11) {
        if (i11 != this.f31549p0) {
            this.f31549p0 = i11;
            j();
            c0();
        }
    }

    @RequiresApi(23)
    public int I() {
        return this.f31555s0;
    }

    public void I0(TimeInterpolator timeInterpolator) {
        this.X = timeInterpolator;
        c0();
    }

    public int J() {
        StaticLayout staticLayout = this.f31539k0;
        if (staticLayout != null) {
            return staticLayout.getLineCount();
        }
        return 0;
    }

    public void J0(boolean z11) {
        this.J = z11;
    }

    @RequiresApi(23)
    public float K() {
        return this.f31539k0.getSpacingAdd();
    }

    public final boolean K0(int[] iArr) {
        this.T = iArr;
        if (!X()) {
            return false;
        }
        c0();
        return true;
    }

    @RequiresApi(23)
    public float L() {
        return this.f31539k0.getSpacingMultiplier();
    }

    @RequiresApi(23)
    public void L0(@Nullable z zVar) {
        if (this.f31557t0 != zVar) {
            this.f31557t0 = zVar;
            d0(true);
        }
    }

    public int M() {
        return this.f31549p0;
    }

    public void M0(@Nullable CharSequence charSequence) {
        if (charSequence == null || !TextUtils.equals(this.G, charSequence)) {
            this.G = charSequence;
            this.H = null;
            j();
            c0();
        }
    }

    public final Layout.Alignment N() {
        int absoluteGravity = GravityCompat.getAbsoluteGravity(this.f31536j, this.I ? 1 : 0) & 7;
        return absoluteGravity != 1 ? absoluteGravity != 5 ? this.I ? Layout.Alignment.ALIGN_OPPOSITE : Layout.Alignment.ALIGN_NORMAL : this.I ? Layout.Alignment.ALIGN_NORMAL : Layout.Alignment.ALIGN_OPPOSITE : Layout.Alignment.ALIGN_CENTER;
    }

    public void N0(TimeInterpolator timeInterpolator) {
        this.Y = timeInterpolator;
        c0();
    }

    @Nullable
    public TimeInterpolator O() {
        return this.X;
    }

    public void O0(@NonNull TextUtils.TruncateAt truncateAt) {
        this.F = truncateAt;
        c0();
    }

    @Nullable
    public CharSequence P() {
        return this.G;
    }

    public void P0(Typeface typeface) {
        boolean o02 = o0(typeface);
        boolean z02 = z0(typeface);
        if (o02 || z02) {
            c0();
        }
    }

    public final void Q(@NonNull TextPaint textPaint) {
        textPaint.setTextSize(this.f31542m);
        textPaint.setTypeface(this.f31560w);
        textPaint.setLetterSpacing(this.f31533h0);
    }

    public final boolean Q0() {
        if (this.f31549p0 > 1) {
            return (!this.I || this.f31522c) && !this.K;
        }
        return false;
    }

    public final void R(@NonNull TextPaint textPaint) {
        textPaint.setTextSize(this.f31540l);
        textPaint.setTypeface(this.f31563z);
        textPaint.setLetterSpacing(this.f31535i0);
    }

    @NonNull
    public TextUtils.TruncateAt S() {
        return this.F;
    }

    public final void T(float f11) {
        if (this.f31522c) {
            this.f31534i.set(f11 < this.f31526e ? this.f31530g : this.f31532h);
            return;
        }
        this.f31534i.left = Z(this.f31530g.left, this.f31532h.left, f11, this.X);
        this.f31534i.top = Z(this.f31550q, this.f31552r, f11, this.X);
        this.f31534i.right = Z(this.f31530g.right, this.f31532h.right, f11, this.X);
        this.f31534i.bottom = Z(this.f31530g.bottom, this.f31532h.bottom, f11, this.X);
    }

    public final boolean V() {
        return ViewCompat.getLayoutDirection(this.f31518a) == 1;
    }

    public boolean W() {
        return this.J;
    }

    public final boolean X() {
        ColorStateList colorStateList = this.f31546o;
        if (colorStateList != null && colorStateList.isStateful()) {
            return true;
        }
        ColorStateList colorStateList2 = this.f31544n;
        return colorStateList2 != null && colorStateList2.isStateful();
    }

    public final boolean Y(@NonNull CharSequence charSequence, boolean z11) {
        return (z11 ? TextDirectionHeuristicsCompat.FIRSTSTRONG_RTL : TextDirectionHeuristicsCompat.FIRSTSTRONG_LTR).isRtl(charSequence, 0, charSequence.length());
    }

    public void a0(@NonNull Configuration configuration) {
        if (Build.VERSION.SDK_INT >= 31) {
            Typeface typeface = this.f31562y;
            if (typeface != null) {
                this.f31561x = sn.h.b(configuration, typeface);
            }
            Typeface typeface2 = this.B;
            if (typeface2 != null) {
                this.A = sn.h.b(configuration, typeface2);
            }
            Typeface typeface3 = this.f31561x;
            if (typeface3 == null) {
                typeface3 = this.f31562y;
            }
            this.f31560w = typeface3;
            Typeface typeface4 = this.A;
            if (typeface4 == null) {
                typeface4 = this.B;
            }
            this.f31563z = typeface4;
            d0(true);
        }
    }

    public final void b(boolean z11) {
        StaticLayout staticLayout;
        i(1.0f, z11);
        CharSequence charSequence = this.H;
        if (charSequence != null && (staticLayout = this.f31539k0) != null) {
            this.f31547o0 = TextUtils.ellipsize(charSequence, this.V, staticLayout.getWidth(), this.F);
        }
        CharSequence charSequence2 = this.f31547o0;
        float f11 = 0.0f;
        if (charSequence2 != null) {
            this.f31541l0 = b0(this.V, charSequence2);
        } else {
            this.f31541l0 = 0.0f;
        }
        int absoluteGravity = GravityCompat.getAbsoluteGravity(this.f31538k, this.I ? 1 : 0);
        int i11 = absoluteGravity & 112;
        if (i11 == 48) {
            this.f31552r = this.f31532h.top;
        } else if (i11 != 80) {
            this.f31552r = this.f31532h.centerY() - ((this.V.descent() - this.V.ascent()) / 2.0f);
        } else {
            this.f31552r = this.f31532h.bottom + this.V.ascent();
        }
        int i12 = absoluteGravity & GravityCompat.RELATIVE_HORIZONTAL_GRAVITY_MASK;
        if (i12 == 1) {
            this.f31556t = this.f31532h.centerX() - (this.f31541l0 / 2.0f);
        } else if (i12 != 5) {
            this.f31556t = this.f31532h.left;
        } else {
            this.f31556t = this.f31532h.right - this.f31541l0;
        }
        i(0.0f, z11);
        float height = this.f31539k0 != null ? r10.getHeight() : 0.0f;
        StaticLayout staticLayout2 = this.f31539k0;
        if (staticLayout2 == null || this.f31549p0 <= 1) {
            CharSequence charSequence3 = this.H;
            if (charSequence3 != null) {
                f11 = b0(this.V, charSequence3);
            }
        } else {
            f11 = staticLayout2.getWidth();
        }
        StaticLayout staticLayout3 = this.f31539k0;
        this.f31548p = staticLayout3 != null ? staticLayout3.getLineCount() : 0;
        int absoluteGravity2 = GravityCompat.getAbsoluteGravity(this.f31536j, this.I ? 1 : 0);
        int i13 = absoluteGravity2 & 112;
        if (i13 == 48) {
            this.f31550q = this.f31530g.top;
        } else if (i13 != 80) {
            this.f31550q = this.f31530g.centerY() - (height / 2.0f);
        } else {
            this.f31550q = (this.f31530g.bottom - height) + this.V.descent();
        }
        int i14 = absoluteGravity2 & GravityCompat.RELATIVE_HORIZONTAL_GRAVITY_MASK;
        if (i14 == 1) {
            this.f31554s = this.f31530g.centerX() - (f11 / 2.0f);
        } else if (i14 != 5) {
            this.f31554s = this.f31530g.left;
        } else {
            this.f31554s = this.f31530g.right - f11;
        }
        j();
        E0(this.f31520b);
    }

    public final float b0(TextPaint textPaint, CharSequence charSequence) {
        return textPaint.measureText(charSequence, 0, charSequence.length());
    }

    public final void c() {
        g(this.f31520b);
    }

    public void c0() {
        d0(false);
    }

    public final float d(@FloatRange(from = 0.0d, to = 1.0d) float f11) {
        float f12 = this.f31526e;
        return f11 <= f12 ? vm.b.b(1.0f, 0.0f, this.f31524d, f12, f11) : vm.b.b(0.0f, 1.0f, f12, 1.0f, f11);
    }

    public void d0(boolean z11) {
        if ((this.f31518a.getHeight() <= 0 || this.f31518a.getWidth() <= 0) && !z11) {
            return;
        }
        b(z11);
        c();
    }

    public final float e() {
        float f11 = this.f31524d;
        return f11 + ((1.0f - f11) * 0.5f);
    }

    public final boolean f(@NonNull CharSequence charSequence) {
        boolean V = V();
        return this.J ? Y(charSequence, V) : V;
    }

    public void f0(@Nullable ColorStateList colorStateList) {
        if (this.f31546o == colorStateList && this.f31544n == colorStateList) {
            return;
        }
        this.f31546o = colorStateList;
        this.f31544n = colorStateList;
        c0();
    }

    public final void g(float f11) {
        float f12;
        T(f11);
        if (!this.f31522c) {
            this.f31558u = Z(this.f31554s, this.f31556t, f11, this.X);
            this.f31559v = Z(this.f31550q, this.f31552r, f11, this.X);
            E0(f11);
            f12 = f11;
        } else if (f11 < this.f31526e) {
            this.f31558u = this.f31554s;
            this.f31559v = this.f31550q;
            E0(0.0f);
            f12 = 0.0f;
        } else {
            this.f31558u = this.f31556t;
            this.f31559v = this.f31552r - Math.max(0, this.f31528f);
            E0(1.0f);
            f12 = 1.0f;
        }
        TimeInterpolator timeInterpolator = vm.b.f94061b;
        j0(1.0f - Z(0.0f, 1.0f, 1.0f - f11, timeInterpolator));
        u0(Z(1.0f, 0.0f, f11, timeInterpolator));
        if (this.f31546o != this.f31544n) {
            this.V.setColor(a(y(), w(), f12));
        } else {
            this.V.setColor(w());
        }
        int i11 = Build.VERSION.SDK_INT;
        float f13 = this.f31533h0;
        float f14 = this.f31535i0;
        if (f13 != f14) {
            this.V.setLetterSpacing(Z(f14, f13, f11, timeInterpolator));
        } else {
            this.V.setLetterSpacing(f13);
        }
        this.P = Z(this.f31525d0, this.Z, f11, null);
        this.Q = Z(this.f31527e0, this.f31519a0, f11, null);
        this.R = Z(this.f31529f0, this.f31521b0, f11, null);
        int a11 = a(x(this.f31531g0), x(this.f31523c0), f11);
        this.S = a11;
        this.V.setShadowLayer(this.P, this.Q, this.R, a11);
        if (this.f31522c) {
            this.V.setAlpha((int) (d(f11) * this.V.getAlpha()));
            if (i11 >= 31) {
                TextPaint textPaint = this.V;
                textPaint.setShadowLayer(this.P, this.Q, this.R, en.u.a(this.S, textPaint.getAlpha()));
            }
        }
        ViewCompat.postInvalidateOnAnimation(this.f31518a);
    }

    public void g0(int i11, int i12, int i13, int i14) {
        if (e0(this.f31532h, i11, i12, i13, i14)) {
            return;
        }
        this.f31532h.set(i11, i12, i13, i14);
        this.U = true;
    }

    public final void h(float f11) {
        i(f11, false);
    }

    public void h0(@NonNull Rect rect) {
        g0(rect.left, rect.top, rect.right, rect.bottom);
    }

    public final void i(float f11, boolean z11) {
        float f12;
        float f13;
        Typeface typeface;
        if (this.G == null) {
            return;
        }
        float width = this.f31532h.width();
        float width2 = this.f31530g.width();
        if (U(f11, 1.0f)) {
            f12 = this.f31542m;
            f13 = this.f31533h0;
            this.N = 1.0f;
            typeface = this.f31560w;
        } else {
            float f14 = this.f31540l;
            float f15 = this.f31535i0;
            Typeface typeface2 = this.f31563z;
            if (U(f11, 0.0f)) {
                this.N = 1.0f;
            } else {
                this.N = Z(this.f31540l, this.f31542m, f11, this.Y) / this.f31540l;
            }
            float f16 = this.f31542m / this.f31540l;
            width = (z11 || this.f31522c || width2 * f16 <= width) ? width2 : Math.min(width / f16, width2);
            f12 = f14;
            f13 = f15;
            typeface = typeface2;
        }
        if (width > 0.0f) {
            boolean z12 = this.O != f12;
            boolean z13 = this.f31537j0 != f13;
            boolean z14 = this.C != typeface;
            StaticLayout staticLayout = this.f31539k0;
            boolean z15 = z12 || z13 || (staticLayout != null && (width > ((float) staticLayout.getWidth()) ? 1 : (width == ((float) staticLayout.getWidth()) ? 0 : -1)) != 0) || z14 || this.U;
            this.O = f12;
            this.f31537j0 = f13;
            this.C = typeface;
            this.U = false;
            this.V.setLinearText(this.N != 1.0f);
            r5 = z15;
        }
        if (this.H == null || r5) {
            this.V.setTextSize(this.O);
            this.V.setTypeface(this.C);
            this.V.setLetterSpacing(this.f31537j0);
            this.I = f(this.G);
            StaticLayout k11 = k(Q0() ? this.f31549p0 : 1, width, this.I);
            this.f31539k0 = k11;
            this.H = k11.getText();
        }
    }

    public void i0(int i11) {
        sn.d dVar = new sn.d(this.f31518a.getContext(), i11);
        if (dVar.i() != null) {
            this.f31546o = dVar.i();
        }
        if (dVar.j() != 0.0f) {
            this.f31542m = dVar.j();
        }
        ColorStateList colorStateList = dVar.f88855c;
        if (colorStateList != null) {
            this.f31523c0 = colorStateList;
        }
        this.f31519a0 = dVar.f88860h;
        this.f31521b0 = dVar.f88861i;
        this.Z = dVar.f88862j;
        this.f31533h0 = dVar.f88864l;
        sn.a aVar = this.E;
        if (aVar != null) {
            aVar.c();
        }
        this.E = new sn.a(new a(), dVar.e());
        dVar.h(this.f31518a.getContext(), this.E);
        c0();
    }

    public final void j() {
        Bitmap bitmap = this.L;
        if (bitmap != null) {
            bitmap.recycle();
            this.L = null;
        }
    }

    public final void j0(float f11) {
        this.f31543m0 = f11;
        ViewCompat.postInvalidateOnAnimation(this.f31518a);
    }

    public final StaticLayout k(int i11, float f11, boolean z11) {
        StaticLayout staticLayout;
        try {
            staticLayout = y.c(this.G, this.V, (int) f11).e(this.F).i(z11).d(i11 == 1 ? Layout.Alignment.ALIGN_NORMAL : N()).h(false).k(i11).j(this.f31551q0, this.f31553r0).g(this.f31555s0).m(this.f31557t0).a();
        } catch (y.a e11) {
            Log.e(f31513v0, e11.getCause().getMessage(), e11);
            staticLayout = null;
        }
        return (StaticLayout) Preconditions.checkNotNull(staticLayout);
    }

    public void k0(ColorStateList colorStateList) {
        if (this.f31546o != colorStateList) {
            this.f31546o = colorStateList;
            c0();
        }
    }

    public void l(@NonNull Canvas canvas) {
        int save = canvas.save();
        if (this.H == null || this.f31534i.width() <= 0.0f || this.f31534i.height() <= 0.0f) {
            return;
        }
        this.V.setTextSize(this.O);
        float f11 = this.f31558u;
        float f12 = this.f31559v;
        boolean z11 = this.K && this.L != null;
        float f13 = this.N;
        if (f13 != 1.0f && !this.f31522c) {
            canvas.scale(f13, f13, f11, f12);
        }
        if (z11) {
            canvas.drawBitmap(this.L, f11, f12, this.M);
            canvas.restoreToCount(save);
            return;
        }
        if (!Q0() || (this.f31522c && this.f31520b <= this.f31526e)) {
            canvas.translate(f11, f12);
            this.f31539k0.draw(canvas);
        } else {
            m(canvas, this.f31558u - this.f31539k0.getLineStart(0), f12);
        }
        canvas.restoreToCount(save);
    }

    public void l0(int i11) {
        if (this.f31538k != i11) {
            this.f31538k = i11;
            c0();
        }
    }

    public final void m(@NonNull Canvas canvas, float f11, float f12) {
        int alpha = this.V.getAlpha();
        canvas.translate(f11, f12);
        if (!this.f31522c) {
            this.V.setAlpha((int) (this.f31545n0 * alpha));
            if (Build.VERSION.SDK_INT >= 31) {
                TextPaint textPaint = this.V;
                textPaint.setShadowLayer(this.P, this.Q, this.R, en.u.a(this.S, textPaint.getAlpha()));
            }
            this.f31539k0.draw(canvas);
        }
        if (!this.f31522c) {
            this.V.setAlpha((int) (this.f31543m0 * alpha));
        }
        int i11 = Build.VERSION.SDK_INT;
        if (i11 >= 31) {
            TextPaint textPaint2 = this.V;
            textPaint2.setShadowLayer(this.P, this.Q, this.R, en.u.a(this.S, textPaint2.getAlpha()));
        }
        int lineBaseline = this.f31539k0.getLineBaseline(0);
        CharSequence charSequence = this.f31547o0;
        float f13 = lineBaseline;
        canvas.drawText(charSequence, 0, charSequence.length(), 0.0f, f13, this.V);
        if (i11 >= 31) {
            this.V.setShadowLayer(this.P, this.Q, this.R, this.S);
        }
        if (this.f31522c) {
            return;
        }
        String trim = this.f31547o0.toString().trim();
        if (trim.endsWith("…")) {
            trim = trim.substring(0, trim.length() - 1);
        }
        String str = trim;
        this.V.setAlpha(alpha);
        canvas.drawText(str, 0, Math.min(this.f31539k0.getLineEnd(0), str.length()), 0.0f, f13, (Paint) this.V);
    }

    public void m0(float f11) {
        if (this.f31542m != f11) {
            this.f31542m = f11;
            c0();
        }
    }

    public final void n() {
        if (this.L != null || this.f31530g.isEmpty() || TextUtils.isEmpty(this.H)) {
            return;
        }
        g(0.0f);
        int width = this.f31539k0.getWidth();
        int height = this.f31539k0.getHeight();
        if (width <= 0 || height <= 0) {
            return;
        }
        this.L = Bitmap.createBitmap(width, height, Bitmap.Config.ARGB_8888);
        this.f31539k0.draw(new Canvas(this.L));
        if (this.M == null) {
            this.M = new Paint(3);
        }
    }

    public void n0(Typeface typeface) {
        if (o0(typeface)) {
            c0();
        }
    }

    public void o(@NonNull RectF rectF, int i11, int i12) {
        this.I = f(this.G);
        rectF.left = Math.max(s(i11, i12), this.f31532h.left);
        rectF.top = this.f31532h.top;
        rectF.right = Math.min(t(rectF, i11, i12), this.f31532h.right);
        rectF.bottom = this.f31532h.top + r();
    }

    public final boolean o0(Typeface typeface) {
        sn.a aVar = this.E;
        if (aVar != null) {
            aVar.c();
        }
        if (this.f31562y == typeface) {
            return false;
        }
        this.f31562y = typeface;
        Typeface b11 = sn.h.b(this.f31518a.getContext().getResources().getConfiguration(), typeface);
        this.f31561x = b11;
        if (b11 == null) {
            b11 = this.f31562y;
        }
        this.f31560w = b11;
        return true;
    }

    public ColorStateList p() {
        return this.f31546o;
    }

    public void p0(int i11) {
        this.f31528f = i11;
    }

    public int q() {
        return this.f31538k;
    }

    public void q0(int i11, int i12, int i13, int i14) {
        if (e0(this.f31530g, i11, i12, i13, i14)) {
            return;
        }
        this.f31530g.set(i11, i12, i13, i14);
        this.U = true;
    }

    public float r() {
        Q(this.W);
        return -this.W.ascent();
    }

    public void r0(@NonNull Rect rect) {
        q0(rect.left, rect.top, rect.right, rect.bottom);
    }

    public final float s(int i11, int i12) {
        return (i12 == 17 || (i12 & 7) == 1) ? (i11 / 2.0f) - (this.f31541l0 / 2.0f) : ((i12 & GravityCompat.END) == 8388613 || (i12 & 5) == 5) ? this.I ? this.f31532h.left : this.f31532h.right - this.f31541l0 : this.I ? this.f31532h.right - this.f31541l0 : this.f31532h.left;
    }

    public void s0(float f11) {
        if (this.f31535i0 != f11) {
            this.f31535i0 = f11;
            c0();
        }
    }

    public final float t(@NonNull RectF rectF, int i11, int i12) {
        return (i12 == 17 || (i12 & 7) == 1) ? (i11 / 2.0f) + (this.f31541l0 / 2.0f) : ((i12 & GravityCompat.END) == 8388613 || (i12 & 5) == 5) ? this.I ? rectF.left + this.f31541l0 : this.f31532h.right : this.I ? this.f31532h.right : rectF.left + this.f31541l0;
    }

    public void t0(int i11) {
        sn.d dVar = new sn.d(this.f31518a.getContext(), i11);
        if (dVar.i() != null) {
            this.f31544n = dVar.i();
        }
        if (dVar.j() != 0.0f) {
            this.f31540l = dVar.j();
        }
        ColorStateList colorStateList = dVar.f88855c;
        if (colorStateList != null) {
            this.f31531g0 = colorStateList;
        }
        this.f31527e0 = dVar.f88860h;
        this.f31529f0 = dVar.f88861i;
        this.f31525d0 = dVar.f88862j;
        this.f31535i0 = dVar.f88864l;
        sn.a aVar = this.D;
        if (aVar != null) {
            aVar.c();
        }
        this.D = new sn.a(new C0376b(), dVar.e());
        dVar.h(this.f31518a.getContext(), this.D);
        c0();
    }

    public float u() {
        return this.f31542m;
    }

    public final void u0(float f11) {
        this.f31545n0 = f11;
        ViewCompat.postInvalidateOnAnimation(this.f31518a);
    }

    public Typeface v() {
        Typeface typeface = this.f31560w;
        return typeface != null ? typeface : Typeface.DEFAULT;
    }

    public void v0(ColorStateList colorStateList) {
        if (this.f31544n != colorStateList) {
            this.f31544n = colorStateList;
            c0();
        }
    }

    @ColorInt
    public int w() {
        return x(this.f31546o);
    }

    public void w0(int i11) {
        if (this.f31536j != i11) {
            this.f31536j = i11;
            c0();
        }
    }

    @ColorInt
    public final int x(@Nullable ColorStateList colorStateList) {
        if (colorStateList == null) {
            return 0;
        }
        int[] iArr = this.T;
        return iArr != null ? colorStateList.getColorForState(iArr, 0) : colorStateList.getDefaultColor();
    }

    public void x0(float f11) {
        if (this.f31540l != f11) {
            this.f31540l = f11;
            c0();
        }
    }

    @ColorInt
    public final int y() {
        return x(this.f31544n);
    }

    public void y0(Typeface typeface) {
        if (z0(typeface)) {
            c0();
        }
    }

    public int z() {
        return this.f31548p;
    }

    public final boolean z0(Typeface typeface) {
        sn.a aVar = this.D;
        if (aVar != null) {
            aVar.c();
        }
        if (this.B == typeface) {
            return false;
        }
        this.B = typeface;
        Typeface b11 = sn.h.b(this.f31518a.getContext().getResources().getConfiguration(), typeface);
        this.A = b11;
        if (b11 == null) {
            b11 = this.B;
        }
        this.f31563z = b11;
        return true;
    }
}
