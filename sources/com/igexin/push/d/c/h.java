package com.igexin.push.d.c;

/* loaded from: classes7.dex */
public final class h extends c {

    /* renamed from: a, reason: collision with root package name */
    public static final int f38470a = 97;

    /* renamed from: b, reason: collision with root package name */
    public byte f38471b;

    /* renamed from: c, reason: collision with root package name */
    public byte f38472c;

    public h() {
        this.f38438m = 97;
    }

    @Override // com.igexin.push.d.c.c, com.igexin.c.a.d.a.a
    public final void a() {
        this.f38471b = (byte) 0;
        this.f38472c = (byte) 0;
    }

    @Override // com.igexin.push.d.c.c
    public final byte[] b() {
        return new byte[]{this.f38471b, this.f38472c};
    }

    @Override // com.igexin.push.d.c.c
    public final void a(byte[] bArr) {
        this.f38471b = bArr[0];
        this.f38472c = bArr[1];
    }
}
