package androidx.compose.runtime;

import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import androidx.compose.runtime.snapshots.SnapshotStateMap;
import androidx.compose.runtime.snapshots.SnapshotStateSet;
import androidx.compose.runtime.snapshots.StateFactoryMarker;
import h10.n;
import j00.c;
import java.util.Collection;
import kotlin.Pair;
import kotlin.coroutines.d;
import kotlinx.coroutines.flow.i;
import kotlinx.coroutines.flow.m0;
import m80.k;
import m80.l;
import x00.p;
import yz.g2;

/* loaded from: classes.dex */
public final class SnapshotStateKt {
    @Composable
    @k
    public static final <T extends R, R> State<R> collectAsState(@k i<? extends T> iVar, R r11, @l d dVar, @l Composer composer, int i11, int i12) {
        return SnapshotStateKt__SnapshotFlowKt.collectAsState(iVar, r11, dVar, composer, i11, i12);
    }

    @k
    public static final MutableVector<DerivedStateObserver> derivedStateObservers() {
        return SnapshotStateKt__DerivedStateKt.derivedStateObservers();
    }

    @StateFactoryMarker
    @k
    public static final <T> State<T> derivedStateOf(@k SnapshotMutationPolicy<T> snapshotMutationPolicy, @k x00.a<? extends T> aVar) {
        return SnapshotStateKt__DerivedStateKt.derivedStateOf(snapshotMutationPolicy, aVar);
    }

    public static final <T> T getValue(@k State<? extends T> state, @l Object obj, @k n<?> nVar) {
        return (T) SnapshotStateKt__SnapshotStateKt.getValue(state, obj, nVar);
    }

    @StateFactoryMarker
    @k
    public static final <T> SnapshotStateList<T> mutableStateListOf() {
        return SnapshotStateKt__SnapshotStateKt.mutableStateListOf();
    }

    @StateFactoryMarker
    @k
    public static final <K, V> SnapshotStateMap<K, V> mutableStateMapOf() {
        return SnapshotStateKt__SnapshotStateKt.mutableStateMapOf();
    }

    @StateFactoryMarker
    @k
    public static final <T> MutableState<T> mutableStateOf(T t11, @k SnapshotMutationPolicy<T> snapshotMutationPolicy) {
        return SnapshotStateKt__SnapshotStateKt.mutableStateOf(t11, snapshotMutationPolicy);
    }

    @StateFactoryMarker
    @k
    public static final <T> SnapshotStateSet<T> mutableStateSetOf() {
        return SnapshotStateKt__SnapshotStateKt.mutableStateSetOf();
    }

    @k
    public static final <T> SnapshotMutationPolicy<T> neverEqualPolicy() {
        return SnapshotStateKt__SnapshotMutationPolicyKt.neverEqualPolicy();
    }

    public static final <R> void observeDerivedStateRecalculations(@k DerivedStateObserver derivedStateObserver, @k x00.a<? extends R> aVar) {
        SnapshotStateKt__DerivedStateKt.observeDerivedStateRecalculations(derivedStateObserver, aVar);
    }

    @Composable
    @k
    public static final <T> State<T> produceState(T t11, @l Object obj, @l Object obj2, @l Object obj3, @k p<? super ProduceStateScope<T>, ? super c<? super g2>, ? extends Object> pVar, @l Composer composer, int i11) {
        return SnapshotStateKt__ProduceStateKt.produceState(t11, obj, obj2, obj3, pVar, composer, i11);
    }

    @k
    public static final <T> SnapshotMutationPolicy<T> referentialEqualityPolicy() {
        return SnapshotStateKt__SnapshotMutationPolicyKt.referentialEqualityPolicy();
    }

    @Composable
    @k
    public static final <T> State<T> rememberUpdatedState(T t11, @l Composer composer, int i11) {
        return SnapshotStateKt__SnapshotStateKt.rememberUpdatedState(t11, composer, i11);
    }

    public static final <T> void setValue(@k MutableState<T> mutableState, @l Object obj, @k n<?> nVar, T t11) {
        SnapshotStateKt__SnapshotStateKt.setValue(mutableState, obj, nVar, t11);
    }

    @k
    public static final <T> i<T> snapshotFlow(@k x00.a<? extends T> aVar) {
        return SnapshotStateKt__SnapshotFlowKt.snapshotFlow(aVar);
    }

    @k
    public static final <T> SnapshotMutationPolicy<T> structuralEqualityPolicy() {
        return SnapshotStateKt__SnapshotMutationPolicyKt.structuralEqualityPolicy();
    }

    @k
    public static final <T> SnapshotStateList<T> toMutableStateList(@k Collection<? extends T> collection) {
        return SnapshotStateKt__SnapshotStateKt.toMutableStateList(collection);
    }

    @k
    public static final <K, V> SnapshotStateMap<K, V> toMutableStateMap(@k Iterable<? extends Pair<? extends K, ? extends V>> iterable) {
        return SnapshotStateKt__SnapshotStateKt.toMutableStateMap(iterable);
    }

    @Composable
    @k
    public static final <T> State<T> collectAsState(@k m0<? extends T> m0Var, @l d dVar, @l Composer composer, int i11, int i12) {
        return SnapshotStateKt__SnapshotFlowKt.collectAsState(m0Var, dVar, composer, i11, i12);
    }

    @StateFactoryMarker
    @k
    public static final <T> State<T> derivedStateOf(@k x00.a<? extends T> aVar) {
        return SnapshotStateKt__DerivedStateKt.derivedStateOf(aVar);
    }

    @StateFactoryMarker
    @k
    public static final <T> SnapshotStateList<T> mutableStateListOf(@k T... tArr) {
        return SnapshotStateKt__SnapshotStateKt.mutableStateListOf(tArr);
    }

    @StateFactoryMarker
    @k
    public static final <K, V> SnapshotStateMap<K, V> mutableStateMapOf(@k Pair<? extends K, ? extends V>... pairArr) {
        return SnapshotStateKt__SnapshotStateKt.mutableStateMapOf(pairArr);
    }

    @StateFactoryMarker
    @k
    public static final <T> SnapshotStateSet<T> mutableStateSetOf(@k T... tArr) {
        return SnapshotStateKt__SnapshotStateKt.mutableStateSetOf(tArr);
    }

    @Composable
    @k
    public static final <T> State<T> produceState(T t11, @l Object obj, @l Object obj2, @k p<? super ProduceStateScope<T>, ? super c<? super g2>, ? extends Object> pVar, @l Composer composer, int i11) {
        return SnapshotStateKt__ProduceStateKt.produceState(t11, obj, obj2, pVar, composer, i11);
    }

    @Composable
    @k
    public static final <T> State<T> produceState(T t11, @l Object obj, @k p<? super ProduceStateScope<T>, ? super c<? super g2>, ? extends Object> pVar, @l Composer composer, int i11) {
        return SnapshotStateKt__ProduceStateKt.produceState(t11, obj, pVar, composer, i11);
    }

    @Composable
    @k
    public static final <T> State<T> produceState(T t11, @k p<? super ProduceStateScope<T>, ? super c<? super g2>, ? extends Object> pVar, @l Composer composer, int i11) {
        return SnapshotStateKt__ProduceStateKt.produceState(t11, pVar, composer, i11);
    }

    @Composable
    @k
    public static final <T> State<T> produceState(T t11, @k Object[] objArr, @k p<? super ProduceStateScope<T>, ? super c<? super g2>, ? extends Object> pVar, @l Composer composer, int i11) {
        return SnapshotStateKt__ProduceStateKt.produceState((Object) t11, objArr, (p) pVar, composer, i11);
    }
}
