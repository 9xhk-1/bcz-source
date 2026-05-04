package com.google.common.util.concurrent;

import androidx.core.app.NotificationCompat;
import com.google.common.base.Preconditions;
import com.google.common.collect.w7;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Queue;
import java.util.concurrent.Executor;
import java.util.logging.Level;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@go.d
@go.c
@l0
/* loaded from: classes7.dex */
public final class s1<L> {

    /* renamed from: b, reason: collision with root package name */
    public static final o1 f34843b = new o1(s1.class);

    /* renamed from: a, reason: collision with root package name */
    public final List<b<L>> f34844a = Collections.synchronizedList(new ArrayList());

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public interface a<L> {
        void call(L listener);
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class b<L> implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        public final L f34845a;

        /* renamed from: b, reason: collision with root package name */
        public final Executor f34846b;

        /* renamed from: c, reason: collision with root package name */
        @vo.a("this")
        public final Queue<a<L>> f34847c = w7.d();

        /* renamed from: d, reason: collision with root package name */
        @vo.a("this")
        public final Queue<Object> f34848d = w7.d();

        /* renamed from: e, reason: collision with root package name */
        @vo.a("this")
        public boolean f34849e;

        public b(L l11, Executor executor) {
            this.f34845a = (L) Preconditions.checkNotNull(l11);
            this.f34846b = (Executor) Preconditions.checkNotNull(executor);
        }

        public synchronized void a(a<L> event, Object label) {
            this.f34847c.add(event);
            this.f34848d.add(label);
        }

        public void b() {
            boolean z11;
            synchronized (this) {
                try {
                    if (this.f34849e) {
                        z11 = false;
                    } else {
                        z11 = true;
                        this.f34849e = true;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            if (z11) {
                try {
                    this.f34846b.execute(this);
                } catch (Exception e11) {
                    synchronized (this) {
                        this.f34849e = false;
                        s1.f34843b.a().log(Level.SEVERE, "Exception while running callbacks for " + this.f34845a + " on " + this.f34846b, (Throwable) e11);
                        throw e11;
                    }
                }
            }
        }

        /* JADX WARN: Code restructure failed: missing block: B:10:0x0025, code lost:
        
            r2.call(r9.f34845a);
         */
        /* JADX WARN: Code restructure failed: missing block: B:14:0x002d, code lost:
        
            r2 = move-exception;
         */
        /* JADX WARN: Code restructure failed: missing block: B:15:0x002e, code lost:
        
            com.google.common.util.concurrent.s1.f34843b.a().log(java.util.logging.Level.SEVERE, "Exception while executing callback: " + r9.f34845a + " " + r3, (java.lang.Throwable) r2);
         */
        /* JADX WARN: Removed duplicated region for block: B:35:0x0062  */
        @Override // java.lang.Runnable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public void run() {
            /*
                r9 = this;
            L0:
                r0 = 0
                r1 = 1
                monitor-enter(r9)     // Catch: java.lang.Throwable -> L2b
                boolean r2 = r9.f34849e     // Catch: java.lang.Throwable -> L1f
                com.google.common.base.Preconditions.checkState(r2)     // Catch: java.lang.Throwable -> L1f
                java.util.Queue<com.google.common.util.concurrent.s1$a<L>> r2 = r9.f34847c     // Catch: java.lang.Throwable -> L1f
                java.lang.Object r2 = r2.poll()     // Catch: java.lang.Throwable -> L1f
                com.google.common.util.concurrent.s1$a r2 = (com.google.common.util.concurrent.s1.a) r2     // Catch: java.lang.Throwable -> L1f
                java.util.Queue<java.lang.Object> r3 = r9.f34848d     // Catch: java.lang.Throwable -> L1f
                java.lang.Object r3 = r3.poll()     // Catch: java.lang.Throwable -> L1f
                if (r2 != 0) goto L24
                r9.f34849e = r0     // Catch: java.lang.Throwable -> L1f
                monitor-exit(r9)     // Catch: java.lang.Throwable -> L1c
                return
            L1c:
                r1 = move-exception
                r2 = r0
                goto L57
            L1f:
                r2 = move-exception
                r8 = r2
                r2 = r1
                r1 = r8
                goto L57
            L24:
                monitor-exit(r9)     // Catch: java.lang.Throwable -> L1f
                L r4 = r9.f34845a     // Catch: java.lang.Throwable -> L2b java.lang.Exception -> L2d
                r2.call(r4)     // Catch: java.lang.Throwable -> L2b java.lang.Exception -> L2d
                goto L0
            L2b:
                r2 = move-exception
                goto L60
            L2d:
                r2 = move-exception
                com.google.common.util.concurrent.o1 r4 = com.google.common.util.concurrent.s1.a()     // Catch: java.lang.Throwable -> L2b
                java.util.logging.Logger r4 = r4.a()     // Catch: java.lang.Throwable -> L2b
                java.util.logging.Level r5 = java.util.logging.Level.SEVERE     // Catch: java.lang.Throwable -> L2b
                java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L2b
                r6.<init>()     // Catch: java.lang.Throwable -> L2b
                java.lang.String r7 = "Exception while executing callback: "
                r6.append(r7)     // Catch: java.lang.Throwable -> L2b
                L r7 = r9.f34845a     // Catch: java.lang.Throwable -> L2b
                r6.append(r7)     // Catch: java.lang.Throwable -> L2b
                java.lang.String r7 = " "
                r6.append(r7)     // Catch: java.lang.Throwable -> L2b
                r6.append(r3)     // Catch: java.lang.Throwable -> L2b
                java.lang.String r3 = r6.toString()     // Catch: java.lang.Throwable -> L2b
                r4.log(r5, r3, r2)     // Catch: java.lang.Throwable -> L2b
                goto L0
            L57:
                monitor-exit(r9)     // Catch: java.lang.Throwable -> L5e
                throw r1     // Catch: java.lang.Throwable -> L59
            L59:
                r1 = move-exception
                r8 = r2
                r2 = r1
                r1 = r8
                goto L60
            L5e:
                r1 = move-exception
                goto L57
            L60:
                if (r1 == 0) goto L6a
                monitor-enter(r9)
                r9.f34849e = r0     // Catch: java.lang.Throwable -> L67
                monitor-exit(r9)     // Catch: java.lang.Throwable -> L67
                goto L6a
            L67:
                r0 = move-exception
                monitor-exit(r9)     // Catch: java.lang.Throwable -> L67
                throw r0
            L6a:
                throw r2
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.common.util.concurrent.s1.b.run():void");
        }
    }

    public void b(L listener, Executor executor) {
        Preconditions.checkNotNull(listener, "listener");
        Preconditions.checkNotNull(executor, "executor");
        this.f34844a.add(new b<>(listener, executor));
    }

    public void c() {
        for (int i11 = 0; i11 < this.f34844a.size(); i11++) {
            this.f34844a.get(i11).b();
        }
    }

    public void d(a<L> event) {
        f(event, event);
    }

    public void e(a<L> event, String label) {
        f(event, label);
    }

    public final void f(a<L> event, Object label) {
        Preconditions.checkNotNull(event, NotificationCompat.CATEGORY_EVENT);
        Preconditions.checkNotNull(label, "label");
        synchronized (this.f34844a) {
            try {
                Iterator<b<L>> it = this.f34844a.iterator();
                while (it.hasNext()) {
                    it.next().a(event, label);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
