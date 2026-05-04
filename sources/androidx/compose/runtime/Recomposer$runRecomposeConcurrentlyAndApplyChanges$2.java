package androidx.compose.runtime;

import c40.r0;
import j00.c;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.u0;
import l00.d;
import x00.q;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@d(c = "androidx.compose.runtime.Recomposer$runRecomposeConcurrentlyAndApplyChanges$2", f = "Recomposer.kt", i = {0, 0, 0, 1}, l = {911, 931, 932}, m = "invokeSuspend", n = {"recomposeCoroutineScope", "frameSignal", "frameLoop", "frameLoop"}, s = {"L$0", "L$1", "L$2", "L$0"})
@u0({"SMAP\nRecomposer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Recomposer.kt\nandroidx/compose/runtime/Recomposer$runRecomposeConcurrentlyAndApplyChanges$2\n+ 2 Preconditions.kt\nandroidx/compose/runtime/PreconditionsKt\n+ 3 Recomposer.kt\nandroidx/compose/runtime/Recomposer\n+ 4 Synchronization.android.kt\nandroidx/compose/runtime/platform/Synchronization_androidKt\n+ 5 ListUtils.kt\nandroidx/compose/runtime/snapshots/ListUtilsKt\n+ 6 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector\n*L\n1#1,1791:1\n33#2,5:1792\n490#3:1797\n491#3,5:1800\n489#3,9:1805\n498#3,2:1818\n501#3:1821\n502#3,7:1833\n33#4,2:1798\n33#4,2:1828\n33#4,2:1840\n33#5,4:1814\n38#5:1820\n423#6,6:1822\n429#6,3:1830\n*S KotlinDebug\n*F\n+ 1 Recomposer.kt\nandroidx/compose/runtime/Recomposer$runRecomposeConcurrentlyAndApplyChanges$2\n*L\n902#1:1792,5\n914#1:1797\n914#1:1800,5\n914#1:1805,9\n914#1:1818,2\n914#1:1821\n914#1:1833,7\n914#1:1798,2\n915#1:1828,2\n926#1:1840,2\n914#1:1814,4\n914#1:1820\n914#1:1822,6\n914#1:1830,3\n*E\n"})
/* loaded from: classes.dex */
public final class Recomposer$runRecomposeConcurrentlyAndApplyChanges$2 extends SuspendLambda implements q<r0, MonotonicFrameClock, c<? super g2>, Object> {
    final /* synthetic */ kotlin.coroutines.d $recomposeCoroutineContext;
    private /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    Object L$2;
    int label;
    final /* synthetic */ Recomposer this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Recomposer$runRecomposeConcurrentlyAndApplyChanges$2(kotlin.coroutines.d dVar, Recomposer recomposer, c<? super Recomposer$runRecomposeConcurrentlyAndApplyChanges$2> cVar) {
        super(3, cVar);
        this.$recomposeCoroutineContext = dVar;
        this.this$0 = recomposer;
    }

    @Override // x00.q
    public final Object invoke(r0 r0Var, MonotonicFrameClock monotonicFrameClock, c<? super g2> cVar) {
        Recomposer$runRecomposeConcurrentlyAndApplyChanges$2 recomposer$runRecomposeConcurrentlyAndApplyChanges$2 = new Recomposer$runRecomposeConcurrentlyAndApplyChanges$2(this.$recomposeCoroutineContext, this.this$0, cVar);
        recomposer$runRecomposeConcurrentlyAndApplyChanges$2.L$0 = r0Var;
        recomposer$runRecomposeConcurrentlyAndApplyChanges$2.L$1 = monotonicFrameClock;
        return recomposer$runRecomposeConcurrentlyAndApplyChanges$2.invokeSuspend(g2.f100423a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x01ad, code lost:
    
        if (c40.n2.l(r2, r18) == r0) goto L83;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x00bb, code lost:
    
        if (r10 == r0) goto L83;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x01a2, code lost:
    
        if (c40.n2.l(r5, r18) == r0) goto L83;
     */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x018e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:60:0x00bb -> B:17:0x00bf). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r19) {
        /*
            Method dump skipped, instructions count: 435
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.Recomposer$runRecomposeConcurrentlyAndApplyChanges$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
