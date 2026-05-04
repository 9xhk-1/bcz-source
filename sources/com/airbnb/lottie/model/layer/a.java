package com.airbnb.lottie.model.layer;

import android.graphics.BlurMaskFilter;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.os.Build;
import androidx.annotation.CallSuper;
import androidx.annotation.FloatRange;
import androidx.annotation.Nullable;
import com.airbnb.lottie.k;
import com.airbnb.lottie.model.content.Mask;
import com.airbnb.lottie.model.layer.Layer;
import com.airbnb.lottie.o0;
import e1.i;
import f1.c;
import f1.f;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import k1.j;
import y0.e;
import z0.a;
import z0.d;
import z0.h;
import z0.p;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public abstract class a implements e, a.b, c1.e {
    public static final int D = 2;
    public static final int E = 16;
    public static final int F = 1;
    public static final int G = 19;

    @Nullable
    public Paint A;
    public float B;

    @Nullable
    public BlurMaskFilter C;

    /* renamed from: a, reason: collision with root package name */
    public final Path f10079a = new Path();

    /* renamed from: b, reason: collision with root package name */
    public final Matrix f10080b = new Matrix();

    /* renamed from: c, reason: collision with root package name */
    public final Matrix f10081c = new Matrix();

    /* renamed from: d, reason: collision with root package name */
    public final Paint f10082d = new x0.a(1);

    /* renamed from: e, reason: collision with root package name */
    public final Paint f10083e;

    /* renamed from: f, reason: collision with root package name */
    public final Paint f10084f;

    /* renamed from: g, reason: collision with root package name */
    public final Paint f10085g;

    /* renamed from: h, reason: collision with root package name */
    public final Paint f10086h;

    /* renamed from: i, reason: collision with root package name */
    public final RectF f10087i;

    /* renamed from: j, reason: collision with root package name */
    public final RectF f10088j;

    /* renamed from: k, reason: collision with root package name */
    public final RectF f10089k;

    /* renamed from: l, reason: collision with root package name */
    public final RectF f10090l;

    /* renamed from: m, reason: collision with root package name */
    public final RectF f10091m;

    /* renamed from: n, reason: collision with root package name */
    public final String f10092n;

    /* renamed from: o, reason: collision with root package name */
    public final Matrix f10093o;

    /* renamed from: p, reason: collision with root package name */
    public final o0 f10094p;

    /* renamed from: q, reason: collision with root package name */
    public final Layer f10095q;

    /* renamed from: r, reason: collision with root package name */
    @Nullable
    public h f10096r;

    /* renamed from: s, reason: collision with root package name */
    @Nullable
    public d f10097s;

    /* renamed from: t, reason: collision with root package name */
    @Nullable
    public a f10098t;

    /* renamed from: u, reason: collision with root package name */
    @Nullable
    public a f10099u;

    /* renamed from: v, reason: collision with root package name */
    public List<a> f10100v;

    /* renamed from: w, reason: collision with root package name */
    public final List<z0.a<?, ?>> f10101w;

    /* renamed from: x, reason: collision with root package name */
    public final p f10102x;

    /* renamed from: y, reason: collision with root package name */
    public boolean f10103y;

    /* renamed from: z, reason: collision with root package name */
    public boolean f10104z;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    /* renamed from: com.airbnb.lottie.model.layer.a$a, reason: collision with other inner class name */
    public static /* synthetic */ class C0157a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f10105a;

        /* renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f10106b;

        static {
            int[] iArr = new int[Mask.MaskMode.values().length];
            f10106b = iArr;
            try {
                iArr[Mask.MaskMode.MASK_MODE_NONE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f10106b[Mask.MaskMode.MASK_MODE_SUBTRACT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f10106b[Mask.MaskMode.MASK_MODE_INTERSECT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f10106b[Mask.MaskMode.MASK_MODE_ADD.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            int[] iArr2 = new int[Layer.LayerType.values().length];
            f10105a = iArr2;
            try {
                iArr2[Layer.LayerType.SHAPE.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f10105a[Layer.LayerType.PRE_COMP.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f10105a[Layer.LayerType.SOLID.ordinal()] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f10105a[Layer.LayerType.IMAGE.ordinal()] = 4;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f10105a[Layer.LayerType.NULL.ordinal()] = 5;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f10105a[Layer.LayerType.TEXT.ordinal()] = 6;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f10105a[Layer.LayerType.UNKNOWN.ordinal()] = 7;
            } catch (NoSuchFieldError unused11) {
            }
        }
    }

    public a(o0 o0Var, Layer layer) {
        PorterDuff.Mode mode = PorterDuff.Mode.DST_IN;
        this.f10083e = new x0.a(1, mode);
        PorterDuff.Mode mode2 = PorterDuff.Mode.DST_OUT;
        this.f10084f = new x0.a(1, mode2);
        x0.a aVar = new x0.a(1);
        this.f10085g = aVar;
        this.f10086h = new x0.a(PorterDuff.Mode.CLEAR);
        this.f10087i = new RectF();
        this.f10088j = new RectF();
        this.f10089k = new RectF();
        this.f10090l = new RectF();
        this.f10091m = new RectF();
        this.f10093o = new Matrix();
        this.f10101w = new ArrayList();
        this.f10103y = true;
        this.B = 0.0f;
        this.f10094p = o0Var;
        this.f10095q = layer;
        this.f10092n = layer.i() + "#draw";
        if (layer.h() == Layer.MatteType.INVERT) {
            aVar.setXfermode(new PorterDuffXfermode(mode2));
        } else {
            aVar.setXfermode(new PorterDuffXfermode(mode));
        }
        p b11 = layer.w().b();
        this.f10102x = b11;
        b11.b(this);
        if (layer.g() != null && !layer.g().isEmpty()) {
            h hVar = new h(layer.g());
            this.f10096r = hVar;
            Iterator<z0.a<i, Path>> it = hVar.a().iterator();
            while (it.hasNext()) {
                it.next().a(this);
            }
            for (z0.a<Integer, Integer> aVar2 : this.f10096r.c()) {
                i(aVar2);
                aVar2.a(this);
            }
        }
        M();
    }

    @Nullable
    public static a u(b bVar, Layer layer, o0 o0Var, k kVar) {
        switch (C0157a.f10105a[layer.f().ordinal()]) {
            case 1:
                return new f1.d(o0Var, layer, bVar);
            case 2:
                return new b(o0Var, layer, kVar.p(layer.m()), kVar);
            case 3:
                return new f1.e(o0Var, layer);
            case 4:
                return new f1.b(o0Var, layer);
            case 5:
                return new c(o0Var, layer);
            case 6:
                return new f(o0Var, layer);
            default:
                j1.f.e("Unknown layer type " + layer.f());
                return null;
        }
    }

    public boolean A() {
        return this.f10098t != null;
    }

    public final void B(RectF rectF, Matrix matrix) {
        this.f10089k.set(0.0f, 0.0f, 0.0f, 0.0f);
        if (z()) {
            int size = this.f10096r.b().size();
            for (int i11 = 0; i11 < size; i11++) {
                Mask mask = this.f10096r.b().get(i11);
                Path h11 = this.f10096r.a().get(i11).h();
                if (h11 != null) {
                    this.f10079a.set(h11);
                    this.f10079a.transform(matrix);
                    int i12 = C0157a.f10106b[mask.a().ordinal()];
                    if (i12 == 1 || i12 == 2) {
                        return;
                    }
                    if ((i12 == 3 || i12 == 4) && mask.d()) {
                        return;
                    }
                    this.f10079a.computeBounds(this.f10091m, false);
                    if (i11 == 0) {
                        this.f10089k.set(this.f10091m);
                    } else {
                        RectF rectF2 = this.f10089k;
                        rectF2.set(Math.min(rectF2.left, this.f10091m.left), Math.min(this.f10089k.top, this.f10091m.top), Math.max(this.f10089k.right, this.f10091m.right), Math.max(this.f10089k.bottom, this.f10091m.bottom));
                    }
                }
            }
            if (rectF.intersect(this.f10089k)) {
                return;
            }
            rectF.set(0.0f, 0.0f, 0.0f, 0.0f);
        }
    }

    public final void C(RectF rectF, Matrix matrix) {
        if (A() && this.f10095q.h() != Layer.MatteType.INVERT) {
            this.f10090l.set(0.0f, 0.0f, 0.0f, 0.0f);
            this.f10098t.a(this.f10090l, matrix, true);
            if (rectF.intersect(this.f10090l)) {
                return;
            }
            rectF.set(0.0f, 0.0f, 0.0f, 0.0f);
        }
    }

    public final void D() {
        this.f10094p.invalidateSelf();
    }

    public final void E(float f11) {
        this.f10094p.N().o().e(this.f10095q.i(), f11);
    }

    public void F(z0.a<?, ?> aVar) {
        this.f10101w.remove(aVar);
    }

    public void H(@Nullable a aVar) {
        this.f10098t = aVar;
    }

    public void I(boolean z11) {
        if (z11 && this.A == null) {
            this.A = new x0.a();
        }
        this.f10104z = z11;
    }

    public void J(@Nullable a aVar) {
        this.f10099u = aVar;
    }

    public void K(@FloatRange(from = 0.0d, to = 1.0d) float f11) {
        this.f10102x.j(f11);
        if (this.f10096r != null) {
            for (int i11 = 0; i11 < this.f10096r.a().size(); i11++) {
                this.f10096r.a().get(i11).m(f11);
            }
        }
        d dVar = this.f10097s;
        if (dVar != null) {
            dVar.m(f11);
        }
        a aVar = this.f10098t;
        if (aVar != null) {
            aVar.K(f11);
        }
        for (int i12 = 0; i12 < this.f10101w.size(); i12++) {
            this.f10101w.get(i12).m(f11);
        }
    }

    public final void L(boolean z11) {
        if (z11 != this.f10103y) {
            this.f10103y = z11;
            D();
        }
    }

    public final void M() {
        if (this.f10095q.e().isEmpty()) {
            L(true);
            return;
        }
        d dVar = new d(this.f10095q.e());
        this.f10097s = dVar;
        dVar.l();
        this.f10097s.a(new a.b() { // from class: f1.a
            @Override // z0.a.b
            public final void e() {
                com.airbnb.lottie.model.layer.a.this.L(r2.f10097s.p() == 1.0f);
            }
        });
        L(this.f10097s.h().floatValue() == 1.0f);
        i(this.f10097s);
    }

    @Override // y0.e
    @CallSuper
    public void a(RectF rectF, Matrix matrix, boolean z11) {
        this.f10087i.set(0.0f, 0.0f, 0.0f, 0.0f);
        r();
        this.f10093o.set(matrix);
        if (z11) {
            List<a> list = this.f10100v;
            if (list != null) {
                for (int size = list.size() - 1; size >= 0; size--) {
                    this.f10093o.preConcat(this.f10100v.get(size).f10102x.f());
                }
            } else {
                a aVar = this.f10099u;
                if (aVar != null) {
                    this.f10093o.preConcat(aVar.f10102x.f());
                }
            }
        }
        this.f10093o.preConcat(this.f10102x.f());
    }

    @Override // c1.e
    @CallSuper
    public <T> void b(T t11, @Nullable j<T> jVar) {
        this.f10102x.c(t11, jVar);
    }

    @Override // y0.e
    public void d(Canvas canvas, Matrix matrix, int i11) {
        Paint paint;
        com.airbnb.lottie.e.a(this.f10092n);
        if (!this.f10103y || this.f10095q.x()) {
            com.airbnb.lottie.e.b(this.f10092n);
            return;
        }
        r();
        com.airbnb.lottie.e.a("Layer#parentMatrix");
        this.f10080b.reset();
        this.f10080b.set(matrix);
        for (int size = this.f10100v.size() - 1; size >= 0; size--) {
            this.f10080b.preConcat(this.f10100v.get(size).f10102x.f());
        }
        com.airbnb.lottie.e.b("Layer#parentMatrix");
        int intValue = (int) ((((i11 / 255.0f) * (this.f10102x.h() == null ? 100 : this.f10102x.h().h().intValue())) / 100.0f) * 255.0f);
        if (!A() && !z()) {
            this.f10080b.preConcat(this.f10102x.f());
            com.airbnb.lottie.e.a("Layer#drawLayer");
            t(canvas, this.f10080b, intValue);
            com.airbnb.lottie.e.b("Layer#drawLayer");
            E(com.airbnb.lottie.e.b(this.f10092n));
            return;
        }
        com.airbnb.lottie.e.a("Layer#computeBounds");
        a(this.f10087i, this.f10080b, false);
        C(this.f10087i, matrix);
        this.f10080b.preConcat(this.f10102x.f());
        B(this.f10087i, this.f10080b);
        this.f10088j.set(0.0f, 0.0f, canvas.getWidth(), canvas.getHeight());
        canvas.getMatrix(this.f10081c);
        if (!this.f10081c.isIdentity()) {
            Matrix matrix2 = this.f10081c;
            matrix2.invert(matrix2);
            this.f10081c.mapRect(this.f10088j);
        }
        if (!this.f10087i.intersect(this.f10088j)) {
            this.f10087i.set(0.0f, 0.0f, 0.0f, 0.0f);
        }
        com.airbnb.lottie.e.b("Layer#computeBounds");
        if (this.f10087i.width() >= 1.0f && this.f10087i.height() >= 1.0f) {
            com.airbnb.lottie.e.a("Layer#saveLayer");
            this.f10082d.setAlpha(255);
            j1.j.n(canvas, this.f10087i, this.f10082d);
            com.airbnb.lottie.e.b("Layer#saveLayer");
            s(canvas);
            com.airbnb.lottie.e.a("Layer#drawLayer");
            t(canvas, this.f10080b, intValue);
            com.airbnb.lottie.e.b("Layer#drawLayer");
            if (z()) {
                o(canvas, this.f10080b);
            }
            if (A()) {
                com.airbnb.lottie.e.a("Layer#drawMatte");
                com.airbnb.lottie.e.a("Layer#saveLayer");
                j1.j.o(canvas, this.f10087i, this.f10085g, 19);
                com.airbnb.lottie.e.b("Layer#saveLayer");
                s(canvas);
                this.f10098t.d(canvas, matrix, intValue);
                com.airbnb.lottie.e.a("Layer#restoreLayer");
                canvas.restore();
                com.airbnb.lottie.e.b("Layer#restoreLayer");
                com.airbnb.lottie.e.b("Layer#drawMatte");
            }
            com.airbnb.lottie.e.a("Layer#restoreLayer");
            canvas.restore();
            com.airbnb.lottie.e.b("Layer#restoreLayer");
        }
        if (this.f10104z && (paint = this.A) != null) {
            paint.setStyle(Paint.Style.STROKE);
            this.A.setColor(-251901);
            this.A.setStrokeWidth(4.0f);
            canvas.drawRect(this.f10087i, this.A);
            this.A.setStyle(Paint.Style.FILL);
            this.A.setColor(1357638635);
            canvas.drawRect(this.f10087i, this.A);
        }
        E(com.airbnb.lottie.e.b(this.f10092n));
    }

    @Override // z0.a.b
    public void e() {
        D();
    }

    @Override // y0.c
    public String getName() {
        return this.f10095q.i();
    }

    @Override // c1.e
    public void h(c1.d dVar, int i11, List<c1.d> list, c1.d dVar2) {
        a aVar = this.f10098t;
        if (aVar != null) {
            c1.d a11 = dVar2.a(aVar.getName());
            if (dVar.c(this.f10098t.getName(), i11)) {
                list.add(a11.j(this.f10098t));
            }
            if (dVar.i(getName(), i11)) {
                this.f10098t.G(dVar, dVar.e(this.f10098t.getName(), i11) + i11, list, a11);
            }
        }
        if (dVar.h(getName(), i11)) {
            if (!"__container".equals(getName())) {
                dVar2 = dVar2.a(getName());
                if (dVar.c(getName(), i11)) {
                    list.add(dVar2.j(this));
                }
            }
            if (dVar.i(getName(), i11)) {
                G(dVar, i11 + dVar.e(getName(), i11), list, dVar2);
            }
        }
    }

    public void i(@Nullable z0.a<?, ?> aVar) {
        if (aVar == null) {
            return;
        }
        this.f10101w.add(aVar);
    }

    public final void j(Canvas canvas, Matrix matrix, z0.a<i, Path> aVar, z0.a<Integer, Integer> aVar2) {
        this.f10079a.set(aVar.h());
        this.f10079a.transform(matrix);
        this.f10082d.setAlpha((int) (aVar2.h().intValue() * 2.55f));
        canvas.drawPath(this.f10079a, this.f10082d);
    }

    public final void k(Canvas canvas, Matrix matrix, z0.a<i, Path> aVar, z0.a<Integer, Integer> aVar2) {
        j1.j.n(canvas, this.f10087i, this.f10083e);
        this.f10079a.set(aVar.h());
        this.f10079a.transform(matrix);
        this.f10082d.setAlpha((int) (aVar2.h().intValue() * 2.55f));
        canvas.drawPath(this.f10079a, this.f10082d);
        canvas.restore();
    }

    public final void l(Canvas canvas, Matrix matrix, z0.a<i, Path> aVar, z0.a<Integer, Integer> aVar2) {
        j1.j.n(canvas, this.f10087i, this.f10082d);
        canvas.drawRect(this.f10087i, this.f10082d);
        this.f10079a.set(aVar.h());
        this.f10079a.transform(matrix);
        this.f10082d.setAlpha((int) (aVar2.h().intValue() * 2.55f));
        canvas.drawPath(this.f10079a, this.f10084f);
        canvas.restore();
    }

    public final void m(Canvas canvas, Matrix matrix, z0.a<i, Path> aVar, z0.a<Integer, Integer> aVar2) {
        j1.j.n(canvas, this.f10087i, this.f10083e);
        canvas.drawRect(this.f10087i, this.f10082d);
        this.f10084f.setAlpha((int) (aVar2.h().intValue() * 2.55f));
        this.f10079a.set(aVar.h());
        this.f10079a.transform(matrix);
        canvas.drawPath(this.f10079a, this.f10084f);
        canvas.restore();
    }

    public final void n(Canvas canvas, Matrix matrix, z0.a<i, Path> aVar, z0.a<Integer, Integer> aVar2) {
        j1.j.n(canvas, this.f10087i, this.f10084f);
        canvas.drawRect(this.f10087i, this.f10082d);
        this.f10084f.setAlpha((int) (aVar2.h().intValue() * 2.55f));
        this.f10079a.set(aVar.h());
        this.f10079a.transform(matrix);
        canvas.drawPath(this.f10079a, this.f10084f);
        canvas.restore();
    }

    public final void o(Canvas canvas, Matrix matrix) {
        com.airbnb.lottie.e.a("Layer#saveLayer");
        j1.j.o(canvas, this.f10087i, this.f10083e, 19);
        if (Build.VERSION.SDK_INT < 28) {
            s(canvas);
        }
        com.airbnb.lottie.e.b("Layer#saveLayer");
        for (int i11 = 0; i11 < this.f10096r.b().size(); i11++) {
            Mask mask = this.f10096r.b().get(i11);
            z0.a<i, Path> aVar = this.f10096r.a().get(i11);
            z0.a<Integer, Integer> aVar2 = this.f10096r.c().get(i11);
            int i12 = C0157a.f10106b[mask.a().ordinal()];
            if (i12 != 1) {
                if (i12 == 2) {
                    if (i11 == 0) {
                        this.f10082d.setColor(-16777216);
                        this.f10082d.setAlpha(255);
                        canvas.drawRect(this.f10087i, this.f10082d);
                    }
                    if (mask.d()) {
                        n(canvas, matrix, aVar, aVar2);
                    } else {
                        p(canvas, matrix, aVar);
                    }
                } else if (i12 != 3) {
                    if (i12 == 4) {
                        if (mask.d()) {
                            l(canvas, matrix, aVar, aVar2);
                        } else {
                            j(canvas, matrix, aVar, aVar2);
                        }
                    }
                } else if (mask.d()) {
                    m(canvas, matrix, aVar, aVar2);
                } else {
                    k(canvas, matrix, aVar, aVar2);
                }
            } else if (q()) {
                this.f10082d.setAlpha(255);
                canvas.drawRect(this.f10087i, this.f10082d);
            }
        }
        com.airbnb.lottie.e.a("Layer#restoreLayer");
        canvas.restore();
        com.airbnb.lottie.e.b("Layer#restoreLayer");
    }

    public final void p(Canvas canvas, Matrix matrix, z0.a<i, Path> aVar) {
        this.f10079a.set(aVar.h());
        this.f10079a.transform(matrix);
        canvas.drawPath(this.f10079a, this.f10084f);
    }

    public final boolean q() {
        if (this.f10096r.a().isEmpty()) {
            return false;
        }
        for (int i11 = 0; i11 < this.f10096r.b().size(); i11++) {
            if (this.f10096r.b().get(i11).a() != Mask.MaskMode.MASK_MODE_NONE) {
                return false;
            }
        }
        return true;
    }

    public final void r() {
        if (this.f10100v != null) {
            return;
        }
        if (this.f10099u == null) {
            this.f10100v = Collections.EMPTY_LIST;
            return;
        }
        this.f10100v = new ArrayList();
        for (a aVar = this.f10099u; aVar != null; aVar = aVar.f10099u) {
            this.f10100v.add(aVar);
        }
    }

    public final void s(Canvas canvas) {
        com.airbnb.lottie.e.a("Layer#clearLayer");
        RectF rectF = this.f10087i;
        canvas.drawRect(rectF.left - 1.0f, rectF.top - 1.0f, rectF.right + 1.0f, rectF.bottom + 1.0f, this.f10086h);
        com.airbnb.lottie.e.b("Layer#clearLayer");
    }

    public abstract void t(Canvas canvas, Matrix matrix, int i11);

    @Nullable
    public e1.a v() {
        return this.f10095q.a();
    }

    public BlurMaskFilter w(float f11) {
        if (this.B == f11) {
            return this.C;
        }
        BlurMaskFilter blurMaskFilter = new BlurMaskFilter(f11 / 2.0f, BlurMaskFilter.Blur.NORMAL);
        this.C = blurMaskFilter;
        this.B = f11;
        return blurMaskFilter;
    }

    @Nullable
    public h1.j x() {
        return this.f10095q.c();
    }

    public Layer y() {
        return this.f10095q;
    }

    public boolean z() {
        h hVar = this.f10096r;
        return (hVar == null || hVar.a().isEmpty()) ? false : true;
    }

    @Override // y0.c
    public void f(List<y0.c> list, List<y0.c> list2) {
    }

    public void G(c1.d dVar, int i11, List<c1.d> list, c1.d dVar2) {
    }
}
