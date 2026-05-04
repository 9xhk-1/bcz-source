package e40;

import c40.a3;
import c40.b2;
import c40.h1;
import c40.n0;
import c40.r0;
import c40.r2;
import c40.s0;
import kotlin.DeprecationLevel;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.u0;
import kotlinx.coroutines.CoroutineStart;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nBroadcast.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Broadcast.kt\nkotlinx/coroutines/channels/BroadcastKt\n+ 2 CoroutineExceptionHandler.kt\nkotlinx/coroutines/CoroutineExceptionHandlerKt\n*L\n1#1,124:1\n47#2,4:125\n*S KotlinDebug\n*F\n+ 1 Broadcast.kt\nkotlinx/coroutines/channels/BroadcastKt\n*L\n21#1:125,4\n*E\n"})
/* loaded from: classes8.dex */
public final class i {

    /* JADX INFO: Add missing generic type declarations: [E] */
    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "kotlinx.coroutines.channels.BroadcastKt$broadcast$2", f = "Broadcast.kt", i = {0, 1}, l = {26, 27}, m = "invokeSuspend", n = {"$this$broadcast", "$this$broadcast"}, s = {"L$0", "L$0"})
    public static final class b<E> extends SuspendLambda implements x00.p<i0<? super E>, j00.c<? super g2>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public Object f49049a;

        /* renamed from: b, reason: collision with root package name */
        public int f49050b;

        /* renamed from: c, reason: collision with root package name */
        public /* synthetic */ Object f49051c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ k0<E> f49052d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public b(k0<? extends E> k0Var, j00.c<? super b> cVar) {
            super(2, cVar);
            this.f49052d = k0Var;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final j00.c<g2> create(Object obj, j00.c<?> cVar) {
            b bVar = new b(this.f49052d, cVar);
            bVar.f49051c = obj;
            return bVar;
        }

        @Override // x00.p
        public final Object invoke(i0<? super E> i0Var, j00.c<? super g2> cVar) {
            return ((b) create(i0Var, cVar)).invokeSuspend(g2.f100423a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:13:0x0062, code lost:
        
            if (r4.b(r7, r6) == r0) goto L20;
         */
        /* JADX WARN: Removed duplicated region for block: B:12:0x0054  */
        /* JADX WARN: Removed duplicated region for block: B:14:0x0065  */
        /* JADX WARN: Removed duplicated region for block: B:9:0x0049  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:13:0x0062 -> B:6:0x0019). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r7) {
            /*
                r6 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.b.l()
                int r1 = r6.f49050b
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L2f
                if (r1 == r3) goto L23
                if (r1 != r2) goto L1b
                java.lang.Object r1 = r6.f49049a
                e40.q r1 = (e40.q) r1
                java.lang.Object r4 = r6.f49051c
                e40.i0 r4 = (e40.i0) r4
                kotlin.e.n(r7)
            L19:
                r7 = r4
                goto L3c
            L1b:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r7.<init>(r0)
                throw r7
            L23:
                java.lang.Object r1 = r6.f49049a
                e40.q r1 = (e40.q) r1
                java.lang.Object r4 = r6.f49051c
                e40.i0 r4 = (e40.i0) r4
                kotlin.e.n(r7)
                goto L4c
            L2f:
                kotlin.e.n(r7)
                java.lang.Object r7 = r6.f49051c
                e40.i0 r7 = (e40.i0) r7
                e40.k0<E> r1 = r6.f49052d
                e40.q r1 = r1.iterator()
            L3c:
                r6.f49051c = r7
                r6.f49049a = r1
                r6.f49050b = r3
                java.lang.Object r4 = r1.a(r6)
                if (r4 != r0) goto L49
                goto L64
            L49:
                r5 = r4
                r4 = r7
                r7 = r5
            L4c:
                java.lang.Boolean r7 = (java.lang.Boolean) r7
                boolean r7 = r7.booleanValue()
                if (r7 == 0) goto L65
                java.lang.Object r7 = r1.next()
                r6.f49051c = r4
                r6.f49049a = r1
                r6.f49050b = r2
                java.lang.Object r7 = r4.b(r7, r6)
                if (r7 != r0) goto L19
            L64:
                return r0
            L65:
                yz.g2 r7 = yz.g2.f100423a
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: e40.i.b.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @a3
    @yz.n(level = DeprecationLevel.ERROR, message = "BroadcastChannel is deprecated in the favour of SharedFlow and is no longer supported")
    @m80.k
    public static final <E> d<E> b(@m80.k r0 r0Var, @m80.k kotlin.coroutines.d dVar, int i11, @m80.k CoroutineStart coroutineStart, @m80.l x00.l<? super Throwable, g2> lVar, @yz.b @m80.k x00.p<? super i0<? super E>, ? super j00.c<? super g2>, ? extends Object> pVar) {
        kotlin.coroutines.d j11 = c40.k0.j(r0Var, dVar);
        d a11 = f.a(i11);
        g e0Var = coroutineStart.isLazy() ? new e0(j11, a11, pVar) : new g(j11, a11, true);
        if (lVar != null) {
            ((r2) e0Var).z0(lVar);
        }
        ((c40.a) e0Var).d2(coroutineStart, e0Var, pVar);
        return (d<E>) e0Var;
    }

    @a3
    @yz.n(level = DeprecationLevel.ERROR, message = "BroadcastChannel is deprecated in the favour of SharedFlow and is no longer supported")
    @m80.k
    public static final <E> d<E> c(@m80.k final k0<? extends E> k0Var, int i11, @m80.k CoroutineStart coroutineStart) {
        return d(s0.m(s0.m(b2.f7824a, h1.g()), new a(c40.n0.f7891d0)), null, i11, coroutineStart, new x00.l() { // from class: e40.h
            @Override // x00.l
            public final Object invoke(Object obj) {
                g2 f11;
                f11 = i.f(k0.this, (Throwable) obj);
                return f11;
            }
        }, new b(k0Var, null), 1, null);
    }

    public static /* synthetic */ d d(r0 r0Var, kotlin.coroutines.d dVar, int i11, CoroutineStart coroutineStart, x00.l lVar, x00.p pVar, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            dVar = EmptyCoroutineContext.INSTANCE;
        }
        if ((i12 & 2) != 0) {
            i11 = 1;
        }
        if ((i12 & 4) != 0) {
            coroutineStart = CoroutineStart.LAZY;
        }
        if ((i12 & 8) != 0) {
            lVar = null;
        }
        CoroutineStart coroutineStart2 = coroutineStart;
        return b(r0Var, dVar, i11, coroutineStart2, lVar, pVar);
    }

    public static /* synthetic */ d e(k0 k0Var, int i11, CoroutineStart coroutineStart, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i11 = 1;
        }
        if ((i12 & 2) != 0) {
            coroutineStart = CoroutineStart.LAZY;
        }
        return c(k0Var, i11, coroutineStart);
    }

    public static final g2 f(k0 k0Var, Throwable th2) {
        u.b(k0Var, th2);
        return g2.f100423a;
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @u0({"SMAP\nCoroutineExceptionHandler.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CoroutineExceptionHandler.kt\nkotlinx/coroutines/CoroutineExceptionHandlerKt$CoroutineExceptionHandler$1\n+ 2 Broadcast.kt\nkotlinx/coroutines/channels/BroadcastKt\n*L\n1#1,49:1\n21#2:50\n*E\n"})
    public static final class a extends kotlin.coroutines.a implements c40.n0 {
        public a(n0.b bVar) {
            super(bVar);
        }

        @Override // c40.n0
        public void handleException(kotlin.coroutines.d dVar, Throwable th2) {
        }
    }
}
