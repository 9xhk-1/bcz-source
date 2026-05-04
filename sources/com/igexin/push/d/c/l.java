package com.igexin.push.d.c;

/* loaded from: classes7.dex */
public final class l extends c {

    /* renamed from: a, reason: collision with root package name */
    public static final int f38487a = 36;

    /* renamed from: b, reason: collision with root package name */
    public long f38488b;

    public l() {
        this.f38438m = 36;
        this.f38439n = (byte) 20;
    }

    @Override // com.igexin.push.d.c.c
    public final void a(byte[] bArr) {
        this.f38488b = com.igexin.c.a.b.g.d(bArr, 0);
    }

    @Override // com.igexin.push.d.c.c
    public final byte[] b() {
        byte[] bArr = new byte[8];
        com.igexin.c.a.b.g.a(this.f38488b, bArr, 0);
        return bArr;
    }
}
