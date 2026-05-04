package com.google.zxing;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public final e f35053a;

    public a(e eVar) {
        this.f35053a = eVar;
    }

    public abstract a a(e eVar);

    public abstract kp.b b() throws NotFoundException;

    public abstract kp.a c(int i11, kp.a aVar) throws NotFoundException;

    public final int d() {
        return this.f35053a.b();
    }

    public final e e() {
        return this.f35053a;
    }

    public final int f() {
        return this.f35053a.e();
    }
}
