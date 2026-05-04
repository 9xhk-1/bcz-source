package kotlinx.coroutines.flow;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.u0;
import kotlinx.coroutines.flow.internal.AbortFlowException;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nReduce.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Reduce.kt\nkotlinx/coroutines/flow/FlowKt__ReduceKt\n+ 2 Limit.kt\nkotlinx/coroutines/flow/FlowKt__LimitKt\n*L\n1#1,168:1\n124#2,17:169\n124#2,17:186\n124#2,17:203\n124#2,17:220\n124#2,17:237\n*S KotlinDebug\n*F\n+ 1 Reduce.kt\nkotlinx/coroutines/flow/FlowKt__ReduceKt\n*L\n68#1:169,17\n88#1:186,17\n102#1:203,17\n120#1:220,17\n133#1:237,17\n*E\n"})
/* loaded from: classes8.dex */
public final /* synthetic */ class FlowKt__ReduceKt {

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @u0({"SMAP\nLimit.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Limit.kt\nkotlinx/coroutines/flow/FlowKt__LimitKt$collectWhile$collector$1\n+ 2 Reduce.kt\nkotlinx/coroutines/flow/FlowKt__ReduceKt\n*L\n1#1,131:1\n89#2,2:132\n*E\n"})
    public static final class a<T> implements kotlinx.coroutines.flow.j<T> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Ref.ObjectRef f67953a;

        public a(Ref.ObjectRef objectRef) {
            this.f67953a = objectRef;
        }

        @Override // kotlinx.coroutines.flow.j
        public Object emit(T t11, j00.c<? super g2> cVar) {
            this.f67953a.element = t11;
            throw new AbortFlowException(this);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "kotlinx.coroutines.flow.FlowKt__ReduceKt", f = "Reduce.kt", i = {0, 0}, l = {179}, m = "first", n = {"result", "collector$iv"}, s = {"L$0", "L$1"})
    public static final class b<T> extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public Object f67954a;

        /* renamed from: b, reason: collision with root package name */
        public Object f67955b;

        /* renamed from: c, reason: collision with root package name */
        public /* synthetic */ Object f67956c;

        /* renamed from: d, reason: collision with root package name */
        public int f67957d;

        public b(j00.c<? super b> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @m80.l
        public final Object invokeSuspend(@m80.k Object obj) {
            this.f67956c = obj;
            this.f67957d |= Integer.MIN_VALUE;
            return kotlinx.coroutines.flow.k.w0(null, this);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "kotlinx.coroutines.flow.FlowKt__ReduceKt", f = "Reduce.kt", i = {0, 0}, l = {179}, m = "first", n = {"result", "collector$iv"}, s = {"L$0", "L$1"})
    public static final class c<T> extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public Object f67958a;

        /* renamed from: b, reason: collision with root package name */
        public Object f67959b;

        /* renamed from: c, reason: collision with root package name */
        public /* synthetic */ Object f67960c;

        /* renamed from: d, reason: collision with root package name */
        public int f67961d;

        public c(j00.c<? super c> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @m80.l
        public final Object invokeSuspend(@m80.k Object obj) {
            this.f67960c = obj;
            this.f67961d |= Integer.MIN_VALUE;
            return kotlinx.coroutines.flow.k.x0(null, null, this);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @u0({"SMAP\nLimit.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Limit.kt\nkotlinx/coroutines/flow/FlowKt__LimitKt$collectWhile$collector$1\n+ 2 Reduce.kt\nkotlinx/coroutines/flow/FlowKt__ReduceKt\n*L\n1#1,131:1\n121#2,2:132\n*E\n"})
    public static final class d<T> implements kotlinx.coroutines.flow.j<T> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Ref.ObjectRef f67962a;

        public d(Ref.ObjectRef objectRef) {
            this.f67962a = objectRef;
        }

        @Override // kotlinx.coroutines.flow.j
        public Object emit(T t11, j00.c<? super g2> cVar) {
            this.f67962a.element = t11;
            throw new AbortFlowException(this);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "kotlinx.coroutines.flow.FlowKt__ReduceKt", f = "Reduce.kt", i = {0, 0}, l = {179}, m = "firstOrNull", n = {"result", "collector$iv"}, s = {"L$0", "L$1"})
    public static final class e<T> extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public Object f67963a;

        /* renamed from: b, reason: collision with root package name */
        public Object f67964b;

        /* renamed from: c, reason: collision with root package name */
        public /* synthetic */ Object f67965c;

        /* renamed from: d, reason: collision with root package name */
        public int f67966d;

        public e(j00.c<? super e> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @m80.l
        public final Object invokeSuspend(@m80.k Object obj) {
            this.f67965c = obj;
            this.f67966d |= Integer.MIN_VALUE;
            return kotlinx.coroutines.flow.k.y0(null, this);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "kotlinx.coroutines.flow.FlowKt__ReduceKt", f = "Reduce.kt", i = {0, 0}, l = {179}, m = "firstOrNull", n = {"result", "collector$iv"}, s = {"L$0", "L$1"})
    public static final class f<T> extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public Object f67967a;

        /* renamed from: b, reason: collision with root package name */
        public Object f67968b;

        /* renamed from: c, reason: collision with root package name */
        public /* synthetic */ Object f67969c;

        /* renamed from: d, reason: collision with root package name */
        public int f67970d;

        public f(j00.c<? super f> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @m80.l
        public final Object invokeSuspend(@m80.k Object obj) {
            this.f67969c = obj;
            this.f67970d |= Integer.MIN_VALUE;
            return kotlinx.coroutines.flow.k.z0(null, null, this);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "kotlinx.coroutines.flow.FlowKt__ReduceKt", f = "Reduce.kt", i = {0}, l = {40}, m = "fold", n = {"accumulator"}, s = {"L$0"})
    public static final class g<T, R> extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public Object f67973a;

        /* renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f67974b;

        /* renamed from: c, reason: collision with root package name */
        public int f67975c;

        public g(j00.c<? super g> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @m80.l
        public final Object invokeSuspend(@m80.k Object obj) {
            this.f67974b = obj;
            this.f67975c |= Integer.MIN_VALUE;
            return FlowKt__ReduceKt.e(null, null, null, this);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "kotlinx.coroutines.flow.FlowKt__ReduceKt", f = "Reduce.kt", i = {0}, l = {151}, m = "last", n = {"result"}, s = {"L$0"})
    public static final class h<T> extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public Object f67976a;

        /* renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f67977b;

        /* renamed from: c, reason: collision with root package name */
        public int f67978c;

        public h(j00.c<? super h> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @m80.l
        public final Object invokeSuspend(@m80.k Object obj) {
            this.f67977b = obj;
            this.f67978c |= Integer.MIN_VALUE;
            return kotlinx.coroutines.flow.k.U0(null, this);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class i<T> implements kotlinx.coroutines.flow.j {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Ref.ObjectRef<Object> f67979a;

        public i(Ref.ObjectRef<Object> objectRef) {
            this.f67979a = objectRef;
        }

        @Override // kotlinx.coroutines.flow.j
        public final Object emit(T t11, j00.c<? super g2> cVar) {
            this.f67979a.element = t11;
            return g2.f100423a;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "kotlinx.coroutines.flow.FlowKt__ReduceKt", f = "Reduce.kt", i = {0}, l = {163}, m = "lastOrNull", n = {"result"}, s = {"L$0"})
    public static final class j<T> extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public Object f67980a;

        /* renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f67981b;

        /* renamed from: c, reason: collision with root package name */
        public int f67982c;

        public j(j00.c<? super j> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @m80.l
        public final Object invokeSuspend(@m80.k Object obj) {
            this.f67981b = obj;
            this.f67982c |= Integer.MIN_VALUE;
            return kotlinx.coroutines.flow.k.V0(null, this);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class k<T> implements kotlinx.coroutines.flow.j {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Ref.ObjectRef<T> f67983a;

        public k(Ref.ObjectRef<T> objectRef) {
            this.f67983a = objectRef;
        }

        @Override // kotlinx.coroutines.flow.j
        public final Object emit(T t11, j00.c<? super g2> cVar) {
            this.f67983a.element = t11;
            return g2.f100423a;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "kotlinx.coroutines.flow.FlowKt__ReduceKt", f = "Reduce.kt", i = {0}, l = {18}, m = "reduce", n = {"accumulator"}, s = {"L$0"})
    public static final class l<S, T extends S> extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public Object f67984a;

        /* renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f67985b;

        /* renamed from: c, reason: collision with root package name */
        public int f67986c;

        public l(j00.c<? super l> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @m80.l
        public final Object invokeSuspend(@m80.k Object obj) {
            this.f67985b = obj;
            this.f67986c |= Integer.MIN_VALUE;
            return kotlinx.coroutines.flow.k.v1(null, null, this);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class m<T> implements kotlinx.coroutines.flow.j {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Ref.ObjectRef<Object> f67987a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ x00.q<S, T, j00.c<? super S>, Object> f67988b;

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        @l00.d(c = "kotlinx.coroutines.flow.FlowKt__ReduceKt$reduce$2", f = "Reduce.kt", i = {}, l = {21}, m = "emit", n = {}, s = {})
        public static final class a extends ContinuationImpl {

            /* renamed from: a, reason: collision with root package name */
            public Object f67989a;

            /* renamed from: b, reason: collision with root package name */
            public /* synthetic */ Object f67990b;

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ m<T> f67991c;

            /* renamed from: d, reason: collision with root package name */
            public int f67992d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public a(m<? super T> mVar, j00.c<? super a> cVar) {
                super(cVar);
                this.f67991c = mVar;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                this.f67990b = obj;
                this.f67992d |= Integer.MIN_VALUE;
                return this.f67991c.emit(null, this);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public m(Ref.ObjectRef<Object> objectRef, x00.q<? super S, ? super T, ? super j00.c<? super S>, ? extends Object> qVar) {
            this.f67987a = objectRef;
            this.f67988b = qVar;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:16:0x0035  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
        @Override // kotlinx.coroutines.flow.j
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object emit(T r7, j00.c<? super yz.g2> r8) {
            /*
                r6 = this;
                boolean r0 = r8 instanceof kotlinx.coroutines.flow.FlowKt__ReduceKt.m.a
                if (r0 == 0) goto L13
                r0 = r8
                kotlinx.coroutines.flow.FlowKt__ReduceKt$m$a r0 = (kotlinx.coroutines.flow.FlowKt__ReduceKt.m.a) r0
                int r1 = r0.f67992d
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.f67992d = r1
                goto L18
            L13:
                kotlinx.coroutines.flow.FlowKt__ReduceKt$m$a r0 = new kotlinx.coroutines.flow.FlowKt__ReduceKt$m$a
                r0.<init>(r6, r8)
            L18:
                java.lang.Object r8 = r0.f67990b
                java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
                int r2 = r0.f67992d
                r3 = 1
                if (r2 == 0) goto L35
                if (r2 != r3) goto L2d
                java.lang.Object r7 = r0.f67989a
                kotlin.jvm.internal.Ref$ObjectRef r7 = (kotlin.jvm.internal.Ref.ObjectRef) r7
                kotlin.e.n(r8)
                goto L50
            L2d:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
                r7.<init>(r8)
                throw r7
            L35:
                kotlin.e.n(r8)
                kotlin.jvm.internal.Ref$ObjectRef<java.lang.Object> r8 = r6.f67987a
                T r2 = r8.element
                h40.x0 r4 = kotlinx.coroutines.flow.internal.s.f68282a
                if (r2 == r4) goto L53
                x00.q<S, T, j00.c<? super S>, java.lang.Object> r4 = r6.f67988b
                r0.f67989a = r8
                r0.f67992d = r3
                java.lang.Object r7 = r4.invoke(r2, r7, r0)
                if (r7 != r1) goto L4d
                return r1
            L4d:
                r5 = r8
                r8 = r7
                r7 = r5
            L50:
                r5 = r8
                r8 = r7
                r7 = r5
            L53:
                r8.element = r7
                yz.g2 r7 = yz.g2.f100423a
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.FlowKt__ReduceKt.m.emit(java.lang.Object, j00.c):java.lang.Object");
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "kotlinx.coroutines.flow.FlowKt__ReduceKt", f = "Reduce.kt", i = {0}, l = {53}, m = "single", n = {"result"}, s = {"L$0"})
    public static final class n<T> extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public Object f67993a;

        /* renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f67994b;

        /* renamed from: c, reason: collision with root package name */
        public int f67995c;

        public n(j00.c<? super n> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @m80.l
        public final Object invokeSuspend(@m80.k Object obj) {
            this.f67994b = obj;
            this.f67995c |= Integer.MIN_VALUE;
            return kotlinx.coroutines.flow.k.K1(null, this);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @u0({"SMAP\nReduce.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Reduce.kt\nkotlinx/coroutines/flow/FlowKt__ReduceKt$single$2\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,168:1\n1#2:169\n*E\n"})
    public static final class o<T> implements kotlinx.coroutines.flow.j {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Ref.ObjectRef<Object> f67996a;

        public o(Ref.ObjectRef<Object> objectRef) {
            this.f67996a = objectRef;
        }

        @Override // kotlinx.coroutines.flow.j
        public final Object emit(T t11, j00.c<? super g2> cVar) {
            Ref.ObjectRef<Object> objectRef = this.f67996a;
            if (objectRef.element != kotlinx.coroutines.flow.internal.s.f68282a) {
                throw new IllegalArgumentException("Flow has more than one element");
            }
            objectRef.element = t11;
            return g2.f100423a;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @u0({"SMAP\nLimit.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Limit.kt\nkotlinx/coroutines/flow/FlowKt__LimitKt$collectWhile$collector$1\n+ 2 Reduce.kt\nkotlinx/coroutines/flow/FlowKt__ReduceKt\n*L\n1#1,131:1\n70#2,8:132\n*E\n"})
    public static final class p<T> implements kotlinx.coroutines.flow.j<T> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Ref.ObjectRef f67997a;

        public p(Ref.ObjectRef objectRef) {
            this.f67997a = objectRef;
        }

        @Override // kotlinx.coroutines.flow.j
        public Object emit(T t11, j00.c<? super g2> cVar) {
            Ref.ObjectRef objectRef = this.f67997a;
            T t12 = objectRef.element;
            T t13 = (T) kotlinx.coroutines.flow.internal.s.f68282a;
            if (t12 == t13) {
                objectRef.element = t11;
                return g2.f100423a;
            }
            objectRef.element = t13;
            throw new AbortFlowException(this);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "kotlinx.coroutines.flow.FlowKt__ReduceKt", f = "Reduce.kt", i = {0, 0}, l = {179}, m = "singleOrNull", n = {"result", "collector$iv"}, s = {"L$0", "L$1"})
    public static final class q<T> extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        public Object f67998a;

        /* renamed from: b, reason: collision with root package name */
        public Object f67999b;

        /* renamed from: c, reason: collision with root package name */
        public /* synthetic */ Object f68000c;

        /* renamed from: d, reason: collision with root package name */
        public int f68001d;

        public q(j00.c<? super q> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @m80.l
        public final Object invokeSuspend(@m80.k Object obj) {
            this.f68000c = obj;
            this.f68001d |= Integer.MIN_VALUE;
            return kotlinx.coroutines.flow.k.L1(null, this);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x006f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @m80.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final <T> java.lang.Object a(@m80.k kotlinx.coroutines.flow.i<? extends T> r4, @m80.k j00.c<? super T> r5) {
        /*
            boolean r0 = r5 instanceof kotlinx.coroutines.flow.FlowKt__ReduceKt.b
            if (r0 == 0) goto L13
            r0 = r5
            kotlinx.coroutines.flow.FlowKt__ReduceKt$b r0 = (kotlinx.coroutines.flow.FlowKt__ReduceKt.b) r0
            int r1 = r0.f67957d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f67957d = r1
            goto L18
        L13:
            kotlinx.coroutines.flow.FlowKt__ReduceKt$b r0 = new kotlinx.coroutines.flow.FlowKt__ReduceKt$b
            r0.<init>(r5)
        L18:
            java.lang.Object r5 = r0.f67956c
            java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
            int r2 = r0.f67957d
            r3 = 1
            if (r2 == 0) goto L3b
            if (r2 != r3) goto L33
            java.lang.Object r4 = r0.f67955b
            kotlinx.coroutines.flow.FlowKt__ReduceKt$a r4 = (kotlinx.coroutines.flow.FlowKt__ReduceKt.a) r4
            java.lang.Object r1 = r0.f67954a
            kotlin.jvm.internal.Ref$ObjectRef r1 = (kotlin.jvm.internal.Ref.ObjectRef) r1
            kotlin.e.n(r5)     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L31
            goto L69
        L31:
            r5 = move-exception
            goto L5f
        L33:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L3b:
            kotlin.e.n(r5)
            kotlin.jvm.internal.Ref$ObjectRef r5 = new kotlin.jvm.internal.Ref$ObjectRef
            r5.<init>()
            h40.x0 r2 = kotlinx.coroutines.flow.internal.s.f68282a
            r5.element = r2
            kotlinx.coroutines.flow.FlowKt__ReduceKt$a r2 = new kotlinx.coroutines.flow.FlowKt__ReduceKt$a
            r2.<init>(r5)
            r0.f67954a = r5     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L5b
            r0.f67955b = r2     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L5b
            r0.f67957d = r3     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L5b
            java.lang.Object r4 = r4.collect(r2, r0)     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L5b
            if (r4 != r1) goto L59
            return r1
        L59:
            r1 = r5
            goto L69
        L5b:
            r4 = move-exception
            r1 = r5
            r5 = r4
            r4 = r2
        L5f:
            kotlinx.coroutines.flow.internal.o.b(r5, r4)
            kotlin.coroutines.d r4 = r0.getContext()
            c40.n2.z(r4)
        L69:
            T r4 = r1.element
            h40.x0 r5 = kotlinx.coroutines.flow.internal.s.f68282a
            if (r4 == r5) goto L70
            return r4
        L70:
            java.util.NoSuchElementException r4 = new java.util.NoSuchElementException
            java.lang.String r5 = "Expected at least one element"
            r4.<init>(r5)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.FlowKt__ReduceKt.a(kotlinx.coroutines.flow.i, j00.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x006f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @m80.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final <T> java.lang.Object b(@m80.k kotlinx.coroutines.flow.i<? extends T> r4, @m80.k x00.p<? super T, ? super j00.c<? super java.lang.Boolean>, ? extends java.lang.Object> r5, @m80.k j00.c<? super T> r6) {
        /*
            boolean r0 = r6 instanceof kotlinx.coroutines.flow.FlowKt__ReduceKt.c
            if (r0 == 0) goto L13
            r0 = r6
            kotlinx.coroutines.flow.FlowKt__ReduceKt$c r0 = (kotlinx.coroutines.flow.FlowKt__ReduceKt.c) r0
            int r1 = r0.f67961d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f67961d = r1
            goto L18
        L13:
            kotlinx.coroutines.flow.FlowKt__ReduceKt$c r0 = new kotlinx.coroutines.flow.FlowKt__ReduceKt$c
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f67960c
            java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
            int r2 = r0.f67961d
            r3 = 1
            if (r2 == 0) goto L3b
            if (r2 != r3) goto L33
            java.lang.Object r4 = r0.f67959b
            kotlinx.coroutines.flow.FlowKt__ReduceKt$first$$inlined$collectWhile$2 r4 = (kotlinx.coroutines.flow.FlowKt__ReduceKt$first$$inlined$collectWhile$2) r4
            java.lang.Object r5 = r0.f67958a
            kotlin.jvm.internal.Ref$ObjectRef r5 = (kotlin.jvm.internal.Ref.ObjectRef) r5
            kotlin.e.n(r6)     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L31
            goto L69
        L31:
            r6 = move-exception
            goto L5f
        L33:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L3b:
            kotlin.e.n(r6)
            kotlin.jvm.internal.Ref$ObjectRef r6 = new kotlin.jvm.internal.Ref$ObjectRef
            r6.<init>()
            h40.x0 r2 = kotlinx.coroutines.flow.internal.s.f68282a
            r6.element = r2
            kotlinx.coroutines.flow.FlowKt__ReduceKt$first$$inlined$collectWhile$2 r2 = new kotlinx.coroutines.flow.FlowKt__ReduceKt$first$$inlined$collectWhile$2
            r2.<init>(r5, r6)
            r0.f67958a = r6     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L5b
            r0.f67959b = r2     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L5b
            r0.f67961d = r3     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L5b
            java.lang.Object r4 = r4.collect(r2, r0)     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L5b
            if (r4 != r1) goto L59
            return r1
        L59:
            r5 = r6
            goto L69
        L5b:
            r4 = move-exception
            r5 = r6
            r6 = r4
            r4 = r2
        L5f:
            kotlinx.coroutines.flow.internal.o.b(r6, r4)
            kotlin.coroutines.d r4 = r0.getContext()
            c40.n2.z(r4)
        L69:
            T r4 = r5.element
            h40.x0 r5 = kotlinx.coroutines.flow.internal.s.f68282a
            if (r4 == r5) goto L70
            return r4
        L70:
            java.util.NoSuchElementException r4 = new java.util.NoSuchElementException
            java.lang.String r5 = "Expected at least one element matching the predicate"
            r4.<init>(r5)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.FlowKt__ReduceKt.b(kotlinx.coroutines.flow.i, x00.p, j00.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @m80.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final <T> java.lang.Object c(@m80.k kotlinx.coroutines.flow.i<? extends T> r4, @m80.k j00.c<? super T> r5) {
        /*
            boolean r0 = r5 instanceof kotlinx.coroutines.flow.FlowKt__ReduceKt.e
            if (r0 == 0) goto L13
            r0 = r5
            kotlinx.coroutines.flow.FlowKt__ReduceKt$e r0 = (kotlinx.coroutines.flow.FlowKt__ReduceKt.e) r0
            int r1 = r0.f67966d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f67966d = r1
            goto L18
        L13:
            kotlinx.coroutines.flow.FlowKt__ReduceKt$e r0 = new kotlinx.coroutines.flow.FlowKt__ReduceKt$e
            r0.<init>(r5)
        L18:
            java.lang.Object r5 = r0.f67965c
            java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
            int r2 = r0.f67966d
            r3 = 1
            if (r2 == 0) goto L3b
            if (r2 != r3) goto L33
            java.lang.Object r4 = r0.f67964b
            kotlinx.coroutines.flow.FlowKt__ReduceKt$d r4 = (kotlinx.coroutines.flow.FlowKt__ReduceKt.d) r4
            java.lang.Object r1 = r0.f67963a
            kotlin.jvm.internal.Ref$ObjectRef r1 = (kotlin.jvm.internal.Ref.ObjectRef) r1
            kotlin.e.n(r5)     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L31
            goto L65
        L31:
            r5 = move-exception
            goto L5b
        L33:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L3b:
            kotlin.e.n(r5)
            kotlin.jvm.internal.Ref$ObjectRef r5 = new kotlin.jvm.internal.Ref$ObjectRef
            r5.<init>()
            kotlinx.coroutines.flow.FlowKt__ReduceKt$d r2 = new kotlinx.coroutines.flow.FlowKt__ReduceKt$d
            r2.<init>(r5)
            r0.f67963a = r5     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L57
            r0.f67964b = r2     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L57
            r0.f67966d = r3     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L57
            java.lang.Object r4 = r4.collect(r2, r0)     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L57
            if (r4 != r1) goto L55
            return r1
        L55:
            r1 = r5
            goto L65
        L57:
            r4 = move-exception
            r1 = r5
            r5 = r4
            r4 = r2
        L5b:
            kotlinx.coroutines.flow.internal.o.b(r5, r4)
            kotlin.coroutines.d r4 = r0.getContext()
            c40.n2.z(r4)
        L65:
            T r4 = r1.element
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.FlowKt__ReduceKt.c(kotlinx.coroutines.flow.i, j00.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @m80.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final <T> java.lang.Object d(@m80.k kotlinx.coroutines.flow.i<? extends T> r4, @m80.k x00.p<? super T, ? super j00.c<? super java.lang.Boolean>, ? extends java.lang.Object> r5, @m80.k j00.c<? super T> r6) {
        /*
            boolean r0 = r6 instanceof kotlinx.coroutines.flow.FlowKt__ReduceKt.f
            if (r0 == 0) goto L13
            r0 = r6
            kotlinx.coroutines.flow.FlowKt__ReduceKt$f r0 = (kotlinx.coroutines.flow.FlowKt__ReduceKt.f) r0
            int r1 = r0.f67970d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f67970d = r1
            goto L18
        L13:
            kotlinx.coroutines.flow.FlowKt__ReduceKt$f r0 = new kotlinx.coroutines.flow.FlowKt__ReduceKt$f
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f67969c
            java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
            int r2 = r0.f67970d
            r3 = 1
            if (r2 == 0) goto L3b
            if (r2 != r3) goto L33
            java.lang.Object r4 = r0.f67968b
            kotlinx.coroutines.flow.FlowKt__ReduceKt$firstOrNull$$inlined$collectWhile$2 r4 = (kotlinx.coroutines.flow.FlowKt__ReduceKt$firstOrNull$$inlined$collectWhile$2) r4
            java.lang.Object r5 = r0.f67967a
            kotlin.jvm.internal.Ref$ObjectRef r5 = (kotlin.jvm.internal.Ref.ObjectRef) r5
            kotlin.e.n(r6)     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L31
            goto L65
        L31:
            r6 = move-exception
            goto L5b
        L33:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L3b:
            kotlin.e.n(r6)
            kotlin.jvm.internal.Ref$ObjectRef r6 = new kotlin.jvm.internal.Ref$ObjectRef
            r6.<init>()
            kotlinx.coroutines.flow.FlowKt__ReduceKt$firstOrNull$$inlined$collectWhile$2 r2 = new kotlinx.coroutines.flow.FlowKt__ReduceKt$firstOrNull$$inlined$collectWhile$2
            r2.<init>(r5, r6)
            r0.f67967a = r6     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L57
            r0.f67968b = r2     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L57
            r0.f67970d = r3     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L57
            java.lang.Object r4 = r4.collect(r2, r0)     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L57
            if (r4 != r1) goto L55
            return r1
        L55:
            r5 = r6
            goto L65
        L57:
            r4 = move-exception
            r5 = r6
            r6 = r4
            r4 = r2
        L5b:
            kotlinx.coroutines.flow.internal.o.b(r6, r4)
            kotlin.coroutines.d r4 = r0.getContext()
            c40.n2.z(r4)
        L65:
            T r4 = r5.element
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.FlowKt__ReduceKt.d(kotlinx.coroutines.flow.i, x00.p, j00.c):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @m80.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final <T, R> java.lang.Object e(@m80.k kotlinx.coroutines.flow.i<? extends T> r4, R r5, @m80.k x00.q<? super R, ? super T, ? super j00.c<? super R>, ? extends java.lang.Object> r6, @m80.k j00.c<? super R> r7) {
        /*
            boolean r0 = r7 instanceof kotlinx.coroutines.flow.FlowKt__ReduceKt.g
            if (r0 == 0) goto L13
            r0 = r7
            kotlinx.coroutines.flow.FlowKt__ReduceKt$g r0 = (kotlinx.coroutines.flow.FlowKt__ReduceKt.g) r0
            int r1 = r0.f67975c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f67975c = r1
            goto L18
        L13:
            kotlinx.coroutines.flow.FlowKt__ReduceKt$g r0 = new kotlinx.coroutines.flow.FlowKt__ReduceKt$g
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.f67974b
            java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
            int r2 = r0.f67975c
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            java.lang.Object r4 = r0.f67973a
            kotlin.jvm.internal.Ref$ObjectRef r4 = (kotlin.jvm.internal.Ref.ObjectRef) r4
            kotlin.e.n(r7)
            goto L50
        L2d:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L35:
            kotlin.e.n(r7)
            kotlin.jvm.internal.Ref$ObjectRef r7 = new kotlin.jvm.internal.Ref$ObjectRef
            r7.<init>()
            r7.element = r5
            kotlinx.coroutines.flow.FlowKt__ReduceKt$fold$2 r5 = new kotlinx.coroutines.flow.FlowKt__ReduceKt$fold$2
            r5.<init>(r7, r6)
            r0.f67973a = r7
            r0.f67975c = r3
            java.lang.Object r4 = r4.collect(r5, r0)
            if (r4 != r1) goto L4f
            return r1
        L4f:
            r4 = r7
        L50:
            T r4 = r4.element
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.FlowKt__ReduceKt.e(kotlinx.coroutines.flow.i, java.lang.Object, x00.q, j00.c):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <T, R> Object f(kotlinx.coroutines.flow.i<? extends T> iVar, R r11, x00.q<? super R, ? super T, ? super j00.c<? super R>, ? extends Object> qVar, j00.c<? super R> cVar) {
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        objectRef.element = r11;
        FlowKt__ReduceKt$fold$2 flowKt__ReduceKt$fold$2 = new FlowKt__ReduceKt$fold$2(objectRef, qVar);
        kotlin.jvm.internal.d0.e(0);
        iVar.collect(flowKt__ReduceKt$fold$2, cVar);
        kotlin.jvm.internal.d0.e(1);
        return objectRef.element;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0058 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @m80.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final <T> java.lang.Object g(@m80.k kotlinx.coroutines.flow.i<? extends T> r4, @m80.k j00.c<? super T> r5) {
        /*
            boolean r0 = r5 instanceof kotlinx.coroutines.flow.FlowKt__ReduceKt.h
            if (r0 == 0) goto L13
            r0 = r5
            kotlinx.coroutines.flow.FlowKt__ReduceKt$h r0 = (kotlinx.coroutines.flow.FlowKt__ReduceKt.h) r0
            int r1 = r0.f67978c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f67978c = r1
            goto L18
        L13:
            kotlinx.coroutines.flow.FlowKt__ReduceKt$h r0 = new kotlinx.coroutines.flow.FlowKt__ReduceKt$h
            r0.<init>(r5)
        L18:
            java.lang.Object r5 = r0.f67977b
            java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
            int r2 = r0.f67978c
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            java.lang.Object r4 = r0.f67976a
            kotlin.jvm.internal.Ref$ObjectRef r4 = (kotlin.jvm.internal.Ref.ObjectRef) r4
            kotlin.e.n(r5)
            goto L52
        L2d:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L35:
            kotlin.e.n(r5)
            kotlin.jvm.internal.Ref$ObjectRef r5 = new kotlin.jvm.internal.Ref$ObjectRef
            r5.<init>()
            h40.x0 r2 = kotlinx.coroutines.flow.internal.s.f68282a
            r5.element = r2
            kotlinx.coroutines.flow.FlowKt__ReduceKt$i r2 = new kotlinx.coroutines.flow.FlowKt__ReduceKt$i
            r2.<init>(r5)
            r0.f67976a = r5
            r0.f67978c = r3
            java.lang.Object r4 = r4.collect(r2, r0)
            if (r4 != r1) goto L51
            return r1
        L51:
            r4 = r5
        L52:
            T r4 = r4.element
            h40.x0 r5 = kotlinx.coroutines.flow.internal.s.f68282a
            if (r4 == r5) goto L59
            return r4
        L59:
            java.util.NoSuchElementException r4 = new java.util.NoSuchElementException
            java.lang.String r5 = "Expected at least one element"
            r4.<init>(r5)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.FlowKt__ReduceKt.g(kotlinx.coroutines.flow.i, j00.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @m80.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final <T> java.lang.Object h(@m80.k kotlinx.coroutines.flow.i<? extends T> r4, @m80.k j00.c<? super T> r5) {
        /*
            boolean r0 = r5 instanceof kotlinx.coroutines.flow.FlowKt__ReduceKt.j
            if (r0 == 0) goto L13
            r0 = r5
            kotlinx.coroutines.flow.FlowKt__ReduceKt$j r0 = (kotlinx.coroutines.flow.FlowKt__ReduceKt.j) r0
            int r1 = r0.f67982c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f67982c = r1
            goto L18
        L13:
            kotlinx.coroutines.flow.FlowKt__ReduceKt$j r0 = new kotlinx.coroutines.flow.FlowKt__ReduceKt$j
            r0.<init>(r5)
        L18:
            java.lang.Object r5 = r0.f67981b
            java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
            int r2 = r0.f67982c
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            java.lang.Object r4 = r0.f67980a
            kotlin.jvm.internal.Ref$ObjectRef r4 = (kotlin.jvm.internal.Ref.ObjectRef) r4
            kotlin.e.n(r5)
            goto L4e
        L2d:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L35:
            kotlin.e.n(r5)
            kotlin.jvm.internal.Ref$ObjectRef r5 = new kotlin.jvm.internal.Ref$ObjectRef
            r5.<init>()
            kotlinx.coroutines.flow.FlowKt__ReduceKt$k r2 = new kotlinx.coroutines.flow.FlowKt__ReduceKt$k
            r2.<init>(r5)
            r0.f67980a = r5
            r0.f67982c = r3
            java.lang.Object r4 = r4.collect(r2, r0)
            if (r4 != r1) goto L4d
            return r1
        L4d:
            r4 = r5
        L4e:
            T r4 = r4.element
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.FlowKt__ReduceKt.h(kotlinx.coroutines.flow.i, j00.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0058 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /* JADX WARN: Type inference failed for: r2v1, types: [T, h40.x0] */
    @m80.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final <S, T extends S> java.lang.Object i(@m80.k kotlinx.coroutines.flow.i<? extends T> r4, @m80.k x00.q<? super S, ? super T, ? super j00.c<? super S>, ? extends java.lang.Object> r5, @m80.k j00.c<? super S> r6) {
        /*
            boolean r0 = r6 instanceof kotlinx.coroutines.flow.FlowKt__ReduceKt.l
            if (r0 == 0) goto L13
            r0 = r6
            kotlinx.coroutines.flow.FlowKt__ReduceKt$l r0 = (kotlinx.coroutines.flow.FlowKt__ReduceKt.l) r0
            int r1 = r0.f67986c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f67986c = r1
            goto L18
        L13:
            kotlinx.coroutines.flow.FlowKt__ReduceKt$l r0 = new kotlinx.coroutines.flow.FlowKt__ReduceKt$l
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f67985b
            java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
            int r2 = r0.f67986c
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            java.lang.Object r4 = r0.f67984a
            kotlin.jvm.internal.Ref$ObjectRef r4 = (kotlin.jvm.internal.Ref.ObjectRef) r4
            kotlin.e.n(r6)
            goto L52
        L2d:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L35:
            kotlin.e.n(r6)
            kotlin.jvm.internal.Ref$ObjectRef r6 = new kotlin.jvm.internal.Ref$ObjectRef
            r6.<init>()
            h40.x0 r2 = kotlinx.coroutines.flow.internal.s.f68282a
            r6.element = r2
            kotlinx.coroutines.flow.FlowKt__ReduceKt$m r2 = new kotlinx.coroutines.flow.FlowKt__ReduceKt$m
            r2.<init>(r6, r5)
            r0.f67984a = r6
            r0.f67986c = r3
            java.lang.Object r4 = r4.collect(r2, r0)
            if (r4 != r1) goto L51
            return r1
        L51:
            r4 = r6
        L52:
            T r4 = r4.element
            h40.x0 r5 = kotlinx.coroutines.flow.internal.s.f68282a
            if (r4 == r5) goto L59
            return r4
        L59:
            java.util.NoSuchElementException r4 = new java.util.NoSuchElementException
            java.lang.String r5 = "Empty flow can't be reduced"
            r4.<init>(r5)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.FlowKt__ReduceKt.i(kotlinx.coroutines.flow.i, x00.q, j00.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0058 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @m80.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final <T> java.lang.Object j(@m80.k kotlinx.coroutines.flow.i<? extends T> r4, @m80.k j00.c<? super T> r5) {
        /*
            boolean r0 = r5 instanceof kotlinx.coroutines.flow.FlowKt__ReduceKt.n
            if (r0 == 0) goto L13
            r0 = r5
            kotlinx.coroutines.flow.FlowKt__ReduceKt$n r0 = (kotlinx.coroutines.flow.FlowKt__ReduceKt.n) r0
            int r1 = r0.f67995c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f67995c = r1
            goto L18
        L13:
            kotlinx.coroutines.flow.FlowKt__ReduceKt$n r0 = new kotlinx.coroutines.flow.FlowKt__ReduceKt$n
            r0.<init>(r5)
        L18:
            java.lang.Object r5 = r0.f67994b
            java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
            int r2 = r0.f67995c
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            java.lang.Object r4 = r0.f67993a
            kotlin.jvm.internal.Ref$ObjectRef r4 = (kotlin.jvm.internal.Ref.ObjectRef) r4
            kotlin.e.n(r5)
            goto L52
        L2d:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L35:
            kotlin.e.n(r5)
            kotlin.jvm.internal.Ref$ObjectRef r5 = new kotlin.jvm.internal.Ref$ObjectRef
            r5.<init>()
            h40.x0 r2 = kotlinx.coroutines.flow.internal.s.f68282a
            r5.element = r2
            kotlinx.coroutines.flow.FlowKt__ReduceKt$o r2 = new kotlinx.coroutines.flow.FlowKt__ReduceKt$o
            r2.<init>(r5)
            r0.f67993a = r5
            r0.f67995c = r3
            java.lang.Object r4 = r4.collect(r2, r0)
            if (r4 != r1) goto L51
            return r1
        L51:
            r4 = r5
        L52:
            T r4 = r4.element
            h40.x0 r5 = kotlinx.coroutines.flow.internal.s.f68282a
            if (r4 == r5) goto L59
            return r4
        L59:
            java.util.NoSuchElementException r4 = new java.util.NoSuchElementException
            java.lang.String r5 = "Flow is empty"
            r4.<init>(r5)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.FlowKt__ReduceKt.j(kotlinx.coroutines.flow.i, j00.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x006f A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:16:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @m80.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final <T> java.lang.Object k(@m80.k kotlinx.coroutines.flow.i<? extends T> r4, @m80.k j00.c<? super T> r5) {
        /*
            boolean r0 = r5 instanceof kotlinx.coroutines.flow.FlowKt__ReduceKt.q
            if (r0 == 0) goto L13
            r0 = r5
            kotlinx.coroutines.flow.FlowKt__ReduceKt$q r0 = (kotlinx.coroutines.flow.FlowKt__ReduceKt.q) r0
            int r1 = r0.f68001d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f68001d = r1
            goto L18
        L13:
            kotlinx.coroutines.flow.FlowKt__ReduceKt$q r0 = new kotlinx.coroutines.flow.FlowKt__ReduceKt$q
            r0.<init>(r5)
        L18:
            java.lang.Object r5 = r0.f68000c
            java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
            int r2 = r0.f68001d
            r3 = 1
            if (r2 == 0) goto L3b
            if (r2 != r3) goto L33
            java.lang.Object r4 = r0.f67999b
            kotlinx.coroutines.flow.FlowKt__ReduceKt$p r4 = (kotlinx.coroutines.flow.FlowKt__ReduceKt.p) r4
            java.lang.Object r1 = r0.f67998a
            kotlin.jvm.internal.Ref$ObjectRef r1 = (kotlin.jvm.internal.Ref.ObjectRef) r1
            kotlin.e.n(r5)     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L31
            goto L69
        L31:
            r5 = move-exception
            goto L5f
        L33:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L3b:
            kotlin.e.n(r5)
            kotlin.jvm.internal.Ref$ObjectRef r5 = new kotlin.jvm.internal.Ref$ObjectRef
            r5.<init>()
            h40.x0 r2 = kotlinx.coroutines.flow.internal.s.f68282a
            r5.element = r2
            kotlinx.coroutines.flow.FlowKt__ReduceKt$p r2 = new kotlinx.coroutines.flow.FlowKt__ReduceKt$p
            r2.<init>(r5)
            r0.f67998a = r5     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L5b
            r0.f67999b = r2     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L5b
            r0.f68001d = r3     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L5b
            java.lang.Object r4 = r4.collect(r2, r0)     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L5b
            if (r4 != r1) goto L59
            return r1
        L59:
            r1 = r5
            goto L69
        L5b:
            r4 = move-exception
            r1 = r5
            r5 = r4
            r4 = r2
        L5f:
            kotlinx.coroutines.flow.internal.o.b(r5, r4)
            kotlin.coroutines.d r4 = r0.getContext()
            c40.n2.z(r4)
        L69:
            T r4 = r1.element
            h40.x0 r5 = kotlinx.coroutines.flow.internal.s.f68282a
            if (r4 != r5) goto L70
            r4 = 0
        L70:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.FlowKt__ReduceKt.k(kotlinx.coroutines.flow.i, j00.c):java.lang.Object");
    }
}
