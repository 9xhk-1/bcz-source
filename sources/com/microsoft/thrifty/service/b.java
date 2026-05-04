package com.microsoft.thrifty.service;

import c40.l3;
import c40.q0;
import c40.r0;
import c40.s0;
import com.microsoft.thrifty.service.a;
import j00.c;
import java.io.Closeable;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.g0;
import l00.d;
import m80.k;
import m80.l;
import n40.g;
import ws.i;
import x00.p;
import xs.e;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public abstract class b extends ClientBase implements Closeable {

    @k
    private final n40.a lock;

    @k
    private final r0 scope;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @d(c = "com.microsoft.thrifty.service.AsyncClientCoroutine$enqueue$1", f = "AsyncClientCoroutine.kt", i = {}, l = {23, 28}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements p<r0, c<? super g2>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f40025a;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ xs.d<?> f40027c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(xs.d<?> dVar, c<? super a> cVar) {
            super(2, cVar);
            this.f40027c = dVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @k
        public final c<g2> create(@l Object obj, @k c<?> cVar) {
            return b.this.new a(this.f40027c, cVar);
        }

        @Override // x00.p
        @l
        public final Object invoke(@k r0 r0Var, @l c<? super g2> cVar) {
            return ((a) create(r0Var, cVar)).invokeSuspend(g2.f100423a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:19:0x0043, code lost:
        
            if (r6 == r0) goto L24;
         */
        /* JADX WARN: Code restructure failed: missing block: B:20:0x0045, code lost:
        
            return r0;
         */
        /* JADX WARN: Code restructure failed: missing block: B:22:0x0036, code lost:
        
            if (n40.a.C0899a.b(r6, null, r5, 1, null) == r0) goto L24;
         */
        /* JADX WARN: Removed duplicated region for block: B:13:0x005c A[Catch: all -> 0x0050, TRY_LEAVE, TryCatch #0 {all -> 0x0050, blocks: (B:9:0x0054, B:13:0x005c, B:28:0x004b, B:6:0x000f, B:18:0x0039), top: B:2:0x0009, inners: #4, #3 }] */
        /* JADX WARN: Removed duplicated region for block: B:9:0x0054 A[Catch: all -> 0x0050, TryCatch #0 {all -> 0x0050, blocks: (B:9:0x0054, B:13:0x005c, B:28:0x004b, B:6:0x000f, B:18:0x0039), top: B:2:0x0009, inners: #4, #3 }] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @m80.l
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(@m80.k java.lang.Object r6) {
            /*
                r5 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.b.l()
                int r1 = r5.f40025a
                r2 = 2
                r3 = 1
                r4 = 0
                if (r1 == 0) goto L27
                if (r1 == r3) goto L23
                if (r1 != r2) goto L1b
                kotlin.e.n(r6)     // Catch: java.lang.Throwable -> L13 com.microsoft.thrifty.service.ClientBase.ServerException -> L15 java.lang.RuntimeException -> L17 java.io.IOException -> L19
                goto L46
            L13:
                r6 = move-exception
                goto L49
            L15:
                r6 = move-exception
                goto L4b
            L17:
                r6 = move-exception
                goto L49
            L19:
                r6 = move-exception
                goto L49
            L1b:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r0)
                throw r6
            L23:
                kotlin.e.n(r6)
                goto L39
            L27:
                kotlin.e.n(r6)
                com.microsoft.thrifty.service.b r6 = com.microsoft.thrifty.service.b.this
                n40.a r6 = com.microsoft.thrifty.service.b.access$getLock$p(r6)
                r5.f40025a = r3
                java.lang.Object r6 = n40.a.C0899a.b(r6, r4, r5, r3, r4)
                if (r6 != r0) goto L39
                goto L45
            L39:
                com.microsoft.thrifty.service.b r6 = com.microsoft.thrifty.service.b.this     // Catch: java.lang.Throwable -> L13 com.microsoft.thrifty.service.ClientBase.ServerException -> L15 java.lang.RuntimeException -> L17 java.io.IOException -> L19
                xs.d<?> r1 = r5.f40027c     // Catch: java.lang.Throwable -> L13 com.microsoft.thrifty.service.ClientBase.ServerException -> L15 java.lang.RuntimeException -> L17 java.io.IOException -> L19
                r5.f40025a = r2     // Catch: java.lang.Throwable -> L13 com.microsoft.thrifty.service.ClientBase.ServerException -> L15 java.lang.RuntimeException -> L17 java.io.IOException -> L19
                java.lang.Object r6 = r6.invokeRequestSuspend(r1, r5)     // Catch: java.lang.Throwable -> L13 com.microsoft.thrifty.service.ClientBase.ServerException -> L15 java.lang.RuntimeException -> L17 java.io.IOException -> L19
                if (r6 != r0) goto L46
            L45:
                return r0
            L46:
                r0 = r6
                r6 = r4
                goto L52
            L49:
                r0 = r4
                goto L52
            L4b:
                com.microsoft.thrifty.ThriftException r6 = r6.getThriftException()     // Catch: java.lang.Throwable -> L50
                goto L49
            L50:
                r6 = move-exception
                goto L6f
            L52:
                if (r6 == 0) goto L5c
                com.microsoft.thrifty.service.b r0 = com.microsoft.thrifty.service.b.this     // Catch: java.lang.Throwable -> L50
                xs.d<?> r1 = r5.f40027c     // Catch: java.lang.Throwable -> L50
                com.microsoft.thrifty.service.b.access$fail(r0, r1, r6)     // Catch: java.lang.Throwable -> L50
                goto L63
            L5c:
                com.microsoft.thrifty.service.b r6 = com.microsoft.thrifty.service.b.this     // Catch: java.lang.Throwable -> L50
                xs.d<?> r1 = r5.f40027c     // Catch: java.lang.Throwable -> L50
                com.microsoft.thrifty.service.b.access$complete(r6, r1, r0)     // Catch: java.lang.Throwable -> L50
            L63:
                com.microsoft.thrifty.service.b r6 = com.microsoft.thrifty.service.b.this
                n40.a r6 = com.microsoft.thrifty.service.b.access$getLock$p(r6)
                n40.a.C0899a.d(r6, r4, r3, r4)
                yz.g2 r6 = yz.g2.f100423a
                return r6
            L6f:
                com.microsoft.thrifty.service.b r0 = com.microsoft.thrifty.service.b.this
                n40.a r0 = com.microsoft.thrifty.service.b.access$getLock$p(r0)
                n40.a.C0899a.d(r0, r4, r3, r4)
                throw r6
            */
            throw new UnsupportedOperationException("Method not decompiled: com.microsoft.thrifty.service.b.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(@k i protocol, @k a.InterfaceC0480a listener) {
        super(protocol);
        g0.p(protocol, "protocol");
        g0.p(listener, "listener");
        this.scope = s0.a(new q0("AsyncClientCoroutine").plus(us.b.a()).plus(l3.c(null, 1, null)));
        this.lock = g.b(false, 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void V8(xs.d<?> dVar, Object obj) {
        e<?> eVar = dVar.callback;
        g0.n(eVar, "null cannot be cast to non-null type com.microsoft.thrifty.service.ServiceMethodCallback<kotlin.Any?>");
        eVar.onSuccess(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void W8(xs.d<?> dVar, Throwable th2) {
        e<?> eVar = dVar.callback;
        g0.m(eVar);
        eVar.onError(th2);
    }

    public final void enqueue(@k xs.d<?> call) {
        g0.p(call, "call");
        c40.k.f(this.scope, null, null, new a(call, null), 3, null);
    }
}
