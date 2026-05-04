package i50;

import f50.b0;
import kotlin.jvm.internal.g0;
import m80.k;
import m80.l;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public interface h {

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a {
        @Deprecated
        @k
        public static e a(@k h hVar, @k h50.f descriptor, int i11) {
            g0.p(descriptor, "descriptor");
            return h.super.beginCollection(descriptor, i11);
        }

        @f50.f
        @Deprecated
        public static void b(@k h hVar) {
            h.super.encodeNotNullMark();
        }

        @f50.f
        @Deprecated
        public static <T> void c(@k h hVar, @k b0<? super T> serializer, @l T t11) {
            g0.p(serializer, "serializer");
            h.super.encodeNullableSerializableValue(serializer, t11);
        }

        @Deprecated
        public static <T> void d(@k h hVar, @k b0<? super T> serializer, T t11) {
            g0.p(serializer, "serializer");
            h.super.encodeSerializableValue(serializer, t11);
        }
    }

    @k
    default e beginCollection(@k h50.f descriptor, int i11) {
        g0.p(descriptor, "descriptor");
        return beginStructure(descriptor);
    }

    @k
    e beginStructure(@k h50.f fVar);

    void encodeBoolean(boolean z11);

    void encodeByte(byte b11);

    void encodeChar(char c11);

    void encodeDouble(double d11);

    void encodeEnum(@k h50.f fVar, int i11);

    void encodeFloat(float f11);

    @k
    h encodeInline(@k h50.f fVar);

    void encodeInt(int i11);

    void encodeLong(long j11);

    @f50.f
    void encodeNull();

    @f50.f
    default <T> void encodeNullableSerializableValue(@k b0<? super T> serializer, @l T t11) {
        g0.p(serializer, "serializer");
        if (serializer.a().b()) {
            encodeSerializableValue(serializer, t11);
        } else if (t11 == null) {
            encodeNull();
        } else {
            encodeNotNullMark();
            encodeSerializableValue(serializer, t11);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    default <T> void encodeSerializableValue(@k b0<? super T> serializer, T t11) {
        g0.p(serializer, "serializer");
        serializer.b(this, t11);
    }

    void encodeShort(short s11);

    void encodeString(@k String str);

    @k
    o50.f getSerializersModule();

    @f50.f
    default void encodeNotNullMark() {
    }
}
