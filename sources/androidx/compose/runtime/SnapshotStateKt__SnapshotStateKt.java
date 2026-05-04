package androidx.compose.runtime;

import a00.a0;
import a00.l1;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import androidx.compose.runtime.snapshots.SnapshotStateMap;
import androidx.compose.runtime.snapshots.SnapshotStateSet;
import androidx.compose.runtime.snapshots.StateFactoryMarker;
import h10.n;
import java.util.Collection;
import kotlin.Pair;
import kotlin.jvm.internal.u0;
import m80.k;
import m80.l;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nSnapshotState.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,331:1\n1#2:332\n1247#3,6:333\n*S KotlinDebug\n*F\n+ 1 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n330#1:333,6\n*E\n"})
/* loaded from: classes.dex */
final /* synthetic */ class SnapshotStateKt__SnapshotStateKt {
    public static final <T> T getValue(@k State<? extends T> state, @l Object obj, @k n<?> nVar) {
        return state.getValue();
    }

    @StateFactoryMarker
    @k
    public static final <T> SnapshotStateList<T> mutableStateListOf() {
        return new SnapshotStateList<>();
    }

    @StateFactoryMarker
    @k
    public static final <K, V> SnapshotStateMap<K, V> mutableStateMapOf() {
        return new SnapshotStateMap<>();
    }

    @StateFactoryMarker
    @k
    public static final <T> MutableState<T> mutableStateOf(T t11, @k SnapshotMutationPolicy<T> snapshotMutationPolicy) {
        return SnapshotState_androidKt.createSnapshotMutableState(t11, snapshotMutationPolicy);
    }

    public static /* synthetic */ MutableState mutableStateOf$default(Object obj, SnapshotMutationPolicy snapshotMutationPolicy, int i11, Object obj2) {
        if ((i11 & 2) != 0) {
            snapshotMutationPolicy = SnapshotStateKt.structuralEqualityPolicy();
        }
        return SnapshotStateKt.mutableStateOf(obj, snapshotMutationPolicy);
    }

    @StateFactoryMarker
    @k
    public static final <T> SnapshotStateSet<T> mutableStateSetOf() {
        return new SnapshotStateSet<>();
    }

    @Composable
    @k
    public static final <T> State<T> rememberUpdatedState(T t11, @l Composer composer, int i11) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1058319986, i11, -1, "androidx.compose.runtime.rememberUpdatedState (SnapshotState.kt:329)");
        }
        Object rememberedValue = composer.rememberedValue();
        if (rememberedValue == Composer.Companion.getEmpty()) {
            rememberedValue = mutableStateOf$default(t11, null, 2, null);
            composer.updateRememberedValue(rememberedValue);
        }
        MutableState mutableState = (MutableState) rememberedValue;
        mutableState.setValue(t11);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return mutableState;
    }

    public static final <T> void setValue(@k MutableState<T> mutableState, @l Object obj, @k n<?> nVar, T t11) {
        mutableState.setValue(t11);
    }

    @k
    public static final <T> SnapshotStateList<T> toMutableStateList(@k Collection<? extends T> collection) {
        SnapshotStateList<T> snapshotStateList = new SnapshotStateList<>();
        snapshotStateList.addAll(collection);
        return snapshotStateList;
    }

    @k
    public static final <K, V> SnapshotStateMap<K, V> toMutableStateMap(@k Iterable<? extends Pair<? extends K, ? extends V>> iterable) {
        SnapshotStateMap<K, V> snapshotStateMap = new SnapshotStateMap<>();
        snapshotStateMap.putAll(l1.B0(iterable));
        return snapshotStateMap;
    }

    @StateFactoryMarker
    @k
    public static final <T> SnapshotStateList<T> mutableStateListOf(@k T... tArr) {
        SnapshotStateList<T> snapshotStateList = new SnapshotStateList<>();
        snapshotStateList.addAll(a0.dz(tArr));
        return snapshotStateList;
    }

    @StateFactoryMarker
    @k
    public static final <K, V> SnapshotStateMap<K, V> mutableStateMapOf(@k Pair<? extends K, ? extends V>... pairArr) {
        SnapshotStateMap<K, V> snapshotStateMap = new SnapshotStateMap<>();
        snapshotStateMap.putAll(l1.H0(pairArr));
        return snapshotStateMap;
    }

    @StateFactoryMarker
    @k
    public static final <T> SnapshotStateSet<T> mutableStateSetOf(@k T... tArr) {
        SnapshotStateSet<T> snapshotStateSet = new SnapshotStateSet<>();
        snapshotStateSet.addAll(a0.Fz(tArr));
        return snapshotStateSet;
    }
}
