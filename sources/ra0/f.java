package ra0;

import kotlin.jvm.internal.g0;
import m80.k;
import m80.l;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@va0.b
/* loaded from: classes9.dex */
public final class f<R> {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final va0.c f83894a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final ta0.b<R> f83895b;

    public f(@k va0.c module, @k ta0.b<R> factory) {
        g0.p(module, "module");
        g0.p(factory, "factory");
        this.f83894a = module;
        this.f83895b = factory;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ f d(f fVar, va0.c cVar, ta0.b bVar, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            cVar = fVar.f83894a;
        }
        if ((i11 & 2) != 0) {
            bVar = fVar.f83895b;
        }
        return fVar.c(cVar, bVar);
    }

    @k
    public final va0.c a() {
        return this.f83894a;
    }

    @k
    public final ta0.b<R> b() {
        return this.f83895b;
    }

    @k
    public final f<R> c(@k va0.c module, @k ta0.b<R> factory) {
        g0.p(module, "module");
        g0.p(factory, "factory");
        return new f<>(module, factory);
    }

    @k
    public final ta0.b<R> e() {
        return this.f83895b;
    }

    public boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return g0.g(this.f83894a, fVar.f83894a) && g0.g(this.f83895b, fVar.f83895b);
    }

    @k
    public final va0.c f() {
        return this.f83894a;
    }

    public int hashCode() {
        return (this.f83894a.hashCode() * 31) + this.f83895b.hashCode();
    }

    @k
    public String toString() {
        return "KoinDefinition(module=" + this.f83894a + ", factory=" + this.f83895b + ')';
    }
}
