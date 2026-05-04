package androidx.compose.material;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.node.ModifierNodeElement;
import androidx.compose.ui.platform.InspectorInfo;
import kotlin.jvm.internal.u0;
import m80.k;
import m80.l;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 1)
@u0({"SMAP\nInteractiveComponentSize.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InteractiveComponentSize.kt\nandroidx/compose/material/MinimumInteractiveModifier\n+ 2 InteractiveComponentSize.jvm.kt\nandroidx/compose/material/InteractiveComponentSize_jvmKt\n*L\n1#1,177:1\n20#2:178\n*S KotlinDebug\n*F\n+ 1 InteractiveComponentSize.kt\nandroidx/compose/material/MinimumInteractiveModifier\n*L\n71#1:178\n*E\n"})
/* loaded from: classes.dex */
public final class MinimumInteractiveModifier extends ModifierNodeElement<MinimumInteractiveModifierNode> {
    public static final int $stable = 0;

    @k
    public static final MinimumInteractiveModifier INSTANCE = new MinimumInteractiveModifier();

    private MinimumInteractiveModifier() {
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public boolean equals(@l Object obj) {
        return obj == this;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public int hashCode() {
        return System.identityHashCode(this);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void inspectableProperties(@k InspectorInfo inspectorInfo) {
        inspectorInfo.setName("minimumInteractiveComponentSize");
        inspectorInfo.getProperties().set("README", "Reserves at least 48.dp in size to disambiguate touch interactions if the element would measure smaller");
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void update(@k MinimumInteractiveModifierNode minimumInteractiveModifierNode) {
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // androidx.compose.ui.node.ModifierNodeElement
    @k
    public MinimumInteractiveModifierNode create() {
        return new MinimumInteractiveModifierNode();
    }
}
