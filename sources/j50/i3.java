package j50;

import java.util.ArrayList;
import kotlinx.serialization.SerializationException;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@f50.h
@kotlin.jvm.internal.u0({"SMAP\nTagged.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Tagged.kt\nkotlinx/serialization/internal/TaggedEncoder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,342:1\n1#2:343\n*E\n"})
/* loaded from: classes8.dex */
public abstract class i3<Tag> implements i50.h, i50.e {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final ArrayList<Tag> f63385a = new ArrayList<>();

    private final boolean m(h50.f fVar, int i11) {
        G(E(fVar, i11));
        return true;
    }

    public void A(Tag tag, @m80.k Object value) {
        kotlin.jvm.internal.g0.p(value, "value");
        throw new SerializationException("Non-serializable " + kotlin.jvm.internal.o0.d(value.getClass()) + " is not supported by " + kotlin.jvm.internal.o0.d(getClass()) + " encoder");
    }

    public void B(@m80.k h50.f descriptor) {
        kotlin.jvm.internal.g0.p(descriptor, "descriptor");
    }

    public final Tag C() {
        return (Tag) a00.r0.u3(this.f63385a);
    }

    @m80.l
    public final Tag D() {
        return (Tag) a00.r0.A3(this.f63385a);
    }

    public abstract Tag E(@m80.k h50.f fVar, int i11);

    public final Tag F() {
        if (this.f63385a.isEmpty()) {
            throw new SerializationException("No tag in stack for requested element");
        }
        ArrayList<Tag> arrayList = this.f63385a;
        return arrayList.remove(a00.h0.L(arrayList));
    }

    public final void G(Tag tag) {
        this.f63385a.add(tag);
    }

    @Override // i50.h
    @m80.k
    public i50.e beginCollection(@m80.k h50.f fVar, int i11) {
        return super.beginCollection(fVar, i11);
    }

    @Override // i50.h
    @m80.k
    public i50.e beginStructure(@m80.k h50.f descriptor) {
        kotlin.jvm.internal.g0.p(descriptor, "descriptor");
        return this;
    }

    @Override // i50.h
    public final void encodeBoolean(boolean z11) {
        n(F(), z11);
    }

    @Override // i50.e
    public final void encodeBooleanElement(@m80.k h50.f descriptor, int i11, boolean z11) {
        kotlin.jvm.internal.g0.p(descriptor, "descriptor");
        n(E(descriptor, i11), z11);
    }

    @Override // i50.h
    public final void encodeByte(byte b11) {
        o(F(), b11);
    }

    @Override // i50.e
    public final void encodeByteElement(@m80.k h50.f descriptor, int i11, byte b11) {
        kotlin.jvm.internal.g0.p(descriptor, "descriptor");
        o(E(descriptor, i11), b11);
    }

    @Override // i50.h
    public final void encodeChar(char c11) {
        p(F(), c11);
    }

    @Override // i50.e
    public final void encodeCharElement(@m80.k h50.f descriptor, int i11, char c11) {
        kotlin.jvm.internal.g0.p(descriptor, "descriptor");
        p(E(descriptor, i11), c11);
    }

    @Override // i50.h
    public final void encodeDouble(double d11) {
        q(F(), d11);
    }

    @Override // i50.e
    public final void encodeDoubleElement(@m80.k h50.f descriptor, int i11, double d11) {
        kotlin.jvm.internal.g0.p(descriptor, "descriptor");
        q(E(descriptor, i11), d11);
    }

    @Override // i50.h
    public final void encodeEnum(@m80.k h50.f enumDescriptor, int i11) {
        kotlin.jvm.internal.g0.p(enumDescriptor, "enumDescriptor");
        r(F(), enumDescriptor, i11);
    }

    @Override // i50.h
    public final void encodeFloat(float f11) {
        s(F(), f11);
    }

    @Override // i50.e
    public final void encodeFloatElement(@m80.k h50.f descriptor, int i11, float f11) {
        kotlin.jvm.internal.g0.p(descriptor, "descriptor");
        s(E(descriptor, i11), f11);
    }

    @Override // i50.h
    @m80.k
    public i50.h encodeInline(@m80.k h50.f descriptor) {
        kotlin.jvm.internal.g0.p(descriptor, "descriptor");
        return t(F(), descriptor);
    }

    @Override // i50.e
    @m80.k
    public final i50.h encodeInlineElement(@m80.k h50.f descriptor, int i11) {
        kotlin.jvm.internal.g0.p(descriptor, "descriptor");
        return t(E(descriptor, i11), descriptor.e(i11));
    }

    @Override // i50.h
    public final void encodeInt(int i11) {
        u(F(), i11);
    }

    @Override // i50.e
    public final void encodeIntElement(@m80.k h50.f descriptor, int i11, int i12) {
        kotlin.jvm.internal.g0.p(descriptor, "descriptor");
        u(E(descriptor, i11), i12);
    }

