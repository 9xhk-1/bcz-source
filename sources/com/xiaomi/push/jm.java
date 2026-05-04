package com.xiaomi.push;

/* loaded from: classes8.dex */
public final class jm extends jn {

    /* renamed from: a, reason: collision with root package name */
    private int f46178a;

    /* renamed from: a, reason: collision with other field name */
    private byte[] f849a;

    /* renamed from: b, reason: collision with root package name */
    private int f46179b;

    @Override // com.xiaomi.push.jn
    public int a() {
        return this.f46178a;
    }

    @Override // com.xiaomi.push.jn
    public int b() {
        return this.f46179b - this.f46178a;
    }

    @Override // com.xiaomi.push.jn
    public int a(byte[] bArr, int i11, int i12) {
        int b11 = b();
        if (i12 > b11) {
            i12 = b11;
        }
        if (i12 > 0) {
            System.arraycopy(this.f849a, this.f46178a, bArr, i11, i12);
            a(i12);
        }
        return i12;
    }

    public void b(byte[] bArr, int i11, int i12) {
        this.f849a = bArr;
        this.f46178a = i11;
        this.f46179b = i11 + i12;
    }

    @Override // com.xiaomi.push.jn
    public void a(int i11) {
        this.f46178a += i11;
    }

    public void a(byte[] bArr) {
        b(bArr, 0, bArr.length);
    }

    @Override // com.xiaomi.push.jn
    /* renamed from: a */
    public void mo6179a(byte[] bArr, int i11, int i12) {
        throw new UnsupportedOperationException("No writing allowed!");
    }

    @Override // com.xiaomi.push.jn
    /* renamed from: a, reason: collision with other method in class */
    public byte[] mo6180a() {
        return this.f849a;
    }
}
