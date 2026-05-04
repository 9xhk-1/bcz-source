package io.ktor.server.routing;

import io.ktor.server.routing.i0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class l extends h0 {

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public static final a f61657b = new a(null);

    /* renamed from: c, reason: collision with root package name */
    @m80.k
    public static final String f61658c = "$LocalPort";

    /* renamed from: a, reason: collision with root package name */
    public final int f61659a;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.v vVar) {
            this();
        }

        public a() {
        }
    }

    public l(int i11) {
        this.f61659a = i11;
    }

    public static /* synthetic */ l d(l lVar, int i11, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i11 = lVar.f61659a;
        }
        return lVar.c(i11);
    }

    @Override // io.ktor.server.routing.h0
    @m80.l
    public Object a(@m80.k p1 p1Var, int i11, @m80.k j00.c<? super i0> cVar) {
        int localPort = p1Var.c().f().h().getLocalPort();
        int i12 = this.f61659a;
        return localPort == i12 ? new i0.c(1.0d, ix.t1.e(f61658c, String.valueOf(i12)), 0, 4, null) : i0.f61619b.c();
    }

    public final int b() {
        return this.f61659a;
    }

    @m80.k
    public final l c(int i11) {
        return new l(i11);
    }

    public final int e() {
        return this.f61659a;
    }

    public boolean equals(@m80.l Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof l) && this.f61659a == ((l) obj).f61659a;
    }

    public int hashCode() {
        return Integer.hashCode(this.f61659a);
    }

    @m80.k
    public String toString() {
        return "LocalPortRouteSelector(port=" + this.f61659a + ')';
    }
}
