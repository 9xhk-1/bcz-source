package com.baicizhan.main.activity.setting.privatessetting.debug;

import androidx.compose.foundation.lazy.grid.LazyGridItemScope;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public final class x {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public static final x f19846a = new x();

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public static x00.r<LazyGridItemScope, Integer, Composer, Integer, yz.g2> f19847b = ComposableLambdaKt.composableLambdaInstance(897108304, false, new x00.r() { // from class: com.baicizhan.main.activity.setting.privatessetting.debug.w
        @Override // x00.r
        public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
            yz.g2 c11;
            c11 = x.c((LazyGridItemScope) obj, ((Integer) obj2).intValue(), (Composer) obj3, ((Integer) obj4).intValue());
            return c11;
        }
    });

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final yz.g2 c(LazyGridItemScope items, int i11, Composer composer, int i12) {
        kotlin.jvm.internal.g0.p(items, "$this$items");
        if ((i12 & 48) == 0) {
            i12 |= composer.changed(i11) ? 32 : 16;
        }
        if (composer.shouldExecute((i12 & 145) != 144, i12 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(897108304, i12, -1, "com.baicizhan.main.activity.setting.privatessetting.debug.ComposableSingletons$SpineInComposeKt.lambda$897108304.<anonymous> (SpineInCompose.kt:261)");
            }
            if (i11 % 2 == 0) {
                composer.startReplaceGroup(-1827958428);
                h4.F(composer, 0);
                composer.endReplaceGroup();
            } else {
                composer.startReplaceGroup(-1827907030);
                h4.K(composer, 0);
                composer.endReplaceGroup();
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return yz.g2.f100423a;
    }

    @m80.k
    public final x00.r<LazyGridItemScope, Integer, Composer, Integer, yz.g2> b() {
        return f19847b;
    }
}
