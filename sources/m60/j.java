package m60;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import l60.c1;
import l60.d1;
import l60.e1;
import l60.f1;
import l60.g1;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class j implements f1 {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final Socket f72439a;

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public AtomicInteger f72440b;

    /* renamed from: c, reason: collision with root package name */
    @m80.k
    public final g1 f72441c;

    /* renamed from: d, reason: collision with root package name */
    @m80.k
    public final e1 f72442d;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @u0({"SMAP\nDefaultSocket.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DefaultSocket.kt\nokio/internal/DefaultSocket$SocketSink\n+ 2 Util.kt\nokio/-SegmentedByteString\n+ 3 AsyncTimeout.kt\nokio/AsyncTimeout\n*L\n1#1,176:1\n85#2:177\n195#3,11:178\n195#3,11:189\n195#3,11:200\n*S KotlinDebug\n*F\n+ 1 DefaultSocket.kt\nokio/internal/DefaultSocket$SocketSink\n*L\n60#1:177\n61#1:178,11\n77#1:189,11\n83#1:200,11\n*E\n"})
    public final class a implements e1 {

        /* renamed from: a, reason: collision with root package name */
        public final OutputStream f72443a;

        /* renamed from: b, reason: collision with root package name */
        @m80.k
        public final r f72444b;

        public a() {
            this.f72443a = j.this.c().getOutputStream();
            this.f72444b = new r(j.this.c());
        }

        @Override // l60.e1
        @m80.k
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public r D() {
            return this.f72444b;
        }

        @Override // l60.e1, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            r rVar = this.f72444b;
            j jVar = j.this;
            rVar.x();
            try {
                int a11 = y.a(jVar.f72440b, 1);
                if (a11 != 0) {
                    if (a11 != 3) {
                        if (!jVar.c().isClosed() && !jVar.c().isOutputShutdown()) {
                            this.f72443a.flush();
                            try {
                                jVar.c().shutdownOutput();
                            } catch (UnsupportedOperationException unused) {
                                this.f72443a.close();
                            }
                        }
                        return;
                    }
                    jVar.c().close();
                    g2 g2Var = g2.f100423a;
                    if (rVar.y()) {
                        throw rVar.u(null);
                    }
                }
            } catch (IOException e11) {
                if (!rVar.y()) {
                    throw e11;
                }
                throw rVar.u(e11);
            } finally {
                rVar.y();
            }
        }

        @Override // l60.e1, java.io.Flushable
        public void flush() {
            r rVar = this.f72444b;
            rVar.x();
            try {
                this.f72443a.flush();
                g2 g2Var = g2.f100423a;
                if (rVar.y()) {
                    throw rVar.u(null);
                }
            } catch (IOException e11) {
                if (!rVar.y()) {
                    throw e11;
                }
                throw rVar.u(e11);
            } finally {
                rVar.y();
            }
        }

        @m80.k
        public String toString() {
            return "sink(" + j.this.c() + ')';
        }

        @Override // l60.e1
        public void y8(@m80.k l60.k source, long j11) {
            g0.p(source, "source");
            l60.h.e(source.size(), 0L, j11);
            while (j11 > 0) {
                this.f72444b.j();
                c1 c1Var = source.f70446a;
                g0.m(c1Var);
                int min = (int) Math.min(j11, c1Var.f70385c - c1Var.f70384b);
                r rVar = this.f72444b;
                rVar.x();
                try {
                    try {
                        this.f72443a.write(c1Var.f70383a, c1Var.f70384b, min);
                        g2 g2Var = g2.f100423a;
                        if (rVar.y()) {
                            throw rVar.u(null);
                        }
                        c1Var.f70384b += min;
                        long j12 = min;
                        j11 -= j12;
                        source.g1(source.size() - j12);
                        if (c1Var.f70384b == c1Var.f70385c) {
                            source.f70446a = c1Var.b();
                            d1.d(c1Var);
                        }
                    } catch (IOException e11) {
                        if (!rVar.y()) {
                            throw e11;
                        }
                        throw rVar.u(e11);
                    }
                } catch (Throwable th2) {
                    rVar.y();
                    throw th2;
                }
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @u0({"SMAP\nDefaultSocket.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DefaultSocket.kt\nokio/internal/DefaultSocket$SocketSource\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 Util.kt\nokio/-SegmentedByteString\n+ 4 AsyncTimeout.kt\nokio/AsyncTimeout\n*L\n1#1,176:1\n1#2:177\n85#3:178\n195#4,11:179\n195#4,11:190\n*S KotlinDebug\n*F\n+ 1 DefaultSocket.kt\nokio/internal/DefaultSocket$SocketSource\n*L\n121#1:178\n123#1:179,11\n144#1:190,11\n*E\n"})
    public final class b implements g1 {

        /* renamed from: a, reason: collision with root package name */
        public final InputStream f72446a;

        /* renamed from: b, reason: collision with root package name */
        @m80.k
        public final r f72447b;

        public b() {
            this.f72446a = j.this.c().getInputStream();
            this.f72447b = new r(j.this.c());
        }

        @Override // l60.g1
        public long L3(@m80.k l60.k sink, long j11) {
            g0.p(sink, "sink");
            if (j11 == 0) {
                return 0L;
            }
            if (j11 < 0) {
                throw new IllegalArgumentException(("byteCount < 0: " + j11).toString());
            }
            this.f72447b.j();
            c1 m12 = sink.m1(1);
            int min = (int) Math.min(j11, 8192 - m12.f70385c);
            try {
                r rVar = this.f72447b;
                rVar.x();
                try {
                    int read = this.f72446a.read(m12.f70383a, m12.f70385c, min);
                    if (rVar.y()) {
                        throw rVar.u(null);
                    }
                    if (read != -1) {
                        m12.f70385c += read;
                        long j12 = read;
                        sink.g1(sink.size() + j12);
                        return j12;
                    }
                    if (m12.f70384b != m12.f70385c) {
                        return -1L;
                    }
                    sink.f70446a = m12.b();
                    d1.d(m12);
                    return -1L;
                } catch (IOException e11) {
                    if (rVar.y()) {
                        throw rVar.u(e11);
                    }
                    throw e11;
                } finally {
                    rVar.y();
                }
            } catch (AssertionError e12) {
                if (z.b(e12)) {
                    throw new IOException(e12);
                }
                throw e12;
            }
        }

        @Override // l60.g1
        @m80.k
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public r D() {
            return this.f72447b;
        }

        @Override // l60.g1, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            r rVar = this.f72447b;
            j jVar = j.this;
            rVar.x();
            try {
                int a11 = y.a(jVar.f72440b, 2);
                if (a11 != 0) {
                    if (a11 == 3) {
                        jVar.c().close();
                    } else {
                        if (jVar.c().isClosed() || jVar.c().isInputShutdown()) {
                            return;
                        }
                        try {
                            jVar.c().shutdownInput();
                        } catch (UnsupportedOperationException unused) {
                            this.f72446a.close();
                        }
                    }
                    g2 g2Var = g2.f100423a;
                    if (rVar.y()) {
                        throw rVar.u(null);
                    }
                }
            } catch (IOException e11) {
                if (!rVar.y()) {
                    throw e11;
                }
                throw rVar.u(e11);
            } finally {
                rVar.y();
            }
        }

        @m80.k
        public String toString() {
            return "source(" + j.this.c() + ')';
        }
    }

    public j(@m80.k Socket socket) {
        g0.p(socket, "socket");
        this.f72439a = socket;
        this.f72440b = new AtomicInteger();
        this.f72441c = new b();
        this.f72442d = new a();
    }

    @Override // l60.f1
    @m80.k
    public e1 a() {
        return this.f72442d;
    }

    @m80.k
    public final Socket c() {
        return this.f72439a;
    }

    @Override // l60.f1
    public void cancel() {
        this.f72439a.close();
    }

    @Override // l60.f1
    @m80.k
    public g1 getSource() {
        return this.f72441c;
    }

    @m80.k
    public String toString() {
        String socket = this.f72439a.toString();
        g0.o(socket, "toString(...)");
        return socket;
    }
}
