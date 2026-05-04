package androidx.compose.runtime;

import androidx.collection.MutableScatterSet;
import c40.r0;
import j00.c;
import java.util.List;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.u0;
import l00.d;
import x00.q;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@d(c = "androidx.compose.runtime.Recomposer$runRecomposeAndApplyChanges$2", f = "Recomposer.kt", i = {0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1}, l = {580, 591}, m = "invokeSuspend", n = {"parentFrameClock", "toRecompose", "toInsert", "toApply", "toLateApply", "toComplete", "modifiedValues", "modifiedValuesSet", "alreadyComposed", "parentFrameClock", "toRecompose", "toInsert", "toApply", "toLateApply", "toComplete", "modifiedValues", "modifiedValuesSet", "alreadyComposed"}, s = {"L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "L$7", "L$8", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "L$7", "L$8"})
@u0({"SMAP\nRecomposer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Recomposer.kt\nandroidx/compose/runtime/Recomposer$runRecomposeAndApplyChanges$2\n+ 2 Synchronization.android.kt\nandroidx/compose/runtime/platform/Synchronization_androidKt\n+ 3 ListUtils.kt\nandroidx/compose/runtime/snapshots/ListUtilsKt\n+ 4 ScatterSet.kt\nandroidx/collection/ScatterSet\n+ 5 ScatterMap.kt\nandroidx/collection/ScatterMapKt\n*L\n1#1,1791:1\n33#2,2:1792\n33#2,2:1875\n33#3,6:1794\n33#3,6:1877\n231#4,3:1800\n200#4,7:1803\n211#4,3:1811\n214#4,9:1815\n234#4:1824\n231#4,3:1825\n200#4,7:1828\n211#4,3:1836\n214#4,9:1840\n234#4:1849\n231#4,3:1850\n200#4,7:1853\n211#4,3:1861\n214#4,9:1865\n234#4:1874\n1399#5:1810\n1270#5:1814\n1399#5:1835\n1270#5:1839\n1399#5:1860\n1270#5:1864\n*S KotlinDebug\n*F\n+ 1 Recomposer.kt\nandroidx/compose/runtime/Recomposer$runRecomposeAndApplyChanges$2\n*L\n542#1:1792,2\n573#1:1875,2\n546#1:1794,6\n574#1:1877,6\n552#1:1800,3\n552#1:1803,7\n552#1:1811,3\n552#1:1815,9\n552#1:1824\n558#1:1825,3\n558#1:1828,7\n558#1:1836,3\n558#1:1840,9\n558#1:1849\n563#1:1850,3\n563#1:1853,7\n563#1:1861,3\n563#1:1865,9\n563#1:1874\n552#1:1810\n552#1:1814\n558#1:1835\n558#1:1839\n563#1:1860\n563#1:1864\n*E\n"})
/* loaded from: classes.dex */
public final class Recomposer$runRecomposeAndApplyChanges$2 extends SuspendLambda implements q<r0, MonotonicFrameClock, c<? super g2>, Object> {
    /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    Object L$6;
    Object L$7;
    Object L$8;
    int label;
    final /* synthetic */ Recomposer this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Recomposer$runRecomposeAndApplyChanges$2(Recomposer recomposer, c<? super Recomposer$runRecomposeAndApplyChanges$2> cVar) {
        super(3, cVar);
        this.this$0 = recomposer;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void invokeSuspend$clearRecompositionState(Recomposer recomposer, List<ControlledComposition> list, List<MovableContentStateReference> list2, List<ControlledComposition> list3, MutableScatterSet<ControlledComposition> mutableScatterSet, MutableScatterSet<ControlledComposition> mutableScatterSet2, MutableScatterSet<Object> mutableScatterSet3, MutableScatterSet<ControlledComposition> mutableScatterSet4) {
        char c11;
        long j11;
        long j12;
        synchronized (recomposer.stateLock) {
            try {
                list.clear();
                list2.clear();
                int size = list3.size();
                for (int i11 = 0; i11 < size; i11++) {
                    ControlledComposition controlledComposition = list3.get(i11);
                    controlledComposition.abandonChanges();
                    recomposer.recordFailedCompositionLocked(controlledComposition);
                }
                list3.clear();
                Object[] objArr = mutableScatterSet.elements;
                long[] jArr = mutableScatterSet.metadata;
                int length = jArr.length - 2;
                if (length >= 0) {
                    int i12 = 0;
                    j11 = 255;
                    while (true) {
                        long j13 = jArr[i12];
                        c11 = 7;
                        j12 = -9187201950435737472L;
                        if ((((~j13) << 7) & j13 & (-9187201950435737472L)) != -9187201950435737472L) {
                            int i13 = 8 - ((~(i12 - length)) >>> 31);
                            for (int i14 = 0; i14 < i13; i14++) {
                                if ((j13 & 255) < 128) {
                                    ControlledComposition controlledComposition2 = (ControlledComposition) objArr[(i12 << 3) + i14];
                                    controlledComposition2.abandonChanges();
                                    recomposer.recordFailedCompositionLocked(controlledComposition2);
                                }
                                j13 >>= 8;
                            }
                            if (i13 != 8) {
                                break;
                            }
                        }
                        if (i12 == length) {
                            break;
                        } else {
                            i12++;
                        }
                    }
                } else {
                    c11 = 7;
                    j11 = 255;
                    j12 = -9187201950435737472L;
                }
                mutableScatterSet.clear();
                Object[] objArr2 = mutableScatterSet2.elements;
                long[] jArr2 = mutableScatterSet2.metadata;
                int length2 = jArr2.length - 2;
                if (length2 >= 0) {
                    int i15 = 0;
                    while (true) {
                        long j14 = jArr2[i15];
                        if ((((~j14) << c11) & j14 & j12) != j12) {
                            int i16 = 8 - ((~(i15 - length2)) >>> 31);
                            for (int i17 = 0; i17 < i16; i17++) {
                                if ((j14 & j11) < 128) {
                                    ((ControlledComposition) objArr2[(i15 << 3) + i17]).changesApplied();
                                }
                                j14 >>= 8;
                            }
                            if (i16 != 8) {
                                break;
                            }
                        }
                        if (i15 == length2) {
                            break;
                        } else {
                            i15++;
                        }
                    }
                }
                mutableScatterSet2.clear();
                mutableScatterSet3.clear();
                Object[] objArr3 = mutableScatterSet4.elements;
                long[] jArr3 = mutableScatterSet4.metadata;
                int length3 = jArr3.length - 2;
                if (length3 >= 0) {
                    int i18 = 0;
                    while (true) {
                        long j15 = jArr3[i18];
                        if ((((~j15) << c11) & j15 & j12) != j12) {
                            int i19 = 8 - ((~(i18 - length3)) >>> 31);
                            for (int i21 = 0; i21 < i19; i21++) {
                                if ((j15 & j11) < 128) {
                                    ControlledComposition controlledComposition3 = (ControlledComposition) objArr3[(i18 << 3) + i21];
                                    controlledComposition3.abandonChanges();
                                    recomposer.recordFailedCompositionLocked(controlledComposition3);
                                }
                                j15 >>= 8;
                            }
                            if (i19 != 8) {
                                break;
                            }
                        }
                        if (i18 == length3) {
                            break;
                        } else {
                            i18++;
                        }
                    }
                }
                mutableScatterSet4.clear();
                g2 g2Var = g2.f100423a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void invokeSuspend$fillToInsert(List<MovableContentStateReference> list, Recomposer recomposer) {
        List list2;
        List list3;
        list.clear();
        synchronized (recomposer.stateLock) {
            try {
                list2 = recomposer.movableContentAwaitingInsert;
                int size = list2.size();
                for (int i11 = 0; i11 < size; i11++) {
                    list.add((MovableContentStateReference) list2.get(i11));
                }
                list3 = recomposer.movableContentAwaitingInsert;
                list3.clear();
                g2 g2Var = g2.f100423a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // x00.q
    public final Object invoke(r0 r0Var, MonotonicFrameClock monotonicFrameClock, c<? super g2> cVar) {
        Recomposer$runRecomposeAndApplyChanges$2 recomposer$runRecomposeAndApplyChanges$2 = new Recomposer$runRecomposeAndApplyChanges$2(this.this$0, cVar);
        recomposer$runRecomposeAndApplyChanges$2.L$0 = monotonicFrameClock;
        return recomposer$runRecomposeAndApplyChanges$2.invokeSuspend(g2.f100423a);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x00b4  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x0101 -> B:6:0x0109). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x010f -> B:7:0x00ac). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r17) {
        /*
            Method dump skipped, instructions count: 283
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.Recomposer$runRecomposeAndApplyChanges$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
