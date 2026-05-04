package androidx.compose.foundation.layout;

import androidx.compose.foundation.layout.internal.InlineClassHelperKt;
import androidx.compose.runtime.Stable;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.HorizontalAlignmentLine;
import androidx.compose.ui.layout.Measured;
import g10.u;
import kotlin.jvm.internal.u0;
import x00.l;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 1)
@u0({"SMAP\nRow.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Row.kt\nandroidx/compose/foundation/layout/RowScopeInstance\n+ 2 InlineClassHelper.kt\nandroidx/compose/foundation/layout/internal/InlineClassHelperKt\n*L\n1#1,408:1\n92#2,5:409\n*S KotlinDebug\n*F\n+ 1 Row.kt\nandroidx/compose/foundation/layout/RowScopeInstance\n*L\n385#1:409,5\n*E\n"})
/* loaded from: classes.dex */
public final class RowScopeInstance implements RowScope {
    public static final int $stable = 0;

    @m80.k
    public static final RowScopeInstance INSTANCE = new RowScopeInstance();

    private RowScopeInstance() {
    }

    @Override // androidx.compose.foundation.layout.RowScope
    @Stable
    @m80.k
    public Modifier align(@m80.k Modifier modifier, @m80.k Alignment.Vertical vertical) {
        return modifier.then(new VerticalAlignElement(vertical));
    }

    @Override // androidx.compose.foundation.layout.RowScope
    @Stable
    @m80.k
    public Modifier alignBy(@m80.k Modifier modifier, @m80.k HorizontalAlignmentLine horizontalAlignmentLine) {
        return modifier.then(new WithAlignmentLineElement(horizontalAlignmentLine));
    }

    @Override // androidx.compose.foundation.layout.RowScope
    @Stable
    @m80.k
    public Modifier alignByBaseline(@m80.k Modifier modifier) {
        return alignBy(modifier, androidx.compose.ui.layout.AlignmentLineKt.getFirstBaseline());
    }

    @Override // androidx.compose.foundation.layout.RowScope
    @Stable
    @m80.k
    public Modifier weight(@m80.k Modifier modifier, float f11, boolean z11) {
        if (!(((double) f11) > 0.0d)) {
            InlineClassHelperKt.throwIllegalArgumentException("invalid weight; must be greater than zero");
        }
        return modifier.then(new LayoutWeightElement(u.A(f11, Float.MAX_VALUE), z11));
    }

    @Override // androidx.compose.foundation.layout.RowScope
    @m80.k
    public Modifier alignBy(@m80.k Modifier modifier, @m80.k l<? super Measured, Integer> lVar) {
        return modifier.then(new WithAlignmentLineBlockElement(lVar));
    }
}
