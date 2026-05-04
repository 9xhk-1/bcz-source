package io.ktor.server.routing;

import io.ktor.server.routing.i0;
import java.util.List;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class p extends h0 {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final String f61694a;

    public p(@m80.k String name) {
        kotlin.jvm.internal.g0.p(name, "name");
        this.f61694a = name;
    }

    public static /* synthetic */ p d(p pVar, String str, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = pVar.f61694a;
        }
        return pVar.c(str);
    }

    @Override // io.ktor.server.routing.h0
    @m80.l
    public Object a(@m80.k p1 p1Var, int i11, @m80.k j00.c<? super i0> cVar) {
        List<String> a11 = p1Var.c().getParameters().a(this.f61694a);
        return a11 != null ? new i0.c(1.0d, ix.t1.f(this.f61694a, a11), 0, 4, null) : i0.f61619b.e();
    }

    @m80.k
    public final String b() {
        return this.f61694a;
    }

    @m80.k
    public final p c(@m80.k String name) {
        kotlin.jvm.internal.g0.p(name, "name");
        return new p(name);
    }

    @m80.k
    public final String e() {
        return this.f61694a;
    }

    public boolean equals(@m80.l Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof p) && kotlin.jvm.internal.g0.g(this.f61694a, ((p) obj).f61694a);
    }

    public int hashCode() {
        return this.f61694a.hashCode();
    }

    @m80.k
    public String toString() {
        return '[' + this.f61694a + l50.b.f69930l;
    }
}
