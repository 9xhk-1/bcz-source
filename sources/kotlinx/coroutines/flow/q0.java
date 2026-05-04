package kotlinx.coroutines.flow;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.u0;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nShare.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Share.kt\nkotlinx/coroutines/flow/SubscribedFlowCollector\n+ 2 CoroutineScope.kt\nkotlinx/coroutines/CoroutineScopeKt\n*L\n1#1,429:1\n375#2:430\n*S KotlinDebug\n*F\n+ 1 Share.kt\nkotlinx/coroutines/flow/SubscribedFlowCollector\n*L\n420#1:430\n*E\n"})
/* loaded from: classes8.dex */
public final class q0<T> implements j<T> {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final j<T> f68352a;

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public final x00.p<j<? super T>, j00.c<? super g2>, Object> f68353b;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "kotlinx.coroutines.flow.SubscribedFlowCollector", f = "Share.kt", i = {0, 0}, l = {422, 426}, m = "onSubscription", n = {"this", "safeCollector"}, s = {"L$0", "L$1"})
    public static final class a extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public Object f68354a;

        /* renamed from: b, reason: collision with root package name */
        public Object f68355b;

        /* renamed from: c, reason: collision with root package name */
        public /* synthetic */ Object f68356c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ q0<T> f68357d;

        /* renamed from: e, reason: collision with root package name */
        public int f68358e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(q0<T> q0Var, j00.c<? super a> cVar) {
            super(cVar);
            this.f68357d = q0Var;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @m80.l
        public final Object invokeSuspend(@m80.k Object obj) {
            this.f68356c = obj;
            this.f68358e |= Integer.MIN_VALUE;
            return this.f68357d.a(this);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public q0(@m80.k j<? super T> jVar, @m80.k x00.p<? super j<? super T>, ? super j00.c<? super g2>, ? extends Object> pVar) {
        this.f68352a = jVar;
        this.f68353b = pVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0076, code lost:
    
        if (((kotlinx.coroutines.flow.q0) r7).a(r0) == r1) goto L29;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0024  */
    /* JADX WARN: Type inference failed for: r2v0, types: [int] */
    /* JADX WARN: Type inference failed for: r2v1, types: [kotlinx.coroutines.flow.internal.SafeCollector] */
    /* JADX WARN: Type inference failed for: r2v4, types: [boolean] */
    @m80.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(@m80.k j00.c<? super yz.g2> r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof kotlinx.coroutines.flow.q0.a
            if (r0 == 0) goto L13
            r0 = r7
            kotlinx.coroutines.flow.q0$a r0 = (kotlinx.coroutines.flow.q0.a) r0
            int r1 = r0.f68358e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f68358e = r1
            goto L18
        L13:
            kotlinx.coroutines.flow.q0$a r0 = new kotlinx.coroutines.flow.q0$a
            r0.<init>(r6, r7)
        L18:
            java.lang.Object r7 = r0.f68356c
            java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
            int r2 = r0.f68358e
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L42
            if (r2 == r4) goto L34
            if (r2 != r3) goto L2c
            kotlin.e.n(r7)
            goto L79
        L2c:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L34:
            java.lang.Object r2 = r0.f68355b
            kotlinx.coroutines.flow.internal.SafeCollector r2 = (kotlinx.coroutines.flow.internal.SafeCollector) r2
            java.lang.Object r4 = r0.f68354a
            kotlinx.coroutines.flow.q0 r4 = (kotlinx.coroutines.flow.q0) r4
            kotlin.e.n(r7)     // Catch: java.lang.Throwable -> L40
            goto L60
        L40:
            r7 = move-exception
            goto L7f
        L42:
            kotlin.e.n(r7)
            kotlinx.coroutines.flow.internal.SafeCollector r2 = new kotlinx.coroutines.flow.internal.SafeCollector
            kotlinx.coroutines.flow.j<T> r7 = r6.f68352a
            kotlin.coroutines.d r5 = r0.getContext()
            r2.<init>(r7, r5)
            x00.p<kotlinx.coroutines.flow.j<? super T>, j00.c<? super yz.g2>, java.lang.Object> r7 = r6.f68353b     // Catch: java.lang.Throwable -> L40
            r0.f68354a = r6     // Catch: java.lang.Throwable -> L40
            r0.f68355b = r2     // Catch: java.lang.Throwable -> L40
            r0.f68358e = r4     // Catch: java.lang.Throwable -> L40
            java.lang.Object r7 = r7.invoke(r2, r0)     // Catch: java.lang.Throwable -> L40
            if (r7 != r1) goto L5f
            goto L78
        L5f:
            r4 = r6
        L60:
            r2.releaseIntercepted()
            kotlinx.coroutines.flow.j<T> r7 = r4.f68352a
            boolean r2 = r7 instanceof kotlinx.coroutines.flow.q0
            if (r2 == 0) goto L7c
            kotlinx.coroutines.flow.q0 r7 = (kotlinx.coroutines.flow.q0) r7
            r2 = 0
            r0.f68354a = r2
            r0.f68355b = r2
            r0.f68358e = r3
            java.lang.Object r7 = r7.a(r0)
            if (r7 != r1) goto L79
        L78:
            return r1
        L79:
            yz.g2 r7 = yz.g2.f100423a
            return r7
        L7c:
            yz.g2 r7 = yz.g2.f100423a
            return r7
        L7f:
            r2.releaseIntercepted()
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.q0.a(j00.c):java.lang.Object");
    }

    @Override // kotlinx.coroutines.flow.j
    @m80.l
    public Object emit(T t11, @m80.k j00.c<? super g2> cVar) {
        return this.f68352a.emit(t11, cVar);
    }
}
