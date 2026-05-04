package m50;

import androidx.exifinterface.media.ExifInterface;
import f50.b0;
import f50.e;
import f50.f;
import f50.k0;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.l0;
import kotlinx.serialization.json.DecodeSequenceMode;
import l50.u0;
import m80.k;
import n50.b;
import n50.c;
import q30.m;
import y40.c0;
import y40.x;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class a {
    @f
    public static final <T> T a(@k k50.a aVar, @k e<? extends T> deserializer, @k c0 source) {
        g0.p(aVar, "<this>");
        g0.p(deserializer, "deserializer");
        g0.p(source, "source");
        return (T) u0.a(aVar, deserializer, new b(source));
    }

    @f
    public static final /* synthetic */ <T> T b(k50.a aVar, c0 source) {
        g0.p(aVar, "<this>");
        g0.p(source, "source");
        o50.f serializersModule = aVar.getSerializersModule();
        g0.y(6, ExifInterface.GPS_DIRECTION_TRUE);
        l0.n("kotlinx.serialization.serializer.withModule");
        return (T) a(aVar, k0.n(serializersModule, null), source);
    }

    @f
    @k
    public static final <T> m<T> c(@k k50.a aVar, @k c0 source, @k e<? extends T> deserializer, @k DecodeSequenceMode format) {
        g0.p(aVar, "<this>");
        g0.p(source, "source");
        g0.p(deserializer, "deserializer");
        g0.p(format, "format");
        return u0.b(aVar, new b(source), deserializer, format);
    }

    @f
    public static final /* synthetic */ <T> m<T> d(k50.a aVar, c0 source, DecodeSequenceMode format) {
        g0.p(aVar, "<this>");
        g0.p(source, "source");
        g0.p(format, "format");
        o50.f serializersModule = aVar.getSerializersModule();
        g0.y(6, ExifInterface.GPS_DIRECTION_TRUE);
        l0.n("kotlinx.serialization.serializer.withModule");
        return c(aVar, source, k0.n(serializersModule, null), format);
    }

    public static /* synthetic */ m e(k50.a aVar, c0 c0Var, e eVar, DecodeSequenceMode decodeSequenceMode, int i11, Object obj) {
        if ((i11 & 4) != 0) {
            decodeSequenceMode = DecodeSequenceMode.AUTO_DETECT;
        }
        return c(aVar, c0Var, eVar, decodeSequenceMode);
    }

    public static /* synthetic */ m f(k50.a aVar, c0 source, DecodeSequenceMode format, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            format = DecodeSequenceMode.AUTO_DETECT;
        }
        g0.p(aVar, "<this>");
        g0.p(source, "source");
        g0.p(format, "format");
        o50.f serializersModule = aVar.getSerializersModule();
        g0.y(6, ExifInterface.GPS_DIRECTION_TRUE);
        l0.n("kotlinx.serialization.serializer.withModule");
        return c(aVar, source, k0.n(serializersModule, null), format);
    }

    @f
    public static final <T> void g(@k k50.a aVar, @k b0<? super T> serializer, T t11, @k x sink) {
        g0.p(aVar, "<this>");
        g0.p(serializer, "serializer");
        g0.p(sink, "sink");
        c cVar = new c(sink);
        try {
            u0.f(aVar, cVar, serializer, t11);
        } finally {
            cVar.release();
        }
    }

    @f
    public static final /* synthetic */ <T> void h(k50.a aVar, T t11, x sink) {
        g0.p(aVar, "<this>");
        g0.p(sink, "sink");
        o50.f serializersModule = aVar.getSerializersModule();
        g0.y(6, ExifInterface.GPS_DIRECTION_TRUE);
        l0.n("kotlinx.serialization.serializer.withModule");
        g(aVar, k0.n(serializersModule, null), t11, sink);
    }
}
