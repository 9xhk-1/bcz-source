package com.igexin.push.d.c;

/* loaded from: classes7.dex */
public final class q extends c {

    /* renamed from: a, reason: collision with root package name */
    public static final int f38510a = 20;

    /* renamed from: b, reason: collision with root package name */
    public int f38511b;

    public q() {
        this.f38438m = 20;
    }

    @Override // com.igexin.push.d.c.c
    public final void a(byte[] bArr) {
        if (bArr.length == 1) {
            this.f38511b = bArr[0] & 255;
        }
    }

    @Override // com.igexin.push.d.c.c
    public final byte[] b() {
        return null;
    }
}
