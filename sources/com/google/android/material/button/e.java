package com.google.android.material.button;

import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import androidx.annotation.ChecksSdkIntAtLeast;
import androidx.annotation.Dimension;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.core.graphics.drawable.DrawableCompat;
import androidx.core.view.ViewCompat;
import com.google.android.material.R;
import com.google.android.material.internal.m0;
import en.u;
import vn.k;
import vn.p;
import vn.t;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes7.dex */
public class e {

    /* renamed from: u, reason: collision with root package name */
    @ChecksSdkIntAtLeast(api = 21)
    public static final boolean f30849u = true;

    /* renamed from: v, reason: collision with root package name */
    public static final boolean f30850v = false;

    /* renamed from: a, reason: collision with root package name */
    public final MaterialButton f30851a;

    /* renamed from: b, reason: collision with root package name */
    @NonNull
    public p f30852b;

    /* renamed from: c, reason: collision with root package name */
    public int f30853c;

    /* renamed from: d, reason: collision with root package name */
    public int f30854d;

    /* renamed from: e, reason: collision with root package name */
    public int f30855e;

    /* renamed from: f, reason: collision with root package name */
    public int f30856f;

    /* renamed from: g, reason: collision with root package name */
    public int f30857g;

    /* renamed from: h, reason: collision with root package name */
    public int f30858h;

    /* renamed from: i, reason: collision with root package name */
    @Nullable
    public PorterDuff.Mode f30859i;

    /* renamed from: j, reason: collision with root package name */
    @Nullable
    public ColorStateList f30860j;

    /* renamed from: k, reason: collision with root package name */
    @Nullable
    public ColorStateList f30861k;

    /* renamed from: l, reason: collision with root package name */
    @Nullable
    public ColorStateList f30862l;

    /* renamed from: m, reason: collision with root package name */
    @Nullable
    public Drawable f30863m;

    /* renamed from: q, reason: collision with root package name */
    public boolean f30867q;

    /* renamed from: s, reason: collision with root package name */
    public LayerDrawable f30869s;

    /* renamed from: t, reason: collision with root package name */
    public int f30870t;

    /* renamed from: n, reason: collision with root package name */
    public boolean f30864n = false;

    /* renamed from: o, reason: collision with root package name */
    public boolean f30865o = false;

    /* renamed from: p, reason: collision with root package name */
    public boolean f30866p = false;

    /* renamed from: r, reason: collision with root package name */
    public boolean f30868r = true;

    public e(MaterialButton materialButton, @NonNull p pVar) {
        this.f30851a = materialButton;
        this.f30852b = pVar;
    }

    public void A(boolean z11) {
        this.f30864n = z11;
        K();
    }

    public void B(@Nullable ColorStateList colorStateList) {
        if (this.f30861k != colorStateList) {
            this.f30861k = colorStateList;
            K();
        }
    }

    public void C(int i11) {
        if (this.f30858h != i11) {
            this.f30858h = i11;
            K();
        }
    }

    public void D(@Nullable ColorStateList colorStateList) {
        if (this.f30860j != colorStateList) {
            this.f30860j = colorStateList;
            if (f() != null) {
                DrawableCompat.setTintList(f(), this.f30860j);
            }
        }
    }

    public void E(@Nullable PorterDuff.Mode mode) {
        if (this.f30859i != mode) {
            this.f30859i = mode;
            if (f() == null || this.f30859i == null) {
                return;
            }
            DrawableCompat.setTintMode(f(), this.f30859i);
        }
    }

    public void F(boolean z11) {
        this.f30868r = z11;
    }

    public final void G(@Dimension int i11, @Dimension int i12) {
        int paddingStart = ViewCompat.getPaddingStart(this.f30851a);
        int paddingTop = this.f30851a.getPaddingTop();
        int paddingEnd = ViewCompat.getPaddingEnd(this.f30851a);
        int paddingBottom = this.f30851a.getPaddingBottom();
        int i13 = this.f30855e;
        int i14 = this.f30856f;
        this.f30856f = i12;
        this.f30855e = i11;
        if (!this.f30865o) {
            H();
        }
        ViewCompat.setPaddingRelative(this.f30851a, paddingStart, (paddingTop + i11) - i13, paddingEnd, (paddingBottom + i12) - i14);
    }

