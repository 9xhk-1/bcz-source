package c3;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public class a {

    /* renamed from: b, reason: collision with root package name */
    public static int[] f7661b = new int[256];

    /* renamed from: a, reason: collision with root package name */
    public int f7662a = -1;

    static {
        for (int i11 = 0; i11 < 256; i11++) {
            int i12 = i11;
            for (int i13 = 0; i13 < 8; i13++) {
                i12 = (i12 & 1) != 0 ? (i12 >>> 1) ^ (-306674912) : i12 >>> 1;
            }
            f7661b[i11] = i12;
        }
    }

    public int a() {
        return ~this.f7662a;
    }

    public void b() {
        this.f7662a = -1;
    }

    public void c(byte[] bArr) {
        for (byte b11 : bArr) {
            int[] iArr = f7661b;
            int i11 = this.f7662a;
            this.f7662a = iArr[(b11 ^ i11) & 255] ^ (i11 >>> 8);
        }
    }

    public void d(byte[] bArr, int i11, int i12) {
        for (int i13 = 0; i13 < i12; i13++) {
            int[] iArr = f7661b;
            int i14 = this.f7662a;
            this.f7662a = iArr[(bArr[i11 + i13] ^ i14) & 255] ^ (i14 >>> 8);
        }
    }

    public void e(int i11) {
        int[] iArr = f7661b;
        int i12 = this.f7662a;
        this.f7662a = iArr[(i11 ^ i12) & 255] ^ (i12 >>> 8);
    }
}
