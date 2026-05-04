package androidx.constraintlayout.compose;

import androidx.annotation.IntRange;
import androidx.compose.foundation.layout.LayoutScopeMarker;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.core.parser.CLNumber;
import java.util.Arrays;
import m80.k;
import x00.l;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@LayoutScopeMarker
@StabilityInferred(parameters = 1)
@ExperimentalMotionApi
/* loaded from: classes2.dex */
public final class KeyCyclesScope extends BaseKeyFramesScope {
    public static final int $stable = 0;

    public KeyCyclesScope(@k ConstrainedLayoutReference... constrainedLayoutReferenceArr) {
        super((ConstrainedLayoutReference[]) Arrays.copyOf(constrainedLayoutReferenceArr, constrainedLayoutReferenceArr.length), null);
    }

    public final void frame(@IntRange(from = 0, to = 100) int i11, @k l<? super KeyCycleScope, g2> lVar) {
        KeyCycleScope keyCycleScope = new KeyCycleScope();
        lVar.invoke(keyCycleScope);
        getFramesContainer$constraintlayout_compose_release().add(new CLNumber(i11));
        keyCycleScope.addToContainer$constraintlayout_compose_release(getKeyFramePropsObject$constraintlayout_compose_release());
    }
}
