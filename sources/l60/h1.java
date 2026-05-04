package l60;

import android.support.v4.media.session.PlaybackStateCompat;
import androidx.media3.common.C;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class h1 {

    /* renamed from: a, reason: collision with root package name */
    public long f70410a;

    /* renamed from: b, reason: collision with root package name */
    public long f70411b;

    /* renamed from: c, reason: collision with root package name */
    public long f70412c;

    /* renamed from: d, reason: collision with root package name */
    public long f70413d;

    /* renamed from: e, reason: collision with root package name */
    @m80.k
    public final ReentrantLock f70414e;

    /* renamed from: f, reason: collision with root package name */
    @m80.k
    public final Condition f70415f;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a extends v {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ h1 f70416b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(e1 e1Var, h1 h1Var) {
            super(e1Var);
            this.f70416b = h1Var;
        }

        @Override // l60.v, l60.e1
        public void y8(k source, long j11) throws IOException {
            kotlin.jvm.internal.g0.p(source, "source");
            while (j11 > 0) {
                try {
                    long l11 = this.f70416b.l(j11);
                    super.y8(source, l11);
                    j11 -= l11;
                } catch (InterruptedException unused) {
                    Thread.currentThread().interrupt();
                    throw new InterruptedIOException("interrupted");
                }
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class b extends w {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ h1 f70417b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(g1 g1Var, h1 h1Var) {
            super(g1Var);
            this.f70417b = h1Var;
        }

        @Override // l60.w, l60.g1
        public long L3(k sink, long j11) {
            kotlin.jvm.internal.g0.p(sink, "sink");
            try {
                return super.L3(sink, this.f70417b.l(j11));
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
                throw new InterruptedIOException("interrupted");
            }
        }
    }

    public h1(long j11) {
        this.f70410a = j11;
        this.f70412c = 8192L;
        this.f70413d = PlaybackStateCompat.E;
        ReentrantLock reentrantLock = new ReentrantLock();
        this.f70414e = reentrantLock;
        Condition newCondition = reentrantLock.newCondition();
        kotlin.jvm.internal.g0.o(newCondition, "newCondition(...)");
        this.f70415f = newCondition;
    }

    public static /* synthetic */ void e(h1 h1Var, long j11, long j12, long j13, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            j12 = h1Var.f70412c;
        }
        long j14 = j12;
        if ((i11 & 4) != 0) {
            j13 = h1Var.f70413d;
        }
        h1Var.d(j11, j14, j13);
    }

    public final long a(long j11, long j12) {
        if (this.f70411b == 0) {
            return j12;
        }
        long max = Math.max(this.f70410a - j11, 0L);
        long i11 = this.f70413d - i(max);
        if (i11 >= j12) {
            this.f70410a = j11 + max + f(j12);
            return j12;
        }
        long j13 = this.f70412c;
        if (i11 >= j13) {
            this.f70410a = j11 + f(this.f70413d);
            return i11;
        }
        long min = Math.min(j13, j12);
        long f11 = max + f(min - this.f70413d);
        if (f11 != 0) {
            return -f11;
        }
        this.f70410a = j11 + f(this.f70413d);
        return min;
    }

    @w00.k
    public final void b(long j11) {
        e(this, j11, 0L, 0L, 6, null);
    }

    @w00.k
    public final void c(long j11, long j12) {
        e(this, j11, j12, 0L, 4, null);
    }

    @w00.k
    public final void d(long j11, long j12, long j13) {
        ReentrantLock reentrantLock = this.f70414e;
        reentrantLock.lock();
        try {
            if (j11 < 0) {
                throw new IllegalArgumentException("Failed requirement.");
            }
            if (j12 <= 0) {
                throw new IllegalArgumentException("Failed requirement.");
            }
            if (j13 < j12) {
                throw new IllegalArgumentException("Failed requirement.");
            }
            this.f70411b = j11;
            this.f70412c = j12;
            this.f70413d = j13;
            this.f70415f.signalAll();
            g2 g2Var = g2.f100423a;
        } finally {
            reentrantLock.unlock();
        }
    }

    public final long f(long j11) {
        return (j11 * C.NANOS_PER_SECOND) / this.f70411b;
    }

    @m80.k
    public final Condition g() {
        return this.f70415f;
    }

    @m80.k
    public final ReentrantLock h() {
        return this.f70414e;
    }

    public final long i(long j11) {
        return (j11 * this.f70411b) / C.NANOS_PER_SECOND;
    }

    @m80.k
    public final e1 j(@m80.k e1 sink) {
        kotlin.jvm.internal.g0.p(sink, "sink");
        return new a(sink, this);
    }

    @m80.k
    public final g1 k(@m80.k g1 source) {
        kotlin.jvm.internal.g0.p(source, "source");
        return new b(source, this);
    }

    public final long l(long j11) {
        if (j11 <= 0) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        ReentrantLock reentrantLock = this.f70414e;
        reentrantLock.lock();
        while (true) {
            try {
                long a11 = a(System.nanoTime(), j11);
                if (a11 >= 0) {
                    return a11;
                }
                this.f70415f.awaitNanos(-a11);
            } finally {
                reentrantLock.unlock();
            }
        }
    }

    public h1() {
        this(System.nanoTime());
    }
}
