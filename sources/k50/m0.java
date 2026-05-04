package k50;

import h50.e;
import yz.v0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@v0
/* loaded from: classes8.dex */
public final class m0 implements f50.i<l0> {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public static final m0 f65972a = new m0();

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public static final h50.f f65973b = h50.l.i("kotlinx.serialization.json.JsonPrimitive", e.i.f58519a, new h50.f[0], null, 8, null);

    @Override // f50.i, f50.b0, f50.e
    @m80.k
    public h50.f a() {
        return f65973b;
    }

    @Override // f50.e
    @m80.k
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public l0 e(@m80.k i50.f decoder) {
        kotlin.jvm.internal.g0.p(decoder, "decoder");
        k i11 = w.d(decoder).i();
        if (i11 instanceof l0) {
            return (l0) i11;
        }
        throw l50.i0.f(-1, "Unexpected JSON element, expected JsonPrimitive, had " + kotlin.jvm.internal.o0.d(i11.getClass()), i11.toString());
    }

    @Override // f50.b0
    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public void b(@m80.k i50.h encoder, @m80.k l0 value) {
        kotlin.jvm.internal.g0.p(encoder, "encoder");
        kotlin.jvm.internal.g0.p(value, "value");
        w.h(encoder);
        if (value instanceof f0) {
            encoder.encodeSerializableValue(g0.f65961a, f0.INSTANCE);
        } else {
            encoder.encodeSerializableValue(c0.f65912a, (b0) value);
        }
    }
}
