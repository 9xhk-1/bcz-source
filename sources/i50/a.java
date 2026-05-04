package i50;

import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.o0;
import kotlin.jvm.internal.u0;
import kotlinx.serialization.SerializationException;
import m80.k;
import m80.l;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@f50.f
@u0({"SMAP\nAbstractDecoder.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AbstractDecoder.kt\nkotlinx/serialization/encoding/AbstractDecoder\n+ 2 Decoding.kt\nkotlinx/serialization/encoding/DecodingKt\n*L\n1#1,81:1\n271#2,2:82\n*S KotlinDebug\n*F\n+ 1 AbstractDecoder.kt\nkotlinx/serialization/encoding/AbstractDecoder\n*L\n77#1:82,2\n*E\n"})
/* loaded from: classes8.dex */
public abstract class a implements f, d {
    public static /* synthetic */ Object decodeSerializableValue$default(a aVar, f50.e eVar, Object obj, int i11, Object obj2) {
        if (obj2 != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: decodeSerializableValue");
        }
        if ((i11 & 2) != 0) {
            obj = null;
        }
        return aVar.decodeSerializableValue(eVar, obj);
    }

    @Override // i50.f
    @k
    public d beginStructure(@k h50.f descriptor) {
        g0.p(descriptor, "descriptor");
        return this;
    }

    @Override // i50.f
    public boolean decodeBoolean() {
        Object decodeValue = decodeValue();
        g0.n(decodeValue, "null cannot be cast to non-null type kotlin.Boolean");
        return ((Boolean) decodeValue).booleanValue();
    }

    @Override // i50.d
    public final boolean decodeBooleanElement(@k h50.f descriptor, int i11) {
        g0.p(descriptor, "descriptor");
        return decodeBoolean();
    }

    @Override // i50.f
    public byte decodeByte() {
        Object decodeValue = decodeValue();
        g0.n(decodeValue, "null cannot be cast to non-null type kotlin.Byte");
        return ((Byte) decodeValue).byteValue();
    }

    @Override // i50.d
    public final byte decodeByteElement(@k h50.f descriptor, int i11) {
        g0.p(descriptor, "descriptor");
        return decodeByte();
    }

    @Override // i50.f
    public char decodeChar() {
        Object decodeValue = decodeValue();
        g0.n(decodeValue, "null cannot be cast to non-null type kotlin.Char");
        return ((Character) decodeValue).charValue();
    }

    @Override // i50.d
    public final char decodeCharElement(@k h50.f descriptor, int i11) {
        g0.p(descriptor, "descriptor");
        return decodeChar();
    }

    @Override // i50.d
    public int decodeCollectionSize(@k h50.f fVar) {
        return super.decodeCollectionSize(fVar);
    }

    @Override // i50.f
    public double decodeDouble() {
        Object decodeValue = decodeValue();
        g0.n(decodeValue, "null cannot be cast to non-null type kotlin.Double");
        return ((Double) decodeValue).doubleValue();
    }

    @Override // i50.d
    public final double decodeDoubleElement(@k h50.f descriptor, int i11) {
        g0.p(descriptor, "descriptor");
        return decodeDouble();
    }

    @Override // i50.f
    public int decodeEnum(@k h50.f enumDescriptor) {
        g0.p(enumDescriptor, "enumDescriptor");
        Object decodeValue = decodeValue();
        g0.n(decodeValue, "null cannot be cast to non-null type kotlin.Int");
        return ((Integer) decodeValue).intValue();
    }

    @Override // i50.f
    public float decodeFloat() {
        Object decodeValue = decodeValue();
        g0.n(decodeValue, "null cannot be cast to non-null type kotlin.Float");
        return ((Float) decodeValue).floatValue();
    }

    @Override // i50.d
    public final float decodeFloatElement(@k h50.f descriptor, int i11) {
        g0.p(descriptor, "descriptor");
        return decodeFloat();
    }

