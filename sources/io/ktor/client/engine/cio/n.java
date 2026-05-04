package io.ktor.client.engine.cio;

import kotlin.jvm.internal.g0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class n {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final bz.b f60921a;

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public final z f60922b;

    public n(@m80.k bz.b requestTime, @m80.k z task) {
        g0.p(requestTime, "requestTime");
        g0.p(task, "task");
        this.f60921a = requestTime;
        this.f60922b = task;
    }

    public static /* synthetic */ n d(n nVar, bz.b bVar, z zVar, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            bVar = nVar.f60921a;
        }
        if ((i11 & 2) != 0) {
            zVar = nVar.f60922b;
        }
        return nVar.c(bVar, zVar);
    }

    @m80.k
    public final bz.b a() {
        return this.f60921a;
    }

    @m80.k
    public final z b() {
        return this.f60922b;
    }

    @m80.k
    public final n c(@m80.k bz.b requestTime, @m80.k z task) {
        g0.p(requestTime, "requestTime");
        g0.p(task, "task");
        return new n(requestTime, task);
    }

    @m80.k
    public final bz.b e() {
        return this.f60921a;
    }

    public boolean equals(@m80.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n)) {
            return false;
        }
        n nVar = (n) obj;
        return g0.g(this.f60921a, nVar.f60921a) && g0.g(this.f60922b, nVar.f60922b);
    }

    @m80.k
    public final z f() {
        return this.f60922b;
    }

    public int hashCode() {
        return (this.f60921a.hashCode() * 31) + this.f60922b.hashCode();
    }

    @m80.k
    public String toString() {
        return "ConnectionResponseTask(requestTime=" + this.f60921a + ", task=" + this.f60922b + ')';
    }
}
