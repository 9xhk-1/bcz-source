package kotlinx.coroutines.flow;

import c40.n2;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.u0;
import kotlinx.coroutines.flow.internal.AbortFlowException;
import yz.g2;

/* JADX INFO: Add missing generic type declarations: [R] */
/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@l00.d(c = "kotlinx.coroutines.flow.FlowKt__LimitKt$transformWhile$1", f = "Limit.kt", i = {0}, l = {152}, m = "invokeSuspend", n = {"collector$iv"}, s = {"L$0"})
@u0({"SMAP\nLimit.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Limit.kt\nkotlinx/coroutines/flow/FlowKt__LimitKt$transformWhile$1\n+ 2 Limit.kt\nkotlinx/coroutines/flow/FlowKt__LimitKt\n*L\n1#1,141:1\n124#2,17:142\n*S KotlinDebug\n*F\n+ 1 Limit.kt\nkotlinx/coroutines/flow/FlowKt__LimitKt$transformWhile$1\n*L\n117#1:142,17\n*E\n"})
/* loaded from: classes8.dex */
public final class FlowKt__LimitKt$transformWhile$1<R> extends SuspendLambda implements x00.p<j<? super R>, j00.c<? super g2>, Object> {

    /* renamed from: a, reason: collision with root package name */
    public int f67904a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f67905b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ i<T> f67906c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ x00.q<j<? super R>, T, j00.c<? super Boolean>, Object> f67907d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public FlowKt__LimitKt$transformWhile$1(i<? extends T> iVar, x00.q<? super j<? super R>, ? super T, ? super j00.c<? super Boolean>, ? extends Object> qVar, j00.c<? super FlowKt__LimitKt$transformWhile$1> cVar) {
        super(2, cVar);
        this.f67906c = iVar;
        this.f67907d = qVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final j00.c<g2> create(Object obj, j00.c<?> cVar) {
        FlowKt__LimitKt$transformWhile$1 flowKt__LimitKt$transformWhile$1 = new FlowKt__LimitKt$transformWhile$1(this.f67906c, this.f67907d, cVar);
        flowKt__LimitKt$transformWhile$1.f67905b = obj;
        return flowKt__LimitKt$transformWhile$1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        FlowKt__LimitKt$transformWhile$1$invokeSuspend$$inlined$collectWhile$1 flowKt__LimitKt$transformWhile$1$invokeSuspend$$inlined$collectWhile$1;
        Object l11 = kotlin.coroutines.intrinsics.b.l();
        int i11 = this.f67904a;
        if (i11 == 0) {
            kotlin.e.n(obj);
            j jVar = (j) this.f67905b;
            i<T> iVar = this.f67906c;
            FlowKt__LimitKt$transformWhile$1$invokeSuspend$$inlined$collectWhile$1 flowKt__LimitKt$transformWhile$1$invokeSuspend$$inlined$collectWhile$12 = new FlowKt__LimitKt$transformWhile$1$invokeSuspend$$inlined$collectWhile$1(this.f67907d, jVar);
            try {
                this.f67905b = flowKt__LimitKt$transformWhile$1$invokeSuspend$$inlined$collectWhile$12;
                this.f67904a = 1;
                if (iVar.collect(flowKt__LimitKt$transformWhile$1$invokeSuspend$$inlined$collectWhile$12, this) == l11) {
                    return l11;
                }
            } catch (AbortFlowException e11) {
                e = e11;
                flowKt__LimitKt$transformWhile$1$invokeSuspend$$inlined$collectWhile$1 = flowKt__LimitKt$transformWhile$1$invokeSuspend$$inlined$collectWhile$12;
                kotlinx.coroutines.flow.internal.o.b(e, flowKt__LimitKt$transformWhile$1$invokeSuspend$$inlined$collectWhile$1);
                n2.z(getContext());
                return g2.f100423a;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            flowKt__LimitKt$transformWhile$1$invokeSuspend$$inlined$collectWhile$1 = (FlowKt__LimitKt$transformWhile$1$invokeSuspend$$inlined$collectWhile$1) this.f67905b;
            try {
                kotlin.e.n(obj);
            } catch (AbortFlowException e12) {
                e = e12;
                kotlinx.coroutines.flow.internal.o.b(e, flowKt__LimitKt$transformWhile$1$invokeSuspend$$inlined$collectWhile$1);
                n2.z(getContext());
                return g2.f100423a;
            }
        }
        return g2.f100423a;
    }

    @Override // x00.p
    public final Object invoke(j<? super R> jVar, j00.c<? super g2> cVar) {
        return ((FlowKt__LimitKt$transformWhile$1) create(jVar, cVar)).invokeSuspend(g2.f100423a);
    }
}
