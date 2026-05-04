package com.meizu.cloud.pushsdk.c.g;

/* loaded from: classes7.dex */
final class j {

    /* renamed from: a, reason: collision with root package name */
    final byte[] f39661a;

    /* renamed from: b, reason: collision with root package name */
    int f39662b;

    /* renamed from: c, reason: collision with root package name */
    int f39663c;

    /* renamed from: d, reason: collision with root package name */
    boolean f39664d;

    /* renamed from: e, reason: collision with root package name */
    final boolean f39665e;

    /* renamed from: f, reason: collision with root package name */
    j f39666f;

    /* renamed from: g, reason: collision with root package name */
    j f39667g;

    public j() {
        this.f39661a = new byte[2048];
        this.f39665e = true;
        this.f39664d = false;
    }

    public j a() {
        j jVar = this.f39666f;
        j jVar2 = jVar != this ? jVar : null;
        j jVar3 = this.f39667g;
        jVar3.f39666f = jVar;
        this.f39666f.f39667g = jVar3;
        this.f39666f = null;
        this.f39667g = null;
        return jVar2;
    }

    public void b() {
        j jVar = this.f39667g;
        if (jVar == this) {
            throw new IllegalStateException();
        }
        if (jVar.f39665e) {
            int i11 = this.f39663c - this.f39662b;
            if (i11 > (2048 - jVar.f39663c) + (jVar.f39664d ? 0 : jVar.f39662b)) {
                return;
            }
            a(jVar, i11);
            a();
            k.a(this);
        }
    }

    public j(j jVar) {
        this(jVar.f39661a, jVar.f39662b, jVar.f39663c);
    }

    public j a(int i11) {
        if (i11 <= 0 || i11 > this.f39663c - this.f39662b) {
            throw new IllegalArgumentException();
        }
        j jVar = new j(this);
        jVar.f39663c = jVar.f39662b + i11;
        this.f39662b += i11;
        this.f39667g.a(jVar);
        return jVar;
    }

    public j(byte[] bArr, int i11, int i12) {
        this.f39661a = bArr;
        this.f39662b = i11;
        this.f39663c = i12;
        this.f39665e = false;
        this.f39664d = true;
    }

    public j a(j jVar) {
        jVar.f39667g = this;
        jVar.f39666f = this.f39666f;
        this.f39666f.f39667g = jVar;
        this.f39666f = jVar;
        return jVar;
    }

    public void a(j jVar, int i11) {
        if (!jVar.f39665e) {
            throw new IllegalArgumentException();
        }
        int i12 = jVar.f39663c;
        if (i12 + i11 > 2048) {
            if (jVar.f39664d) {
                throw new IllegalArgumentException();
            }
            int i13 = jVar.f39662b;
            if ((i12 + i11) - i13 > 2048) {
                throw new IllegalArgumentException();
            }
            byte[] bArr = jVar.f39661a;
            System.arraycopy(bArr, i13, bArr, 0, i12 - i13);
            jVar.f39663c -= jVar.f39662b;
            jVar.f39662b = 0;
        }
        System.arraycopy(this.f39661a, this.f39662b, jVar.f39661a, jVar.f39663c, i11);
        jVar.f39663c += i11;
        this.f39662b += i11;
    }
}
