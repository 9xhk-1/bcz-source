package rx.internal.util;

import java.util.concurrent.atomic.AtomicLong;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public final class BackpressureDrainManager extends AtomicLong implements qb0.d {
    private static final long serialVersionUID = 2826241102729529449L;
    final a actual;
    boolean emitting;
    Throwable exception;
    volatile boolean terminated;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public interface a {
        boolean accept(Object obj);

        void h(Throwable th2);

        Object peek();

        Object poll();
    }

    public BackpressureDrainManager(a aVar) {
        this.actual = aVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x003d, code lost:
    
        monitor-enter(r13);
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x003e, code lost:
    
        r1 = r13.terminated;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0044, code lost:
    
        if (r5.peek() == null) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0046, code lost:
    
        r2 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0054, code lost:
    
        if (get() != Long.MAX_VALUE) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0056, code lost:
    
        if (r2 != false) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0058, code lost:
    
        if (r1 != false) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x005a, code lost:
    
        r13.emitting = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x005c, code lost:
    
        monitor-exit(r13);
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x005d, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0060, code lost:
    
        r2 = Long.MAX_VALUE;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0064, code lost:
    
        r9 = addAndGet(-r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x006a, code lost:
    
        if (r9 == 0) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x006c, code lost:
    
        if (r2 != false) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0073, code lost:
    
        r2 = r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x006e, code lost:
    
        if (r1 == false) goto L90;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0070, code lost:
    
        if (r2 == false) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0048, code lost:
    
        r2 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0076, code lost:
    
        r1 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x007d, code lost:
    
        monitor-exit(r13);
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x007e, code lost:
    
        throw r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0031, code lost:
    
        if (r2 == 0) goto L86;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void drain() {
        /*
            r13 = this;
            monitor-enter(r13)
            boolean r0 = r13.emitting     // Catch: java.lang.Throwable -> L7
            if (r0 == 0) goto La
            monitor-exit(r13)     // Catch: java.lang.Throwable -> L7
            return
        L7:
            r0 = move-exception
            goto L97
        La:
            r0 = 1
            r13.emitting = r0     // Catch: java.lang.Throwable -> L7
            boolean r1 = r13.terminated     // Catch: java.lang.Throwable -> L7
            monitor-exit(r13)     // Catch: java.lang.Throwable -> L7
            long r2 = r13.get()
            r4 = 0
            rx.internal.util.BackpressureDrainManager$a r5 = r13.actual     // Catch: java.lang.Throwable -> L34
        L17:
            r6 = r4
        L18:
            r7 = 0
            int r9 = (r2 > r7 ? 1 : (r2 == r7 ? 0 : -1))
            if (r9 > 0) goto L20
            if (r1 == 0) goto L3d
        L20:
            if (r1 == 0) goto L37
            java.lang.Object r10 = r5.peek()     // Catch: java.lang.Throwable -> L34
            if (r10 != 0) goto L31
            java.lang.Throwable r1 = r13.exception     // Catch: java.lang.Throwable -> L2e
            r5.h(r1)     // Catch: java.lang.Throwable -> L2e
            return
        L2e:
            r1 = move-exception
            goto L8c
        L31:
            if (r9 != 0) goto L37
            goto L3d
        L34:
            r1 = move-exception
            r0 = r4
            goto L8c
        L37:
            java.lang.Object r9 = r5.poll()     // Catch: java.lang.Throwable -> L34
            if (r9 != 0) goto L7f
        L3d:
            monitor-enter(r13)     // Catch: java.lang.Throwable -> L34
            boolean r1 = r13.terminated     // Catch: java.lang.Throwable -> L76
            java.lang.Object r2 = r5.peek()     // Catch: java.lang.Throwable -> L76
            if (r2 == 0) goto L48
            r2 = r0
            goto L49
        L48:
            r2 = r4
        L49:
            long r9 = r13.get()     // Catch: java.lang.Throwable -> L76
            r11 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            int r3 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r3 != 0) goto L62
            if (r2 != 0) goto L60
            if (r1 != 0) goto L60
            r13.emitting = r4     // Catch: java.lang.Throwable -> L5e
            monitor-exit(r13)     // Catch: java.lang.Throwable -> L5e
            return
        L5e:
            r1 = move-exception
            goto L7d
        L60:
            r2 = r11
            goto L74
        L62:
            int r3 = -r6
            long r9 = (long) r3
            long r9 = r13.addAndGet(r9)     // Catch: java.lang.Throwable -> L76
            int r3 = (r9 > r7 ? 1 : (r9 == r7 ? 0 : -1))
            if (r3 == 0) goto L6e
            if (r2 != 0) goto L73
        L6e:
            if (r1 == 0) goto L79
            if (r2 == 0) goto L73
            goto L79
        L73:
            r2 = r9
        L74:
            monitor-exit(r13)     // Catch: java.lang.Throwable -> L76
            goto L17
        L76:
            r1 = move-exception
            r0 = r4
            goto L7d
        L79:
            r13.emitting = r4     // Catch: java.lang.Throwable -> L5e
            monitor-exit(r13)     // Catch: java.lang.Throwable -> L5e
            return
        L7d:
            monitor-exit(r13)     // Catch: java.lang.Throwable -> L5e
            throw r1     // Catch: java.lang.Throwable -> L2e
        L7f:
            boolean r7 = r5.accept(r9)     // Catch: java.lang.Throwable -> L34
            if (r7 == 0) goto L86
            return
        L86:
            r7 = 1
            long r2 = r2 - r7
            int r6 = r6 + 1
            goto L18
        L8c:
            if (r0 != 0) goto L96
            monitor-enter(r13)
            r13.emitting = r4     // Catch: java.lang.Throwable -> L93
            monitor-exit(r13)     // Catch: java.lang.Throwable -> L93
            goto L96
        L93:
            r0 = move-exception
            monitor-exit(r13)     // Catch: java.lang.Throwable -> L93
            throw r0
        L96:
            throw r1
        L97:
            monitor-exit(r13)     // Catch: java.lang.Throwable -> L7
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: rx.internal.util.BackpressureDrainManager.drain():void");
    }

    public boolean isTerminated() {
        return this.terminated;
    }

    @Override // qb0.d
    public void request(long j11) {
        boolean z11;
        long j12;
        if (j11 == 0) {
            return;
        }
        while (true) {
            long j13 = get();
            boolean z12 = true;
            z11 = j13 == 0;
            if (j13 == Long.MAX_VALUE) {
                break;
            }
            if (j11 == Long.MAX_VALUE) {
                j12 = j11;
            } else {
                j12 = j13 <= Long.MAX_VALUE - j11 ? j13 + j11 : Long.MAX_VALUE;
                z12 = z11;
            }
            if (compareAndSet(j13, j12)) {
                z11 = z12;
                break;
            }
        }
        if (z11) {
            drain();
        }
    }

    public void terminate() {
        this.terminated = true;
    }

    public void terminateAndDrain() {
        this.terminated = true;
        drain();
    }

    public void terminate(Throwable th2) {
        if (this.terminated) {
            return;
        }
        this.exception = th2;
        this.terminated = true;
    }

    public void terminateAndDrain(Throwable th2) {
        if (this.terminated) {
            return;
        }
        this.exception = th2;
        this.terminated = true;
        drain();
    }
}
