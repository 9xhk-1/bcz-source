package io.ktor.websocket;

import c40.l2;
import c40.p2;
import c40.q0;
import c40.r0;
import io.ktor.websocket.d;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.u0;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public static final q0 f62396a = new q0("ws-ponger");

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public static final q0 f62397b = new q0("ws-pinger");

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "io.ktor.websocket.PingPongKt$pinger$1", f = "PingPong.kt", i = {0, 0, 1, 1}, l = {65, 74, 96}, m = "invokeSuspend", n = {"random", "pingIdBytes", "random", "pingIdBytes"}, s = {"L$0", "L$1", "L$0", "L$1"})
    public static final class a extends SuspendLambda implements x00.p<r0, j00.c<? super g2>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public Object f62398a;

        /* renamed from: b, reason: collision with root package name */
        public Object f62399b;

        /* renamed from: c, reason: collision with root package name */
        public int f62400c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ long f62401d;

        /* renamed from: e, reason: collision with root package name */
        public final /* synthetic */ long f62402e;

        /* renamed from: f, reason: collision with root package name */
        public final /* synthetic */ x00.p<CloseReason, j00.c<? super g2>, Object> f62403f;

        /* renamed from: g, reason: collision with root package name */
        public final /* synthetic */ e40.o<d.e> f62404g;

        /* renamed from: h, reason: collision with root package name */
        public final /* synthetic */ e40.l0<d> f62405h;

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        @l00.d(c = "io.ktor.websocket.PingPongKt$pinger$1$1", f = "PingPong.kt", i = {}, l = {67}, m = "invokeSuspend", n = {}, s = {})
        /* renamed from: io.ktor.websocket.h$a$a, reason: collision with other inner class name */
        public static final class C0729a extends SuspendLambda implements x00.p<r0, j00.c<? super g2>, Object> {

            /* renamed from: a, reason: collision with root package name */
            public int f62406a;

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ e40.o<d.e> f62407b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0729a(e40.o<d.e> oVar, j00.c<? super C0729a> cVar) {
                super(2, cVar);
                this.f62407b = oVar;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final j00.c<g2> create(Object obj, j00.c<?> cVar) {
                return new C0729a(this.f62407b, cVar);
            }

            @Override // x00.p
            public final Object invoke(r0 r0Var, j00.c<? super g2> cVar) {
                return ((C0729a) create(r0Var, cVar)).invokeSuspend(g2.f100423a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                e40.o<d.e> oVar;
                Object l11 = kotlin.coroutines.intrinsics.b.l();
                int i11 = this.f62406a;
                if (i11 != 0 && i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.e.n(obj);
                do {
                    oVar = this.f62407b;
                    this.f62406a = 1;
                } while (oVar.H(this) != l11);
                return l11;
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        @l00.d(c = "io.ktor.websocket.PingPongKt$pinger$1$rc$1", f = "PingPong.kt", i = {}, l = {76, 80}, m = "invokeSuspend", n = {}, s = {})
        public static final class b extends SuspendLambda implements x00.p<r0, j00.c<? super g2>, Object> {

            /* renamed from: a, reason: collision with root package name */
            public int f62408a;

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ e40.l0<d> f62409b;

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ String f62410c;

            /* renamed from: d, reason: collision with root package name */
            public final /* synthetic */ e40.o<d.e> f62411d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public b(e40.l0<? super d> l0Var, String str, e40.o<d.e> oVar, j00.c<? super b> cVar) {
                super(2, cVar);
                this.f62409b = l0Var;
                this.f62410c = str;
                this.f62411d = oVar;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final j00.c<g2> create(Object obj, j00.c<?> cVar) {
                return new b(this.f62409b, this.f62410c, this.f62411d, cVar);
            }

            @Override // x00.p
            public final Object invoke(r0 r0Var, j00.c<? super g2> cVar) {
                return ((b) create(r0Var, cVar)).invokeSuspend(g2.f100423a);
            }

            /* JADX WARN: Code restructure failed: missing block: B:13:0x004a, code lost:
            
                if (r10 == r0) goto L15;
             */
            /* JADX WARN: Code restructure failed: missing block: B:14:0x004c, code lost:
            
                return r0;
             */
            /* JADX WARN: Code restructure failed: missing block: B:19:0x003f, code lost:
            
                if (r10.b(r1, r9) == r0) goto L15;
             */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:13:0x004a -> B:6:0x004d). Please report as a decompilation issue!!! */
            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object invokeSuspend(java.lang.Object r10) {
                /*
                    r9 = this;
                    java.lang.Object r0 = kotlin.coroutines.intrinsics.b.l()
                    int r1 = r9.f62408a
                    r2 = 2
                    r3 = 1
                    if (r1 == 0) goto L1e
                    if (r1 == r3) goto L1a
                    if (r1 != r2) goto L12
                    kotlin.e.n(r10)
                    goto L4d
                L12:
                    java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
                    java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                    r10.<init>(r0)
                    throw r10
                L1a:
                    kotlin.e.n(r10)
                    goto L42
                L1e:
                    kotlin.e.n(r10)
                    org.slf4j.Logger r10 = io.ktor.websocket.c.f()
                    java.lang.String r1 = "WebSocket Pinger: sending ping frame"
                    r10.trace(r1)
                    e40.l0<io.ktor.websocket.d> r10 = r9.f62409b
                    io.ktor.websocket.d$d r1 = new io.ktor.websocket.d$d
                    java.lang.String r4 = r9.f62410c
                    java.nio.charset.Charset r5 = u30.d.f91604g
                    byte[] r4 = jz.s.l(r4, r5)
                    r1.<init>(r4)
                    r9.f62408a = r3
                    java.lang.Object r10 = r10.b(r1, r9)
                    if (r10 != r0) goto L42
                    goto L4c
                L42:
                    e40.o<io.ktor.websocket.d$e> r10 = r9.f62411d
                    r9.f62408a = r2
                    java.lang.Object r10 = r10.H(r9)
                    if (r10 != r0) goto L4d
                L4c:
                    return r0
                L4d:
                    io.ktor.websocket.d$e r10 = (io.ktor.websocket.d.e) r10
                    byte[] r3 = r10.d()
                    byte[] r1 = r10.d()
                    int r5 = r1.length
                    r7 = 4
                    r8 = 0
                    r4 = 0
                    r6 = 0
                    java.lang.String r1 = u30.f0.W1(r3, r4, r5, r6, r7, r8)
                    java.lang.String r3 = r9.f62410c
                    boolean r1 = kotlin.jvm.internal.g0.g(r1, r3)
                    if (r1 == 0) goto L83
                    org.slf4j.Logger r0 = io.ktor.websocket.c.f()
                    java.lang.StringBuilder r1 = new java.lang.StringBuilder
                    r1.<init>()
                    java.lang.String r2 = "WebSocket Pinger: received valid pong frame "
                    r1.append(r2)
                    r1.append(r10)
                    java.lang.String r10 = r1.toString()
                    r0.trace(r10)
                    yz.g2 r10 = yz.g2.f100423a
                    return r10
                L83:
                    org.slf4j.Logger r1 = io.ktor.websocket.c.f()
                    java.lang.StringBuilder r3 = new java.lang.StringBuilder
                    r3.<init>()
                    java.lang.String r4 = "WebSocket Pinger: received invalid pong frame "
                    r3.append(r4)
                    r3.append(r10)
                    java.lang.String r10 = ", continue waiting"
                    r3.append(r10)
                    java.lang.String r10 = r3.toString()
                    r1.trace(r10)
                    goto L42
                */
                throw new UnsupportedOperationException("Method not decompiled: io.ktor.websocket.h.a.b.invokeSuspend(java.lang.Object):java.lang.Object");
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(long j11, long j12, x00.p<? super CloseReason, ? super j00.c<? super g2>, ? extends Object> pVar, e40.o<d.e> oVar, e40.l0<? super d> l0Var, j00.c<? super a> cVar) {
            super(2, cVar);
            this.f62401d = j11;
            this.f62402e = j12;
            this.f62403f = pVar;
            this.f62404g = oVar;
            this.f62405h = l0Var;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final j00.c<g2> create(Object obj, j00.c<?> cVar) {
            return new a(this.f62401d, this.f62402e, this.f62403f, this.f62404g, this.f62405h, cVar);
        }

        @Override // x00.p
        public final Object invoke(r0 r0Var, j00.c<? super g2> cVar) {
            return ((a) create(r0Var, cVar)).invokeSuspend(g2.f100423a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:18:0x00de, code lost:
        
            if (r13.invoke(r1, r12) == r0) goto L29;
         */
        /* JADX WARN: Removed duplicated region for block: B:17:0x00c0 A[Catch: CancellationException | ClosedReceiveChannelException | ClosedSendChannelException -> 0x00e3, CancellationException | ClosedReceiveChannelException | ClosedSendChannelException -> 0x00e3, CancellationException | ClosedReceiveChannelException | ClosedSendChannelException -> 0x00e3, TRY_LEAVE, TryCatch #0 {CancellationException | ClosedReceiveChannelException | ClosedSendChannelException -> 0x00e3, blocks: (B:7:0x0012, B:14:0x0027, B:14:0x0027, B:14:0x0027, B:15:0x00bc, B:15:0x00bc, B:15:0x00bc, B:17:0x00c0, B:17:0x00c0, B:17:0x00c0, B:21:0x0070, B:21:0x0070, B:21:0x0070, B:25:0x0087, B:25:0x0087, B:25:0x0087, B:29:0x0034, B:29:0x0034, B:29:0x0034), top: B:2:0x000a }] */
        /* JADX WARN: Removed duplicated region for block: B:20:0x00e1  */
        /* JADX WARN: Removed duplicated region for block: B:23:0x0085  */
        /* JADX WARN: Removed duplicated region for block: B:24:0x0086  */
        /* JADX WARN: Removed duplicated region for block: B:27:0x00bb  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:26:0x00b9 -> B:15:0x00bc). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r13) {
            /*
                r12 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.b.l()
                int r1 = r12.f62400c
                r2 = 3
                r3 = 2
                r4 = 1
                r5 = 0
                if (r1 == 0) goto L38
                if (r1 == r4) goto L2c
                if (r1 == r3) goto L1f
                if (r1 != r2) goto L17
                kotlin.e.n(r13)     // Catch: java.lang.Throwable -> Le3
                goto Le3
            L17:
                java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r13.<init>(r0)
                throw r13
            L1f:
                java.lang.Object r1 = r12.f62399b
                byte[] r1 = (byte[]) r1
                java.lang.Object r6 = r12.f62398a
                kotlin.random.Random r6 = (kotlin.random.Random) r6
                kotlin.e.n(r13)     // Catch: java.lang.Throwable -> Le3 java.lang.Throwable -> Le3 java.lang.Throwable -> Le3
                goto Lbc
            L2c:
                java.lang.Object r1 = r12.f62399b
                byte[] r1 = (byte[]) r1
                java.lang.Object r6 = r12.f62398a
                kotlin.random.Random r6 = (kotlin.random.Random) r6
                kotlin.e.n(r13)     // Catch: java.lang.Throwable -> Le3 java.lang.Throwable -> Le3 java.lang.Throwable -> Le3
                goto L87
            L38:
                kotlin.e.n(r13)
                org.slf4j.Logger r13 = io.ktor.websocket.c.f()
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r6 = "Starting WebSocket pinger coroutine with period "
                r1.append(r6)
                long r6 = r12.f62401d
                r1.append(r6)
                java.lang.String r6 = " ms and timeout "
                r1.append(r6)
                long r6 = r12.f62402e
                r1.append(r6)
                java.lang.String r6 = " ms"
                r1.append(r6)
                java.lang.String r1 = r1.toString()
                r13.trace(r1)
                long r6 = io.ktor.util.date.a.d()
                kotlin.random.Random r13 = e10.e.b(r6)
                r1 = 32
                byte[] r1 = new byte[r1]
            L70:
                long r6 = r12.f62401d     // Catch: java.lang.Throwable -> Le3 java.lang.Throwable -> Le3 java.lang.Throwable -> Le3
                io.ktor.websocket.h$a$a r8 = new io.ktor.websocket.h$a$a     // Catch: java.lang.Throwable -> Le3 java.lang.Throwable -> Le3 java.lang.Throwable -> Le3
                e40.o<io.ktor.websocket.d$e> r9 = r12.f62404g     // Catch: java.lang.Throwable -> Le3 java.lang.Throwable -> Le3 java.lang.Throwable -> Le3
                r8.<init>(r9, r5)     // Catch: java.lang.Throwable -> Le3 java.lang.Throwable -> Le3 java.lang.Throwable -> Le3
                r12.f62398a = r13     // Catch: java.lang.Throwable -> Le3 java.lang.Throwable -> Le3 java.lang.Throwable -> Le3
                r12.f62399b = r1     // Catch: java.lang.Throwable -> Le3 java.lang.Throwable -> Le3 java.lang.Throwable -> Le3
                r12.f62400c = r4     // Catch: java.lang.Throwable -> Le3 java.lang.Throwable -> Le3 java.lang.Throwable -> Le3
                java.lang.Object r6 = c40.v3.e(r6, r8, r12)     // Catch: java.lang.Throwable -> Le3 java.lang.Throwable -> Le3 java.lang.Throwable -> Le3
                if (r6 != r0) goto L86
                goto Le0
            L86:
                r6 = r13
            L87:
                r6.nextBytes(r1)     // Catch: java.lang.Throwable -> Le3 java.lang.Throwable -> Le3 java.lang.Throwable -> Le3
                java.lang.StringBuilder r13 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Le3 java.lang.Throwable -> Le3 java.lang.Throwable -> Le3
                r13.<init>()     // Catch: java.lang.Throwable -> Le3 java.lang.Throwable -> Le3 java.lang.Throwable -> Le3
                java.lang.String r7 = "[ping "
                r13.append(r7)     // Catch: java.lang.Throwable -> Le3 java.lang.Throwable -> Le3 java.lang.Throwable -> Le3
                java.lang.String r7 = xy.b0.h(r1)     // Catch: java.lang.Throwable -> Le3 java.lang.Throwable -> Le3 java.lang.Throwable -> Le3
                r13.append(r7)     // Catch: java.lang.Throwable -> Le3 java.lang.Throwable -> Le3 java.lang.Throwable -> Le3
                java.lang.String r7 = " ping]"
                r13.append(r7)     // Catch: java.lang.Throwable -> Le3 java.lang.Throwable -> Le3 java.lang.Throwable -> Le3
                java.lang.String r13 = r13.toString()     // Catch: java.lang.Throwable -> Le3 java.lang.Throwable -> Le3 java.lang.Throwable -> Le3
                long r7 = r12.f62402e     // Catch: java.lang.Throwable -> Le3 java.lang.Throwable -> Le3 java.lang.Throwable -> Le3
                io.ktor.websocket.h$a$b r9 = new io.ktor.websocket.h$a$b     // Catch: java.lang.Throwable -> Le3 java.lang.Throwable -> Le3 java.lang.Throwable -> Le3
                e40.l0<io.ktor.websocket.d> r10 = r12.f62405h     // Catch: java.lang.Throwable -> Le3 java.lang.Throwable -> Le3 java.lang.Throwable -> Le3
                e40.o<io.ktor.websocket.d$e> r11 = r12.f62404g     // Catch: java.lang.Throwable -> Le3 java.lang.Throwable -> Le3 java.lang.Throwable -> Le3
                r9.<init>(r10, r13, r11, r5)     // Catch: java.lang.Throwable -> Le3 java.lang.Throwable -> Le3 java.lang.Throwable -> Le3
                r12.f62398a = r6     // Catch: java.lang.Throwable -> Le3 java.lang.Throwable -> Le3 java.lang.Throwable -> Le3
                r12.f62399b = r1     // Catch: java.lang.Throwable -> Le3 java.lang.Throwable -> Le3 java.lang.Throwable -> Le3
                r12.f62400c = r3     // Catch: java.lang.Throwable -> Le3 java.lang.Throwable -> Le3 java.lang.Throwable -> Le3
                java.lang.Object r13 = c40.v3.e(r7, r9, r12)     // Catch: java.lang.Throwable -> Le3 java.lang.Throwable -> Le3 java.lang.Throwable -> Le3
                if (r13 != r0) goto Lbc
                goto Le0
            Lbc:
                yz.g2 r13 = (yz.g2) r13     // Catch: java.lang.Throwable -> Le3 java.lang.Throwable -> Le3 java.lang.Throwable -> Le3
                if (r13 != 0) goto Le1
                org.slf4j.Logger r13 = io.ktor.websocket.c.f()     // Catch: java.lang.Throwable -> Le3 java.lang.Throwable -> Le3 java.lang.Throwable -> Le3
                java.lang.String r1 = "WebSocket pinger has timed out"
                r13.trace(r1)     // Catch: java.lang.Throwable -> Le3 java.lang.Throwable -> Le3 java.lang.Throwable -> Le3
                x00.p<io.ktor.websocket.CloseReason, j00.c<? super yz.g2>, java.lang.Object> r13 = r12.f62403f     // Catch: java.lang.Throwable -> Le3 java.lang.Throwable -> Le3 java.lang.Throwable -> Le3
                io.ktor.websocket.CloseReason r1 = new io.ktor.websocket.CloseReason     // Catch: java.lang.Throwable -> Le3 java.lang.Throwable -> Le3 java.lang.Throwable -> Le3
                io.ktor.websocket.CloseReason$Codes r3 = io.ktor.websocket.CloseReason.Codes.INTERNAL_ERROR     // Catch: java.lang.Throwable -> Le3 java.lang.Throwable -> Le3 java.lang.Throwable -> Le3
                java.lang.String r4 = "Ping timeout"
                r1.<init>(r3, r4)     // Catch: java.lang.Throwable -> Le3 java.lang.Throwable -> Le3 java.lang.Throwable -> Le3
                r12.f62398a = r5     // Catch: java.lang.Throwable -> Le3 java.lang.Throwable -> Le3 java.lang.Throwable -> Le3
                r12.f62399b = r5     // Catch: java.lang.Throwable -> Le3 java.lang.Throwable -> Le3 java.lang.Throwable -> Le3
                r12.f62400c = r2     // Catch: java.lang.Throwable -> Le3 java.lang.Throwable -> Le3 java.lang.Throwable -> Le3
                java.lang.Object r13 = r13.invoke(r1, r12)     // Catch: java.lang.Throwable -> Le3 java.lang.Throwable -> Le3 java.lang.Throwable -> Le3
                if (r13 != r0) goto Le3
            Le0:
                return r0
            Le1:
                r13 = r6
                goto L70
            Le3:
                yz.g2 r13 = yz.g2.f100423a
                return r13
            */
            throw new UnsupportedOperationException("Method not decompiled: io.ktor.websocket.h.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "io.ktor.websocket.PingPongKt$ponger$1", f = "PingPong.kt", i = {0, 1}, l = {117, 32}, m = "invokeSuspend", n = {"$this$consume$iv$iv", "$this$consume$iv$iv"}, s = {"L$1", "L$1"})
    @u0({"SMAP\nPingPong.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PingPong.kt\nio/ktor/websocket/PingPongKt$ponger$1\n+ 2 Channels.common.kt\nkotlinx/coroutines/channels/ChannelsKt__Channels_commonKt\n*L\n1#1,112:1\n160#2:113\n94#2,3:114\n161#2,2:117\n101#2:119\n97#2,3:120\n*S KotlinDebug\n*F\n+ 1 PingPong.kt\nio/ktor/websocket/PingPongKt$ponger$1\n*L\n30#1:113\n30#1:114,3\n30#1:117,2\n30#1:119\n30#1:120,3\n*E\n"})
    public static final class b extends SuspendLambda implements x00.p<r0, j00.c<? super g2>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public Object f62412a;

        /* renamed from: b, reason: collision with root package name */
        public Object f62413b;

        /* renamed from: c, reason: collision with root package name */
        public Object f62414c;

        /* renamed from: d, reason: collision with root package name */
        public int f62415d;

        /* renamed from: e, reason: collision with root package name */
        public final /* synthetic */ e40.o<d.C0728d> f62416e;

        /* renamed from: f, reason: collision with root package name */
        public final /* synthetic */ e40.l0<d.e> f62417f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public b(e40.o<d.C0728d> oVar, e40.l0<? super d.e> l0Var, j00.c<? super b> cVar) {
            super(2, cVar);
            this.f62416e = oVar;
            this.f62417f = l0Var;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final j00.c<g2> create(Object obj, j00.c<?> cVar) {
            return new b(this.f62416e, this.f62417f, cVar);
        }

        @Override // x00.p
        public final Object invoke(r0 r0Var, j00.c<? super g2> cVar) {
            return ((b) create(r0Var, cVar)).invokeSuspend(g2.f100423a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:18:0x0083, code lost:
        
            if (r5.b(r7, r10) == r0) goto L27;
         */
        /* JADX WARN: Removed duplicated region for block: B:11:0x0052  */
        /* JADX WARN: Removed duplicated region for block: B:14:0x0053  */
        /* JADX WARN: Removed duplicated region for block: B:17:0x005f A[Catch: all -> 0x001f, TryCatch #2 {all -> 0x001f, blocks: (B:7:0x001a, B:9:0x0044, B:15:0x0056, B:17:0x005f, B:19:0x0086, B:27:0x0035, B:30:0x0040), top: B:2:0x0008, outer: #0 }] */
        /* JADX WARN: Removed duplicated region for block: B:19:0x0086 A[Catch: all -> 0x001f, TRY_LEAVE, TryCatch #2 {all -> 0x001f, blocks: (B:7:0x001a, B:9:0x0044, B:15:0x0056, B:17:0x005f, B:19:0x0086, B:27:0x0035, B:30:0x0040), top: B:2:0x0008, outer: #0 }] */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x0083 -> B:8:0x001d). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r11) {
            /*
                r10 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.b.l()
                int r1 = r10.f62415d
                r2 = 1
                r3 = 2
                if (r1 == 0) goto L39
                if (r1 == r2) goto L29
                if (r1 != r3) goto L21
                java.lang.Object r1 = r10.f62414c
                e40.q r1 = (e40.q) r1
                java.lang.Object r4 = r10.f62413b
                e40.k0 r4 = (e40.k0) r4
                java.lang.Object r5 = r10.f62412a
                e40.l0 r5 = (e40.l0) r5
                kotlin.e.n(r11)     // Catch: java.lang.Throwable -> L1f
            L1d:
                r11 = r5
                goto L44
            L1f:
                r11 = move-exception
                goto L8c
            L21:
                java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r11.<init>(r0)
                throw r11
            L29:
                java.lang.Object r1 = r10.f62414c
                e40.q r1 = (e40.q) r1
                java.lang.Object r4 = r10.f62413b
                e40.k0 r4 = (e40.k0) r4
                java.lang.Object r5 = r10.f62412a
                e40.l0 r5 = (e40.l0) r5
                kotlin.e.n(r11)     // Catch: java.lang.Throwable -> L1f
                goto L56
            L39:
                kotlin.e.n(r11)
                e40.o<io.ktor.websocket.d$d> r4 = r10.f62416e     // Catch: kotlinx.coroutines.channels.ClosedSendChannelException -> L92
                e40.l0<io.ktor.websocket.d$e> r11 = r10.f62417f     // Catch: kotlinx.coroutines.channels.ClosedSendChannelException -> L92
                e40.q r1 = r4.iterator()     // Catch: java.lang.Throwable -> L1f
            L44:
                r10.f62412a = r11     // Catch: java.lang.Throwable -> L1f
                r10.f62413b = r4     // Catch: java.lang.Throwable -> L1f
                r10.f62414c = r1     // Catch: java.lang.Throwable -> L1f
                r10.f62415d = r2     // Catch: java.lang.Throwable -> L1f
                java.lang.Object r5 = r1.a(r10)     // Catch: java.lang.Throwable -> L1f
                if (r5 != r0) goto L53
                goto L85
            L53:
                r9 = r5
                r5 = r11
                r11 = r9
            L56:
                java.lang.Boolean r11 = (java.lang.Boolean) r11     // Catch: java.lang.Throwable -> L1f
                boolean r11 = r11.booleanValue()     // Catch: java.lang.Throwable -> L1f
                r6 = 0
                if (r11 == 0) goto L86
                java.lang.Object r11 = r1.next()     // Catch: java.lang.Throwable -> L1f
                io.ktor.websocket.d$d r11 = (io.ktor.websocket.d.C0728d) r11     // Catch: java.lang.Throwable -> L1f
                org.slf4j.Logger r7 = io.ktor.websocket.c.f()     // Catch: java.lang.Throwable -> L1f
                java.lang.String r8 = "Received ping message, sending pong message"
                r7.trace(r8)     // Catch: java.lang.Throwable -> L1f
                io.ktor.websocket.d$e r7 = new io.ktor.websocket.d$e     // Catch: java.lang.Throwable -> L1f
                byte[] r11 = r11.d()     // Catch: java.lang.Throwable -> L1f
                r7.<init>(r11, r6, r3, r6)     // Catch: java.lang.Throwable -> L1f
                r10.f62412a = r5     // Catch: java.lang.Throwable -> L1f
                r10.f62413b = r4     // Catch: java.lang.Throwable -> L1f
                r10.f62414c = r1     // Catch: java.lang.Throwable -> L1f
                r10.f62415d = r3     // Catch: java.lang.Throwable -> L1f
                java.lang.Object r11 = r5.b(r7, r10)     // Catch: java.lang.Throwable -> L1f
                if (r11 != r0) goto L1d
            L85:
                return r0
            L86:
                yz.g2 r11 = yz.g2.f100423a     // Catch: java.lang.Throwable -> L1f
                e40.u.b(r4, r6)     // Catch: kotlinx.coroutines.channels.ClosedSendChannelException -> L92
                goto L92
            L8c:
                throw r11     // Catch: java.lang.Throwable -> L8d
            L8d:
                r0 = move-exception
                e40.u.b(r4, r11)     // Catch: kotlinx.coroutines.channels.ClosedSendChannelException -> L92
                throw r0     // Catch: kotlinx.coroutines.channels.ClosedSendChannelException -> L92
            L92:
                yz.g2 r11 = yz.g2.f100423a
                return r11
            */
            throw new UnsupportedOperationException("Method not decompiled: io.ktor.websocket.h.b.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @m80.k
    public static final e40.l0<d.e> b(@m80.k r0 r0Var, @m80.k e40.l0<? super d> outgoing, long j11, long j12, @m80.k x00.p<? super CloseReason, ? super j00.c<? super g2>, ? extends Object> onTimeout) {
        final c40.a0 c11;
        kotlin.jvm.internal.g0.p(r0Var, "<this>");
        kotlin.jvm.internal.g0.p(outgoing, "outgoing");
        kotlin.jvm.internal.g0.p(onTimeout, "onTimeout");
        c11 = p2.c(null, 1, null);
        e40.o d11 = e40.r.d(Integer.MAX_VALUE, null, null, 6, null);
        c40.k.f(r0Var, c11.plus(f62397b), null, new a(j11, j12, onTimeout, d11, outgoing, null), 2, null);
        d.b bVar = r0Var.getCoroutineContext().get(l2.f7886e0);
        kotlin.jvm.internal.g0.m(bVar);
        ((l2) bVar).z0(new x00.l() { // from class: io.ktor.websocket.g
            @Override // x00.l
            public final Object invoke(Object obj) {
                g2 c12;
                c12 = h.c(c40.a0.this, (Throwable) obj);
                return c12;
            }
        });
        return d11;
    }

    public static final g2 c(c40.a0 a0Var, Throwable th2) {
        l2.a.b(a0Var, null, 1, null);
        return g2.f100423a;
    }

    @m80.k
    public static final e40.l0<d.C0728d> d(@m80.k r0 r0Var, @m80.k e40.l0<? super d.e> outgoing) {
        kotlin.jvm.internal.g0.p(r0Var, "<this>");
        kotlin.jvm.internal.g0.p(outgoing, "outgoing");
        e40.o d11 = e40.r.d(5, null, null, 6, null);
        c40.k.f(r0Var, f62396a, null, new b(d11, outgoing, null), 2, null);
        return d11;
    }
}
