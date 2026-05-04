package io.ktor.client.engine.apache;

import c40.a0;
import c40.h1;
import c40.l2;
import c40.n2;
import c40.r0;
import c40.x;
import cx.z;
import java.nio.ByteBuffer;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.g0;
import org.apache.http.HttpResponse;
import org.apache.http.protocol.HttpContext;
import w70.b0;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class t implements b0<g2>, r0 {

    /* renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f60783i = AtomicIntegerFieldUpdater.newUpdater(t.class, "waiting");

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final kotlin.coroutines.d f60784a;

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public final z f60785b;

    /* renamed from: c, reason: collision with root package name */
    @m80.k
    public final v f60786c;

    /* renamed from: d, reason: collision with root package name */
    @m80.k
    public final a0 f60787d;

    /* renamed from: e, reason: collision with root package name */
    @m80.k
    public final kotlin.coroutines.d f60788e;

    /* renamed from: f, reason: collision with root package name */
    @m80.k
    public final io.ktor.utils.io.b f60789f;

    /* renamed from: g, reason: collision with root package name */
    @m80.k
    public final x<HttpResponse> f60790g;

    /* renamed from: h, reason: collision with root package name */
    @m80.k
    public final io.ktor.utils.io.g f60791h;

    @m80.k
    volatile /* synthetic */ int waiting;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "io.ktor.client.engine.apache.ApacheResponseConsumer$consumeContent$2", f = "ApacheResponseConsumer.kt", i = {}, l = {69}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements x00.p<r0, j00.c<? super g2>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f60792a;

        public a(j00.c<? super a> cVar) {
            super(2, cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final j00.c<g2> create(Object obj, j00.c<?> cVar) {
            return t.this.new a(cVar);
        }

        @Override // x00.p
        public final Object invoke(r0 r0Var, j00.c<? super g2> cVar) {
            return ((a) create(r0Var, cVar)).invokeSuspend(g2.f100423a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object l11 = kotlin.coroutines.intrinsics.b.l();
            int i11 = this.f60792a;
            try {
                if (i11 == 0) {
                    kotlin.e.n(obj);
                    if (t.f60783i.getAndSet(t.this, 1) != 0) {
                        throw new IllegalStateException("Check failed.");
                    }
                    io.ktor.utils.io.b bVar = t.this.f60789f;
                    this.f60792a = 1;
                    if (io.ktor.utils.io.q.c(bVar, this) == l11) {
                        return l11;
                    }
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.e.n(obj);
                }
                if (t.f60783i.getAndSet(t.this, 0) == 0) {
                    throw new IllegalStateException("Check failed.");
                }
                t.this.f60786c.c();
                return g2.f100423a;
            } catch (Throwable th2) {
                if (t.f60783i.getAndSet(t.this, 0) == 0) {
                    throw new IllegalStateException("Check failed.");
                }
                t.this.f60786c.c();
                throw th2;
            }
        }
    }

    public t(@m80.k kotlin.coroutines.d parentContext, @m80.k z requestData) {
        g0.p(parentContext, "parentContext");
        g0.p(requestData, "requestData");
        this.f60784a = parentContext;
        this.f60785b = requestData;
        this.f60786c = new v();
        l2.b bVar = l2.f7886e0;
        a0 a11 = n2.a((l2) parentContext.get(bVar));
        this.f60787d = a11;
        this.f60788e = parentContext.plus(a11);
        this.waiting = 0;
        io.ktor.utils.io.b bVar2 = new io.ktor.utils.io.b(false, 1, null);
        io.ktor.utils.io.f.b(bVar2, a11);
        this.f60789f = bVar2;
        this.f60790g = c40.z.c(null, 1, null);
        this.f60791h = bVar2;
        l2 l2Var = (l2) getCoroutineContext().get(bVar);
        if (l2Var != null) {
            l2.a.g(l2Var, true, false, new x00.l() { // from class: io.ktor.client.engine.apache.s
                @Override // x00.l
                public final Object invoke(Object obj) {
                    g2 i11;
                    i11 = t.i(t.this, (Throwable) obj);
                    return i11;
                }
            }, 2, null);
        }
    }

    public static final g2 H(Ref.IntRef intRef, m70.a aVar, ByteBuffer it) {
        g0.p(it, "it");
        intRef.element = aVar.read(it);
        return g2.f100423a;
    }

    public static final g2 i(t tVar, Throwable th2) {
        if (th2 != null) {
            tVar.f60790g.r(th2);
            tVar.f60791h.a(th2);
        }
        return g2.f100423a;
    }

    @Override // w70.b0
    public void B(@m80.k HttpResponse response) {
        g0.p(response, "response");
        this.f60790g.c0(response);
    }

    @m80.k
    public final io.ktor.utils.io.g S() {
        return this.f60791h;
    }

    @m80.l
    public final Object Z(@m80.k j00.c<? super HttpResponse> cVar) {
        return this.f60790g.i(cVar);
    }

    @Override // w70.b0
    public void b(@m80.k Exception cause) {
        g0.p(cause, "cause");
        Exception a11 = l.a(cause, this.f60785b);
        this.f60787d.r(a11);
        this.f60790g.r(a11);
        this.f60791h.a(a11);
    }

    @Override // org.apache.http.concurrent.Cancellable
    public boolean cancel() {
        return true;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f60789f.close();
        this.f60787d.complete();
    }

    @Override // c40.r0
    @m80.k
    public kotlin.coroutines.d getCoroutineContext() {
        return this.f60788e;
    }

    @Override // w70.b0
    public /* bridge */ /* synthetic */ g2 getResult() {
        V();
        return g2.f100423a;
    }

    @Override // w70.b0
    public void h(@m80.k final m70.a decoder, @m80.k m70.g ioctrl) {
        int i11;
        g0.p(decoder, "decoder");
        g0.p(ioctrl, "ioctrl");
        if (this.waiting != 0) {
            throw new IllegalStateException("Check failed.");
        }
        final Ref.IntRef intRef = new Ref.IntRef();
        do {
            intRef.element = 0;
            io.ktor.utils.io.r.e(this.f60789f, 0, new x00.l() { // from class: io.ktor.client.engine.apache.r
                @Override // x00.l
                public final Object invoke(Object obj) {
                    g2 H;
                    H = t.H(Ref.IntRef.this, decoder, (ByteBuffer) obj);
                    return H;
                }
            }, 1, null);
            this.f60789f.c();
            i11 = intRef.element;
        } while (i11 > 0);
        if (i11 < 0 || decoder.e()) {
            close();
        } else if (intRef.element == 0) {
            this.f60786c.e(ioctrl);
            c40.k.f(this, h1.g(), null, new a(null), 2, null);
        }
    }

    @Override // w70.b0
    public boolean isDone() {
        return this.f60789f.h();
    }

    @Override // w70.b0
    @m80.l
    public Exception m() {
        return (Exception) this.f60789f.b();
    }

    @Override // w70.b0
    public void p(@m80.k HttpContext context) {
        g0.p(context, "context");
    }

    public void V() {
    }
}
