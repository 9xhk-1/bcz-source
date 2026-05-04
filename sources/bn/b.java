package bn;

import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import androidx.annotation.ColorInt;
import androidx.annotation.Dimension;
import androidx.annotation.FloatRange;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.annotation.StyleRes;
import androidx.core.graphics.drawable.DrawableCompat;
import androidx.core.view.GravityCompat;
import androidx.core.view.ViewCompat;
import com.google.android.material.R;
import com.google.android.material.card.MaterialCardView;
import en.u;
import pn.j;
import sn.c;
import vn.f;
import vn.g;
import vn.k;
import vn.o;
import vn.p;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes7.dex */
public class b {
    public static final double A = Math.cos(Math.toRadians(45.0d));
    public static final float B = 1.5f;
    public static final int C = 2;
    public static final Drawable D;
    public static final int E = 300;

    /* renamed from: z, reason: collision with root package name */
    public static final int f6975z = -1;

    /* renamed from: a, reason: collision with root package name */
    @NonNull
    public final MaterialCardView f6976a;

    /* renamed from: c, reason: collision with root package name */
    @NonNull
    public final k f6978c;

    /* renamed from: d, reason: collision with root package name */
    @NonNull
    public final k f6979d;

    /* renamed from: e, reason: collision with root package name */
    @Dimension
    public int f6980e;

    /* renamed from: f, reason: collision with root package name */
    @Dimension
    public int f6981f;

    /* renamed from: g, reason: collision with root package name */
    public int f6982g;

    /* renamed from: h, reason: collision with root package name */
    @Dimension
    public int f6983h;

    /* renamed from: i, reason: collision with root package name */
    @Nullable
    public Drawable f6984i;

    /* renamed from: j, reason: collision with root package name */
    @Nullable
    public Drawable f6985j;

    /* renamed from: k, reason: collision with root package name */
    @Nullable
    public ColorStateList f6986k;

    /* renamed from: l, reason: collision with root package name */
    @Nullable
    public ColorStateList f6987l;

    /* renamed from: m, reason: collision with root package name */
    @Nullable
    public p f6988m;

    /* renamed from: n, reason: collision with root package name */
    @Nullable
    public ColorStateList f6989n;

    /* renamed from: o, reason: collision with root package name */
    @Nullable
    public Drawable f6990o;

    /* renamed from: p, reason: collision with root package name */
    @Nullable
    public LayerDrawable f6991p;

    /* renamed from: q, reason: collision with root package name */
    @Nullable
    public k f6992q;

    /* renamed from: r, reason: collision with root package name */
    @Nullable
    public k f6993r;

    /* renamed from: t, reason: collision with root package name */
    public boolean f6995t;

    /* renamed from: u, reason: collision with root package name */
    @Nullable
    public ValueAnimator f6996u;

    /* renamed from: v, reason: collision with root package name */
    public final TimeInterpolator f6997v;

    /* renamed from: w, reason: collision with root package name */
    public final int f6998w;

    /* renamed from: x, reason: collision with root package name */
    public final int f6999x;

    /* renamed from: b, reason: collision with root package name */
    @NonNull
    public final Rect f6977b = new Rect();

    /* renamed from: s, reason: collision with root package name */
    public boolean f6994s = false;

    /* renamed from: y, reason: collision with root package name */
    public float f7000y = 0.0f;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class a extends InsetDrawable {
        public a(Drawable drawable, int i11, int i12, int i13, int i14) {
            super(drawable, i11, i12, i13, i14);
        }

        @Override // android.graphics.drawable.Drawable
        public int getMinimumHeight() {
            return -1;
        }

        @Override // android.graphics.drawable.Drawable
        public int getMinimumWidth() {
            return -1;
        }

        @Override // android.graphics.drawable.InsetDrawable, android.graphics.drawable.DrawableWrapper, android.graphics.drawable.Drawable
        public boolean getPadding(Rect rect) {
            return false;
        }
    }

