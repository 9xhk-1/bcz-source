package com.baicizhan.platform.base.widget;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@kotlin.jvm.internal.u0({"SMAP\nMagicSwitch.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MagicSwitch.kt\ncom/baicizhan/platform/base/widget/ComposableSingletons$MagicSwitchKt\n+ 2 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n+ 3 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 4 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 5 Composer.kt\nandroidx/compose/runtime/Updater\n+ 6 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,191:1\n87#2:192\n83#2,10:193\n94#2:257\n79#3,6:203\n86#3,3:218\n89#3,2:227\n93#3:256\n347#4,9:209\n356#4:229\n357#4,2:254\n4206#5,6:221\n1247#6,6:230\n1247#6,6:236\n1247#6,6:242\n1247#6,6:248\n*S KotlinDebug\n*F\n+ 1 MagicSwitch.kt\ncom/baicizhan/platform/base/widget/ComposableSingletons$MagicSwitchKt\n*L\n174#1:192\n174#1:193,10\n174#1:257\n174#1:203,6\n174#1:218,3\n174#1:227,2\n174#1:256\n174#1:209,9\n174#1:229\n174#1:254,2\n174#1:221,6\n175#1:230,6\n178#1:236,6\n181#1:242,6\n184#1:248,6\n*E\n"})
/* loaded from: classes6.dex */
public final class n1 {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public static final n1 f28440a = new n1();

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public static x00.p<Composer, Integer, yz.g2> f28441b = ComposableLambdaKt.composableLambdaInstance(-1273654920, false, new x00.p() { // from class: com.baicizhan.platform.base.widget.i1
        @Override // x00.p
        public final Object invoke(Object obj, Object obj2) {
            yz.g2 g11;
            g11 = n1.g((Composer) obj, ((Integer) obj2).intValue());
            return g11;
        }
    });

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final yz.g2 g(Composer composer, int i11) {
        if (composer.shouldExecute((i11 & 3) != 2, i11 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1273654920, i11, -1, "com.baicizhan.platform.base.widget.ComposableSingletons$MagicSwitchKt.lambda$-1273654920.<anonymous> (MagicSwitch.kt:173)");
            }
            Modifier.Companion companion = Modifier.Companion;
            MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.Companion.getStart(), composer, 0);
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
            CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
            Modifier materializeModifier = ComposedModifierKt.materializeModifier(composer, companion);
            ComposeUiNode.Companion companion2 = ComposeUiNode.Companion;
            x00.a<ComposeUiNode> constructor = companion2.getConstructor();
            if (composer.getApplier() == null) {
                ComposablesKt.invalidApplier();
            }
            composer.startReusableNode();
            if (composer.getInserting()) {
                composer.createNode(constructor);
            } else {
                composer.useNode();
            }
            Composer m1951constructorimpl = Updater.m1951constructorimpl(composer);
            Updater.m1958setimpl(m1951constructorimpl, columnMeasurePolicy, companion2.getSetMeasurePolicy());
            Updater.m1958setimpl(m1951constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
            x00.p<ComposeUiNode, Integer, yz.g2> setCompositeKeyHash = companion2.getSetCompositeKeyHash();
            if (m1951constructorimpl.getInserting() || !kotlin.jvm.internal.g0.g(m1951constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                m1951constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                m1951constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m1958setimpl(m1951constructorimpl, materializeModifier, companion2.getSetModifier());
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            Object rememberedValue = composer.rememberedValue();
            Composer.Companion companion3 = Composer.Companion;
            if (rememberedValue == companion3.getEmpty()) {
                rememberedValue = new x00.l() { // from class: com.baicizhan.platform.base.widget.j1
                    @Override // x00.l
                    public final Object invoke(Object obj) {
                        yz.g2 h11;
                        h11 = n1.h(((Boolean) obj).booleanValue());
                        return h11;
                    }
                };
                composer.updateRememberedValue(rememberedValue);
            }
            f3.h(false, false, null, (x00.l) rememberedValue, composer, 3072, 7);
            Object rememberedValue2 = composer.rememberedValue();
            if (rememberedValue2 == companion3.getEmpty()) {
                rememberedValue2 = new x00.l() { // from class: com.baicizhan.platform.base.widget.k1
                    @Override // x00.l
                    public final Object invoke(Object obj) {
                        yz.g2 i12;
                        i12 = n1.i(((Boolean) obj).booleanValue());
                        return i12;
                    }
                };
                composer.updateRememberedValue(rememberedValue2);
            }
            f3.h(true, false, null, (x00.l) rememberedValue2, composer, 3078, 6);
            Object rememberedValue3 = composer.rememberedValue();
            if (rememberedValue3 == companion3.getEmpty()) {
                rememberedValue3 = new x00.l() { // from class: com.baicizhan.platform.base.widget.l1
                    @Override // x00.l
                    public final Object invoke(Object obj) {
                        yz.g2 j11;
                        j11 = n1.j(((Boolean) obj).booleanValue());
                        return j11;
                    }
                };
                composer.updateRememberedValue(rememberedValue3);
            }
            f3.h(false, false, null, (x00.l) rememberedValue3, composer, 3120, 5);
            Object rememberedValue4 = composer.rememberedValue();
            if (rememberedValue4 == companion3.getEmpty()) {
                rememberedValue4 = new x00.l() { // from class: com.baicizhan.platform.base.widget.m1
                    @Override // x00.l
                    public final Object invoke(Object obj) {
                        yz.g2 k11;
                        k11 = n1.k(((Boolean) obj).booleanValue());
                        return k11;
                    }
                };
                composer.updateRememberedValue(rememberedValue4);
            }
            f3.h(true, false, null, (x00.l) rememberedValue4, composer, 3126, 4);
            composer.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return yz.g2.f100423a;
    }

    public static final yz.g2 h(boolean z11) {
        return yz.g2.f100423a;
    }

    public static final yz.g2 i(boolean z11) {
        return yz.g2.f100423a;
    }

    public static final yz.g2 j(boolean z11) {
        return yz.g2.f100423a;
    }

    public static final yz.g2 k(boolean z11) {
        return yz.g2.f100423a;
    }

    @m80.k
    public final x00.p<Composer, Integer, yz.g2> f() {
        return f28441b;
    }
}
