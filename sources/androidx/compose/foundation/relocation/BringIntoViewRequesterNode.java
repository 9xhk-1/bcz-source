package androidx.compose.foundation.relocation;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.Modifier;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import m80.k;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
@u0({"SMAP\nBringIntoViewRequester.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BringIntoViewRequester.kt\nandroidx/compose/foundation/relocation/BringIntoViewRequesterNode\n+ 2 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector\n*L\n1#1,159:1\n641#2,2:160\n646#2,2:162\n*S KotlinDebug\n*F\n+ 1 BringIntoViewRequester.kt\nandroidx/compose/foundation/relocation/BringIntoViewRequesterNode\n*L\n144#1:160,2\n151#1:162,2\n*E\n"})
/* loaded from: classes.dex */
public final class BringIntoViewRequesterNode extends Modifier.Node {
    public static final int $stable = 8;

    @k
    private BringIntoViewRequester requester;
    private final boolean shouldAutoInvalidate;

    public BringIntoViewRequesterNode(@k BringIntoViewRequester bringIntoViewRequester) {
        this.requester = bringIntoViewRequester;
    }

    private final void disposeRequester() {
        BringIntoViewRequester bringIntoViewRequester = this.requester;
        if (bringIntoViewRequester instanceof BringIntoViewRequesterImpl) {
            g0.n(bringIntoViewRequester, "null cannot be cast to non-null type androidx.compose.foundation.relocation.BringIntoViewRequesterImpl");
            ((BringIntoViewRequesterImpl) bringIntoViewRequester).getNodes().remove(this);
        }
    }

    @Override // androidx.compose.ui.Modifier.Node
    public boolean getShouldAutoInvalidate() {
        return this.shouldAutoInvalidate;
    }

    @Override // androidx.compose.ui.Modifier.Node
    public void onAttach() {
        updateRequester(this.requester);
    }

    @Override // androidx.compose.ui.Modifier.Node
    public void onDetach() {
        disposeRequester();
    }

    public final void updateRequester(@k BringIntoViewRequester bringIntoViewRequester) {
        disposeRequester();
        if (bringIntoViewRequester instanceof BringIntoViewRequesterImpl) {
            ((BringIntoViewRequesterImpl) bringIntoViewRequester).getNodes().add(this);
        }
        this.requester = bringIntoViewRequester;
    }
}
