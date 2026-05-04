package androidx.compose.ui.layout;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.node.LookaheadDelegate;
import androidx.compose.ui.node.NodeCoordinator;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.v;
import m80.k;
import m80.l;
import x00.a;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
/* loaded from: classes.dex */
public final class LookaheadScopeImpl implements LookaheadScope {
    public static final int $stable = 8;

    @l
    private a<? extends LayoutCoordinates> scopeCoordinates;

    /* JADX WARN: Multi-variable type inference failed */
    public LookaheadScopeImpl() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    @Override // androidx.compose.ui.layout.LookaheadScope
    @k
    public LayoutCoordinates getLookaheadScopeCoordinates(@k Placeable.PlacementScope placementScope) {
        a<? extends LayoutCoordinates> aVar = this.scopeCoordinates;
        g0.m(aVar);
        return aVar.invoke();
    }

    @l
    public final a<LayoutCoordinates> getScopeCoordinates() {
        return this.scopeCoordinates;
    }

    public final void setScopeCoordinates(@l a<? extends LayoutCoordinates> aVar) {
        this.scopeCoordinates = aVar;
    }

    @Override // androidx.compose.ui.layout.LookaheadScope
    @k
    public LayoutCoordinates toLookaheadCoordinates(@k LayoutCoordinates layoutCoordinates) {
        LookaheadLayoutCoordinates lookaheadLayoutCoordinates;
        LookaheadLayoutCoordinates lookaheadLayoutCoordinates2 = layoutCoordinates instanceof LookaheadLayoutCoordinates ? (LookaheadLayoutCoordinates) layoutCoordinates : null;
        if (lookaheadLayoutCoordinates2 != null) {
            return lookaheadLayoutCoordinates2;
        }
        g0.n(layoutCoordinates, "null cannot be cast to non-null type androidx.compose.ui.node.NodeCoordinator");
        NodeCoordinator nodeCoordinator = (NodeCoordinator) layoutCoordinates;
        LookaheadDelegate lookaheadDelegate = nodeCoordinator.getLookaheadDelegate();
        return (lookaheadDelegate == null || (lookaheadLayoutCoordinates = lookaheadDelegate.getLookaheadLayoutCoordinates()) == null) ? nodeCoordinator : lookaheadLayoutCoordinates;
    }

    public LookaheadScopeImpl(@l a<? extends LayoutCoordinates> aVar) {
        this.scopeCoordinates = aVar;
    }

    public /* synthetic */ LookaheadScopeImpl(a aVar, int i11, v vVar) {
        this((i11 & 1) != 0 ? null : aVar);
    }
}
