package j50;

import h50.e;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@yz.v0
/* loaded from: classes8.dex */
public final class f0 implements f50.i<kotlin.time.e> {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public static final f0 f63353a = new f0();

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public static final h50.f f63354b = new t2("kotlin.time.Duration", e.i.f58519a);

    @Override // f50.i, f50.b0, f50.e
    @m80.k
    public h50.f a() {
        return f63354b;
    }

    @Override // f50.b0
    public /* bridge */ /* synthetic */ void b(i50.h hVar, Object obj) {
        h(hVar, ((kotlin.time.e) obj).k0());
    }

    @Override // f50.e
    public /* bridge */ /* synthetic */ Object e(i50.f fVar) {
        return kotlin.time.e.f(g(fVar));
    }

    public long g(@m80.k i50.f decoder) {
        kotlin.jvm.internal.g0.p(decoder, "decoder");
        return kotlin.time.e.f67757b.V(decoder.decodeString());
    }

    public void h(@m80.k i50.h encoder, long j11) {
        kotlin.jvm.internal.g0.p(encoder, "encoder");
        encoder.encodeString(kotlin.time.e.d0(j11));
    }
}
