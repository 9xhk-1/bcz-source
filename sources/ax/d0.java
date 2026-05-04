package ax;

import h10.t;
import java.util.List;
import kotlin.jvm.internal.o0;
import kotlin.jvm.internal.u0;
import org.slf4j.Logger;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nWebSockets.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WebSockets.kt\nio/ktor/client/plugins/websocket/WebSocketsKt\n+ 2 Attributes.kt\nio/ktor/util/AttributesKt\n+ 3 Type.kt\nio/ktor/util/reflect/TypeKt\n*L\n1#1,224:1\n18#2:225\n58#3,16:226\n*S KotlinDebug\n*F\n+ 1 WebSockets.kt\nio/ktor/client/plugins/websocket/WebSocketsKt\n*L\n20#1:225\n20#1:226,16\n*E\n"})
/* loaded from: classes8.dex */
public final class d0 {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public static final xy.a<List<io.ktor.websocket.z<?>>> f5520a;

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public static final Logger f5521b;

    static {
        h10.r rVar;
        h10.d d11 = o0.d(List.class);
        try {
            t.a aVar = h10.t.f57954c;
            rVar = o0.C(List.class, aVar.e(o0.C(io.ktor.websocket.z.class, aVar.c())));
        } catch (Throwable unused) {
            rVar = null;
        }
        f5520a = new xy.a<>("Websocket extensions", new gz.a(d11, rVar));
        f5521b = ez.a.a("io.ktor.client.plugins.websocket.WebSockets");
    }

    @m80.k
    public static final Logger b() {
        return f5521b;
    }
}
