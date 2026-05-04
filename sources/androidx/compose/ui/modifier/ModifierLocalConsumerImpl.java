package androidx.compose.ui.modifier;

import androidx.compose.runtime.Stable;
import androidx.compose.ui.platform.InspectorInfo;
import androidx.compose.ui.platform.InspectorValueInfo;
import m80.k;
import x00.l;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@Stable
/* loaded from: classes.dex */
final class ModifierLocalConsumerImpl extends InspectorValueInfo implements ModifierLocalConsumer {

    @k
    private final l<ModifierLocalReadScope, g2> consumer;

    /* JADX WARN: Multi-variable type inference failed */
    public ModifierLocalConsumerImpl(@k l<? super ModifierLocalReadScope, g2> lVar, @k l<? super InspectorInfo, g2> lVar2) {
        super(lVar2);
        this.consumer = lVar;
    }

    public boolean equals(@m80.l Object obj) {
        return (obj instanceof ModifierLocalConsumerImpl) && ((ModifierLocalConsumerImpl) obj).consumer == this.consumer;
    }

    @k
    public final l<ModifierLocalReadScope, g2> getConsumer() {
        return this.consumer;
    }

    public int hashCode() {
        return this.consumer.hashCode();
    }

    @Override // androidx.compose.ui.modifier.ModifierLocalConsumer
    public void onModifierLocalsUpdated(@k ModifierLocalReadScope modifierLocalReadScope) {
        this.consumer.invoke(modifierLocalReadScope);
    }
}
