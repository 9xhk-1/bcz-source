package com.igexin.c.a.d;

import android.os.PowerManager;
import androidx.media3.common.C;
import com.igexin.c.a.d.a.d;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

/* loaded from: classes7.dex */
public abstract class f extends b implements com.igexin.c.a.d.a.a, com.igexin.c.a.d.a.f {
    protected static g H;
    public int A;
    public int B;
    public int C;
    public int D;
    public Exception E;
    public Object F;
    public com.igexin.c.a.d.a.g G;
    protected final ReentrantLock I;
    protected final Condition J;
    protected Thread K;
    protected volatile boolean L;
    PowerManager.WakeLock M;
    int N;
    protected com.igexin.c.a.d.a.d O;

    /* renamed from: a, reason: collision with root package name */
    private byte f37223a;

    /* renamed from: m, reason: collision with root package name */
    protected volatile boolean f37224m;

    /* renamed from: n, reason: collision with root package name */
    protected volatile boolean f37225n;

    /* renamed from: o, reason: collision with root package name */
    protected volatile boolean f37226o;

    /* renamed from: p, reason: collision with root package name */
    protected volatile boolean f37227p;

    /* renamed from: q, reason: collision with root package name */
    protected volatile boolean f37228q;

    /* renamed from: r, reason: collision with root package name */
    protected volatile boolean f37229r;

    /* renamed from: s, reason: collision with root package name */
    protected volatile boolean f37230s;

    /* renamed from: t, reason: collision with root package name */
    protected volatile boolean f37231t;

    /* renamed from: u, reason: collision with root package name */
    protected volatile boolean f37232u;

    /* renamed from: v, reason: collision with root package name */
    protected volatile boolean f37233v;

    /* renamed from: w, reason: collision with root package name */
    protected volatile long f37234w;

    /* renamed from: x, reason: collision with root package name */
    volatile int f37235x;

    /* renamed from: z, reason: collision with root package name */
    public long f37236z;

    public f(int i11) {
        this(i11, (byte) 0);
    }

    private int A() {
        return this.f37223a & 15;
    }

    private boolean B() {
        byte b11 = this.f37223a;
        return (b11 >> 4) > (b11 & 15);
    }

    private Thread C() {
        return this.K;
    }

    private void E() {
        this.f37225n = true;
    }

    private Object F() {
        return this.F;
    }

    private com.igexin.c.a.d.a.d G() {
        return this.O;
    }

    private void b(int i11) {
        if (i11 != this.D) {
            this.D = i11;
            H.f37248s.b(this);
        }
    }

    private ReentrantLock g() {
        this.I.getClass();
        return this.I;
    }

    private PowerManager.WakeLock h() {
        return this.M;
    }

    private void i() {
        this.f37236z = System.currentTimeMillis();
    }

    private boolean q() {
        return this.f37233v;
    }

    private int r() {
        this.N = a(TimeUnit.MILLISECONDS) > 0 ? this.N | C.BUFFER_FLAG_FIRST_SAMPLE : this.N & 1090519038;
        return this.N;
    }

    private void s() {
        this.N = (this.N + 1) & 1090519038;
    }

    private long t() {
        return this.f37234w - System.currentTimeMillis();
    }

    private boolean u() {
        return this.f37228q;
    }

    private boolean v() {
        return this.f37232u;
    }

    private boolean w() {
        return this.f37224m;
    }

    private boolean x() {
        return this.f37230s;
    }

    private boolean y() {
        return this.f37231t;
    }

