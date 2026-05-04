package io.ktor.server.routing;

import com.bumptech.glide.load.engine.GlideException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@kotlin.jvm.internal.u0({"SMAP\nRoutingResolveTrace.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RoutingResolveTrace.kt\nio/ktor/server/routing/RoutingResolveTraceEntry\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,151:1\n1#2:152\n1863#3,2:153\n*S KotlinDebug\n*F\n+ 1 RoutingResolveTrace.kt\nio/ktor/server/routing/RoutingResolveTraceEntry\n*L\n38#1:153,2\n*E\n"})
/* loaded from: classes8.dex */
public class v1 {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final d1 f61753a;

    /* renamed from: b, reason: collision with root package name */
    public final int f61754b;

    /* renamed from: c, reason: collision with root package name */
    @m80.l
    public r1 f61755c;

    /* renamed from: d, reason: collision with root package name */
    @m80.l
    public List<v1> f61756d;

    public v1(@m80.k d1 route, int i11, @m80.l r1 r1Var) {
        kotlin.jvm.internal.g0.p(route, "route");
        this.f61753a = route;
        this.f61754b = i11;
        this.f61755c = r1Var;
    }

    public final void a(@m80.k v1 item) {
        kotlin.jvm.internal.g0.p(item, "item");
        List list = this.f61756d;
        if (list == null) {
            list = new ArrayList();
            this.f61756d = list;
        }
        list.add(item);
    }

    public void b(@m80.k StringBuilder builder, int i11) {
        kotlin.jvm.internal.g0.p(builder, "builder");
        builder.append(u30.f0.v2(GlideException.a.f28776d, i11) + this);
        kotlin.jvm.internal.g0.o(builder, "append(...)");
        builder.append('\n');
        kotlin.jvm.internal.g0.o(builder, "append(...)");
        List<v1> list = this.f61756d;
        if (list != null) {
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                ((v1) it.next()).b(builder, i11 + 1);
            }
        }
    }

    @m80.l
    public final r1 c() {
        return this.f61755c;
    }

    @m80.k
    public final d1 d() {
        return this.f61753a;
    }

    public final int e() {
        return this.f61754b;
    }

    public final void f(@m80.l r1 r1Var) {
        this.f61755c = r1Var;
    }

    @m80.k
    public String toString() {
        return this.f61753a + ", segment:" + this.f61754b + " -> " + this.f61755c;
    }

    public /* synthetic */ v1(d1 d1Var, int i11, r1 r1Var, int i12, kotlin.jvm.internal.v vVar) {
        this(d1Var, i11, (i12 & 4) != 0 ? null : r1Var);
    }
}
