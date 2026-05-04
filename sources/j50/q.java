package j50;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@yz.v0
/* loaded from: classes8.dex */
public final class q extends r2<Character, char[], p> implements f50.i<char[]> {

    /* renamed from: c, reason: collision with root package name */
    @m80.k
    public static final q f63451c = new q();

    public q() {
        super(g50.a.z(kotlin.jvm.internal.q.f67018a));
    }

    @Override // j50.a
    /* renamed from: C, reason: merged with bridge method [inline-methods] */
    public int k(@m80.k char[] cArr) {
        kotlin.jvm.internal.g0.p(cArr, "<this>");
        return cArr.length;
    }

    @Override // j50.r2
    @m80.k
    /* renamed from: D, reason: merged with bridge method [inline-methods] */
    public char[] x() {
        return new char[0];
    }

    @Override // j50.r2
    /* renamed from: E, reason: merged with bridge method [inline-methods] */
    public void z(@m80.k i50.d decoder, int i11, @m80.k p builder, boolean z11) {
        kotlin.jvm.internal.g0.p(decoder, "decoder");
        kotlin.jvm.internal.g0.p(builder, "builder");
        builder.e(decoder.decodeCharElement(a(), i11));
    }

    @Override // j50.a
    @m80.k
    /* renamed from: F, reason: merged with bridge method [inline-methods] */
    public p q(@m80.k char[] cArr) {
        kotlin.jvm.internal.g0.p(cArr, "<this>");
        return new p(cArr);
    }

    @Override // j50.r2
    /* renamed from: G, reason: merged with bridge method [inline-methods] */
    public void B(@m80.k i50.e encoder, @m80.k char[] content, int i11) {
        kotlin.jvm.internal.g0.p(encoder, "encoder");
        kotlin.jvm.internal.g0.p(content, "content");
        for (int i12 = 0; i12 < i11; i12++) {
            encoder.encodeCharElement(a(), i12, content[i12]);
        }
    }
}
