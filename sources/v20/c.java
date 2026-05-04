package v20;

import a00.r0;
import b20.j;
import c20.d0;
import f20.g;
import kotlin.jvm.internal.g0;
import kotlin.reflect.jvm.internal.impl.incremental.components.NoLookupLocation;
import kotlin.reflect.jvm.internal.impl.load.java.structure.LightClassOriginKind;
import m80.k;
import m80.l;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final j f92889a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final z10.j f92890b;

    public c(@k j packageFragmentProvider, @k z10.j javaResolverCache) {
        g0.p(packageFragmentProvider, "packageFragmentProvider");
        g0.p(javaResolverCache, "javaResolverCache");
        this.f92889a = packageFragmentProvider;
        this.f92890b = javaResolverCache;
    }

    @k
    public final j a() {
        return this.f92889a;
    }

    @l
    public final p10.b b(@k g javaClass) {
        g0.p(javaClass, "javaClass");
        n20.c d11 = javaClass.d();
        if (d11 != null && javaClass.B() == LightClassOriginKind.SOURCE) {
            return this.f92890b.d(d11);
        }
        g n11 = javaClass.n();
        if (n11 != null) {
            p10.b b11 = b(n11);
            x20.k I = b11 != null ? b11.I() : null;
            p10.d h11 = I != null ? I.h(javaClass.getName(), NoLookupLocation.FROM_JAVA_LOADER) : null;
            if (h11 instanceof p10.b) {
                return (p10.b) h11;
            }
            return null;
        }
        if (d11 == null) {
            return null;
        }
        j jVar = this.f92889a;
        n20.c e11 = d11.e();
        g0.o(e11, "parent(...)");
        d0 d0Var = (d0) r0.L2(jVar.b(e11));
        if (d0Var != null) {
            return d0Var.I0(javaClass);
        }
        return null;
    }
}
