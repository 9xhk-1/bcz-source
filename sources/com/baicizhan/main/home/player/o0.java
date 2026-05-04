package com.baicizhan.main.home.player;

import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
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
@kotlin.jvm.internal.u0({"SMAP\nLearning.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Learning.kt\ncom/baicizhan/main/home/player/ComposableSingletons$LearningKt\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 3 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n+ 4 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 5 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 6 Composer.kt\nandroidx/compose/runtime/Updater\n+ 7 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,512:1\n113#2:513\n113#2:596\n113#2:597\n87#3:514\n85#3,8:515\n94#3:589\n87#3:598\n83#3,10:599\n94#3:639\n79#4,6:523\n86#4,3:538\n89#4,2:547\n93#4:588\n79#4,6:609\n86#4,3:624\n89#4,2:633\n93#4:638\n347#5,9:529\n356#5:549\n357#5,2:586\n347#5,9:615\n356#5,3:635\n4206#6,6:541\n4206#6,6:627\n1247#7,6:550\n1247#7,6:556\n1247#7,6:562\n1247#7,6:568\n1247#7,6:574\n1247#7,6:580\n1247#7,6:590\n*S KotlinDebug\n*F\n+ 1 Learning.kt\ncom/baicizhan/main/home/player/ComposableSingletons$LearningKt\n*L\n182#1:513\n505#1:596\n477#1:597\n182#1:514\n182#1:515,8\n182#1:589\n477#1:598\n477#1:599,10\n477#1:639\n182#1:523,6\n182#1:538,3\n182#1:547,2\n182#1:588\n477#1:609,6\n477#1:624,3\n477#1:633,2\n477#1:638\n182#1:529,9\n182#1:549\n182#1:586,2\n477#1:615,9\n477#1:635,3\n182#1:541,6\n477#1:627,6\n183#1:550,6\n184#1:556,6\n185#1:562,6\n186#1:568,6\n187#1:574,6\n188#1:580,6\n314#1:590,6\n*E\n"})
/* loaded from: classes4.dex */
public final class o0 {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public static final o0 f23821a = new o0();

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public static x00.p<Composer, Integer, yz.g2> f23822b = ComposableLambdaKt.composableLambdaInstance(-1918893467, false, new x00.p() { // from class: com.baicizhan.main.home.player.d0
        @Override // x00.p
        public final Object invoke(Object obj, Object obj2) {
            yz.g2 t11;
            t11 = o0.t((Composer) obj, ((Integer) obj2).intValue());
            return t11;
        }
    });

    /* renamed from: c, reason: collision with root package name */
    @m80.k
    public static x00.p<Composer, Integer, yz.g2> f23823c = ComposableLambdaKt.composableLambdaInstance(1194404311, false, new x00.p() { // from class: com.baicizhan.main.home.player.f0
        @Override // x00.p
        public final Object invoke(Object obj, Object obj2) {
            yz.g2 p11;
            p11 = o0.p((Composer) obj, ((Integer) obj2).intValue());
            return p11;
        }
    });

    /* renamed from: d, reason: collision with root package name */
    @m80.k
    public static x00.q<Modifier, Composer, Integer, yz.g2> f23824d = ComposableLambdaKt.composableLambdaInstance(-1578747985, false, new x00.q() { // from class: com.baicizhan.main.home.player.g0
        @Override // x00.q
        public final Object invoke(Object obj, Object obj2, Object obj3) {
            yz.g2 s11;
            s11 = o0.s((Modifier) obj, (Composer) obj2, ((Integer) obj3).intValue());
            return s11;
        }
    });

    /* renamed from: e, reason: collision with root package name */
    @m80.k
    public static x00.p<Composer, Integer, yz.g2> f23825e = ComposableLambdaKt.composableLambdaInstance(1260130700, false, new x00.p() { // from class: com.baicizhan.main.home.player.h0
        @Override // x00.p
        public final Object invoke(Object obj, Object obj2) {
            yz.g2 r11;
            r11 = o0.r((Composer) obj, ((Integer) obj2).intValue());
            return r11;
        }
    });

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final yz.g2 p(Composer composer, int i11) {
        if (composer.shouldExecute((i11 & 3) != 2, i11 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1194404311, i11, -1, "com.baicizhan.main.home.player.ComposableSingletons$LearningKt.lambda$1194404311.<anonymous> (Learning.kt:313)");
            }
            Object rememberedValue = composer.rememberedValue();
            if (rememberedValue == Composer.Companion.getEmpty()) {
                rememberedValue = new x00.a() { // from class: com.baicizhan.main.home.player.e0
                    @Override // x00.a
                    public final Object invoke() {
                        yz.g2 q11;
                        q11 = o0.q();
                        return q11;
                    }
                };
                composer.updateRememberedValue(rememberedValue);
            }
            l7.w(null, "学单词", (x00.a) rememberedValue, composer, 432, 1);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return yz.g2.f100423a;
    }

