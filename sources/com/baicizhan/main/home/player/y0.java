package com.baicizhan.main.home.player;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.OffsetKt;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
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
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.res.PainterResources_androidKt;
import androidx.compose.ui.unit.Dp;
import com.jiongji.andriod.card.R;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@kotlin.jvm.internal.u0({"SMAP\nTopStatus.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TopStatus.kt\ncom/baicizhan/main/home/player/ComposableSingletons$TopStatusKt\n+ 2 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n+ 3 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 4 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 5 Composer.kt\nandroidx/compose/runtime/Updater\n+ 6 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 7 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 8 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 9 Row.kt\nandroidx/compose/foundation/layout/RowKt\n*L\n1#1,543:1\n87#2:544\n83#2,10:545\n94#2:597\n87#2:718\n83#2,10:719\n94#2:760\n87#2:761\n83#2,10:762\n94#2:802\n79#3,6:555\n86#3,3:570\n89#3,2:579\n93#3:596\n79#3,6:608\n86#3,3:623\n89#3,2:632\n93#3:639\n79#3,6:652\n86#3,3:667\n89#3,2:676\n79#3,6:691\n86#3,3:706\n89#3,2:715\n79#3,6:729\n86#3,3:744\n89#3,2:753\n93#3:759\n79#3,6:772\n86#3,3:787\n89#3,2:796\n93#3:801\n93#3:805\n93#3:809\n347#4,9:561\n356#4:581\n357#4,2:594\n347#4,9:614\n356#4:634\n357#4,2:637\n347#4,9:658\n356#4:678\n347#4,9:697\n356#4:717\n347#4,9:735\n356#4:755\n357#4,2:757\n347#4,9:778\n356#4,3:798\n357#4,2:803\n357#4,2:807\n4206#5,6:573\n4206#5,6:626\n4206#5,6:670\n4206#5,6:709\n4206#5,6:747\n4206#5,6:790\n1247#6,6:582\n1247#6,6:588\n113#7:598\n113#7:635\n113#7:636\n113#7:641\n113#7:679\n113#7:756\n70#8:599\n68#8,8:600\n77#8:640\n70#8:642\n67#8,9:643\n77#8:810\n99#9:680\n95#9,10:681\n106#9:806\n*S KotlinDebug\n*F\n+ 1 TopStatus.kt\ncom/baicizhan/main/home/player/ComposableSingletons$TopStatusKt\n*L\n138#1:544\n138#1:545,10\n138#1:597\n278#1:718\n278#1:719,10\n278#1:760\n320#1:761\n320#1:762,10\n320#1:802\n138#1:555,6\n138#1:570,3\n138#1:579,2\n138#1:596\n312#1:608,6\n312#1:623,3\n312#1:632,2\n312#1:639\n276#1:652,6\n276#1:667,3\n276#1:676,2\n277#1:691,6\n277#1:706,3\n277#1:715,2\n278#1:729,6\n278#1:744,3\n278#1:753,2\n278#1:759\n320#1:772,6\n320#1:787,3\n320#1:796,2\n320#1:801\n277#1:805\n276#1:809\n138#1:561,9\n138#1:581\n138#1:594,2\n312#1:614,9\n312#1:634\n312#1:637,2\n276#1:658,9\n276#1:678\n277#1:697,9\n277#1:717\n278#1:735,9\n278#1:755\n278#1:757,2\n320#1:778,9\n320#1:798,3\n277#1:803,2\n276#1:807,2\n138#1:573,6\n312#1:626,6\n276#1:670,6\n277#1:709,6\n278#1:747,6\n320#1:790,6\n141#1:582,6\n146#1:588,6\n313#1:598\n316#1:635\n317#1:636\n276#1:641\n277#1:679\n287#1:756\n312#1:599\n312#1:600,8\n312#1:640\n276#1:642\n276#1:643,9\n276#1:810\n277#1:680\n277#1:681,10\n277#1:806\n*E\n"})
/* loaded from: classes4.dex */
public final class y0 {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public static final y0 f24331a = new y0();

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public static x00.p<Composer, Integer, yz.g2> f24332b = ComposableLambdaKt.composableLambdaInstance(-1052581796, false, new x00.p() { // from class: com.baicizhan.main.home.player.v0
        @Override // x00.p
        public final Object invoke(Object obj, Object obj2) {
            yz.g2 j11;
            j11 = y0.j((Composer) obj, ((Integer) obj2).intValue());
            return j11;
        }
    });

