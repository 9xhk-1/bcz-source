package androidx.activity.compose;

import androidx.activity.FullyDrawnReporter;
import c40.r0;
import j00.c;
import kotlin.coroutines.intrinsics.b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.e;
import kotlin.jvm.internal.u0;
import l00.d;
import x00.l;
import x00.p;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@d(c = "androidx.activity.compose.ReportDrawnKt$ReportDrawnAfter$1$1", f = "ReportDrawn.kt", i = {0}, l = {159}, m = "invokeSuspend", n = {"$this$reportWhenComplete$iv"}, s = {"L$0"})
@u0({"SMAP\nReportDrawn.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ReportDrawn.kt\nandroidx/activity/compose/ReportDrawnKt$ReportDrawnAfter$1$1\n+ 2 FullyDrawnReporter.kt\nandroidx/activity/FullyDrawnReporterKt\n*L\n1#1,153:1\n168#2,10:154\n*S KotlinDebug\n*F\n+ 1 ReportDrawn.kt\nandroidx/activity/compose/ReportDrawnKt$ReportDrawnAfter$1$1\n*L\n151#1:154,10\n*E\n"})
/* loaded from: classes.dex */
public final class ReportDrawnKt$ReportDrawnAfter$1$1 extends SuspendLambda implements p<r0, c<? super g2>, Object> {
    final /* synthetic */ l<c<? super g2>, Object> $block;
    final /* synthetic */ FullyDrawnReporter $fullyDrawnReporter;
    Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ReportDrawnKt$ReportDrawnAfter$1$1(FullyDrawnReporter fullyDrawnReporter, l<? super c<? super g2>, ? extends Object> lVar, c<? super ReportDrawnKt$ReportDrawnAfter$1$1> cVar) {
        super(2, cVar);
        this.$fullyDrawnReporter = fullyDrawnReporter;
        this.$block = lVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final c<g2> create(Object obj, c<?> cVar) {
        return new ReportDrawnKt$ReportDrawnAfter$1$1(this.$fullyDrawnReporter, this.$block, cVar);
    }

    @Override // x00.p
    public final Object invoke(r0 r0Var, c<? super g2> cVar) {
        return ((ReportDrawnKt$ReportDrawnAfter$1$1) create(r0Var, cVar)).invokeSuspend(g2.f100423a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        FullyDrawnReporter fullyDrawnReporter;
        Throwable th2;
        Object l11 = b.l();
        int i11 = this.label;
        if (i11 == 0) {
            e.n(obj);
            FullyDrawnReporter fullyDrawnReporter2 = this.$fullyDrawnReporter;
            l<c<? super g2>, Object> lVar = this.$block;
            fullyDrawnReporter2.addReporter();
            if (!fullyDrawnReporter2.isFullyDrawnReported()) {
                try {
                    this.L$0 = fullyDrawnReporter2;
                    this.label = 1;
                    if (lVar.invoke(this) == l11) {
                        return l11;
                    }
                    fullyDrawnReporter = fullyDrawnReporter2;
                } catch (Throwable th3) {
                    fullyDrawnReporter = fullyDrawnReporter2;
                    th2 = th3;
                    fullyDrawnReporter.removeReporter();
                    throw th2;
                }
            }
            return g2.f100423a;
        }
        if (i11 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        fullyDrawnReporter = (FullyDrawnReporter) this.L$0;
        try {
            e.n(obj);
        } catch (Throwable th4) {
            th2 = th4;
            fullyDrawnReporter.removeReporter();
            throw th2;
        }
        fullyDrawnReporter.removeReporter();
        return g2.f100423a;
    }
}
