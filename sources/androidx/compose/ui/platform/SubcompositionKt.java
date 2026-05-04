package androidx.compose.ui.platform;

import androidx.compose.runtime.CompositionContext;
import androidx.compose.runtime.CompositionKt;
import androidx.compose.runtime.ReusableComposition;
import androidx.compose.ui.node.LayoutNode;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes2.dex */
public final class SubcompositionKt {
    @m80.k
    public static final ReusableComposition createSubcomposition(@m80.k LayoutNode layoutNode, @m80.k CompositionContext compositionContext) {
        return CompositionKt.ReusableComposition(Wrapper_androidKt.createApplier(layoutNode), compositionContext);
    }
}
