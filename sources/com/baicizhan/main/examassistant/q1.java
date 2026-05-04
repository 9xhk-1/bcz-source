package com.baicizhan.main.examassistant;

import a1.l;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.interaction.InteractionSourceKt;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.RowScopeInstance;
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
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.res.PainterResources_androidKt;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.text.style.TextOverflow;
import androidx.compose.ui.tooling.preview.Preview;
import androidx.compose.ui.tooling.preview.PreviewParameter;
import androidx.compose.ui.unit.Dp;
import com.airbnb.lottie.compose.LottieCancellationBehavior;
import com.baicizhan.main.examassistant.data.MarkedWord;
import com.jiongji.andriod.card.R;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@kotlin.jvm.internal.u0({"SMAP\nMarkedWordsActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MarkedWordsActivity.kt\ncom/baicizhan/main/examassistant/MarkedWordsActivityKt\n+ 2 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n+ 3 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 4 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 5 Composer.kt\nandroidx/compose/runtime/Updater\n+ 6 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 7 Row.kt\nandroidx/compose/foundation/layout/RowKt\n+ 8 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 9 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 10 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,359:1\n87#2:360\n84#2,9:361\n94#2:598\n79#3,6:370\n86#3,3:385\n89#3,2:394\n79#3,6:408\n86#3,3:423\n89#3,2:432\n79#3,6:453\n86#3,3:468\n89#3,2:477\n93#3:490\n79#3,6:509\n86#3,3:524\n89#3,2:533\n93#3:539\n93#3:543\n79#3,6:555\n86#3,3:570\n89#3,2:579\n93#3:592\n93#3:597\n347#4,9:376\n356#4:396\n347#4,9:414\n356#4:434\n347#4,9:459\n356#4:479\n357#4,2:488\n347#4,9:515\n356#4:535\n357#4,2:537\n357#4,2:541\n347#4,9:561\n356#4:581\n357#4,2:590\n357#4,2:595\n4206#5,6:388\n4206#5,6:426\n4206#5,6:471\n4206#5,6:527\n4206#5,6:573\n113#6:397\n113#6:435\n113#6:436\n113#6:486\n113#6:487\n113#6:492\n113#6:536\n113#6:582\n113#6:583\n113#6:594\n99#7:398\n96#7,9:399\n106#7:544\n99#7:545\n96#7,9:546\n106#7:593\n1247#8,6:437\n1247#8,6:480\n1247#8,6:493\n1247#8,6:584\n1247#8,6:601\n70#9:443\n67#9,9:444\n77#9:491\n70#9:499\n67#9,9:500\n77#9:540\n85#10:599\n85#10:600\n*S KotlinDebug\n*F\n+ 1 MarkedWordsActivity.kt\ncom/baicizhan/main/examassistant/MarkedWordsActivityKt\n*L\n266#1:360\n266#1:361,9\n266#1:598\n266#1:370,6\n266#1:385,3\n266#1:394,2\n273#1:408,6\n273#1:423,3\n273#1:432,2\n285#1:453,6\n285#1:468,3\n285#1:477,2\n285#1:490\n305#1:509,6\n305#1:524,3\n305#1:533,2\n305#1:539\n273#1:543\n320#1:555,6\n320#1:570,3\n320#1:579,2\n320#1:592\n266#1:597\n266#1:376,9\n266#1:396\n273#1:414,9\n273#1:434\n285#1:459,9\n285#1:479\n285#1:488,2\n305#1:515,9\n305#1:535\n305#1:537,2\n273#1:541,2\n320#1:561,9\n320#1:581\n320#1:590,2\n266#1:595,2\n266#1:388,6\n273#1:426,6\n285#1:471,6\n305#1:527,6\n320#1:573,6\n272#1:397\n281#1:435\n287#1:436\n298#1:486\n299#1:487\n307#1:492\n315#1:536\n328#1:582\n335#1:583\n340#1:594\n273#1:398\n273#1:399,9\n273#1:544\n320#1:545\n320#1:546,9\n320#1:593\n290#1:437,6\n296#1:480,6\n308#1:493,6\n336#1:584,6\n357#1:601,6\n285#1:443\n285#1:444,9\n285#1:491\n305#1:499\n305#1:500,9\n305#1:540\n259#1:599\n260#1:600\n*E\n"})
/* loaded from: classes4.dex */
public final class q1 {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public static final String f20611a = "MarkedWordsActivity";

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void k(final MarkedWord markedWord, final boolean z11, final boolean z12, final x00.a<yz.g2> aVar, x00.a<yz.g2> aVar2, final x00.a<yz.g2> aVar3, Composer composer, final int i11) {
        int i12;
        final x00.a<yz.g2> aVar4;
        int i13;
        long G;
        Composer startRestartGroup = composer.startRestartGroup(-2021167283);
        if ((i11 & 6) == 0) {
            i12 = ((i11 & 8) == 0 ? startRestartGroup.changed(markedWord) : startRestartGroup.changedInstance(markedWord) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= startRestartGroup.changed(z11) ? 32 : 16;
        }
        if ((i11 & 384) == 0) {
            i12 |= startRestartGroup.changed(z12) ? 256 : 128;
        }
        if ((i11 & 3072) == 0) {
            i12 |= startRestartGroup.changedInstance(aVar) ? 2048 : 1024;
        }
        if ((i11 & 24576) == 0) {
            i12 |= startRestartGroup.changedInstance(aVar2) ? 16384 : 8192;
        }
        if ((196608 & i11) == 0) {
            i12 |= startRestartGroup.changedInstance(aVar3) ? 131072 : 65536;
        }
        if (startRestartGroup.shouldExecute((74899 & i12) != 74898, i12 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-2021167283, i12, -1, "com.baicizhan.main.examassistant.MarkedWordItem (MarkedWordsActivity.kt:257)");
            }
            a1.i u11 = a1.s.u(l.e.a(l.e.b(R.raw.anim_audio_speaker)), null, null, null, null, null, startRestartGroup, 6, 62);
            final a1.g c11 = a1.a.c(l(u11), z12, false, null, 0.0f, Integer.MAX_VALUE, LottieCancellationBehavior.OnIterationFinish, false, startRestartGroup, ((i12 >> 3) & 112) | 1769472, 156);
            Modifier.Companion companion = Modifier.Companion;
            Modifier m730paddingqDBjuR0$default = PaddingKt.m730paddingqDBjuR0$default(BackgroundKt.m235backgroundbw27NRU$default(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), bk.b.A0(), null, 2, null), bk.d.c(), 0.0f, 0.0f, 0.0f, 14, null);
            Arrangement arrangement = Arrangement.INSTANCE;
            Arrangement.Vertical top = arrangement.getTop();
            Alignment.Companion companion2 = Alignment.Companion;
            MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(top, companion2.getStart(), startRestartGroup, 0);
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
            Modifier materializeModifier = ComposedModifierKt.materializeModifier(startRestartGroup, m730paddingqDBjuR0$default);
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
            Updater.m1958setimpl(m1951constructorimpl, columnMeasurePolicy, companion3.getSetMeasurePolicy());
            Updater.m1958setimpl(m1951constructorimpl, currentCompositionLocalMap, companion3.getSetResolvedCompositionLocals());
            x00.p<ComposeUiNode, Integer, yz.g2> setCompositeKeyHash = companion3.getSetCompositeKeyHash();
            if (m1951constructorimpl.getInserting() || !kotlin.jvm.internal.g0.g(m1951constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                m1951constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                m1951constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m1958setimpl(m1951constructorimpl, materializeModifier, companion3.getSetModifier());
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            float f11 = 6;
            SpacerKt.Spacer(SizeKt.m759height3ABfNKs(companion, Dp.m5115constructorimpl(f11)), startRestartGroup, 6);
            Modifier fillMaxWidth = SizeKt.fillMaxWidth(companion, 1.0f);
            MeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(arrangement.getStart(), companion2.getTop(), startRestartGroup, 0);
            int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap2 = startRestartGroup.getCurrentCompositionLocalMap();
            Modifier materializeModifier2 = ComposedModifierKt.materializeModifier(startRestartGroup, fillMaxWidth);
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
            Updater.m1958setimpl(m1951constructorimpl2, rowMeasurePolicy, companion3.getSetMeasurePolicy());
            Updater.m1958setimpl(m1951constructorimpl2, currentCompositionLocalMap2, companion3.getSetResolvedCompositionLocals());
            x00.p<ComposeUiNode, Integer, yz.g2> setCompositeKeyHash2 = companion3.getSetCompositeKeyHash();
            if (m1951constructorimpl2.getInserting() || !kotlin.jvm.internal.g0.g(m1951constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                m1951constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                m1951constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
            }
            Updater.m1958setimpl(m1951constructorimpl2, materializeModifier2, companion3.getSetModifier());
            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
            String o11 = markedWord.o();
            MaterialTheme materialTheme = MaterialTheme.INSTANCE;
            int i14 = MaterialTheme.$stable;
            TextStyle m4572copyp1EtxEg$default = TextStyle.m4572copyp1EtxEg$default(materialTheme.getTypography(startRestartGroup, i14).getH4(), bk.b.A(materialTheme.getColors(startRestartGroup, i14)), 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, 0, 0, 0L, null, null, null, 0, 0, null, 16777214, null);
            TextOverflow.Companion companion4 = TextOverflow.Companion;
            TextKt.m1845Text4IGK_g(o11, SizeKt.m777sizeInqDBjuR0$default(rowScopeInstance.align(companion, companion2.getCenterVertically()), 0.0f, 0.0f, Dp.m5115constructorimpl(240), 0.0f, 11, null), 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, companion4.m5029getEllipsisgIe3tQ8(), false, 1, 0, (x00.l<? super TextLayoutResult, yz.g2>) null, m4572copyp1EtxEg$default, startRestartGroup, 0, 3120, 55292);
            Composer composer2 = startRestartGroup;
            if (markedWord.j().length() > 0) {
                composer2.startReplaceGroup(129731774);
                Modifier m730paddingqDBjuR0$default2 = PaddingKt.m730paddingqDBjuR0$default(rowScopeInstance.align(companion, companion2.getCenterVertically()), Dp.m5115constructorimpl(f11), 0.0f, 0.0f, 0.0f, 14, null);
                MutableInteractionSource MutableInteractionSource = InteractionSourceKt.MutableInteractionSource();
                boolean z13 = (i12 & 7168) == 2048;
                Object rememberedValue = composer2.rememberedValue();
                if (z13 || rememberedValue == Composer.Companion.getEmpty()) {
                    rememberedValue = new x00.a() { // from class: com.baicizhan.main.examassistant.l1
                        @Override // x00.a
                        public final Object invoke() {
                            yz.g2 n11;
                            n11 = q1.n(x00.a.this);
                            return n11;
                        }
                    };
                    composer2.updateRememberedValue(rememberedValue);
                }
                Modifier m267clickableO2vRcR0$default = ClickableKt.m267clickableO2vRcR0$default(m730paddingqDBjuR0$default2, MutableInteractionSource, null, false, null, null, (x00.a) rememberedValue, 28, null);
                MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(companion2.getTopStart(), false);
                int currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                CompositionLocalMap currentCompositionLocalMap3 = composer2.getCurrentCompositionLocalMap();
                Modifier materializeModifier3 = ComposedModifierKt.materializeModifier(composer2, m267clickableO2vRcR0$default);
                x00.a<ComposeUiNode> constructor3 = companion3.getConstructor();
                if (composer2.getApplier() == null) {
                    ComposablesKt.invalidApplier();
                }
                composer2.startReusableNode();
                if (composer2.getInserting()) {
                    composer2.createNode(constructor3);
                } else {
                    composer2.useNode();
                }
                Composer m1951constructorimpl3 = Updater.m1951constructorimpl(composer2);
                Updater.m1958setimpl(m1951constructorimpl3, maybeCachedBoxMeasurePolicy, companion3.getSetMeasurePolicy());
                Updater.m1958setimpl(m1951constructorimpl3, currentCompositionLocalMap3, companion3.getSetResolvedCompositionLocals());
                x00.p<ComposeUiNode, Integer, yz.g2> setCompositeKeyHash3 = companion3.getSetCompositeKeyHash();
                if (m1951constructorimpl3.getInserting() || !kotlin.jvm.internal.g0.g(m1951constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                    m1951constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                    m1951constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
                }
                Updater.m1958setimpl(m1951constructorimpl3, materializeModifier3, companion3.getSetModifier());
                BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                com.airbnb.lottie.k l11 = l(u11);
                boolean changed = composer2.changed(c11);
                Object rememberedValue2 = composer2.rememberedValue();
                if (changed || rememberedValue2 == Composer.Companion.getEmpty()) {
                    rememberedValue2 = new x00.a() { // from class: com.baicizhan.main.examassistant.m1
                        @Override // x00.a
                        public final Object invoke() {
                            float o12;
                            o12 = q1.o(a1.g.this);
                            return Float.valueOf(o12);
                        }
                    };
                    composer2.updateRememberedValue(rememberedValue2);
                }
                a1.f.c(l11, (x00.a) rememberedValue2, SizeKt.m773size3ABfNKs(PaddingKt.m726padding3ABfNKs(companion, Dp.m5115constructorimpl(f11)), Dp.m5115constructorimpl(24)), false, false, false, null, false, null, null, null, false, composer2, 384, 0, 4088);
                composer2 = composer2;
                composer2.endNode();
            } else {
                composer2.startReplaceGroup(-286113541);
            }
            composer2.endReplaceGroup();
            SpacerKt.Spacer(RowScope.weight$default(rowScopeInstance, companion, 1.0f, false, 2, null), composer2, 0);
            Modifier m730paddingqDBjuR0$default3 = PaddingKt.m730paddingqDBjuR0$default(rowScopeInstance.align(companion, companion2.getCenterVertically()), 0.0f, 0.0f, Dp.m5115constructorimpl(10), 0.0f, 11, null);
            MutableInteractionSource MutableInteractionSource2 = InteractionSourceKt.MutableInteractionSource();
            boolean z14 = (458752 & i12) == 131072;
            Object rememberedValue3 = composer2.rememberedValue();
            if (z14 || rememberedValue3 == Composer.Companion.getEmpty()) {
                rememberedValue3 = new x00.a() { // from class: com.baicizhan.main.examassistant.n1
                    @Override // x00.a
                    public final Object invoke() {
                        yz.g2 p11;
                        p11 = q1.p(x00.a.this);
                        return p11;
                    }
                };
                composer2.updateRememberedValue(rememberedValue3);
            }
            Modifier m267clickableO2vRcR0$default2 = ClickableKt.m267clickableO2vRcR0$default(m730paddingqDBjuR0$default3, MutableInteractionSource2, null, false, null, null, (x00.a) rememberedValue3, 28, null);
            MeasurePolicy maybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(companion2.getTopStart(), false);
            int currentCompositeKeyHash4 = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
            CompositionLocalMap currentCompositionLocalMap4 = composer2.getCurrentCompositionLocalMap();
            Modifier materializeModifier4 = ComposedModifierKt.materializeModifier(composer2, m267clickableO2vRcR0$default2);
            x00.a<ComposeUiNode> constructor4 = companion3.getConstructor();
            if (composer2.getApplier() == null) {
                ComposablesKt.invalidApplier();
            }
            composer2.startReusableNode();
            if (composer2.getInserting()) {
                composer2.createNode(constructor4);
            } else {
                composer2.useNode();
            }
            Composer m1951constructorimpl4 = Updater.m1951constructorimpl(composer2);
            Updater.m1958setimpl(m1951constructorimpl4, maybeCachedBoxMeasurePolicy2, companion3.getSetMeasurePolicy());
            Updater.m1958setimpl(m1951constructorimpl4, currentCompositionLocalMap4, companion3.getSetResolvedCompositionLocals());
            x00.p<ComposeUiNode, Integer, yz.g2> setCompositeKeyHash4 = companion3.getSetCompositeKeyHash();
            if (m1951constructorimpl4.getInserting() || !kotlin.jvm.internal.g0.g(m1951constructorimpl4.rememberedValue(), Integer.valueOf(currentCompositeKeyHash4))) {
                m1951constructorimpl4.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash4));
                m1951constructorimpl4.apply(Integer.valueOf(currentCompositeKeyHash4), setCompositeKeyHash4);
            }
            Updater.m1958setimpl(m1951constructorimpl4, materializeModifier4, companion3.getSetModifier());
            BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
            Painter painterResource = PainterResources_androidKt.painterResource(R.drawable.ic_word_favorite, composer2, 6);
            ColorFilter.Companion companion5 = ColorFilter.Companion;
            if (z11) {
                composer2.startReplaceGroup(-1266324908);
                i13 = i14;
                G = materialTheme.getColors(composer2, i13).m1600getPrimary0d7_KjU();
            } else {
                i13 = i14;
                composer2.startReplaceGroup(-1266323821);
                G = bk.b.G(materialTheme.getColors(composer2, i13));
            }
            composer2.endReplaceGroup();
            ColorFilter m2550tintxETnrds$default = ColorFilter.Companion.m2550tintxETnrds$default(companion5, G, 0, 2, null);
            Composer composer3 = composer2;
            int i15 = i13;
            ImageKt.Image(painterResource, "favorite", PaddingKt.m726padding3ABfNKs(companion, Dp.m5115constructorimpl(f11)), (Alignment) null, (ContentScale) null, 0.0f, m2550tintxETnrds$default, composer3, 432, 56);
            composer3.endNode();
            composer3.endNode();
            Modifier fillMaxWidth2 = SizeKt.fillMaxWidth(companion, 1.0f);
            MeasurePolicy rowMeasurePolicy2 = RowKt.rowMeasurePolicy(arrangement.getStart(), companion2.getTop(), composer3, 0);
            int currentCompositeKeyHash5 = ComposablesKt.getCurrentCompositeKeyHash(composer3, 0);
            CompositionLocalMap currentCompositionLocalMap5 = composer3.getCurrentCompositionLocalMap();
            Modifier materializeModifier5 = ComposedModifierKt.materializeModifier(composer3, fillMaxWidth2);
            x00.a<ComposeUiNode> constructor5 = companion3.getConstructor();
            if (composer3.getApplier() == null) {
                ComposablesKt.invalidApplier();
            }
            composer3.startReusableNode();
            if (composer3.getInserting()) {
                composer3.createNode(constructor5);
            } else {
                composer3.useNode();
            }
            Composer m1951constructorimpl5 = Updater.m1951constructorimpl(composer3);
            Updater.m1958setimpl(m1951constructorimpl5, rowMeasurePolicy2, companion3.getSetMeasurePolicy());
            Updater.m1958setimpl(m1951constructorimpl5, currentCompositionLocalMap5, companion3.getSetResolvedCompositionLocals());
            x00.p<ComposeUiNode, Integer, yz.g2> setCompositeKeyHash5 = companion3.getSetCompositeKeyHash();
            if (m1951constructorimpl5.getInserting() || !kotlin.jvm.internal.g0.g(m1951constructorimpl5.rememberedValue(), Integer.valueOf(currentCompositeKeyHash5))) {
                m1951constructorimpl5.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash5));
                m1951constructorimpl5.apply(Integer.valueOf(currentCompositeKeyHash5), setCompositeKeyHash5);
            }
            Updater.m1958setimpl(m1951constructorimpl5, materializeModifier5, companion3.getSetModifier());
            TextKt.m1845Text4IGK_g(markedWord.l(), rowScopeInstance.align(SizeKt.m777sizeInqDBjuR0$default(companion, 0.0f, 0.0f, Dp.m5115constructorimpl(260), 0.0f, 11, null), companion2.getCenterVertically()), bk.b.C(materialTheme.getColors(composer3, i15)), bk.d.k(), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, companion4.m5029getEllipsisgIe3tQ8(), false, 1, 0, (x00.l<? super TextLayoutResult, yz.g2>) null, (TextStyle) null, composer3, 3072, 3120, 120816);
            startRestartGroup = composer3;
            SpacerKt.Spacer(RowScope.weight$default(rowScopeInstance, companion, 1.0f, false, 2, null), startRestartGroup, 0);
            Modifier m730paddingqDBjuR0$default4 = PaddingKt.m730paddingqDBjuR0$default(rowScopeInstance.align(companion, companion2.getCenterVertically()), 0.0f, 0.0f, Dp.m5115constructorimpl(12), 0.0f, 11, null);
            boolean z15 = (57344 & i12) == 16384;
            Object rememberedValue4 = startRestartGroup.rememberedValue();
            if (z15 || rememberedValue4 == Composer.Companion.getEmpty()) {
                aVar4 = aVar2;
                rememberedValue4 = new x00.a() { // from class: com.baicizhan.main.examassistant.o1
                    @Override // x00.a
                    public final Object invoke() {
                        yz.g2 q11;
                        q11 = q1.q(x00.a.this);
                        return q11;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue4);
            } else {
                aVar4 = aVar2;
            }
            l3.c(m730paddingqDBjuR0$default4, (x00.a) rememberedValue4, startRestartGroup, 0, 0);
            startRestartGroup.endNode();
            SpacerKt.Spacer(SizeKt.m759height3ABfNKs(companion, Dp.m5115constructorimpl(8)), startRestartGroup, 6);
            startRestartGroup.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            aVar4 = aVar2;
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            final x00.a<yz.g2> aVar5 = aVar4;
            endRestartGroup.updateScope(new x00.p() { // from class: com.baicizhan.main.examassistant.p1
                @Override // x00.p
                public final Object invoke(Object obj, Object obj2) {
                    yz.g2 r11;
                    r11 = q1.r(MarkedWord.this, z11, z12, aVar, aVar5, aVar3, i11, (Composer) obj, ((Integer) obj2).intValue());
                    return r11;
                }
            });
        }
    }

