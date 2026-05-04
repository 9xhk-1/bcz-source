package tx;

import c40.p2;
import java.nio.ByteBuffer;
import java.nio.channels.ByteChannel;
import java.nio.channels.ClosedChannelException;
import java.nio.channels.ReadableByteChannel;
import java.nio.channels.SelectableChannel;
import java.nio.channels.WritableByteChannel;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import tx.p0;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@kotlin.jvm.internal.u0({"SMAP\nNIOSocketImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NIOSocketImpl.kt\nio/ktor/network/sockets/NIOSocketImpl\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,147:1\n1#2:148\n*E\n"})
/* loaded from: classes8.dex */
public abstract class g0<S extends SelectableChannel & ByteChannel> extends sx.f implements h0, c40.r0 {

    /* renamed from: e, reason: collision with root package name */
    @m80.k
    public final S f91079e;

    /* renamed from: f, reason: collision with root package name */
    @m80.k
    public final sx.g f91080f;

    /* renamed from: g, reason: collision with root package name */
    @m80.l
    public final pz.h<ByteBuffer> f91081g;

    /* renamed from: h, reason: collision with root package name */
    @m80.l
    public final p0.e f91082h;

    /* renamed from: i, reason: collision with root package name */
    @m80.k
    public final AtomicBoolean f91083i;

    /* renamed from: j, reason: collision with root package name */
    @m80.k
    public final AtomicReference<io.ktor.utils.io.i0> f91084j;

    /* renamed from: k, reason: collision with root package name */
    @m80.k
    public final AtomicReference<io.ktor.utils.io.l0> f91085k;

    /* renamed from: l, reason: collision with root package name */
    @m80.k
    public final c40.a0 f91086l;

    public /* synthetic */ g0(SelectableChannel selectableChannel, sx.g gVar, pz.h hVar, p0.e eVar, int i11, kotlin.jvm.internal.v vVar) {
        this(selectableChannel, gVar, hVar, (i11 & 8) != 0 ? null : eVar);
    }

    public static final g2 m0(g0 g0Var) {
        g0Var.y0();
        return g2.f100423a;
    }

    public static final io.ktor.utils.io.l0 o0(g0 g0Var, io.ktor.utils.io.b bVar) {
        return g0Var.f91081g != null ? j.f(g0Var, bVar, (ReadableByteChannel) g0Var.getChannel(), g0Var, g0Var.f91080f, g0Var.f91081g, g0Var.f91082h) : j.d(g0Var, bVar, (ReadableByteChannel) g0Var.getChannel(), g0Var, g0Var.f91080f, g0Var.f91082h);
    }

    public static final io.ktor.utils.io.i0 v0(g0 g0Var, io.ktor.utils.io.b bVar) {
        return l.a(g0Var, bVar, (WritableByteChannel) g0Var.getChannel(), g0Var, g0Var.f91080f, g0Var.f91082h);
    }

    public final boolean C0(AtomicReference<? extends io.ktor.utils.io.s> atomicReference) {
        io.ktor.utils.io.s sVar = atomicReference.get();
        return sVar == null || io.ktor.utils.io.q.k(sVar);
    }

    public final Throwable D0(AtomicReference<? extends io.ktor.utils.io.s> atomicReference) {
        CancellationException g11;
        io.ktor.utils.io.s sVar = atomicReference.get();
        if (sVar != null) {
            if (!io.ktor.utils.io.q.j(sVar)) {
                sVar = null;
            }
            if (sVar != null && (g11 = io.ktor.utils.io.q.g(sVar)) != null) {
                return g11.getCause();
            }
        }
        return null;
    }

    @m80.l
    public final pz.h<ByteBuffer> H0() {
        return this.f91081g;
    }

    @m80.k
    public final sx.g K0() {
        return this.f91080f;
    }

    @Override // tx.d
    @m80.k
    /* renamed from: P0, reason: merged with bridge method [inline-methods] */
    public c40.a0 Z3() {
        return this.f91086l;
    }

    public final Throwable Z() {
        try {
            getChannel().close();
            super.close();
            this.f91080f.B8(this);
            return null;
        } catch (Throwable th2) {
            this.f91080f.B8(this);
            return th2;
        }
    }

