package androidx.constraintlayout.compose;

import androidx.compose.runtime.Stable;
import androidx.constraintlayout.compose.ConstraintLayoutBaseScope;
import m80.k;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@Stable
/* loaded from: classes2.dex */
public final class HorizontalChainReference extends LayoutReference {
    public static final int $stable = 0;

    @k
    private final ConstraintLayoutBaseScope.VerticalAnchor absoluteLeft;

    @k
    private final ConstraintLayoutBaseScope.VerticalAnchor absoluteRight;

    @k
    private final ConstraintLayoutBaseScope.VerticalAnchor end;

    @k
    private final ConstraintLayoutBaseScope.VerticalAnchor start;

    public HorizontalChainReference(@k Object obj) {
        super(obj);
        this.start = new ConstraintLayoutBaseScope.VerticalAnchor(obj, -2, this);
        this.absoluteLeft = new ConstraintLayoutBaseScope.VerticalAnchor(obj, 0, this);
        this.end = new ConstraintLayoutBaseScope.VerticalAnchor(obj, -1, this);
        this.absoluteRight = new ConstraintLayoutBaseScope.VerticalAnchor(obj, 1, this);
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
    public final ConstraintLayoutBaseScope.VerticalAnchor getEnd() {
        return this.end;
    }

    @k
    public final ConstraintLayoutBaseScope.VerticalAnchor getStart() {
        return this.start;
    }

    @Stable
    public static /* synthetic */ void getAbsoluteLeft$annotations() {
    }

    @Stable
    public static /* synthetic */ void getAbsoluteRight$annotations() {
    }

    @Stable
    public static /* synthetic */ void getEnd$annotations() {
    }

    @Stable
    public static /* synthetic */ void getStart$annotations() {
    }
}
