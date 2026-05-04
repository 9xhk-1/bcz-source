package j50;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@yz.v0
/* loaded from: classes8.dex */
public final class b3 extends r2<Short, short[], a3> implements f50.i<short[]> {

    /* renamed from: c, reason: collision with root package name */
    @m80.k
    public static final b3 f63337c = new b3();

    public b3() {
        super(g50.a.E(kotlin.jvm.internal.s0.f67030a));
    }

    @Override // j50.a
    /* renamed from: C, reason: merged with bridge method [inline-methods] */
    public int k(@m80.k short[] sArr) {
        kotlin.jvm.internal.g0.p(sArr, "<this>");
        return sArr.length;
    }

    @Override // j50.r2
    @m80.k
    /* renamed from: D, reason: merged with bridge method [inline-methods] */
    public short[] x() {
        return new short[0];
    }

    @Override // j50.r2
    /* renamed from: E, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public void z(@m80.k i50.d decoder, int i11, @m80.k a3 builder, boolean z11) {
        kotlin.jvm.internal.g0.p(decoder, "decoder");
        kotlin.jvm.internal.g0.p(builder, "builder");
        builder.e(decoder.decodeShortElement(a(), i11));
    }

    @Override // j50.a
    @m80.k
    /* renamed from: F, reason: merged with bridge method [inline-methods] */
    public a3 q(@m80.k short[] sArr) {
        kotlin.jvm.internal.g0.p(sArr, "<this>");
        return new a3(sArr);
    }

    @Override // j50.r2
    /* renamed from: G, reason: merged with bridge method [inline-methods] */
    public void B(@m80.k i50.e encoder, @m80.k short[] content, int i11) {
        kotlin.jvm.internal.g0.p(encoder, "encoder");
        kotlin.jvm.internal.g0.p(content, "content");
        for (int i12 = 0; i12 < i11; i12++) {
            encoder.encodeShortElement(a(), i12, content[i12]);
        }
    }
}
