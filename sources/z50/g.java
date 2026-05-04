package z50;

import a00.h0;
import e60.j;
import java.lang.ref.Reference;
import java.net.Socket;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import kotlin.jvm.internal.v;
import m80.k;
import m80.l;
import t50.r;
import yz.g2;
import z50.e;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nRealConnectionPool.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RealConnectionPool.kt\nokhttp3/internal/connection/RealConnectionPool\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 Util.kt\nokhttp3/internal/Util\n*L\n1#1,250:1\n1#2:251\n1774#3,4:252\n608#4,4:256\n608#4,4:260\n608#4,4:264\n*S KotlinDebug\n*F\n+ 1 RealConnectionPool.kt\nokhttp3/internal/connection/RealConnectionPool\n*L\n60#1:252,4\n95#1:256,4\n106#1:260,4\n215#1:264,4\n*E\n"})
/* loaded from: classes8.dex */
public final class g {

    /* renamed from: f, reason: collision with root package name */
    @k
    public static final a f101013f = new a(null);

    /* renamed from: a, reason: collision with root package name */
    public final int f101014a;

    /* renamed from: b, reason: collision with root package name */
    public final long f101015b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final y50.c f101016c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final b f101017d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final ConcurrentLinkedQueue<f> f101018e;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a {
        public /* synthetic */ a(v vVar) {
            this();
        }

        @k
        public final g a(@k t50.g connectionPool) {
            g0.p(connectionPool, "connectionPool");
            return connectionPool.c();
        }

        public a() {
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class b extends y50.a {
        public b(String str) {
            super(str, false, 2, null);
        }

        @Override // y50.a
        public long f() {
            return g.this.b(System.nanoTime());
        }
    }

    public g(@k y50.d taskRunner, int i11, long j11, @k TimeUnit timeUnit) {
        g0.p(taskRunner, "taskRunner");
        g0.p(timeUnit, "timeUnit");
        this.f101014a = i11;
        this.f101015b = timeUnit.toNanos(j11);
        this.f101016c = taskRunner.j();
        this.f101017d = new b(u50.f.f91854i + " ConnectionPool");
        this.f101018e = new ConcurrentLinkedQueue<>();
        if (j11 > 0) {
            return;
        }
        throw new IllegalArgumentException(("keepAliveDuration <= 0: " + j11).toString());
    }

    public final boolean a(@k okhttp3.a address, @k e call, @l List<r> list, boolean z11) {
        g0.p(address, "address");
        g0.p(call, "call");
        Iterator<f> it = this.f101018e.iterator();
        while (it.hasNext()) {
            f connection = it.next();
            g0.o(connection, "connection");
            synchronized (connection) {
                if (z11) {
                    try {
                        if (connection.A()) {
                        }
                        g2 g2Var = g2.f100423a;
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                if (connection.y(address, list)) {
                    call.c(connection);
                    return true;
                }
                g2 g2Var2 = g2.f100423a;
            }
        }
        return false;
    }

    public final long b(long j11) {
        Iterator<f> it = this.f101018e.iterator();
        int i11 = 0;
        long j12 = Long.MIN_VALUE;
        f fVar = null;
        int i12 = 0;
        while (it.hasNext()) {
            f connection = it.next();
            g0.o(connection, "connection");
            synchronized (connection) {
                if (g(connection, j11) > 0) {
                    i12++;
                } else {
                    i11++;
                    long u11 = j11 - connection.u();
                    if (u11 > j12) {
                        fVar = connection;
                        j12 = u11;
                    }
                    g2 g2Var = g2.f100423a;
                }
            }
        }
        long j13 = this.f101015b;
        if (j12 < j13 && i11 <= this.f101014a) {
            if (i11 > 0) {
                return j13 - j12;
            }
            if (i12 > 0) {
                return j13;
            }
            return -1L;
        }
        g0.m(fVar);
        synchronized (fVar) {
            if (!fVar.s().isEmpty()) {
                return 0L;
            }
            if (fVar.u() + j12 != j11) {
                return 0L;
            }
            fVar.H(true);
            this.f101018e.remove(fVar);
            u50.f.q(fVar.d());
            if (this.f101018e.isEmpty()) {
                this.f101016c.a();
            }
            return 0L;
        }
    }

    public final boolean c(@k f connection) {
        g0.p(connection, "connection");
        if (u50.f.f91853h && !Thread.holdsLock(connection)) {
            throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST hold lock on " + connection);
        }
        if (!connection.v() && this.f101014a != 0) {
            y50.c.p(this.f101016c, this.f101017d, 0L, 2, null);
            return false;
        }
        connection.H(true);
        this.f101018e.remove(connection);
        if (this.f101018e.isEmpty()) {
            this.f101016c.a();
        }
        return true;
    }

    public final int d() {
        return this.f101018e.size();
    }

    public final void e() {
        Socket socket;
        Iterator<f> it = this.f101018e.iterator();
        g0.o(it, "connections.iterator()");
        while (it.hasNext()) {
            f connection = it.next();
            g0.o(connection, "connection");
            synchronized (connection) {
                if (connection.s().isEmpty()) {
                    it.remove();
                    connection.H(true);
                    socket = connection.d();
                } else {
                    socket = null;
                }
            }
            if (socket != null) {
                u50.f.q(socket);
            }
        }
        if (this.f101018e.isEmpty()) {
            this.f101016c.a();
        }
    }

    public final int f() {
        boolean isEmpty;
        ConcurrentLinkedQueue<f> concurrentLinkedQueue = this.f101018e;
        int i11 = 0;
        if (concurrentLinkedQueue != null && concurrentLinkedQueue.isEmpty()) {
            return 0;
        }
        for (f it : concurrentLinkedQueue) {
            g0.o(it, "it");
            synchronized (it) {
                isEmpty = it.s().isEmpty();
            }
            if (isEmpty && (i11 = i11 + 1) < 0) {
                h0.a0();
            }
        }
        return i11;
    }

    public final int g(f fVar, long j11) {
        if (u50.f.f91853h && !Thread.holdsLock(fVar)) {
            throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST hold lock on " + fVar);
        }
        List<Reference<e>> s11 = fVar.s();
        int i11 = 0;
        while (i11 < s11.size()) {
            Reference<e> reference = s11.get(i11);
            if (reference.get() != null) {
                i11++;
            } else {
                g0.n(reference, "null cannot be cast to non-null type okhttp3.internal.connection.RealCall.CallReference");
                j.f49490a.g().o("A connection to " + fVar.b().d().w() + " was leaked. Did you forget to close a response body?", ((e.b) reference).a());
                s11.remove(i11);
                fVar.H(true);
                if (s11.isEmpty()) {
                    fVar.G(j11 - this.f101015b);
                    return 0;
                }
            }
        }
        return s11.size();
    }

    public final void h(@k f connection) {
        g0.p(connection, "connection");
        if (!u50.f.f91853h || Thread.holdsLock(connection)) {
            this.f101018e.add(connection);
            y50.c.p(this.f101016c, this.f101017d, 0L, 2, null);
            return;
        }
        throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST hold lock on " + connection);
    }
}
