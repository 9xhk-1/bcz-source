package ry;

import a00.w1;
import ax.y;
import c40.x;
import e40.k0;
import e40.l0;
import io.ktor.server.testing.TestApplicationEngine;
import io.ktor.server.testing.f0;
import io.ktor.websocket.j0;
import ix.q0;
import java.util.Set;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import mx.v;
import rw.c1;
import x00.r;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nTestHttpClientEngineBridgeJvm.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TestHttpClientEngineBridgeJvm.kt\nio/ktor/server/testing/client/TestHttpClientEngineBridge\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,44:1\n1#2:45\n*E\n"})
/* loaded from: classes8.dex */
public final class o {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final l f86978a;

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public final TestApplicationEngine f86979b;

    /* renamed from: c, reason: collision with root package name */
    @m80.k
    public final Set<ow.h<?>> f86980c;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "io.ktor.server.testing.client.TestHttpClientEngineBridge", f = "TestHttpClientEngineBridgeJvm.kt", i = {0}, l = {32, 41}, m = "runWebSocketRequest", n = {"sessionDeferred"}, s = {"L$0"})
    public static final class a extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public Object f86981a;

        /* renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f86982b;

        /* renamed from: d, reason: collision with root package name */
        public int f86984d;

        public a(j00.c<? super a> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @m80.l
        public final Object invokeSuspend(@m80.k Object obj) {
            this.f86982b = obj;
            this.f86984d |= Integer.MIN_VALUE;
            return o.this.d(null, null, null, null, this);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "io.ktor.server.testing.client.TestHttpClientEngineBridge$runWebSocketRequest$call$2", f = "TestHttpClientEngineBridgeJvm.kt", i = {}, l = {39}, m = "invokeSuspend", n = {}, s = {})
    public static final class b extends SuspendLambda implements r<f0, k0<? extends io.ktor.websocket.d>, l0<? super io.ktor.websocket.d>, j00.c<? super g2>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f86985a;

        /* renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f86986b;

        /* renamed from: c, reason: collision with root package name */
        public /* synthetic */ Object f86987c;

        /* renamed from: e, reason: collision with root package name */
        public final /* synthetic */ kotlin.coroutines.d f86989e;

        /* renamed from: f, reason: collision with root package name */
        public final /* synthetic */ x<j0> f86990f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(kotlin.coroutines.d dVar, x<j0> xVar, j00.c<? super b> cVar) {
            super(4, cVar);
            this.f86989e = dVar;
            this.f86990f = xVar;
        }

        @Override // x00.r
        /* renamed from: i, reason: merged with bridge method [inline-methods] */
        public final Object invoke(f0 f0Var, k0<? extends io.ktor.websocket.d> k0Var, l0<? super io.ktor.websocket.d> l0Var, j00.c<? super g2> cVar) {
            b bVar = o.this.new b(this.f86989e, this.f86990f, cVar);
            bVar.f86986b = k0Var;
            bVar.f86987c = l0Var;
            return bVar.invokeSuspend(g2.f100423a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object l11 = kotlin.coroutines.intrinsics.b.l();
            int i11 = this.f86985a;
            if (i11 == 0) {
                kotlin.e.n(obj);
                h hVar = new h(o.this.f86979b.getCoroutineContext().plus(this.f86989e), (k0) this.f86986b, (l0) this.f86987c);
                this.f86990f.c0(hVar);
                this.f86986b = null;
                this.f86985a = 1;
                if (hVar.b(this) == l11) {
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

    public o(@m80.k l engine, @m80.k TestApplicationEngine app2) {
        g0.p(engine, "engine");
        g0.p(app2, "app");
        this.f86978a = engine;
        this.f86979b = app2;
        this.f86980c = w1.u(y.f5554a, c1.f84603a);
    }

    public static final g2 e(o oVar, q0 q0Var, v vVar, io.ktor.server.testing.u0 handleWebSocketConversation) {
        g0.p(handleWebSocketConversation, "$this$handleWebSocketConversation");
        oVar.f86978a.Z(handleWebSocketConversation, q0Var, vVar);
        return g2.f100423a;
    }

    @m80.k
    public final Set<ow.h<?>> c() {
        return this.f86980c;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0026  */
    @m80.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(@m80.k java.lang.String r10, @m80.k final ix.q0 r11, @m80.k final mx.v r12, @m80.k kotlin.coroutines.d r13, @m80.k j00.c<? super kotlin.Pair<io.ktor.server.testing.f0, ? extends io.ktor.websocket.j0>> r14) {
        /*
            r9 = this;
            boolean r0 = r14 instanceof ry.o.a
            if (r0 == 0) goto L14
            r0 = r14
            ry.o$a r0 = (ry.o.a) r0
            int r1 = r0.f86984d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L14
            int r1 = r1 - r2
            r0.f86984d = r1
        L12:
            r6 = r0
            goto L1a
        L14:
            ry.o$a r0 = new ry.o$a
            r0.<init>(r14)
            goto L12
        L1a:
            java.lang.Object r14 = r6.f86982b
            java.lang.Object r0 = kotlin.coroutines.intrinsics.b.l()
            int r1 = r6.f86984d
            r7 = 2
            r2 = 1
            if (r1 == 0) goto L42
            if (r1 == r2) goto L3a
            if (r1 != r7) goto L32
            java.lang.Object r10 = r6.f86981a
            io.ktor.server.testing.f0 r10 = (io.ktor.server.testing.f0) r10
            kotlin.e.n(r14)
            goto L73
        L32:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L3a:
            java.lang.Object r10 = r6.f86981a
            c40.x r10 = (c40.x) r10
            kotlin.e.n(r14)
            goto L64
        L42:
            kotlin.e.n(r14)
            r14 = 0
            c40.x r8 = c40.z.c(r14, r2, r14)
            io.ktor.server.testing.TestApplicationEngine r1 = r9.f86979b
            ry.n r3 = new ry.n
            r3.<init>()
            ry.o$b r5 = new ry.o$b
            r5.<init>(r13, r8, r14)
            r6.f86981a = r8
            r6.f86984d = r2
            r4 = 0
            r2 = r10
            java.lang.Object r14 = io.ktor.server.testing.TestApplicationEngineJvmKt.d(r1, r2, r3, r4, r5, r6)
            if (r14 != r0) goto L63
            goto L71
        L63:
            r10 = r8
        L64:
            r11 = r14
            io.ktor.server.testing.f0 r11 = (io.ktor.server.testing.f0) r11
            r6.f86981a = r11
            r6.f86984d = r7
            java.lang.Object r14 = r10.i(r6)
            if (r14 != r0) goto L72
        L71:
            return r0
        L72:
            r10 = r11
        L73:
            kotlin.Pair r10 = yz.h1.a(r10, r14)
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: ry.o.d(java.lang.String, ix.q0, mx.v, kotlin.coroutines.d, j00.c):java.lang.Object");
    }
}
