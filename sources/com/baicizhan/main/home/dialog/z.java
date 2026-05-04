package com.baicizhan.main.home.dialog;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
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
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.window.AndroidDialog_androidKt;
import androidx.compose.ui.window.DialogProperties;
import com.baicizhan.platform.base.widget.WidgetsKt;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@kotlin.jvm.internal.u0({"SMAP\nloading.kt\nKotlin\n*S Kotlin\n*F\n+ 1 loading.kt\ncom/baicizhan/main/home/dialog/LoadingKt\n+ 2 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 3 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 4 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 5 Composer.kt\nandroidx/compose/runtime/Updater\n+ 6 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,58:1\n70#2:59\n66#2,10:60\n70#2:99\n67#2,9:100\n77#2:140\n77#2:144\n79#3,6:70\n86#3,3:85\n89#3,2:94\n79#3,6:109\n86#3,3:124\n89#3,2:133\n93#3:139\n93#3:143\n347#4,9:76\n356#4:96\n347#4,9:115\n356#4:135\n357#4,2:137\n357#4,2:141\n4206#5,6:88\n4206#5,6:127\n113#6:97\n113#6:98\n113#6:136\n*S KotlinDebug\n*F\n+ 1 loading.kt\ncom/baicizhan/main/home/dialog/LoadingKt\n*L\n45#1:59\n45#1:60,10\n46#1:99\n46#1:100,9\n46#1:140\n45#1:144\n45#1:70,6\n45#1:85,3\n45#1:94,2\n46#1:109,6\n46#1:124,3\n46#1:133,2\n46#1:139\n45#1:143\n45#1:76,9\n45#1:96\n46#1:115,9\n46#1:135\n46#1:137,2\n45#1:141,2\n45#1:88,6\n46#1:127,6\n48#1:97\n49#1:98\n53#1:136\n*E\n"})
/* loaded from: classes4.dex */
public final class z {
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void c(Composer composer, final int i11) {
        Composer startRestartGroup = composer.startRestartGroup(178751914);
        if (startRestartGroup.shouldExecute(i11 != 0, i11 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(178751914, i11, -1, "com.baicizhan.main.home.dialog.FlowerContent (loading.kt:43)");
            }
            Alignment.Companion companion = Alignment.Companion;
            Alignment center = companion.getCenter();
            Modifier.Companion companion2 = Modifier.Companion;
            MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(center, false);
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
            Modifier materializeModifier = ComposedModifierKt.materializeModifier(startRestartGroup, companion2);
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
            x00.p<ComposeUiNode, Integer, g2> setCompositeKeyHash = companion3.getSetCompositeKeyHash();
            if (m1951constructorimpl.getInserting() || !kotlin.jvm.internal.g0.g(m1951constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                m1951constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                m1951constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m1958setimpl(m1951constructorimpl, materializeModifier, companion3.getSetModifier());
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            Modifier m234backgroundbw27NRU = BackgroundKt.m234backgroundbw27NRU(SizeKt.m773size3ABfNKs(companion2, Dp.m5115constructorimpl(96)), Color.m2508copywmQWz5c$default(Color.Companion.m2535getBlack0d7_KjU(), 0.6f, 0.0f, 0.0f, 0.0f, 14, null), RoundedCornerShapeKt.m1019RoundedCornerShape0680j_4(Dp.m5115constructorimpl(24)));
            MeasurePolicy maybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(companion.getTopStart(), false);
            int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap2 = startRestartGroup.getCurrentCompositionLocalMap();
            Modifier materializeModifier2 = ComposedModifierKt.materializeModifier(startRestartGroup, m234backgroundbw27NRU);
            x00.a<ComposeUiNode> constructor2 = companion3.getConstructor();
            if (startRestartGroup.getApplier() == null) {
                ComposablesKt.invalidApplier();
            }
            startRestartGroup.startReusableNode();
            if (startRestartGroup.getInserting()) {
                startRestartGroup.createNode(constructor2);
            } else {
                startRestartGroup.useNode();
            }
            Composer m1951constructorimpl2 = Updater.m1951constructorimpl(startRestartGroup);
            Updater.m1958setimpl(m1951constructorimpl2, maybeCachedBoxMeasurePolicy2, companion3.getSetMeasurePolicy());
            Updater.m1958setimpl(m1951constructorimpl2, currentCompositionLocalMap2, companion3.getSetResolvedCompositionLocals());
            x00.p<ComposeUiNode, Integer, g2> setCompositeKeyHash2 = companion3.getSetCompositeKeyHash();
            if (m1951constructorimpl2.getInserting() || !kotlin.jvm.internal.g0.g(m1951constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                m1951constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                m1951constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
            }
            Updater.m1958setimpl(m1951constructorimpl2, materializeModifier2, companion3.getSetModifier());
            WidgetsKt.x(boxScopeInstance.align(SizeKt.m773size3ABfNKs(companion2, Dp.m5115constructorimpl(48)), companion.getCenter()), startRestartGroup, 0, 0);
            startRestartGroup.endNode();
            startRestartGroup.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new x00.p() { // from class: com.baicizhan.main.home.dialog.x
                @Override // x00.p
                public final Object invoke(Object obj, Object obj2) {
                    g2 d11;
                    d11 = z.d(i11, (Composer) obj, ((Integer) obj2).intValue());
                    return d11;
                }
            });
        }
    }

    public static final g2 d(int i11, Composer composer, int i12) {
        c(composer, RecomposeScopeImplKt.updateChangedFlags(i11 | 1));
        return g2.f100423a;
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void e(final boolean z11, boolean z12, @m80.k final x00.a<g2> onDismissRequest, @m80.l Composer composer, final int i11, final int i12) {
        int i13;
        final boolean z13;
        kotlin.jvm.internal.g0.p(onDismissRequest, "onDismissRequest");
        Composer startRestartGroup = composer.startRestartGroup(-438332499);
        if ((i11 & 6) == 0) {
            i13 = (startRestartGroup.changed(z11) ? 4 : 2) | i11;
        } else {
            i13 = i11;
        }
        int i14 = i12 & 2;
        if (i14 != 0) {
            i13 |= 48;
        } else if ((i11 & 48) == 0) {
            i13 |= startRestartGroup.changed(z12) ? 32 : 16;
        }
        if ((i11 & 384) == 0) {
            i13 |= startRestartGroup.changedInstance(onDismissRequest) ? 256 : 128;
        }
        if (startRestartGroup.shouldExecute((i13 & 147) != 146, i13 & 1)) {
            boolean z14 = i14 != 0 ? false : z12;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-438332499, i13, -1, "com.baicizhan.main.home.dialog.FlowerLoading (loading.kt:22)");
            }
            if (z11) {
                if (z14) {
                    startRestartGroup.startReplaceGroup(-330731713);
                    AndroidDialog_androidKt.Dialog(onDismissRequest, new DialogProperties(false, false, false), k.f20935a.d(), startRestartGroup, ((i13 >> 6) & 14) | 432, 0);
                    startRestartGroup.endReplaceGroup();
                } else {
                    startRestartGroup.startReplaceGroup(-1662406083);
                    zj.e0.e(false, onDismissRequest, k.f20935a.c(), startRestartGroup, ((i13 >> 3) & 112) | 390, 0);
                    startRestartGroup.endReplaceGroup();
                }
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            z13 = z14;
        } else {
            startRestartGroup.skipToGroupEnd();
            z13 = z12;
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new x00.p() { // from class: com.baicizhan.main.home.dialog.y
                @Override // x00.p
                public final Object invoke(Object obj, Object obj2) {
                    g2 f11;
                    f11 = z.f(z11, z13, onDismissRequest, i11, i12, (Composer) obj, ((Integer) obj2).intValue());
                    return f11;
                }
            });
        }
    }

    public static final g2 f(boolean z11, boolean z12, x00.a aVar, int i11, int i12, Composer composer, int i13) {
        e(z11, z12, aVar, composer, RecomposeScopeImplKt.updateChangedFlags(i11 | 1), i12);
        return g2.f100423a;
    }
}
