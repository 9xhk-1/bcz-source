package kotlinx.coroutines.flow;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.u0;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class d<T> implements c<T> {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final i<T> f68102a;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @u0({"SMAP\nContext.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Context.kt\nkotlinx/coroutines/flow/CancellableFlowImpl$collect$2\n+ 2 CoroutineScope.kt\nkotlinx/coroutines/CoroutineScopeKt\n*L\n1#1,288:1\n375#2:289\n*S KotlinDebug\n*F\n+ 1 Context.kt\nkotlinx/coroutines/flow/CancellableFlowImpl$collect$2\n*L\n277#1:289\n*E\n"})
    public static final class a<T> implements j {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ j<T> f68103a;

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        @l00.d(c = "kotlinx.coroutines.flow.CancellableFlowImpl$collect$2", f = "Context.kt", i = {}, l = {278}, m = "emit", n = {}, s = {})
        /* renamed from: kotlinx.coroutines.flow.d$a$a, reason: collision with other inner class name */
        public static final class C0806a extends ContinuationImpl {

            /* renamed from: a, reason: collision with root package name */
            public /* synthetic */ Object f68104a;

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ a<T> f68105b;

            /* renamed from: c, reason: collision with root package name */
            public int f68106c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public C0806a(a<? super T> aVar, j00.c<? super C0806a> cVar) {
                super(cVar);
                this.f68105b = aVar;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                this.f68104a = obj;
                this.f68106c |= Integer.MIN_VALUE;
                return this.f68105b.emit(null, this);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public a(j<? super T> jVar) {
            this.f68103a = jVar;
        }

        /* JADX WARN: Removed duplicated region for block: B:15:0x0031  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
        @Override // kotlinx.coroutines.flow.j
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object emit(T r5, j00.c<? super yz.g2> r6) {
            /*
                r4 = this;
                boolean r0 = r6 instanceof kotlinx.coroutines.flow.d.a.C0806a
                if (r0 == 0) goto L13
                r0 = r6
                kotlinx.coroutines.flow.d$a$a r0 = (kotlinx.coroutines.flow.d.a.C0806a) r0
                int r1 = r0.f68106c
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.f68106c = r1
                goto L18
            L13:
                kotlinx.coroutines.flow.d$a$a r0 = new kotlinx.coroutines.flow.d$a$a
                r0.<init>(r4, r6)
            L18:
                java.lang.Object r6 = r0.f68104a
                java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
                int r2 = r0.f68106c
                r3 = 1
                if (r2 == 0) goto L31
                if (r2 != r3) goto L29
                kotlin.e.n(r6)
                goto L46
            L29:
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                r5.<init>(r6)
                throw r5
            L31:
                kotlin.e.n(r6)
                kotlin.coroutines.d r6 = r0.getContext()
                c40.n2.z(r6)
                kotlinx.coroutines.flow.j<T> r6 = r4.f68103a
                r0.f68106c = r3
                java.lang.Object r5 = r6.emit(r5, r0)
                if (r5 != r1) goto L46
                return r1
            L46:
                yz.g2 r5 = yz.g2.f100423a
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.d.a.emit(java.lang.Object, j00.c):java.lang.Object");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public d(@m80.k i<? extends T> iVar) {
        this.f68102a = iVar;
    }

    @Override // kotlinx.coroutines.flow.i
    @m80.l
    public Object collect(@m80.k j<? super T> jVar, @m80.k j00.c<? super g2> cVar) {
        Object collect = this.f68102a.collect(new a(jVar), cVar);
        return collect == kotlin.coroutines.intrinsics.b.l() ? collect : g2.f100423a;
    }
}
