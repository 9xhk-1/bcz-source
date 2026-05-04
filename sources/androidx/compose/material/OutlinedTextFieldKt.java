package androidx.compose.material;

import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableInferredTarget;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.DrawModifierKt;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.ClipOp;
import androidx.compose.ui.graphics.drawscope.ContentDrawScope;
import androidx.compose.ui.graphics.drawscope.DrawContext;
import androidx.compose.ui.layout.LayoutIdKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.unit.ConstraintsKt;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.compose.ui.unit.TextUnitKt;
import androidx.compose.ui.util.MathHelpersKt;
import c10.d;
import g10.u;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import m80.k;
import m80.l;
import x00.a;
import x00.p;
import x00.q;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nOutlinedTextField.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OutlinedTextField.kt\nandroidx/compose/material/OutlinedTextFieldKt\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 4 Color.kt\nandroidx/compose/ui/graphics/ColorKt\n+ 5 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 6 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 7 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 8 Composer.kt\nandroidx/compose/runtime/Updater\n+ 9 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 10 Dp.kt\nandroidx/compose/ui/unit/Dp\n+ 11 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,1213:1\n75#2:1214\n75#2:1223\n75#2:1225\n75#2:1234\n75#2:1235\n75#2:1242\n75#2:1251\n75#2:1252\n75#2:1265\n1247#3,6:1215\n1247#3,6:1226\n1247#3,6:1236\n1247#3,6:1243\n1247#3,6:1253\n1247#3,6:1259\n708#4:1221\n696#4:1222\n708#4:1232\n696#4:1233\n708#4:1249\n696#4:1250\n1#5:1224\n79#6,6:1266\n86#6,4:1281\n90#6,2:1291\n79#6,6:1300\n86#6,4:1315\n90#6,2:1325\n94#6:1331\n79#6,6:1339\n86#6,4:1354\n90#6,2:1364\n94#6:1370\n79#6,6:1385\n86#6,4:1400\n90#6,2:1410\n94#6:1416\n79#6,6:1425\n86#6,4:1440\n90#6,2:1450\n94#6:1456\n94#6:1460\n368#7,9:1272\n377#7:1293\n368#7,9:1306\n377#7:1327\n378#7,2:1329\n368#7,9:1345\n377#7:1366\n378#7,2:1368\n368#7,9:1391\n377#7:1412\n378#7,2:1414\n368#7,9:1431\n377#7:1452\n378#7,2:1454\n378#7,2:1458\n4034#8,6:1285\n4034#8,6:1319\n4034#8,6:1358\n4034#8,6:1404\n4034#8,6:1444\n71#9:1294\n69#9,5:1295\n74#9:1328\n78#9:1332\n71#9:1333\n69#9,5:1334\n74#9:1367\n78#9:1371\n71#9:1378\n68#9,6:1379\n74#9:1413\n78#9:1417\n71#9:1418\n68#9,6:1419\n74#9:1453\n78#9:1457\n57#10:1372\n57#10:1375\n51#10:1461\n149#11:1373\n206#11:1374\n149#11:1376\n206#11:1377\n149#11:1462\n*S KotlinDebug\n*F\n+ 1 OutlinedTextField.kt\nandroidx/compose/material/OutlinedTextFieldKt\n*L\n163#1:1214\n185#1:1223\n325#1:1225\n347#1:1234\n423#1:1235\n533#1:1242\n555#1:1251\n631#1:1252\n698#1:1265\n180#1:1215,6\n342#1:1226,6\n434#1:1236,6\n550#1:1243,6\n642#1:1253,6\n690#1:1259,6\n182#1:1221\n182#1:1222\n344#1:1232\n344#1:1233\n552#1:1249\n552#1:1250\n699#1:1266,6\n699#1:1281,4\n699#1:1291,2\n710#1:1300,6\n710#1:1315,4\n710#1:1325,2\n710#1:1331\n718#1:1339,6\n718#1:1354,4\n718#1:1364,2\n718#1:1370\n747#1:1385,6\n747#1:1400,4\n747#1:1410,2\n747#1:1416\n755#1:1425,6\n755#1:1440,4\n755#1:1450,2\n755#1:1456\n699#1:1460\n699#1:1272,9\n699#1:1293\n710#1:1306,9\n710#1:1327\n710#1:1329,2\n718#1:1345,9\n718#1:1366\n718#1:1368,2\n747#1:1391,9\n747#1:1412\n747#1:1414,2\n755#1:1431,9\n755#1:1452\n755#1:1454,2\n699#1:1458,2\n699#1:1285,6\n710#1:1319,6\n718#1:1358,6\n747#1:1404,6\n755#1:1444,6\n710#1:1294\n710#1:1295,5\n710#1:1328\n710#1:1332\n718#1:1333\n718#1:1334,5\n718#1:1367\n718#1:1371\n747#1:1378\n747#1:1379,6\n747#1:1413\n747#1:1417\n755#1:1418\n755#1:1419,6\n755#1:1453\n755#1:1457\n732#1:1372\n738#1:1375\n1042#1:1461\n732#1:1373\n732#1:1374\n738#1:1376\n738#1:1377\n1202#1:1462\n*E\n"})
/* loaded from: classes.dex */
public final class OutlinedTextFieldKt {

