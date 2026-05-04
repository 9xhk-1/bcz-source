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
import kotlin.jvm.internal.v;
import x00.l;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 1)
@u0({"SMAP\nContextualFlowLayout.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ContextualFlowLayout.kt\nandroidx/compose/foundation/layout/ContextualFlowColumnScopeImpl\n+ 2 InlineClassHelper.kt\nandroidx/compose/foundation/layout/internal/InlineClassHelperKt\n*L\n1#1,594:1\n92#2,5:595\n*S KotlinDebug\n*F\n+ 1 ContextualFlowLayout.kt\nandroidx/compose/foundation/layout/ContextualFlowColumnScopeImpl\n*L\n364#1:595,5\n*E\n"})
/* loaded from: classes.dex */
public final class ContextualFlowColumnScopeImpl implements ColumnScope, ContextualFlowColumnScope {
    public static final int $stable = 0;
    private final /* synthetic */ ColumnScopeInstance $$delegate_0;
    private final int indexInLine;
    private final int lineIndex;
    private final float maxHeightInLine;
    private final float maxWidth;

    public /* synthetic */ ContextualFlowColumnScopeImpl(int i11, int i12, float f11, float f12, v vVar) {
        this(i11, i12, f11, f12);
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

    @Override // androidx.compose.foundation.layout.ContextualFlowColumnScope
    @m80.k
    public Modifier fillMaxColumnWidth(@m80.k Modifier modifier, float f11) {
        boolean z11 = false;
        if (0.0f <= f11 && f11 <= 1.0f) {
            z11 = true;
        }
        if (!z11) {
            InlineClassHelperKt.throwIllegalArgumentException("invalid fraction " + f11 + "; must be >= 0 and <= 1.0");
        }
        return modifier.then(new FillCrossAxisSizeElement(f11));
    }

    @Override // androidx.compose.foundation.layout.ContextualFlowColumnScope
    public int getIndexInLine() {
        return this.indexInLine;
    }

    @Override // androidx.compose.foundation.layout.ContextualFlowColumnScope
    public int getLineIndex() {
        return this.lineIndex;
    }

    @Override // androidx.compose.foundation.layout.ContextualFlowColumnScope
    /* renamed from: getMaxHeightInLine-D9Ej5fM */
    public float mo641getMaxHeightInLineD9Ej5fM() {
        return this.maxHeightInLine;
    }

    @Override // androidx.compose.foundation.layout.ContextualFlowColumnScope
    /* renamed from: getMaxWidth-D9Ej5fM */
    public float mo642getMaxWidthD9Ej5fM() {
        return this.maxWidth;
    }

    @Override // androidx.compose.foundation.layout.ColumnScope
    @Stable
    @m80.k
    public Modifier weight(@m80.k Modifier modifier, @FloatRange(from = 0.0d, fromInclusive = false) float f11, boolean z11) {
        return this.$$delegate_0.weight(modifier, f11, z11);
    }

    private ContextualFlowColumnScopeImpl(int i11, int i12, float f11, float f12) {
        this.lineIndex = i11;
        this.indexInLine = i12;
        this.maxWidth = f11;
        this.maxHeightInLine = f12;
        this.$$delegate_0 = ColumnScopeInstance.INSTANCE;
    }

    @Override // androidx.compose.foundation.layout.ColumnScope
    @Stable
    @m80.k
    public Modifier alignBy(@m80.k Modifier modifier, @m80.k l<? super Measured, Integer> lVar) {
        return this.$$delegate_0.alignBy(modifier, lVar);
    }
}
