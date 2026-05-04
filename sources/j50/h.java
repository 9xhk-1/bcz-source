package j50;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@yz.v0
/* loaded from: classes8.dex */
public final class h extends r2<Boolean, boolean[], g> implements f50.i<boolean[]> {

    /* renamed from: c, reason: collision with root package name */
    @m80.k
    public static final h f63371c = new h();

    public h() {
        super(g50.a.x(kotlin.jvm.internal.l.f67001a));
    }

    @Override // j50.a
    /* renamed from: C, reason: merged with bridge method [inline-methods] */
    public int k(@m80.k boolean[] zArr) {
        kotlin.jvm.internal.g0.p(zArr, "<this>");
        return zArr.length;
    }

    @Override // j50.r2
    @m80.k
    /* renamed from: D, reason: merged with bridge method [inline-methods] */
    public boolean[] x() {
        return new boolean[0];
    }

    @Override // j50.r2
    /* renamed from: E, reason: merged with bridge method [inline-methods] */
    public void z(@m80.k i50.d decoder, int i11, @m80.k g builder, boolean z11) {
        kotlin.jvm.internal.g0.p(decoder, "decoder");
        kotlin.jvm.internal.g0.p(builder, "builder");
        builder.e(decoder.decodeBooleanElement(a(), i11));
    }

    @Override // j50.a
    @m80.k
    /* renamed from: F, reason: merged with bridge method [inline-methods] */
    public g q(@m80.k boolean[] zArr) {
        kotlin.jvm.internal.g0.p(zArr, "<this>");
        return new g(zArr);
    }

    @Override // j50.r2
    /* renamed from: G, reason: merged with bridge method [inline-methods] */
    public void B(@m80.k i50.e encoder, @m80.k boolean[] content, int i11) {
        kotlin.jvm.internal.g0.p(encoder, "encoder");
        kotlin.jvm.internal.g0.p(content, "content");
        for (int i12 = 0; i12 < i11; i12++) {
            encoder.encodeBooleanElement(a(), i12, content[i12]);
        }
    }
}
