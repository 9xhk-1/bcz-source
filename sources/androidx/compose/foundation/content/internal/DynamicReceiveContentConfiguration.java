package androidx.compose.foundation.content.internal;

import androidx.compose.foundation.content.ReceiveContentListener;
import androidx.compose.foundation.content.ReceiveContentNode;
import androidx.compose.foundation.content.TransferableContent;
import androidx.compose.runtime.internal.StabilityInferred;
import g10.u;
import m80.k;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
/* loaded from: classes.dex */
public final class DynamicReceiveContentConfiguration extends ReceiveContentConfiguration {
    public static final int $stable = 8;

    @k
    private final ReceiveContentListener receiveContentListener = new ReceiveContentListener() { // from class: androidx.compose.foundation.content.internal.DynamicReceiveContentConfiguration$receiveContentListener$1
        private int nodeEnterCount;

        @Override // androidx.compose.foundation.content.ReceiveContentListener
        public void onDragEnd() {
            DynamicReceiveContentConfiguration.this.getReceiveContentNode().getReceiveContentListener().onDragEnd();
            this.nodeEnterCount = 0;
        }

        @Override // androidx.compose.foundation.content.ReceiveContentListener
        public void onDragEnter() {
            ReceiveContentListener parentReceiveContentListener;
            int i11 = this.nodeEnterCount + 1;
            this.nodeEnterCount = i11;
            if (i11 == 1) {
                DynamicReceiveContentConfiguration.this.getReceiveContentNode().getReceiveContentListener().onDragEnter();
            }
            parentReceiveContentListener = DynamicReceiveContentConfiguration.this.getParentReceiveContentListener();
            if (parentReceiveContentListener != null) {
                parentReceiveContentListener.onDragEnter();
            }
        }

        @Override // androidx.compose.foundation.content.ReceiveContentListener
        public void onDragExit() {
            ReceiveContentListener parentReceiveContentListener;
            int i11 = this.nodeEnterCount;
            int u11 = u.u(i11 - 1, 0);
            this.nodeEnterCount = u11;
            if (u11 == 0 && i11 > 0) {
                DynamicReceiveContentConfiguration.this.getReceiveContentNode().getReceiveContentListener().onDragExit();
            }
            parentReceiveContentListener = DynamicReceiveContentConfiguration.this.getParentReceiveContentListener();
            if (parentReceiveContentListener != null) {
                parentReceiveContentListener.onDragExit();
            }
        }

        @Override // androidx.compose.foundation.content.ReceiveContentListener
        public void onDragStart() {
            this.nodeEnterCount = 0;
            DynamicReceiveContentConfiguration.this.getReceiveContentNode().getReceiveContentListener().onDragStart();
        }

        @Override // androidx.compose.foundation.content.ReceiveContentListener
        public TransferableContent onReceive(TransferableContent transferableContent) {
            ReceiveContentListener parentReceiveContentListener;
            TransferableContent onReceive = DynamicReceiveContentConfiguration.this.getReceiveContentNode().getReceiveContentListener().onReceive(transferableContent);
            if (onReceive == null) {
                return null;
            }
            parentReceiveContentListener = DynamicReceiveContentConfiguration.this.getParentReceiveContentListener();
            return parentReceiveContentListener == null ? onReceive : parentReceiveContentListener.onReceive(onReceive);
        }
    };

    @k
    private final ReceiveContentNode receiveContentNode;

    public DynamicReceiveContentConfiguration(@k ReceiveContentNode receiveContentNode) {
        this.receiveContentNode = receiveContentNode;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ReceiveContentListener getParentReceiveContentListener() {
        ReceiveContentConfiguration receiveContentConfiguration = ReceiveContentConfigurationKt.getReceiveContentConfiguration(this.receiveContentNode);
        if (receiveContentConfiguration != null) {
            return receiveContentConfiguration.getReceiveContentListener();
        }
        return null;
    }

    @Override // androidx.compose.foundation.content.internal.ReceiveContentConfiguration
    @k
    public ReceiveContentListener getReceiveContentListener() {
        return this.receiveContentListener;
    }

    @k
    public final ReceiveContentNode getReceiveContentNode() {
        return this.receiveContentNode;
    }
}
