package s10;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.PropertyReference1Impl;
import x20.k;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@kotlin.jvm.internal.u0({"SMAP\nLazyPackageViewDescriptorImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyPackageViewDescriptorImpl.kt\norg/jetbrains/kotlin/descriptors/impl/LazyPackageViewDescriptorImpl\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,71:1\n1557#2:72\n1628#2,3:73\n*S KotlinDebug\n*F\n+ 1 LazyPackageViewDescriptorImpl.kt\norg/jetbrains/kotlin/descriptors/impl/LazyPackageViewDescriptorImpl\n*L\n49#1:72\n49#1:73,3\n*E\n"})
/* loaded from: classes8.dex */
public class x extends m implements p10.n0 {

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ h10.n<Object>[] f87352h = {kotlin.jvm.internal.o0.u(new PropertyReference1Impl(kotlin.jvm.internal.o0.d(x.class), "fragments", "getFragments()Ljava/util/List;")), kotlin.jvm.internal.o0.u(new PropertyReference1Impl(kotlin.jvm.internal.o0.d(x.class), "empty", "getEmpty()Z"))};

    /* renamed from: c, reason: collision with root package name */
    @m80.k
    public final f0 f87353c;

    /* renamed from: d, reason: collision with root package name */
    @m80.k
    public final n20.c f87354d;

    /* renamed from: e, reason: collision with root package name */
    @m80.k
    public final d30.i f87355e;

    /* renamed from: f, reason: collision with root package name */
    @m80.k
    public final d30.i f87356f;

    /* renamed from: g, reason: collision with root package name */
    @m80.k
    public final x20.k f87357g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(@m80.k f0 module, @m80.k n20.c fqName, @m80.k d30.n storageManager) {
        super(q10.g.A0.b(), fqName.h());
        kotlin.jvm.internal.g0.p(module, "module");
        kotlin.jvm.internal.g0.p(fqName, "fqName");
        kotlin.jvm.internal.g0.p(storageManager, "storageManager");
        this.f87353c = module;
        this.f87354d = fqName;
        this.f87355e = storageManager.f(new u(this));
        this.f87356f = storageManager.f(new v(this));
        this.f87357g = new x20.i(storageManager, new w(this));
    }

    public static final boolean G0(x xVar) {
        return p10.l0.b(xVar.C0().H0(), xVar.d());
    }

    public static final List H0(x xVar) {
        return p10.l0.c(xVar.C0().H0(), xVar.d());
    }

    public static final x20.k L0(x xVar) {
        if (xVar.isEmpty()) {
            return k.c.f97119b;
        }
        List<p10.g0> N = xVar.N();
        ArrayList arrayList = new ArrayList(a00.i0.d0(N, 10));
        Iterator<T> it = N.iterator();
        while (it.hasNext()) {
            arrayList.add(((p10.g0) it.next()).r());
        }
        List J4 = a00.r0.J4(arrayList, new p0(xVar.C0(), xVar.d()));
        return x20.b.f97072d.a("package view scope for " + xVar.d() + " in " + xVar.C0().getName(), J4);
    }

    @Override // p10.h
    @m80.l
    /* renamed from: I0, reason: merged with bridge method [inline-methods] */
    public p10.n0 b() {
        if (d().d()) {
            return null;
        }
        f0 C0 = C0();
        n20.c e11 = d().e();
        kotlin.jvm.internal.g0.o(e11, "parent(...)");
        return C0.h0(e11);
    }

    public final boolean J0() {
        return ((Boolean) d30.m.a(this.f87356f, this, f87352h[1])).booleanValue();
    }

    @Override // p10.n0
    @m80.k
    /* renamed from: K0, reason: merged with bridge method [inline-methods] */
    public f0 C0() {
        return this.f87353c;
    }

    @Override // p10.n0
    @m80.k
    public List<p10.g0> N() {
        return (List) d30.m.a(this.f87355e, this, f87352h[0]);
    }

    @Override // p10.n0
    @m80.k
    public n20.c d() {
        return this.f87354d;
    }

    public boolean equals(@m80.l Object obj) {
        p10.n0 n0Var = obj instanceof p10.n0 ? (p10.n0) obj : null;
        return n0Var != null && kotlin.jvm.internal.g0.g(d(), n0Var.d()) && kotlin.jvm.internal.g0.g(C0(), n0Var.C0());
    }

    public int hashCode() {
        return (C0().hashCode() * 31) + d().hashCode();
    }

    @Override // p10.n0
    public boolean isEmpty() {
        return J0();
    }

    @Override // p10.n0
    @m80.k
    public x20.k r() {
        return this.f87357g;
    }

    @Override // p10.h
    public <R, D> R y(@m80.k p10.j<R, D> visitor, D d11) {
        kotlin.jvm.internal.g0.p(visitor, "visitor");
        return visitor.l(this, d11);
    }
}
