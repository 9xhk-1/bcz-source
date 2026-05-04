package androidx.constraintlayout.compose;

import androidx.compose.foundation.layout.LayoutScopeMarker;
import androidx.compose.runtime.internal.StabilityInferred;
import h10.n;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlin.jvm.internal.o0;
import m80.k;
import m80.l;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@LayoutScopeMarker
@StabilityInferred(parameters = 0)
@ExperimentalMotionApi
/* loaded from: classes2.dex */
public final class KeyPositionScope extends BaseKeyFrameScope {
    static final /* synthetic */ n<Object>[] $$delegatedProperties = {o0.k(new MutablePropertyReference1Impl(KeyPositionScope.class, "percentX", "getPercentX()F", 0)), o0.k(new MutablePropertyReference1Impl(KeyPositionScope.class, "percentY", "getPercentY()F", 0)), o0.k(new MutablePropertyReference1Impl(KeyPositionScope.class, "percentWidth", "getPercentWidth()F", 0)), o0.k(new MutablePropertyReference1Impl(KeyPositionScope.class, "percentHeight", "getPercentHeight()F", 0)), o0.k(new MutablePropertyReference1Impl(KeyPositionScope.class, "curveFit", "getCurveFit()Landroidx/constraintlayout/compose/CurveFit;", 0))};
    public static final int $stable = 8;

    @k
    private final d10.c curveFit$delegate;

    @k
    private final d10.c percentHeight$delegate;

    @k
    private final d10.c percentWidth$delegate;

    @k
    private final d10.c percentX$delegate;

    @k
    private final d10.c percentY$delegate;

    public KeyPositionScope() {
        super(null);
        Float valueOf = Float.valueOf(1.0f);
        this.percentX$delegate = BaseKeyFrameScope.addOnPropertyChange$default(this, valueOf, null, 2, null);
        this.percentY$delegate = BaseKeyFrameScope.addOnPropertyChange$default(this, valueOf, null, 2, null);
        this.percentWidth$delegate = BaseKeyFrameScope.addOnPropertyChange$default(this, valueOf, null, 2, null);
        this.percentHeight$delegate = BaseKeyFrameScope.addOnPropertyChange$default(this, Float.valueOf(0.0f), null, 2, null);
        this.curveFit$delegate = BaseKeyFrameScope.addNameOnPropertyChange$default(this, null, null, 2, null);
    }

    @l
    public final CurveFit getCurveFit() {
        return (CurveFit) this.curveFit$delegate.getValue(this, $$delegatedProperties[4]);
    }

    public final float getPercentHeight() {
        return ((Number) this.percentHeight$delegate.getValue(this, $$delegatedProperties[3])).floatValue();
    }

    public final float getPercentWidth() {
        return ((Number) this.percentWidth$delegate.getValue(this, $$delegatedProperties[2])).floatValue();
    }

    public final float getPercentX() {
        return ((Number) this.percentX$delegate.getValue(this, $$delegatedProperties[0])).floatValue();
    }

    public final float getPercentY() {
        return ((Number) this.percentY$delegate.getValue(this, $$delegatedProperties[1])).floatValue();
    }

    public final void setCurveFit(@l CurveFit curveFit) {
        this.curveFit$delegate.setValue(this, $$delegatedProperties[4], curveFit);
    }

    public final void setPercentHeight(float f11) {
        this.percentHeight$delegate.setValue(this, $$delegatedProperties[3], Float.valueOf(f11));
    }

    public final void setPercentWidth(float f11) {
        this.percentWidth$delegate.setValue(this, $$delegatedProperties[2], Float.valueOf(f11));
    }

    public final void setPercentX(float f11) {
        this.percentX$delegate.setValue(this, $$delegatedProperties[0], Float.valueOf(f11));
    }

    public final void setPercentY(float f11) {
        this.percentY$delegate.setValue(this, $$delegatedProperties[1], Float.valueOf(f11));
    }
}
