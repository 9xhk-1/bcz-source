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
import kotlin.jvm.internal.v;
import x00.l;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 1)
@u0({"SMAP\nContextualFlowLayout.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ContextualFlowLayout.kt\nandroidx/compose/foundation/layout/ContextualFlowRowScopeImpl\n+ 2 InlineClassHelper.kt\nandroidx/compose/foundation/layout/internal/InlineClassHelperKt\n*L\n1#1,594:1\n92#2,5:595\n*S KotlinDebug\n*F\n+ 1 ContextualFlowLayout.kt\nandroidx/compose/foundation/layout/ContextualFlowRowScopeImpl\n*L\n345#1:595,5\n*E\n"})
/* loaded from: classes.dex */
public final class ContextualFlowRowScopeImpl implements RowScope, ContextualFlowRowScope {
    public static final int $stable = 0;
    private final /* synthetic */ RowScopeInstance $$delegate_0;
    private final int indexInLine;
    private final int lineIndex;
    private final float maxHeight;
    private final float maxWidthInLine;

    public /* synthetic */ ContextualFlowRowScopeImpl(int i11, int i12, float f11, float f12, v vVar) {
        this(i11, i12, f11, f12);
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

    @Override // androidx.compose.foundation.layout.ContextualFlowRowScope
    @m80.k
    public Modifier fillMaxRowHeight(@m80.k Modifier modifier, float f11) {
        boolean z11 = false;
        if (0.0f <= f11 && f11 <= 1.0f) {
            z11 = true;
        }
        if (!z11) {
            InlineClassHelperKt.throwIllegalArgumentException("invalid fraction " + f11 + "; must be >= 0 and <= 1.0");
        }
        return modifier.then(new FillCrossAxisSizeElement(f11));
    }

    @Override // androidx.compose.foundation.layout.ContextualFlowRowScope
    public int getIndexInLine() {
        return this.indexInLine;
    }

    @Override // androidx.compose.foundation.layout.ContextualFlowRowScope
    public int getLineIndex() {
        return this.lineIndex;
    }

    @Override // androidx.compose.foundation.layout.ContextualFlowRowScope
    /* renamed from: getMaxHeight-D9Ej5fM */
    public float mo644getMaxHeightD9Ej5fM() {
        return this.maxHeight;
    }

    @Override // androidx.compose.foundation.layout.ContextualFlowRowScope
    /* renamed from: getMaxWidthInLine-D9Ej5fM */
    public float mo645getMaxWidthInLineD9Ej5fM() {
        return this.maxWidthInLine;
    }

    @Override // androidx.compose.foundation.layout.RowScope
    @Stable
    @m80.k
    public Modifier weight(@m80.k Modifier modifier, @FloatRange(from = 0.0d, fromInclusive = false) float f11, boolean z11) {
        return this.$$delegate_0.weight(modifier, f11, z11);
    }

    private ContextualFlowRowScopeImpl(int i11, int i12, float f11, float f12) {
        this.lineIndex = i11;
        this.indexInLine = i12;
        this.maxWidthInLine = f11;
        this.maxHeight = f12;
        this.$$delegate_0 = RowScopeInstance.INSTANCE;
    }

    @Override // androidx.compose.foundation.layout.RowScope
    @Stable
    @m80.k
    public Modifier alignBy(@m80.k Modifier modifier, @m80.k l<? super Measured, Integer> lVar) {
        return this.$$delegate_0.alignBy(modifier, lVar);
    }
}
