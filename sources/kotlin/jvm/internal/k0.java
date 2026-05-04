package kotlin.jvm.internal;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class k0 extends n0<long[]> {

    /* renamed from: d, reason: collision with root package name */
    @m80.k
    public final long[] f67000d;

    public k0(int i11) {
        super(i11);
        this.f67000d = new long[i11];
    }

    public final void h(long j11) {
        long[] jArr = this.f67000d;
        int b11 = b();
        e(b11 + 1);
        jArr[b11] = j11;
    }

    @Override // kotlin.jvm.internal.n0
    /* renamed from: i, reason: merged with bridge method [inline-methods] */
    public int c(@m80.k long[] jArr) {
        g0.p(jArr, "<this>");
        return jArr.length;
    }

    @m80.k
    public final long[] j() {
        return g(this.f67000d, new long[f()]);
    }
}
