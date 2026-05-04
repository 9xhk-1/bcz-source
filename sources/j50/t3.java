package j50;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@yz.v0
@f50.f
@kotlin.d
/* loaded from: classes8.dex */
public final class t3 extends r2<yz.w1, yz.x1, s3> implements f50.i<yz.x1> {

    /* renamed from: c, reason: collision with root package name */
    @m80.k
    public static final t3 f63471c = new t3();

    public t3() {
        super(g50.a.L(yz.w1.f100453b));
    }

    @Override // j50.r2
    public /* bridge */ /* synthetic */ void B(i50.e eVar, yz.x1 x1Var, int i11) {
        G(eVar, x1Var.w(), i11);
    }

    public int C(@m80.k long[] collectionSize) {
        kotlin.jvm.internal.g0.p(collectionSize, "$this$collectionSize");
        return yz.x1.o(collectionSize);
    }

    @m80.k
    public long[] D() {
        return yz.x1.d(0);
    }

    @Override // j50.r2
    /* renamed from: E, reason: merged with bridge method [inline-methods] */
    public void z(@m80.k i50.d decoder, int i11, @m80.k s3 builder, boolean z11) {
        kotlin.jvm.internal.g0.p(decoder, "decoder");
        kotlin.jvm.internal.g0.p(builder, "builder");
        builder.e(yz.w1.i(decoder.decodeInlineElement(a(), i11).decodeLong()));
    }

    @m80.k
    public s3 F(@m80.k long[] toBuilder) {
        kotlin.jvm.internal.g0.p(toBuilder, "$this$toBuilder");
        return new s3(toBuilder, null);
    }

    public void G(@m80.k i50.e encoder, @m80.k long[] content, int i11) {
        kotlin.jvm.internal.g0.p(encoder, "encoder");
        kotlin.jvm.internal.g0.p(content, "content");
        for (int i12 = 0; i12 < i11; i12++) {
            encoder.encodeInlineElement(a(), i12).encodeLong(yz.x1.m(content, i12));
        }
    }

    @Override // j50.a
    public /* bridge */ /* synthetic */ int k(Object obj) {
        return C(((yz.x1) obj).w());
    }

    @Override // j50.a
    public /* bridge */ /* synthetic */ Object q(Object obj) {
        return F(((yz.x1) obj).w());
    }

    @Override // j50.r2
    public /* bridge */ /* synthetic */ yz.x1 x() {
        return yz.x1.b(D());
    }
}
