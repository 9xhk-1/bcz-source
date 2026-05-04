package l90;

import java.io.IOException;
import java.io.Reader;
import java.util.concurrent.ArrayBlockingQueue;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public class c implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayBlockingQueue<Object> f70761a;

    /* renamed from: c, reason: collision with root package name */
    public final e<l90.a> f70763c;

    /* renamed from: d, reason: collision with root package name */
    public d<l90.a> f70764d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f70765e;

    /* renamed from: g, reason: collision with root package name */
    public Reader f70767g;

    /* renamed from: h, reason: collision with root package name */
    public Thread f70768h;

    /* renamed from: i, reason: collision with root package name */
    public Exception f70769i;

    /* renamed from: j, reason: collision with root package name */
    public final boolean f70770j;

    /* renamed from: b, reason: collision with root package name */
    public final l90.a f70762b = new l90.a(-1);

    /* renamed from: f, reason: collision with root package name */
    public boolean f70766f = true;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class a extends e<l90.a> {

        /* renamed from: g, reason: collision with root package name */
        public final /* synthetic */ int f70771g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(int i11, int i12) {
            super(i11);
            this.f70771g = i12;
        }

        @Override // l90.e
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public l90.a b() {
            return new l90.a(this.f70771g);
        }
    }

    public c(Reader reader, int i11, int i12, boolean z11) {
        this.f70765e = false;
        this.f70770j = z11;
        this.f70761a = new ArrayBlockingQueue<>(i12);
        this.f70767g = reader;
        this.f70763c = new a(i12, i11);
        this.f70765e = false;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0027 A[Catch: all -> 0x0019, TryCatch #6 {, blocks: (B:3:0x0001, B:5:0x0006, B:9:0x000b, B:14:0x0014, B:17:0x0022, B:19:0x0027, B:20:0x0034, B:23:0x003d, B:27:0x004b, B:28:0x004e, B:35:0x004f, B:37:0x0050, B:39:0x0054, B:41:0x005c, B:44:0x0060, B:46:0x0064, B:47:0x0069, B:49:0x0073, B:52:0x0077, B:55:0x0083, B:22:0x0036, B:30:0x0043), top: B:2:0x0001, inners: #1, #2, #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0034 A[Catch: all -> 0x0019, TRY_LEAVE, TryCatch #6 {, blocks: (B:3:0x0001, B:5:0x0006, B:9:0x000b, B:14:0x0014, B:17:0x0022, B:19:0x0027, B:20:0x0034, B:23:0x003d, B:27:0x004b, B:28:0x004e, B:35:0x004f, B:37:0x0050, B:39:0x0054, B:41:0x005c, B:44:0x0060, B:46:0x0064, B:47:0x0069, B:49:0x0073, B:52:0x0077, B:55:0x0083, B:22:0x0036, B:30:0x0043), top: B:2:0x0001, inners: #1, #2, #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0064 A[Catch: all -> 0x0019, InterruptedException -> 0x0083, TryCatch #3 {InterruptedException -> 0x0083, blocks: (B:37:0x0050, B:39:0x0054, B:41:0x005c, B:44:0x0060, B:46:0x0064, B:47:0x0069, B:49:0x0073, B:52:0x0077), top: B:36:0x0050, outer: #6 }] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0073 A[Catch: all -> 0x0019, InterruptedException -> 0x0083, TRY_LEAVE, TryCatch #3 {InterruptedException -> 0x0083, blocks: (B:37:0x0050, B:39:0x0054, B:41:0x005c, B:44:0x0060, B:46:0x0064, B:47:0x0069, B:49:0x0073, B:52:0x0077), top: B:36:0x0050, outer: #6 }] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0077 A[Catch: all -> 0x0019, InterruptedException -> 0x0083, TRY_ENTER, TRY_LEAVE, TryCatch #3 {InterruptedException -> 0x0083, blocks: (B:37:0x0050, B:39:0x0054, B:41:0x005c, B:44:0x0060, B:46:0x0064, B:47:0x0069, B:49:0x0073, B:52:0x0077), top: B:36:0x0050, outer: #6 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public synchronized l90.a a() {
        /*
            r4 = this;
            monitor-enter(r4)
            java.lang.Thread r0 = r4.f70768h     // Catch: java.lang.Throwable -> L19
            r1 = 1
            if (r0 != 0) goto L50
            boolean r0 = r4.f70765e     // Catch: java.lang.Throwable -> L19
            if (r0 != 0) goto L50
            r0 = -1
            int r2 = r4.b()     // Catch: java.lang.Throwable -> L19 org.junit.jupiter.params.shadow.com.univocity.parsers.common.input.BomInput.BytesProcessedNotification -> L1e java.lang.Exception -> L20
            if (r2 < 0) goto L25
            r3 = 4
            if (r2 > r3) goto L25
            int r2 = r4.b()     // Catch: java.lang.Throwable -> L19 java.lang.Exception -> L1c org.junit.jupiter.params.shadow.com.univocity.parsers.common.input.BomInput.BytesProcessedNotification -> L1e
            goto L25
        L19:
            r0 = move-exception
            goto L90
        L1c:
            r3 = move-exception
            goto L22
        L1e:
            r0 = move-exception
            goto L4f
        L20:
            r3 = move-exception
            r2 = r0
        L22:
            r4.d(r3)     // Catch: java.lang.Throwable -> L19
        L25:
            if (r2 == r0) goto L34
            java.lang.Thread r0 = new java.lang.Thread     // Catch: java.lang.Throwable -> L19
            java.lang.String r2 = "unVocity-parsers input reading thread"
            r0.<init>(r4, r2)     // Catch: java.lang.Throwable -> L19
            r4.f70768h = r0     // Catch: java.lang.Throwable -> L19
            r0.start()     // Catch: java.lang.Throwable -> L19
            goto L50
        L34:
            r4.f70765e = r1     // Catch: java.lang.Throwable -> L19
            java.util.concurrent.ArrayBlockingQueue<java.lang.Object> r0 = r4.f70761a     // Catch: java.lang.Throwable -> L41 java.lang.InterruptedException -> L43
            l90.a r2 = r4.f70762b     // Catch: java.lang.Throwable -> L41 java.lang.InterruptedException -> L43
            r0.put(r2)     // Catch: java.lang.Throwable -> L41 java.lang.InterruptedException -> L43
        L3d:
            r4.e()     // Catch: java.lang.Throwable -> L19
            goto L50
        L41:
            r0 = move-exception
            goto L4b
        L43:
            java.lang.Thread r0 = java.lang.Thread.currentThread()     // Catch: java.lang.Throwable -> L41
            r0.interrupt()     // Catch: java.lang.Throwable -> L41
            goto L3d
        L4b:
            r4.e()     // Catch: java.lang.Throwable -> L19
            throw r0     // Catch: java.lang.Throwable -> L19
        L4f:
            throw r0     // Catch: java.lang.Throwable -> L19
        L50:
            boolean r0 = r4.f70765e     // Catch: java.lang.Throwable -> L19 java.lang.InterruptedException -> L83
            if (r0 == 0) goto L60
            java.util.concurrent.ArrayBlockingQueue<java.lang.Object> r0 = r4.f70761a     // Catch: java.lang.Throwable -> L19 java.lang.InterruptedException -> L83
            int r0 = r0.size()     // Catch: java.lang.Throwable -> L19 java.lang.InterruptedException -> L83
            if (r0 > r1) goto L60
            l90.a r0 = r4.f70762b     // Catch: java.lang.Throwable -> L19 java.lang.InterruptedException -> L83
            monitor-exit(r4)
            return r0
        L60:
            l90.d<l90.a> r0 = r4.f70764d     // Catch: java.lang.Throwable -> L19 java.lang.InterruptedException -> L83
            if (r0 == 0) goto L69
            l90.e<l90.a> r2 = r4.f70763c     // Catch: java.lang.Throwable -> L19 java.lang.InterruptedException -> L83
            r2.c(r0)     // Catch: java.lang.Throwable -> L19 java.lang.InterruptedException -> L83
        L69:
            java.util.concurrent.ArrayBlockingQueue<java.lang.Object> r0 = r4.f70761a     // Catch: java.lang.Throwable -> L19 java.lang.InterruptedException -> L83
            java.lang.Object r0 = r0.take()     // Catch: java.lang.Throwable -> L19 java.lang.InterruptedException -> L83
            l90.a r2 = r4.f70762b     // Catch: java.lang.Throwable -> L19 java.lang.InterruptedException -> L83
            if (r0 != r2) goto L77
            r4.f70765e = r1     // Catch: java.lang.Throwable -> L19 java.lang.InterruptedException -> L83
            monitor-exit(r4)
            return r2
        L77:
            l90.d r0 = (l90.d) r0     // Catch: java.lang.Throwable -> L19 java.lang.InterruptedException -> L83
            r4.f70764d = r0     // Catch: java.lang.Throwable -> L19 java.lang.InterruptedException -> L83
            java.lang.Object r0 = r0.a()     // Catch: java.lang.Throwable -> L19 java.lang.InterruptedException -> L83
            l90.a r0 = (l90.a) r0     // Catch: java.lang.Throwable -> L19 java.lang.InterruptedException -> L83
            monitor-exit(r4)
            return r0
        L83:
            java.lang.Thread r0 = java.lang.Thread.currentThread()     // Catch: java.lang.Throwable -> L19
            r0.interrupt()     // Catch: java.lang.Throwable -> L19
            r4.f70765e = r1     // Catch: java.lang.Throwable -> L19
            l90.a r0 = r4.f70762b     // Catch: java.lang.Throwable -> L19
            monitor-exit(r4)
            return r0
        L90:
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L19
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: l90.c.a():l90.a");
    }

    public final int b() throws IOException, InterruptedException {
        d<l90.a> a11 = this.f70763c.a();
        int a12 = a11.a().a(this.f70767g);
        if (a12 != -1) {
            this.f70761a.put(a11);
            return a12;
        }
        this.f70763c.c(a11);
        return a12;
    }

    public void c() {
        Exception exc = this.f70769i;
        if (exc != null) {
            org.junit.jupiter.params.shadow.com.univocity.parsers.common.d.A(exc);
        }
    }

    public final void d(Exception exc) {
        if (this.f70766f) {
            this.f70769i = exc;
        }
    }

    public void e() {
        IllegalStateException illegalStateException;
        this.f70766f = false;
        try {
            try {
                if (this.f70770j) {
                    this.f70767g.close();
                }
                try {
                    Thread thread = this.f70768h;
                    if (thread != null) {
                        thread.interrupt();
                    }
                } finally {
                }
            } catch (IOException e11) {
                throw new IllegalStateException("Error closing input", e11);
            }
        } catch (Throwable th2) {
            try {
                Thread thread2 = this.f70768h;
                if (thread2 != null) {
                    thread2.interrupt();
                }
                throw th2;
            } finally {
            }
        }
    }

    @Override // java.lang.Runnable
    public void run() {
        while (this.f70766f && b() != -1) {
            try {
                try {
                    try {
                    } finally {
                        e();
                    }
                } finally {
                    this.f70761a.put(this.f70762b);
                }
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
                return;
            } catch (Exception e11) {
                this.f70765e = true;
                d(e11);
                return;
            }
        }
    }
}
