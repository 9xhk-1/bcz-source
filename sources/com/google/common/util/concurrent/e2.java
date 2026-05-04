package com.google.common.util.concurrent;

import com.google.common.base.Preconditions;
import com.google.j2objc.annotations.RetainedWith;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.concurrent.Executor;
import javax.annotation.CheckForNull;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@go.d
@go.c
@l0
/* loaded from: classes7.dex */
public final class e2 implements Executor {

    /* renamed from: f, reason: collision with root package name */
    public static final o1 f34517f = new o1(e2.class);

    /* renamed from: a, reason: collision with root package name */
    public final Executor f34518a;

    /* renamed from: b, reason: collision with root package name */
    @vo.a("queue")
    public final Deque<Runnable> f34519b = new ArrayDeque();

    /* renamed from: c, reason: collision with root package name */
    @vo.b
    @vo.a("queue")
    public c f34520c = c.IDLE;

    /* renamed from: d, reason: collision with root package name */
    @vo.a("queue")
    public long f34521d = 0;

    /* renamed from: e, reason: collision with root package name */
    @RetainedWith
    public final b f34522e = new b(this, null);

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class a implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Runnable f34523a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ e2 f34524b;

        public a(final e2 this$0, final Runnable val$task) {
            this.f34523a = val$task;
            this.f34524b = this$0;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f34523a.run();
        }

