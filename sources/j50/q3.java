package j50;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@yz.v0
@f50.f
@kotlin.d
/* loaded from: classes8.dex */
public final class q3 extends r2<yz.s1, yz.t1, p3> implements f50.i<yz.t1> {

    /* renamed from: c, reason: collision with root package name */
    @m80.k
    public static final q3 f63454c = new q3();

    public q3() {
        super(g50.a.K(yz.s1.f100444b));
    }

    @Override // j50.r2
    public /* bridge */ /* synthetic */ void B(i50.e eVar, yz.t1 t1Var, int i11) {
        G(eVar, t1Var.w(), i11);
    }

    public int C(@m80.k int[] collectionSize) {
        kotlin.jvm.internal.g0.p(collectionSize, "$this$collectionSize");
        return yz.t1.o(collectionSize);
    }

    @m80.k
    public int[] D() {
        return yz.t1.d(0);
    }

    @Override // j50.r2
    /* renamed from: E, reason: merged with bridge method [inline-methods] */
    public void z(@m80.k i50.d decoder, int i11, @m80.k p3 builder, boolean z11) {
        kotlin.jvm.internal.g0.p(decoder, "decoder");
        kotlin.jvm.internal.g0.p(builder, "builder");
        builder.e(yz.s1.i(decoder.decodeInlineElement(a(), i11).decodeInt()));
    }

    @m80.k
    public p3 F(@m80.k int[] toBuilder) {
        kotlin.jvm.internal.g0.p(toBuilder, "$this$toBuilder");
        return new p3(toBuilder, null);
    }

    public void G(@m80.k i50.e encoder, @m80.k int[] content, int i11) {
        kotlin.jvm.internal.g0.p(encoder, "encoder");
        kotlin.jvm.internal.g0.p(content, "content");
        for (int i12 = 0; i12 < i11; i12++) {
            encoder.encodeInlineElement(a(), i12).encodeInt(yz.t1.m(content, i12));
        }
    }

    @Override // j50.a
    public /* bridge */ /* synthetic */ int k(Object obj) {
        return C(((yz.t1) obj).w());
    }

    @Override // j50.a
    public /* bridge */ /* synthetic */ Object q(Object obj) {
        return F(((yz.t1) obj).w());
    }

    @Override // j50.r2
    public /* bridge */ /* synthetic */ yz.t1 x() {
        return yz.t1.b(D());
    }
}