    static {
        D = Build.VERSION.SDK_INT <= 28 ? new ColorDrawable() : null;
    }

    public b(@NonNull MaterialCardView materialCardView, AttributeSet attributeSet, int i11, @StyleRes int i12) {
        this.f6976a = materialCardView;
        k kVar = new k(materialCardView.getContext(), attributeSet, i11, i12);
        this.f6978c = kVar;
        kVar.a0(materialCardView.getContext());
        kVar.w0(-12303292);
        p.b v11 = kVar.getShapeAppearanceModel().v();
        TypedArray obtainStyledAttributes = materialCardView.getContext().obtainStyledAttributes(attributeSet, R.styleable.CardView, i11, R.style.CardView);
        int i13 = R.styleable.CardView_cardCornerRadius;
        if (obtainStyledAttributes.hasValue(i13)) {
            v11.o(obtainStyledAttributes.getDimension(i13, 0.0f));
        }
        this.f6979d = new k();
        Y(v11.m());
        this.f6997v = j.g(materialCardView.getContext(), R.attr.motionEasingLinearInterpolator, vm.b.f94060a);
        this.f6998w = j.f(materialCardView.getContext(), R.attr.motionDurationShort2, 300);
        this.f6999x = j.f(materialCardView.getContext(), R.attr.motionDurationShort1, 300);
        obtainStyledAttributes.recycle();
    }

    public static /* synthetic */ void a(b bVar, ValueAnimator valueAnimator) {
        bVar.getClass();
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        bVar.f6985j.setAlpha((int) (255.0f * floatValue));
        bVar.f7000y = floatValue;
    }

    @Nullable
    public ColorStateList A() {
        return this.f6989n;
    }

    @Dimension
    public int B() {
        return this.f6983h;
    }

    @NonNull
    public Rect C() {
        return this.f6977b;
    }

    @NonNull
    public final Drawable D(Drawable drawable) {
        int i11;
        int i12;
        if (this.f6976a.getUseCompatPadding()) {
            i12 = (int) Math.ceil(f());
            i11 = (int) Math.ceil(e());
        } else {
            i11 = 0;
            i12 = 0;
        }
        return new a(drawable, i11, i12, i11, i12);
    }

    public boolean E() {
        return this.f6994s;
    }

    public boolean F() {
        return this.f6995t;
    }

    public final boolean G() {
        return (this.f6982g & 80) == 80;
    }

    public final boolean H() {
        return (this.f6982g & GravityCompat.END) == 8388613;
    }

    public void I(@NonNull TypedArray typedArray) {
        ColorStateList a11 = c.a(this.f6976a.getContext(), typedArray, R.styleable.MaterialCardView_strokeColor);
        this.f6989n = a11;
        if (a11 == null) {
            this.f6989n = ColorStateList.valueOf(-1);
        }
        this.f6983h = typedArray.getDimensionPixelSize(R.styleable.MaterialCardView_strokeWidth, 0);
        boolean z11 = typedArray.getBoolean(R.styleable.MaterialCardView_android_checkable, false);
        this.f6995t = z11;
        this.f6976a.setLongClickable(z11);
        this.f6987l = c.a(this.f6976a.getContext(), typedArray, R.styleable.MaterialCardView_checkedIconTint);
        Q(c.e(this.f6976a.getContext(), typedArray, R.styleable.MaterialCardView_checkedIcon));
        T(typedArray.getDimensionPixelSize(R.styleable.MaterialCardView_checkedIconSize, 0));
        S(typedArray.getDimensionPixelSize(R.styleable.MaterialCardView_checkedIconMargin, 0));
        this.f6982g = typedArray.getInteger(R.styleable.MaterialCardView_checkedIconGravity, 8388661);
        ColorStateList a12 = c.a(this.f6976a.getContext(), typedArray, R.styleable.MaterialCardView_rippleColor);
        this.f6986k = a12;
        if (a12 == null) {
            this.f6986k = ColorStateList.valueOf(u.d(this.f6976a, R.attr.colorControlHighlight));
        }
        M(c.a(this.f6976a.getContext(), typedArray, R.styleable.MaterialCardView_cardForegroundColor));
        k0();
        h0();
        l0();
        this.f6976a.setBackgroundInternal(D(this.f6978c));
        Drawable t11 = e0() ? t() : this.f6979d;
        this.f6984i = t11;
        this.f6976a.setForeground(D(t11));
    }

