package com.google.zxing;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public final class d extends e {

    /* renamed from: c, reason: collision with root package name */
    public final e f35058c;

    public d(e eVar) {
        super(eVar.e(), eVar.b());
        this.f35058c = eVar;
    }

    @Override // com.google.zxing.e
    public e a(int i11, int i12, int i13, int i14) {
        return new d(this.f35058c.a(i11, i12, i13, i14));
    }

    @Override // com.google.zxing.e
    public byte[] c() {
        byte[] c11 = this.f35058c.c();
        int e11 = e() * b();
        byte[] bArr = new byte[e11];
        for (int i11 = 0; i11 < e11; i11++) {
            bArr[i11] = (byte) (255 - (c11[i11] & 255));
        }
        return bArr;
    }

    @Override // com.google.zxing.e
    public byte[] d(int i11, byte[] bArr) {
        byte[] d11 = this.f35058c.d(i11, bArr);
        int e11 = e();
        for (int i12 = 0; i12 < e11; i12++) {
            d11[i12] = (byte) (255 - (d11[i12] & 255));
        }
        return d11;
    }

    @Override // com.google.zxing.e
    public e f() {
        return this.f35058c;
    }

    @Override // com.google.zxing.e
    public boolean g() {
        return this.f35058c.g();
    }

    @Override // com.google.zxing.e
    public boolean h() {
        return this.f35058c.h();
    }

    @Override // com.google.zxing.e
    public e i() {
        return new d(this.f35058c.i());
    }

    @Override // com.google.zxing.e
    public e j() {
        return new d(this.f35058c.j());
    }
}
