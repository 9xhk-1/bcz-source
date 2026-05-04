package j50;

import h50.e;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@yz.v0
/* loaded from: classes8.dex */
public final class l implements f50.i<Byte> {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public static final l f63404a = new l();

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public static final h50.f f63405b = new t2("kotlin.Byte", e.b.f58512a);

    @Override // f50.i, f50.b0, f50.e
    @m80.k
    public h50.f a() {
        return f63405b;
    }

    @Override // f50.b0
    public /* bridge */ /* synthetic */ void b(i50.h hVar, Object obj) {
        h(hVar, ((Number) obj).byteValue());
    }

    @Override // f50.e
    @m80.k
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public Byte e(@m80.k i50.f decoder) {
        kotlin.jvm.internal.g0.p(decoder, "decoder");
        return Byte.valueOf(decoder.decodeByte());
    }

    public void h(@m80.k i50.h encoder, byte b11) {
        kotlin.jvm.internal.g0.p(encoder, "encoder");
        encoder.encodeByte(b11);
    }
}