    @k
    public static final String BorderId = "border";
    private static final float OutlinedTextFieldInnerPadding = Dp.m5115constructorimpl(4);
    private static final long OutlinedTextFieldTopPadding = TextUnitKt.getSp(8);

    /* JADX WARN: Removed duplicated region for block: B:10:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x064a  */
    /* JADX WARN: Removed duplicated region for block: B:140:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x0620  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x0250  */
    /* JADX WARN: Removed duplicated region for block: B:215:0x0243  */
    /* JADX WARN: Removed duplicated region for block: B:217:0x0227  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x020b  */
    /* JADX WARN: Removed duplicated region for block: B:221:0x01ee  */
    /* JADX WARN: Removed duplicated region for block: B:222:0x01c2  */
    /* JADX WARN: Removed duplicated region for block: B:228:0x019a  */
    /* JADX WARN: Removed duplicated region for block: B:237:0x0178  */
    /* JADX WARN: Removed duplicated region for block: B:245:0x0151  */
    /* JADX WARN: Removed duplicated region for block: B:253:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:260:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:267:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:274:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:281:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:290:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:291:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:298:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x014a  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0171  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0197  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x01bb  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x01da  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x01f4  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0213  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x022f  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x024b  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0271  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0287  */
    @androidx.compose.runtime.Composable
    @androidx.compose.runtime.ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void OutlinedTextField(@m80.k final androidx.compose.foundation.text.input.TextFieldState r73, @m80.l androidx.compose.ui.Modifier r74, boolean r75, boolean r76, @m80.l androidx.compose.ui.text.TextStyle r77, @m80.l x00.p<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, yz.g2> r78, @m80.l x00.p<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, yz.g2> r79, @m80.l x00.p<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, yz.g2> r80, @m80.l x00.p<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, yz.g2> r81, boolean r82, @m80.l androidx.compose.foundation.text.input.InputTransformation r83, @m80.l androidx.compose.foundation.text.input.OutputTransformation r84, @m80.l androidx.compose.foundation.text.KeyboardOptions r85, @m80.l androidx.compose.foundation.text.input.KeyboardActionHandler r86, @m80.l androidx.compose.foundation.text.input.TextFieldLineLimits r87, @m80.l androidx.compose.foundation.ScrollState r88, @m80.l androidx.compose.ui.graphics.Shape r89, @m80.l androidx.compose.material.TextFieldColors r90, @m80.l androidx.compose.foundation.interaction.MutableInteractionSource r91, @m80.l androidx.compose.runtime.Composer r92, final int r93, final int r94, final int r95) {
        /*
            Method dump skipped, instructions count: 1632
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.OutlinedTextFieldKt.OutlinedTextField(androidx.compose.foundation.text.input.TextFieldState, androidx.compose.ui.Modifier, boolean, boolean, androidx.compose.ui.text.TextStyle, x00.p, x00.p, x00.p, x00.p, boolean, androidx.compose.foundation.text.input.InputTransformation, androidx.compose.foundation.text.input.OutputTransformation, androidx.compose.foundation.text.KeyboardOptions, androidx.compose.foundation.text.input.KeyboardActionHandler, androidx.compose.foundation.text.input.TextFieldLineLimits, androidx.compose.foundation.ScrollState, androidx.compose.ui.graphics.Shape, androidx.compose.material.TextFieldColors, androidx.compose.foundation.interaction.MutableInteractionSource, androidx.compose.runtime.Composer, int, int, int):void");
    }

    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    public static final void OutlinedTextFieldLayout(@k final Modifier modifier, @k final p<? super Composer, ? super Integer, g2> pVar, @l final q<? super Modifier, ? super Composer, ? super Integer, g2> qVar, @l p<? super Composer, ? super Integer, g2> pVar2, @l final p<? super Composer, ? super Integer, g2> pVar3, @l final p<? super Composer, ? super Integer, g2> pVar4, final boolean z11, final float f11, @k final x00.l<? super Size, g2> lVar, @k final p<? super Composer, ? super Integer, g2> pVar5, @k final PaddingValues paddingValues, @l Composer composer, final int i11, final int i12) {
        int i13;
        int i14;
        final p<? super Composer, ? super Integer, g2> pVar6;
        int i15;
        Composer startRestartGroup = composer.startRestartGroup(-2049536174);
        if ((i11 & 6) == 0) {
            i13 = (startRestartGroup.changed(modifier) ? 4 : 2) | i11;
        } else {
            i13 = i11;
        }
        if ((i11 & 48) == 0) {
            i13 |= startRestartGroup.changedInstance(pVar) ? 32 : 16;
        }
        if ((i11 & 384) == 0) {
            i13 |= startRestartGroup.changedInstance(qVar) ? 256 : 128;
        }
        if ((i11 & 3072) == 0) {
            i13 |= startRestartGroup.changedInstance(pVar2) ? 2048 : 1024;
        }
        if ((i11 & 24576) == 0) {
            i13 |= startRestartGroup.changedInstance(pVar3) ? 16384 : 8192;
        }
        if ((196608 & i11) == 0) {
            i13 |= startRestartGroup.changedInstance(pVar4) ? 131072 : 65536;
        }
        if ((1572864 & i11) == 0) {
            i13 |= startRestartGroup.changed(z11) ? 1048576 : 524288;
        }
        if ((12582912 & i11) == 0) {
            i13 |= startRestartGroup.changed(f11) ? 8388608 : 4194304;
        }
        if ((100663296 & i11) == 0) {
            i13 |= startRestartGroup.changedInstance(lVar) ? 67108864 : 33554432;
        }
        if ((805306368 & i11) == 0) {
            i13 |= startRestartGroup.changedInstance(pVar5) ? 536870912 : 268435456;
        }
        if ((i12 & 6) == 0) {
            i14 = i12 | (startRestartGroup.changed(paddingValues) ? 4 : 2);
        } else {
            i14 = i12;
        }
        if (startRestartGroup.shouldExecute(((i13 & 306783379) == 306783378 && (i14 & 3) == 2) ? false : true, i13 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-2049536174, i13, i14, "androidx.compose.material.OutlinedTextFieldLayout (OutlinedTextField.kt:687)");
            }
            boolean z12 = ((i14 & 14) == 4) | ((3670016 & i13) == 1048576) | ((234881024 & i13) == 67108864) | ((29360128 & i13) == 8388608);
            Object rememberedValue = startRestartGroup.rememberedValue();
            if (z12 || rememberedValue == Composer.Companion.getEmpty()) {
                rememberedValue = new OutlinedTextFieldMeasurePolicy(lVar, z11, f11, paddingValues);
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            OutlinedTextFieldMeasurePolicy outlinedTextFieldMeasurePolicy = (OutlinedTextFieldMeasurePolicy) rememberedValue;
            LayoutDirection layoutDirection = (LayoutDirection) startRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
            Modifier materializeModifier = ComposedModifierKt.materializeModifier(startRestartGroup, modifier);
            ComposeUiNode.Companion companion = ComposeUiNode.Companion;
            a<ComposeUiNode> constructor = companion.getConstructor();
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
            Updater.m1958setimpl(m1951constructorimpl, outlinedTextFieldMeasurePolicy, companion.getSetMeasurePolicy());
            Updater.m1958setimpl(m1951constructorimpl, currentCompositionLocalMap, companion.getSetResolvedCompositionLocals());
            p<ComposeUiNode, Integer, g2> setCompositeKeyHash = companion.getSetCompositeKeyHash();
            if (m1951constructorimpl.getInserting() || !g0.g(m1951constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                m1951constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                m1951constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m1958setimpl(m1951constructorimpl, materializeModifier, companion.getSetModifier());
            pVar5.invoke(startRestartGroup, Integer.valueOf((i13 >> 27) & 14));
            if (pVar3 != null) {
                startRestartGroup.startReplaceGroup(-978132235);
                Modifier minimumInteractiveComponentSize = InteractiveComponentSizeKt.minimumInteractiveComponentSize(LayoutIdKt.layoutId(Modifier.Companion, TextFieldImplKt.LeadingId));
                MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.getCenter(), false);
                int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap2 = startRestartGroup.getCurrentCompositionLocalMap();
                Modifier materializeModifier2 = ComposedModifierKt.materializeModifier(startRestartGroup, minimumInteractiveComponentSize);
                a<ComposeUiNode> constructor2 = companion.getConstructor();
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
                Updater.m1958setimpl(m1951constructorimpl2, maybeCachedBoxMeasurePolicy, companion.getSetMeasurePolicy());
                Updater.m1958setimpl(m1951constructorimpl2, currentCompositionLocalMap2, companion.getSetResolvedCompositionLocals());
                p<ComposeUiNode, Integer, g2> setCompositeKeyHash2 = companion.getSetCompositeKeyHash();
                if (m1951constructorimpl2.getInserting() || !g0.g(m1951constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                    m1951constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                    m1951constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                }
                Updater.m1958setimpl(m1951constructorimpl2, materializeModifier2, companion.getSetModifier());
                BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                pVar3.invoke(startRestartGroup, Integer.valueOf((i13 >> 12) & 14));
                startRestartGroup.endNode();
                startRestartGroup.endReplaceGroup();
            } else {
                startRestartGroup.startReplaceGroup(-977887180);
                startRestartGroup.endReplaceGroup();
            }
            if (pVar4 != null) {
                startRestartGroup.startReplaceGroup(-977844493);
                Modifier minimumInteractiveComponentSize2 = InteractiveComponentSizeKt.minimumInteractiveComponentSize(LayoutIdKt.layoutId(Modifier.Companion, TextFieldImplKt.TrailingId));
                MeasurePolicy maybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.getCenter(), false);
                int currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap3 = startRestartGroup.getCurrentCompositionLocalMap();
                Modifier materializeModifier3 = ComposedModifierKt.materializeModifier(startRestartGroup, minimumInteractiveComponentSize2);
                a<ComposeUiNode> constructor3 = companion.getConstructor();
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
                Updater.m1958setimpl(m1951constructorimpl3, maybeCachedBoxMeasurePolicy2, companion.getSetMeasurePolicy());
                Updater.m1958setimpl(m1951constructorimpl3, currentCompositionLocalMap3, companion.getSetResolvedCompositionLocals());
                p<ComposeUiNode, Integer, g2> setCompositeKeyHash3 = companion.getSetCompositeKeyHash();
                if (m1951constructorimpl3.getInserting() || !g0.g(m1951constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                    m1951constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                    m1951constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
                }
                Updater.m1958setimpl(m1951constructorimpl3, materializeModifier3, companion.getSetModifier());
                BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
                pVar4.invoke(startRestartGroup, Integer.valueOf((i13 >> 15) & 14));
                startRestartGroup.endNode();
                startRestartGroup.endReplaceGroup();
            } else {
                startRestartGroup.startReplaceGroup(-977597516);
                startRestartGroup.endReplaceGroup();
            }
            float calculateStartPadding = PaddingKt.calculateStartPadding(paddingValues, layoutDirection);
            float calculateEndPadding = PaddingKt.calculateEndPadding(paddingValues, layoutDirection);
            Modifier.Companion companion2 = Modifier.Companion;
            if (pVar3 != null) {
                i15 = 0;
                calculateStartPadding = Dp.m5115constructorimpl(u.t(Dp.m5115constructorimpl(calculateStartPadding - TextFieldImplKt.getHorizontalIconPadding()), Dp.m5115constructorimpl(0)));
            } else {
                i15 = 0;
            }
            float f12 = calculateStartPadding;
            if (pVar4 != null) {
                calculateEndPadding = Dp.m5115constructorimpl(u.t(Dp.m5115constructorimpl(calculateEndPadding - TextFieldImplKt.getHorizontalIconPadding()), Dp.m5115constructorimpl(i15)));
            }
            Modifier m730paddingqDBjuR0$default = PaddingKt.m730paddingqDBjuR0$default(companion2, f12, 0.0f, calculateEndPadding, 0.0f, 10, null);
            if (qVar != null) {
                startRestartGroup.startReplaceGroup(-976746535);
                qVar.invoke(LayoutIdKt.layoutId(companion2, TextFieldImplKt.PlaceholderId).then(m730paddingqDBjuR0$default), startRestartGroup, Integer.valueOf((i13 >> 3) & 112));
                startRestartGroup.endReplaceGroup();
            } else {
                startRestartGroup.startReplaceGroup(-976659084);
                startRestartGroup.endReplaceGroup();
            }
            Modifier then = LayoutIdKt.layoutId(companion2, TextFieldImplKt.TextFieldId).then(m730paddingqDBjuR0$default);
            Alignment.Companion companion3 = Alignment.Companion;
            MeasurePolicy maybeCachedBoxMeasurePolicy3 = BoxKt.maybeCachedBoxMeasurePolicy(companion3.getTopStart(), true);
            int currentCompositeKeyHash4 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap4 = startRestartGroup.getCurrentCompositionLocalMap();
            Modifier materializeModifier4 = ComposedModifierKt.materializeModifier(startRestartGroup, then);
            a<ComposeUiNode> constructor4 = companion.getConstructor();
            if (startRestartGroup.getApplier() == null) {
                ComposablesKt.invalidApplier();
            }
            startRestartGroup.startReusableNode();
            if (startRestartGroup.getInserting()) {
                startRestartGroup.createNode(constructor4);
            } else {
                startRestartGroup.useNode();
            }
            Composer m1951constructorimpl4 = Updater.m1951constructorimpl(startRestartGroup);
            Updater.m1958setimpl(m1951constructorimpl4, maybeCachedBoxMeasurePolicy3, companion.getSetMeasurePolicy());
            Updater.m1958setimpl(m1951constructorimpl4, currentCompositionLocalMap4, companion.getSetResolvedCompositionLocals());
            p<ComposeUiNode, Integer, g2> setCompositeKeyHash4 = companion.getSetCompositeKeyHash();
            if (m1951constructorimpl4.getInserting() || !g0.g(m1951constructorimpl4.rememberedValue(), Integer.valueOf(currentCompositeKeyHash4))) {
                m1951constructorimpl4.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash4));
                m1951constructorimpl4.apply(Integer.valueOf(currentCompositeKeyHash4), setCompositeKeyHash4);
            }
            Updater.m1958setimpl(m1951constructorimpl4, materializeModifier4, companion.getSetModifier());
            BoxScopeInstance boxScopeInstance3 = BoxScopeInstance.INSTANCE;
            pVar.invoke(startRestartGroup, Integer.valueOf((i13 >> 3) & 14));
            startRestartGroup.endNode();
            if (pVar2 != null) {
                startRestartGroup.startReplaceGroup(-976429250);
                Modifier layoutId = LayoutIdKt.layoutId(companion2, TextFieldImplKt.LabelId);
                MeasurePolicy maybeCachedBoxMeasurePolicy4 = BoxKt.maybeCachedBoxMeasurePolicy(companion3.getTopStart(), false);
                int currentCompositeKeyHash5 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap5 = startRestartGroup.getCurrentCompositionLocalMap();
                Modifier materializeModifier5 = ComposedModifierKt.materializeModifier(startRestartGroup, layoutId);
                a<ComposeUiNode> constructor5 = companion.getConstructor();
                if (startRestartGroup.getApplier() == null) {
                    ComposablesKt.invalidApplier();
                }
                startRestartGroup.startReusableNode();
                if (startRestartGroup.getInserting()) {
                    startRestartGroup.createNode(constructor5);
                } else {
                    startRestartGroup.useNode();
                }
                Composer m1951constructorimpl5 = Updater.m1951constructorimpl(startRestartGroup);
                Updater.m1958setimpl(m1951constructorimpl5, maybeCachedBoxMeasurePolicy4, companion.getSetMeasurePolicy());
                Updater.m1958setimpl(m1951constructorimpl5, currentCompositionLocalMap5, companion.getSetResolvedCompositionLocals());
                p<ComposeUiNode, Integer, g2> setCompositeKeyHash5 = companion.getSetCompositeKeyHash();
                if (m1951constructorimpl5.getInserting() || !g0.g(m1951constructorimpl5.rememberedValue(), Integer.valueOf(currentCompositeKeyHash5))) {
                    m1951constructorimpl5.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash5));
                    m1951constructorimpl5.apply(Integer.valueOf(currentCompositeKeyHash5), setCompositeKeyHash5);
                }
                Updater.m1958setimpl(m1951constructorimpl5, materializeModifier5, companion.getSetModifier());
                pVar6 = pVar2;
                pVar6.invoke(startRestartGroup, Integer.valueOf((i13 >> 9) & 14));
                startRestartGroup.endNode();
                startRestartGroup.endReplaceGroup();
            } else {
                pVar6 = pVar2;
                startRestartGroup.startReplaceGroup(-976346604);
                startRestartGroup.endReplaceGroup();
            }
            startRestartGroup.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            pVar6 = pVar2;
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new p<Composer, Integer, g2>() { // from class: androidx.compose.material.OutlinedTextFieldKt$OutlinedTextFieldLayout$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                @Override // x00.p
                public /* bridge */ /* synthetic */ g2 invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return g2.f100423a;
                }