    public static final yz.g2 q() {
        return yz.g2.f100423a;
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final yz.g2 r(Composer composer, int i11) {
        if (composer.shouldExecute((i11 & 3) != 2, i11 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1260130700, i11, -1, "com.baicizhan.main.home.player.ComposableSingletons$LearningKt.lambda$1260130700.<anonymous> (Learning.kt:476)");
            }
            Arrangement.HorizontalOrVertical m607spacedBy0680j_4 = Arrangement.INSTANCE.m607spacedBy0680j_4(Dp.m5115constructorimpl(8));
            Modifier.Companion companion = Modifier.Companion;
            MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(m607spacedBy0680j_4, Alignment.Companion.getStart(), composer, 6);
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
            l7.G(null, "四级核心词汇大全", 10, 20, "升级进度", false, null, null, null, null, composer, 28080, 993);
            l7.G(null, "四级核心词汇大全", 2000, 2000, "升级进度", false, null, null, null, null, composer, 28080, 993);
            l7.G(null, "四级核心词汇大全四级核心词汇大全", 1, 20, "升级进度", false, null, null, null, null, composer, 28080, 993);
            l7.G(null, "四级核心词汇大全四级核心词汇大全", 2000, 2000, "升级进度", false, null, f23824d, null, null, composer, 12610992, 865);
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
    public static final yz.g2 s(Modifier it, Composer composer, int i11) {
        kotlin.jvm.internal.g0.p(it, "it");
        if ((i11 & 6) == 0) {
            i11 |= composer.changed(it) ? 4 : 2;
        }
        if (composer.shouldExecute((i11 & 19) != 18, i11 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1578747985, i11, -1, "com.baicizhan.main.home.player.ComposableSingletons$LearningKt.lambda$-1578747985.<anonymous> (Learning.kt:501)");
            }
            ImageKt.Image(PainterResources_androidKt.painterResource(R.drawable.ic_home_punch_card, composer, 6), "punch", it.then(SizeKt.m773size3ABfNKs(Modifier.Companion, Dp.m5115constructorimpl(32))), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composer, 48, 120);
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
    public static final yz.g2 t(Composer composer, int i11) {
        if (composer.shouldExecute((i11 & 3) != 2, i11 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1918893467, i11, -1, "com.baicizhan.main.home.player.ComposableSingletons$LearningKt.lambda$-1918893467.<anonymous> (Learning.kt:181)");
            }
            Modifier.Companion companion = Modifier.Companion;
            Modifier m778width3ABfNKs = SizeKt.m778width3ABfNKs(companion, Dp.m5115constructorimpl(R.styleable.Theme_drawable_tab_friends_new));
            MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.m607spacedBy0680j_4(Dp.m5115constructorimpl(8)), Alignment.Companion.getStart(), composer, 6);
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
            CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
            Modifier materializeModifier = ComposedModifierKt.materializeModifier(composer, m778width3ABfNKs);
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
            Modifier fillMaxWidth$default = SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null);
            Object rememberedValue = composer.rememberedValue();
            Composer.Companion companion3 = Composer.Companion;
            if (rememberedValue == companion3.getEmpty()) {
                rememberedValue = new x00.a() { // from class: com.baicizhan.main.home.player.i0
                    @Override // x00.a
                    public final Object invoke() {
                        yz.g2 u11;
                        u11 = o0.u();
                        return u11;
                    }
                };
                composer.updateRememberedValue(rememberedValue);
            }
            l7.A(fillMaxWidth$default, "开始背单词", R.drawable.bg_home_learning_button_orange, null, 0, 0, null, null, (x00.a) rememberedValue, composer, 100663734, R.styleable.Theme_drawable_walk_sound4);
            Modifier fillMaxWidth$default2 = SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null);
            Object rememberedValue2 = composer.rememberedValue();
            if (rememberedValue2 == companion3.getEmpty()) {
                rememberedValue2 = new x00.a() { // from class: com.baicizhan.main.home.player.j0
                    @Override // x00.a
                    public final Object invoke() {
                        yz.g2 v11;
                        v11 = o0.v();
                        return v11;
                    }
                };
                composer.updateRememberedValue(rememberedValue2);
            }
            l7.A(fillMaxWidth$default2, "开始日语学习", 0, "第 10 关", 0, 0, null, null, (x00.a) rememberedValue2, composer, 100666422, 244);
            Modifier fillMaxWidth$default3 = SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null);
            Object rememberedValue3 = composer.rememberedValue();
            if (rememberedValue3 == companion3.getEmpty()) {
                rememberedValue3 = new x00.a() { // from class: com.baicizhan.main.home.player.k0
                    @Override // x00.a
                    public final Object invoke() {
                        yz.g2 w11;
                        w11 = o0.w();
                        return w11;
                    }
                };
                composer.updateRememberedValue(rememberedValue3);
            }
            l7.A(fillMaxWidth$default3, "开始日语学习", 0, "第 10 关", 0, 0, null, "Unit 1", (x00.a) rememberedValue3, composer, 113249334, 116);
            Modifier fillMaxWidth$default4 = SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null);
            Object rememberedValue4 = composer.rememberedValue();
            if (rememberedValue4 == companion3.getEmpty()) {
                rememberedValue4 = new x00.a() { // from class: com.baicizhan.main.home.player.l0
                    @Override // x00.a
                    public final Object invoke() {
                        yz.g2 x11;
                        x11 = o0.x();
                        return x11;
                    }
                };
                composer.updateRememberedValue(rememberedValue4);
            }
            l7.A(fillMaxWidth$default4, "开始背单词", 0, null, R.drawable.ic_home_battery_blue_small_shape, 0, null, null, (x00.a) rememberedValue4, composer, 100687926, R.styleable.Theme_drawable_tab_mall_1111);
            Modifier fillMaxWidth$default5 = SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null);
            Object rememberedValue5 = composer.rememberedValue();
            if (rememberedValue5 == companion3.getEmpty()) {
                rememberedValue5 = new x00.a() { // from class: com.baicizhan.main.home.player.m0
                    @Override // x00.a
                    public final Object invoke() {
                        yz.g2 y11;
                        y11 = o0.y();
                        return y11;
                    }
                };
                composer.updateRememberedValue(rememberedValue5);
            }
            l7.A(fillMaxWidth$default5, "开始背单词", 0, null, R.drawable.ic_home_battery_blue_small, 0, null, null, (x00.a) rememberedValue5, composer, 100687926, R.styleable.Theme_drawable_tab_mall_1111);
            Modifier fillMaxWidth$default6 = SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null);
            Object rememberedValue6 = composer.rememberedValue();
            if (rememberedValue6 == companion3.getEmpty()) {
                rememberedValue6 = new x00.a() { // from class: com.baicizhan.main.home.player.n0
                    @Override // x00.a
                    public final Object invoke() {
                        yz.g2 z11;
                        z11 = o0.z();
                        return z11;
                    }
                };
                composer.updateRememberedValue(rememberedValue6);
            }
            l7.A(fillMaxWidth$default6, "开始背单词", R.drawable.bg_home_learning_button_green, null, 0, R.drawable.ic_home_claps, null, null, (x00.a) rememberedValue6, composer, 100860342, R.styleable.Theme_drawable_right_arrow);
            composer.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return yz.g2.f100423a;
    }

    public static final yz.g2 u() {
        return yz.g2.f100423a;
    }

    public static final yz.g2 v() {
        return yz.g2.f100423a;
    }

    public static final yz.g2 w() {
        return yz.g2.f100423a;
    }

    public static final yz.g2 x() {
        return yz.g2.f100423a;
    }

    public static final yz.g2 y() {
        return yz.g2.f100423a;
    }

    public static final yz.g2 z() {
        return yz.g2.f100423a;
    }

    @m80.k
    public final x00.q<Modifier, Composer, Integer, yz.g2> l() {
        return f23824d;
    }

    @m80.k
    public final x00.p<Composer, Integer, yz.g2> m() {
        return f23822b;
    }

    @m80.k
    public final x00.p<Composer, Integer, yz.g2> n() {
        return f23823c;
    }

    @m80.k
    public final x00.p<Composer, Integer, yz.g2> o() {
        return f23825e;
    }
}
