package androidx.compose.animation;

import androidx.compose.animation.core.FiniteAnimationSpec;
import androidx.compose.ui.geometry.Rect;
import m80.k;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@ExperimentalSharedTransitionApi
/* loaded from: classes.dex */
public interface BoundsTransform {
    @k
    FiniteAnimationSpec<Rect> transform(@k Rect rect, @k Rect rect2);
}
