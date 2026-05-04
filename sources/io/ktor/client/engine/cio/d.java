package io.ktor.client.engine.cio;

import a00.w1;
import c40.b2;
import c40.l2;
import c40.r0;
import io.ktor.client.engine.ProxyType;
import ix.h2;
import ix.i2;
import ix.t2;
import java.net.Proxy;
import java.net.SocketAddress;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import kotlinx.coroutines.CoroutineStart;
import rw.c1;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nCIOEngine.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CIOEngine.kt\nio/ktor/client/engine/cio/CIOEngine\n+ 2 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n*L\n1#1,136:1\n216#2,2:137\n*S KotlinDebug\n*F\n+ 1 CIOEngine.kt\nio/ktor/client/engine/cio/CIOEngine\n*L\n98#1:137,2\n*E\n"})
/* loaded from: classes8.dex */
public final class d extends ow.e {

    /* renamed from: e, reason: collision with root package name */
    @m80.k
    public final e f60851e;

    /* renamed from: f, reason: collision with root package name */
    @m80.k
    public final Set<ow.h<? extends Object>> f60852f;

    /* renamed from: g, reason: collision with root package name */
    @m80.k
    public final zy.d<String, r> f60853g;

    /* renamed from: h, reason: collision with root package name */
    @m80.k
    public final sx.g f60854h;

    /* renamed from: i, reason: collision with root package name */
    @m80.k
    public final i f60855i;

    /* renamed from: j, reason: collision with root package name */
    @m80.k
    public final kotlin.coroutines.d f60856j;

    /* renamed from: k, reason: collision with root package name */
    @m80.k
    public final kotlin.coroutines.d f60857k;

    /* renamed from: l, reason: collision with root package name */
    @m80.l
    public final Proxy f60858l;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "io.ktor.client.engine.cio.CIOEngine$1", f = "CIOEngine.kt", i = {}, l = {67, 70, 70}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements x00.p<r0, j00.c<? super g2>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public Object f60859a;

