package androidx.compose.animation.core;

import androidx.compose.animation.core.AnimationVector;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.internal.StabilityInferred;
import c40.r0;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import m80.k;
import m80.l;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
@ExperimentalAnimatableApi
@u0({"SMAP\nDeferredTargetAnimation.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DeferredTargetAnimation.kt\nandroidx/compose/animation/core/DeferredTargetAnimation\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,90:1\n85#2:91\n113#2,2:92\n1#3:94\n*S KotlinDebug\n*F\n+ 1 DeferredTargetAnimation.kt\nandroidx/compose/animation/core/DeferredTargetAnimation\n*L\n51#1:91\n51#1:92,2\n*E\n"})
/* loaded from: classes.dex */
public final class DeferredTargetAnimation<T, V extends AnimationVector> {
    public static final int $stable = 8;

    @k
    private final MutableState _pendingTarget$delegate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);

    @l
    private Animatable<T, V> animatable;

    @k
    private final TwoWayConverter<T, V> vectorConverter;

    public DeferredTargetAnimation(@k TwoWayConverter<T, V> twoWayConverter) {
        this.vectorConverter = twoWayConverter;
    }

    private final T getTarget() {
        Animatable<T, V> animatable = this.animatable;
        if (animatable != null) {
            return animatable.getTargetValue();
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final T get_pendingTarget() {
        return this._pendingTarget$delegate.getValue();
    }

    private final void set_pendingTarget(T t11) {
        this._pendingTarget$delegate.setValue(t11);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Object updateTarget$default(DeferredTargetAnimation deferredTargetAnimation, Object obj, r0 r0Var, FiniteAnimationSpec finiteAnimationSpec, int i11, Object obj2) {
        if ((i11 & 4) != 0) {
            finiteAnimationSpec = AnimationSpecKt.spring$default(0.0f, 0.0f, null, 7, null);
        }
        return deferredTargetAnimation.updateTarget(obj, r0Var, finiteAnimationSpec);
    }

    @l
    public final T getPendingTarget() {
        return get_pendingTarget();
    }

    public final boolean isIdle() {
        if (!g0.g(get_pendingTarget(), getTarget())) {
            return false;
        }
        Animatable<T, V> animatable = this.animatable;
        return animatable == null || !animatable.isRunning();
    }

    public final T updateTarget(T t11, @k r0 r0Var, @k FiniteAnimationSpec<T> finiteAnimationSpec) {
        T t12;
        Animatable<T, V> animatable;
        set_pendingTarget(t11);
        Animatable<T, V> animatable2 = this.animatable;
        if (animatable2 == null) {
            t12 = t11;
            Animatable<T, V> animatable3 = new Animatable<>(t12, this.vectorConverter, null, null, 12, null);
            this.animatable = animatable3;
            animatable = animatable3;
        } else {
            t12 = t11;
            animatable = animatable2;
        }
        c40.k.f(r0Var, null, null, new DeferredTargetAnimation$updateTarget$1(animatable, this, t12, finiteAnimationSpec, null), 3, null);
        return animatable.getValue();
    }
}
