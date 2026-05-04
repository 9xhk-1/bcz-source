package com.baicizhan.main.home.player;

import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.unit.Dp;
import com.jiongji.andriod.card.R;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@kotlin.jvm.internal.u0({"SMAP\nDynamics.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Dynamics.kt\ncom/baicizhan/main/home/player/ComposableSingletons$DynamicsKt\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,306:1\n113#2:307\n*S KotlinDebug\n*F\n+ 1 Dynamics.kt\ncom/baicizhan/main/home/player/ComposableSingletons$DynamicsKt\n*L\n275#1:307\n*E\n"})
/* loaded from: classes4.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public static final l f23752a = new l();

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public static x00.p<Composer, Integer, yz.g2> f23753b = ComposableLambdaKt.composableLambdaInstance(-1048726132, false, new x00.p() { // from class: com.baicizhan.main.home.player.k
        @Override // x00.p
        public final Object invoke(Object obj, Object obj2) {
            yz.g2 c11;
            c11 = l.c((Composer) obj, ((Integer) obj2).intValue());
            return c11;
        }
    });

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final yz.g2 c(Composer composer, int i11) {
        Integer valueOf = Integer.valueOf(R.drawable.ic_home_status_label_exclamation_mark);
        if (composer.shouldExecute((i11 & 3) != 2, i11 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1048726132, i11, -1, "com.baicizhan.main.home.player.ComposableSingletons$DynamicsKt.lambda$-1048726132.<anonymous> (Dynamics.kt:273)");
            }
            DynamicsKt.p(SizeKt.fillMaxWidth$default(PaddingKt.m726padding3ABfNKs(Modifier.Companion, Dp.m5115constructorimpl(20)), 0.0f, 1, null), a00.h0.Q(new q1("不断电", R.drawable.ic_home_dynamic_image_winning, null, null, valueOf, false, null, 108, null), new q1("不断电", R.drawable.ic_home_dynamic_image_winning, "999天", null, valueOf, false, null, 104, null), new q1("不断电", R.drawable.ic_home_dynamic_image_winning, null, wg.x.a("学分 +999"), null, false, null, 116, null), new q1("不断电", R.drawable.ic_home_dynamic_image_winning, "999", null, valueOf, true, null, 72, null)), null, composer, 6, 4);
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
        return f23753b;
    }
}