                public final void invoke(Composer composer2, int i16) {
                    OutlinedTextFieldKt.OutlinedTextFieldLayout(Modifier.this, pVar, qVar, pVar6, pVar3, pVar4, z11, f11, lVar, pVar5, paddingValues, composer2, RecomposeScopeImplKt.updateChangedFlags(i11 | 1), RecomposeScopeImplKt.updateChangedFlags(i12));
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: calculateHeight-O3s9Psw, reason: not valid java name */
    public static final int m1719calculateHeightO3s9Psw(int i11, int i12, int i13, int i14, int i15, float f11, long j11, float f12, PaddingValues paddingValues) {
        int max = Math.max(i13, Math.max(i15, MathHelpersKt.lerp(i14, 0, f11)));
        float mo678calculateTopPaddingD9Ej5fM = paddingValues.mo678calculateTopPaddingD9Ej5fM() * f12;
        return ConstraintsKt.m5084constrainHeightK40F9xA(j11, Math.max(i11, Math.max(i12, d.L0(MathHelpersKt.lerp(mo678calculateTopPaddingD9Ej5fM, Math.max(mo678calculateTopPaddingD9Ej5fM, i14 / 2.0f), f11) + max + (paddingValues.mo675calculateBottomPaddingD9Ej5fM() * f12)))));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: calculateWidth-O3s9Psw, reason: not valid java name */
    public static final int m1720calculateWidthO3s9Psw(int i11, int i12, int i13, int i14, int i15, float f11, long j11, float f12, PaddingValues paddingValues) {
        int max = i11 + Math.max(i13, Math.max(MathHelpersKt.lerp(i14, 0, f11), i15)) + i12;
        LayoutDirection layoutDirection = LayoutDirection.Ltr;
        return ConstraintsKt.m5085constrainWidthK40F9xA(j11, Math.max(max, d.L0((i14 + (Dp.m5115constructorimpl(paddingValues.mo676calculateLeftPaddingu2uoSUM(layoutDirection) + paddingValues.mo677calculateRightPaddingu2uoSUM(layoutDirection)) * f12)) * f11)));
    }

    public static final long getOutlinedTextFieldTopPadding() {
        return OutlinedTextFieldTopPadding;
    }

    @k
    /* renamed from: outlineCutout-12SF9DM, reason: not valid java name */
    public static final Modifier m1721outlineCutout12SF9DM(@k Modifier modifier, final long j11, @k final PaddingValues paddingValues) {
        return DrawModifierKt.drawWithContent(modifier, new x00.l<ContentDrawScope, g2>() { // from class: androidx.compose.material.OutlinedTextFieldKt$outlineCutout$1

            /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
            public /* synthetic */ class WhenMappings {
                public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                static {
                    int[] iArr = new int[LayoutDirection.values().length];
                    try {
                        iArr[LayoutDirection.Rtl.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    $EnumSwitchMapping$0 = iArr;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // x00.l
            public /* bridge */ /* synthetic */ g2 invoke(ContentDrawScope contentDrawScope) {
                invoke2(contentDrawScope);
                return g2.f100423a;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(ContentDrawScope contentDrawScope) {
                float f11;
                float m2337getWidthimpl = Size.m2337getWidthimpl(j11);
                if (m2337getWidthimpl <= 0.0f) {
                    contentDrawScope.drawContent();
                    return;
                }
                f11 = OutlinedTextFieldKt.OutlinedTextFieldInnerPadding;
                float mo377toPx0680j_4 = contentDrawScope.mo377toPx0680j_4(f11);
                float mo377toPx0680j_42 = contentDrawScope.mo377toPx0680j_4(paddingValues.mo676calculateLeftPaddingu2uoSUM(contentDrawScope.getLayoutDirection())) - mo377toPx0680j_4;
                float f12 = 2;
                float f13 = m2337getWidthimpl + mo377toPx0680j_42 + (mo377toPx0680j_4 * f12);
                LayoutDirection layoutDirection = contentDrawScope.getLayoutDirection();
                int[] iArr = WhenMappings.$EnumSwitchMapping$0;
                float m2337getWidthimpl2 = iArr[layoutDirection.ordinal()] == 1 ? Size.m2337getWidthimpl(contentDrawScope.mo3060getSizeNHjbRc()) - f13 : u.t(mo377toPx0680j_42, 0.0f);
                if (iArr[contentDrawScope.getLayoutDirection().ordinal()] == 1) {
                    f13 = Size.m2337getWidthimpl(contentDrawScope.mo3060getSizeNHjbRc()) - u.t(mo377toPx0680j_42, 0.0f);
                }
                float f14 = f13;
                float m2334getHeightimpl = Size.m2334getHeightimpl(j11);
                float f15 = (-m2334getHeightimpl) / f12;
                float f16 = m2334getHeightimpl / f12;
                int m2497getDifferencertfAjoo = ClipOp.Companion.m2497getDifferencertfAjoo();
                DrawContext drawContext = contentDrawScope.getDrawContext();
                long mo2981getSizeNHjbRc = drawContext.mo2981getSizeNHjbRc();
                drawContext.getCanvas().save();
                try {
                    drawContext.getTransform().mo2984clipRectN_I0leg(m2337getWidthimpl2, f15, f14, f16, m2497getDifferencertfAjoo);
                    contentDrawScope.drawContent();
                } finally {
                    drawContext.getCanvas().restore();
                    drawContext.mo2982setSizeuvyYCjk(mo2981getSizeNHjbRc);
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void place(Placeable.PlacementScope placementScope, int i11, int i12, Placeable placeable, Placeable placeable2, Placeable placeable3, Placeable placeable4, Placeable placeable5, Placeable placeable6, float f11, boolean z11, float f12, LayoutDirection layoutDirection, PaddingValues paddingValues) {
        int L0 = d.L0(paddingValues.mo678calculateTopPaddingD9Ej5fM() * f12);
        int L02 = d.L0(PaddingKt.calculateStartPadding(paddingValues, layoutDirection) * f12);
        float horizontalIconPadding = TextFieldImplKt.getHorizontalIconPadding() * f12;
        if (placeable != null) {
            Placeable.PlacementScope.placeRelative$default(placementScope, placeable, 0, Alignment.Companion.getCenterVertically().align(placeable.getHeight(), i11), 0.0f, 4, null);
        }
        if (placeable2 != null) {
            Placeable.PlacementScope.placeRelative$default(placementScope, placeable2, i12 - placeable2.getWidth(), Alignment.Companion.getCenterVertically().align(placeable2.getHeight(), i11), 0.0f, 4, null);
        }
        if (placeable4 != null) {
            Placeable.PlacementScope.placeRelative$default(placementScope, placeable4, d.L0(placeable == null ? 0.0f : (TextFieldImplKt.widthOrZero(placeable) - horizontalIconPadding) * (1 - f11)) + L02, MathHelpersKt.lerp(z11 ? Alignment.Companion.getCenterVertically().align(placeable4.getHeight(), i11) : L0, -(placeable4.getHeight() / 2), f11), 0.0f, 4, null);
        }
        Placeable.PlacementScope.placeRelative$default(placementScope, placeable3, TextFieldImplKt.widthOrZero(placeable), Math.max(z11 ? Alignment.Companion.getCenterVertically().align(placeable3.getHeight(), i11) : L0, TextFieldImplKt.heightOrZero(placeable4) / 2), 0.0f, 4, null);
        if (placeable5 != null) {
            if (z11) {
                L0 = Alignment.Companion.getCenterVertically().align(placeable5.getHeight(), i11);
            }
            Placeable.PlacementScope.placeRelative$default(placementScope, placeable5, TextFieldImplKt.widthOrZero(placeable), Math.max(L0, TextFieldImplKt.heightOrZero(placeable4) / 2), 0.0f, 4, null);
        }
        Placeable.PlacementScope.m3921place70tqf50$default(placementScope, placeable6, IntOffset.Companion.m5254getZeronOccac(), 0.0f, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int substractConstraintSafely(int i11, int i12) {
        return i11 == Integer.MAX_VALUE ? i11 : i11 - i12;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0657  */
    /* JADX WARN: Removed duplicated region for block: B:136:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x062d  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x0284  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x0268  */
    /* JADX WARN: Removed duplicated region for block: B:209:0x0239  */
    /* JADX WARN: Removed duplicated region for block: B:216:0x021b  */
    /* JADX WARN: Removed duplicated region for block: B:224:0x020e  */
    /* JADX WARN: Removed duplicated region for block: B:225:0x01df  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:231:0x01b9  */
    /* JADX WARN: Removed duplicated region for block: B:238:0x0195  */
    /* JADX WARN: Removed duplicated region for block: B:247:0x0173  */
    /* JADX WARN: Removed duplicated region for block: B:255:0x014c  */
    /* JADX WARN: Removed duplicated region for block: B:263:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:270:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:277:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:284:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:292:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:293:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:300:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:307:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x016c  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0192  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x01b6  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x01d8  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x01f7  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0216  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0234  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0252  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0270  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0293  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x02aa  */
    @androidx.compose.runtime.Composable
    @androidx.compose.runtime.ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void OutlinedTextField(@m80.k final java.lang.String r72, @m80.k final x00.l<? super java.lang.String, yz.g2> r73, @m80.l androidx.compose.ui.Modifier r74, boolean r75, boolean r76, @m80.l androidx.compose.ui.text.TextStyle r77, @m80.l x00.p<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, yz.g2> r78, @m80.l x00.p<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, yz.g2> r79, @m80.l x00.p<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, yz.g2> r80, @m80.l x00.p<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, yz.g2> r81, boolean r82, @m80.l androidx.compose.ui.text.input.VisualTransformation r83, @m80.l androidx.compose.foundation.text.KeyboardOptions r84, @m80.l androidx.compose.foundation.text.KeyboardActions r85, boolean r86, int r87, int r88, @m80.l androidx.compose.foundation.interaction.MutableInteractionSource r89, @m80.l androidx.compose.ui.graphics.Shape r90, @m80.l androidx.compose.material.TextFieldColors r91, @m80.l androidx.compose.runtime.Composer r92, final int r93, final int r94, final int r95) {
        /*
            Method dump skipped, instructions count: 1647
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.OutlinedTextFieldKt.OutlinedTextField(java.lang.String, x00.l, androidx.compose.ui.Modifier, boolean, boolean, androidx.compose.ui.text.TextStyle, x00.p, x00.p, x00.p, x00.p, boolean, androidx.compose.ui.text.input.VisualTransformation, androidx.compose.foundation.text.KeyboardOptions, androidx.compose.foundation.text.KeyboardActions, boolean, int, int, androidx.compose.foundation.interaction.MutableInteractionSource, androidx.compose.ui.graphics.Shape, androidx.compose.material.TextFieldColors, androidx.compose.runtime.Composer, int, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x04b9  */
    /* JADX WARN: Removed duplicated region for block: B:114:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x0492  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x0266  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x0248  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x021b  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x01ff  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x01e1  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x01bb  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x0197  */
    /* JADX WARN: Removed duplicated region for block: B:217:0x0175  */
    /* JADX WARN: Removed duplicated region for block: B:225:0x014e  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:233:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:240:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:247:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:254:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:262:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:263:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:270:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:277:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0147  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x016e  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0194  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x01b8  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x01da  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x01fa  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0216  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0234  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0250  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0276  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x028e  */
    @androidx.compose.runtime.Composable
    @yz.n(level = kotlin.DeprecationLevel.HIDDEN, message = "Maintained for binary compatibility. Use version with minLines instead")
    @androidx.compose.runtime.ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final /* synthetic */ void OutlinedTextField(final java.lang.String r70, final x00.l r71, androidx.compose.ui.Modifier r72, boolean r73, boolean r74, androidx.compose.ui.text.TextStyle r75, x00.p r76, x00.p r77, x00.p r78, x00.p r79, boolean r80, androidx.compose.ui.text.input.VisualTransformation r81, androidx.compose.foundation.text.KeyboardOptions r82, androidx.compose.foundation.text.KeyboardActions r83, boolean r84, int r85, androidx.compose.foundation.interaction.MutableInteractionSource r86, androidx.compose.ui.graphics.Shape r87, androidx.compose.material.TextFieldColors r88, androidx.compose.runtime.Composer r89, final int r90, final int r91, final int r92) {
        /*
            Method dump skipped, instructions count: 1233
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.OutlinedTextFieldKt.OutlinedTextField(java.lang.String, x00.l, androidx.compose.ui.Modifier, boolean, boolean, androidx.compose.ui.text.TextStyle, x00.p, x00.p, x00.p, x00.p, boolean, androidx.compose.ui.text.input.VisualTransformation, androidx.compose.foundation.text.KeyboardOptions, androidx.compose.foundation.text.KeyboardActions, boolean, int, androidx.compose.foundation.interaction.MutableInteractionSource, androidx.compose.ui.graphics.Shape, androidx.compose.material.TextFieldColors, androidx.compose.runtime.Composer, int, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:104:0x02a7  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x0689  */
    /* JADX WARN: Removed duplicated region for block: B:147:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:216:0x065f  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x0280  */
    /* JADX WARN: Removed duplicated region for block: B:221:0x0262  */
    /* JADX WARN: Removed duplicated region for block: B:222:0x0233  */
    /* JADX WARN: Removed duplicated region for block: B:229:0x0215  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:237:0x0208  */
    /* JADX WARN: Removed duplicated region for block: B:238:0x01d8  */
    /* JADX WARN: Removed duplicated region for block: B:245:0x01c8  */
    /* JADX WARN: Removed duplicated region for block: B:246:0x0199  */
    /* JADX WARN: Removed duplicated region for block: B:253:0x0173  */
    /* JADX WARN: Removed duplicated region for block: B:261:0x014c  */
    /* JADX WARN: Removed duplicated region for block: B:269:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:276:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:283:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:290:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:298:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:299:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:306:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:313:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x016c  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0192  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x01b2  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x01d1  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x01f1  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0210  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x022e  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x024c  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x026a  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0291  */
    @androidx.compose.runtime.Composable
    @androidx.compose.runtime.ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void OutlinedTextField(@m80.k final androidx.compose.ui.text.input.TextFieldValue r72, @m80.k final x00.l<? super androidx.compose.ui.text.input.TextFieldValue, yz.g2> r73, @m80.l androidx.compose.ui.Modifier r74, boolean r75, boolean r76, @m80.l androidx.compose.ui.text.TextStyle r77, @m80.l x00.p<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, yz.g2> r78, @m80.l x00.p<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, yz.g2> r79, @m80.l x00.p<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, yz.g2> r80, @m80.l x00.p<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, yz.g2> r81, boolean r82, @m80.l androidx.compose.ui.text.input.VisualTransformation r83, @m80.l androidx.compose.foundation.text.KeyboardOptions r84, @m80.l androidx.compose.foundation.text.KeyboardActions r85, boolean r86, int r87, int r88, @m80.l androidx.compose.foundation.interaction.MutableInteractionSource r89, @m80.l androidx.compose.ui.graphics.Shape r90, @m80.l androidx.compose.material.TextFieldColors r91, @m80.l androidx.compose.runtime.Composer r92, final int r93, final int r94, final int r95) {
        /*
            Method dump skipped, instructions count: 1697
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.OutlinedTextFieldKt.OutlinedTextField(androidx.compose.ui.text.input.TextFieldValue, x00.l, androidx.compose.ui.Modifier, boolean, boolean, androidx.compose.ui.text.TextStyle, x00.p, x00.p, x00.p, x00.p, boolean, androidx.compose.ui.text.input.VisualTransformation, androidx.compose.foundation.text.KeyboardOptions, androidx.compose.foundation.text.KeyboardActions, boolean, int, int, androidx.compose.foundation.interaction.MutableInteractionSource, androidx.compose.ui.graphics.Shape, androidx.compose.material.TextFieldColors, androidx.compose.runtime.Composer, int, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x04dc  */
    /* JADX WARN: Removed duplicated region for block: B:125:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x04b5  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x0262  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x0242  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x0215  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x01f9  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x01da  */
    /* JADX WARN: Removed duplicated region for block: B:214:0x01ca  */
    /* JADX WARN: Removed duplicated region for block: B:215:0x019b  */
    /* JADX WARN: Removed duplicated region for block: B:222:0x0175  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:230:0x014e  */
    /* JADX WARN: Removed duplicated region for block: B:238:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:245:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:252:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:259:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:267:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:268:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:275:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:282:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0147  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x016e  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0194  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x01b4  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x01d3  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x01f4  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0210  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x022e  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x024a  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0275  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x028c  */
    @androidx.compose.runtime.Composable
    @yz.n(level = kotlin.DeprecationLevel.HIDDEN, message = "Maintained for binary compatibility. Use version with minLines instead")
    @androidx.compose.runtime.ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final /* synthetic */ void OutlinedTextField(final androidx.compose.ui.text.input.TextFieldValue r71, final x00.l r72, androidx.compose.ui.Modifier r73, boolean r74, boolean r75, androidx.compose.ui.text.TextStyle r76, x00.p r77, x00.p r78, x00.p r79, x00.p r80, boolean r81, androidx.compose.ui.text.input.VisualTransformation r82, androidx.compose.foundation.text.KeyboardOptions r83, androidx.compose.foundation.text.KeyboardActions r84, boolean r85, int r86, androidx.compose.foundation.interaction.MutableInteractionSource r87, androidx.compose.ui.graphics.Shape r88, androidx.compose.material.TextFieldColors r89, androidx.compose.runtime.Composer r90, final int r91, final int r92, final int r93) {
        /*
            Method dump skipped, instructions count: 1268
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.OutlinedTextFieldKt.OutlinedTextField(androidx.compose.ui.text.input.TextFieldValue, x00.l, androidx.compose.ui.Modifier, boolean, boolean, androidx.compose.ui.text.TextStyle, x00.p, x00.p, x00.p, x00.p, boolean, androidx.compose.ui.text.input.VisualTransformation, androidx.compose.foundation.text.KeyboardOptions, androidx.compose.foundation.text.KeyboardActions, boolean, int, androidx.compose.foundation.interaction.MutableInteractionSource, androidx.compose.ui.graphics.Shape, androidx.compose.material.TextFieldColors, androidx.compose.runtime.Composer, int, int, int):void");
    }
}
