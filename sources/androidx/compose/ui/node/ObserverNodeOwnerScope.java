package androidx.compose.ui.node;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.v;
import m80.k;
import x00.l;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
/* loaded from: classes2.dex */
public final class ObserverNodeOwnerScope implements OwnerScope {

    @k
    private final ObserverModifierNode observerNode;

    @k
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    @k
    private static final l<ObserverNodeOwnerScope, g2> OnObserveReadsChanged = new l<ObserverNodeOwnerScope, g2>() { // from class: androidx.compose.ui.node.ObserverNodeOwnerScope$Companion$OnObserveReadsChanged$1
        @Override // x00.l
        public /* bridge */ /* synthetic */ g2 invoke(ObserverNodeOwnerScope observerNodeOwnerScope) {
            invoke2(observerNodeOwnerScope);
            return g2.f100423a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(ObserverNodeOwnerScope observerNodeOwnerScope) {
            if (observerNodeOwnerScope.isValidOwnerScope()) {
                observerNodeOwnerScope.getObserverNode$ui_release().onObservedReadsChanged();
            }
        }
    };

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class Companion {
        public /* synthetic */ Companion(v vVar) {
            this();
        }

        @k
        public final l<ObserverNodeOwnerScope, g2> getOnObserveReadsChanged$ui_release() {
            return ObserverNodeOwnerScope.OnObserveReadsChanged;
        }

        private Companion() {
        }
    }

    public ObserverNodeOwnerScope(@k ObserverModifierNode observerModifierNode) {
        this.observerNode = observerModifierNode;
    }

    @k
    public final ObserverModifierNode getObserverNode$ui_release() {
        return this.observerNode;
    }

    @Override // androidx.compose.ui.node.OwnerScope
    public boolean isValidOwnerScope() {
        return this.observerNode.getNode().isAttached();
    }
}
