package io.ktor.server.routing;

import io.ktor.server.routing.i0;
import java.util.Iterator;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@kotlin.jvm.internal.u0({"SMAP\nRouteSelector.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RouteSelector.kt\nio/ktor/server/routing/ContentTypeHeaderRouteSelector\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,664:1\n295#2,2:665\n*S KotlinDebug\n*F\n+ 1 RouteSelector.kt\nio/ktor/server/routing/ContentTypeHeaderRouteSelector\n*L\n559#1:665,2\n*E\n"})
/* loaded from: classes8.dex */
public final class c extends h0 {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final ix.k f61591a;

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public final i0.b f61592b;

    public c(@m80.k ix.k contentType) {
        kotlin.jvm.internal.g0.p(contentType, "contentType");
        this.f61591a = contentType;
        this.f61592b = new i0.b(0.01d, ix.g1.f62797c.Y());
    }

    public static /* synthetic */ c d(c cVar, ix.k kVar, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            kVar = cVar.f61591a;
        }
        return cVar.c(kVar);
    }

    @Override // io.ktor.server.routing.h0
    @m80.l
    public Object a(@m80.k p1 p1Var, int i11, @m80.k j00.c<? super i0> cVar) {
        Object obj;
        Iterator<T> it = ix.x0.d(py.e.r(p1Var.c().f(), ix.y0.f63006a.C())).iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (ix.k.f62843f.b(((ix.m0) obj).g()).h(this.f61591a)) {
                break;
            }
        }
        ix.m0 m0Var = (ix.m0) obj;
        return m0Var == null ? this.f61592b : new i0.c(m0Var.f(), null, 0, 6, null);
    }

    @m80.k
    public final ix.k b() {
        return this.f61591a;
    }

    @m80.k
    public final c c(@m80.k ix.k contentType) {
        kotlin.jvm.internal.g0.p(contentType, "contentType");
        return new c(contentType);
    }

    @m80.k
    public final ix.k e() {
        return this.f61591a;
    }

    public boolean equals(@m80.l Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof c) && kotlin.jvm.internal.g0.g(this.f61591a, ((c) obj).f61591a);
    }

    public int hashCode() {
        return this.f61591a.hashCode();
    }

    @m80.k
    public String toString() {
        return "(contentType = " + this.f61591a + ')';
    }
}
