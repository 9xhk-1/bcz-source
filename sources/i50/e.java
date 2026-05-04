package i50;

import f50.b0;
import kotlin.jvm.internal.g0;
import m80.k;
import m80.l;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public interface e {

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a {
        @f50.f
        @Deprecated
        public static boolean a(@k e eVar, @k h50.f descriptor, int i11) {
            g0.p(descriptor, "descriptor");
            return e.super.shouldEncodeElementDefault(descriptor, i11);
        }
    }

    void encodeBooleanElement(@k h50.f fVar, int i11, boolean z11);

    void encodeByteElement(@k h50.f fVar, int i11, byte b11);

    void encodeCharElement(@k h50.f fVar, int i11, char c11);

    void encodeDoubleElement(@k h50.f fVar, int i11, double d11);

    void encodeFloatElement(@k h50.f fVar, int i11, float f11);

    @k
    h encodeInlineElement(@k h50.f fVar, int i11);

    void encodeIntElement(@k h50.f fVar, int i11, int i12);

    void encodeLongElement(@k h50.f fVar, int i11, long j11);

    @f50.f
    <T> void encodeNullableSerializableElement(@k h50.f fVar, int i11, @k b0<? super T> b0Var, @l T t11);

    <T> void encodeSerializableElement(@k h50.f fVar, int i11, @k b0<? super T> b0Var, T t11);

    void encodeShortElement(@k h50.f fVar, int i11, short s11);

    void encodeStringElement(@k h50.f fVar, int i11, @k String str);

    void endStructure(@k h50.f fVar);

    @k
    o50.f getSerializersModule();

    @f50.f
    default boolean shouldEncodeElementDefault(@k h50.f descriptor, int i11) {
        g0.p(descriptor, "descriptor");
        return true;
    }
}
