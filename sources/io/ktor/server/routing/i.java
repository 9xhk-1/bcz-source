package io.ktor.server.routing;

import io.ktor.http.BadContentTypeFormatException;
import io.ktor.server.plugins.BadRequestException;
import io.ktor.server.routing.i0;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@kotlin.jvm.internal.u0({"SMAP\nRouteSelector.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RouteSelector.kt\nio/ktor/server/routing/HttpMultiAcceptRouteSelector\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,664:1\n295#2:665\n1755#2,3:666\n296#2:669\n*S KotlinDebug\n*F\n+ 1 RouteSelector.kt\nio/ktor/server/routing/HttpMultiAcceptRouteSelector\n*L\n602#1:665\n602#1:666,3\n602#1:669\n*E\n"})
/* loaded from: classes8.dex */
public final class i extends h0 {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final List<ix.k> f61618a;

    public i(@m80.k List<ix.k> contentTypes) {
        kotlin.jvm.internal.g0.p(contentTypes, "contentTypes");
        this.f61618a = contentTypes;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ i d(i iVar, List list, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            list = iVar.f61618a;
        }
        return iVar.c(list);
    }

    @Override // io.ktor.server.routing.h0
    @m80.l
    public Object a(@m80.k p1 p1Var, int i11, @m80.k j00.c<? super i0> cVar) {
        Object obj;
        String str = p1Var.c().f().a().get(ix.y0.f63006a.d());
        try {
            List<ix.m0> d11 = ix.x0.d(str);
            if (d11.isEmpty()) {
                return i0.f61619b.g();
            }
            Iterator<T> it = d11.iterator();
            loop0: while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                ix.m0 m0Var = (ix.m0) obj;
                List<ix.k> list = this.f61618a;
                if (!(list instanceof Collection) || !list.isEmpty()) {
                    Iterator<T> it2 = list.iterator();
                    while (it2.hasNext()) {
                        if (((ix.k) it2.next()).i(m0Var.g())) {
                            break loop0;
                        }
                    }
                }
            }
            ix.m0 m0Var2 = (ix.m0) obj;
            return m0Var2 != null ? new i0.c(m0Var2.f(), null, 0, 6, null) : i0.f61619b.e();
        } catch (BadContentTypeFormatException e11) {
            throw new BadRequestException("Illegal Accept header format: " + str, e11);
        }
    }

    @m80.k
    public final List<ix.k> b() {
        return this.f61618a;
    }

    @m80.k
    public final i c(@m80.k List<ix.k> contentTypes) {
        kotlin.jvm.internal.g0.p(contentTypes, "contentTypes");
        return new i(contentTypes);
    }

    @m80.k
    public final List<ix.k> e() {
        return this.f61618a;
    }

    public boolean equals(@m80.l Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof i) && kotlin.jvm.internal.g0.g(this.f61618a, ((i) obj).f61618a);
    }

    public int hashCode() {
        return this.f61618a.hashCode();
    }

    @m80.k
    public String toString() {
        return "(contentTypes:" + this.f61618a + ')';
    }
}
