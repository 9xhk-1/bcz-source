package androidx.compose.foundation.lazy.layout;

import androidx.compose.animation.core.AnimationState;
import androidx.compose.animation.core.AnimationStateKt;
import androidx.compose.animation.core.AnimationVector1D;
import androidx.compose.animation.core.TwoWayConverter;
import androidx.compose.animation.core.VectorConvertersKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.runtime.snapshots.Snapshot;
import androidx.compose.ui.unit.Density;
import c40.r0;
import kotlin.jvm.internal.u0;
import kotlin.jvm.internal.z;
import m80.k;
import x00.l;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
@u0({"SMAP\nLazyLayoutScrollDeltaBetweenPasses.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyLayoutScrollDeltaBetweenPasses.kt\nandroidx/compose/foundation/lazy/layout/LazyLayoutScrollDeltaBetweenPasses\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 Snapshot.kt\nandroidx/compose/runtime/snapshots/Snapshot$Companion\n*L\n1#1,89:1\n1#2:90\n602#3,8:91\n*S KotlinDebug\n*F\n+ 1 LazyLayoutScrollDeltaBetweenPasses.kt\nandroidx/compose/foundation/lazy/layout/LazyLayoutScrollDeltaBetweenPasses\n*L\n62#1:91,8\n*E\n"})
/* loaded from: classes.dex */
public final class LazyLayoutScrollDeltaBetweenPasses {
    public static final int $stable = 8;

    @k
    private AnimationState<Float, AnimationVector1D> _scrollDeltaBetweenPasses;

    public LazyLayoutScrollDeltaBetweenPasses() {
        TwoWayConverter<Float, AnimationVector1D> vectorConverter = VectorConvertersKt.getVectorConverter(z.f67060a);
        Float valueOf = Float.valueOf(0.0f);
        this._scrollDeltaBetweenPasses = AnimationStateKt.AnimationState$default(vectorConverter, valueOf, valueOf, 0L, 0L, false, 56, null);
    }

    public final float getScrollDeltaBetweenPasses$foundation_release() {
        return this._scrollDeltaBetweenPasses.getValue().floatValue();
    }

    public final void updateScrollDeltaForApproach$foundation_release(float f11, @k Density density, @k r0 r0Var) {
        float f12;
        f12 = LazyLayoutScrollDeltaBetweenPassesKt.DeltaThresholdForScrollAnimation;
        if (f11 <= density.mo377toPx0680j_4(f12)) {
            return;
        }
        Snapshot.Companion companion = Snapshot.Companion;
        Snapshot currentThreadSnapshot = companion.getCurrentThreadSnapshot();
        l<Object, g2> readObserver = currentThreadSnapshot != null ? currentThreadSnapshot.getReadObserver() : null;
        Snapshot makeCurrentNonObservable = companion.makeCurrentNonObservable(currentThreadSnapshot);
        try {
            float floatValue = this._scrollDeltaBetweenPasses.getValue().floatValue();
            if (this._scrollDeltaBetweenPasses.isRunning()) {
                this._scrollDeltaBetweenPasses = AnimationStateKt.copy$default((AnimationState) this._scrollDeltaBetweenPasses, floatValue - f11, 0.0f, 0L, 0L, false, 30, (Object) null);
                c40.k.f(r0Var, null, null, new LazyLayoutScrollDeltaBetweenPasses$updateScrollDeltaForApproach$2$1(this, null), 3, null);
            } else {
                this._scrollDeltaBetweenPasses = new AnimationState<>(VectorConvertersKt.getVectorConverter(z.f67060a), Float.valueOf(-f11), null, 0L, 0L, false, 60, null);
                c40.k.f(r0Var, null, null, new LazyLayoutScrollDeltaBetweenPasses$updateScrollDeltaForApproach$2$2(this, null), 3, null);
            }
            companion.restoreNonObservable(currentThreadSnapshot, makeCurrentNonObservable, readObserver);
        } catch (Throwable th2) {
            companion.restoreNonObservable(currentThreadSnapshot, makeCurrentNonObservable, readObserver);
            throw th2;
        }
    }
}
