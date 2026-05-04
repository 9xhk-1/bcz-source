package androidx.compose.ui.node;

import androidx.compose.ui.Modifier;
import kotlin.jvm.internal.u0;
import m80.k;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nObserverModifierNode.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ObserverModifierNode.kt\nandroidx/compose/ui/node/ObserverModifierNodeKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,64:1\n1#2:65\n*E\n"})
/* loaded from: classes2.dex */
public final class ObserverModifierNodeKt {
    public static final <T extends Modifier.Node & ObserverModifierNode> void observeReads(@k T t11, @k x00.a<g2> aVar) {
        ObserverNodeOwnerScope ownerScope$ui_release = t11.getOwnerScope$ui_release();
        if (ownerScope$ui_release == null) {
            ownerScope$ui_release = new ObserverNodeOwnerScope(t11);
            t11.setOwnerScope$ui_release(ownerScope$ui_release);
        }
        DelegatableNodeKt.requireOwner(t11).getSnapshotObserver().observeReads$ui_release(ownerScope$ui_release, ObserverNodeOwnerScope.Companion.getOnObserveReadsChanged$ui_release(), aVar);
    }
}
