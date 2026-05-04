package androidx.lifecycle;

import kotlin.coroutines.jvm.internal.SuspendLambda;
import m80.k;
import m80.l;
import x00.p;
import yz.g2;

/* JADX INFO: Add missing generic type declarations: [T] */
/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@l00.d(c = "androidx.lifecycle.FlowLiveDataConversions$asLiveData$1", f = "FlowLiveData.kt", i = {}, l = {78}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes2.dex */
public final class FlowLiveDataConversions$asLiveData$1<T> extends SuspendLambda implements p<LiveDataScope<T>, j00.c<? super g2>, Object> {
    final /* synthetic */ kotlinx.coroutines.flow.i<T> $this_asLiveData;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public FlowLiveDataConversions$asLiveData$1(kotlinx.coroutines.flow.i<? extends T> iVar, j00.c<? super FlowLiveDataConversions$asLiveData$1> cVar) {
        super(2, cVar);
        this.$this_asLiveData = iVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @k
    public final j00.c<g2> create(@l Object obj, @k j00.c<?> cVar) {
        FlowLiveDataConversions$asLiveData$1 flowLiveDataConversions$asLiveData$1 = new FlowLiveDataConversions$asLiveData$1(this.$this_asLiveData, cVar);
        flowLiveDataConversions$asLiveData$1.L$0 = obj;
        return flowLiveDataConversions$asLiveData$1;
    }

    @Override // x00.p
    @l
    public final Object invoke(@k LiveDataScope<T> liveDataScope, @l j00.c<? super g2> cVar) {
        return ((FlowLiveDataConversions$asLiveData$1) create(liveDataScope, cVar)).invokeSuspend(g2.f100423a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @l
    public final Object invokeSuspend(@k Object obj) {
        Object l11 = kotlin.coroutines.intrinsics.b.l();
        int i11 = this.label;
        if (i11 == 0) {
            kotlin.e.n(obj);
            final LiveDataScope liveDataScope = (LiveDataScope) this.L$0;
            kotlinx.coroutines.flow.i<T> iVar = this.$this_asLiveData;
            kotlinx.coroutines.flow.j<? super T> jVar = new kotlinx.coroutines.flow.j() { // from class: androidx.lifecycle.FlowLiveDataConversions$asLiveData$1.1
                @Override // kotlinx.coroutines.flow.j
                @l
                public final Object emit(T t11, @k j00.c<? super g2> cVar) {
                    Object emit = liveDataScope.emit(t11, cVar);
                    return emit == kotlin.coroutines.intrinsics.b.l() ? emit : g2.f100423a;
                }
            };
            this.label = 1;
            if (iVar.collect(jVar, this) == l11) {
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
