package j50;

import h50.e;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@yz.v0
/* loaded from: classes8.dex */
public final class o0 implements f50.i<Float> {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public static final o0 f63436a = new o0();

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public static final h50.f f63437b = new t2("kotlin.Float", e.C0659e.f58515a);

    @Override // f50.i, f50.b0, f50.e
    @m80.k
    public h50.f a() {
        return f63437b;
    }

    @Override // f50.b0
    public /* bridge */ /* synthetic */ void b(i50.h hVar, Object obj) {
        h(hVar, ((Number) obj).floatValue());
    }

    @Override // f50.e
    @m80.k
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public Float e(@m80.k i50.f decoder) {
        kotlin.jvm.internal.g0.p(decoder, "decoder");
        return Float.valueOf(decoder.decodeFloat());
    }

    public void h(@m80.k i50.h encoder, float f11) {
        kotlin.jvm.internal.g0.p(encoder, "encoder");
        encoder.encodeFloat(f11);
    }
}
