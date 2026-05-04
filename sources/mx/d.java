package mx;

import io.ktor.http.CacheControl;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    @m80.l
    public final CacheControl f73778a;

    /* renamed from: b, reason: collision with root package name */
    @m80.l
    public final bz.b f73779b;

    /* JADX WARN: Multi-variable type inference failed */
    public d() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ d d(d dVar, CacheControl cacheControl, bz.b bVar, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            cacheControl = dVar.f73778a;
        }
        if ((i11 & 2) != 0) {
            bVar = dVar.f73779b;
        }
        return dVar.c(cacheControl, bVar);
    }

    @m80.l
    public final CacheControl a() {
        return this.f73778a;
    }

    @m80.l
    public final bz.b b() {
        return this.f73779b;
    }

    @m80.k
    public final d c(@m80.l CacheControl cacheControl, @m80.l bz.b bVar) {
        return new d(cacheControl, bVar);
    }

    @m80.l
    public final CacheControl e() {
        return this.f73778a;
    }

    public boolean equals(@m80.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return kotlin.jvm.internal.g0.g(this.f73778a, dVar.f73778a) && kotlin.jvm.internal.g0.g(this.f73779b, dVar.f73779b);
    }

    @m80.l
    public final bz.b f() {
        return this.f73779b;
    }

    public int hashCode() {
        CacheControl cacheControl = this.f73778a;
        int hashCode = (cacheControl == null ? 0 : cacheControl.hashCode()) * 31;
        bz.b bVar = this.f73779b;
        return hashCode + (bVar != null ? bVar.hashCode() : 0);
    }

    @m80.k
    public String toString() {
        return "CachingOptions(cacheControl=" + this.f73778a + ", expires=" + this.f73779b + ')';
    }

    public d(@m80.l CacheControl cacheControl, @m80.l bz.b bVar) {
        this.f73778a = cacheControl;
        this.f73779b = bVar;
    }

    public /* synthetic */ d(CacheControl cacheControl, bz.b bVar, int i11, kotlin.jvm.internal.v vVar) {
        this((i11 & 1) != 0 ? null : cacheControl, (i11 & 2) != 0 ? null : bVar);
    }
}
