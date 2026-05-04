package j50;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@yz.v0
@f50.f
@kotlin.d
/* loaded from: classes8.dex */
public final class n3 extends r2<yz.o1, yz.p1, m3> implements f50.i<yz.p1> {

    /* renamed from: c, reason: collision with root package name */
    @m80.k
    public static final n3 f63434c = new n3();

    public n3() {
        super(g50.a.J(yz.o1.f100435b));
    }

    @Override // j50.r2
    public /* bridge */ /* synthetic */ void B(i50.e eVar, yz.p1 p1Var, int i11) {
        G(eVar, p1Var.w(), i11);
    }

    public int C(@m80.k byte[] collectionSize) {
        kotlin.jvm.internal.g0.p(collectionSize, "$this$collectionSize");
        return yz.p1.o(collectionSize);
    }

    @m80.k
    public byte[] D() {
        return yz.p1.d(0);
    }

    @Override // j50.r2
    /* renamed from: E, reason: merged with bridge method [inline-methods] */
    public void z(@m80.k i50.d decoder, int i11, @m80.k m3 builder, boolean z11) {
        kotlin.jvm.internal.g0.p(decoder, "decoder");
        kotlin.jvm.internal.g0.p(builder, "builder");
        builder.e(yz.o1.i(decoder.decodeInlineElement(a(), i11).decodeByte()));
    }

    @m80.k
    public m3 F(@m80.k byte[] toBuilder) {
        kotlin.jvm.internal.g0.p(toBuilder, "$this$toBuilder");
        return new m3(toBuilder, null);
    }

    public void G(@m80.k i50.e encoder, @m80.k byte[] content, int i11) {
        kotlin.jvm.internal.g0.p(encoder, "encoder");
        kotlin.jvm.internal.g0.p(content, "content");
        for (int i12 = 0; i12 < i11; i12++) {
            encoder.encodeInlineElement(a(), i12).encodeByte(yz.p1.m(content, i12));
        }
    }

    @Override // j50.a
    public /* bridge */ /* synthetic */ int k(Object obj) {
        return C(((yz.p1) obj).w());
    }

    @Override // j50.a
    public /* bridge */ /* synthetic */ Object q(Object obj) {
        return F(((yz.p1) obj).w());
    }

    @Override // j50.r2
    public /* bridge */ /* synthetic */ yz.p1 x() {
        return yz.p1.b(D());
    }
}
