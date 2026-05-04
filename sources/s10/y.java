package s10;

import e30.d2;
import e30.f2;
import e30.h2;
import e30.u1;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassKind;
import kotlin.reflect.jvm.internal.impl.descriptors.Modality;
import kotlin.reflect.jvm.internal.impl.types.Variance;
import p10.c1;
import p10.h1;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public class y extends z {

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ boolean f87362h = false;

    /* renamed from: b, reason: collision with root package name */
    public final z f87363b;

    /* renamed from: c, reason: collision with root package name */
    public final f2 f87364c;

    /* renamed from: d, reason: collision with root package name */
    public f2 f87365d;

    /* renamed from: e, reason: collision with root package name */
    public List<c1> f87366e;

    /* renamed from: f, reason: collision with root package name */
    public List<c1> f87367f;

    /* renamed from: g, reason: collision with root package name */
    public u1 f87368g;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class a implements x00.l<c1, Boolean> {
        public a() {
        }

        @Override // x00.l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Boolean invoke(c1 c1Var) {
            return Boolean.valueOf(!c1Var.G());
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class b implements x00.l<e30.c1, e30.c1> {
        public b() {
        }

        @Override // x00.l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public e30.c1 invoke(e30.c1 c1Var) {
            return y.this.H0(c1Var);
        }
    }

    public y(z zVar, f2 f2Var) {
        this.f87363b = zVar;
        this.f87364c = f2Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00c6 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00e3 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00c2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static /* synthetic */ void p0(int r15) {
        /*
            Method dump skipped, instructions count: 318
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: s10.y.p0(int):void");
    }

    @Override // p10.b
    @m80.l
    public kotlin.reflect.jvm.internal.impl.descriptors.b B() {
        return this.f87363b.B();
    }

    @Override // s10.z
    @m80.k
    public x20.k C(@m80.k d2 d2Var, @m80.k f30.g gVar) {
        if (d2Var == null) {
            p0(5);
        }
        if (gVar == null) {
            p0(6);
        }
        x20.k C = this.f87363b.C(d2Var, gVar);
        if (!this.f87364c.k()) {
            return new x20.t(C, F0());
        }
        if (C == null) {
            p0(7);
        }
        return C;
    }

    public final f2 F0() {
        if (this.f87365d == null) {
            if (this.f87364c.k()) {
                this.f87365d = this.f87364c;
            } else {
                List<c1> parameters = this.f87363b.o().getParameters();
                this.f87366e = new ArrayList(parameters.size());
                this.f87365d = e30.b0.b(parameters, this.f87364c.j(), this, this.f87366e);
                this.f87367f = a00.r0.r2(this.f87366e, new a());
            }
        }
        return this.f87365d;
    }

    @Override // p10.z0
    @m80.k
    /* renamed from: G0, reason: merged with bridge method [inline-methods] */
    public p10.b c(@m80.k f2 f2Var) {
        if (f2Var == null) {
            p0(23);
        }
        return f2Var.k() ? this : new y(this, f2.h(f2Var.j(), F0().j()));
    }

    @m80.l
    public final e30.c1 H0(@m80.l e30.c1 c1Var) {
        return (c1Var == null || this.f87364c.k()) ? c1Var : (e30.c1) F0().p(c1Var, Variance.INVARIANT);
    }

    @Override // p10.b
    @m80.k
    public x20.k I() {
        x20.k I = this.f87363b.I();
        if (I == null) {
            p0(28);
        }
        return I;
    }

    @Override // p10.b
    @m80.k
    public x20.k J() {
        x20.k V = V(u20.e.r(q20.h.g(this.f87363b)));
        if (V == null) {
            p0(12);
        }
        return V;
    }

    @Override // p10.b
    @m80.k
    public x20.k K(@m80.k d2 d2Var) {
        if (d2Var == null) {
            p0(10);
        }
        x20.k C = C(d2Var, u20.e.r(q20.h.g(this)));
        if (C == null) {
            p0(11);
        }
        return C;
    }

    @Override // s10.z
    @m80.k
    public x20.k V(@m80.k f30.g gVar) {
        if (gVar == null) {
            p0(13);
        }
        x20.k V = this.f87363b.V(gVar);
        if (!this.f87364c.k()) {
            return new x20.t(V, F0());
        }
        if (V == null) {
            p0(14);
        }
        return V;
    }

    @Override // p10.b
    @m80.k
    public p10.t0 W() {
        throw new UnsupportedOperationException();
    }

    @Override // p10.b, p10.i, p10.h
    @m80.k
    public p10.h b() {
        p10.h b11 = this.f87363b.b();
        if (b11 == null) {
            p0(22);
        }
        return b11;
    }

    @Override // p10.b
    @m80.k
    public Collection<kotlin.reflect.jvm.internal.impl.descriptors.b> f() {
        Collection<kotlin.reflect.jvm.internal.impl.descriptors.b> f11 = this.f87363b.f();
        ArrayList arrayList = new ArrayList(f11.size());
        for (kotlin.reflect.jvm.internal.impl.descriptors.b bVar : f11) {
            arrayList.add(((kotlin.reflect.jvm.internal.impl.descriptors.b) bVar.n().e(bVar.a()).q(bVar.k()).m(bVar.getVisibility()).s(bVar.getKind()).f(false).build()).c(F0()));
        }
        return arrayList;
    }

    @Override // q10.a
    @m80.k
    public q10.g getAnnotations() {
        q10.g annotations = this.f87363b.getAnnotations();
        if (annotations == null) {
            p0(19);
        }
        return annotations;
    }

    @Override // p10.b
    @m80.k
    public ClassKind getKind() {
        ClassKind kind = this.f87363b.getKind();
        if (kind == null) {
            p0(25);
        }
        return kind;
    }

    @Override // p10.c0
    @m80.k
    public n20.f getName() {
        n20.f name = this.f87363b.getName();
        if (name == null) {
            p0(20);
        }
        return name;
    }

    @Override // p10.k
    @m80.k
    public p10.x0 getSource() {
        p10.x0 x0Var = p10.x0.f78622a;
        if (x0Var == null) {
            p0(29);
        }
        return x0Var;
    }

    @Override // p10.b, p10.x, p10.l
    @m80.k
    public p10.p getVisibility() {
        p10.p visibility = this.f87363b.getVisibility();
        if (visibility == null) {
            p0(27);
        }
        return visibility;
    }

    @Override // p10.e
    public boolean i() {
        return this.f87363b.i();
    }

    @Override // p10.b
    @m80.l
    public h1<e30.c1> i0() {
        h1<e30.c1> i02 = this.f87363b.i0();
        if (i02 == null) {
            return null;
        }
        return i02.b(new b());
    }

    @Override // p10.x
    public boolean isExternal() {
        return this.f87363b.isExternal();
    }

    @Override // p10.b
    public boolean isInline() {
        return this.f87363b.isInline();
    }

    @Override // p10.b, p10.x
    @m80.k
    public Modality k() {
        Modality k11 = this.f87363b.k();
        if (k11 == null) {
            p0(26);
        }
        return k11;
    }

    @Override // p10.x
    public boolean k0() {
        return this.f87363b.k0();
    }

    @Override // p10.b
    @m80.k
    public List<p10.t0> l0() {
        List<p10.t0> list = Collections.EMPTY_LIST;
        if (list == null) {
            p0(17);
        }
        return list;
    }

    @Override // p10.b
    public boolean m0() {
        return this.f87363b.m0();
    }

    @Override // p10.d
    @m80.k
    public u1 o() {
        u1 o11 = this.f87363b.o();
        if (this.f87364c.k()) {
            if (o11 == null) {
                p0(0);
            }
            return o11;
        }
        if (this.f87368g == null) {
            f2 F0 = F0();
            Collection<e30.r0> c11 = o11.c();
            ArrayList arrayList = new ArrayList(c11.size());
            Iterator<e30.r0> it = c11.iterator();
            while (it.hasNext()) {
                arrayList.add(F0.p(it.next(), Variance.INVARIANT));
            }
            this.f87368g = new e30.t(this, this.f87366e, arrayList, d30.f.f47125e);
        }
        u1 u1Var = this.f87368g;
        if (u1Var == null) {
            p0(1);
        }
        return u1Var;
    }

    @Override // p10.b
    @m80.k
    public Collection<p10.b> p() {
        Collection<p10.b> p11 = this.f87363b.p();
        if (p11 == null) {
            p0(31);
        }
        return p11;
    }

    @Override // p10.x
    public boolean q0() {
        return this.f87363b.q0();
    }

    @Override // p10.b
    @m80.k
    public x20.k r0() {
        x20.k r02 = this.f87363b.r0();
        if (r02 == null) {
            p0(15);
        }
        return r02;
    }

    @Override // p10.b, p10.d
    @m80.k
    public e30.c1 s() {
        e30.c1 o11 = e30.u0.o(e30.w.f48677a.a(getAnnotations(), null, null), o(), h2.g(o().getParameters()), false, J());
        if (o11 == null) {
            p0(16);
        }
        return o11;
    }

    @Override // p10.b
    public p10.b s0() {
        return this.f87363b.s0();
    }

    @Override // p10.b, p10.e
    @m80.k
    public List<c1> t() {
        F0();
        List<c1> list = this.f87367f;
        if (list == null) {
            p0(30);
        }
        return list;
    }

    @Override // p10.b
    public boolean u() {
        return this.f87363b.u();
    }

    @Override // p10.b
    public boolean v() {
        return this.f87363b.v();
    }

    @Override // p10.b
    public boolean w() {
        return this.f87363b.w();
    }

    @Override // p10.h
    public <R, D> R y(p10.j<R, D> jVar, D d11) {
        return jVar.i(this, d11);
    }

    @Override // s10.z, p10.h
    @m80.k
    public p10.b a() {
        p10.b a11 = this.f87363b.a();
        if (a11 == null) {
            p0(21);
        }
        return a11;
    }
}
