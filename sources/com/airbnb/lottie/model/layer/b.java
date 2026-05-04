package com.airbnb.lottie.model.layer;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RectF;
import androidx.annotation.FloatRange;
import androidx.annotation.Nullable;
import androidx.collection.LongSparseArray;
import c1.d;
import com.airbnb.lottie.e;
import com.airbnb.lottie.k;
import com.airbnb.lottie.model.layer.Layer;
import com.airbnb.lottie.o0;
import com.airbnb.lottie.t0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import k1.j;
import z0.q;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public class b extends com.airbnb.lottie.model.layer.a {

    @Nullable
    public z0.a<Float, Float> H;
    public final List<com.airbnb.lottie.model.layer.a> I;
    public final RectF J;
    public final RectF K;
    public final Paint L;

    @Nullable
    public Boolean M;

    @Nullable
    public Boolean N;
    public boolean O;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f10107a;

        static {
            int[] iArr = new int[Layer.MatteType.values().length];
            f10107a = iArr;
            try {
                iArr[Layer.MatteType.ADD.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f10107a[Layer.MatteType.INVERT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public b(o0 o0Var, Layer layer, List<Layer> list, k kVar) {
        super(o0Var, layer);
        int i11;
        com.airbnb.lottie.model.layer.a aVar;
        this.I = new ArrayList();
        this.J = new RectF();
        this.K = new RectF();
        this.L = new Paint();
        this.O = true;
        d1.b u11 = layer.u();
        if (u11 != null) {
            z0.a<Float, Float> k11 = u11.k();
            this.H = k11;
            i(k11);
            this.H.a(this);
        } else {
            this.H = null;
        }
        LongSparseArray longSparseArray = new LongSparseArray(kVar.k().size());
        int size = list.size() - 1;
        com.airbnb.lottie.model.layer.a aVar2 = null;
        while (true) {
            if (size < 0) {
                break;
            }
            Layer layer2 = list.get(size);
            com.airbnb.lottie.model.layer.a u12 = com.airbnb.lottie.model.layer.a.u(this, layer2, o0Var, kVar);
            if (u12 != null) {
                longSparseArray.put(u12.y().d(), u12);
                if (aVar2 != null) {
                    aVar2.H(u12);
                    aVar2 = null;
                } else {
                    this.I.add(0, u12);
                    int i12 = a.f10107a[layer2.h().ordinal()];
                    if (i12 == 1 || i12 == 2) {
                        aVar2 = u12;
                    }
                }
            }
            size--;
        }
        for (i11 = 0; i11 < longSparseArray.size(); i11++) {
            com.airbnb.lottie.model.layer.a aVar3 = (com.airbnb.lottie.model.layer.a) longSparseArray.get(longSparseArray.keyAt(i11));
            if (aVar3 != null && (aVar = (com.airbnb.lottie.model.layer.a) longSparseArray.get(aVar3.y().j())) != null) {
                aVar3.J(aVar);
            }
        }
    }

    @Override // com.airbnb.lottie.model.layer.a
    public void G(d dVar, int i11, List<d> list, d dVar2) {
        for (int i12 = 0; i12 < this.I.size(); i12++) {
            this.I.get(i12).h(dVar, i11, list, dVar2);
        }
    }

    @Override // com.airbnb.lottie.model.layer.a
    public void I(boolean z11) {
        super.I(z11);
        Iterator<com.airbnb.lottie.model.layer.a> it = this.I.iterator();
        while (it.hasNext()) {
            it.next().I(z11);
        }
    }

    @Override // com.airbnb.lottie.model.layer.a
    public void K(@FloatRange(from = 0.0d, to = 1.0d) float f11) {
        super.K(f11);
        if (this.H != null) {
            f11 = ((this.H.h().floatValue() * this.f10095q.b().i()) - this.f10095q.b().r()) / (this.f10094p.N().e() + 0.01f);
        }
        if (this.H == null) {
            f11 -= this.f10095q.r();
        }
        if (this.f10095q.v() != 0.0f && !"__container".equals(this.f10095q.i())) {
            f11 /= this.f10095q.v();
        }
        for (int size = this.I.size() - 1; size >= 0; size--) {
            this.I.get(size).K(f11);
        }
    }

    public boolean N() {
        if (this.N == null) {
            for (int size = this.I.size() - 1; size >= 0; size--) {
                com.airbnb.lottie.model.layer.a aVar = this.I.get(size);
                if (aVar instanceof f1.d) {
                    if (aVar.z()) {
                        this.N = Boolean.TRUE;
                        return true;
                    }
                } else if ((aVar instanceof b) && ((b) aVar).N()) {
                    this.N = Boolean.TRUE;
                    return true;
                }
            }
            this.N = Boolean.FALSE;
        }
        return this.N.booleanValue();
    }

    public boolean O() {
        if (this.M == null) {
            if (A()) {
                this.M = Boolean.TRUE;
                return true;
            }
            for (int size = this.I.size() - 1; size >= 0; size--) {
                if (this.I.get(size).A()) {
                    this.M = Boolean.TRUE;
                    return true;
                }
            }
            this.M = Boolean.FALSE;
        }
        return this.M.booleanValue();
    }

    public void P(boolean z11) {
        this.O = z11;
    }

    @Override // com.airbnb.lottie.model.layer.a, y0.e
    public void a(RectF rectF, Matrix matrix, boolean z11) {
        super.a(rectF, matrix, z11);
        for (int size = this.I.size() - 1; size >= 0; size--) {
            this.J.set(0.0f, 0.0f, 0.0f, 0.0f);
            this.I.get(size).a(this.J, this.f10093o, true);
            rectF.union(this.J);
        }
    }

    @Override // com.airbnb.lottie.model.layer.a, c1.e
    public <T> void b(T t11, @Nullable j<T> jVar) {
        super.b(t11, jVar);
        if (t11 == t0.E) {
            if (jVar == null) {
                z0.a<Float, Float> aVar = this.H;
                if (aVar != null) {
                    aVar.n(null);
                    return;
                }
                return;
            }
            q qVar = new q(jVar);
            this.H = qVar;
            qVar.a(this);
            i(this.H);
        }
    }

    @Override // com.airbnb.lottie.model.layer.a
    public void t(Canvas canvas, Matrix matrix, int i11) {
        e.a("CompositionLayer#draw");
        this.K.set(0.0f, 0.0f, this.f10095q.l(), this.f10095q.k());
        matrix.mapRect(this.K);
        boolean z11 = this.f10094p.l0() && this.I.size() > 1 && i11 != 255;
        if (z11) {
            this.L.setAlpha(i11);
            j1.j.n(canvas, this.K, this.L);
        } else {
            canvas.save();
        }
        if (z11) {
            i11 = 255;
        }
        for (int size = this.I.size() - 1; size >= 0; size--) {
            if (((this.O || !"__container".equals(this.f10095q.i())) && !this.K.isEmpty()) ? canvas.clipRect(this.K) : true) {
                this.I.get(size).d(canvas, matrix, i11);
            }
        }
        canvas.restore();
        e.b("CompositionLayer#draw");
    }
}
