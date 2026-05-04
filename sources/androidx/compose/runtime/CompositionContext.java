package androidx.compose.runtime;

import androidx.collection.ScatterSet;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.runtime.tooling.CompositionData;
import java.util.Set;
import kotlin.coroutines.d;
import m80.k;
import m80.l;
import x00.p;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 1)
/* loaded from: classes.dex */
public abstract class CompositionContext {
    public static final int $stable = 0;

    public abstract void composeInitial$runtime_release(@k ControlledComposition controlledComposition, @k p<? super Composer, ? super Integer, g2> pVar);

    @k
    public abstract ScatterSet<RecomposeScopeImpl> composeInitialPaused$runtime_release(@k ControlledComposition controlledComposition, @k ShouldPauseCallback shouldPauseCallback, @k p<? super Composer, ? super Integer, g2> pVar);

    public abstract void deletedMovableContent$runtime_release(@k MovableContentStateReference movableContentStateReference);

    public abstract boolean getCollectingCallByInformation$runtime_release();

    public abstract boolean getCollectingParameterInformation$runtime_release();

    public abstract boolean getCollectingSourceInformation$runtime_release();

    @l
    public abstract Composition getComposition$runtime_release();

    @k
    public PersistentCompositionLocalMap getCompositionLocalScope$runtime_release() {
        PersistentCompositionLocalMap persistentCompositionLocalMap;
        persistentCompositionLocalMap = CompositionContextKt.EmptyPersistentCompositionLocalMap;
        return persistentCompositionLocalMap;
    }

    public abstract int getCompoundHashKey$runtime_release();

    @k
    public abstract d getEffectCoroutineContext();

    @l
    public CompositionObserverHolder getObserverHolder$runtime_release() {
        return null;
    }

    @k
    public abstract d getRecomposeCoroutineContext$runtime_release();

    public abstract void insertMovableContent$runtime_release(@k MovableContentStateReference movableContentStateReference);

    public abstract void invalidate$runtime_release(@k ControlledComposition controlledComposition);

    public abstract void invalidateScope$runtime_release(@k RecomposeScopeImpl recomposeScopeImpl);

    public abstract void movableContentStateReleased$runtime_release(@k MovableContentStateReference movableContentStateReference, @k MovableContentState movableContentState, @k Applier<?> applier);

    @l
    public MovableContentState movableContentStateResolve$runtime_release(@k MovableContentStateReference movableContentStateReference) {
        return null;
    }

    @k
    public abstract ScatterSet<RecomposeScopeImpl> recomposePaused$runtime_release(@k ControlledComposition controlledComposition, @k ShouldPauseCallback shouldPauseCallback, @k ScatterSet<RecomposeScopeImpl> scatterSet);

    public abstract void registerComposition$runtime_release(@k ControlledComposition controlledComposition);

    public abstract void reportPausedScope$runtime_release(@k RecomposeScopeImpl recomposeScopeImpl);

    public abstract void reportRemovedComposition$runtime_release(@k ControlledComposition controlledComposition);

    public abstract void unregisterComposition$runtime_release(@k ControlledComposition controlledComposition);

    public void doneComposing$runtime_release() {
    }

    public void startComposing$runtime_release() {
    }

    public void recordInspectionTable$runtime_release(@k Set<CompositionData> set) {
    }

    public void registerComposer$runtime_release(@k Composer composer) {
    }

    public void unregisterComposer$runtime_release(@k Composer composer) {
    }
}
