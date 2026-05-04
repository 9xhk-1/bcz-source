package io.ktor.server.testing;

import androidx.core.app.NotificationCompat;
import c40.l2;
import java.nio.ByteBuffer;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class TestApplicationEngineJvmKt {

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "io.ktor.server.testing.TestApplicationEngineJvmKt", f = "TestApplicationEngineJvm.kt", i = {0}, l = {55}, m = "handleWebSocketConversation", n = {NotificationCompat.CATEGORY_CALL}, s = {"L$0"})
    public static final class a extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public Object f61824a;

        /* renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f61825b;

        /* renamed from: c, reason: collision with root package name */
        public int f61826c;

        public a(j00.c<? super a> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @m80.l
        public final Object invokeSuspend(@m80.k Object obj) {
            this.f61825b = obj;
            this.f61826c |= Integer.MIN_VALUE;
            return TestApplicationEngineJvmKt.d(null, null, null, false, null, this);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "io.ktor.server.testing.TestApplicationEngineJvmKt$handleWebSocketConversation$5", f = "TestApplicationEngineJvm.kt", i = {0, 1}, l = {56, 58}, m = "invokeSuspend", n = {"$this$withContext", "$this$withContext"}, s = {"L$0", "L$0"})
    public static final class b extends SuspendLambda implements x00.p<c40.r0, j00.c<? super l2>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f61827a;

        /* renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f61828b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ c40.a0 f61829c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ TestApplicationEngine f61830d;

        /* renamed from: e, reason: collision with root package name */
        public final /* synthetic */ f0 f61831e;

        /* renamed from: f, reason: collision with root package name */
        public final /* synthetic */ c40.a0 f61832f;

        /* renamed from: g, reason: collision with root package name */
        public final /* synthetic */ io.ktor.utils.io.b f61833g;

        /* renamed from: h, reason: collision with root package name */
        public final /* synthetic */ kotlin.coroutines.d f61834h;

        /* renamed from: i, reason: collision with root package name */
        public final /* synthetic */ pz.h<ByteBuffer> f61835i;

        /* renamed from: j, reason: collision with root package name */
        public final /* synthetic */ boolean f61836j;

        /* renamed from: k, reason: collision with root package name */
        public final /* synthetic */ x00.r<f0, e40.k0<? extends io.ktor.websocket.d>, e40.l0<? super io.ktor.websocket.d>, j00.c<? super g2>, Object> f61837k;

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        @l00.d(c = "io.ktor.server.testing.TestApplicationEngineJvmKt$handleWebSocketConversation$5$1", f = "TestApplicationEngineJvm.kt", i = {}, l = {75, 77, 79, 77, 79}, m = "invokeSuspend", n = {}, s = {})
        public static final class a extends SuspendLambda implements x00.p<c40.r0, j00.c<? super g2>, Object> {

            /* renamed from: a, reason: collision with root package name */
            public Object f61838a;

            /* renamed from: b, reason: collision with root package name */
            public int f61839b;

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ x00.r<f0, e40.k0<? extends io.ktor.websocket.d>, e40.l0<? super io.ktor.websocket.d>, j00.c<? super g2>, Object> f61840c;

            /* renamed from: d, reason: collision with root package name */
            public final /* synthetic */ f0 f61841d;

            /* renamed from: e, reason: collision with root package name */
            public final /* synthetic */ io.ktor.websocket.i0 f61842e;

            /* renamed from: f, reason: collision with root package name */
            public final /* synthetic */ io.ktor.websocket.l0 f61843f;

            /* renamed from: g, reason: collision with root package name */
            public final /* synthetic */ c40.a0 f61844g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public a(x00.r<? super f0, ? super e40.k0<? extends io.ktor.websocket.d>, ? super e40.l0<? super io.ktor.websocket.d>, ? super j00.c<? super g2>, ? extends Object> rVar, f0 f0Var, io.ktor.websocket.i0 i0Var, io.ktor.websocket.l0 l0Var, c40.a0 a0Var, j00.c<? super a> cVar) {
                super(2, cVar);
                this.f61840c = rVar;
                this.f61841d = f0Var;
                this.f61842e = i0Var;
                this.f61843f = l0Var;
                this.f61844g = a0Var;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final j00.c<g2> create(Object obj, j00.c<?> cVar) {
                return new a(this.f61840c, this.f61841d, this.f61842e, this.f61843f, this.f61844g, cVar);
            }

            @Override // x00.p
            public final Object invoke(c40.r0 r0Var, j00.c<? super g2> cVar) {
                return ((a) create(r0Var, cVar)).invokeSuspend(g2.f100423a);
            }

            /* JADX WARN: Code restructure failed: missing block: B:25:0x0078, code lost:
            
                if (c40.n2.l(r11, r10) == r0) goto L36;
             */
            /* JADX WARN: Code restructure failed: missing block: B:28:0x0064, code lost:
            
                if (r11.g(r10) == r0) goto L36;
             */
            /* JADX WARN: Code restructure failed: missing block: B:32:0x0059, code lost:
            
                if (r11.invoke(r1, r8, r9, r10) == r0) goto L36;
             */
            /* JADX WARN: Code restructure failed: missing block: B:35:0x0088, code lost:
            
                if (r1.g(r10) != r0) goto L34;
             */
            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object invokeSuspend(java.lang.Object r11) {
                /*
                    r10 = this;
                    java.lang.Object r0 = kotlin.coroutines.intrinsics.b.l()
                    int r1 = r10.f61839b
                    r2 = 5
                    r3 = 4
                    r4 = 3
                    r5 = 2
                    r6 = 0
                    r7 = 1
                    if (r1 == 0) goto L40
                    if (r1 == r7) goto L3a
                    if (r1 == r5) goto L36
                    if (r1 == r4) goto L32
                    if (r1 == r3) goto L29
                    if (r1 == r2) goto L20
                    java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
                    java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                    r11.<init>(r0)
                    throw r11
                L20:
                    java.lang.Object r0 = r10.f61838a
                    java.lang.Throwable r0 = (java.lang.Throwable) r0
                    kotlin.e.n(r11)
                    goto La2
                L29:
                    java.lang.Object r1 = r10.f61838a
                    java.lang.Throwable r1 = (java.lang.Throwable) r1
                    kotlin.e.n(r11)
                    r11 = r1
                    goto L8b
                L32:
                    kotlin.e.n(r11)
                    goto L7b
                L36:
                    kotlin.e.n(r11)
                    goto L67
                L3a:
                    kotlin.e.n(r11)     // Catch: java.lang.Throwable -> L3e
                    goto L5c
                L3e:
                    r11 = move-exception
                    goto L7e
                L40:
                    kotlin.e.n(r11)
                    x00.r<io.ktor.server.testing.f0, e40.k0<? extends io.ktor.websocket.d>, e40.l0<? super io.ktor.websocket.d>, j00.c<? super yz.g2>, java.lang.Object> r11 = r10.f61840c     // Catch: java.lang.Throwable -> L3e
                    io.ktor.server.testing.f0 r1 = r10.f61841d     // Catch: java.lang.Throwable -> L3e
                    io.ktor.websocket.i0 r8 = r10.f61842e     // Catch: java.lang.Throwable -> L3e
                    e40.k0 r8 = r8.j()     // Catch: java.lang.Throwable -> L3e
                    io.ktor.websocket.l0 r9 = r10.f61843f     // Catch: java.lang.Throwable -> L3e
                    e40.l0 r9 = r9.q()     // Catch: java.lang.Throwable -> L3e
                    r10.f61839b = r7     // Catch: java.lang.Throwable -> L3e
                    java.lang.Object r11 = r11.invoke(r1, r8, r9, r10)     // Catch: java.lang.Throwable -> L3e
                    if (r11 != r0) goto L5c
                    goto La0
                L5c:
                    io.ktor.websocket.l0 r11 = r10.f61843f
                    r10.f61839b = r5
                    java.lang.Object r11 = r11.g(r10)
                    if (r11 != r0) goto L67
                    goto La0
                L67:
                    io.ktor.websocket.l0 r11 = r10.f61843f
                    e40.l0 r11 = r11.q()
                    e40.l0.a.a(r11, r6, r7, r6)
                    c40.a0 r11 = r10.f61844g
                    r10.f61839b = r4
                    java.lang.Object r11 = c40.n2.l(r11, r10)
                    if (r11 != r0) goto L7b
                    goto La0
                L7b:
                    yz.g2 r11 = yz.g2.f100423a
                    return r11
                L7e:
                    io.ktor.websocket.l0 r1 = r10.f61843f
                    r10.f61838a = r11
                    r10.f61839b = r3
                    java.lang.Object r1 = r1.g(r10)
                    if (r1 != r0) goto L8b
                    goto La0
                L8b:
                    io.ktor.websocket.l0 r1 = r10.f61843f
                    e40.l0 r1 = r1.q()
                    e40.l0.a.a(r1, r6, r7, r6)
                    c40.a0 r1 = r10.f61844g
                    r10.f61838a = r11
                    r10.f61839b = r2
                    java.lang.Object r1 = c40.n2.l(r1, r10)
                    if (r1 != r0) goto La1
                La0:
                    return r0
                La1:
                    r0 = r11
                La2:
                    throw r0
                */
                throw new UnsupportedOperationException("Method not decompiled: io.ktor.server.testing.TestApplicationEngineJvmKt.b.a.invokeSuspend(java.lang.Object):java.lang.Object");
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        @l00.d(c = "io.ktor.server.testing.TestApplicationEngineJvmKt$handleWebSocketConversation$5$connectionEstablished$1", f = "TestApplicationEngineJvm.kt", i = {}, l = {59}, m = "invokeSuspend", n = {}, s = {})
        /* renamed from: io.ktor.server.testing.TestApplicationEngineJvmKt$b$b, reason: collision with other inner class name */
        public static final class C0716b extends SuspendLambda implements x00.p<c40.r0, j00.c<? super g2>, Object> {

            /* renamed from: a, reason: collision with root package name */
            public int f61845a;

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ f0 f61846b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0716b(f0 f0Var, j00.c<? super C0716b> cVar) {
                super(2, cVar);
                this.f61846b = f0Var;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final j00.c<g2> create(Object obj, j00.c<?> cVar) {
                return new C0716b(this.f61846b, cVar);
            }

            @Override // x00.p
            public final Object invoke(c40.r0 r0Var, j00.c<? super g2> cVar) {
                return ((C0716b) create(r0Var, cVar)).invokeSuspend(g2.f100423a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object l11 = kotlin.coroutines.intrinsics.b.l();
                int i11 = this.f61845a;
                if (i11 == 0) {
                    kotlin.e.n(obj);
                    c40.a0 V = this.f61846b.b().V();
                    this.f61845a = 1;
                    if (V.K0(this) == l11) {
                        return l11;
                    }
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.e.n(obj);
                }
                return g2.f100423a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public b(c40.a0 a0Var, TestApplicationEngine testApplicationEngine, f0 f0Var, c40.a0 a0Var2, io.ktor.utils.io.b bVar, kotlin.coroutines.d dVar, pz.h<ByteBuffer> hVar, boolean z11, x00.r<? super f0, ? super e40.k0<? extends io.ktor.websocket.d>, ? super e40.l0<? super io.ktor.websocket.d>, ? super j00.c<? super g2>, ? extends Object> rVar, j00.c<? super b> cVar) {
            super(2, cVar);
            this.f61829c = a0Var;
            this.f61830d = testApplicationEngine;
            this.f61831e = f0Var;
            this.f61832f = a0Var2;
            this.f61833g = bVar;
            this.f61834h = dVar;
            this.f61835i = hVar;
            this.f61836j = z11;
            this.f61837k = rVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final j00.c<g2> create(Object obj, j00.c<?> cVar) {
            b bVar = new b(this.f61829c, this.f61830d, this.f61831e, this.f61832f, this.f61833g, this.f61834h, this.f61835i, this.f61836j, this.f61837k, cVar);
            bVar.f61828b = obj;
            return bVar;
        }

        @Override // x00.p
        public final Object invoke(c40.r0 r0Var, j00.c<? super l2> cVar) {
            return ((b) create(r0Var, cVar)).invokeSuspend(g2.f100423a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:28:0x0039, code lost:
        
            if (r1.K0(r13) == r0) goto L15;
         */
        /* JADX WARN: Removed duplicated region for block: B:18:0x00b0  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x0061  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r14) {
            /*
                r13 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.b.l()
                int r1 = r13.f61827a
                r2 = 2
                r3 = 0
                r4 = 1
                if (r1 == 0) goto L28
                if (r1 == r4) goto L1f
                if (r1 != r2) goto L17
                java.lang.Object r0 = r13.f61828b
                c40.r0 r0 = (c40.r0) r0
                kotlin.e.n(r14)
                goto L5d
            L17:
                java.lang.IllegalStateException r14 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r14.<init>(r0)
                throw r14
            L1f:
                java.lang.Object r1 = r13.f61828b
                c40.r0 r1 = (c40.r0) r1
                kotlin.e.n(r14)
                r14 = r1
                goto L3c
            L28:
                kotlin.e.n(r14)
                java.lang.Object r14 = r13.f61828b
                c40.r0 r14 = (c40.r0) r14
                c40.a0 r1 = r13.f61829c
                r13.f61828b = r14
                r13.f61827a = r4
                java.lang.Object r1 = r1.K0(r13)
                if (r1 != r0) goto L3c
                goto L5a
            L3c:
                io.ktor.server.testing.TestApplicationEngine r1 = r13.f61830d
                x00.l r1 = r1.P()
                io.ktor.server.testing.f0 r5 = r13.f61831e
                r1.invoke(r5)
                io.ktor.server.testing.TestApplicationEngineJvmKt$b$b r1 = new io.ktor.server.testing.TestApplicationEngineJvmKt$b$b
                io.ktor.server.testing.f0 r5 = r13.f61831e
                r1.<init>(r5, r3)
                r13.f61828b = r14
                r13.f61827a = r2
                r5 = 1000(0x3e8, double:4.94E-321)
                java.lang.Object r1 = c40.v3.e(r5, r1, r13)
                if (r1 != r0) goto L5b
            L5a:
                return r0
            L5b:
                r0 = r14
                r14 = r1
            L5d:
                yz.g2 r14 = (yz.g2) r14
                if (r14 == 0) goto Lb0
                io.ktor.websocket.l0 r5 = new io.ktor.websocket.l0
                io.ktor.utils.io.b r6 = r13.f61833g
                kotlin.coroutines.d r7 = r13.f61834h
                pz.h<java.nio.ByteBuffer> r9 = r13.f61835i
                r10 = 4
                r11 = 0
                r8 = 0
                r5.<init>(r6, r7, r8, r9, r10, r11)
                io.ktor.server.testing.f0 r14 = r13.f61831e
                io.ktor.server.testing.w0 r14 = r14.b()
                io.ktor.utils.io.g r7 = r14.Z()
                if (r7 == 0) goto La8
                io.ktor.websocket.i0 r6 = new io.ktor.websocket.i0
                kotlin.coroutines.d r8 = r13.f61834h
                r9 = 2147483647(0x7fffffff, double:1.060997895E-314)
                pz.h<java.nio.ByteBuffer> r11 = r13.f61835i
                r6.<init>(r7, r8, r9, r11)
                boolean r14 = r13.f61836j
                if (r14 == 0) goto L8c
                goto L8e
            L8c:
                c40.b2 r0 = c40.b2.f7824a
            L8e:
                io.ktor.server.testing.TestApplicationEngineJvmKt$b$a r10 = new io.ktor.server.testing.TestApplicationEngineJvmKt$b$a
                r8 = r6
                x00.r<io.ktor.server.testing.f0, e40.k0<? extends io.ktor.websocket.d>, e40.l0<? super io.ktor.websocket.d>, j00.c<? super yz.g2>, java.lang.Object> r6 = r13.f61837k
                io.ktor.server.testing.f0 r7 = r13.f61831e
                r9 = r5
                r5 = r10
                c40.a0 r10 = r13.f61832f
                r11 = 0
                r5.<init>(r6, r7, r8, r9, r10, r11)
                r11 = 3
                r12 = 0
                r8 = 0
                r9 = 0
                r7 = r0
                r10 = r5
                c40.l2 r14 = c40.i.e(r7, r8, r9, r10, r11, r12)
                return r14
            La8:
                java.lang.IllegalStateException r14 = new java.lang.IllegalStateException
                java.lang.String r0 = "Expected websocket channel in the established connection"
                r14.<init>(r0)
                throw r14
            Lb0:
                c40.a0 r14 = r13.f61832f
                c40.l2.a.b(r14, r3, r4, r3)
                java.lang.IllegalStateException r14 = new java.lang.IllegalStateException
                java.lang.String r0 = "WebSocket connection failed"
                r14.<init>(r0)
                throw r14
            */
            throw new UnsupportedOperationException("Method not decompiled: io.ktor.server.testing.TestApplicationEngineJvmKt.b.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0027  */
    @m80.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object d(@m80.k io.ktor.server.testing.TestApplicationEngine r15, @m80.k java.lang.String r16, @m80.k final x00.l<? super io.ktor.server.testing.u0, yz.g2> r17, boolean r18, @m80.k x00.r<? super io.ktor.server.testing.f0, ? super e40.k0<? extends io.ktor.websocket.d>, ? super e40.l0<? super io.ktor.websocket.d>, ? super j00.c<? super yz.g2>, ? extends java.lang.Object> r19, @m80.k j00.c<? super io.ktor.server.testing.f0> r20) {
        /*
            r1 = r20
            boolean r2 = r1 instanceof io.ktor.server.testing.TestApplicationEngineJvmKt.a
            if (r2 == 0) goto L16
            r2 = r1
            io.ktor.server.testing.TestApplicationEngineJvmKt$a r2 = (io.ktor.server.testing.TestApplicationEngineJvmKt.a) r2
            int r3 = r2.f61826c
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L16
            int r3 = r3 - r4
            r2.f61826c = r3
        L14:
            r11 = r2
            goto L1c
        L16:
            io.ktor.server.testing.TestApplicationEngineJvmKt$a r2 = new io.ktor.server.testing.TestApplicationEngineJvmKt$a
            r2.<init>(r1)
            goto L14
        L1c:
            java.lang.Object r1 = r11.f61825b
            java.lang.Object r12 = kotlin.coroutines.intrinsics.b.l()
            int r2 = r11.f61826c
            r13 = 1
            if (r2 == 0) goto L39
            if (r2 != r13) goto L31
            java.lang.Object r0 = r11.f61824a
            io.ktor.server.testing.f0 r0 = (io.ktor.server.testing.f0) r0
            kotlin.e.n(r1)
            return r0
        L31:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L39:
            kotlin.e.n(r1)
            io.ktor.utils.io.b r6 = new io.ktor.utils.io.b
            r6.<init>(r13)
            io.ktor.server.testing.l0 r1 = new io.ktor.server.testing.l0
            r2 = r17
            r1.<init>()
            r2 = r16
            io.ktor.server.testing.f0 r7 = r15.G(r2, r1)
            r8 = 0
            c40.a0 r9 = c40.n2.c(r8, r13, r8)
            io.ktor.server.testing.w0 r1 = r7.b()
            c40.a0 r1 = r1.R()
            io.ktor.server.testing.m0 r2 = new io.ktor.server.testing.m0
            r2.<init>()
            r1.z0(r2)
            io.ktor.server.testing.TestApplicationEngine$b r1 = r15.N()
            kotlin.coroutines.d r1 = r1.o()
            io.ktor.server.testing.TestApplicationEngineJvmKt$handleWebSocketConversation$4 r3 = new io.ktor.server.testing.TestApplicationEngineJvmKt$handleWebSocketConversation$4
            r3.<init>(r15, r7, r9, r8)
            r4 = 2
            r5 = 0
            r2 = 0
            r0 = r15
            c40.i.e(r0, r1, r2, r3, r4, r5)
            r3 = r7
            pz.h r7 = yy.a.a()
            c40.m0 r0 = c40.h1.g()
            c40.a0 r4 = c40.n2.c(r8, r13, r8)
            kotlin.coroutines.d r0 = r0.plus(r4)
            io.ktor.server.testing.TestApplicationEngine$b r1 = r15.N()
            kotlin.coroutines.d r14 = r1.o()
            r5 = r6
            r6 = r0
            io.ktor.server.testing.TestApplicationEngineJvmKt$b r0 = new io.ktor.server.testing.TestApplicationEngineJvmKt$b
            r10 = 0
            r2 = r15
            r8 = r18
            r1 = r9
            r9 = r19
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            r11.f61824a = r3
            r11.f61826c = r13
            java.lang.Object r0 = c40.i.h(r14, r0, r11)
            if (r0 != r12) goto La9
            return r12
        La9:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.server.testing.TestApplicationEngineJvmKt.d(io.ktor.server.testing.TestApplicationEngine, java.lang.String, x00.l, boolean, x00.r, j00.c):java.lang.Object");
    }

    public static /* synthetic */ Object e(TestApplicationEngine testApplicationEngine, String str, x00.l lVar, boolean z11, x00.r rVar, j00.c cVar, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            lVar = new x00.l() { // from class: io.ktor.server.testing.n0
                @Override // x00.l
                public final Object invoke(Object obj2) {
                    g2 f11;
                    f11 = TestApplicationEngineJvmKt.f((u0) obj2);
                    return f11;
                }
            };
        }
        x00.l lVar2 = lVar;
        if ((i11 & 4) != 0) {
            z11 = true;
        }
        return d(testApplicationEngine, str, lVar2, z11, rVar, cVar);
    }

    public static final g2 f(u0 u0Var) {
        kotlin.jvm.internal.g0.p(u0Var, "<this>");
        return g2.f100423a;
    }

    public static final g2 g(x00.l lVar, io.ktor.utils.io.b bVar, u0 createWebSocketCall) {
        kotlin.jvm.internal.g0.p(createWebSocketCall, "$this$createWebSocketCall");
        lVar.invoke(createWebSocketCall);
        createWebSocketCall.G(bVar);
        return g2.f100423a;
    }

    public static final g2 h(c40.a0 a0Var, Throwable th2) {
        if (th2 == null) {
            a0Var.complete();
        } else {
            a0Var.r(th2);
        }
        return g2.f100423a;
    }
}
