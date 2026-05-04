package androidx.compose.material;

import androidx.compose.animation.core.AnimateAsStateKt;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.EasingKt;
import androidx.compose.foundation.layout.OffsetKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.State;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntOffsetKt;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.u0;
import x00.l;
import x00.q;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nTabRow.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TabRow.kt\nandroidx/compose/material/TabRowDefaults$tabIndicatorOffset$2\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 3 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,491:1\n1247#2,6:492\n85#3:498\n85#3:499\n*S KotlinDebug\n*F\n+ 1 TabRow.kt\nandroidx/compose/material/TabRowDefaults$tabIndicatorOffset$2\n*L\n406#1:492,6\n395#1:498\n400#1:499\n*E\n"})
/* loaded from: classes.dex */
public final class TabRowDefaults$tabIndicatorOffset$2 extends Lambda implements q<Modifier, Composer, Integer, Modifier> {
    final /* synthetic */ TabPosition $currentTabPosition;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TabRowDefaults$tabIndicatorOffset$2(TabPosition tabPosition) {
        super(3);
        this.$currentTabPosition = tabPosition;
    }

    private static final float invoke$lambda$0(State<Dp> state) {
        return state.getValue().m5129unboximpl();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float invoke$lambda$1(State<Dp> state) {
        return state.getValue().m5129unboximpl();
    }

    @Override // x00.q
    public /* bridge */ /* synthetic */ Modifier invoke(Modifier modifier, Composer composer, Integer num) {
        return invoke(modifier, composer, num.intValue());
    }

    @Composable
    public final Modifier invoke(Modifier modifier, Composer composer, int i11) {
        composer.startReplaceGroup(-398757863);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-398757863, i11, -1, "androidx.compose.material.TabRowDefaults.tabIndicatorOffset.<anonymous> (TabRow.kt:393)");
        }
        State<Dp> m125animateDpAsStateAjpBEmI = AnimateAsStateKt.m125animateDpAsStateAjpBEmI(this.$currentTabPosition.m1807getWidthD9Ej5fM(), AnimationSpecKt.tween$default(250, 0, EasingKt.getFastOutSlowInEasing(), 2, null), null, null, composer, 0, 12);
        final State<Dp> m125animateDpAsStateAjpBEmI2 = AnimateAsStateKt.m125animateDpAsStateAjpBEmI(this.$currentTabPosition.m1805getLeftD9Ej5fM(), AnimationSpecKt.tween$default(250, 0, EasingKt.getFastOutSlowInEasing(), 2, null), null, null, composer, 0, 12);
        Modifier wrapContentSize$default = SizeKt.wrapContentSize$default(SizeKt.fillMaxWidth$default(modifier, 0.0f, 1, null), Alignment.Companion.getBottomStart(), false, 2, null);
        boolean changed = composer.changed(m125animateDpAsStateAjpBEmI2);
        Object rememberedValue = composer.rememberedValue();
        if (changed || rememberedValue == Composer.Companion.getEmpty()) {
            rememberedValue = new l<Density, IntOffset>() { // from class: androidx.compose.material.TabRowDefaults$tabIndicatorOffset$2$1$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // x00.l
                public /* bridge */ /* synthetic */ IntOffset invoke(Density density) {
                    return IntOffset.m5234boximpl(m1813invokeBjo55l4(density));
                }

                /* renamed from: invoke-Bjo55l4, reason: not valid java name */
                public final long m1813invokeBjo55l4(Density density) {
                    float invoke$lambda$1;
                    invoke$lambda$1 = TabRowDefaults$tabIndicatorOffset$2.invoke$lambda$1(m125animateDpAsStateAjpBEmI2);
                    return IntOffsetKt.IntOffset(density.mo371roundToPx0680j_4(invoke$lambda$1), 0);
                }
            };
            composer.updateRememberedValue(rememberedValue);
        }
        Modifier m778width3ABfNKs = SizeKt.m778width3ABfNKs(OffsetKt.offset(wrapContentSize$default, (l) rememberedValue), invoke$lambda$0(m125animateDpAsStateAjpBEmI));
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return m778width3ABfNKs;
    }
}
