package uy;

import androidx.core.app.NotificationCompat;
import c40.l2;
import c40.r0;
import com.baicizhan.client.business.webview.JsonParams;
import h10.r;
import io.ktor.server.routing.RoutingBuilderKt;
import io.ktor.server.routing.b1;
import io.ktor.server.routing.c1;
import io.ktor.server.routing.g0;
import io.ktor.websocket.j0;
import ix.e1;
import ix.y0;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.o0;
import kotlin.jvm.internal.u0;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nRouting.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Routing.kt\nio/ktor/server/websocket/RoutingKt\n+ 2 ApplicationResponseFunctions.kt\nio/ktor/server/response/ApplicationResponseFunctionsKt\n+ 3 Type.kt\nio/ktor/util/reflect/TypeKt\n*L\n1#1,239:1\n25#2:240\n26#2:257\n58#3,16:241\n*S KotlinDebug\n*F\n+ 1 Routing.kt\nio/ktor/server/websocket/RoutingKt\n*L\n166#1:240\n166#1:257\n166#1:241,16\n*E\n"})
/* loaded from: classes8.dex */
public final class i {

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "io.ktor.server.websocket.RoutingKt", f = "Routing.kt", i = {0, 0, 1}, l = {205, 206}, m = "handleServerSession", n = {"$this$handleServerSession", NotificationCompat.CATEGORY_CALL, NotificationCompat.CATEGORY_CALL}, s = {"L$0", "L$1", "L$0"})
    public static final class a extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public Object f92717a;

        /* renamed from: b, reason: collision with root package name */
        public Object f92718b;

        /* renamed from: c, reason: collision with root package name */
        public /* synthetic */ Object f92719c;

        /* renamed from: d, reason: collision with root package name */
        public int f92720d;

        public a(j00.c<? super a> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @m80.l
        public final Object invokeSuspend(@m80.k Object obj) {
            this.f92719c = obj;
            this.f92720d |= Integer.MIN_VALUE;
            return i.i(null, null, null, this);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "io.ktor.server.websocket.RoutingKt", f = "Routing.kt", i = {0}, l = {190, 191}, m = "proceedWebSocket", n = {JsonParams.ShareResultO.CHANNEL_WEIXIN}, s = {"L$0"})
    public static final class b extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public Object f92721a;

        /* renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f92722b;

        /* renamed from: c, reason: collision with root package name */
        public int f92723c;

        public b(j00.c<? super b> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @m80.l
        public final Object invokeSuspend(@m80.k Object obj) {
            this.f92722b = obj;
            this.f92723c |= Integer.MIN_VALUE;
            return i.k(null, null, this);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "io.ktor.server.websocket.RoutingKt$webSocket$1", f = "Routing.kt", i = {}, l = {132}, m = "invokeSuspend", n = {}, s = {})
    public static final class c extends SuspendLambda implements x00.p<k, j00.c<? super g2>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f92724a;

        /* renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f92725b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ x00.p<uy.a, j00.c<? super g2>, Object> f92726c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public c(x00.p<? super uy.a, ? super j00.c<? super g2>, ? extends Object> pVar, j00.c<? super c> cVar) {
            super(2, cVar);
            this.f92726c = pVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final j00.c<g2> create(Object obj, j00.c<?> cVar) {
            c cVar2 = new c(this.f92726c, cVar);
            cVar2.f92725b = obj;
            return cVar2;
        }

        @Override // x00.p
        /* renamed from: i, reason: merged with bridge method [inline-methods] */
        public final Object invoke(k kVar, j00.c<? super g2> cVar) {
            return ((c) create(kVar, cVar)).invokeSuspend(g2.f100423a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object l11 = kotlin.coroutines.intrinsics.b.l();
            int i11 = this.f92724a;
            if (i11 == 0) {
                kotlin.e.n(obj);
                k kVar = (k) this.f92725b;
                x00.p<uy.a, j00.c<? super g2>, Object> pVar = this.f92726c;
                this.f92724a = 1;
                if (i.k(kVar, pVar, this) == l11) {
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

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "io.ktor.server.websocket.RoutingKt$webSocket$2", f = "Routing.kt", i = {}, l = {154}, m = "invokeSuspend", n = {}, s = {})
    public static final class d extends SuspendLambda implements x00.p<k, j00.c<? super g2>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f92727a;

        /* renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f92728b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ x00.p<uy.a, j00.c<? super g2>, Object> f92729c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public d(x00.p<? super uy.a, ? super j00.c<? super g2>, ? extends Object> pVar, j00.c<? super d> cVar) {
            super(2, cVar);
            this.f92729c = pVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final j00.c<g2> create(Object obj, j00.c<?> cVar) {
            d dVar = new d(this.f92729c, cVar);
            dVar.f92728b = obj;
            return dVar;
        }

        @Override // x00.p
        /* renamed from: i, reason: merged with bridge method [inline-methods] */
        public final Object invoke(k kVar, j00.c<? super g2> cVar) {
            return ((d) create(kVar, cVar)).invokeSuspend(g2.f100423a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object l11 = kotlin.coroutines.intrinsics.b.l();
            int i11 = this.f92727a;
            if (i11 == 0) {
                kotlin.e.n(obj);
                k kVar = (k) this.f92728b;
                x00.p<uy.a, j00.c<? super g2>, Object> pVar = this.f92729c;
                this.f92727a = 1;
                if (i.k(kVar, pVar, this) == l11) {
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

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "io.ktor.server.websocket.RoutingKt$webSocketRaw$2$1$1$1", f = "Routing.kt", i = {}, l = {106}, m = "invokeSuspend", n = {}, s = {})
    public static final class e extends SuspendLambda implements x00.p<c1, j00.c<? super g2>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f92730a;

        /* renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f92731b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ String f92732c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ boolean f92733d;

        /* renamed from: e, reason: collision with root package name */
        public final /* synthetic */ x00.p<k, j00.c<? super g2>, Object> f92734e;

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        @l00.d(c = "io.ktor.server.websocket.RoutingKt$webSocketRaw$2$1$1$1$1", f = "Routing.kt", i = {}, l = {107}, m = "invokeSuspend", n = {}, s = {})
        public static final class a extends SuspendLambda implements x00.p<j0, j00.c<? super g2>, Object> {

            /* renamed from: a, reason: collision with root package name */
            public int f92735a;

            /* renamed from: b, reason: collision with root package name */
            public /* synthetic */ Object f92736b;

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ x00.p<k, j00.c<? super g2>, Object> f92737c;

            /* renamed from: d, reason: collision with root package name */
            public final /* synthetic */ c1 f92738d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public a(x00.p<? super k, ? super j00.c<? super g2>, ? extends Object> pVar, c1 c1Var, j00.c<? super a> cVar) {
                super(2, cVar);
                this.f92737c = pVar;
                this.f92738d = c1Var;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final j00.c<g2> create(Object obj, j00.c<?> cVar) {
                a aVar = new a(this.f92737c, this.f92738d, cVar);
                aVar.f92736b = obj;
                return aVar;
            }

            @Override // x00.p
            /* renamed from: i, reason: merged with bridge method [inline-methods] */
            public final Object invoke(j0 j0Var, j00.c<? super g2> cVar) {
                return ((a) create(j0Var, cVar)).invokeSuspend(g2.f100423a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object l11 = kotlin.coroutines.intrinsics.b.l();
                int i11 = this.f92735a;
                if (i11 == 0) {
                    kotlin.e.n(obj);
                    j0 j0Var = (j0) this.f92736b;
                    x00.p<k, j00.c<? super g2>, Object> pVar = this.f92737c;
                    k h11 = l.h(j0Var, this.f92738d.a());
                    this.f92735a = 1;
                    if (pVar.invoke(h11, this) == l11) {
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
        public e(String str, boolean z11, x00.p<? super k, ? super j00.c<? super g2>, ? extends Object> pVar, j00.c<? super e> cVar) {
            super(2, cVar);
            this.f92732c = str;
            this.f92733d = z11;
            this.f92734e = pVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final j00.c<g2> create(Object obj, j00.c<?> cVar) {
            e eVar = new e(this.f92732c, this.f92733d, this.f92734e, cVar);
            eVar.f92731b = obj;
            return eVar;
        }

        @Override // x00.p
        public final Object invoke(c1 c1Var, j00.c<? super g2> cVar) {
            return ((e) create(c1Var, cVar)).invokeSuspend(g2.f100423a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object l11 = kotlin.coroutines.intrinsics.b.l();
            int i11 = this.f92730a;
            if (i11 == 0) {
                kotlin.e.n(obj);
                c1 c1Var = (c1) this.f92731b;
                b1 a11 = c1Var.a();
                String str = this.f92732c;
                boolean z11 = this.f92733d;
                a aVar = new a(this.f92734e, c1Var, null);
                this.f92730a = 1;
                if (i.l(a11, str, z11, aVar, this) == l11) {
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

    public static final g2 A(String str, boolean z11, x00.p pVar, g0 route) {
        kotlin.jvm.internal.g0.p(route, "$this$route");
        v(route, str, z11, pVar);
        return g2.f100423a;
    }

    public static final g2 B(final String str, final boolean z11, final x00.p pVar, g0 header) {
        kotlin.jvm.internal.g0.p(header, "$this$header");
        RoutingBuilderKt.D(header, y0.f63006a.K0(), "websocket", new x00.l() { // from class: uy.h
            @Override // x00.l
            public final Object invoke(Object obj) {
                g2 C;
                C = i.C(str, z11, pVar, (g0) obj);
                return C;
            }
        });
        return g2.f100423a;
    }

    public static final g2 C(final String str, final boolean z11, final x00.p pVar, g0 header) {
        kotlin.jvm.internal.g0.p(header, "$this$header");
        r(header, str, new x00.l() { // from class: uy.g
            @Override // x00.l
            public final Object invoke(Object obj) {
                g2 D;
                D = i.D(str, z11, pVar, (g0) obj);
                return D;
            }
        });
        return g2.f100423a;
    }

    public static final g2 D(String str, boolean z11, x00.p pVar, g0 webSocketProtocol) {
        kotlin.jvm.internal.g0.p(webSocketProtocol, "$this$webSocketProtocol");
        webSocketProtocol.e(new e(str, z11, pVar, null));
        return g2.f100423a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0087, code lost:
    
        if (io.ktor.websocket.k0.c(r6, null, r0, 1, null) != r1) goto L29;
     */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object i(io.ktor.websocket.a r6, zx.b r7, x00.p<? super uy.a, ? super j00.c<? super yz.g2>, ? extends java.lang.Object> r8, j00.c<? super yz.g2> r9) {
        /*
            boolean r0 = r9 instanceof uy.i.a
            if (r0 == 0) goto L13
            r0 = r9
            uy.i$a r0 = (uy.i.a) r0
            int r1 = r0.f92720d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f92720d = r1
            goto L18
        L13:
            uy.i$a r0 = new uy.i$a
            r0.<init>(r9)
        L18:
            java.lang.Object r9 = r0.f92719c
            java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
            int r2 = r0.f92720d
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L48
            if (r2 == r4) goto L3b
            if (r2 != r3) goto L33
            java.lang.Object r6 = r0.f92717a
            r7 = r6
            zx.b r7 = (zx.b) r7
            kotlin.e.n(r9)     // Catch: java.lang.Throwable -> L31 io.ktor.util.cio.ChannelIOException -> L9b java.util.concurrent.CancellationException -> L9d
            goto L8a
        L31:
            r6 = move-exception
            goto L8d
        L33:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L3b:
            java.lang.Object r6 = r0.f92718b
            r7 = r6
            zx.b r7 = (zx.b) r7
            java.lang.Object r6 = r0.f92717a
            io.ktor.websocket.a r6 = (io.ktor.websocket.a) r6
            kotlin.e.n(r9)     // Catch: java.lang.Throwable -> L31 io.ktor.util.cio.ChannelIOException -> L9b java.util.concurrent.CancellationException -> L9d
            goto L7c
        L48:
            kotlin.e.n(r9)
            org.slf4j.Logger r9 = uy.p.a()     // Catch: java.lang.Throwable -> L31 io.ktor.util.cio.ChannelIOException -> L9b java.util.concurrent.CancellationException -> L9d
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L31 io.ktor.util.cio.ChannelIOException -> L9b java.util.concurrent.CancellationException -> L9d
            r2.<init>()     // Catch: java.lang.Throwable -> L31 io.ktor.util.cio.ChannelIOException -> L9b java.util.concurrent.CancellationException -> L9d
            java.lang.String r5 = "Starting websocket session for "
            r2.append(r5)     // Catch: java.lang.Throwable -> L31 io.ktor.util.cio.ChannelIOException -> L9b java.util.concurrent.CancellationException -> L9d
            py.d r5 = r7.f()     // Catch: java.lang.Throwable -> L31 io.ktor.util.cio.ChannelIOException -> L9b java.util.concurrent.CancellationException -> L9d
            java.lang.String r5 = py.e.q(r5)     // Catch: java.lang.Throwable -> L31 io.ktor.util.cio.ChannelIOException -> L9b java.util.concurrent.CancellationException -> L9d
            r2.append(r5)     // Catch: java.lang.Throwable -> L31 io.ktor.util.cio.ChannelIOException -> L9b java.util.concurrent.CancellationException -> L9d
            java.lang.String r2 = r2.toString()     // Catch: java.lang.Throwable -> L31 io.ktor.util.cio.ChannelIOException -> L9b java.util.concurrent.CancellationException -> L9d
            r9.trace(r2)     // Catch: java.lang.Throwable -> L31 io.ktor.util.cio.ChannelIOException -> L9b java.util.concurrent.CancellationException -> L9d
            uy.a r9 = uy.l.g(r6, r7)     // Catch: java.lang.Throwable -> L31 io.ktor.util.cio.ChannelIOException -> L9b java.util.concurrent.CancellationException -> L9d
            r0.f92717a = r6     // Catch: java.lang.Throwable -> L31 io.ktor.util.cio.ChannelIOException -> L9b java.util.concurrent.CancellationException -> L9d
            r0.f92718b = r7     // Catch: java.lang.Throwable -> L31 io.ktor.util.cio.ChannelIOException -> L9b java.util.concurrent.CancellationException -> L9d
            r0.f92720d = r4     // Catch: java.lang.Throwable -> L31 io.ktor.util.cio.ChannelIOException -> L9b java.util.concurrent.CancellationException -> L9d
            java.lang.Object r8 = r8.invoke(r9, r0)     // Catch: java.lang.Throwable -> L31 io.ktor.util.cio.ChannelIOException -> L9b java.util.concurrent.CancellationException -> L9d
            if (r8 != r1) goto L7c
            goto L89
        L7c:
            r0.f92717a = r7     // Catch: java.lang.Throwable -> L31 io.ktor.util.cio.ChannelIOException -> L9b java.util.concurrent.CancellationException -> L9d
            r8 = 0
            r0.f92718b = r8     // Catch: java.lang.Throwable -> L31 io.ktor.util.cio.ChannelIOException -> L9b java.util.concurrent.CancellationException -> L9d
            r0.f92720d = r3     // Catch: java.lang.Throwable -> L31 io.ktor.util.cio.ChannelIOException -> L9b java.util.concurrent.CancellationException -> L9d
            java.lang.Object r6 = io.ktor.websocket.k0.c(r6, r8, r0, r4, r8)     // Catch: java.lang.Throwable -> L31 io.ktor.util.cio.ChannelIOException -> L9b java.util.concurrent.CancellationException -> L9d
            if (r6 != r1) goto L8a
        L89:
            return r1
        L8a:
            yz.g2 r6 = yz.g2.f100423a
            return r6
        L8d:
            zx.a r7 = r7.w0()
            org.slf4j.Logger r7 = zx.j.c(r7)
            java.lang.String r8 = "Websocket handler failed"
            r7.error(r8, r6)
            throw r6
        L9b:
            r6 = move-exception
            throw r6
        L9d:
            r6 = move-exception
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: uy.i.i(io.ktor.websocket.a, zx.b, x00.p, j00.c):java.lang.Object");
    }

    public static final Object j(r0 r0Var, j00.c<? super g2> cVar) {
        d.b bVar = r0Var.getCoroutineContext().get(l2.f7886e0);
        kotlin.jvm.internal.g0.m(bVar);
        Object K0 = ((l2) bVar).K0(cVar);
        return K0 == kotlin.coroutines.intrinsics.b.l() ? K0 : g2.f100423a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0085, code lost:
    
        if (j(r9, r0) != r1) goto L23;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object k(uy.k r9, x00.p<? super uy.a, ? super j00.c<? super yz.g2>, ? extends java.lang.Object> r10, j00.c<? super yz.g2> r11) {
        /*
            boolean r0 = r11 instanceof uy.i.b
            if (r0 == 0) goto L13
            r0 = r11
            uy.i$b r0 = (uy.i.b) r0
            int r1 = r0.f92723c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f92723c = r1
            goto L18
        L13:
            uy.i$b r0 = new uy.i$b
            r0.<init>(r11)
        L18:
            java.lang.Object r11 = r0.f92722b
            java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
            int r2 = r0.f92723c
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3c
            if (r2 == r4) goto L34
            if (r2 != r3) goto L2c
            kotlin.e.n(r11)
            goto L88
        L2c:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L34:
            java.lang.Object r9 = r0.f92721a
            io.ktor.websocket.a r9 = (io.ktor.websocket.a) r9
            kotlin.e.n(r11)
            goto L7c
        L3c:
            kotlin.e.n(r11)
            zx.a r11 = uy.l.a(r9)
            uy.o$a r2 = uy.o.f92753h
            java.lang.Object r11 = zx.q.r(r11, r2)
            uy.o r11 = (uy.o) r11
            long r5 = r11.x0()
            long r7 = r11.a0()
            io.ktor.websocket.a r11 = io.ktor.websocket.c.a(r9, r5, r7)
            zx.b r5 = r9.c()
            xy.b r5 = r5.getAttributes()
            xy.a r2 = r2.c()
            java.lang.Object r2 = r5.g(r2)
            java.util.List r2 = (java.util.List) r2
            r11.N0(r2)
            zx.b r9 = r9.c()
            r0.f92721a = r11
            r0.f92723c = r4
            java.lang.Object r9 = i(r11, r9, r10, r0)
            if (r9 != r1) goto L7b
            goto L87
        L7b:
            r9 = r11
        L7c:
            r10 = 0
            r0.f92721a = r10
            r0.f92723c = r3
            java.lang.Object r9 = j(r9, r0)
            if (r9 != r1) goto L88
        L87:
            return r1
        L88:
            yz.g2 r9 = yz.g2.f100423a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: uy.i.k(uy.k, x00.p, j00.c):java.lang.Object");
    }

    public static final Object l(zx.b bVar, String str, boolean z11, x00.p<? super j0, ? super j00.c<? super g2>, ? extends Object> pVar, j00.c<? super g2> cVar) {
        r rVar;
        m mVar = new m(bVar, str, z11, pVar);
        h10.d d11 = o0.d(m.class);
        try {
            rVar = o0.B(m.class);
        } catch (Throwable unused) {
            rVar = null;
        }
        Object E = bVar.E(mVar, new gz.a(d11, rVar), cVar);
        return E == kotlin.coroutines.intrinsics.b.l() ? E : g2.f100423a;
    }

    public static /* synthetic */ Object m(zx.b bVar, String str, boolean z11, x00.p pVar, j00.c cVar, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = null;
        }
        if ((i11 & 2) != 0) {
            z11 = false;
        }
        return l(bVar, str, z11, pVar, cVar);
    }

    public static final void n(@m80.k g0 g0Var, @m80.k String path, @m80.l String str, @m80.k x00.p<? super uy.a, ? super j00.c<? super g2>, ? extends Object> handler) {
        kotlin.jvm.internal.g0.p(g0Var, "<this>");
        kotlin.jvm.internal.g0.p(path, "path");
        kotlin.jvm.internal.g0.p(handler, "handler");
        t(g0Var, path, str, true, new d(handler, null));
    }

    public static final void o(@m80.k g0 g0Var, @m80.l String str, @m80.k x00.p<? super uy.a, ? super j00.c<? super g2>, ? extends Object> handler) {
        kotlin.jvm.internal.g0.p(g0Var, "<this>");
        kotlin.jvm.internal.g0.p(handler, "handler");
        v(g0Var, str, true, new c(handler, null));
    }

    public static /* synthetic */ void p(g0 g0Var, String str, String str2, x00.p pVar, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            str2 = null;
        }
        n(g0Var, str, str2, pVar);
    }

    public static /* synthetic */ void q(g0 g0Var, String str, x00.p pVar, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = null;
        }
        o(g0Var, str, pVar);
    }

    public static final void r(g0 g0Var, String str, x00.l<? super g0, g2> lVar) {
        if (str == null) {
            lVar.invoke(g0Var);
        } else {
            lVar.invoke(g0Var.d(new j(str)));
        }
    }

    public static final void s(@m80.k g0 g0Var, @m80.k String path, @m80.l String str, @m80.k x00.p<? super k, ? super j00.c<? super g2>, ? extends Object> handler) {
        kotlin.jvm.internal.g0.p(g0Var, "<this>");
        kotlin.jvm.internal.g0.p(path, "path");
        kotlin.jvm.internal.g0.p(handler, "handler");
        t(g0Var, path, str, false, handler);
    }

    public static final void t(@m80.k g0 g0Var, @m80.k String path, @m80.l final String str, final boolean z11, @m80.k final x00.p<? super k, ? super j00.c<? super g2>, ? extends Object> handler) {
        kotlin.jvm.internal.g0.p(g0Var, "<this>");
        kotlin.jvm.internal.g0.p(path, "path");
        kotlin.jvm.internal.g0.p(handler, "handler");
        g0Var.h(o.f92753h);
        RoutingBuilderKt.e0(g0Var, path, e1.f62753b.c(), new x00.l() { // from class: uy.f
            @Override // x00.l
            public final Object invoke(Object obj) {
                g2 A;
                A = i.A(str, z11, handler, (g0) obj);
                return A;
            }
        });
    }

    public static final void u(@m80.k g0 g0Var, @m80.l String str, @m80.k x00.p<? super k, ? super j00.c<? super g2>, ? extends Object> handler) {
        kotlin.jvm.internal.g0.p(g0Var, "<this>");
        kotlin.jvm.internal.g0.p(handler, "handler");
        v(g0Var, str, false, handler);
    }

    public static final void v(@m80.k g0 g0Var, @m80.l final String str, final boolean z11, @m80.k final x00.p<? super k, ? super j00.c<? super g2>, ? extends Object> handler) {
        kotlin.jvm.internal.g0.p(g0Var, "<this>");
        kotlin.jvm.internal.g0.p(handler, "handler");
        g0Var.h(o.f92753h);
        RoutingBuilderKt.D(g0Var, y0.f63006a.v(), "Upgrade", new x00.l() { // from class: uy.e
            @Override // x00.l
            public final Object invoke(Object obj) {
                g2 B;
                B = i.B(str, z11, handler, (g0) obj);
                return B;
            }
        });
    }

    public static /* synthetic */ void w(g0 g0Var, String str, String str2, x00.p pVar, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            str2 = null;
        }
        s(g0Var, str, str2, pVar);
    }

    public static /* synthetic */ void x(g0 g0Var, String str, String str2, boolean z11, x00.p pVar, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            str2 = null;
        }
        if ((i11 & 4) != 0) {
            z11 = false;
        }
        t(g0Var, str, str2, z11, pVar);
    }

    public static /* synthetic */ void y(g0 g0Var, String str, x00.p pVar, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = null;
        }
        u(g0Var, str, pVar);
    }

    public static /* synthetic */ void z(g0 g0Var, String str, boolean z11, x00.p pVar, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = null;
        }
        if ((i11 & 2) != 0) {
            z11 = false;
        }
        v(g0Var, str, z11, pVar);
    }
}
