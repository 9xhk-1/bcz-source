package q20;

import e30.r0;
import e30.u1;
import f30.b;
import f30.e;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.jvm.internal.impl.builtins.PrimitiveType;
import kotlin.reflect.jvm.internal.impl.types.TypeCheckerState;
import kotlin.reflect.jvm.internal.impl.types.model.ArgumentList;
import kotlin.reflect.jvm.internal.impl.types.model.CaptureStatus;
import kotlin.reflect.jvm.internal.impl.types.model.TypeVariance;
import org.junit.jupiter.api.j2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class m implements f30.b {

    /* renamed from: a, reason: collision with root package name */
    @m80.l
    public final Map<u1, u1> f81477a;

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public final e.a f81478b;

    /* renamed from: c, reason: collision with root package name */
    @m80.k
    public final f30.g f81479c;

    /* renamed from: d, reason: collision with root package name */
    @m80.k
    public final f30.f f81480d;

    /* renamed from: e, reason: collision with root package name */
    @m80.l
    public final x00.p<r0, r0, Boolean> f81481e;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a extends TypeCheckerState {

        /* renamed from: k, reason: collision with root package name */
        public final /* synthetic */ m f81482k;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(boolean z11, boolean z12, m mVar, f30.f fVar, f30.g gVar) {
            super(z11, z12, true, mVar, fVar, gVar);
            this.f81482k = mVar;
        }

        @Override // kotlin.reflect.jvm.internal.impl.types.TypeCheckerState
        public boolean f(i30.g subType, i30.g superType) {
            g0.p(subType, "subType");
            g0.p(superType, "superType");
            if (!(subType instanceof r0)) {
                throw new IllegalArgumentException("Failed requirement.");
            }
            if (superType instanceof r0) {
                return ((Boolean) this.f81482k.f81481e.invoke(subType, superType)).booleanValue();
            }
            throw new IllegalArgumentException("Failed requirement.");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public m(@m80.l Map<u1, ? extends u1> map, @m80.k e.a equalityAxioms, @m80.k f30.g kotlinTypeRefiner, @m80.k f30.f kotlinTypePreparator, @m80.l x00.p<? super r0, ? super r0, Boolean> pVar) {
        g0.p(equalityAxioms, "equalityAxioms");
        g0.p(kotlinTypeRefiner, "kotlinTypeRefiner");
        g0.p(kotlinTypePreparator, "kotlinTypePreparator");
        this.f81477a = map;
        this.f81478b = equalityAxioms;
        this.f81479c = kotlinTypeRefiner;
        this.f81480d = kotlinTypePreparator;
        this.f81481e = pVar;
    }

    @Override // i30.o
    public boolean A(@m80.k i30.h hVar) {
        return b.a.Z(this, hVar);
    }

    @Override // i30.o
    @m80.k
    public i30.l A0(i30.g gVar) {
        g0.p(gVar, "<this>");
        i30.h f11 = f(gVar);
        if (f11 == null) {
            f11 = G0(gVar);
        }
        return d(f11);
    }

    @Override // i30.o
    public boolean B(@m80.k i30.l lVar) {
        return b.a.Q(this, lVar);
    }

    @Override // i30.o
    public boolean B0(@m80.k i30.h hVar) {
        return b.a.O(this, hVar);
    }

    @Override // i30.o
    @m80.k
    public i30.k C(@m80.k i30.g gVar, int i11) {
        return b.a.m(this, gVar, i11);
    }

    @Override // i30.o
    public int C0(@m80.k i30.l lVar) {
        return b.a.i0(this, lVar);
    }

    @Override // e30.g2
    @m80.k
    public n20.d D(@m80.k i30.l lVar) {
        return b.a.o(this, lVar);
    }

    @Override // i30.o
    @m80.l
    public i30.e D0(@m80.k i30.g gVar) {
        return b.a.g(this, gVar);
    }

    @Override // e30.g2
    @m80.k
    public i30.g E(@m80.k i30.m mVar) {
        return b.a.t(this, mVar);
    }

    @Override // e30.g2
    @m80.k
    public i30.g E0(i30.g gVar) {
        i30.h b11;
        g0.p(gVar, "<this>");
        i30.h f11 = f(gVar);
        return (f11 == null || (b11 = b(f11, true)) == null) ? gVar : b11;
    }

    @Override // i30.o
    @m80.k
    public i30.h F(i30.h hVar) {
        i30.h m11;
        g0.p(hVar, "<this>");
        i30.c d02 = d0(hVar);
        return (d02 == null || (m11 = m(d02)) == null) ? hVar : m11;
    }

    @Override // i30.o
    @m80.l
    public List<i30.h> F0(i30.h hVar, i30.l constructor) {
        g0.p(hVar, "<this>");
        g0.p(constructor, "constructor");
        return null;
    }

    @Override // i30.o
    public boolean G(@m80.k i30.b bVar) {
        return b.a.S(this, bVar);
    }

    @Override // i30.o
    @m80.k
    public i30.h G0(i30.g gVar) {
        i30.h c11;
        g0.p(gVar, "<this>");
        i30.e D0 = D0(gVar);
        if (D0 != null && (c11 = c(D0)) != null) {
            return c11;
        }
        i30.h f11 = f(gVar);
        g0.m(f11);
        return f11;
    }

    @Override // i30.o
    @m80.k
    public i30.g H(@m80.k i30.k kVar) {
        return b.a.u(this, kVar);
    }

    @Override // i30.o
    @m80.k
    public i30.a H0(@m80.k i30.b bVar) {
        return b.a.n0(this, bVar);
    }

    @Override // i30.o
    public boolean I(@m80.k i30.l lVar) {
        return b.a.I(this, lVar);
    }

    @Override // e30.g2
    public boolean I0(@m80.k i30.l lVar) {
        return b.a.K(this, lVar);
    }

    @Override // i30.o
    public boolean J(i30.g gVar) {
        g0.p(gVar, "<this>");
        return B0(G0(gVar)) != B0(z(gVar));
    }

    @Override // i30.o
    @m80.k
    public i30.g K(@m80.k i30.g gVar, boolean z11) {
        return b.a.f0(this, gVar, z11);
    }

    public final boolean K0(u1 u1Var, u1 u1Var2) {
        if (this.f81478b.a(u1Var, u1Var2)) {
            return true;
        }
        Map<u1, u1> map = this.f81477a;
        if (map == null) {
            return false;
        }
        u1 u1Var3 = map.get(u1Var);
        u1 u1Var4 = this.f81477a.get(u1Var2);
        return (u1Var3 != null && g0.g(u1Var3, u1Var2)) || (u1Var4 != null && g0.g(u1Var4, u1Var));
    }

    @Override // e30.g2
    public boolean L(@m80.k i30.g gVar, @m80.k n20.c cVar) {
        return b.a.B(this, gVar, cVar);
    }

    @m80.k
    public TypeCheckerState L0(boolean z11, boolean z12) {
        if (this.f81481e != null) {
            return new a(z11, z12, this, this.f81480d, this.f81479c);
        }
        return f30.a.a(z11, z12, this, this.f81480d, this.f81479c);
    }

    @Override // i30.o
    @m80.k
    public CaptureStatus M(@m80.k i30.b bVar) {
        return b.a.k(this, bVar);
    }

    @Override // i30.o
    public int N(i30.j jVar) {
        g0.p(jVar, "<this>");
        if (jVar instanceof i30.h) {
            return i((i30.g) jVar);
        }
        if (jVar instanceof ArgumentList) {
            return ((ArgumentList) jVar).size();
        }
        throw new IllegalStateException(("unknown type argument list type: " + jVar + j2.O + o0.d(jVar.getClass())).toString());
    }

    @Override // e30.g2
    @m80.l
    public PrimitiveType O(@m80.k i30.l lVar) {
        return b.a.s(this, lVar);
    }

    @Override // i30.o
    @m80.k
    public i30.g P(i30.g gVar) {
        g0.p(gVar, "<this>");
        return K(gVar, false);
    }

    @Override // i30.o
    @m80.l
    public i30.g Q(@m80.k i30.b bVar) {
        return b.a.e0(this, bVar);
    }

    @Override // i30.o
    @m80.k
    public List<i30.g> R(@m80.k i30.m mVar) {
        return b.a.y(this, mVar);
    }

    @Override // i30.o
    public boolean S(i30.g gVar) {
        g0.p(gVar, "<this>");
        return (gVar instanceof i30.h) && B0((i30.h) gVar);
    }

    @Override // i30.o
    @m80.l
    public i30.h T(@m80.k i30.h hVar, @m80.k CaptureStatus captureStatus) {
        return b.a.j(this, hVar, captureStatus);
    }

    @Override // i30.o
    public boolean U(i30.g gVar) {
        g0.p(gVar, "<this>");
        return B(A0(gVar)) && !t0(gVar);
    }

    @Override // i30.o
    @m80.k
    public Collection<i30.g> V(@m80.k i30.h hVar) {
        return b.a.j0(this, hVar);
    }

    @Override // i30.o
    public boolean W(@m80.k i30.b bVar) {
        return b.a.U(this, bVar);
    }

    @Override // i30.o
    public boolean X(@m80.k i30.m mVar, @m80.l i30.l lVar) {
        return b.a.C(this, mVar, lVar);
    }

    @Override // i30.o
    public boolean Y(@m80.k i30.l lVar) {
        return b.a.L(this, lVar);
    }

    @Override // i30.o
    public boolean Z(@m80.k i30.l c12, @m80.k i30.l c22) {
        g0.p(c12, "c1");
        g0.p(c22, "c2");
        if (!(c12 instanceof u1)) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        if (c22 instanceof u1) {
            return b.a.a(this, c12, c22) || K0((u1) c12, (u1) c22);
        }
        throw new IllegalArgumentException("Failed requirement.");
    }

    @Override // f30.b, i30.o
    @m80.k
    public i30.h a(@m80.k i30.e eVar) {
        return b.a.p0(this, eVar);
    }

    @Override // i30.o
    @m80.k
    public i30.j a0(@m80.k i30.h hVar) {
        return b.a.c(this, hVar);
    }

    @Override // f30.b, i30.o
    @m80.k
    public i30.h b(@m80.k i30.h hVar, boolean z11) {
        return b.a.r0(this, hVar, z11);
    }

    @Override // f30.b
    @m80.k
    public i30.g b0(@m80.k i30.h hVar, @m80.k i30.h hVar2) {
        return b.a.l(this, hVar, hVar2);
    }

    @Override // f30.b, i30.o
    @m80.k
    public i30.h c(@m80.k i30.e eVar) {
        return b.a.d0(this, eVar);
    }

    @Override // e30.g2
    public boolean c0(@m80.k i30.l lVar) {
        return b.a.c0(this, lVar);
    }

    @Override // f30.b, i30.o
    @m80.k
    public i30.l d(@m80.k i30.h hVar) {
        return b.a.o0(this, hVar);
    }

    @Override // i30.o
    @m80.l
    public i30.c d0(@m80.k i30.h hVar) {
        return b.a.e(this, hVar);
    }

    @Override // f30.b, i30.o
    public boolean e(@m80.k i30.h hVar) {
        return b.a.W(this, hVar);
    }

    @Override // e30.g2
    @m80.l
    public i30.g e0(@m80.k i30.g gVar) {
        return b.a.x(this, gVar);
    }

    @Override // f30.b, i30.o
    @m80.l
    public i30.h f(@m80.k i30.g gVar) {
        return b.a.h(this, gVar);
    }

    @Override // i30.o
    public boolean f0(@m80.k i30.g gVar) {
        return b.a.P(this, gVar);
    }

    @Override // f30.b, i30.o
    @m80.l
    public i30.b g(@m80.k i30.h hVar) {
        return b.a.d(this, hVar);
    }

    @Override // i30.o
    @m80.k
    public i30.g g0(@m80.k i30.g gVar, boolean z11) {
        return b.a.q0(this, gVar, z11);
    }

    @Override // i30.o
    public boolean h(i30.h hVar) {
        g0.p(hVar, "<this>");
        return w(d(hVar));
    }

    @Override // i30.o
    @m80.k
    public List<i30.m> h0(@m80.k i30.l lVar) {
        return b.a.q(this, lVar);
    }

    @Override // i30.o
    public int i(@m80.k i30.g gVar) {
        return b.a.b(this, gVar);
    }

    @Override // i30.o
    public boolean i0(@m80.k i30.h hVar) {
        return b.a.T(this, hVar);
    }

    @Override // i30.o
    public boolean j(i30.g gVar) {
        g0.p(gVar, "<this>");
        return !g0.g(d(G0(gVar)), d(z(gVar)));
    }

    @Override // i30.o
    @m80.k
    public List<i30.k> j0(@m80.k i30.g gVar) {
        return b.a.n(this, gVar);
    }

    @Override // i30.o
    @m80.l
    public i30.m k(@m80.k i30.l lVar) {
        return b.a.w(this, lVar);
    }

    @Override // i30.o
    @m80.k
    public TypeCheckerState.b k0(@m80.k i30.h hVar) {
        return b.a.l0(this, hVar);
    }

    @Override // i30.o
    @m80.k
    public TypeVariance l(@m80.k i30.k kVar) {
        return b.a.z(this, kVar);
    }

    @Override // i30.o
    public boolean l0(i30.g gVar) {
        g0.p(gVar, "<this>");
        i30.h f11 = f(gVar);
        return (f11 != null ? g(f11) : null) != null;
    }

    @Override // i30.o
    @m80.k
    public i30.h m(@m80.k i30.c cVar) {
        return b.a.h0(this, cVar);
    }

    @Override // i30.o
    @m80.k
    public i30.m m0(@m80.k i30.l lVar, int i11) {
        return b.a.p(this, lVar, i11);
    }

    @Override // i30.o
    public boolean n(@m80.k i30.g gVar) {
        return b.a.V(this, gVar);
    }

    @Override // i30.o
    public boolean n0(@m80.k i30.g gVar) {
        return b.a.b0(this, gVar);
    }

    @Override // i30.o
    public boolean o(@m80.k i30.l lVar) {
        return b.a.M(this, lVar);
    }

    @Override // i30.o
    @m80.k
    public i30.k o0(@m80.k i30.g gVar) {
        return b.a.i(this, gVar);
    }

    @Override // i30.o
    @m80.k
    public TypeVariance p(@m80.k i30.m mVar) {
        return b.a.A(this, mVar);
    }

    @Override // i30.o
    @m80.k
    public i30.k p0(i30.j jVar, int i11) {
        g0.p(jVar, "<this>");
        if (jVar instanceof i30.h) {
            return C((i30.g) jVar, i11);
        }
        if (jVar instanceof ArgumentList) {
            i30.k kVar = ((ArgumentList) jVar).get(i11);
            g0.o(kVar, "get(...)");
            return kVar;
        }
        throw new IllegalStateException(("unknown type argument list type: " + jVar + j2.O + o0.d(jVar.getClass())).toString());
    }

    @Override // i30.o
    public boolean q(@m80.k i30.g gVar) {
        return b.a.J(this, gVar);
    }

    @Override // i30.r
    public boolean q0(@m80.k i30.h hVar, @m80.k i30.h hVar2) {
        return b.a.D(this, hVar, hVar2);
    }

    @Override // i30.o
    @m80.k
    public i30.g r(@m80.k Collection<? extends i30.g> collection) {
        return b.a.E(this, collection);
    }

    @Override // i30.o
    @m80.k
    public Collection<i30.g> r0(@m80.k i30.l lVar) {
        return b.a.m0(this, lVar);
    }

    @Override // i30.o
    @m80.l
    public i30.d s(@m80.k i30.e eVar) {
        return b.a.f(this, eVar);
    }

    @Override // i30.o
    public boolean s0(i30.g gVar) {
        g0.p(gVar, "<this>");
        i30.e D0 = D0(gVar);
        return (D0 != null ? s(D0) : null) != null;
    }

    @Override // i30.q
    public boolean t() {
        return b.a.N(this);
    }

    @Override // i30.o
    public boolean t0(@m80.k i30.g gVar) {
        return b.a.R(this, gVar);
    }

    @Override // i30.o
    public boolean u(i30.h hVar) {
        g0.p(hVar, "<this>");
        return Y(d(hVar));
    }

    @Override // i30.o
    @m80.k
    public i30.k u0(@m80.k i30.a aVar) {
        return b.a.k0(this, aVar);
    }

    @Override // i30.o
    @m80.l
    public i30.m v(@m80.k i30.s sVar) {
        return b.a.v(this, sVar);
    }

    @Override // i30.o
    public boolean v0(@m80.k i30.l lVar) {
        return b.a.F(this, lVar);
    }

    @Override // i30.o
    public boolean w(@m80.k i30.l lVar) {
        return b.a.G(this, lVar);
    }

    @Override // i30.o
    public boolean w0(@m80.k i30.l lVar) {
        return b.a.H(this, lVar);
    }

    @Override // i30.o
    public boolean x(@m80.k i30.h hVar) {
        return b.a.a0(this, hVar);
    }

    @Override // i30.o
    @m80.l
    public i30.k x0(i30.h hVar, int i11) {
        g0.p(hVar, "<this>");
        if (i11 < 0 || i11 >= i(hVar)) {
            return null;
        }
        return C(hVar, i11);
    }

    @Override // i30.o
    public boolean y(@m80.k i30.k kVar) {
        return b.a.Y(this, kVar);
    }

    @Override // e30.g2
    @m80.l
    public PrimitiveType y0(@m80.k i30.l lVar) {
        return b.a.r(this, lVar);
    }

    @Override // i30.o
    @m80.k
    public i30.h z(i30.g gVar) {
        i30.h a11;
        g0.p(gVar, "<this>");
        i30.e D0 = D0(gVar);
        if (D0 != null && (a11 = a(D0)) != null) {
            return a11;
        }
        i30.h f11 = f(gVar);
        g0.m(f11);
        return f11;
    }

    @Override // i30.o
    public boolean z0(i30.g gVar) {
        g0.p(gVar, "<this>");
        i30.h f11 = f(gVar);
        return (f11 != null ? d0(f11) : null) != null;
    }
}
