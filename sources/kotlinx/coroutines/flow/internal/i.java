package kotlinx.coroutines.flow.internal;

import c40.l2;
import c40.r0;
import c40.s0;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.u0;
import kotlinx.coroutines.channels.BufferOverflow;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nMerge.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Merge.kt\nkotlinx/coroutines/flow/internal/ChannelFlowTransformLatest\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,96:1\n1#2:97\n*E\n"})
/* loaded from: classes8.dex */
public final class i<T, R> extends g<T, R> {

    /* renamed from: e, reason: collision with root package name */
    @m80.k
    public final x00.q<kotlinx.coroutines.flow.j<? super R>, T, j00.c<? super g2>, Object> f68187e;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "kotlinx.coroutines.flow.internal.ChannelFlowTransformLatest$flowCollect$3", f = "Merge.kt", i = {}, l = {23}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements x00.p<r0, j00.c<? super g2>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f68188a;

        /* renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f68189b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ i<T, R> f68190c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ kotlinx.coroutines.flow.j<R> f68191d;

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        /* renamed from: kotlinx.coroutines.flow.internal.i$a$a, reason: collision with other inner class name */
        public static final class C0809a<T> implements kotlinx.coroutines.flow.j {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ Ref.ObjectRef<l2> f68192a;

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ r0 f68193b;

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ i<T, R> f68194c;

            /* renamed from: d, reason: collision with root package name */
            public final /* synthetic */ kotlinx.coroutines.flow.j<R> f68195d;

            /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
            @l00.d(c = "kotlinx.coroutines.flow.internal.ChannelFlowTransformLatest$flowCollect$3$1$2", f = "Merge.kt", i = {}, l = {30}, m = "invokeSuspend", n = {}, s = {})
            /* renamed from: kotlinx.coroutines.flow.internal.i$a$a$a, reason: collision with other inner class name */
            public static final class C0810a extends SuspendLambda implements x00.p<r0, j00.c<? super g2>, Object> {

                /* renamed from: a, reason: collision with root package name */
                public int f68196a;

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ i<T, R> f68197b;

                /* renamed from: c, reason: collision with root package name */
                public final /* synthetic */ kotlinx.coroutines.flow.j<R> f68198c;

