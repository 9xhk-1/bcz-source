package io.ktor.server.routing;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class j1 {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final String f61650a;

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public final RoutingPathSegmentKind f61651b;

    public j1(@m80.k String value, @m80.k RoutingPathSegmentKind kind) {
        kotlin.jvm.internal.g0.p(value, "value");
        kotlin.jvm.internal.g0.p(kind, "kind");
        this.f61650a = value;
        this.f61651b = kind;
    }

    public static /* synthetic */ j1 d(j1 j1Var, String str, RoutingPathSegmentKind routingPathSegmentKind, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = j1Var.f61650a;
        }
        if ((i11 & 2) != 0) {
            routingPathSegmentKind = j1Var.f61651b;
        }
        return j1Var.c(str, routingPathSegmentKind);
    }

    @m80.k
    public final String a() {
        return this.f61650a;
    }

    @m80.k
    public final RoutingPathSegmentKind b() {
        return this.f61651b;
    }

    @m80.k
    public final j1 c(@m80.k String value, @m80.k RoutingPathSegmentKind kind) {
        kotlin.jvm.internal.g0.p(value, "value");
        kotlin.jvm.internal.g0.p(kind, "kind");
        return new j1(value, kind);
    }

    @m80.k
    public final RoutingPathSegmentKind e() {
        return this.f61651b;
    }

    public boolean equals(@m80.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j1)) {
            return false;
        }
        j1 j1Var = (j1) obj;
        return kotlin.jvm.internal.g0.g(this.f61650a, j1Var.f61650a) && this.f61651b == j1Var.f61651b;
    }

    @m80.k
    public final String f() {
        return this.f61650a;
    }

    public int hashCode() {
        return (this.f61650a.hashCode() * 31) + this.f61651b.hashCode();
    }

    @m80.k
    public String toString() {
        return "RoutingPathSegment(value=" + this.f61650a + ", kind=" + this.f61651b + ')';
    }
}