    public static final com.airbnb.lottie.k l(a1.i iVar) {
        return iVar.getValue();
    }

    public static final float m(a1.g gVar) {
        return gVar.getValue().floatValue();
    }

    public static final yz.g2 n(x00.a aVar) {
        aVar.invoke();
        return yz.g2.f100423a;
    }

    public static final float o(a1.g gVar) {
        return m(gVar);
    }

    public static final yz.g2 p(x00.a aVar) {
        aVar.invoke();
        return yz.g2.f100423a;
    }

    public static final yz.g2 q(x00.a aVar) {
        aVar.invoke();
        return yz.g2.f100423a;
    }

    public static final yz.g2 r(MarkedWord markedWord, boolean z11, boolean z12, x00.a aVar, x00.a aVar2, x00.a aVar3, int i11, Composer composer, int i12) {
        k(markedWord, z11, z12, aVar, aVar2, aVar3, composer, RecomposeScopeImplKt.updateChangedFlags(i11 | 1));
        return yz.g2.f100423a;
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    @Preview(backgroundColor = 16777215, showBackground = true)
    public static final void s(@PreviewParameter(provider = z.class) final MarkedWord markedWord, Composer composer, final int i11) {
        int i12;
        Composer startRestartGroup = composer.startRestartGroup(-842970089);
        if ((i11 & 6) == 0) {
            i12 = ((i11 & 8) == 0 ? startRestartGroup.changed(markedWord) : startRestartGroup.changedInstance(markedWord) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if (startRestartGroup.shouldExecute((i12 & 3) != 2, i12 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-842970089, i12, -1, "com.baicizhan.main.examassistant.MarkedWordItemPreview (MarkedWordsActivity.kt:354)");
            }
            bk.k.e(null, null, null, ComposableLambdaKt.rememberComposableLambda(1239103979, true, new x00.p() { // from class: com.baicizhan.main.examassistant.j1
                @Override // x00.p
                public final Object invoke(Object obj, Object obj2) {
                    yz.g2 t11;
                    t11 = q1.t(MarkedWord.this, (Composer) obj, ((Integer) obj2).intValue());
                    return t11;
                }
            }, startRestartGroup, 54), startRestartGroup, 3072, 7);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new x00.p() { // from class: com.baicizhan.main.examassistant.k1
                @Override // x00.p
                public final Object invoke(Object obj, Object obj2) {
                    yz.g2 x11;
                    x11 = q1.x(MarkedWord.this, i11, (Composer) obj, ((Integer) obj2).intValue());
                    return x11;
                }
            });
        }
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final yz.g2 t(MarkedWord markedWord, Composer composer, int i11) {
        if (composer.shouldExecute((i11 & 3) != 2, i11 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1239103979, i11, -1, "com.baicizhan.main.examassistant.MarkedWordItemPreview.<anonymous> (MarkedWordsActivity.kt:356)");
            }
            boolean z11 = markedWord.n() % 2 == 0;
            Object rememberedValue = composer.rememberedValue();
            Composer.Companion companion = Composer.Companion;
            if (rememberedValue == companion.getEmpty()) {
                rememberedValue = new x00.a() { // from class: com.baicizhan.main.examassistant.g1
                    @Override // x00.a
                    public final Object invoke() {
                        yz.g2 u11;
                        u11 = q1.u();
                        return u11;
                    }
                };
                composer.updateRememberedValue(rememberedValue);
            }
            x00.a aVar = (x00.a) rememberedValue;
            Object rememberedValue2 = composer.rememberedValue();
            if (rememberedValue2 == companion.getEmpty()) {
                rememberedValue2 = new x00.a() { // from class: com.baicizhan.main.examassistant.h1
                    @Override // x00.a
                    public final Object invoke() {
                        yz.g2 v11;
                        v11 = q1.v();
                        return v11;
                    }
                };
                composer.updateRememberedValue(rememberedValue2);
            }
            x00.a aVar2 = (x00.a) rememberedValue2;
            Object rememberedValue3 = composer.rememberedValue();
            if (rememberedValue3 == companion.getEmpty()) {
                rememberedValue3 = new x00.a() { // from class: com.baicizhan.main.examassistant.i1
                    @Override // x00.a
                    public final Object invoke() {
                        yz.g2 w11;
                        w11 = q1.w();
                        return w11;
                    }
                };
                composer.updateRememberedValue(rememberedValue3);
            }
            k(markedWord, z11, false, aVar, aVar2, (x00.a) rememberedValue3, composer, 224640);
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

    public static final yz.g2 x(MarkedWord markedWord, int i11, Composer composer, int i12) {
        s(markedWord, composer, RecomposeScopeImplKt.updateChangedFlags(i11 | 1));
        return yz.g2.f100423a;
    }
}
