package com.baicizhan.main.activity.setting.privatessetting.debug;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.material.MaterialTheme;
import androidx.compose.material.TextKt;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.unit.Dp;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@kotlin.jvm.internal.u0({"SMAP\nDebugComposeUI.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DebugComposeUI.kt\ncom/baicizhan/main/activity/setting/privatessetting/debug/DebugComposeUIKt\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 4 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 5 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 6 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 7 Composer.kt\nandroidx/compose/runtime/Updater\n*L\n1#1,35:1\n113#2:36\n113#2:37\n113#2:81\n1247#3,6:38\n70#4:44\n67#4,9:45\n77#4:85\n79#5,6:54\n86#5,3:69\n89#5,2:78\n93#5:84\n347#6,9:60\n356#6:80\n357#6,2:82\n4206#7,6:72\n*S KotlinDebug\n*F\n+ 1 DebugComposeUI.kt\ncom/baicizhan/main/activity/setting/privatessetting/debug/DebugComposeUIKt\n*L\n24#1:36\n25#1:37\n32#1:81\n26#1:38,6\n25#1:44\n25#1:45,9\n25#1:85\n25#1:54,6\n25#1:69,3\n25#1:78,2\n25#1:84\n25#1:60,9\n25#1:80\n25#1:82,2\n25#1:72,6\n*E\n"})
/* loaded from: classes4.dex */
public final class p0 {
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void c(@m80.k final String title, @m80.k final x00.a<yz.g2> click, @m80.l Composer composer, final int i11) {
        int i12;
        Composer composer2;
        kotlin.jvm.internal.g0.p(title, "title");
        kotlin.jvm.internal.g0.p(click, "click");
        Composer startRestartGroup = composer.startRestartGroup(-1726272544);
        if ((i11 & 6) == 0) {
            i12 = i11 | (startRestartGroup.changed(title) ? 4 : 2);
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= startRestartGroup.changedInstance(click) ? 32 : 16;
        }
        if (startRestartGroup.shouldExecute((i12 & 19) != 18, i12 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1726272544, i12, -1, "com.baicizhan.main.activity.setting.privatessetting.debug.DebugItemView (DebugComposeUI.kt:22)");
            }
            Modifier.Companion companion = Modifier.Companion;
            float f11 = 10;
            SpacerKt.Spacer(PaddingKt.m730paddingqDBjuR0$default(companion, 0.0f, 0.0f, 0.0f, Dp.m5115constructorimpl(f11), 7, null), startRestartGroup, 6);
            Modifier m235backgroundbw27NRU$default = BackgroundKt.m235backgroundbw27NRU$default(SizeKt.m759height3ABfNKs(SizeKt.fillMaxWidth$default(PaddingKt.m726padding3ABfNKs(companion, Dp.m5115constructorimpl(5)), 0.0f, 1, null), Dp.m5115constructorimpl(50)), bk.b.A0(), null, 2, null);
            boolean z11 = (i12 & 112) == 32;
            Object rememberedValue = startRestartGroup.rememberedValue();
            if (z11 || rememberedValue == Composer.Companion.getEmpty()) {
                rememberedValue = new x00.a() { // from class: com.baicizhan.main.activity.setting.privatessetting.debug.n0
                    @Override // x00.a
                    public final Object invoke() {
                        yz.g2 d11;
                        d11 = p0.d(x00.a.this);
                        return d11;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            Modifier m269clickableXHw0xAI$default = ClickableKt.m269clickableXHw0xAI$default(m235backgroundbw27NRU$default, false, null, null, (x00.a) rememberedValue, 7, null);
            Alignment.Companion companion2 = Alignment.Companion;
            MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(companion2.getTopStart(), false);
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
            Modifier materializeModifier = ComposedModifierKt.materializeModifier(startRestartGroup, m269clickableXHw0xAI$default);
            ComposeUiNode.Companion companion3 = ComposeUiNode.Companion;
            x00.a<ComposeUiNode> constructor = companion3.getConstructor();
            if (startRestartGroup.getApplier() == null) {
                ComposablesKt.invalidApplier();
            }
            startRestartGroup.startReusableNode();
            if (startRestartGroup.getInserting()) {
                startRestartGroup.createNode(constructor);
            } else {
                startRestartGroup.useNode();
            }
            Composer m1951constructorimpl = Updater.m1951constructorimpl(startRestartGroup);
            Updater.m1958setimpl(m1951constructorimpl, maybeCachedBoxMeasurePolicy, companion3.getSetMeasurePolicy());
            Updater.m1958setimpl(m1951constructorimpl, currentCompositionLocalMap, companion3.getSetResolvedCompositionLocals());
            x00.p<ComposeUiNode, Integer, yz.g2> setCompositeKeyHash = companion3.getSetCompositeKeyHash();
            if (m1951constructorimpl.getInserting() || !kotlin.jvm.internal.g0.g(m1951constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                m1951constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                m1951constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m1958setimpl(m1951constructorimpl, materializeModifier, companion3.getSetModifier());
            composer2 = startRestartGroup;
            TextKt.m1845Text4IGK_g(title, PaddingKt.m730paddingqDBjuR0$default(BoxScopeInstance.INSTANCE.align(companion, companion2.getCenterStart()), Dp.m5115constructorimpl(f11), 0.0f, 0.0f, 0.0f, 14, null), 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (x00.l<? super TextLayoutResult, yz.g2>) null, MaterialTheme.INSTANCE.getTypography(startRestartGroup, MaterialTheme.$stable).getH6(), composer2, i12 & 14, 0, 65532);
            composer2.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer2 = startRestartGroup;
            composer2.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new x00.p() { // from class: com.baicizhan.main.activity.setting.privatessetting.debug.o0
                @Override // x00.p
                public final Object invoke(Object obj, Object obj2) {
                    yz.g2 e11;
                    e11 = p0.e(title, click, i11, (Composer) obj, ((Integer) obj2).intValue());
                    return e11;
                }
            });
        }
    }

    public static final yz.g2 d(x00.a aVar) {
        aVar.invoke();
        return yz.g2.f100423a;
    }

    public static final yz.g2 e(String str, x00.a aVar, int i11, Composer composer, int i12) {
        c(str, aVar, composer, RecomposeScopeImplKt.updateChangedFlags(i11 | 1));
        return yz.g2.f100423a;
    }
}
