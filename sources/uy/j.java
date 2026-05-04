package uy;

import io.ktor.server.routing.h0;
import io.ktor.server.routing.i0;
import io.ktor.server.routing.p1;
import ix.m0;
import ix.x0;
import ix.y0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nRouting.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Routing.kt\nio/ktor/server/websocket/WebSocketProtocolsSelector\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,239:1\n1557#2:240\n1628#2,3:241\n*S KotlinDebug\n*F\n+ 1 Routing.kt\nio/ktor/server/websocket/WebSocketProtocolsSelector\n*L\n228#1:240\n228#1:241,3\n*E\n"})
/* loaded from: classes8.dex */
public final class j extends h0 {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final String f92739a;

    public j(@m80.k String requiredProtocol) {
        g0.p(requiredProtocol, "requiredProtocol");
        this.f92739a = requiredProtocol;
    }

    @Override // io.ktor.server.routing.h0
    @m80.l
    public Object a(@m80.k p1 p1Var, int i11, @m80.k j00.c<? super i0> cVar) {
        String str = p1Var.c().f().a().get(y0.f63006a.y0());
        if (str == null) {
            p.a().trace("Skipping WebSocket plugin because no Sec-WebSocket-Protocol header provided.");
            return i0.f61619b.e();
        }
        List<m0> f11 = x0.f(str);
        ArrayList arrayList = new ArrayList(a00.i0.d0(f11, 10));
        Iterator<T> it = f11.iterator();
        while (it.hasNext()) {
            arrayList.add(((m0) it.next()).g());
        }
        if (arrayList.contains(this.f92739a)) {
            return i0.f61619b.a();
        }
        p.a().trace("Skipping WebSocket plugin because no Sec-WebSocket-Protocol header " + str + " is not matching " + this.f92739a + '.');
        return i0.f61619b.e();
    }

    @m80.k
    public final String b() {
        return this.f92739a;
    }
}
