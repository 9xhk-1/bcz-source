package ao;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import androidx.annotation.AttrRes;
import androidx.annotation.FloatRange;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.Px;
import androidx.annotation.RestrictTo;
import androidx.annotation.StringRes;
import androidx.annotation.StyleRes;
import androidx.core.graphics.ColorUtils;
import com.google.android.material.R;
import com.google.android.material.internal.a0;
import com.google.android.material.internal.d0;
import en.u;
import sn.c;
import sn.d;
import vm.b;
import vn.h;
import vn.j;
import vn.k;
import vn.m;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes7.dex */
public class a extends k implements a0.b {

    @StyleRes
    public static final int W = R.style.Widget_MaterialComponents_Tooltip;

    @AttrRes
    public static final int X = R.attr.tooltipStyle;

    @Nullable
    public CharSequence E;

    @NonNull
    public final Context F;

    @Nullable
    public final Paint.FontMetrics G;

    @NonNull
    public final a0 H;

    @NonNull
    public final View.OnLayoutChangeListener I;

    @NonNull
    public final Rect J;
    public int K;
    public int L;
    public int M;
    public int N;
    public boolean O;
    public int P;
    public int Q;
    public float R;
    public float S;
    public final float T;
    public float U;
    public float V;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    /* renamed from: ao.a$a, reason: collision with other inner class name */
    public class ViewOnLayoutChangeListenerC0095a implements View.OnLayoutChangeListener {
        public ViewOnLayoutChangeListenerC0095a() {
        }

        @Override // android.view.View.OnLayoutChangeListener
        public void onLayoutChange(View view, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18) {
            a.this.s1(view);
        }
    }

    public a(@NonNull Context context, AttributeSet attributeSet, @AttrRes int i11, @StyleRes int i12) {
        super(context, attributeSet, i11, i12);
        this.G = new Paint.FontMetrics();
        a0 a0Var = new a0(this);
        this.H = a0Var;
        this.I = new ViewOnLayoutChangeListenerC0095a();
        this.J = new Rect();
        this.R = 1.0f;
        this.S = 1.0f;
        this.T = 0.5f;
        this.U = 0.5f;
        this.V = 1.0f;
        this.F = context;
        a0Var.g().density = context.getResources().getDisplayMetrics().density;
        a0Var.g().setTextAlign(Paint.Align.CENTER);
    }

    private float S0() {
        this.H.g().getFontMetrics(this.G);
        Paint.FontMetrics fontMetrics = this.G;
        return (fontMetrics.descent + fontMetrics.ascent) / 2.0f;
    }

    @NonNull
    public static a U0(@NonNull Context context) {
        return W0(context, null, X, W);
    }

    @NonNull
    public static a V0(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        return W0(context, attributeSet, X, W);
    }

    @NonNull
    public static a W0(@NonNull Context context, @Nullable AttributeSet attributeSet, @AttrRes int i11, @StyleRes int i12) {
        a aVar = new a(context, attributeSet, i11, i12);
        aVar.h1(attributeSet, i11, i12);
        return aVar;
    }

    private void h1(@Nullable AttributeSet attributeSet, @AttrRes int i11, @StyleRes int i12) {
        TypedArray k11 = d0.k(this.F, attributeSet, R.styleable.Tooltip, i11, i12, new int[0]);
        this.P = this.F.getResources().getDimensionPixelSize(R.dimen.mtrl_tooltip_arrowSize);
        boolean z11 = k11.getBoolean(R.styleable.Tooltip_showMarker, true);
        this.O = z11;
        if (z11) {
            setShapeAppearanceModel(getShapeAppearanceModel().v().t(X0()).m());
        } else {
            this.P = 0;
        }
        n1(k11.getText(R.styleable.Tooltip_android_text));
        d h11 = c.h(this.F, k11, R.styleable.Tooltip_android_textAppearance);
        if (h11 != null) {
            int i13 = R.styleable.Tooltip_android_textColor;
            if (k11.hasValue(i13)) {
                h11.k(c.a(this.F, k11, i13));
            }
        }
        o1(h11);
        p0(ColorStateList.valueOf(k11.getColor(R.styleable.Tooltip_backgroundTint, u.s(ColorUtils.setAlphaComponent(u.c(this.F, android.R.attr.colorBackground, a.class.getCanonicalName()), com.jiongji.andriod.card.R.styleable.Theme_drawable_syncview_update), ColorUtils.setAlphaComponent(u.c(this.F, R.attr.colorOnBackground, a.class.getCanonicalName()), 153)))));
        G0(ColorStateList.valueOf(u.c(this.F, R.attr.colorSurface, a.class.getCanonicalName())));
        this.K = k11.getDimensionPixelSize(R.styleable.Tooltip_android_padding, 0);
        this.L = k11.getDimensionPixelSize(R.styleable.Tooltip_android_minWidth, 0);
        this.M = k11.getDimensionPixelSize(R.styleable.Tooltip_android_minHeight, 0);
        this.N = k11.getDimensionPixelSize(R.styleable.Tooltip_android_layout_margin, 0);
        k11.recycle();
    }

