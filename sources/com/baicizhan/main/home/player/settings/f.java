package com.baicizhan.main.home.player.settings;

import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.material.IconKt;
import androidx.compose.material.MaterialTheme;
import androidx.compose.material.TextKt;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.res.PainterResources_androidKt;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.unit.Dp;
import com.jiongji.andriod.card.R;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@kotlin.jvm.internal.u0({"SMAP\nUser.kt\nKotlin\n*S Kotlin\n*F\n+ 1 User.kt\ncom/baicizhan/main/home/player/settings/ComposableSingletons$UserKt\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,319:1\n113#2:320\n*S KotlinDebug\n*F\n+ 1 User.kt\ncom/baicizhan/main/home/player/settings/ComposableSingletons$UserKt\n*L\n122#1:320\n*E\n"})
/* loaded from: classes4.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public static final f f24033a = new f();

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public static x00.p<Composer, Integer, g2> f24034b = ComposableLambdaKt.composableLambdaInstance(-1686771122, false, new x00.p() { // from class: com.baicizhan.main.home.player.settings.e
        @Override // x00.p
        public final Object invoke(Object obj, Object obj2) {
            g2 c11;
            c11 = f.c((Composer) obj, ((Integer) obj2).intValue());
            return c11;
        }
    });

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final g2 c(Composer composer, int i11) {
        if (composer.shouldExecute((i11 & 3) != 2, i11 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1686771122, i11, -1, "com.baicizhan.main.home.player.settings.ComposableSingletons$UserKt.lambda$-1686771122.<anonymous> (User.kt:116)");
            }
            TextKt.m1845Text4IGK_g("更多", (Modifier) null, ColorKt.Color(4292141307L), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (x00.l<? super TextLayoutResult, g2>) null, TextStyle.m4572copyp1EtxEg$default(MaterialTheme.INSTANCE.getTypography(composer, MaterialTheme.$stable).getSubtitle2(), 0L, 0L, FontWeight.Companion.getMedium(), null, null, null, null, 0L, null, null, null, 0L, null, null, null, 0, 0, 0L, null, null, null, 0, 0, null, 16777211, null), composer, 390, 0, 65530);
            IconKt.m1691Iconww6aTOc(PainterResources_androidKt.painterResource(R.drawable.ic_home_arrow_right_sharp, composer, 6), (String) null, PaddingKt.m730paddingqDBjuR0$default(Modifier.Companion, Dp.m5115constructorimpl(2), 0.0f, 0.0f, 0.0f, 14, null), 0L, composer, 432, 8);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return g2.f100423a;
    }

    @m80.k
    public final x00.p<Composer, Integer, g2> b() {
        return f24034b;
    }
}
