package androidx.compose.material;

import androidx.compose.foundation.interaction.Interaction;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.runtime.State;
import c40.r0;
import m80.k;
import x00.p;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes.dex */
final class RangeSliderLogic {

    @k
    private final MutableInteractionSource endInteractionSource;

    @k
    private final State<p<Boolean, Float, g2>> onDrag;

    @k
    private final State<Float> rawOffsetEnd;

    @k
    private final State<Float> rawOffsetStart;

    @k
    private final MutableInteractionSource startInteractionSource;

    /* JADX WARN: Multi-variable type inference failed */
    public RangeSliderLogic(@k MutableInteractionSource mutableInteractionSource, @k MutableInteractionSource mutableInteractionSource2, @k State<Float> state, @k State<Float> state2, @k State<? extends p<? super Boolean, ? super Float, g2>> state3) {
        this.startInteractionSource = mutableInteractionSource;
        this.endInteractionSource = mutableInteractionSource2;
        this.rawOffsetStart = state;
        this.rawOffsetEnd = state2;
        this.onDrag = state3;
    }

    @k
    public final MutableInteractionSource activeInteraction(boolean z11) {
        return z11 ? this.startInteractionSource : this.endInteractionSource;
    }

    public final void captureThumb(boolean z11, float f11, @k Interaction interaction, @k r0 r0Var) {
        this.onDrag.getValue().invoke(Boolean.valueOf(z11), Float.valueOf(f11 - (z11 ? this.rawOffsetStart : this.rawOffsetEnd).getValue().floatValue()));
        c40.k.f(r0Var, null, null, new RangeSliderLogic$captureThumb$1(this, z11, interaction, null), 3, null);
    }

    public final int compareOffsets(float f11) {
        return Float.compare(Math.abs(this.rawOffsetStart.getValue().floatValue() - f11), Math.abs(this.rawOffsetEnd.getValue().floatValue() - f11));
    }

    @k
    public final MutableInteractionSource getEndInteractionSource() {
        return this.endInteractionSource;
    }

    @k
    public final State<p<Boolean, Float, g2>> getOnDrag() {
        return this.onDrag;
    }

    @k
    public final State<Float> getRawOffsetEnd() {
        return this.rawOffsetEnd;
    }

    @k
    public final State<Float> getRawOffsetStart() {
        return this.rawOffsetStart;
    }

    @k
    public final MutableInteractionSource getStartInteractionSource() {
        return this.startInteractionSource;
    }
}
