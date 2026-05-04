package io.ktor.server.routing;

import io.ktor.server.routing.i0;
import java.util.Iterator;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@kotlin.jvm.internal.u0({"SMAP\nRouteSelector.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RouteSelector.kt\nio/ktor/server/routing/HttpHeaderRouteSelector\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,664:1\n295#2,2:665\n*S KotlinDebug\n*F\n+ 1 RouteSelector.kt\nio/ktor/server/routing/HttpHeaderRouteSelector\n*L\n533#1:665,2\n*E\n"})
/* loaded from: classes8.dex */
public final class g extends h0 {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final String f61615a;

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public final String f61616b;

    public g(@m80.k String name, @m80.k String value) {
        kotlin.jvm.internal.g0.p(name, "name");
        kotlin.jvm.internal.g0.p(value, "value");
        this.f61615a = name;
        this.f61616b = value;
    }

    public static /* synthetic */ g e(g gVar, String str, String str2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = gVar.f61615a;
        }
        if ((i11 & 2) != 0) {
            str2 = gVar.f61616b;
        }
        return gVar.d(str, str2);
    }

    @Override // io.ktor.server.routing.h0
    @m80.l
    public Object a(@m80.k p1 p1Var, int i11, @m80.k j00.c<? super i0> cVar) {
        Object obj;
        Iterator<T> it = ix.x0.e(p1Var.c().f().a().get(this.f61615a)).iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (u30.f0.c2(((ix.m0) obj).g(), this.f61616b, true)) {
                break;
            }
        }
        ix.m0 m0Var = (ix.m0) obj;
        return m0Var == null ? i0.f61619b.e() : new i0.c(m0Var.f(), null, 0, 6, null);
    }

    @m80.k
    public final String b() {
        return this.f61615a;
    }

    @m80.k
    public final String c() {
        return this.f61616b;
    }

    @m80.k
    public final g d(@m80.k String name, @m80.k String value) {
        kotlin.jvm.internal.g0.p(name, "name");
        kotlin.jvm.internal.g0.p(value, "value");
        return new g(name, value);
    }

    public boolean equals(@m80.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return kotlin.jvm.internal.g0.g(this.f61615a, gVar.f61615a) && kotlin.jvm.internal.g0.g(this.f61616b, gVar.f61616b);
    }

    @m80.k
    public final String f() {
        return this.f61615a;
    }

    @m80.k
    public final String g() {
        return this.f61616b;
    }

    public int hashCode() {
        return (this.f61615a.hashCode() * 31) + this.f61616b.hashCode();
    }

    @m80.k
    public String toString() {
        return "(header:" + this.f61615a + " = " + this.f61616b + ')';
    }
}
