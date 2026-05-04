package androidx.compose.ui.tooling;

import androidx.compose.material.TextKt;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.media3.extractor.WavUtil;
import m80.k;
import x00.p;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes2.dex */
public final class ComposableSingletons$PreviewActivity_androidKt {

    @k
    public static final ComposableSingletons$PreviewActivity_androidKt INSTANCE = new ComposableSingletons$PreviewActivity_androidKt();

    /* renamed from: lambda-1, reason: not valid java name */
    @k
    private static p<Composer, Integer, g2> f31lambda1 = ComposableLambdaKt.composableLambdaInstance(-426398407, false, new p<Composer, Integer, g2>() { // from class: androidx.compose.ui.tooling.ComposableSingletons$PreviewActivity_androidKt$lambda-1$1
        @Override // x00.p
        public /* bridge */ /* synthetic */ g2 invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return g2.f100423a;
        }

        @Composable
        public final void invoke(Composer composer, int i11) {
            if (!composer.shouldExecute((i11 & 3) != 2, i11 & 1)) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-426398407, i11, -1, "androidx.compose.ui.tooling.ComposableSingletons$PreviewActivity_androidKt.lambda-1.<anonymous> (PreviewActivity.android.kt:118)");
            }
            TextKt.m1847TextfLXpl1I("Next", null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, null, null, composer, 6, 0, WavUtil.TYPE_WAVE_FORMAT_EXTENSIBLE);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    @k
    /* renamed from: getLambda-1$ui_tooling_release, reason: not valid java name */
    public final p<Composer, Integer, g2> m5036getLambda1$ui_tooling_release() {
        return f31lambda1;
    }
}
