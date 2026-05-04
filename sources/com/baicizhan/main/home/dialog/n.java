package com.baicizhan.main.home.dialog;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
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
import androidx.compose.ui.unit.Dp;
import com.jiongji.andriod.card.R;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@kotlin.jvm.internal.u0({"SMAP\nprompt.kt\nKotlin\n*S Kotlin\n*F\n+ 1 prompt.kt\ncom/baicizhan/main/home/dialog/ComposableSingletons$PromptKt\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 3 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n+ 4 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 5 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 6 Composer.kt\nandroidx/compose/runtime/Updater\n*L\n1#1,388:1\n113#2:389\n113#2:430\n87#3:390\n85#3,8:391\n94#3:429\n87#3:431\n85#3,8:432\n94#3:470\n79#4,6:399\n86#4,3:414\n89#4,2:423\n93#4:428\n79#4,6:440\n86#4,3:455\n89#4,2:464\n93#4:469\n347#5,9:405\n356#5,3:425\n347#5,9:446\n356#5,3:466\n4206#6,6:417\n4206#6,6:458\n*S KotlinDebug\n*F\n+ 1 prompt.kt\ncom/baicizhan/main/home/dialog/ComposableSingletons$PromptKt\n*L\n374#1:389\n384#1:430\n374#1:390\n374#1:391,8\n374#1:429\n384#1:431\n384#1:432,8\n384#1:470\n374#1:399,6\n374#1:414,3\n374#1:423,2\n374#1:428\n384#1:440,6\n384#1:455,3\n384#1:464,2\n384#1:469\n374#1:405,9\n374#1:425,3\n384#1:446,9\n384#1:466,3\n374#1:417,6\n384#1:458,6\n*E\n"})
/* loaded from: classes4.dex */
public final class n {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public static final n f20967a = new n();

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public static x00.p<Composer, Integer, g2> f20968b = ComposableLambdaKt.composableLambdaInstance(252406748, false, new x00.p() { // from class: com.baicizhan.main.home.dialog.l
        @Override // x00.p
        public final Object invoke(Object obj, Object obj2) {
            g2 e11;
            e11 = n.e((Composer) obj, ((Integer) obj2).intValue());
            return e11;
        }
    });

    /* renamed from: c, reason: collision with root package name */
    @m80.k
    public static x00.p<Composer, Integer, g2> f20969c = ComposableLambdaKt.composableLambdaInstance(-1993484547, false, new x00.p() { // from class: com.baicizhan.main.home.dialog.m
        @Override // x00.p
        public final Object invoke(Object obj, Object obj2) {
            g2 f11;
            f11 = n.f((Composer) obj, ((Integer) obj2).intValue());
            return f11;
        }
    });

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final g2 e(Composer composer, int i11) {
        if (composer.shouldExecute((i11 & 3) != 2, i11 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(252406748, i11, -1, "com.baicizhan.main.home.dialog.ComposableSingletons$PromptKt.lambda$252406748.<anonymous> (prompt.kt:373)");
            }
            float f11 = 16;
            Modifier m726padding3ABfNKs = PaddingKt.m726padding3ABfNKs(Modifier.Companion, Dp.m5115constructorimpl(f11));
            MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.m607spacedBy0680j_4(Dp.m5115constructorimpl(f11)), Alignment.Companion.getStart(), composer, 6);
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
            CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
            Modifier materializeModifier = ComposedModifierKt.materializeModifier(composer, m726padding3ABfNKs);
            ComposeUiNode.Companion companion = ComposeUiNode.Companion;
            x00.a<ComposeUiNode> constructor = companion.getConstructor();
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
            Updater.m1958setimpl(m1951constructorimpl, columnMeasurePolicy, companion.getSetMeasurePolicy());
            Updater.m1958setimpl(m1951constructorimpl, currentCompositionLocalMap, companion.getSetResolvedCompositionLocals());
            x00.p<ComposeUiNode, Integer, g2> setCompositeKeyHash = companion.getSetCompositeKeyHash();
            if (m1951constructorimpl.getInserting() || !kotlin.jvm.internal.g0.g(m1951constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                m1951constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                m1951constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m1958setimpl(m1951constructorimpl, materializeModifier, companion.getSetModifier());
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            PromptKt.r("已新学完全部单词，快去复习吧，记得更牢固", null, null, null, false, 0, null, "去复习", false, null, null, false, null, null, null, composer, 12582918, 0, 32638);
            composer.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return g2.f100423a;
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final g2 f(Composer composer, int i11) {
        if (composer.shouldExecute((i11 & 3) != 2, i11 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1993484547, i11, -1, "com.baicizhan.main.home.dialog.ComposableSingletons$PromptKt.lambda$-1993484547.<anonymous> (prompt.kt:383)");
            }
            float f11 = 16;
            Modifier m726padding3ABfNKs = PaddingKt.m726padding3ABfNKs(Modifier.Companion, Dp.m5115constructorimpl(f11));
            MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.m607spacedBy0680j_4(Dp.m5115constructorimpl(f11)), Alignment.Companion.getStart(), composer, 6);
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
            CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
            Modifier materializeModifier = ComposedModifierKt.materializeModifier(composer, m726padding3ABfNKs);
            ComposeUiNode.Companion companion = ComposeUiNode.Companion;
            x00.a<ComposeUiNode> constructor = companion.getConstructor();
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
            Updater.m1958setimpl(m1951constructorimpl, columnMeasurePolicy, companion.getSetMeasurePolicy());
            Updater.m1958setimpl(m1951constructorimpl, currentCompositionLocalMap, companion.getSetResolvedCompositionLocals());
            x00.p<ComposeUiNode, Integer, g2> setCompositeKeyHash = companion.getSetCompositeKeyHash();
            if (m1951constructorimpl.getInserting() || !kotlin.jvm.internal.g0.g(m1951constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                m1951constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                m1951constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m1958setimpl(m1951constructorimpl, materializeModifier, companion.getSetModifier());
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            PromptKt.r("已新学完全部单词，快去复习吧，记得更牢固", null, null, null, false, R.drawable.image_home_dialog_hammer, null, "去复习", false, null, null, false, null, null, null, composer, 12779526, 0, 32606);
            composer.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return g2.f100423a;
    }

    @m80.k
    public final x00.p<Composer, Integer, g2> c() {
        return f20969c;
    }

    @m80.k
    public final x00.p<Composer, Integer, g2> d() {
        return f20968b;
    }
}
