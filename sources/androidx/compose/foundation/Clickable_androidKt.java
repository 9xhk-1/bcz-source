package androidx.compose.foundation;

import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.compose.ui.node.DelegatableNode;
import androidx.compose.ui.node.DelegatableNode_androidKt;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes.dex */
public final class Clickable_androidKt {
    private static final long TapIndicationDelay = ViewConfiguration.getTapTimeout();

    public static final long getTapIndicationDelay() {
        return TapIndicationDelay;
    }

    public static final boolean isComposeRootInScrollableContainer(@m80.k DelegatableNode delegatableNode) {
        return isInScrollableViewGroup(DelegatableNode_androidKt.requireView(delegatableNode));
    }

    private static final boolean isInScrollableViewGroup(View view) {
        ViewParent parent = view.getParent();
        while (parent != null && (parent instanceof ViewGroup)) {
            ViewGroup viewGroup = (ViewGroup) parent;
            if (viewGroup.shouldDelayChildPressedState()) {
                return true;
            }
            parent = viewGroup.getParent();
        }
        return false;
    }
}
