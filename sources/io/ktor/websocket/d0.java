package io.ktor.websocket;

import a00.r0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.u0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nWebSocketExtensionHeader.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WebSocketExtensionHeader.kt\nio/ktor/websocket/WebSocketExtensionHeaderKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,45:1\n1557#2:46\n1628#2,2:47\n1557#2:49\n1628#2,3:50\n1630#2:53\n*S KotlinDebug\n*F\n+ 1 WebSocketExtensionHeader.kt\nio/ktor/websocket/WebSocketExtensionHeaderKt\n*L\n39#1:46\n39#1:47,2\n42#1:49\n42#1:50,3\n39#1:53\n*E\n"})
/* loaded from: classes8.dex */
public final class d0 {
    @m80.k
    public static final List<c0> a(@m80.k String value) {
        kotlin.jvm.internal.g0.p(value, "value");
        List o52 = u30.k0.o5(value, new String[]{","}, false, 0, 6, null);
        ArrayList arrayList = new ArrayList(a00.i0.d0(o52, 10));
        Iterator it = o52.iterator();
        while (it.hasNext()) {
            List o53 = u30.k0.o5((String) it.next(), new String[]{com.alipay.sdk.m.u.i.f11097b}, false, 0, 6, null);
            String obj = u30.k0.b6((String) r0.G2(o53)).toString();
            List g22 = r0.g2(o53, 1);
            ArrayList arrayList2 = new ArrayList(a00.i0.d0(g22, 10));
            Iterator it2 = g22.iterator();
            while (it2.hasNext()) {
                arrayList2.add(u30.k0.b6((String) it2.next()).toString());
            }
            arrayList.add(new c0(obj, arrayList2));
        }
        return arrayList;
    }
}
