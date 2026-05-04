package androidx.constraintlayout.compose;

import androidx.annotation.IntRange;
import androidx.compose.foundation.layout.LayoutScopeMarker;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.core.parser.CLNumber;
import h10.n;
import java.util.Arrays;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlin.jvm.internal.o0;
import m80.k;
import x00.l;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@LayoutScopeMarker
@StabilityInferred(parameters = 0)
@ExperimentalMotionApi
/* loaded from: classes2.dex */
public final class KeyPositionsScope extends BaseKeyFramesScope {
    static final /* synthetic */ n<Object>[] $$delegatedProperties = {o0.k(new MutablePropertyReference1Impl(KeyPositionsScope.class, "type", "getType()Landroidx/constraintlayout/compose/RelativePosition;", 0))};
    public static final int $stable = 8;

    @k
    private final d10.c type$delegate;

    public KeyPositionsScope(@k ConstrainedLayoutReference... constrainedLayoutReferenceArr) {
        super((ConstrainedLayoutReference[]) Arrays.copyOf(constrainedLayoutReferenceArr, constrainedLayoutReferenceArr.length), null);
        this.type$delegate = BaseKeyFramesScope.addNameOnPropertyChange$constraintlayout_compose_release$default(this, RelativePosition.Companion.getDelta(), null, 2, null);
    }

    public final void frame(@IntRange(from = 0, to = 100) int i11, @k l<? super KeyPositionScope, g2> lVar) {
        KeyPositionScope keyPositionScope = new KeyPositionScope();
        lVar.invoke(keyPositionScope);
        getFramesContainer$constraintlayout_compose_release().add(new CLNumber(i11));
        keyPositionScope.addToContainer$constraintlayout_compose_release(getKeyFramePropsObject$constraintlayout_compose_release());
    }

    @k
    public final RelativePosition getType() {
        return (RelativePosition) this.type$delegate.getValue(this, $$delegatedProperties[0]);
    }

    public final void setType(@k RelativePosition relativePosition) {
        this.type$delegate.setValue(this, $$delegatedProperties[0], relativePosition);
    }
}