    public final float R0() {
        int i11;
        if (((this.J.right - getBounds().right) - this.Q) - this.N < 0) {
            i11 = ((this.J.right - getBounds().right) - this.Q) - this.N;
        } else {
            if (((this.J.left - getBounds().left) - this.Q) + this.N <= 0) {
                return 0.0f;
            }
            i11 = ((this.J.left - getBounds().left) - this.Q) + this.N;
        }
        return i11;
    }

    public final float T0(@NonNull Rect rect) {
        return rect.centerY() - S0();
    }

    public final h X0() {
        float f11 = -R0();
        float width = ((float) (getBounds().width() - (this.P * Math.sqrt(2.0d)))) / 2.0f;
        return new m(new j(this.P), Math.min(Math.max(f11, -width), width));
    }

    public void Y0(@Nullable View view) {
        if (view == null) {
            return;
        }
        view.removeOnLayoutChangeListener(this.I);
    }

    public final void Z0(@NonNull Canvas canvas) {
        if (this.E == null) {
            return;
        }
        int T0 = (int) T0(getBounds());
        if (this.H.e() != null) {
            this.H.g().drawableState = getState();
            this.H.o(this.F);
            this.H.g().setAlpha((int) (this.V * 255.0f));
        }
        CharSequence charSequence = this.E;
        canvas.drawText(charSequence, 0, charSequence.length(), r0.centerX(), T0, this.H.g());
    }

    @Override // com.google.android.material.internal.a0.b
    public void a() {
        invalidateSelf();
    }

    public int a1() {
        return this.N;
    }

    public int b1() {
        return this.M;
    }

    public int c1() {
        return this.L;
    }

    @Nullable
    public CharSequence d1() {
        return this.E;
    }

    @Override // vn.k, android.graphics.drawable.Drawable
    public void draw(@NonNull Canvas canvas) {
        canvas.save();
        float R0 = R0();
        float f11 = (float) (-((this.P * Math.sqrt(2.0d)) - this.P));
        canvas.scale(this.R, this.S, getBounds().left + (getBounds().width() * 0.5f), getBounds().top + (getBounds().height() * this.U));
        canvas.translate(R0, f11);
        super.draw(canvas);
        Z0(canvas);
        canvas.restore();
    }

    @Nullable
    public d e1() {
        return this.H.e();
    }

    public int f1() {
        return this.K;
    }

    public final float g1() {
        CharSequence charSequence = this.E;
        if (charSequence == null) {
            return 0.0f;
        }
        return this.H.h(charSequence.toString());
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return (int) Math.max(this.H.g().getTextSize(), this.M);
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return (int) Math.max((this.K * 2) + g1(), this.L);
    }

    public void i1(@Px int i11) {
        this.N = i11;
        invalidateSelf();
    }

    public void j1(@Px int i11) {
        this.M = i11;
        invalidateSelf();
    }

    public void k1(@Px int i11) {
        this.L = i11;
        invalidateSelf();
    }

    public void l1(@Nullable View view) {
        if (view == null) {
            return;
        }
        s1(view);
        view.addOnLayoutChangeListener(this.I);
    }

    public void m1(@FloatRange(from = 0.0d, to = 1.0d) float f11) {
        this.U = 1.2f;
        this.R = f11;
        this.S = f11;
        this.V = b.b(0.0f, 1.0f, 0.19f, 1.0f, f11);
        invalidateSelf();
    }

    public void n1(@Nullable CharSequence charSequence) {
        if (TextUtils.equals(this.E, charSequence)) {
            return;
        }
        this.E = charSequence;
        this.H.n(true);
        invalidateSelf();
    }

    public void o1(@Nullable d dVar) {
        this.H.l(dVar, this.F);
    }

    @Override // vn.k, android.graphics.drawable.Drawable
    public void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        if (this.O) {
            setShapeAppearanceModel(getShapeAppearanceModel().v().t(X0()).m());
        }
    }

    @Override // vn.k, android.graphics.drawable.Drawable, com.google.android.material.internal.a0.b
    public boolean onStateChange(int[] iArr) {
        return super.onStateChange(iArr);
    }

    public void p1(@StyleRes int i11) {
        o1(new d(this.F, i11));
    }

    public void q1(@Px int i11) {
        this.K = i11;
        invalidateSelf();
    }

    public void r1(@StringRes int i11) {
        n1(this.F.getResources().getString(i11));
    }

    public final void s1(@NonNull View view) {
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        this.Q = iArr[0];
        view.getWindowVisibleDisplayFrame(this.J);
    }
}
