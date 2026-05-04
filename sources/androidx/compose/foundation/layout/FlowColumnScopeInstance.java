package androidx.compose.foundation.layout;

import androidx.annotation.FloatRange;
import androidx.compose.foundation.layout.internal.InlineClassHelperKt;
import androidx.compose.runtime.Stable;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.Measured;
import androidx.compose.ui.layout.VerticalAlignmentLine;
import kotlin.jvm.internal.u0;
import x00.l;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 1)
@u0({"SMAP\nFlowLayout.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FlowLayout.kt\nandroidx/compose/foundation/layout/FlowColumnScopeInstance\n+ 2 InlineClassHelper.kt\nandroidx/compose/foundation/layout/internal/InlineClassHelperKt\n*L\n1#1,1594:1\n92#2,5:1595\n*S KotlinDebug\n*F\n+ 1 FlowLayout.kt\nandroidx/compose/foundation/layout/FlowColumnScopeInstance\n*L\n391#1:1595,5\n*E\n"})
/* loaded from: classes.dex */
public final class FlowColumnScopeInstance implements ColumnScope, FlowColumnScope {
    public static final int $stable = 0;

    @m80.k
    public static final FlowColumnScopeInstance INSTANCE = new FlowColumnScopeInstance();
    private final /* synthetic */ ColumnScopeInstance $$delegate_0 = ColumnScopeInstance.INSTANCE;

    private FlowColumnScopeInstance() {
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
    @m80.k
    public Modifier fillMaxColumnWidth(@m80.k Modifier modifier, float f11) {
        if (!(f11 >= 0.0f && f11 <= 1.0f)) {
            InlineClassHelperKt.throwIllegalArgumentException("invalid fraction " + f11 + "; must be >= 0 and <= 1.0");
        }
        return modifier.then(new FillCrossAxisSizeElement(f11));
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
