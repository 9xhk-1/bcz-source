package androidx.compose.foundation.text;

import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import kotlin.jvm.internal.Lambda;
import x00.p;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes.dex */
public final class ContextMenu_androidKt$TextItem$1 extends Lambda implements p<Composer, Integer, String> {
    final /* synthetic */ TextContextMenuItems $label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ContextMenu_androidKt$TextItem$1(TextContextMenuItems textContextMenuItems) {
        super(2);
        this.$label = textContextMenuItems;
    }

    @Override // x00.p
    public /* bridge */ /* synthetic */ String invoke(Composer composer, Integer num) {
        return invoke(composer, num.intValue());
    }

    @Composable
    public final String invoke(Composer composer, int i11) {
        composer.startReplaceGroup(-1744780674);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1744780674, i11, -1, "androidx.compose.foundation.text.TextItem.<anonymous> (ContextMenu.android.kt:143)");
        }
        String resolvedString = this.$label.resolvedString(composer, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return resolvedString;
    }
}
