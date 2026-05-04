package s10;

import a00.l1;
import a00.w1;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import p10.a0;
import s10.i0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@kotlin.jvm.internal.u0({"SMAP\nModuleDescriptorImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ModuleDescriptorImpl.kt\norg/jetbrains/kotlin/descriptors/impl/ModuleDescriptorImpl\n+ 2 coreLib.kt\norg/jetbrains/kotlin/utils/CoreLibKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,180:1\n19#2:181\n19#2:185\n19#2:186\n19#2:188\n774#3:182\n865#3,2:183\n1863#3,2:189\n1557#3:191\n1628#3,3:192\n1#4:187\n*S KotlinDebug\n*F\n+ 1 ModuleDescriptorImpl.kt\norg/jetbrains/kotlin/descriptors/impl/ModuleDescriptorImpl\n*L\n72#1:181\n75#1:185\n78#1:186\n91#1:188\n72#1:182\n72#1:183,2\n95#1:189,2\n101#1:191\n101#1:192,3\n*E\n"})
/* loaded from: classes8.dex */
public final class f0 extends m implements p10.a0 {

    /* renamed from: c, reason: collision with root package name */
    @m80.k
    public final d30.n f87153c;

    /* renamed from: d, reason: collision with root package name */
    @m80.k
    public final n10.j f87154d;

    /* renamed from: e, reason: collision with root package name */
    @m80.l
    public final o20.c f87155e;

    /* renamed from: f, reason: collision with root package name */
    @m80.l
    public final n20.f f87156f;

    /* renamed from: g, reason: collision with root package name */
    @m80.k
    public final Map<p10.z<?>, Object> f87157g;

    /* renamed from: h, reason: collision with root package name */
    @m80.k
    public final i0 f87158h;

    /* renamed from: i, reason: collision with root package name */
    @m80.l
    public b0 f87159i;

    /* renamed from: j, reason: collision with root package name */
    @m80.l
    public p10.h0 f87160j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f87161k;

    /* renamed from: l, reason: collision with root package name */
    @m80.k
    public final d30.g<n20.c, p10.n0> f87162l;

    /* renamed from: m, reason: collision with root package name */
    @m80.k
    public final yz.c0 f87163m;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @w00.k
    public f0(@m80.k n20.f moduleName, @m80.k d30.n storageManager, @m80.k n10.j builtIns, @m80.l o20.c cVar) {
        this(moduleName, storageManager, builtIns, cVar, null, null, 48, null);
        kotlin.jvm.internal.g0.p(moduleName, "moduleName");
        kotlin.jvm.internal.g0.p(storageManager, "storageManager");
        kotlin.jvm.internal.g0.p(builtIns, "builtIns");
    }

    private final boolean K0() {
        return this.f87160j != null;
    }

