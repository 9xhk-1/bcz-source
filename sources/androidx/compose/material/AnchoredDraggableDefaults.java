package androidx.compose.material;

import androidx.compose.animation.core.SpringSpec;
import androidx.compose.runtime.Stable;
import m80.k;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@Stable
@ExperimentalMaterialApi
/* loaded from: classes.dex */
public final class AnchoredDraggableDefaults {
    public static final int $stable = 0;

    @k
    public static final AnchoredDraggableDefaults INSTANCE = new AnchoredDraggableDefaults();

    @k
    private static final SpringSpec<Float> AnimationSpec = new SpringSpec<>(0.0f, 0.0f, null, 7, null);

    private AnchoredDraggableDefaults() {
    }

    @ExperimentalMaterialApi
    @k
    public final SpringSpec<Float> getAnimationSpec() {
        return AnimationSpec;
    }

    @ExperimentalMaterialApi
    public static /* synthetic */ void getAnimationSpec$annotations() {
    }
}
