package androidx.compose.ui;

import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.node.ModifierNodeElement;
import androidx.compose.ui.platform.InspectorInfo;
import kotlin.jvm.internal.g0;
import m80.k;
import m80.l;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 1)
/* loaded from: classes.dex */
public final class CompositionLocalMapInjectionElement extends ModifierNodeElement<CompositionLocalMapInjectionNode> {
    public static final int $stable = 0;

    @k
    private final CompositionLocalMap map;

    public CompositionLocalMapInjectionElement(@k CompositionLocalMap compositionLocalMap) {
        this.map = compositionLocalMap;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public boolean equals(@l Object obj) {
        return (obj instanceof CompositionLocalMapInjectionElement) && g0.g(((CompositionLocalMapInjectionElement) obj).map, this.map);
    }

    @k
    public final CompositionLocalMap getMap() {
        return this.map;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public int hashCode() {
        return this.map.hashCode();
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void inspectableProperties(@k InspectorInfo inspectorInfo) {
        inspectorInfo.setName("<Injected CompositionLocalMap>");
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // androidx.compose.ui.node.ModifierNodeElement
    @k
    public CompositionLocalMapInjectionNode create() {
        return new CompositionLocalMapInjectionNode(this.map);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public void update(@k CompositionLocalMapInjectionNode compositionLocalMapInjectionNode) {
        compositionLocalMapInjectionNode.setMap(this.map);
    }
}
