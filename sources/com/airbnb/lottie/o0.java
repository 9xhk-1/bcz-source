package com.airbnb.lottie;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.annotation.FloatRange;
import androidx.annotation.IntRange;
import androidx.annotation.MainThread;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public class o0 extends Drawable implements Drawable.Callback, Animatable {
    public static final int L = 1;
    public static final int M = 2;
    public static final int N = -1;
    public Canvas A;
    public Rect B;
    public RectF C;
    public Paint D;
    public Rect E;
    public Rect F;
    public RectF G;
    public RectF H;
    public Matrix I;
    public Matrix J;
    public boolean K;

    /* renamed from: a, reason: collision with root package name */
    public k f10115a;

    /* renamed from: b, reason: collision with root package name */
    public final j1.g f10116b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f10117c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f10118d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f10119e;

    /* renamed from: f, reason: collision with root package name */
    public d f10120f;

    /* renamed from: g, reason: collision with root package name */
    public final ArrayList<c> f10121g;

    /* renamed from: h, reason: collision with root package name */
    public final ValueAnimator.AnimatorUpdateListener f10122h;

    /* renamed from: i, reason: collision with root package name */
    @Nullable
    public b1.b f10123i;

    /* renamed from: j, reason: collision with root package name */
    @Nullable
    public String f10124j;

    /* renamed from: k, reason: collision with root package name */
    @Nullable
    public com.airbnb.lottie.d f10125k;

    /* renamed from: l, reason: collision with root package name */
    @Nullable
    public b1.a f10126l;

    /* renamed from: m, reason: collision with root package name */
    @Nullable
    public com.airbnb.lottie.c f10127m;

    /* renamed from: n, reason: collision with root package name */
    @Nullable
    public a1 f10128n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f10129o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f10130p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f10131q;

    /* renamed from: r, reason: collision with root package name */
    @Nullable
    public com.airbnb.lottie.model.layer.b f10132r;

    /* renamed from: s, reason: collision with root package name */
    public int f10133s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f10134t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f10135u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f10136v;

    /* renamed from: w, reason: collision with root package name */
    public RenderMode f10137w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f10138x;

    /* renamed from: y, reason: collision with root package name */
    public final Matrix f10139y;

    /* renamed from: z, reason: collision with root package name */
    public Bitmap f10140z;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class a implements ValueAnimator.AnimatorUpdateListener {
        public a() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            if (o0.this.f10132r != null) {
                o0.this.f10132r.K(o0.this.f10116b.h());
            }
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class b<T> extends k1.j<T> {

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ k1.l f10142d;

        public b(k1.l lVar) {
            this.f10142d = lVar;
        }

        @Override // k1.j
        public T a(k1.b<T> bVar) {
            return (T) this.f10142d.a(bVar);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public interface c {
        void a(k kVar);
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public enum d {
        NONE,
        PLAY,
        RESUME
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @Retention(RetentionPolicy.SOURCE)
    public @interface e {
    }

    public o0() {
        j1.g gVar = new j1.g();
        this.f10116b = gVar;
        this.f10117c = true;
        this.f10118d = false;
        this.f10119e = false;
        this.f10120f = d.NONE;
        this.f10121g = new ArrayList<>();
        a aVar = new a();
        this.f10122h = aVar;
        this.f10130p = false;
        this.f10131q = true;
        this.f10133s = 255;
        this.f10137w = RenderMode.AUTOMATIC;
        this.f10138x = false;
        this.f10139y = new Matrix();
        this.K = false;
        gVar.addUpdateListener(aVar);
    }

    public final void A() {
        k kVar = this.f10115a;
        if (kVar == null) {
            return;
        }
        this.f10138x = this.f10137w.useSoftwareRendering(Build.VERSION.SDK_INT, kVar.t(), kVar.n());
    }

    public final void A0(RectF rectF, float f11, float f12) {
        rectF.set(rectF.left * f11, rectF.top * f12, rectF.right * f11, rectF.bottom * f12);
    }

    public final void B(Rect rect, RectF rectF) {
        rectF.set(rect.left, rect.top, rect.right, rect.bottom);
    }

    public void B0(boolean z11) {
        this.f10136v = z11;
    }

    public final void C(RectF rectF, Rect rect) {
        rect.set((int) Math.floor(rectF.left), (int) Math.floor(rectF.top), (int) Math.ceil(rectF.right), (int) Math.ceil(rectF.bottom));
    }

    public void C0(boolean z11) {
        if (z11 != this.f10131q) {
            this.f10131q = z11;
            com.airbnb.lottie.model.layer.b bVar = this.f10132r;
            if (bVar != null) {
                bVar.P(z11);
            }
            invalidateSelf();
        }
    }

    public boolean D0(k kVar) {
        if (this.f10115a == kVar) {
            return false;
        }
        this.K = true;
        z();
        this.f10115a = kVar;
        x();
        this.f10116b.x(kVar);
        W0(this.f10116b.getAnimatedFraction());
        Iterator it = new ArrayList(this.f10121g).iterator();
        while (it.hasNext()) {
            c cVar = (c) it.next();
            if (cVar != null) {
                cVar.a(kVar);
            }
            it.remove();
        }
        this.f10121g.clear();
        kVar.z(this.f10134t);
        A();
        Drawable.Callback callback = getCallback();
        if (callback instanceof ImageView) {
            ImageView imageView = (ImageView) callback;
            imageView.setImageDrawable(null);
            imageView.setImageDrawable(this);
        }
        return true;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public void E(Canvas canvas, Matrix matrix) {
        com.airbnb.lottie.model.layer.b bVar = this.f10132r;
        k kVar = this.f10115a;
        if (bVar == null || kVar == null) {
            return;
        }
        if (this.f10138x) {
            canvas.save();
            canvas.concat(matrix);
            w0(canvas, bVar);
            canvas.restore();
        } else {
            bVar.d(canvas, matrix, this.f10133s);
        }
        this.K = false;
    }

    public void E0(com.airbnb.lottie.c cVar) {
        this.f10127m = cVar;
        b1.a aVar = this.f10126l;
        if (aVar != null) {
            aVar.d(cVar);
        }
    }

    public final void F(Canvas canvas) {
        com.airbnb.lottie.model.layer.b bVar = this.f10132r;
        k kVar = this.f10115a;
        if (bVar == null || kVar == null) {
            return;
        }
        this.f10139y.reset();
        if (!getBounds().isEmpty()) {
            this.f10139y.preScale(r2.width() / kVar.b().width(), r2.height() / kVar.b().height());
        }
        bVar.d(canvas, this.f10139y, this.f10133s);
    }

    public void F0(final int i11) {
        if (this.f10115a == null) {
            this.f10121g.add(new c() { // from class: com.airbnb.lottie.m0
                @Override // com.airbnb.lottie.o0.c
                public final void a(k kVar) {
                    o0.this.F0(i11);
                }
            });
        } else {
            this.f10116b.y(i11);
        }
    }

    public void G(boolean z11) {
        if (this.f10129o == z11) {
            return;
        }
        this.f10129o = z11;
        if (this.f10115a != null) {
            x();
        }
    }

    public void G0(boolean z11) {
        this.f10118d = z11;
    }

    public boolean H() {
        return this.f10129o;
    }

    public void H0(com.airbnb.lottie.d dVar) {
        this.f10125k = dVar;
        b1.b bVar = this.f10123i;
        if (bVar != null) {
            bVar.e(dVar);
        }
    }

    @MainThread
    public void I() {
        this.f10121g.clear();
        this.f10116b.g();
        if (isVisible()) {
            return;
        }
        this.f10120f = d.NONE;
    }

    public void I0(@Nullable String str) {
        this.f10124j = str;
    }

    public final void J(int i11, int i12) {
        Bitmap bitmap = this.f10140z;
        if (bitmap == null || bitmap.getWidth() < i11 || this.f10140z.getHeight() < i12) {
            Bitmap createBitmap = Bitmap.createBitmap(i11, i12, Bitmap.Config.ARGB_8888);
            this.f10140z = createBitmap;
            this.A.setBitmap(createBitmap);
            this.K = true;
            return;
        }
        if (this.f10140z.getWidth() > i11 || this.f10140z.getHeight() > i12) {
            Bitmap createBitmap2 = Bitmap.createBitmap(this.f10140z, 0, 0, i11, i12);
            this.f10140z = createBitmap2;
            this.A.setBitmap(createBitmap2);
            this.K = true;
        }
    }

    public void J0(boolean z11) {
        this.f10130p = z11;
    }

    public final void K() {
        if (this.A != null) {
            return;
        }
        this.A = new Canvas();
        this.H = new RectF();
        this.I = new Matrix();
        this.J = new Matrix();
        this.B = new Rect();
        this.C = new RectF();
        this.D = new x0.a();
        this.E = new Rect();
        this.F = new Rect();
        this.G = new RectF();
    }

    public void K0(final int i11) {
        if (this.f10115a == null) {
            this.f10121g.add(new c() { // from class: com.airbnb.lottie.b0
                @Override // com.airbnb.lottie.o0.c
                public final void a(k kVar) {
                    o0.this.K0(i11);
                }
            });
        } else {
            this.f10116b.z(i11 + 0.99f);
        }
    }

    @Nullable
    public Bitmap L(String str) {
        b1.b S = S();
        if (S != null) {
            return S.a(str);
        }
        return null;
    }

    public void L0(final String str) {
        k kVar = this.f10115a;
        if (kVar == null) {
            this.f10121g.add(new c() { // from class: com.airbnb.lottie.h0
                @Override // com.airbnb.lottie.o0.c
                public final void a(k kVar2) {
                    o0.this.L0(str);
                }
            });
            return;
        }
        c1.g l11 = kVar.l(str);
        if (l11 != null) {
            K0((int) (l11.f7469b + l11.f7470c));
            return;
        }
        throw new IllegalArgumentException("Cannot find marker with name " + str + ".");
    }

    public boolean M() {
        return this.f10131q;
    }

    public void M0(@FloatRange(from = 0.0d, to = 1.0d) final float f11) {
        k kVar = this.f10115a;
        if (kVar == null) {
            this.f10121g.add(new c() { // from class: com.airbnb.lottie.e0
                @Override // com.airbnb.lottie.o0.c
                public final void a(k kVar2) {
                    o0.this.M0(f11);
                }
            });
        } else {
            this.f10116b.z(j1.i.k(kVar.r(), this.f10115a.f(), f11));
        }
    }

    public k N() {
        return this.f10115a;
    }

    public void N0(final int i11, final int i12) {
        if (this.f10115a == null) {
            this.f10121g.add(new c() { // from class: com.airbnb.lottie.a0
                @Override // com.airbnb.lottie.o0.c
                public final void a(k kVar) {
                    o0.this.N0(i11, i12);
                }
            });
        } else {
            this.f10116b.A(i11, i12 + 0.99f);
        }
    }

    @Nullable
    public final Context O() {
        Drawable.Callback callback = getCallback();
        if (callback != null && (callback instanceof View)) {
            return ((View) callback).getContext();
        }
        return null;
    }

    public void O0(final String str) {
        k kVar = this.f10115a;
        if (kVar == null) {
            this.f10121g.add(new c() { // from class: com.airbnb.lottie.z
                @Override // com.airbnb.lottie.o0.c
                public final void a(k kVar2) {
                    o0.this.O0(str);
                }
            });
            return;
        }
        c1.g l11 = kVar.l(str);
        if (l11 != null) {
            int i11 = (int) l11.f7469b;
            N0(i11, ((int) l11.f7470c) + i11);
        } else {
            throw new IllegalArgumentException("Cannot find marker with name " + str + ".");
        }
    }

    public final b1.a P() {
        if (getCallback() == null) {
            return null;
        }
        if (this.f10126l == null) {
            this.f10126l = new b1.a(getCallback(), this.f10127m);
        }
        return this.f10126l;
    }

    public void P0(final String str, final String str2, final boolean z11) {
        k kVar = this.f10115a;
        if (kVar == null) {
            this.f10121g.add(new c() { // from class: com.airbnb.lottie.g0
                @Override // com.airbnb.lottie.o0.c
                public final void a(k kVar2) {
                    o0.this.P0(str, str2, z11);
                }
            });
            return;
        }
        c1.g l11 = kVar.l(str);
        if (l11 == null) {
            throw new IllegalArgumentException("Cannot find marker with name " + str + ".");
        }
        int i11 = (int) l11.f7469b;
        c1.g l12 = this.f10115a.l(str2);
        if (l12 != null) {
            N0(i11, (int) (l12.f7469b + (z11 ? 1.0f : 0.0f)));
            return;
        }
        throw new IllegalArgumentException("Cannot find marker with name " + str2 + ".");
    }

    public int Q() {
        return (int) this.f10116b.i();
    }

    public void Q0(@FloatRange(from = 0.0d, to = 1.0d) final float f11, @FloatRange(from = 0.0d, to = 1.0d) final float f12) {
        k kVar = this.f10115a;
        if (kVar == null) {
            this.f10121g.add(new c() { // from class: com.airbnb.lottie.n0
                @Override // com.airbnb.lottie.o0.c
                public final void a(k kVar2) {
                    o0.this.Q0(f11, f12);
                }
            });
        } else {
            N0((int) j1.i.k(kVar.r(), this.f10115a.f(), f11), (int) j1.i.k(this.f10115a.r(), this.f10115a.f(), f12));
        }
    }

    @Nullable
    @Deprecated
    public Bitmap R(String str) {
        b1.b S = S();
        if (S != null) {
            return S.a(str);
        }
        k kVar = this.f10115a;
        p0 p0Var = kVar == null ? null : kVar.j().get(str);
        if (p0Var != null) {
            return p0Var.a();
        }
        return null;
    }

    public void R0(final int i11) {
        if (this.f10115a == null) {
            this.f10121g.add(new c() { // from class: com.airbnb.lottie.c0
                @Override // com.airbnb.lottie.o0.c
                public final void a(k kVar) {
                    o0.this.R0(i11);
                }
            });
        } else {
            this.f10116b.B(i11);
        }
    }

    public final b1.b S() {
        if (getCallback() == null) {
            return null;
        }
        b1.b bVar = this.f10123i;
        if (bVar != null && !bVar.c(O())) {
            this.f10123i = null;
        }
        if (this.f10123i == null) {
            this.f10123i = new b1.b(getCallback(), this.f10124j, this.f10125k, this.f10115a.j());
        }
        return this.f10123i;
    }

    public void S0(final String str) {
        k kVar = this.f10115a;
        if (kVar == null) {
            this.f10121g.add(new c() { // from class: com.airbnb.lottie.i0
                @Override // com.airbnb.lottie.o0.c
                public final void a(k kVar2) {
                    o0.this.S0(str);
                }
            });
            return;
        }
        c1.g l11 = kVar.l(str);
        if (l11 != null) {
            R0((int) l11.f7469b);
            return;
        }
        throw new IllegalArgumentException("Cannot find marker with name " + str + ".");
    }

    @Nullable
    public String T() {
        return this.f10124j;
    }

    public void T0(final float f11) {
        k kVar = this.f10115a;
        if (kVar == null) {
            this.f10121g.add(new c() { // from class: com.airbnb.lottie.k0
                @Override // com.airbnb.lottie.o0.c
                public final void a(k kVar2) {
                    o0.this.T0(f11);
                }
            });
        } else {
            R0((int) j1.i.k(kVar.r(), this.f10115a.f(), f11));
        }
    }

    @Nullable
    public p0 U(String str) {
        k kVar = this.f10115a;
        if (kVar == null) {
            return null;
        }
        return kVar.j().get(str);
    }

    public void U0(boolean z11) {
        if (this.f10135u == z11) {
            return;
        }
        this.f10135u = z11;
        com.airbnb.lottie.model.layer.b bVar = this.f10132r;
        if (bVar != null) {
            bVar.I(z11);
        }
    }

    public boolean V() {
        return this.f10130p;
    }

    public void V0(boolean z11) {
        this.f10134t = z11;
        k kVar = this.f10115a;
        if (kVar != null) {
            kVar.z(z11);
        }
    }

    public float W() {
        return this.f10116b.l();
    }

    public void W0(@FloatRange(from = 0.0d, to = 1.0d) final float f11) {
        if (this.f10115a == null) {
            this.f10121g.add(new c() { // from class: com.airbnb.lottie.l0
                @Override // com.airbnb.lottie.o0.c
                public final void a(k kVar) {
                    o0.this.W0(f11);
                }
            });
            return;
        }
        com.airbnb.lottie.e.a("Drawable#setProgress");
        this.f10116b.y(this.f10115a.h(f11));
        com.airbnb.lottie.e.b("Drawable#setProgress");
    }

    public float X() {
        return this.f10116b.m();
    }

    public void X0(RenderMode renderMode) {
        this.f10137w = renderMode;
        A();
    }

    @Nullable
    public y0 Y() {
        k kVar = this.f10115a;
        if (kVar != null) {
            return kVar.o();
        }
        return null;
    }

    public void Y0(int i11) {
        this.f10116b.setRepeatCount(i11);
    }

    @FloatRange(from = 0.0d, to = 1.0d)
    public float Z() {
        return this.f10116b.h();
    }

    public void Z0(int i11) {
        this.f10116b.setRepeatMode(i11);
    }

    public RenderMode a0() {
        return this.f10138x ? RenderMode.SOFTWARE : RenderMode.HARDWARE;
    }

    public void a1(boolean z11) {
        this.f10119e = z11;
    }

    public int b0() {
        return this.f10116b.getRepeatCount();
    }

    public void b1(float f11) {
        this.f10116b.E(f11);
    }

    @SuppressLint({"WrongConstant"})
    public int c0() {
        return this.f10116b.getRepeatMode();
    }

    public void c1(Boolean bool) {
        this.f10117c = bool.booleanValue();
    }

    public float d0() {
        return this.f10116b.n();
    }

    public void d1(a1 a1Var) {
        this.f10128n = a1Var;
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(@NonNull Canvas canvas) {
        com.airbnb.lottie.e.a("Drawable#draw");
        if (this.f10119e) {
            try {
                if (this.f10138x) {
                    w0(canvas, this.f10132r);
                } else {
                    F(canvas);
                }
            } catch (Throwable th2) {
                j1.f.c("Lottie crashed in draw!", th2);
            }
        } else if (this.f10138x) {
            w0(canvas, this.f10132r);
        } else {
            F(canvas);
        }
        this.K = false;
        com.airbnb.lottie.e.b("Drawable#draw");
    }

    @Nullable
    public a1 e0() {
        return this.f10128n;
    }

    @Nullable
    public Bitmap e1(String str, @Nullable Bitmap bitmap) {
        b1.b S = S();
        if (S == null) {
            j1.f.e("Cannot update bitmap. Most likely the drawable is not added to a View which prevents Lottie from getting a Context.");
            return null;
        }
        Bitmap f11 = S.f(str, bitmap);
        invalidateSelf();
        return f11;
    }

    @Nullable
    public Typeface f0(String str, String str2) {
        b1.a P = P();
        if (P != null) {
            return P.b(str, str2);
        }
        return null;
    }

    public boolean f1() {
        return this.f10128n == null && this.f10115a.c().size() > 0;
    }

    public boolean g0() {
        com.airbnb.lottie.model.layer.b bVar = this.f10132r;
        return bVar != null && bVar.N();
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.f10133s;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        k kVar = this.f10115a;
        if (kVar == null) {
            return -1;
        }
        return kVar.b().height();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        k kVar = this.f10115a;
        if (kVar == null) {
            return -1;
        }
        return kVar.b().width();
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    public boolean h0() {
        com.airbnb.lottie.model.layer.b bVar = this.f10132r;
        return bVar != null && bVar.O();
    }

    public final boolean i0() {
        Drawable.Callback callback = getCallback();
        if (!(callback instanceof View)) {
            return false;
        }
        if (((View) callback).getParent() instanceof ViewGroup) {
            return !((ViewGroup) r0).getClipChildren();
        }
        return false;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void invalidateDrawable(@NonNull Drawable drawable) {
        Drawable.Callback callback = getCallback();
        if (callback == null) {
            return;
        }
        callback.invalidateDrawable(this);
    }

    @Override // android.graphics.drawable.Drawable
    public void invalidateSelf() {
        if (this.K) {
            return;
        }
        this.K = true;
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.invalidateDrawable(this);
        }
    }

    @Override // android.graphics.drawable.Animatable
    public boolean isRunning() {
        return j0();
    }

    public boolean j0() {
        j1.g gVar = this.f10116b;
        if (gVar == null) {
            return false;
        }
        return gVar.isRunning();
    }

    public boolean k0() {
        if (isVisible()) {
            return this.f10116b.isRunning();
        }
        d dVar = this.f10120f;
        return dVar == d.PLAY || dVar == d.RESUME;
    }

    public boolean l0() {
        return this.f10136v;
    }

    public boolean m0() {
        return this.f10116b.getRepeatCount() == -1;
    }

    public boolean n0() {
        return this.f10129o;
    }

    @Deprecated
    public void o0(boolean z11) {
        this.f10116b.setRepeatCount(z11 ? -1 : 0);
    }

    public void p0() {
        this.f10121g.clear();
        this.f10116b.p();
        if (isVisible()) {
            return;
        }
        this.f10120f = d.NONE;
    }

    @MainThread
    public void q0() {
        if (this.f10132r == null) {
            this.f10121g.add(new c() { // from class: com.airbnb.lottie.j0
                @Override // com.airbnb.lottie.o0.c
                public final void a(k kVar) {
                    o0.this.q0();
                }
            });
            return;
        }
        A();
        if (w() || b0() == 0) {
            if (isVisible()) {
                this.f10116b.q();
                this.f10120f = d.NONE;
            } else {
                this.f10120f = d.PLAY;
            }
        }
        if (w()) {
            return;
        }
        F0((int) (d0() < 0.0f ? X() : W()));
        this.f10116b.g();
        if (isVisible()) {
            return;
        }
        this.f10120f = d.NONE;
    }

    public void r(Animator.AnimatorListener animatorListener) {
        this.f10116b.addListener(animatorListener);
    }

    public void r0() {
        this.f10116b.removeAllListeners();
    }

    @RequiresApi(api = 19)
    public void s(Animator.AnimatorPauseListener animatorPauseListener) {
        this.f10116b.addPauseListener(animatorPauseListener);
    }

    public void s0() {
        this.f10116b.removeAllUpdateListeners();
        this.f10116b.addUpdateListener(this.f10122h);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void scheduleDrawable(@NonNull Drawable drawable, @NonNull Runnable runnable, long j11) {
        Drawable.Callback callback = getCallback();
        if (callback == null) {
            return;
        }
        callback.scheduleDrawable(this, runnable, j11);
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(@IntRange(from = 0, to = 255) int i11) {
        this.f10133s = i11;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(@Nullable ColorFilter colorFilter) {
        j1.f.e("Use addColorFilter instead.");
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setVisible(boolean z11, boolean z12) {
        boolean isVisible = isVisible();
        boolean visible = super.setVisible(z11, z12);
        if (z11) {
            d dVar = this.f10120f;
            if (dVar == d.PLAY) {
                q0();
                return visible;
            }
            if (dVar == d.RESUME) {
                y0();
                return visible;
            }
        } else {
            if (this.f10116b.isRunning()) {
                p0();
                this.f10120f = d.RESUME;
                return visible;
            }
            if (isVisible) {
                this.f10120f = d.NONE;
            }
        }
        return visible;
    }

    @Override // android.graphics.drawable.Animatable
    @MainThread
    public void start() {
        Drawable.Callback callback = getCallback();
        if ((callback instanceof View) && ((View) callback).isInEditMode()) {
            return;
        }
        q0();
    }

    @Override // android.graphics.drawable.Animatable
    @MainThread
    public void stop() {
        I();
    }

    public void t(ValueAnimator.AnimatorUpdateListener animatorUpdateListener) {
        this.f10116b.addUpdateListener(animatorUpdateListener);
    }

    public void t0(Animator.AnimatorListener animatorListener) {
        this.f10116b.removeListener(animatorListener);
    }

    public <T> void u(final c1.d dVar, final T t11, @Nullable final k1.j<T> jVar) {
        com.airbnb.lottie.model.layer.b bVar = this.f10132r;
        if (bVar == null) {
            this.f10121g.add(new c() { // from class: com.airbnb.lottie.d0
                @Override // com.airbnb.lottie.o0.c
                public final void a(k kVar) {
                    o0.this.u(dVar, t11, jVar);
                }
            });
            return;
        }
        boolean z11 = true;
        if (dVar == c1.d.f7462c) {
            bVar.b(t11, jVar);
        } else if (dVar.d() != null) {
            dVar.d().b(t11, jVar);
        } else {
            List<c1.d> x02 = x0(dVar);
            for (int i11 = 0; i11 < x02.size(); i11++) {
                x02.get(i11).d().b(t11, jVar);
            }
            z11 = true ^ x02.isEmpty();
        }
        if (z11) {
            invalidateSelf();
            if (t11 == t0.E) {
                W0(Z());
            }
        }
    }

    @RequiresApi(api = 19)
    public void u0(Animator.AnimatorPauseListener animatorPauseListener) {
        this.f10116b.removePauseListener(animatorPauseListener);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void unscheduleDrawable(@NonNull Drawable drawable, @NonNull Runnable runnable) {
        Drawable.Callback callback = getCallback();
        if (callback == null) {
            return;
        }
        callback.unscheduleDrawable(this, runnable);
    }

    public <T> void v(c1.d dVar, T t11, k1.l<T> lVar) {
        u(dVar, t11, new b(lVar));
    }

    public void v0(ValueAnimator.AnimatorUpdateListener animatorUpdateListener) {
        this.f10116b.removeUpdateListener(animatorUpdateListener);
    }

    public final boolean w() {
        return this.f10117c || this.f10118d;
    }

    public final void w0(Canvas canvas, com.airbnb.lottie.model.layer.b bVar) {
        if (this.f10115a == null || bVar == null) {
            return;
        }
        K();
        canvas.getMatrix(this.I);
        canvas.getClipBounds(this.B);
        B(this.B, this.C);
        this.I.mapRect(this.C);
        C(this.C, this.B);
        if (this.f10131q) {
            this.H.set(0.0f, 0.0f, getIntrinsicWidth(), getIntrinsicHeight());
        } else {
            bVar.a(this.H, null, false);
        }
        this.I.mapRect(this.H);
        Rect bounds = getBounds();
        float width = bounds.width() / getIntrinsicWidth();
        float height = bounds.height() / getIntrinsicHeight();
        A0(this.H, width, height);
        if (!i0()) {
            RectF rectF = this.H;
            Rect rect = this.B;
            rectF.intersect(rect.left, rect.top, rect.right, rect.bottom);
        }
        int ceil = (int) Math.ceil(this.H.width());
        int ceil2 = (int) Math.ceil(this.H.height());
        if (ceil == 0 || ceil2 == 0) {
            return;
        }
        J(ceil, ceil2);
        if (this.K) {
            this.f10139y.set(this.I);
            this.f10139y.preScale(width, height);
            Matrix matrix = this.f10139y;
            RectF rectF2 = this.H;
            matrix.postTranslate(-rectF2.left, -rectF2.top);
            this.f10140z.eraseColor(0);
            bVar.d(this.A, this.f10139y, this.f10133s);
            this.I.invert(this.J);
            this.J.mapRect(this.G, this.H);
            C(this.G, this.F);
        }
        this.E.set(0, 0, ceil, ceil2);
        canvas.drawBitmap(this.f10140z, this.E, this.F, this.D);
    }

    public final void x() {
        k kVar = this.f10115a;
        if (kVar == null) {
            return;
        }
        com.airbnb.lottie.model.layer.b bVar = new com.airbnb.lottie.model.layer.b(this, h1.v.a(kVar), kVar.k(), kVar);
        this.f10132r = bVar;
        if (this.f10135u) {
            bVar.I(true);
        }
        this.f10132r.P(this.f10131q);
    }

    public List<c1.d> x0(c1.d dVar) {
        if (this.f10132r == null) {
            j1.f.e("Cannot resolve KeyPath. Composition is not set yet.");
            return Collections.EMPTY_LIST;
        }
        ArrayList arrayList = new ArrayList();
        this.f10132r.h(dVar, 0, arrayList, new c1.d(new String[0]));
        return arrayList;
    }

    public void y() {
        this.f10121g.clear();
        this.f10116b.cancel();
        if (isVisible()) {
            return;
        }
        this.f10120f = d.NONE;
    }

    @MainThread
    public void y0() {
        if (this.f10132r == null) {
            this.f10121g.add(new c() { // from class: com.airbnb.lottie.f0
                @Override // com.airbnb.lottie.o0.c
                public final void a(k kVar) {
                    o0.this.y0();
                }
            });
            return;
        }
        A();
        if (w() || b0() == 0) {
            if (isVisible()) {
                this.f10116b.v();
                this.f10120f = d.NONE;
            } else {
                this.f10120f = d.RESUME;
            }
        }
        if (w()) {
            return;
        }
        F0((int) (d0() < 0.0f ? X() : W()));
        this.f10116b.g();
        if (isVisible()) {
            return;
        }
        this.f10120f = d.NONE;
    }

    public void z() {
        if (this.f10116b.isRunning()) {
            this.f10116b.cancel();
            if (!isVisible()) {
                this.f10120f = d.NONE;
            }
        }
        this.f10115a = null;
        this.f10132r = null;
        this.f10123i = null;
        this.f10116b.f();
        invalidateSelf();
    }

    public void z0() {
        this.f10116b.w();
    }

    @Deprecated
    public void D() {
    }
}
