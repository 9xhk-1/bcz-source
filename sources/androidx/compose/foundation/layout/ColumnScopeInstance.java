package androidx.compose.foundation.layout;

import androidx.compose.foundation.layout.internal.InlineClassHelperKt;
import androidx.compose.runtime.Stable;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.Measured;
import androidx.compose.ui.layout.VerticalAlignmentLine;
import g10.u;
import kotlin.jvm.internal.u0;
import x00.l;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 1)
@u0({"SMAP\nColumn.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Column.kt\nandroidx/compose/foundation/layout/ColumnScopeInstance\n+ 2 InlineClassHelper.kt\nandroidx/compose/foundation/layout/internal/InlineClassHelperKt\n*L\n1#1,385:1\n92#2,5:386\n*S KotlinDebug\n*F\n+ 1 Column.kt\nandroidx/compose/foundation/layout/ColumnScopeInstance\n*L\n363#1:386,5\n*E\n"})
/* loaded from: classes.dex */
public final class ColumnScopeInstance implements ColumnScope {
    public static final int $stable = 0;

    @m80.k
    public static final ColumnScopeInstance INSTANCE = new ColumnScopeInstance();

    private ColumnScopeInstance() {
    }

    @Override // androidx.compose.foundation.layout.ColumnScope
    @Stable
    @m80.k
    public Modifier align(@m80.k Modifier modifier, @m80.k Alignment.Horizontal horizontal) {
        return modifier.then(new HorizontalAlignElement(horizontal));
    }

    @Override // androidx.compose.foundation.layout.ColumnScope
    @Stable
    @m80.k
    public Modifier alignBy(@m80.k Modifier modifier, @m80.k VerticalAlignmentLine verticalAlignmentLine) {
        return modifier.then(new WithAlignmentLineElement(verticalAlignmentLine));
    }

    @Override // androidx.compose.foundation.layout.ColumnScope
    @Stable
    @m80.k
    public Modifier weight(@m80.k Modifier modifier, float f11, boolean z11) {
        if (!(((double) f11) > 0.0d)) {
            InlineClassHelperKt.throwIllegalArgumentException("invalid weight; must be greater than zero");
        }
        return modifier.then(new LayoutWeightElement(u.A(f11, Float.MAX_VALUE), z11));
    }

    @Override // androidx.compose.foundation.layout.ColumnScope
    @Stable
    @m80.k
    public Modifier alignBy(@m80.k Modifier modifier, @m80.k l<? super Measured, Integer> lVar) {
        return modifier.then(new WithAlignmentLineBlockElement(lVar));
    }
}