        public String toString() {
            return this.f34523a.toString();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public final class b implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        @CheckForNull
        public Runnable f34525a;

        public b() {
        }

        /* JADX WARN: Code restructure failed: missing block: B:10:0x004e, code lost:
        
            r1 = r1 | java.lang.Thread.interrupted();
            r2 = null;
         */
        /* JADX WARN: Code restructure failed: missing block: B:12:0x0050, code lost:
        
            r8.f34525a.run();
         */
        /* JADX WARN: Code restructure failed: missing block: B:16:0x005c, code lost:
        
            r3 = move-exception;
         */
        /* JADX WARN: Code restructure failed: missing block: B:17:0x005d, code lost:
        
            com.google.common.util.concurrent.e2.f34517f.a().log(java.util.logging.Level.SEVERE, "Exception while executing runnable " + r8.f34525a, (java.lang.Throwable) r3);
         */
        /* JADX WARN: Code restructure failed: missing block: B:19:0x005a, code lost:
        
            r0 = move-exception;
         */
        /* JADX WARN: Code restructure failed: missing block: B:20:0x007e, code lost:
        
            r8.f34525a = null;
         */
        /* JADX WARN: Code restructure failed: missing block: B:21:0x0080, code lost:
        
            throw r0;
         */
        /* JADX WARN: Code restructure failed: missing block: B:26:0x0045, code lost:
        
            if (r1 == false) goto L50;
         */
        /* JADX WARN: Code restructure failed: missing block: B:30:?, code lost:
        
            return;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final void a() {
            /*
                r8 = this;
                r0 = 0
                r1 = r0
            L2:
                com.google.common.util.concurrent.e2 r2 = com.google.common.util.concurrent.e2.this     // Catch: java.lang.Throwable -> L58
                java.util.Deque r2 = com.google.common.util.concurrent.e2.a(r2)     // Catch: java.lang.Throwable -> L58
                monitor-enter(r2)     // Catch: java.lang.Throwable -> L58
                if (r0 != 0) goto L2d
                com.google.common.util.concurrent.e2 r0 = com.google.common.util.concurrent.e2.this     // Catch: java.lang.Throwable -> L20
                com.google.common.util.concurrent.e2$c r0 = com.google.common.util.concurrent.e2.b(r0)     // Catch: java.lang.Throwable -> L20
                com.google.common.util.concurrent.e2$c r3 = com.google.common.util.concurrent.e2.c.RUNNING     // Catch: java.lang.Throwable -> L20
                if (r0 != r3) goto L22
                monitor-exit(r2)     // Catch: java.lang.Throwable -> L20
                if (r1 == 0) goto L48
            L18:
                java.lang.Thread r0 = java.lang.Thread.currentThread()
                r0.interrupt()
                goto L48
            L20:
                r0 = move-exception
                goto L81
            L22:
                com.google.common.util.concurrent.e2 r0 = com.google.common.util.concurrent.e2.this     // Catch: java.lang.Throwable -> L20
                com.google.common.util.concurrent.e2.d(r0)     // Catch: java.lang.Throwable -> L20
                com.google.common.util.concurrent.e2 r0 = com.google.common.util.concurrent.e2.this     // Catch: java.lang.Throwable -> L20
                com.google.common.util.concurrent.e2.c(r0, r3)     // Catch: java.lang.Throwable -> L20
                r0 = 1
            L2d:
                com.google.common.util.concurrent.e2 r3 = com.google.common.util.concurrent.e2.this     // Catch: java.lang.Throwable -> L20
                java.util.Deque r3 = com.google.common.util.concurrent.e2.a(r3)     // Catch: java.lang.Throwable -> L20
                java.lang.Object r3 = r3.poll()     // Catch: java.lang.Throwable -> L20
                java.lang.Runnable r3 = (java.lang.Runnable) r3     // Catch: java.lang.Throwable -> L20
                r8.f34525a = r3     // Catch: java.lang.Throwable -> L20
                if (r3 != 0) goto L49
                com.google.common.util.concurrent.e2 r0 = com.google.common.util.concurrent.e2.this     // Catch: java.lang.Throwable -> L20
                com.google.common.util.concurrent.e2$c r3 = com.google.common.util.concurrent.e2.c.IDLE     // Catch: java.lang.Throwable -> L20
                com.google.common.util.concurrent.e2.c(r0, r3)     // Catch: java.lang.Throwable -> L20
                monitor-exit(r2)     // Catch: java.lang.Throwable -> L20
                if (r1 == 0) goto L48
                goto L18
            L48:
                return
            L49:
                monitor-exit(r2)     // Catch: java.lang.Throwable -> L20
                boolean r2 = java.lang.Thread.interrupted()     // Catch: java.lang.Throwable -> L58
                r1 = r1 | r2
                r2 = 0
                java.lang.Runnable r3 = r8.f34525a     // Catch: java.lang.Throwable -> L5a java.lang.Exception -> L5c
                r3.run()     // Catch: java.lang.Throwable -> L5a java.lang.Exception -> L5c
            L55:
                r8.f34525a = r2     // Catch: java.lang.Throwable -> L58
                goto L2
            L58:
                r0 = move-exception
                goto L83
            L5a:
                r0 = move-exception
                goto L7e
            L5c:
                r3 = move-exception
                com.google.common.util.concurrent.o1 r4 = com.google.common.util.concurrent.e2.e()     // Catch: java.lang.Throwable -> L5a
                java.util.logging.Logger r4 = r4.a()     // Catch: java.lang.Throwable -> L5a
                java.util.logging.Level r5 = java.util.logging.Level.SEVERE     // Catch: java.lang.Throwable -> L5a
                java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L5a
                r6.<init>()     // Catch: java.lang.Throwable -> L5a
                java.lang.String r7 = "Exception while executing runnable "
                r6.append(r7)     // Catch: java.lang.Throwable -> L5a
                java.lang.Runnable r7 = r8.f34525a     // Catch: java.lang.Throwable -> L5a
                r6.append(r7)     // Catch: java.lang.Throwable -> L5a
                java.lang.String r6 = r6.toString()     // Catch: java.lang.Throwable -> L5a
                r4.log(r5, r6, r3)     // Catch: java.lang.Throwable -> L5a
                goto L55
            L7e:
                r8.f34525a = r2     // Catch: java.lang.Throwable -> L58
                throw r0     // Catch: java.lang.Throwable -> L58
            L81:
                monitor-exit(r2)     // Catch: java.lang.Throwable -> L20
                throw r0     // Catch: java.lang.Throwable -> L58
            L83:
                if (r1 == 0) goto L8c
                java.lang.Thread r1 = java.lang.Thread.currentThread()
                r1.interrupt()
            L8c:
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.common.util.concurrent.e2.b.a():void");
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                a();
            } catch (Error e11) {
                synchronized (e2.this.f34519b) {
                    e2.this.f34520c = c.IDLE;
                    throw e11;
                }
            }
        }

        public String toString() {
            Runnable runnable = this.f34525a;
            if (runnable != null) {
                return "SequentialExecutorWorker{running=" + runnable + com.alipay.sdk.m.u.i.f11099d;
            }
            return "SequentialExecutorWorker{state=" + e2.this.f34520c + com.alipay.sdk.m.u.i.f11099d;
        }

        public /* synthetic */ b(e2 e2Var, a aVar) {
            this();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public enum c {
        IDLE,
        QUEUING,
        QUEUED,
        RUNNING
    }

    public e2(Executor executor) {
        this.f34518a = (Executor) Preconditions.checkNotNull(executor);
    }

    public static /* synthetic */ long d(e2 e2Var) {
        long j11 = e2Var.f34521d;
        e2Var.f34521d = 1 + j11;
        return j11;
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x0064 A[ADDED_TO_REGION] */
    @Override // java.util.concurrent.Executor
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void execute(java.lang.Runnable r8) {
        /*
            r7 = this;
            com.google.common.base.Preconditions.checkNotNull(r8)
            java.util.Deque<java.lang.Runnable> r0 = r7.f34519b
            monitor-enter(r0)
            com.google.common.util.concurrent.e2$c r1 = r7.f34520c     // Catch: java.lang.Throwable -> L6b
            com.google.common.util.concurrent.e2$c r2 = com.google.common.util.concurrent.e2.c.RUNNING     // Catch: java.lang.Throwable -> L6b
            if (r1 == r2) goto L6d
            com.google.common.util.concurrent.e2$c r2 = com.google.common.util.concurrent.e2.c.QUEUED     // Catch: java.lang.Throwable -> L6b
            if (r1 != r2) goto L11
            goto L6d
        L11:
            long r3 = r7.f34521d     // Catch: java.lang.Throwable -> L6b
            com.google.common.util.concurrent.e2$a r1 = new com.google.common.util.concurrent.e2$a     // Catch: java.lang.Throwable -> L6b
            r1.<init>(r7, r8)     // Catch: java.lang.Throwable -> L6b
            java.util.Deque<java.lang.Runnable> r8 = r7.f34519b     // Catch: java.lang.Throwable -> L6b
            r8.add(r1)     // Catch: java.lang.Throwable -> L6b
            com.google.common.util.concurrent.e2$c r8 = com.google.common.util.concurrent.e2.c.QUEUING     // Catch: java.lang.Throwable -> L6b
            r7.f34520c = r8     // Catch: java.lang.Throwable -> L6b
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L6b
            java.util.concurrent.Executor r0 = r7.f34518a     // Catch: java.lang.Throwable -> L44
            com.google.common.util.concurrent.e2$b r5 = r7.f34522e     // Catch: java.lang.Throwable -> L44
            r0.execute(r5)     // Catch: java.lang.Throwable -> L44
            com.google.common.util.concurrent.e2$c r0 = r7.f34520c
            if (r0 == r8) goto L2e
            return
        L2e:
            java.util.Deque<java.lang.Runnable> r0 = r7.f34519b
            monitor-enter(r0)
            long r5 = r7.f34521d     // Catch: java.lang.Throwable -> L3e
            int r1 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r1 != 0) goto L40
            com.google.common.util.concurrent.e2$c r1 = r7.f34520c     // Catch: java.lang.Throwable -> L3e
            if (r1 != r8) goto L40
            r7.f34520c = r2     // Catch: java.lang.Throwable -> L3e
            goto L40
        L3e:
            r8 = move-exception
            goto L42
        L40:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L3e
            return
        L42:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L3e
            throw r8
        L44:
            r8 = move-exception
            java.util.Deque<java.lang.Runnable> r2 = r7.f34519b
            monitor-enter(r2)
            com.google.common.util.concurrent.e2$c r0 = r7.f34520c     // Catch: java.lang.Throwable -> L53
            com.google.common.util.concurrent.e2$c r3 = com.google.common.util.concurrent.e2.c.IDLE     // Catch: java.lang.Throwable -> L53
            if (r0 == r3) goto L55
            com.google.common.util.concurrent.e2$c r3 = com.google.common.util.concurrent.e2.c.QUEUING     // Catch: java.lang.Throwable -> L53
            if (r0 != r3) goto L5f
            goto L55
        L53:
            r8 = move-exception
            goto L69
        L55:
            java.util.Deque<java.lang.Runnable> r0 = r7.f34519b     // Catch: java.lang.Throwable -> L53
            boolean r0 = r0.removeLastOccurrence(r1)     // Catch: java.lang.Throwable -> L53
            if (r0 == 0) goto L5f
            r0 = 1
            goto L60
        L5f:
            r0 = 0
        L60:
            boolean r1 = r8 instanceof java.util.concurrent.RejectedExecutionException     // Catch: java.lang.Throwable -> L53
            if (r1 == 0) goto L68
            if (r0 != 0) goto L68
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L53
            return
        L68:
            throw r8     // Catch: java.lang.Throwable -> L53
        L69:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L53
            throw r8
        L6b:
            r8 = move-exception
            goto L74
        L6d:
            java.util.Deque<java.lang.Runnable> r1 = r7.f34519b     // Catch: java.lang.Throwable -> L6b
            r1.add(r8)     // Catch: java.lang.Throwable -> L6b
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L6b
            return
        L74:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L6b
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.common.util.concurrent.e2.execute(java.lang.Runnable):void");
    }

    public String toString() {
        return "SequentialExecutor@" + System.identityHashCode(this) + "{" + this.f34518a + com.alipay.sdk.m.u.i.f11099d;
    }
}
