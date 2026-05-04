package tx;

import c40.y1;
import e40.l0;
import java.nio.ByteBuffer;
import java.nio.channels.DatagramChannel;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.DeprecationLevel;
import kotlin.NotImplementedError;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import n40.a;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@kotlin.jvm.internal.u0({"SMAP\nDatagramSendChannel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DatagramSendChannel.kt\nio/ktor/network/sockets/DatagramSendChannel\n+ 2 UnsafeBufferOperationsJvm.kt\nkotlinx/io/unsafe/UnsafeBufferOperationsJvmKt\n+ 3 UnsafeBufferOperations.kt\nkotlinx/io/unsafe/UnsafeBufferOperations\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 5 Pool.kt\nio/ktor/utils/io/pool/PoolKt\n+ 6 Mutex.kt\nkotlinx/coroutines/sync/MutexKt\n*L\n1#1,195:1\n50#2:196\n51#2,3:201\n99#3:197\n100#3,2:199\n102#3,6:204\n1#4:198\n156#5,5:210\n116#6,11:215\n*S KotlinDebug\n*F\n+ 1 DatagramSendChannel.kt\nio/ktor/network/sockets/DatagramSendChannel\n*L\n60#1:196\n60#1:201,3\n60#1:197\n60#1:199,2\n60#1:204,6\n60#1:198\n76#1:210,5\n94#1:215,11\n*E\n"})
/* loaded from: classes8.dex */
public final class u implements e40.l0<q> {

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f91187d = AtomicReferenceFieldUpdater.newUpdater(u.class, Object.class, "onCloseHandler");

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f91188e = AtomicIntegerFieldUpdater.newUpdater(u.class, "closed");

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final DatagramChannel f91189a;

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public final y f91190b;

    /* renamed from: c, reason: collision with root package name */
    @m80.k
    public final n40.a f91191c;

    @m80.k
    private volatile /* synthetic */ int closed;

    @m80.k
    private volatile /* synthetic */ Object closedCause;

