package androidx.compose.foundation.lazy;

import androidx.compose.animation.core.FiniteAnimationSpec;
import androidx.compose.foundation.lazy.layout.LazyLayoutAnimateItemElement;
import androidx.compose.runtime.MutableIntState;
import androidx.compose.runtime.SnapshotIntStateKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.unit.IntOffset;
import m80.k;
import m80.l;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 1)
/* loaded from: classes.dex */
public final class LazyItemScopeImpl implements LazyItemScope {
    public static final int $stable = 0;

    @k
    private MutableIntState maxWidthState = SnapshotIntStateKt.mutableIntStateOf(Integer.MAX_VALUE);

    @k
    private MutableIntState maxHeightState = SnapshotIntStateKt.mutableIntStateOf(Integer.MAX_VALUE);

    @Override // androidx.compose.foundation.lazy.LazyItemScope
    @k
    public Modifier animateItem(@k Modifier modifier, @l FiniteAnimationSpec<Float> finiteAnimationSpec, @l FiniteAnimationSpec<IntOffset> finiteAnimationSpec2, @l FiniteAnimationSpec<Float> finiteAnimationSpec3) {
        return (finiteAnimationSpec == null && finiteAnimationSpec2 == null && finiteAnimationSpec3 == null) ? modifier : modifier.then(new LazyLayoutAnimateItemElement(finiteAnimationSpec, finiteAnimationSpec2, finiteAnimationSpec3));
    }

    @Override // androidx.compose.foundation.lazy.LazyItemScope
    @k
    public Modifier fillParentMaxHeight(@k Modifier modifier, float f11) {
        return modifier.then(new ParentSizeElement(f11, null, this.maxHeightState, "fillParentMaxHeight", 2, null));
    }

    @Override // androidx.compose.foundation.lazy.LazyItemScope
    @k
    public Modifier fillParentMaxSize(@k Modifier modifier, float f11) {
        return modifier.then(new ParentSizeElement(f11, this.maxWidthState, this.maxHeightState, "fillParentMaxSize"));
    }

    @Override // androidx.compose.foundation.lazy.LazyItemScope
    @k
    public Modifier fillParentMaxWidth(@k Modifier modifier, float f11) {
        return modifier.then(new ParentSizeElement(f11, this.maxWidthState, null, "fillParentMaxWidth", 4, null));
    }

    public final void setMaxSize(int i11, int i12) {
        this.maxWidthState.setIntValue(i11);
        this.maxHeightState.setIntValue(i12);
    }
}
