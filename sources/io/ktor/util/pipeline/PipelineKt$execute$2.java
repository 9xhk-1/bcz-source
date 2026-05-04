package io.ktor.util.pipeline;

import kotlin.coroutines.jvm.internal.SuspendLambda;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@l00.d(c = "io.ktor.util.pipeline.PipelineKt$execute$2", f = "Pipeline.kt", i = {}, l = {488}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes8.dex */
public final class PipelineKt$execute$2 extends SuspendLambda implements x00.l<j00.c<? super g2>, Object> {
    final /* synthetic */ TContext $context;
    final /* synthetic */ c<g2, TContext> $this_execute;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PipelineKt$execute$2(c<g2, TContext> cVar, TContext tcontext, j00.c<? super PipelineKt$execute$2> cVar2) {
        super(1, cVar2);
        this.$this_execute = cVar;
        this.$context = tcontext;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final j00.c<g2> create(j00.c<?> cVar) {
        return new PipelineKt$execute$2(this.$this_execute, this.$context, cVar);
    }

    @Override // x00.l
    public final Object invoke(j00.c<? super g2> cVar) {
        return ((PipelineKt$execute$2) create(cVar)).invokeSuspend(g2.f100423a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object l11 = kotlin.coroutines.intrinsics.b.l();
        int i11 = this.label;
        if (i11 == 0) {
            kotlin.e.n(obj);
            c<g2, TContext> cVar = this.$this_execute;
            TContext tcontext = this.$context;
            g2 g2Var = g2.f100423a;
            this.label = 1;
            if (cVar.p(tcontext, g2Var, this) == l11) {
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
