package com.baicizhan.main.vld.bonding;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.ScrollKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.shape.CornerBasedShape;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
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
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.OnRemeasuredModifierKt;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.res.StringResources_androidKt;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.tooling.preview.Preview;
import androidx.compose.ui.tooling.preview.PreviewParameter;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.TextUnitKt;
import com.baicizhan.platform.base.widget.s4;
import com.jiongji.andriod.card.R;
import java.util.List;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@kotlin.jvm.internal.u0({"SMAP\nDeviceBondingTipActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DeviceBondingTipActivity.kt\ncom/baicizhan/main/vld/bonding/DeviceBondingTipActivityKt\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 Row.kt\nandroidx/compose/foundation/layout/RowKt\n+ 5 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 6 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 7 Composer.kt\nandroidx/compose/runtime/Updater\n+ 8 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 9 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n+ 10 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 11 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 12 IntSize.kt\nandroidx/compose/ui/unit/IntSize\n+ 13 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 14 Dp.kt\nandroidx/compose/ui/unit/Dp\n*L\n1#1,223:1\n75#2:224\n113#3:225\n113#3:266\n113#3:308\n113#3:350\n113#3:351\n113#3:356\n113#3:400\n113#3:496\n113#3:497\n113#3:542\n113#3:584\n113#3:589\n123#3:602\n113#3:603\n99#4:226\n96#4,9:227\n106#4:408\n79#5,6:236\n86#5,3:251\n89#5,2:260\n79#5,6:281\n86#5,3:296\n89#5,2:305\n79#5,6:319\n86#5,3:334\n89#5,2:343\n93#5:348\n93#5:354\n79#5,6:373\n86#5,3:388\n89#5,2:397\n93#5:403\n93#5:407\n79#5,6:432\n86#5,3:447\n89#5,2:456\n79#5,6:469\n86#5,3:484\n89#5,2:493\n79#5,6:508\n86#5,3:523\n89#5,2:532\n93#5:540\n79#5,6:553\n86#5,3:568\n89#5,2:577\n93#5:582\n93#5:587\n93#5:598\n347#6,9:242\n356#6:262\n347#6,9:287\n356#6:307\n347#6,9:325\n356#6,3:345\n357#6,2:352\n347#6,9:379\n356#6:399\n357#6,2:401\n357#6,2:405\n347#6,9:438\n356#6:458\n347#6,9:475\n356#6:495\n347#6,9:514\n356#6:534\n357#6,2:538\n347#6,9:559\n356#6,3:579\n357#6,2:585\n357#6,2:596\n4206#7,6:254\n4206#7,6:299\n4206#7,6:337\n4206#7,6:391\n4206#7,6:450\n4206#7,6:487\n4206#7,6:526\n4206#7,6:571\n1247#8,3:263\n1250#8,3:267\n1247#8,6:357\n1247#8,6:409\n1247#8,6:415\n1247#8,6:590\n87#9:270\n83#9,10:271\n94#9:355\n87#9:363\n84#9,9:364\n94#9:404\n87#9:421\n83#9,10:422\n87#9:459\n84#9,9:460\n87#9:498\n84#9,9:499\n94#9:541\n94#9:588\n94#9:599\n70#10:309\n67#10,9:310\n77#10:349\n70#10:543\n67#10,9:544\n77#10:583\n1878#11,3:535\n59#12:600\n90#13:601\n52#14:604\n*S KotlinDebug\n*F\n+ 1 DeviceBondingTipActivity.kt\ncom/baicizhan/main/vld/bonding/DeviceBondingTipActivityKt\n*L\n146#1:224\n147#1:225\n148#1:266\n152#1:308\n167#1:350\n168#1:351\n173#1:356\n192#1:400\n92#1:496\n95#1:497\n105#1:542\n119#1:584\n127#1:589\n178#1:602\n178#1:603\n147#1:226\n147#1:227,9\n147#1:408\n147#1:236,6\n147#1:251,3\n147#1:260,2\n149#1:281,6\n149#1:296,3\n149#1:305,2\n150#1:319,6\n150#1:334,3\n150#1:343,2\n150#1:348\n149#1:354\n174#1:373,6\n174#1:388,3\n174#1:397,2\n174#1:403\n147#1:407\n85#1:432,6\n85#1:447,3\n85#1:456,2\n87#1:469,6\n87#1:484,3\n87#1:493,2\n93#1:508,6\n93#1:523,3\n93#1:532,2\n93#1:540\n103#1:553,6\n103#1:568,3\n103#1:577,2\n103#1:582\n87#1:587\n85#1:598\n147#1:242,9\n147#1:262\n149#1:287,9\n149#1:307\n150#1:325,9\n150#1:345,3\n149#1:352,2\n174#1:379,9\n174#1:399\n174#1:401,2\n147#1:405,2\n85#1:438,9\n85#1:458\n87#1:475,9\n87#1:495\n93#1:514,9\n93#1:534\n93#1:538,2\n103#1:559,9\n103#1:579,3\n87#1:585,2\n85#1:596,2\n147#1:254,6\n149#1:299,6\n150#1:337,6\n174#1:391,6\n85#1:450,6\n87#1:487,6\n93#1:526,6\n103#1:571,6\n148#1:263,3\n148#1:267,3\n177#1:357,6\n222#1:409,6\n83#1:415,6\n123#1:590,6\n149#1:270\n149#1:271,10\n149#1:355\n174#1:363\n174#1:364,9\n174#1:404\n85#1:421\n85#1:422,10\n87#1:459\n87#1:460,9\n93#1:498\n93#1:499,9\n93#1:541\n87#1:588\n85#1:599\n150#1:309\n150#1:310,9\n150#1:349\n103#1:543\n103#1:544,9\n103#1:583\n98#1:535,3\n178#1:600\n178#1:601\n178#1:604\n*E\n"})
/* loaded from: classes4.dex */
public final class r2 {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public static final List<s2> f25468a = a00.h0.Q(new s2("设备开机，打开手机蓝牙、网络", "确保单词机开机，手机蓝牙、网络打开"), new s2("设备绑定", "通过扫码进行单词机与手机绑定"), new s2("选择可用Wi-Fi，并输入密码", "点击下方开始配网按钮，进入配网界面，选择Wi-Fi并输入Wi-Fi密码，开始配网"), new s2("配网成功", "单词机显示配网成功即网络配置完成"));

