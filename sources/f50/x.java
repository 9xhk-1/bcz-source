package f50;

import androidx.exifinterface.media.ExifInterface;
import j50.a1;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class x {
    public static final /* synthetic */ <T> T a(a aVar, byte[] bytes) {
        kotlin.jvm.internal.g0.p(aVar, "<this>");
        kotlin.jvm.internal.g0.p(bytes, "bytes");
        o50.f serializersModule = aVar.getSerializersModule();
        kotlin.jvm.internal.g0.y(6, ExifInterface.GPS_DIRECTION_TRUE);
        kotlin.jvm.internal.l0.n("kotlinx.serialization.serializer.withModule");
        return (T) aVar.d(k0.n(serializersModule, null), bytes);
    }

    public static final <T> T b(@m80.k a aVar, @m80.k e<? extends T> deserializer, @m80.k String hex) {
        kotlin.jvm.internal.g0.p(aVar, "<this>");
        kotlin.jvm.internal.g0.p(deserializer, "deserializer");
        kotlin.jvm.internal.g0.p(hex, "hex");
        return (T) aVar.d(deserializer, a1.f63328a.b(hex));
    }

    public static final /* synthetic */ <T> T c(a aVar, String hex) {
        kotlin.jvm.internal.g0.p(aVar, "<this>");
        kotlin.jvm.internal.g0.p(hex, "hex");
        o50.f serializersModule = aVar.getSerializersModule();
        kotlin.jvm.internal.g0.y(6, ExifInterface.GPS_DIRECTION_TRUE);
        kotlin.jvm.internal.l0.n("kotlinx.serialization.serializer.withModule");
        return (T) b(aVar, k0.n(serializersModule, null), hex);
    }

    public static final /* synthetic */ <T> T d(p0 p0Var, String string) {
        kotlin.jvm.internal.g0.p(p0Var, "<this>");
        kotlin.jvm.internal.g0.p(string, "string");
        o50.f serializersModule = p0Var.getSerializersModule();
        kotlin.jvm.internal.g0.y(6, ExifInterface.GPS_DIRECTION_TRUE);
        kotlin.jvm.internal.l0.n("kotlinx.serialization.serializer.withModule");
        return (T) p0Var.c(k0.n(serializersModule, null), string);
    }

    public static final /* synthetic */ <T> byte[] e(a aVar, T t11) {
        kotlin.jvm.internal.g0.p(aVar, "<this>");
        o50.f serializersModule = aVar.getSerializersModule();
        kotlin.jvm.internal.g0.y(6, ExifInterface.GPS_DIRECTION_TRUE);
        kotlin.jvm.internal.l0.n("kotlinx.serialization.serializer.withModule");
        return aVar.b(k0.n(serializersModule, null), t11);
    }

    @m80.k
    public static final <T> String f(@m80.k a aVar, @m80.k b0<? super T> serializer, T t11) {
        kotlin.jvm.internal.g0.p(aVar, "<this>");
        kotlin.jvm.internal.g0.p(serializer, "serializer");
        return a1.f63328a.c(aVar.b(serializer, t11), true);
    }

    public static final /* synthetic */ <T> String g(a aVar, T t11) {
        kotlin.jvm.internal.g0.p(aVar, "<this>");
        o50.f serializersModule = aVar.getSerializersModule();
        kotlin.jvm.internal.g0.y(6, ExifInterface.GPS_DIRECTION_TRUE);
        kotlin.jvm.internal.l0.n("kotlinx.serialization.serializer.withModule");
        return f(aVar, k0.n(serializersModule, null), t11);
    }

    public static final /* synthetic */ <T> String h(p0 p0Var, T t11) {
        kotlin.jvm.internal.g0.p(p0Var, "<this>");
        o50.f serializersModule = p0Var.getSerializersModule();
        kotlin.jvm.internal.g0.y(6, ExifInterface.GPS_DIRECTION_TRUE);
        kotlin.jvm.internal.l0.n("kotlinx.serialization.serializer.withModule");
        return p0Var.a(k0.n(serializersModule, null), t11);
    }
}
