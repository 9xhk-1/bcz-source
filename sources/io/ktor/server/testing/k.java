package io.ktor.server.testing;

import a00.k1;
import ix.l2;
import ix.w2;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@io.ktor.utils.io.c0
@kotlin.jvm.internal.u0({"SMAP\nTestApplication.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TestApplication.kt\nio/ktor/server/testing/ExternalServicesBuilder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 4 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n+ 5 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,399:1\n1#2:400\n13409#3,2:401\n462#4:403\n412#4:404\n1246#5,4:405\n*S KotlinDebug\n*F\n+ 1 TestApplication.kt\nio/ktor/server/testing/ExternalServicesBuilder\n*L\n133#1:401,2\n122#1:403\n122#1:404\n122#1:405,4\n*E\n"})
/* loaded from: classes8.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final e0 f61894a;

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public final Map<String, x00.a<TestApplication>> f61895b;

    /* renamed from: c, reason: collision with root package name */
    @m80.k
    public final yz.c0 f61896c;

    public k(@m80.k e0 testApplicationBuilder) {
        kotlin.jvm.internal.g0.p(testApplicationBuilder, "testApplicationBuilder");
        this.f61894a = testApplicationBuilder;
        this.f61895b = new LinkedHashMap();
        this.f61896c = yz.e0.c(new x00.a() { // from class: io.ktor.server.testing.j
            @Override // x00.a
            public final Object invoke() {
                Map d11;
                d11 = k.d(k.this);
                return d11;
            }
        });
    }

    public static final Map d(k kVar) {
        Map<String, x00.a<TestApplication>> map = kVar.f61895b;
        LinkedHashMap linkedHashMap = new LinkedHashMap(k1.j(map.size()));
        Iterator<T> it = map.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            linkedHashMap.put(entry.getKey(), (TestApplication) ((x00.a) entry.getValue()).invoke());
        }
        return linkedHashMap;
    }

    public static final TestApplication g(final k kVar, final x00.l lVar) {
        return q0.b(new x00.l() { // from class: io.ktor.server.testing.h
            @Override // x00.l
            public final Object invoke(Object obj) {
                g2 h11;
                h11 = k.h(k.this, lVar, (e0) obj);
                return h11;
            }
        });
    }

    public static final g2 h(k kVar, x00.l lVar, e0 TestApplication) {
        kotlin.jvm.internal.g0.p(TestApplication, "$this$TestApplication");
        TestApplication.y(kVar.f61894a.H());
        TestApplication.C().add(lVar);
        return g2.f100423a;
    }

    @m80.k
    public final Map<String, TestApplication> e() {
        return (Map) this.f61896c.getValue();
    }

    @io.ktor.utils.io.c0
    public final void f(@m80.k String[] hosts, @m80.k final x00.l<? super zx.a, g2> block) {
        kotlin.jvm.internal.g0.p(hosts, "hosts");
        kotlin.jvm.internal.g0.p(block, "block");
        if (hosts.length == 0) {
            throw new IllegalStateException("hosts can not be empty");
        }
        for (String str : hosts) {
            this.f61895b.put(w2.c(l2.f(str)), new x00.a() { // from class: io.ktor.server.testing.i
                @Override // x00.a
                public final Object invoke() {
                    TestApplication g11;
                    g11 = k.g(k.this, block);
                    return g11;
                }
            });
        }
    }
}
