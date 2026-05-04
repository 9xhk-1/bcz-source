package j50;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@yz.v0
/* loaded from: classes8.dex */
public final class u3 implements f50.i<yz.w1> {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public static final u3 f63478a = new u3();

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public static final h50.f f63479b = v0.a("kotlin.ULong", g50.a.D(kotlin.jvm.internal.j0.f66993a));

    @Override // f50.i, f50.b0, f50.e
    @m80.k
    public h50.f a() {
        return f63479b;
    }

    @Override // f50.b0
    public /* bridge */ /* synthetic */ void b(i50.h hVar, Object obj) {
        h(hVar, ((yz.w1) obj).m0());
    }

    @Override // f50.e
    public /* bridge */ /* synthetic */ Object e(i50.f fVar) {
        return yz.w1.b(g(fVar));
    }

    public long g(@m80.k i50.f decoder) {
        kotlin.jvm.internal.g0.p(decoder, "decoder");
        return yz.w1.i(decoder.decodeInline(a()).decodeLong());
    }

    public void h(@m80.k i50.h encoder, long j11) {
        kotlin.jvm.internal.g0.p(encoder, "encoder");
        encoder.encodeInline(a()).encodeLong(j11);
    }
}
