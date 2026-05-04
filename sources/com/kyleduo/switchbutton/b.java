package com.kyleduo.switchbutton;

import android.graphics.Color;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.StateListDrawable;
import android.view.View;
import java.lang.reflect.Field;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public class b implements Cloneable {

    /* renamed from: n, reason: collision with root package name */
    public float f39086n;

    /* renamed from: r, reason: collision with root package name */
    public Rect f39090r;

    /* renamed from: a, reason: collision with root package name */
    public Drawable f39073a = null;

    /* renamed from: b, reason: collision with root package name */
    public Drawable f39074b = null;

    /* renamed from: c, reason: collision with root package name */
    public Drawable f39075c = null;

    /* renamed from: d, reason: collision with root package name */
    public int f39076d = a.f39092b;

    /* renamed from: e, reason: collision with root package name */
    public int f39077e = a.f39091a;

    /* renamed from: f, reason: collision with root package name */
    public int f39078f = a.f39093c;

    /* renamed from: g, reason: collision with root package name */
    public int f39079g = a.f39094d;

    /* renamed from: h, reason: collision with root package name */
    public int f39080h = 0;

    /* renamed from: i, reason: collision with root package name */
    public int f39081i = 0;

    /* renamed from: j, reason: collision with root package name */
    public int f39082j = 0;

    /* renamed from: k, reason: collision with root package name */
    public int f39083k = 0;

    /* renamed from: l, reason: collision with root package name */
    public int f39084l = -1;

    /* renamed from: m, reason: collision with root package name */
    public int f39085m = -1;

    /* renamed from: o, reason: collision with root package name */
    public int f39087o = -1;

    /* renamed from: p, reason: collision with root package name */
    public float f39088p = -1.0f;

    /* renamed from: q, reason: collision with root package name */
    public float f39089q = 0.0f;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public static int f39091a = Color.parseColor("#FFC0C8D4");

        /* renamed from: b, reason: collision with root package name */
        public static int f39092b = Color.parseColor("#FF42AFF4");

        /* renamed from: c, reason: collision with root package name */
        public static int f39093c = Color.parseColor("#FFFFFF");

        /* renamed from: d, reason: collision with root package name */
        public static int f39094d = Color.parseColor("#FAFAFA");

        /* renamed from: e, reason: collision with root package name */
        public static int f39095e = 2;

        /* renamed from: f, reason: collision with root package name */
        public static int f39096f = 999;

        /* renamed from: g, reason: collision with root package name */
        public static float f39097g = 2.0f;

        /* renamed from: h, reason: collision with root package name */
        public static int f39098h = 0;
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    /* renamed from: com.kyleduo.switchbutton.b$b, reason: collision with other inner class name */
    public static class C0470b {

        /* renamed from: a, reason: collision with root package name */
        public static int f39099a = 24;
    }

    public static b a(float density) {
        b bVar = new b();
        bVar.f39086n = density;
        bVar.f0(bVar.b());
        int i11 = a.f39098h;
        bVar.f39090r = new Rect(i11, i11, i11, i11);
        return bVar;
    }

    public int A() {
        return this.f39080h;
    }

    public int B() {
        int intrinsicWidth;
        int i11 = this.f39084l;
        if (i11 >= 0) {
            return i11;
        }
        Drawable drawable = this.f39075c;
        if (drawable != null && (intrinsicWidth = drawable.getIntrinsicWidth()) > 0) {
            return intrinsicWidth;
        }
        float f11 = this.f39086n;
        if (f11 > 0.0f) {
            return (int) (C0470b.f39099a * f11);
        }
        throw new IllegalArgumentException("density must be a positive number");
    }

    public int E() {
        return this.f39087o;
    }

    public boolean F() {
        Rect rect = this.f39090r;
        return ((rect.left + rect.right) + rect.top) + rect.bottom != 0;
    }

    public void G(Drawable offDrawable, Drawable onDrawable) {
        if (onDrawable == null && offDrawable == null) {
            throw new IllegalArgumentException("back drawable can not be null");
        }
        if (offDrawable != null) {
            this.f39074b = offDrawable;
            if (onDrawable != null) {
                this.f39073a = onDrawable;
            } else {
                this.f39073a = offDrawable;
            }
        }
    }

    public void J(int bottom) {
        if (bottom > 0) {
            bottom = -bottom;
        }
        this.f39090r.bottom = bottom;
    }

    public void K(int left, int top, int right, int bottom) {
        M(left);
        O(top);
        N(right);
        J(bottom);
    }

    public void M(int left) {
        if (left > 0) {
            left = -left;
        }
        this.f39090r.left = left;
    }

    public void N(int right) {
        if (right > 0) {
            right = -right;
        }
        this.f39090r.right = right;
    }

    public void O(int top) {
        if (top > 0) {
            top = -top;
        }
        this.f39090r.top = top;
    }

    public void P(float measureFactor) {
        if (measureFactor <= 0.0f) {
            this.f39089q = a.f39097g;
        }
        this.f39089q = measureFactor;
    }

    public void Q(int offColor) {
        this.f39077e = offColor;
    }

    public void R(Drawable offDrawable) {
        if (offDrawable == null) {
            throw new IllegalArgumentException("off drawable can not be null");
        }
        this.f39074b = offDrawable;
    }

    public void T(int onColor) {
        this.f39076d = onColor;
    }

    public void W(Drawable onDrawable) {
        if (onDrawable == null) {
            throw new IllegalArgumentException("on drawable can not be null");
        }
        this.f39073a = onDrawable;
    }

    public void X(float radius) {
        this.f39088p = radius;
    }

    public void Y(int thumbColor) {
        this.f39078f = thumbColor;
    }

    public void Z(Drawable thumbDrawable) {
        if (thumbDrawable == null) {
            throw new IllegalArgumentException("thumb drawable can not be null");
        }
        this.f39075c = thumbDrawable;
    }

    public void a0(int margin) {
        e0(margin, margin, margin, margin);
    }

    public int b() {
        return (int) (a.f39095e * this.f39086n);
    }

    public void b0(int topAndBottom, int leftAndRight) {
        e0(topAndBottom, topAndBottom, leftAndRight, leftAndRight);
    }

    public float c() {
        return this.f39086n;
    }

    public void c0(int top, int bottom, int leftAndRight) {
        e0(top, bottom, leftAndRight, leftAndRight);
    }

    public final Drawable d(int color) {
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setCornerRadius(p());
        gradientDrawable.setColor(color);
        return gradientDrawable;
    }

    public Rect e() {
        return this.f39090r;
    }

    public void e0(int top, int bottom, int left, int right) {
        float f11 = this.f39086n;
        this.f39080h = (int) (top * f11);
        this.f39081i = (int) (bottom * f11);
        this.f39082j = (int) (left * f11);
        this.f39083k = (int) (right * f11);
    }

    public int f() {
        return q() / 2;
    }

    public void f0(int marginInPixel) {
        g0(marginInPixel, marginInPixel, marginInPixel, marginInPixel);
    }

    public int g() {
        return s() / 2;
    }

    public void g0(int top, int bottom, int left, int right) {
        this.f39080h = top;
        this.f39081i = bottom;
        this.f39082j = left;
        this.f39083k = right;
    }

    public float h() {
        if (this.f39089q <= 0.0f) {
            this.f39089q = a.f39097g;
        }
        return this.f39089q;
    }

    public void h0(int width, int height) {
        float f11 = this.f39086n;
        j0((int) (width * f11), (int) (height * f11));
    }

    public int i() {
        return this.f39077e;
    }

    public Drawable j() {
        return this.f39074b;
    }

    public void j0(int width, int height) {
        if (width > 0) {
            this.f39084l = width;
        }
        if (height > 0) {
            this.f39085m = height;
        }
    }

    public Drawable l() {
        Drawable drawable = this.f39074b;
        return drawable != null ? drawable : d(this.f39077e);
    }

    public void l0(int velocity) {
        this.f39087o = velocity;
    }

    public int m(int onColor) {
        return this.f39076d;
    }

    public Drawable n() {
        return this.f39073a;
    }

    public Drawable o() {
        Drawable drawable = this.f39073a;
        return drawable != null ? drawable : d(this.f39076d);
    }

    public float p() {
        float f11 = this.f39088p;
        return f11 < 0.0f ? a.f39096f : f11;
    }

    public int q() {
        Rect rect = this.f39090r;
        return rect.left + rect.right;
    }

    public int s() {
        Rect rect = this.f39090r;
        return rect.top + rect.bottom;
    }

    public int t() {
        return this.f39078f;
    }

    public Drawable u() {
        return this.f39075c;
    }

    public Drawable v() {
        Drawable drawable = this.f39075c;
        if (drawable != null) {
            return drawable;
        }
        StateListDrawable stateListDrawable = new StateListDrawable();
        Drawable d11 = d(this.f39078f);
        Drawable d12 = d(this.f39079g);
        int[] iArr = null;
        try {
            Field declaredField = View.class.getDeclaredField("PRESSED_ENABLED_STATE_SET");
            declaredField.setAccessible(true);
            iArr = (int[]) declaredField.get(null);
        } catch (Exception e11) {
            e11.printStackTrace();
        }
        if (iArr != null) {
            stateListDrawable.addState(iArr, d12);
        }
        stateListDrawable.addState(new int[0], d11);
        return stateListDrawable;
    }

    public int w() {
        int intrinsicHeight;
        int i11 = this.f39085m;
        if (i11 >= 0) {
            return i11;
        }
        Drawable drawable = this.f39075c;
        if (drawable != null && (intrinsicHeight = drawable.getIntrinsicHeight()) > 0) {
            return intrinsicHeight;
        }
        float f11 = this.f39086n;
        if (f11 > 0.0f) {
            return (int) (C0470b.f39099a * f11);
        }
        throw new IllegalArgumentException("density must be a positive number");
    }

    public int x() {
        return this.f39081i;
    }

    public int y() {
        return this.f39082j;
    }

    public int z() {
        return this.f39083k;
    }
}
