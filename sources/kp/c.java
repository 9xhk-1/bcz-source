package kp;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final byte[] f68543a;

    /* renamed from: b, reason: collision with root package name */
    public int f68544b;

    /* renamed from: c, reason: collision with root package name */
    public int f68545c;

    public c(byte[] bArr) {
        this.f68543a = bArr;
    }

    public int a() {
        return ((this.f68543a.length - this.f68544b) * 8) - this.f68545c;
    }

    public int b() {
        return this.f68545c;
    }

    public int c() {
        return this.f68544b;
    }

    public int d(int i11) {
        if (i11 <= 0 || i11 > 32 || i11 > a()) {
            throw new IllegalArgumentException(String.valueOf(i11));
        }
        int i12 = this.f68545c;
        int i13 = 0;
        if (i12 > 0) {
            int i14 = 8 - i12;
            int i15 = i11 < i14 ? i11 : i14;
            int i16 = i14 - i15;
            byte[] bArr = this.f68543a;
            int i17 = this.f68544b;
            int i18 = (((255 >> (8 - i15)) << i16) & bArr[i17]) >> i16;
            i11 -= i15;
            int i19 = i12 + i15;
            this.f68545c = i19;
            if (i19 == 8) {
                this.f68545c = 0;
                this.f68544b = i17 + 1;
            }
            i13 = i18;
        }
        if (i11 > 0) {
            while (i11 >= 8) {
                int i21 = i13 << 8;
                byte[] bArr2 = this.f68543a;
                int i22 = this.f68544b;
                i13 = (bArr2[i22] & 255) | i21;
                this.f68544b = i22 + 1;
                i11 -= 8;
            }
            if (i11 > 0) {
                int i23 = 8 - i11;
                int i24 = ((((255 >> i23) << i23) & this.f68543a[this.f68544b]) >> i23) | (i13 << i11);
                this.f68545c += i11;
                return i24;
            }
        }
        return i13;
    }
}
