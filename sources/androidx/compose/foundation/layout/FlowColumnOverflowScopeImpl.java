package androidx.compose.foundation.layout;

import androidx.annotation.FloatRange;
import androidx.compose.runtime.Stable;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.Measured;
import androidx.compose.ui.layout.VerticalAlignmentLine;
import x00.l;
import yz.c0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 1)
/* loaded from: classes.dex */
public final class FlowColumnOverflowScopeImpl implements FlowColumnScope, FlowColumnOverflowScope {
    public static final int $stable = 0;

    @m80.k
    private final c0 shownItemCount$delegate;

    @m80.k
    private final FlowLayoutOverflowState state;
    private final /* synthetic */ FlowColumnScopeInstance $$delegate_0 = FlowColumnScopeInstance.INSTANCE;

    @m80.k
    private final c0 totalItemCount$delegate = FlowLayoutOverflowKt.lazyInt$default(null, new x00.a<Integer>() { // from class: androidx.compose.foundation.layout.FlowColumnOverflowScopeImpl$totalItemCount$2
        {
            super(0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // x00.a
        public final Integer invoke() {
            FlowLayoutOverflowState flowLayoutOverflowState;
            flowLayoutOverflowState = FlowColumnOverflowScopeImpl.this.state;
            return Integer.valueOf(flowLayoutOverflowState.getItemCount$foundation_layout_release());
        }
    }, 1, null);

    public FlowColumnOverflowScopeImpl(@m80.k FlowLayoutOverflowState flowLayoutOverflowState) {
        this.state = flowLayoutOverflowState;
        this.shownItemCount$delegate = FlowLayoutOverflowKt.lazyInt(flowLayoutOverflowState.getShownItemLazyErrorMessage$foundation_layout_release(), new x00.a<Integer>() { // from class: androidx.compose.foundation.layout.FlowColumnOverflowScopeImpl$shownItemCount$2
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // x00.a
            public final Integer invoke() {
                FlowLayoutOverflowState flowLayoutOverflowState2;
                flowLayoutOverflowState2 = FlowColumnOverflowScopeImpl.this.state;
                return Integer.valueOf(flowLayoutOverflowState2.getItemShown$foundation_layout_release());
            }
        });
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
        return ((Number) this.shownItemCount$delegate.getValue()).intValue();
    }

    @Override // androidx.compose.foundation.layout.FlowColumnOverflowScope
    public int getTotalItemCount() {
        return ((Number) this.totalItemCount$delegate.getValue()).intValue();
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
