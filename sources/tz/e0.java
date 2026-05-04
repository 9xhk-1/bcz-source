package tz;

import android.os.Handler;
import io.openinstall.sdk.az;

/* loaded from: classes8.dex */
public abstract class e0 extends c0 {

    /* renamed from: j, reason: collision with root package name */
    public final Handler f91264j;

    /* renamed from: k, reason: collision with root package name */
    public String f91265k;

    public e0(q0 q0Var) {
        super(q0Var);
        this.f91265k = "";
        this.f91264j = q0Var.j();
    }

    public abstract void b();

    public abstract void c(az azVar);

    public abstract az d();

    @Override // java.lang.Runnable
    public void run() {
        System.currentTimeMillis();
        b();
        this.f91264j.post(new f0(this, d()));
        System.currentTimeMillis();
    }
}
