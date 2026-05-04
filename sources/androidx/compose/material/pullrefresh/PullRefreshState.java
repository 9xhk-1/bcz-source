package androidx.compose.material.pullrefresh;

import androidx.compose.foundation.MutatorMutex;
import androidx.compose.material.ExperimentalMaterialApi;
import androidx.compose.runtime.MutableFloatState;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.PrimitiveSnapshotStateKt;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.internal.StabilityInferred;
import c40.l2;
import c40.r0;
import g10.u;
import kotlin.jvm.internal.u0;
import m80.k;
import x00.a;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
@ExperimentalMaterialApi
@u0({"SMAP\nPullRefreshState.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PullRefreshState.kt\nandroidx/compose/material/pullrefresh/PullRefreshState\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 3 SnapshotFloatState.kt\nandroidx/compose/runtime/PrimitiveSnapshotStateKt__SnapshotFloatStateKt\n+ 4 MathHelpers.kt\nandroidx/compose/ui/util/MathHelpersKt\n*L\n1#1,241:1\n85#2:242\n85#2:243\n113#2,2:244\n79#3:246\n112#3,2:247\n79#3:249\n112#3,2:250\n79#3:252\n112#3,2:253\n79#3:255\n112#3,2:256\n71#4,16:258\n*S KotlinDebug\n*F\n+ 1 PullRefreshState.kt\nandroidx/compose/material/pullrefresh/PullRefreshState\n*L\n128#1:242\n130#1:243\n130#1:244,2\n131#1:246\n131#1:247,2\n132#1:249\n132#1:250,2\n133#1:252\n133#1:253,2\n134#1:255\n134#1:256,2\n211#1:258,16\n*E\n"})
/* loaded from: classes.dex */
public final class PullRefreshState {
    public static final int $stable = 8;

    @k
    private final MutableFloatState _refreshingOffset$delegate;

    @k
    private final MutableFloatState _threshold$delegate;

    @k
    private final r0 animationScope;

    @k
    private final State<a<g2>> onRefreshState;

    @k
    private final State adjustedDistancePulled$delegate = SnapshotStateKt.derivedStateOf(new a<Float>() { // from class: androidx.compose.material.pullrefresh.PullRefreshState$adjustedDistancePulled$2
        {
            super(0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // x00.a
        public final Float invoke() {
            float distancePulled;
            distancePulled = PullRefreshState.this.getDistancePulled();
            return Float.valueOf(distancePulled * 0.5f);
        }
    });

    @k
    private final MutableState _refreshing$delegate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);

    @k
    private final MutableFloatState _position$delegate = PrimitiveSnapshotStateKt.mutableFloatStateOf(0.0f);

    @k
    private final MutableFloatState distancePulled$delegate = PrimitiveSnapshotStateKt.mutableFloatStateOf(0.0f);

    @k
    private final MutatorMutex mutatorMutex = new MutatorMutex();

    /* JADX WARN: Multi-variable type inference failed */
    public PullRefreshState(@k r0 r0Var, @k State<? extends a<g2>> state, float f11, float f12) {
        this.animationScope = r0Var;
        this.onRefreshState = state;
        this._threshold$delegate = PrimitiveSnapshotStateKt.mutableFloatStateOf(f12);
        this._refreshingOffset$delegate = PrimitiveSnapshotStateKt.mutableFloatStateOf(f11);
    }

    private final l2 animateIndicatorTo(float f11) {
        l2 f12;
        f12 = c40.k.f(this.animationScope, null, null, new PullRefreshState$animateIndicatorTo$1(this, f11, null), 3, null);
        return f12;
    }

    private final float calculateIndicatorPosition() {
        if (getAdjustedDistancePulled() <= getThreshold$material_release()) {
            return getAdjustedDistancePulled();
        }
        float abs = Math.abs(getProgress()) - 1.0f;
        if (abs < 0.0f) {
            abs = 0.0f;
        }
        if (abs > 2.0f) {
            abs = 2.0f;
        }
        return getThreshold$material_release() + (getThreshold$material_release() * (abs - (((float) Math.pow(abs, 2)) / 4)));
    }

    private final float getAdjustedDistancePulled() {
        return ((Number) this.adjustedDistancePulled$delegate.getValue()).floatValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final float getDistancePulled() {
        return this.distancePulled$delegate.getFloatValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final float get_position() {
        return this._position$delegate.getFloatValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final boolean get_refreshing() {
        return ((Boolean) this._refreshing$delegate.getValue()).booleanValue();
    }

    private final float get_refreshingOffset() {
        return this._refreshingOffset$delegate.getFloatValue();
    }

    private final float get_threshold() {
        return this._threshold$delegate.getFloatValue();
    }

    private final void setDistancePulled(float f11) {
        this.distancePulled$delegate.setFloatValue(f11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void set_position(float f11) {
        this._position$delegate.setFloatValue(f11);
    }

    private final void set_refreshing(boolean z11) {
        this._refreshing$delegate.setValue(Boolean.valueOf(z11));
    }

    private final void set_refreshingOffset(float f11) {
        this._refreshingOffset$delegate.setFloatValue(f11);
    }

    private final void set_threshold(float f11) {
        this._threshold$delegate.setFloatValue(f11);
    }

    public final float getPosition$material_release() {
        return get_position();
    }

    public final float getProgress() {
        return getAdjustedDistancePulled() / getThreshold$material_release();
    }

    public final boolean getRefreshing$material_release() {
        return get_refreshing();
    }

    public final float getThreshold$material_release() {
        return get_threshold();
    }

    public final float onPull$material_release(float f11) {
        if (get_refreshing()) {
            return 0.0f;
        }
        float t11 = u.t(getDistancePulled() + f11, 0.0f);
        float distancePulled = t11 - getDistancePulled();
        setDistancePulled(t11);
        set_position(calculateIndicatorPosition());
        return distancePulled;
    }

    public final float onRelease$material_release(float f11) {
        if (getRefreshing$material_release()) {
            return 0.0f;
        }
        if (getAdjustedDistancePulled() > getThreshold$material_release()) {
            this.onRefreshState.getValue().invoke();
        }
        animateIndicatorTo(0.0f);
        if (getDistancePulled() == 0.0f || f11 < 0.0f) {
            f11 = 0.0f;
        }
        setDistancePulled(0.0f);
        return f11;
    }

    public final void setRefreshing$material_release(boolean z11) {
        if (get_refreshing() != z11) {
            set_refreshing(z11);
            setDistancePulled(0.0f);
            animateIndicatorTo(z11 ? get_refreshingOffset() : 0.0f);
        }
    }

    public final void setRefreshingOffset$material_release(float f11) {
        if (get_refreshingOffset() == f11) {
            return;
        }
        set_refreshingOffset(f11);
        if (getRefreshing$material_release()) {
            animateIndicatorTo(f11);
        }
    }

    public final void setThreshold$material_release(float f11) {
        set_threshold(f11);
    }
}
