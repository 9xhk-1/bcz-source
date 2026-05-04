package androidx.compose.runtime;

import j00.c;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.u0;
import kotlinx.coroutines.flow.j;
import l00.d;
import x00.p;
import yz.g2;

/* JADX INFO: Add missing generic type declarations: [T] */
/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@d(c = "androidx.compose.runtime.SnapshotStateKt__SnapshotFlowKt$snapshotFlow$1", f = "SnapshotFlow.kt", i = {0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2}, l = {142, 146, 169}, m = "invokeSuspend", n = {"$this$flow", "readSet", "readObserver", "appliedChanges", "unregisterApplyObserver", "lastValue", "$this$flow", "readSet", "readObserver", "appliedChanges", "unregisterApplyObserver", "lastValue", "found", "$this$flow", "readSet", "readObserver", "appliedChanges", "unregisterApplyObserver", "lastValue"}, s = {"L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "I$0", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5"})
@u0({"SMAP\nSnapshotFlow.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SnapshotFlow.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotFlowKt$snapshotFlow$1\n+ 2 Snapshot.kt\nandroidx/compose/runtime/snapshots/Snapshot\n*L\n1#1,179:1\n148#2,5:180\n148#2,5:185\n*S KotlinDebug\n*F\n+ 1 SnapshotFlow.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotFlowKt$snapshotFlow$1\n*L\n137#1:180,5\n161#1:185,5\n*E\n"})
/* loaded from: classes.dex */
public final class SnapshotStateKt__SnapshotFlowKt$snapshotFlow$1<T> extends SuspendLambda implements p<j<? super T>, c<? super g2>, Object> {
    final /* synthetic */ x00.a<T> $block;
    int I$0;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public SnapshotStateKt__SnapshotFlowKt$snapshotFlow$1(x00.a<? extends T> aVar, c<? super SnapshotStateKt__SnapshotFlowKt$snapshotFlow$1> cVar) {
        super(2, cVar);
        this.$block = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final c<g2> create(Object obj, c<?> cVar) {
        SnapshotStateKt__SnapshotFlowKt$snapshotFlow$1 snapshotStateKt__SnapshotFlowKt$snapshotFlow$1 = new SnapshotStateKt__SnapshotFlowKt$snapshotFlow$1(this.$block, cVar);
        snapshotStateKt__SnapshotFlowKt$snapshotFlow$1.L$0 = obj;
        return snapshotStateKt__SnapshotFlowKt$snapshotFlow$1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00cb A[Catch: all -> 0x0055, TryCatch #0 {all -> 0x0055, blocks: (B:12:0x0050, B:13:0x00c7, B:15:0x00cb, B:19:0x00d5, B:23:0x00e3, B:29:0x00f9, B:31:0x0102, B:44:0x011e, B:45:0x0121, B:25:0x00ee, B:28:0x00f6, B:40:0x011a, B:41:0x011d), top: B:11:0x0050, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00e3 A[Catch: all -> 0x0055, TRY_LEAVE, TryCatch #0 {all -> 0x0055, blocks: (B:12:0x0050, B:13:0x00c7, B:15:0x00cb, B:19:0x00d5, B:23:0x00e3, B:29:0x00f9, B:31:0x0102, B:44:0x011e, B:45:0x0121, B:25:0x00ee, B:28:0x00f6, B:40:0x011a, B:41:0x011d), top: B:11:0x0050, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00c0  */
    /* JADX WARN: Type inference failed for: r10v1, types: [java.lang.Object, kotlinx.coroutines.flow.j] */
    /* JADX WARN: Type inference failed for: r10v2, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v5 */
    /* JADX WARN: Type inference failed for: r10v6 */
    /* JADX WARN: Type inference failed for: r10v8, types: [kotlinx.coroutines.flow.j] */
    /* JADX WARN: Type inference failed for: r11v1 */
    /* JADX WARN: Type inference failed for: r11v2, types: [java.lang.Object, kotlinx.coroutines.flow.j] */
    /* JADX WARN: Type inference failed for: r11v5 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r14) {
        /*
            Method dump skipped, instructions count: 312
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.SnapshotStateKt__SnapshotFlowKt$snapshotFlow$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // x00.p
    public final Object invoke(j<? super T> jVar, c<? super g2> cVar) {
        return ((SnapshotStateKt__SnapshotFlowKt$snapshotFlow$1) create(jVar, cVar)).invokeSuspend(g2.f100423a);
    }
}