    /* renamed from: c, reason: collision with root package name */
    @m80.k
    public static x00.q<Modifier, Composer, Integer, yz.g2> f24333c = ComposableLambdaKt.composableLambdaInstance(501409266, false, new x00.q() { // from class: com.baicizhan.main.home.player.w0
        @Override // x00.q
        public final Object invoke(Object obj, Object obj2, Object obj3) {
            yz.g2 i11;
            i11 = y0.i((Modifier) obj, (Composer) obj2, ((Integer) obj3).intValue());
            return i11;
        }
    });

    /* renamed from: d, reason: collision with root package name */
    @m80.k
    public static x00.p<Composer, Integer, yz.g2> f24334d = ComposableLambdaKt.composableLambdaInstance(-1666160702, false, new x00.p() { // from class: com.baicizhan.main.home.player.x0
        @Override // x00.p
        public final Object invoke(Object obj, Object obj2) {
            yz.g2 m11;
            m11 = y0.m((Composer) obj, ((Integer) obj2).intValue());
            return m11;
        }
    });

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final yz.g2 i(Modifier it, Composer composer, int i11) {
        int i12;
        kotlin.jvm.internal.g0.p(it, "it");
        if ((i11 & 6) == 0) {
            i12 = i11 | (composer.changed(it) ? 4 : 2);
        } else {
            i12 = i11;
        }
        if (composer.shouldExecute((i12 & 19) != 18, i12 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(501409266, i12, -1, "com.baicizhan.main.home.player.ComposableSingletons$TopStatusKt.lambda$501409266.<anonymous> (TopStatus.kt:311)");
            }
            Modifier.Companion companion = Modifier.Companion;
            Modifier then = it.then(PaddingKt.m730paddingqDBjuR0$default(companion, Dp.m5115constructorimpl(12), 0.0f, 0.0f, 0.0f, 14, null));
            MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.getCenter(), false);
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
            CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
            Modifier materializeModifier = ComposedModifierKt.materializeModifier(composer, then);
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
            Updater.m1958setimpl(m1951constructorimpl, maybeCachedBoxMeasurePolicy, companion2.getSetMeasurePolicy());
            Updater.m1958setimpl(m1951constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
            x00.p<ComposeUiNode, Integer, yz.g2> setCompositeKeyHash = companion2.getSetCompositeKeyHash();
            if (m1951constructorimpl.getInserting() || !kotlin.jvm.internal.g0.g(m1951constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                m1951constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                m1951constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m1958setimpl(m1951constructorimpl, materializeModifier, companion2.getSetModifier());
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            ImageKt.Image(PainterResources_androidKt.painterResource(R.drawable.bg_home_membership_status, composer, 6), "bg", ClipKt.clip(SizeKt.fillMaxSize$default(companion, 0.0f, 1, null), RoundedCornerShapeKt.m1019RoundedCornerShape0680j_4(Dp.m5115constructorimpl(100))), (Alignment) null, ContentScale.Companion.getFillBounds(), 0.0f, (ColorFilter) null, composer, 24624, 104);
            ImageKt.Image(PainterResources_androidKt.painterResource(R.drawable.ic_home_membership_pro_label, composer, 6), "pro", OffsetKt.m686offsetVpY3zN4$default(companion, Dp.m5115constructorimpl(2), 0.0f, 2, null), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composer, 432, 120);
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
    public static final yz.g2 j(Composer composer, int i11) {
        Integer valueOf = Integer.valueOf(R.drawable.ic_user_default_avatar);
        if (composer.shouldExecute((i11 & 3) != 2, i11 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1052581796, i11, -1, "com.baicizhan.main.home.player.ComposableSingletons$TopStatusKt.lambda$-1052581796.<anonymous> (TopStatus.kt:137)");
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
                rememberedValue = new x00.a() { // from class: com.baicizhan.main.home.player.t0
                    @Override // x00.a
                    public final Object invoke() {
                        yz.g2 k11;
                        k11 = y0.k();
                        return k11;
                    }
                };
                composer.updateRememberedValue(rememberedValue);
            }
            TopStatusKt.y(null, valueOf, null, null, null, (x00.a) rememberedValue, composer, 196656, 29);
            Integer valueOf2 = Integer.valueOf(R.drawable.fore_avatar_membership);
            Object rememberedValue2 = composer.rememberedValue();
            if (rememberedValue2 == companion3.getEmpty()) {
                rememberedValue2 = new x00.a() { // from class: com.baicizhan.main.home.player.u0
                    @Override // x00.a
                    public final Object invoke() {
                        yz.g2 l11;
                        l11 = y0.l();
                        return l11;
                    }
                };
                composer.updateRememberedValue(rememberedValue2);
            }
            TopStatusKt.y(null, valueOf, valueOf2, null, null, (x00.a) rememberedValue2, composer, 197040, 25);
            composer.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return yz.g2.f100423a;
    }

    public static final yz.g2 k() {
        return yz.g2.f100423a;
    }

    public static final yz.g2 l() {
        return yz.g2.f100423a;
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final yz.g2 m(Composer composer, int i11) {
        Integer valueOf = Integer.valueOf(R.drawable.ic_home_status_label_exclamation_mark);
        if (composer.shouldExecute((i11 & 3) != 2, i11 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1666160702, i11, -1, "com.baicizhan.main.home.player.ComposableSingletons$TopStatusKt.lambda$-1666160702.<anonymous> (TopStatus.kt:275)");
            }
            Modifier.Companion companion = Modifier.Companion;
            Modifier m726padding3ABfNKs = PaddingKt.m726padding3ABfNKs(BackgroundKt.m235backgroundbw27NRU$default(companion, ColorKt.Color(4286097919L), null, 2, null), Dp.m5115constructorimpl(16));
            Alignment.Companion companion2 = Alignment.Companion;
            MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(companion2.getTopStart(), false);
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
            CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
            Modifier materializeModifier = ComposedModifierKt.materializeModifier(composer, m726padding3ABfNKs);
            ComposeUiNode.Companion companion3 = ComposeUiNode.Companion;
            x00.a<ComposeUiNode> constructor = companion3.getConstructor();
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
            Updater.m1958setimpl(m1951constructorimpl, maybeCachedBoxMeasurePolicy, companion3.getSetMeasurePolicy());
            Updater.m1958setimpl(m1951constructorimpl, currentCompositionLocalMap, companion3.getSetResolvedCompositionLocals());
            x00.p<ComposeUiNode, Integer, yz.g2> setCompositeKeyHash = companion3.getSetCompositeKeyHash();
            if (m1951constructorimpl.getInserting() || !kotlin.jvm.internal.g0.g(m1951constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                m1951constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                m1951constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m1958setimpl(m1951constructorimpl, materializeModifier, companion3.getSetModifier());
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            Arrangement arrangement = Arrangement.INSTANCE;
            MeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(arrangement.m607spacedBy0680j_4(Dp.m5115constructorimpl(10)), companion2.getTop(), composer, 6);
            int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
            CompositionLocalMap currentCompositionLocalMap2 = composer.getCurrentCompositionLocalMap();
            Modifier materializeModifier2 = ComposedModifierKt.materializeModifier(composer, companion);
            x00.a<ComposeUiNode> constructor2 = companion3.getConstructor();
            if (composer.getApplier() == null) {
                ComposablesKt.invalidApplier();
            }
            composer.startReusableNode();
            if (composer.getInserting()) {
                composer.createNode(constructor2);
            } else {
                composer.useNode();
            }
            Composer m1951constructorimpl2 = Updater.m1951constructorimpl(composer);
            Updater.m1958setimpl(m1951constructorimpl2, rowMeasurePolicy, companion3.getSetMeasurePolicy());
            Updater.m1958setimpl(m1951constructorimpl2, currentCompositionLocalMap2, companion3.getSetResolvedCompositionLocals());
            x00.p<ComposeUiNode, Integer, yz.g2> setCompositeKeyHash2 = companion3.getSetCompositeKeyHash();
            if (m1951constructorimpl2.getInserting() || !kotlin.jvm.internal.g0.g(m1951constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                m1951constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                m1951constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
            }
            Updater.m1958setimpl(m1951constructorimpl2, materializeModifier2, companion3.getSetModifier());
            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
            MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(arrangement.getTop(), companion2.getStart(), composer, 0);
            int currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
            CompositionLocalMap currentCompositionLocalMap3 = composer.getCurrentCompositionLocalMap();
            Modifier materializeModifier3 = ComposedModifierKt.materializeModifier(composer, companion);
            x00.a<ComposeUiNode> constructor3 = companion3.getConstructor();
            if (composer.getApplier() == null) {
                ComposablesKt.invalidApplier();
            }
            composer.startReusableNode();
            if (composer.getInserting()) {
                composer.createNode(constructor3);
            } else {
                composer.useNode();
            }
            Composer m1951constructorimpl3 = Updater.m1951constructorimpl(composer);
            Updater.m1958setimpl(m1951constructorimpl3, columnMeasurePolicy, companion3.getSetMeasurePolicy());
            Updater.m1958setimpl(m1951constructorimpl3, currentCompositionLocalMap3, companion3.getSetResolvedCompositionLocals());
            x00.p<ComposeUiNode, Integer, yz.g2> setCompositeKeyHash3 = companion3.getSetCompositeKeyHash();
            if (m1951constructorimpl3.getInserting() || !kotlin.jvm.internal.g0.g(m1951constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                m1951constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                m1951constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
            }
            Updater.m1958setimpl(m1951constructorimpl3, materializeModifier3, companion3.getSetModifier());
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            TopStatusKt.E(null, new a8(R.drawable.ic_home_battery, "34", null, null, 12, null), null, null, null, false, 0L, null, composer, 0, 253);
            SpacerKt.Spacer(SizeKt.m759height3ABfNKs(companion, Dp.m5115constructorimpl(2)), composer, 6);
            TopStatusKt.E(null, new a8(R.drawable.ic_home_battery, "34", null, valueOf, 4, null), null, null, null, false, 0L, null, composer, 0, 253);
            composer.endNode();
            TopStatusKt.E(null, new a8(R.drawable.ic_home_battery, ug.e.a(989898L, 0), null, valueOf, 4, null), null, null, null, false, 0L, null, composer, 0, 253);
            TopStatusKt.E(null, new a8(R.drawable.ic_home_membership_unlimited_badge, null, null, null, 14, null), null, null, null, false, 0L, f24333c, composer, 12582912, 125);
            MeasurePolicy columnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(arrangement.getTop(), companion2.getStart(), composer, 0);
            int currentCompositeKeyHash4 = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
            CompositionLocalMap currentCompositionLocalMap4 = composer.getCurrentCompositionLocalMap();
            Modifier materializeModifier4 = ComposedModifierKt.materializeModifier(composer, companion);
            x00.a<ComposeUiNode> constructor4 = companion3.getConstructor();
            if (composer.getApplier() == null) {
                ComposablesKt.invalidApplier();
            }
            composer.startReusableNode();
            if (composer.getInserting()) {
                composer.createNode(constructor4);
            } else {
                composer.useNode();
            }
            Composer m1951constructorimpl4 = Updater.m1951constructorimpl(composer);
            Updater.m1958setimpl(m1951constructorimpl4, columnMeasurePolicy2, companion3.getSetMeasurePolicy());
            Updater.m1958setimpl(m1951constructorimpl4, currentCompositionLocalMap4, companion3.getSetResolvedCompositionLocals());
            x00.p<ComposeUiNode, Integer, yz.g2> setCompositeKeyHash4 = companion3.getSetCompositeKeyHash();
            if (m1951constructorimpl4.getInserting() || !kotlin.jvm.internal.g0.g(m1951constructorimpl4.rememberedValue(), Integer.valueOf(currentCompositeKeyHash4))) {
                m1951constructorimpl4.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash4));
                m1951constructorimpl4.apply(Integer.valueOf(currentCompositeKeyHash4), setCompositeKeyHash4);
            }
            Updater.m1958setimpl(m1951constructorimpl4, materializeModifier4, companion3.getSetModifier());
            TopStatusKt.E(null, new a8(R.drawable.ic_home_coin, "999", null, null, 12, null), null, null, null, true, 0L, null, composer, 196608, R.styleable.Theme_drawable_share_close);
            TopStatusKt.E(null, new a8(R.drawable.ic_home_coin, "99999", null, null, 12, null), null, null, null, true, 0L, null, composer, 196608, R.styleable.Theme_drawable_share_close);
            TopStatusKt.E(null, new a8(R.drawable.ic_home_coin, "99999999", null, null, 12, null), null, null, null, true, 0L, null, composer, 196608, R.styleable.Theme_drawable_share_close);
            composer.endNode();
            composer.endNode();
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
    public final x00.p<Composer, Integer, yz.g2> f() {
        return f24332b;
    }

    @m80.k
    public final x00.p<Composer, Integer, yz.g2> g() {
        return f24334d;
    }

    @m80.k
    public final x00.q<Modifier, Composer, Integer, yz.g2> h() {
        return f24333c;
    }
}
