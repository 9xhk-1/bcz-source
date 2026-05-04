package androidx.compose.foundation.layout;

import androidx.annotation.FloatRange;
import androidx.compose.foundation.layout.internal.InlineClassHelperKt;
import androidx.compose.runtime.Stable;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.HorizontalAlignmentLine;
import androidx.compose.ui.layout.Measured;
import kotlin.jvm.internal.u0;
import x00.l;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 1)
@u0({"SMAP\nFlowLayout.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FlowLayout.kt\nandroidx/compose/foundation/layout/FlowRowScopeInstance\n+ 2 InlineClassHelper.kt\nandroidx/compose/foundation/layout/internal/InlineClassHelperKt\n*L\n1#1,1594:1\n92#2,5:1595\n*S KotlinDebug\n*F\n+ 1 FlowLayout.kt\nandroidx/compose/foundation/layout/FlowRowScopeInstance\n*L\n361#1:1595,5\n*E\n"})
/* loaded from: classes.dex */
public final class FlowRowScopeInstance implements RowScope, FlowRowScope {
    public static final int $stable = 0;

    @m80.k
    public static final FlowRowScopeInstance INSTANCE = new FlowRowScopeInstance();
    private final /* synthetic */ RowScopeInstance $$delegate_0 = RowScopeInstance.INSTANCE;

    private FlowRowScopeInstance() {
    }

    @Override // androidx.compose.foundation.layout.RowScope
    @Stable
    @m80.k
    public Modifier align(@m80.k Modifier modifier, @m80.k Alignment.Vertical vertical) {
        return this.$$delegate_0.align(modifier, vertical);
    }

    @Override // androidx.compose.foundation.layout.RowScope
    @Stable
    @m80.k
    public Modifier alignBy(@m80.k Modifier modifier, @m80.k HorizontalAlignmentLine horizontalAlignmentLine) {
        return this.$$delegate_0.alignBy(modifier, horizontalAlignmentLine);
    }

    @Override // androidx.compose.foundation.layout.RowScope
    @Stable
    @m80.k
    public Modifier alignByBaseline(@m80.k Modifier modifier) {
        return this.$$delegate_0.alignByBaseline(modifier);
    }

    @Override // androidx.compose.foundation.layout.FlowRowScope
    @m80.k
    public Modifier fillMaxRowHeight(@m80.k Modifier modifier, float f11) {
        if (!(f11 >= 0.0f && f11 <= 1.0f)) {
            InlineClassHelperKt.throwIllegalArgumentException("invalid fraction " + f11 + "; must be >= 0 and <= 1.0");
        }
        return modifier.then(new FillCrossAxisSizeElement(f11));
    }

    @Override // androidx.compose.foundation.layout.RowScope
    @Stable
    @m80.k
    public Modifier weight(@m80.k Modifier modifier, @FloatRange(from = 0.0d, fromInclusive = false) float f11, boolean z11) {
        return this.$$delegate_0.weight(modifier, f11, z11);
    }

    @Override // androidx.compose.foundation.layout.RowScope
    @Stable
    @m80.k
    public Modifier alignBy(@m80.k Modifier modifier, @m80.k l<? super Measured, Integer> lVar) {
        return this.$$delegate_0.alignBy(modifier, lVar);
    }
}
