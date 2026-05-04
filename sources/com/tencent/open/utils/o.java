package com.tencent.open.utils;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes6.dex */
public final class o implements Cloneable {

    /* renamed from: a, reason: collision with root package name */
    private int f44619a;

    public o(byte[] bArr) {
        this(bArr, 0);
    }

    public byte[] a() {
        int i11 = this.f44619a;
        return new byte[]{(byte) (i11 & 255), (byte) ((i11 & 65280) >> 8)};
    }

    public int b() {
        return this.f44619a;
    }

    public boolean equals(Object obj) {
        return obj != null && (obj instanceof o) && this.f44619a == ((o) obj).b();
    }

    public int hashCode() {
        return this.f44619a;
    }

    public o(byte[] bArr, int i11) {
        int i12 = (bArr[i11 + 1] << 8) & 65280;
        this.f44619a = i12;
        this.f44619a = i12 + (bArr[i11] & 255);
    }

    public o(int i11) {
        this.f44619a = i11;
    }
}
