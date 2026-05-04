package androidx.compose.material;

import androidx.compose.foundation.BorderStroke;
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
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.drawscope.ContentDrawScope;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.layout.LayoutIdKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.unit.ConstraintsKt;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.LayoutDirection;
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
@u0({"SMAP\nTextField.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextField.kt\nandroidx/compose/material/TextFieldKt\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 4 Color.kt\nandroidx/compose/ui/graphics/ColorKt\n+ 5 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 6 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 7 Composer.kt\nandroidx/compose/runtime/Updater\n+ 8 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 9 Dp.kt\nandroidx/compose/ui/unit/Dp\n+ 10 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,1123:1\n75#2:1124\n75#2:1133\n75#2:1142\n75#2:1149\n75#2:1158\n75#2:1171\n1247#3,6:1125\n1247#3,6:1134\n1247#3,6:1143\n1247#3,6:1150\n1247#3,6:1159\n1247#3,6:1165\n708#4:1131\n696#4:1132\n708#4:1140\n696#4:1141\n708#4:1156\n696#4:1157\n79#5,6:1172\n86#5,4:1187\n90#5,2:1197\n79#5,6:1206\n86#5,4:1221\n90#5,2:1231\n94#5:1237\n79#5,6:1245\n86#5,4:1260\n90#5,2:1270\n94#5:1276\n79#5,6:1291\n86#5,4:1306\n90#5,2:1316\n94#5:1322\n79#5,6:1331\n86#5,4:1346\n90#5,2:1356\n94#5:1362\n94#5:1366\n368#6,9:1178\n377#6:1199\n368#6,9:1212\n377#6:1233\n378#6,2:1235\n368#6,9:1251\n377#6:1272\n378#6,2:1274\n368#6,9:1297\n377#6:1318\n378#6,2:1320\n368#6,9:1337\n377#6:1358\n378#6,2:1360\n378#6,2:1364\n4034#7,6:1191\n4034#7,6:1225\n4034#7,6:1264\n4034#7,6:1310\n4034#7,6:1350\n71#8:1200\n69#8,5:1201\n74#8:1234\n78#8:1238\n71#8:1239\n69#8,5:1240\n74#8:1273\n78#8:1277\n71#8:1284\n68#8,6:1285\n74#8:1319\n78#8:1323\n71#8:1324\n68#8,6:1325\n74#8:1359\n78#8:1363\n57#9:1278\n57#9:1281\n149#10:1279\n206#10:1280\n149#10:1282\n206#10:1283\n149#10:1367\n149#10:1368\n149#10:1369\n*S KotlinDebug\n*F\n+ 1 TextField.kt\nandroidx/compose/material/TextFieldKt\n*L\n182#1:1124\n330#1:1133\n408#1:1142\n521#1:1149\n599#1:1158\n658#1:1171\n199#1:1125,6\n347#1:1134,6\n419#1:1143,6\n538#1:1150,6\n610#1:1159,6\n655#1:1165,6\n201#1:1131\n201#1:1132\n349#1:1140\n349#1:1141\n540#1:1156\n540#1:1157\n659#1:1172,6\n659#1:1187,4\n659#1:1197,2\n663#1:1206,6\n663#1:1221,4\n663#1:1231,2\n663#1:1237\n671#1:1245,6\n671#1:1260,4\n671#1:1270,2\n671#1:1276\n700#1:1291,6\n700#1:1306,4\n700#1:1316,2\n700#1:1322\n702#1:1331,6\n702#1:1346,4\n702#1:1356,2\n702#1:1362\n659#1:1366\n659#1:1178,9\n659#1:1199\n663#1:1212,9\n663#1:1233\n663#1:1235,2\n671#1:1251,9\n671#1:1272\n671#1:1274,2\n700#1:1297,9\n700#1:1318\n700#1:1320,2\n702#1:1337,9\n702#1:1358\n702#1:1360,2\n659#1:1364,2\n659#1:1191,6\n663#1:1225,6\n671#1:1264,6\n700#1:1310,6\n702#1:1350,6\n663#1:1200\n663#1:1201,5\n663#1:1234\n663#1:1238\n671#1:1239\n671#1:1240,5\n671#1:1273\n671#1:1277\n700#1:1284\n700#1:1285,6\n700#1:1319\n700#1:1323\n702#1:1324\n702#1:1325,6\n702#1:1359\n702#1:1363\n685#1:1278\n691#1:1281\n685#1:1279\n685#1:1280\n691#1:1282\n691#1:1283\n1115#1:1367\n1118#1:1368\n1122#1:1369\n*E\n"})
/* loaded from: classes.dex */
public final class TextFieldKt {
    private static final float FirstBaselineOffset = Dp.m5115constructorimpl(20);
    private static final float TextFieldBottomPadding = Dp.m5115constructorimpl(10);
    private static final float TextFieldTopPadding = Dp.m5115constructorimpl(2);

