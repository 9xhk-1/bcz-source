package mw;

import androidx.exifinterface.media.ExifInterface;
import kotlin.jvm.internal.d0;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.o0;
import kotlin.jvm.internal.u0;
import m80.k;
import m80.l;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nHttpClientCall.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HttpClientCall.kt\nio/ktor/client/call/HttpClientCallKt\n+ 2 Type.kt\nio/ktor/util/reflect/TypeKt\n*L\n1#1,194:1\n58#2,16:195\n58#2,16:211\n*S KotlinDebug\n*F\n+ 1 HttpClientCall.kt\nio/ktor/client/call/HttpClientCallKt\n*L\n134#1:195,16\n142#1:211,16\n*E\n"})
/* loaded from: classes8.dex */
public final class b {
    @l
    public static final <T> Object a(@k ex.c cVar, @k gz.a aVar, @k j00.c<? super T> cVar2) {
        Object b11 = cVar.c().b(aVar, cVar2);
        kotlin.coroutines.intrinsics.b.l();
        return b11;
    }

    public static final /* synthetic */ <T> Object b(ex.c cVar, j00.c<? super T> cVar2) {
        a c11 = cVar.c();
        g0.y(4, ExifInterface.GPS_DIRECTION_TRUE);
        h10.d d11 = o0.d(Object.class);
        try {
            g0.y(6, ExifInterface.GPS_DIRECTION_TRUE);
        } catch (Throwable unused) {
        }
        gz.a aVar = new gz.a(d11, null);
        d0.e(0);
        Object b11 = c11.b(aVar, cVar2);
        d0.e(1);
        g0.y(1, ExifInterface.GPS_DIRECTION_TRUE);
        return b11;
    }

    public static final /* synthetic */ <T> Object c(a aVar, j00.c<? super T> cVar) {
        g0.y(4, ExifInterface.GPS_DIRECTION_TRUE);
        h10.d d11 = o0.d(Object.class);
        try {
            g0.y(6, ExifInterface.GPS_DIRECTION_TRUE);
        } catch (Throwable unused) {
        }
        gz.a aVar2 = new gz.a(d11, null);
        d0.e(0);
        Object b11 = aVar.b(aVar2, cVar);
        d0.e(1);
        g0.y(1, ExifInterface.GPS_DIRECTION_TRUE);
        return b11;
    }
}
