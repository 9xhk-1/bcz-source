package xy;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class p1 implements t0 {

    /* renamed from: a, reason: collision with root package name */
    public long f98631a;

    /* renamed from: c, reason: collision with root package name */
    public int f98633c;

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public final byte[] f98632b = new byte[64];

    /* renamed from: d, reason: collision with root package name */
    @m80.k
    public final int[] f98634d = new int[80];

    /* renamed from: e, reason: collision with root package name */
    public int f98635e = 1732584193;

    /* renamed from: f, reason: collision with root package name */
    public int f98636f = -271733879;

    /* renamed from: g, reason: collision with root package name */
    public int f98637g = -1732584194;

    /* renamed from: h, reason: collision with root package name */
    public int f98638h = 271733878;

    /* renamed from: i, reason: collision with root package name */
    public int f98639i = -1009589776;

    @Override // xy.t0
    @m80.k
    public byte[] a() {
        byte[] bArr = this.f98632b;
        int i11 = this.f98633c;
        long j11 = this.f98631a * 8;
        int i12 = i11 + 1;
        bArr[i11] = Byte.MIN_VALUE;
        if (i12 > 56) {
            a00.q.G1(bArr, (byte) 0, i12, 64);
            b(bArr, 0);
            a00.q.G1(bArr, (byte) 0, 0, i12);
        } else {
            a00.q.G1(bArr, (byte) 0, i12, 56);
        }
        bArr[56] = (byte) (j11 >>> 56);
        bArr[57] = (byte) (j11 >>> 48);
        bArr[58] = (byte) (j11 >>> 40);
        bArr[59] = (byte) (j11 >>> 32);
        bArr[60] = (byte) (j11 >>> 24);
        bArr[61] = (byte) (j11 >>> 16);
        bArr[62] = (byte) (j11 >>> 8);
        bArr[63] = (byte) j11;
        b(bArr, 0);
        int i13 = this.f98635e;
        int i14 = this.f98636f;
        int i15 = this.f98637g;
        int i16 = this.f98638h;
        int i17 = this.f98639i;
        c();
        return new byte[]{(byte) (i13 >> 24), (byte) (i13 >> 16), (byte) (i13 >> 8), (byte) i13, (byte) (i14 >> 24), (byte) (i14 >> 16), (byte) (i14 >> 8), (byte) i14, (byte) (i15 >> 24), (byte) (i15 >> 16), (byte) (i15 >> 8), (byte) i15, (byte) (i16 >> 24), (byte) (i16 >> 16), (byte) (i16 >> 8), (byte) i16, (byte) (i17 >> 24), (byte) (i17 >> 16), (byte) (i17 >> 8), (byte) i17};
    }

    public final void b(byte[] bArr, int i11) {
        int i12;
        int d11;
        int i13;
        int i14;
        int d12;
        int d13;
        int d14;
        int d15;
        int d16;
        int[] iArr = this.f98634d;
        int i15 = 0;
        int i16 = 0;
        while (true) {
            if (i16 >= 16) {
                break;
            }
            int i17 = i11 + 3;
            int i18 = ((bArr[i11 + 1] & 255) << 16) | ((bArr[i11] & 255) << 24) | ((bArr[i11 + 2] & 255) << 8);
            i11 += 4;
            iArr[i16] = i18 | (bArr[i17] & 255);
            i16++;
        }
        for (i12 = 16; i12 < 80; i12++) {
            d16 = u0.d(((iArr[i12 - 3] ^ iArr[i12 - 8]) ^ iArr[i12 - 14]) ^ iArr[i12 - 16], 1);
            iArr[i12] = d16;
        }
        int i19 = this.f98635e;
        int i21 = this.f98636f;
        int i22 = this.f98637g;
        int i23 = this.f98638h;
        int i24 = this.f98639i;
        while (i15 < 80) {
            if (i15 < 20) {
                d15 = u0.d(i19, 5);
                i13 = d15 + (((i22 ^ i23) & i21) ^ i23) + i24 + 1518500249;
                i14 = iArr[i15];
            } else if (i15 < 40) {
                d13 = u0.d(i19, 5);
                i13 = d13 + ((i21 ^ i22) ^ i23) + i24 + 1859775393;
                i14 = iArr[i15];
            } else if (i15 < 60) {
                d12 = u0.d(i19, 5);
                i13 = ((d12 + (((i22 | i23) & i21) | (i22 & i23))) + i24) - 1894007588;
                i14 = iArr[i15];
            } else {
                d11 = u0.d(i19, 5);
                i13 = ((d11 + ((i21 ^ i22) ^ i23)) + i24) - 899497514;
                i14 = iArr[i15];
            }
            int i25 = i13 + i14;
            d14 = u0.d(i21, 30);
            i15++;
            i24 = i23;
            i23 = i22;
            i22 = d14;
            i21 = i19;
            i19 = i25;
        }
        this.f98635e += i19;
        this.f98636f += i21;
        this.f98637g += i22;
        this.f98638h += i23;
        this.f98639i += i24;
    }

    public final void c() {
        this.f98631a = 0L;
        a00.q.P1(this.f98632b, (byte) 0, 0, 0, 6, null);
        this.f98633c = 0;
        a00.q.T1(this.f98634d, 0, 0, 0, 6, null);
        this.f98635e = 1732584193;
        this.f98636f = -271733879;
        this.f98637g = -1732584194;
        this.f98638h = 271733878;
        this.f98639i = -1009589776;
    }

    @Override // xy.t0
    public void update(@m80.k byte[] input, int i11, int i12) {
        kotlin.jvm.internal.g0.p(input, "input");
        this.f98631a += i12;
        int i13 = i11 + i12;
        byte[] bArr = this.f98632b;
        int i14 = this.f98633c;
        if (i14 > 0) {
            int i15 = i12 + i14;
            if (i15 < 64) {
                a00.q.v0(input, bArr, i14, i11, i13);
                this.f98633c = i15;
                return;
            } else {
                int i16 = (64 - i14) + i11;
                a00.q.v0(input, bArr, i14, i11, i16);
                b(bArr, 0);
                this.f98633c = 0;
                i11 = i16;
            }
        }
        while (i11 < i13) {
            int i17 = i11 + 64;
            if (i17 > i13) {
                a00.q.v0(input, bArr, 0, i11, i13);
                this.f98633c = i13 - i11;
                return;
            } else {
                b(input, i11);
                i11 = i17;
            }
        }
    }
}
