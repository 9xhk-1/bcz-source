package com.baicizhan.main.home.player;

import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.OffsetKt;
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
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.res.PainterResources_androidKt;
import androidx.compose.ui.unit.Dp;
import com.jiongji.andriod.card.R;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@kotlin.jvm.internal.u0({"SMAP\nHomeGuides.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HomeGuides.kt\ncom/baicizhan/main/home/player/HomeGuidesKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n+ 5 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 6 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 7 Composer.kt\nandroidx/compose/runtime/Updater\n*L\n1#1,78:1\n1#2:79\n113#3:80\n113#3:118\n87#4:81\n84#4,9:82\n94#4:122\n79#5,6:91\n86#5,3:106\n89#5,2:115\n93#5:121\n347#6,9:97\n356#6:117\n357#6,2:119\n4206#7,6:109\n*S KotlinDebug\n*F\n+ 1 HomeGuides.kt\ncom/baicizhan/main/home/player/HomeGuidesKt\n*L\n35#1:80\n40#1:118\n35#1:81\n35#1:82,9\n35#1:122\n35#1:91,6\n35#1:106,3\n35#1:115,2\n35#1:121\n35#1:97,9\n35#1:117\n35#1:119,2\n35#1:109,6\n*E\n"})
/* loaded from: classes4.dex */
public final class p4 {
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    @m80.k
    public static final zj.d b(@m80.l Composer composer, int i11) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-32417664, i11, -1, "com.baicizhan.main.home.player.homeIslandUnlockGuideState (HomeGuides.kt:45)");
        }
        composer.startReplaceGroup(-1088591007);
        zj.d a11 = zj.e.a(zj.j.a(x.f24313a.e(), composer, 6), HomeGuideType.ISLAND_UNLOCK, null, composer, 48, 4);
        composer.endReplaceGroup();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return a11;
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    @m80.k
    public static final zj.d c(@m80.l Composer composer, int i11) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1955541914, i11, -1, "com.baicizhan.main.home.player.homePlanEditGuideState (HomeGuides.kt:54)");
        }
        composer.startReplaceGroup(-1919880009);
        zj.d a11 = zj.e.a(zj.j.a(x.f24313a.g(), composer, 6), HomeGuideType.PLAN_EDIT, null, composer, 48, 4);
        composer.endReplaceGroup();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return a11;
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    @m80.k
    public static final zj.d d(@m80.l Composer composer, int i11) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(366627359, i11, -1, "com.baicizhan.main.home.player.homeReviewGuideState (HomeGuides.kt:71)");
        }
        composer.startReplaceGroup(141586777);
        zj.d a11 = zj.e.a(zj.j.a(x.f24313a.f(), composer, 6), HomeGuideType.REVIEW, null, composer, 48, 4);
        composer.endReplaceGroup();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return a11;
    }

    @Composable
    @m80.k
    public static final zj.d e(@m80.k x00.a<? extends l3.o> effectGetter, final boolean z11, @m80.l Composer composer, int i11, int i12) {
        kotlin.jvm.internal.g0.p(effectGetter, "effectGetter");
        if ((i12 & 2) != 0) {
            z11 = false;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(2039378393, i11, -1, "com.baicizhan.main.home.player.homeStartLearningGuideState (HomeGuides.kt:33)");
        }
        composer.startReplaceGroup(1337570587);
        zj.d a11 = zj.e.a(zj.j.a(ComposableLambdaKt.rememberComposableLambda(436382663, true, new x00.p() { // from class: com.baicizhan.main.home.player.o4
            @Override // x00.p
            public final Object invoke(Object obj, Object obj2) {
                yz.g2 f11;
                f11 = p4.f(z11, (Composer) obj, ((Integer) obj2).intValue());
                return f11;
            }
        }, composer, 54), composer, 6), HomeGuideType.START_LEARNING, null, composer, 48, 4);
        composer.endReplaceGroup();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return a11;
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final yz.g2 f(boolean z11, Composer composer, int i11) {
        if (composer.shouldExecute((i11 & 3) != 2, i11 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(436382663, i11, -1, "com.baicizhan.main.home.player.homeStartLearningGuideState.<anonymous> (HomeGuides.kt:34)");
            }
            Modifier.Companion companion = Modifier.Companion;
            Modifier m685offsetVpY3zN4 = OffsetKt.m685offsetVpY3zN4(companion, Dp.m5115constructorimpl(12), Dp.m5115constructorimpl(100));
            MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.Companion.getCenterHorizontally(), composer, 48);
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
            CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
            Modifier materializeModifier = ComposedModifierKt.materializeModifier(composer, m685offsetVpY3zN4);
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
            ImageKt.Image(PainterResources_androidKt.painterResource(z11 ? R.drawable.image_guide_tip_learning_undone_continue2 : R.drawable.image_guide_tip_learning_undone_continue, composer, 0), (String) null, (Modifier) null, (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composer, 48, 124);
            ImageKt.Image(PainterResources_androidKt.painterResource(R.drawable.ic_guide_finger_pointing, composer, 6), (String) null, PaddingKt.m730paddingqDBjuR0$default(companion, 0.0f, Dp.m5115constructorimpl(24), 0.0f, 0.0f, 13, null), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composer, 432, 120);
            composer.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return yz.g2.f100423a;
    }
}
