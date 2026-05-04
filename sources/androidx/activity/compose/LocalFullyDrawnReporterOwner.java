package androidx.activity.compose;

import android.content.Context;
import android.content.ContextWrapper;
import android.view.View;
import androidx.activity.FullyDrawnReporterOwner;
import androidx.activity.ViewTreeFullyDrawnReporterOwner;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import kotlin.jvm.internal.u0;
import m80.k;
import m80.l;
import w00.j;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 1)
@u0({"SMAP\nReportDrawn.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ReportDrawn.kt\nandroidx/activity/compose/LocalFullyDrawnReporterOwner\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 ActivityComposeUtils.kt\nandroidx/activity/compose/ActivityComposeUtilsKt\n*L\n1#1,153:1\n77#2:154\n77#2:155\n77#2:156\n23#3,8:157\n*S KotlinDebug\n*F\n+ 1 ReportDrawn.kt\nandroidx/activity/compose/LocalFullyDrawnReporterOwner\n*L\n96#1:154\n97#1:155\n98#1:156\n98#1:157,8\n*E\n"})
/* loaded from: classes.dex */
public final class LocalFullyDrawnReporterOwner {
    public static final int $stable = 0;

    @k
    public static final LocalFullyDrawnReporterOwner INSTANCE = new LocalFullyDrawnReporterOwner();

    @k
    private static final ProvidableCompositionLocal<FullyDrawnReporterOwner> LocalFullyDrawnReporterOwner = CompositionLocalKt.compositionLocalOf$default(null, new x00.a<FullyDrawnReporterOwner>() { // from class: androidx.activity.compose.LocalFullyDrawnReporterOwner$LocalFullyDrawnReporterOwner$1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // x00.a
        public final FullyDrawnReporterOwner invoke() {
            return null;
        }
    }, 1, null);

    private LocalFullyDrawnReporterOwner() {
    }

    @l
    @j(name = "getCurrent")
    @Composable
    public final FullyDrawnReporterOwner getCurrent(@l Composer composer, int i11) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(540186968, i11, -1, "androidx.activity.compose.LocalFullyDrawnReporterOwner.<get-current> (ReportDrawn.kt:95)");
        }
        FullyDrawnReporterOwner fullyDrawnReporterOwner = (FullyDrawnReporterOwner) composer.consume(LocalFullyDrawnReporterOwner);
        if (fullyDrawnReporterOwner == null) {
            composer.startReplaceGroup(-1738308180);
            fullyDrawnReporterOwner = ViewTreeFullyDrawnReporterOwner.get((View) composer.consume(AndroidCompositionLocals_androidKt.getLocalView()));
            composer.endReplaceGroup();
        } else {
            composer.startReplaceGroup(-1738310474);
            composer.endReplaceGroup();
        }
        if (fullyDrawnReporterOwner == null) {
            composer.startReplaceGroup(-1738306337);
            Object obj = (Context) composer.consume(AndroidCompositionLocals_androidKt.getLocalContext());
            while (true) {
                if (!(obj instanceof ContextWrapper)) {
                    obj = null;
                    break;
                }
                if (obj instanceof FullyDrawnReporterOwner) {
                    break;
                }
                obj = ((ContextWrapper) obj).getBaseContext();
            }
            fullyDrawnReporterOwner = (FullyDrawnReporterOwner) obj;
            composer.endReplaceGroup();
        } else {
            composer.startReplaceGroup(-1738310398);
            composer.endReplaceGroup();
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return fullyDrawnReporterOwner;
    }

    @k
    public final ProvidedValue<FullyDrawnReporterOwner> provides(@k FullyDrawnReporterOwner fullyDrawnReporterOwner) {
        return LocalFullyDrawnReporterOwner.provides(fullyDrawnReporterOwner);
    }
}
