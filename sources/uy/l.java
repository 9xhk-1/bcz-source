package uy;

import androidx.exifinterface.media.ExifInterface;
import io.ktor.serialization.ContentConverterKt;
import io.ktor.serialization.WebsocketConverterNotFoundException;
import io.ktor.websocket.j0;
import kotlin.jvm.internal.d0;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.o0;
import kotlin.jvm.internal.u0;
import yz.g2;
import zx.q;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nWebSocketServerSession.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WebSocketServerSession.kt\nio/ktor/server/websocket/WebSocketServerSessionKt\n+ 2 Type.kt\nio/ktor/util/reflect/TypeKt\n*L\n1#1,115:1\n58#2,16:116\n58#2,16:132\n*S KotlinDebug\n*F\n+ 1 WebSocketServerSession.kt\nio/ktor/server/websocket/WebSocketServerSessionKt\n*L\n73#1:116,16\n98#1:132,16\n*E\n"})
/* loaded from: classes8.dex */
public final class l {
    @m80.k
    public static final zx.a a(@m80.k k kVar) {
        g0.p(kVar, "<this>");
        return kVar.c().w0();
    }

    @m80.l
    public static final io.ktor.serialization.d b(@m80.k k kVar) {
        g0.p(kVar, "<this>");
        return ((o) q.r(a(kVar), o.f92753h)).e();
    }

    @m80.l
    public static final <T> Object c(@m80.k k kVar, @m80.k gz.a aVar, @m80.k j00.c<? super T> cVar) {
        io.ktor.serialization.d b11 = b(kVar);
        if (b11 == null) {
            throw new WebsocketConverterNotFoundException("No converter was found for websocket", null, 2, null);
        }
        Object a11 = sz.a.a(kVar, aVar, b11, ContentConverterKt.c(kVar.c().f().a(), null, 1, null), cVar);
        kotlin.coroutines.intrinsics.b.l();
        return a11;
    }

    public static final /* synthetic */ <T> Object d(k kVar, j00.c<? super T> cVar) {
        g0.y(4, ExifInterface.GPS_DIRECTION_TRUE);
        h10.d d11 = o0.d(Object.class);
        try {
            g0.y(6, ExifInterface.GPS_DIRECTION_TRUE);
        } catch (Throwable unused) {
        }
        gz.a aVar = new gz.a(d11, null);
        d0.e(0);
        Object c11 = c(kVar, aVar, cVar);
        d0.e(1);
        return c11;
    }

    @m80.l
    public static final Object e(@m80.k k kVar, @m80.l Object obj, @m80.k gz.a aVar, @m80.k j00.c<? super g2> cVar) {
        io.ktor.serialization.d b11 = b(kVar);
        if (b11 == null) {
            throw new WebsocketConverterNotFoundException("No converter was found for websocket", null, 2, null);
        }
        Object c11 = sz.a.c(kVar, obj, aVar, b11, ContentConverterKt.c(kVar.c().f().a(), null, 1, null), cVar);
        return c11 == kotlin.coroutines.intrinsics.b.l() ? c11 : g2.f100423a;
    }

    public static final /* synthetic */ <T> Object f(k kVar, T t11, j00.c<? super g2> cVar) {
        g0.y(4, ExifInterface.GPS_DIRECTION_TRUE);
        h10.d d11 = o0.d(Object.class);
        try {
            g0.y(6, ExifInterface.GPS_DIRECTION_TRUE);
        } catch (Throwable unused) {
        }
        gz.a aVar = new gz.a(d11, null);
        d0.e(0);
        e(kVar, t11, aVar, cVar);
        d0.e(1);
        return g2.f100423a;
    }

    @m80.k
    public static final a g(@m80.k io.ktor.websocket.a aVar, @m80.k zx.b call) {
        g0.p(aVar, "<this>");
        g0.p(call, "call");
        return new b(call, aVar);
    }

    @m80.k
    public static final k h(@m80.k j0 j0Var, @m80.k zx.b call) {
        g0.p(j0Var, "<this>");
        g0.p(call, "call");
        return new c(call, j0Var);
    }
}
