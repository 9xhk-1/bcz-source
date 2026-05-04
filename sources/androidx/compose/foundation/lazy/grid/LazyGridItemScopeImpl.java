package androidx.compose.foundation.lazy.grid;

import androidx.compose.animation.core.FiniteAnimationSpec;
import androidx.compose.foundation.lazy.layout.LazyLayoutAnimateItemElement;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.unit.IntOffset;
import m80.k;
import m80.l;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 1)
/* loaded from: classes.dex */
public final class LazyGridItemScopeImpl implements LazyGridItemScope {
    public static final int $stable = 0;

    @k
    public static final LazyGridItemScopeImpl INSTANCE = new LazyGridItemScopeImpl();

    private LazyGridItemScopeImpl() {
    }

    @Override // androidx.compose.foundation.lazy.grid.LazyGridItemScope
    @k
    public Modifier animateItem(@k Modifier modifier, @l FiniteAnimationSpec<Float> finiteAnimationSpec, @l FiniteAnimationSpec<IntOffset> finiteAnimationSpec2, @l FiniteAnimationSpec<Float> finiteAnimationSpec3) {
        return (finiteAnimationSpec == null && finiteAnimationSpec2 == null && finiteAnimationSpec3 == null) ? modifier : modifier.then(new LazyLayoutAnimateItemElement(finiteAnimationSpec, finiteAnimationSpec2, finiteAnimationSpec3));
    }
}
