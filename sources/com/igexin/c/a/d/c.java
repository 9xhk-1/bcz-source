package com.igexin.c.a.d;

import java.util.concurrent.TimeUnit;

/* loaded from: classes7.dex */
public abstract class c implements com.igexin.c.a.d.a.g {

    /* renamed from: a, reason: collision with root package name */
    protected boolean f37209a = true;

    @Override // com.igexin.c.a.d.a.g
    public final boolean a(long j11, f fVar) {
        return TimeUnit.SECONDS.toMillis((long) fVar.B) < j11 - fVar.f37236z;
    }

    @Override // com.igexin.c.a.d.a.g
    public final long b(long j11, f fVar) {
        return (TimeUnit.SECONDS.toMillis(fVar.B) + fVar.f37236z) - j11;
    }

    @Override // com.igexin.c.a.d.a.g
    public final boolean d() {
        return this.f37209a;
    }

    @Override // com.igexin.c.a.d.a.g
    public void b() {
        this.f37209a = false;
    }
}
