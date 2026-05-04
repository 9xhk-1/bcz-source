package j50;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@yz.v0
/* loaded from: classes8.dex */
public final class x3 implements f50.i<yz.c2> {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public static final x3 f63508a = new x3();

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public static final h50.f f63509b = v0.a("kotlin.UShort", g50.a.E(kotlin.jvm.internal.s0.f67030a));

    @Override // f50.i, f50.b0, f50.e
    @m80.k
    public h50.f a() {
        return f63509b;
    }

    @Override // f50.b0
    public /* bridge */ /* synthetic */ void b(i50.h hVar, Object obj) {
        h(hVar, ((yz.c2) obj).k0());
    }

    @Override // f50.e
    public /* bridge */ /* synthetic */ Object e(i50.f fVar) {
        return yz.c2.b(g(fVar));
    }

    public short g(@m80.k i50.f decoder) {
        kotlin.jvm.internal.g0.p(decoder, "decoder");
        return yz.c2.i(decoder.decodeInline(a()).decodeShort());
    }

    public void h(@m80.k i50.h encoder, short s11) {
        kotlin.jvm.internal.g0.p(encoder, "encoder");
        encoder.encodeInline(a()).encodeShort(s11);
    }
}
