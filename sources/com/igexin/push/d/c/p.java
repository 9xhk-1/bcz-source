package com.igexin.push.d.c;

import android.text.TextUtils;

/* loaded from: classes7.dex */
public final class p extends c {

    /* renamed from: a, reason: collision with root package name */
    public static final int f38505a = 9;

    /* renamed from: b, reason: collision with root package name */
    public long f38506b;

    /* renamed from: c, reason: collision with root package name */
    public String f38507c = "";

    /* renamed from: d, reason: collision with root package name */
    public String f38508d = "";

    /* renamed from: e, reason: collision with root package name */
    public String f38509e = "";

    public p() {
        this.f38438m = 9;
    }

    private static String a(byte[] bArr, int i11, int i12) {
        try {
            return new String(bArr, i11, i12, "UTF-8");
        } catch (Exception unused) {
            return "";
        }
    }

    @Override // com.igexin.push.d.c.c
    public final byte[] b() {
        if (TextUtils.isEmpty(this.f38508d) || TextUtils.isEmpty(this.f38509e)) {
            byte[] bytes = this.f38507c.getBytes();
            byte[] bArr = new byte[bytes.length + 9];
            com.igexin.c.a.b.g.a(this.f38506b, bArr, 0);
            bArr[8] = (byte) bytes.length;
            System.arraycopy(bytes, 0, bArr, 9, bytes.length);
            return bArr;
        }
        byte[] bytes2 = this.f38507c.getBytes();
        byte[] bytes3 = this.f38508d.getBytes();
        byte[] bytes4 = this.f38509e.getBytes();
        byte[] bArr2 = new byte[bytes2.length + 8 + bytes3.length + bytes4.length + 3];
        com.igexin.c.a.b.g.a(this.f38506b, bArr2, 0);
        bArr2[8] = (byte) bytes2.length;
        System.arraycopy(bytes2, 0, bArr2, 9, bytes2.length);
        int length = bytes2.length;
        int i11 = length + 9;
        int i12 = length + 10;
        bArr2[i11] = (byte) bytes3.length;
        System.arraycopy(bytes3, 0, bArr2, i12, bytes3.length);
        int length2 = i12 + bytes3.length;
        bArr2[length2] = (byte) bytes4.length;
        System.arraycopy(bytes4, 0, bArr2, length2 + 1, bytes4.length);
        return bArr2;
    }

    @Override // com.igexin.push.d.c.c
    public final void a(byte[] bArr) {
        this.f38506b = com.igexin.c.a.b.g.d(bArr, 0);
        int i11 = 8;
        if (bArr.length > 8) {
            int i12 = bArr[8] & 255;
            i11 = 9;
            if (i12 > 0) {
                this.f38507c = a(bArr, 9, i12);
                i11 = 9 + i12;
            }
        }
        if (bArr.length > i11) {
            int i13 = i11 + 1;
            int i14 = bArr[i11] & 255;
            if (i14 > 0) {
                this.f38508d = a(bArr, i13, i14);
                i11 = i14 + i13;
            } else {
                i11 = i13;
            }
        }
        if (bArr.length > i11) {
            int i15 = i11 + 1;
            int i16 = bArr[i11] & 255;
            if (i16 > 0) {
                this.f38509e = a(bArr, i15, i16);
            }
        }
    }
}
