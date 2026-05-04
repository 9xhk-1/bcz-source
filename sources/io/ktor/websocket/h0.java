package io.ktor.websocket;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.u0;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nWebSocketExtension.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WebSocketExtension.kt\nio/ktor/websocket/WebSocketExtensionsConfig\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,133:1\n1557#2:134\n1628#2,3:135\n1#3:138\n*S KotlinDebug\n*F\n+ 1 WebSocketExtension.kt\nio/ktor/websocket/WebSocketExtensionsConfig\n*L\n123#1:134\n123#1:135,3\n*E\n"})
/* loaded from: classes8.dex */
public final class h0 {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final List<x00.a<z<?>>> f62418a = new ArrayList();

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public final Boolean[] f62419b;

    public h0() {
        Boolean bool = Boolean.FALSE;
        this.f62419b = new Boolean[]{bool, bool, bool};
    }

    public static /* synthetic */ void f(h0 h0Var, a0 a0Var, x00.l lVar, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            lVar = new x00.l() { // from class: io.ktor.websocket.f0
                @Override // x00.l
                public final Object invoke(Object obj2) {
                    g2 g11;
                    g11 = h0.g(obj2);
                    return g11;
                }
            };
        }
        h0Var.e(a0Var, lVar);
    }

    public static final g2 g(Object obj) {
        kotlin.jvm.internal.g0.p(obj, "<this>");
        return g2.f100423a;
    }

    public static final z h(a0 a0Var, x00.l lVar) {
        return a0Var.a(lVar);
    }

    @m80.k
    public final List<z<?>> c() {
        List<x00.a<z<?>>> list = this.f62418a;
        ArrayList arrayList = new ArrayList(a00.i0.d0(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add((z) ((x00.a) it.next()).invoke());
        }
        return arrayList;
    }

    public final void d(a0<?, ?> a0Var) {
        boolean z11 = true;
        if ((!a0Var.c() || !this.f62419b[1].booleanValue()) && ((!a0Var.d() || !this.f62419b[2].booleanValue()) && (!a0Var.b() || !this.f62419b[3].booleanValue()))) {
            z11 = false;
        }
        if (z11) {
            throw new IllegalStateException("Failed to install extension. Please check configured extensions for conflicts.");
        }
    }

    public final <ConfigType> void e(@m80.k final a0<ConfigType, ?> extension, @m80.k final x00.l<? super ConfigType, g2> config) {
        kotlin.jvm.internal.g0.p(extension, "extension");
        kotlin.jvm.internal.g0.p(config, "config");
        d(extension);
        this.f62418a.add(new x00.a() { // from class: io.ktor.websocket.g0
            @Override // x00.a
            public final Object invoke() {
                z h11;
                h11 = h0.h(a0.this, config);
                return h11;
            }
        });
    }
}
