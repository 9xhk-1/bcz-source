package i50;

import f50.b0;
import j50.u1;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.o0;
import kotlinx.serialization.SerializationException;
import m80.k;
import m80.l;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@f50.f
/* loaded from: classes8.dex */
public abstract class b implements h, e {
    @Override // i50.h
    @k
    public e beginCollection(@k h50.f fVar, int i11) {
        return super.beginCollection(fVar, i11);
    }

    @Override // i50.h
    @k
    public e beginStructure(@k h50.f descriptor) {
        g0.p(descriptor, "descriptor");
        return this;
    }

    @Override // i50.h
    public void encodeBoolean(boolean z11) {
        encodeValue(Boolean.valueOf(z11));
    }

    @Override // i50.e
    public final void encodeBooleanElement(@k h50.f descriptor, int i11, boolean z11) {
        g0.p(descriptor, "descriptor");
        if (encodeElement(descriptor, i11)) {
            encodeBoolean(z11);
        }
    }

    @Override // i50.h
    public void encodeByte(byte b11) {
        encodeValue(Byte.valueOf(b11));
    }

    @Override // i50.e
    public final void encodeByteElement(@k h50.f descriptor, int i11, byte b11) {
        g0.p(descriptor, "descriptor");
        if (encodeElement(descriptor, i11)) {
            encodeByte(b11);
        }
    }

    @Override // i50.h
    public void encodeChar(char c11) {
        encodeValue(Character.valueOf(c11));
    }

    @Override // i50.e
    public final void encodeCharElement(@k h50.f descriptor, int i11, char c11) {
        g0.p(descriptor, "descriptor");
        if (encodeElement(descriptor, i11)) {
            encodeChar(c11);
        }
    }

    @Override // i50.h
    public void encodeDouble(double d11) {
        encodeValue(Double.valueOf(d11));
    }

    @Override // i50.e
    public final void encodeDoubleElement(@k h50.f descriptor, int i11, double d11) {
        g0.p(descriptor, "descriptor");
        if (encodeElement(descriptor, i11)) {
            encodeDouble(d11);
        }
    }

    public boolean encodeElement(@k h50.f descriptor, int i11) {
        g0.p(descriptor, "descriptor");
        return true;
    }

    @Override // i50.h
    public void encodeEnum(@k h50.f enumDescriptor, int i11) {
        g0.p(enumDescriptor, "enumDescriptor");
        encodeValue(Integer.valueOf(i11));
    }

    @Override // i50.h
    public void encodeFloat(float f11) {
        encodeValue(Float.valueOf(f11));
    }

    @Override // i50.e
    public final void encodeFloatElement(@k h50.f descriptor, int i11, float f11) {
        g0.p(descriptor, "descriptor");
        if (encodeElement(descriptor, i11)) {
            encodeFloat(f11);
        }
    }

    @Override // i50.h
    @k
    public h encodeInline(@k h50.f descriptor) {
        g0.p(descriptor, "descriptor");
        return this;
    }

    @Override // i50.e
    @k
    public final h encodeInlineElement(@k h50.f descriptor, int i11) {
        g0.p(descriptor, "descriptor");
        return encodeElement(descriptor, i11) ? encodeInline(descriptor.e(i11)) : u1.f63475a;
    }

    @Override // i50.h
    public void encodeInt(int i11) {
        encodeValue(Integer.valueOf(i11));
    }

    @Override // i50.e
    public final void encodeIntElement(@k h50.f descriptor, int i11, int i12) {
        g0.p(descriptor, "descriptor");
        if (encodeElement(descriptor, i11)) {
            encodeInt(i12);
        }
    }

    @Override // i50.h
    public void encodeLong(long j11) {
        encodeValue(Long.valueOf(j11));
    }

    @Override // i50.e
    public final void encodeLongElement(@k h50.f descriptor, int i11, long j11) {
        g0.p(descriptor, "descriptor");
        if (encodeElement(descriptor, i11)) {
            encodeLong(j11);
        }
    }

    @Override // i50.h
    @f50.f
    public void encodeNotNullMark() {
        super.encodeNotNullMark();
    }

    @Override // i50.h
    public void encodeNull() {
        throw new SerializationException("'null' is not supported by default");
    }

    @Override // i50.e
    public <T> void encodeNullableSerializableElement(@k h50.f descriptor, int i11, @k b0<? super T> serializer, @l T t11) {
        g0.p(descriptor, "descriptor");
        g0.p(serializer, "serializer");
        if (encodeElement(descriptor, i11)) {
            encodeNullableSerializableValue(serializer, t11);
        }
    }

    @Override // i50.h
    @f50.f
    public <T> void encodeNullableSerializableValue(@k b0<? super T> b0Var, @l T t11) {
        super.encodeNullableSerializableValue(b0Var, t11);
    }

    @Override // i50.e
    public <T> void encodeSerializableElement(@k h50.f descriptor, int i11, @k b0<? super T> serializer, T t11) {
        g0.p(descriptor, "descriptor");
        g0.p(serializer, "serializer");
        if (encodeElement(descriptor, i11)) {
            encodeSerializableValue(serializer, t11);
        }
    }

    @Override // i50.h
    public <T> void encodeSerializableValue(@k b0<? super T> b0Var, T t11) {
        super.encodeSerializableValue(b0Var, t11);
    }

    @Override // i50.h
    public void encodeShort(short s11) {
        encodeValue(Short.valueOf(s11));
    }

    @Override // i50.e
    public final void encodeShortElement(@k h50.f descriptor, int i11, short s11) {
        g0.p(descriptor, "descriptor");
        if (encodeElement(descriptor, i11)) {
            encodeShort(s11);
        }
    }

    @Override // i50.h
    public void encodeString(@k String value) {
        g0.p(value, "value");
        encodeValue(value);
    }

    @Override // i50.e
    public final void encodeStringElement(@k h50.f descriptor, int i11, @k String value) {
        g0.p(descriptor, "descriptor");
        g0.p(value, "value");
        if (encodeElement(descriptor, i11)) {
            encodeString(value);
        }
    }

    public void encodeValue(@k Object value) {
        g0.p(value, "value");
        throw new SerializationException("Non-serializable " + o0.d(value.getClass()) + " is not supported by " + o0.d(getClass()) + " encoder");
    }

    @Override // i50.e
    public void endStructure(@k h50.f descriptor) {
        g0.p(descriptor, "descriptor");
    }

    @Override // i50.e
    @f50.f
    public boolean shouldEncodeElementDefault(@k h50.f fVar, int i11) {
        return super.shouldEncodeElementDefault(fVar, i11);
    }
}
