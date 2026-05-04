package com.igexin.c.a.d;

import android.annotation.TargetApi;
import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import android.os.PowerManager;
import androidx.core.app.NotificationCompat;
import androidx.media3.common.C;
import com.baicizhan.client.business.widget.EmailAutoCompleteEditText;
import com.igexin.push.d.c.o;
import com.igexin.push.g.n;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Comparator;
import java.util.Date;
import java.util.HashMap;
import java.util.Locale;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.ReentrantLock;

/* loaded from: classes7.dex */
public class g extends BroadcastReceiver implements Comparator<f> {
    public static final long E = TimeUnit.SECONDS.toMillis(2);
    protected static final String F = "AlarmTaskSchedule.";
    protected static final String G = "AlarmTaskScheduleBak.";
    protected static final String H = "AlarmNioTaskSchedule.";

    /* renamed from: h, reason: collision with root package name */
    public static final String f37237h = "TaskService";

    /* renamed from: i, reason: collision with root package name */
    public static final String f37238i = "com.igexin.c.a.d.g";

    /* renamed from: j, reason: collision with root package name */
    static final byte f37239j = -1;

    /* renamed from: k, reason: collision with root package name */
    static final byte f37240k = 0;

    /* renamed from: l, reason: collision with root package name */
    static final byte f37241l = 1;

    /* renamed from: m, reason: collision with root package name */
    static final byte f37242m = 2;

    /* renamed from: n, reason: collision with root package name */
    static final byte f37243n = Byte.MIN_VALUE;

    /* renamed from: o, reason: collision with root package name */
    static final byte f37244o = 7;
    public PendingIntent A;
    public String B;
    volatile long C;
    public volatile boolean D;

    /* renamed from: t, reason: collision with root package name */
    public boolean f37249t;

    /* renamed from: v, reason: collision with root package name */
    public PowerManager f37251v;

    /* renamed from: w, reason: collision with root package name */
    public AlarmManager f37252w;

    /* renamed from: x, reason: collision with root package name */
    public Intent f37253x;

    /* renamed from: y, reason: collision with root package name */
    public PendingIntent f37254y;

    /* renamed from: z, reason: collision with root package name */
    public Intent f37255z;

    /* renamed from: u, reason: collision with root package name */
    final ReentrantLock f37250u = new ReentrantLock();
    public boolean I = false;

    /* renamed from: q, reason: collision with root package name */
    final HashMap<Long, com.igexin.c.a.d.a.c> f37246q = new HashMap<>(7);

    /* renamed from: s, reason: collision with root package name */
    public final e<f> f37248s = new e<>(this, this);

    /* renamed from: r, reason: collision with root package name */
    final d f37247r = new d();

    /* renamed from: p, reason: collision with root package name */
    public final b f37245p = new b();

    /* renamed from: com.igexin.c.a.d.g$1, reason: invalid class name */
    public class AnonymousClass1 extends IntentFilter {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Context f37256a;

        public AnonymousClass1(Context context) {
            this.f37256a = context;
            addAction(g.F + context.getPackageName());
            addAction(g.G + context.getPackageName());
            addAction("android.intent.action.SCREEN_OFF");
            addAction("android.intent.action.SCREEN_ON");
        }
    }

    public final class a {

        /* renamed from: g, reason: collision with root package name */
        volatile int f37264g;

        /* renamed from: c, reason: collision with root package name */
        final ReentrantLock f37260c = new ReentrantLock();

        /* renamed from: a, reason: collision with root package name */
        final BlockingQueue<f> f37258a = new SynchronousQueue();

        /* renamed from: b, reason: collision with root package name */
        final HashMap<Integer, RunnableC0461a> f37259b = new HashMap<>();

        /* renamed from: e, reason: collision with root package name */
        volatile long f37262e = TimeUnit.SECONDS.toNanos(60);

        /* renamed from: f, reason: collision with root package name */
        volatile int f37263f = 0;

        /* renamed from: d, reason: collision with root package name */
        ThreadFactory f37261d = new b();

        /* renamed from: h, reason: collision with root package name */
        volatile int f37265h = Integer.MAX_VALUE;

        /* renamed from: com.igexin.c.a.d.g$a$a, reason: collision with other inner class name */
        public final class RunnableC0461a implements Runnable {

            /* renamed from: a, reason: collision with root package name */
            final BlockingQueue<f> f37267a = new LinkedBlockingQueue();

