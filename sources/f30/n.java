package f30;

import a00.h0;
import a00.i0;
import e30.a2;
import e30.k2;
import e30.r0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import p10.c1;
import yz.e0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nNewCapturedType.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NewCapturedType.kt\norg/jetbrains/kotlin/types/checker/NewCapturedTypeConstructor\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,290:1\n1557#2:291\n1628#2,3:292\n*S KotlinDebug\n*F\n+ 1 NewCapturedType.kt\norg/jetbrains/kotlin/types/checker/NewCapturedTypeConstructor\n*L\n271#1:291\n271#1:292,3\n*E\n"})
/* loaded from: classes8.dex */
public final class n implements r20.b {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final a2 f50445a;

    /* renamed from: b, reason: collision with root package name */
    @m80.l
    public x00.a<? extends List<? extends k2>> f50446b;

    /* renamed from: c, reason: collision with root package name */
    @m80.l
    public final n f50447c;

    /* renamed from: d, reason: collision with root package name */
    @m80.l
    public final c1 f50448d;

    /* renamed from: e, reason: collision with root package name */
    @m80.k
    public final yz.c0 f50449e;

    public n(@m80.k a2 projection, @m80.l x00.a<? extends List<? extends k2>> aVar, @m80.l n nVar, @m80.l c1 c1Var) {
        g0.p(projection, "projection");
        this.f50445a = projection;
        this.f50446b = aVar;
        this.f50447c = nVar;
        this.f50448d = c1Var;
        this.f50449e = e0.b(LazyThreadSafetyMode.PUBLICATION, new j(this));
    }

    public static final List f(n nVar) {
        x00.a<? extends List<? extends k2>> aVar = nVar.f50446b;
        if (aVar != null) {
            return aVar.invoke();
        }
        return null;
    }

    public static final List p(n nVar, g gVar) {
        List<k2> c11 = nVar.c();
        ArrayList arrayList = new ArrayList(i0.d0(c11, 10));
        Iterator<T> it = c11.iterator();
        while (it.hasNext()) {
            arrayList.add(((k2) it.next()).N0(gVar));
        }
        return arrayList;
    }

    @Override // r20.b
    @m80.k
    public a2 b() {
        return this.f50445a;
    }

    public boolean equals(@m80.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!g0.g(n.class, obj != null ? obj.getClass() : null)) {
            return false;
        }
        g0.n(obj, "null cannot be cast to non-null type org.jetbrains.kotlin.types.checker.NewCapturedTypeConstructor");
        n nVar = (n) obj;
        n nVar2 = this.f50447c;
        if (nVar2 == null) {
            nVar2 = this;
        }
        n nVar3 = nVar.f50447c;
        if (nVar3 != null) {
            obj = nVar3;
        }
        return nVar2 == obj;
    }

    @Override // e30.u1
    @m80.k
    public List<c1> getParameters() {
        return h0.J();
    }

    public int hashCode() {
        n nVar = this.f50447c;
        return nVar != null ? nVar.hashCode() : super.hashCode();
    }

    @Override // e30.u1
    @m80.k
    /* renamed from: k, reason: merged with bridge method [inline-methods] */
    public List<k2> c() {
        List<k2> l11 = l();
        return l11 == null ? h0.J() : l11;
    }

    public final List<k2> l() {
        return (List) this.f50449e.getValue();
    }

    public final void m(@m80.k List<? extends k2> supertypes) {
        g0.p(supertypes, "supertypes");
        this.f50446b = new l(supertypes);
    }

    @Override // e30.u1
    @m80.k
    /* renamed from: o, reason: merged with bridge method [inline-methods] */
    public n d(@m80.k g kotlinTypeRefiner) {
        g0.p(kotlinTypeRefiner, "kotlinTypeRefiner");
        a2 d11 = b().d(kotlinTypeRefiner);
        g0.o(d11, "refine(...)");
        m mVar = this.f50446b != null ? new m(this, kotlinTypeRefiner) : null;
        n nVar = this.f50447c;
        if (nVar == null) {
            nVar = this;
        }
        return new n(d11, mVar, nVar, this.f50448d);
    }

    @Override // e30.u1
    @m80.k
    public n10.j q() {
        r0 type = b().getType();
        g0.o(type, "getType(...)");
        return j30.e.o(type);
    }

    @Override // e30.u1
    @m80.l
    public p10.d r() {
        return null;
    }

    @Override // e30.u1
    public boolean s() {
        return false;
    }

    @m80.k
    public String toString() {
        return "CapturedType(" + b() + ')';
    }

    public /* synthetic */ n(a2 a2Var, x00.a aVar, n nVar, c1 c1Var, int i11, kotlin.jvm.internal.v vVar) {
        this(a2Var, (i11 & 2) != 0 ? null : aVar, (i11 & 4) != 0 ? null : nVar, (i11 & 8) != 0 ? null : c1Var);
    }

    public /* synthetic */ n(a2 a2Var, List list, n nVar, int i11, kotlin.jvm.internal.v vVar) {
        this(a2Var, list, (i11 & 4) != 0 ? null : nVar);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public n(@m80.k a2 projection, @m80.k List<? extends k2> supertypes, @m80.l n nVar) {
        this(projection, new k(supertypes), nVar, null, 8, null);
        g0.p(projection, "projection");
        g0.p(supertypes, "supertypes");
    }

    public static final List e(List list) {
        return list;
    }

    public static final List n(List list) {
        return list;
    }
}
