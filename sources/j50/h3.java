package j50;

import java.util.ArrayList;
import kotlinx.serialization.SerializationException;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@f50.h
@kotlin.jvm.internal.u0({"SMAP\nTagged.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Tagged.kt\nkotlinx/serialization/internal/TaggedDecoder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 Decoding.kt\nkotlinx/serialization/encoding/DecodingKt\n*L\n1#1,342:1\n1#2:343\n271#3,2:344\n*S KotlinDebug\n*F\n+ 1 Tagged.kt\nkotlinx/serialization/internal/TaggedDecoder\n*L\n287#1:344,2\n*E\n"})
/* loaded from: classes8.dex */
public abstract class h3<Tag> implements i50.f, i50.d {

    /* renamed from: d, reason: collision with root package name */
    @m80.k
    public final ArrayList<Tag> f63376d = new ArrayList<>();

    /* renamed from: e, reason: collision with root package name */
    public boolean f63377e;

    public static final Object p(h3 h3Var, f50.e eVar, Object obj) {
        return (eVar.a().b() || h3Var.decodeNotNullMark()) ? h3Var.r(eVar, obj) : h3Var.decodeNull();
    }

    public static final Object q(h3 h3Var, f50.e eVar, Object obj) {
        return h3Var.r(eVar, obj);
    }

    public long A(Tag tag) {
        Object F = F(tag);
        kotlin.jvm.internal.g0.n(F, "null cannot be cast to non-null type kotlin.Long");
        return ((Long) F).longValue();
    }

    public boolean B(Tag tag) {
        return true;
    }

    @m80.l
    public Void C(Tag tag) {
        return null;
    }

    public short D(Tag tag) {
        Object F = F(tag);
        kotlin.jvm.internal.g0.n(F, "null cannot be cast to non-null type kotlin.Short");
        return ((Short) F).shortValue();
    }

    @m80.k
    public String E(Tag tag) {
        Object F = F(tag);
        kotlin.jvm.internal.g0.n(F, "null cannot be cast to non-null type kotlin.String");
        return (String) F;
    }

    @m80.k
    public Object F(Tag tag) {
        throw new SerializationException(kotlin.jvm.internal.o0.d(getClass()) + " can't retrieve untyped values");
    }

    public final Tag G() {
        return (Tag) a00.r0.u3(this.f63376d);
    }

    @m80.l
    public final Tag H() {
        return (Tag) a00.r0.A3(this.f63376d);
    }

    public abstract Tag I(@m80.k h50.f fVar, int i11);

    @m80.k
    public final ArrayList<Tag> J() {
        return this.f63376d;
    }

    public final Tag K() {
        ArrayList<Tag> arrayList = this.f63376d;
        Tag remove = arrayList.remove(a00.h0.L(arrayList));
        this.f63377e = true;
        return remove;
    }

    public final void L(Tag tag) {
        this.f63376d.add(tag);
    }

    public final <E> E M(Tag tag, x00.a<? extends E> aVar) {
        L(tag);
        E invoke = aVar.invoke();
        if (!this.f63377e) {
            K();
        }
        this.f63377e = false;
        return invoke;
    }

    @Override // i50.f
    @m80.k
    public i50.d beginStructure(@m80.k h50.f descriptor) {
        kotlin.jvm.internal.g0.p(descriptor, "descriptor");
        return this;
    }

    @Override // i50.f
    public final boolean decodeBoolean() {
        return s(K());
    }

    @Override // i50.d
    public final boolean decodeBooleanElement(@m80.k h50.f descriptor, int i11) {
        kotlin.jvm.internal.g0.p(descriptor, "descriptor");
        return s(I(descriptor, i11));
    }

    @Override // i50.f
    public final byte decodeByte() {
        return t(K());
    }

    @Override // i50.d
    public final byte decodeByteElement(@m80.k h50.f descriptor, int i11) {
        kotlin.jvm.internal.g0.p(descriptor, "descriptor");
        return t(I(descriptor, i11));
    }

