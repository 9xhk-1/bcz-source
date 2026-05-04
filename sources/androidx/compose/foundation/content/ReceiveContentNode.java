package androidx.compose.foundation.content;

import androidx.compose.foundation.content.internal.DragAndDropRequestPermission_androidKt;
import androidx.compose.foundation.content.internal.DynamicReceiveContentConfiguration;
import androidx.compose.foundation.content.internal.ReceiveContentConfiguration;
import androidx.compose.foundation.content.internal.ReceiveContentConfigurationKt;
import androidx.compose.foundation.content.internal.ReceiveContentDragAndDropNode_androidKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.draganddrop.DragAndDropEvent;
import androidx.compose.ui.modifier.ModifierLocalMap;
import androidx.compose.ui.modifier.ModifierLocalModifierNode;
import androidx.compose.ui.modifier.ModifierLocalModifierNodeKt;
import androidx.compose.ui.node.CompositionLocalConsumerModifierNode;
import androidx.compose.ui.node.DelegatingNode;
import m80.k;
import x00.l;
import yz.g2;
import yz.h1;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
/* loaded from: classes.dex */
public final class ReceiveContentNode extends DelegatingNode implements ModifierLocalModifierNode, CompositionLocalConsumerModifierNode {
    public static final int $stable = 8;

    @k
    private final ModifierLocalMap providedValues;

    @k
    private final ReceiveContentConfiguration receiveContentConfiguration;

    @k
    private ReceiveContentListener receiveContentListener;

    public ReceiveContentNode(@k ReceiveContentListener receiveContentListener) {
        this.receiveContentListener = receiveContentListener;
        DynamicReceiveContentConfiguration dynamicReceiveContentConfiguration = new DynamicReceiveContentConfiguration(this);
        this.receiveContentConfiguration = dynamicReceiveContentConfiguration;
        this.providedValues = ModifierLocalModifierNodeKt.modifierLocalMapOf(h1.a(ReceiveContentConfigurationKt.getModifierLocalReceiveContent(), dynamicReceiveContentConfiguration));
        delegate(ReceiveContentDragAndDropNode_androidKt.ReceiveContentDragAndDropNode(dynamicReceiveContentConfiguration, new l<DragAndDropEvent, g2>() { // from class: androidx.compose.foundation.content.ReceiveContentNode.1
            {
                super(1);
            }

            @Override // x00.l
            public /* bridge */ /* synthetic */ g2 invoke(DragAndDropEvent dragAndDropEvent) {
                invoke2(dragAndDropEvent);
                return g2.f100423a;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(DragAndDropEvent dragAndDropEvent) {
                DragAndDropRequestPermission_androidKt.dragAndDropRequestPermission(ReceiveContentNode.this, dragAndDropEvent);
            }
        }));
    }

    @Override // androidx.compose.ui.modifier.ModifierLocalModifierNode
    @k
    public ModifierLocalMap getProvidedValues() {
        return this.providedValues;
    }

    @k
    public final ReceiveContentListener getReceiveContentListener() {
        return this.receiveContentListener;
    }

    public final void setReceiveContentListener(@k ReceiveContentListener receiveContentListener) {
        this.receiveContentListener = receiveContentListener;
    }

    public final void updateNode(@k ReceiveContentListener receiveContentListener) {
        this.receiveContentListener = receiveContentListener;
    }
}
