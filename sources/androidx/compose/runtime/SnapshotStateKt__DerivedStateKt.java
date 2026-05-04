package androidx.compose.runtime;

import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.runtime.internal.IntRef;
import androidx.compose.runtime.internal.SnapshotThreadLocal;
import androidx.compose.runtime.snapshots.StateFactoryMarker;
import kotlin.jvm.internal.d0;
import kotlin.jvm.internal.u0;
import m80.k;
import x00.l;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nDerivedState.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DerivedState.kt\nandroidx/compose/runtime/SnapshotStateKt__DerivedStateKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVectorKt\n+ 4 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector\n*L\n1#1,401:1\n1#2:402\n1084#3:403\n423#4,9:404\n423#4,9:413\n44#4:422\n*S KotlinDebug\n*F\n+ 1 DerivedState.kt\nandroidx/compose/runtime/SnapshotStateKt__DerivedStateKt\n*L\n370#1:403\n374#1:404,9\n378#1:413,9\n398#1:422\n*E\n"})
/* loaded from: classes.dex */
final /* synthetic */ class SnapshotStateKt__DerivedStateKt {

    @k
    private static final SnapshotThreadLocal<IntRef> calculationBlockNestedLevel = new SnapshotThreadLocal<>();

    @k
    private static final SnapshotThreadLocal<MutableVector<DerivedStateObserver>> derivedStateObservers = new SnapshotThreadLocal<>();

    @k
    public static final MutableVector<DerivedStateObserver> derivedStateObservers() {
        SnapshotThreadLocal<MutableVector<DerivedStateObserver>> snapshotThreadLocal = derivedStateObservers;
        MutableVector<DerivedStateObserver> mutableVector = snapshotThreadLocal.get();
        if (mutableVector != null) {
            return mutableVector;
        }
        MutableVector<DerivedStateObserver> mutableVector2 = new MutableVector<>(new DerivedStateObserver[0], 0);
        snapshotThreadLocal.set(mutableVector2);
        return mutableVector2;
    }

    @StateFactoryMarker
    @k
    public static final <T> State<T> derivedStateOf(@k x00.a<? extends T> aVar) {
        return new DerivedSnapshotState(aVar, null);
    }

    private static final <R> R notifyObservers$SnapshotStateKt__DerivedStateKt(DerivedState<?> derivedState, x00.a<? extends R> aVar) {
        MutableVector<DerivedStateObserver> derivedStateObservers2 = SnapshotStateKt.derivedStateObservers();
        DerivedStateObserver[] derivedStateObserverArr = derivedStateObservers2.content;
        int size = derivedStateObservers2.getSize();
        int i11 = 0;
        for (int i12 = 0; i12 < size; i12++) {
            derivedStateObserverArr[i12].start(derivedState);
        }
        try {
            return aVar.invoke();
        } finally {
            d0.d(1);
            DerivedStateObserver[] derivedStateObserverArr2 = derivedStateObservers2.content;
            int size2 = derivedStateObservers2.getSize();
            while (i11 < size2) {
                derivedStateObserverArr2[i11].done(derivedState);
                i11++;
            }
            d0.c(1);
        }
    }

    public static final <R> void observeDerivedStateRecalculations(@k DerivedStateObserver derivedStateObserver, @k x00.a<? extends R> aVar) {
        MutableVector<DerivedStateObserver> derivedStateObservers2 = SnapshotStateKt.derivedStateObservers();
        try {
            derivedStateObservers2.add(derivedStateObserver);
            aVar.invoke();
        } finally {
            d0.d(1);
            derivedStateObservers2.removeAt(derivedStateObservers2.getSize() - 1);
            d0.c(1);
        }
    }

    private static final <T> T withCalculationNestedLevel$SnapshotStateKt__DerivedStateKt(l<? super IntRef, ? extends T> lVar) {
        IntRef intRef = (IntRef) calculationBlockNestedLevel.get();
        if (intRef == null) {
            intRef = new IntRef(0);
            calculationBlockNestedLevel.set(intRef);
        }
        return lVar.invoke(intRef);
    }

    @StateFactoryMarker
    @k
    public static final <T> State<T> derivedStateOf(@k SnapshotMutationPolicy<T> snapshotMutationPolicy, @k x00.a<? extends T> aVar) {
        return new DerivedSnapshotState(aVar, snapshotMutationPolicy);
    }
}
