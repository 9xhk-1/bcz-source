package i50;

import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import m80.k;
import m80.l;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nDecoding.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Decoding.kt\nkotlinx/serialization/encoding/Decoder\n+ 2 Decoding.kt\nkotlinx/serialization/encoding/DecodingKt\n*L\n1#1,576:1\n271#2,2:577\n*S KotlinDebug\n*F\n+ 1 Decoding.kt\nkotlinx/serialization/encoding/Decoder\n*L\n264#1:577,2\n*E\n"})
/* loaded from: classes8.dex */
public interface f {

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a {
        @l
        @f50.f
        @Deprecated
        public static <T> T a(@k f fVar, @k f50.e<? extends T> deserializer) {
            g0.p(deserializer, "deserializer");
            return (T) f.super.decodeNullableSerializableValue(deserializer);
        }

        @Deprecated
        public static <T> T b(@k f fVar, @k f50.e<? extends T> deserializer) {
            g0.p(deserializer, "deserializer");
            return (T) f.super.decodeSerializableValue(deserializer);
        }
    }

    @k
    d beginStructure(@k h50.f fVar);

    boolean decodeBoolean();

    byte decodeByte();

    char decodeChar();

    double decodeDouble();

    int decodeEnum(@k h50.f fVar);

    float decodeFloat();

    @k
    f decodeInline(@k h50.f fVar);

    int decodeInt();

    long decodeLong();

    @f50.f
    boolean decodeNotNullMark();

    @l
    @f50.f
    Void decodeNull();

    @l
    @f50.f
    default <T> T decodeNullableSerializableValue(@k f50.e<? extends T> deserializer) {
        g0.p(deserializer, "deserializer");
        return (deserializer.a().b() || decodeNotNullMark()) ? (T) decodeSerializableValue(deserializer) : (T) decodeNull();
    }

    default <T> T decodeSerializableValue(@k f50.e<? extends T> deserializer) {
        g0.p(deserializer, "deserializer");
        return deserializer.e(this);
    }

    short decodeShort();

    @k
    String decodeString();

    @k
    o50.f getSerializersModule();
}
