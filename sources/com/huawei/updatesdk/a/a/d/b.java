package com.huawei.updatesdk.a.a.d;

import java.io.UnsupportedEncodingException;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public class b {

    /* renamed from: b, reason: collision with root package name */
    private int f36812b = 1024;

    /* renamed from: c, reason: collision with root package name */
    private int f36813c = 0;

    /* renamed from: a, reason: collision with root package name */
    private byte[] f36811a = new byte[1024];

    public String a() {
        int i11 = this.f36813c;
        if (i11 <= 0) {
            return null;
        }
        try {
            return new String(this.f36811a, 0, i11, "UTF-8");
        } catch (UnsupportedEncodingException unused) {
            return null;
        }
    }

    public static String a(byte[] bArr) {
        char[] cArr = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
        char[] cArr2 = new char[bArr.length * 2];
        int i11 = 0;
        for (byte b11 : bArr) {
            int i12 = i11 + 1;
            cArr2[i11] = cArr[(b11 >>> 4) & 15];
            i11 += 2;
            cArr2[i12] = cArr[b11 & 15];
        }
        return String.valueOf(cArr2);
    }

    public void a(byte[] bArr, int i11) {
        if (i11 <= 0) {
            return;
        }
        byte[] bArr2 = this.f36811a;
        int length = bArr2.length;
        int i12 = this.f36813c;
        if (length - i12 >= i11) {
            System.arraycopy(bArr, 0, bArr2, i12, i11);
        } else {
            byte[] bArr3 = new byte[(bArr2.length + i11) << 1];
            System.arraycopy(bArr2, 0, bArr3, 0, i12);
            System.arraycopy(bArr, 0, bArr3, this.f36813c, i11);
            this.f36811a = bArr3;
        }
        this.f36813c += i11;
    }
}
