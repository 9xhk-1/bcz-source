package kotlinx.coroutines.flow;

import c40.l2;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.u0;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nErrors.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Errors.kt\nkotlinx/coroutines/flow/FlowKt__ErrorsKt\n+ 2 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 StackTraceRecovery.kt\nkotlinx/coroutines/internal/StackTraceRecoveryKt\n*L\n1#1,220:1\n105#2:221\n105#2:223\n1#3:222\n159#4:224\n*S KotlinDebug\n*F\n+ 1 Errors.kt\nkotlinx/coroutines/flow/FlowKt__ErrorsKt\n*L\n54#1:221\n128#1:223\n217#1:224\n*E\n"})
/* loaded from: classes8.dex */
public final /* synthetic */ class FlowKt__ErrorsKt {

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "kotlinx.coroutines.flow.FlowKt__ErrorsKt", f = "Errors.kt", i = {0}, l = {152}, m = "catchImpl", n = {"fromDownstream"}, s = {"L$0"})
    public static final class a<T> extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public Object f67849a;

        /* renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f67850b;

        /* renamed from: c, reason: collision with root package name */
        public int f67851c;

        public a(j00.c<? super a> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @m80.l
        public final Object invokeSuspend(@m80.k Object obj) {
            this.f67850b = obj;
            this.f67851c |= Integer.MIN_VALUE;
            return k.w(null, null, this);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class b<T> implements j {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ j<T> f67852a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Ref.ObjectRef<Throwable> f67853b;

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        @l00.d(c = "kotlinx.coroutines.flow.FlowKt__ErrorsKt$catchImpl$2", f = "Errors.kt", i = {0}, l = {154}, m = "emit", n = {"this"}, s = {"L$0"})
        public static final class a extends ContinuationImpl {

            /* renamed from: a, reason: collision with root package name */
            public Object f67854a;

            /* renamed from: b, reason: collision with root package name */
            public /* synthetic */ Object f67855b;

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ b<T> f67856c;

            /* renamed from: d, reason: collision with root package name */
            public int f67857d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public a(b<? super T> bVar, j00.c<? super a> cVar) {
                super(cVar);
                this.f67856c = bVar;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                this.f67855b = obj;
                this.f67857d |= Integer.MIN_VALUE;
                return this.f67856c.emit(null, this);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public b(j<? super T> jVar, Ref.ObjectRef<Throwable> objectRef) {
            this.f67852a = jVar;
            this.f67853b = objectRef;
        }

        /* JADX WARN: Removed duplicated region for block: B:21:0x0037  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
        @Override // kotlinx.coroutines.flow.j
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object emit(T r5, j00.c<? super yz.g2> r6) {
            /*
                r4 = this;
                boolean r0 = r6 instanceof kotlinx.coroutines.flow.FlowKt__ErrorsKt.b.a
                if (r0 == 0) goto L13
                r0 = r6
                kotlinx.coroutines.flow.FlowKt__ErrorsKt$b$a r0 = (kotlinx.coroutines.flow.FlowKt__ErrorsKt.b.a) r0
                int r1 = r0.f67857d
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.f67857d = r1
                goto L18
            L13:
                kotlinx.coroutines.flow.FlowKt__ErrorsKt$b$a r0 = new kotlinx.coroutines.flow.FlowKt__ErrorsKt$b$a
                r0.<init>(r4, r6)
            L18:
                java.lang.Object r6 = r0.f67855b
                java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
                int r2 = r0.f67857d
                r3 = 1
                if (r2 == 0) goto L37
                if (r2 != r3) goto L2f
                java.lang.Object r5 = r0.f67854a
                kotlinx.coroutines.flow.FlowKt__ErrorsKt$b r5 = (kotlinx.coroutines.flow.FlowKt__ErrorsKt.b) r5
                kotlin.e.n(r6)     // Catch: java.lang.Throwable -> L2d
                goto L47
            L2d:
                r6 = move-exception
                goto L4c
            L2f:
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                r5.<init>(r6)
                throw r5
            L37:
                kotlin.e.n(r6)
                kotlinx.coroutines.flow.j<T> r6 = r4.f67852a     // Catch: java.lang.Throwable -> L4a
                r0.f67854a = r4     // Catch: java.lang.Throwable -> L4a
                r0.f67857d = r3     // Catch: java.lang.Throwable -> L4a
                java.lang.Object r5 = r6.emit(r5, r0)     // Catch: java.lang.Throwable -> L4a
                if (r5 != r1) goto L47
                return r1
            L47:
                yz.g2 r5 = yz.g2.f100423a
                return r5
            L4a:
                r6 = move-exception
                r5 = r4
            L4c:
                kotlin.jvm.internal.Ref$ObjectRef<java.lang.Throwable> r5 = r5.f67853b
                r5.element = r6
                throw r6
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.FlowKt__ErrorsKt.b.emit(java.lang.Object, j00.c):java.lang.Object");
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "kotlinx.coroutines.flow.FlowKt__ErrorsKt$retry$1", f = "Errors.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class c extends SuspendLambda implements x00.p<Throwable, j00.c<? super Boolean>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f67858a;

        public c(j00.c<? super c> cVar) {
            super(2, cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final j00.c<g2> create(Object obj, j00.c<?> cVar) {
            return new c(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            kotlin.coroutines.intrinsics.b.l();
            if (this.f67858a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.e.n(obj);
            return l00.a.a(true);
        }

        @Override // x00.p
        public final Object invoke(Throwable th2, j00.c<? super Boolean> cVar) {
            return ((c) create(th2, cVar)).invokeSuspend(g2.f100423a);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "kotlinx.coroutines.flow.FlowKt__ErrorsKt$retry$3", f = "Errors.kt", i = {}, l = {91}, m = "invokeSuspend", n = {}, s = {})
    public static final class d<T> extends SuspendLambda implements x00.r<j<? super T>, Throwable, Long, j00.c<? super Boolean>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f67859a;

        /* renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f67860b;

        /* renamed from: c, reason: collision with root package name */
        public /* synthetic */ long f67861c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ long f67862d;

        /* renamed from: e, reason: collision with root package name */
        public final /* synthetic */ x00.p<Throwable, j00.c<? super Boolean>, Object> f67863e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public d(long j11, x00.p<? super Throwable, ? super j00.c<? super Boolean>, ? extends Object> pVar, j00.c<? super d> cVar) {
            super(4, cVar);
            this.f67862d = j11;
            this.f67863e = pVar;
        }

        public final Object i(j<? super T> jVar, Throwable th2, long j11, j00.c<? super Boolean> cVar) {
            d dVar = new d(this.f67862d, this.f67863e, cVar);
            dVar.f67860b = th2;
            dVar.f67861c = j11;
            return dVar.invokeSuspend(g2.f100423a);
        }

        @Override // x00.r
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Throwable th2, Long l11, j00.c<? super Boolean> cVar) {
            return i((j) obj, th2, l11.longValue(), cVar);
        }

        /* JADX WARN: Code restructure failed: missing block: B:6:0x0037, code lost:
        
            if (((java.lang.Boolean) r8).booleanValue() != false) goto L17;
         */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r8) {
            /*
                r7 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.b.l()
                int r1 = r7.f67859a
                r2 = 1
                if (r1 == 0) goto L17
                if (r1 != r2) goto Lf
                kotlin.e.n(r8)
                goto L31
            Lf:
                java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r8.<init>(r0)
                throw r8
            L17:
                kotlin.e.n(r8)
                java.lang.Object r8 = r7.f67860b
                java.lang.Throwable r8 = (java.lang.Throwable) r8
                long r3 = r7.f67861c
                long r5 = r7.f67862d
                int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
                if (r1 >= 0) goto L3a
                x00.p<java.lang.Throwable, j00.c<? super java.lang.Boolean>, java.lang.Object> r1 = r7.f67863e
                r7.f67859a = r2
                java.lang.Object r8 = r1.invoke(r8, r7)
                if (r8 != r0) goto L31
                return r0
            L31:
                java.lang.Boolean r8 = (java.lang.Boolean) r8
                boolean r8 = r8.booleanValue()
                if (r8 == 0) goto L3a
                goto L3b
            L3a:
                r2 = 0
            L3b:
                java.lang.Boolean r8 = l00.a.a(r2)
                return r8
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.FlowKt__ErrorsKt.d.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @m80.k
    public static final <T> i<T> a(@m80.k i<? extends T> iVar, @m80.k x00.q<? super j<? super T>, ? super Throwable, ? super j00.c<? super g2>, ? extends Object> qVar) {
        return new FlowKt__ErrorsKt$catch$$inlined$unsafeFlow$1(iVar, qVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @m80.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final <T> java.lang.Object b(@m80.k kotlinx.coroutines.flow.i<? extends T> r4, @m80.k kotlinx.coroutines.flow.j<? super T> r5, @m80.k j00.c<? super java.lang.Throwable> r6) {
        /*
            boolean r0 = r6 instanceof kotlinx.coroutines.flow.FlowKt__ErrorsKt.a
            if (r0 == 0) goto L13
            r0 = r6
            kotlinx.coroutines.flow.FlowKt__ErrorsKt$a r0 = (kotlinx.coroutines.flow.FlowKt__ErrorsKt.a) r0
            int r1 = r0.f67851c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f67851c = r1
            goto L18
        L13:
            kotlinx.coroutines.flow.FlowKt__ErrorsKt$a r0 = new kotlinx.coroutines.flow.FlowKt__ErrorsKt$a
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f67850b
            java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
            int r2 = r0.f67851c
            r3 = 1
            if (r2 == 0) goto L37
            if (r2 != r3) goto L2f
            java.lang.Object r4 = r0.f67849a
            kotlin.jvm.internal.Ref$ObjectRef r4 = (kotlin.jvm.internal.Ref.ObjectRef) r4
            kotlin.e.n(r6)     // Catch: java.lang.Throwable -> L2d
            goto L4f
        L2d:
            r5 = move-exception
            goto L53
        L2f:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L37:
            kotlin.e.n(r6)
            kotlin.jvm.internal.Ref$ObjectRef r6 = new kotlin.jvm.internal.Ref$ObjectRef
            r6.<init>()
            kotlinx.coroutines.flow.FlowKt__ErrorsKt$b r2 = new kotlinx.coroutines.flow.FlowKt__ErrorsKt$b     // Catch: java.lang.Throwable -> L51
            r2.<init>(r5, r6)     // Catch: java.lang.Throwable -> L51
            r0.f67849a = r6     // Catch: java.lang.Throwable -> L51
            r0.f67851c = r3     // Catch: java.lang.Throwable -> L51
            java.lang.Object r4 = r4.collect(r2, r0)     // Catch: java.lang.Throwable -> L51
            if (r4 != r1) goto L4f
            return r1
        L4f:
            r4 = 0
            return r4
        L51:
            r5 = move-exception
            r4 = r6
        L53:
            T r4 = r4.element
            java.lang.Throwable r4 = (java.lang.Throwable) r4
            boolean r6 = d(r5, r4)
            if (r6 != 0) goto L76
            kotlin.coroutines.d r6 = r0.getContext()
            boolean r6 = c(r5, r6)
            if (r6 != 0) goto L76
            if (r4 != 0) goto L6a
            return r5
        L6a:
            boolean r6 = r5 instanceof java.util.concurrent.CancellationException
            if (r6 == 0) goto L72
            yz.r.a(r4, r5)
            throw r4
        L72:
            yz.r.a(r5, r4)
            throw r5
        L76:
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.FlowKt__ErrorsKt.b(kotlinx.coroutines.flow.i, kotlinx.coroutines.flow.j, j00.c):java.lang.Object");
    }

    public static final boolean c(Throwable th2, kotlin.coroutines.d dVar) {
        l2 l2Var = (l2) dVar.get(l2.f7886e0);
        if (l2Var == null || !l2Var.isCancelled()) {
            return false;
        }
        return d(th2, l2Var.y0());
    }

    public static final boolean d(Throwable th2, Throwable th3) {
        return th3 != null && kotlin.jvm.internal.g0.g(th3, th2);
    }

    @m80.k
    public static final <T> i<T> e(@m80.k i<? extends T> iVar, long j11, @m80.k x00.p<? super Throwable, ? super j00.c<? super Boolean>, ? extends Object> pVar) {
        if (j11 > 0) {
            return k.A1(iVar, new d(j11, pVar, null));
        }
        throw new IllegalArgumentException(("Expected positive amount of retries, but had " + j11).toString());
    }

    public static /* synthetic */ i f(i iVar, long j11, x00.p pVar, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            j11 = Long.MAX_VALUE;
        }
        if ((i11 & 2) != 0) {
            pVar = new c(null);
        }
        return k.y1(iVar, j11, pVar);
    }

    @m80.k
    public static final <T> i<T> g(@m80.k i<? extends T> iVar, @m80.k x00.r<? super j<? super T>, ? super Throwable, ? super Long, ? super j00.c<? super Boolean>, ? extends Object> rVar) {
        return new FlowKt__ErrorsKt$retryWhen$$inlined$unsafeFlow$1(iVar, rVar);
    }
}