    public final void H() {
        this.f30851a.setInternalBackground(a());
        k f11 = f();
        if (f11 != null) {
            f11.o0(this.f30870t);
            f11.setState(this.f30851a.getDrawableState());
        }
    }

    public final void I(@NonNull p pVar) {
        if (f30850v && !this.f30865o) {
            int paddingStart = ViewCompat.getPaddingStart(this.f30851a);
            int paddingTop = this.f30851a.getPaddingTop();
            int paddingEnd = ViewCompat.getPaddingEnd(this.f30851a);
            int paddingBottom = this.f30851a.getPaddingBottom();
            H();
            ViewCompat.setPaddingRelative(this.f30851a, paddingStart, paddingTop, paddingEnd, paddingBottom);
            return;
        }
        if (f() != null) {
            f().setShapeAppearanceModel(pVar);
        }
        if (n() != null) {
            n().setShapeAppearanceModel(pVar);
        }
        if (e() != null) {
            e().setShapeAppearanceModel(pVar);
        }
    }

    public void J(int i11, int i12) {
        Drawable drawable = this.f30863m;
        if (drawable != null) {
            drawable.setBounds(this.f30853c, this.f30855e, i12 - this.f30854d, i11 - this.f30856f);
        }
    }

    public final void K() {
        k f11 = f();
        k n11 = n();
        if (f11 != null) {
            f11.F0(this.f30858h, this.f30861k);
            if (n11 != null) {
                n11.E0(this.f30858h, this.f30864n ? u.d(this.f30851a, R.attr.colorSurface) : 0);
            }
        }
    }

    @NonNull
    public final InsetDrawable L(Drawable drawable) {
        return new InsetDrawable(drawable, this.f30853c, this.f30855e, this.f30854d, this.f30856f);
    }

