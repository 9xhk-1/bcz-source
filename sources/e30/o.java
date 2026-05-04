package e30;

import java.util.Collection;
import java.util.List;
import kotlin.LazyThreadSafetyMode;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@kotlin.jvm.internal.u0({"SMAP\nAbstractTypeConstructor.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AbstractTypeConstructor.kt\norg/jetbrains/kotlin/types/AbstractTypeConstructor\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,133:1\n1#2:134\n*E\n"})
/* loaded from: classes8.dex */
public abstract class o extends u {

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public final d30.i<b> f48636b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f48637c;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public final class a implements u1 {

        /* renamed from: a, reason: collision with root package name */
        @m80.k
        public final f30.g f48638a;

        /* renamed from: b, reason: collision with root package name */
        @m80.k
        public final yz.c0 f48639b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ o f48640c;

        public a(@m80.k o oVar, f30.g kotlinTypeRefiner) {
            kotlin.jvm.internal.g0.p(kotlinTypeRefiner, "kotlinTypeRefiner");
            this.f48640c = oVar;
            this.f48638a = kotlinTypeRefiner;
            this.f48639b = yz.e0.b(LazyThreadSafetyMode.PUBLICATION, new n(this, oVar));
        }

        public static final List h(a aVar, o oVar) {
            return f30.h.b(aVar.f48638a, oVar.c());
        }

        @Override // e30.u1
        @m80.k
        public u1 d(@m80.k f30.g kotlinTypeRefiner) {
            kotlin.jvm.internal.g0.p(kotlinTypeRefiner, "kotlinTypeRefiner");
            return this.f48640c.d(kotlinTypeRefiner);
        }

        public boolean equals(@m80.l Object obj) {
            return this.f48640c.equals(obj);
        }

        public final List<r0> f() {
            return (List) this.f48639b.getValue();
        }

        @Override // e30.u1
        @m80.k
        /* renamed from: g, reason: merged with bridge method [inline-methods] */
        public List<r0> c() {
            return f();
        }

        @Override // e30.u1
        @m80.k
        public List<p10.c1> getParameters() {
            List<p10.c1> parameters = this.f48640c.getParameters();
            kotlin.jvm.internal.g0.o(parameters, "getParameters(...)");
            return parameters;
        }

        public int hashCode() {
            return this.f48640c.hashCode();
        }

        @Override // e30.u1
        @m80.k
        public n10.j q() {
            n10.j q11 = this.f48640c.q();
            kotlin.jvm.internal.g0.o(q11, "getBuiltIns(...)");
            return q11;
        }

        @Override // e30.u1
        @m80.k
        public p10.d r() {
            return this.f48640c.r();
        }

        @Override // e30.u1
        public boolean s() {
            return this.f48640c.s();
        }

        @m80.k
        public String toString() {
            return this.f48640c.toString();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        @m80.k
        public final Collection<r0> f48641a;

        /* renamed from: b, reason: collision with root package name */
        @m80.k
        public List<? extends r0> f48642b;

        /* JADX WARN: Multi-variable type inference failed */
        public b(@m80.k Collection<? extends r0> allSupertypes) {
            kotlin.jvm.internal.g0.p(allSupertypes, "allSupertypes");
            this.f48641a = allSupertypes;
            this.f48642b = a00.g0.l(g30.i.f52687a.l());
        }

        @m80.k
        public final Collection<r0> a() {
            return this.f48641a;
        }

        @m80.k
        public final List<r0> b() {
            return this.f48642b;
        }

        public final void c(@m80.k List<? extends r0> list) {
            kotlin.jvm.internal.g0.p(list, "<set-?>");
            this.f48642b = list;
        }
    }

    public o(@m80.k d30.n storageManager) {
        kotlin.jvm.internal.g0.p(storageManager, "storageManager");
        this.f48636b = storageManager.c(new g(this), h.f48595a, new i(this));
    }

    public static final b B(o oVar) {
        return new b(oVar.p());
    }

    public static final b C(boolean z11) {
        return new b(a00.g0.l(g30.i.f52687a.l()));
    }

    public static final yz.g2 D(o oVar, b supertypes) {
        kotlin.jvm.internal.g0.p(supertypes, "supertypes");
        List a11 = oVar.w().a(oVar, supertypes.a(), new j(oVar), new k(oVar));
        if (a11.isEmpty()) {
            r0 t11 = oVar.t();
            List l11 = t11 != null ? a00.g0.l(t11) : null;
            if (l11 == null) {
                l11 = a00.h0.J();
            }
            a11 = l11;
        }
        if (oVar.v()) {
            oVar.w().a(oVar, a11, new l(oVar), new m(oVar));
        }
        List<r0> list = a11 instanceof List ? (List) a11 : null;
        if (list == null) {
            list = a00.r0.a6(a11);
        }
        supertypes.c(oVar.y(list));
        return yz.g2.f100423a;
    }

    public static final Iterable E(o oVar, u1 it) {
        kotlin.jvm.internal.g0.p(it, "it");
        return oVar.o(it, false);
    }

    public static final yz.g2 F(o oVar, r0 it) {
        kotlin.jvm.internal.g0.p(it, "it");
        oVar.A(it);
        return yz.g2.f100423a;
    }

    public static final Iterable G(o oVar, u1 it) {
        kotlin.jvm.internal.g0.p(it, "it");
        return oVar.o(it, true);
    }

    public static final yz.g2 H(o oVar, r0 it) {
        kotlin.jvm.internal.g0.p(it, "it");
        oVar.z(it);
        return yz.g2.f100423a;
    }

    public void A(@m80.k r0 type) {
        kotlin.jvm.internal.g0.p(type, "type");
    }

    @Override // e30.u1
    @m80.k
    public u1 d(@m80.k f30.g kotlinTypeRefiner) {
        kotlin.jvm.internal.g0.p(kotlinTypeRefiner, "kotlinTypeRefiner");
        return new a(this, kotlinTypeRefiner);
    }

    public final Collection<r0> o(u1 u1Var, boolean z11) {
        List I4;
        o oVar = u1Var instanceof o ? (o) u1Var : null;
        if (oVar != null && (I4 = a00.r0.I4(oVar.f48636b.invoke().a(), oVar.u(z11))) != null) {
            return I4;
        }
        Collection<r0> c11 = u1Var.c();
        kotlin.jvm.internal.g0.o(c11, "getSupertypes(...)");
        return c11;
    }

    @m80.k
    public abstract Collection<r0> p();

    @m80.l
    public r0 t() {
        return null;
    }

    @m80.k
    public Collection<r0> u(boolean z11) {
        return a00.h0.J();
    }

    public boolean v() {
        return this.f48637c;
    }

    @m80.k
    public abstract p10.a1 w();

    @Override // e30.u1
    @m80.k
    /* renamed from: x, reason: merged with bridge method [inline-methods] */
    public List<r0> c() {
        return this.f48636b.invoke().b();
    }

    @m80.k
    public List<r0> y(@m80.k List<r0> supertypes) {
        kotlin.jvm.internal.g0.p(supertypes, "supertypes");
        return supertypes;
    }

    public void z(@m80.k r0 type) {
        kotlin.jvm.internal.g0.p(type, "type");
    }
}
