package androidx.compose.runtime.internal;

import androidx.compose.runtime.RememberObserver;
import androidx.compose.runtime.RememberObserverHolder;
import androidx.compose.runtime.collection.MutableVector;
import java.util.Set;
import kotlin.jvm.internal.u0;
import m80.k;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
@u0({"SMAP\nRememberEventDispatcher.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RememberEventDispatcher.kt\nandroidx/compose/runtime/internal/PausedCompositionRemembers\n+ 2 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVectorKt\n+ 3 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector\n*L\n1#1,309:1\n1101#2:310\n1083#2,2:311\n423#3,9:313\n*S KotlinDebug\n*F\n+ 1 RememberEventDispatcher.kt\nandroidx/compose/runtime/internal/PausedCompositionRemembers\n*L\n42#1:310\n42#1:311,2\n45#1:313,9\n*E\n"})
/* loaded from: classes.dex */
public final class PausedCompositionRemembers implements RememberObserver {
    public static final int $stable = 8;

    @k
    private final Set<RememberObserver> abandoning;

    @k
    private final MutableVector<RememberObserverHolder> pausedRemembers = new MutableVector<>(new RememberObserverHolder[16], 0);

    public PausedCompositionRemembers(@k Set<RememberObserver> set) {
        this.abandoning = set;
    }

    @k
    public final MutableVector<RememberObserverHolder> getPausedRemembers() {
        return this.pausedRemembers;
    }

    @Override // androidx.compose.runtime.RememberObserver
    public void onRemembered() {
        MutableVector<RememberObserverHolder> mutableVector = this.pausedRemembers;
        RememberObserverHolder[] rememberObserverHolderArr = mutableVector.content;
        int size = mutableVector.getSize();
        for (int i11 = 0; i11 < size; i11++) {
            RememberObserver wrapped = rememberObserverHolderArr[i11].getWrapped();
            this.abandoning.remove(wrapped);
            wrapped.onRemembered();
        }
    }

    @Override // androidx.compose.runtime.RememberObserver
    public void onAbandoned() {
    }

    @Override // androidx.compose.runtime.RememberObserver
    public void onForgotten() {
    }
}
