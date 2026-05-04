package com.baicizhan.main.home.plan.newexam;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.interaction.InteractionSourceKt;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
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
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.DrawModifierKt;
import androidx.compose.ui.graphics.AndroidCanvas_androidKt;
import androidx.compose.ui.graphics.Canvas;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.drawscope.DrawScope;
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
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.TextUnitKt;
import androidx.core.content.ContextCompat;
import com.baicizhan.client.business.util.KotlinExtKt;
import com.baicizhan.client.business.webview.MapLearnHelper;
import com.jiongji.andriod.card.R;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@kotlin.jvm.internal.u0({"SMAP\nCardTips.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CardTips.kt\ncom/baicizhan/main/home/plan/newexam/CardTipsKt\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 4 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 5 Row.kt\nandroidx/compose/foundation/layout/RowKt\n+ 6 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 7 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 8 Composer.kt\nandroidx/compose/runtime/Updater\n+ 9 IntOffset.kt\nandroidx/compose/ui/unit/IntOffsetKt\n+ 10 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 11 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 12 DrawScope.kt\nandroidx/compose/ui/graphics/drawscope/DrawScopeKt\n+ 13 Size.kt\nandroidx/compose/ui/geometry/Size\n+ 14 InlineClassHelper.jvm.kt\nandroidx/compose/ui/util/InlineClassHelper_jvmKt\n+ 15 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 16 IntSize.kt\nandroidx/compose/ui/unit/IntSize\n*L\n1#1,130:1\n75#2:131\n75#2:227\n1247#3,6:132\n1247#3,6:176\n1247#3,6:228\n1247#3,6:234\n1247#3,6:240\n1247#3,6:247\n113#4:138\n113#4:182\n113#4:183\n113#4:246\n99#5:139\n96#5,9:140\n106#5:187\n79#6,6:149\n86#6,3:164\n89#6,2:173\n93#6:186\n79#6,6:200\n86#6,3:215\n89#6,2:224\n93#6:255\n347#7,9:155\n356#7:175\n357#7,2:184\n347#7,9:206\n356#7:226\n357#7,2:253\n4206#8,6:167\n4206#8,6:218\n32#9:188\n80#10:189\n60#10:259\n70#10:262\n90#10:270\n70#11:190\n67#11,9:191\n77#11:256\n233#12:257\n57#13:258\n61#13:261\n22#14:260\n85#15:263\n113#15,2:264\n85#15:266\n113#15,2:267\n59#16:269\n*S KotlinDebug\n*F\n+ 1 CardTips.kt\ncom/baicizhan/main/home/plan/newexam/CardTipsKt\n*L\n50#1:131\n90#1:227\n53#1:132,6\n72#1:176,6\n91#1:228,6\n94#1:234,6\n97#1:240,6\n109#1:247,6\n65#1:138\n75#1:182\n76#1:183\n103#1:246\n52#1:139\n52#1:140,9\n52#1:187\n52#1:149,6\n52#1:164,3\n52#1:173,2\n52#1:186\n87#1:200,6\n87#1:215,3\n87#1:224,2\n87#1:255\n52#1:155,9\n52#1:175\n52#1:184,2\n87#1:206,9\n87#1:226\n87#1:253,2\n52#1:167,6\n87#1:218,6\n86#1:188\n86#1:189\n59#1:259\n59#1:262\n98#1:270\n87#1:190\n87#1:191,9\n87#1:256\n54#1:257\n59#1:258\n59#1:261\n59#1:260\n91#1:263\n91#1:264,2\n94#1:266\n94#1:267,2\n98#1:269\n*E\n"})
/* loaded from: classes4.dex */
public final class j {
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    @Preview(heightDp = 2000)
    public static final void g(@m80.l Composer composer, final int i11) {
        Composer startRestartGroup = composer.startRestartGroup(2064470928);
        if (startRestartGroup.shouldExecute(i11 != 0, i11 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(2064470928, i11, -1, "com.baicizhan.main.home.plan.newexam.CardTipsPreview (CardTips.kt:120)");
            }
            bk.k.e(null, null, null, m.f22749a.c(), startRestartGroup, 3072, 7);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new x00.p() { // from class: com.baicizhan.main.home.plan.newexam.i
                @Override // x00.p
                public final Object invoke(Object obj, Object obj2) {
                    yz.g2 h11;
                    h11 = j.h(i11, (Composer) obj, ((Integer) obj2).intValue());
                    return h11;
                }
            });
        }
    }

    public static final yz.g2 h(int i11, Composer composer, int i12) {
        g(composer, RecomposeScopeImplKt.updateChangedFlags(i11 | 1));
        return yz.g2.f100423a;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0235  */
    /* JADX WARN: Removed duplicated region for block: B:78:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:83:0x022c  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0088  */
    @androidx.compose.runtime.Composable
    @androidx.compose.runtime.ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void i(@m80.k final androidx.compose.ui.Modifier r39, final boolean r40, long r41, @m80.k final x00.q<? super androidx.compose.ui.Modifier, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, yz.g2> r43, @m80.k final x00.r<? super androidx.compose.ui.Modifier, ? super x00.a<yz.g2>, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, yz.g2> r44, @m80.l androidx.compose.runtime.Composer r45, final int r46, final int r47) {
        /*
            Method dump skipped, instructions count: 577
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.baicizhan.main.home.plan.newexam.j.i(androidx.compose.ui.Modifier, boolean, long, x00.q, x00.r, androidx.compose.runtime.Composer, int, int):void");
    }

    public static final int j(MutableState<Integer> mutableState) {
        return mutableState.getValue().intValue();
    }

    public static final void k(MutableState<Integer> mutableState, int i11) {
        mutableState.setValue(Integer.valueOf(i11));
    }

    public static final boolean l(MutableState<Boolean> mutableState) {
        return mutableState.getValue().booleanValue();
    }

    public static final void m(MutableState<Boolean> mutableState, boolean z11) {
        mutableState.setValue(Boolean.valueOf(z11));
    }

    public static final yz.g2 n(MutableState mutableState, IntSize intSize) {
        k(mutableState, (int) (intSize.m5290unboximpl() & 4294967295L));
        return yz.g2.f100423a;
    }

    public static final yz.g2 o(MutableState mutableState) {
        m(mutableState, true);
        return yz.g2.f100423a;
    }

    public static final yz.g2 p(Modifier modifier, boolean z11, long j11, x00.q qVar, x00.r rVar, int i11, int i12, Composer composer, int i13) {
        i(modifier, z11, j11, qVar, rVar, composer, RecomposeScopeImplKt.updateChangedFlags(i11 | 1), i12);
        return yz.g2.f100423a;
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void q(@m80.k final Modifier modifier, @m80.k final x00.a<yz.g2> onClick, @m80.l Composer composer, final int i11) {
        int i12;
        Composer composer2;
        kotlin.jvm.internal.g0.p(modifier, "modifier");
        kotlin.jvm.internal.g0.p(onClick, "onClick");
        Composer startRestartGroup = composer.startRestartGroup(-1313625993);
        if ((i11 & 6) == 0) {
            i12 = (startRestartGroup.changed(modifier) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= startRestartGroup.changedInstance(onClick) ? 32 : 16;
        }
        if (startRestartGroup.shouldExecute((i12 & 19) != 18, i12 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1313625993, i12, -1, "com.baicizhan.main.home.plan.newexam.WordMapTips (CardTips.kt:48)");
            }
            final Context context = (Context) startRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
            KotlinExtKt.setKvFlagTrue(MapLearnHelper.INSTANCE.getKEY_HAS_SHOW_MAP_TIP(), true);
            boolean changedInstance = startRestartGroup.changedInstance(context);
            Object rememberedValue = startRestartGroup.rememberedValue();
            if (changedInstance || rememberedValue == Composer.Companion.getEmpty()) {
                rememberedValue = new x00.l() { // from class: com.baicizhan.main.home.plan.newexam.g
                    @Override // x00.l
                    public final Object invoke(Object obj) {
                        yz.g2 r11;
                        r11 = j.r(context, (DrawScope) obj);
                        return r11;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            Modifier m726padding3ABfNKs = PaddingKt.m726padding3ABfNKs(DrawModifierKt.drawBehind(modifier, (x00.l) rememberedValue), Dp.m5115constructorimpl(12));
            Arrangement.Horizontal start = Arrangement.INSTANCE.getStart();
            Alignment.Companion companion = Alignment.Companion;
            MeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(start, companion.getTop(), startRestartGroup, 0);
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
            Modifier materializeModifier = ComposedModifierKt.materializeModifier(startRestartGroup, m726padding3ABfNKs);
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
            x00.p<ComposeUiNode, Integer, yz.g2> setCompositeKeyHash = companion2.getSetCompositeKeyHash();
            if (m1951constructorimpl.getInserting() || !kotlin.jvm.internal.g0.g(m1951constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                m1951constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                m1951constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m1958setimpl(m1951constructorimpl, materializeModifier, companion2.getSetModifier());
            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
            Modifier.Companion companion3 = Modifier.Companion;
            TextKt.m1845Text4IGK_g(StringResources_androidKt.stringResource(R.string.learn_tab_word_map_tips, startRestartGroup, 6), RowScope.weight$default(rowScopeInstance, companion3, 1.0f, false, 2, null), bk.b.A0(), TextUnitKt.getSp(14), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (x00.l<? super TextLayoutResult, yz.g2>) null, (TextStyle) null, startRestartGroup, 3456, 0, 131056);
            Object rememberedValue2 = startRestartGroup.rememberedValue();
            if (rememberedValue2 == Composer.Companion.getEmpty()) {
                rememberedValue2 = InteractionSourceKt.MutableInteractionSource();
                startRestartGroup.updateRememberedValue(rememberedValue2);
            }
            float f11 = 10;
            ImageKt.Image(PainterResources_androidKt.painterResource(R.drawable.ic_close_white, startRestartGroup, 6), "close tips", rowScopeInstance.align(SizeKt.wrapContentSize$default(SizeKt.m773size3ABfNKs(PaddingKt.m729paddingqDBjuR0(ClickableKt.m267clickableO2vRcR0$default(companion3, (MutableInteractionSource) rememberedValue2, null, false, null, null, onClick, 28, null), Dp.m5115constructorimpl(8), Dp.m5115constructorimpl(f11), Dp.m5115constructorimpl(0), Dp.m5115constructorimpl(f11)), Dp.m5115constructorimpl(20)), null, false, 3, null), companion.getCenterVertically()), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, startRestartGroup, 48, 120);
            composer2 = startRestartGroup;
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
            endRestartGroup.updateScope(new x00.p() { // from class: com.baicizhan.main.home.plan.newexam.h
                @Override // x00.p
                public final Object invoke(Object obj, Object obj2) {
                    yz.g2 s11;
                    s11 = j.s(Modifier.this, onClick, i11, (Composer) obj, ((Integer) obj2).intValue());
                    return s11;
                }
            });
        }
    }

    public static final yz.g2 r(Context context, DrawScope drawBehind) {
        kotlin.jvm.internal.g0.p(drawBehind, "$this$drawBehind");
        Canvas canvas = drawBehind.getDrawContext().getCanvas();
        Drawable drawable = ContextCompat.getDrawable(context, R.drawable.bg_learn_map_tip_pop);
        if (drawable != null) {
            drawable.setBounds(new Rect(0, 0, (int) Float.intBitsToFloat((int) (drawBehind.mo3060getSizeNHjbRc() >> 32)), (int) Float.intBitsToFloat((int) (drawBehind.mo3060getSizeNHjbRc() & 4294967295L))));
            drawable.draw(AndroidCanvas_androidKt.getNativeCanvas(canvas));
        }
        return yz.g2.f100423a;
    }

    public static final yz.g2 s(Modifier modifier, x00.a aVar, int i11, Composer composer, int i12) {
        q(modifier, aVar, composer, RecomposeScopeImplKt.updateChangedFlags(i11 | 1));
        return yz.g2.f100423a;
    }
}
