package kotlinx.coroutines.flow.internal;

import c40.l2;
import c40.r0;
import e40.g0;
import e40.i0;
import e40.k0;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.channels.BufferOverflow;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class f<T> extends d<T> {

    /* renamed from: d, reason: collision with root package name */
    @m80.k
    public final kotlinx.coroutines.flow.i<kotlinx.coroutines.flow.i<T>> f68168d;

    /* renamed from: e, reason: collision with root package name */
    public final int f68169e;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a<T> implements kotlinx.coroutines.flow.j {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ l2 f68170a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ n40.h f68171b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ i0<T> f68172c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ w<T> f68173d;

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        @l00.d(c = "kotlinx.coroutines.flow.internal.ChannelFlowMerge$collectTo$2$1", f = "Merge.kt", i = {}, l = {65}, m = "invokeSuspend", n = {}, s = {})
        /* renamed from: kotlinx.coroutines.flow.internal.f$a$a, reason: collision with other inner class name */
        public static final class C0808a extends SuspendLambda implements x00.p<r0, j00.c<? super g2>, Object> {

            /* renamed from: a, reason: collision with root package name */
            public int f68174a;

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ kotlinx.coroutines.flow.i<T> f68175b;

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ w<T> f68176c;

            /* renamed from: d, reason: collision with root package name */
            public final /* synthetic */ n40.h f68177d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public C0808a(kotlinx.coroutines.flow.i<? extends T> iVar, w<T> wVar, n40.h hVar, j00.c<? super C0808a> cVar) {
                super(2, cVar);
                this.f68175b = iVar;
                this.f68176c = wVar;
                this.f68177d = hVar;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final j00.c<g2> create(Object obj, j00.c<?> cVar) {
                return new C0808a(this.f68175b, this.f68176c, this.f68177d, cVar);
            }

            @Override // x00.p
            public final Object invoke(r0 r0Var, j00.c<? super g2> cVar) {
                return ((C0808a) create(r0Var, cVar)).invokeSuspend(g2.f100423a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object l11 = kotlin.coroutines.intrinsics.b.l();
                int i11 = this.f68174a;
                try {
                    if (i11 == 0) {
                        kotlin.e.n(obj);
                        kotlinx.coroutines.flow.i<T> iVar = this.f68175b;
                        w<T> wVar = this.f68176c;
                        this.f68174a = 1;
                        if (iVar.collect(wVar, this) == l11) {
                            return l11;
                        }
                    } else {
                        if (i11 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        kotlin.e.n(obj);
                    }
                    this.f68177d.release();
                    return g2.f100423a;
                } catch (Throwable th2) {
                    this.f68177d.release();
                    throw th2;
                }
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        @l00.d(c = "kotlinx.coroutines.flow.internal.ChannelFlowMerge$collectTo$2", f = "Merge.kt", i = {0, 0}, l = {62}, m = "emit", n = {"this", "inner"}, s = {"L$0", "L$1"})
        public static final class b extends ContinuationImpl {

            /* renamed from: a, reason: collision with root package name */
            public Object f68178a;

            /* renamed from: b, reason: collision with root package name */
            public Object f68179b;

            /* renamed from: c, reason: collision with root package name */
            public /* synthetic */ Object f68180c;

            /* renamed from: d, reason: collision with root package name */
            public final /* synthetic */ a<T> f68181d;

            /* renamed from: e, reason: collision with root package name */
            public int f68182e;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public b(a<? super T> aVar, j00.c<? super b> cVar) {
                super(cVar);
                this.f68181d = aVar;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                this.f68180c = obj;
                this.f68182e |= Integer.MIN_VALUE;
                return this.f68181d.emit(null, this);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public a(l2 l2Var, n40.h hVar, i0<? super T> i0Var, w<T> wVar) {
            this.f68170a = l2Var;
            this.f68171b = hVar;
            this.f68172c = i0Var;
            this.f68173d = wVar;
        }

        /* JADX WARN: Removed duplicated region for block: B:15:0x0039  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
        @Override // kotlinx.coroutines.flow.j
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object emit(kotlinx.coroutines.flow.i<? extends T> r8, j00.c<? super yz.g2> r9) {
            /*
                r7 = this;
                boolean r0 = r9 instanceof kotlinx.coroutines.flow.internal.f.a.b
                if (r0 == 0) goto L13
                r0 = r9
                kotlinx.coroutines.flow.internal.f$a$b r0 = (kotlinx.coroutines.flow.internal.f.a.b) r0
                int r1 = r0.f68182e
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.f68182e = r1
                goto L18
            L13:
                kotlinx.coroutines.flow.internal.f$a$b r0 = new kotlinx.coroutines.flow.internal.f$a$b
                r0.<init>(r7, r9)
            L18:
                java.lang.Object r9 = r0.f68180c
                java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
                int r2 = r0.f68182e
                r3 = 1
                if (r2 == 0) goto L39
                if (r2 != r3) goto L31
                java.lang.Object r8 = r0.f68179b
                kotlinx.coroutines.flow.i r8 = (kotlinx.coroutines.flow.i) r8
                java.lang.Object r0 = r0.f68178a
                kotlinx.coroutines.flow.internal.f$a r0 = (kotlinx.coroutines.flow.internal.f.a) r0
                kotlin.e.n(r9)
                goto L53
            L31:
                java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
                r8.<init>(r9)
                throw r8
            L39:
                kotlin.e.n(r9)
                c40.l2 r9 = r7.f68170a
                if (r9 == 0) goto L43
                c40.n2.y(r9)
            L43:
                n40.h r9 = r7.f68171b
                r0.f68178a = r7
                r0.f68179b = r8
                r0.f68182e = r3
                java.lang.Object r9 = r9.a(r0)
                if (r9 != r1) goto L52
                return r1
            L52:
                r0 = r7
            L53:
                e40.i0<T> r1 = r0.f68172c
                kotlinx.coroutines.flow.internal.f$a$a r4 = new kotlinx.coroutines.flow.internal.f$a$a
                kotlinx.coroutines.flow.internal.w<T> r9 = r0.f68173d
                n40.h r0 = r0.f68171b
                r2 = 0
                r4.<init>(r8, r9, r0, r2)
                r5 = 3
                r6 = 0
                r3 = 0
                c40.i.e(r1, r2, r3, r4, r5, r6)
                yz.g2 r8 = yz.g2.f100423a
                return r8
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.internal.f.a.emit(kotlinx.coroutines.flow.i, j00.c):java.lang.Object");
        }
    }

    public /* synthetic */ f(kotlinx.coroutines.flow.i iVar, int i11, kotlin.coroutines.d dVar, int i12, BufferOverflow bufferOverflow, int i13, kotlin.jvm.internal.v vVar) {
        this(iVar, i11, (i13 & 4) != 0 ? EmptyCoroutineContext.INSTANCE : dVar, (i13 & 8) != 0 ? -2 : i12, (i13 & 16) != 0 ? BufferOverflow.SUSPEND : bufferOverflow);
    }

    @Override // kotlinx.coroutines.flow.internal.d
    @m80.k
    public String g() {
        return "concurrency=" + this.f68169e;
    }

    @Override // kotlinx.coroutines.flow.internal.d
    @m80.l
    public Object i(@m80.k i0<? super T> i0Var, @m80.k j00.c<? super g2> cVar) {
        Object collect = this.f68168d.collect(new a((l2) cVar.getContext().get(l2.f7886e0), n40.l.b(this.f68169e, 0, 2, null), i0Var, new w(i0Var)), cVar);
        return collect == kotlin.coroutines.intrinsics.b.l() ? collect : g2.f100423a;
    }

    @Override // kotlinx.coroutines.flow.internal.d
    @m80.k
    public d<T> j(@m80.k kotlin.coroutines.d dVar, int i11, @m80.k BufferOverflow bufferOverflow) {
        return new f(this.f68168d, this.f68169e, dVar, i11, bufferOverflow);
    }

    @Override // kotlinx.coroutines.flow.internal.d
    @m80.k
    public k0<T> n(@m80.k r0 r0Var) {
        return g0.g(r0Var, this.f68158a, this.f68159b, l());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public f(@m80.k kotlinx.coroutines.flow.i<? extends kotlinx.coroutines.flow.i<? extends T>> iVar, int i11, @m80.k kotlin.coroutines.d dVar, int i12, @m80.k BufferOverflow bufferOverflow) {
        super(dVar, i12, bufferOverflow);
        this.f68168d = iVar;
        this.f68169e = i11;
    }
}
