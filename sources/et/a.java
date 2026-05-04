package et;

import android.graphics.Camera;
import android.graphics.Matrix;
import android.graphics.RectF;
import android.os.Build;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.Transformation;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public final class a extends Animation {

    /* renamed from: q, reason: collision with root package name */
    public static final boolean f50118q;

    /* renamed from: r, reason: collision with root package name */
    public static final WeakHashMap<View, a> f50119r;

    /* renamed from: a, reason: collision with root package name */
    public final WeakReference<View> f50120a;

    /* renamed from: c, reason: collision with root package name */
    public boolean f50122c;

    /* renamed from: e, reason: collision with root package name */
    public float f50124e;

    /* renamed from: f, reason: collision with root package name */
    public float f50125f;

    /* renamed from: g, reason: collision with root package name */
    public float f50126g;

    /* renamed from: h, reason: collision with root package name */
    public float f50127h;

    /* renamed from: i, reason: collision with root package name */
    public float f50128i;

    /* renamed from: l, reason: collision with root package name */
    public float f50131l;

    /* renamed from: m, reason: collision with root package name */
    public float f50132m;

    /* renamed from: b, reason: collision with root package name */
    public final Camera f50121b = new Camera();

    /* renamed from: d, reason: collision with root package name */
    public float f50123d = 1.0f;

    /* renamed from: j, reason: collision with root package name */
    public float f50129j = 1.0f;

    /* renamed from: k, reason: collision with root package name */
    public float f50130k = 1.0f;

    /* renamed from: n, reason: collision with root package name */
    public final RectF f50133n = new RectF();

    /* renamed from: o, reason: collision with root package name */
    public final RectF f50134o = new RectF();

    /* renamed from: p, reason: collision with root package name */
    public final Matrix f50135p = new Matrix();

    static {
        f50118q = Integer.valueOf(Build.VERSION.SDK).intValue() < 11;
        f50119r = new WeakHashMap<>();
    }

    public a(View view) {
        setDuration(0L);
        setFillAfter(true);
        view.setAnimation(this);
        this.f50120a = new WeakReference<>(view);
    }

    public static a N(View view) {
        WeakHashMap<View, a> weakHashMap = f50119r;
        a aVar = weakHashMap.get(view);
        if (aVar != null && aVar == view.getAnimation()) {
            return aVar;
        }
        a aVar2 = new a(view);
        weakHashMap.put(view, aVar2);
        return aVar2;
    }

    public void A(float f11) {
        if (this.f50130k != f11) {
            s();
            this.f50130k = f11;
            q();
        }
    }

    public void B(int i11) {
        View view = this.f50120a.get();
        if (view != null) {
            view.scrollTo(i11, view.getScrollY());
        }
    }

    public void E(int i11) {
        View view = this.f50120a.get();
        if (view != null) {
            view.scrollTo(view.getScrollX(), i11);
        }
    }

    public void F(float f11) {
        if (this.f50131l != f11) {
            s();
            this.f50131l = f11;
            q();
        }
    }

    public void G(float f11) {
        if (this.f50132m != f11) {
            s();
            this.f50132m = f11;
            q();
        }
    }

    public void J(float f11) {
        if (this.f50120a.get() != null) {
            F(f11 - r0.getLeft());
        }
    }

    public void K(float f11) {
        if (this.f50120a.get() != null) {
            G(f11 - r0.getTop());
        }
    }

    public final void M(Matrix matrix, View view) {
        float width = view.getWidth();
        float height = view.getHeight();
        boolean z11 = this.f50122c;
        float f11 = z11 ? this.f50124e : width / 2.0f;
        float f12 = z11 ? this.f50125f : height / 2.0f;
        float f13 = this.f50126g;
        float f14 = this.f50127h;
        float f15 = this.f50128i;
        if (f13 != 0.0f || f14 != 0.0f || f15 != 0.0f) {
            Camera camera = this.f50121b;
            camera.save();
            camera.rotateX(f13);
            camera.rotateY(f14);
            camera.rotateZ(-f15);
            camera.getMatrix(matrix);
            camera.restore();
            matrix.preTranslate(-f11, -f12);
            matrix.postTranslate(f11, f12);
        }
        float f16 = this.f50129j;
        float f17 = this.f50130k;
        if (f16 != 1.0f || f17 != 1.0f) {
            matrix.postScale(f16, f17);
            matrix.postTranslate((-(f11 / width)) * ((f16 * width) - width), (-(f12 / height)) * ((f17 * height) - height));
        }
        matrix.postTranslate(this.f50131l, this.f50132m);
    }

    public final void a(RectF rectF, View view) {
        rectF.set(0.0f, 0.0f, view.getWidth(), view.getHeight());
        Matrix matrix = this.f50135p;
        matrix.reset();
        M(matrix, view);
        this.f50135p.mapRect(rectF);
        rectF.offset(view.getLeft(), view.getTop());
        float f11 = rectF.right;
        float f12 = rectF.left;
        if (f11 < f12) {
            rectF.right = f12;
            rectF.left = f11;
        }
        float f13 = rectF.bottom;
        float f14 = rectF.top;
        if (f13 < f14) {
            rectF.top = f13;
            rectF.bottom = f14;
        }
    }

    @Override // android.view.animation.Animation
    public void applyTransformation(float f11, Transformation transformation) {
        View view = this.f50120a.get();
        if (view != null) {
            transformation.setAlpha(this.f50123d);
            M(transformation.getMatrix(), view);
        }
    }

    public float b() {
        return this.f50123d;
    }

    public float c() {
        return this.f50124e;
    }

    public float d() {
        return this.f50125f;
    }

    public float e() {
        return this.f50128i;
    }

    public float f() {
        return this.f50126g;
    }

    public float g() {
        return this.f50127h;
    }

    public float h() {
        return this.f50129j;
    }

    public float i() {
        return this.f50130k;
    }

    public int j() {
        View view = this.f50120a.get();
        if (view == null) {
            return 0;
        }
        return view.getScrollX();
    }

    public int l() {
        View view = this.f50120a.get();
        if (view == null) {
            return 0;
        }
        return view.getScrollY();
    }

    public float m() {
        return this.f50131l;
    }

    public float n() {
        return this.f50132m;
    }

    public float o() {
        if (this.f50120a.get() == null) {
            return 0.0f;
        }
        return r0.getLeft() + this.f50131l;
    }

    public float p() {
        if (this.f50120a.get() == null) {
            return 0.0f;
        }
        return r0.getTop() + this.f50132m;
    }

    public final void q() {
        View view = this.f50120a.get();
        if (view == null || view.getParent() == null) {
            return;
        }
        RectF rectF = this.f50134o;
        a(rectF, view);
        rectF.union(this.f50133n);
        ((View) view.getParent()).invalidate((int) Math.floor(rectF.left), (int) Math.floor(rectF.top), (int) Math.ceil(rectF.right), (int) Math.ceil(rectF.bottom));
    }

    public final void s() {
        View view = this.f50120a.get();
        if (view != null) {
            a(this.f50133n, view);
        }
    }

    public void t(float f11) {
        if (this.f50123d != f11) {
            this.f50123d = f11;
            View view = this.f50120a.get();
            if (view != null) {
                view.invalidate();
            }
        }
    }

    public void u(float f11) {
        if (this.f50122c && this.f50124e == f11) {
            return;
        }
        s();
        this.f50122c = true;
        this.f50124e = f11;
        q();
    }

    public void v(float f11) {
        if (this.f50122c && this.f50125f == f11) {
            return;
        }
        s();
        this.f50122c = true;
        this.f50125f = f11;
        q();
    }

    public void w(float f11) {
        if (this.f50128i != f11) {
            s();
            this.f50128i = f11;
            q();
        }
    }

    public void x(float f11) {
        if (this.f50126g != f11) {
            s();
            this.f50126g = f11;
            q();
        }
    }

    public void y(float f11) {
        if (this.f50127h != f11) {
            s();
            this.f50127h = f11;
            q();
        }
    }

    public void z(float f11) {
        if (this.f50129j != f11) {
            s();
            this.f50129j = f11;
            q();
        }
    }
}
