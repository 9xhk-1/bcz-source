package androidx.compose.ui.node;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.runtime.snapshots.SnapshotStateObserver;
import kotlin.jvm.internal.g0;
import m80.k;
import x00.l;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
/* loaded from: classes2.dex */
public final class OwnerSnapshotObserver {
    public static final int $stable = SnapshotStateObserver.$stable;

    @k
    private final SnapshotStateObserver observer;

    @k
    private final l<LayoutNode, g2> onCommitAffectingLookaheadMeasure = new l<LayoutNode, g2>() { // from class: androidx.compose.ui.node.OwnerSnapshotObserver$onCommitAffectingLookaheadMeasure$1
        @Override // x00.l
        public /* bridge */ /* synthetic */ g2 invoke(LayoutNode layoutNode) {
            invoke2(layoutNode);
            return g2.f100423a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(LayoutNode layoutNode) {
            if (layoutNode.isValidOwnerScope()) {
                LayoutNode.requestLookaheadRemeasure$ui_release$default(layoutNode, false, false, false, 7, null);
            }
        }
    };

    @k
    private final l<LayoutNode, g2> onCommitAffectingMeasure = new l<LayoutNode, g2>() { // from class: androidx.compose.ui.node.OwnerSnapshotObserver$onCommitAffectingMeasure$1
        @Override // x00.l
        public /* bridge */ /* synthetic */ g2 invoke(LayoutNode layoutNode) {
            invoke2(layoutNode);
            return g2.f100423a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(LayoutNode layoutNode) {
            if (layoutNode.isValidOwnerScope()) {
                LayoutNode.requestRemeasure$ui_release$default(layoutNode, false, false, false, 7, null);
            }
        }
    };

    @k
    private final l<LayoutNode, g2> onCommitAffectingSemantics = new l<LayoutNode, g2>() { // from class: androidx.compose.ui.node.OwnerSnapshotObserver$onCommitAffectingSemantics$1
        @Override // x00.l
        public /* bridge */ /* synthetic */ g2 invoke(LayoutNode layoutNode) {
            invoke2(layoutNode);
            return g2.f100423a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(LayoutNode layoutNode) {
            if (layoutNode.isValidOwnerScope()) {
                layoutNode.invalidateSemantics$ui_release();
            }
        }
    };

    @k
    private final l<LayoutNode, g2> onCommitAffectingLayout = new l<LayoutNode, g2>() { // from class: androidx.compose.ui.node.OwnerSnapshotObserver$onCommitAffectingLayout$1
        @Override // x00.l
        public /* bridge */ /* synthetic */ g2 invoke(LayoutNode layoutNode) {
            invoke2(layoutNode);
            return g2.f100423a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(LayoutNode layoutNode) {
            if (layoutNode.isValidOwnerScope()) {
                LayoutNode.requestRelayout$ui_release$default(layoutNode, false, 1, null);
            }
        }
    };

    @k
    private final l<LayoutNode, g2> onCommitAffectingLayoutModifier = new l<LayoutNode, g2>() { // from class: androidx.compose.ui.node.OwnerSnapshotObserver$onCommitAffectingLayoutModifier$1
        @Override // x00.l
        public /* bridge */ /* synthetic */ g2 invoke(LayoutNode layoutNode) {
            invoke2(layoutNode);
            return g2.f100423a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(LayoutNode layoutNode) {
            if (layoutNode.isValidOwnerScope()) {
                LayoutNode.requestRelayout$ui_release$default(layoutNode, false, 1, null);
            }
        }
    };

    @k
    private final l<LayoutNode, g2> onCommitAffectingLayoutModifierInLookahead = new l<LayoutNode, g2>() { // from class: androidx.compose.ui.node.OwnerSnapshotObserver$onCommitAffectingLayoutModifierInLookahead$1
        @Override // x00.l
        public /* bridge */ /* synthetic */ g2 invoke(LayoutNode layoutNode) {
            invoke2(layoutNode);
            return g2.f100423a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(LayoutNode layoutNode) {
            if (layoutNode.isValidOwnerScope()) {
                LayoutNode.requestLookaheadRelayout$ui_release$default(layoutNode, false, 1, null);
            }
        }
    };

    @k
    private final l<LayoutNode, g2> onCommitAffectingLookahead = new l<LayoutNode, g2>() { // from class: androidx.compose.ui.node.OwnerSnapshotObserver$onCommitAffectingLookahead$1
        @Override // x00.l
        public /* bridge */ /* synthetic */ g2 invoke(LayoutNode layoutNode) {
            invoke2(layoutNode);
            return g2.f100423a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(LayoutNode layoutNode) {
            if (layoutNode.isValidOwnerScope()) {
                LayoutNode.requestLookaheadRelayout$ui_release$default(layoutNode, false, 1, null);
            }
        }
    };

    public OwnerSnapshotObserver(@k l<? super x00.a<g2>, g2> lVar) {
        this.observer = new SnapshotStateObserver(lVar);
    }

    public static /* synthetic */ void observeLayoutModifierSnapshotReads$ui_release$default(OwnerSnapshotObserver ownerSnapshotObserver, LayoutNode layoutNode, boolean z11, x00.a aVar, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            z11 = true;
        }
        ownerSnapshotObserver.observeLayoutModifierSnapshotReads$ui_release(layoutNode, z11, aVar);
    }

    public static /* synthetic */ void observeLayoutSnapshotReads$ui_release$default(OwnerSnapshotObserver ownerSnapshotObserver, LayoutNode layoutNode, boolean z11, x00.a aVar, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            z11 = true;
        }
        ownerSnapshotObserver.observeLayoutSnapshotReads$ui_release(layoutNode, z11, aVar);
    }

    public static /* synthetic */ void observeMeasureSnapshotReads$ui_release$default(OwnerSnapshotObserver ownerSnapshotObserver, LayoutNode layoutNode, boolean z11, x00.a aVar, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            z11 = true;
        }
        ownerSnapshotObserver.observeMeasureSnapshotReads$ui_release(layoutNode, z11, aVar);
    }

    public final void clear$ui_release(@k Object obj) {
        this.observer.clear(obj);
    }

    public final void clearInvalidObservations$ui_release() {
        this.observer.clearIf(new l<Object, Boolean>() { // from class: androidx.compose.ui.node.OwnerSnapshotObserver$clearInvalidObservations$1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // x00.l
            public final Boolean invoke(Object obj) {
                g0.n(obj, "null cannot be cast to non-null type androidx.compose.ui.node.OwnerScope");
                return Boolean.valueOf(!((OwnerScope) obj).isValidOwnerScope());
            }
        });
    }

    public final void observeLayoutModifierSnapshotReads$ui_release(@k LayoutNode layoutNode, boolean z11, @k x00.a<g2> aVar) {
        if (!z11 || layoutNode.getLookaheadRoot$ui_release() == null) {
            observeReads$ui_release(layoutNode, this.onCommitAffectingLayoutModifier, aVar);
        } else {
            observeReads$ui_release(layoutNode, this.onCommitAffectingLayoutModifierInLookahead, aVar);
        }
    }

    public final void observeLayoutSnapshotReads$ui_release(@k LayoutNode layoutNode, boolean z11, @k x00.a<g2> aVar) {
        if (!z11 || layoutNode.getLookaheadRoot$ui_release() == null) {
            observeReads$ui_release(layoutNode, this.onCommitAffectingLayout, aVar);
        } else {
            observeReads$ui_release(layoutNode, this.onCommitAffectingLookahead, aVar);
        }
    }

    public final void observeMeasureSnapshotReads$ui_release(@k LayoutNode layoutNode, boolean z11, @k x00.a<g2> aVar) {
        if (!z11 || layoutNode.getLookaheadRoot$ui_release() == null) {
            observeReads$ui_release(layoutNode, this.onCommitAffectingMeasure, aVar);
        } else {
            observeReads$ui_release(layoutNode, this.onCommitAffectingLookaheadMeasure, aVar);
        }
    }

    public final <T extends OwnerScope> void observeReads$ui_release(@k T t11, @k l<? super T, g2> lVar, @k x00.a<g2> aVar) {
        this.observer.observeReads(t11, lVar, aVar);
    }

    public final void observeSemanticsReads$ui_release(@k LayoutNode layoutNode, @k x00.a<g2> aVar) {
        observeReads$ui_release(layoutNode, this.onCommitAffectingSemantics, aVar);
    }

    public final void startObserving$ui_release() {
        this.observer.start();
    }

    public final void stopObserving$ui_release() {
        this.observer.stop();
        this.observer.clear();
    }
}
