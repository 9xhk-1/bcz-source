package com.tencent.bugly.proguard;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public final class bn extends m implements Cloneable {

    /* renamed from: d, reason: collision with root package name */
    static byte[] f42480d;

    /* renamed from: a, reason: collision with root package name */
    public byte f42481a;

    /* renamed from: b, reason: collision with root package name */
    public String f42482b;

    /* renamed from: c, reason: collision with root package name */
    public byte[] f42483c;

    public bn() {
        this.f42481a = (byte) 0;
        this.f42482b = "";
        this.f42483c = null;
    }

    @Override // com.tencent.bugly.proguard.m
    public final void a(StringBuilder sb2, int i11) {
    }

    @Override // com.tencent.bugly.proguard.m
    public final void a(l lVar) {
        lVar.a(this.f42481a, 0);
        lVar.a(this.f42482b, 1);
        byte[] bArr = this.f42483c;
        if (bArr != null) {
            lVar.a(bArr, 2);
        }
    }

    public bn(byte b11, String str, byte[] bArr) {
        this.f42481a = b11;
        this.f42482b = str;
        this.f42483c = bArr;
    }

    @Override // com.tencent.bugly.proguard.m
    public final void a(k kVar) {
        this.f42481a = kVar.a(this.f42481a, 0, true);
        this.f42482b = kVar.b(1, true);
        if (f42480d == null) {
            f42480d = new byte[]{0};
        }
        this.f42483c = kVar.c(2, false);
    }
}