    @Override // tx.e
    @m80.k
    public final io.ktor.utils.io.i0 a(@m80.k final io.ktor.utils.io.b channel) {
        kotlin.jvm.internal.g0.p(channel, "channel");
        return (io.ktor.utils.io.i0) c0("writing", channel, this.f91084j, new x00.a() { // from class: tx.d0
            @Override // x00.a
            public final Object invoke() {
                io.ktor.utils.io.i0 v02;
                v02 = g0.v0(g0.this, channel);
                return v02;
            }
        });
    }

    public final <J extends io.ktor.utils.io.s> J c0(String str, io.ktor.utils.io.b bVar, AtomicReference<J> atomicReference, x00.a<? extends J> aVar) {
        if (this.f91083i.get()) {
            ClosedChannelException closedChannelException = new ClosedChannelException();
            io.ktor.utils.io.q.e(bVar, closedChannelException);
            throw closedChannelException;
        }
        J invoke = aVar.invoke();
        if (!androidx.camera.view.q.a(atomicReference, null, invoke)) {
            IllegalStateException illegalStateException = new IllegalStateException(str + " channel has already been set");
            io.ktor.utils.io.q.d(invoke);
            throw illegalStateException;
        }
        if (!this.f91083i.get()) {
            io.ktor.utils.io.f.c(bVar, invoke);
            io.ktor.utils.io.q.h(invoke, new x00.a() { // from class: tx.f0
                @Override // x00.a
                public final Object invoke() {
                    g2 m02;
                    m02 = g0.m0(g0.this);
                    return m02;
                }
            });
            return invoke;
        }
        ClosedChannelException closedChannelException2 = new ClosedChannelException();
        io.ktor.utils.io.q.d(invoke);
        io.ktor.utils.io.q.e(bVar, closedChannelException2);
        throw closedChannelException2;
    }

    @Override // sx.f, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        io.ktor.utils.io.m b11;
        if (this.f91083i.compareAndSet(false, true)) {
            io.ktor.utils.io.i0 i0Var = this.f91084j.get();
            if (i0Var != null && (b11 = i0Var.b()) != null) {
                io.ktor.utils.io.n.c(b11);
            }
            io.ktor.utils.io.l0 l0Var = this.f91085k.get();
            if (l0Var != null) {
                io.ktor.utils.io.q.d(l0Var);
            }
            y0();
        }
    }

    @Override // sx.f, c40.k1
    public void dispose() {
        close();
    }

    @Override // sx.f, sx.e
    @m80.k
    public S getChannel() {
        return this.f91079e;
    }

    @Override // c40.r0
    @m80.k
    public kotlin.coroutines.d getCoroutineContext() {
        return Z3();
    }

    @Override // tx.c
    @m80.k
    public final io.ktor.utils.io.l0 r(@m80.k final io.ktor.utils.io.b channel) {
        kotlin.jvm.internal.g0.p(channel, "channel");
        return (io.ktor.utils.io.l0) c0("reading", channel, this.f91085k, new x00.a() { // from class: tx.e0
            @Override // x00.a
            public final Object invoke() {
                io.ktor.utils.io.l0 o02;
                o02 = g0.o0(g0.this, channel);
                return o02;
            }
        });
    }

    public final void y0() {
        if (this.f91083i.get() && C0(this.f91084j) && C0(this.f91085k)) {
            Throwable D0 = D0(this.f91084j);
            Throwable D02 = D0(this.f91085k);
            Throwable z02 = z0(z0(D0, D02), Z());
            if (z02 == null) {
                Z3().complete();
            } else {
                Z3().r(z02);
            }
        }
    }

    public final Throwable z0(Throwable th2, Throwable th3) {
        if (th2 == null) {
            return th3;
        }
        if (th3 == null || th2 == th3) {
            return th2;
        }
        yz.r.a(th2, th3);
        return th2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g0(@m80.k S channel, @m80.k sx.g selector, @m80.l pz.h<ByteBuffer> hVar, @m80.l p0.e eVar) {
        super(channel);
        c40.a0 c11;
        kotlin.jvm.internal.g0.p(channel, "channel");
        kotlin.jvm.internal.g0.p(selector, "selector");
        this.f91079e = channel;
        this.f91080f = selector;
        this.f91081g = hVar;
        this.f91082h = eVar;
        this.f91083i = new AtomicBoolean();
        this.f91084j = new AtomicReference<>();
        this.f91085k = new AtomicReference<>();
        c11 = p2.c(null, 1, null);
        this.f91086l = c11;
    }

    public static /* synthetic */ void G0(AtomicReference atomicReference) {
    }
}
