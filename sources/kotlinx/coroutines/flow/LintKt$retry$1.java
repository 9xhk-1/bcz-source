package kotlinx.coroutines.flow;

import kotlin.coroutines.jvm.internal.SuspendLambda;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@l00.d(c = "kotlinx.coroutines.flow.LintKt$retry$1", f = "Lint.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes8.dex */
public final class LintKt$retry$1 extends SuspendLambda implements x00.p<Throwable, j00.c<? super Boolean>, Object> {
    int label;

    public LintKt$retry$1(j00.c<? super LintKt$retry$1> cVar) {
        super(2, cVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final j00.c<g2> create(Object obj, j00.c<?> cVar) {
        return new LintKt$retry$1(cVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        kotlin.coroutines.intrinsics.b.l();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.e.n(obj);
        return l00.a.a(true);
    }

    @Override // x00.p
    public final Object invoke(Throwable th2, j00.c<? super Boolean> cVar) {
        return ((LintKt$retry$1) create(th2, cVar)).invokeSuspend(g2.f100423a);
    }
}
