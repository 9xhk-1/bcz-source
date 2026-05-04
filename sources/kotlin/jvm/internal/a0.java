package kotlin.jvm.internal;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class a0 extends n0<float[]> {

    /* renamed from: d, reason: collision with root package name */
    @m80.k
    public final float[] f66963d;

    public a0(int i11) {
        super(i11);
        this.f66963d = new float[i11];
    }

    public final void h(float f11) {
        float[] fArr = this.f66963d;
        int b11 = b();
        e(b11 + 1);
        fArr[b11] = f11;
    }

    @Override // kotlin.jvm.internal.n0
    /* renamed from: i, reason: merged with bridge method [inline-methods] */
    public int c(@m80.k float[] fArr) {
        g0.p(fArr, "<this>");
        return fArr.length;
    }

    @m80.k
    public final float[] j() {
        return g(this.f66963d, new float[f()]);
    }
}
