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
import androidx.compose.ui.graphics.GraphicsLayerModifierKt;
import androidx.compose.ui.graphics.GraphicsLayerScope;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.res.PainterResources_androidKt;
import androidx.compose.ui.unit.Dp;
import com.jiongji.andriod.card.R;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@kotlin.jvm.internal.u0({"SMAP\nHomeGuides.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HomeGuides.kt\ncom/baicizhan/main/home/player/ComposableSingletons$HomeGuidesKt\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/Dp\n+ 4 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n+ 5 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 6 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 7 Composer.kt\nandroidx/compose/runtime/Updater\n+ 8 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,78:1\n118#2:79\n113#2:80\n113#2:119\n113#2:124\n113#2:169\n118#2:174\n113#2:175\n113#2:213\n55#3:81\n55#3:125\n87#4:82\n84#4,9:83\n94#4:123\n87#4:126\n84#4,9:127\n94#4:173\n87#4:176\n84#4,9:177\n94#4:217\n79#5,6:92\n86#5,3:107\n89#5,2:116\n93#5:122\n79#5,6:136\n86#5,3:151\n89#5,2:160\n93#5:172\n79#5,6:186\n86#5,3:201\n89#5,2:210\n93#5:216\n347#6,9:98\n356#6:118\n357#6,2:120\n347#6,9:142\n356#6:162\n357#6,2:170\n347#6,9:192\n356#6:212\n357#6,2:214\n4206#7,6:110\n4206#7,6:154\n4206#7,6:204\n1247#8,6:163\n*S KotlinDebug\n*F\n+ 1 HomeGuides.kt\ncom/baicizhan/main/home/player/ComposableSingletons$HomeGuidesKt\n*L\n47#1:79\n47#1:80\n49#1:119\n56#1:124\n61#1:169\n73#1:174\n73#1:175\n75#1:213\n47#1:81\n56#1:125\n47#1:82\n47#1:83,9\n47#1:123\n56#1:126\n56#1:127,9\n56#1:173\n73#1:176\n73#1:177,9\n73#1:217\n47#1:92,6\n47#1:107,3\n47#1:116,2\n47#1:122\n56#1:136,6\n56#1:151,3\n56#1:160,2\n56#1:172\n73#1:186,6\n73#1:201,3\n73#1:210,2\n73#1:216\n47#1:98,9\n47#1:118\n47#1:120,2\n56#1:142,9\n56#1:162\n56#1:170,2\n73#1:192,9\n73#1:212\n73#1:214,2\n47#1:110,6\n56#1:154,6\n73#1:204,6\n58#1:163,6\n*E\n"})
/* loaded from: classes4.dex */
public final class x {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public static final x f24313a = new x();

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public static x00.p<Composer, Integer, yz.g2> f24314b = ComposableLambdaKt.composableLambdaInstance(-979643922, false, new x00.p() { // from class: com.baicizhan.main.home.player.t
        @Override // x00.p
        public final Object invoke(Object obj, Object obj2) {
            yz.g2 k11;
            k11 = x.k((Composer) obj, ((Integer) obj2).intValue());
            return k11;
        }
    });

    /* renamed from: c, reason: collision with root package name */
    @m80.k
    public static x00.p<Composer, Integer, yz.g2> f24315c = ComposableLambdaKt.composableLambdaInstance(591107080, false, new x00.p() { // from class: com.baicizhan.main.home.player.u
        @Override // x00.p
        public final Object invoke(Object obj, Object obj2) {
            yz.g2 i11;
            i11 = x.i((Composer) obj, ((Integer) obj2).intValue());
            return i11;
        }
    });

