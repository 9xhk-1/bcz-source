package androidx.constraintlayout.compose;

import androidx.compose.runtime.Stable;
import androidx.constraintlayout.compose.ConstraintLayoutBaseScope;
import m80.k;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@Stable
/* loaded from: classes2.dex */
public final class VerticalChainReference extends LayoutReference {
    public static final int $stable = 0;

    @k
    private final ConstraintLayoutBaseScope.HorizontalAnchor bottom;

    @k
    private final ConstraintLayoutBaseScope.HorizontalAnchor top;

    public VerticalChainReference(@k Object obj) {
        super(obj);
        this.top = new ConstraintLayoutBaseScope.HorizontalAnchor(obj, 0, this);
        this.bottom = new ConstraintLayoutBaseScope.HorizontalAnchor(obj, 1, this);
    }

    @k
    public final ConstraintLayoutBaseScope.HorizontalAnchor getBottom() {
        return this.bottom;
    }

    @k
    public final ConstraintLayoutBaseScope.HorizontalAnchor getTop() {
        return this.top;
    }

    @Stable
    public static /* synthetic */ void getBottom$annotations() {
    }

    @Stable
    public static /* synthetic */ void getTop$annotations() {
    }
}
