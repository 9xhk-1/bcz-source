package e40;

import c40.r0;
import c40.y1;
import kotlin.Result;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.u0;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.channels.BufferOverflow;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nProduce.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Produce.kt\nkotlinx/coroutines/channels/ProduceKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 CancellableContinuation.kt\nkotlinx/coroutines/CancellableContinuationKt\n*L\n1#1,300:1\n1#2:301\n426#3,11:302\n*S KotlinDebug\n*F\n+ 1 Produce.kt\nkotlinx/coroutines/channels/ProduceKt\n*L\n63#1:302,11\n*E\n"})
/* loaded from: classes8.dex */
public final class g0 {

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "kotlinx.coroutines.channels.ProduceKt", f = "Produce.kt", i = {0, 0}, l = {302}, m = "awaitClose", n = {"$this$awaitClose", "block"}, s = {"L$0", "L$1"})
    public static final class a extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public Object f49043a;

        /* renamed from: b, reason: collision with root package name */
        public Object f49044b;

        /* renamed from: c, reason: collision with root package name */
        public /* synthetic */ Object f49045c;

        /* renamed from: d, reason: collision with root package name */
        public int f49046d;

        public a(j00.c<? super a> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @m80.l
        public final Object invokeSuspend(@m80.k Object obj) {
            this.f49045c = obj;
            this.f49046d |= Integer.MIN_VALUE;
            return g0.b(null, null, this);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class b implements x00.l<Throwable, g2> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ c40.n<g2> f49047a;

        /* JADX WARN: Multi-variable type inference failed */
        public b(c40.n<? super g2> nVar) {
            this.f49047a = nVar;
        }

        public final void a(Throwable th2) {
            c40.n<g2> nVar = this.f49047a;
            Result.a aVar = Result.Companion;
            nVar.resumeWith(Result.m6308constructorimpl(g2.f100423a));
        }

        @Override // x00.l
        public /* bridge */ /* synthetic */ g2 invoke(Throwable th2) {
            a(th2);
            return g2.f100423a;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    @m80.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object b(@m80.k e40.i0<?> r4, @m80.k x00.a<yz.g2> r5, @m80.k j00.c<? super yz.g2> r6) {
        /*
            boolean r0 = r6 instanceof e40.g0.a
            if (r0 == 0) goto L13
            r0 = r6
            e40.g0$a r0 = (e40.g0.a) r0
            int r1 = r0.f49046d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f49046d = r1
            goto L18
        L13:
            e40.g0$a r0 = new e40.g0$a
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f49045c
            java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
            int r2 = r0.f49046d
            r3 = 1
            if (r2 == 0) goto L3c
            if (r2 != r3) goto L34
            java.lang.Object r4 = r0.f49044b
            r5 = r4
            x00.a r5 = (x00.a) r5
            java.lang.Object r4 = r0.f49043a
            e40.i0 r4 = (e40.i0) r4
            kotlin.e.n(r6)     // Catch: java.lang.Throwable -> L32
            goto L75
        L32:
            r4 = move-exception
            goto L7b
        L34:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L3c:
            kotlin.e.n(r6)
            kotlin.coroutines.d r6 = r0.getContext()
            c40.l2$b r2 = c40.l2.f7886e0
            kotlin.coroutines.d$b r6 = r6.get(r2)
            if (r6 != r4) goto L7f
            r0.f49043a = r4     // Catch: java.lang.Throwable -> L32
            r0.f49044b = r5     // Catch: java.lang.Throwable -> L32
            r0.f49046d = r3     // Catch: java.lang.Throwable -> L32
            c40.p r6 = new c40.p     // Catch: java.lang.Throwable -> L32
            j00.c r2 = kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.e(r0)     // Catch: java.lang.Throwable -> L32
            r6.<init>(r2, r3)     // Catch: java.lang.Throwable -> L32
            r6.y()     // Catch: java.lang.Throwable -> L32
            e40.g0$b r2 = new e40.g0$b     // Catch: java.lang.Throwable -> L32
            r2.<init>(r6)     // Catch: java.lang.Throwable -> L32
            r4.u(r2)     // Catch: java.lang.Throwable -> L32
            java.lang.Object r4 = r6.F()     // Catch: java.lang.Throwable -> L32
            java.lang.Object r6 = kotlin.coroutines.intrinsics.b.l()     // Catch: java.lang.Throwable -> L32
            if (r4 != r6) goto L72
            l00.f.c(r0)     // Catch: java.lang.Throwable -> L32
        L72:
            if (r4 != r1) goto L75
            return r1
        L75:
            r5.invoke()
            yz.g2 r4 = yz.g2.f100423a
            return r4
        L7b:
            r5.invoke()
            throw r4
        L7f:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "awaitClose() can only be invoked from the producer context"
            r4.<init>(r5)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: e40.g0.b(e40.i0, x00.a, j00.c):java.lang.Object");
    }

    public static /* synthetic */ Object c(i0 i0Var, x00.a aVar, j00.c cVar, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            aVar = new x00.a() { // from class: e40.f0
                @Override // x00.a
                public final Object invoke() {
                    g2 d11;
                    d11 = g0.d();
                    return d11;
                }
            };
        }
        return b(i0Var, aVar, cVar);
    }

    public static final g2 d() {
        return g2.f100423a;
    }

    @c40.g2
    @m80.k
    public static final <E> k0<E> e(@m80.k r0 r0Var, @m80.k kotlin.coroutines.d dVar, int i11, @m80.k CoroutineStart coroutineStart, @m80.l x00.l<? super Throwable, g2> lVar, @yz.b @m80.k x00.p<? super i0<? super E>, ? super j00.c<? super g2>, ? extends Object> pVar) {
        return f(r0Var, dVar, i11, BufferOverflow.SUSPEND, coroutineStart, lVar, pVar);
    }

    @m80.k
    public static final <E> k0<E> f(@m80.k r0 r0Var, @m80.k kotlin.coroutines.d dVar, int i11, @m80.k BufferOverflow bufferOverflow, @m80.k CoroutineStart coroutineStart, @m80.l x00.l<? super Throwable, g2> lVar, @yz.b @m80.k x00.p<? super i0<? super E>, ? super j00.c<? super g2>, ? extends Object> pVar) {
        h0 h0Var = new h0(c40.k0.j(r0Var, dVar), r.d(i11, bufferOverflow, null, 4, null));
        if (lVar != null) {
            h0Var.z0(lVar);
        }
        h0Var.d2(coroutineStart, h0Var, pVar);
        return h0Var;
    }

    @y1
    @m80.k
    public static final <E> k0<E> g(@m80.k r0 r0Var, @m80.k kotlin.coroutines.d dVar, int i11, @yz.b @m80.k x00.p<? super i0<? super E>, ? super j00.c<? super g2>, ? extends Object> pVar) {
        return f(r0Var, dVar, i11, BufferOverflow.SUSPEND, CoroutineStart.DEFAULT, null, pVar);
    }

    public static /* synthetic */ k0 h(r0 r0Var, kotlin.coroutines.d dVar, int i11, CoroutineStart coroutineStart, x00.l lVar, x00.p pVar, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            dVar = EmptyCoroutineContext.INSTANCE;
        }
        if ((i12 & 2) != 0) {
            i11 = 0;
        }
        if ((i12 & 4) != 0) {
            coroutineStart = CoroutineStart.DEFAULT;
        }
        if ((i12 & 8) != 0) {
            lVar = null;
        }
        CoroutineStart coroutineStart2 = coroutineStart;
        return e(r0Var, dVar, i11, coroutineStart2, lVar, pVar);
    }

    public static /* synthetic */ k0 i(r0 r0Var, kotlin.coroutines.d dVar, int i11, BufferOverflow bufferOverflow, CoroutineStart coroutineStart, x00.l lVar, x00.p pVar, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            dVar = EmptyCoroutineContext.INSTANCE;
        }
        if ((i12 & 2) != 0) {
            i11 = 0;
        }
        if ((i12 & 4) != 0) {
            bufferOverflow = BufferOverflow.SUSPEND;
        }
        if ((i12 & 8) != 0) {
            coroutineStart = CoroutineStart.DEFAULT;
        }
        if ((i12 & 16) != 0) {
            lVar = null;
        }
        x00.l lVar2 = lVar;
        return f(r0Var, dVar, i11, bufferOverflow, coroutineStart, lVar2, pVar);
    }

    public static /* synthetic */ k0 j(r0 r0Var, kotlin.coroutines.d dVar, int i11, x00.p pVar, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            dVar = EmptyCoroutineContext.INSTANCE;
        }
        if ((i12 & 2) != 0) {
            i11 = 0;
        }
        return g(r0Var, dVar, i11, pVar);
    }
}
