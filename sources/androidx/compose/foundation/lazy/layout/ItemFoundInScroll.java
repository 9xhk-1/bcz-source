package androidx.compose.foundation.lazy.layout;

import androidx.compose.animation.core.AnimationState;
import androidx.compose.animation.core.AnimationVector1D;
import java.util.concurrent.CancellationException;
import m80.k;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes.dex */
final class ItemFoundInScroll extends CancellationException {
    private final int itemOffset;

    @k
    private final AnimationState<Float, AnimationVector1D> previousAnimation;

    public ItemFoundInScroll(int i11, @k AnimationState<Float, AnimationVector1D> animationState) {
        this.itemOffset = i11;
        this.previousAnimation = animationState;
    }

    public final int getItemOffset() {
        return this.itemOffset;
    }

    @k
    public final AnimationState<Float, AnimationVector1D> getPreviousAnimation() {
        return this.previousAnimation;
    }
}