    public void J(int i11, int i12) {
        int i13;
        int i14;
        int i15;
        int i16;
        if (this.f6991p != null) {
            if (this.f6976a.getUseCompatPadding()) {
                i13 = (int) Math.ceil(f() * 2.0f);
                i14 = (int) Math.ceil(e() * 2.0f);
            } else {
                i13 = 0;
                i14 = 0;
            }
            int i17 = H() ? ((i11 - this.f6980e) - this.f6981f) - i14 : this.f6980e;
            int i18 = G() ? this.f6980e : ((i12 - this.f6980e) - this.f6981f) - i13;
            int i19 = H() ? this.f6980e : ((i11 - this.f6980e) - this.f6981f) - i14;
            int i21 = G() ? ((i12 - this.f6980e) - this.f6981f) - i13 : this.f6980e;
            if (ViewCompat.getLayoutDirection(this.f6976a) == 1) {
                i16 = i19;
                i15 = i17;
            } else {
                i15 = i19;
                i16 = i17;
            }
            this.f6991p.setLayerInset(2, i16, i21, i15, i18);
        }
    }

    public void K(boolean z11) {
        this.f6994s = z11;
    }

    public void L(ColorStateList colorStateList) {
        this.f6978c.p0(colorStateList);
    }

    public void M(@Nullable ColorStateList colorStateList) {
        k kVar = this.f6979d;
        if (colorStateList == null) {
            colorStateList = ColorStateList.valueOf(0);
        }
        kVar.p0(colorStateList);
    }

    public void N(boolean z11) {
        this.f6995t = z11;
    }

    public void O(boolean z11) {
        P(z11, false);
    }

    public void P(boolean z11, boolean z12) {
        Drawable drawable = this.f6985j;
        if (drawable != null) {
            if (z12) {
                b(z11);
            } else {
                drawable.setAlpha(z11 ? 255 : 0);
                this.f7000y = z11 ? 1.0f : 0.0f;
            }
        }
    }

    public void Q(@Nullable Drawable drawable) {
        if (drawable != null) {
            Drawable mutate = DrawableCompat.wrap(drawable).mutate();
            this.f6985j = mutate;
            DrawableCompat.setTintList(mutate, this.f6987l);
            O(this.f6976a.isChecked());
        } else {
            this.f6985j = D;
        }
        LayerDrawable layerDrawable = this.f6991p;
        if (layerDrawable != null) {
            layerDrawable.setDrawableByLayerId(R.id.mtrl_card_checked_layer_id, this.f6985j);
        }
    }

    public void R(int i11) {
        this.f6982g = i11;
        J(this.f6976a.getMeasuredWidth(), this.f6976a.getMeasuredHeight());
    }

    public void S(@Dimension int i11) {
        this.f6980e = i11;
    }

    public void T(@Dimension int i11) {
        this.f6981f = i11;
    }

    public void U(@Nullable ColorStateList colorStateList) {
        this.f6987l = colorStateList;
        Drawable drawable = this.f6985j;
        if (drawable != null) {
            DrawableCompat.setTintList(drawable, colorStateList);
        }
    }

    public void V(float f11) {
        Y(this.f6988m.w(f11));
        this.f6984i.invalidateSelf();
        if (d0() || c0()) {
            g0();
        }
        if (d0()) {
            j0();
        }
    }