    public final Drawable a() {
        k kVar = new k(this.f30852b);
        kVar.a0(this.f30851a.getContext());
        DrawableCompat.setTintList(kVar, this.f30860j);
        PorterDuff.Mode mode = this.f30859i;
        if (mode != null) {
            DrawableCompat.setTintMode(kVar, mode);
        }
        kVar.F0(this.f30858h, this.f30861k);
        k kVar2 = new k(this.f30852b);
        kVar2.setTint(0);
        kVar2.E0(this.f30858h, this.f30864n ? u.d(this.f30851a, R.attr.colorSurface) : 0);
        if (f30849u) {
            k kVar3 = new k(this.f30852b);
            this.f30863m = kVar3;
            DrawableCompat.setTint(kVar3, -1);
            RippleDrawable rippleDrawable = new RippleDrawable(tn.b.e(this.f30862l), L(new LayerDrawable(new Drawable[]{kVar2, kVar})), this.f30863m);
            this.f30869s = rippleDrawable;
            return rippleDrawable;
        }
        tn.a aVar = new tn.a(this.f30852b);
        this.f30863m = aVar;
        DrawableCompat.setTintList(aVar, tn.b.e(this.f30862l));
        LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{kVar2, kVar, this.f30863m});
        this.f30869s = layerDrawable;
        return L(layerDrawable);
    }

    public int b() {
        return this.f30857g;
    }

    public int c() {
        return this.f30856f;
    }

    public int d() {
        return this.f30855e;
    }

    @Nullable
    public t e() {
        LayerDrawable layerDrawable = this.f30869s;
        if (layerDrawable == null || layerDrawable.getNumberOfLayers() <= 1) {
            return null;
        }
        return this.f30869s.getNumberOfLayers() > 2 ? (t) this.f30869s.getDrawable(2) : (t) this.f30869s.getDrawable(1);
    }

    @Nullable
    public k f() {
        return g(false);
    }

    @Nullable
    public final k g(boolean z11) {
        LayerDrawable layerDrawable = this.f30869s;
        if (layerDrawable == null || layerDrawable.getNumberOfLayers() <= 0) {
            return null;
        }
        return f30849u ? (k) ((LayerDrawable) ((InsetDrawable) this.f30869s.getDrawable(0)).getDrawable()).getDrawable(!z11 ? 1 : 0) : (k) this.f30869s.getDrawable(!z11 ? 1 : 0);
    }

    @Nullable
    public ColorStateList h() {
        return this.f30862l;
    }

    @NonNull
    public p i() {
        return this.f30852b;
    }

    @Nullable
    public ColorStateList j() {
        return this.f30861k;
    }

    public int k() {
        return this.f30858h;
    }

    public ColorStateList l() {
        return this.f30860j;
    }

    public PorterDuff.Mode m() {
        return this.f30859i;
    }

    @Nullable
    public final k n() {
        return g(true);
    }

    public boolean o() {
        return this.f30865o;
    }

    public boolean p() {
        return this.f30867q;
    }

    public boolean q() {
        return this.f30868r;
    }

    public void r(@NonNull TypedArray typedArray) {
        this.f30853c = typedArray.getDimensionPixelOffset(R.styleable.MaterialButton_android_insetLeft, 0);
        this.f30854d = typedArray.getDimensionPixelOffset(R.styleable.MaterialButton_android_insetRight, 0);
        this.f30855e = typedArray.getDimensionPixelOffset(R.styleable.MaterialButton_android_insetTop, 0);
        this.f30856f = typedArray.getDimensionPixelOffset(R.styleable.MaterialButton_android_insetBottom, 0);
        int i11 = R.styleable.MaterialButton_cornerRadius;
        if (typedArray.hasValue(i11)) {
            int dimensionPixelSize = typedArray.getDimensionPixelSize(i11, -1);
            this.f30857g = dimensionPixelSize;
            z(this.f30852b.w(dimensionPixelSize));
            this.f30866p = true;
        }
        this.f30858h = typedArray.getDimensionPixelSize(R.styleable.MaterialButton_strokeWidth, 0);
        this.f30859i = m0.t(typedArray.getInt(R.styleable.MaterialButton_backgroundTintMode, -1), PorterDuff.Mode.SRC_IN);
        this.f30860j = sn.c.a(this.f30851a.getContext(), typedArray, R.styleable.MaterialButton_backgroundTint);
        this.f30861k = sn.c.a(this.f30851a.getContext(), typedArray, R.styleable.MaterialButton_strokeColor);
        this.f30862l = sn.c.a(this.f30851a.getContext(), typedArray, R.styleable.MaterialButton_rippleColor);
        this.f30867q = typedArray.getBoolean(R.styleable.MaterialButton_android_checkable, false);
        this.f30870t = typedArray.getDimensionPixelSize(R.styleable.MaterialButton_elevation, 0);
        this.f30868r = typedArray.getBoolean(R.styleable.MaterialButton_toggleCheckedStateOnClick, true);
        int paddingStart = ViewCompat.getPaddingStart(this.f30851a);
        int paddingTop = this.f30851a.getPaddingTop();
        int paddingEnd = ViewCompat.getPaddingEnd(this.f30851a);
        int paddingBottom = this.f30851a.getPaddingBottom();
        if (typedArray.hasValue(R.styleable.MaterialButton_android_background)) {
            t();
        } else {
            H();
        }
        ViewCompat.setPaddingRelative(this.f30851a, paddingStart + this.f30853c, paddingTop + this.f30855e, paddingEnd + this.f30854d, paddingBottom + this.f30856f);
    }

    public void s(int i11) {
        if (f() != null) {
            f().setTint(i11);
        }
    }

    public void t() {
        this.f30865o = true;
        this.f30851a.setSupportBackgroundTintList(this.f30860j);
        this.f30851a.setSupportBackgroundTintMode(this.f30859i);
    }

    public void u(boolean z11) {
        this.f30867q = z11;
    }

    public void v(int i11) {
        if (this.f30866p && this.f30857g == i11) {
            return;
        }
        this.f30857g = i11;
        this.f30866p = true;
        z(this.f30852b.w(i11));
    }

    public void w(@Dimension int i11) {
        G(this.f30855e, i11);
    }

    public void x(@Dimension int i11) {
        G(i11, this.f30856f);
    }

    public void y(@Nullable ColorStateList colorStateList) {
        if (this.f30862l != colorStateList) {
            this.f30862l = colorStateList;
            boolean z11 = f30849u;
            if (z11 && (this.f30851a.getBackground() instanceof RippleDrawable)) {
                ((RippleDrawable) this.f30851a.getBackground()).setColor(tn.b.e(colorStateList));
            } else {
                if (z11 || !(this.f30851a.getBackground() instanceof tn.a)) {
                    return;
                }
                ((tn.a) this.f30851a.getBackground()).setTintList(tn.b.e(colorStateList));
            }
        }
    }

    public void z(@NonNull p pVar) {
        this.f30852b = pVar;
        I(pVar);
    }
}
