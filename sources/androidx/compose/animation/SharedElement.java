package androidx.compose.animation;

import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.geometry.RectKt;
import androidx.compose.ui.geometry.Size;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import m80.k;
import m80.l;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
@u0({"SMAP\nSharedElement.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SharedElement.kt\nandroidx/compose/animation/SharedElement\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n+ 3 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,247:1\n102#2,2:248\n34#2,6:250\n104#2:256\n34#2,6:267\n102#2,2:273\n34#2,6:275\n104#2:281\n52#2,6:282\n85#3:257\n113#3,2:258\n85#3:261\n113#3,2:262\n85#3:264\n113#3,2:265\n1#4:260\n*S KotlinDebug\n*F\n+ 1 SharedElement.kt\nandroidx/compose/animation/SharedElement\n*L\n43#1:248,2\n43#1:250,6\n43#1:256\n96#1:267,6\n112#1:273,2\n112#1:275,6\n112#1:281\n124#1:282,6\n45#1:257\n45#1:258,2\n78#1:261\n78#1:262,2\n82#1:264\n82#1:265,2\n*E\n"})
/* loaded from: classes.dex */
public final class SharedElement {
    public static final int $stable = 8;

    @k
    private final Object key;

    @k
    private final SharedTransitionScopeImpl scope;

    @l
    private SharedElementInternalState targetBoundsProvider;