        /* renamed from: b, reason: collision with root package name */
        public int f60860b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ l2 f60861c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ sx.g f60862d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(l2 l2Var, sx.g gVar, j00.c<? super a> cVar) {
            super(2, cVar);
            this.f60861c = l2Var;
            this.f60862d = gVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final j00.c<g2> create(Object obj, j00.c<?> cVar) {
            return new a(this.f60861c, this.f60862d, cVar);
        }

        @Override // x00.p
        public final Object invoke(r0 r0Var, j00.c<? super g2> cVar) {
            return ((a) create(r0Var, cVar)).invokeSuspend(g2.f100423a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:17:0x0055, code lost:
        
            if (((c40.l2) r6).K0(r5) == r0) goto L26;
         */
        /* JADX WARN: Code restructure failed: missing block: B:18:0x007b, code lost:
        
            return r0;
         */
        /* JADX WARN: Code restructure failed: missing block: B:22:0x0036, code lost:
        
            if (r6.K0(r5) == r0) goto L26;
         */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r6) {
            /*
                r5 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.b.l()
                int r1 = r5.f60860b
                r2 = 3
                r3 = 2
                r4 = 1
                if (r1 == 0) goto L2b
                if (r1 == r4) goto L25
                if (r1 == r3) goto L21
                if (r1 == r2) goto L19
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r0)
                throw r6
            L19:
                java.lang.Object r0 = r5.f60859a
                java.lang.Throwable r0 = (java.lang.Throwable) r0
                kotlin.e.n(r6)
                goto L7d
            L21:
                kotlin.e.n(r6)
                goto L58
            L25:
                kotlin.e.n(r6)     // Catch: java.lang.Throwable -> L29
                goto L39
            L29:
                r6 = move-exception
                goto L5b
            L2b:
                kotlin.e.n(r6)
                c40.l2 r6 = r5.f60861c     // Catch: java.lang.Throwable -> L29
                r5.f60860b = r4     // Catch: java.lang.Throwable -> L29
                java.lang.Object r6 = r6.K0(r5)     // Catch: java.lang.Throwable -> L29
                if (r6 != r0) goto L39
                goto L7b
            L39:
                sx.g r6 = r5.f60862d
                r6.close()
                sx.g r6 = r5.f60862d
                kotlin.coroutines.d r6 = r6.getCoroutineContext()
                c40.l2$b r1 = c40.l2.f7886e0
                kotlin.coroutines.d$b r6 = r6.get(r1)
                kotlin.jvm.internal.g0.m(r6)
                c40.l2 r6 = (c40.l2) r6
                r5.f60860b = r3
                java.lang.Object r6 = r6.K0(r5)
                if (r6 != r0) goto L58
                goto L7b
            L58:
                yz.g2 r6 = yz.g2.f100423a
                return r6
            L5b:
                sx.g r1 = r5.f60862d
                r1.close()
                sx.g r1 = r5.f60862d
                kotlin.coroutines.d r1 = r1.getCoroutineContext()
                c40.l2$b r3 = c40.l2.f7886e0
                kotlin.coroutines.d$b r1 = r1.get(r3)
                kotlin.jvm.internal.g0.m(r1)
                c40.l2 r1 = (c40.l2) r1
                r5.f60859a = r6
                r5.f60860b = r2
                java.lang.Object r1 = r1.K0(r5)
                if (r1 != r0) goto L7c
            L7b:
                return r0
            L7c:
                r0 = r6
            L7d:
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: io.ktor.client.engine.cio.d.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public /* synthetic */ class b {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f60863a;

        static {
            int[] iArr = new int[ProxyType.values().length];
            try {
                iArr[ProxyType.SOCKS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ProxyType.HTTP.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f60863a = iArr;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "io.ktor.client.engine.cio.CIOEngine", f = "CIOEngine.kt", i = {0, 0, 1, 1, 1, 1}, l = {76, 82}, m = "execute", n = {"this", "data", "this", "data", "callContext", "endpoint"}, s = {"L$0", "L$1", "L$0", "L$1", "L$2", "L$3"})
    public static final class c extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public Object f60864a;

        /* renamed from: b, reason: collision with root package name */
        public Object f60865b;

        /* renamed from: c, reason: collision with root package name */
        public Object f60866c;

        /* renamed from: d, reason: collision with root package name */
        public Object f60867d;

        /* renamed from: e, reason: collision with root package name */
        public /* synthetic */ Object f60868e;

        /* renamed from: g, reason: collision with root package name */
        public int f60870g;

        public c(j00.c<? super c> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @m80.l
        public final Object invokeSuspend(@m80.k Object obj) {
            this.f60868e = obj;
            this.f60870g |= Integer.MIN_VALUE;
            return d.this.B0(null, this);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(@m80.k e config) {
        super("ktor-cio");
        Proxy proxy;
        g0.p(config, "config");
        this.f60851e = config;
        this.f60852f = w1.u(c1.f84603a, ax.y.f5554a, ax.b0.f5500a, zw.s.f102985a);
        this.f60853g = new zy.d<>(0, 1, null);
        sx.g a11 = sx.h.a(E8());
        this.f60854h = a11;
        this.f60855i = new i(a11, getConfig().l(), getConfig().j().e());
        Proxy c11 = getConfig().c();
        ProxyType a12 = c11 != null ? ow.q.a(c11) : null;
        int i11 = a12 == null ? -1 : b.f60863a[a12.ordinal()];
        if (i11 == -1 || i11 == 1) {
            proxy = null;
        } else {
            if (i11 != 2) {
                throw new IllegalStateException("CIO engine does not currently support " + a12 + " proxies.");
            }
            proxy = getConfig().c();
        }
        this.f60858l = proxy;
        kotlin.coroutines.d coroutineContext = super.getCoroutineContext();
        l2.b bVar = l2.f7886e0;
        d.b bVar2 = coroutineContext.get(bVar);
        g0.m(bVar2);
        kotlin.coroutines.d a13 = xy.a0.a((l2) bVar2);
        this.f60856j = a13;
        this.f60857k = coroutineContext.plus(a13);
        d.b bVar3 = a13.get(bVar);
        g0.m(bVar3);
        c40.i.d(b2.f7824a, coroutineContext, CoroutineStart.ATOMIC, new a((l2) bVar3, a11, null));
    }

    public static final r Z(h2 h2Var, String str, int i11, Proxy proxy, final d dVar, final String str2) {
        return new r(str, i11, proxy, i2.a(h2Var), dVar.getConfig(), dVar.f60855i, dVar.getCoroutineContext(), new x00.a() { // from class: io.ktor.client.engine.cio.b
            @Override // x00.a
            public final Object invoke() {
                g2 c02;
                c02 = d.c0(d.this, str2);
                return c02;
            }
        });
    }

    public static final g2 c0(d dVar, String str) {
        dVar.f60853g.remove(str);
        return g2.f100423a;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(11:0|1|(2:3|(7:5|6|7|(1:(1:(5:11|12|13|(1:15)|16)(2:19|20))(1:21))(3:31|(1:33)|28)|22|23|(2:25|26)(2:29|30)))|42|6|7|(0)(0)|22|23|(0)(0)|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x008a, code lost:
    
        if (r9 == r1) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00a9, code lost:
    
        r0 = r0;
        r2 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00b1, code lost:
    
        if (c40.n2.D(r6.getCoroutineContext()) == false) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00b3, code lost:
    
        r8.close();
        r0 = r0;
        r2 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x003c, code lost:
    
        r9 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00a3, code lost:
    
        if (c40.n2.D(r6.getCoroutineContext()) == false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00a5, code lost:
    
        r8.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00a8, code lost:
    
        throw r9;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0024  */
    /* JADX WARN: Type inference failed for: r0v11 */
    /* JADX WARN: Type inference failed for: r0v12 */
    /* JADX WARN: Type inference failed for: r0v2, types: [io.ktor.client.engine.cio.d$c, j00.c] */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v8, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v10, types: [kotlin.coroutines.d] */
    /* JADX WARN: Type inference failed for: r2v13 */
    /* JADX WARN: Type inference failed for: r2v14 */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Object, kotlin.coroutines.d] */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r8v0, types: [cx.z, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v1, types: [io.ktor.client.engine.cio.r] */
    /* JADX WARN: Type inference failed for: r8v15 */
    /* JADX WARN: Type inference failed for: r8v16 */
    /* JADX WARN: Type inference failed for: r8v2, types: [io.ktor.client.engine.cio.r] */
    /* JADX WARN: Type inference failed for: r8v7, types: [io.ktor.client.engine.cio.r, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v8, types: [io.ktor.client.engine.cio.r] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:27:0x008a -> B:13:0x008d). Please report as a decompilation issue!!! */
    @Override // ow.a
    @m80.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object B0(@m80.k cx.z r8, @m80.k j00.c<? super cx.f0> r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof io.ktor.client.engine.cio.d.c
            if (r0 == 0) goto L13
            r0 = r9
            io.ktor.client.engine.cio.d$c r0 = (io.ktor.client.engine.cio.d.c) r0
            int r1 = r0.f60870g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f60870g = r1
            goto L18
        L13:
            io.ktor.client.engine.cio.d$c r0 = new io.ktor.client.engine.cio.d$c
            r0.<init>(r9)
        L18:
            java.lang.Object r9 = r0.f60868e
            java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
            int r2 = r0.f60870g
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L52
            if (r2 == r4) goto L46
            if (r2 != r3) goto L3e
            java.lang.Object r8 = r0.f60867d
            io.ktor.client.engine.cio.r r8 = (io.ktor.client.engine.cio.r) r8
            java.lang.Object r2 = r0.f60866c
            kotlin.coroutines.d r2 = (kotlin.coroutines.d) r2
            java.lang.Object r5 = r0.f60865b
            cx.z r5 = (cx.z) r5
            java.lang.Object r6 = r0.f60864a
            io.ktor.client.engine.cio.d r6 = (io.ktor.client.engine.cio.d) r6
            kotlin.e.n(r9)     // Catch: java.lang.Throwable -> L3c kotlinx.coroutines.channels.ClosedSendChannelException -> La9
            goto L8d
        L3c:
            r9 = move-exception
            goto L9b
        L3e:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L46:
            java.lang.Object r8 = r0.f60865b
            cx.z r8 = (cx.z) r8
            java.lang.Object r2 = r0.f60864a
            io.ktor.client.engine.cio.d r2 = (io.ktor.client.engine.cio.d) r2
            kotlin.e.n(r9)
            goto L63
        L52:
            kotlin.e.n(r9)
            r0.f60864a = r7
            r0.f60865b = r8
            r0.f60870g = r4
            java.lang.Object r9 = ow.u.e(r0)
            if (r9 != r1) goto L62
            goto L8c
        L62:
            r2 = r7
        L63:
            kotlin.coroutines.d r9 = (kotlin.coroutines.d) r9
            r5 = r8
            r6 = r2
            r2 = r9
        L68:
            kotlin.coroutines.d r8 = r6.getCoroutineContext()
            boolean r8 = c40.n2.D(r8)
            if (r8 == 0) goto Lb7
            ix.t2 r8 = r5.h()
            java.net.Proxy r9 = r6.f60858l
            io.ktor.client.engine.cio.r r8 = r6.V(r8, r9)
            r0.f60864a = r6     // Catch: java.lang.Throwable -> L3c kotlinx.coroutines.channels.ClosedSendChannelException -> La9
            r0.f60865b = r5     // Catch: java.lang.Throwable -> L3c kotlinx.coroutines.channels.ClosedSendChannelException -> La9
            r0.f60866c = r2     // Catch: java.lang.Throwable -> L3c kotlinx.coroutines.channels.ClosedSendChannelException -> La9
            r0.f60867d = r8     // Catch: java.lang.Throwable -> L3c kotlinx.coroutines.channels.ClosedSendChannelException -> La9
            r0.f60870g = r3     // Catch: java.lang.Throwable -> L3c kotlinx.coroutines.channels.ClosedSendChannelException -> La9
            java.lang.Object r9 = r8.G0(r5, r2, r0)     // Catch: java.lang.Throwable -> L3c kotlinx.coroutines.channels.ClosedSendChannelException -> La9
            if (r9 != r1) goto L8d
        L8c:
            return r1
        L8d:
            kotlin.coroutines.d r0 = r6.getCoroutineContext()
            boolean r0 = c40.n2.D(r0)
            if (r0 != 0) goto L9a
            r8.close()
        L9a:
            return r9
        L9b:
            kotlin.coroutines.d r0 = r6.getCoroutineContext()
            boolean r0 = c40.n2.D(r0)
            if (r0 != 0) goto La8
            r8.close()
        La8:
            throw r9
        La9:
            kotlin.coroutines.d r9 = r6.getCoroutineContext()
            boolean r9 = c40.n2.D(r9)
            if (r9 != 0) goto L68
            r8.close()
            goto L68
        Lb7:
            io.ktor.client.engine.ClientEngineClosedException r8 = new io.ktor.client.engine.ClientEngineClosedException
            r9 = 0
            r8.<init>(r9, r4, r9)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.client.engine.cio.d.B0(cx.z, j00.c):java.lang.Object");
    }

    @Override // ow.e, ow.a
    @m80.k
    public Set<ow.h<? extends Object>> D2() {
        return this.f60852f;
    }

    @Override // ow.a
    @m80.k
    /* renamed from: S, reason: merged with bridge method [inline-methods] */
    public e getConfig() {
        return this.f60851e;
    }

    public final r V(t2 t2Var, final Proxy proxy) {
        String u11;
        int z11;
        final h2 A = t2Var.A();
        if (proxy != null) {
            SocketAddress b11 = ow.q.b(proxy);
            u11 = fz.a.c(b11);
            z11 = fz.a.d(b11);
        } else {
            u11 = t2Var.u();
            z11 = t2Var.z();
        }
        final int i11 = z11;
        final String str = u11;
        final String str2 = str + ':' + i11 + ':' + A;
        return this.f60853g.g(str2, new x00.a() { // from class: io.ktor.client.engine.cio.c
            @Override // x00.a
            public final Object invoke() {
                r Z;
                Z = d.Z(h2.this, str, i11, proxy, this, str2);
                return Z;
            }
        });
    }

    @Override // ow.e, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        super.close();
        Iterator<Map.Entry<String, r>> it = this.f60853g.entrySet().iterator();
        while (it.hasNext()) {
            it.next().getValue().close();
        }
        d.b bVar = this.f60856j.get(l2.f7886e0);
        g0.n(bVar, "null cannot be cast to non-null type kotlinx.coroutines.CompletableJob");
        ((c40.a0) bVar).complete();
    }

    @Override // ow.e, c40.r0
    @m80.k
    public kotlin.coroutines.d getCoroutineContext() {
        return this.f60857k;
    }
}