    private void z() {
        this.f37233v = false;
        this.E = null;
        this.f37234w = 0L;
        byte b11 = this.f37223a;
        this.f37223a = (byte) (b11 + ((b11 & 15) < 15 ? (byte) 1 : (byte) 0));
        this.f37224m = false;
        this.f37228q = false;
        this.f37231t = false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0015, code lost:
    
        if (r0 != 1) goto L12;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int a(long r7, java.util.concurrent.TimeUnit r9) {
        /*
            r6 = this;
            r0 = 0
            int r0 = (r7 > r0 ? 1 : (r7 == r0 ? 0 : -1))
            if (r0 <= 0) goto L26
            com.igexin.c.a.d.g r0 = com.igexin.c.a.d.f.H
            com.igexin.c.a.d.e<com.igexin.c.a.d.f> r0 = r0.f37248s
            int r0 = r0.a(r6, r7, r9)
            r1 = -2
            if (r0 == r1) goto L27
            r1 = -1
            if (r0 == r1) goto L18
            r1 = 1
            if (r0 == r1) goto L27
            goto L26
        L18:
            long r2 = java.lang.System.currentTimeMillis()
            java.util.concurrent.TimeUnit r0 = java.util.concurrent.TimeUnit.MILLISECONDS
            long r4 = r0.convert(r7, r9)
            long r2 = r2 + r4
            r6.f37234w = r2
            goto L27
        L26:
            r1 = 0
        L27:
            r6.hashCode()
            java.util.concurrent.TimeUnit r0 = java.util.concurrent.TimeUnit.SECONDS
            r0.convert(r7, r9)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.igexin.c.a.d.f.a(long, java.util.concurrent.TimeUnit):int");
    }

    public void b_() throws Exception {
        this.K = Thread.currentThread();
        this.f37228q = true;
        hashCode();
        this.K.getName();
    }

    public void d() {
        this.f37231t = true;
    }

    @Override // com.igexin.c.a.d.a.f
    public void d_() {
        if (this.f37224m || this.f37225n) {
            a();
        }
    }

    public abstract void e();

    public abstract void f();

    public final void l() {
        this.f37224m = true;
    }

    public final boolean m() {
        return this.f37226o;
    }

    public final boolean n() {
        return this.f37225n;
    }

    public final void o() {
        if (!this.f37227p && !this.f37229r && !this.f37230s) {
            this.f37224m = true;
            this.f37228q = false;
        } else if (this.f37229r && !this.f37224m) {
            this.f37228q = false;
        } else {
            if (!this.f37227p || this.f37226o || this.f37224m) {
                return;
            }
            this.f37228q = false;
        }
    }

    public final void p() {
        if (this.O != null) {
            int i11 = d.a.f37199a;
        }
    }

    private f(int i11, byte b11) {
        this.C = i11;
        this.O = null;
        ReentrantLock reentrantLock = new ReentrantLock();
        this.I = reentrantLock;
        this.J = reentrantLock.newCondition();
    }

    private void b(Object obj) {
        this.F = obj;
    }

    public final long a(TimeUnit timeUnit) {
        return timeUnit.convert(t(), TimeUnit.MILLISECONDS);
    }

    @Override // com.igexin.c.a.d.a.a
    public void a() {
        this.F = null;
        this.E = null;
        this.K = null;
    }

    public final void a(int i11) {
        this.f37223a = (byte) (((i11 & 15) << 4) | ((byte) (this.f37223a & 15)));
    }

    public final void a(int i11, com.igexin.c.a.d.a.g gVar) {
        if (i11 < 0) {
            throw new IllegalArgumentException("second must > 0");
        }
        this.B = i11;
        this.G = gVar;
    }

    private void a(int i11, TimeUnit timeUnit) {
        this.f37233v = false;
        this.E = null;
        this.f37234w = 0L;
        byte b11 = this.f37223a;
        this.f37223a = (byte) (b11 + ((b11 & 15) < 15 ? (byte) 1 : (byte) 0));
        this.f37224m = false;
        this.f37228q = false;
        this.f37231t = false;
        a(i11, timeUnit);
    }

    private void a(long j11) {
        this.f37236z = j11;
    }

    private void a(PowerManager.WakeLock wakeLock) {
        this.M = wakeLock;
    }

    public final void a(com.igexin.c.a.d.a.d dVar) {
        this.O = dVar;
    }

    public final void a(f fVar) {
        this.C = fVar.C;
        this.f37223a = (byte) (fVar.f37223a & 240);
        this.A = fVar.A;
        this.D = fVar.D;
        this.O = fVar.O;
        this.B = fVar.B;
        this.G = fVar.G;
    }

    private boolean a(Object obj) {
        if (!this.f37224m) {
            return false;
        }
        this.f37228q = false;
        this.f37225n = false;
        this.f37224m = false;
        this.F = obj;
        return true;
    }

    private static void D() throws Exception {
    }
}
