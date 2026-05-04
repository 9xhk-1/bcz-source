package com.xiaomi.push;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;

/* loaded from: classes8.dex */
public class am {

    /* renamed from: a, reason: collision with root package name */
    private int f45253a;

    /* renamed from: a, reason: collision with other field name */
    private Handler f133a;

    /* renamed from: a, reason: collision with other field name */
    private a f134a;

    /* renamed from: a, reason: collision with other field name */
    private volatile b f135a;

    /* renamed from: a, reason: collision with other field name */
    private volatile boolean f136a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f45254b;

    public class a extends Thread {

        /* renamed from: a, reason: collision with other field name */
        private final LinkedBlockingQueue<b> f137a;

        public a() {
            super("PackageProcessor");
            this.f137a = new LinkedBlockingQueue<>();
        }

        private void a(int i11, b bVar) {
            try {
                am.this.f133a.sendMessage(am.this.f133a.obtainMessage(i11, bVar));
            } catch (Exception e11) {
                com.xiaomi.channel.commonutils.logger.b.a(e11);
            }
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            long j11 = am.this.f45253a > 0 ? am.this.f45253a : Long.MAX_VALUE;
            while (!am.this.f136a) {
                try {
                    b poll = this.f137a.poll(j11, TimeUnit.SECONDS);
                    am.this.f135a = poll;
                    if (poll != null) {
                        a(0, poll);
                        poll.b();
                        a(1, poll);
                    } else if (am.this.f45253a > 0) {
                        am.this.a();
                    }
                } catch (InterruptedException e11) {
                    com.xiaomi.channel.commonutils.logger.b.a(e11);
                }
            }
        }

        public void a(b bVar) {
            try {
                this.f137a.add(bVar);
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
    }

    public am() {
        this(false);
    }

    public am(boolean z11) {
        this(z11, 0);
    }

    public am(boolean z11, int i11) {
        this.f133a = null;
        this.f136a = false;
        this.f45253a = 0;
        this.f133a = new an(this, Looper.getMainLooper());
        this.f45254b = z11;
        this.f45253a = i11;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void a() {
        this.f134a = null;
        this.f136a = true;
    }

    public synchronized void a(b bVar) {
        try {
            if (this.f134a == null) {
                a aVar = new a();
                this.f134a = aVar;
                aVar.setDaemon(this.f45254b);
                this.f136a = false;
                this.f134a.start();
            }
            this.f134a.a(bVar);
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public void a(b bVar, long j11) {
        this.f133a.postDelayed(new ao(this, bVar), j11);
    }

    public static abstract class b {
        public abstract void b();

        public void a() {
        }

        /* renamed from: c */
        public void mo5820c() {
        }
    }
}
