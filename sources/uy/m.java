package uy;

import a00.h0;
import c40.l2;
import c40.q0;
import c40.r0;
import io.ktor.websocket.c0;
import io.ktor.websocket.d0;
import io.ktor.websocket.j0;
import io.ktor.websocket.z;
import ix.q0;
import ix.y0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import mx.v;
import uy.o;
import yz.g2;
import zx.q;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nWebSocketUpgrade.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WebSocketUpgrade.kt\nio/ktor/server/websocket/WebSocketUpgrade\n+ 2 Headers.kt\nio/ktor/http/Headers$Companion\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,138:1\n23#2:139\n1#3:140\n1863#4,2:141\n*S KotlinDebug\n*F\n+ 1 WebSocketUpgrade.kt\nio/ktor/server/websocket/WebSocketUpgrade\n*L\n66#1:139\n119#1:141,2\n*E\n"})
/* loaded from: classes8.dex */
public final class m extends v.d {

    /* renamed from: i, reason: collision with root package name */
    @m80.k
    public static final a f92740i = new a(null);

    /* renamed from: j, reason: collision with root package name */
    @m80.k
    public static final q0 f92741j = new q0("raw-ws-handler");

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public final zx.b f92742b;

    /* renamed from: c, reason: collision with root package name */
    @m80.l
    public final String f92743c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f92744d;

    /* renamed from: e, reason: collision with root package name */
    @m80.k
    public final x00.p<j0, j00.c<? super g2>, Object> f92745e;

    /* renamed from: f, reason: collision with root package name */
    @m80.l
    public final String f92746f;

    /* renamed from: g, reason: collision with root package name */
    @m80.k
    public final o f92747g;

