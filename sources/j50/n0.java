package j50;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@yz.v0
/* loaded from: classes8.dex */
public final class n0 extends r2<Float, float[], m0> implements f50.i<float[]> {

    /* renamed from: c, reason: collision with root package name */
    @m80.k
    public static final n0 f63430c = new n0();

    public n0() {
        super(g50.a.B(kotlin.jvm.internal.z.f67060a));
    }

    @Override // j50.a
    /* renamed from: C, reason: merged with bridge method [inline-methods] */
    public int k(@m80.k float[] fArr) {
        kotlin.jvm.internal.g0.p(fArr, "<this>");
        return fArr.length;
    }

    @Override // j50.r2
    @m80.k
    /* renamed from: D, reason: merged with bridge method [inline-methods] */
    public float[] x() {
        return new float[0];
    }

    @Override // j50.r2
    /* renamed from: E, reason: merged with bridge method [inline-methods] */
    public void z(@m80.k i50.d decoder, int i11, @m80.k m0 builder, boolean z11) {
        kotlin.jvm.internal.g0.p(decoder, "decoder");
        kotlin.jvm.internal.g0.p(builder, "builder");
        builder.e(decoder.decodeFloatElement(a(), i11));
    }

    @Override // j50.a
    @m80.k
    /* renamed from: F, reason: merged with bridge method [inline-methods] */
    public m0 q(@m80.k float[] fArr) {
        kotlin.jvm.internal.g0.p(fArr, "<this>");
        return new m0(fArr);
    }

    @Override // j50.r2
    /* renamed from: G, reason: merged with bridge method [inline-methods] */
    public void B(@m80.k i50.e encoder, @m80.k float[] content, int i11) {
        kotlin.jvm.internal.g0.p(encoder, "encoder");
        kotlin.jvm.internal.g0.p(content, "content");
        for (int i12 = 0; i12 < i11; i12++) {
            encoder.encodeFloatElement(a(), i12, content[i12]);
        }
    }
}