    public void W(@FloatRange(from = 0.0d, to = 1.0d) float f11) {
        this.f6978c.q0(f11);
        k kVar = this.f6979d;
        if (kVar != null) {
            kVar.q0(f11);
        }
        k kVar2 = this.f6993r;
        if (kVar2 != null) {
            kVar2.q0(f11);
        }
    }

    public void X(@Nullable ColorStateList colorStateList) {
        this.f6986k = colorStateList;
        k0();
    }

    public void Y(@NonNull p pVar) {
        this.f6988m = pVar;
        this.f6978c.setShapeAppearanceModel(pVar);
        this.f6978c.v0(!r0.f0());
        k kVar = this.f6979d;
        if (kVar != null) {
            kVar.setShapeAppearanceModel(pVar);
        }
        k kVar2 = this.f6993r;
        if (kVar2 != null) {
            kVar2.setShapeAppearanceModel(pVar);
        }
        k kVar3 = this.f6992q;
        if (kVar3 != null) {
            kVar3.setShapeAppearanceModel(pVar);
        }
    }

    public void Z(ColorStateList colorStateList) {
        if (this.f6989n == colorStateList) {
            return;
        }
        this.f6989n = colorStateList;
        l0();
    }

    public void a0(@Dimension int i11) {
        if (i11 == this.f6983h) {
            return;
        }
        this.f6983h = i11;
        l0();
    }

