package androidx.compose.foundation.text;

import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableInferredTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import m80.k;
import x00.p;
import x00.q;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes.dex */
public final class ComposableSingletons$CoreTextFieldKt {

    @k
    public static final ComposableSingletons$CoreTextFieldKt INSTANCE = new ComposableSingletons$CoreTextFieldKt();

    /* renamed from: lambda-1, reason: not valid java name */
    @k
    private static q<p<? super Composer, ? super Integer, g2>, Composer, Integer, g2> f4lambda1 = ComposableLambdaKt.composableLambdaInstance(-813639903, false, new q<p<? super Composer, ? super Integer, ? extends g2>, Composer, Integer, g2>() { // from class: androidx.compose.foundation.text.ComposableSingletons$CoreTextFieldKt$lambda-1$1
        @Override // x00.q
        public /* bridge */ /* synthetic */ g2 invoke(p<? super Composer, ? super Integer, ? extends g2> pVar, Composer composer, Integer num) {
            invoke((p<? super Composer, ? super Integer, g2>) pVar, composer, num.intValue());
            return g2.f100423a;
        }

        @Composable
        @ComposableInferredTarget(scheme = "[0[0]]")
        public final void invoke(p<? super Composer, ? super Integer, g2> pVar, Composer composer, int i11) {
            if ((i11 & 6) == 0) {
                i11 |= composer.changedInstance(pVar) ? 4 : 2;
            }
            if (!composer.shouldExecute((i11 & 19) != 18, i11 & 1)) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-813639903, i11, -1, "androidx.compose.foundation.text.ComposableSingletons$CoreTextFieldKt.lambda-1.<anonymous> (CoreTextField.kt:202)");
            }
            pVar.invoke(composer, Integer.valueOf(i11 & 14));
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    @k
    /* renamed from: getLambda-1$foundation_release, reason: not valid java name */
    public final q<p<? super Composer, ? super Integer, g2>, Composer, Integer, g2> m1046getLambda1$foundation_release() {
        return f4lambda1;
    }
}
