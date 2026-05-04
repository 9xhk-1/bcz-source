package j50;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@yz.v0
@f50.f
@kotlin.d
/* loaded from: classes8.dex */
public final class w3 extends r2<yz.c2, yz.d2, v3> implements f50.i<yz.d2> {

    /* renamed from: c, reason: collision with root package name */
    @m80.k
    public static final w3 f63502c = new w3();

    public w3() {
        super(g50.a.M(yz.c2.f100410b));
    }

    @Override // j50.r2
    public /* bridge */ /* synthetic */ void B(i50.e eVar, yz.d2 d2Var, int i11) {
        G(eVar, d2Var.w(), i11);
    }

    public int C(@m80.k short[] collectionSize) {
        kotlin.jvm.internal.g0.p(collectionSize, "$this$collectionSize");
        return yz.d2.o(collectionSize);
    }

    @m80.k
    public short[] D() {
        return yz.d2.d(0);
    }

    @Override // j50.r2
    /* renamed from: E, reason: merged with bridge method [inline-methods] */
    public void z(@m80.k i50.d decoder, int i11, @m80.k v3 builder, boolean z11) {
        kotlin.jvm.internal.g0.p(decoder, "decoder");
        kotlin.jvm.internal.g0.p(builder, "builder");
        builder.e(yz.c2.i(decoder.decodeInlineElement(a(), i11).decodeShort()));
    }

    @m80.k
    public v3 F(@m80.k short[] toBuilder) {
        kotlin.jvm.internal.g0.p(toBuilder, "$this$toBuilder");
        return new v3(toBuilder, null);
    }

    public void G(@m80.k i50.e encoder, @m80.k short[] content, int i11) {
        kotlin.jvm.internal.g0.p(encoder, "encoder");
        kotlin.jvm.internal.g0.p(content, "content");
        for (int i12 = 0; i12 < i11; i12++) {
            encoder.encodeInlineElement(a(), i12).encodeShort(yz.d2.m(content, i12));
        }
    }

    @Override // j50.a
    public /* bridge */ /* synthetic */ int k(Object obj) {
        return C(((yz.d2) obj).w());
    }

    @Override // j50.a
    public /* bridge */ /* synthetic */ Object q(Object obj) {
        return F(((yz.d2) obj).w());
    }

    @Override // j50.r2
    public /* bridge */ /* synthetic */ yz.d2 x() {
        return yz.d2.b(D());
    }
}
