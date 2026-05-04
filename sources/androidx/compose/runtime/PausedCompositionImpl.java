package androidx.compose.runtime;

import androidx.collection.ScatterSet;
import androidx.collection.ScatterSetKt;
import androidx.compose.runtime.internal.RememberEventDispatcher;
import androidx.compose.runtime.internal.StabilityInferred;
import java.util.Set;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import m80.k;
import x00.p;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
@u0({"SMAP\nPausableComposition.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PausableComposition.kt\nandroidx/compose/runtime/PausedCompositionImpl\n+ 2 Synchronization.android.kt\nandroidx/compose/runtime/platform/Synchronization_androidKt\n*L\n1#1,392:1\n33#2,2:393\n*S KotlinDebug\n*F\n+ 1 PausableComposition.kt\nandroidx/compose/runtime/PausedCompositionImpl\n*L\n247#1:393,2\n*E\n"})
/* loaded from: classes.dex */
public final class PausedCompositionImpl implements PausedComposition {
    public static final int $stable = 8;

    @k
    private final Applier<?> applier;

    @k
    private final ComposerImpl composer;

    @k
    private final CompositionImpl composition;

    @k
    private final p<Composer, Integer, g2> content;

    @k
    private final CompositionContext context;

    @k
    private final Object lock;

    @k
    private final RecordingApplier<Object> pausableApplier;

    @k
    private final RememberEventDispatcher rememberManager;
    private final boolean reusable;

    @k
    private PausedCompositionState state = PausedCompositionState.InitialPending;

    @k
    private ScatterSet<RecomposeScopeImpl> invalidScopes = ScatterSetKt.emptyScatterSet();

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[PausedCompositionState.values().length];
            try {
                iArr[PausedCompositionState.InitialPending.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[PausedCompositionState.RecomposePending.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[PausedCompositionState.ApplyPending.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[PausedCompositionState.Applied.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[PausedCompositionState.Cancelled.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[PausedCompositionState.Invalid.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public PausedCompositionImpl(@k CompositionImpl compositionImpl, @k CompositionContext compositionContext, @k ComposerImpl composerImpl, @k Set<RememberObserver> set, @k p<? super Composer, ? super Integer, g2> pVar, boolean z11, @k Applier<?> applier, @k Object obj) {
        this.composition = compositionImpl;
        this.context = compositionContext;
        this.composer = composerImpl;
        this.content = pVar;
        this.reusable = z11;
        this.applier = applier;
        this.lock = obj;
        this.rememberManager = new RememberEventDispatcher(set);
        this.pausableApplier = new RecordingApplier<>(applier.getCurrent());
    }

    private final void applyChanges() {
        synchronized (this.lock) {
            try {
                RecordingApplier<Object> recordingApplier = this.pausableApplier;
                Applier<?> applier = this.applier;
                g0.n(applier, "null cannot be cast to non-null type androidx.compose.runtime.Applier<kotlin.Any?>");
                recordingApplier.playTo(applier);
                this.rememberManager.dispatchRememberObservers();
                this.rememberManager.dispatchSideEffects();
                this.rememberManager.dispatchAbandons();
                this.composition.pausedCompositionFinished$runtime_release();
                g2 g2Var = g2.f100423a;
            } catch (Throwable th2) {
                this.rememberManager.dispatchAbandons();
                this.composition.pausedCompositionFinished$runtime_release();
                throw th2;
            }
        }
    }

    private final void markComplete() {
        this.state = PausedCompositionState.ApplyPending;
    }

    @Override // androidx.compose.runtime.PausedComposition
    public void apply() {
        try {
            switch (WhenMappings.$EnumSwitchMapping$0[this.state.ordinal()]) {
                case 1:
                case 2:
                    throw new IllegalStateException("The paused composition has not completed yet");
                case 3:
                    applyChanges();
                    this.state = PausedCompositionState.Applied;
                    return;
                case 4:
                    throw new IllegalStateException("The paused composition has already been applied");
                case 5:
                    throw new IllegalStateException("The paused composition has been cancelled");
                case 6:
                    throw new IllegalStateException("The paused composition is invalid because of a previous exception");
                default:
                    return;
            }
        } catch (Exception e11) {
            this.state = PausedCompositionState.Invalid;
            throw e11;
        }
    }

    @Override // androidx.compose.runtime.PausedComposition
    public void cancel() {
        this.state = PausedCompositionState.Cancelled;
        this.rememberManager.dispatchAbandons();
        this.composition.pausedCompositionFinished$runtime_release();
    }

    @k
    public final Applier<?> getApplier() {
        return this.applier;
    }

    @k
    public final ComposerImpl getComposer() {
        return this.composer;
    }

    @k
    public final CompositionImpl getComposition() {
        return this.composition;
    }

    @k
    public final p<Composer, Integer, g2> getContent() {
        return this.content;
    }

    @k
    public final CompositionContext getContext() {
        return this.context;
    }

    @k
    public final Object getLock() {
        return this.lock;
    }

    @k
    public final RecordingApplier<Object> getPausableApplier$runtime_release() {
        return this.pausableApplier;
    }

    @k
    public final RememberEventDispatcher getRememberManager$runtime_release() {
        return this.rememberManager;
    }

    public final boolean getReusable() {
        return this.reusable;
    }

    @Override // androidx.compose.runtime.PausedComposition
    public boolean isComplete() {
        return this.state.compareTo(PausedCompositionState.ApplyPending) >= 0;
    }

    @Override // androidx.compose.runtime.PausedComposition
    public boolean resume(@k ShouldPauseCallback shouldPauseCallback) {
        try {
            switch (WhenMappings.$EnumSwitchMapping$0[this.state.ordinal()]) {
                case 1:
                    if (this.reusable) {
                        this.composer.startReuseFromRoot();
                    }
                    try {
                        this.invalidScopes = this.context.composeInitialPaused$runtime_release(this.composition, shouldPauseCallback, this.content);
                        this.state = PausedCompositionState.RecomposePending;
                        if (this.invalidScopes.isEmpty()) {
                            markComplete();
                        }
                        return isComplete();
                    } finally {
                        if (this.reusable) {
                            this.composer.endReuseFromRoot();
                        }
                    }
                case 2:
                    ScatterSet<RecomposeScopeImpl> recomposePaused$runtime_release = this.context.recomposePaused$runtime_release(this.composition, shouldPauseCallback, this.invalidScopes);
                    this.invalidScopes = recomposePaused$runtime_release;
                    if (recomposePaused$runtime_release.isEmpty()) {
                        markComplete();
                    }
                    return isComplete();
                case 3:
                    throw new IllegalStateException("Pausable composition is complete and apply() should be applied");
                case 4:
                    throw new IllegalStateException("The paused composition has been applied");
                case 5:
                    throw new IllegalStateException("The paused composition has been cancelled");
                case 6:
                    throw new IllegalStateException("The paused composition is invalid because of a previous exception");
                default:
                    return isComplete();
            }
        } catch (Exception e11) {
            this.state = PausedCompositionState.Invalid;
            throw e11;
        }
    }
}
