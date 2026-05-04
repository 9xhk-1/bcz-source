package androidx.compose.material;

import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Shape;
import kotlin.jvm.internal.Lambda;
import x00.p;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes.dex */
public final class AlertDialogKt$AlertDialogImpl$2 extends Lambda implements p<Composer, Integer, g2> {
    final /* synthetic */ long $backgroundColor;
    final /* synthetic */ p<Composer, Integer, g2> $buttons;
    final /* synthetic */ long $contentColor;
    final /* synthetic */ Modifier $modifier;
    final /* synthetic */ Shape $shape;
    final /* synthetic */ p<Composer, Integer, g2> $text;
    final /* synthetic */ p<Composer, Integer, g2> $title;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AlertDialogKt$AlertDialogImpl$2(p<? super Composer, ? super Integer, g2> pVar, Modifier modifier, p<? super Composer, ? super Integer, g2> pVar2, p<? super Composer, ? super Integer, g2> pVar3, Shape shape, long j11, long j12) {
        super(2);
        this.$buttons = pVar;
        this.$modifier = modifier;
        this.$title = pVar2;
        this.$text = pVar3;
        this.$shape = shape;
        this.$backgroundColor = j11;
        this.$contentColor = j12;
    }

    @Override // x00.p
    public /* bridge */ /* synthetic */ g2 invoke(Composer composer, Integer num) {
        invoke(composer, num.intValue());
        return g2.f100423a;
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public final void invoke(Composer composer, int i11) {
        if (!composer.shouldExecute((i11 & 3) != 2, i11 & 1)) {
            composer.skipToGroupEnd();
            return;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-66632952, i11, -1, "androidx.compose.material.AlertDialogImpl.<anonymous> (AlertDialog.kt:183)");
        }
        AlertDialogKt.m1516AlertDialogContentWMdw5o4(this.$buttons, this.$modifier, this.$title, this.$text, this.$shape, this.$backgroundColor, this.$contentColor, composer, 0, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }
}
