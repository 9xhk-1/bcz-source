package com.baicizhan.main.activity.schedule_v2.mutimode;

import android.content.Context;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.BorderKt;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.interaction.InteractionSourceKt;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.OffsetKt;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.lazy.LazyDslKt;
import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.foundation.lazy.LazyListScope;
import androidx.compose.foundation.shape.RoundedCornerShape;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
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
import androidx.compose.ui.tooling.preview.Preview;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.TextUnitKt;
import coil.request.ImageRequest;
import com.baicizhan.main.activity.schedule_v2.mutimode.q0;
import com.jiongji.andriod.card.R;
import java.util.List;
import kotlin.jvm.internal.u0;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nmodeLIstUi.kt\nKotlin\n*S Kotlin\n*F\n+ 1 modeLIstUi.kt\ncom/baicizhan/main/activity/schedule_v2/mutimode/ModeLIstUiKt\n+ 2 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n+ 3 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 4 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 5 Composer.kt\nandroidx/compose/runtime/Updater\n+ 6 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 7 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 8 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 9 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 10 Dp.kt\nandroidx/compose/ui/unit/Dp\n+ 11 LazyDsl.kt\nandroidx/compose/foundation/lazy/LazyDslKt\n*L\n1#1,227:1\n87#2:228\n83#2,10:229\n94#2:271\n87#2:289\n84#2,9:290\n94#2:382\n79#3,6:239\n86#3,3:254\n89#3,2:263\n93#3:270\n79#3,6:299\n86#3,3:314\n89#3,2:323\n79#3,6:336\n86#3,3:351\n89#3,2:360\n93#3:375\n93#3:381\n347#4,9:245\n356#4:265\n357#4,2:268\n347#4,9:305\n356#4:325\n347#4,9:342\n356#4:362\n357#4,2:373\n357#4,2:379\n4206#5,6:257\n4206#5,6:317\n4206#5,6:354\n113#6:266\n113#6:267\n113#6:272\n113#6:273\n113#6:280\n113#6:281\n113#6:288\n113#6:364\n113#6:365\n113#6:377\n113#6:378\n1247#7,6:274\n1247#7,6:282\n1247#7,6:367\n70#8:326\n67#8,9:327\n77#8:376\n75#9:363\n55#10:366\n168#11,13:383\n*S KotlinDebug\n*F\n+ 1 modeLIstUi.kt\ncom/baicizhan/main/activity/schedule_v2/mutimode/ModeLIstUiKt\n*L\n63#1:228\n63#1:229,10\n63#1:271\n101#1:289\n101#1:290,9\n101#1:382\n63#1:239,6\n63#1:254,3\n63#1:263,2\n63#1:270\n101#1:299,6\n101#1:314,3\n101#1:323,2\n113#1:336,6\n113#1:351,3\n113#1:360,2\n113#1:375\n101#1:381\n63#1:245,9\n63#1:265\n63#1:268,2\n101#1:305,9\n101#1:325\n113#1:342,9\n113#1:362\n113#1:373,2\n101#1:379,2\n63#1:257,6\n101#1:317,6\n113#1:354,6\n64#1:266\n65#1:267\n81#1:272\n82#1:273\n99#1:280\n100#1:281\n111#1:288\n123#1:364\n131#1:365\n139#1:377\n144#1:378\n83#1:274,6\n104#1:282,6\n133#1:367,6\n113#1:326\n113#1:327,9\n113#1:376\n119#1:363\n131#1:366\n84#1:383,13\n*E\n"})
/* loaded from: classes4.dex */
public final class ModeLIstUiKt {
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void i(@m80.l Modifier modifier, @m80.k final com.baicizhan.main.activity.schedule_v2.mutimode.data.h selectMode, @m80.k final x00.l<? super com.baicizhan.main.activity.schedule_v2.mutimode.data.h, g2> infoClick, @m80.k final x00.l<? super com.baicizhan.main.activity.schedule_v2.mutimode.data.h, g2> itemClick, @m80.l Composer composer, final int i11, final int i12) {
        Modifier modifier2;
        int i13;
        Composer composer2;
        final Modifier modifier3;
        kotlin.jvm.internal.g0.p(selectMode, "selectMode");
        kotlin.jvm.internal.g0.p(infoClick, "infoClick");
        kotlin.jvm.internal.g0.p(itemClick, "itemClick");
        Composer startRestartGroup = composer.startRestartGroup(-1309884454);
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
            i13 |= startRestartGroup.changedInstance(selectMode) ? 32 : 16;
        }
        if ((i11 & 384) == 0) {
            i13 |= startRestartGroup.changedInstance(infoClick) ? 256 : 128;
        }
        if ((i11 & 3072) == 0) {
            i13 |= startRestartGroup.changedInstance(itemClick) ? 2048 : 1024;
        }
        if (startRestartGroup.shouldExecute((i13 & 1171) != 1170, i13 & 1)) {
            Modifier modifier4 = i14 != 0 ? Modifier.Companion : modifier2;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1309884454, i13, -1, "com.baicizhan.main.activity.schedule_v2.mutimode.ModeCard (modeLIstUi.kt:97)");
            }
            RoundedCornerShape m1019RoundedCornerShape0680j_4 = RoundedCornerShapeKt.m1019RoundedCornerShape0680j_4(Dp.m5115constructorimpl(4));
            Modifier m246borderxT4_qwU = selectMode.f() ? BorderKt.m246borderxT4_qwU(modifier4, Dp.m5115constructorimpl(1), bk.b.e0(), m1019RoundedCornerShape0680j_4) : modifier4;
            Object rememberedValue = startRestartGroup.rememberedValue();
            Composer.Companion companion = Composer.Companion;
            if (rememberedValue == companion.getEmpty()) {
                rememberedValue = InteractionSourceKt.MutableInteractionSource();
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            MutableInteractionSource mutableInteractionSource = (MutableInteractionSource) rememberedValue;
            boolean changedInstance = ((i13 & 7168) == 2048) | startRestartGroup.changedInstance(selectMode);
            Object rememberedValue2 = startRestartGroup.rememberedValue();
            if (changedInstance || rememberedValue2 == companion.getEmpty()) {
                rememberedValue2 = new x00.a() { // from class: com.baicizhan.main.activity.schedule_v2.mutimode.q
                    @Override // x00.a
                    public final Object invoke() {
                        g2 j11;
                        j11 = ModeLIstUiKt.j(x00.l.this, selectMode);
                        return j11;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue2);
            }
            Modifier m726padding3ABfNKs = PaddingKt.m726padding3ABfNKs(BackgroundKt.m234backgroundbw27NRU(ClickableKt.m267clickableO2vRcR0$default(m246borderxT4_qwU, mutableInteractionSource, null, false, null, null, (x00.a) rememberedValue2, 28, null), bk.b.A0(), m1019RoundedCornerShape0680j_4), Dp.m5115constructorimpl(16));
            Arrangement.Vertical top = Arrangement.INSTANCE.getTop();
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
            Modifier.Companion companion4 = Modifier.Companion;
            Modifier wrapContentHeight$default = SizeKt.wrapContentHeight$default(SizeKt.fillMaxWidth$default(companion4, 0.0f, 1, null), null, false, 3, null);
            MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(companion2.getTopStart(), false);
            int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap2 = startRestartGroup.getCurrentCompositionLocalMap();
            Modifier materializeModifier2 = ComposedModifierKt.materializeModifier(startRestartGroup, wrapContentHeight$default);
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
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            int i15 = i13;
            boolean z11 = true;
            Modifier modifier5 = modifier4;
            coil.compose.l.b(new ImageRequest.Builder((Context) startRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext())).j(selectMode.e().j()).f(), "cover", boxScopeInstance.align(SizeKt.m773size3ABfNKs(companion4, Dp.m5115constructorimpl(40)), companion2.getTopStart()), PainterResources_androidKt.painterResource(R.drawable.ic_mode_image_place_holder, startRestartGroup, 6), null, null, null, null, null, null, ContentScale.Companion.getCrop(), 0.0f, null, 0, false, null, startRestartGroup, 48, 6, 64496);
            float f11 = 6;
            Modifier align = boxScopeInstance.align(OffsetKt.m685offsetVpY3zN4(companion4, Dp.m5115constructorimpl(f11), Dp.m5115constructorimpl(-Dp.m5115constructorimpl(f11))), companion2.getTopEnd());
            Object rememberedValue3 = startRestartGroup.rememberedValue();
            if (rememberedValue3 == companion.getEmpty()) {
                rememberedValue3 = InteractionSourceKt.MutableInteractionSource();
                startRestartGroup.updateRememberedValue(rememberedValue3);
            }
            MutableInteractionSource mutableInteractionSource2 = (MutableInteractionSource) rememberedValue3;
            if ((i15 & 896) != 256) {
                z11 = false;
            }
            boolean changedInstance2 = z11 | startRestartGroup.changedInstance(selectMode);
            Object rememberedValue4 = startRestartGroup.rememberedValue();
            if (changedInstance2 || rememberedValue4 == companion.getEmpty()) {
                rememberedValue4 = new x00.a() { // from class: com.baicizhan.main.activity.schedule_v2.mutimode.r
                    @Override // x00.a
                    public final Object invoke() {
                        g2 k11;
                        k11 = ModeLIstUiKt.k(x00.l.this, selectMode);
                        return k11;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue4);
            }
            ImageKt.Image(PainterResources_androidKt.painterResource(R.drawable.ic_mode_desc_info, startRestartGroup, 6), "", ClickableKt.m267clickableO2vRcR0$default(align, mutableInteractionSource2, null, false, null, null, (x00.a) rememberedValue4, 28, null), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, startRestartGroup, 48, 120);
            startRestartGroup.endNode();
            float f12 = 12;
            SpacerKt.Spacer(SizeKt.m759height3ABfNKs(companion4, Dp.m5115constructorimpl(f12)), startRestartGroup, 6);
            Modifier align2 = columnScopeInstance.align(companion4, companion2.getStart());
            String l11 = selectMode.e().l();
            long m11 = bk.d.m();
            FontWeight.Companion companion5 = FontWeight.Companion;
            composer2 = startRestartGroup;
            TextKt.m1845Text4IGK_g(l11, align2, bk.b.x(), m11, (FontStyle) null, companion5.getNormal(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 1, 0, (x00.l<? super TextLayoutResult, g2>) null, (TextStyle) null, composer2, 200064, 3072, 122832);
            SpacerKt.Spacer(SizeKt.m759height3ABfNKs(companion4, Dp.m5115constructorimpl(f12)), composer2, 6);
            TextKt.m1845Text4IGK_g(selectMode.e().m(), columnScopeInstance.align(companion4, companion2.getStart()), bk.b.D(), bk.d.l(), (FontStyle) null, companion5.getLight(), (FontFamily) null, TextUnitKt.getSp(-0.5d), (TextDecoration) null, (TextAlign) null, 0L, 0, false, 3, 0, (x00.l<? super TextLayoutResult, g2>) null, (TextStyle) null, composer2, 200064, 3072, 122704);
            composer2.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            modifier3 = modifier5;
        } else {
            composer2 = startRestartGroup;
            composer2.skipToGroupEnd();
            modifier3 = modifier2;
        }
        ScopeUpdateScope endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new x00.p() { // from class: com.baicizhan.main.activity.schedule_v2.mutimode.s
                @Override // x00.p
                public final Object invoke(Object obj, Object obj2) {
                    g2 l12;
                    l12 = ModeLIstUiKt.l(Modifier.this, selectMode, infoClick, itemClick, i11, i12, (Composer) obj, ((Integer) obj2).intValue());
                    return l12;
                }
            });
        }
    }

    public static final g2 j(x00.l lVar, com.baicizhan.main.activity.schedule_v2.mutimode.data.h hVar) {
        lVar.invoke(hVar);
        return g2.f100423a;
    }

    public static final g2 k(x00.l lVar, com.baicizhan.main.activity.schedule_v2.mutimode.data.h hVar) {
        lVar.invoke(hVar);
        return g2.f100423a;
    }

    public static final g2 l(Modifier modifier, com.baicizhan.main.activity.schedule_v2.mutimode.data.h hVar, x00.l lVar, x00.l lVar2, int i11, int i12, Composer composer, int i13) {
        i(modifier, hVar, lVar, lVar2, composer, RecomposeScopeImplKt.updateChangedFlags(i11 | 1), i12);
        return g2.f100423a;
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void m(@m80.l Modifier modifier, @m80.k final List<com.baicizhan.main.activity.schedule_v2.mutimode.data.h> details, @m80.k final x00.l<? super com.baicizhan.main.activity.schedule_v2.mutimode.data.h, g2> itemClick, @m80.k final x00.l<? super com.baicizhan.main.activity.schedule_v2.mutimode.data.h, g2> infoClick, @m80.l Composer composer, final int i11, final int i12) {
        Modifier modifier2;
        int i13;
        Composer composer2;
        final Modifier modifier3;
        kotlin.jvm.internal.g0.p(details, "details");
        kotlin.jvm.internal.g0.p(itemClick, "itemClick");
        kotlin.jvm.internal.g0.p(infoClick, "infoClick");
        Composer startRestartGroup = composer.startRestartGroup(1023007285);
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
            i13 |= startRestartGroup.changedInstance(details) ? 32 : 16;
        }
        if ((i11 & 384) == 0) {
            i13 |= startRestartGroup.changedInstance(itemClick) ? 256 : 128;
        }
        if ((i11 & 3072) == 0) {
            i13 |= startRestartGroup.changedInstance(infoClick) ? 2048 : 1024;
        }
        if (startRestartGroup.shouldExecute((i13 & 1171) != 1170, i13 & 1)) {
            Modifier modifier4 = i14 != 0 ? Modifier.Companion : modifier2;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1023007285, i13, -1, "com.baicizhan.main.activity.schedule_v2.mutimode.ModeCardList (modeLIstUi.kt:77)");
            }
            PaddingValues m721PaddingValuesYgX7TsA$default = PaddingKt.m721PaddingValuesYgX7TsA$default(Dp.m5115constructorimpl(16), 0.0f, 2, null);
            Arrangement.HorizontalOrVertical m607spacedBy0680j_4 = Arrangement.INSTANCE.m607spacedBy0680j_4(Dp.m5115constructorimpl(15));
            boolean changedInstance = startRestartGroup.changedInstance(details) | ((i13 & 7168) == 2048) | ((i13 & 896) == 256);
            Object rememberedValue = startRestartGroup.rememberedValue();
            if (changedInstance || rememberedValue == Composer.Companion.getEmpty()) {
                rememberedValue = new x00.l() { // from class: com.baicizhan.main.activity.schedule_v2.mutimode.n
                    @Override // x00.l
                    public final Object invoke(Object obj) {
                        g2 n11;
                        n11 = ModeLIstUiKt.n(details, infoClick, itemClick, (LazyListScope) obj);
                        return n11;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            composer2 = startRestartGroup;
            LazyDslKt.LazyRow(modifier4, null, m721PaddingValuesYgX7TsA$default, false, m607spacedBy0680j_4, null, null, false, null, (x00.l) rememberedValue, composer2, (i13 & 14) | 24960, 490);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            modifier3 = modifier4;
        } else {
            composer2 = startRestartGroup;
            composer2.skipToGroupEnd();
            modifier3 = modifier2;
        }
        ScopeUpdateScope endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new x00.p() { // from class: com.baicizhan.main.activity.schedule_v2.mutimode.o
                @Override // x00.p
                public final Object invoke(Object obj, Object obj2) {
                    g2 o11;
                    o11 = ModeLIstUiKt.o(Modifier.this, details, itemClick, infoClick, i11, i12, (Composer) obj, ((Integer) obj2).intValue());
                    return o11;
                }
            });
        }
    }

    public static final g2 n(final List list, final x00.l lVar, final x00.l lVar2, LazyListScope LazyRow) {
        kotlin.jvm.internal.g0.p(LazyRow, "$this$LazyRow");
        final ModeLIstUiKt$ModeCardList$lambda$0$0$$inlined$items$default$1 modeLIstUiKt$ModeCardList$lambda$0$0$$inlined$items$default$1 = new x00.l() { // from class: com.baicizhan.main.activity.schedule_v2.mutimode.ModeLIstUiKt$ModeCardList$lambda$0$0$$inlined$items$default$1
            @Override // x00.l
            public final Void invoke(com.baicizhan.main.activity.schedule_v2.mutimode.data.h hVar) {
                return null;
            }

            @Override // x00.l
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                return invoke((com.baicizhan.main.activity.schedule_v2.mutimode.data.h) obj);
            }
        };
        LazyRow.items(list.size(), null, new x00.l<Integer, Object>() { // from class: com.baicizhan.main.activity.schedule_v2.mutimode.ModeLIstUiKt$ModeCardList$lambda$0$0$$inlined$items$default$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // x00.l
            public /* bridge */ /* synthetic */ Object invoke(Integer num) {
                return invoke(num.intValue());
            }

            public final Object invoke(int i11) {
                return x00.l.this.invoke(list.get(i11));
            }
        }, ComposableLambdaKt.composableLambdaInstance(-632812321, true, new x00.r<LazyItemScope, Integer, Composer, Integer, g2>() { // from class: com.baicizhan.main.activity.schedule_v2.mutimode.ModeLIstUiKt$ModeCardList$lambda$0$0$$inlined$items$default$4
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(4);
            }

            @Override // x00.r
            public /* bridge */ /* synthetic */ g2 invoke(LazyItemScope lazyItemScope, Integer num, Composer composer, Integer num2) {
                invoke(lazyItemScope, num.intValue(), composer, num2.intValue());
                return g2.f100423a;
            }

            @Composable
            public final void invoke(LazyItemScope lazyItemScope, int i11, Composer composer, int i12) {
                int i13;
                if ((i12 & 6) == 0) {
                    i13 = (composer.changed(lazyItemScope) ? 4 : 2) | i12;
                } else {
                    i13 = i12;
                }
                if ((i12 & 48) == 0) {
                    i13 |= composer.changed(i11) ? 32 : 16;
                }
                if (!composer.shouldExecute((i13 & 147) != 146, i13 & 1)) {
                    composer.skipToGroupEnd();
                    return;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-632812321, i13, -1, "androidx.compose.foundation.lazy.items.<anonymous> (LazyDsl.kt:178)");
                }
                com.baicizhan.main.activity.schedule_v2.mutimode.data.h hVar = (com.baicizhan.main.activity.schedule_v2.mutimode.data.h) list.get(i11);
                composer.startReplaceGroup(1676315640);
                ModeLIstUiKt.i(SizeKt.m759height3ABfNKs(SizeKt.m778width3ABfNKs(Modifier.Companion, Dp.m5115constructorimpl(146)), Dp.m5115constructorimpl(178)), hVar, lVar, lVar2, composer, 6, 0);
                composer.endReplaceGroup();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        }));
        return g2.f100423a;
    }

    public static final g2 o(Modifier modifier, List list, x00.l lVar, x00.l lVar2, int i11, int i12, Composer composer, int i13) {
        m(modifier, list, lVar, lVar2, composer, RecomposeScopeImplKt.updateChangedFlags(i11 | 1), i12);
        return g2.f100423a;
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void p(@m80.k final q0 uiStatus, @m80.k final x00.l<? super com.baicizhan.main.activity.schedule_v2.mutimode.data.h, g2> itemClick, @m80.k final x00.l<? super com.baicizhan.main.activity.schedule_v2.mutimode.data.h, g2> infoClick, @m80.l Composer composer, final int i11) {
        int i12;
        Composer composer2;
        ScopeUpdateScope endRestartGroup;
        x00.p<? super Composer, ? super Integer, g2> pVar;
        kotlin.jvm.internal.g0.p(uiStatus, "uiStatus");
        kotlin.jvm.internal.g0.p(itemClick, "itemClick");
        kotlin.jvm.internal.g0.p(infoClick, "infoClick");
        Composer startRestartGroup = composer.startRestartGroup(1666241216);
        if ((i11 & 6) == 0) {
            i12 = (startRestartGroup.changed(uiStatus) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= startRestartGroup.changedInstance(itemClick) ? 32 : 16;
        }
        if ((i11 & 384) == 0) {
            i12 |= startRestartGroup.changedInstance(infoClick) ? 256 : 128;
        }
        if (startRestartGroup.shouldExecute((i12 & 147) != 146, i12 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1666241216, i12, -1, "com.baicizhan.main.activity.schedule_v2.mutimode.ModeList (modeLIstUi.kt:58)");
            }
            if (!(uiStatus instanceof q0.e)) {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                endRestartGroup = startRestartGroup.endRestartGroup();
                if (endRestartGroup != null) {
                    pVar = new x00.p() { // from class: com.baicizhan.main.activity.schedule_v2.mutimode.t
                        @Override // x00.p
                        public final Object invoke(Object obj, Object obj2) {
                            g2 q11;
                            q11 = ModeLIstUiKt.q(q0.this, itemClick, infoClick, i11, (Composer) obj, ((Integer) obj2).intValue());
                            return q11;
                        }
                    };
                    endRestartGroup.updateScope(pVar);
                }
                return;
            }
            Modifier.Companion companion = Modifier.Companion;
            MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.Companion.getStart(), startRestartGroup, 0);
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
            Modifier materializeModifier = ComposedModifierKt.materializeModifier(startRestartGroup, companion);
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
            float f11 = 16;
            TextKt.m1845Text4IGK_g(StringResources_androidKt.stringResource(R.string.multi_pattern_setting_title, startRestartGroup, 6), OffsetKt.m686offsetVpY3zN4$default(companion, Dp.m5115constructorimpl(f11), 0.0f, 2, null), 0L, bk.d.n(), (FontStyle) null, FontWeight.Companion.getMedium(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (x00.l<? super TextLayoutResult, g2>) null, (TextStyle) null, startRestartGroup, 199728, 0, 131028);
            SpacerKt.Spacer(SizeKt.m759height3ABfNKs(companion, Dp.m5115constructorimpl(f11)), startRestartGroup, 6);
            int i13 = i12 << 3;
            m(SizeKt.wrapContentHeight$default(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), null, false, 3, null), ((q0.e) uiStatus).d(), itemClick, infoClick, startRestartGroup, 6 | (i13 & 896) | (i13 & 7168), 0);
            composer2 = startRestartGroup;
            composer2.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer2 = startRestartGroup;
            composer2.skipToGroupEnd();
        }
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
            pVar = new x00.p() { // from class: com.baicizhan.main.activity.schedule_v2.mutimode.u
                @Override // x00.p
                public final Object invoke(Object obj, Object obj2) {
                    g2 r11;
                    r11 = ModeLIstUiKt.r(q0.this, itemClick, infoClick, i11, (Composer) obj, ((Integer) obj2).intValue());
                    return r11;
                }
            };
            endRestartGroup.updateScope(pVar);
        }
    }

    public static final g2 q(q0 q0Var, x00.l lVar, x00.l lVar2, int i11, Composer composer, int i12) {
        p(q0Var, lVar, lVar2, composer, RecomposeScopeImplKt.updateChangedFlags(i11 | 1));
        return g2.f100423a;
    }

    public static final g2 r(q0 q0Var, x00.l lVar, x00.l lVar2, int i11, Composer composer, int i12) {
        p(q0Var, lVar, lVar2, composer, RecomposeScopeImplKt.updateChangedFlags(i11 | 1));
        return g2.f100423a;
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    @Preview
    public static final void s(@m80.l Composer composer, final int i11) {
        Composer startRestartGroup = composer.startRestartGroup(-56854101);
        if (startRestartGroup.shouldExecute(i11 != 0, i11 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-56854101, i11, -1, "com.baicizhan.main.activity.schedule_v2.mutimode.preView (modeLIstUi.kt:160)");
            }
            bk.k.e(null, null, null, g.f19332a.h(), startRestartGroup, 3072, 7);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new x00.p() { // from class: com.baicizhan.main.activity.schedule_v2.mutimode.p
                @Override // x00.p
                public final Object invoke(Object obj, Object obj2) {
                    g2 t11;
                    t11 = ModeLIstUiKt.t(i11, (Composer) obj, ((Integer) obj2).intValue());
                    return t11;
                }
            });
        }
    }

    public static final g2 t(int i11, Composer composer, int i12) {
        s(composer, RecomposeScopeImplKt.updateChangedFlags(i11 | 1));
        return g2.f100423a;
    }
}
