package io.ktor.serialization;

import androidx.exifinterface.media.ExifInterface;
import java.nio.charset.Charset;
import kotlin.jvm.internal.d0;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.o0;
import kotlin.jvm.internal.u0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nWebsocketContentConverter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WebsocketContentConverter.kt\nio/ktor/serialization/WebsocketContentConverterKt\n+ 2 Type.kt\nio/ktor/util/reflect/TypeKt\n*L\n1#1,80:1\n58#2,16:81\n58#2,16:97\n*S KotlinDebug\n*F\n+ 1 WebsocketContentConverter.kt\nio/ktor/serialization/WebsocketContentConverterKt\n*L\n68#1:81,16\n79#1:97,16\n*E\n"})
/* loaded from: classes8.dex */
public final class e {
    public static final /* synthetic */ <T> Object a(d dVar, io.ktor.websocket.d dVar2, Charset charset, j00.c<? super T> cVar) {
        g0.y(4, ExifInterface.GPS_DIRECTION_TRUE);
        h10.d d11 = o0.d(Object.class);
        try {
            g0.y(6, ExifInterface.GPS_DIRECTION_TRUE);
        } catch (Throwable unused) {
        }
        gz.a aVar = new gz.a(d11, null);
        d0.e(0);
        Object c11 = dVar.c(charset, aVar, dVar2, cVar);
        d0.e(1);
        g0.y(1, ExifInterface.GPS_DIRECTION_TRUE);
        return c11;
    }

    public static /* synthetic */ Object b(d dVar, io.ktor.websocket.d dVar2, Charset charset, j00.c cVar, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            charset = u30.d.f91599b;
        }
        g0.y(4, ExifInterface.GPS_DIRECTION_TRUE);
        h10.d d11 = o0.d(Object.class);
        try {
            g0.y(6, ExifInterface.GPS_DIRECTION_TRUE);
        } catch (Throwable unused) {
        }
        gz.a aVar = new gz.a(d11, null);
        d0.e(0);
        Object c11 = dVar.c(charset, aVar, dVar2, cVar);
        d0.e(1);
        g0.y(1, ExifInterface.GPS_DIRECTION_TRUE);
        return c11;
    }

    public static final /* synthetic */ <T> Object c(d dVar, T t11, Charset charset, j00.c<? super io.ktor.websocket.d> cVar) {
        g0.y(4, ExifInterface.GPS_DIRECTION_TRUE);
        h10.d d11 = o0.d(Object.class);
        try {
            g0.y(6, ExifInterface.GPS_DIRECTION_TRUE);
        } catch (Throwable unused) {
        }
        gz.a aVar = new gz.a(d11, null);
        d0.e(0);
        Object a11 = dVar.a(charset, aVar, t11, cVar);
        d0.e(1);
        return a11;
    }

    public static /* synthetic */ Object d(d dVar, Object obj, Charset charset, j00.c cVar, int i11, Object obj2) {
        if ((i11 & 2) != 0) {
            charset = u30.d.f91599b;
        }
        g0.y(4, ExifInterface.GPS_DIRECTION_TRUE);
        h10.d d11 = o0.d(Object.class);
        try {
            g0.y(6, ExifInterface.GPS_DIRECTION_TRUE);
        } catch (Throwable unused) {
        }
        gz.a aVar = new gz.a(d11, null);
        d0.e(0);
        Object a11 = dVar.a(charset, aVar, obj, cVar);
        d0.e(1);
        return a11;
    }
}
