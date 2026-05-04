package androidx.compose.ui;

import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.node.DelegatableNodeKt;
import m80.k;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
/* loaded from: classes.dex */
public final class CompositionLocalMapInjectionNode extends Modifier.Node {
    public static final int $stable = 8;

    @k
    private CompositionLocalMap map;

    public CompositionLocalMapInjectionNode(@k CompositionLocalMap compositionLocalMap) {
        this.map = compositionLocalMap;
    }

    @k
    public final CompositionLocalMap getMap() {
        return this.map;
    }

    @Override // androidx.compose.ui.Modifier.Node
    public void onAttach() {
        DelegatableNodeKt.requireLayoutNode(this).setCompositionLocalMap(this.map);
    }

    public final void setMap(@k CompositionLocalMap compositionLocalMap) {
        this.map = compositionLocalMap;
        DelegatableNodeKt.requireLayoutNode(this).setCompositionLocalMap(compositionLocalMap);
    }
}
