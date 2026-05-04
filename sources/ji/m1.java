package ji;

import android.content.Context;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.ScrollKt;
import androidx.compose.foundation.ScrollState;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.shape.CornerBasedShape;
import androidx.compose.material.MaterialTheme;
import androidx.compose.material.TextKt;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.res.PainterResources_androidKt;
import androidx.compose.ui.res.StringResources_androidKt;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.text.style.TextOverflow;
import androidx.compose.ui.tooling.preview.Preview;
import androidx.compose.ui.unit.Dp;
import coil.request.ImageRequest;
import com.baicizhan.main.vld.model.VocabularyDeviceInfo;
import com.baicizhan.platform.base.widget.WidgetsKt;
import com.baicizhan.platform.base.widget.s4;
import com.jiongji.andriod.card.R;
import java.util.Iterator;
import java.util.List;
import yg.i2;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@kotlin.jvm.internal.u0({"SMAP\nDeviceManagementActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DeviceManagementActivity.kt\ncom/baicizhan/main/vld/DeviceManagementActivityKt\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 3 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n+ 4 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 5 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 6 Composer.kt\nandroidx/compose/runtime/Updater\n+ 7 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 8 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 9 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 10 Row.kt\nandroidx/compose/foundation/layout/RowKt\n+ 11 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n*L\n1#1,347:1\n1247#2,6:348\n1247#2,6:435\n1247#2,6:690\n1247#2,6:709\n1247#2,6:715\n87#3:354\n84#3,9:355\n94#3:395\n87#3:396\n84#3,9:397\n87#3:478\n84#3,9:479\n94#3:519\n94#3:527\n87#3:528\n84#3,9:529\n87#3:645\n84#3,9:646\n94#3:686\n94#3:708\n79#4,6:364\n86#4,3:379\n89#4,2:388\n93#4:394\n79#4,6:406\n86#4,3:421\n89#4,2:430\n79#4,6:451\n86#4,3:466\n89#4,2:475\n79#4,6:488\n86#4,3:503\n89#4,2:512\n93#4:518\n93#4:522\n93#4:526\n79#4,6:538\n86#4,3:553\n89#4,2:562\n79#4,6:577\n86#4,3:592\n89#4,2:601\n79#4,6:615\n86#4,3:630\n89#4,2:639\n79#4,6:655\n86#4,3:670\n89#4,2:679\n93#4:685\n93#4:698\n93#4:702\n93#4:707\n347#5,9:370\n356#5:390\n357#5,2:392\n347#5,9:412\n356#5:432\n347#5,9:457\n356#5:477\n347#5,9:494\n356#5:514\n357#5,2:516\n357#5,2:520\n357#5,2:524\n347#5,9:544\n356#5:564\n347#5,9:583\n356#5:603\n347#5,9:621\n356#5:641\n347#5,9:661\n356#5:681\n357#5,2:683\n357#5,2:696\n357#5,2:700\n357#5,2:705\n4206#6,6:382\n4206#6,6:424\n4206#6,6:469\n4206#6,6:506\n4206#6,6:556\n4206#6,6:595\n4206#6,6:633\n4206#6,6:673\n113#7:391\n113#7:433\n113#7:434\n113#7:515\n113#7:566\n113#7:604\n113#7:643\n113#7:644\n113#7:682\n113#7:687\n113#7:688\n113#7:689\n70#8:441\n67#8,9:442\n77#8:523\n70#8:567\n67#8,9:568\n77#8:703\n1869#9:565\n1870#9:704\n99#10:605\n96#10,9:606\n106#10:699\n75#11:642\n*S KotlinDebug\n*F\n+ 1 DeviceManagementActivity.kt\ncom/baicizhan/main/vld/DeviceManagementActivityKt\n*L\n187#1:348,6\n245#1:435,6\n308#1:690,6\n191#1:709,6\n209#1:715,6\n223#1:354\n223#1:355,9\n223#1:395\n237#1:396\n237#1:397,9\n248#1:478\n248#1:479,9\n248#1:519\n237#1:527\n268#1:528\n268#1:529,9\n287#1:645\n287#1:646,9\n287#1:686\n268#1:708\n223#1:364,6\n223#1:379,3\n223#1:388,2\n223#1:394\n237#1:406,6\n237#1:421,3\n237#1:430,2\n239#1:451,6\n239#1:466,3\n239#1:475,2\n248#1:488,6\n248#1:503,3\n248#1:512,2\n248#1:518\n239#1:522\n237#1:526\n268#1:538,6\n268#1:553,3\n268#1:562,2\n271#1:577,6\n271#1:592,3\n271#1:601,2\n277#1:615,6\n277#1:630,3\n277#1:639,2\n287#1:655,6\n287#1:670,3\n287#1:679,2\n287#1:685\n277#1:698\n271#1:702\n268#1:707\n223#1:370,9\n223#1:390\n223#1:392,2\n237#1:412,9\n237#1:432\n239#1:457,9\n239#1:477\n248#1:494,9\n248#1:514\n248#1:516,2\n239#1:520,2\n237#1:524,2\n268#1:544,9\n268#1:564\n271#1:583,9\n271#1:603\n277#1:621,9\n277#1:641\n287#1:661,9\n287#1:681\n287#1:683,2\n277#1:696,2\n271#1:700,2\n268#1:705,2\n223#1:382,6\n237#1:424,6\n239#1:469,6\n248#1:506,6\n268#1:556,6\n271#1:595,6\n277#1:633,6\n287#1:673,6\n229#1:391\n242#1:433\n243#1:434\n258#1:515\n274#1:566\n277#1:604\n282#1:643\n290#1:644\n302#1:682\n312#1:687\n315#1:688\n316#1:689\n239#1:441\n239#1:442,9\n239#1:523\n271#1:567\n271#1:568,9\n271#1:703\n270#1:565\n270#1:704\n277#1:605\n277#1:606,9\n277#1:699\n279#1:642\n*E\n"})
/* loaded from: classes4.dex */
public final class m1 {
    public static final g2 A(MutableState mutableState, MutableState mutableState2, List list, x00.a aVar, x00.l lVar, x00.a aVar2, int i11, int i12, Composer composer, int i13) {
        t(mutableState, mutableState2, list, aVar, lVar, aVar2, composer, RecomposeScopeImplKt.updateChangedFlags(i11 | 1), i12);
        return g2.f100423a;
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void B(final List<VocabularyDeviceInfo> list, final x00.a<g2> aVar, final x00.l<? super VocabularyDeviceInfo, g2> lVar, Composer composer, final int i11) {
        int i12;
        Composer startRestartGroup = composer.startRestartGroup(-508032625);
        if ((i11 & 6) == 0) {
            i12 = (startRestartGroup.changedInstance(list) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= startRestartGroup.changedInstance(aVar) ? 32 : 16;
        }
        if ((i11 & 384) == 0) {
            i12 |= startRestartGroup.changedInstance(lVar) ? 256 : 128;
        }
        if (startRestartGroup.shouldExecute((i12 & 147) != 146, i12 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-508032625, i12, -1, "com.baicizhan.main.vld.DevicesList (DeviceManagementActivity.kt:220)");
            }
            ScrollState rememberScrollState = ScrollKt.rememberScrollState(0, startRestartGroup, 0, 1);
            Modifier.Companion companion = Modifier.Companion;
            Modifier verticalScroll$default = ScrollKt.verticalScroll$default(SizeKt.fillMaxHeight$default(companion, 0.0f, 1, null), rememberScrollState, false, null, false, 14, null);
            MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.Companion.getStart(), startRestartGroup, 0);
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
            Modifier materializeModifier = ComposedModifierKt.materializeModifier(startRestartGroup, verticalScroll$default);
            ComposeUiNode.Companion companion2 = ComposeUiNode.Companion;
            x00.a<ComposeUiNode> constructor = companion2.getConstructor();
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
            Updater.m1958setimpl(m1951constructorimpl, columnMeasurePolicy, companion2.getSetMeasurePolicy());
            Updater.m1958setimpl(m1951constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
            x00.p<ComposeUiNode, Integer, g2> setCompositeKeyHash = companion2.getSetCompositeKeyHash();
            if (m1951constructorimpl.getInserting() || !kotlin.jvm.internal.g0.g(m1951constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                m1951constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                m1951constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m1958setimpl(m1951constructorimpl, materializeModifier, companion2.getSetModifier());
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            int i13 = i12 >> 3;
            D(aVar, startRestartGroup, i13 & 14);
            SpacerKt.Spacer(SizeKt.m759height3ABfNKs(companion, Dp.m5115constructorimpl(20)), startRestartGroup, 6);
            o(list, lVar, startRestartGroup, (i12 & 14) | (i13 & 112));
            startRestartGroup.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new x00.p() { // from class: ji.l1
                @Override // x00.p
                public final Object invoke(Object obj, Object obj2) {
                    g2 C;
                    C = m1.C(list, aVar, lVar, i11, (Composer) obj, ((Integer) obj2).intValue());
                    return C;
                }
            });
        }
    }

    public static final g2 C(List list, x00.a aVar, x00.l lVar, int i11, Composer composer, int i12) {
        B(list, aVar, lVar, composer, RecomposeScopeImplKt.updateChangedFlags(i11 | 1));
        return g2.f100423a;
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void D(final x00.a<g2> aVar, Composer composer, final int i11) {
        int i12;
        Composer startRestartGroup = composer.startRestartGroup(2619254);
        if ((i11 & 6) == 0) {
            i12 = (startRestartGroup.changedInstance(aVar) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if (startRestartGroup.shouldExecute((i12 & 3) != 2, i12 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(2619254, i12, -1, "com.baicizhan.main.vld.ScanCard (DeviceManagementActivity.kt:235)");
            }
            Modifier.Companion companion = Modifier.Companion;
            Modifier m726padding3ABfNKs = PaddingKt.m726padding3ABfNKs(companion, bk.d.b());
            Arrangement arrangement = Arrangement.INSTANCE;
            Arrangement.Vertical top = arrangement.getTop();
            Alignment.Companion companion2 = Alignment.Companion;
            MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(top, companion2.getStart(), startRestartGroup, 0);
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
            Modifier materializeModifier = ComposedModifierKt.materializeModifier(startRestartGroup, m726padding3ABfNKs);
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
            x00.p<ComposeUiNode, Integer, g2> setCompositeKeyHash = companion3.getSetCompositeKeyHash();
            if (m1951constructorimpl.getInserting() || !kotlin.jvm.internal.g0.g(m1951constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                m1951constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                m1951constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m1958setimpl(m1951constructorimpl, materializeModifier, companion3.getSetModifier());
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            WidgetsKt.K(null, StringResources_androidKt.stringResource(R.string.devices_management_add_title, startRestartGroup, 6), StringResources_androidKt.stringResource(R.string.devices_management_add_tip, startRestartGroup, 6), startRestartGroup, 0, 1);
            Modifier m759height3ABfNKs = SizeKt.m759height3ABfNKs(PaddingKt.m730paddingqDBjuR0$default(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), 0.0f, Dp.m5115constructorimpl(20), 0.0f, 0.0f, 13, null), Dp.m5115constructorimpl(90));
            long A0 = bk.b.A0();
            MaterialTheme materialTheme = MaterialTheme.INSTANCE;
            int i13 = MaterialTheme.$stable;
            Modifier m234backgroundbw27NRU = BackgroundKt.m234backgroundbw27NRU(m759height3ABfNKs, A0, materialTheme.getShapes(startRestartGroup, i13).getSmall());
            boolean z11 = (i12 & 14) == 4;
            Object rememberedValue = startRestartGroup.rememberedValue();
            if (z11 || rememberedValue == Composer.Companion.getEmpty()) {
                rememberedValue = new x00.a() { // from class: ji.y0
                    @Override // x00.a
                    public final Object invoke() {
                        g2 E;
                        E = m1.E(x00.a.this);
                        return E;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            Modifier m269clickableXHw0xAI$default = ClickableKt.m269clickableXHw0xAI$default(m234backgroundbw27NRU, false, null, null, (x00.a) rememberedValue, 7, null);
            MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(companion2.getTopStart(), false);
            int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap2 = startRestartGroup.getCurrentCompositionLocalMap();
            Modifier materializeModifier2 = ComposedModifierKt.materializeModifier(startRestartGroup, m269clickableXHw0xAI$default);
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
            Updater.m1958setimpl(m1951constructorimpl2, maybeCachedBoxMeasurePolicy, companion3.getSetMeasurePolicy());
            Updater.m1958setimpl(m1951constructorimpl2, currentCompositionLocalMap2, companion3.getSetResolvedCompositionLocals());
            x00.p<ComposeUiNode, Integer, g2> setCompositeKeyHash2 = companion3.getSetCompositeKeyHash();
            if (m1951constructorimpl2.getInserting() || !kotlin.jvm.internal.g0.g(m1951constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                m1951constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                m1951constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
            }
            Updater.m1958setimpl(m1951constructorimpl2, materializeModifier2, companion3.getSetModifier());
            Modifier align = BoxScopeInstance.INSTANCE.align(companion, companion2.getCenter());
            MeasurePolicy columnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(arrangement.getTop(), companion2.getStart(), startRestartGroup, 0);
            int currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap3 = startRestartGroup.getCurrentCompositionLocalMap();
            Modifier materializeModifier3 = ComposedModifierKt.materializeModifier(startRestartGroup, align);
            x00.a<ComposeUiNode> constructor3 = companion3.getConstructor();
            if (startRestartGroup.getApplier() == null) {
                ComposablesKt.invalidApplier();
            }
            startRestartGroup.startReusableNode();
            if (startRestartGroup.getInserting()) {
                startRestartGroup.createNode(constructor3);
            } else {
                startRestartGroup.useNode();
            }
            Composer m1951constructorimpl3 = Updater.m1951constructorimpl(startRestartGroup);
            Updater.m1958setimpl(m1951constructorimpl3, columnMeasurePolicy2, companion3.getSetMeasurePolicy());
            Updater.m1958setimpl(m1951constructorimpl3, currentCompositionLocalMap3, companion3.getSetResolvedCompositionLocals());
            x00.p<ComposeUiNode, Integer, g2> setCompositeKeyHash3 = companion3.getSetCompositeKeyHash();
            if (m1951constructorimpl3.getInserting() || !kotlin.jvm.internal.g0.g(m1951constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                m1951constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                m1951constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
            }
            Updater.m1958setimpl(m1951constructorimpl3, materializeModifier3, companion3.getSetModifier());
            ImageKt.Image(PainterResources_androidKt.painterResource(R.drawable.ic_my_tab_scan, startRestartGroup, 6), "scan", columnScopeInstance.align(companion, companion2.getCenterHorizontally()), (Alignment) null, (ContentScale) null, 0.0f, ColorFilter.Companion.m2550tintxETnrds$default(ColorFilter.Companion, bk.b.A(materialTheme.getColors(startRestartGroup, i13)), 0, 2, null), startRestartGroup, 48, 56);
            TextKt.m1845Text4IGK_g(StringResources_androidKt.stringResource(R.string.devices_management_add_scan, startRestartGroup, 6), PaddingKt.m730paddingqDBjuR0$default(companion, 0.0f, Dp.m5115constructorimpl(6), 0.0f, 0.0f, 13, null), 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (x00.l<? super TextLayoutResult, g2>) null, TextStyle.m4572copyp1EtxEg$default(materialTheme.getTypography(startRestartGroup, i13).getSubtitle2(), bk.b.A(materialTheme.getColors(startRestartGroup, i13)), 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, 0, 0, 0L, null, null, null, 0, 0, null, 16777214, null), startRestartGroup, 48, 0, 65532);
            startRestartGroup = startRestartGroup;
            startRestartGroup.endNode();
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
            endRestartGroup.updateScope(new x00.p() { // from class: ji.d1
                @Override // x00.p
                public final Object invoke(Object obj, Object obj2) {
                    g2 F;
                    F = m1.F(x00.a.this, i11, (Composer) obj, ((Integer) obj2).intValue());
                    return F;
                }
            });
        }
    }

    public static final g2 E(x00.a aVar) {
        aVar.invoke();
        return g2.f100423a;
    }

    public static final g2 F(x00.a aVar, int i11, Composer composer, int i12) {
        D(aVar, composer, RecomposeScopeImplKt.updateChangedFlags(i11 | 1));
        return g2.f100423a;
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    @Preview(backgroundColor = 4294967295L)
    public static final void G(@m80.l Composer composer, final int i11) {
        Composer startRestartGroup = composer.startRestartGroup(-1502573242);
        if (startRestartGroup.shouldExecute(i11 != 0, i11 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1502573242, i11, -1, "com.baicizhan.main.vld.ScanCardPreview (DeviceManagementActivity.kt:326)");
            }
            bk.k.e(null, null, null, k.f64147a.e(), startRestartGroup, 3072, 7);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new x00.p() { // from class: ji.z0
                @Override // x00.p
                public final Object invoke(Object obj, Object obj2) {
                    g2 H;
                    H = m1.H(i11, (Composer) obj, ((Integer) obj2).intValue());
                    return H;
                }
            });
        }
    }

    public static final g2 H(int i11, Composer composer, int i12) {
        G(composer, RecomposeScopeImplKt.updateChangedFlags(i11 | 1));
        return g2.f100423a;
    }

    /* JADX WARN: Type inference failed for: r14v0 */
    /* JADX WARN: Type inference failed for: r14v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r14v7 */
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void o(final List<VocabularyDeviceInfo> list, x00.l<? super VocabularyDeviceInfo, g2> lVar, Composer composer, final int i11) {
        int i12;
        final x00.l<? super VocabularyDeviceInfo, g2> lVar2;
        Composer composer2;
        final x00.l<? super VocabularyDeviceInfo, g2> lVar3;
        x00.l<? super VocabularyDeviceInfo, g2> lVar4 = lVar;
        Composer startRestartGroup = composer.startRestartGroup(-1592808594);
        if ((i11 & 6) == 0) {
            i12 = i11 | (startRestartGroup.changedInstance(list) ? 4 : 2);
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= startRestartGroup.changedInstance(lVar4) ? 32 : 16;
        }
        int i13 = i12;
        int i14 = 1;
        ?? r14 = 0;
        if (startRestartGroup.shouldExecute((i13 & 19) != 18, i13 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1592808594, i13, -1, "com.baicizhan.main.vld.BoundCard (DeviceManagementActivity.kt:266)");
            }
            Modifier m726padding3ABfNKs = PaddingKt.m726padding3ABfNKs(Modifier.Companion, bk.d.b());
            MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.Companion.getStart(), startRestartGroup, 0);
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
            Modifier materializeModifier = ComposedModifierKt.materializeModifier(startRestartGroup, m726padding3ABfNKs);
            ComposeUiNode.Companion companion = ComposeUiNode.Companion;
            x00.a<ComposeUiNode> constructor = companion.getConstructor();
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
            Updater.m1958setimpl(m1951constructorimpl, columnMeasurePolicy, companion.getSetMeasurePolicy());
            Updater.m1958setimpl(m1951constructorimpl, currentCompositionLocalMap, companion.getSetResolvedCompositionLocals());
            x00.p<ComposeUiNode, Integer, g2> setCompositeKeyHash = companion.getSetCompositeKeyHash();
            if (m1951constructorimpl.getInserting() || !kotlin.jvm.internal.g0.g(m1951constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                m1951constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                m1951constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m1958setimpl(m1951constructorimpl, materializeModifier, companion.getSetModifier());
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            WidgetsKt.K(null, StringResources_androidKt.stringResource(R.string.devices_management_bound_title, startRestartGroup, 6), null, startRestartGroup, 0, 5);
            startRestartGroup.startReplaceGroup(-724256874);
            Iterator it = list.iterator();
            while (it.hasNext()) {
                final VocabularyDeviceInfo vocabularyDeviceInfo = (VocabularyDeviceInfo) it.next();
                Modifier.Companion companion2 = Modifier.Companion;
                float f11 = 20;
                Modifier m730paddingqDBjuR0$default = PaddingKt.m730paddingqDBjuR0$default(SizeKt.fillMaxWidth$default(companion2, 0.0f, i14, null), 0.0f, Dp.m5115constructorimpl(f11), 0.0f, 0.0f, 13, null);
                long A0 = bk.b.A0();
                MaterialTheme materialTheme = MaterialTheme.INSTANCE;
                int i15 = MaterialTheme.$stable;
                Modifier m234backgroundbw27NRU = BackgroundKt.m234backgroundbw27NRU(m730paddingqDBjuR0$default, A0, materialTheme.getShapes(startRestartGroup, i15).getSmall());
                Alignment.Companion companion3 = Alignment.Companion;
                MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(companion3.getTopStart(), r14);
                int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, r14);
                CompositionLocalMap currentCompositionLocalMap2 = startRestartGroup.getCurrentCompositionLocalMap();
                Modifier materializeModifier2 = ComposedModifierKt.materializeModifier(startRestartGroup, m234backgroundbw27NRU);
                ComposeUiNode.Companion companion4 = ComposeUiNode.Companion;
                x00.a<ComposeUiNode> constructor2 = companion4.getConstructor();
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
                Updater.m1958setimpl(m1951constructorimpl2, maybeCachedBoxMeasurePolicy, companion4.getSetMeasurePolicy());
                Updater.m1958setimpl(m1951constructorimpl2, currentCompositionLocalMap2, companion4.getSetResolvedCompositionLocals());
                x00.p<ComposeUiNode, Integer, g2> setCompositeKeyHash2 = companion4.getSetCompositeKeyHash();
                if (m1951constructorimpl2.getInserting() || !kotlin.jvm.internal.g0.g(m1951constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                    m1951constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                    m1951constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                }
                Updater.m1958setimpl(m1951constructorimpl2, materializeModifier2, companion4.getSetModifier());
                BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                Modifier m727paddingVpY3zN4 = PaddingKt.m727paddingVpY3zN4(companion2, bk.d.c(), Dp.m5115constructorimpl(f11));
                Arrangement arrangement = Arrangement.INSTANCE;
                MeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(arrangement.getStart(), companion3.getTop(), startRestartGroup, 0);
                int currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap3 = startRestartGroup.getCurrentCompositionLocalMap();
                Modifier materializeModifier3 = ComposedModifierKt.materializeModifier(startRestartGroup, m727paddingVpY3zN4);
                x00.a<ComposeUiNode> constructor3 = companion4.getConstructor();
                if (startRestartGroup.getApplier() == null) {
                    ComposablesKt.invalidApplier();
                }
                startRestartGroup.startReusableNode();
                if (startRestartGroup.getInserting()) {
                    startRestartGroup.createNode(constructor3);
                } else {
                    startRestartGroup.useNode();
                }
                Composer m1951constructorimpl3 = Updater.m1951constructorimpl(startRestartGroup);
                Updater.m1958setimpl(m1951constructorimpl3, rowMeasurePolicy, companion4.getSetMeasurePolicy());
                Updater.m1958setimpl(m1951constructorimpl3, currentCompositionLocalMap3, companion4.getSetResolvedCompositionLocals());
                x00.p<ComposeUiNode, Integer, g2> setCompositeKeyHash3 = companion4.getSetCompositeKeyHash();
                if (m1951constructorimpl3.getInserting() || !kotlin.jvm.internal.g0.g(m1951constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                    m1951constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                    m1951constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
                }
                Updater.m1958setimpl(m1951constructorimpl3, materializeModifier3, companion4.getSetModifier());
                RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                int i16 = i13;
                Composer composer3 = startRestartGroup;
                Iterator it2 = it;
                coil.compose.l.b(new ImageRequest.Builder((Context) startRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext())).j(vocabularyDeviceInfo.getImage()).f(), "vld-model", rowScopeInstance.align(SizeKt.m773size3ABfNKs(companion2, Dp.m5115constructorimpl(50)), companion3.getCenterVertically()), PainterResources_androidKt.painterResource(R.drawable.ic_mytab_exchange_placeholder, startRestartGroup, 6), null, null, null, null, null, null, ContentScale.Companion.getFit(), 0.0f, null, 0, false, null, composer3, 48, 6, 64496);
                float f12 = 8;
                Modifier weight$default = RowScope.weight$default(rowScopeInstance, PaddingKt.m730paddingqDBjuR0$default(rowScopeInstance.align(companion2, companion3.getCenterVertically()), Dp.m5115constructorimpl(f12), 0.0f, Dp.m5115constructorimpl(f11), 0.0f, 10, null), 1.0f, false, 2, null);
                MeasurePolicy columnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(arrangement.getTop(), companion3.getStart(), composer3, 0);
                int currentCompositeKeyHash4 = ComposablesKt.getCurrentCompositeKeyHash(composer3, 0);
                CompositionLocalMap currentCompositionLocalMap4 = composer3.getCurrentCompositionLocalMap();
                Modifier materializeModifier4 = ComposedModifierKt.materializeModifier(composer3, weight$default);
                x00.a<ComposeUiNode> constructor4 = companion4.getConstructor();
                if (composer3.getApplier() == null) {
                    ComposablesKt.invalidApplier();
                }
                composer3.startReusableNode();
                if (composer3.getInserting()) {
                    composer3.createNode(constructor4);
                } else {
                    composer3.useNode();
                }
                Composer m1951constructorimpl4 = Updater.m1951constructorimpl(composer3);
                Updater.m1958setimpl(m1951constructorimpl4, columnMeasurePolicy2, companion4.getSetMeasurePolicy());
                Updater.m1958setimpl(m1951constructorimpl4, currentCompositionLocalMap4, companion4.getSetResolvedCompositionLocals());
                x00.p<ComposeUiNode, Integer, g2> setCompositeKeyHash4 = companion4.getSetCompositeKeyHash();
                if (m1951constructorimpl4.getInserting() || !kotlin.jvm.internal.g0.g(m1951constructorimpl4.rememberedValue(), Integer.valueOf(currentCompositeKeyHash4))) {
                    m1951constructorimpl4.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash4));
                    m1951constructorimpl4.apply(Integer.valueOf(currentCompositeKeyHash4), setCompositeKeyHash4);
                }
                Updater.m1958setimpl(m1951constructorimpl4, materializeModifier4, companion4.getSetModifier());
                ColumnScopeInstance columnScopeInstance2 = ColumnScopeInstance.INSTANCE;
                String name = vocabularyDeviceInfo.getName();
                TextStyle m4572copyp1EtxEg$default = TextStyle.m4572copyp1EtxEg$default(materialTheme.getTypography(composer3, i15).getH4(), 0L, bk.d.m(), null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, 0, 0, 0L, null, null, null, 0, 0, null, 16777213, null);
                TextOverflow.Companion companion5 = TextOverflow.Companion;
                TextKt.m1845Text4IGK_g(name, (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, companion5.m5029getEllipsisgIe3tQ8(), false, 1, 0, (x00.l<? super TextLayoutResult, g2>) null, m4572copyp1EtxEg$default, composer3, 0, 3120, 55294);
                TextKt.m1845Text4IGK_g(vocabularyDeviceInfo.getModel(), PaddingKt.m730paddingqDBjuR0$default(companion2, 0.0f, Dp.m5115constructorimpl(f12), 0.0f, 0.0f, 13, null), 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, companion5.m5029getEllipsisgIe3tQ8(), false, 1, 0, (x00.l<? super TextLayoutResult, g2>) null, materialTheme.getTypography(composer3, i15).getSubtitle2(), composer3, 48, 3120, 55292);
                composer3.endNode();
                String stringResource = StringResources_androidKt.stringResource(R.string.devices_management_bound_btn_detail, composer3, 6);
                long l11 = bk.d.l();
                CornerBasedShape small = materialTheme.getShapes(composer3, i15).getSmall();
                PaddingValues m720PaddingValuesYgX7TsA = PaddingKt.m720PaddingValuesYgX7TsA(bk.d.c(), Dp.m5115constructorimpl(6));
                float f13 = 10;
                Modifier m780widthInVpY3zN4$default = SizeKt.m780widthInVpY3zN4$default(SizeKt.m761heightInVpY3zN4$default(rowScopeInstance.align(companion2, companion3.getCenterVertically()), Dp.m5115constructorimpl(f13), 0.0f, 2, null), Dp.m5115constructorimpl(f13), 0.0f, 2, null);
                boolean changed = ((i16 & 112) == 32) | composer3.changed(vocabularyDeviceInfo);
                Object rememberedValue = composer3.rememberedValue();
                if (changed || rememberedValue == Composer.Companion.getEmpty()) {
                    lVar3 = lVar;
                    rememberedValue = new x00.a() { // from class: ji.a1
                        @Override // x00.a
                        public final Object invoke() {
                            g2 p11;
                            p11 = m1.p(x00.l.this, vocabularyDeviceInfo);
                            return p11;
                        }
                    };
                    composer3.updateRememberedValue(rememberedValue);
                } else {
                    lVar3 = lVar;
                }
                com.baicizhan.platform.base.widget.r.C(m780widthInVpY3zN4$default, (x00.a) rememberedValue, stringResource, l11, null, 0, false, false, small, null, m720PaddingValuesYgX7TsA, composer3, 3072, 6, 752);
                composer3.endNode();
                composer3.endNode();
                lVar4 = lVar3;
                startRestartGroup = composer3;
                i13 = i16;
                it = it2;
                i14 = 1;
                r14 = 0;
            }
            lVar2 = lVar4;
            composer2 = startRestartGroup;
            composer2.endReplaceGroup();
            composer2.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            lVar2 = lVar4;
            composer2 = startRestartGroup;
            composer2.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new x00.p() { // from class: ji.b1
                @Override // x00.p
                public final Object invoke(Object obj, Object obj2) {
                    g2 q11;
                    q11 = m1.q(list, lVar2, i11, (Composer) obj, ((Integer) obj2).intValue());
                    return q11;
                }
            });
        }
    }

    public static final g2 p(x00.l lVar, VocabularyDeviceInfo vocabularyDeviceInfo) {
        lVar.invoke(vocabularyDeviceInfo);
        return g2.f100423a;
    }

    public static final g2 q(List list, x00.l lVar, int i11, Composer composer, int i12) {
        o(list, lVar, composer, RecomposeScopeImplKt.updateChangedFlags(i11 | 1));
        return g2.f100423a;
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    @Preview(backgroundColor = 4294967295L)
    public static final void r(@m80.l Composer composer, final int i11) {
        Composer startRestartGroup = composer.startRestartGroup(219428865);
        if (startRestartGroup.shouldExecute(i11 != 0, i11 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(219428865, i11, -1, "com.baicizhan.main.vld.BoundCardPreview (DeviceManagementActivity.kt:334)");
            }
            bk.k.e(null, null, null, k.f64147a.f(), startRestartGroup, 3072, 7);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new x00.p() { // from class: ji.i1
                @Override // x00.p
                public final Object invoke(Object obj, Object obj2) {
                    g2 s11;
                    s11 = m1.s(i11, (Composer) obj, ((Integer) obj2).intValue());
                    return s11;
                }
            });
        }
    }

    public static final g2 s(int i11, Composer composer, int i12) {
        r(composer, RecomposeScopeImplKt.updateChangedFlags(i11 | 1));
        return g2.f100423a;
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:57:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0097  */
    @androidx.compose.runtime.ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @androidx.compose.runtime.Composable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void t(final androidx.compose.runtime.MutableState<java.lang.Integer> r20, final androidx.compose.runtime.MutableState<java.lang.Boolean> r21, final java.util.List<com.baicizhan.main.vld.model.VocabularyDeviceInfo> r22, final x00.a<yz.g2> r23, final x00.l<? super com.baicizhan.main.vld.model.VocabularyDeviceInfo, yz.g2> r24, x00.a<yz.g2> r25, androidx.compose.runtime.Composer r26, final int r27, final int r28) {
        /*
            Method dump skipped, instructions count: 272
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ji.m1.t(androidx.compose.runtime.MutableState, androidx.compose.runtime.MutableState, java.util.List, x00.a, x00.l, x00.a, androidx.compose.runtime.Composer, int, int):void");
    }

    public static final g2 u() {
        return g2.f100423a;
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final g2 v(final x00.a aVar, final MutableState mutableState, final List list, final x00.a aVar2, final x00.l lVar, final MutableState mutableState2, Composer composer, int i11) {
        if (composer.shouldExecute((i11 & 3) != 2, i11 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1163553644, i11, -1, "com.baicizhan.main.vld.DevicesContent.<anonymous> (DeviceManagementActivity.kt:189)");
            }
            s4.B(null, null, null, ComposableLambdaKt.rememberComposableLambda(-741802293, true, new x00.p() { // from class: ji.j1
                @Override // x00.p
                public final Object invoke(Object obj, Object obj2) {
                    g2 w11;
                    w11 = m1.w(x00.a.this, (Composer) obj, ((Integer) obj2).intValue());
                    return w11;
                }
            }, composer, 54), null, null, 0, false, null, false, null, 0.0f, 0L, 0L, 0L, bk.b.L(MaterialTheme.INSTANCE.getColors(composer, MaterialTheme.$stable)), 0L, ComposableLambdaKt.rememberComposableLambda(-1848016701, true, new x00.q() { // from class: ji.k1
                @Override // x00.q
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    g2 y11;
                    y11 = m1.y(MutableState.this, list, aVar2, lVar, mutableState2, (PaddingValues) obj, (Composer) obj2, ((Integer) obj3).intValue());
                    return y11;
                }
            }, composer, 54), composer, 3072, 12582912, 98295);
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
    public static final g2 w(final x00.a aVar, Composer composer, int i11) {
        if (composer.shouldExecute((i11 & 3) != 2, i11 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-741802293, i11, -1, "com.baicizhan.main.vld.DevicesContent.<anonymous>.<anonymous> (DeviceManagementActivity.kt:190)");
            }
            String stringResource = StringResources_androidKt.stringResource(R.string.devices_management_title, composer, 6);
            boolean changed = composer.changed(aVar);
            Object rememberedValue = composer.rememberedValue();
            if (changed || rememberedValue == Composer.Companion.getEmpty()) {
                rememberedValue = new x00.a() { // from class: ji.c1
                    @Override // x00.a
                    public final Object invoke() {
                        g2 x11;
                        x11 = m1.x(x00.a.this);
                        return x11;
                    }
                };
                composer.updateRememberedValue(rememberedValue);
            }
            s4.F(0, null, (x00.a) rememberedValue, stringResource, null, null, composer, 0, 51);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return g2.f100423a;
    }

    public static final g2 x(x00.a aVar) {
        aVar.invoke();
        return g2.f100423a;
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final g2 y(MutableState mutableState, List list, x00.a aVar, x00.l lVar, final MutableState mutableState2, PaddingValues it, Composer composer, int i11) {
        Composer composer2;
        kotlin.jvm.internal.g0.p(it, "it");
        if (composer.shouldExecute((i11 & 17) != 16, i11 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1848016701, i11, -1, "com.baicizhan.main.vld.DevicesContent.<anonymous>.<anonymous> (DeviceManagementActivity.kt:192)");
            }
            if (i2.z(mutableState)) {
                composer.startReplaceGroup(-1374675811);
                if (list.isEmpty()) {
                    composer.startReplaceGroup(-1374639448);
                    composer2 = composer;
                    WidgetsKt.r(R.drawable.ic_empty_devices_management, StringResources_androidKt.stringResource(R.string.devices_management_empty_tip, composer, 6), StringResources_androidKt.stringResource(R.string.devices_management_empty_action, composer, 6), aVar, composer2, 6, 0);
                    composer2.endReplaceGroup();
                } else {
                    composer2 = composer;
                    composer2.startReplaceGroup(-1374270703);
                    B(list, aVar, lVar, composer2, 0);
                    composer2.endReplaceGroup();
                }
                composer2.endReplaceGroup();
            } else {
                if (i2.y(mutableState)) {
                    composer.startReplaceGroup(-1374135078);
                    String stringResource = StringResources_androidKt.stringResource(R.string.base_loading_view_failed, composer, 6);
                    String stringResource2 = StringResources_androidKt.stringResource(R.string.base_loading_view_retry, composer, 6);
                    boolean changed = composer.changed(mutableState2);
                    Object rememberedValue = composer.rememberedValue();
                    if (changed || rememberedValue == Composer.Companion.getEmpty()) {
                        rememberedValue = new x00.a() { // from class: ji.e1
                            @Override // x00.a
                            public final Object invoke() {
                                g2 z11;
                                z11 = m1.z(MutableState.this);
                                return z11;
                            }
                        };
                        composer.updateRememberedValue(rememberedValue);
                    }
                    WidgetsKt.r(R.drawable.ic_common_page_error, stringResource, stringResource2, (x00.a) rememberedValue, composer, 6, 0);
                } else {
                    composer.startReplaceGroup(-1382791425);
                }
                composer.endReplaceGroup();
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return g2.f100423a;
    }

    public static final g2 z(MutableState mutableState) {
        i2.J(mutableState);
        return g2.f100423a;
    }
}
