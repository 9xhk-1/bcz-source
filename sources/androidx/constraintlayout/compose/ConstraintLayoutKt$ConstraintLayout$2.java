package androidx.constraintlayout.compose;

import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableState;
import kotlin.jvm.internal.Lambda;
import x00.p;
import x00.q;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes2.dex */
public final class ConstraintLayoutKt$ConstraintLayout$2 extends Lambda implements p<Composer, Integer, g2> {
    final /* synthetic */ q<ConstraintLayoutScope, Composer, Integer, g2> $content;
    final /* synthetic */ MutableState<g2> $contentTracker;
    final /* synthetic */ x00.a<g2> $onHelpersChanged;
    final /* synthetic */ ConstraintLayoutScope $scope;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ConstraintLayoutKt$ConstraintLayout$2(MutableState<g2> mutableState, ConstraintLayoutScope constraintLayoutScope, q<? super ConstraintLayoutScope, ? super Composer, ? super Integer, g2> qVar, x00.a<g2> aVar) {
        super(2);
        this.$contentTracker = mutableState;
        this.$scope = constraintLayoutScope;
        this.$content = qVar;
        this.$onHelpersChanged = aVar;
    }

    @Override // x00.p
    public /* bridge */ /* synthetic */ g2 invoke(Composer composer, Integer num) {
        invoke(composer, num.intValue());
        return g2.f100423a;
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public final void invoke(Composer composer, int i11) {
        if ((i11 & 3) == 2 && composer.getSkipping()) {
            composer.skipToGroupEnd();
            return;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1200550679, i11, -1, "androidx.constraintlayout.compose.ConstraintLayout.<anonymous> (ConstraintLayout.kt:459)");
        }
        this.$contentTracker.setValue(g2.f100423a);
        int helpersHashCode = this.$scope.getHelpersHashCode();
        this.$scope.reset();
        this.$content.invoke(this.$scope, composer, 0);
        if (this.$scope.getHelpersHashCode() != helpersHashCode) {
            EffectsKt.SideEffect(this.$onHelpersChanged, composer, 6);
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }
}