    @Override // i50.f
    @k
    public f decodeInline(@k h50.f descriptor) {
        g0.p(descriptor, "descriptor");
        return this;
    }

    @Override // i50.d
    @k
    public f decodeInlineElement(@k h50.f descriptor, int i11) {
        g0.p(descriptor, "descriptor");
        return decodeInline(descriptor.e(i11));
    }

    @Override // i50.f
    public int decodeInt() {
        Object decodeValue = decodeValue();
        g0.n(decodeValue, "null cannot be cast to non-null type kotlin.Int");
        return ((Integer) decodeValue).intValue();
    }

    @Override // i50.d
    public final int decodeIntElement(@k h50.f descriptor, int i11) {
        g0.p(descriptor, "descriptor");
        return decodeInt();
    }

    @Override // i50.f
    public long decodeLong() {
        Object decodeValue = decodeValue();
        g0.n(decodeValue, "null cannot be cast to non-null type kotlin.Long");
        return ((Long) decodeValue).longValue();
    }

    @Override // i50.d
    public final long decodeLongElement(@k h50.f descriptor, int i11) {
        g0.p(descriptor, "descriptor");
        return decodeLong();
    }

    @Override // i50.f
    public boolean decodeNotNullMark() {
        return true;
    }

    @Override // i50.f
    @l
    public Void decodeNull() {
        return null;
    }

    @Override // i50.d
    @l
    public final <T> T decodeNullableSerializableElement(@k h50.f descriptor, int i11, @k f50.e<? extends T> deserializer, @l T t11) {
        g0.p(descriptor, "descriptor");
        g0.p(deserializer, "deserializer");
        return (deserializer.a().b() || decodeNotNullMark()) ? (T) decodeSerializableValue(deserializer, t11) : (T) decodeNull();
    }

    @Override // i50.f
    @l
    @f50.f
    public <T> T decodeNullableSerializableValue(@k f50.e<? extends T> eVar) {
        return (T) super.decodeNullableSerializableValue(eVar);
    }

    @Override // i50.d
    @f50.f
    public boolean decodeSequentially() {
        return super.decodeSequentially();
    }

    @Override // i50.d
    public <T> T decodeSerializableElement(@k h50.f descriptor, int i11, @k f50.e<? extends T> deserializer, @l T t11) {
        g0.p(descriptor, "descriptor");
        g0.p(deserializer, "deserializer");
        return (T) decodeSerializableValue(deserializer, t11);
    }

    @Override // i50.f
    public <T> T decodeSerializableValue(@k f50.e<? extends T> eVar) {
        return (T) super.decodeSerializableValue(eVar);
    }

    @Override // i50.f
    public short decodeShort() {
        Object decodeValue = decodeValue();
        g0.n(decodeValue, "null cannot be cast to non-null type kotlin.Short");
        return ((Short) decodeValue).shortValue();
    }

    @Override // i50.d
    public final short decodeShortElement(@k h50.f descriptor, int i11) {
        g0.p(descriptor, "descriptor");
        return decodeShort();
    }

    @Override // i50.f
    @k
    public String decodeString() {
        Object decodeValue = decodeValue();
        g0.n(decodeValue, "null cannot be cast to non-null type kotlin.String");
        return (String) decodeValue;
    }

    @Override // i50.d
    @k
    public final String decodeStringElement(@k h50.f descriptor, int i11) {
        g0.p(descriptor, "descriptor");
        return decodeString();
    }

    @k
    public Object decodeValue() {
        throw new SerializationException(o0.d(getClass()) + " can't retrieve untyped values");
    }

    @Override // i50.d
    public void endStructure(@k h50.f descriptor) {
        g0.p(descriptor, "descriptor");
    }

    public <T> T decodeSerializableValue(@k f50.e<? extends T> deserializer, @l T t11) {
        g0.p(deserializer, "deserializer");
        return (T) decodeSerializableValue(deserializer);
    }
}
