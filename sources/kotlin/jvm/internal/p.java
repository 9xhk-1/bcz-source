package kotlin.jvm.internal;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class p extends n0<byte[]> {

    /* renamed from: d, reason: collision with root package name */
    @m80.k
    public final byte[] f67016d;

    public p(int i11) {
        super(i11);
        this.f67016d = new byte[i11];
    }

    public final void h(byte b11) {
        byte[] bArr = this.f67016d;
        int b12 = b();
        e(b12 + 1);
        bArr[b12] = b11;
    }

    @Override // kotlin.jvm.internal.n0
    /* renamed from: i, reason: merged with bridge method [inline-methods] */
    public int c(@m80.k byte[] bArr) {
        g0.p(bArr, "<this>");
        return bArr.length;
    }

    @m80.k
    public final byte[] j() {
        return g(this.f67016d, new byte[f()]);
    }
}
