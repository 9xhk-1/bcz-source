package com.baicizhan.main.word_book.list;

import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
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
import androidx.compose.ui.unit.Dp;
import com.baicizhan.platform.base.widget.ComposeUtilsKt;
import com.jiongji.andriod.card.R;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@kotlin.jvm.internal.u0({"SMAP\nWidgets.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Widgets.kt\ncom/baicizhan/main/word_book/list/WidgetsKt\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 3 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 4 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 5 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 6 Composer.kt\nandroidx/compose/runtime/Updater\n+ 7 Row.kt\nandroidx/compose/foundation/layout/RowKt\n*L\n1#1,48:1\n113#2:49\n113#2:50\n113#2:126\n113#2:127\n70#3:51\n67#3,9:52\n77#3:135\n79#4,6:61\n86#4,3:76\n89#4,2:85\n79#4,6:99\n86#4,3:114\n89#4,2:123\n93#4:130\n93#4:134\n347#5,9:67\n356#5:87\n347#5,9:105\n356#5:125\n357#5,2:128\n357#5,2:132\n4206#6,6:79\n4206#6,6:117\n99#7:88\n95#7,10:89\n106#7:131\n*S KotlinDebug\n*F\n+ 1 Widgets.kt\ncom/baicizhan/main/word_book/list/WidgetsKt\n*L\n26#1:49\n27#1:50\n38#1:126\n43#1:127\n28#1:51\n28#1:52,9\n28#1:135\n28#1:61,6\n28#1:76,3\n28#1:85,2\n32#1:99,6\n32#1:114,3\n32#1:123,2\n32#1:130\n28#1:134\n28#1:67,9\n28#1:87\n32#1:105,9\n32#1:125\n32#1:128,2\n28#1:132,2\n28#1:79,6\n32#1:117,6\n32#1:88\n32#1:89,10\n32#1:131\n*E\n"})
/* loaded from: classes5.dex */
public final class g2 {
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void b(@m80.l Modifier modifier, @m80.k final x00.a<yz.g2> onClick, @m80.l Composer composer, final int i11, final int i12) {
        final Modifier modifier2;
        int i13;
        Composer composer2;
        kotlin.jvm.internal.g0.p(onClick, "onClick");
        Composer startRestartGroup = composer.startRestartGroup(664326047);
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
                ComposerKt.traceEventStart(664326047, i13, -1, "com.baicizhan.main.word_book.list.RemovalButton (Widgets.kt:24)");
            }
            float f11 = 8;
            float m5115constructorimpl = Dp.m5115constructorimpl(f11);
            float m5115constructorimpl2 = Dp.m5115constructorimpl(f11);
            Modifier k11 = ComposeUtilsKt.k(PaddingKt.m726padding3ABfNKs(modifier3, m5115constructorimpl), 0L, false, onClick, 3, null);
            Alignment.Companion companion = Alignment.Companion;
            MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(companion.getTopStart(), false);
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
            Modifier materializeModifier = ComposedModifierKt.materializeModifier(startRestartGroup, k11);
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
            Modifier modifier4 = modifier3;
            ImageKt.Image(PainterResources_androidKt.painterResource(R.drawable.ic_clear_dustbin, startRestartGroup, 6), kc.o.N, rowScopeInstance.align(SizeKt.m773size3ABfNKs(PaddingKt.m730paddingqDBjuR0$default(companion3, m5115constructorimpl2, m5115constructorimpl2, 0.0f, m5115constructorimpl2, 4, null), Dp.m5115constructorimpl(16)), companion.getCenterVertically()), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, startRestartGroup, 48, 120);
            composer2 = startRestartGroup;
            TextKt.m1845Text4IGK_g("删除", rowScopeInstance.align(PaddingKt.m729paddingqDBjuR0(companion3, Dp.m5115constructorimpl(2), m5115constructorimpl2, m5115constructorimpl2, m5115constructorimpl2), companion.getCenterVertically()), bk.b.D(), bk.d.l(), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (x00.l<? super TextLayoutResult, yz.g2>) null, (TextStyle) null, composer2, 3462, 0, 131056);
            composer2.endNode();
            composer2.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            modifier2 = modifier4;
        } else {
            composer2 = startRestartGroup;
            composer2.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new x00.p() { // from class: com.baicizhan.main.word_book.list.f2
                @Override // x00.p
                public final Object invoke(Object obj, Object obj2) {
                    yz.g2 c11;
                    c11 = g2.c(Modifier.this, onClick, i11, i12, (Composer) obj, ((Integer) obj2).intValue());
                    return c11;
                }
            });
        }
    }

    public static final yz.g2 c(Modifier modifier, x00.a aVar, int i11, int i12, Composer composer, int i13) {
        b(modifier, aVar, composer, RecomposeScopeImplKt.updateChangedFlags(i11 | 1), i12);
        return yz.g2.f100423a;
    }
}