    @m80.k
    private volatile /* synthetic */ Object onCloseHandler;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "io.ktor.network.sockets.DatagramSendChannel", f = "DatagramSendChannel.kt", i = {0, 0, 0, 1}, l = {201, 95}, m = "send", n = {"this", "element", "$this$withLock_u24default$iv", "$this$withLock_u24default$iv"}, s = {"L$0", "L$1", "L$2", "L$0"})
    public static final class a extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public Object f91192a;

        /* renamed from: b, reason: collision with root package name */
        public Object f91193b;

        /* renamed from: c, reason: collision with root package name */
        public Object f91194c;

        /* renamed from: d, reason: collision with root package name */
        public /* synthetic */ Object f91195d;

        /* renamed from: f, reason: collision with root package name */
        public int f91197f;

        public a(j00.c<? super a> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @m80.l
        public final Object invokeSuspend(@m80.k Object obj) {
            this.f91195d = obj;
            this.f91197f |= Integer.MIN_VALUE;
            return u.this.b(null, this);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "io.ktor.network.sockets.DatagramSendChannel$send$2$1", f = "DatagramSendChannel.kt", i = {0, 0, 0, 0, 0, 1, 1}, l = {113, 126}, m = "invokeSuspend", n = {"writeWithPool", "buffer$iv", "head$iv$iv", "bb$iv", "buffer", "$this$useInstance$iv", "instance$iv"}, s = {"L$0", "L$1", "L$2", "L$3", "L$4", "L$0", "L$1"})
    @kotlin.jvm.internal.u0({"SMAP\nDatagramSendChannel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DatagramSendChannel.kt\nio/ktor/network/sockets/DatagramSendChannel$send$2$1\n+ 2 UnsafeBufferOperationsJvm.kt\nkotlinx/io/unsafe/UnsafeBufferOperationsJvmKt\n+ 3 UnsafeBufferOperations.kt\nkotlinx/io/unsafe/UnsafeBufferOperations\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 5 Pool.kt\nio/ktor/utils/io/pool/PoolKt\n*L\n1#1,195:1\n50#2:196\n51#2,3:201\n99#3:197\n100#3,2:199\n102#3,6:204\n1#4:198\n156#5,5:210\n*S KotlinDebug\n*F\n+ 1 DatagramSendChannel.kt\nio/ktor/network/sockets/DatagramSendChannel$send$2$1\n*L\n98#1:196\n98#1:201,3\n98#1:197\n98#1:199,2\n98#1:204,6\n98#1:198\n117#1:210,5\n*E\n"})
    public static final class b extends SuspendLambda implements x00.p<c40.r0, j00.c<? super g2>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public Object f91198a;

        /* renamed from: b, reason: collision with root package name */
        public Object f91199b;

        /* renamed from: c, reason: collision with root package name */
        public Object f91200c;

        /* renamed from: d, reason: collision with root package name */
        public Object f91201d;

        /* renamed from: e, reason: collision with root package name */
        public Object f91202e;

        /* renamed from: f, reason: collision with root package name */
        public int f91203f;

        /* renamed from: g, reason: collision with root package name */
        public final /* synthetic */ q f91204g;

        /* renamed from: h, reason: collision with root package name */
        public final /* synthetic */ u f91205h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(q qVar, u uVar, j00.c<? super b> cVar) {
            super(2, cVar);
            this.f91204g = qVar;
            this.f91205h = uVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final j00.c<g2> create(Object obj, j00.c<?> cVar) {
            return new b(this.f91204g, this.f91205h, cVar);
        }

        @Override // x00.p
        public final Object invoke(c40.r0 r0Var, j00.c<? super g2> cVar) {
            return ((b) create(r0Var, cVar)).invokeSuspend(g2.f100423a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:40:0x0150, code lost:
        
            if (r4.l(r6, r14, r13) == r0) goto L48;
         */
        /* JADX WARN: Removed duplicated region for block: B:23:0x00e4  */
        /* JADX WARN: Removed duplicated region for block: B:33:0x0105  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r14) {
            /*
                Method dump skipped, instructions count: 360
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: tx.u.b.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "io.ktor.network.sockets.DatagramSendChannel", f = "DatagramSendChannel.kt", i = {0, 0, 0}, l = {136}, m = "sendSuspend", n = {"this", "buffer", "address"}, s = {"L$0", "L$1", "L$2"})
    public static final class c extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public Object f91206a;

        /* renamed from: b, reason: collision with root package name */
        public Object f91207b;

        /* renamed from: c, reason: collision with root package name */
        public Object f91208c;

        /* renamed from: d, reason: collision with root package name */
        public /* synthetic */ Object f91209d;

        /* renamed from: f, reason: collision with root package name */
        public int f91211f;

        public c(j00.c<? super c> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @m80.l
        public final Object invokeSuspend(@m80.k Object obj) {
            this.f91209d = obj;
            this.f91211f |= Integer.MIN_VALUE;
            return u.this.l(null, null, this);
        }
    }

    public u(@m80.k DatagramChannel channel, @m80.k y socket) {
        kotlin.jvm.internal.g0.p(channel, "channel");
        kotlin.jvm.internal.g0.p(socket, "socket");
        this.f91189a = channel;
        this.f91190b = socket;
        this.onCloseHandler = null;
        this.closed = 0;
        this.closedCause = null;
        this.f91191c = n40.g.b(false, 1, null);
    }

    @Override // e40.l0
    @m80.k
    public k40.j<q, e40.l0<q>> d() {
        throw new NotImplementedError("An operation is not implemented: [DatagramSendChannel] doesn't support [onSend] select clause");
    }

    public final void e() {
        x00.l lVar;
        x00.l lVar2;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        x00.l lVar3;
        do {
            x00.l lVar4 = (x00.l) this.onCloseHandler;
            lVar = x.f91216b;
            if (lVar4 == lVar) {
                return;
            }
            if (lVar4 != null) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f91187d;
                lVar2 = x.f91216b;
                if (!androidx.concurrent.futures.a.a(atomicReferenceFieldUpdater2, this, lVar4, lVar2)) {
                    throw new IllegalArgumentException("Failed requirement.");
                }
                lVar4.invoke(this.closedCause);
                return;
            }
            atomicReferenceFieldUpdater = f91187d;
            lVar3 = x.f91215a;
        } while (!androidx.concurrent.futures.a.a(atomicReferenceFieldUpdater, this, null, lVar3));
    }

    @m80.k
    public final DatagramChannel f() {
        return this.f91189a;
    }

    @m80.k
    public final y g() {
        return this.f91190b;
    }

    @Override // e40.l0
    @yz.n(level = DeprecationLevel.ERROR, message = "Deprecated in the favour of 'trySend' method", replaceWith = @yz.w0(expression = "trySend(element).isSuccess", imports = {}))
    /* renamed from: j, reason: merged with bridge method [inline-methods] */
    public boolean offer(@m80.k q qVar) {
        return l0.a.c(this, qVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    @Override // e40.l0
    @m80.l
    /* renamed from: k, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object b(@m80.k tx.q r9, @m80.k j00.c<? super yz.g2> r10) {
        /*
            r8 = this;
            boolean r0 = r10 instanceof tx.u.a
            if (r0 == 0) goto L13
            r0 = r10
            tx.u$a r0 = (tx.u.a) r0
            int r1 = r0.f91197f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f91197f = r1
            goto L18
        L13:
            tx.u$a r0 = new tx.u$a
            r0.<init>(r10)
        L18:
            java.lang.Object r10 = r0.f91195d
            java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
            int r2 = r0.f91197f
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L4d
            if (r2 == r4) goto L3b
            if (r2 != r3) goto L33
            java.lang.Object r9 = r0.f91192a
            n40.a r9 = (n40.a) r9
            kotlin.e.n(r10)     // Catch: java.lang.Throwable -> L31
            goto L7b
        L31:
            r10 = move-exception
            goto L85
        L33:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L3b:
            java.lang.Object r9 = r0.f91194c
            n40.a r9 = (n40.a) r9
            java.lang.Object r2 = r0.f91193b
            tx.q r2 = (tx.q) r2
            java.lang.Object r4 = r0.f91192a
            tx.u r4 = (tx.u) r4
            kotlin.e.n(r10)
            r10 = r9
            r9 = r2
            goto L62
        L4d:
            kotlin.e.n(r10)
            n40.a r10 = r8.f91191c
            r0.f91192a = r8
            r0.f91193b = r9
            r0.f91194c = r10
            r0.f91197f = r4
            java.lang.Object r2 = r10.lock(r5, r0)
            if (r2 != r1) goto L61
            goto L79
        L61:
            r4 = r8
        L62:
            c40.m0 r2 = c40.h1.c()     // Catch: java.lang.Throwable -> L81
            tx.u$b r6 = new tx.u$b     // Catch: java.lang.Throwable -> L81
            r6.<init>(r9, r4, r5)     // Catch: java.lang.Throwable -> L81
            r0.f91192a = r10     // Catch: java.lang.Throwable -> L81
            r0.f91193b = r5     // Catch: java.lang.Throwable -> L81
            r0.f91194c = r5     // Catch: java.lang.Throwable -> L81
            r0.f91197f = r3     // Catch: java.lang.Throwable -> L81
            java.lang.Object r9 = c40.i.h(r2, r6, r0)     // Catch: java.lang.Throwable -> L81
            if (r9 != r1) goto L7a
        L79:
            return r1
        L7a:
            r9 = r10
        L7b:
            yz.g2 r10 = yz.g2.f100423a     // Catch: java.lang.Throwable -> L31
            r9.unlock(r5)
            return r10
        L81:
            r9 = move-exception
            r7 = r10
            r10 = r9
            r9 = r7
        L85:
            r9.unlock(r5)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: tx.u.b(tx.q, j00.c):java.lang.Object");
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0061 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x006e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:13:0x005f -> B:10:0x0062). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object l(java.nio.ByteBuffer r8, tx.l0 r9, j00.c<? super yz.g2> r10) {
        /*
            r7 = this;
            boolean r0 = r10 instanceof tx.u.c
            if (r0 == 0) goto L13
            r0 = r10
            tx.u$c r0 = (tx.u.c) r0
            int r1 = r0.f91211f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f91211f = r1
            goto L18
        L13:
            tx.u$c r0 = new tx.u$c
            r0.<init>(r10)
        L18:
            java.lang.Object r10 = r0.f91209d
            java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
            int r2 = r0.f91211f
            r3 = 1
            if (r2 == 0) goto L40
            if (r2 != r3) goto L38
            java.lang.Object r8 = r0.f91208c
            tx.l0 r8 = (tx.l0) r8
            java.lang.Object r9 = r0.f91207b
            java.nio.ByteBuffer r9 = (java.nio.ByteBuffer) r9
            java.lang.Object r2 = r0.f91206a
            tx.u r2 = (tx.u) r2
            kotlin.e.n(r10)
            r6 = r9
            r9 = r8
            r8 = r6
            goto L62
        L38:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L40:
            kotlin.e.n(r10)
            r2 = r7
        L44:
            tx.y r10 = r2.f91190b
            io.ktor.network.selector.SelectInterest r4 = io.ktor.network.selector.SelectInterest.WRITE
            r10.T0(r4, r3)
            tx.y r10 = r2.f91190b
            sx.g r10 = r10.K0()
            tx.y r5 = r2.f91190b
            r0.f91206a = r2
            r0.f91207b = r8
            r0.f91208c = r9
            r0.f91211f = r3
            java.lang.Object r10 = r10.N4(r5, r4, r0)
            if (r10 != r1) goto L62
            return r1
        L62:
            java.nio.channels.DatagramChannel r10 = r2.f91189a
            java.net.SocketAddress r4 = tx.b0.a(r9)
            int r10 = r10.send(r8, r4)
            if (r10 == 0) goto L44
            tx.y r8 = r2.f91190b
            io.ktor.network.selector.SelectInterest r9 = io.ktor.network.selector.SelectInterest.WRITE
            r10 = 0
            r8.T0(r9, r10)
            yz.g2 r8 = yz.g2.f100423a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: tx.u.l(java.nio.ByteBuffer, tx.l0, j00.c):java.lang.Object");
    }

    @Override // e40.l0
    @m80.k
    /* renamed from: n, reason: merged with bridge method [inline-methods] */
    public Object m(@m80.k q element) {
        boolean z11;
        kotlin.jvm.internal.g0.p(element, "element");
        if (!a.C0899a.c(this.f91191c, null, 1, null)) {
            return e40.s.f49161b.b();
        }
        try {
            long j11 = jz.j.j(element.b());
            d50.d dVar = d50.d.f47268a;
            y40.b buffer = element.b().getBuffer();
            if (buffer.J()) {
                throw new IllegalArgumentException("Buffer is empty");
            }
            y40.t k11 = buffer.k();
            kotlin.jvm.internal.g0.m(k11);
            byte[] b11 = k11.b(true);
            int h11 = k11.h();
            ByteBuffer asReadOnlyBuffer = ByteBuffer.wrap(b11, h11, k11.d() - h11).slice().asReadOnlyBuffer();
            kotlin.jvm.internal.g0.m(asReadOnlyBuffer);
            if (asReadOnlyBuffer.remaining() < j11) {
                z11 = true;
            } else {
                z11 = false;
                if (this.f91189a.send(asReadOnlyBuffer, b0.a(element.a())) == 0) {
                    asReadOnlyBuffer.position(asReadOnlyBuffer.limit());
                } else {
                    asReadOnlyBuffer.position(0);
                }
            }
            int position = asReadOnlyBuffer.position();
            if (position != 0) {
                if (position < 0) {
                    throw new IllegalStateException("Returned negative read bytes count");
                }
                if (position > k11.n()) {
                    throw new IllegalStateException("Returned too many bytes");
                }
                buffer.skip(position);
            }
            if (z11) {
                pz.h<ByteBuffer> b12 = io.ktor.network.util.a.b();
                ByteBuffer U6 = b12.U6();
                try {
                    ByteBuffer byteBuffer = U6;
                    x.j(element.b().peek(), byteBuffer);
                    if (this.f91189a.send(byteBuffer, b0.a(element.a())) == 0) {
                        jz.j.h(element.b(), 0L, 1, null);
                    }
                    g2 g2Var = g2.f100423a;
                    b12.b4(U6);
                } catch (Throwable th2) {
                    b12.b4(U6);
                    throw th2;
                }
            }
            a.C0899a.d(this.f91191c, null, 1, null);
            return e40.s.f49161b.c(g2.f100423a);
        } catch (Throwable th3) {
            a.C0899a.d(this.f91191c, null, 1, null);
            throw th3;
        }
    }

    @Override // e40.l0
    public boolean o() {
        return this.f91190b.isClosed();
    }

    @Override // e40.l0
    @y1
    public void u(@m80.k x00.l<? super Throwable, g2> handler) {
        x00.l lVar;
        x00.l lVar2;
        x00.l lVar3;
        kotlin.jvm.internal.g0.p(handler, "handler");
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f91187d;
        if (androidx.concurrent.futures.a.a(atomicReferenceFieldUpdater, this, null, handler)) {
            return;
        }
        Object obj = this.onCloseHandler;
        lVar = x.f91215a;
        if (obj != lVar) {
            x.i((x00.l) this.onCloseHandler);
            return;
        }
        lVar2 = x.f91215a;
        lVar3 = x.f91216b;
        if (!androidx.concurrent.futures.a.a(atomicReferenceFieldUpdater, this, lVar2, lVar3)) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        handler.invoke(this.closedCause);
    }

    @Override // e40.l0
    public boolean z(@m80.l Throwable th2) {
        if (!f91188e.compareAndSet(this, 0, 1)) {
            return false;
        }
        this.closedCause = th2;
        if (!this.f91190b.isClosed()) {
            this.f91190b.close();
        }
        e();
        return true;
    }

    @c40.c1
    public static /* synthetic */ void i() {
    }
}
