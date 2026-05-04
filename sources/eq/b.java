package eq;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final byte[] f50063a;

    /* renamed from: b, reason: collision with root package name */
    public int f50064b = 0;

    public b(int i11) {
        this.f50063a = new byte[i11];
    }

    public void a(boolean z11, int i11) {
        for (int i12 = 0; i12 < i11; i12++) {
            int i13 = this.f50064b;
            this.f50064b = i13 + 1;
            d(i13, z11);
        }
    }

    public byte[] b(int i11) {
        int length = this.f50063a.length * i11;
        byte[] bArr = new byte[length];
        for (int i12 = 0; i12 < length; i12++) {
            bArr[i12] = this.f50063a[i12 / i11];
        }
        return bArr;
    }

    public void c(int i11, byte b11) {
        this.f50063a[i11] = b11;
    }

    public final void d(int i11, boolean z11) {
        this.f50063a[i11] = z11 ? (byte) 1 : (byte) 0;
    }
}
