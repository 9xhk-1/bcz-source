package l60;

import java.io.Closeable;
import java.io.IOException;
import java.util.concurrent.locks.ReentrantLock;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@kotlin.jvm.internal.u0({"SMAP\nFileHandle.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FileHandle.kt\nokio/FileHandle\n+ 2 -JvmPlatform.kt\nokio/_JvmPlatformKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 RealBufferedSource.kt\nokio/RealBufferedSource\n+ 5 RealBufferedSink.kt\nokio/RealBufferedSink\n+ 6 Util.kt\nokio/-SegmentedByteString\n*L\n1#1,444:1\n40#2:445\n40#2:447\n40#2:448\n40#2:449\n40#2:450\n40#2:451\n40#2:452\n40#2:453\n40#2:457\n40#2:459\n1#3:446\n63#4:454\n63#4:455\n63#4:456\n51#5:458\n85#6:460\n85#6:461\n*S KotlinDebug\n*F\n+ 1 FileHandle.kt\nokio/FileHandle\n*L\n69#1:445\n81#1:447\n92#1:448\n105#1:449\n119#1:450\n129#1:451\n139#1:452\n151#1:453\n221#1:457\n287#1:459\n169#1:454\n195#1:455\n202#1:456\n248#1:458\n345#1:460\n374#1:461\n*E\n"})
/* loaded from: classes8.dex */
public abstract class r implements Closeable {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f70478a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f70479b;

    /* renamed from: c, reason: collision with root package name */
    public int f70480c;

    /* renamed from: d, reason: collision with root package name */
    @m80.k
    public final ReentrantLock f70481d = l1.b();

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @kotlin.jvm.internal.u0({"SMAP\nFileHandle.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FileHandle.kt\nokio/FileHandle$FileHandleSink\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 -JvmPlatform.kt\nokio/_JvmPlatformKt\n*L\n1#1,444:1\n1#2:445\n40#3:446\n*S KotlinDebug\n*F\n+ 1 FileHandle.kt\nokio/FileHandle$FileHandleSink\n*L\n410#1:446\n*E\n"})
    public static final class a implements e1 {

        /* renamed from: a, reason: collision with root package name */
        @m80.k
        public final r f70482a;

        /* renamed from: b, reason: collision with root package name */
        public long f70483b;

        /* renamed from: c, reason: collision with root package name */
        public boolean f70484c;

        public a(@m80.k r fileHandle, long j11) {
            kotlin.jvm.internal.g0.p(fileHandle, "fileHandle");
            this.f70482a = fileHandle;
            this.f70483b = j11;
        }

        @Override // l60.e1
        @m80.k
        public i1 D() {
            return i1.f70438f;
        }

        public final boolean a() {
            return this.f70484c;
        }

        @m80.k
        public final r c() {
            return this.f70482a;
        }

