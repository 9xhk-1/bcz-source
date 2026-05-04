package com.baicizhan.main.word_book.list;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScopeInstance;
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

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@kotlin.jvm.internal.u0({"SMAP\nWordBookCreateActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WordBookCreateActivity.kt\ncom/baicizhan/main/word_book/list/ComposableSingletons$WordBookCreateActivityKt\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 3 Row.kt\nandroidx/compose/foundation/layout/RowKt\n+ 4 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 5 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 6 Composer.kt\nandroidx/compose/runtime/Updater\n+ 7 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,430:1\n113#2:431\n99#3:432\n97#3,8:433\n106#3:483\n79#4,6:441\n86#4,3:456\n89#4,2:465\n93#4:482\n347#5,9:447\n356#5:467\n357#5,2:480\n4206#6,6:459\n1247#7,6:468\n1247#7,6:474\n*S KotlinDebug\n*F\n+ 1 WordBookCreateActivity.kt\ncom/baicizhan/main/word_book/list/ComposableSingletons$WordBookCreateActivityKt\n*L\n425#1:431\n425#1:432\n425#1:433,8\n425#1:483\n425#1:441,6\n425#1:456,3\n425#1:465,2\n425#1:482\n425#1:447,9\n425#1:467\n425#1:480,2\n425#1:459,6\n426#1:468,6\n427#1:474,6\n*E\n"})
/* loaded from: classes5.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public static final k f27247a = new k();

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public static x00.p<Composer, Integer, yz.g2> f27248b = ComposableLambdaKt.composableLambdaInstance(702618795, false, new x00.p() { // from class: com.baicizhan.main.word_book.list.h
        @Override // x00.p
        public final Object invoke(Object obj, Object obj2) {
            yz.g2 e11;
            e11 = k.e((Composer) obj, ((Integer) obj2).intValue());
            return e11;
        }
    });

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final yz.g2 e(Composer composer, int i11) {
        if (composer.shouldExecute((i11 & 3) != 2, i11 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(702618795, i11, -1, "com.baicizhan.main.word_book.list.ComposableSingletons$WordBookCreateActivityKt.lambda$702618795.<anonymous> (WordBookCreateActivity.kt:424)");
            }
            Arrangement.HorizontalOrVertical m607spacedBy0680j_4 = Arrangement.INSTANCE.m607spacedBy0680j_4(Dp.m5115constructorimpl(12));
            Modifier m726padding3ABfNKs = PaddingKt.m726padding3ABfNKs(Modifier.Companion, Dp.m5115constructorimpl(16));
            MeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(m607spacedBy0680j_4, Alignment.Companion.getTop(), composer, 6);
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
            Updater.m1958setimpl(m1951constructorimpl, rowMeasurePolicy, companion.getSetMeasurePolicy());
            Updater.m1958setimpl(m1951constructorimpl, currentCompositionLocalMap, companion.getSetResolvedCompositionLocals());
            x00.p<ComposeUiNode, Integer, yz.g2> setCompositeKeyHash = companion.getSetCompositeKeyHash();
            if (m1951constructorimpl.getInserting() || !kotlin.jvm.internal.g0.g(m1951constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                m1951constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                m1951constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m1958setimpl(m1951constructorimpl, materializeModifier, companion.getSetModifier());
            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
            Object rememberedValue = composer.rememberedValue();
            Composer.Companion companion2 = Composer.Companion;
            if (rememberedValue == companion2.getEmpty()) {
                rememberedValue = new x00.a() { // from class: com.baicizhan.main.word_book.list.i
                    @Override // x00.a
                    public final Object invoke() {
                        yz.g2 f11;
                        f11 = k.f();
                        return f11;
                    }
                };
                composer.updateRememberedValue(rememberedValue);
            }
            i3.C("小学", false, (x00.a) rememberedValue, composer, 438);
            Object rememberedValue2 = composer.rememberedValue();
            if (rememberedValue2 == companion2.getEmpty()) {
                rememberedValue2 = new x00.a() { // from class: com.baicizhan.main.word_book.list.j
                    @Override // x00.a
                    public final Object invoke() {
                        yz.g2 g11;
                        g11 = k.g();
                        return g11;
                    }
                };
                composer.updateRememberedValue(rememberedValue2);
            }
            i3.C("四六级", true, (x00.a) rememberedValue2, composer, 438);
            composer.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return yz.g2.f100423a;
    }

    public static final yz.g2 f() {
        return yz.g2.f100423a;
    }

    public static final yz.g2 g() {
        return yz.g2.f100423a;
    }

    @m80.k
    public final x00.p<Composer, Integer, yz.g2> d() {
        return f27248b;
    }
}