            /* renamed from: b, reason: collision with root package name */
            f f37268b;

            /* renamed from: c, reason: collision with root package name */
            f f37269c;

            /* renamed from: d, reason: collision with root package name */
            volatile int f37270d;

            /* renamed from: e, reason: collision with root package name */
            volatile boolean f37271e;

            public RunnableC0461a(f fVar) {
                this.f37268b = fVar;
            }

            private void a() {
                this.f37267a.clear();
                this.f37269c = null;
            }

            private f b() {
                f poll;
                while (this.f37270d != 0) {
                    try {
                        poll = this.f37267a.poll(a.this.f37262e, TimeUnit.NANOSECONDS);
                    } catch (InterruptedException e11) {
                        com.igexin.c.a.c.a.a(e11);
                    }
                    if (poll != null) {
                        return poll;
                    }
                    if (this.f37267a.isEmpty()) {
                        ReentrantLock reentrantLock = a.this.f37260c;
                        reentrantLock.lock();
                        try {
                            if (this.f37267a.isEmpty()) {
                                a.this.f37259b.remove(Integer.valueOf(this.f37270d));
                                this.f37270d = 0;
                                return null;
                            }
                        } finally {
                            reentrantLock.unlock();
                        }
                    } else {
                        continue;
                    }
                }
                return null;
            }

            @Override // java.lang.Runnable
            public final void run() {
                boolean z11 = true;
                while (z11) {
                    try {
                        try {
                            f fVar = this.f37268b;
                            this.f37268b = null;
                            while (true) {
                                if (fVar == null) {
                                    fVar = b();
                                    if (fVar == null && (fVar = a.this.b()) == null) {
                                        z11 = a.this.a(this);
                                        if (!z11) {
                                        }
                                    }
                                }
                                this.f37269c = null;
                                if (this.f37270d == 0) {
                                    this.f37270d = fVar.C;
                                }
                                boolean z12 = true;
                                f fVar2 = fVar;
                                while (z12) {
                                    try {
                                        try {
                                            fVar2.b_();
                                            fVar2.o();
                                            if (!fVar2.f37233v) {
                                                fVar2.d_();
                                            }
                                        } catch (Exception e11) {
                                            com.igexin.c.a.c.a.a(e11);
                                            com.igexin.c.a.c.a.a(g.f37237h + e11.toString(), new Object[0]);
                                            fVar2.f37233v = true;
                                            fVar2.E = e11;
                                            fVar2.p();
                                            fVar2.l();
                                            g.this.a((Object) fVar2);
                                            g.this.e();
                                            if (!fVar2.f37233v) {
                                                fVar2.d_();
                                            }
                                            if (!fVar2.f37224m && fVar2.f37227p && fVar2.f37234w != 0) {
                                            }
                                        }
                                    } catch (Throwable th2) {
                                        if (!fVar2.f37233v) {
                                            fVar2.d_();
                                        }
                                        if (fVar2.f37224m || !fVar2.f37227p || fVar2.f37234w == 0) {
                                            throw th2;
                                        }
                                    }
                                    if (!fVar2.f37224m && fVar2.f37227p && fVar2.f37234w != 0) {
                                    }
                                    z12 = false;
                                    fVar2 = null;
                                }
                                this.f37269c = fVar;
                                fVar = null;
                            }
                            throw th2;
                        } catch (Exception e12) {
                            com.igexin.c.a.c.a.a(e12);
                            com.igexin.c.a.c.a.a("TaskService|Worker|run()|error" + e12.toString(), new Object[0]);
                            z11 = a.this.a(this);
                            if (!z11) {
                                a();
                            }
                        }
                    } catch (Throwable th3) {
                        if (!a.this.a(this)) {
                            a();
                        }
                        throw th3;
                    }
                }
            }

            private void a(f fVar) {
                if (this.f37270d == 0) {
                    this.f37270d = fVar.C;
                }
                boolean z11 = true;
                while (z11) {
                    try {
                        try {
                            fVar.b_();
                            fVar.o();
                            if (!fVar.f37233v) {
                                fVar.d_();
                            }
                        } catch (Exception e11) {
                            com.igexin.c.a.c.a.a(e11);
                            com.igexin.c.a.c.a.a(g.f37237h + e11.toString(), new Object[0]);
                            fVar.f37233v = true;
                            fVar.E = e11;
                            fVar.p();
                            fVar.l();
                            g.this.a((Object) fVar);
                            g.this.e();
                            if (!fVar.f37233v) {
                                fVar.d_();
                            }
                            if (!fVar.f37224m && fVar.f37227p && fVar.f37234w != 0) {
                            }
                        }
                    } finally {
                    }
                    if (!fVar.f37224m && fVar.f37227p && fVar.f37234w != 0) {
                    }
                    fVar = null;
                    z11 = false;
                }
            }
        }

