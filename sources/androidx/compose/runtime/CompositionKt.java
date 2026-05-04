package androidx.compose.runtime;

import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.d;
import kotlin.jvm.internal.d0;
import m80.k;
import m80.l;
import m80.o;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes.dex */
public final class CompositionKt {

    @k
    private static final Object PendingApplyNoModifications = new Object();

    @k
    private static final CompositionServiceKey<CompositionImpl> CompositionImplServiceKey = new CompositionServiceKey<CompositionImpl>() { // from class: androidx.compose.runtime.CompositionKt$CompositionImplServiceKey$1
    };

    @k
    public static final Composition Composition(@k Applier<?> applier, @k CompositionContext compositionContext) {
        return new CompositionImpl(compositionContext, applier, null, 4, null);
    }

    @k
    @o
    public static final ControlledComposition ControlledComposition(@k Applier<?> applier, @k CompositionContext compositionContext) {
        return new CompositionImpl(compositionContext, applier, null, 4, null);
    }

    @k
    public static final ReusableComposition ReusableComposition(@k Applier<?> applier, @k CompositionContext compositionContext) {
        return new CompositionImpl(compositionContext, applier, null, 4, null);
    }

    @k
    public static final CompositionServiceKey<CompositionImpl> getCompositionImplServiceKey() {
        return CompositionImplServiceKey;
    }

    @l
    public static final <T> T getCompositionService(@k Composition composition, @k CompositionServiceKey<T> compositionServiceKey) {
        CompositionServices compositionServices = composition instanceof CompositionServices ? (CompositionServices) composition : null;
        if (compositionServices != null) {
            return (T) compositionServices.getCompositionService(compositionServiceKey);
        }
        return null;
    }

    @ExperimentalComposeApi
    @k
    public static final d getRecomposeCoroutineContext(@k ControlledComposition controlledComposition) {
        d recomposeContext;
        CompositionImpl compositionImpl = controlledComposition instanceof CompositionImpl ? (CompositionImpl) controlledComposition : null;
        return (compositionImpl == null || (recomposeContext = compositionImpl.getRecomposeContext()) == null) ? EmptyCoroutineContext.INSTANCE : recomposeContext;
    }

    public static final <R> R pausable(@k ControlledComposition controlledComposition, @k ShouldPauseCallback shouldPauseCallback, @k x00.a<? extends R> aVar) {
        ShouldPauseCallback andSetShouldPauseCallback = controlledComposition.getAndSetShouldPauseCallback(shouldPauseCallback);
        try {
            return aVar.invoke();
        } finally {
            d0.d(1);
            controlledComposition.getAndSetShouldPauseCallback(andSetShouldPauseCallback);
            d0.c(1);
        }
    }

    @ExperimentalComposeApi
    @k
    public static final Composition Composition(@k Applier<?> applier, @k CompositionContext compositionContext, @k d dVar) {
        return new CompositionImpl(compositionContext, applier, dVar);
    }

    @ExperimentalComposeApi
    @k
    @o
    public static final ControlledComposition ControlledComposition(@k Applier<?> applier, @k CompositionContext compositionContext, @k d dVar) {
        return new CompositionImpl(compositionContext, applier, dVar);
    }

    @ExperimentalComposeApi
    public static /* synthetic */ void getRecomposeCoroutineContext$annotations(ControlledComposition controlledComposition) {
    }
}
