package com.google.zxing;

import androidx.constraintlayout.core.motion.utils.TypedValues;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public final class i extends e {

    /* renamed from: c, reason: collision with root package name */
    public final byte[] f35070c;

    /* renamed from: d, reason: collision with root package name */
    public final int f35071d;

    /* renamed from: e, reason: collision with root package name */
    public final int f35072e;

    /* renamed from: f, reason: collision with root package name */
    public final int f35073f;

    /* renamed from: g, reason: collision with root package name */
    public final int f35074g;

    public i(int i11, int i12, int[] iArr) {
        super(i11, i12);
        this.f35071d = i11;
        this.f35072e = i12;
        this.f35073f = 0;
        this.f35074g = 0;
        int i13 = i11 * i12;
        this.f35070c = new byte[i13];
        for (int i14 = 0; i14 < i13; i14++) {
            int i15 = iArr[i14];
            this.f35070c[i14] = (byte) (((((i15 >> 16) & 255) + ((i15 >> 7) & TypedValues.PositionType.TYPE_POSITION_TYPE)) + (i15 & 255)) / 4);
        }
    }

    @Override // com.google.zxing.e
    public e a(int i11, int i12, int i13, int i14) {
        return new i(this.f35070c, this.f35071d, this.f35072e, this.f35073f + i11, this.f35074g + i12, i13, i14);
    }

    @Override // com.google.zxing.e
    public byte[] c() {
        int e11 = e();
        int b11 = b();
        int i11 = this.f35071d;
        if (e11 == i11 && b11 == this.f35072e) {
            return this.f35070c;
        }
        int i12 = e11 * b11;
        byte[] bArr = new byte[i12];
        int i13 = (this.f35074g * i11) + this.f35073f;
        if (e11 == i11) {
            System.arraycopy(this.f35070c, i13, bArr, 0, i12);
            return bArr;
        }
        for (int i14 = 0; i14 < b11; i14++) {
            System.arraycopy(this.f35070c, i13, bArr, i14 * e11, e11);
            i13 += this.f35071d;
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
        System.arraycopy(this.f35070c, ((i11 + this.f35074g) * this.f35071d) + this.f35073f, bArr, 0, e11);
        return bArr;
    }

    @Override // com.google.zxing.e
    public boolean g() {
        return true;
    }

    public i(byte[] bArr, int i11, int i12, int i13, int i14, int i15, int i16) {
        super(i15, i16);
        if (i15 + i13 <= i11 && i16 + i14 <= i12) {
            this.f35070c = bArr;
            this.f35071d = i11;
            this.f35072e = i12;
            this.f35073f = i13;
            this.f35074g = i14;
            return;
        }
        throw new IllegalArgumentException("Crop rectangle does not fit within image data.");
    }
}
