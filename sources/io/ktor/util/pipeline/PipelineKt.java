package io.ktor.util.pipeline;

import kotlin.jvm.internal.d0;
import kotlin.jvm.internal.g0;
import x00.q;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class PipelineKt {
    @m80.l
    public static final <TContext> Object a(@m80.k c<g2, TContext> cVar, @m80.k TContext tcontext, @m80.k j00.c<? super g2> cVar2) {
        Object b11 = cz.a.b(new PipelineKt$execute$2(cVar, tcontext, null), cVar2);
        return b11 == kotlin.coroutines.intrinsics.b.l() ? b11 : g2.f100423a;
    }

    public static final <TContext> Object b(c<g2, TContext> cVar, TContext tcontext, j00.c<? super g2> cVar2) {
        PipelineKt$execute$2 pipelineKt$execute$2 = new PipelineKt$execute$2(cVar, tcontext, null);
        d0.e(0);
        cz.a.b(pipelineKt$execute$2, cVar2);
        d0.e(1);
        return g2.f100423a;
    }

    public static final /* synthetic */ <TSubject, TContext> void c(c<?, TContext> cVar, h phase, q<? super d<TSubject, TContext>, ? super TSubject, ? super j00.c<? super g2>, ? extends Object> block) {
        g0.p(cVar, "<this>");
        g0.p(phase, "phase");
        g0.p(block, "block");
        g0.w();
        cVar.C(phase, new PipelineKt$intercept$1(block, null));
    }
}