    /* renamed from: d, reason: collision with root package name */
    @m80.k
    public static x00.p<Composer, Integer, yz.g2> f24316d = ComposableLambdaKt.composableLambdaInstance(257945101, false, new x00.p() { // from class: com.baicizhan.main.home.player.v
        @Override // x00.p
        public final Object invoke(Object obj, Object obj2) {
            yz.g2 h11;
            h11 = x.h((Composer) obj, ((Integer) obj2).intValue());
            return h11;
        }
    });

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final yz.g2 h(Composer composer, int i11) {
        if (composer.shouldExecute((i11 & 3) != 2, i11 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(257945101, i11, -1, "com.baicizhan.main.home.player.ComposableSingletons$HomeGuidesKt.lambda$257945101.<anonymous> (HomeGuides.kt:72)");
            }
            Modifier.Companion companion = Modifier.Companion;
            Modifier m685offsetVpY3zN4 = OffsetKt.m685offsetVpY3zN4(companion, Dp.m5115constructorimpl((float) (-12.5d)), Dp.m5115constructorimpl(107));
            MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.Companion.getEnd(), composer, 48);
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
            ImageKt.Image(PainterResources_androidKt.painterResource(R.drawable.image_guide_tip_review, composer, 6), (String) null, (Modifier) null, (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composer, 48, 124);
            ImageKt.Image(PainterResources_androidKt.painterResource(R.drawable.ic_guide_finger_pointing, composer, 6), (String) null, PaddingKt.m730paddingqDBjuR0$default(companion, 0.0f, Dp.m5115constructorimpl(32), Dp.m5115constructorimpl(30), 0.0f, 9, null), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composer, 432, 120);
            composer.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return yz.g2.f100423a;
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final yz.g2 i(Composer composer, int i11) {
        if (composer.shouldExecute((i11 & 3) != 2, i11 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(591107080, i11, -1, "com.baicizhan.main.home.player.ComposableSingletons$HomeGuidesKt.lambda$591107080.<anonymous> (HomeGuides.kt:55)");
            }
            Modifier.Companion companion = Modifier.Companion;
            Modifier m685offsetVpY3zN4 = OffsetKt.m685offsetVpY3zN4(companion, Dp.m5115constructorimpl(-22), Dp.m5115constructorimpl(-Dp.m5115constructorimpl(132)));
            MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.Companion.getEnd(), composer, 48);
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
            ImageKt.Image(PainterResources_androidKt.painterResource(R.drawable.image_guide_tip_plan_edit, composer, 6), (String) null, (Modifier) null, (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composer, 48, 124);
            Painter painterResource = PainterResources_androidKt.painterResource(R.drawable.ic_guide_finger_pointing, composer, 6);
            Object rememberedValue = composer.rememberedValue();
            if (rememberedValue == Composer.Companion.getEmpty()) {
                rememberedValue = new x00.l() { // from class: com.baicizhan.main.home.player.w
                    @Override // x00.l
                    public final Object invoke(Object obj) {
                        yz.g2 j11;
                        j11 = x.j((GraphicsLayerScope) obj);
                        return j11;
                    }
                };
                composer.updateRememberedValue(rememberedValue);
            }
            ImageKt.Image(painterResource, (String) null, PaddingKt.m730paddingqDBjuR0$default(GraphicsLayerModifierKt.graphicsLayer(companion, (x00.l) rememberedValue), 0.0f, Dp.m5115constructorimpl(33), 0.0f, 0.0f, 13, null), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composer, 432, 120);
            composer.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return yz.g2.f100423a;
    }

    public static final yz.g2 j(GraphicsLayerScope graphicsLayer) {
        kotlin.jvm.internal.g0.p(graphicsLayer, "$this$graphicsLayer");
        graphicsLayer.setRotationY(180.0f);
        graphicsLayer.setTranslationX(graphicsLayer.getDensity() * (-37.0f));
        return yz.g2.f100423a;
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final yz.g2 k(Composer composer, int i11) {
        if (composer.shouldExecute((i11 & 3) != 2, i11 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-979643922, i11, -1, "com.baicizhan.main.home.player.ComposableSingletons$HomeGuidesKt.lambda$-979643922.<anonymous> (HomeGuides.kt:46)");
            }
            Modifier.Companion companion = Modifier.Companion;
            Modifier m685offsetVpY3zN4 = OffsetKt.m685offsetVpY3zN4(companion, Dp.m5115constructorimpl((float) 2.5d), Dp.m5115constructorimpl(-Dp.m5115constructorimpl(60)));
            MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.Companion.getEnd(), composer, 48);
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
            ImageKt.Image(PainterResources_androidKt.painterResource(R.drawable.ic_guide_finger_pointing, composer, 6), (String) null, (Modifier) null, (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composer, 48, 124);
            ImageKt.Image(PainterResources_androidKt.painterResource(R.drawable.image_guide_tip_island_to_be_unlocked, composer, 6), (String) null, PaddingKt.m730paddingqDBjuR0$default(companion, 0.0f, 0.0f, Dp.m5115constructorimpl(5), 0.0f, 11, null), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composer, 432, 120);
            composer.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return yz.g2.f100423a;
    }

    @m80.k
    public final x00.p<Composer, Integer, yz.g2> e() {
        return f24314b;
    }

    @m80.k
    public final x00.p<Composer, Integer, yz.g2> f() {
        return f24316d;
    }

    @m80.k
    public final x00.p<Composer, Integer, yz.g2> g() {
        return f24315c;
    }
}
