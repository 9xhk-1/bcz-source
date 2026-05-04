package p10;

import a00.v1;
import a00.w1;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassKind;
import kotlin.reflect.jvm.internal.impl.descriptors.Modality;
import kotlin.reflect.jvm.internal.impl.types.Variance;
import x20.k;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class f0 {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final d30.n f78560a;

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public final a0 f78561b;

    /* renamed from: c, reason: collision with root package name */
    @m80.k
    public final d30.g<n20.c, g0> f78562c;

    /* renamed from: d, reason: collision with root package name */
    @m80.k
    public final d30.g<a, p10.b> f78563d;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        @m80.k
        public final n20.b f78564a;

        /* renamed from: b, reason: collision with root package name */
        @m80.k
        public final List<Integer> f78565b;

        public a(@m80.k n20.b classId, @m80.k List<Integer> typeParametersCount) {
            kotlin.jvm.internal.g0.p(classId, "classId");
            kotlin.jvm.internal.g0.p(typeParametersCount, "typeParametersCount");
            this.f78564a = classId;
            this.f78565b = typeParametersCount;
        }

        @m80.k
        public final n20.b a() {
            return this.f78564a;
        }

        @m80.k
        public final List<Integer> b() {
            return this.f78565b;
        }

        public boolean equals(@m80.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return kotlin.jvm.internal.g0.g(this.f78564a, aVar.f78564a) && kotlin.jvm.internal.g0.g(this.f78565b, aVar.f78565b);
        }

        public int hashCode() {
            return (this.f78564a.hashCode() * 31) + this.f78565b.hashCode();
        }

        @m80.k
        public String toString() {
            return "ClassRequest(classId=" + this.f78564a + ", typeParametersCount=" + this.f78565b + ')';
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @kotlin.jvm.internal.u0({"SMAP\nNotFoundClasses.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NotFoundClasses.kt\norg/jetbrains/kotlin/descriptors/NotFoundClasses$MockClassDescriptor\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,100:1\n1557#2:101\n1628#2,3:102\n*S KotlinDebug\n*F\n+ 1 NotFoundClasses.kt\norg/jetbrains/kotlin/descriptors/NotFoundClasses$MockClassDescriptor\n*L\n55#1:101\n55#1:102,3\n*E\n"})
    public static final class b extends s10.j {

        /* renamed from: j, reason: collision with root package name */
        public final boolean f78566j;

        /* renamed from: k, reason: collision with root package name */
        @m80.k
        public final List<c1> f78567k;

        /* renamed from: l, reason: collision with root package name */
        @m80.k
        public final e30.t f78568l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(@m80.k d30.n storageManager, @m80.k h container, @m80.k n20.f name, boolean z11, int i11) {
            super(storageManager, container, name, x0.f78622a, false);
            kotlin.jvm.internal.g0.p(storageManager, "storageManager");
            kotlin.jvm.internal.g0.p(container, "container");
            kotlin.jvm.internal.g0.p(name, "name");
            this.f78566j = z11;
            g10.l W1 = g10.u.W1(0, i11);
            ArrayList arrayList = new ArrayList(a00.i0.d0(W1, 10));
            Iterator<Integer> it = W1.iterator();
            while (it.hasNext()) {
                int nextInt = ((a00.d1) it).nextInt();
                q10.g b11 = q10.g.A0.b();
                Variance variance = Variance.INVARIANT;
                StringBuilder sb2 = new StringBuilder();
                sb2.append('T');
                sb2.append(nextInt);
                arrayList.add(s10.t0.M0(this, b11, false, variance, n20.f.f(sb2.toString()), nextInt, storageManager));
            }
            this.f78567k = arrayList;
            this.f78568l = new e30.t(this, g1.g(this), v1.f(u20.e.s(this).q().i()), storageManager);
        }

        @Override // p10.b
        @m80.l
        public kotlin.reflect.jvm.internal.impl.descriptors.b B() {
            return null;
        }

        @Override // p10.b
        @m80.k
        /* renamed from: F0, reason: merged with bridge method [inline-methods] */
        public k.c r0() {
            return k.c.f97119b;
        }

        @Override // p10.d
        @m80.k
        /* renamed from: G0, reason: merged with bridge method [inline-methods] */
        public e30.t o() {
            return this.f78568l;
        }

        @Override // s10.z
        @m80.k
        /* renamed from: H0, reason: merged with bridge method [inline-methods] */
        public k.c V(@m80.k f30.g kotlinTypeRefiner) {
            kotlin.jvm.internal.g0.p(kotlinTypeRefiner, "kotlinTypeRefiner");
            return k.c.f97119b;
        }

        @Override // p10.b
        @m80.k
        public Collection<kotlin.reflect.jvm.internal.impl.descriptors.b> f() {
            return w1.k();
        }

        @Override // q10.a
        @m80.k
        public q10.g getAnnotations() {
            return q10.g.A0.b();
        }

        @Override // p10.b
        @m80.k
        public ClassKind getKind() {
            return ClassKind.CLASS;
        }

        @Override // p10.b, p10.x, p10.l
        @m80.k
        public p getVisibility() {
            p PUBLIC = o.f78590e;
            kotlin.jvm.internal.g0.o(PUBLIC, "PUBLIC");
            return PUBLIC;
        }

        @Override // p10.e
        public boolean i() {
            return this.f78566j;
        }

        @Override // p10.b
        @m80.l
        public h1<e30.c1> i0() {
            return null;
        }

        @Override // s10.j, p10.x
        public boolean isExternal() {
            return false;
        }

        @Override // p10.b
        public boolean isInline() {
            return false;
        }

        @Override // p10.b, p10.x
        @m80.k
        public Modality k() {
            return Modality.FINAL;
        }

        @Override // p10.x
        public boolean k0() {
            return false;
        }

        @Override // p10.b
        public boolean m0() {
            return false;
        }

        @Override // p10.b
        @m80.k
        public Collection<p10.b> p() {
            return a00.h0.J();
        }

        @Override // p10.x
        public boolean q0() {
            return false;
        }

        @Override // p10.b
        @m80.l
        public p10.b s0() {
            return null;
        }

        @Override // p10.b, p10.e
        @m80.k
        public List<c1> t() {
            return this.f78567k;
        }

        @m80.k
        public String toString() {
            return "class " + getName() + " (not found)";
        }

        @Override // p10.b
        public boolean u() {
            return false;
        }

        @Override // p10.b
        public boolean v() {
            return false;
        }

        @Override // p10.b
        public boolean w() {
            return false;
        }
    }

    public f0(@m80.k d30.n storageManager, @m80.k a0 module) {
        kotlin.jvm.internal.g0.p(storageManager, "storageManager");
        kotlin.jvm.internal.g0.p(module, "module");
        this.f78560a = storageManager;
        this.f78561b = module;
        this.f78562c = storageManager.b(new d0(this));
        this.f78563d = storageManager.b(new e0(this));
    }

    public static final p10.b c(f0 f0Var, a aVar) {
        g0 invoke;
        kotlin.jvm.internal.g0.p(aVar, "<destruct>");
        n20.b a11 = aVar.a();
        List<Integer> b11 = aVar.b();
        if (a11.i()) {
            throw new UnsupportedOperationException("Unresolved local class: " + a11);
        }
        n20.b e11 = a11.e();
        if (e11 == null || (invoke = f0Var.d(e11, a00.r0.g2(b11, 1))) == null) {
            invoke = f0Var.f78562c.invoke(a11.f());
        }
        h hVar = invoke;
        boolean j11 = a11.j();
        d30.n nVar = f0Var.f78560a;
        n20.f h11 = a11.h();
        Integer num = (Integer) a00.r0.L2(b11);
        return new b(nVar, hVar, h11, j11, num != null ? num.intValue() : 0);
    }

    public static final g0 e(f0 f0Var, n20.c fqName) {
        kotlin.jvm.internal.g0.p(fqName, "fqName");
        return new s10.p(f0Var.f78561b, fqName);
    }

    @m80.k
    public final p10.b d(@m80.k n20.b classId, @m80.k List<Integer> typeParametersCount) {
        kotlin.jvm.internal.g0.p(classId, "classId");
        kotlin.jvm.internal.g0.p(typeParametersCount, "typeParametersCount");
        return this.f78563d.invoke(new a(classId, typeParametersCount));
    }
}
