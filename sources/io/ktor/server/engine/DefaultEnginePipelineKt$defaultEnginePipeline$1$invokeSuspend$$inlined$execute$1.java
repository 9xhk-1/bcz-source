package io.ktor.server.engine;

import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@l00.d(c = "io.ktor.util.pipeline.PipelineKt$execute$2", f = "Pipeline.kt", i = {}, l = {488}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes8.dex */
public final class DefaultEnginePipelineKt$defaultEnginePipeline$1$invokeSuspend$$inlined$execute$1 extends SuspendLambda implements x00.l<j00.c<? super yz.g2>, Object> {
    final /* synthetic */ Object $context;
    final /* synthetic */ io.ktor.util.pipeline.c $this_execute;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DefaultEnginePipelineKt$defaultEnginePipeline$1$invokeSuspend$$inlined$execute$1(io.ktor.util.pipeline.c cVar, Object obj, j00.c cVar2) {
        super(1, cVar2);
        this.$this_execute = cVar;
        this.$context = obj;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final j00.c<yz.g2> create(j00.c<?> cVar) {
        return new DefaultEnginePipelineKt$defaultEnginePipeline$1$invokeSuspend$$inlined$execute$1(this.$this_execute, this.$context, cVar);
    }

    @Override // x00.l
    public final Object invoke(j00.c<? super yz.g2> cVar) {
        return ((DefaultEnginePipelineKt$defaultEnginePipeline$1$invokeSuspend$$inlined$execute$1) create(cVar)).invokeSuspend(yz.g2.f100423a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object l11 = kotlin.coroutines.intrinsics.b.l();
        int i11 = this.label;
        if (i11 == 0) {
            kotlin.e.n(obj);
            io.ktor.util.pipeline.c cVar = this.$this_execute;
            Object obj2 = this.$context;
            yz.g2 g2Var = yz.g2.f100423a;
            this.label = 1;
            if (cVar.p(obj2, g2Var, this) == l11) {
                return l11;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.e.n(obj);
        }
        return yz.g2.f100423a;
    }
}
