package androidx.compose.material.internal;

import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import m80.k;
import x00.p;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes.dex */
public final class ComposableSingletons$ExposedDropdownMenuPopup_androidKt {

    @k
    public static final ComposableSingletons$ExposedDropdownMenuPopup_androidKt INSTANCE = new ComposableSingletons$ExposedDropdownMenuPopup_androidKt();

    /* renamed from: lambda-1, reason: not valid java name */
    @k
    private static p<Composer, Integer, g2> f22lambda1 = ComposableLambdaKt.composableLambdaInstance(-1578637197, false, new p<Composer, Integer, g2>() { // from class: androidx.compose.material.internal.ComposableSingletons$ExposedDropdownMenuPopup_androidKt$lambda-1$1
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
                ComposerKt.traceEventStart(-1578637197, i11, -1, "androidx.compose.material.internal.ComposableSingletons$ExposedDropdownMenuPopup_androidKt.lambda-1.<anonymous> (ExposedDropdownMenuPopup.android.kt:287)");
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    @k
    /* renamed from: getLambda-1$material_release, reason: not valid java name */
    public final p<Composer, Integer, g2> m1850getLambda1$material_release() {
        return f22lambda1;
    }
}
