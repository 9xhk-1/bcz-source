package com.baicizhan.main.home.player;

import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material.MaterialTheme;
import androidx.compose.material.TextKt;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.unit.Dp;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@kotlin.jvm.internal.u0({"SMAP\nAwards.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Awards.kt\ncom/baicizhan/main/home/player/ComposableSingletons$AwardsKt\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,292:1\n113#2:293\n*S KotlinDebug\n*F\n+ 1 Awards.kt\ncom/baicizhan/main/home/player/ComposableSingletons$AwardsKt\n*L\n178#1:293\n*E\n"})
/* loaded from: classes4.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public static final j f23707a = new j();

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public static x00.q<RowScope, Composer, Integer, yz.g2> f23708b = ComposableLambdaKt.composableLambdaInstance(-445045147, false, new x00.q() { // from class: com.baicizhan.main.home.player.i
        @Override // x00.q
        public final Object invoke(Object obj, Object obj2, Object obj3) {
            yz.g2 c11;
            c11 = j.c((RowScope) obj, (Composer) obj2, ((Integer) obj3).intValue());
            return c11;
        }
    });

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final yz.g2 c(RowScope Button, Composer composer, int i11) {
        kotlin.jvm.internal.g0.p(Button, "$this$Button");
        if (composer.shouldExecute((i11 & 17) != 16, i11 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-445045147, i11, -1, "com.baicizhan.main.home.player.ComposableSingletons$AwardsKt.lambda$-445045147.<anonymous> (Awards.kt:175)");
            }
            TextKt.m1845Text4IGK_g("收下奖励", SizeKt.m778width3ABfNKs(PaddingKt.m728paddingVpY3zN4$default(Modifier.Companion, 0.0f, Dp.m5115constructorimpl(12), 1, null), Dp.m5115constructorimpl(202)), 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, TextAlign.m4970boximpl(TextAlign.Companion.m4977getCentere0LSkKk()), 0L, 0, false, 0, 0, (x00.l<? super TextLayoutResult, yz.g2>) null, TextStyle.m4572copyp1EtxEg$default(MaterialTheme.INSTANCE.getTypography(composer, MaterialTheme.$stable).getSubtitle1(), 0L, 0L, FontWeight.Companion.getMedium(), null, null, null, null, 0L, null, null, null, 0L, null, null, null, 0, 0, 0L, null, null, null, 0, 0, null, 16777211, null), composer, 54, 0, 65020);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return yz.g2.f100423a;
    }

    @m80.k
    public final x00.q<RowScope, Composer, Integer, yz.g2> b() {
        return f23708b;
    }
}
