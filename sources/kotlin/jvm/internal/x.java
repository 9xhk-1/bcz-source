package kotlin.jvm.internal;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class x extends n0<double[]> {

    /* renamed from: d, reason: collision with root package name */
    @m80.k
    public final double[] f67051d;

    public x(int i11) {
        super(i11);
        this.f67051d = new double[i11];
    }

    public final void h(double d11) {
        double[] dArr = this.f67051d;
        int b11 = b();
        e(b11 + 1);
        dArr[b11] = d11;
    }

    @Override // kotlin.jvm.internal.n0
    /* renamed from: i, reason: merged with bridge method [inline-methods] */
    public int c(@m80.k double[] dArr) {
        g0.p(dArr, "<this>");
        return dArr.length;
    }

    @m80.k
    public final double[] j() {
        return g(this.f67051d, new double[f()]);
    }
}
