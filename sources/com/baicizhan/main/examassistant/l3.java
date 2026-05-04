package com.baicizhan.main.examassistant;

import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.interaction.InteractionSourceKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
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
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.ColorFilter;
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
import androidx.compose.ui.tooling.preview.Preview;
import androidx.compose.ui.unit.Dp;
import com.jiongji.andriod.card.R;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@kotlin.jvm.internal.u0({"SMAP\nWidgets.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Widgets.kt\ncom/baicizhan/main/examassistant/WidgetsKt\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 3 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 4 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 5 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 6 Composer.kt\nandroidx/compose/runtime/Updater\n+ 7 Row.kt\nandroidx/compose/foundation/layout/RowKt\n*L\n1#1,61:1\n113#2:62\n113#2:138\n113#2:139\n70#3:63\n67#3,9:64\n77#3:147\n79#4,6:73\n86#4,3:88\n89#4,2:97\n79#4,6:111\n86#4,3:126\n89#4,2:135\n93#4:142\n93#4:146\n347#5,9:79\n356#5:99\n347#5,9:117\n356#5:137\n357#5,2:140\n357#5,2:144\n4206#6,6:91\n4206#6,6:129\n99#7:100\n95#7,10:101\n106#7:143\n*S KotlinDebug\n*F\n+ 1 Widgets.kt\ncom/baicizhan/main/examassistant/WidgetsKt\n*L\n29#1:62\n45#1:138\n46#1:139\n30#1:63\n30#1:64,9\n30#1:147\n30#1:73,6\n30#1:88,3\n30#1:97,2\n34#1:111,6\n34#1:126,3\n34#1:135,2\n34#1:142\n30#1:146\n30#1:79,9\n30#1:99\n34#1:117,9\n34#1:137\n34#1:140,2\n30#1:144,2\n30#1:91,6\n34#1:129,6\n34#1:100\n34#1:101,10\n34#1:143\n*E\n"})
/* loaded from: classes4.dex */
public final class l3 {
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void c(@m80.l Modifier modifier, @m80.k x00.a<yz.g2> onClick, @m80.l Composer composer, final int i11, final int i12) {
        final Modifier modifier2;
        int i13;
        final x00.a<yz.g2> aVar;
        Composer composer2;
        kotlin.jvm.internal.g0.p(onClick, "onClick");
        Composer startRestartGroup = composer.startRestartGroup(343961700);
        int i14 = i12 & 1;
        if (i14 != 0) {
            i13 = i11 | 6;
            modifier2 = modifier;
        } else if ((i11 & 6) == 0) {
            modifier2 = modifier;
            i13 = (startRestartGroup.changed(modifier2) ? 4 : 2) | i11;
        } else {
            modifier2 = modifier;
            i13 = i11;
        }
        if ((i11 & 48) == 0) {
            i13 |= startRestartGroup.changedInstance(onClick) ? 32 : 16;
        }
        if (startRestartGroup.shouldExecute((i13 & 19) != 18, i13 & 1)) {
            Modifier modifier3 = i14 != 0 ? Modifier.Companion : modifier2;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(343961700, i13, -1, "com.baicizhan.main.examassistant.MinorOptionButton (Widgets.kt:27)");
            }
            float m5115constructorimpl = Dp.m5115constructorimpl(4);
            Modifier modifier4 = modifier3;
            Modifier m267clickableO2vRcR0$default = ClickableKt.m267clickableO2vRcR0$default(modifier4, InteractionSourceKt.MutableInteractionSource(), null, false, null, null, onClick, 28, null);
            aVar = onClick;
            Alignment.Companion companion = Alignment.Companion;
            MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(companion.getTopStart(), false);
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
            Modifier materializeModifier = ComposedModifierKt.materializeModifier(startRestartGroup, m267clickableO2vRcR0$default);
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
            Updater.m1958setimpl(m1951constructorimpl, maybeCachedBoxMeasurePolicy, companion2.getSetMeasurePolicy());
            Updater.m1958setimpl(m1951constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
            x00.p<ComposeUiNode, Integer, yz.g2> setCompositeKeyHash = companion2.getSetCompositeKeyHash();
            if (m1951constructorimpl.getInserting() || !kotlin.jvm.internal.g0.g(m1951constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                m1951constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                m1951constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m1958setimpl(m1951constructorimpl, materializeModifier, companion2.getSetModifier());
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            Modifier.Companion companion3 = Modifier.Companion;
            MeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), companion.getTop(), startRestartGroup, 0);
            int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap2 = startRestartGroup.getCurrentCompositionLocalMap();
            Modifier materializeModifier2 = ComposedModifierKt.materializeModifier(startRestartGroup, companion3);
            x00.a<ComposeUiNode> constructor2 = companion2.getConstructor();
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
            Updater.m1958setimpl(m1951constructorimpl2, rowMeasurePolicy, companion2.getSetMeasurePolicy());
            Updater.m1958setimpl(m1951constructorimpl2, currentCompositionLocalMap2, companion2.getSetResolvedCompositionLocals());
            x00.p<ComposeUiNode, Integer, yz.g2> setCompositeKeyHash2 = companion2.getSetCompositeKeyHash();
            if (m1951constructorimpl2.getInserting() || !kotlin.jvm.internal.g0.g(m1951constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                m1951constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                m1951constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
            }
            Updater.m1958setimpl(m1951constructorimpl2, materializeModifier2, companion2.getSetModifier());
            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
            long k11 = bk.d.k();
            MaterialTheme materialTheme = MaterialTheme.INSTANCE;
            int i15 = MaterialTheme.$stable;
            TextKt.m1845Text4IGK_g("详情", rowScopeInstance.align(PaddingKt.m730paddingqDBjuR0$default(companion3, m5115constructorimpl, m5115constructorimpl, 0.0f, m5115constructorimpl, 4, null), companion.getCenterVertically()), bk.b.C(materialTheme.getColors(startRestartGroup, i15)), k11, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (x00.l<? super TextLayoutResult, yz.g2>) null, (TextStyle) null, startRestartGroup, 3078, 0, 131056);
            ImageKt.Image(PainterResources_androidKt.painterResource(R.drawable.ic_common_arrow_right, startRestartGroup, 6), "arrow", rowScopeInstance.align(SizeKt.m773size3ABfNKs(PaddingKt.m729paddingqDBjuR0(companion3, Dp.m5115constructorimpl(2), m5115constructorimpl, m5115constructorimpl, m5115constructorimpl), Dp.m5115constructorimpl(12)), companion.getCenterVertically()), (Alignment) null, (ContentScale) null, 0.0f, ColorFilter.Companion.m2550tintxETnrds$default(ColorFilter.Companion, bk.b.C(materialTheme.getColors(startRestartGroup, i15)), 0, 2, null), startRestartGroup, 48, 56);
            composer2 = startRestartGroup;
            composer2.endNode();
            composer2.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            modifier2 = modifier4;
        } else {
            aVar = onClick;
            composer2 = startRestartGroup;
            composer2.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new x00.p() { // from class: com.baicizhan.main.examassistant.k3
                @Override // x00.p
                public final Object invoke(Object obj, Object obj2) {
                    yz.g2 d11;
                    d11 = l3.d(Modifier.this, aVar, i11, i12, (Composer) obj, ((Integer) obj2).intValue());
                    return d11;
                }
            });
        }
    }

