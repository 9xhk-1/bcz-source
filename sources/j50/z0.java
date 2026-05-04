package j50;

import h50.e;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@yz.v0
/* loaded from: classes8.dex */
public final class z0 implements f50.i<Integer> {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public static final z0 f63517a = new z0();

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public static final h50.f f63518b = new t2("kotlin.Int", e.f.f58516a);

    @Override // f50.i, f50.b0, f50.e
    @m80.k
    public h50.f a() {
        return f63518b;
    }

    @Override // f50.b0
    public /* bridge */ /* synthetic */ void b(i50.h hVar, Object obj) {
        h(hVar, ((Number) obj).intValue());
    }

    @Override // f50.e
    @m80.k
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public Integer e(@m80.k i50.f decoder) {
        kotlin.jvm.internal.g0.p(decoder, "decoder");
        return Integer.valueOf(decoder.decodeInt());
    }

    public void h(@m80.k i50.h encoder, int i11) {
        kotlin.jvm.internal.g0.p(encoder, "encoder");
        encoder.encodeInt(i11);
    }
}
