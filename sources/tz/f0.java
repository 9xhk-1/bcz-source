package tz;

import io.openinstall.sdk.az;

/* loaded from: classes8.dex */
public class f0 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ az f91267a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e0 f91268b;

    public f0(e0 e0Var, az azVar) {
        this.f91268b = e0Var;
        this.f91267a = azVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f91268b.c(this.f91267a);
    }
}