    public void b(boolean z11) {
        float f11 = z11 ? 1.0f : 0.0f;
        float f12 = z11 ? 1.0f - this.f7000y : this.f7000y;
        ValueAnimator valueAnimator = this.f6996u;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.f6996u = null;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.f7000y, f11);
        this.f6996u = ofFloat;
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: bn.a
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                b.a(b.this, valueAnimator2);
            }
        });
        this.f6996u.setInterpolator(this.f6997v);
        this.f6996u.setDuration((long) ((z11 ? this.f6998w : this.f6999x) * f12));
        this.f6996u.start();
    }

    public void b0(int i11, int i12, int i13, int i14) {
        this.f6977b.set(i11, i12, i13, i14);
        g0();
    }

    public final float c() {
        return Math.max(Math.max(d(this.f6988m.q(), this.f6978c.T()), d(this.f6988m.s(), this.f6978c.U())), Math.max(d(this.f6988m.k(), this.f6978c.v()), d(this.f6988m.i(), this.f6978c.u())));
    }

    public final boolean c0() {
        return this.f6976a.getPreventCornerOverlap() && !g();
    }

    public final float d(f fVar, float f11) {
        if (fVar instanceof o) {
            return (float) ((1.0d - A) * f11);
        }
        if (fVar instanceof g) {
            return f11 / 2.0f;
        }
        return 0.0f;
    }

    public final boolean d0() {
        return this.f6976a.getPreventCornerOverlap() && g() && this.f6976a.getUseCompatPadding();
    }

    public final float e() {
        return this.f6976a.getMaxCardElevation() + (d0() ? c() : 0.0f);
    }

    public final boolean e0() {
        if (this.f6976a.isClickable()) {
            return true;
        }
        View view = this.f6976a;
        while (view.isDuplicateParentStateEnabled() && (view.getParent() instanceof View)) {
            view = (View) view.getParent();
        }
        return view.isClickable();
    }

    public final float f() {
        return (this.f6976a.getMaxCardElevation() * 1.5f) + (d0() ? c() : 0.0f);
    }

    public void f0() {
        Drawable drawable = this.f6984i;
        Drawable t11 = e0() ? t() : this.f6979d;
        this.f6984i = t11;
        if (drawable != t11) {
            i0(t11);
        }
    }

    public final boolean g() {
        return this.f6978c.f0();
    }

    public void g0() {
        int c11 = (int) (((c0() || d0()) ? c() : 0.0f) - v());
        MaterialCardView materialCardView = this.f6976a;
        Rect rect = this.f6977b;
        materialCardView.i(rect.left + c11, rect.top + c11, rect.right + c11, rect.bottom + c11);
    }

    @NonNull
    public final Drawable h() {
        StateListDrawable stateListDrawable = new StateListDrawable();
        k j11 = j();
        this.f6992q = j11;
        j11.p0(this.f6986k);
        stateListDrawable.addState(new int[]{android.R.attr.state_pressed}, this.f6992q);
        return stateListDrawable;
    }

    public void h0() {
        this.f6978c.o0(this.f6976a.getCardElevation());
    }

    @NonNull
    public final Drawable i() {
        if (!tn.b.f90831a) {
            return h();
        }
        this.f6993r = j();
        return new RippleDrawable(this.f6986k, null, this.f6993r);
    }

    public final void i0(Drawable drawable) {
        if (this.f6976a.getForeground() instanceof InsetDrawable) {
            ((InsetDrawable) this.f6976a.getForeground()).setDrawable(drawable);
        } else {
            this.f6976a.setForeground(D(drawable));
        }
    }

    @NonNull
    public final k j() {
        return new k(this.f6988m);
    }

    public void j0() {
        if (!E()) {
            this.f6976a.setBackgroundInternal(D(this.f6978c));
        }
        this.f6976a.setForeground(D(this.f6984i));
    }

    @RequiresApi(api = 23)
    public void k() {
        Drawable drawable = this.f6990o;
        if (drawable != null) {
            Rect bounds = drawable.getBounds();
            int i11 = bounds.bottom;
            this.f6990o.setBounds(bounds.left, bounds.top, bounds.right, i11 - 1);
            this.f6990o.setBounds(bounds.left, bounds.top, bounds.right, i11);
        }
    }

    public final void k0() {
        Drawable drawable;
        if (tn.b.f90831a && (drawable = this.f6990o) != null) {
            ((RippleDrawable) drawable).setColor(this.f6986k);
            return;
        }
        k kVar = this.f6992q;
        if (kVar != null) {
            kVar.p0(this.f6986k);
        }
    }

    @NonNull
    public k l() {
        return this.f6978c;
    }

    public void l0() {
        this.f6979d.F0(this.f6983h, this.f6989n);
    }

    public ColorStateList m() {
        return this.f6978c.z();
    }

    public ColorStateList n() {
        return this.f6979d.z();
    }

    @Nullable
    public Drawable o() {
        return this.f6985j;
    }

    public int p() {
        return this.f6982g;
    }

    @Dimension
    public int q() {
        return this.f6980e;
    }

    @Dimension
    public int r() {
        return this.f6981f;
    }

    @Nullable
    public ColorStateList s() {
        return this.f6987l;
    }

    @NonNull
    public final Drawable t() {
        if (this.f6990o == null) {
            this.f6990o = i();
        }
        if (this.f6991p == null) {
            LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{this.f6990o, this.f6979d, this.f6985j});
            this.f6991p = layerDrawable;
            layerDrawable.setId(2, R.id.mtrl_card_checked_layer_id);
        }
        return this.f6991p;
    }

    public float u() {
        return this.f6978c.T();
    }

    public final float v() {
        if (this.f6976a.getPreventCornerOverlap() && this.f6976a.getUseCompatPadding()) {
            return (float) ((1.0d - A) * this.f6976a.getCardViewRadius());
        }
        return 0.0f;
    }

    @FloatRange(from = 0.0d, to = 1.0d)
    public float w() {
        return this.f6978c.A();
    }

    @Nullable
    public ColorStateList x() {
        return this.f6986k;
    }

    public p y() {
        return this.f6988m;
    }

    @ColorInt
    public int z() {
        ColorStateList colorStateList = this.f6989n;
        if (colorStateList == null) {
            return -1;
        }
        return colorStateList.getDefaultColor();
    }
}
