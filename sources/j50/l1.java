package j50;

import h50.e;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@yz.v0
/* loaded from: classes8.dex */
public final class l1 implements f50.i<Long> {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public static final l1 f63406a = new l1();

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public static final h50.f f63407b = new t2("kotlin.Long", e.g.f58517a);

    @Override // f50.i, f50.b0, f50.e
    @m80.k
    public h50.f a() {
        return f63407b;
    }

    @Override // f50.b0
    public /* bridge */ /* synthetic */ void b(i50.h hVar, Object obj) {
        h(hVar, ((Number) obj).longValue());
    }

    @Override // f50.e
    @m80.k
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public Long e(@m80.k i50.f decoder) {
        kotlin.jvm.internal.g0.p(decoder, "decoder");
        return Long.valueOf(decoder.decodeLong());
    }

    public void h(@m80.k i50.h encoder, long j11) {
        kotlin.jvm.internal.g0.p(encoder, "encoder");
        encoder.encodeLong(j11);
    }
}
