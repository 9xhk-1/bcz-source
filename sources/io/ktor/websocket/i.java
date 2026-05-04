package io.ktor.websocket;

import androidx.collection.SieveCacheKt;
import c40.l2;
import c40.n2;
import c40.q0;
import c40.r0;
import e40.l0;
import io.ktor.websocket.j0;
import java.util.List;
import kotlin.DeprecationLevel;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.CoroutineStart;
import yz.g2;
import yz.w0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class i implements j0 {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final io.ktor.utils.io.g f62420a;

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public final io.ktor.utils.io.m f62421b;

    /* renamed from: c, reason: collision with root package name */
    public long f62422c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f62423d;

    /* renamed from: e, reason: collision with root package name */
    @m80.k
    public final c40.a0 f62424e;

    /* renamed from: f, reason: collision with root package name */
    @m80.k
    public final e40.o<io.ktor.websocket.d> f62425f;

    /* renamed from: g, reason: collision with root package name */
    @m80.k
    public final e40.o<Object> f62426g;

    /* renamed from: h, reason: collision with root package name */
    public int f62427h;

    /* renamed from: i, reason: collision with root package name */
    @m80.k
    public final kotlin.coroutines.d f62428i;

    /* renamed from: j, reason: collision with root package name */
    @m80.k
    public final l2 f62429j;

    /* renamed from: k, reason: collision with root package name */
    @m80.k
    public final l2 f62430k;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        @m80.k
        public final c40.a0 f62431a;

        public a(@m80.l l2 l2Var) {
            this.f62431a = n2.a(l2Var);
        }

        @m80.l
        public final Object a(@m80.k j00.c<? super g2> cVar) {
            Object K0 = this.f62431a.K0(cVar);
            return K0 == kotlin.coroutines.intrinsics.b.l() ? K0 : g2.f100423a;
        }

        public final boolean b() {
            return this.f62431a.complete();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "io.ktor.websocket.RawWebSocketCommon", f = "RawWebSocketCommon.kt", i = {0, 0}, l = {124, 127, 132}, m = "flush", n = {"this", "it"}, s = {"L$0", "L$2"})
    public static final class b extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public Object f62432a;

        /* renamed from: b, reason: collision with root package name */
        public Object f62433b;

        /* renamed from: c, reason: collision with root package name */
        public Object f62434c;

        /* renamed from: d, reason: collision with root package name */
        public /* synthetic */ Object f62435d;

        /* renamed from: f, reason: collision with root package name */
        public int f62437f;

        public b(j00.c<? super b> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @m80.l
        public final Object invokeSuspend(@m80.k Object obj) {
            this.f62435d = obj;
            this.f62437f |= Integer.MIN_VALUE;
            return i.this.g(this);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "io.ktor.websocket.RawWebSocketCommon$readerJob$1", f = "RawWebSocketCommon.kt", i = {2, 3}, l = {91, 95, 98, 102}, m = "invokeSuspend", n = {"cause", "cause"}, s = {"L$0", "L$0"})
    public static final class c extends SuspendLambda implements x00.p<r0, j00.c<? super g2>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public Object f62438a;

        /* renamed from: b, reason: collision with root package name */
        public int f62439b;

        public c(j00.c<? super c> cVar) {
            super(2, cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final j00.c<g2> create(Object obj, j00.c<?> cVar) {
            return i.this.new c(cVar);
        }

        @Override // x00.p
        public final Object invoke(r0 r0Var, j00.c<? super g2> cVar) {
            return ((c) create(r0Var, cVar)).invokeSuspend(g2.f100423a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:33:0x0090, code lost:
        
            if (r1.b(r10, r9) != r0) goto L30;
         */
        /* JADX WARN: Removed duplicated region for block: B:27:0x006f A[Catch: all -> 0x0036, CancellationException -> 0x0038, ProtocolViolationException -> 0x003a, FrameTooBigException -> 0x003d, EOFException | ClosedReceiveChannelException -> 0x009d, EOFException | ClosedReceiveChannelException -> 0x009d, TryCatch #4 {EOFException | ClosedReceiveChannelException -> 0x009d, blocks: (B:20:0x0032, B:21:0x0047, B:21:0x0047, B:25:0x0063, B:25:0x0063, B:27:0x006f, B:27:0x006f, B:30:0x0081, B:30:0x0081, B:31:0x0079, B:31:0x0079, B:32:0x0084, B:32:0x0084, B:35:0x0040), top: B:2:0x000b }] */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:33:0x0090 -> B:21:0x0047). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r10) {
            /*
                Method dump skipped, instructions count: 278
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: io.ktor.websocket.i.c.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "io.ktor.websocket.RawWebSocketCommon$writerJob$1", f = "RawWebSocketCommon.kt", i = {1, 2}, l = {58, 60, 61, 79, 79, 79, 79}, m = "invokeSuspend", n = {"message", "message"}, s = {"L$0", "L$0"})
    public static final class d extends SuspendLambda implements x00.p<r0, j00.c<? super g2>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public Object f62441a;

        /* renamed from: b, reason: collision with root package name */
        public int f62442b;

        public d(j00.c<? super d> cVar) {
            super(2, cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final j00.c<g2> create(Object obj, j00.c<?> cVar) {
            return i.this.new d(cVar);
        }

        @Override // x00.p
        public final Object invoke(r0 r0Var, j00.c<? super g2> cVar) {
            return ((d) create(r0Var, cVar)).invokeSuspend(g2.f100423a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:48:0x00ab, code lost:
        
            if (r9.j(r8) == r0) goto L62;
         */
        /* JADX WARN: Code restructure failed: missing block: B:61:0x012a, code lost:
        
            if (r9.j(r8) != r0) goto L72;
         */
        /* JADX WARN: Code restructure failed: missing block: B:65:0x00fa, code lost:
        
            if (r9.j(r8) != r0) goto L72;
         */
        /* JADX WARN: Removed duplicated region for block: B:30:0x004c  */
        /* JADX WARN: Removed duplicated region for block: B:34:0x0052 A[Catch: all -> 0x0029, ChannelWriteException -> 0x002c, TryCatch #3 {ChannelWriteException -> 0x002c, all -> 0x0029, blocks: (B:25:0x0025, B:26:0x0082, B:28:0x003c, B:32:0x004e, B:34:0x0052, B:38:0x006f, B:41:0x00af, B:43:0x00b3, B:44:0x00be, B:45:0x00d4, B:46:0x0086, B:55:0x0031, B:56:0x0035), top: B:2:0x000a }] */
        /* JADX WARN: Removed duplicated region for block: B:40:0x0080  */
        /* JADX WARN: Removed duplicated region for block: B:41:0x00af A[Catch: all -> 0x0029, ChannelWriteException -> 0x002c, TRY_ENTER, TryCatch #3 {ChannelWriteException -> 0x002c, all -> 0x0029, blocks: (B:25:0x0025, B:26:0x0082, B:28:0x003c, B:32:0x004e, B:34:0x0052, B:38:0x006f, B:41:0x00af, B:43:0x00b3, B:44:0x00be, B:45:0x00d4, B:46:0x0086, B:55:0x0031, B:56:0x0035), top: B:2:0x000a }] */
        /* JADX WARN: Removed duplicated region for block: B:46:0x0086 A[Catch: all -> 0x0029, ChannelWriteException -> 0x002c, TRY_LEAVE, TryCatch #3 {ChannelWriteException -> 0x002c, all -> 0x0029, blocks: (B:25:0x0025, B:26:0x0082, B:28:0x003c, B:32:0x004e, B:34:0x0052, B:38:0x006f, B:41:0x00af, B:43:0x00b3, B:44:0x00be, B:45:0x00d4, B:46:0x0086, B:55:0x0031, B:56:0x0035), top: B:2:0x000a }] */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:33:0x007e -> B:20:0x0082). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:37:0x00b3 -> B:22:0x003c). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r9) {
            /*
                Method dump skipped, instructions count: 388
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: io.ktor.websocket.i.d.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public i(@m80.k io.ktor.utils.io.g input, @m80.k io.ktor.utils.io.m output, long j11, boolean z11, @m80.k kotlin.coroutines.d coroutineContext) {
        kotlin.jvm.internal.g0.p(input, "input");
        kotlin.jvm.internal.g0.p(output, "output");
        kotlin.jvm.internal.g0.p(coroutineContext, "coroutineContext");
        this.f62420a = input;
        this.f62421b = output;
        this.f62422c = j11;
        this.f62423d = z11;
        c40.a0 a11 = n2.a((l2) coroutineContext.get(l2.f7886e0));
        this.f62424e = a11;
        this.f62425f = e40.r.d(8, null, null, 6, null);
        this.f62426g = e40.r.d(8, null, null, 6, null);
        this.f62428i = coroutineContext.plus(a11).plus(new q0("raw-ws"));
        q0 q0Var = new q0("ws-writer");
        CoroutineStart coroutineStart = CoroutineStart.ATOMIC;
        this.f62429j = c40.i.d(this, q0Var, coroutineStart, new d(null));
        this.f62430k = c40.i.d(this, new q0("ws-reader"), coroutineStart, new c(null));
        a11.complete();
    }

    @Override // io.ktor.websocket.j0
    @m80.k
    public List<z<?>> A0() {
        return a00.h0.J();
    }

    @Override // io.ktor.websocket.j0
    public void E0(long j11) {
        this.f62422c = j11;
    }

    @Override // io.ktor.websocket.j0
    public boolean Q0() {
        return this.f62423d;
    }

    @Override // io.ktor.websocket.j0
    @m80.l
    public Object U(@m80.k io.ktor.websocket.d dVar, @m80.k j00.c<? super g2> cVar) {
        return j0.a.a(this, dVar, cVar);
    }

    @Override // io.ktor.websocket.j0
    public long d0() {
        return this.f62422c;
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
    /* JADX WARN: Type inference failed for: r2v0, types: [int, io.ktor.websocket.i$a] */
    @Override // io.ktor.websocket.j0
    @m80.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object g(@m80.k j00.c<? super yz.g2> r9) {
        /*
            r8 = this;
            boolean r0 = r9 instanceof io.ktor.websocket.i.b
            if (r0 == 0) goto L13
            r0 = r9
            io.ktor.websocket.i$b r0 = (io.ktor.websocket.i.b) r0
            int r1 = r0.f62437f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f62437f = r1
            goto L18
        L13:
            io.ktor.websocket.i$b r0 = new io.ktor.websocket.i$b
            r0.<init>(r9)
        L18:
            java.lang.Object r9 = r0.f62435d
            java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
            int r2 = r0.f62437f
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
            java.lang.Object r2 = r0.f62432a
            io.ktor.websocket.i$a r2 = (io.ktor.websocket.i.a) r2
            kotlin.e.n(r9)
            goto L94
        L41:
            java.lang.Object r2 = r0.f62434c
            io.ktor.websocket.i$a r2 = (io.ktor.websocket.i.a) r2
            java.lang.Object r5 = r0.f62433b
            io.ktor.websocket.i$a r5 = (io.ktor.websocket.i.a) r5
            java.lang.Object r7 = r0.f62432a
            io.ktor.websocket.i r7 = (io.ktor.websocket.i) r7
            kotlin.e.n(r9)     // Catch: java.lang.Throwable -> L51 kotlinx.coroutines.channels.ClosedSendChannelException -> L7f
            goto L95
        L51:
            r9 = move-exception
            goto L7b
        L53:
            kotlin.e.n(r9)
            io.ktor.websocket.i$a r2 = new io.ktor.websocket.i$a
            kotlin.coroutines.d r9 = r8.getCoroutineContext()
            c40.l2$b r7 = c40.l2.f7886e0
            kotlin.coroutines.d$b r9 = r9.get(r7)
            c40.l2 r9 = (c40.l2) r9
            r2.<init>(r9)
            e40.o<java.lang.Object> r9 = r8.f62426g     // Catch: java.lang.Throwable -> L51 kotlinx.coroutines.channels.ClosedSendChannelException -> L78
            r0.f62432a = r8     // Catch: java.lang.Throwable -> L51 kotlinx.coroutines.channels.ClosedSendChannelException -> L78
            r0.f62433b = r2     // Catch: java.lang.Throwable -> L51 kotlinx.coroutines.channels.ClosedSendChannelException -> L78
            r0.f62434c = r2     // Catch: java.lang.Throwable -> L51 kotlinx.coroutines.channels.ClosedSendChannelException -> L78
            r0.f62437f = r5     // Catch: java.lang.Throwable -> L51 kotlinx.coroutines.channels.ClosedSendChannelException -> L78
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
            c40.l2 r9 = r7.f62429j
            r0.f62432a = r5
            r0.f62433b = r6
            r0.f62434c = r6
            r0.f62437f = r4
            java.lang.Object r9 = r9.K0(r0)
            if (r9 != r1) goto L93
            goto La3
        L93:
            r2 = r5
        L94:
            r5 = r2
        L95:
            r0.f62432a = r6
            r0.f62433b = r6
            r0.f62434c = r6
            r0.f62437f = r3
            java.lang.Object r9 = r5.a(r0)
            if (r9 != r1) goto La4
        La3:
            return r1
        La4:
            yz.g2 r9 = yz.g2.f100423a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.websocket.i.g(j00.c):java.lang.Object");
    }

    @Override // c40.r0
    @m80.k
    public kotlin.coroutines.d getCoroutineContext() {
        return this.f62428i;
    }

    @Override // io.ktor.websocket.j0
    public void i0(boolean z11) {
        this.f62423d = z11;
    }

    @Override // io.ktor.websocket.j0
    @m80.k
    public e40.k0<io.ktor.websocket.d> j() {
        return this.f62425f;
    }

    @Override // io.ktor.websocket.j0
    @m80.k
    public e40.l0<io.ktor.websocket.d> q() {
        return this.f62426g;
    }

    @Override // io.ktor.websocket.j0
    @yz.n(level = DeprecationLevel.ERROR, message = "Use cancel() instead.", replaceWith = @w0(expression = "cancel()", imports = {"kotlinx.coroutines.cancel"}))
    public void s0() {
        l0.a.a(q(), null, 1, null);
        this.f62424e.complete();
    }

    public /* synthetic */ i(io.ktor.utils.io.g gVar, io.ktor.utils.io.m mVar, long j11, boolean z11, kotlin.coroutines.d dVar, int i11, kotlin.jvm.internal.v vVar) {
        this(gVar, mVar, (i11 & 4) != 0 ? SieveCacheKt.NodeLinkMask : j11, (i11 & 8) != 0 ? false : z11, dVar);
    }
}
