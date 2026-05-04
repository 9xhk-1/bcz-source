package com.baicizhan.main.customview.compose;

import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.interaction.InteractionSourceKt;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.material.FractionalThreshold;
import androidx.compose.material.SwipeableState;
import androidx.compose.material.ThresholdConfig;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.res.PainterResources_androidKt;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.window.PopupProperties;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nCommonWidget.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CommonWidget.kt\ncom/baicizhan/main/customview/compose/CommonWidgetKt\n+ 2 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 3 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 4 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 5 Composer.kt\nandroidx/compose/runtime/Updater\n+ 6 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 7 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 8 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 9 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 10 IntOffset.kt\nandroidx/compose/ui/unit/IntOffsetKt\n+ 11 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 12 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 13 IntSize.kt\nandroidx/compose/ui/unit/IntSize\n*L\n1#1,183:1\n70#2:184\n67#2,9:185\n77#2:225\n70#2:244\n67#2,9:245\n70#2:289\n67#2,9:290\n77#2:329\n70#2:342\n67#2,9:343\n77#2:382\n77#2:386\n79#3,6:194\n86#3,3:209\n89#3,2:218\n93#3:224\n79#3,6:254\n86#3,3:269\n89#3,2:278\n79#3,6:299\n86#3,3:314\n89#3,2:323\n93#3:328\n79#3,6:352\n86#3,3:367\n89#3,2:376\n93#3:381\n93#3:385\n347#4,9:200\n356#4:220\n357#4,2:222\n347#4,9:260\n356#4:280\n347#4,9:305\n356#4,3:325\n347#4,9:358\n356#4,3:378\n357#4,2:383\n4206#5,6:212\n4206#5,6:272\n4206#5,6:317\n4206#5,6:370\n113#6:221\n1247#7,6:226\n1247#7,6:232\n1247#7,6:238\n1247#7,6:281\n1247#7,6:330\n1247#7,6:336\n1247#7,6:389\n1247#7,6:395\n1247#7,6:401\n75#8:287\n1#9:288\n32#10:387\n32#10:417\n80#11:388\n85#11:414\n90#11:416\n80#11:418\n85#12:407\n113#12,2:408\n85#12:410\n113#12,2:411\n54#13:413\n59#13:415\n*S KotlinDebug\n*F\n+ 1 CommonWidget.kt\ncom/baicizhan/main/customview/compose/CommonWidgetKt\n*L\n43#1:184\n43#1:185,9\n43#1:225\n77#1:244\n77#1:245,9\n86#1:289\n86#1:290,9\n86#1:329\n92#1:342\n92#1:343,9\n92#1:382\n77#1:386\n43#1:194,6\n43#1:209,3\n43#1:218,2\n43#1:224\n77#1:254,6\n77#1:269,3\n77#1:278,2\n86#1:299,6\n86#1:314,3\n86#1:323,2\n86#1:328\n92#1:352,6\n92#1:367,3\n92#1:376,2\n92#1:381\n77#1:385\n43#1:200,9\n43#1:220\n43#1:222,2\n77#1:260,9\n77#1:280\n86#1:305,9\n86#1:325,3\n92#1:358,9\n92#1:378,3\n77#1:383,2\n43#1:212,6\n77#1:272,6\n86#1:317,6\n92#1:370,6\n52#1:221\n73#1:226,6\n75#1:232,6\n81#1:238,6\n86#1:281,6\n92#1:330,6\n94#1:336,6\n111#1:389,6\n175#1:395,6\n178#1:401,6\n88#1:287\n105#1:387\n95#1:417\n105#1:388\n87#1:414\n93#1:416\n95#1:418\n73#1:407\n73#1:408,2\n75#1:410\n75#1:411,2\n87#1:413\n93#1:415\n*E\n"})
/* loaded from: classes4.dex */
public final class a0 {
    /* JADX WARN: Removed duplicated region for block: B:13:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0188  */
    /* JADX WARN: Removed duplicated region for block: B:53:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x017d  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x004d  */
    @androidx.compose.runtime.ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @androidx.compose.runtime.Composable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void j(@m80.k final java.lang.String r20, boolean r21, @androidx.annotation.DrawableRes int r22, @m80.k final x00.a<yz.g2> r23, @m80.l androidx.compose.runtime.Composer r24, final int r25, final int r26) {
        /*
            Method dump skipped, instructions count: 409
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.baicizhan.main.customview.compose.a0.j(java.lang.String, boolean, int, x00.a, androidx.compose.runtime.Composer, int, int):void");
    }

    public static final g2 k(String str, boolean z11, int i11, x00.a aVar, int i12, int i13, Composer composer, int i14) {
        j(str, z11, i11, aVar, composer, RecomposeScopeImplKt.updateChangedFlags(i12 | 1), i13);
        return g2.f100423a;
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void l(@m80.l Modifier modifier, final int i11, final int i12, final boolean z11, @m80.k final x00.l<? super Boolean, g2> onChecked, @m80.l Composer composer, final int i13, final int i14) {
        Modifier modifier2;
        int i15;
        int i16;
        int i17;
        boolean z12;
        g0.p(onChecked, "onChecked");
        Composer startRestartGroup = composer.startRestartGroup(1457793597);
        int i18 = i14 & 1;
        if (i18 != 0) {
            i15 = i13 | 6;
            modifier2 = modifier;
        } else if ((i13 & 6) == 0) {
            modifier2 = modifier;
            i15 = (startRestartGroup.changed(modifier2) ? 4 : 2) | i13;
        } else {
            modifier2 = modifier;
            i15 = i13;
        }
        if ((i13 & 48) == 0) {
            i16 = i11;
            i15 |= startRestartGroup.changed(i16) ? 32 : 16;
        } else {
            i16 = i11;
        }
        if ((i13 & 384) == 0) {
            i17 = i12;
            i15 |= startRestartGroup.changed(i17) ? 256 : 128;
        } else {
            i17 = i12;
        }
        if ((i13 & 3072) == 0) {
            z12 = z11;
            i15 |= startRestartGroup.changed(z12) ? 2048 : 1024;
        } else {
            z12 = z11;
        }
        if ((i13 & 24576) == 0) {
            i15 |= startRestartGroup.changedInstance(onChecked) ? 16384 : 8192;
        }
        if (startRestartGroup.shouldExecute((i15 & 9363) != 9362, i15 & 1)) {
            Modifier modifier3 = i18 != 0 ? Modifier.Companion : modifier2;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1457793597, i15, -1, "com.baicizhan.main.customview.compose.ImageCheck (CommonWidget.kt:172)");
            }
            Object rememberedValue = startRestartGroup.rememberedValue();
            Composer.Companion companion = Composer.Companion;
            if (rememberedValue == companion.getEmpty()) {
                rememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            final MutableState mutableState = (MutableState) rememberedValue;
            mutableState.setValue(Boolean.valueOf(z12));
            MutableInteractionSource MutableInteractionSource = InteractionSourceKt.MutableInteractionSource();
            boolean changed = startRestartGroup.changed(mutableState) | ((57344 & i15) == 16384);
            Object rememberedValue2 = startRestartGroup.rememberedValue();
            if (changed || rememberedValue2 == companion.getEmpty()) {
                rememberedValue2 = new x00.a() { // from class: com.baicizhan.main.customview.compose.s
                    @Override // x00.a
                    public final Object invoke() {
                        g2 m11;
                        m11 = a0.m(MutableState.this, onChecked);
                        return m11;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue2);
            }
            Modifier m267clickableO2vRcR0$default = ClickableKt.m267clickableO2vRcR0$default(modifier3, MutableInteractionSource, null, false, null, null, (x00.a) rememberedValue2, 28, null);
            modifier2 = modifier3;
            ImageKt.Image(PainterResources_androidKt.painterResource(((Boolean) mutableState.getValue()).booleanValue() ? i16 : i17, startRestartGroup, 0), (String) null, m267clickableO2vRcR0$default, (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, startRestartGroup, 48, 120);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        final Modifier modifier4 = modifier2;
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new x00.p() { // from class: com.baicizhan.main.customview.compose.t
                @Override // x00.p
                public final Object invoke(Object obj, Object obj2) {
                    g2 n11;
                    n11 = a0.n(Modifier.this, i11, i12, z11, onChecked, i13, i14, (Composer) obj, ((Integer) obj2).intValue());
                    return n11;
                }
            });
        }
    }

    public static final g2 m(MutableState mutableState, x00.l lVar) {
        mutableState.setValue(Boolean.valueOf(!((Boolean) mutableState.getValue()).booleanValue()));
        lVar.invoke(mutableState.getValue());
        return g2.f100423a;
    }

    public static final g2 n(Modifier modifier, int i11, int i12, boolean z11, x00.l lVar, int i13, int i14, Composer composer, int i15) {
        l(modifier, i11, i12, z11, lVar, composer, RecomposeScopeImplKt.updateChangedFlags(i13 | 1), i14);
        return g2.f100423a;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:60:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0054  */
    @androidx.compose.runtime.Composable
    @androidx.compose.runtime.ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void o(@m80.l androidx.compose.ui.Alignment r25, long r26, @m80.l x00.a<yz.g2> r28, @m80.l androidx.compose.ui.window.PopupProperties r29, @m80.k final x00.p<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, yz.g2> r30, @m80.l androidx.compose.runtime.Composer r31, final int r32, final int r33) {
        /*
            Method dump skipped, instructions count: 334
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.baicizhan.main.customview.compose.a0.o(androidx.compose.ui.Alignment, long, x00.a, androidx.compose.ui.window.PopupProperties, x00.p, androidx.compose.runtime.Composer, int, int):void");
    }

    public static final g2 p(Alignment alignment, long j11, x00.a aVar, PopupProperties popupProperties, x00.p pVar, int i11, int i12, Composer composer, int i13) {
        o(alignment, j11, aVar, popupProperties, pVar, composer, RecomposeScopeImplKt.updateChangedFlags(i11 | 1), i12);
        return g2.f100423a;
    }

    /* JADX WARN: Removed duplicated region for block: B:104:0x0359  */
    /* JADX WARN: Removed duplicated region for block: B:107:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:117:0x034e  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00a6  */
    @androidx.compose.runtime.Composable
    @androidx.compose.runtime.ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void q(@m80.l androidx.compose.ui.Modifier r23, @m80.k final androidx.compose.material.SwipeableState<java.lang.Integer> r24, boolean r25, @m80.k x00.p<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, yz.g2> r26, @m80.k final x00.p<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, yz.g2> r27, @m80.l androidx.compose.runtime.Composer r28, final int r29, final int r30) {
        /*
            Method dump skipped, instructions count: 874
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.baicizhan.main.customview.compose.a0.q(androidx.compose.ui.Modifier, androidx.compose.material.SwipeableState, boolean, x00.p, x00.p, androidx.compose.runtime.Composer, int, int):void");
    }

    public static final int r(MutableState<Integer> mutableState) {
        return mutableState.getValue().intValue();
    }

    public static final void s(MutableState<Integer> mutableState, int i11) {
        mutableState.setValue(Integer.valueOf(i11));
    }

    public static final int t(MutableState<Integer> mutableState) {
        return mutableState.getValue().intValue();
    }

    public static final void u(MutableState<Integer> mutableState, int i11) {
        mutableState.setValue(Integer.valueOf(i11));
    }

    public static final ThresholdConfig v(int i11, int i12) {
        return new FractionalThreshold(0.7f);
    }

    public static final g2 w(MutableState mutableState, LayoutCoordinates it) {
        g0.p(it, "it");
        s(mutableState, (int) (it.mo3865getSizeYbymL2g() >> 32));
        return g2.f100423a;
    }

    public static final g2 x(MutableState mutableState, LayoutCoordinates it) {
        g0.p(it, "it");
        u(mutableState, (int) (it.mo3865getSizeYbymL2g() & 4294967295L));
        return g2.f100423a;
    }

    public static final IntOffset y(boolean z11, SwipeableState swipeableState, Density offset) {
        g0.p(offset, "$this$offset");
        return IntOffset.m5234boximpl(IntOffset.m5237constructorimpl(((z11 ? -((int) swipeableState.getOffset().getValue().floatValue()) : 0) << 32) | (0 & 4294967295L)));
    }

    public static final g2 z(Modifier modifier, SwipeableState swipeableState, boolean z11, x00.p pVar, x00.p pVar2, int i11, int i12, Composer composer, int i13) {
        q(modifier, swipeableState, z11, pVar, pVar2, composer, RecomposeScopeImplKt.updateChangedFlags(i11 | 1), i12);
        return g2.f100423a;
    }
}