        public final class b implements ThreadFactory {

            /* renamed from: a, reason: collision with root package name */
            final AtomicInteger f37273a = new AtomicInteger(0);

            public b() {
            }

            @Override // java.util.concurrent.ThreadFactory
            public final Thread newThread(Runnable runnable) {
                return new Thread(runnable, "TS-pool-" + this.f37273a.incrementAndGet());
            }
        }

        public a() {
        }

        private void c(f fVar) {
            fVar.getClass();
            if (fVar.C != 0) {
                ReentrantLock reentrantLock = this.f37260c;
                reentrantLock.lock();
                try {
                    RunnableC0461a runnableC0461a = this.f37259b.get(Integer.valueOf(fVar.C));
                    if (runnableC0461a != null) {
                        runnableC0461a.f37267a.offer(fVar);
                        return;
                    }
                } finally {
                    reentrantLock.unlock();
                }
            }
            if (this.f37264g >= this.f37263f || !a(fVar)) {
                if (!this.f37258a.offer(fVar)) {
                    b(fVar);
                } else if (this.f37264g == 0) {
                    a();
                }
            }
        }

        private void d(f fVar) {
            if (this.f37264g >= this.f37263f || !a(fVar)) {
                if (!this.f37258a.offer(fVar)) {
                    b(fVar);
                } else if (this.f37264g == 0) {
                    a();
                }
            }
        }

        private Thread e(f fVar) {
            int i11;
            RunnableC0461a runnableC0461a = new RunnableC0461a(fVar);
            if (fVar != null && (i11 = fVar.C) != 0) {
                this.f37259b.put(Integer.valueOf(i11), runnableC0461a);
            }
            Thread newThread = this.f37261d.newThread(runnableC0461a);
            if (newThread != null) {
                this.f37264g++;
            }
            return newThread;
        }

        public final void a() {
            ReentrantLock reentrantLock = this.f37260c;
            reentrantLock.lock();
            try {
                Thread thread = null;
                if (this.f37264g < Math.max(this.f37263f, 1) && !this.f37258a.isEmpty()) {
                    thread = e(null);
                }
                if (thread != null) {
                    thread.start();
                }
            } finally {
                reentrantLock.unlock();
            }
        }

        public final f b() {
            f poll;
            while (true) {
                try {
                    poll = this.f37264g > this.f37263f ? this.f37258a.poll(this.f37262e, TimeUnit.NANOSECONDS) : this.f37258a.take();
                } catch (InterruptedException e11) {
                    com.igexin.c.a.c.a.a(e11);
                }
                if (poll != null) {
                    return poll;
                }
                if (this.f37258a.isEmpty()) {
                    return null;
                }
            }
        }

        public final boolean a(f fVar) {
            ReentrantLock reentrantLock = this.f37260c;
            reentrantLock.lock();
            try {
                Thread e11 = this.f37264g < this.f37263f ? e(fVar) : null;
                if (e11 == null) {
                    return false;
                }
                e11.start();
                return true;
            } finally {
                reentrantLock.unlock();
            }
        }

        public final boolean b(f fVar) {
            ReentrantLock reentrantLock = this.f37260c;
            reentrantLock.lock();
            try {
                Thread e11 = this.f37264g < this.f37265h ? e(fVar) : null;
                if (e11 == null) {
                    return false;
                }
                e11.start();
                return true;
            } finally {
                reentrantLock.unlock();
            }
        }

        public final boolean a(RunnableC0461a runnableC0461a) {
            ReentrantLock reentrantLock = this.f37260c;
            reentrantLock.lock();
            try {
                int i11 = this.f37264g - 1;
                this.f37264g = i11;
                if (i11 == 0 && !this.f37258a.isEmpty()) {
                    Thread e11 = e(null);
                    if (e11 != null) {
                        e11.start();
                    }
                } else if (!runnableC0461a.f37267a.isEmpty()) {
                    reentrantLock.unlock();
                    return true;
                }
                this.f37259b.remove(Integer.valueOf(runnableC0461a.f37270d));
                reentrantLock.unlock();
                return false;
            } catch (Throwable th2) {
                reentrantLock.unlock();
                throw th2;
            }
        }
    }

