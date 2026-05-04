package j50;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@yz.v0
/* loaded from: classes8.dex */
public final class o3 implements f50.i<yz.o1> {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public static final o3 f63443a = new o3();

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public static final h50.f f63444b = v0.a("kotlin.UByte", g50.a.y(kotlin.jvm.internal.o.f67008a));

    @Override // f50.i, f50.b0, f50.e
    @m80.k
    public h50.f a() {
        return f63444b;
    }

    @Override // f50.b0
    public /* bridge */ /* synthetic */ void b(i50.h hVar, Object obj) {
        h(hVar, ((yz.o1) obj).k0());
    }

    @Override // f50.e
    public /* bridge */ /* synthetic */ Object e(i50.f fVar) {
        return yz.o1.b(g(fVar));
    }

    public byte g(@m80.k i50.f decoder) {
        kotlin.jvm.internal.g0.p(decoder, "decoder");
        return yz.o1.i(decoder.decodeInline(a()).decodeByte());
    }

    public void h(@m80.k i50.h encoder, byte b11) {
        kotlin.jvm.internal.g0.p(encoder, "encoder");
        encoder.encodeInline(a()).encodeByte(b11);
    }
}
