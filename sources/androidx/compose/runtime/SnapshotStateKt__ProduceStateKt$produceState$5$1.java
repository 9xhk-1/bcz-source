package androidx.compose.runtime;

import c40.r0;
import j00.c;
import kotlin.coroutines.intrinsics.b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.e;
import l00.d;
import x00.p;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@d(c = "androidx.compose.runtime.SnapshotStateKt__ProduceStateKt$produceState$5$1", f = "ProduceState.kt", i = {}, l = {201}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes.dex */
public final class SnapshotStateKt__ProduceStateKt$produceState$5$1 extends SuspendLambda implements p<r0, c<? super g2>, Object> {
    final /* synthetic */ p<ProduceStateScope<T>, c<? super g2>, Object> $producer;
    final /* synthetic */ MutableState<T> $result;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public SnapshotStateKt__ProduceStateKt$produceState$5$1(p<? super ProduceStateScope<T>, ? super c<? super g2>, ? extends Object> pVar, MutableState<T> mutableState, c<? super SnapshotStateKt__ProduceStateKt$produceState$5$1> cVar) {
        super(2, cVar);
        this.$producer = pVar;
        this.$result = mutableState;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final c<g2> create(Object obj, c<?> cVar) {
        SnapshotStateKt__ProduceStateKt$produceState$5$1 snapshotStateKt__ProduceStateKt$produceState$5$1 = new SnapshotStateKt__ProduceStateKt$produceState$5$1(this.$producer, this.$result, cVar);
        snapshotStateKt__ProduceStateKt$produceState$5$1.L$0 = obj;
        return snapshotStateKt__ProduceStateKt$produceState$5$1;
    }

    @Override // x00.p
    public final Object invoke(r0 r0Var, c<? super g2> cVar) {
        return ((SnapshotStateKt__ProduceStateKt$produceState$5$1) create(r0Var, cVar)).invokeSuspend(g2.f100423a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object l11 = b.l();
        int i11 = this.label;
        if (i11 == 0) {
            e.n(obj);
            r0 r0Var = (r0) this.L$0;
            p<ProduceStateScope<T>, c<? super g2>, Object> pVar = this.$producer;
            ProduceStateScopeImpl produceStateScopeImpl = new ProduceStateScopeImpl(this.$result, r0Var.getCoroutineContext());
            this.label = 1;
            if (pVar.invoke(produceStateScopeImpl, this) == l11) {
                return l11;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            e.n(obj);
        }
        return g2.f100423a;
    }
}
