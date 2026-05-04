package com.baicizhan.main.home.plan.newexam;

import androidx.compose.foundation.BackgroundKt;
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
@kotlin.jvm.internal.u0({"SMAP\nCardTips.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CardTips.kt\ncom/baicizhan/main/home/plan/newexam/ComposableSingletons$CardTipsKt\n+ 2 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n+ 3 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 4 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 5 Composer.kt\nandroidx/compose/runtime/Updater\n+ 6 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,130:1\n87#2:131\n84#2,9:132\n94#2:177\n79#3,6:141\n86#3,3:156\n89#3,2:165\n93#3:176\n347#4,9:147\n356#4:167\n357#4,2:174\n4206#5,6:159\n1247#6,6:168\n*S KotlinDebug\n*F\n+ 1 CardTips.kt\ncom/baicizhan/main/home/plan/newexam/ComposableSingletons$CardTipsKt\n*L\n123#1:131\n123#1:132,9\n123#1:177\n123#1:141,6\n123#1:156,3\n123#1:165,2\n123#1:176\n123#1:147,9\n123#1:167\n123#1:174,2\n123#1:159,6\n127#1:168,6\n*E\n"})
/* loaded from: classes4.dex */
public final class m {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public static final m f22749a = new m();

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public static x00.p<Composer, Integer, yz.g2> f22750b = ComposableLambdaKt.composableLambdaInstance(1290626108, false, new x00.p() { // from class: com.baicizhan.main.home.plan.newexam.k
        @Override // x00.p
        public final Object invoke(Object obj, Object obj2) {
            yz.g2 d11;
            d11 = m.d((Composer) obj, ((Integer) obj2).intValue());
            return d11;
        }
    });

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final yz.g2 d(Composer composer, int i11) {
        if (composer.shouldExecute((i11 & 3) != 2, i11 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1290626108, i11, -1, "com.baicizhan.main.home.plan.newexam.ComposableSingletons$CardTipsKt.lambda$1290626108.<anonymous> (CardTips.kt:122)");
            }
            Modifier.Companion companion = Modifier.Companion;
            Modifier m235backgroundbw27NRU$default = BackgroundKt.m235backgroundbw27NRU$default(companion, bk.b.o(), null, 2, null);
            MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.Companion.getCenterHorizontally(), composer, 48);
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
            CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
            Modifier materializeModifier = ComposedModifierKt.materializeModifier(composer, m235backgroundbw27NRU$default);
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
            if (rememberedValue == Composer.Companion.getEmpty()) {
                rememberedValue = new x00.a() { // from class: com.baicizhan.main.home.plan.newexam.l
                    @Override // x00.a
                    public final Object invoke() {
                        yz.g2 e11;
                        e11 = m.e();
                        return e11;
                    }
                };
                composer.updateRememberedValue(rememberedValue);
            }
            j.q(companion, (x00.a) rememberedValue, composer, 54);
            composer.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return yz.g2.f100423a;
    }

    public static final yz.g2 e() {
        return yz.g2.f100423a;
    }

    @m80.k
    public final x00.p<Composer, Integer, yz.g2> c() {
        return f22750b;
    }
}
