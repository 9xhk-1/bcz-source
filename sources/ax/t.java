package ax;

import androidx.exifinterface.media.ExifInterface;
import io.ktor.serialization.ContentConverterKt;
import io.ktor.serialization.WebsocketConverterNotFoundException;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.o0;
import kotlin.jvm.internal.u0;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nClientSessions.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ClientSessions.kt\nio/ktor/client/plugins/websocket/ClientSessionsKt\n+ 2 Type.kt\nio/ktor/util/reflect/TypeKt\n*L\n1#1,119:1\n58#2,16:120\n58#2,16:136\n*S KotlinDebug\n*F\n+ 1 ClientSessions.kt\nio/ktor/client/plugins/websocket/ClientSessionsKt\n*L\n79#1:120,16\n118#1:136,16\n*E\n"})
/* loaded from: classes8.dex */
public final class t {
    @m80.l
    public static final io.ktor.serialization.d a(@m80.k v vVar) {
        g0.p(vVar, "<this>");
        c0 c0Var = (c0) rw.z.c(vVar.c().e(), c0.f5501e);
        if (c0Var != null) {
            return c0Var.g();
        }
        return null;
    }

    @m80.l
    public static final <T> Object b(@m80.k v vVar, @m80.k gz.a aVar, @m80.k j00.c<? super T> cVar) {
        io.ktor.serialization.d a11 = a(vVar);
        if (a11 == null) {
            throw new WebsocketConverterNotFoundException("No converter was found for websocket", null, 2, null);
        }
        Object a12 = sz.a.a(vVar, aVar, a11, ContentConverterKt.c(vVar.c().h().a(), null, 1, null), cVar);
        kotlin.coroutines.intrinsics.b.l();
        return a12;
    }

    public static final /* synthetic */ <T> Object c(v vVar, j00.c<? super T> cVar) {
        g0.y(4, ExifInterface.GPS_DIRECTION_TRUE);
        h10.d d11 = o0.d(Object.class);
        try {
            g0.y(6, ExifInterface.GPS_DIRECTION_TRUE);
        } catch (Throwable unused) {
        }
        gz.a aVar = new gz.a(d11, null);
        kotlin.jvm.internal.d0.e(0);
        Object b11 = b(vVar, aVar, cVar);
        kotlin.jvm.internal.d0.e(1);
        return b11;
    }

    @m80.l
    public static final Object d(@m80.k v vVar, @m80.l Object obj, @m80.k gz.a aVar, @m80.k j00.c<? super g2> cVar) {
        io.ktor.serialization.d a11 = a(vVar);
        if (a11 == null) {
            throw new WebsocketConverterNotFoundException("No converter was found for websocket", null, 2, null);
        }
        Object c11 = sz.a.c(vVar, obj, aVar, a11, ContentConverterKt.c(vVar.c().h().a(), null, 1, null), cVar);
        return c11 == kotlin.coroutines.intrinsics.b.l() ? c11 : g2.f100423a;
    }

    public static final /* synthetic */ <T> Object e(v vVar, T t11, j00.c<? super g2> cVar) {
        g0.y(4, ExifInterface.GPS_DIRECTION_TRUE);
        h10.d d11 = o0.d(Object.class);
        try {
            g0.y(6, ExifInterface.GPS_DIRECTION_TRUE);
        } catch (Throwable unused) {
        }
        gz.a aVar = new gz.a(d11, null);
        kotlin.jvm.internal.d0.e(0);
        d(vVar, t11, aVar, cVar);
        kotlin.jvm.internal.d0.e(1);
        return g2.f100423a;
    }
}
