package androidx.compose.ui.platform;

import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.AbstractApplier;
import androidx.compose.runtime.ComposableInferredTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Composition;
import androidx.compose.runtime.CompositionContext;
import androidx.compose.runtime.CompositionKt;
import androidx.compose.ui.R;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.node.UiApplier;
import java.util.Collections;
import java.util.WeakHashMap;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes2.dex */
public final class Wrapper_androidKt {

    @m80.k
    private static final ViewGroup.LayoutParams DefaultLayoutParams = new ViewGroup.LayoutParams(-2, -2);

    @m80.k
    public static final AbstractApplier<LayoutNode> createApplier(@m80.k LayoutNode layoutNode) {
        return new UiApplier(layoutNode);
    }

    @ComposableInferredTarget(scheme = "[0[0]]")
    private static final Composition doSetContent(AndroidComposeView androidComposeView, CompositionContext compositionContext, x00.p<? super Composer, ? super Integer, g2> pVar) {
        if (InspectableValueKt.isDebugInspectorInfoEnabled()) {
            int i11 = R.id.inspection_slot_table_set;
            if (androidComposeView.getTag(i11) == null) {
                androidComposeView.setTag(i11, Collections.newSetFromMap(new WeakHashMap()));
            }
        }
        View view = androidComposeView.getView();
        int i12 = R.id.wrapped_composition_tag;
        Object tag = view.getTag(i12);
        WrappedComposition wrappedComposition = tag instanceof WrappedComposition ? (WrappedComposition) tag : null;
        if (wrappedComposition == null) {
            wrappedComposition = new WrappedComposition(androidComposeView, CompositionKt.Composition(new UiApplier(androidComposeView.getRoot()), compositionContext));
            androidComposeView.getView().setTag(i12, wrappedComposition);
        }
        wrappedComposition.setContent(pVar);
        if (!kotlin.jvm.internal.g0.g(androidComposeView.getCoroutineContext(), compositionContext.getEffectCoroutineContext())) {
            androidComposeView.setCoroutineContext(compositionContext.getEffectCoroutineContext());
        }
        return wrappedComposition;
    }

    @ComposableInferredTarget(scheme = "[0[0]]")
    @m80.k
    public static final Composition setContent(@m80.k AbstractComposeView abstractComposeView, @m80.k CompositionContext compositionContext, @m80.k x00.p<? super Composer, ? super Integer, g2> pVar) {
        GlobalSnapshotManager.INSTANCE.ensureStarted();
        AndroidComposeView androidComposeView = null;
        if (abstractComposeView.getChildCount() > 0) {
            View childAt = abstractComposeView.getChildAt(0);
            if (childAt instanceof AndroidComposeView) {
                androidComposeView = (AndroidComposeView) childAt;
            }
        } else {
            abstractComposeView.removeAllViews();
        }
        if (androidComposeView == null) {
            androidComposeView = new AndroidComposeView(abstractComposeView.getContext(), compositionContext.getEffectCoroutineContext());
            abstractComposeView.addView(androidComposeView.getView(), DefaultLayoutParams);
        }
        return doSetContent(androidComposeView, compositionContext, pVar);
    }
}
