package com.baicizhan.main.home.plan.allinone;

import androidx.compose.foundation.layout.AspectRatioKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public final class a1 {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public static final a1 f22091a = new a1();

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public static x00.p<Composer, Integer, yz.g2> f22092b = ComposableLambdaKt.composableLambdaInstance(592139534, false, new x00.p() { // from class: com.baicizhan.main.home.plan.allinone.z0
        @Override // x00.p
        public final Object invoke(Object obj, Object obj2) {
            yz.g2 c11;
            c11 = a1.c((Composer) obj, ((Integer) obj2).intValue());
            return c11;
        }
    });

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final yz.g2 c(Composer composer, int i11) {
        if (composer.shouldExecute((i11 & 3) != 2, i11 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(592139534, i11, -1, "com.baicizhan.main.home.plan.allinone.ComposableSingletons$_4in1CardKt.lambda$592139534.<anonymous> (4in1Card.kt:184)");
            }
            y0.X(AspectRatioKt.aspectRatio$default(SizeKt.fillMaxWidth$default(Modifier.Companion, 0.0f, 1, null), 0.96524066f, false, 2, null), composer, 6, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return yz.g2.f100423a;
    }

    @m80.k
    public final x00.p<Composer, Integer, yz.g2> b() {
        return f22092b;
    }
}
