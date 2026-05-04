package io.ktor.server.routing;

import io.ktor.server.routing.i0;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@kotlin.jvm.internal.u0({"SMAP\nRouteSelector.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RouteSelector.kt\nio/ktor/server/routing/RootRouteSelector\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,664:1\n1557#2:665\n1628#2,3:666\n1#3:669\n*S KotlinDebug\n*F\n+ 1 RouteSelector.kt\nio/ktor/server/routing/RootRouteSelector\n*L\n196#1:665\n196#1:666,3\n*E\n"})
/* loaded from: classes8.dex */
public final class e0 extends h0 {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final List<String> f61611a;

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public final i0.c f61612b;

    /* JADX WARN: Multi-variable type inference failed */
    public e0() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    @Override // io.ktor.server.routing.h0
    @m80.l
    public Object a(@m80.k p1 p1Var, int i11, @m80.k j00.c<? super i0> cVar) {
        if (i11 != 0) {
            throw new IllegalStateException("Root selector should be evaluated first.");
        }
        if (this.f61611a.isEmpty()) {
            return i0.f61619b.a();
        }
        List<String> list = this.f61611a;
        List<String> f11 = p1Var.f();
        if (f11.size() < list.size()) {
            return i0.f61619b.f();
        }
        int size = list.size() + i11;
        while (i11 < size) {
            if (!kotlin.jvm.internal.g0.g(f11.get(i11), list.get(i11))) {
                return i0.f61619b.f();
            }
            i11++;
        }
        return this.f61612b;
    }

    @m80.k
    public String toString() {
        return a00.r0.r3(this.f61611a, "/", null, null, 0, null, null, 62, null);
    }

    public e0(@m80.k String rootPath) {
        kotlin.jvm.internal.g0.p(rootPath, "rootPath");
        List<j1> c11 = i1.f61647b.d(rootPath).c();
        ArrayList arrayList = new ArrayList(a00.i0.d0(c11, 10));
        for (j1 j1Var : c11) {
            if (j1Var.e() != RoutingPathSegmentKind.Constant) {
                throw new IllegalArgumentException("rootPath should be constant, no wildcards supported.");
            }
            arrayList.add(j1Var.f());
        }
        this.f61611a = arrayList;
        this.f61612b = new i0.c(1.0d, null, arrayList.size(), 2, null);
    }

    public /* synthetic */ e0(String str, int i11, kotlin.jvm.internal.v vVar) {
        this((i11 & 1) != 0 ? "" : str);
    }
}
