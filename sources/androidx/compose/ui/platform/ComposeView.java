package androidx.compose.ui.platform;

import android.content.Context;
import android.util.AttributeSet;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableInferredTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.internal.StabilityInferred;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
/* loaded from: classes2.dex */
public final class ComposeView extends AbstractComposeView {
    public static final int $stable = 8;

    @m80.k
    private final MutableState<x00.p<Composer, Integer, g2>> content;
    private boolean shouldCreateCompositionOnAttachedToWindow;

    @w00.k
    public ComposeView(@m80.k Context context) {
        this(context, null, 0, 6, null);
    }

    @Override // androidx.compose.ui.platform.AbstractComposeView
    @Composable
    public void Content(@m80.l Composer composer, int i11) {
        composer.startReplaceGroup(420213850);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(420213850, i11, -1, "androidx.compose.ui.platform.ComposeView.Content (ComposeView.android.kt:429)");
        }
        x00.p<Composer, Integer, g2> value = this.content.getValue();
        if (value == null) {
            composer.startReplaceGroup(358356153);
        } else {
            composer.startReplaceGroup(150107208);
            value.invoke(composer, 0);
        }
        composer.endReplaceGroup();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
    }

    @Override // android.view.ViewGroup, android.view.View
    @m80.k
    public CharSequence getAccessibilityClassName() {
        return ComposeView.class.getName();
    }

    @Override // androidx.compose.ui.platform.AbstractComposeView
    public boolean getShouldCreateCompositionOnAttachedToWindow() {
        return this.shouldCreateCompositionOnAttachedToWindow;
    }

    @ComposableInferredTarget(scheme = "[0[0]]")
    public final void setContent(@m80.k x00.p<? super Composer, ? super Integer, g2> pVar) {
        this.shouldCreateCompositionOnAttachedToWindow = true;
        this.content.setValue(pVar);
        if (isAttachedToWindow()) {
            createComposition();
        }
    }

    @w00.k
    public ComposeView(@m80.k Context context, @m80.l AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public /* synthetic */ ComposeView(Context context, AttributeSet attributeSet, int i11, int i12, kotlin.jvm.internal.v vVar) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i11);
    }

    @w00.k
    public ComposeView(@m80.k Context context, @m80.l AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        this.content = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
    }

    public static /* synthetic */ void getShouldCreateCompositionOnAttachedToWindow$annotations() {
    }
}
