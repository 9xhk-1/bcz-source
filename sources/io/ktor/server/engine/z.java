package io.ktor.server.engine;

import org.apache.http.HttpVersion;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class z {

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public static final a f61475b = new a(null);

    /* renamed from: c, reason: collision with root package name */
    @m80.k
    public static final z f61476c = new z(HttpVersion.HTTP);

    /* renamed from: d, reason: collision with root package name */
    @m80.k
    public static final z f61477d = new z("HTTPS");

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final String f61478a;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.v vVar) {
            this();
        }

        @m80.k
        public final z a() {
            return z.f61476c;
        }

        @m80.k
        public final z b() {
            return z.f61477d;
        }

        public a() {
        }
    }

    public z(@m80.k String name) {
        kotlin.jvm.internal.g0.p(name, "name");
        this.f61478a = name;
    }

    public static /* synthetic */ z e(z zVar, String str, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = zVar.f61478a;
        }
        return zVar.d(str);
    }

    @m80.k
    public final String c() {
        return this.f61478a;
    }

    @m80.k
    public final z d(@m80.k String name) {
        kotlin.jvm.internal.g0.p(name, "name");
        return new z(name);
    }

    public boolean equals(@m80.l Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof z) && kotlin.jvm.internal.g0.g(this.f61478a, ((z) obj).f61478a);
    }

    @m80.k
    public final String f() {
        return this.f61478a;
    }

    public int hashCode() {
        return this.f61478a.hashCode();
    }

    @m80.k
    public String toString() {
        return "ConnectorType(name=" + this.f61478a + ')';
    }
}
