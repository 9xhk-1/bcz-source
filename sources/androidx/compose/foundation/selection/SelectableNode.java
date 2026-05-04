package androidx.compose.foundation.selection;

import androidx.compose.foundation.ClickableNode;
import androidx.compose.foundation.IndicationNodeFactory;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.ui.node.SemanticsModifierNodeKt;
import androidx.compose.ui.semantics.Role;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import kotlin.jvm.internal.v;
import m80.k;
import m80.l;
import x00.a;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes.dex */
final class SelectableNode extends ClickableNode {
    private boolean selected;

    public /* synthetic */ SelectableNode(boolean z11, MutableInteractionSource mutableInteractionSource, IndicationNodeFactory indicationNodeFactory, boolean z12, Role role, a aVar, v vVar) {
        this(z11, mutableInteractionSource, indicationNodeFactory, z12, role, aVar);
    }

    @Override // androidx.compose.foundation.AbstractClickableNode
    public void applyAdditionalSemantics(@k SemanticsPropertyReceiver semanticsPropertyReceiver) {
        SemanticsPropertiesKt.setSelected(semanticsPropertyReceiver, this.selected);
    }

    /* renamed from: update-QzZPfjk, reason: not valid java name */
    public final void m991updateQzZPfjk(boolean z11, @l MutableInteractionSource mutableInteractionSource, @l IndicationNodeFactory indicationNodeFactory, boolean z12, @l Role role, @k a<g2> aVar) {
        if (this.selected != z11) {
            this.selected = z11;
            SemanticsModifierNodeKt.invalidateSemantics(this);
        }
        super.m281updateQzZPfjk(mutableInteractionSource, indicationNodeFactory, z12, (String) null, role, aVar);
    }

    private SelectableNode(boolean z11, MutableInteractionSource mutableInteractionSource, IndicationNodeFactory indicationNodeFactory, boolean z12, Role role, a<g2> aVar) {
        super(mutableInteractionSource, indicationNodeFactory, z12, null, role, aVar, null);
        this.selected = z11;
    }
}
