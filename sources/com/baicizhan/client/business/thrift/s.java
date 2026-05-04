package com.baicizhan.client.business.thrift;

import android.os.Process;
import java.util.concurrent.BlockingQueue;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public class s extends Thread {

    /* renamed from: a, reason: collision with root package name */
    public final BlockingQueue<q> f16680a;

    /* renamed from: b, reason: collision with root package name */
    public final r f16681b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f16682c = false;

    public s(r proxy, BlockingQueue<q> queue) {
        this.f16681b = proxy;
        this.f16680a = queue;
    }

    public void a() {
        this.f16682c = true;
        interrupt();
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public void run() {
        Process.setThreadPriority(10);
        while (true) {
            try {
                q take = this.f16680a.take();
                if (take != null) {
                    take.e(this, this.f16681b);
                }
            } catch (InterruptedException unused) {
                if (this.f16682c) {
                    qb.c.b("leijie", "stop thread worker " + getId(), new Object[0]);
                    return;
                }
            }
        }
    }
}
