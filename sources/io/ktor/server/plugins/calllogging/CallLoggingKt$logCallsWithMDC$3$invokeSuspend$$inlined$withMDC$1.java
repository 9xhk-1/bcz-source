package io.ktor.server.plugins.calllogging;

import c40.r0;
import java.util.List;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.u0;
import x00.p;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@l00.d(c = "io.ktor.server.plugins.calllogging.CallLoggingKt$logCallsWithMDC$3$invokeSuspend$$inlined$withMDC$1", f = "CallLogging.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
@u0({"SMAP\nMDCEntryUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MDCEntryUtils.kt\nio/ktor/server/plugins/calllogging/MDCEntryUtilsKt$withMDC$2\n+ 2 CallLogging.kt\nio/ktor/server/plugins/calllogging/CallLoggingKt$logCallsWithMDC$3\n*L\n1#1,26:1\n91#2,2:27\n*E\n"})
/* loaded from: classes8.dex */
public final class CallLoggingKt$logCallsWithMDC$3$invokeSuspend$$inlined$withMDC$1 extends SuspendLambda implements p<r0, j00.c<? super g2>, Object> {
    final /* synthetic */ zx.b $call$inlined;
    final /* synthetic */ x00.l $logSuccess$inlined;
    final /* synthetic */ List $mdcEntries;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CallLoggingKt$logCallsWithMDC$3$invokeSuspend$$inlined$withMDC$1(List list, j00.c cVar, x00.l lVar, zx.b bVar) {
        super(2, cVar);
        this.$mdcEntries = list;
        this.$logSuccess$inlined = lVar;
        this.$call$inlined = bVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final j00.c<g2> create(Object obj, j00.c<?> cVar) {
        return new CallLoggingKt$logCallsWithMDC$3$invokeSuspend$$inlined$withMDC$1(this.$mdcEntries, cVar, this.$logSuccess$inlined, this.$call$inlined);
    }

    @Override // x00.p
    public final Object invoke(r0 r0Var, j00.c<? super g2> cVar) {
        return ((CallLoggingKt$logCallsWithMDC$3$invokeSuspend$$inlined$withMDC$1) create(r0Var, cVar)).invokeSuspend(g2.f100423a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        kotlin.coroutines.intrinsics.b.l();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.e.n(obj);
        try {
            this.$logSuccess$inlined.invoke(this.$call$inlined);
            MDCEntryUtilsKt.b(this.$mdcEntries);
            return g2.f100423a;
        } catch (Throwable th2) {
            MDCEntryUtilsKt.b(this.$mdcEntries);
            throw th2;
        }
    }
}
