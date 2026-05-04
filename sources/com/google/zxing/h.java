package com.google.zxing;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public final class h extends e {

    /* renamed from: h, reason: collision with root package name */
    public static final int f35064h = 2;

    /* renamed from: c, reason: collision with root package name */
    public final byte[] f35065c;

    /* renamed from: d, reason: collision with root package name */
    public final int f35066d;

    /* renamed from: e, reason: collision with root package name */
    public final int f35067e;

    /* renamed from: f, reason: collision with root package name */
    public final int f35068f;

    /* renamed from: g, reason: collision with root package name */
    public final int f35069g;

    public h(byte[] bArr, int i11, int i12, int i13, int i14, int i15, int i16, boolean z11) {
        super(i15, i16);
        if (i13 + i15 > i11 || i14 + i16 > i12) {
            throw new IllegalArgumentException("Crop rectangle does not fit within image data.");
        }
        this.f35065c = bArr;
        this.f35066d = i11;
        this.f35067e = i12;
        this.f35068f = i13;
        this.f35069g = i14;
        if (z11) {
            n(i15, i16);
        }
    }

    @Override // com.google.zxing.e
    public e a(int i11, int i12, int i13, int i14) {
        return new h(this.f35065c, this.f35066d, this.f35067e, this.f35068f + i11, this.f35069g + i12, i13, i14, false);
    }

    @Override // com.google.zxing.e
    public byte[] c() {
        int e11 = e();
        int b11 = b();
        int i11 = this.f35066d;
        if (e11 == i11 && b11 == this.f35067e) {
            return this.f35065c;
        }
        int i12 = e11 * b11;
        byte[] bArr = new byte[i12];
        int i13 = (this.f35069g * i11) + this.f35068f;
        if (e11 == i11) {
            System.arraycopy(this.f35065c, i13, bArr, 0, i12);
            return bArr;
        }
        for (int i14 = 0; i14 < b11; i14++) {
            System.arraycopy(this.f35065c, i13, bArr, i14 * e11, e11);
            i13 += this.f35066d;
        }
        return bArr;
    }

    @Override // com.google.zxing.e
    public byte[] d(int i11, byte[] bArr) {
        if (i11 < 0 || i11 >= b()) {
            throw new IllegalArgumentException("Requested row is outside the image: ".concat(String.valueOf(i11)));
        }
        int e11 = e();
        if (bArr == null || bArr.length < e11) {
            bArr = new byte[e11];
        }
        System.arraycopy(this.f35065c, ((i11 + this.f35069g) * this.f35066d) + this.f35068f, bArr, 0, e11);
        return bArr;
    }

    @Override // com.google.zxing.e
    public boolean g() {
        return true;
    }

    public int k() {
        return b() / 2;
    }

    public int l() {
        return e() / 2;
    }

    public int[] m() {
        int e11 = e() / 2;
        int b11 = b() / 2;
        int[] iArr = new int[e11 * b11];
        byte[] bArr = this.f35065c;
        int i11 = (this.f35069g * this.f35066d) + this.f35068f;
        for (int i12 = 0; i12 < b11; i12++) {
            int i13 = i12 * e11;
            for (int i14 = 0; i14 < e11; i14++) {
                iArr[i13 + i14] = ((bArr[(i14 << 1) + i11] & 255) * 65793) | (-16777216);
            }
            i11 += this.f35066d << 1;
        }
        return iArr;
    }

    public final void n(int i11, int i12) {
        byte[] bArr = this.f35065c;
        int i13 = (this.f35069g * this.f35066d) + this.f35068f;
        int i14 = 0;
        while (i14 < i12) {
            int i15 = (i11 / 2) + i13;
            int i16 = (i13 + i11) - 1;
            int i17 = i13;
            while (i17 < i15) {
                byte b11 = bArr[i17];
                bArr[i17] = bArr[i16];
                bArr[i16] = b11;
                i17++;
                i16--;
            }
            i14++;
            i13 += this.f35066d;
        }
    }
}
