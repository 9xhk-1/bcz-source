package s10;

import java.util.List;
import java.util.Set;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class c0 implements b0 {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final List<f0> f87144a;

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public final Set<f0> f87145b;

    /* renamed from: c, reason: collision with root package name */
    @m80.k
    public final List<f0> f87146c;

    /* renamed from: d, reason: collision with root package name */
    @m80.k
    public final Set<f0> f87147d;

    public c0(@m80.k List<f0> allDependencies, @m80.k Set<f0> modulesWhoseInternalsAreVisible, @m80.k List<f0> directExpectedByDependencies, @m80.k Set<f0> allExpectedByDependencies) {
        kotlin.jvm.internal.g0.p(allDependencies, "allDependencies");
        kotlin.jvm.internal.g0.p(modulesWhoseInternalsAreVisible, "modulesWhoseInternalsAreVisible");
        kotlin.jvm.internal.g0.p(directExpectedByDependencies, "directExpectedByDependencies");
        kotlin.jvm.internal.g0.p(allExpectedByDependencies, "allExpectedByDependencies");
        this.f87144a = allDependencies;
        this.f87145b = modulesWhoseInternalsAreVisible;
        this.f87146c = directExpectedByDependencies;
        this.f87147d = allExpectedByDependencies;
    }

    @Override // s10.b0
    @m80.k
    public List<f0> a() {
        return this.f87146c;
    }

    @Override // s10.b0
    @m80.k
    public Set<f0> b() {
        return this.f87145b;
    }

    @Override // s10.b0
    @m80.k
    public List<f0> c() {
        return this.f87144a;
    }
}
