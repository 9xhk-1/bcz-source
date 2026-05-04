package androidx.compose.ui.layout;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.node.LayoutModifierNode;
import androidx.compose.ui.unit.Constraints;
import m80.k;
import x00.q;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
/* loaded from: classes.dex */
public final class LayoutModifierImpl extends Modifier.Node implements LayoutModifierNode {
    public static final int $stable = 8;

    @k
    private q<? super MeasureScope, ? super Measurable, ? super Constraints, ? extends MeasureResult> measureBlock;

    public LayoutModifierImpl(@k q<? super MeasureScope, ? super Measurable, ? super Constraints, ? extends MeasureResult> qVar) {
        this.measureBlock = qVar;
    }

    @k
    public final q<MeasureScope, Measurable, Constraints, MeasureResult> getMeasureBlock() {
        return this.measureBlock;
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    @k
    /* renamed from: measure-3p2s80s */
    public MeasureResult mo61measure3p2s80s(@k MeasureScope measureScope, @k Measurable measurable, long j11) {
        return this.measureBlock.invoke(measureScope, measurable, Constraints.m5055boximpl(j11));
    }

    public final void setMeasureBlock(@k q<? super MeasureScope, ? super Measurable, ? super Constraints, ? extends MeasureResult> qVar) {
        this.measureBlock = qVar;
    }

    @k
    public String toString() {
        return "LayoutModifierImpl(measureBlock=" + this.measureBlock + ')';
    }
}
