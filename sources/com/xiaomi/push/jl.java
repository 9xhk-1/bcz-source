package com.xiaomi.push;

/* loaded from: classes8.dex */
public class jl extends jn {

    /* renamed from: a, reason: collision with root package name */
    private int f46177a;

    /* renamed from: a, reason: collision with other field name */
    private iv f848a;

    public jl(int i11) {
        this.f848a = new iv(i11);
    }

    @Override // com.xiaomi.push.jn
    public int a(byte[] bArr, int i11, int i12) {
        byte[] m6153a = this.f848a.m6153a();
        if (i12 > this.f848a.a() - this.f46177a) {
            i12 = this.f848a.a() - this.f46177a;
        }
        if (i12 > 0) {
            System.arraycopy(m6153a, this.f46177a, bArr, i11, i12);
            this.f46177a += i12;
        }
        return i12;
    }

    public int a_() {
        return this.f848a.size();
    }

    @Override // com.xiaomi.push.jn
    /* renamed from: a */
    public void mo6179a(byte[] bArr, int i11, int i12) {
        this.f848a.write(bArr, i11, i12);
    }
}
