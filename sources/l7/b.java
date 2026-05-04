package l7;

import java.util.List;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final List<String> f70540a;

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public final h10.d<?> f70541b;

    /* renamed from: c, reason: collision with root package name */
    @m80.k
    public final String f70542c;

    public b(@m80.k List<String> domains, @m80.k h10.d<?> service, @m80.k String path) {
        kotlin.jvm.internal.g0.p(domains, "domains");
        kotlin.jvm.internal.g0.p(service, "service");
        kotlin.jvm.internal.g0.p(path, "path");
        this.f70540a = domains;
        this.f70541b = service;
        this.f70542c = path;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ b e(b bVar, List list, h10.d dVar, String str, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            list = bVar.f70540a;
        }
        if ((i11 & 2) != 0) {
            dVar = bVar.f70541b;
        }
        if ((i11 & 4) != 0) {
            str = bVar.f70542c;
        }
        return bVar.d(list, dVar, str);
    }

    @m80.k
    public final List<String> a() {
        return this.f70540a;
    }

    @m80.k
    public final h10.d<?> b() {
        return this.f70541b;
    }

    @m80.k
    public final String c() {
        return this.f70542c;
    }

    @m80.k
    public final b d(@m80.k List<String> domains, @m80.k h10.d<?> service, @m80.k String path) {
        kotlin.jvm.internal.g0.p(domains, "domains");
        kotlin.jvm.internal.g0.p(service, "service");
        kotlin.jvm.internal.g0.p(path, "path");
        return new b(domains, service, path);
    }

    public boolean equals(@m80.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return kotlin.jvm.internal.g0.g(this.f70540a, bVar.f70540a) && kotlin.jvm.internal.g0.g(this.f70541b, bVar.f70541b) && kotlin.jvm.internal.g0.g(this.f70542c, bVar.f70542c);
    }

    @m80.k
    public final List<String> f() {
        return this.f70540a;
    }

    @m80.k
    public final String g() {
        return this.f70542c;
    }

    @m80.k
    public final h10.d<?> h() {
        return this.f70541b;
    }

    public int hashCode() {
        return (((this.f70540a.hashCode() * 31) + this.f70541b.hashCode()) * 31) + this.f70542c.hashCode();
    }

    @m80.k
    public String toString() {
        return "DomainData(domains=" + this.f70540a + ", service=" + this.f70541b + ", path=" + this.f70542c + ')';
    }
}