    public static final yz.g2 A(x00.a aVar) {
        aVar.invoke();
        return yz.g2.f100423a;
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final yz.g2 B(final x00.a aVar, PaddingValues it, Composer composer, int i11) {
        kotlin.jvm.internal.g0.p(it, "it");
        if (composer.shouldExecute((i11 & 17) != 16, i11 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1716546965, i11, -1, "com.baicizhan.main.vld.bonding.TipsContent.<anonymous>.<anonymous> (DeviceBondingTipActivity.kt:84)");
            }
            Modifier.Companion companion = Modifier.Companion;
            Arrangement arrangement = Arrangement.INSTANCE;
            Arrangement.Vertical top = arrangement.getTop();
            Alignment.Companion companion2 = Alignment.Companion;
            MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(top, companion2.getStart(), composer, 0);
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
            CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
            Modifier materializeModifier = ComposedModifierKt.materializeModifier(composer, companion);
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
            Updater.m1958setimpl(m1951constructorimpl, columnMeasurePolicy, companion3.getSetMeasurePolicy());
            Updater.m1958setimpl(m1951constructorimpl, currentCompositionLocalMap, companion3.getSetResolvedCompositionLocals());
            x00.p<ComposeUiNode, Integer, yz.g2> setCompositeKeyHash = companion3.getSetCompositeKeyHash();
            if (m1951constructorimpl.getInserting() || !kotlin.jvm.internal.g0.g(m1951constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                m1951constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                m1951constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m1958setimpl(m1951constructorimpl, materializeModifier, companion3.getSetModifier());
            Modifier verticalScroll$default = ScrollKt.verticalScroll$default(ColumnScope.weight$default(ColumnScopeInstance.INSTANCE, companion, 1.0f, false, 2, null), ScrollKt.rememberScrollState(0, composer, 0, 1), false, null, false, 14, null);
            MeasurePolicy columnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(arrangement.getTop(), companion2.getStart(), composer, 0);
            int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
            CompositionLocalMap currentCompositionLocalMap2 = composer.getCurrentCompositionLocalMap();
            Modifier materializeModifier2 = ComposedModifierKt.materializeModifier(composer, verticalScroll$default);
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
            Updater.m1958setimpl(m1951constructorimpl2, columnMeasurePolicy2, companion3.getSetMeasurePolicy());
            Updater.m1958setimpl(m1951constructorimpl2, currentCompositionLocalMap2, companion3.getSetResolvedCompositionLocals());
            x00.p<ComposeUiNode, Integer, yz.g2> setCompositeKeyHash2 = companion3.getSetCompositeKeyHash();
            if (m1951constructorimpl2.getInserting() || !kotlin.jvm.internal.g0.g(m1951constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                m1951constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                m1951constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
            }
            Updater.m1958setimpl(m1951constructorimpl2, materializeModifier2, companion3.getSetModifier());
            SpacerKt.Spacer(SizeKt.m759height3ABfNKs(companion, Dp.m5115constructorimpl(24)), composer, 6);
            Modifier fillMaxWidth$default = SizeKt.fillMaxWidth$default(PaddingKt.m727paddingVpY3zN4(companion, Dp.m5115constructorimpl(34), Dp.m5115constructorimpl(6)), 0.0f, 1, null);
            MeasurePolicy columnMeasurePolicy3 = ColumnKt.columnMeasurePolicy(arrangement.getTop(), companion2.getStart(), composer, 0);
            int currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
            CompositionLocalMap currentCompositionLocalMap3 = composer.getCurrentCompositionLocalMap();
            Modifier materializeModifier3 = ComposedModifierKt.materializeModifier(composer, fillMaxWidth$default);
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
            Updater.m1958setimpl(m1951constructorimpl3, columnMeasurePolicy3, companion3.getSetMeasurePolicy());
            Updater.m1958setimpl(m1951constructorimpl3, currentCompositionLocalMap3, companion3.getSetResolvedCompositionLocals());
            x00.p<ComposeUiNode, Integer, yz.g2> setCompositeKeyHash3 = companion3.getSetCompositeKeyHash();
            if (m1951constructorimpl3.getInserting() || !kotlin.jvm.internal.g0.g(m1951constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                m1951constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                m1951constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
            }
            Updater.m1958setimpl(m1951constructorimpl3, materializeModifier3, companion3.getSetModifier());
            composer.startReplaceGroup(-1360815946);
            int i12 = 0;
            for (Object obj : f25468a) {
                int i13 = i12 + 1;
                if (i12 < 0) {
                    a00.h0.b0();
                }
                r(i13, i12 < f25468a.size() - 1, (s2) obj, composer, 0);
                i12 = i13;
            }
            composer.endReplaceGroup();
            composer.endNode();
            Modifier.Companion companion4 = Modifier.Companion;
            Modifier m728paddingVpY3zN4$default = PaddingKt.m728paddingVpY3zN4$default(companion4, Dp.m5115constructorimpl(20), 0.0f, 2, null);
            MaterialTheme materialTheme = MaterialTheme.INSTANCE;
            int i14 = MaterialTheme.$stable;
            Modifier m234backgroundbw27NRU = BackgroundKt.m234backgroundbw27NRU(m728paddingVpY3zN4$default, bk.b.L(materialTheme.getColors(composer, i14)), materialTheme.getShapes(composer, i14).getSmall());
            MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.getTopStart(), false);
            int currentCompositeKeyHash4 = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
            CompositionLocalMap currentCompositionLocalMap4 = composer.getCurrentCompositionLocalMap();
            Modifier materializeModifier4 = ComposedModifierKt.materializeModifier(composer, m234backgroundbw27NRU);
            ComposeUiNode.Companion companion5 = ComposeUiNode.Companion;
            x00.a<ComposeUiNode> constructor4 = companion5.getConstructor();
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
            Updater.m1958setimpl(m1951constructorimpl4, maybeCachedBoxMeasurePolicy, companion5.getSetMeasurePolicy());
            Updater.m1958setimpl(m1951constructorimpl4, currentCompositionLocalMap4, companion5.getSetResolvedCompositionLocals());
            x00.p<ComposeUiNode, Integer, yz.g2> setCompositeKeyHash4 = companion5.getSetCompositeKeyHash();
            if (m1951constructorimpl4.getInserting() || !kotlin.jvm.internal.g0.g(m1951constructorimpl4.rememberedValue(), Integer.valueOf(currentCompositeKeyHash4))) {
                m1951constructorimpl4.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash4));
                m1951constructorimpl4.apply(Integer.valueOf(currentCompositeKeyHash4), setCompositeKeyHash4);
            }
            Updater.m1958setimpl(m1951constructorimpl4, materializeModifier4, companion5.getSetModifier());
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            TextKt.m1845Text4IGK_g("注：暂不支持5G Wi-Fi、双频合一的Wi-Fi（请选择2.4GWi-Fi）、隐藏Wi-Fi、需要认证网络、光猫一体路由器（CMCC开头和ChinaNet）\n\nWi-Fi密码请不要输入中文或特殊字符，请不要复制粘贴，注意空格，区分大小写。", SizeKt.fillMaxWidth$default(PaddingKt.m726padding3ABfNKs(companion4, bk.d.c()), 0.0f, 1, null), 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, TextUnitKt.getSp(20), 0, false, 0, 0, (x00.l<? super TextLayoutResult, yz.g2>) null, TextStyle.m4572copyp1EtxEg$default(materialTheme.getTypography(composer, i14).getSubtitle2(), 0L, 0L, FontWeight.Companion.getNormal(), null, null, null, null, 0L, null, null, null, 0L, null, null, null, 0, 0, 0L, null, null, null, 0, 0, null, 16777211, null), composer, 48, 6, 64508);
            composer.endNode();
            SpacerKt.Spacer(SizeKt.m759height3ABfNKs(companion4, Dp.m5115constructorimpl(40)), composer, 6);
            composer.endNode();
            String stringResource = StringResources_androidKt.stringResource(R.string.devices_bonding_tip_btn_bond, composer, 6);
            CornerBasedShape medium = materialTheme.getShapes(composer, i14).getMedium();
            Modifier fillMaxWidth$default2 = SizeKt.fillMaxWidth$default(PaddingKt.m729paddingqDBjuR0(companion4, bk.d.c(), Dp.m5115constructorimpl(12), bk.d.c(), bk.d.c()), 0.0f, 1, null);
            boolean changed = composer.changed(aVar);
            Object rememberedValue = composer.rememberedValue();
            if (changed || rememberedValue == Composer.Companion.getEmpty()) {
                rememberedValue = new x00.a() { // from class: com.baicizhan.main.vld.bonding.l2
                    @Override // x00.a
                    public final Object invoke() {
                        yz.g2 C;
                        C = r2.C(x00.a.this);
                        return C;
                    }
                };
                composer.updateRememberedValue(rememberedValue);
            }
            com.baicizhan.platform.base.widget.r.I(fillMaxWidth$default2, (x00.a) rememberedValue, stringResource, 0L, null, 0, false, false, medium, null, null, composer, 6, 0, 1784);
            composer.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return yz.g2.f100423a;
    }

    public static final yz.g2 C(x00.a aVar) {
        aVar.invoke();
        return yz.g2.f100423a;
    }

    public static final yz.g2 D(x00.a aVar, x00.a aVar2, int i11, Composer composer, int i12) {
        x(aVar, aVar2, composer, RecomposeScopeImplKt.updateChangedFlags(i11 | 1));
        return yz.g2.f100423a;
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    @Preview(showBackground = true)
    public static final void n(@m80.l Composer composer, final int i11) {
        Composer startRestartGroup = composer.startRestartGroup(1204579300);
        if (startRestartGroup.shouldExecute(i11 != 0, i11 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1204579300, i11, -1, "com.baicizhan.main.vld.bonding.DefaultPreview (DeviceBondingTipActivity.kt:220)");
            }
            Object rememberedValue = startRestartGroup.rememberedValue();
            Composer.Companion companion = Composer.Companion;
            if (rememberedValue == companion.getEmpty()) {
                rememberedValue = new x00.a() { // from class: com.baicizhan.main.vld.bonding.m2
                    @Override // x00.a
                    public final Object invoke() {
                        yz.g2 o11;
                        o11 = r2.o();
                        return o11;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            x00.a aVar = (x00.a) rememberedValue;
            Object rememberedValue2 = startRestartGroup.rememberedValue();
            if (rememberedValue2 == companion.getEmpty()) {
                rememberedValue2 = new x00.a() { // from class: com.baicizhan.main.vld.bonding.n2
                    @Override // x00.a
                    public final Object invoke() {
                        yz.g2 p11;
                        p11 = r2.p();
                        return p11;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue2);
            }
            x(aVar, (x00.a) rememberedValue2, startRestartGroup, 54);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new x00.p() { // from class: com.baicizhan.main.vld.bonding.o2
                @Override // x00.p
                public final Object invoke(Object obj, Object obj2) {
                    yz.g2 q11;
                    q11 = r2.q(i11, (Composer) obj, ((Integer) obj2).intValue());
                    return q11;
                }
            });
        }
    }

    public static final yz.g2 o() {
        return yz.g2.f100423a;
    }

    public static final yz.g2 p() {
        return yz.g2.f100423a;
    }

    public static final yz.g2 q(int i11, Composer composer, int i12) {
        n(composer, RecomposeScopeImplKt.updateChangedFlags(i11 | 1));
        return yz.g2.f100423a;
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void r(final int i11, final boolean z11, final s2 s2Var, Composer composer, final int i12) {
        int i13;
        Composer composer2;
        Modifier.Companion companion;
        int i14;
        Composer startRestartGroup = composer.startRestartGroup(1975302103);
        if ((i12 & 6) == 0) {
            i13 = (startRestartGroup.changed(i11) ? 4 : 2) | i12;
        } else {
            i13 = i12;
        }
        if ((i12 & 48) == 0) {
            i13 |= startRestartGroup.changed(z11) ? 32 : 16;
        }
        if ((i12 & 384) == 0) {
            i13 |= startRestartGroup.changed(s2Var) ? 256 : 128;
        }
        if (startRestartGroup.shouldExecute((i13 & 147) != 146, i13 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1975302103, i13, -1, "com.baicizhan.main.vld.bonding.TipItem (DeviceBondingTipActivity.kt:144)");
            }
            final float density = ((Density) startRestartGroup.consume(CompositionLocalsKt.getLocalDensity())).getDensity();
            Modifier.Companion companion2 = Modifier.Companion;
            float f11 = 6;
            Modifier m726padding3ABfNKs = PaddingKt.m726padding3ABfNKs(companion2, Dp.m5115constructorimpl(f11));
            Arrangement arrangement = Arrangement.INSTANCE;
            Arrangement.Horizontal start = arrangement.getStart();
            Alignment.Companion companion3 = Alignment.Companion;
            MeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(start, companion3.getTop(), startRestartGroup, 0);
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
            Modifier materializeModifier = ComposedModifierKt.materializeModifier(startRestartGroup, m726padding3ABfNKs);
            ComposeUiNode.Companion companion4 = ComposeUiNode.Companion;
            x00.a<ComposeUiNode> constructor = companion4.getConstructor();
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
            Updater.m1958setimpl(m1951constructorimpl, rowMeasurePolicy, companion4.getSetMeasurePolicy());
            Updater.m1958setimpl(m1951constructorimpl, currentCompositionLocalMap, companion4.getSetResolvedCompositionLocals());
            x00.p<ComposeUiNode, Integer, yz.g2> setCompositeKeyHash = companion4.getSetCompositeKeyHash();
            if (m1951constructorimpl.getInserting() || !kotlin.jvm.internal.g0.g(m1951constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                m1951constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                m1951constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m1958setimpl(m1951constructorimpl, materializeModifier, companion4.getSetModifier());
            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
            Object rememberedValue = startRestartGroup.rememberedValue();
            Composer.Companion companion5 = Composer.Companion;
            if (rememberedValue == companion5.getEmpty()) {
                rememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Dp.m5113boximpl(Dp.m5115constructorimpl(0)), null, 2, null);
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            MutableState mutableState = (MutableState) rememberedValue;
            float m5129unboximpl = ((Dp) mutableState.component1()).m5129unboximpl();
            final x00.l component2 = mutableState.component2();
            MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(arrangement.getTop(), companion3.getStart(), startRestartGroup, 0);
            int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap2 = startRestartGroup.getCurrentCompositionLocalMap();
            Modifier materializeModifier2 = ComposedModifierKt.materializeModifier(startRestartGroup, companion2);
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
            Updater.m1958setimpl(m1951constructorimpl2, columnMeasurePolicy, companion4.getSetMeasurePolicy());
            Updater.m1958setimpl(m1951constructorimpl2, currentCompositionLocalMap2, companion4.getSetResolvedCompositionLocals());
            x00.p<ComposeUiNode, Integer, yz.g2> setCompositeKeyHash2 = companion4.getSetCompositeKeyHash();
            if (m1951constructorimpl2.getInserting() || !kotlin.jvm.internal.g0.g(m1951constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                m1951constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                m1951constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
            }
            Updater.m1958setimpl(m1951constructorimpl2, materializeModifier2, companion4.getSetModifier());
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            float f12 = 24;
            Modifier clip = ClipKt.clip(SizeKt.m773size3ABfNKs(companion2, Dp.m5115constructorimpl(f12)), RoundedCornerShapeKt.getCircleShape());
            MaterialTheme materialTheme = MaterialTheme.INSTANCE;
            int i15 = MaterialTheme.$stable;
            Modifier m235backgroundbw27NRU$default = BackgroundKt.m235backgroundbw27NRU$default(clip, materialTheme.getColors(startRestartGroup, i15).m1600getPrimary0d7_KjU(), null, 2, null);
            MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(companion3.getTopStart(), false);
            int currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap3 = startRestartGroup.getCurrentCompositionLocalMap();
            Modifier materializeModifier3 = ComposedModifierKt.materializeModifier(startRestartGroup, m235backgroundbw27NRU$default);
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
            Updater.m1958setimpl(m1951constructorimpl3, maybeCachedBoxMeasurePolicy, companion4.getSetMeasurePolicy());
            Updater.m1958setimpl(m1951constructorimpl3, currentCompositionLocalMap3, companion4.getSetResolvedCompositionLocals());
            x00.p<ComposeUiNode, Integer, yz.g2> setCompositeKeyHash3 = companion4.getSetCompositeKeyHash();
            if (m1951constructorimpl3.getInserting() || !kotlin.jvm.internal.g0.g(m1951constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                m1951constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                m1951constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
            }
            Updater.m1958setimpl(m1951constructorimpl3, materializeModifier3, companion4.getSetModifier());
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            String valueOf = String.valueOf(i11);
            long m11 = bk.d.m();
            FontWeight.Companion companion6 = FontWeight.Companion;
            TextKt.m1845Text4IGK_g(valueOf, boxScopeInstance.align(companion2, companion3.getCenter()), bk.b.L0(materialTheme.getColors(startRestartGroup, i15).m1600getPrimary0d7_KjU(), startRestartGroup, 0), m11, (FontStyle) null, companion6.getBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (x00.l<? super TextLayoutResult, yz.g2>) null, (TextStyle) null, startRestartGroup, 199680, 0, 131024);
            startRestartGroup.endNode();
            if (z11) {
                startRestartGroup.startReplaceGroup(-325135518);
                companion = companion2;
                i14 = 0;
                BoxKt.Box(columnScopeInstance.align(BackgroundKt.m235backgroundbw27NRU$default(SizeKt.m775sizeVpY3zN4(PaddingKt.m730paddingqDBjuR0$default(companion2, 0.0f, Dp.m5115constructorimpl(12), 0.0f, 0.0f, 13, null), Dp.m5115constructorimpl(1), m5129unboximpl), bk.b.I(materialTheme.getColors(startRestartGroup, i15)), null, 2, null), companion3.getCenterHorizontally()), startRestartGroup, 0);
            } else {
                companion = companion2;
                i14 = 0;
                startRestartGroup.startReplaceGroup(-1495340635);
            }
            startRestartGroup.endReplaceGroup();
            startRestartGroup.endNode();
            SpacerKt.Spacer(SizeKt.m778width3ABfNKs(companion, Dp.m5115constructorimpl(16)), startRestartGroup, 6);
            Modifier fillMaxWidth$default = SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null);
            boolean changed = startRestartGroup.changed(component2) | startRestartGroup.changed(density);
            Object rememberedValue2 = startRestartGroup.rememberedValue();
            if (changed || rememberedValue2 == companion5.getEmpty()) {
                rememberedValue2 = new x00.l() { // from class: com.baicizhan.main.vld.bonding.p2
                    @Override // x00.l
                    public final Object invoke(Object obj) {
                        yz.g2 s11;
                        s11 = r2.s(x00.l.this, density, (IntSize) obj);
                        return s11;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue2);
            }
            Modifier onSizeChanged = OnRemeasuredModifierKt.onSizeChanged(fillMaxWidth$default, (x00.l) rememberedValue2);
            MeasurePolicy columnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(arrangement.getTop(), companion3.getStart(), startRestartGroup, i14);
            int currentCompositeKeyHash4 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, i14);
            CompositionLocalMap currentCompositionLocalMap4 = startRestartGroup.getCurrentCompositionLocalMap();
            Modifier materializeModifier4 = ComposedModifierKt.materializeModifier(startRestartGroup, onSizeChanged);
            x00.a<ComposeUiNode> constructor4 = companion4.getConstructor();
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
            Updater.m1958setimpl(m1951constructorimpl4, columnMeasurePolicy2, companion4.getSetMeasurePolicy());
            Updater.m1958setimpl(m1951constructorimpl4, currentCompositionLocalMap4, companion4.getSetResolvedCompositionLocals());
            x00.p<ComposeUiNode, Integer, yz.g2> setCompositeKeyHash4 = companion4.getSetCompositeKeyHash();
            if (m1951constructorimpl4.getInserting() || !kotlin.jvm.internal.g0.g(m1951constructorimpl4.rememberedValue(), Integer.valueOf(currentCompositeKeyHash4))) {
                m1951constructorimpl4.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash4));
                m1951constructorimpl4.apply(Integer.valueOf(currentCompositeKeyHash4), setCompositeKeyHash4);
            }
            Updater.m1958setimpl(m1951constructorimpl4, materializeModifier4, companion4.getSetModifier());
            composer2 = startRestartGroup;
            TextKt.m1845Text4IGK_g(s2Var.f(), SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), bk.b.A(materialTheme.getColors(startRestartGroup, i15)), bk.d.n(), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, TextUnitKt.getSp(24), 0, false, 0, 0, (x00.l<? super TextLayoutResult, yz.g2>) null, (TextStyle) null, composer2, 3120, 6, 130032);
            TextKt.m1845Text4IGK_g(s2Var.e(), PaddingKt.m730paddingqDBjuR0$default(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), 0.0f, Dp.m5115constructorimpl(f11), 0.0f, Dp.m5115constructorimpl(f12), 5, null), 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, TextUnitKt.getSp(20), 0, false, 0, 0, (x00.l<? super TextLayoutResult, yz.g2>) null, TextStyle.m4572copyp1EtxEg$default(materialTheme.getTypography(composer2, i15).getSubtitle2(), 0L, 0L, companion6.getNormal(), null, null, null, null, 0L, null, null, null, 0L, null, null, null, 0, 0, 0L, null, null, null, 0, 0, null, 16777211, null), composer2, 48, 6, 64508);
            composer2.endNode();
            composer2.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer2 = startRestartGroup;
            composer2.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new x00.p() { // from class: com.baicizhan.main.vld.bonding.q2
                @Override // x00.p
                public final Object invoke(Object obj, Object obj2) {
                    yz.g2 t11;
                    t11 = r2.t(i11, z11, s2Var, i12, (Composer) obj, ((Integer) obj2).intValue());
                    return t11;
                }
            });
        }
    }

    public static final yz.g2 s(x00.l lVar, float f11, IntSize intSize) {
        lVar.invoke(Dp.m5113boximpl(Dp.m5115constructorimpl(Dp.m5115constructorimpl(((int) (intSize.m5290unboximpl() & 4294967295L)) / f11) - Dp.m5115constructorimpl(36))));
        return yz.g2.f100423a;
    }

    public static final yz.g2 t(int i11, boolean z11, s2 s2Var, int i12, Composer composer, int i13) {
        r(i11, z11, s2Var, composer, RecomposeScopeImplKt.updateChangedFlags(i12 | 1));
        return yz.g2.f100423a;
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    @Preview(showBackground = true)
    public static final void u(@PreviewParameter(provider = t2.class) final s2 s2Var, Composer composer, final int i11) {
        int i12;
        Composer startRestartGroup = composer.startRestartGroup(1030961294);
        if ((i11 & 6) == 0) {
            i12 = (startRestartGroup.changed(s2Var) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if (startRestartGroup.shouldExecute((i12 & 3) != 2, i12 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1030961294, i12, -1, "com.baicizhan.main.vld.bonding.TipItemPreview (DeviceBondingTipActivity.kt:212)");
            }
            bk.k.e(null, null, null, ComposableLambdaKt.rememberComposableLambda(525627706, true, new x00.p() { // from class: com.baicizhan.main.vld.bonding.e2
                @Override // x00.p
                public final Object invoke(Object obj, Object obj2) {
                    yz.g2 v11;
                    v11 = r2.v(s2.this, (Composer) obj, ((Integer) obj2).intValue());
                    return v11;
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
            endRestartGroup.updateScope(new x00.p() { // from class: com.baicizhan.main.vld.bonding.i2
                @Override // x00.p
                public final Object invoke(Object obj, Object obj2) {
                    yz.g2 w11;
                    w11 = r2.w(s2.this, i11, (Composer) obj, ((Integer) obj2).intValue());
                    return w11;
                }
            });
        }
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final yz.g2 v(s2 s2Var, Composer composer, int i11) {
        if (composer.shouldExecute((i11 & 3) != 2, i11 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(525627706, i11, -1, "com.baicizhan.main.vld.bonding.TipItemPreview.<anonymous> (DeviceBondingTipActivity.kt:214)");
            }
            r(1, true, s2Var, composer, 54);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return yz.g2.f100423a;
    }

    public static final yz.g2 w(s2 s2Var, int i11, Composer composer, int i12) {
        u(s2Var, composer, RecomposeScopeImplKt.updateChangedFlags(i11 | 1));
        return yz.g2.f100423a;
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void x(final x00.a<yz.g2> aVar, final x00.a<yz.g2> aVar2, Composer composer, final int i11) {
        int i12;
        Composer startRestartGroup = composer.startRestartGroup(1325396456);
        if ((i11 & 6) == 0) {
            i12 = (startRestartGroup.changedInstance(aVar) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= startRestartGroup.changedInstance(aVar2) ? 32 : 16;
        }
        if (startRestartGroup.shouldExecute((i12 & 19) != 18, i12 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1325396456, i12, -1, "com.baicizhan.main.vld.bonding.TipsContent (DeviceBondingTipActivity.kt:79)");
            }
            bk.k.e(null, null, null, ComposableLambdaKt.rememberComposableLambda(743815868, true, new x00.p() { // from class: com.baicizhan.main.vld.bonding.g2
                @Override // x00.p
                public final Object invoke(Object obj, Object obj2) {
                    yz.g2 y11;
                    y11 = r2.y(x00.a.this, aVar, (Composer) obj, ((Integer) obj2).intValue());
                    return y11;
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
            endRestartGroup.updateScope(new x00.p() { // from class: com.baicizhan.main.vld.bonding.h2
                @Override // x00.p
                public final Object invoke(Object obj, Object obj2) {
                    yz.g2 D;
                    D = r2.D(x00.a.this, aVar2, i11, (Composer) obj, ((Integer) obj2).intValue());
                    return D;
                }
            });
        }
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final yz.g2 y(final x00.a aVar, final x00.a aVar2, Composer composer, int i11) {
        if (composer.shouldExecute((i11 & 3) != 2, i11 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(743815868, i11, -1, "com.baicizhan.main.vld.bonding.TipsContent.<anonymous> (DeviceBondingTipActivity.kt:81)");
            }
            s4.B(null, null, null, ComposableLambdaKt.rememberComposableLambda(506033267, true, new x00.p() { // from class: com.baicizhan.main.vld.bonding.j2
                @Override // x00.p
                public final Object invoke(Object obj, Object obj2) {
                    yz.g2 z11;
                    z11 = r2.z(x00.a.this, (Composer) obj, ((Integer) obj2).intValue());
                    return z11;
                }
            }, composer, 54), null, null, 0, false, null, false, null, 0.0f, 0L, 0L, 0L, 0L, 0L, ComposableLambdaKt.rememberComposableLambda(-1716546965, true, new x00.q() { // from class: com.baicizhan.main.vld.bonding.k2
                @Override // x00.q
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    yz.g2 B;
                    B = r2.B(x00.a.this, (PaddingValues) obj, (Composer) obj2, ((Integer) obj3).intValue());
                    return B;
                }
            }, composer, 54), composer, 3072, 12582912, 131063);
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
    public static final yz.g2 z(final x00.a aVar, Composer composer, int i11) {
        if (composer.shouldExecute((i11 & 3) != 2, i11 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(506033267, i11, -1, "com.baicizhan.main.vld.bonding.TipsContent.<anonymous>.<anonymous> (DeviceBondingTipActivity.kt:82)");
            }
            String stringResource = StringResources_androidKt.stringResource(R.string.devices_management_add_title, composer, 6);
            boolean changed = composer.changed(aVar);
            Object rememberedValue = composer.rememberedValue();
            if (changed || rememberedValue == Composer.Companion.getEmpty()) {
                rememberedValue = new x00.a() { // from class: com.baicizhan.main.vld.bonding.f2
                    @Override // x00.a
                    public final Object invoke() {
                        yz.g2 A;
                        A = r2.A(x00.a.this);
                        return A;
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
        return yz.g2.f100423a;
    }
}