        @Override // l60.e1, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            if (this.f70484c) {
                return;
            }
            this.f70484c = true;
            ReentrantLock k11 = this.f70482a.k();
            k11.lock();
            try {
                r rVar = this.f70482a;
                rVar.f70480c--;
                if (this.f70482a.f70480c == 0 && this.f70482a.f70479b) {
                    g2 g2Var = g2.f100423a;
                    k11.unlock();
                    this.f70482a.C();
                }
            } finally {
                k11.unlock();
            }
        }

        public final long e() {
            return this.f70483b;
        }

        public final void f(boolean z11) {
            this.f70484c = z11;
        }

        @Override // l60.e1, java.io.Flushable
        public void flush() {
            if (this.f70484c) {
                throw new IllegalStateException("closed");
            }
            this.f70482a.E();
        }

        public final void i(long j11) {
            this.f70483b = j11;
        }

        @Override // l60.e1
        public void y8(@m80.k k source, long j11) {
            kotlin.jvm.internal.g0.p(source, "source");
            if (this.f70484c) {
                throw new IllegalStateException("closed");
            }
            this.f70482a.s0(this.f70483b, source, j11);
            this.f70483b += j11;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @kotlin.jvm.internal.u0({"SMAP\nFileHandle.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FileHandle.kt\nokio/FileHandle$FileHandleSource\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 -JvmPlatform.kt\nokio/_JvmPlatformKt\n*L\n1#1,444:1\n1#2:445\n40#3:446\n*S KotlinDebug\n*F\n+ 1 FileHandle.kt\nokio/FileHandle$FileHandleSource\n*L\n436#1:446\n*E\n"})
    public static final class b implements g1 {

        /* renamed from: a, reason: collision with root package name */
        @m80.k
        public final r f70485a;

        /* renamed from: b, reason: collision with root package name */
        public long f70486b;

        /* renamed from: c, reason: collision with root package name */
        public boolean f70487c;

        public b(@m80.k r fileHandle, long j11) {
            kotlin.jvm.internal.g0.p(fileHandle, "fileHandle");
            this.f70485a = fileHandle;
            this.f70486b = j11;
        }

        @Override // l60.g1
        @m80.k
        public i1 D() {
            return i1.f70438f;
        }

        @Override // l60.g1
        public long L3(@m80.k k sink, long j11) {
            kotlin.jvm.internal.g0.p(sink, "sink");
            if (this.f70487c) {
                throw new IllegalStateException("closed");
            }
            long Z = this.f70485a.Z(this.f70486b, sink, j11);
            if (Z != -1) {
                this.f70486b += Z;
            }
            return Z;
        }

        public final boolean a() {
            return this.f70487c;
        }

        @m80.k
        public final r c() {
            return this.f70485a;
        }

        @Override // l60.g1, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            if (this.f70487c) {
                return;
            }
            this.f70487c = true;
            ReentrantLock k11 = this.f70485a.k();
            k11.lock();
            try {
                r rVar = this.f70485a;
                rVar.f70480c--;
                if (this.f70485a.f70480c == 0 && this.f70485a.f70479b) {
                    g2 g2Var = g2.f100423a;
                    k11.unlock();
                    this.f70485a.C();
                }
            } finally {
                k11.unlock();
            }
        }

        public final long e() {
            return this.f70486b;
        }

        public final void f(boolean z11) {
            this.f70487c = z11;
        }

        public final void i(long j11) {
            this.f70486b = j11;
        }
    }

    public r(boolean z11) {
        this.f70478a = z11;
    }

    public static /* synthetic */ e1 h0(r rVar, long j11, int i11, Object obj) throws IOException {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: sink");
        }
        if ((i11 & 1) != 0) {
            j11 = 0;
        }
        return rVar.f0(j11);
    }

    public static /* synthetic */ g1 k0(r rVar, long j11, int i11, Object obj) throws IOException {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: source");
        }
        if ((i11 & 1) != 0) {
            j11 = 0;
        }
        return rVar.i0(j11);
    }

    public abstract void C() throws IOException;

    public abstract void E() throws IOException;

    public abstract int H(long j11, @m80.k byte[] bArr, int i11, int i12) throws IOException;

    public abstract void I(long j11) throws IOException;

    public abstract long L() throws IOException;

    public abstract void S(long j11, @m80.k byte[] bArr, int i11, int i12) throws IOException;

    public final int U(long j11, @m80.k byte[] array, int i11, int i12) throws IOException {
        kotlin.jvm.internal.g0.p(array, "array");
        ReentrantLock reentrantLock = this.f70481d;
        reentrantLock.lock();
        try {
            if (this.f70479b) {
                throw new IllegalStateException("closed");
            }
            g2 g2Var = g2.f100423a;
            reentrantLock.unlock();
            return H(j11, array, i11, i12);
        } catch (Throwable th2) {
            reentrantLock.unlock();
            throw th2;
        }
    }

    public final long V(long j11, @m80.k k sink, long j12) throws IOException {
        kotlin.jvm.internal.g0.p(sink, "sink");
        ReentrantLock reentrantLock = this.f70481d;
        reentrantLock.lock();
        try {
            if (this.f70479b) {
                throw new IllegalStateException("closed");
            }
            g2 g2Var = g2.f100423a;
            reentrantLock.unlock();
            return Z(j11, sink, j12);
        } catch (Throwable th2) {
            reentrantLock.unlock();
            throw th2;
        }
    }

    public final long Z(long j11, k kVar, long j12) {
        if (j12 < 0) {
            throw new IllegalArgumentException(("byteCount < 0: " + j12).toString());
        }
        long j13 = j12 + j11;
        long j14 = j11;
        while (true) {
            if (j14 >= j13) {
                break;
            }
            c1 m12 = kVar.m1(1);
            int H = H(j14, m12.f70383a, m12.f70385c, (int) Math.min(j13 - j14, 8192 - r7));
            if (H == -1) {
                if (m12.f70384b == m12.f70385c) {
                    kVar.f70446a = m12.b();
                    d1.d(m12);
                }
                if (j11 == j14) {
                    return -1L;
                }
            } else {
                m12.f70385c += H;
                long j15 = H;
                j14 += j15;
                kVar.g1(kVar.size() + j15);
            }
        }
        return j14 - j11;
    }

    public final void a0(@m80.k e1 sink, long j11) throws IOException {
        kotlin.jvm.internal.g0.p(sink, "sink");
        if (!(sink instanceof a1)) {
            if (!(sink instanceof a) || ((a) sink).c() != this) {
                throw new IllegalArgumentException("sink was not created by this FileHandle");
            }
            a aVar = (a) sink;
            if (aVar.a()) {
                throw new IllegalStateException("closed");
            }
            aVar.i(j11);
            return;
        }
        a1 a1Var = (a1) sink;
        e1 e1Var = a1Var.f70362a;
        if (!(e1Var instanceof a) || ((a) e1Var).c() != this) {
            throw new IllegalArgumentException("sink was not created by this FileHandle");
        }
        a aVar2 = (a) e1Var;
        if (aVar2.a()) {
            throw new IllegalStateException("closed");
        }
        a1Var.A();
        aVar2.i(j11);
    }

    public final void c0(@m80.k g1 source, long j11) throws IOException {
        kotlin.jvm.internal.g0.p(source, "source");
        if (!(source instanceof b1)) {
            if (!(source instanceof b) || ((b) source).c() != this) {
                throw new IllegalArgumentException("source was not created by this FileHandle");
            }
            b bVar = (b) source;
            if (bVar.a()) {
                throw new IllegalStateException("closed");
            }
            bVar.i(j11);
            return;
        }
        b1 b1Var = (b1) source;
        g1 g1Var = b1Var.f70370a;
        if (!(g1Var instanceof b) || ((b) g1Var).c() != this) {
            throw new IllegalArgumentException("source was not created by this FileHandle");
        }
        b bVar2 = (b) g1Var;
        if (bVar2.a()) {
            throw new IllegalStateException("closed");
        }
        long size = b1Var.f70371b.size();
        long e11 = j11 - (bVar2.e() - size);
        if (0 <= e11 && e11 < size) {
            b1Var.skip(e11);
        } else {
            b1Var.f70371b.e();
            bVar2.i(j11);
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        ReentrantLock reentrantLock = this.f70481d;
        reentrantLock.lock();
        try {
            if (this.f70479b) {
                return;
            }
            this.f70479b = true;
            if (this.f70480c != 0) {
                return;
            }
            g2 g2Var = g2.f100423a;
            reentrantLock.unlock();
            C();
        } finally {
            reentrantLock.unlock();
        }
    }

    public final void d0(long j11) throws IOException {
        if (!this.f70478a) {
            throw new IllegalStateException("file handle is read-only");
        }
        ReentrantLock reentrantLock = this.f70481d;
        reentrantLock.lock();
        try {
            if (this.f70479b) {
                throw new IllegalStateException("closed");
            }
            g2 g2Var = g2.f100423a;
            reentrantLock.unlock();
            I(j11);
        } catch (Throwable th2) {
            reentrantLock.unlock();
            throw th2;
        }
    }

    @m80.k
    public final e1 f0(long j11) throws IOException {
        if (!this.f70478a) {
            throw new IllegalStateException("file handle is read-only");
        }
        ReentrantLock reentrantLock = this.f70481d;
        reentrantLock.lock();
        try {
            if (this.f70479b) {
                throw new IllegalStateException("closed");
            }
            this.f70480c++;
            reentrantLock.unlock();
            return new a(this, j11);
        } catch (Throwable th2) {
            reentrantLock.unlock();
            throw th2;
        }
    }

    public final void flush() throws IOException {
        if (!this.f70478a) {
            throw new IllegalStateException("file handle is read-only");
        }
        ReentrantLock reentrantLock = this.f70481d;
        reentrantLock.lock();
        try {
            if (this.f70479b) {
                throw new IllegalStateException("closed");
            }
            g2 g2Var = g2.f100423a;
            reentrantLock.unlock();
            E();
        } catch (Throwable th2) {
            reentrantLock.unlock();
            throw th2;
        }
    }

    @m80.k
    public final g1 i0(long j11) throws IOException {
        ReentrantLock reentrantLock = this.f70481d;
        reentrantLock.lock();
        try {
            if (this.f70479b) {
                throw new IllegalStateException("closed");
            }
            this.f70480c++;
            reentrantLock.unlock();
            return new b(this, j11);
        } catch (Throwable th2) {
            reentrantLock.unlock();
            throw th2;
        }
    }

    @m80.k
    public final e1 j() throws IOException {
        return f0(size());
    }

    @m80.k
    public final ReentrantLock k() {
        return this.f70481d;
    }

    public final void m0(long j11, @m80.k k source, long j12) throws IOException {
        kotlin.jvm.internal.g0.p(source, "source");
        if (!this.f70478a) {
            throw new IllegalStateException("file handle is read-only");
        }
        ReentrantLock reentrantLock = this.f70481d;
        reentrantLock.lock();
        try {
            if (this.f70479b) {
                throw new IllegalStateException("closed");
            }
            g2 g2Var = g2.f100423a;
            reentrantLock.unlock();
            s0(j11, source, j12);
        } catch (Throwable th2) {
            reentrantLock.unlock();
            throw th2;
        }
    }

    public final void o0(long j11, @m80.k byte[] array, int i11, int i12) {
        kotlin.jvm.internal.g0.p(array, "array");
        if (!this.f70478a) {
            throw new IllegalStateException("file handle is read-only");
        }
        ReentrantLock reentrantLock = this.f70481d;
        reentrantLock.lock();
        try {
            if (this.f70479b) {
                throw new IllegalStateException("closed");
            }
            g2 g2Var = g2.f100423a;
            reentrantLock.unlock();
            S(j11, array, i11, i12);
        } catch (Throwable th2) {
            reentrantLock.unlock();
            throw th2;
        }
    }

    public final boolean q() {
        return this.f70478a;
    }

    public final long r(@m80.k e1 sink) throws IOException {
        long j11;
        kotlin.jvm.internal.g0.p(sink, "sink");
        if (sink instanceof a1) {
            a1 a1Var = (a1) sink;
            j11 = a1Var.f70363b.size();
            sink = a1Var.f70362a;
        } else {
            j11 = 0;
        }
        if (!(sink instanceof a) || ((a) sink).c() != this) {
            throw new IllegalArgumentException("sink was not created by this FileHandle");
        }
        a aVar = (a) sink;
        if (aVar.a()) {
            throw new IllegalStateException("closed");
        }
        return aVar.e() + j11;
    }

    public final void s0(long j11, k kVar, long j12) {
        h.e(kVar.size(), 0L, j12);
        long j13 = j11 + j12;
        long j14 = j11;
        while (j14 < j13) {
            c1 c1Var = kVar.f70446a;
            kotlin.jvm.internal.g0.m(c1Var);
            int min = (int) Math.min(j13 - j14, c1Var.f70385c - c1Var.f70384b);
            S(j14, c1Var.f70383a, c1Var.f70384b, min);
            c1Var.f70384b += min;
            long j15 = min;
            j14 += j15;
            kVar.g1(kVar.size() - j15);
            if (c1Var.f70384b == c1Var.f70385c) {
                kVar.f70446a = c1Var.b();
                d1.d(c1Var);
            }
        }
    }

    public final long size() throws IOException {
        ReentrantLock reentrantLock = this.f70481d;
        reentrantLock.lock();
        try {
            if (this.f70479b) {
                throw new IllegalStateException("closed");
            }
            g2 g2Var = g2.f100423a;
            reentrantLock.unlock();
            return L();
        } catch (Throwable th2) {
            reentrantLock.unlock();
            throw th2;
        }
    }

    public final long w(@m80.k g1 source) throws IOException {
        long j11;
        kotlin.jvm.internal.g0.p(source, "source");
        if (source instanceof b1) {
            b1 b1Var = (b1) source;
            j11 = b1Var.f70371b.size();
            source = b1Var.f70370a;
        } else {
            j11 = 0;
        }
        if (!(source instanceof b) || ((b) source).c() != this) {
            throw new IllegalArgumentException("source was not created by this FileHandle");
        }
        b bVar = (b) source;
        if (bVar.a()) {
            throw new IllegalStateException("closed");
        }
        return bVar.e() - j11;
    }
}
