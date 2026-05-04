package com.huawei.hms.hatool;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public class h {

    /* renamed from: a, reason: collision with root package name */
    private byte[] f35813a;

    /* renamed from: b, reason: collision with root package name */
    private int f35814b = 0;

    public h(int i11) {
        this.f35813a = null;
        this.f35813a = new byte[i11];
    }

    public void a(byte[] bArr, int i11) {
        if (i11 <= 0) {
            return;
        }
        byte[] bArr2 = this.f35813a;
        int length = bArr2.length;
        int i12 = this.f35814b;
        if (length - i12 >= i11) {
            System.arraycopy(bArr, 0, bArr2, i12, i11);
        } else {
            byte[] bArr3 = new byte[(bArr2.length + i11) << 1];
            System.arraycopy(bArr2, 0, bArr3, 0, i12);
            System.arraycopy(bArr, 0, bArr3, this.f35814b, i11);
            this.f35813a = bArr3;
        }
        this.f35814b += i11;
    }

    public int b() {
        return this.f35814b;
    }

    public byte[] a() {
        int i11 = this.f35814b;
        if (i11 <= 0) {
            return new byte[0];
        }
        byte[] bArr = new byte[i11];
        System.arraycopy(this.f35813a, 0, bArr, 0, i11);
        return bArr;
    }
}