    @k
    private final MutableState _targetBounds$delegate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);

    @k
    private final MutableState foundMatch$delegate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);

    @k
    private final MutableState currentBounds$delegate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);

    @k
    private final SnapshotStateList<SharedElementInternalState> states = SnapshotStateKt.mutableStateListOf();

    @k
    private final x00.l<SharedElement, g2> updateMatch = new x00.l<SharedElement, g2>() { // from class: androidx.compose.animation.SharedElement$updateMatch$1
        {
            super(1);
        }

        @Override // x00.l
        public /* bridge */ /* synthetic */ g2 invoke(SharedElement sharedElement) {
            invoke2(sharedElement);
            return g2.f100423a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(SharedElement sharedElement) {
            SharedElement.this.updateMatch();
        }
    };

    @k
    private final x00.a<g2> observingVisibilityChange = new x00.a<g2>() { // from class: androidx.compose.animation.SharedElement$observingVisibilityChange$1
        {
            super(0);
        }

        @Override // x00.a
        public /* bridge */ /* synthetic */ g2 invoke() {
            invoke2();
            return g2.f100423a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            SharedElement.this.hasVisibleContent();
        }
    };

    public SharedElement(@k Object obj, @k SharedTransitionScopeImpl sharedTransitionScopeImpl) {
        this.key = obj;
        this.scope = sharedTransitionScopeImpl;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final Rect get_targetBounds() {
        return (Rect) this._targetBounds$delegate.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean hasVisibleContent() {
        SnapshotStateList<SharedElementInternalState> snapshotStateList = this.states;
        int size = snapshotStateList.size();
        for (int i11 = 0; i11 < size; i11++) {
            if (snapshotStateList.get(i11).getBoundsAnimation().getTarget()) {
                return true;
            }
        }
        return false;
    }

    private final void setFoundMatch(boolean z11) {
        this.foundMatch$delegate.setValue(Boolean.valueOf(z11));
    }

    private final void set_targetBounds(Rect rect) {
        this._targetBounds$delegate.setValue(rect);
    }

    public final void addState(@k SharedElementInternalState sharedElementInternalState) {
        this.states.add(sharedElementInternalState);
        this.scope.observeReads$animation(this, this.updateMatch, this.observingVisibilityChange);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @l
    public final Rect getCurrentBounds() {
        return (Rect) this.currentBounds$delegate.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean getFoundMatch() {
        return ((Boolean) this.foundMatch$delegate.getValue()).booleanValue();
    }

    @k
    public final Object getKey() {
        return this.key;
    }

    @k
    public final SharedTransitionScopeImpl getScope() {
        return this.scope;
    }

    @k
    public final SnapshotStateList<SharedElementInternalState> getStates() {
        return this.states;
    }

    @l
    public final Rect getTargetBounds() {
        SharedElementInternalState sharedElementInternalState = this.targetBoundsProvider;
        set_targetBounds(sharedElementInternalState != null ? RectKt.m2308Recttz77jQw(sharedElementInternalState.m106calculateLookaheadOffsetF1C5BW0(), sharedElementInternalState.m107getNonNullLookaheadSizeNHjbRc()) : null);
        return get_targetBounds();
    }

    @l
    public final SharedElementInternalState getTargetBoundsProvider$animation() {
        return this.targetBoundsProvider;
    }

    public final boolean isAnimating() {
        SnapshotStateList<SharedElementInternalState> snapshotStateList = this.states;
        int size = snapshotStateList.size();
        int i11 = 0;
        while (true) {
            if (i11 >= size) {
                break;
            }
            if (!snapshotStateList.get(i11).getBoundsAnimation().isRunning()) {
                i11++;
            } else if (getFoundMatch()) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: onLookaheadResult-v_w8tDc, reason: not valid java name */
    public final void m105onLookaheadResultv_w8tDc(@k SharedElementInternalState sharedElementInternalState, long j11, long j12) {
        if (sharedElementInternalState.getBoundsAnimation().getTarget()) {
            this.targetBoundsProvider = sharedElementInternalState;
            Rect rect = get_targetBounds();
            Offset m2257boximpl = rect != null ? Offset.m2257boximpl(rect.m2303getTopLeftF1C5BW0()) : null;
            if (m2257boximpl == null ? false : Offset.m2265equalsimpl0(m2257boximpl.m2278unboximpl(), j12)) {
                Rect rect2 = get_targetBounds();
                Size m2325boximpl = rect2 != null ? Size.m2325boximpl(rect2.m2301getSizeNHjbRc()) : null;
                if (m2325boximpl == null ? false : Size.m2333equalsimpl0(m2325boximpl.m2342unboximpl(), j11)) {
                    return;
                }
            }
            Rect m2308Recttz77jQw = RectKt.m2308Recttz77jQw(j12, j11);
            set_targetBounds(m2308Recttz77jQw);
            SnapshotStateList<SharedElementInternalState> snapshotStateList = this.states;
            int size = snapshotStateList.size();
            for (int i11 = 0; i11 < size; i11++) {
                BoundsAnimation boundsAnimation = snapshotStateList.get(i11).getBoundsAnimation();
                Rect currentBounds = getCurrentBounds();
                g0.m(currentBounds);
                boundsAnimation.animate(currentBounds, m2308Recttz77jQw);
            }
        }
    }

    public final void onSharedTransitionFinished() {
        setFoundMatch(this.states.size() > 1 && hasVisibleContent());
        set_targetBounds(null);
    }

    public final void removeState(@k SharedElementInternalState sharedElementInternalState) {
        this.states.remove(sharedElementInternalState);
        if (!this.states.isEmpty()) {
            this.scope.observeReads$animation(this, this.updateMatch, this.observingVisibilityChange);
        } else {
            updateMatch();
            this.scope.clearObservation$animation(this);
        }
    }

    public final void setCurrentBounds(@l Rect rect) {
        this.currentBounds$delegate.setValue(rect);
    }

    public final void updateMatch() {
        boolean hasVisibleContent = hasVisibleContent();
        if (this.states.size() > 1 && hasVisibleContent) {
            setFoundMatch(true);
        } else if (!this.scope.isTransitionActive()) {
            setFoundMatch(false);
        } else if (!hasVisibleContent) {
            setFoundMatch(false);
        }
        if (this.states.isEmpty()) {
            return;
        }
        this.scope.observeReads$animation(this, this.updateMatch, this.observingVisibilityChange);
    }

    public final void updateTargetBoundsProvider() {
        SnapshotStateList<SharedElementInternalState> snapshotStateList = this.states;
        int size = snapshotStateList.size() - 1;
        SharedElementInternalState sharedElementInternalState = null;
        if (size >= 0) {
            while (true) {
                int i11 = size - 1;
                SharedElementInternalState sharedElementInternalState2 = snapshotStateList.get(size);
                if (sharedElementInternalState2.getBoundsAnimation().getTarget()) {
                    sharedElementInternalState = sharedElementInternalState2;
                }
                if (i11 < 0) {
                    break;
                } else {
                    size = i11;
                }
            }
        }
        if (g0.g(sharedElementInternalState, this.targetBoundsProvider)) {
            return;
        }
        this.targetBoundsProvider = sharedElementInternalState;
        set_targetBounds(null);
    }
}
