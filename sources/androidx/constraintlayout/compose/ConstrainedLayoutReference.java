package androidx.constraintlayout.compose;

import androidx.compose.runtime.Stable;
import androidx.constraintlayout.compose.ConstraintLayoutBaseScope;
import m80.k;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@Stable
/* loaded from: classes2.dex */
public final class ConstrainedLayoutReference extends LayoutReference {
    public static final int $stable = 0;

    @k
    private final ConstraintLayoutBaseScope.VerticalAnchor absoluteLeft;

    @k
    private final ConstraintLayoutBaseScope.VerticalAnchor absoluteRight;

    @k
    private final ConstraintLayoutBaseScope.BaselineAnchor baseline;

    @k
    private final ConstraintLayoutBaseScope.HorizontalAnchor bottom;

    @k
    private final ConstraintLayoutBaseScope.VerticalAnchor end;

    /* renamed from: id, reason: collision with root package name */
    @k
    private final Object f4237id;

    @k
    private final ConstraintLayoutBaseScope.VerticalAnchor start;

    @k
    private final ConstraintLayoutBaseScope.HorizontalAnchor top;

    public ConstrainedLayoutReference(@k Object obj) {
        super(obj);
        this.f4237id = obj;
        this.start = new ConstraintLayoutBaseScope.VerticalAnchor(getId$constraintlayout_compose_release(), -2, this);
        this.absoluteLeft = new ConstraintLayoutBaseScope.VerticalAnchor(getId$constraintlayout_compose_release(), 0, this);
        this.top = new ConstraintLayoutBaseScope.HorizontalAnchor(getId$constraintlayout_compose_release(), 0, this);
        this.end = new ConstraintLayoutBaseScope.VerticalAnchor(getId$constraintlayout_compose_release(), -1, this);
        this.absoluteRight = new ConstraintLayoutBaseScope.VerticalAnchor(getId$constraintlayout_compose_release(), 1, this);
        this.bottom = new ConstraintLayoutBaseScope.HorizontalAnchor(getId$constraintlayout_compose_release(), 1, this);
        this.baseline = new ConstraintLayoutBaseScope.BaselineAnchor(getId$constraintlayout_compose_release(), this);
    }

    @k
    public final ConstraintLayoutBaseScope.VerticalAnchor getAbsoluteLeft() {
        return this.absoluteLeft;
    }

    @k
    public final ConstraintLayoutBaseScope.VerticalAnchor getAbsoluteRight() {
        return this.absoluteRight;
    }

    @k
    public final ConstraintLayoutBaseScope.BaselineAnchor getBaseline() {
        return this.baseline;
    }

    @k
    public final ConstraintLayoutBaseScope.HorizontalAnchor getBottom() {
        return this.bottom;
    }

    @k
    public final ConstraintLayoutBaseScope.VerticalAnchor getEnd() {
        return this.end;
    }

    @Override // androidx.constraintlayout.compose.LayoutReference
    @k
    public Object getId$constraintlayout_compose_release() {
        return this.f4237id;
    }

    @k
    public final ConstraintLayoutBaseScope.VerticalAnchor getStart() {
        return this.start;
    }

    @k
    public final ConstraintLayoutBaseScope.HorizontalAnchor getTop() {
        return this.top;
    }

    @Stable
    public static /* synthetic */ void getAbsoluteLeft$annotations() {
    }

    @Stable
    public static /* synthetic */ void getAbsoluteRight$annotations() {
    }

    @Stable
    public static /* synthetic */ void getBaseline$annotations() {
    }

    @Stable
    public static /* synthetic */ void getBottom$annotations() {
    }

    @Stable
    public static /* synthetic */ void getEnd$annotations() {
    }

    @Stable
    public static /* synthetic */ void getStart$annotations() {
    }

    @Stable
    public static /* synthetic */ void getTop$annotations() {
    }
}