    @Override // i50.h
    public final void encodeLong(long j11) {
        v(F(), j11);
    }

    @Override // i50.e
    public final void encodeLongElement(@m80.k h50.f descriptor, int i11, long j11) {
        kotlin.jvm.internal.g0.p(descriptor, "descriptor");
        v(E(descriptor, i11), j11);
    }

    @Override // i50.h
    public void encodeNotNullMark() {
        w(C());
    }

    @Override // i50.h
    public void encodeNull() {
        x(F());
    }

    @Override // i50.e
    public <T> void encodeNullableSerializableElement(@m80.k h50.f descriptor, int i11, @m80.k f50.b0<? super T> serializer, @m80.l T t11) {
        kotlin.jvm.internal.g0.p(descriptor, "descriptor");
        kotlin.jvm.internal.g0.p(serializer, "serializer");
        if (m(descriptor, i11)) {
            encodeNullableSerializableValue(serializer, t11);
        }
    }

    @Override // i50.h
    @f50.f
    public <T> void encodeNullableSerializableValue(@m80.k f50.b0<? super T> b0Var, @m80.l T t11) {
        super.encodeNullableSerializableValue(b0Var, t11);
    }

    @Override // i50.e
    public <T> void encodeSerializableElement(@m80.k h50.f descriptor, int i11, @m80.k f50.b0<? super T> serializer, T t11) {
        kotlin.jvm.internal.g0.p(descriptor, "descriptor");
        kotlin.jvm.internal.g0.p(serializer, "serializer");
        if (m(descriptor, i11)) {
            encodeSerializableValue(serializer, t11);
        }
    }

    @Override // i50.h
    public <T> void encodeSerializableValue(@m80.k f50.b0<? super T> b0Var, T t11) {
        super.encodeSerializableValue(b0Var, t11);
    }

    @Override // i50.h
    public final void encodeShort(short s11) {
        y(F(), s11);
    }

    @Override // i50.e
    public final void encodeShortElement(@m80.k h50.f descriptor, int i11, short s11) {
        kotlin.jvm.internal.g0.p(descriptor, "descriptor");
        y(E(descriptor, i11), s11);
    }

    @Override // i50.h
    public final void encodeString(@m80.k String value) {
        kotlin.jvm.internal.g0.p(value, "value");
        z(F(), value);
    }

    @Override // i50.e
    public final void encodeStringElement(@m80.k h50.f descriptor, int i11, @m80.k String value) {
        kotlin.jvm.internal.g0.p(descriptor, "descriptor");
        kotlin.jvm.internal.g0.p(value, "value");
        z(E(descriptor, i11), value);
    }

    @Override // i50.e
    public final void endStructure(@m80.k h50.f descriptor) {
        kotlin.jvm.internal.g0.p(descriptor, "descriptor");
        if (!this.f63385a.isEmpty()) {
            F();
        }
        B(descriptor);
    }

    @Override // i50.h, i50.e
    @m80.k
    public o50.f getSerializersModule() {
        return o50.h.a();
    }

    public void n(Tag tag, boolean z11) {
        A(tag, Boolean.valueOf(z11));
    }

    public void o(Tag tag, byte b11) {
        A(tag, Byte.valueOf(b11));
    }

    public void p(Tag tag, char c11) {
        A(tag, Character.valueOf(c11));
    }

    public void q(Tag tag, double d11) {
        A(tag, Double.valueOf(d11));
    }

    public void r(Tag tag, @m80.k h50.f enumDescriptor, int i11) {
        kotlin.jvm.internal.g0.p(enumDescriptor, "enumDescriptor");
        A(tag, Integer.valueOf(i11));
    }

    public void s(Tag tag, float f11) {
        A(tag, Float.valueOf(f11));
    }

    @Override // i50.e
    @f50.f
    public boolean shouldEncodeElementDefault(@m80.k h50.f fVar, int i11) {
        return super.shouldEncodeElementDefault(fVar, i11);
    }

    @m80.k
    public i50.h t(Tag tag, @m80.k h50.f inlineDescriptor) {
        kotlin.jvm.internal.g0.p(inlineDescriptor, "inlineDescriptor");
        G(tag);
        return this;
    }

    public void u(Tag tag, int i11) {
        A(tag, Integer.valueOf(i11));
    }

    public void v(Tag tag, long j11) {
        A(tag, Long.valueOf(j11));
    }

    public void x(Tag tag) {
        throw new SerializationException("null is not supported");
    }

    public void y(Tag tag, short s11) {
        A(tag, Short.valueOf(s11));
    }

    public void z(Tag tag, @m80.k String value) {
        kotlin.jvm.internal.g0.p(value, "value");
        A(tag, value);
    }

    public void w(Tag tag) {
    }
}
