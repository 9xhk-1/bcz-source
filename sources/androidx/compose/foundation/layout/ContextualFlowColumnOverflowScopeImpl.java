package androidx.compose.foundation.layout;

import androidx.annotation.FloatRange;
import androidx.compose.runtime.Stable;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.Measured;
import androidx.compose.ui.layout.VerticalAlignmentLine;
import x00.l;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 1)
@ExperimentalLayoutApi
/* loaded from: classes.dex */
public final class ContextualFlowColumnOverflowScopeImpl implements FlowColumnOverflowScope, ContextualFlowColumnOverflowScope {
    public static final int $stable = 0;
    private final /* synthetic */ FlowColumnOverflowScopeImpl $$delegate_0;

    @m80.k
    private final FlowLayoutOverflowState state;

    public ContextualFlowColumnOverflowScopeImpl(@m80.k FlowLayoutOverflowState flowLayoutOverflowState) {
        this.state = flowLayoutOverflowState;
        this.$$delegate_0 = new FlowColumnOverflowScopeImpl(flowLayoutOverflowState);
    }

    @Override // androidx.compose.foundation.layout.ColumnScope
    @Stable
    @m80.k
    public Modifier align(@m80.k Modifier modifier, @m80.k Alignment.Horizontal horizontal) {
        return this.$$delegate_0.align(modifier, horizontal);
    }

    @Override // androidx.compose.foundation.layout.ColumnScope
    @Stable
    @m80.k
    public Modifier alignBy(@m80.k Modifier modifier, @m80.k VerticalAlignmentLine verticalAlignmentLine) {
        return this.$$delegate_0.alignBy(modifier, verticalAlignmentLine);
    }

    @Override // androidx.compose.foundation.layout.FlowColumnScope
    @ExperimentalLayoutApi
    @m80.k
    public Modifier fillMaxColumnWidth(@m80.k Modifier modifier, @FloatRange(from = 0.0d, to = 1.0d) float f11) {
        return this.$$delegate_0.fillMaxColumnWidth(modifier, f11);
    }

    @Override // androidx.compose.foundation.layout.FlowColumnOverflowScope
    public int getShownItemCount() {
        return this.$$delegate_0.getShownItemCount();
    }

    @Override // androidx.compose.foundation.layout.FlowColumnOverflowScope
    public int getTotalItemCount() {
        return this.$$delegate_0.getTotalItemCount();
    }

    @Override // androidx.compose.foundation.layout.ColumnScope
    @Stable
    @m80.k
    public Modifier weight(@m80.k Modifier modifier, @FloatRange(from = 0.0d, fromInclusive = false) float f11, boolean z11) {
        return this.$$delegate_0.weight(modifier, f11, z11);
    }

    @Override // androidx.compose.foundation.layout.ColumnScope
    @Stable
    @m80.k
    public Modifier alignBy(@m80.k Modifier modifier, @m80.k l<? super Measured, Integer> lVar) {
        return this.$$delegate_0.alignBy(modifier, lVar);
    }
}
