package com.baicizhan.main.activity.mytab.device;

import a00.h0;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.lazy.LazyDslKt;
import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.foundation.lazy.LazyListScope;
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
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.res.PainterResources_androidKt;
import androidx.compose.ui.res.StringResources_androidKt;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.tooling.preview.Preview;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.TextUnitKt;
import com.jiongji.andriod.card.R;
import java.util.HashMap;
import java.util.List;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nMyDevices.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MyDevices.kt\ncom/baicizhan/main/activity/mytab/device/MyDevicesKt\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 3 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n+ 4 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 5 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 6 Composer.kt\nandroidx/compose/runtime/Updater\n+ 7 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 8 Row.kt\nandroidx/compose/foundation/layout/RowKt\n+ 9 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 10 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n*L\n1#1,197:1\n113#2:198\n113#2:199\n113#2:237\n113#2:238\n113#2:249\n113#2:250\n113#2:288\n113#2:293\n113#2:294\n113#2:338\n113#2:377\n113#2:379\n113#2:380\n113#2:385\n87#3:200\n84#3,9:201\n94#3:248\n87#3:301\n84#3,9:302\n94#3:389\n79#4,6:210\n86#4,3:225\n89#4,2:234\n93#4:247\n79#4,6:261\n86#4,3:276\n89#4,2:285\n93#4:291\n79#4,6:311\n86#4,3:326\n89#4,2:335\n79#4,6:349\n86#4,3:364\n89#4,2:373\n93#4:383\n93#4:388\n347#5,9:216\n356#5:236\n357#5,2:245\n347#5,9:267\n356#5:287\n357#5,2:289\n347#5,9:317\n356#5:337\n347#5,9:355\n356#5:375\n357#5,2:381\n357#5,2:386\n4206#6,6:228\n4206#6,6:279\n4206#6,6:329\n4206#6,6:367\n1247#7,6:239\n1247#7,6:295\n1247#7,6:390\n1247#7,6:396\n99#8:251\n96#8,9:252\n106#8:292\n70#9:339\n67#9,9:340\n77#9:384\n75#10:376\n75#10:378\n*S KotlinDebug\n*F\n+ 1 MyDevices.kt\ncom/baicizhan/main/activity/mytab/device/MyDevicesKt\n*L\n63#1:198\n65#1:199\n69#1:237\n70#1:238\n98#1:249\n99#1:250\n106#1:288\n119#1:293\n120#1:294\n126#1:338\n133#1:377\n146#1:379\n147#1:380\n154#1:385\n59#1:200\n59#1:201,9\n59#1:248\n117#1:301\n117#1:302,9\n117#1:389\n59#1:210,6\n59#1:225,3\n59#1:234,2\n59#1:247\n96#1:261,6\n96#1:276,3\n96#1:285,2\n96#1:291\n117#1:311,6\n117#1:326,3\n117#1:335,2\n124#1:349,6\n124#1:364,3\n124#1:373,2\n124#1:383\n117#1:388\n59#1:216,9\n59#1:236\n59#1:245,2\n96#1:267,9\n96#1:287\n96#1:289,2\n117#1:317,9\n117#1:337\n124#1:355,9\n124#1:375\n124#1:381,2\n117#1:386,2\n59#1:228,6\n96#1:279,6\n117#1:329,6\n124#1:367,6\n71#1:239,6\n121#1:295,6\n196#1:390,6\n77#1:396,6\n96#1:251\n96#1:252,9\n96#1:292\n124#1:339\n124#1:340,9\n124#1:384\n129#1:376\n141#1:378\n*E\n"})
/* loaded from: classes4.dex */
public final class u {
    /* JADX WARN: Removed duplicated region for block: B:20:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x034e  */
    /* JADX WARN: Removed duplicated region for block: B:78:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0342  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0076  */
    @androidx.compose.runtime.ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @androidx.compose.runtime.Composable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void k(@m80.k final java.lang.String r34, @m80.k final java.lang.String r35, @m80.l java.lang.String r36, @m80.k final x00.a<yz.g2> r37, @m80.l androidx.compose.runtime.Composer r38, final int r39, final int r40) {
        /*
            Method dump skipped, instructions count: 865
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.baicizhan.main.activity.mytab.device.u.k(java.lang.String, java.lang.String, java.lang.String, x00.a, androidx.compose.runtime.Composer, int, int):void");
    }

    public static final g2 l(x00.a aVar) {
        aVar.invoke();
        return g2.f100423a;
    }

    public static final g2 m(String str, String str2, String str3, x00.a aVar, int i11, int i12, Composer composer, int i13) {
        k(str, str2, str3, aVar, composer, RecomposeScopeImplKt.updateChangedFlags(i11 | 1), i12);
        return g2.f100423a;
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void n(@m80.k final List<ie.b> state, @m80.k final x00.l<? super ie.b, g2> itemClick, @m80.l Composer composer, final int i11) {
        int i12;
        g0.p(state, "state");
        g0.p(itemClick, "itemClick");
        Composer startRestartGroup = composer.startRestartGroup(1364541712);
        if ((i11 & 6) == 0) {
            i12 = (startRestartGroup.changedInstance(state) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= startRestartGroup.changedInstance(itemClick) ? 32 : 16;
        }
        if (startRestartGroup.shouldExecute((i12 & 19) != 18, i12 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1364541712, i12, -1, "com.baicizhan.main.activity.mytab.device.MyDeviceBar (MyDevices.kt:57)");
            }
            float f11 = 12;
            Modifier m730paddingqDBjuR0$default = PaddingKt.m730paddingqDBjuR0$default(BackgroundKt.m234backgroundbw27NRU(PaddingKt.m730paddingqDBjuR0$default(SizeKt.wrapContentHeight$default(SizeKt.fillMaxWidth$default(Modifier.Companion, 0.0f, 1, null), null, false, 3, null), 0.0f, Dp.m5115constructorimpl(f11), 0.0f, 0.0f, 13, null), bk.b.A0(), MaterialTheme.INSTANCE.getShapes(startRestartGroup, MaterialTheme.$stable).getSmall()), 0.0f, 0.0f, 0.0f, Dp.m5115constructorimpl(f11), 7, null);
            Arrangement arrangement = Arrangement.INSTANCE;
            MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(arrangement.getTop(), Alignment.Companion.getStart(), startRestartGroup, 0);
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
            Modifier materializeModifier = ComposedModifierKt.materializeModifier(startRestartGroup, m730paddingqDBjuR0$default);
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
            if (m1951constructorimpl.getInserting() || !g0.g(m1951constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                m1951constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                m1951constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m1958setimpl(m1951constructorimpl, materializeModifier, companion.getSetModifier());
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            t(startRestartGroup, 0);
            PaddingValues m721PaddingValuesYgX7TsA$default = PaddingKt.m721PaddingValuesYgX7TsA$default(Dp.m5115constructorimpl(8), 0.0f, 2, null);
            Arrangement.HorizontalOrVertical m607spacedBy0680j_4 = arrangement.m607spacedBy0680j_4(Dp.m5115constructorimpl(6));
            boolean changedInstance = startRestartGroup.changedInstance(state) | ((i12 & 112) == 32);
            Object rememberedValue = startRestartGroup.rememberedValue();
            if (changedInstance || rememberedValue == Composer.Companion.getEmpty()) {
                rememberedValue = new x00.l() { // from class: com.baicizhan.main.activity.mytab.device.k
                    @Override // x00.l
                    public final Object invoke(Object obj) {
                        g2 o11;
                        o11 = u.o(state, itemClick, (LazyListScope) obj);
                        return o11;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            LazyDslKt.LazyRow(null, null, m721PaddingValuesYgX7TsA$default, false, m607spacedBy0680j_4, null, null, false, null, (x00.l) rememberedValue, startRestartGroup, 24960, 491);
            startRestartGroup.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new x00.p() { // from class: com.baicizhan.main.activity.mytab.device.l
                @Override // x00.p
                public final Object invoke(Object obj, Object obj2) {
                    g2 s11;
                    s11 = u.s(state, itemClick, i11, (Composer) obj, ((Integer) obj2).intValue());
                    return s11;
                }
            });
        }
    }

    public static final g2 o(final List list, final x00.l lVar, LazyListScope LazyRow) {
        g0.p(LazyRow, "$this$LazyRow");
        LazyListScope.items$default(LazyRow, list.size(), new x00.l() { // from class: com.baicizhan.main.activity.mytab.device.s
            @Override // x00.l
            public final Object invoke(Object obj) {
                Object p11;
                p11 = u.p(list, ((Integer) obj).intValue());
                return p11;
            }
        }, null, ComposableLambdaKt.composableLambdaInstance(-795718650, true, new x00.r() { // from class: com.baicizhan.main.activity.mytab.device.t
            @Override // x00.r
            public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
                g2 q11;
                q11 = u.q(list, lVar, (LazyItemScope) obj, ((Integer) obj2).intValue(), (Composer) obj3, ((Integer) obj4).intValue());
                return q11;
            }
        }), 4, null);
        return g2.f100423a;
    }

    public static final Object p(List list, int i11) {
        return Integer.valueOf(((ie.b) list.get(i11)).j());
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final g2 q(final List list, final x00.l lVar, LazyItemScope items, final int i11, Composer composer, int i12) {
        int i13;
        g0.p(items, "$this$items");
        if ((i12 & 48) == 0) {
            i13 = (composer.changed(i11) ? 32 : 16) | i12;
        } else {
            i13 = i12;
        }
        if (composer.shouldExecute((i13 & 145) != 144, i13 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-795718650, i13, -1, "com.baicizhan.main.activity.mytab.device.MyDeviceBar.<anonymous>.<anonymous>.<anonymous>.<anonymous> (MyDevices.kt:72)");
            }
            String i14 = ((ie.b) list.get(i11)).i();
            String n11 = ((ie.b) list.get(i11)).n();
            String m11 = ((ie.b) list.get(i11)).m();
            if (m11 == null) {
                m11 = "";
            }
            boolean changedInstance = composer.changedInstance(list) | ((i13 & 112) == 32) | composer.changed(lVar);
            Object rememberedValue = composer.rememberedValue();
            if (changedInstance || rememberedValue == Composer.Companion.getEmpty()) {
                rememberedValue = new x00.a() { // from class: com.baicizhan.main.activity.mytab.device.o
                    @Override // x00.a
                    public final Object invoke() {
                        g2 r11;
                        r11 = u.r(x00.l.this, list, i11);
                        return r11;
                    }
                };
                composer.updateRememberedValue(rememberedValue);
            }
            k(i14, n11, m11, (x00.a) rememberedValue, composer, 0, 0);
            HashMap hashMap = new HashMap();
            hashMap.put(ma.b.N1, Integer.valueOf(((ie.b) list.get(i11)).j()));
            g2 g2Var = g2.f100423a;
            ma.l.e(ma.t.f73012k, ma.a.f72844t5, hashMap);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return g2.f100423a;
    }

    public static final g2 r(x00.l lVar, List list, int i11) {
        HashMap hashMap = new HashMap();
        hashMap.put(ma.b.N1, Integer.valueOf(((ie.b) list.get(i11)).j()));
        g2 g2Var = g2.f100423a;
        ma.l.e(ma.t.f73012k, ma.a.f72837s5, hashMap);
        lVar.invoke(list.get(i11));
        return g2Var;
    }

    public static final g2 s(List list, x00.l lVar, int i11, Composer composer, int i12) {
        n(list, lVar, composer, RecomposeScopeImplKt.updateChangedFlags(i11 | 1));
        return g2.f100423a;
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void t(@m80.l Composer composer, final int i11) {
        Composer startRestartGroup = composer.startRestartGroup(331008414);
        if (startRestartGroup.shouldExecute(i11 != 0, i11 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(331008414, i11, -1, "com.baicizhan.main.activity.mytab.device.Title (MyDevices.kt:94)");
            }
            Modifier.Companion companion = Modifier.Companion;
            float f11 = 16;
            Modifier m730paddingqDBjuR0$default = PaddingKt.m730paddingqDBjuR0$default(SizeKt.m759height3ABfNKs(companion, Dp.m5115constructorimpl(56)), Dp.m5115constructorimpl(f11), 0.0f, Dp.m5115constructorimpl(f11), 0.0f, 10, null);
            MeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), Alignment.Companion.getCenterVertically(), startRestartGroup, 48);
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
            Modifier materializeModifier = ComposedModifierKt.materializeModifier(startRestartGroup, m730paddingqDBjuR0$default);
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
            Updater.m1958setimpl(m1951constructorimpl, rowMeasurePolicy, companion2.getSetMeasurePolicy());
            Updater.m1958setimpl(m1951constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
            x00.p<ComposeUiNode, Integer, g2> setCompositeKeyHash = companion2.getSetCompositeKeyHash();
            if (m1951constructorimpl.getInserting() || !g0.g(m1951constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                m1951constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                m1951constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m1958setimpl(m1951constructorimpl, materializeModifier, companion2.getSetModifier());
            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
            ImageKt.Image(PainterResources_androidKt.painterResource(R.drawable.ic_mydevice_bar, startRestartGroup, 6), (String) null, (Modifier) null, (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, startRestartGroup, 48, 124);
            SpacerKt.Spacer(SizeKt.m778width3ABfNKs(companion, Dp.m5115constructorimpl(8)), startRestartGroup, 6);
            TextKt.m1845Text4IGK_g(StringResources_androidKt.stringResource(R.string.my_tab_item_my_devices, startRestartGroup, 6), (Modifier) null, bk.b.x(), TextUnitKt.getSp(16), (FontStyle) null, FontWeight.Companion.getNormal(), bk.a.a(), 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (x00.l<? super TextLayoutResult, g2>) null, (TextStyle) null, startRestartGroup, 1772928, 0, 130962);
            startRestartGroup = startRestartGroup;
            startRestartGroup.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new x00.p() { // from class: com.baicizhan.main.activity.mytab.device.r
                @Override // x00.p
                public final Object invoke(Object obj, Object obj2) {
                    g2 u11;
                    u11 = u.u(i11, (Composer) obj, ((Integer) obj2).intValue());
                    return u11;
                }
            });
        }
    }

    public static final g2 u(int i11, Composer composer, int i12) {
        t(composer, RecomposeScopeImplKt.updateChangedFlags(i11 | 1));
        return g2.f100423a;
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    @Preview
    public static final void v(@m80.l Composer composer, final int i11) {
        Composer startRestartGroup = composer.startRestartGroup(-705296754);
        if (startRestartGroup.shouldExecute(i11 != 0, i11 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-705296754, i11, -1, "com.baicizhan.main.activity.mytab.device.preview (MyDevices.kt:192)");
            }
            List J = h0.J();
            Object rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == Composer.Companion.getEmpty()) {
                rememberedValue = new x00.l() { // from class: com.baicizhan.main.activity.mytab.device.m
                    @Override // x00.l
                    public final Object invoke(Object obj) {
                        g2 w11;
                        w11 = u.w((ie.b) obj);
                        return w11;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            n(J, (x00.l) rememberedValue, startRestartGroup, 54);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new x00.p() { // from class: com.baicizhan.main.activity.mytab.device.n
                @Override // x00.p
                public final Object invoke(Object obj, Object obj2) {
                    g2 x11;
                    x11 = u.x(i11, (Composer) obj, ((Integer) obj2).intValue());
                    return x11;
                }
            });
        }
    }

    public static final g2 w(ie.b bVar) {
        g0.p(bVar, "<unused var>");
        return g2.f100423a;
    }

    public static final g2 x(int i11, Composer composer, int i12) {
        v(composer, RecomposeScopeImplKt.updateChangedFlags(i11 | 1));
        return g2.f100423a;
    }
}