    /* renamed from: h, reason: collision with root package name */
    @m80.k
    public final ix.q0 f92748h;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.v vVar) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "io.ktor.server.websocket.WebSocketUpgrade$upgrade$2", f = "WebSocketUpgrade.kt", i = {}, l = {97, 98}, m = "invokeSuspend", n = {}, s = {})
    public static final class b extends SuspendLambda implements x00.p<r0, j00.c<? super g2>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f92749a;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ j0 f92751c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(j0 j0Var, j00.c<? super b> cVar) {
            super(2, cVar);
            this.f92751c = j0Var;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final j00.c<g2> create(Object obj, j00.c<?> cVar) {
            return m.this.new b(this.f92751c, cVar);
        }

        @Override // x00.p
        public final Object invoke(r0 r0Var, j00.c<? super g2> cVar) {
            return ((b) create(r0Var, cVar)).invokeSuspend(g2.f100423a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:15:0x003d, code lost:
        
            if (r6.g(r5) == r0) goto L20;
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
                int r1 = r5.f92749a
                r2 = 2
                r3 = 1
                r4 = 0
                if (r1 == 0) goto L21
                if (r1 == r3) goto L1d
                if (r1 != r2) goto L15
                kotlin.e.n(r6)     // Catch: java.lang.Throwable -> L13
                goto L40
            L13:
                r6 = move-exception
                goto L46
            L15:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r0)
                throw r6
            L1d:
                kotlin.e.n(r6)     // Catch: java.lang.Throwable -> L13
                goto L35
            L21:
                kotlin.e.n(r6)
                uy.m r6 = uy.m.this     // Catch: java.lang.Throwable -> L13
                x00.p r6 = r6.n()     // Catch: java.lang.Throwable -> L13
                io.ktor.websocket.j0 r1 = r5.f92751c     // Catch: java.lang.Throwable -> L13
                r5.f92749a = r3     // Catch: java.lang.Throwable -> L13
                java.lang.Object r6 = r6.invoke(r1, r5)     // Catch: java.lang.Throwable -> L13
                if (r6 != r0) goto L35
                goto L3f
            L35:
                io.ktor.websocket.j0 r6 = r5.f92751c     // Catch: java.lang.Throwable -> L13
                r5.f92749a = r2     // Catch: java.lang.Throwable -> L13
                java.lang.Object r6 = r6.g(r5)     // Catch: java.lang.Throwable -> L13
                if (r6 != r0) goto L40
            L3f:
                return r0
            L40:
                io.ktor.websocket.j0 r6 = r5.f92751c
                c40.s0.f(r6, r4, r3, r4)
                goto L4e
            L46:
                io.ktor.websocket.j0 r0 = r5.f92751c     // Catch: java.lang.Throwable -> L51
                java.lang.String r1 = "WebSocket is cancelled"
                c40.s0.c(r0, r1, r6)     // Catch: java.lang.Throwable -> L51
                goto L40
            L4e:
                yz.g2 r6 = yz.g2.f100423a
                return r6
            L51:
                r6 = move-exception
                io.ktor.websocket.j0 r0 = r5.f92751c
                c40.s0.f(r0, r4, r3, r4)
                throw r6
            */
            throw new UnsupportedOperationException("Method not decompiled: uy.m.b.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public /* synthetic */ m(zx.b bVar, String str, boolean z11, x00.p pVar, int i11, kotlin.jvm.internal.v vVar) {
        this(bVar, (i11 & 2) != 0 ? null : str, (i11 & 4) != 0 ? false : z11, pVar);
    }

    @m80.k
    public final zx.b c() {
        return this.f92742b;
    }

    @Override // mx.v
    @m80.k
    public ix.q0 d() {
        return this.f92748h;
    }

    @Override // mx.v.d
    @m80.l
    public Object m(@m80.k io.ktor.utils.io.g gVar, @m80.k io.ktor.utils.io.m mVar, @m80.k kotlin.coroutines.d dVar, @m80.k kotlin.coroutines.d dVar2, @m80.k j00.c<? super l2> cVar) {
        long d02 = this.f92747g.d0();
        boolean Q0 = this.f92747g.Q0();
        kotlin.coroutines.d context = cVar.getContext();
        l2.b bVar = l2.f7886e0;
        kotlin.coroutines.d dVar3 = (l2) context.get(bVar);
        if (dVar3 == null) {
            dVar3 = EmptyCoroutineContext.INSTANCE;
        }
        j0 a11 = io.ktor.websocket.m.a(gVar, mVar, d02, Q0, dVar.plus(dVar3));
        c40.k.f(a11, f92741j, null, new b(a11, null), 2, null);
        d.b bVar2 = a11.getCoroutineContext().get(bVar);
        g0.m(bVar2);
        return bVar2;
    }

    @m80.k
    public final x00.p<j0, j00.c<? super g2>, Object> n() {
        return this.f92745e;
    }

    @m80.l
    public final String o() {
        return this.f92743c;
    }

    public final List<z<?>> p(ix.r0 r0Var) {
        List<c0> J;
        if (!this.f92744d) {
            return h0.J();
        }
        String r11 = py.e.r(this.f92742b.f(), y0.f63006a.w0());
        if (r11 == null || (J = d0.a(r11)) == null) {
            J = h0.J();
        }
        List<z<?>> c11 = this.f92747g.h().c();
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        Iterator<T> it = c11.iterator();
        while (it.hasNext()) {
            z zVar = (z) it.next();
            List<c0> e11 = zVar.e(J);
            if (!e11.isEmpty()) {
                arrayList2.add(zVar);
                arrayList.addAll(e11);
            }
        }
        if (!arrayList.isEmpty()) {
            r0Var.k(y0.f63006a.w0(), a00.r0.r3(arrayList, com.alipay.sdk.m.u.i.f11097b, null, null, 0, null, null, 62, null));
        }
        return arrayList2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public m(@m80.k zx.b call, @m80.l String str, boolean z11, @m80.k x00.p<? super j0, ? super j00.c<? super g2>, ? extends Object> handle) {
        g0.p(call, "call");
        g0.p(handle, "handle");
        this.f92742b = call;
        this.f92743c = str;
        this.f92744d = z11;
        this.f92745e = handle;
        py.d f11 = call.f();
        y0 y0Var = y0.f63006a;
        String r11 = py.e.r(f11, y0Var.x0());
        this.f92746f = r11;
        zx.a w02 = call.w0();
        o.a aVar = o.f92753h;
        this.f92747g = (o) q.r(w02, aVar);
        q0.a aVar2 = ix.q0.f62976a;
        ix.r0 r0Var = new ix.r0(0, 1, null);
        r0Var.k(y0Var.K0(), "websocket");
        r0Var.k(y0Var.v(), "Upgrade");
        if (r11 != null) {
            r0Var.k(y0Var.v0(), qx.a.a(r11));
        }
        if (str != null) {
            r0Var.k(y0Var.y0(), str);
        }
        call.getAttributes().e(aVar.c(), p(r0Var));
        this.f92748h = r0Var.build();
    }

    public /* synthetic */ m(zx.b bVar, String str, x00.p pVar, int i11, kotlin.jvm.internal.v vVar) {
        this(bVar, (i11 & 2) != 0 ? null : str, pVar);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public m(@m80.k zx.b call, @m80.l String str, @m80.k x00.p<? super j0, ? super j00.c<? super g2>, ? extends Object> handle) {
        this(call, str, false, handle);
        g0.p(call, "call");
        g0.p(handle, "handle");
    }
}
