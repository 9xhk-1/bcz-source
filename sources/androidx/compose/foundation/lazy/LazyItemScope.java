package androidx.compose.foundation.lazy;

import androidx.annotation.FloatRange;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.FiniteAnimationSpec;
import androidx.compose.animation.core.VisibilityThresholdsKt;
import androidx.compose.runtime.Stable;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.unit.IntOffset;
import m80.k;
import m80.l;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@LazyScopeMarker
@Stable
/* loaded from: classes.dex */
public interface LazyItemScope {

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class DefaultImpls {
        @Deprecated
        @k
        public static Modifier animateItem(@k LazyItemScope lazyItemScope, @k Modifier modifier, @l FiniteAnimationSpec<Float> finiteAnimationSpec, @l FiniteAnimationSpec<IntOffset> finiteAnimationSpec2, @l FiniteAnimationSpec<Float> finiteAnimationSpec3) {
            return LazyItemScope.super.animateItem(modifier, finiteAnimationSpec, finiteAnimationSpec2, finiteAnimationSpec3);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    static /* synthetic */ Modifier animateItem$default(LazyItemScope lazyItemScope, Modifier modifier, FiniteAnimationSpec finiteAnimationSpec, FiniteAnimationSpec finiteAnimationSpec2, FiniteAnimationSpec finiteAnimationSpec3, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: animateItem");
        }
        if ((i11 & 1) != 0) {
            finiteAnimationSpec = AnimationSpecKt.spring$default(0.0f, 400.0f, null, 5, null);
        }
        if ((i11 & 2) != 0) {
            finiteAnimationSpec2 = AnimationSpecKt.spring$default(0.0f, 400.0f, IntOffset.m5234boximpl(VisibilityThresholdsKt.getVisibilityThreshold(IntOffset.Companion)), 1, null);
        }
        if ((i11 & 4) != 0) {
            finiteAnimationSpec3 = AnimationSpecKt.spring$default(0.0f, 400.0f, null, 5, null);
        }
        return lazyItemScope.animateItem(modifier, finiteAnimationSpec, finiteAnimationSpec2, finiteAnimationSpec3);
    }

    static /* synthetic */ Modifier fillParentMaxHeight$default(LazyItemScope lazyItemScope, Modifier modifier, float f11, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: fillParentMaxHeight");
        }
        if ((i11 & 1) != 0) {
            f11 = 1.0f;
        }
        return lazyItemScope.fillParentMaxHeight(modifier, f11);
    }

    static /* synthetic */ Modifier fillParentMaxSize$default(LazyItemScope lazyItemScope, Modifier modifier, float f11, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: fillParentMaxSize");
        }
        if ((i11 & 1) != 0) {
            f11 = 1.0f;
        }
        return lazyItemScope.fillParentMaxSize(modifier, f11);
    }

    static /* synthetic */ Modifier fillParentMaxWidth$default(LazyItemScope lazyItemScope, Modifier modifier, float f11, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: fillParentMaxWidth");
        }
        if ((i11 & 1) != 0) {
            f11 = 1.0f;
        }
        return lazyItemScope.fillParentMaxWidth(modifier, f11);
    }

    @k
    Modifier fillParentMaxHeight(@k Modifier modifier, @FloatRange(from = 0.0d, to = 1.0d) float f11);

    @k
    Modifier fillParentMaxSize(@k Modifier modifier, @FloatRange(from = 0.0d, to = 1.0d) float f11);

    @k
    Modifier fillParentMaxWidth(@k Modifier modifier, @FloatRange(from = 0.0d, to = 1.0d) float f11);

    @k
    default Modifier animateItem(@k Modifier modifier, @l FiniteAnimationSpec<Float> finiteAnimationSpec, @l FiniteAnimationSpec<IntOffset> finiteAnimationSpec2, @l FiniteAnimationSpec<Float> finiteAnimationSpec3) {
        return modifier;
    }
}
