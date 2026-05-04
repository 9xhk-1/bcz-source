package e30;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@kotlin.jvm.internal.u0({"SMAP\nIntersectionTypeConstructor.kt\nKotlin\n*S Kotlin\n*F\n+ 1 IntersectionTypeConstructor.kt\norg/jetbrains/kotlin/types/IntersectionTypeConstructor\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 IntersectionTypeConstructor.kt\norg/jetbrains/kotlin/types/IntersectionTypeConstructorKt\n+ 5 IntersectionTypeConstructor.kt\norg/jetbrains/kotlin/types/IntersectionTypeConstructorKt$transformComponents$1\n*L\n1#1,120:1\n1#2:121\n1053#3:122\n1557#3:129\n1628#3,2:130\n1630#3:139\n98#4,6:123\n104#4:132\n105#4,5:134\n112#4,7:140\n99#5:133\n*S KotlinDebug\n*F\n+ 1 IntersectionTypeConstructor.kt\norg/jetbrains/kotlin/types/IntersectionTypeConstructor\n*L\n66#1:122\n89#1:129\n89#1:130,2\n89#1:139\n89#1:123,6\n89#1:132\n89#1:134,5\n89#1:140,7\n89#1:133\n*E\n"})
/* loaded from: classes8.dex */
public final class q0 implements u1, i30.f {

    /* renamed from: a, reason: collision with root package name */
    @m80.l
    public r0 f48646a;

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public final LinkedHashSet<r0> f48647b;

    /* renamed from: c, reason: collision with root package name */
    public final int f48648c;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @kotlin.jvm.internal.u0({"SMAP\nComparisons.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Comparisons.kt\nkotlin/comparisons/ComparisonsKt__ComparisonsKt$compareBy$2\n+ 2 IntersectionTypeConstructor.kt\norg/jetbrains/kotlin/types/IntersectionTypeConstructor\n*L\n1#1,102:1\n66#2:103\n*E\n"})
    public static final class a<T> implements Comparator {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ x00.l f48649a;

        public a(x00.l lVar) {
            this.f48649a = lVar;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t11, T t12) {
            r0 r0Var = (r0) t11;
            x00.l lVar = this.f48649a;
            kotlin.jvm.internal.g0.m(r0Var);
            String obj = lVar.invoke(r0Var).toString();
            r0 r0Var2 = (r0) t12;
            x00.l lVar2 = this.f48649a;
            kotlin.jvm.internal.g0.m(r0Var2);
            return e00.g.l(obj, lVar2.invoke(r0Var2).toString());
        }
    }

    public q0(@m80.k Collection<? extends r0> typesToIntersect) {
        kotlin.jvm.internal.g0.p(typesToIntersect, "typesToIntersect");
        typesToIntersect.isEmpty();
        LinkedHashSet<r0> linkedHashSet = new LinkedHashSet<>(typesToIntersect);
        this.f48647b = linkedHashSet;
        this.f48648c = linkedHashSet.hashCode();
    }

    public static final c1 j(q0 q0Var, f30.g kotlinTypeRefiner) {
        kotlin.jvm.internal.g0.p(kotlinTypeRefiner, "kotlinTypeRefiner");
        return q0Var.d(kotlinTypeRefiner).i();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ String m(q0 q0Var, x00.l lVar, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            lVar = o0.f48643a;
        }
        return q0Var.l(lVar);
    }

    public static final String n(r0 it) {
        kotlin.jvm.internal.g0.p(it, "it");
        return it.toString();
    }

    public static final CharSequence o(x00.l lVar, r0 r0Var) {
        kotlin.jvm.internal.g0.m(r0Var);
        return lVar.invoke(r0Var).toString();
    }

    @Override // e30.u1
    @m80.k
    public Collection<r0> c() {
        return this.f48647b;
    }

    public boolean equals(@m80.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof q0) {
            return kotlin.jvm.internal.g0.g(this.f48647b, ((q0) obj).f48647b);
        }
        return false;
    }

    @Override // e30.u1
    @m80.k
    public List<p10.c1> getParameters() {
        return a00.h0.J();
    }

    @m80.k
    public final x20.k h() {
        return x20.x.f97137d.a("member scope for intersection type", this.f48647b);
    }

    public int hashCode() {
        return this.f48648c;
    }

    @m80.k
    public final c1 i() {
        return u0.p(r1.f48652b.j(), this, a00.h0.J(), false, h(), new p0(this));
    }

    @m80.l
    public final r0 k() {
        return this.f48646a;
    }

    @m80.k
    public final String l(@m80.k x00.l<? super r0, ? extends Object> getProperTypeRelatedToStringify) {
        kotlin.jvm.internal.g0.p(getProperTypeRelatedToStringify, "getProperTypeRelatedToStringify");
        return a00.r0.r3(a00.r0.z5(this.f48647b, new a(getProperTypeRelatedToStringify)), " & ", "{", com.alipay.sdk.m.u.i.f11099d, 0, null, new n0(getProperTypeRelatedToStringify), 24, null);
    }

    @Override // e30.u1
    @m80.k
    /* renamed from: p, reason: merged with bridge method [inline-methods] */
    public q0 d(@m80.k f30.g kotlinTypeRefiner) {
        kotlin.jvm.internal.g0.p(kotlinTypeRefiner, "kotlinTypeRefiner");
        Collection<r0> c11 = c();
        ArrayList arrayList = new ArrayList(a00.i0.d0(c11, 10));
        Iterator<T> it = c11.iterator();
        boolean z11 = false;
        while (it.hasNext()) {
            arrayList.add(((r0) it.next()).S0(kotlinTypeRefiner));
            z11 = true;
        }
        q0 q0Var = null;
        if (z11) {
            r0 k11 = k();
            q0Var = new q0(arrayList).t(k11 != null ? k11.S0(kotlinTypeRefiner) : null);
        }
        return q0Var == null ? this : q0Var;
    }

    @Override // e30.u1
    @m80.k
    public n10.j q() {
        n10.j q11 = this.f48647b.iterator().next().I0().q();
        kotlin.jvm.internal.g0.o(q11, "getBuiltIns(...)");
        return q11;
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
    public final q0 t(@m80.l r0 r0Var) {
        return new q0(this.f48647b, r0Var);
    }

    @m80.k
    public String toString() {
        return m(this, null, 1, null);
    }

    public q0(Collection<? extends r0> collection, r0 r0Var) {
        this(collection);
        this.f48646a = r0Var;
    }
}
