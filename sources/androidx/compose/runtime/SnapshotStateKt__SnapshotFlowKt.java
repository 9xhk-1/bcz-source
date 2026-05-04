package androidx.compose.runtime;

import androidx.collection.MutableScatterSet;
import java.util.Set;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.d;
import kotlin.jvm.internal.u0;
import kotlinx.coroutines.flow.i;
import kotlinx.coroutines.flow.m0;
import m80.k;
import m80.l;
import x00.p;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nSnapshotFlow.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SnapshotFlow.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotFlowKt\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 3 ScatterSet.kt\nandroidx/collection/ScatterSet\n+ 4 ScatterMap.kt\nandroidx/collection/ScatterMapKt\n*L\n1#1,179:1\n1247#2,6:180\n256#3,2:186\n231#3,3:188\n200#3,7:191\n211#3,3:199\n214#3,9:203\n234#3:212\n258#3:213\n1399#4:198\n1270#4:202\n*S KotlinDebug\n*F\n+ 1 SnapshotFlow.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotFlowKt\n*L\n65#1:180,6\n178#1:186,2\n178#1:188,3\n178#1:191,7\n178#1:199,3\n178#1:203,9\n178#1:212\n178#1:213\n178#1:198\n178#1:202\n*E\n"})
/* loaded from: classes.dex */
final /* synthetic */ class SnapshotStateKt__SnapshotFlowKt {
    @Composable
    @k
    public static final <T> State<T> collectAsState(@k m0<? extends T> m0Var, @l d dVar, @l Composer composer, int i11, int i12) {
        if ((i12 & 1) != 0) {
            dVar = EmptyCoroutineContext.INSTANCE;
        }
        d dVar2 = dVar;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1439883919, i11, -1, "androidx.compose.runtime.collectAsState (SnapshotFlow.kt:48)");
        }
        State<T> collectAsState = SnapshotStateKt.collectAsState(m0Var, m0Var.getValue(), dVar2, composer, (i11 & 14) | ((i11 << 3) & 896), 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return collectAsState;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean intersects$SnapshotStateKt__SnapshotFlowKt(MutableScatterSet<Object> mutableScatterSet, Set<? extends Object> set) {
        Object[] objArr = mutableScatterSet.elements;
        long[] jArr = mutableScatterSet.metadata;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i11 = 0;
            while (true) {
                long j11 = jArr[i11];
                if ((((~j11) << 7) & j11 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i12 = 8 - ((~(i11 - length)) >>> 31);
                    for (int i13 = 0; i13 < i12; i13++) {
                        if ((255 & j11) < 128 && set.contains(objArr[(i11 << 3) + i13])) {
                            return true;
                        }
                        j11 >>= 8;
                    }
                    if (i12 != 8) {
                        break;
                    }
                }
                if (i11 == length) {
                    break;
                }
                i11++;
            }
        }
        return false;
    }

    @k
    public static final <T> i<T> snapshotFlow(@k x00.a<? extends T> aVar) {
        return kotlinx.coroutines.flow.k.K0(new SnapshotStateKt__SnapshotFlowKt$snapshotFlow$1(aVar, null));
    }

    @Composable
    @k
    public static final <T extends R, R> State<R> collectAsState(@k i<? extends T> iVar, R r11, @l d dVar, @l Composer composer, int i11, int i12) {
        if ((i12 & 2) != 0) {
            dVar = EmptyCoroutineContext.INSTANCE;
        }
        d dVar2 = dVar;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-606625098, i11, -1, "androidx.compose.runtime.collectAsState (SnapshotFlow.kt:64)");
        }
        boolean changedInstance = composer.changedInstance(dVar2) | composer.changedInstance(iVar);
        Object rememberedValue = composer.rememberedValue();
        if (changedInstance || rememberedValue == Composer.Companion.getEmpty()) {
            rememberedValue = new SnapshotStateKt__SnapshotFlowKt$collectAsState$1$1(dVar2, iVar, null);
            composer.updateRememberedValue(rememberedValue);
        }
        State<R> produceState = SnapshotStateKt.produceState(r11, iVar, dVar2, (p) rememberedValue, composer, ((i11 >> 3) & 14) | ((i11 << 3) & 112) | (i11 & 896));
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return produceState;
    }
}
