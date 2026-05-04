package androidx.compose.ui.platform;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.node.OwnerScope;
import androidx.compose.ui.semantics.ScrollAxisRange;
import java.util.List;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
/* loaded from: classes2.dex */
public final class ScrollObservationScope implements OwnerScope {
    public static final int $stable = 8;

    @m80.k
    private final List<ScrollObservationScope> allScopes;

    @m80.l
    private ScrollAxisRange horizontalScrollAxisRange;

    @m80.l
    private Float oldXValue;

    @m80.l
    private Float oldYValue;
    private final int semanticsNodeId;

    @m80.l
    private ScrollAxisRange verticalScrollAxisRange;

    public ScrollObservationScope(int i11, @m80.k List<ScrollObservationScope> list, @m80.l Float f11, @m80.l Float f12, @m80.l ScrollAxisRange scrollAxisRange, @m80.l ScrollAxisRange scrollAxisRange2) {
        this.semanticsNodeId = i11;
        this.allScopes = list;
        this.oldXValue = f11;
        this.oldYValue = f12;
        this.horizontalScrollAxisRange = scrollAxisRange;
        this.verticalScrollAxisRange = scrollAxisRange2;
    }

    @m80.k
    public final List<ScrollObservationScope> getAllScopes() {
        return this.allScopes;
    }

    @m80.l
    public final ScrollAxisRange getHorizontalScrollAxisRange() {
        return this.horizontalScrollAxisRange;
    }

    @m80.l
    public final Float getOldXValue() {
        return this.oldXValue;
    }

    @m80.l
    public final Float getOldYValue() {
        return this.oldYValue;
    }

    public final int getSemanticsNodeId() {
        return this.semanticsNodeId;
    }

    @m80.l
    public final ScrollAxisRange getVerticalScrollAxisRange() {
        return this.verticalScrollAxisRange;
    }

    @Override // androidx.compose.ui.node.OwnerScope
    public boolean isValidOwnerScope() {
        return this.allScopes.contains(this);
    }

    public final void setHorizontalScrollAxisRange(@m80.l ScrollAxisRange scrollAxisRange) {
        this.horizontalScrollAxisRange = scrollAxisRange;
    }

    public final void setOldXValue(@m80.l Float f11) {
        this.oldXValue = f11;
    }

    public final void setOldYValue(@m80.l Float f11) {
        this.oldYValue = f11;
    }

    public final void setVerticalScrollAxisRange(@m80.l ScrollAxisRange scrollAxisRange) {
        this.verticalScrollAxisRange = scrollAxisRange;
    }
}
