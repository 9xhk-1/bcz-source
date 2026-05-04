package k50;

import androidx.exifinterface.media.ExifInterface;
import java.io.InputStream;
import java.io.OutputStream;
import kotlinx.serialization.json.DecodeSequenceMode;
import l50.u0;
import l50.v0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class p0 {
    @f50.f
    public static final <T> T a(@m80.k a aVar, @m80.k f50.e<? extends T> deserializer, @m80.k InputStream stream) {
        kotlin.jvm.internal.g0.p(aVar, "<this>");
        kotlin.jvm.internal.g0.p(deserializer, "deserializer");
        kotlin.jvm.internal.g0.p(stream, "stream");
        l50.f0 f0Var = new l50.f0(stream);
        try {
            return (T) u0.a(aVar, deserializer, f0Var);
        } finally {
            f0Var.b();
        }
    }

    @f50.f
    public static final /* synthetic */ <T> T b(a aVar, InputStream stream) {
        kotlin.jvm.internal.g0.p(aVar, "<this>");
        kotlin.jvm.internal.g0.p(stream, "stream");
        o50.f serializersModule = aVar.getSerializersModule();
        kotlin.jvm.internal.g0.y(6, ExifInterface.GPS_DIRECTION_TRUE);
        kotlin.jvm.internal.l0.n("kotlinx.serialization.serializer.withModule");
        return (T) a(aVar, f50.k0.n(serializersModule, null), stream);
    }

    @f50.f
    @m80.k
    public static final <T> q30.m<T> c(@m80.k a aVar, @m80.k InputStream stream, @m80.k f50.e<? extends T> deserializer, @m80.k DecodeSequenceMode format) {
        kotlin.jvm.internal.g0.p(aVar, "<this>");
        kotlin.jvm.internal.g0.p(stream, "stream");
        kotlin.jvm.internal.g0.p(deserializer, "deserializer");
        kotlin.jvm.internal.g0.p(format, "format");
        return u0.b(aVar, new l50.f0(stream), deserializer, format);
    }

    @f50.f
    public static final /* synthetic */ <T> q30.m<T> d(a aVar, InputStream stream, DecodeSequenceMode format) {
        kotlin.jvm.internal.g0.p(aVar, "<this>");
        kotlin.jvm.internal.g0.p(stream, "stream");
        kotlin.jvm.internal.g0.p(format, "format");
        o50.f serializersModule = aVar.getSerializersModule();
        kotlin.jvm.internal.g0.y(6, ExifInterface.GPS_DIRECTION_TRUE);
        kotlin.jvm.internal.l0.n("kotlinx.serialization.serializer.withModule");
        return c(aVar, stream, f50.k0.n(serializersModule, null), format);
    }

    public static /* synthetic */ q30.m e(a aVar, InputStream inputStream, f50.e eVar, DecodeSequenceMode decodeSequenceMode, int i11, Object obj) {
        if ((i11 & 4) != 0) {
            decodeSequenceMode = DecodeSequenceMode.AUTO_DETECT;
        }
        return c(aVar, inputStream, eVar, decodeSequenceMode);
    }

    public static /* synthetic */ q30.m f(a aVar, InputStream stream, DecodeSequenceMode format, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            format = DecodeSequenceMode.AUTO_DETECT;
        }
        kotlin.jvm.internal.g0.p(aVar, "<this>");
        kotlin.jvm.internal.g0.p(stream, "stream");
        kotlin.jvm.internal.g0.p(format, "format");
        o50.f serializersModule = aVar.getSerializersModule();
        kotlin.jvm.internal.g0.y(6, ExifInterface.GPS_DIRECTION_TRUE);
        kotlin.jvm.internal.l0.n("kotlinx.serialization.serializer.withModule");
        return c(aVar, stream, f50.k0.n(serializersModule, null), format);
    }

    @f50.f
    public static final <T> void g(@m80.k a aVar, @m80.k f50.b0<? super T> serializer, T t11, @m80.k OutputStream stream) {
        kotlin.jvm.internal.g0.p(aVar, "<this>");
        kotlin.jvm.internal.g0.p(serializer, "serializer");
        kotlin.jvm.internal.g0.p(stream, "stream");
        v0 v0Var = new v0(stream);
        try {
            u0.f(aVar, v0Var, serializer, t11);
        } finally {
            v0Var.release();
        }
    }

    @f50.f
    public static final /* synthetic */ <T> void h(a aVar, T t11, OutputStream stream) {
        kotlin.jvm.internal.g0.p(aVar, "<this>");
        kotlin.jvm.internal.g0.p(stream, "stream");
        o50.f serializersModule = aVar.getSerializersModule();
        kotlin.jvm.internal.g0.y(6, ExifInterface.GPS_DIRECTION_TRUE);
        kotlin.jvm.internal.l0.n("kotlinx.serialization.serializer.withModule");
        g(aVar, f50.k0.n(serializersModule, null), t11, stream);
    }
}
