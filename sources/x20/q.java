package x20;

import a00.h0;
import a00.r0;
import java.util.Collection;
import java.util.List;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.o0;
import kotlin.jvm.internal.u0;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassKind;
import p10.q0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nStaticScopeForKotlinEnum.kt\nKotlin\n*S Kotlin\n*F\n+ 1 StaticScopeForKotlinEnum.kt\norg/jetbrains/kotlin/resolve/scopes/StaticScopeForKotlinEnum\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,68:1\n1#2:69\n865#3,2:70\n865#3,2:72\n*S KotlinDebug\n*F\n+ 1 StaticScopeForKotlinEnum.kt\norg/jetbrains/kotlin/resolve/scopes/StaticScopeForKotlinEnum\n*L\n59#1:70,2\n62#1:72,2\n*E\n"})
/* loaded from: classes8.dex */
public final class q extends l {

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ h10.n<Object>[] f97122f = {o0.u(new PropertyReference1Impl(o0.d(q.class), "functions", "getFunctions()Ljava/util/List;")), o0.u(new PropertyReference1Impl(o0.d(q.class), "properties", "getProperties()Ljava/util/List;"))};

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public final p10.b f97123b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f97124c;

    /* renamed from: d, reason: collision with root package name */
    @m80.k
    public final d30.i f97125d;

    /* renamed from: e, reason: collision with root package name */
    @m80.k
    public final d30.i f97126e;

    public q(@m80.k d30.n storageManager, @m80.k p10.b containingClass, boolean z11) {
        g0.p(storageManager, "storageManager");
        g0.p(containingClass, "containingClass");
        this.f97123b = containingClass;
        this.f97124c = z11;
        containingClass.getKind();
        ClassKind classKind = ClassKind.ENUM_CLASS;
        this.f97125d = storageManager.f(new o(this));
        this.f97126e = storageManager.f(new p(this));
    }

    public static final List k(q qVar) {
        return h0.Q(q20.g.g(qVar.f97123b), q20.g.h(qVar.f97123b));
    }

    public static final List q(q qVar) {
        return qVar.f97124c ? h0.R(q20.g.f(qVar.f97123b)) : h0.J();
    }

    @Override // x20.l, x20.k
    @m80.k
    public Collection<q0> c(@m80.k n20.f name, @m80.k x10.b location) {
        g0.p(name, "name");
        g0.p(location, "location");
        List<q0> p11 = p();
        o30.k kVar = new o30.k();
        for (Object obj : p11) {
            if (g0.g(((q0) obj).getName(), name)) {
                kVar.add(obj);
            }
        }
        return kVar;
    }

    @Override // x20.l, x20.n
    public /* bridge */ /* synthetic */ p10.d h(n20.f fVar, x10.b bVar) {
        return (p10.d) l(fVar, bVar);
    }

    @m80.l
    public Void l(@m80.k n20.f name, @m80.k x10.b location) {
        g0.p(name, "name");
        g0.p(location, "location");
        return null;
    }

    @Override // x20.l, x20.n
    @m80.k
    /* renamed from: m, reason: merged with bridge method [inline-methods] */
    public List<CallableMemberDescriptor> f(@m80.k d kindFilter, @m80.k x00.l<? super n20.f, Boolean> nameFilter) {
        g0.p(kindFilter, "kindFilter");
        g0.p(nameFilter, "nameFilter");
        return r0.I4(o(), p());
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // x20.l, x20.k, x20.n
    @m80.k
    /* renamed from: n, reason: merged with bridge method [inline-methods] */
    public o30.k<kotlin.reflect.jvm.internal.impl.descriptors.g> a(@m80.k n20.f name, @m80.k x10.b location) {
        g0.p(name, "name");
        g0.p(location, "location");
        List<kotlin.reflect.jvm.internal.impl.descriptors.g> o11 = o();
        o30.k<kotlin.reflect.jvm.internal.impl.descriptors.g> kVar = new o30.k<>();
        for (Object obj : o11) {
            if (g0.g(((kotlin.reflect.jvm.internal.impl.descriptors.g) obj).getName(), name)) {
                kVar.add(obj);
            }
        }
        return kVar;
    }

    public final List<kotlin.reflect.jvm.internal.impl.descriptors.g> o() {
        return (List) d30.m.a(this.f97125d, this, f97122f[0]);
    }

    public final List<q0> p() {
        return (List) d30.m.a(this.f97126e, this, f97122f[1]);
    }
}