    @Override // i50.f
    public final char decodeChar() {
        return u(K());
    }

    @Override // i50.d
    public final char decodeCharElement(@m80.k h50.f descriptor, int i11) {
        kotlin.jvm.internal.g0.p(descriptor, "descriptor");
        return u(I(descriptor, i11));
    }

    @Override // i50.d
    public int decodeCollectionSize(@m80.k h50.f fVar) {
        return super.decodeCollectionSize(fVar);
    }

    @Override // i50.f
    public final double decodeDouble() {
        return v(K());
    }

    @Override // i50.d
    public final double decodeDoubleElement(@m80.k h50.f descriptor, int i11) {
        kotlin.jvm.internal.g0.p(descriptor, "descriptor");
        return v(I(descriptor, i11));
    }

    @Override // i50.f
    public final int decodeEnum(@m80.k h50.f enumDescriptor) {
        kotlin.jvm.internal.g0.p(enumDescriptor, "enumDescriptor");
        return w(K(), enumDescriptor);
    }

    @Override // i50.f
    public final float decodeFloat() {
        return x(K());
    }

    @Override // i50.d
    public final float decodeFloatElement(@m80.k h50.f descriptor, int i11) {
        kotlin.jvm.internal.g0.p(descriptor, "descriptor");
        return x(I(descriptor, i11));
    }

    @Override // i50.f
    @m80.k
    public i50.f decodeInline(@m80.k h50.f descriptor) {
        kotlin.jvm.internal.g0.p(descriptor, "descriptor");
        return y(K(), descriptor);
    }

    @Override // i50.d
    @m80.k
    public final i50.f decodeInlineElement(@m80.k h50.f descriptor, int i11) {
        kotlin.jvm.internal.g0.p(descriptor, "descriptor");
        return y(I(descriptor, i11), descriptor.e(i11));
    }

    @Override // i50.f
    public final int decodeInt() {
        return z(K());
    }

    @Override // i50.d
    public final int decodeIntElement(@m80.k h50.f descriptor, int i11) {
        kotlin.jvm.internal.g0.p(descriptor, "descriptor");
        return z(I(descriptor, i11));
    }

    @Override // i50.f
    public final long decodeLong() {
        return A(K());
    }

    @Override // i50.d
    public final long decodeLongElement(@m80.k h50.f descriptor, int i11) {
        kotlin.jvm.internal.g0.p(descriptor, "descriptor");
        return A(I(descriptor, i11));
    }

    @Override // i50.f
    public boolean decodeNotNullMark() {
        Tag H = H();
        if (H == null) {
            return false;
        }
        return B(H);
    }

    @Override // i50.f
    @m80.l
    public final Void decodeNull() {
        return null;
    }

    @Override // i50.d
    @m80.l
    public final <T> T decodeNullableSerializableElement(@m80.k h50.f descriptor, int i11, @m80.k final f50.e<? extends T> deserializer, @m80.l final T t11) {
        kotlin.jvm.internal.g0.p(descriptor, "descriptor");
        kotlin.jvm.internal.g0.p(deserializer, "deserializer");
        return (T) M(I(descriptor, i11), new x00.a() { // from class: j50.g3
            @Override // x00.a
            public final Object invoke() {
                Object p11;
                p11 = h3.p(h3.this, deserializer, t11);
                return p11;
            }
        });
    }

    @Override // i50.f
    @m80.l
    @f50.f
    public <T> T decodeNullableSerializableValue(@m80.k f50.e<? extends T> eVar) {
        return (T) super.decodeNullableSerializableValue(eVar);
    }

    @Override // i50.d
    @f50.f
    public boolean decodeSequentially() {
        return super.decodeSequentially();
    }

