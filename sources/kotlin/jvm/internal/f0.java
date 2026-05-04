package kotlin.jvm.internal;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class f0 extends n0<int[]> {

    /* renamed from: d, reason: collision with root package name */
    @m80.k
    public final int[] f66988d;

    public f0(int i11) {
        super(i11);
        this.f66988d = new int[i11];
    }

    public final void h(int i11) {
        int[] iArr = this.f66988d;
        int b11 = b();
        e(b11 + 1);
        iArr[b11] = i11;
    }

    @Override // kotlin.jvm.internal.n0
    /* renamed from: i, reason: merged with bridge method [inline-methods] */
    public int c(@m80.k int[] iArr) {
        g0.p(iArr, "<this>");
        return iArr.length;
    }

    @m80.k
    public final int[] j() {
        return g(this.f66988d, new int[f()]);
    }
}
