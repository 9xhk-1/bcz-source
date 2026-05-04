package io.ktor.server.plugins.calllogging;

import c40.r0;
import java.util.List;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import x00.p;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@l00.d(c = "io.ktor.server.plugins.calllogging.KtorMDCProvider$withMDCBlock$$inlined$withMDC$1", f = "MDCProvider.kt", i = {}, l = {22}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes8.dex */
public final class KtorMDCProvider$withMDCBlock$$inlined$withMDC$1 extends SuspendLambda implements p<r0, j00.c<? super g2>, Object> {
    final /* synthetic */ x00.l $block;
    final /* synthetic */ List $mdcEntries;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public KtorMDCProvider$withMDCBlock$$inlined$withMDC$1(x00.l lVar, List list, j00.c cVar) {
        super(2, cVar);
        this.$block = lVar;
        this.$mdcEntries = list;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final j00.c<g2> create(Object obj, j00.c<?> cVar) {
        return new KtorMDCProvider$withMDCBlock$$inlined$withMDC$1(this.$block, this.$mdcEntries, cVar);
    }

    @Override // x00.p
    public final Object invoke(r0 r0Var, j00.c<? super g2> cVar) {
        return ((KtorMDCProvider$withMDCBlock$$inlined$withMDC$1) create(r0Var, cVar)).invokeSuspend(g2.f100423a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object l11 = kotlin.coroutines.intrinsics.b.l();
        int i11 = this.label;
        try {
            if (i11 == 0) {
                kotlin.e.n(obj);
                x00.l lVar = this.$block;
                this.label = 1;
                if (lVar.invoke(this) == l11) {
                    return l11;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.e.n(obj);
            }
            MDCEntryUtilsKt.b(this.$mdcEntries);
            return g2.f100423a;
        } catch (Throwable th2) {
            MDCEntryUtilsKt.b(this.$mdcEntries);
            throw th2;
        }
    }
}
