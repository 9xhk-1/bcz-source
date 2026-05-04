package com.xiaomi.push.service;

import android.content.Intent;
import android.os.SystemClock;
import com.tencent.connect.common.Constants;
import com.xiaomi.push.service.XMPushService;
import java.util.concurrent.RejectedExecutionException;

/* loaded from: classes8.dex */
public class p {

    /* renamed from: a, reason: collision with root package name */
    private static long f46380a;

    /* renamed from: b, reason: collision with root package name */
    private static long f46381b;

    /* renamed from: c, reason: collision with root package name */
    private static long f46382c;

    /* renamed from: a, reason: collision with other field name */
    private final a f1022a;

    /* renamed from: a, reason: collision with other field name */
    private final c f1023a;

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private final c f46383a;

        public a(c cVar) {
            this.f46383a = cVar;
        }

        public void finalize() {
            try {
                synchronized (this.f46383a) {
                    this.f46383a.f46387c = true;
                    this.f46383a.notify();
                }
            } finally {
                super.finalize();
            }
        }
    }

    public static abstract class b implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        protected int f46384a;

        public b(int i11) {
            this.f46384a = i11;
        }
    }

    public static final class c extends Thread {

        /* renamed from: b, reason: collision with other field name */
        private boolean f1026b;

        /* renamed from: c, reason: collision with root package name */
        private boolean f46387c;

        /* renamed from: a, reason: collision with root package name */
        private volatile long f46385a = 0;

        /* renamed from: a, reason: collision with other field name */
        private volatile boolean f1025a = false;

        /* renamed from: b, reason: collision with root package name */
        private long f46386b = 50;

        /* renamed from: a, reason: collision with other field name */
        private a f1024a = new a();

        public static final class a {

            /* renamed from: a, reason: collision with root package name */
            private int f46388a;

            /* renamed from: a, reason: collision with other field name */
            private d[] f1027a;

            /* renamed from: b, reason: collision with root package name */
            private int f46389b;

            /* renamed from: c, reason: collision with root package name */
            private int f46390c;

            private a() {
                this.f46388a = 256;
                this.f1027a = new d[256];
                this.f46389b = 0;
                this.f46390c = 0;
            }

            private void c() {
                int i11 = this.f46389b;
                int i12 = i11 - 1;
                int i13 = (i11 - 2) / 2;
                while (true) {
                    d[] dVarArr = this.f1027a;
                    d dVar = dVarArr[i12];
                    long j11 = dVar.f1028a;
                    d dVar2 = dVarArr[i13];
                    if (j11 >= dVar2.f1028a) {
                        return;
                    }
                    dVarArr[i12] = dVar2;
                    dVarArr[i13] = dVar;
                    i12 = i13;
                    i13 = (i13 - 1) / 2;
                }
            }

            public void b() {
                int i11 = 0;
                while (i11 < this.f46389b) {
                    if (this.f1027a[i11].f1031a) {
                        this.f46390c++;
                        b(i11);
                        i11--;
                    }
                    i11++;
                }
            }

            /* JADX INFO: Access modifiers changed from: private */
            public int a(d dVar) {
                int i11 = 0;
                while (true) {
                    d[] dVarArr = this.f1027a;
                    if (i11 >= dVarArr.length) {
                        return -1;
                    }
                    if (dVarArr[i11] == dVar) {
                        return i11;
                    }
                    i11++;
                }
            }

            private void c(int i11) {
                int i12 = (i11 * 2) + 1;
                while (true) {
                    int i13 = this.f46389b;
                    if (i12 >= i13 || i13 <= 0) {
                        return;
                    }
                    int i14 = i12 + 1;
                    if (i14 < i13) {
                        d[] dVarArr = this.f1027a;
                        if (dVarArr[i14].f1028a < dVarArr[i12].f1028a) {
                            i12 = i14;
                        }
                    }
                    d[] dVarArr2 = this.f1027a;
                    d dVar = dVarArr2[i11];
                    long j11 = dVar.f1028a;
                    d dVar2 = dVarArr2[i12];
                    if (j11 < dVar2.f1028a) {
                        return;
                    }
                    dVarArr2[i11] = dVar2;
                    dVarArr2[i12] = dVar;
                    int i15 = i12;
                    i12 = (i12 * 2) + 1;
                    i11 = i15;
                }
            }

            public void b(int i11) {
                int i12;
                if (i11 < 0 || i11 >= (i12 = this.f46389b)) {
                    return;
                }
                d[] dVarArr = this.f1027a;
                int i13 = i12 - 1;
                this.f46389b = i13;
                dVarArr[i11] = dVarArr[i13];
                dVarArr[i13] = null;
                c(i11);
            }

            private void b(d dVar) {
                Intent a11;
                b bVar = dVar.f1029a;
                int i11 = bVar.f46384a;
                if (i11 == 8) {
                    XMPushService.d dVar2 = (XMPushService.d) bVar;
                    if (dVar2.a().f405a != null) {
                        dVar2.a().f405a.f932b = System.currentTimeMillis();
                        dVar2.a().f405a.f46246b = a(dVar);
                        return;
                    }
                    return;
                }
                if (i11 == 15 && (a11 = ((XMPushService.i) bVar).a()) != null && Constants.VIA_REPORT_TYPE_SHARE_TO_QQ.equals(a11.getStringExtra("ext_chid"))) {
                    a11.putExtra("enqueue", System.currentTimeMillis());
                    a11.putExtra("num", a(dVar));
                }
            }

            public d a() {
                return this.f1027a[0];
            }

            /* renamed from: a, reason: collision with other method in class */
            public void m6292a() {
                this.f1027a = new d[this.f46388a];
                this.f46389b = 0;
            }

            public void a(int i11) {
                for (int i12 = 0; i12 < this.f46389b; i12++) {
                    d dVar = this.f1027a[i12];
                    if (dVar.f46391a == i11) {
                        dVar.a();
                    }
                }
                b();
            }

            public void a(int i11, b bVar) {
                for (int i12 = 0; i12 < this.f46389b; i12++) {
                    d dVar = this.f1027a[i12];
                    if (dVar.f1029a == bVar) {
                        dVar.a();
                    }
                }
                b();
            }

            /* renamed from: a, reason: collision with other method in class */
            public void m6293a(d dVar) {
                d[] dVarArr = this.f1027a;
                int length = dVarArr.length;
                int i11 = this.f46389b;
                if (length == i11) {
                    d[] dVarArr2 = new d[i11 * 2];
                    System.arraycopy(dVarArr, 0, dVarArr2, 0, i11);
                    this.f1027a = dVarArr2;
                }
                d[] dVarArr3 = this.f1027a;
                int i12 = this.f46389b;
                this.f46389b = i12 + 1;
                dVarArr3[i12] = dVar;
                c();
                b(dVar);
            }

            /* renamed from: a, reason: collision with other method in class */
            public boolean m6294a() {
                return this.f46389b == 0;
            }

            /* renamed from: a, reason: collision with other method in class */
            public boolean m6295a(int i11) {
                for (int i12 = 0; i12 < this.f46389b; i12++) {
                    if (this.f1027a[i12].f46391a == i11) {
                        return true;
                    }
                }
                return false;
            }
        }

        public c(String str, boolean z11) {
            setName(str);
            setDaemon(z11);
            start();
        }

        /* JADX WARN: Code restructure failed: missing block: B:30:0x0096, code lost:
        
            r10.f46385a = android.os.SystemClock.uptimeMillis();
            r10.f1025a = true;
            r2.f1029a.run();
            r10.f1025a = false;
         */
        /* JADX WARN: Code restructure failed: missing block: B:34:0x00a7, code lost:
        
            r1 = move-exception;
         */
        /* JADX WARN: Code restructure failed: missing block: B:35:0x00a8, code lost:
        
            monitor-enter(r10);
         */
        /* JADX WARN: Code restructure failed: missing block: B:37:0x00a9, code lost:
        
            r10.f1026b = true;
         */
        /* JADX WARN: Code restructure failed: missing block: B:39:0x00ac, code lost:
        
            throw r1;
         */
        /* JADX WARN: Code restructure failed: missing block: B:54:0x0075, code lost:
        
            r0 = move-exception;
         */
        /* JADX WARN: Code restructure failed: missing block: B:57:0x00b1, code lost:
        
            throw r0;
         */
        /* JADX WARN: Code restructure failed: missing block: B:87:0x0007, code lost:
        
            r0 = move-exception;
         */
        /* JADX WARN: Code restructure failed: missing block: B:90:0x00b5, code lost:
        
            throw r0;
         */
        @Override // java.lang.Thread, java.lang.Runnable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public void run() {
            /*
                Method dump skipped, instructions count: 182
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.xiaomi.push.service.p.c.run():void");
        }

        public synchronized void a() {
            this.f1026b = true;
            this.f1024a.m6292a();
            notify();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void a(d dVar) {
            this.f1024a.m6293a(dVar);
            notify();
        }

        /* renamed from: a, reason: collision with other method in class */
        public boolean m6291a() {
            return this.f1025a && SystemClock.uptimeMillis() - this.f46385a > 600000;
        }
    }

    public static class d {

        /* renamed from: a, reason: collision with root package name */
        int f46391a;

        /* renamed from: a, reason: collision with other field name */
        long f1028a;

        /* renamed from: a, reason: collision with other field name */
        b f1029a;

        /* renamed from: a, reason: collision with other field name */
        final Object f1030a = new Object();

        /* renamed from: a, reason: collision with other field name */
        boolean f1031a;

        /* renamed from: b, reason: collision with root package name */
        private long f46392b;

        public void a(long j11) {
            synchronized (this.f1030a) {
                this.f46392b = j11;
            }
        }

        public boolean a() {
            boolean z11;
            synchronized (this.f1030a) {
                try {
                    z11 = !this.f1031a && this.f1028a > 0;
                    this.f1031a = true;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return z11;
        }
    }

    static {
        long elapsedRealtime = SystemClock.elapsedRealtime() > 0 ? SystemClock.elapsedRealtime() : 0L;
        f46380a = elapsedRealtime;
        f46381b = elapsedRealtime;
    }

    public p() {
        this(false);
    }

    public static synchronized long a() {
        long j11;
        synchronized (p.class) {
            try {
                long elapsedRealtime = SystemClock.elapsedRealtime();
                long j12 = f46381b;
                if (elapsedRealtime > j12) {
                    f46380a += elapsedRealtime - j12;
                }
                f46381b = elapsedRealtime;
                j11 = f46380a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return j11;
    }

    private static synchronized long b() {
        long j11;
        synchronized (p.class) {
            j11 = f46382c;
            f46382c = 1 + j11;
        }
        return j11;
    }

    public p(String str) {
        this(str, false);
    }

    /* renamed from: a, reason: collision with other method in class */
    public void m6286a() {
        com.xiaomi.channel.commonutils.logger.b.m5639a("quit. finalizer:" + this.f1022a);
        this.f1023a.a();
    }

    /* renamed from: b, reason: collision with other method in class */
    public void m6289b() {
        synchronized (this.f1023a) {
            this.f1023a.f1024a.m6292a();
        }
    }

    public p(String str, boolean z11) {
        if (str == null) {
            throw new NullPointerException("name == null");
        }
        c cVar = new c(str, z11);
        this.f1023a = cVar;
        this.f1022a = new a(cVar);
    }

    private void b(b bVar, long j11) {
        synchronized (this.f1023a) {
            try {
                if (this.f1023a.f1026b) {
                    throw new IllegalStateException("Timer was canceled");
                }
                long a11 = j11 + a();
                if (a11 < 0) {
                    throw new IllegalArgumentException("Illegal delay to start the TimerTask: " + a11);
                }
                d dVar = new d();
                dVar.f46391a = bVar.f46384a;
                dVar.f1029a = bVar;
                dVar.f1028a = a11;
                this.f1023a.a(dVar);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void a(int i11) {
        synchronized (this.f1023a) {
            this.f1023a.f1024a.a(i11);
        }
    }

    public p(boolean z11) {
        this("Timer-" + b(), z11);
    }

    public void a(int i11, b bVar) {
        synchronized (this.f1023a) {
            this.f1023a.f1024a.a(i11, bVar);
        }
    }

    public void a(b bVar) {
        if (com.xiaomi.channel.commonutils.logger.b.a() >= 1 || Thread.currentThread() == this.f1023a) {
            bVar.run();
        } else {
            com.xiaomi.channel.commonutils.logger.b.d("run job outside job job thread");
            throw new RejectedExecutionException("Run job outside job thread");
        }
    }

    public void a(b bVar, long j11) {
        if (j11 >= 0) {
            b(bVar, j11);
            return;
        }
        throw new IllegalArgumentException("delay < 0: " + j11);
    }

    /* renamed from: a, reason: collision with other method in class */
    public boolean m6287a() {
        return this.f1023a.m6291a();
    }

    /* renamed from: a, reason: collision with other method in class */
    public boolean m6288a(int i11) {
        boolean m6295a;
        synchronized (this.f1023a) {
            m6295a = this.f1023a.f1024a.m6295a(i11);
        }
        return m6295a;
    }
}