    @Override // i50.d
    public final <T> T decodeSerializableElement(@m80.k h50.f descriptor, int i11, @m80.k final f50.e<? extends T> deserializer, @m80.l final T t11) {
        kotlin.jvm.internal.g0.p(descriptor, "descriptor");
        kotlin.jvm.internal.g0.p(deserializer, "deserializer");
        return (T) M(I(descriptor, i11), new x00.a() { // from class: j50.f3
            @Override // x00.a
            public final Object invoke() {
                Object q11;
                q11 = h3.q(h3.this, deserializer, t11);
                return q11;
            }
        });
    }

    @Override // i50.f
    public <T> T decodeSerializableValue(@m80.k f50.e<? extends T> eVar) {
        return (T) super.decodeSerializableValue(eVar);
    }

    @Override // i50.f
    public final short decodeShort() {
        return D(K());
    }

    @Override // i50.d
    public final short decodeShortElement(@m80.k h50.f descriptor, int i11) {
        kotlin.jvm.internal.g0.p(descriptor, "descriptor");
        return D(I(descriptor, i11));
    }

    @Override // i50.f
    @m80.k
    public final String decodeString() {
        return E(K());
    }

    @Override // i50.d
    @m80.k
    public final String decodeStringElement(@m80.k h50.f descriptor, int i11) {
        kotlin.jvm.internal.g0.p(descriptor, "descriptor");
        return E(I(descriptor, i11));
    }

    @Override // i50.d
    public void endStructure(@m80.k h50.f descriptor) {
        kotlin.jvm.internal.g0.p(descriptor, "descriptor");
    }

    @Override // i50.f, i50.d
    @m80.k
    public o50.f getSerializersModule() {
        return o50.h.a();
    }

    public final void o(@m80.k h3<Tag> other) {
        kotlin.jvm.internal.g0.p(other, "other");
        other.f63376d.addAll(this.f63376d);
    }

    public <T> T r(@m80.k f50.e<? extends T> deserializer, @m80.l T t11) {
        kotlin.jvm.internal.g0.p(deserializer, "deserializer");
        return (T) decodeSerializableValue(deserializer);
    }

    public boolean s(Tag tag) {
        Object F = F(tag);
        kotlin.jvm.internal.g0.n(F, "null cannot be cast to non-null type kotlin.Boolean");
        return ((Boolean) F).booleanValue();
    }

    public byte t(Tag tag) {
        Object F = F(tag);
        kotlin.jvm.internal.g0.n(F, "null cannot be cast to non-null type kotlin.Byte");
        return ((Byte) F).byteValue();
    }

    public char u(Tag tag) {
        Object F = F(tag);
        kotlin.jvm.internal.g0.n(F, "null cannot be cast to non-null type kotlin.Char");
        return ((Character) F).charValue();
    }

    public double v(Tag tag) {
        Object F = F(tag);
        kotlin.jvm.internal.g0.n(F, "null cannot be cast to non-null type kotlin.Double");
        return ((Double) F).doubleValue();
    }

    public int w(Tag tag, @m80.k h50.f enumDescriptor) {
        kotlin.jvm.internal.g0.p(enumDescriptor, "enumDescriptor");
        Object F = F(tag);
        kotlin.jvm.internal.g0.n(F, "null cannot be cast to non-null type kotlin.Int");
        return ((Integer) F).intValue();
    }

    public float x(Tag tag) {
        Object F = F(tag);
        kotlin.jvm.internal.g0.n(F, "null cannot be cast to non-null type kotlin.Float");
        return ((Float) F).floatValue();
    }

    @m80.k
    public i50.f y(Tag tag, @m80.k h50.f inlineDescriptor) {
        kotlin.jvm.internal.g0.p(inlineDescriptor, "inlineDescriptor");
        L(tag);
        return this;
    }

    public int z(Tag tag) {
        Object F = F(tag);
        kotlin.jvm.internal.g0.n(F, "null cannot be cast to non-null type kotlin.Int");
        return ((Integer) F).intValue();
    }
}