    public static final l M0(f0 f0Var) {
        b0 b0Var = f0Var.f87159i;
        if (b0Var == null) {
            throw new AssertionError("Dependencies of module " + f0Var.G0() + " were not set before querying module content");
        }
        List<f0> c11 = b0Var.c();
        f0Var.F0();
        c11.contains(f0Var);
        List<f0> list = c11;
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            ((f0) it.next()).K0();
        }
        ArrayList arrayList = new ArrayList(a00.i0.d0(list, 10));
        Iterator<T> it2 = list.iterator();
        while (it2.hasNext()) {
            p10.h0 h0Var = ((f0) it2.next()).f87160j;
            kotlin.jvm.internal.g0.m(h0Var);
            arrayList.add(h0Var);
        }
        return new l(arrayList, "CompositeProvider@ModuleDescriptor for " + f0Var.getName());
    }

    public static final p10.n0 N0(f0 f0Var, n20.c fqName) {
        kotlin.jvm.internal.g0.p(fqName, "fqName");
        return f0Var.f87158h.a(f0Var, fqName, f0Var.f87153c);
    }

    @Override // p10.a0
    @m80.l
    public <T> T A0(@m80.k p10.z<T> capability) {
        kotlin.jvm.internal.g0.p(capability, "capability");
        T t11 = (T) this.f87157g.get(capability);
        if (t11 == null) {
            return null;
        }
        return t11;
    }

    public void F0() {
        if (L0()) {
            return;
        }
        p10.v.a(this);
    }

    public final String G0() {
        String fVar = getName().toString();
        kotlin.jvm.internal.g0.o(fVar, "toString(...)");
        return fVar;
    }

    @m80.k
    public final p10.h0 H0() {
        F0();
        return I0();
    }

    public final l I0() {
        return (l) this.f87163m.getValue();
    }

    public final void J0(@m80.k p10.h0 providerForModuleContent) {
        kotlin.jvm.internal.g0.p(providerForModuleContent, "providerForModuleContent");
        K0();
        this.f87160j = providerForModuleContent;
    }

    public boolean L0() {
        return this.f87161k;
    }

    public final void O0(@m80.k List<f0> descriptors) {
        kotlin.jvm.internal.g0.p(descriptors, "descriptors");
        P0(descriptors, w1.k());
    }

    public final void P0(@m80.k List<f0> descriptors, @m80.k Set<f0> friends) {
        kotlin.jvm.internal.g0.p(descriptors, "descriptors");
        kotlin.jvm.internal.g0.p(friends, "friends");
        Q0(new c0(descriptors, friends, a00.h0.J(), w1.k()));
    }

    public final void Q0(@m80.k b0 dependencies) {
        kotlin.jvm.internal.g0.p(dependencies, "dependencies");
        this.f87159i = dependencies;
    }

    @Override // p10.a0
    @m80.k
    public List<p10.a0> R() {
        b0 b0Var = this.f87159i;
        if (b0Var != null) {
            return b0Var.a();
        }
        throw new AssertionError("Dependencies of module " + G0() + " were not set");
    }

    public final void R0(@m80.k f0... descriptors) {
        kotlin.jvm.internal.g0.p(descriptors, "descriptors");
        O0(a00.a0.dz(descriptors));
    }

    @Override // p10.a0
    public boolean X(@m80.k p10.a0 targetModule) {
        kotlin.jvm.internal.g0.p(targetModule, "targetModule");
        if (kotlin.jvm.internal.g0.g(this, targetModule)) {
            return true;
        }
        b0 b0Var = this.f87159i;
        kotlin.jvm.internal.g0.m(b0Var);
        return a00.r0.a2(b0Var.b(), targetModule) || R().contains(targetModule) || targetModule.R().contains(this);
    }

    @Override // p10.h
    @m80.l
    public p10.h b() {
        return a0.a.b(this);
    }

    @Override // p10.a0
    @m80.k
    public p10.n0 h0(@m80.k n20.c fqName) {
        kotlin.jvm.internal.g0.p(fqName, "fqName");
        F0();
        return this.f87162l.invoke(fqName);
    }

    @Override // p10.a0
    @m80.k
    public Collection<n20.c> m(@m80.k n20.c fqName, @m80.k x00.l<? super n20.f, Boolean> nameFilter) {
        kotlin.jvm.internal.g0.p(fqName, "fqName");
        kotlin.jvm.internal.g0.p(nameFilter, "nameFilter");
        F0();
        return H0().m(fqName, nameFilter);
    }

    @Override // p10.a0
    @m80.k
    public n10.j q() {
        return this.f87154d;
    }

    @Override // s10.m
    @m80.k
    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(super.toString());
        if (!L0()) {
            sb2.append(" !isValid");
        }
        sb2.append(" packageFragmentProvider: ");
        p10.h0 h0Var = this.f87160j;
        sb2.append(h0Var != null ? h0Var.getClass().getSimpleName() : null);
        String sb3 = sb2.toString();
        kotlin.jvm.internal.g0.o(sb3, "toString(...)");
        return sb3;
    }

    @Override // p10.h
    @m80.l
    public <R, D> R y(@m80.k p10.j<R, D> jVar, D d11) {
        return (R) a0.a.a(this, jVar, d11);
    }

    public /* synthetic */ f0(n20.f fVar, d30.n nVar, n10.j jVar, o20.c cVar, Map map, n20.f fVar2, int i11, kotlin.jvm.internal.v vVar) {
        this(fVar, nVar, jVar, (i11 & 8) != 0 ? null : cVar, (i11 & 16) != 0 ? l1.z() : map, (i11 & 32) != 0 ? null : fVar2);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @w00.k
    public f0(@m80.k n20.f moduleName, @m80.k d30.n storageManager, @m80.k n10.j builtIns, @m80.l o20.c cVar, @m80.k Map<p10.z<?>, ? extends Object> capabilities, @m80.l n20.f fVar) {
        super(q10.g.A0.b(), moduleName);
        kotlin.jvm.internal.g0.p(moduleName, "moduleName");
        kotlin.jvm.internal.g0.p(storageManager, "storageManager");
        kotlin.jvm.internal.g0.p(builtIns, "builtIns");
        kotlin.jvm.internal.g0.p(capabilities, "capabilities");
        this.f87153c = storageManager;
        this.f87154d = builtIns;
        this.f87155e = cVar;
        this.f87156f = fVar;
        if (moduleName.g()) {
            this.f87157g = capabilities;
            i0 i0Var = (i0) A0(i0.f87196a.a());
            this.f87158h = i0Var == null ? i0.b.f87199b : i0Var;
            this.f87161k = true;
            this.f87162l = storageManager.b(new d0(this));
            this.f87163m = yz.e0.c(new e0(this));
            return;
        }
        throw new IllegalArgumentException("Module name must be special: " + moduleName);
    }
}
