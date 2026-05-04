package l50;

import kotlin.KotlinNothingValueException;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@kotlin.jvm.internal.u0({"SMAP\nStreamingJsonDecoder.kt\nKotlin\n*S Kotlin\n*F\n+ 1 StreamingJsonDecoder.kt\nkotlinx/serialization/json/internal/JsonDecoderForUnsignedTypes\n+ 2 StreamingJsonDecoder.kt\nkotlinx/serialization/json/internal/StreamingJsonDecoderKt\n*L\n1#1,392:1\n385#2,5:393\n385#2,5:398\n385#2,5:403\n385#2,5:408\n*S KotlinDebug\n*F\n+ 1 StreamingJsonDecoder.kt\nkotlinx/serialization/json/internal/JsonDecoderForUnsignedTypes\n*L\n378#1:393,5\n379#1:398,5\n380#1:403,5\n381#1:408,5\n*E\n"})
/* loaded from: classes8.dex */
public final class g0 extends i50.a {

    /* renamed from: d, reason: collision with root package name */
    @m80.k
    public final a f69993d;

    /* renamed from: e, reason: collision with root package name */
    @m80.k
    public final o50.f f69994e;

    public g0(@m80.k a lexer, @m80.k k50.a json) {
        kotlin.jvm.internal.g0.p(lexer, "lexer");
        kotlin.jvm.internal.g0.p(json, "json");
        this.f69993d = lexer;
        this.f69994e = json.getSerializersModule();
    }

    @Override // i50.a, i50.f
    public byte decodeByte() {
        a aVar = this.f69993d;
        String u11 = aVar.u();
        try {
            return u30.w0.e(u11);
        } catch (IllegalArgumentException unused) {
            a.B(aVar, "Failed to parse type 'UByte' for input '" + u11 + '\'', 0, null, 6, null);
            throw new KotlinNothingValueException();
        }
    }

    @Override // i50.d
    public int decodeElementIndex(@m80.k h50.f descriptor) {
        kotlin.jvm.internal.g0.p(descriptor, "descriptor");
        throw new IllegalStateException("unsupported");
    }

    @Override // i50.a, i50.f
    public int decodeInt() {
        a aVar = this.f69993d;
        String u11 = aVar.u();
        try {
            return u30.w0.i(u11);
        } catch (IllegalArgumentException unused) {
            a.B(aVar, "Failed to parse type 'UInt' for input '" + u11 + '\'', 0, null, 6, null);
            throw new KotlinNothingValueException();
        }
    }

    @Override // i50.a, i50.f
    public long decodeLong() {
        a aVar = this.f69993d;
        String u11 = aVar.u();
        try {
            return u30.w0.m(u11);
        } catch (IllegalArgumentException unused) {
            a.B(aVar, "Failed to parse type 'ULong' for input '" + u11 + '\'', 0, null, 6, null);
            throw new KotlinNothingValueException();
        }
    }

    @Override // i50.a, i50.f
    public short decodeShort() {
        a aVar = this.f69993d;
        String u11 = aVar.u();
        try {
            return u30.w0.q(u11);
        } catch (IllegalArgumentException unused) {
            a.B(aVar, "Failed to parse type 'UShort' for input '" + u11 + '\'', 0, null, 6, null);
            throw new KotlinNothingValueException();
        }
    }

    @Override // i50.f, i50.d
    @m80.k
    public o50.f getSerializersModule() {
        return this.f69994e;
    }
}
