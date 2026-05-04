package androidx.compose.animation;

import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.SpringSpec;
import androidx.compose.animation.core.VisibilityThresholdsKt;
import androidx.compose.ui.geometry.Rect;
import m80.k;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes.dex */
public final class BoundsAnimationKt {

    @k
    private static final SpringSpec<Rect> DefaultBoundsAnimation = AnimationSpecKt.spring$default(0.0f, 400.0f, VisibilityThresholdsKt.getVisibilityThreshold(Rect.Companion), 1, null);
}
