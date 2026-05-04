package kotlinx.coroutines.flow.internal;

import c40.r0;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.u0;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nFlowCoroutine.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FlowCoroutine.kt\nkotlinx/coroutines/flow/internal/FlowCoroutineKt\n+ 2 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt\n*L\n1#1,59:1\n105#2:60\n*S KotlinDebug\n*F\n+ 1 FlowCoroutine.kt\nkotlinx/coroutines/flow/internal/FlowCoroutineKt\n*L\n46#1:60\n*E\n"})
/* loaded from: classes8.dex */
public final class n {

    /* JADX INFO: Add missing generic type declarations: [R] */
    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @u0({"SMAP\nSafeCollector.common.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1\n+ 2 FlowCoroutine.kt\nkotlinx/coroutines/flow/internal/FlowCoroutineKt\n*L\n1#1,108:1\n47#2,2:109\n*E\n"})
    public static final class a<R> implements kotlinx.coroutines.flow.i<R> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ x00.q f68274a;

        public a(x00.q qVar) {
            this.f68274a = qVar;
        }

        @Override // kotlinx.coroutines.flow.i
        public Object collect(kotlinx.coroutines.flow.j<? super R> jVar, j00.c<? super g2> cVar) {
            Object a11 = n.a(new b(this.f68274a, jVar, null), cVar);
            return a11 == kotlin.coroutines.intrinsics.b.l() ? a11 : g2.f100423a;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "kotlinx.coroutines.flow.internal.FlowCoroutineKt$scopedFlow$1$1", f = "FlowCoroutine.kt", i = {}, l = {47}, m = "invokeSuspend", n = {}, s = {})
    public static final class b extends SuspendLambda implements x00.p<r0, j00.c<? super g2>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f68275a;

        /* renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f68276b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ x00.q<r0, kotlinx.coroutines.flow.j<? super R>, j00.c<? super g2>, Object> f68277c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ kotlinx.coroutines.flow.j<R> f68278d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public b(x00.q<? super r0, ? super kotlinx.coroutines.flow.j<? super R>, ? super j00.c<? super g2>, ? extends Object> qVar, kotlinx.coroutines.flow.j<? super R> jVar, j00.c<? super b> cVar) {
            super(2, cVar);
            this.f68277c = qVar;
            this.f68278d = jVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final j00.c<g2> create(Object obj, j00.c<?> cVar) {
            b bVar = new b(this.f68277c, this.f68278d, cVar);
            bVar.f68276b = obj;
            return bVar;
        }

        @Override // x00.p
        public final Object invoke(r0 r0Var, j00.c<? super g2> cVar) {
            return ((b) create(r0Var, cVar)).invokeSuspend(g2.f100423a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object l11 = kotlin.coroutines.intrinsics.b.l();
            int i11 = this.f68275a;
            if (i11 == 0) {
                kotlin.e.n(obj);
                r0 r0Var = (r0) this.f68276b;
                x00.q<r0, kotlinx.coroutines.flow.j<? super R>, j00.c<? super g2>, Object> qVar = this.f68277c;
                Object obj2 = this.f68278d;
                this.f68275a = 1;
                if (qVar.invoke(r0Var, obj2, this) == l11) {
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

    @m80.l
    public static final <R> Object a(@yz.b @m80.k x00.p<? super r0, ? super j00.c<? super R>, ? extends Object> pVar, @m80.k j00.c<? super R> cVar) {
        m mVar = new m(cVar.getContext(), cVar);
        Object d11 = i40.b.d(mVar, mVar, pVar);
        if (d11 == kotlin.coroutines.intrinsics.b.l()) {
            l00.f.c(cVar);
        }
        return d11;
    }

    @m80.k
    public static final <R> kotlinx.coroutines.flow.i<R> b(@yz.b @m80.k x00.q<? super r0, ? super kotlinx.coroutines.flow.j<? super R>, ? super j00.c<? super g2>, ? extends Object> qVar) {
        return new a(qVar);
    }
}
