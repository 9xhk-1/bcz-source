package io.ktor.websocket;

import c40.l2;
import c40.n2;
import c40.q0;
import c40.r0;
import java.nio.ByteBuffer;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.u0;
import kotlinx.coroutines.CoroutineStart;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class l0 implements r0 {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final io.ktor.utils.io.m f62511a;

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public final kotlin.coroutines.d f62512b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f62513c;

    /* renamed from: d, reason: collision with root package name */
    @m80.k
    public final pz.h<ByteBuffer> f62514d;

    /* renamed from: e, reason: collision with root package name */
    @m80.k
    public final e40.o<Object> f62515e;

    /* renamed from: f, reason: collision with root package name */
    @m80.k
    public final n f62516f;

    /* renamed from: g, reason: collision with root package name */
    @m80.k
    public final l2 f62517g;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        @m80.k
        public final c40.a0 f62518a;

        public a(@m80.l l2 l2Var) {
            this.f62518a = n2.a(l2Var);
        }

        @m80.l
        public final Object a(@m80.k j00.c<? super g2> cVar) {
            Object K0 = this.f62518a.K0(cVar);
            return K0 == kotlin.coroutines.intrinsics.b.l() ? K0 : g2.f100423a;
        }

        public final boolean b() {
            return this.f62518a.complete();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "io.ktor.websocket.WebSocketWriter", f = "WebSocketWriter.kt", i = {0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2}, l = {121, 125, 139}, m = "drainQueueAndSerialize", n = {"this", "buffer", "flush", "closeSent", "this", "buffer", "flush", "it", "closeSent", "flush", "closeSent"}, s = {"L$0", "L$1", "L$2", "I$0", "L$0", "L$1", "L$2", "L$3", "I$0", "L$0", "I$0"})
    public static final class b extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public Object f62519a;

        /* renamed from: b, reason: collision with root package name */
        public Object f62520b;

        /* renamed from: c, reason: collision with root package name */
        public Object f62521c;

        /* renamed from: d, reason: collision with root package name */
        public Object f62522d;

        /* renamed from: e, reason: collision with root package name */
        public int f62523e;

        /* renamed from: f, reason: collision with root package name */
        public /* synthetic */ Object f62524f;

        /* renamed from: h, reason: collision with root package name */
        public int f62526h;

        public b(j00.c<? super b> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @m80.l
        public final Object invokeSuspend(@m80.k Object obj) {
            this.f62524f = obj;
            this.f62526h |= Integer.MIN_VALUE;
            return l0.this.e(null, null, this);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "io.ktor.websocket.WebSocketWriter", f = "WebSocketWriter.kt", i = {0, 0}, l = {155, 158, 163}, m = "flush", n = {"this", "it"}, s = {"L$0", "L$2"})
    public static final class c extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public Object f62527a;

        /* renamed from: b, reason: collision with root package name */
        public Object f62528b;

        /* renamed from: c, reason: collision with root package name */
        public Object f62529c;

        /* renamed from: d, reason: collision with root package name */
        public /* synthetic */ Object f62530d;

        /* renamed from: f, reason: collision with root package name */
        public int f62532f;

        public c(j00.c<? super c> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @m80.l
        public final Object invokeSuspend(@m80.k Object obj) {
            this.f62530d = obj;
            this.f62532f |= Integer.MIN_VALUE;
            return l0.this.g(this);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "io.ktor.websocket.WebSocketWriter", f = "WebSocketWriter.kt", i = {0, 0, 1, 1, 2, 3, 4}, l = {46, 48, 63, 63, 63, 63}, m = "writeLoop", n = {"this", "buffer", "this", "buffer", "this", "this", "this"}, s = {"L$0", "L$1", "L$0", "L$1", "L$0", "L$0", "L$0"})
    public static final class d extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public Object f62533a;

        /* renamed from: b, reason: collision with root package name */
        public Object f62534b;

        /* renamed from: c, reason: collision with root package name */
        public Object f62535c;

        /* renamed from: d, reason: collision with root package name */
        public /* synthetic */ Object f62536d;

        /* renamed from: f, reason: collision with root package name */
        public int f62538f;

        public d(j00.c<? super d> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @m80.l
        public final Object invokeSuspend(@m80.k Object obj) {
            this.f62536d = obj;
            this.f62538f |= Integer.MIN_VALUE;
            return l0.this.l(null, this);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "io.ktor.websocket.WebSocketWriter$writeLoopJob$1", f = "WebSocketWriter.kt", i = {0, 0}, l = {40}, m = "invokeSuspend", n = {"$this$useInstance$iv", "instance$iv"}, s = {"L$0", "L$1"})
    @u0({"SMAP\nWebSocketWriter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WebSocketWriter.kt\nio/ktor/websocket/WebSocketWriter$writeLoopJob$1\n+ 2 Pool.kt\nio/ktor/utils/io/pool/PoolKt\n*L\n1#1,171:1\n156#2,5:172\n*S KotlinDebug\n*F\n+ 1 WebSocketWriter.kt\nio/ktor/websocket/WebSocketWriter$writeLoopJob$1\n*L\n40#1:172,5\n*E\n"})
    public static final class e extends SuspendLambda implements x00.p<r0, j00.c<? super g2>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public Object f62539a;

        /* renamed from: b, reason: collision with root package name */
        public Object f62540b;

        /* renamed from: c, reason: collision with root package name */
        public int f62541c;

        public e(j00.c<? super e> cVar) {
            super(2, cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final j00.c<g2> create(Object obj, j00.c<?> cVar) {
            return l0.this.new e(cVar);
        }

        @Override // x00.p
        public final Object invoke(r0 r0Var, j00.c<? super g2> cVar) {
            return ((e) create(r0Var, cVar)).invokeSuspend(g2.f100423a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            pz.h h11;
            Object obj2;
            Object l11 = kotlin.coroutines.intrinsics.b.l();
            int i11 = this.f62541c;
            if (i11 == 0) {
                kotlin.e.n(obj);
                h11 = l0.this.h();
                l0 l0Var = l0.this;
                Object U6 = h11.U6();
                try {
                    this.f62539a = h11;
                    this.f62540b = U6;
                    this.f62541c = 1;
                    if (l0Var.l((ByteBuffer) U6, this) == l11) {
                        return l11;
                    }
                    obj2 = U6;
                } catch (Throwable th2) {
                    th = th2;
                    obj2 = U6;
                    h11.b4(obj2);
                    throw th;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                obj2 = this.f62540b;
                h11 = (pz.h) this.f62539a;
                try {
                    kotlin.e.n(obj);
                } catch (Throwable th3) {
                    th = th3;
                    h11.b4(obj2);
                    throw th;
                }
            }
            g2 g2Var = g2.f100423a;
            h11.b4(obj2);
            return g2Var;
        }
    }

    public l0(@m80.k io.ktor.utils.io.m writeChannel, @m80.k kotlin.coroutines.d coroutineContext, boolean z11, @m80.k pz.h<ByteBuffer> pool) {
        kotlin.jvm.internal.g0.p(writeChannel, "writeChannel");
        kotlin.jvm.internal.g0.p(coroutineContext, "coroutineContext");
        kotlin.jvm.internal.g0.p(pool, "pool");
        this.f62511a = writeChannel;
        this.f62512b = coroutineContext;
        this.f62513c = z11;
        this.f62514d = pool;
        this.f62515e = e40.r.d(8, null, null, 6, null);
        this.f62516f = new n();
        this.f62517g = c40.i.d(this, new q0("ws-writer"), CoroutineStart.ATOMIC, new e(null));
    }

    public final boolean Q0() {
        return this.f62513c;
    }

    @m80.l
    public final Object U(@m80.k io.ktor.websocket.d dVar, @m80.k j00.c<? super g2> cVar) {
        Object b11 = this.f62515e.b(dVar, cVar);
        return b11 == kotlin.coroutines.intrinsics.b.l() ? b11 : g2.f100423a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x004a, code lost:
    
        throw new java.lang.IllegalArgumentException("unknown message " + r0);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void d() {
        /*
            r4 = this;
            e40.o<java.lang.Object> r0 = r4.f62515e
            r1 = 0
            r2 = 1
            e40.l0.a.a(r0, r1, r2, r1)
        L7:
            e40.o<java.lang.Object> r0 = r4.f62515e     // Catch: java.util.concurrent.CancellationException -> L4b
            java.lang.Object r0 = r0.O()     // Catch: java.util.concurrent.CancellationException -> L4b
            java.lang.Object r0 = e40.s.h(r0)     // Catch: java.util.concurrent.CancellationException -> L4b
            if (r0 != 0) goto L14
            goto L4b
        L14:
            boolean r1 = r0 instanceof io.ktor.websocket.d.b     // Catch: java.util.concurrent.CancellationException -> L4b
            if (r1 != 0) goto L7
            boolean r1 = r0 instanceof io.ktor.websocket.d.C0728d     // Catch: java.util.concurrent.CancellationException -> L4b
            if (r1 != 0) goto L7
            boolean r1 = r0 instanceof io.ktor.websocket.d.e     // Catch: java.util.concurrent.CancellationException -> L4b
            if (r1 == 0) goto L21
            goto L7
        L21:
            boolean r1 = r0 instanceof io.ktor.websocket.l0.a     // Catch: java.util.concurrent.CancellationException -> L4b
            if (r1 == 0) goto L2b
            io.ktor.websocket.l0$a r0 = (io.ktor.websocket.l0.a) r0     // Catch: java.util.concurrent.CancellationException -> L4b
            r0.b()     // Catch: java.util.concurrent.CancellationException -> L4b
            goto L7
        L2b:
            boolean r1 = r0 instanceof io.ktor.websocket.d.f     // Catch: java.util.concurrent.CancellationException -> L4b
            if (r1 != 0) goto L7
            boolean r1 = r0 instanceof io.ktor.websocket.d.a     // Catch: java.util.concurrent.CancellationException -> L4b
            if (r1 == 0) goto L34
            goto L7
        L34:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException     // Catch: java.util.concurrent.CancellationException -> L4b
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.util.concurrent.CancellationException -> L4b
            r2.<init>()     // Catch: java.util.concurrent.CancellationException -> L4b
            java.lang.String r3 = "unknown message "
            r2.append(r3)     // Catch: java.util.concurrent.CancellationException -> L4b
            r2.append(r0)     // Catch: java.util.concurrent.CancellationException -> L4b
            java.lang.String r0 = r2.toString()     // Catch: java.util.concurrent.CancellationException -> L4b
            r1.<init>(r0)     // Catch: java.util.concurrent.CancellationException -> L4b
            throw r1     // Catch: java.util.concurrent.CancellationException -> L4b
        L4b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.websocket.l0.d():void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:58:0x00d0, code lost:
    
        e40.l0.a.a(r2.f62515e, null, 1, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x015d, code lost:
    
        if (r12.g(r0) == r1) goto L70;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x0172, code lost:
    
        if (r11.hasRemaining() == false) goto L77;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x016c A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x009e A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x009b A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /* JADX WARN: Type inference failed for: r10v26 */
    /* JADX WARN: Type inference failed for: r10v27 */
    /* JADX WARN: Type inference failed for: r10v4 */
    /* JADX WARN: Type inference failed for: r10v5, types: [int] */
    /* JADX WARN: Type inference failed for: r10v6 */
    /* JADX WARN: Type inference failed for: r10v8 */
    /* JADX WARN: Type inference failed for: r11v11, types: [java.lang.StringBuilder] */
    /* JADX WARN: Type inference failed for: r7v15, types: [T, java.lang.Object] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:61:0x013d -> B:24:0x0165). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:63:0x0143 -> B:24:0x0165). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:65:0x0149 -> B:24:0x0165). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:67:0x015d -> B:23:0x0160). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(io.ktor.websocket.d r10, java.nio.ByteBuffer r11, j00.c<? super java.lang.Boolean> r12) {
        /*
            Method dump skipped, instructions count: 377
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.websocket.l0.e(io.ktor.websocket.d, java.nio.ByteBuffer, j00.c):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x00a1, code lost:
    
        if (r5.a(r0) != r1) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0075, code lost:
    
        if (r9.b(r2, r0) == r1) goto L36;
     */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0026  */
    /* JADX WARN: Type inference failed for: r2v0, types: [int, io.ktor.websocket.l0$a] */
    @m80.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object g(@m80.k j00.c<? super yz.g2> r9) {
        /*
            r8 = this;
            boolean r0 = r9 instanceof io.ktor.websocket.l0.c
            if (r0 == 0) goto L13
            r0 = r9
            io.ktor.websocket.l0$c r0 = (io.ktor.websocket.l0.c) r0
            int r1 = r0.f62532f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f62532f = r1
            goto L18
        L13:
            io.ktor.websocket.l0$c r0 = new io.ktor.websocket.l0$c
            r0.<init>(r9)
        L18:
            java.lang.Object r9 = r0.f62530d
            java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
            int r2 = r0.f62532f
            r3 = 3
            r4 = 2
            r5 = 1
            r6 = 0
            if (r2 == 0) goto L53
            if (r2 == r5) goto L41
            if (r2 == r4) goto L39
            if (r2 != r3) goto L31
            kotlin.e.n(r9)
            goto La4
        L31:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L39:
            java.lang.Object r2 = r0.f62527a
            io.ktor.websocket.l0$a r2 = (io.ktor.websocket.l0.a) r2
            kotlin.e.n(r9)
            goto L94
        L41:
            java.lang.Object r2 = r0.f62529c
            io.ktor.websocket.l0$a r2 = (io.ktor.websocket.l0.a) r2
            java.lang.Object r5 = r0.f62528b
            io.ktor.websocket.l0$a r5 = (io.ktor.websocket.l0.a) r5
            java.lang.Object r7 = r0.f62527a
            io.ktor.websocket.l0 r7 = (io.ktor.websocket.l0) r7
            kotlin.e.n(r9)     // Catch: java.lang.Throwable -> L51 kotlinx.coroutines.channels.ClosedSendChannelException -> L7f
            goto L95
        L51:
            r9 = move-exception
            goto L7b
        L53:
            kotlin.e.n(r9)
            io.ktor.websocket.l0$a r2 = new io.ktor.websocket.l0$a
            kotlin.coroutines.d r9 = r8.getCoroutineContext()
            c40.l2$b r7 = c40.l2.f7886e0
            kotlin.coroutines.d$b r9 = r9.get(r7)
            c40.l2 r9 = (c40.l2) r9
            r2.<init>(r9)
            e40.o<java.lang.Object> r9 = r8.f62515e     // Catch: java.lang.Throwable -> L51 kotlinx.coroutines.channels.ClosedSendChannelException -> L78
            r0.f62527a = r8     // Catch: java.lang.Throwable -> L51 kotlinx.coroutines.channels.ClosedSendChannelException -> L78
            r0.f62528b = r2     // Catch: java.lang.Throwable -> L51 kotlinx.coroutines.channels.ClosedSendChannelException -> L78
            r0.f62529c = r2     // Catch: java.lang.Throwable -> L51 kotlinx.coroutines.channels.ClosedSendChannelException -> L78
            r0.f62532f = r5     // Catch: java.lang.Throwable -> L51 kotlinx.coroutines.channels.ClosedSendChannelException -> L78
            java.lang.Object r9 = r9.b(r2, r0)     // Catch: java.lang.Throwable -> L51 kotlinx.coroutines.channels.ClosedSendChannelException -> L78
            if (r9 != r1) goto L94
            goto La3
        L78:
            r7 = r8
            r5 = r2
            goto L7f
        L7b:
            r2.b()
            throw r9
        L7f:
            r2.b()
            c40.l2 r9 = r7.f62517g
            r0.f62527a = r5
            r0.f62528b = r6
            r0.f62529c = r6
            r0.f62532f = r4
            java.lang.Object r9 = r9.K0(r0)
            if (r9 != r1) goto L93
            goto La3
        L93:
            r2 = r5
        L94:
            r5 = r2
        L95:
            r0.f62527a = r6
            r0.f62528b = r6
            r0.f62529c = r6
            r0.f62532f = r3
            java.lang.Object r9 = r5.a(r0)
            if (r9 != r1) goto La4
        La3:
            return r1
        La4:
            yz.g2 r9 = yz.g2.f100423a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.websocket.l0.g(j00.c):java.lang.Object");
    }

    @Override // c40.r0
    @m80.k
    public kotlin.coroutines.d getCoroutineContext() {
        return this.f62512b;
    }

    @m80.k
    public final pz.h<ByteBuffer> h() {
        return this.f62514d;
    }

    public final void i0(boolean z11) {
        this.f62513c = z11;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(8:0|1|(2:3|(4:5|6|7|8))|81|6|7|8|(2:(0)|(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x00bb, code lost:
    
        if (((java.lang.Boolean) r10).booleanValue() == false) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0107, code lost:
    
        if (r10.j(r2) != r1) goto L74;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x015e, code lost:
    
        if (r9.j(r0) != r1) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0137, code lost:
    
        r9 = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0134, code lost:
    
        if (r9.j(r0) != r1) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x0139, code lost:
    
        r9 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x0167, code lost:
    
        r5.f62515e.z(c40.t1.a("WebSocket closed.", null));
        r10 = r5.f62511a;
        r0.f62533a = r9;
        r0.f62534b = null;
        r0.f62535c = null;
        r0.f62538f = 6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x017f, code lost:
    
        if (r10.j(r0) == r1) goto L78;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:?, code lost:
    
        throw r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x0058, code lost:
    
        r9 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x0055, code lost:
    
        r9 = th;
     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x009a A[Catch: all -> 0x00c3, ChannelWriteException -> 0x00c6, TryCatch #7 {ChannelWriteException -> 0x00c6, all -> 0x00c3, blocks: (B:21:0x00b5, B:33:0x0092, B:35:0x009a, B:37:0x00a2, B:40:0x00ca, B:42:0x00ce, B:43:0x00d8, B:44:0x00ee), top: B:20:0x00b5 }] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0026  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:38:0x00b1 -> B:20:0x00b5). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:42:0x00ce -> B:27:0x00bf). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object l(java.nio.ByteBuffer r9, j00.c<? super yz.g2> r10) {
        /*
            Method dump skipped, instructions count: 406
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.websocket.l0.l(java.nio.ByteBuffer, j00.c):java.lang.Object");
    }

    @m80.k
    public final e40.l0<io.ktor.websocket.d> q() {
        return this.f62515e;
    }

    public /* synthetic */ l0(io.ktor.utils.io.m mVar, kotlin.coroutines.d dVar, boolean z11, pz.h hVar, int i11, kotlin.jvm.internal.v vVar) {
        this(mVar, dVar, (i11 & 4) != 0 ? false : z11, (i11 & 8) != 0 ? yy.a.a() : hVar);
    }

    public static /* synthetic */ void i() {
    }
}
