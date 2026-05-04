package androidx.compose.foundation.selection;

import androidx.compose.foundation.ClickableNode;
import androidx.compose.foundation.IndicationNodeFactory;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.ui.node.SemanticsModifierNodeKt;
import androidx.compose.ui.semantics.Role;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.ui.state.ToggleableStateKt;
import kotlin.jvm.internal.v;
import m80.k;
import x00.a;
import x00.l;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes.dex */
final class ToggleableNode extends ClickableNode {

    @k
    private final a<g2> _onClick;

    @k
    private l<? super Boolean, g2> onValueChange;
    private boolean value;

    public /* synthetic */ ToggleableNode(boolean z11, MutableInteractionSource mutableInteractionSource, IndicationNodeFactory indicationNodeFactory, boolean z12, Role role, l lVar, v vVar) {
        this(z11, mutableInteractionSource, indicationNodeFactory, z12, role, lVar);
    }

    @Override // androidx.compose.foundation.AbstractClickableNode
    public void applyAdditionalSemantics(@k SemanticsPropertyReceiver semanticsPropertyReceiver) {
        SemanticsPropertiesKt.setToggleableState(semanticsPropertyReceiver, ToggleableStateKt.ToggleableState(this.value));
    }

    @k
    public final a<g2> get_onClick() {
        return this._onClick;
    }

    /* renamed from: update-QzZPfjk, reason: not valid java name */
    public final void m1000updateQzZPfjk(boolean z11, @m80.l MutableInteractionSource mutableInteractionSource, @m80.l IndicationNodeFactory indicationNodeFactory, boolean z12, @m80.l Role role, @k l<? super Boolean, g2> lVar) {
        if (this.value != z11) {
            this.value = z11;
            SemanticsModifierNodeKt.invalidateSemantics(this);
        }
        this.onValueChange = lVar;
        super.m281updateQzZPfjk(mutableInteractionSource, indicationNodeFactory, z12, (String) null, role, this._onClick);
    }

    private ToggleableNode(final boolean z11, MutableInteractionSource mutableInteractionSource, IndicationNodeFactory indicationNodeFactory, boolean z12, Role role, final l<? super Boolean, g2> lVar) {
        super(mutableInteractionSource, indicationNodeFactory, z12, null, role, new a<g2>() { // from class: androidx.compose.foundation.selection.ToggleableNode.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(0);
            }

            @Override // x00.a
            public /* bridge */ /* synthetic */ g2 invoke() {
                invoke2();
                return g2.f100423a;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                lVar.invoke(Boolean.valueOf(!z11));
            }
        }, null);
        this.value = z11;
        this.onValueChange = lVar;
        this._onClick = new a<g2>() { // from class: androidx.compose.foundation.selection.ToggleableNode$_onClick$1
            {
                super(0);
            }

            @Override // x00.a
            public /* bridge */ /* synthetic */ g2 invoke() {
                invoke2();
                return g2.f100423a;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                l lVar2;
                boolean z13;
                lVar2 = ToggleableNode.this.onValueChange;
                z13 = ToggleableNode.this.value;
                lVar2.invoke(Boolean.valueOf(!z13));
            }
        };
    }
}
