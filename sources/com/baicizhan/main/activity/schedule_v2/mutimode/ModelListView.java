package com.baicizhan.main.activity.schedule_v2.mutimode;

import android.content.Context;
import android.util.AttributeSet;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.platform.AbstractComposeView;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
/* loaded from: classes4.dex */
public final class ModelListView extends AbstractComposeView {

    /* renamed from: a, reason: collision with root package name */
    public static final int f19258a = AbstractComposeView.$stable;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @w00.k
    public ModelListView(@m80.k Context context) {
        this(context, null, 0, 6, null);
        kotlin.jvm.internal.g0.p(context, "context");
    }

    public static final g2 b(ModelListView modelListView, int i11, Composer composer, int i12) {
        modelListView.Content(composer, RecomposeScopeImplKt.updateChangedFlags(i11 | 1));
        return g2.f100423a;
    }

    @Override // androidx.compose.ui.platform.AbstractComposeView
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public void Content(@m80.l Composer composer, final int i11) {
        Composer startRestartGroup = composer.startRestartGroup(-1013840188);
        int i12 = i11 & 1;
        if (startRestartGroup.shouldExecute(i12 != 0, i12)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1013840188, i11, -1, "com.baicizhan.main.activity.schedule_v2.mutimode.ModelListView.Content (modeLIstUi.kt:208)");
            }
            bk.k.e(null, null, null, g.f19332a.g(), startRestartGroup, 3072, 7);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new x00.p() { // from class: com.baicizhan.main.activity.schedule_v2.mutimode.h0
                @Override // x00.p
                public final Object invoke(Object obj, Object obj2) {
                    g2 b11;
                    b11 = ModelListView.b(ModelListView.this, i11, (Composer) obj, ((Integer) obj2).intValue());
                    return b11;
                }
            });
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @w00.k
    public ModelListView(@m80.k Context context, @m80.l AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        kotlin.jvm.internal.g0.p(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @w00.k
    public ModelListView(@m80.k Context context, @m80.l AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        kotlin.jvm.internal.g0.p(context, "context");
    }

    public /* synthetic */ ModelListView(Context context, AttributeSet attributeSet, int i11, int i12, kotlin.jvm.internal.v vVar) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i11);
    }
}
