package io.ktor.util.pipeline;

import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.g0;
import x00.q;
import yz.g2;

/* JADX INFO: Add missing generic type declarations: [TContext] */
/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@l00.d(c = "io.ktor.util.pipeline.PipelineKt$intercept$1", f = "Pipeline.kt", i = {}, l = {504}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes8.dex */
public final class PipelineKt$intercept$1<TContext> extends SuspendLambda implements q<d<? extends Object, TContext>, Object, j00.c<? super g2>, Object> {
    final /* synthetic */ q<d<TSubject, TContext>, TSubject, j00.c<? super g2>, Object> $block;
    private /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public PipelineKt$intercept$1(q<? super d<TSubject, TContext>, ? super TSubject, ? super j00.c<? super g2>, ? extends Object> qVar, j00.c<? super PipelineKt$intercept$1> cVar) {
        super(3, cVar);
        this.$block = qVar;
    }

    @Override // x00.q
    public final Object invoke(d<? extends Object, TContext> dVar, Object obj, j00.c<? super g2> cVar) {
        PipelineKt$intercept$1 pipelineKt$intercept$1 = new PipelineKt$intercept$1(this.$block, cVar);
        pipelineKt$intercept$1.L$0 = dVar;
        pipelineKt$intercept$1.L$1 = obj;
        return pipelineKt$intercept$1.invokeSuspend(g2.f100423a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object l11 = kotlin.coroutines.intrinsics.b.l();
        int i11 = this.label;
        if (i11 == 0) {
            kotlin.e.n(obj);
            d dVar = (d) this.L$0;
            Object obj2 = this.L$1;
            g0.y(3, "TSubject");
            if (obj2 == null) {
                return g2.f100423a;
            }
            if (dVar == null) {
                dVar = null;
            }
            if (dVar != null) {
                q<d<TSubject, TContext>, TSubject, j00.c<? super g2>, Object> qVar = this.$block;
                this.L$0 = null;
                this.label = 1;
                if (qVar.invoke(dVar, obj2, this) == l11) {
                    return l11;
                }
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
