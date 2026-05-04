package com.xiaomi.push;

/* loaded from: classes8.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public static final a f45238a = new a(new byte[0]);

    /* renamed from: a, reason: collision with other field name */
    private volatile int f122a = 0;

    /* renamed from: a, reason: collision with other field name */
    private final byte[] f123a;

    private a(byte[] bArr) {
        this.f123a = bArr;
    }

    public int a() {
        return this.f123a.length;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        byte[] bArr = this.f123a;
        int length = bArr.length;
        byte[] bArr2 = ((a) obj).f123a;
        if (length != bArr2.length) {
            return false;
        }
        for (int i11 = 0; i11 < length; i11++) {
            if (bArr[i11] != bArr2[i11]) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        int i11 = this.f122a;
        if (i11 != 0) {
            return i11;
        }
        byte[] bArr = this.f123a;
        int length = bArr.length;
        for (byte b11 : bArr) {
            length = (length * 31) + b11;
        }
        if (length == 0) {
            length = 1;
        }
        this.f122a = length;
        return length;
    }

    public static a a(byte[] bArr) {
        return a(bArr, 0, bArr.length);
    }

    public static a a(byte[] bArr, int i11, int i12) {
        byte[] bArr2 = new byte[i12];
        System.arraycopy(bArr, i11, bArr2, 0, i12);
        return new a(bArr2);
    }

    /* renamed from: a, reason: collision with other method in class */
    public byte[] m5712a() {
        byte[] bArr = this.f123a;
        int length = bArr.length;
        byte[] bArr2 = new byte[length];
        System.arraycopy(bArr, 0, bArr2, 0, length);
        return bArr2;
    }
}