    public static final yz.g2 d(Modifier modifier, x00.a aVar, int i11, int i12, Composer composer, int i13) {
        c(modifier, aVar, composer, RecomposeScopeImplKt.updateChangedFlags(i11 | 1), i12);
        return yz.g2.f100423a;
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    @Preview(backgroundColor = 16777215)
    public static final void e(Composer composer, final int i11) {
        Composer startRestartGroup = composer.startRestartGroup(187101525);
        if (startRestartGroup.shouldExecute(i11 != 0, i11 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(187101525, i11, -1, "com.baicizhan.main.examassistant.MinorOptionButtonPreview (Widgets.kt:54)");
            }
            bk.k.e(null, null, null, c.f20453a.c(), startRestartGroup, 3072, 7);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new x00.p() { // from class: com.baicizhan.main.examassistant.j3
                @Override // x00.p
                public final Object invoke(Object obj, Object obj2) {
                    yz.g2 f11;
                    f11 = l3.f(i11, (Composer) obj, ((Integer) obj2).intValue());
                    return f11;
                }
            });
        }
    }

    public static final yz.g2 f(int i11, Composer composer, int i12) {
        e(composer, RecomposeScopeImplKt.updateChangedFlags(i11 | 1));
        return yz.g2.f100423a;
    }
}
