package com.google.zxing;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public abstract class e {

    /* renamed from: a, reason: collision with root package name */
    public final int f35059a;

    /* renamed from: b, reason: collision with root package name */
    public final int f35060b;

    public e(int i11, int i12) {
        this.f35059a = i11;
        this.f35060b = i12;
    }

    public e a(int i11, int i12, int i13, int i14) {
        throw new UnsupportedOperationException("This luminance source does not support cropping.");
    }

    public final int b() {
        return this.f35060b;
    }

    public abstract byte[] c();

    public abstract byte[] d(int i11, byte[] bArr);

    public final int e() {
        return this.f35059a;
    }

    public e f() {
        return new d(this);
    }

    public boolean g() {
        return false;
    }

    public boolean h() {
        return false;
    }

    public e i() {
        throw new UnsupportedOperationException("This luminance source does not support rotation by 90 degrees.");
    }

    public e j() {
        throw new UnsupportedOperationException("This luminance source does not support rotation by 45 degrees.");
    }

    public final String toString() {
        int i11 = this.f35059a;
        byte[] bArr = new byte[i11];
        StringBuilder sb2 = new StringBuilder(this.f35060b * (i11 + 1));
        for (int i12 = 0; i12 < this.f35060b; i12++) {
            bArr = d(i12, bArr);
            for (int i13 = 0; i13 < this.f35059a; i13++) {
                int i14 = bArr[i13] & 255;
                sb2.append(i14 < 64 ? '#' : i14 < 128 ? '+' : i14 < 192 ? '.' : ' ');
            }
            sb2.append('\n');
        }
        return sb2.toString();
    }
}
