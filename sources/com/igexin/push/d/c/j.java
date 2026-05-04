package com.igexin.push.d.c;

/* loaded from: classes7.dex */
public final class j extends c {

    /* renamed from: a, reason: collision with root package name */
    public byte f38479a;

    /* renamed from: b, reason: collision with root package name */
    public Object f38480b;

    @Override // com.igexin.push.d.c.c
    public final byte[] b() {
        byte b11 = this.f38479a;
        byte[] bytes = (b11 == 1 || b11 == 2 || (b11 != 3 && (b11 == 4 || b11 == 5 || b11 == 6 || b11 == 7))) ? ((String) this.f38480b).getBytes() : null;
        if (bytes == null) {
            return null;
        }
        byte[] bArr = new byte[bytes.length + 2];
        bArr[0] = this.f38479a;
        bArr[1] = (byte) bytes.length;
        System.arraycopy(bytes, 0, bArr, 2, bytes.length);
        return bArr;
    }

    @Override // com.igexin.push.d.c.c
    public final void a(byte[] bArr) {
    }
}