                /* renamed from: d, reason: collision with root package name */
                public final /* synthetic */ T f68199d;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                public C0810a(i<T, R> iVar, kotlinx.coroutines.flow.j<? super R> jVar, T t11, j00.c<? super C0810a> cVar) {
                    super(2, cVar);
                    this.f68197b = iVar;
                    this.f68198c = jVar;
                    this.f68199d = t11;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final j00.c<g2> create(Object obj, j00.c<?> cVar) {
                    return new C0810a(this.f68197b, this.f68198c, this.f68199d, cVar);
                }

                @Override // x00.p
                public final Object invoke(r0 r0Var, j00.c<? super g2> cVar) {
                    return ((C0810a) create(r0Var, cVar)).invokeSuspend(g2.f100423a);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    Object l11 = kotlin.coroutines.intrinsics.b.l();
                    int i11 = this.f68196a;
                    if (i11 == 0) {
                        kotlin.e.n(obj);
                        x00.q qVar = this.f68197b.f68187e;
                        kotlinx.coroutines.flow.j<R> jVar = this.f68198c;
                        T t11 = this.f68199d;
                        this.f68196a = 1;
                        if (qVar.invoke(jVar, t11, this) == l11) {
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
            @l00.d(c = "kotlinx.coroutines.flow.internal.ChannelFlowTransformLatest$flowCollect$3$1", f = "Merge.kt", i = {0, 0}, l = {26}, m = "emit", n = {"this", "value"}, s = {"L$0", "L$1"})
            /* renamed from: kotlinx.coroutines.flow.internal.i$a$a$b */
            public static final class b extends ContinuationImpl {

                /* renamed from: a, reason: collision with root package name */
                public Object f68200a;

                /* renamed from: b, reason: collision with root package name */
                public Object f68201b;

                /* renamed from: c, reason: collision with root package name */
                public Object f68202c;

                /* renamed from: d, reason: collision with root package name */
                public /* synthetic */ Object f68203d;

                /* renamed from: e, reason: collision with root package name */
                public final /* synthetic */ C0809a<T> f68204e;

                /* renamed from: f, reason: collision with root package name */
                public int f68205f;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                public b(C0809a<? super T> c0809a, j00.c<? super b> cVar) {
                    super(cVar);
                    this.f68204e = c0809a;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    this.f68203d = obj;
                    this.f68205f |= Integer.MIN_VALUE;
                    return this.f68204e.emit(null, this);
                }
            }

            /* JADX WARN: Multi-variable type inference failed */
            public C0809a(Ref.ObjectRef<l2> objectRef, r0 r0Var, i<T, R> iVar, kotlinx.coroutines.flow.j<? super R> jVar) {
                this.f68192a = objectRef;
                this.f68193b = r0Var;
                this.f68194c = iVar;
                this.f68195d = jVar;
            }

            /* JADX WARN: Removed duplicated region for block: B:15:0x003b  */
            /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
            @Override // kotlinx.coroutines.flow.j
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object emit(T r8, j00.c<? super yz.g2> r9) {
                /*
                    r7 = this;
                    boolean r0 = r9 instanceof kotlinx.coroutines.flow.internal.i.a.C0809a.b
                    if (r0 == 0) goto L13
                    r0 = r9
                    kotlinx.coroutines.flow.internal.i$a$a$b r0 = (kotlinx.coroutines.flow.internal.i.a.C0809a.b) r0
                    int r1 = r0.f68205f
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.f68205f = r1
                    goto L18
                L13:
                    kotlinx.coroutines.flow.internal.i$a$a$b r0 = new kotlinx.coroutines.flow.internal.i$a$a$b
                    r0.<init>(r7, r9)
                L18:
                    java.lang.Object r9 = r0.f68203d
                    java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
                    int r2 = r0.f68205f
                    r3 = 1
                    if (r2 == 0) goto L3b
                    if (r2 != r3) goto L33
                    java.lang.Object r8 = r0.f68202c
                    c40.l2 r8 = (c40.l2) r8
                    java.lang.Object r8 = r0.f68201b
                    java.lang.Object r0 = r0.f68200a
                    kotlinx.coroutines.flow.internal.i$a$a r0 = (kotlinx.coroutines.flow.internal.i.a.C0809a) r0
                    kotlin.e.n(r9)
                    goto L5e
                L33:
                    java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                    java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
                    r8.<init>(r9)
                    throw r8
                L3b:
                    kotlin.e.n(r9)
                    kotlin.jvm.internal.Ref$ObjectRef<c40.l2> r9 = r7.f68192a
                    T r9 = r9.element
                    c40.l2 r9 = (c40.l2) r9
                    if (r9 == 0) goto L5d
                    kotlinx.coroutines.flow.internal.ChildCancelledException r2 = new kotlinx.coroutines.flow.internal.ChildCancelledException
                    r2.<init>()
                    r9.cancel(r2)
                    r0.f68200a = r7
                    r0.f68201b = r8
                    r0.f68202c = r9
                    r0.f68205f = r3
                    java.lang.Object r9 = r9.K0(r0)
                    if (r9 != r1) goto L5d
                    return r1
                L5d:
                    r0 = r7
                L5e:
                    kotlin.jvm.internal.Ref$ObjectRef<c40.l2> r9 = r0.f68192a
                    c40.r0 r1 = r0.f68193b
                    kotlinx.coroutines.CoroutineStart r3 = kotlinx.coroutines.CoroutineStart.UNDISPATCHED
                    kotlinx.coroutines.flow.internal.i$a$a$a r4 = new kotlinx.coroutines.flow.internal.i$a$a$a
                    kotlinx.coroutines.flow.internal.i<T, R> r2 = r0.f68194c
                    kotlinx.coroutines.flow.j<R> r0 = r0.f68195d
                    r5 = 0
                    r4.<init>(r2, r0, r8, r5)
                    r5 = 1
                    r6 = 0
                    r2 = 0
                    c40.l2 r8 = c40.i.e(r1, r2, r3, r4, r5, r6)
                    r9.element = r8
                    yz.g2 r8 = yz.g2.f100423a
                    return r8
                */
                throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.internal.i.a.C0809a.emit(java.lang.Object, j00.c):java.lang.Object");
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(i<T, R> iVar, kotlinx.coroutines.flow.j<? super R> jVar, j00.c<? super a> cVar) {
            super(2, cVar);
            this.f68190c = iVar;
            this.f68191d = jVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final j00.c<g2> create(Object obj, j00.c<?> cVar) {
            a aVar = new a(this.f68190c, this.f68191d, cVar);
            aVar.f68189b = obj;
            return aVar;
        }

        @Override // x00.p
        public final Object invoke(r0 r0Var, j00.c<? super g2> cVar) {
            return ((a) create(r0Var, cVar)).invokeSuspend(g2.f100423a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object l11 = kotlin.coroutines.intrinsics.b.l();
            int i11 = this.f68188a;
            if (i11 == 0) {
                kotlin.e.n(obj);
                r0 r0Var = (r0) this.f68189b;
                Ref.ObjectRef objectRef = new Ref.ObjectRef();
                i<T, R> iVar = this.f68190c;
                kotlinx.coroutines.flow.i<S> iVar2 = iVar.f68183d;
                C0809a c0809a = new C0809a(objectRef, r0Var, iVar, this.f68191d);
                this.f68188a = 1;
                if (iVar2.collect(c0809a, this) == l11) {
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

    public /* synthetic */ i(x00.q qVar, kotlinx.coroutines.flow.i iVar, kotlin.coroutines.d dVar, int i11, BufferOverflow bufferOverflow, int i12, kotlin.jvm.internal.v vVar) {
        this(qVar, iVar, (i12 & 4) != 0 ? EmptyCoroutineContext.INSTANCE : dVar, (i12 & 8) != 0 ? -2 : i11, (i12 & 16) != 0 ? BufferOverflow.SUSPEND : bufferOverflow);
    }

    @Override // kotlinx.coroutines.flow.internal.d
    @m80.k
    public d<R> j(@m80.k kotlin.coroutines.d dVar, int i11, @m80.k BufferOverflow bufferOverflow) {
        return new i(this.f68187e, this.f68183d, dVar, i11, bufferOverflow);
    }

    @Override // kotlinx.coroutines.flow.internal.g
    @m80.l
    public Object s(@m80.k kotlinx.coroutines.flow.j<? super R> jVar, @m80.k j00.c<? super g2> cVar) {
        Object g11 = s0.g(new a(this, jVar, null), cVar);
        return g11 == kotlin.coroutines.intrinsics.b.l() ? g11 : g2.f100423a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public i(@m80.k x00.q<? super kotlinx.coroutines.flow.j<? super R>, ? super T, ? super j00.c<? super g2>, ? extends Object> qVar, @m80.k kotlinx.coroutines.flow.i<? extends T> iVar, @m80.k kotlin.coroutines.d dVar, int i11, @m80.k BufferOverflow bufferOverflow) {
        super(iVar, dVar, i11, bufferOverflow);
        this.f68187e = qVar;
    }
}
