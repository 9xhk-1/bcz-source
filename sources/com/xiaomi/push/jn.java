package com.xiaomi.push;

/* loaded from: classes8.dex */
public abstract class jn {
    public int a() {
        return 0;
    }

    public abstract int a(byte[] bArr, int i11, int i12);

    /* renamed from: a */
    public abstract void mo6179a(byte[] bArr, int i11, int i12);

    public int b() {
        return -1;
    }

    public void a(int i11) {
    }

    public int b(byte[] bArr, int i11, int i12) {
        int i13 = 0;
        while (i13 < i12) {
            int a11 = a(bArr, i11 + i13, i12 - i13);
            if (a11 <= 0) {
                throw new jo("Cannot read. Remote side has closed. Tried to read " + i12 + " bytes, but only got " + i13 + " bytes.");
            }
            i13 += a11;
        }
        return i13;
    }

    /* renamed from: a */
    public byte[] mo6180a() {
        return null;
    }
}