    public g() {
        f.H = this;
    }

    private static int a(f fVar, f fVar2) {
        if (fVar.f37234w < fVar2.f37234w) {
            return -1;
        }
        if (fVar.f37234w > fVar2.f37234w) {
            return 1;
        }
        int i11 = fVar.D;
        int i12 = fVar2.D;
        if (i11 > i12) {
            return -1;
        }
        if (i11 < i12) {
            return 1;
        }
        if (fVar.f37235x < fVar2.f37235x) {
            return -1;
        }
        if (fVar.f37235x > fVar2.f37235x) {
            return 1;
        }
        return fVar.hashCode() - fVar2.hashCode();
    }

    @TargetApi(19)
    private void b(long j11) {
        if (n.l()) {
            return;
        }
        com.igexin.c.a.c.a.a("setnioalarm|" + new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", Locale.getDefault()).format(new Date(j11)), new Object[0]);
        if (j11 < 0) {
            j11 = System.currentTimeMillis() + E;
        }
        try {
            try {
                if (this.f37249t) {
                    this.f37252w.setExact(0, j11, this.A);
                } else {
                    this.f37252w.setAndAllowWhileIdle(0, j11, this.f37254y);
                }
            } catch (Exception unused) {
                this.f37252w.set(0, j11, this.A);
            }
        } catch (Throwable th2) {
            com.igexin.c.a.c.a.a(f37237h, th2.toString());
        }
    }

    @Override // java.util.Comparator
    public /* synthetic */ int compare(f fVar, f fVar2) {
        f fVar3 = fVar;
        f fVar4 = fVar2;
        if (fVar3.f37234w < fVar4.f37234w) {
            return -1;
        }
        if (fVar3.f37234w > fVar4.f37234w) {
            return 1;
        }
        int i11 = fVar3.D;
        int i12 = fVar4.D;
        if (i11 > i12) {
            return -1;
        }
        if (i11 < i12) {
            return 1;
        }
        if (fVar3.f37235x < fVar4.f37235x) {
            return -1;
        }
        if (fVar3.f37235x > fVar4.f37235x) {
            return 1;
        }
        return fVar3.hashCode() - fVar4.hashCode();
    }

    public final void d() {
        try {
            PendingIntent pendingIntent = this.A;
            if (pendingIntent != null) {
                this.f37252w.cancel(pendingIntent);
            }
        } catch (Throwable th2) {
            com.igexin.c.a.c.a.a(f37237h, th2.toString());
        }
    }

    public final void e() {
        b bVar = this.f37245p;
        if (bVar == null || bVar.isInterrupted()) {
            return;
        }
        this.f37245p.interrupt();
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0070, code lost:
    
        if (r4 < 0) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0072, code lost:
    
        ((com.igexin.c.a.d.f) r0).d_();
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00a7, code lost:
    
        if (r4 < 0) goto L31;
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00ae A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0000 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void f() {
        /*
            r8 = this;
        L0:
            com.igexin.c.a.d.d r0 = r8.f37247r
            boolean r0 = r0.c()
            if (r0 != 0) goto Ld0
            com.igexin.c.a.d.d r0 = r8.f37247r
            com.igexin.c.a.d.a.e r0 = r0.d()
            if (r0 != 0) goto L12
            goto Ld0
        L12:
            r1 = 1
            r0.a(r1)
            java.util.concurrent.locks.ReentrantLock r1 = r8.f37250u
            r1.lock()
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = 0
            java.util.HashMap<java.lang.Long, com.igexin.c.a.d.a.c> r4 = r8.f37246q     // Catch: java.lang.Throwable -> L43
            boolean r4 = r4.isEmpty()     // Catch: java.lang.Throwable -> L43
            if (r4 != 0) goto L67
            long r4 = r0.k()     // Catch: java.lang.Throwable -> L43
            r6 = 0
            int r6 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r6 == 0) goto L46
            java.util.HashMap<java.lang.Long, com.igexin.c.a.d.a.c> r6 = r8.f37246q     // Catch: java.lang.Throwable -> L43
            java.lang.Long r4 = java.lang.Long.valueOf(r4)     // Catch: java.lang.Throwable -> L43
            java.lang.Object r4 = r6.get(r4)     // Catch: java.lang.Throwable -> L43
            com.igexin.c.a.d.a.c r4 = (com.igexin.c.a.d.a.c) r4     // Catch: java.lang.Throwable -> L43
            if (r4 == 0) goto L67
            boolean r4 = a(r0, r4)     // Catch: java.lang.Throwable -> L43
            goto L68
        L43:
            r4 = move-exception
            r5 = r3
            goto L7c
        L46:
            java.util.HashMap<java.lang.Long, com.igexin.c.a.d.a.c> r4 = r8.f37246q     // Catch: java.lang.Throwable -> L43
            java.util.Collection r4 = r4.values()     // Catch: java.lang.Throwable -> L43
            java.util.Iterator r4 = r4.iterator()     // Catch: java.lang.Throwable -> L43
            r5 = r3
        L51:
            boolean r6 = r4.hasNext()     // Catch: java.lang.Throwable -> L65
            if (r6 == 0) goto L63
            java.lang.Object r6 = r4.next()     // Catch: java.lang.Throwable -> L65
            com.igexin.c.a.d.a.c r6 = (com.igexin.c.a.d.a.c) r6     // Catch: java.lang.Throwable -> L65
            boolean r5 = a(r0, r6)     // Catch: java.lang.Throwable -> L65
            if (r5 == 0) goto L51
        L63:
            r4 = r5
            goto L68
        L65:
            r4 = move-exception
            goto L7c
        L67:
            r4 = r3
        L68:
            if (r4 != 0) goto L78
            int r4 = r0.c()
            if (r4 <= r2) goto L78
            if (r4 >= 0) goto L78
        L72:
            r2 = r0
            com.igexin.c.a.d.f r2 = (com.igexin.c.a.d.f) r2
            r2.d_()
        L78:
            r1.unlock()
            goto Laa
        L7c:
            com.igexin.c.a.c.a.a(r4)     // Catch: java.lang.Throwable -> Lbc
            java.lang.String r6 = "TaskService"
            java.lang.String r7 = r4.toString()     // Catch: java.lang.Throwable -> Lbc
            com.igexin.c.a.c.a.a(r6, r7)     // Catch: java.lang.Throwable -> Lbc
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Lbc
            java.lang.String r7 = "TaskService|"
            r6.<init>(r7)     // Catch: java.lang.Throwable -> Lbc
            java.lang.String r4 = r4.toString()     // Catch: java.lang.Throwable -> Lbc
            r6.append(r4)     // Catch: java.lang.Throwable -> Lbc
            java.lang.String r4 = r6.toString()     // Catch: java.lang.Throwable -> Lbc
            java.lang.Object[] r6 = new java.lang.Object[r3]     // Catch: java.lang.Throwable -> Lbc
            com.igexin.c.a.c.a.a(r4, r6)     // Catch: java.lang.Throwable -> Lbc
            if (r5 != 0) goto L78
            int r4 = r0.c()
            if (r4 <= r2) goto L78
            if (r4 >= 0) goto L78
            goto L72
        Laa:
            boolean r0 = r0 instanceof com.igexin.push.d.c.k
            if (r0 == 0) goto L0
            com.igexin.c.a.d.d r0 = r8.f37247r
            r0.b()
            java.lang.String r0 = "TaskService|queue -> secondRespQueue"
            java.lang.Object[] r1 = new java.lang.Object[r3]
            com.igexin.c.a.c.a.a(r0, r1)
            goto L0
        Lbc:
            r3 = move-exception
            if (r5 != 0) goto Lcc
            int r4 = r0.c()
            if (r4 <= r2) goto Lcc
            if (r4 >= 0) goto Lcc
            com.igexin.c.a.d.f r0 = (com.igexin.c.a.d.f) r0
            r0.d_()
        Lcc:
            r1.unlock()
            throw r3
        Ld0:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.igexin.c.a.d.g.f():void");
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if ("android.intent.action.SCREEN_OFF".equals(intent.getAction())) {
            this.D = true;
            com.igexin.c.a.c.a.a("screenoff", new Object[0]);
            if (this.f37248s.f37221g.get() > 0) {
                a(this.f37248s.f37221g.get());
                return;
            }
            return;
        }
        if ("android.intent.action.SCREEN_ON".equals(intent.getAction())) {
            this.D = false;
            com.igexin.c.a.c.a.a("screenon", new Object[0]);
            return;
        }
        if (intent.getAction().startsWith(F) || intent.getAction().startsWith(G)) {
            Calendar.getInstance().getTime().toLocaleString();
            com.igexin.c.a.c.a.a("receivealarm|" + this.D, new Object[0]);
            e();
            return;
        }
        if (this.B.equals(intent.getAction())) {
            Calendar calendar = Calendar.getInstance();
            com.igexin.c.a.c.a.b(f37238i, "CPU ON + NioAlarmReceiver:-> cTime; " + calendar.getTime().toLocaleString());
            try {
                com.igexin.c.a.c.a.a(f37237h, " alarm time out #######");
                com.igexin.c.a.c.a.a("TaskService|alarm time out #######", new Object[0]);
                com.igexin.c.a.b.a.a.d.a().f();
            } catch (Exception e11) {
                com.igexin.c.a.c.a.a(e11);
            }
        }
    }

    private void a() {
        try {
            PendingIntent pendingIntent = this.f37254y;
            if (pendingIntent != null) {
                this.f37252w.cancel(pendingIntent);
            }
        } catch (Throwable th2) {
            com.igexin.c.a.c.a.a(f37237h, th2.toString());
        }
    }

    private boolean b() {
        e<f> eVar = this.f37248s;
        if (eVar == null) {
            return false;
        }
        eVar.f37217c.clear();
        return true;
    }

    private void a(int i11, TimeUnit timeUnit) {
        this.f37245p.f37276b = TimeUnit.MILLISECONDS.convert(i11, timeUnit);
    }

    @TargetApi(19)
    public final void a(long j11) {
        if (this.D) {
            com.igexin.c.a.c.a.a("setalarm|" + new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", Locale.getDefault()).format(new Date(j11)), new Object[0]);
            if (j11 < 0) {
                j11 = System.currentTimeMillis() + E;
            }
            try {
                PendingIntent pendingIntent = this.f37254y;
                if (pendingIntent != null) {
                    try {
                        if (this.f37249t) {
                            this.f37252w.setExact(0, j11, pendingIntent);
                        } else {
                            this.f37252w.setAndAllowWhileIdle(0, j11, pendingIntent);
                        }
                    } catch (Throwable unused) {
                        this.f37252w.set(0, j11, this.f37254y);
                    }
                }
            } catch (Throwable th2) {
                com.igexin.c.a.c.a.a(f37237h, th2.toString());
                com.igexin.c.a.c.a.a(f37237h + th2.toString(), new Object[0]);
            }
        }
    }

    private void a(Context context) {
        IntentFilter intentFilter;
        if (this.I) {
            return;
        }
        if (!n.l()) {
            this.f37251v = (PowerManager) context.getSystemService(c6.d.f8118j);
            this.D = true;
            this.f37252w = (AlarmManager) context.getSystemService(NotificationCompat.CATEGORY_ALARM);
            try {
                if (Build.VERSION.SDK_INT >= 31) {
                    this.f37249t = ((Boolean) AlarmManager.class.getDeclaredMethod("canScheduleExactAlarms", null).invoke(this.f37252w, null)).booleanValue();
                } else {
                    this.f37249t = true;
                }
            } catch (Throwable th2) {
                com.igexin.c.a.c.a.a(th2);
            }
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(context);
            int i11 = Build.VERSION.SDK_INT;
            String str = com.igexin.push.core.e.f38001ac;
            if (i11 > 33) {
                context.registerReceiver(this, anonymousClass1, str, null, 4);
            } else {
                context.registerReceiver(this, anonymousClass1, str, null);
            }
            this.B = H + context.getPackageName();
            String str2 = this.B;
            if (i11 > 33) {
                intentFilter = new IntentFilter(str2);
                context.registerReceiver(this, intentFilter, com.igexin.push.core.e.f38001ac, null, 4);
            } else {
                intentFilter = new IntentFilter(str2);
                context.registerReceiver(this, intentFilter, com.igexin.push.core.e.f38001ac, null);
            }
            int i12 = (n.a(context) < 31 || i11 < 30) ? C.BUFFER_FLAG_FIRST_SAMPLE : 201326592;
            this.f37253x = new Intent(F + context.getPackageName());
            this.f37254y = PendingIntent.getBroadcast(context, hashCode(), this.f37253x, i12);
            hashCode();
            this.f37255z = new Intent(this.B);
            this.A = PendingIntent.getBroadcast(context, hashCode() + 2, this.f37255z, i12);
            hashCode();
        }
        this.f37245p.start();
        try {
            Thread.yield();
        } catch (Throwable th3) {
            com.igexin.c.a.c.a.a(th3);
        }
        this.I = true;
    }

    public final boolean a(com.igexin.c.a.d.a.c cVar) {
        ReentrantLock reentrantLock = this.f37250u;
        if (reentrantLock.tryLock()) {
            try {
                if (this.f37246q.containsKey(Long.valueOf(cVar.g()))) {
                    return false;
                }
                this.f37246q.put(Long.valueOf(cVar.g()), cVar);
                reentrantLock.unlock();
                return true;
            } catch (Throwable th2) {
                try {
                    com.igexin.c.a.c.a.a(th2);
                    com.igexin.c.a.c.a.a("TaskService|" + th2.toString(), new Object[0]);
                } finally {
                    reentrantLock.unlock();
                }
            }
        }
        return false;
    }

    private static boolean a(com.igexin.c.a.d.a.e eVar, com.igexin.c.a.d.a.c cVar) {
        int c11 = eVar.c();
        if (c11 <= Integer.MIN_VALUE || c11 >= 0) {
            if (c11 < 0 || c11 >= Integer.MAX_VALUE) {
                return false;
            }
            return cVar.a(eVar);
        }
        f fVar = (f) eVar;
        boolean a11 = fVar.f37233v ? false : cVar.a(eVar);
        if (a11) {
            fVar.d_();
        }
        return a11;
    }

    private boolean a(f fVar) {
        e<f> eVar = this.f37248s;
        return eVar != null && eVar.c(fVar);
    }

    public final boolean a(f fVar, boolean z11) {
        fVar.getClass();
        int i11 = 0;
        if (fVar.f37228q || fVar.f37224m) {
            return false;
        }
        e<f> eVar = this.f37248s;
        if ((fVar instanceof com.igexin.c.a.b.f) && (((com.igexin.c.a.b.f) fVar).f37164d instanceof o)) {
            if (z11) {
                i11 = Integer.MAX_VALUE;
            }
        } else if (z11) {
            i11 = eVar.f37218d.incrementAndGet();
        }
        fVar.D = i11;
        return eVar.a((e<f>) fVar);
    }

    private boolean a(f fVar, boolean z11, int i11, long j11, byte b11, Object obj, com.igexin.c.a.d.a.d dVar, int i12, com.igexin.c.a.d.a.g gVar) {
        fVar.getClass();
        fVar.A = i11;
        fVar.a((int) b11);
        fVar.F = obj;
        fVar.O = dVar;
        fVar.a(j11, TimeUnit.MILLISECONDS);
        fVar.a(i12, gVar);
        return a(fVar, z11);
    }

    public final boolean a(f fVar, boolean z11, boolean z12) {
        fVar.getClass();
        boolean z13 = false;
        if (fVar.f37225n) {
            return false;
        }
        if (!z11 || z12) {
            if (z12 && z11) {
                z13 = true;
            }
            return a(fVar, z13);
        }
        fVar.d();
        try {
            try {
                fVar.b_();
                fVar.o();
                if (!fVar.f37233v) {
                    fVar.d_();
                }
                return true;
            } catch (Exception e11) {
                com.igexin.c.a.c.a.a(e11);
                fVar.f37233v = true;
                fVar.E = e11;
                fVar.l();
                fVar.p();
                a((Object) fVar);
                e();
                if (!fVar.f37233v) {
                    fVar.d_();
                }
                return false;
            }
        } catch (Throwable th2) {
            if (!fVar.f37233v) {
                fVar.d_();
            }
            throw th2;
        }
    }

    private boolean a(Class cls) {
        e<f> eVar = this.f37248s;
        return eVar != null && eVar.a(cls);
    }

    public final boolean a(Object obj) {
        if (obj == null) {
            return false;
        }
        obj.hashCode();
        try {
            if (obj instanceof com.igexin.push.d.c.n) {
                obj.hashCode();
            }
        } catch (Exception e11) {
            com.igexin.c.a.c.a.a(e11);
        }
        obj.hashCode();
        com.igexin.c.a.c.a.a("TaskService|responseQueue ++ task = " + obj.getClass().getName() + EmailAutoCompleteEditText.f17091d + obj.hashCode(), new Object[0]);
        if (!(obj instanceof com.igexin.c.a.d.a.e)) {
            throw new ClassCastException("response Obj is not a TaskResult ");
        }
        com.igexin.c.a.d.a.e eVar = (com.igexin.c.a.d.a.e) obj;
        if (eVar.j()) {
            return false;
        }
        eVar.a(false);
        if ((obj instanceof com.igexin.push.d.b.a) || (obj instanceof com.igexin.push.d.b.b)) {
            this.f37247r.a();
            com.igexin.c.a.c.a.a("TaskService|change to primaryQueue", new Object[0]);
        }
        this.f37247r.a(eVar);
        return true;
    }

    public final class b extends Thread {

        /* renamed from: a, reason: collision with root package name */
        volatile boolean f37275a = true;

        /* renamed from: b, reason: collision with root package name */
        long f37276b;

        /* renamed from: c, reason: collision with root package name */
        long f37277c;

        /* renamed from: d, reason: collision with root package name */
        a f37278d;

        public b() {
            setName("TS-processor");
        }

        /* JADX WARN: Can't wrap try/catch for region: R(13:6|(1:(4:(3:31|32|(2:35|20)(4:34|26|27|28))|10|11|(3:13|(2:18|19)(3:21|22|23)|20)(4:25|26|27|28)))(3:68|69|(5:78|79|(1:81)|82|(5:84|85|86|88|(4:112|113|114|115)(2:90|91))(1:122))(2:71|(4:75|76|77|28)))|36|37|38|(1:40)|41|(1:43)|46|10|11|(0)(0)|4) */
        /* JADX WARN: Code restructure failed: missing block: B:100:0x0087, code lost:
        
            r4.b(r5);
         */
        /* JADX WARN: Code restructure failed: missing block: B:105:0x0081, code lost:
        
            if (r4.f37264g != 0) goto L115;
         */
        /* JADX WARN: Code restructure failed: missing block: B:107:0x0083, code lost:
        
            r4.a();
         */
        /* JADX WARN: Code restructure failed: missing block: B:59:0x00e5, code lost:
        
            r4 = move-exception;
         */
        /* JADX WARN: Code restructure failed: missing block: B:60:0x00e6, code lost:
        
            com.igexin.c.a.c.a.a(r4);
            com.igexin.c.a.c.a.a(com.igexin.c.a.d.g.f37237h, r4.toString());
            com.igexin.c.a.c.a.a("TaskService|SERVICE_PROCESSING|error|" + r4.toString(), new java.lang.Object[0]);
            r5.f37233v = true;
            r5.E = r4;
            r5.p();
            r5.l();
            r13.f37279e.f37247r.a(r5);
         */
        /* JADX WARN: Code restructure failed: missing block: B:61:0x0118, code lost:
        
            r13.f37279e.f();
         */
        /* JADX WARN: Code restructure failed: missing block: B:62:0x011f, code lost:
        
            if (r5.f37233v == false) goto L65;
         */
        /* JADX WARN: Code restructure failed: missing block: B:63:0x0121, code lost:
        
            r5.d_();
         */
        /* JADX WARN: Code restructure failed: missing block: B:65:0x0126, code lost:
        
            if (r5.f37224m == false) goto L68;
         */
        /* JADX WARN: Code restructure failed: missing block: B:67:0x012a, code lost:
        
            if (r5.f37228q == false) goto L57;
         */
        /* JADX WARN: Code restructure failed: missing block: B:93:0x006f, code lost:
        
            if (r4.f37264g >= r4.f37263f) goto L107;
         */
        /* JADX WARN: Code restructure failed: missing block: B:95:0x0075, code lost:
        
            if (r4.a(r5) != false) goto L113;
         */
        /* JADX WARN: Code restructure failed: missing block: B:98:0x007d, code lost:
        
            if (r4.f37258a.offer(r5) == false) goto L110;
         */
        /* JADX WARN: Removed duplicated region for block: B:13:0x0136  */
        /* JADX WARN: Removed duplicated region for block: B:25:0x0145 A[SYNTHETIC] */
        @Override // java.lang.Thread, java.lang.Runnable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final void run() {
            /*
                Method dump skipped, instructions count: 392
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.igexin.c.a.d.g.b.run():void");
        }

        private static void a() {
        }
    }
}