    /* JADX WARN: Removed duplicated region for block: B:10:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x05f5  */
    /* JADX WARN: Removed duplicated region for block: B:137:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x05cd  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x0250  */
    /* JADX WARN: Removed duplicated region for block: B:211:0x0243  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x0227  */
    /* JADX WARN: Removed duplicated region for block: B:215:0x020b  */
    /* JADX WARN: Removed duplicated region for block: B:217:0x01ee  */
    /* JADX WARN: Removed duplicated region for block: B:218:0x01c2  */
    /* JADX WARN: Removed duplicated region for block: B:224:0x019a  */
    /* JADX WARN: Removed duplicated region for block: B:233:0x0178  */
    /* JADX WARN: Removed duplicated region for block: B:241:0x0151  */
    /* JADX WARN: Removed duplicated region for block: B:249:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:256:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:263:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:270:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:277:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:286:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:287:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:294:0x0051  */
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
    /* JADX WARN: Removed duplicated region for block: B:92:0x0270  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0286  */
    @androidx.compose.runtime.Composable
    @androidx.compose.runtime.ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void TextField(@m80.k final androidx.compose.foundation.text.input.TextFieldState r72, @m80.l androidx.compose.ui.Modifier r73, boolean r74, boolean r75, @m80.l androidx.compose.ui.text.TextStyle r76, @m80.l x00.p<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, yz.g2> r77, @m80.l x00.p<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, yz.g2> r78, @m80.l x00.p<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, yz.g2> r79, @m80.l x00.p<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, yz.g2> r80, boolean r81, @m80.l androidx.compose.foundation.text.input.InputTransformation r82, @m80.l androidx.compose.foundation.text.input.OutputTransformation r83, @m80.l androidx.compose.foundation.text.KeyboardOptions r84, @m80.l androidx.compose.foundation.text.input.KeyboardActionHandler r85, @m80.l androidx.compose.foundation.text.input.TextFieldLineLimits r86, @m80.l androidx.compose.foundation.ScrollState r87, @m80.l androidx.compose.ui.graphics.Shape r88, @m80.l androidx.compose.material.TextFieldColors r89, @m80.l androidx.compose.foundation.interaction.MutableInteractionSource r90, @m80.l androidx.compose.runtime.Composer r91, final int r92, final int r93, final int r94) {
        /*
            Method dump skipped, instructions count: 1550
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.TextFieldKt.TextField(androidx.compose.foundation.text.input.TextFieldState, androidx.compose.ui.Modifier, boolean, boolean, androidx.compose.ui.text.TextStyle, x00.p, x00.p, x00.p, x00.p, boolean, androidx.compose.foundation.text.input.InputTransformation, androidx.compose.foundation.text.input.OutputTransformation, androidx.compose.foundation.text.KeyboardOptions, androidx.compose.foundation.text.input.KeyboardActionHandler, androidx.compose.foundation.text.input.TextFieldLineLimits, androidx.compose.foundation.ScrollState, androidx.compose.ui.graphics.Shape, androidx.compose.material.TextFieldColors, androidx.compose.foundation.interaction.MutableInteractionSource, androidx.compose.runtime.Composer, int, int, int):void");
    }

    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    public static final void TextFieldLayout(@k final Modifier modifier, @k final p<? super Composer, ? super Integer, g2> pVar, @l final p<? super Composer, ? super Integer, g2> pVar2, @l final q<? super Modifier, ? super Composer, ? super Integer, g2> qVar, @l final p<? super Composer, ? super Integer, g2> pVar3, @l final p<? super Composer, ? super Integer, g2> pVar4, final boolean z11, final float f11, @k final PaddingValues paddingValues, @l Composer composer, final int i11) {
        int i12;
        int i13;
        Composer startRestartGroup = composer.startRestartGroup(-2112507061);
        if ((i11 & 6) == 0) {
            i12 = (startRestartGroup.changed(modifier) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= startRestartGroup.changedInstance(pVar) ? 32 : 16;
        }
        if ((i11 & 384) == 0) {
            i12 |= startRestartGroup.changedInstance(pVar2) ? 256 : 128;
        }
        if ((i11 & 3072) == 0) {
            i12 |= startRestartGroup.changedInstance(qVar) ? 2048 : 1024;
        }
        if ((i11 & 24576) == 0) {
            i12 |= startRestartGroup.changedInstance(pVar3) ? 16384 : 8192;
        }
        if ((196608 & i11) == 0) {
            i12 |= startRestartGroup.changedInstance(pVar4) ? 131072 : 65536;
        }
        if ((1572864 & i11) == 0) {
            i12 |= startRestartGroup.changed(z11) ? 1048576 : 524288;
        }
        if ((12582912 & i11) == 0) {
            i12 |= startRestartGroup.changed(f11) ? 8388608 : 4194304;
        }
        if ((100663296 & i11) == 0) {
            i12 |= startRestartGroup.changed(paddingValues) ? 67108864 : 33554432;
        }
        if (startRestartGroup.shouldExecute((38347923 & i12) != 38347922, i12 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-2112507061, i12, -1, "androidx.compose.material.TextFieldLayout (TextField.kt:652)");
            }
            boolean z12 = ((3670016 & i12) == 1048576) | ((29360128 & i12) == 8388608) | ((234881024 & i12) == 67108864);
            Object rememberedValue = startRestartGroup.rememberedValue();
            if (z12 || rememberedValue == Composer.Companion.getEmpty()) {
                rememberedValue = new TextFieldMeasurePolicy(z11, f11, paddingValues);
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            TextFieldMeasurePolicy textFieldMeasurePolicy = (TextFieldMeasurePolicy) rememberedValue;
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
            Updater.m1958setimpl(m1951constructorimpl, textFieldMeasurePolicy, companion.getSetMeasurePolicy());
            Updater.m1958setimpl(m1951constructorimpl, currentCompositionLocalMap, companion.getSetResolvedCompositionLocals());
            p<ComposeUiNode, Integer, g2> setCompositeKeyHash = companion.getSetCompositeKeyHash();
            if (m1951constructorimpl.getInserting() || !g0.g(m1951constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                m1951constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                m1951constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m1958setimpl(m1951constructorimpl, materializeModifier, companion.getSetModifier());
            if (pVar3 != null) {
                startRestartGroup.startReplaceGroup(79117075);
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
                pVar3.invoke(startRestartGroup, Integer.valueOf((i12 >> 12) & 14));
                startRestartGroup.endNode();
                startRestartGroup.endReplaceGroup();
            } else {
                startRestartGroup.startReplaceGroup(79362130);
                startRestartGroup.endReplaceGroup();
            }
            if (pVar4 != null) {
                startRestartGroup.startReplaceGroup(79404817);
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
                pVar4.invoke(startRestartGroup, Integer.valueOf((i12 >> 15) & 14));
                startRestartGroup.endNode();
                startRestartGroup.endReplaceGroup();
            } else {
                startRestartGroup.startReplaceGroup(79651794);
                startRestartGroup.endReplaceGroup();
            }
            float calculateStartPadding = PaddingKt.calculateStartPadding(paddingValues, layoutDirection);
            float calculateEndPadding = PaddingKt.calculateEndPadding(paddingValues, layoutDirection);
            Modifier.Companion companion2 = Modifier.Companion;
            if (pVar3 != null) {
                i13 = 0;
                calculateStartPadding = Dp.m5115constructorimpl(u.t(Dp.m5115constructorimpl(calculateStartPadding - TextFieldImplKt.getHorizontalIconPadding()), Dp.m5115constructorimpl(0)));
            } else {
                i13 = 0;
            }
            float f12 = calculateStartPadding;
            if (pVar4 != null) {
                calculateEndPadding = Dp.m5115constructorimpl(u.t(Dp.m5115constructorimpl(calculateEndPadding - TextFieldImplKt.getHorizontalIconPadding()), Dp.m5115constructorimpl(i13)));
            }
            Modifier m730paddingqDBjuR0$default = PaddingKt.m730paddingqDBjuR0$default(companion2, f12, 0.0f, calculateEndPadding, 0.0f, 10, null);
            if (qVar != null) {
                startRestartGroup.startReplaceGroup(80502775);
                qVar.invoke(LayoutIdKt.layoutId(companion2, TextFieldImplKt.PlaceholderId).then(m730paddingqDBjuR0$default), startRestartGroup, Integer.valueOf((i12 >> 6) & 112));
                startRestartGroup.endReplaceGroup();
            } else {
                startRestartGroup.startReplaceGroup(80590226);
                startRestartGroup.endReplaceGroup();
            }
            if (pVar2 != null) {
                startRestartGroup.startReplaceGroup(80624729);
                Modifier then = LayoutIdKt.layoutId(companion2, TextFieldImplKt.LabelId).then(m730paddingqDBjuR0$default);
                MeasurePolicy maybeCachedBoxMeasurePolicy3 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.getTopStart(), false);
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
                pVar2.invoke(startRestartGroup, Integer.valueOf((i12 >> 6) & 14));
                startRestartGroup.endNode();
                startRestartGroup.endReplaceGroup();
            } else {
                startRestartGroup.startReplaceGroup(80710258);
                startRestartGroup.endReplaceGroup();
            }
            Modifier then2 = LayoutIdKt.layoutId(companion2, TextFieldImplKt.TextFieldId).then(m730paddingqDBjuR0$default);
            MeasurePolicy maybeCachedBoxMeasurePolicy4 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.getTopStart(), true);
            int currentCompositeKeyHash5 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap5 = startRestartGroup.getCurrentCompositionLocalMap();
            Modifier materializeModifier5 = ComposedModifierKt.materializeModifier(startRestartGroup, then2);
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
            BoxScopeInstance boxScopeInstance4 = BoxScopeInstance.INSTANCE;
            pVar.invoke(startRestartGroup, Integer.valueOf((i12 >> 3) & 14));
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
            endRestartGroup.updateScope(new p<Composer, Integer, g2>() { // from class: androidx.compose.material.TextFieldKt$TextFieldLayout$2
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

                public final void invoke(Composer composer2, int i14) {
                    TextFieldKt.TextFieldLayout(Modifier.this, pVar, pVar2, qVar, pVar3, pVar4, z11, f11, paddingValues, composer2, RecomposeScopeImplKt.updateChangedFlags(i11 | 1));
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: calculateHeight-O3s9Psw, reason: not valid java name */
    public static final int m1841calculateHeightO3s9Psw(int i11, boolean z11, int i12, int i13, int i14, int i15, long j11, float f11, PaddingValues paddingValues) {
        float f12 = TextFieldTopPadding * f11;
        float mo678calculateTopPaddingD9Ej5fM = paddingValues.mo678calculateTopPaddingD9Ej5fM() * f11;
        float mo675calculateBottomPaddingD9Ej5fM = paddingValues.mo675calculateBottomPaddingD9Ej5fM() * f11;
        int max = Math.max(i11, i15);
        return ConstraintsKt.m5084constrainHeightK40F9xA(j11, Math.max(d.L0(z11 ? i12 + f12 + max + mo675calculateBottomPaddingD9Ej5fM : mo678calculateTopPaddingD9Ej5fM + max + mo675calculateBottomPaddingD9Ej5fM), Math.max(i13, i14)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: calculateWidth-VsPV1Ek, reason: not valid java name */
    public static final int m1842calculateWidthVsPV1Ek(int i11, int i12, int i13, int i14, int i15, long j11) {
        return ConstraintsKt.m5085constrainWidthK40F9xA(j11, i11 + Math.max(i13, Math.max(i14, i15)) + i12);
    }

    @k
    public static final Modifier drawIndicatorLine(@k Modifier modifier, @k final BorderStroke borderStroke) {
        final float m261getWidthD9Ej5fM = borderStroke.m261getWidthD9Ej5fM();
        return DrawModifierKt.drawWithContent(modifier, new x00.l<ContentDrawScope, g2>() { // from class: androidx.compose.material.TextFieldKt$drawIndicatorLine$1
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
                contentDrawScope.drawContent();
                if (Dp.m5120equalsimpl0(m261getWidthD9Ej5fM, Dp.Companion.m5133getHairlineD9Ej5fM())) {
                    return;
                }
                float density = m261getWidthD9Ej5fM * contentDrawScope.getDensity();
                float m2334getHeightimpl = Size.m2334getHeightimpl(contentDrawScope.mo3060getSizeNHjbRc()) - (density / 2);
                DrawScope.m3045drawLine1RTmtNc$default(contentDrawScope, borderStroke.getBrush(), OffsetKt.Offset(0.0f, m2334getHeightimpl), OffsetKt.Offset(Size.m2337getWidthimpl(contentDrawScope.mo3060getSizeNHjbRc()), m2334getHeightimpl), density, 0, null, 0.0f, null, 0, 496, null);
            }
        });
    }

    public static final float getFirstBaselineOffset() {
        return FirstBaselineOffset;
    }

    public static final float getTextFieldBottomPadding() {
        return TextFieldBottomPadding;
    }

    public static final float getTextFieldTopPadding() {
        return TextFieldTopPadding;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void placeWithLabel(Placeable.PlacementScope placementScope, int i11, int i12, Placeable placeable, Placeable placeable2, Placeable placeable3, Placeable placeable4, Placeable placeable5, boolean z11, int i13, int i14, float f11, float f12) {
        if (placeable4 != null) {
            Placeable.PlacementScope.placeRelative$default(placementScope, placeable4, 0, Alignment.Companion.getCenterVertically().align(placeable4.getHeight(), i12), 0.0f, 4, null);
        }
        if (placeable5 != null) {
            Placeable.PlacementScope.placeRelative$default(placementScope, placeable5, i11 - placeable5.getWidth(), Alignment.Companion.getCenterVertically().align(placeable5.getHeight(), i12), 0.0f, 4, null);
        }
        if (placeable2 != null) {
            Placeable.PlacementScope.placeRelative$default(placementScope, placeable2, TextFieldImplKt.widthOrZero(placeable4), (z11 ? Alignment.Companion.getCenterVertically().align(placeable2.getHeight(), i12) : d.L0(TextFieldImplKt.getTextFieldPadding() * f12)) - d.L0((r0 - i13) * f11), 0.0f, 4, null);
        }
        Placeable.PlacementScope.placeRelative$default(placementScope, placeable, TextFieldImplKt.widthOrZero(placeable4), i14, 0.0f, 4, null);
        if (placeable3 != null) {
            Placeable.PlacementScope.placeRelative$default(placementScope, placeable3, TextFieldImplKt.widthOrZero(placeable4), i14, 0.0f, 4, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void placeWithoutLabel(Placeable.PlacementScope placementScope, int i11, int i12, Placeable placeable, Placeable placeable2, Placeable placeable3, Placeable placeable4, boolean z11, float f11, PaddingValues paddingValues) {
        int L0 = d.L0(paddingValues.mo678calculateTopPaddingD9Ej5fM() * f11);
        if (placeable3 != null) {
            Placeable.PlacementScope.placeRelative$default(placementScope, placeable3, 0, Alignment.Companion.getCenterVertically().align(placeable3.getHeight(), i12), 0.0f, 4, null);
        }
        if (placeable4 != null) {
            Placeable.PlacementScope.placeRelative$default(placementScope, placeable4, i11 - placeable4.getWidth(), Alignment.Companion.getCenterVertically().align(placeable4.getHeight(), i12), 0.0f, 4, null);
        }
        Placeable.PlacementScope.placeRelative$default(placementScope, placeable, TextFieldImplKt.widthOrZero(placeable3), z11 ? Alignment.Companion.getCenterVertically().align(placeable.getHeight(), i12) : L0, 0.0f, 4, null);
        if (placeable2 != null) {
            if (z11) {
                L0 = Alignment.Companion.getCenterVertically().align(placeable2.getHeight(), i12);
            }
            Placeable.PlacementScope.placeRelative$default(placementScope, placeable2, TextFieldImplKt.widthOrZero(placeable3), L0, 0.0f, 4, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int substractConstraintSafely(int i11, int i12) {
        return i11 == Integer.MAX_VALUE ? i11 : i11 - i12;
    }

    /* JADX WARN: Removed duplicated region for block: B:104:0x02a7  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x0662  */
    /* JADX WARN: Removed duplicated region for block: B:144:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:211:0x0638  */
    /* JADX WARN: Removed duplicated region for block: B:214:0x0280  */
    /* JADX WARN: Removed duplicated region for block: B:216:0x0262  */
    /* JADX WARN: Removed duplicated region for block: B:217:0x0233  */
    /* JADX WARN: Removed duplicated region for block: B:224:0x0215  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:232:0x0208  */
    /* JADX WARN: Removed duplicated region for block: B:233:0x01d8  */
    /* JADX WARN: Removed duplicated region for block: B:240:0x01c8  */
    /* JADX WARN: Removed duplicated region for block: B:241:0x0199  */
    /* JADX WARN: Removed duplicated region for block: B:248:0x0173  */
    /* JADX WARN: Removed duplicated region for block: B:256:0x014c  */
    /* JADX WARN: Removed duplicated region for block: B:264:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:271:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:278:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:285:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:293:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:294:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:301:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:308:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00c7  */
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
    public static final void TextField(@m80.k final java.lang.String r72, @m80.k final x00.l<? super java.lang.String, yz.g2> r73, @m80.l androidx.compose.ui.Modifier r74, boolean r75, boolean r76, @m80.l androidx.compose.ui.text.TextStyle r77, @m80.l x00.p<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, yz.g2> r78, @m80.l x00.p<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, yz.g2> r79, @m80.l x00.p<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, yz.g2> r80, @m80.l x00.p<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, yz.g2> r81, boolean r82, @m80.l androidx.compose.ui.text.input.VisualTransformation r83, @m80.l androidx.compose.foundation.text.KeyboardOptions r84, @m80.l androidx.compose.foundation.text.KeyboardActions r85, boolean r86, int r87, int r88, @m80.l androidx.compose.foundation.interaction.MutableInteractionSource r89, @m80.l androidx.compose.ui.graphics.Shape r90, @m80.l androidx.compose.material.TextFieldColors r91, @m80.l androidx.compose.runtime.Composer r92, final int r93, final int r94, final int r95) {
        /*
            Method dump skipped, instructions count: 1658
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.TextFieldKt.TextField(java.lang.String, x00.l, androidx.compose.ui.Modifier, boolean, boolean, androidx.compose.ui.text.TextStyle, x00.p, x00.p, x00.p, x00.p, boolean, androidx.compose.ui.text.input.VisualTransformation, androidx.compose.foundation.text.KeyboardOptions, androidx.compose.foundation.text.KeyboardActions, boolean, int, int, androidx.compose.foundation.interaction.MutableInteractionSource, androidx.compose.ui.graphics.Shape, androidx.compose.material.TextFieldColors, androidx.compose.runtime.Composer, int, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x04fe  */
    /* JADX WARN: Removed duplicated region for block: B:125:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x04d7  */
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
    public static final /* synthetic */ void TextField(final java.lang.String r71, final x00.l r72, androidx.compose.ui.Modifier r73, boolean r74, boolean r75, androidx.compose.ui.text.TextStyle r76, x00.p r77, x00.p r78, x00.p r79, x00.p r80, boolean r81, androidx.compose.ui.text.input.VisualTransformation r82, androidx.compose.foundation.text.KeyboardOptions r83, androidx.compose.foundation.text.KeyboardActions r84, boolean r85, int r86, androidx.compose.foundation.interaction.MutableInteractionSource r87, androidx.compose.ui.graphics.Shape r88, androidx.compose.material.TextFieldColors r89, androidx.compose.runtime.Composer r90, final int r91, final int r92, final int r93) {
        /*
            Method dump skipped, instructions count: 1302
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.TextFieldKt.TextField(java.lang.String, x00.l, androidx.compose.ui.Modifier, boolean, boolean, androidx.compose.ui.text.TextStyle, x00.p, x00.p, x00.p, x00.p, boolean, androidx.compose.ui.text.input.VisualTransformation, androidx.compose.foundation.text.KeyboardOptions, androidx.compose.foundation.text.KeyboardActions, boolean, int, androidx.compose.foundation.interaction.MutableInteractionSource, androidx.compose.ui.graphics.Shape, androidx.compose.material.TextFieldColors, androidx.compose.runtime.Composer, int, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:104:0x02a7  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x0662  */
    /* JADX WARN: Removed duplicated region for block: B:144:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:211:0x0638  */
    /* JADX WARN: Removed duplicated region for block: B:214:0x0280  */
    /* JADX WARN: Removed duplicated region for block: B:216:0x0262  */
    /* JADX WARN: Removed duplicated region for block: B:217:0x0233  */
    /* JADX WARN: Removed duplicated region for block: B:224:0x0215  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:232:0x0208  */
    /* JADX WARN: Removed duplicated region for block: B:233:0x01d8  */
    /* JADX WARN: Removed duplicated region for block: B:240:0x01c8  */
    /* JADX WARN: Removed duplicated region for block: B:241:0x0199  */
    /* JADX WARN: Removed duplicated region for block: B:248:0x0173  */
    /* JADX WARN: Removed duplicated region for block: B:256:0x014c  */
    /* JADX WARN: Removed duplicated region for block: B:264:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:271:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:278:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:285:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:293:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:294:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:301:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:308:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00c7  */
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
    public static final void TextField(@m80.k final androidx.compose.ui.text.input.TextFieldValue r72, @m80.k final x00.l<? super androidx.compose.ui.text.input.TextFieldValue, yz.g2> r73, @m80.l androidx.compose.ui.Modifier r74, boolean r75, boolean r76, @m80.l androidx.compose.ui.text.TextStyle r77, @m80.l x00.p<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, yz.g2> r78, @m80.l x00.p<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, yz.g2> r79, @m80.l x00.p<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, yz.g2> r80, @m80.l x00.p<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, yz.g2> r81, boolean r82, @m80.l androidx.compose.ui.text.input.VisualTransformation r83, @m80.l androidx.compose.foundation.text.KeyboardOptions r84, @m80.l androidx.compose.foundation.text.KeyboardActions r85, boolean r86, int r87, int r88, @m80.l androidx.compose.foundation.interaction.MutableInteractionSource r89, @m80.l androidx.compose.ui.graphics.Shape r90, @m80.l androidx.compose.material.TextFieldColors r91, @m80.l androidx.compose.runtime.Composer r92, final int r93, final int r94, final int r95) {
        /*
            Method dump skipped, instructions count: 1658
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.TextFieldKt.TextField(androidx.compose.ui.text.input.TextFieldValue, x00.l, androidx.compose.ui.Modifier, boolean, boolean, androidx.compose.ui.text.TextStyle, x00.p, x00.p, x00.p, x00.p, boolean, androidx.compose.ui.text.input.VisualTransformation, androidx.compose.foundation.text.KeyboardOptions, androidx.compose.foundation.text.KeyboardActions, boolean, int, int, androidx.compose.foundation.interaction.MutableInteractionSource, androidx.compose.ui.graphics.Shape, androidx.compose.material.TextFieldColors, androidx.compose.runtime.Composer, int, int, int):void");
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
    public static final /* synthetic */ void TextField(final androidx.compose.ui.text.input.TextFieldValue r71, final x00.l r72, androidx.compose.ui.Modifier r73, boolean r74, boolean r75, androidx.compose.ui.text.TextStyle r76, x00.p r77, x00.p r78, x00.p r79, x00.p r80, boolean r81, androidx.compose.ui.text.input.VisualTransformation r82, androidx.compose.foundation.text.KeyboardOptions r83, androidx.compose.foundation.text.KeyboardActions r84, boolean r85, int r86, androidx.compose.foundation.interaction.MutableInteractionSource r87, androidx.compose.ui.graphics.Shape r88, androidx.compose.material.TextFieldColors r89, androidx.compose.runtime.Composer r90, final int r91, final int r92, final int r93) {
        /*
            Method dump skipped, instructions count: 1268
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.TextFieldKt.TextField(androidx.compose.ui.text.input.TextFieldValue, x00.l, androidx.compose.ui.Modifier, boolean, boolean, androidx.compose.ui.text.TextStyle, x00.p, x00.p, x00.p, x00.p, boolean, androidx.compose.ui.text.input.VisualTransformation, androidx.compose.foundation.text.KeyboardOptions, androidx.compose.foundation.text.KeyboardActions, boolean, int, androidx.compose.foundation.interaction.MutableInteractionSource, androidx.compose.ui.graphics.Shape, androidx.compose.material.TextFieldColors, androidx.compose.runtime.Composer, int, int, int):void");
    }
}
