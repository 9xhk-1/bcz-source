package androidx.compose.material;

import a00.h0;
import a90.c3;
import androidx.compose.animation.core.TweenSpec;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.CanvasKt;
import androidx.compose.foundation.FocusableKt;
import androidx.compose.foundation.HoverableKt;
import androidx.compose.foundation.IndicationKt;
import androidx.compose.foundation.ProgressSemanticsKt;
import androidx.compose.foundation.gestures.DraggableState;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScope;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material.Strings;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ShadowKt;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.PointMode;
import androidx.compose.ui.graphics.StrokeCap;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.input.key.Key;
import androidx.compose.ui.input.key.KeyEvent;
import androidx.compose.ui.input.key.KeyEventType;
import androidx.compose.ui.input.key.KeyEvent_androidKt;
import androidx.compose.ui.input.key.KeyInputModifierKt;
import androidx.compose.ui.input.pointer.SuspendPointerInputElement;
import androidx.compose.ui.input.pointer.SuspendingPointerInputFilterKt$sam$androidx_compose_ui_input_pointer_PointerInputEventHandler$0;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.platform.InspectableValueKt;
import androidx.compose.ui.platform.InspectorInfo;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.compose.ui.util.MathHelpersKt;
import c40.r0;
import g10.f;
import g10.t;
import g10.u;
import j00.c;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.intrinsics.b;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import m80.k;
import x00.a;
import x00.l;
import x00.p;
import x00.q;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nSlider.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Slider.kt\nandroidx/compose/material/SliderKt\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 Dp.kt\nandroidx/compose/ui/unit/Dp\n+ 5 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 6 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 7 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 8 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 9 Composer.kt\nandroidx/compose/runtime/Updater\n+ 10 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 11 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n+ 12 MathHelpers.kt\nandroidx/compose/ui/util/MathHelpersKt\n+ 13 InspectableValue.kt\nandroidx/compose/ui/platform/InspectableValueKt\n*L\n1#1,1290:1\n1247#2,6:1291\n1247#2,6:1298\n1247#2,6:1306\n1247#2,6:1312\n1247#2,6:1318\n1247#2,6:1408\n1247#2,6:1414\n1247#2,6:1460\n1247#2,6:1466\n1247#2,6:1477\n1247#2,6:1512\n1#3:1297\n87#4:1304\n87#4:1324\n87#4:1362\n84#4:1363\n87#4:1405\n84#4:1406\n84#4:1407\n75#5:1305\n75#5:1361\n75#5:1404\n71#6:1325\n68#6,6:1326\n74#6:1360\n78#6:1367\n71#6:1368\n68#6,6:1369\n74#6:1403\n78#6:1423\n71#6:1424\n68#6,6:1425\n74#6:1459\n78#6:1476\n79#7,6:1332\n86#7,4:1347\n90#7,2:1357\n94#7:1366\n79#7,6:1375\n86#7,4:1390\n90#7,2:1400\n94#7:1422\n79#7,6:1431\n86#7,4:1446\n90#7,2:1456\n94#7:1475\n368#8,9:1338\n377#8:1359\n378#8,2:1364\n368#8,9:1381\n377#8:1402\n378#8,2:1420\n368#8,9:1437\n377#8:1458\n378#8,2:1473\n4034#9,6:1351\n4034#9,6:1394\n4034#9,6:1450\n149#10:1472\n149#10:1519\n149#10:1520\n149#10:1521\n149#10:1522\n149#10:1523\n149#10:1524\n149#10:1525\n482#11,13:1483\n71#12,16:1496\n135#13:1518\n*S KotlinDebug\n*F\n+ 1 Slider.kt\nandroidx/compose/material/SliderKt\n*L\n168#1:1291,6\n172#1:1298,6\n408#1:1306,6\n409#1:1312,6\n413#1:1318,6\n756#1:1408,6\n768#1:1414,6\n792#1:1460,6\n793#1:1466,6\n841#1:1477,6\n931#1:1512,6\n177#1:1304\n419#1:1324\n697#1:1362\n698#1:1363\n741#1:1405\n742#1:1406\n743#1:1407\n192#1:1305\n691#1:1361\n735#1:1404\n687#1:1325\n687#1:1326,6\n687#1:1360\n687#1:1367\n731#1:1368\n731#1:1369,6\n731#1:1403\n731#1:1423\n791#1:1424\n791#1:1425,6\n791#1:1459\n791#1:1476\n687#1:1332,6\n687#1:1347,4\n687#1:1357,2\n687#1:1366\n731#1:1375,6\n731#1:1390,4\n731#1:1400,2\n731#1:1422\n791#1:1431,6\n791#1:1446,4\n791#1:1456,2\n791#1:1475\n687#1:1338,9\n687#1:1359\n687#1:1364,2\n731#1:1381,9\n731#1:1402\n731#1:1420,2\n791#1:1437,9\n791#1:1458\n791#1:1473,2\n687#1:1351,6\n731#1:1394,6\n791#1:1450,6\n820#1:1472\n1251#1:1519\n1252#1:1520\n1253#1:1521\n1254#1:1522\n1257#1:1523\n1258#1:1524\n1259#1:1525\n890#1:1483,13\n921#1:1496,16\n1032#1:1518\n*E\n"})
/* loaded from: classes.dex */
public final class SliderKt {

    @k
    private static final Modifier DefaultSliderConstraints;
    private static final float SliderHeight;
    private static final float SliderMinWidth;

    @k
    private static final TweenSpec<Float> SliderToTickAnimation;
    private static final float ThumbRadius = Dp.m5115constructorimpl(10);
    private static final float ThumbRippleRadius = Dp.m5115constructorimpl(24);
    private static final float ThumbDefaultElevation = Dp.m5115constructorimpl(1);
    private static final float ThumbPressedElevation = Dp.m5115constructorimpl(6);
    private static final float TrackHeight = Dp.m5115constructorimpl(4);

    static {
        float m5115constructorimpl = Dp.m5115constructorimpl(48);
        SliderHeight = m5115constructorimpl;
        float m5115constructorimpl2 = Dp.m5115constructorimpl(144);
        SliderMinWidth = m5115constructorimpl2;
        DefaultSliderConstraints = SizeKt.m761heightInVpY3zN4$default(SizeKt.m780widthInVpY3zN4$default(Modifier.Companion, m5115constructorimpl2, 0.0f, 2, null), 0.0f, m5115constructorimpl, 1, null);
        SliderToTickAnimation = new TweenSpec<>(100, 0, null, 6, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Composable
    public static final void CorrectValueSideEffect(final l<? super Float, Float> lVar, final f<Float> fVar, final f<Float> fVar2, final MutableState<Float> mutableState, final float f11, Composer composer, final int i11) {
        int i12;
        float f12;
        int i13;
        Composer startRestartGroup = composer.startRestartGroup(-743965752);
        if ((i11 & 6) == 0) {
            i12 = (startRestartGroup.changedInstance(lVar) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= startRestartGroup.changed(fVar) ? 32 : 16;
        }
        if ((i11 & 384) == 0) {
            i12 |= startRestartGroup.changed(fVar2) ? 256 : 128;
        }
        if ((i11 & 3072) == 0) {
            i12 |= startRestartGroup.changed(mutableState) ? 2048 : 1024;
        }
        if ((i11 & 24576) == 0) {
            f12 = f11;
            i12 |= startRestartGroup.changed(f12) ? 16384 : 8192;
        } else {
            f12 = f11;
        }
        if (startRestartGroup.shouldExecute((i12 & 9363) != 9362, i12 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-743965752, i12, -1, "androidx.compose.material.CorrectValueSideEffect (Slider.kt:929)");
            }
            boolean z11 = ((i12 & 112) == 32) | ((i12 & 14) == 4) | ((57344 & i12) == 16384) | ((i12 & 7168) == 2048) | ((i12 & 896) == 256);
            Object rememberedValue = startRestartGroup.rememberedValue();
            if (z11 || rememberedValue == Composer.Companion.getEmpty()) {
                i13 = 0;
                final float f13 = f12;
                a<g2> aVar = new a<g2>() { // from class: androidx.compose.material.SliderKt$CorrectValueSideEffect$1$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(0);
                    }

                    @Override // x00.a
                    public /* bridge */ /* synthetic */ g2 invoke() {
                        invoke2();
                        return g2.f100423a;
                    }

                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2() {
                        float floatValue = (fVar.getEndInclusive().floatValue() - fVar.getStart().floatValue()) / 1000;
                        float floatValue2 = lVar.invoke(Float.valueOf(f13)).floatValue();
                        if (Math.abs(floatValue2 - mutableState.getValue().floatValue()) <= floatValue || !fVar2.contains(mutableState.getValue())) {
                            return;
                        }
                        mutableState.setValue(Float.valueOf(floatValue2));
                    }
                };
                startRestartGroup.updateRememberedValue(aVar);
                rememberedValue = aVar;
            } else {
                i13 = 0;
            }
            EffectsKt.SideEffect((a) rememberedValue, startRestartGroup, i13);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new p<Composer, Integer, g2>() { // from class: androidx.compose.material.SliderKt$CorrectValueSideEffect$2
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
                    SliderKt.CorrectValueSideEffect(lVar, fVar, fVar2, mutableState, f11, composer2, RecomposeScopeImplKt.updateChangedFlags(i11 | 1));
                }
            });
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x026f  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0281  */
    /* JADX WARN: Removed duplicated region for block: B:80:? A[RETURN, SYNTHETIC] */
    @androidx.compose.runtime.ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @androidx.compose.runtime.Composable
    @androidx.compose.material.ExperimentalMaterialApi
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void RangeSlider(@m80.k final g10.f<java.lang.Float> r38, @m80.k final x00.l<? super g10.f<java.lang.Float>, yz.g2> r39, @m80.l androidx.compose.ui.Modifier r40, boolean r41, @m80.l g10.f<java.lang.Float> r42, @androidx.annotation.IntRange(from = 0) int r43, @m80.l x00.a<yz.g2> r44, @m80.l androidx.compose.material.SliderColors r45, @m80.l androidx.compose.runtime.Composer r46, final int r47, final int r48) {
        /*
            Method dump skipped, instructions count: 652
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.SliderKt.RangeSlider(g10.f, x00.l, androidx.compose.ui.Modifier, boolean, g10.f, int, x00.a, androidx.compose.material.SliderColors, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void RangeSliderImpl(final boolean z11, final float f11, final float f12, final List<Float> list, final SliderColors sliderColors, final float f13, final MutableInteractionSource mutableInteractionSource, final MutableInteractionSource mutableInteractionSource2, final Modifier modifier, final Modifier modifier2, Modifier modifier3, Composer composer, final int i11, final int i12) {
        boolean z12;
        int i13;
        List<Float> list2;
        SliderColors sliderColors2;
        int i14;
        final Modifier modifier4;
        Composer startRestartGroup = composer.startRestartGroup(-278895713);
        if ((i11 & 6) == 0) {
            z12 = z11;
            i13 = (startRestartGroup.changed(z12) ? 4 : 2) | i11;
        } else {
            z12 = z11;
            i13 = i11;
        }
        if ((i11 & 48) == 0) {
            i13 |= startRestartGroup.changed(f11) ? 32 : 16;
        }
        if ((i11 & 384) == 0) {
            i13 |= startRestartGroup.changed(f12) ? 256 : 128;
        }
        if ((i11 & 3072) == 0) {
            list2 = list;
            i13 |= startRestartGroup.changedInstance(list2) ? 2048 : 1024;
        } else {
            list2 = list;
        }
        if ((i11 & 24576) == 0) {
            sliderColors2 = sliderColors;
            i13 |= startRestartGroup.changed(sliderColors2) ? 16384 : 8192;
        } else {
            sliderColors2 = sliderColors;
        }
        if ((i11 & 196608) == 0) {
            i13 |= startRestartGroup.changed(f13) ? 131072 : 65536;
        }
        if ((i11 & 1572864) == 0) {
            i13 |= startRestartGroup.changed(mutableInteractionSource) ? 1048576 : 524288;
        }
        if ((i11 & 12582912) == 0) {
            i13 |= startRestartGroup.changed(mutableInteractionSource2) ? 8388608 : 4194304;
        }
        if ((i11 & 100663296) == 0) {
            i13 |= startRestartGroup.changed(modifier) ? 67108864 : 33554432;
        }
        if ((i11 & 805306368) == 0) {
            i13 |= startRestartGroup.changed(modifier2) ? 536870912 : 268435456;
        }
        if ((i12 & 6) == 0) {
            i14 = i12 | (startRestartGroup.changed(modifier3) ? 4 : 2);
        } else {
            i14 = i12;
        }
        if (startRestartGroup.shouldExecute(((i13 & 306783379) == 306783378 && (i14 & 3) == 2) ? false : true, i13 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-278895713, i13, i14, "androidx.compose.material.RangeSliderImpl (Slider.kt:726)");
            }
            Strings.Companion companion = Strings.Companion;
            final String m1783getString4foXLRw = Strings_androidKt.m1783getString4foXLRw(companion.m1781getSliderRangeStartUdPEhr4(), startRestartGroup, 6);
            final String m1783getString4foXLRw2 = Strings_androidKt.m1783getString4foXLRw(companion.m1780getSliderRangeEndUdPEhr4(), startRestartGroup, 6);
            Modifier then = modifier.then(DefaultSliderConstraints);
            Alignment.Companion companion2 = Alignment.Companion;
            MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(companion2.getTopStart(), false);
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
            Modifier materializeModifier = ComposedModifierKt.materializeModifier(startRestartGroup, then);
            ComposeUiNode.Companion companion3 = ComposeUiNode.Companion;
            a<ComposeUiNode> constructor = companion3.getConstructor();
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
            Updater.m1958setimpl(m1951constructorimpl, maybeCachedBoxMeasurePolicy, companion3.getSetMeasurePolicy());
            Updater.m1958setimpl(m1951constructorimpl, currentCompositionLocalMap, companion3.getSetResolvedCompositionLocals());
            p<ComposeUiNode, Integer, g2> setCompositeKeyHash = companion3.getSetCompositeKeyHash();
            if (m1951constructorimpl.getInserting() || !g0.g(m1951constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                m1951constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                m1951constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m1958setimpl(m1951constructorimpl, materializeModifier, companion3.getSetModifier());
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            Density density = (Density) startRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
            float mo377toPx0680j_4 = density.mo377toPx0680j_4(TrackHeight);
            float f14 = ThumbRadius;
            float mo377toPx0680j_42 = density.mo377toPx0680j_4(f14);
            float mo373toDpu2uoSUM = density.mo373toDpu2uoSUM(f13);
            float m5115constructorimpl = Dp.m5115constructorimpl(f14 * 2);
            float m5115constructorimpl2 = Dp.m5115constructorimpl(mo373toDpu2uoSUM * f11);
            float m5115constructorimpl3 = Dp.m5115constructorimpl(mo373toDpu2uoSUM * f12);
            Modifier.Companion companion4 = Modifier.Companion;
            Modifier fillMaxSize$default = SizeKt.fillMaxSize$default(boxScopeInstance.align(companion4, companion2.getCenterStart()), 0.0f, 1, null);
            int i15 = i13 >> 9;
            int i16 = i13 << 6;
            int i17 = i13;
            Track(fillMaxSize$default, sliderColors2, z12, f11, f12, list2, mo377toPx0680j_42, mo377toPx0680j_4, startRestartGroup, (i16 & 896) | (i15 & 112) | (i16 & 7168) | (i16 & 57344) | (i16 & 458752));
            startRestartGroup = startRestartGroup;
            boolean changed = startRestartGroup.changed(m1783getString4foXLRw);
            Object rememberedValue = startRestartGroup.rememberedValue();
            if (changed || rememberedValue == Composer.Companion.getEmpty()) {
                rememberedValue = new l<SemanticsPropertyReceiver, g2>() { // from class: androidx.compose.material.SliderKt$RangeSliderImpl$1$2$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // x00.l
                    public /* bridge */ /* synthetic */ g2 invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                        invoke2(semanticsPropertyReceiver);
                        return g2.f100423a;
                    }

                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                        SemanticsPropertiesKt.setContentDescription(semanticsPropertyReceiver, m1783getString4foXLRw);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            int i18 = i17 & 57344;
            int i19 = (i17 << 15) & 458752;
            m1759SliderThumbPcYyNuk(boxScopeInstance, FocusableKt.focusable(SemanticsModifierKt.semantics(companion4, true, (l) rememberedValue), true, mutableInteractionSource).then(modifier2), m5115constructorimpl2, mutableInteractionSource, sliderColors, z11, m5115constructorimpl, startRestartGroup, (i15 & 7168) | 1572870 | i18 | i19);
            boolean changed2 = startRestartGroup.changed(m1783getString4foXLRw2);
            Object rememberedValue2 = startRestartGroup.rememberedValue();
            if (changed2 || rememberedValue2 == Composer.Companion.getEmpty()) {
                rememberedValue2 = new l<SemanticsPropertyReceiver, g2>() { // from class: androidx.compose.material.SliderKt$RangeSliderImpl$1$3$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // x00.l
                    public /* bridge */ /* synthetic */ g2 invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                        invoke2(semanticsPropertyReceiver);
                        return g2.f100423a;
                    }

                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                        SemanticsPropertiesKt.setContentDescription(semanticsPropertyReceiver, m1783getString4foXLRw2);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue2);
            }
            modifier4 = modifier3;
            m1759SliderThumbPcYyNuk(boxScopeInstance, FocusableKt.focusable(SemanticsModifierKt.semantics(companion4, true, (l) rememberedValue2), true, mutableInteractionSource2).then(modifier4), m5115constructorimpl3, mutableInteractionSource2, sliderColors, z11, m5115constructorimpl, startRestartGroup, ((i17 >> 12) & 7168) | 1572870 | i18 | i19);
            startRestartGroup.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            modifier4 = modifier3;
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new p<Composer, Integer, g2>() { // from class: androidx.compose.material.SliderKt$RangeSliderImpl$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // x00.p
                public /* bridge */ /* synthetic */ g2 invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return g2.f100423a;
                }

                public final void invoke(Composer composer2, int i21) {
                    SliderKt.RangeSliderImpl(z11, f11, f12, list, sliderColors, f13, mutableInteractionSource, mutableInteractionSource2, modifier, modifier2, modifier4, composer2, RecomposeScopeImplKt.updateChangedFlags(i11 | 1), RecomposeScopeImplKt.updateChangedFlags(i12));
                }
            });
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:115:0x02ea  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x02fd  */
    /* JADX WARN: Removed duplicated region for block: B:87:? A[RETURN, SYNTHETIC] */
    @androidx.compose.runtime.ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @androidx.compose.runtime.Composable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void Slider(final float r39, @m80.k final x00.l<? super java.lang.Float, yz.g2> r40, @m80.l androidx.compose.ui.Modifier r41, boolean r42, @m80.l g10.f<java.lang.Float> r43, @androidx.annotation.IntRange(from = 0) int r44, @m80.l x00.a<yz.g2> r45, @m80.l androidx.compose.foundation.interaction.MutableInteractionSource r46, @m80.l androidx.compose.material.SliderColors r47, @m80.l androidx.compose.runtime.Composer r48, final int r49, final int r50) {
        /*
            Method dump skipped, instructions count: 778
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.SliderKt.Slider(float, x00.l, androidx.compose.ui.Modifier, boolean, g10.f, int, x00.a, androidx.compose.foundation.interaction.MutableInteractionSource, androidx.compose.material.SliderColors, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void SliderImpl(final boolean z11, final float f11, final List<Float> list, final SliderColors sliderColors, final float f12, final MutableInteractionSource mutableInteractionSource, final Modifier modifier, Composer composer, final int i11) {
        boolean z12;
        int i12;
        List<Float> list2;
        Composer startRestartGroup = composer.startRestartGroup(1679682785);
        if ((i11 & 6) == 0) {
            z12 = z11;
            i12 = (startRestartGroup.changed(z12) ? 4 : 2) | i11;
        } else {
            z12 = z11;
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= startRestartGroup.changed(f11) ? 32 : 16;
        }
        if ((i11 & 384) == 0) {
            list2 = list;
            i12 |= startRestartGroup.changedInstance(list2) ? 256 : 128;
        } else {
            list2 = list;
        }
        if ((i11 & 3072) == 0) {
            i12 |= startRestartGroup.changed(sliderColors) ? 2048 : 1024;
        }
        if ((i11 & 24576) == 0) {
            i12 |= startRestartGroup.changed(f12) ? 16384 : 8192;
        }
        if ((196608 & i11) == 0) {
            i12 |= startRestartGroup.changed(mutableInteractionSource) ? 131072 : 65536;
        }
        if ((1572864 & i11) == 0) {
            i12 |= startRestartGroup.changed(modifier) ? 1048576 : 524288;
        }
        int i13 = i12;
        if (startRestartGroup.shouldExecute((599187 & i13) != 599186, i13 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1679682785, i13, -1, "androidx.compose.material.SliderImpl (Slider.kt:685)");
            }
            Modifier then = modifier.then(DefaultSliderConstraints);
            MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.getTopStart(), false);
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
            Modifier materializeModifier = ComposedModifierKt.materializeModifier(startRestartGroup, then);
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
            Updater.m1958setimpl(m1951constructorimpl, maybeCachedBoxMeasurePolicy, companion.getSetMeasurePolicy());
            Updater.m1958setimpl(m1951constructorimpl, currentCompositionLocalMap, companion.getSetResolvedCompositionLocals());
            p<ComposeUiNode, Integer, g2> setCompositeKeyHash = companion.getSetCompositeKeyHash();
            if (m1951constructorimpl.getInserting() || !g0.g(m1951constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                m1951constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                m1951constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m1958setimpl(m1951constructorimpl, materializeModifier, companion.getSetModifier());
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            Density density = (Density) startRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
            float mo377toPx0680j_4 = density.mo377toPx0680j_4(TrackHeight);
            float f13 = ThumbRadius;
            float mo377toPx0680j_42 = density.mo377toPx0680j_4(f13);
            float mo373toDpu2uoSUM = density.mo373toDpu2uoSUM(f12);
            float m5115constructorimpl = Dp.m5115constructorimpl(f13 * 2);
            float m5115constructorimpl2 = Dp.m5115constructorimpl(mo373toDpu2uoSUM * f11);
            Modifier.Companion companion2 = Modifier.Companion;
            int i14 = i13 >> 6;
            int i15 = i13 << 9;
            Track(SizeKt.fillMaxSize$default(companion2, 0.0f, 1, null), sliderColors, z12, 0.0f, f11, list2, mo377toPx0680j_42, mo377toPx0680j_4, startRestartGroup, (i15 & 458752) | ((i13 << 6) & 896) | (i14 & 112) | 3078 | (i15 & 57344));
            m1759SliderThumbPcYyNuk(boxScopeInstance, companion2, m5115constructorimpl2, mutableInteractionSource, sliderColors, z11, m5115constructorimpl, startRestartGroup, (i14 & 7168) | 1572918 | ((i13 << 3) & 57344) | ((i13 << 15) & 458752));
            startRestartGroup.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new p<Composer, Integer, g2>() { // from class: androidx.compose.material.SliderKt$SliderImpl$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // x00.p
                public /* bridge */ /* synthetic */ g2 invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return g2.f100423a;
                }

                public final void invoke(Composer composer2, int i16) {
                    SliderKt.SliderImpl(z11, f11, list, sliderColors, f12, mutableInteractionSource, modifier, composer2, RecomposeScopeImplKt.updateChangedFlags(i11 | 1));
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    /* renamed from: SliderThumb-PcYyNuk, reason: not valid java name */
    public static final void m1759SliderThumbPcYyNuk(final BoxScope boxScope, final Modifier modifier, final float f11, final MutableInteractionSource mutableInteractionSource, final SliderColors sliderColors, final boolean z11, final float f12, Composer composer, final int i11) {
        int i12;
        Composer startRestartGroup = composer.startRestartGroup(428907178);
        if ((i11 & 6) == 0) {
            i12 = (startRestartGroup.changed(boxScope) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= startRestartGroup.changed(modifier) ? 32 : 16;
        }
        if ((i11 & 384) == 0) {
            i12 |= startRestartGroup.changed(f11) ? 256 : 128;
        }
        if ((i11 & 3072) == 0) {
            i12 |= startRestartGroup.changed(mutableInteractionSource) ? 2048 : 1024;
        }
        if ((i11 & 24576) == 0) {
            i12 |= startRestartGroup.changed(sliderColors) ? 16384 : 8192;
        }
        if ((196608 & i11) == 0) {
            i12 |= startRestartGroup.changed(z11) ? 131072 : 65536;
        }
        if ((1572864 & i11) == 0) {
            i12 |= startRestartGroup.changed(f12) ? 1048576 : 524288;
        }
        if (startRestartGroup.shouldExecute((599187 & i12) != 599186, i12 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(428907178, i12, -1, "androidx.compose.material.SliderThumb (Slider.kt:789)");
            }
            Modifier m730paddingqDBjuR0$default = PaddingKt.m730paddingqDBjuR0$default(Modifier.Companion, f11, 0.0f, 0.0f, 0.0f, 14, null);
            Alignment.Companion companion = Alignment.Companion;
            Modifier align = boxScope.align(m730paddingqDBjuR0$default, companion.getCenterStart());
            MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(companion.getTopStart(), false);
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
            Modifier materializeModifier = ComposedModifierKt.materializeModifier(startRestartGroup, align);
            ComposeUiNode.Companion companion2 = ComposeUiNode.Companion;
            a<ComposeUiNode> constructor = companion2.getConstructor();
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
            p<ComposeUiNode, Integer, g2> setCompositeKeyHash = companion2.getSetCompositeKeyHash();
            if (m1951constructorimpl.getInserting() || !g0.g(m1951constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                m1951constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                m1951constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m1958setimpl(m1951constructorimpl, materializeModifier, companion2.getSetModifier());
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            Object rememberedValue = startRestartGroup.rememberedValue();
            Composer.Companion companion3 = Composer.Companion;
            if (rememberedValue == companion3.getEmpty()) {
                rememberedValue = SnapshotStateKt.mutableStateListOf();
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            SnapshotStateList snapshotStateList = (SnapshotStateList) rememberedValue;
            boolean z12 = (i12 & 7168) == 2048;
            Object rememberedValue2 = startRestartGroup.rememberedValue();
            if (z12 || rememberedValue2 == companion3.getEmpty()) {
                rememberedValue2 = new SliderKt$SliderThumb$1$1$1(mutableInteractionSource, snapshotStateList, null);
                startRestartGroup.updateRememberedValue(rememberedValue2);
            }
            int i13 = i12 >> 9;
            EffectsKt.LaunchedEffect(mutableInteractionSource, (p<? super r0, ? super c<? super g2>, ? extends Object>) rememberedValue2, startRestartGroup, i13 & 14);
            float f13 = !snapshotStateList.isEmpty() ? ThumbPressedElevation : ThumbDefaultElevation;
            Modifier hoverable$default = HoverableKt.hoverable$default(IndicationKt.indication(SizeKt.m775sizeVpY3zN4(modifier, f12, f12), mutableInteractionSource, RippleKt.m1748rippleH2RKhps$default(false, ThumbRippleRadius, 0L, 4, null)), mutableInteractionSource, false, 2, null);
            if (!z11) {
                f13 = Dp.m5115constructorimpl(0);
            }
            SpacerKt.Spacer(BackgroundKt.m234backgroundbw27NRU(ShadowKt.m2144shadows4CzXII$default(hoverable$default, f13, RoundedCornerShapeKt.getCircleShape(), false, 0L, 0L, 24, null), sliderColors.thumbColor(z11, startRestartGroup, ((i12 >> 15) & 14) | (i13 & 112)).getValue().m2519unboximpl(), RoundedCornerShapeKt.getCircleShape()), startRestartGroup, 0);
            startRestartGroup.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new p<Composer, Integer, g2>() { // from class: androidx.compose.material.SliderKt$SliderThumb$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // x00.p
                public /* bridge */ /* synthetic */ g2 invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return g2.f100423a;
                }

                public final void invoke(Composer composer2, int i14) {
                    SliderKt.m1759SliderThumbPcYyNuk(BoxScope.this, modifier, f11, mutableInteractionSource, sliderColors, z11, f12, composer2, RecomposeScopeImplKt.updateChangedFlags(i11 | 1));
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void Track(final Modifier modifier, final SliderColors sliderColors, final boolean z11, final float f11, final float f12, final List<Float> list, final float f13, final float f14, Composer composer, final int i11) {
        int i12;
        float f15;
        float f16;
        int i13;
        Composer startRestartGroup = composer.startRestartGroup(1833126050);
        if ((i11 & 6) == 0) {
            i12 = (startRestartGroup.changed(modifier) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= startRestartGroup.changed(sliderColors) ? 32 : 16;
        }
        if ((i11 & 384) == 0) {
            i12 |= startRestartGroup.changed(z11) ? 256 : 128;
        }
        if ((i11 & 3072) == 0) {
            i12 |= startRestartGroup.changed(f11) ? 2048 : 1024;
        }
        if ((i11 & 24576) == 0) {
            f15 = f12;
            i12 |= startRestartGroup.changed(f15) ? 16384 : 8192;
        } else {
            f15 = f12;
        }
        if ((196608 & i11) == 0) {
            i12 |= startRestartGroup.changedInstance(list) ? 131072 : 65536;
        }
        if ((1572864 & i11) == 0) {
            f16 = f13;
            i12 |= startRestartGroup.changed(f16) ? 1048576 : 524288;
        } else {
            f16 = f13;
        }
        if ((12582912 & i11) == 0) {
            i12 |= startRestartGroup.changed(f14) ? 8388608 : 4194304;
        }
        if (startRestartGroup.shouldExecute((i12 & 4793491) != 4793490, i12 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1833126050, i12, -1, "androidx.compose.material.Track (Slider.kt:835)");
            }
            int i14 = ((i12 >> 6) & 14) | 48 | ((i12 << 3) & 896);
            final State<Color> trackColor = sliderColors.trackColor(z11, false, startRestartGroup, i14);
            final State<Color> trackColor2 = sliderColors.trackColor(z11, true, startRestartGroup, i14);
            final State<Color> tickColor = sliderColors.tickColor(z11, false, startRestartGroup, i14);
            final State<Color> tickColor2 = sliderColors.tickColor(z11, true, startRestartGroup, i14);
            boolean changed = ((29360128 & i12) == 8388608) | ((i12 & 3670016) == 1048576) | startRestartGroup.changed(trackColor) | ((57344 & i12) == 16384) | ((i12 & 7168) == 2048) | startRestartGroup.changed(trackColor2) | startRestartGroup.changedInstance(list) | startRestartGroup.changed(tickColor) | startRestartGroup.changed(tickColor2);
            Object rememberedValue = startRestartGroup.rememberedValue();
            if (changed || rememberedValue == Composer.Companion.getEmpty()) {
                i13 = i12;
                final float f17 = f16;
                final float f18 = f15;
                Object obj = new l<DrawScope, g2>() { // from class: androidx.compose.material.SliderKt$Track$1$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // x00.l
                    public /* bridge */ /* synthetic */ g2 invoke(DrawScope drawScope) {
                        invoke2(drawScope);
                        return g2.f100423a;
                    }

                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(DrawScope drawScope) {
                        boolean z12 = drawScope.getLayoutDirection() == LayoutDirection.Rtl;
                        long Offset = OffsetKt.Offset(f17, Offset.m2269getYimpl(drawScope.mo3059getCenterF1C5BW0()));
                        long Offset2 = OffsetKt.Offset(Size.m2337getWidthimpl(drawScope.mo3060getSizeNHjbRc()) - f17, Offset.m2269getYimpl(drawScope.mo3059getCenterF1C5BW0()));
                        long j11 = z12 ? Offset2 : Offset;
                        long j12 = z12 ? Offset : Offset2;
                        long m2519unboximpl = trackColor.getValue().m2519unboximpl();
                        float f19 = f14;
                        StrokeCap.Companion companion = StrokeCap.Companion;
                        DrawScope.m3046drawLineNGM6Ib0$default(drawScope, m2519unboximpl, j11, j12, f19, companion.m2863getRoundKaPHkGw(), null, 0.0f, null, 0, 480, null);
                        DrawScope.m3046drawLineNGM6Ib0$default(drawScope, trackColor2.getValue().m2519unboximpl(), OffsetKt.Offset(Offset.m2268getXimpl(j11) + ((Offset.m2268getXimpl(j12) - Offset.m2268getXimpl(j11)) * f11), Offset.m2269getYimpl(drawScope.mo3059getCenterF1C5BW0())), OffsetKt.Offset(Offset.m2268getXimpl(j11) + ((Offset.m2268getXimpl(j12) - Offset.m2268getXimpl(j11)) * f18), Offset.m2269getYimpl(drawScope.mo3059getCenterF1C5BW0())), f14, companion.m2863getRoundKaPHkGw(), null, 0.0f, null, 0, 480, null);
                        List<Float> list2 = list;
                        float f21 = f18;
                        float f22 = f11;
                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                        for (Object obj2 : list2) {
                            float floatValue = ((Number) obj2).floatValue();
                            Boolean valueOf = Boolean.valueOf(floatValue > f21 || floatValue < f22);
                            Object obj3 = linkedHashMap.get(valueOf);
                            if (obj3 == null) {
                                obj3 = new ArrayList();
                                linkedHashMap.put(valueOf, obj3);
                            }
                            ((List) obj3).add(obj2);
                        }
                        State<Color> state = tickColor;
                        State<Color> state2 = tickColor2;
                        float f23 = f14;
                        for (Map.Entry entry : linkedHashMap.entrySet()) {
                            boolean booleanValue = ((Boolean) entry.getKey()).booleanValue();
                            List list3 = (List) entry.getValue();
                            ArrayList arrayList = new ArrayList(list3.size());
                            int size = list3.size();
                            for (int i15 = 0; i15 < size; i15++) {
                                arrayList.add(Offset.m2257boximpl(OffsetKt.Offset(Offset.m2268getXimpl(OffsetKt.m2291lerpWko1d7g(j11, j12, ((Number) list3.get(i15)).floatValue())), Offset.m2269getYimpl(drawScope.mo3059getCenterF1C5BW0()))));
                            }
                            DrawScope.m3051drawPointsF8ZwMP8$default(drawScope, arrayList, PointMode.Companion.m2815getPointsr_lszbg(), (booleanValue ? state : state2).getValue().m2519unboximpl(), f23, StrokeCap.Companion.m2863getRoundKaPHkGw(), null, 0.0f, null, 0, 480, null);
                        }
                    }
                };
                startRestartGroup.updateRememberedValue(obj);
                rememberedValue = obj;
            } else {
                i13 = i12;
            }
            CanvasKt.Canvas(modifier, (l) rememberedValue, startRestartGroup, i13 & 14);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new p<Composer, Integer, g2>() { // from class: androidx.compose.material.SliderKt$Track$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // x00.p
                public /* bridge */ /* synthetic */ g2 invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return g2.f100423a;
                }

                public final void invoke(Composer composer2, int i15) {
                    SliderKt.Track(Modifier.this, sliderColors, z11, f11, f12, list, f13, f14, composer2, RecomposeScopeImplKt.updateChangedFlags(i11 | 1));
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object animateToTarget(DraggableState draggableState, float f11, float f12, float f13, c<? super g2> cVar) {
        Object drag$default = DraggableState.drag$default(draggableState, null, new SliderKt$animateToTarget$2(f11, f12, f13, null), cVar, 1, null);
        return drag$default == b.l() ? drag$default : g2.f100423a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0064 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0025  */
    /* renamed from: awaitSlop-8vUncbI, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object m1762awaitSlop8vUncbI(androidx.compose.ui.input.pointer.AwaitPointerEventScope r8, long r9, int r11, j00.c<? super kotlin.Pair<androidx.compose.ui.input.pointer.PointerInputChange, java.lang.Float>> r12) {
        /*
            boolean r0 = r12 instanceof androidx.compose.material.SliderKt$awaitSlop$1
            if (r0 == 0) goto L14
            r0 = r12
            androidx.compose.material.SliderKt$awaitSlop$1 r0 = (androidx.compose.material.SliderKt$awaitSlop$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L14
            int r1 = r1 - r2
            r0.label = r1
        L12:
            r6 = r0
            goto L1a
        L14:
            androidx.compose.material.SliderKt$awaitSlop$1 r0 = new androidx.compose.material.SliderKt$awaitSlop$1
            r0.<init>(r12)
            goto L12
        L1a:
            java.lang.Object r12 = r6.result
            java.lang.Object r0 = kotlin.coroutines.intrinsics.b.l()
            int r1 = r6.label
            r2 = 1
            if (r1 == 0) goto L37
            if (r1 != r2) goto L2f
            java.lang.Object r8 = r6.L$0
            kotlin.jvm.internal.Ref$FloatRef r8 = (kotlin.jvm.internal.Ref.FloatRef) r8
            kotlin.e.n(r12)
            goto L55
        L2f:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L37:
            kotlin.e.n(r12)
            kotlin.jvm.internal.Ref$FloatRef r12 = new kotlin.jvm.internal.Ref$FloatRef
            r12.<init>()
            androidx.compose.material.SliderKt$awaitSlop$postPointerSlop$1 r5 = new androidx.compose.material.SliderKt$awaitSlop$postPointerSlop$1
            r5.<init>()
            r6.L$0 = r12
            r6.label = r2
            r1 = r8
            r2 = r9
            r4 = r11
            java.lang.Object r8 = androidx.compose.material.DragGestureDetectorCopyKt.m1644awaitHorizontalPointerSlopOrCancellationgDDlDlE(r1, r2, r4, r5, r6)
            if (r8 != r0) goto L52
            return r0
        L52:
            r7 = r12
            r12 = r8
            r8 = r7
        L55:
            androidx.compose.ui.input.pointer.PointerInputChange r12 = (androidx.compose.ui.input.pointer.PointerInputChange) r12
            if (r12 == 0) goto L64
            float r8 = r8.element
            java.lang.Float r8 = l00.a.e(r8)
            kotlin.Pair r8 = yz.h1.a(r12, r8)
            return r8
        L64:
            r8 = 0
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.SliderKt.m1762awaitSlop8vUncbI(androidx.compose.ui.input.pointer.AwaitPointerEventScope, long, int, j00.c):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float calcFraction(float f11, float f12, float f13) {
        float f14 = f12 - f11;
        float f15 = f14 == 0.0f ? 0.0f : (f13 - f11) / f14;
        float f16 = f15 >= 0.0f ? f15 : 0.0f;
        if (f16 > 1.0f) {
            return 1.0f;
        }
        return f16;
    }

    public static final float getThumbRadius() {
        return ThumbRadius;
    }

    public static final float getTrackHeight() {
        return TrackHeight;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Modifier rangeSliderPressDragModifier(Modifier modifier, MutableInteractionSource mutableInteractionSource, MutableInteractionSource mutableInteractionSource2, State<Float> state, State<Float> state2, boolean z11, boolean z12, float f11, f<Float> fVar, State<? extends l<? super Boolean, g2>> state3, State<? extends p<? super Boolean, ? super Float, g2>> state4) {
        Modifier then;
        if (!z11) {
            return modifier;
        }
        then = modifier.then(new SuspendPointerInputElement(null, null, new Object[]{mutableInteractionSource, mutableInteractionSource2, Float.valueOf(f11), Boolean.valueOf(z12), fVar}, new SuspendingPointerInputFilterKt$sam$androidx_compose_ui_input_pointer_PointerInputEventHandler$0(new SliderKt$rangeSliderPressDragModifier$1(mutableInteractionSource, mutableInteractionSource2, state, state2, state4, z12, f11, state3, null)), 3, null));
        return then;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float scale(float f11, float f12, float f13, float f14, float f15) {
        return MathHelpersKt.lerp(f14, f15, calcFraction(f11, f12, f13));
    }

    private static final Modifier slideOnKeyEvents(Modifier modifier, final boolean z11, final int i11, final f<Float> fVar, final float f11, final boolean z12, final State<? extends l<? super Float, g2>> state, final State<? extends a<g2>> state2) {
        if (i11 >= 0) {
            return KeyInputModifierKt.onKeyEvent(modifier, new l<KeyEvent, Boolean>() { // from class: androidx.compose.material.SliderKt$slideOnKeyEvents$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(1);
                }

                @Override // x00.l
                public /* bridge */ /* synthetic */ Boolean invoke(KeyEvent keyEvent) {
                    return m1763invokeZmokQxo(keyEvent.m3577unboximpl());
                }

                /* renamed from: invoke-ZmokQxo, reason: not valid java name */
                public final Boolean m1763invokeZmokQxo(android.view.KeyEvent keyEvent) {
                    if (!z11) {
                        return Boolean.FALSE;
                    }
                    int m3589getTypeZmokQxo = KeyEvent_androidKt.m3589getTypeZmokQxo(keyEvent);
                    KeyEventType.Companion companion = KeyEventType.Companion;
                    boolean z13 = false;
                    if (!KeyEventType.m3581equalsimpl0(m3589getTypeZmokQxo, companion.m3585getKeyDownCS__XNY())) {
                        if (KeyEventType.m3581equalsimpl0(m3589getTypeZmokQxo, companion.m3586getKeyUpCS__XNY())) {
                            long m3588getKeyZmokQxo = KeyEvent_androidKt.m3588getKeyZmokQxo(keyEvent);
                            Key.Companion companion2 = Key.Companion;
                            if (Key.m3280equalsimpl0(m3588getKeyZmokQxo, companion2.m3358getDirectionUpEK5gGoQ()) ? true : Key.m3280equalsimpl0(m3588getKeyZmokQxo, companion2.m3353getDirectionDownEK5gGoQ()) ? true : Key.m3280equalsimpl0(m3588getKeyZmokQxo, companion2.m3357getDirectionRightEK5gGoQ()) ? true : Key.m3280equalsimpl0(m3588getKeyZmokQxo, companion2.m3356getDirectionLeftEK5gGoQ()) ? true : Key.m3280equalsimpl0(m3588getKeyZmokQxo, companion2.m3432getMoveHomeEK5gGoQ()) ? true : Key.m3280equalsimpl0(m3588getKeyZmokQxo, companion2.m3431getMoveEndEK5gGoQ()) ? true : Key.m3280equalsimpl0(m3588getKeyZmokQxo, companion2.m3469getPageUpEK5gGoQ()) ? true : Key.m3280equalsimpl0(m3588getKeyZmokQxo, companion2.m3468getPageDownEK5gGoQ())) {
                                a<g2> value = state2.getValue();
                                if (value != null) {
                                    value.invoke();
                                }
                                z13 = true;
                            }
                        }
                        return Boolean.valueOf(z13);
                    }
                    float abs = Math.abs(fVar.getEndInclusive().floatValue() - fVar.getStart().floatValue());
                    int i12 = i11;
                    float f12 = abs / (i12 > 0 ? i12 + 1 : 100);
                    long m3588getKeyZmokQxo2 = KeyEvent_androidKt.m3588getKeyZmokQxo(keyEvent);
                    Key.Companion companion3 = Key.Companion;
                    if (Key.m3280equalsimpl0(m3588getKeyZmokQxo2, companion3.m3358getDirectionUpEK5gGoQ())) {
                        state.getValue().invoke(u.M(Float.valueOf(f11 + f12), fVar));
                    } else if (Key.m3280equalsimpl0(m3588getKeyZmokQxo2, companion3.m3353getDirectionDownEK5gGoQ())) {
                        state.getValue().invoke(u.M(Float.valueOf(f11 - f12), fVar));
                    } else {
                        if (Key.m3280equalsimpl0(m3588getKeyZmokQxo2, companion3.m3357getDirectionRightEK5gGoQ())) {
                            state.getValue().invoke(u.M(Float.valueOf(f11 + ((z12 ? -1 : 1) * f12)), fVar));
                        } else if (Key.m3280equalsimpl0(m3588getKeyZmokQxo2, companion3.m3356getDirectionLeftEK5gGoQ())) {
                            state.getValue().invoke(u.M(Float.valueOf(f11 - ((z12 ? -1 : 1) * f12)), fVar));
                        } else if (Key.m3280equalsimpl0(m3588getKeyZmokQxo2, companion3.m3432getMoveHomeEK5gGoQ())) {
                            state.getValue().invoke(fVar.getStart());
                        } else if (Key.m3280equalsimpl0(m3588getKeyZmokQxo2, companion3.m3431getMoveEndEK5gGoQ())) {
                            state.getValue().invoke(fVar.getEndInclusive());
                        } else {
                            if (!Key.m3280equalsimpl0(m3588getKeyZmokQxo2, companion3.m3469getPageUpEK5gGoQ())) {
                                if (Key.m3280equalsimpl0(m3588getKeyZmokQxo2, companion3.m3468getPageDownEK5gGoQ())) {
                                    state.getValue().invoke(u.M(Float.valueOf(f11 + (u.I(r1 / 10, 1, 10) * f12)), fVar));
                                }
                                return Boolean.valueOf(z13);
                            }
                            state.getValue().invoke(u.M(Float.valueOf(f11 - (u.I(r1 / 10, 1, 10) * f12)), fVar));
                        }
                    }
                    z13 = true;
                    return Boolean.valueOf(z13);
                }
            });
        }
        throw new IllegalArgumentException("steps should be >= 0");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Modifier sliderSemantics(Modifier modifier, float f11, final boolean z11, final l<? super Float, g2> lVar, final a<g2> aVar, final f<Float> fVar, final int i11) {
        final float H = u.H(f11, fVar.getStart().floatValue(), fVar.getEndInclusive().floatValue());
        return ProgressSemanticsKt.progressSemantics(SemanticsModifierKt.semantics$default(modifier, false, new l<SemanticsPropertyReceiver, g2>() { // from class: androidx.compose.material.SliderKt$sliderSemantics$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(1);
            }

            @Override // x00.l
            public /* bridge */ /* synthetic */ g2 invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                invoke2(semanticsPropertyReceiver);
                return g2.f100423a;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                if (!z11) {
                    SemanticsPropertiesKt.disabled(semanticsPropertyReceiver);
                }
                final f<Float> fVar2 = fVar;
                final int i12 = i11;
                final float f12 = H;
                final l<Float, g2> lVar2 = lVar;
                final a<g2> aVar2 = aVar;
                SemanticsPropertiesKt.setProgress$default(semanticsPropertyReceiver, null, new l<Float, Boolean>() { // from class: androidx.compose.material.SliderKt$sliderSemantics$1.1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(1);
                    }

                    @Override // x00.l
                    public /* bridge */ /* synthetic */ Boolean invoke(Float f13) {
                        return invoke(f13.floatValue());
                    }

                    public final Boolean invoke(float f13) {
                        int i13;
                        float H2 = u.H(f13, fVar2.getStart().floatValue(), fVar2.getEndInclusive().floatValue());
                        int i14 = i12;
                        boolean z12 = false;
                        if (i14 > 0 && (i13 = i14 + 1) >= 0) {
                            float f14 = H2;
                            float f15 = f14;
                            int i15 = 0;
                            while (true) {
                                float lerp = MathHelpersKt.lerp(fVar2.getStart().floatValue(), fVar2.getEndInclusive().floatValue(), i15 / (i12 + 1));
                                float f16 = lerp - H2;
                                if (Math.abs(f16) <= f14) {
                                    f14 = Math.abs(f16);
                                    f15 = lerp;
                                }
                                if (i15 == i13) {
                                    break;
                                }
                                i15++;
                            }
                            H2 = f15;
                        }
                        if (H2 != f12) {
                            lVar2.invoke(Float.valueOf(H2));
                            a<g2> aVar3 = aVar2;
                            if (aVar3 != null) {
                                aVar3.invoke();
                            }
                            z12 = true;
                        }
                        return Boolean.valueOf(z12);
                    }
                }, 1, null);
            }
        }, 1, null), f11, fVar, i11);
    }

    public static /* synthetic */ Modifier sliderSemantics$default(Modifier modifier, float f11, boolean z11, l lVar, a aVar, f fVar, int i11, int i12, Object obj) {
        if ((i12 & 8) != 0) {
            aVar = null;
        }
        a aVar2 = aVar;
        if ((i12 & 16) != 0) {
            fVar = t.e(0.0f, 1.0f);
        }
        f fVar2 = fVar;
        if ((i12 & 32) != 0) {
            i11 = 0;
        }
        return sliderSemantics(modifier, f11, z11, lVar, aVar2, fVar2, i11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Modifier sliderTapModifier(Modifier modifier, final DraggableState draggableState, final MutableInteractionSource mutableInteractionSource, final float f11, final boolean z11, final State<Float> state, final State<? extends l<? super Float, g2>> state2, final MutableState<Float> mutableState, final boolean z12) {
        return ComposedModifierKt.composed(modifier, InspectableValueKt.isDebugInspectorInfoEnabled() ? new l<InspectorInfo, g2>() { // from class: androidx.compose.material.SliderKt$sliderTapModifier$$inlined$debugInspectorInfo$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // x00.l
            public /* bridge */ /* synthetic */ g2 invoke(InspectorInfo inspectorInfo) {
                invoke2(inspectorInfo);
                return g2.f100423a;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@k InspectorInfo inspectorInfo) {
                inspectorInfo.setName("sliderTapModifier");
                inspectorInfo.getProperties().set("draggableState", DraggableState.this);
                inspectorInfo.getProperties().set("interactionSource", mutableInteractionSource);
                inspectorInfo.getProperties().set("maxPx", Float.valueOf(f11));
                inspectorInfo.getProperties().set("isRtl", Boolean.valueOf(z11));
                inspectorInfo.getProperties().set("rawOffset", state);
                inspectorInfo.getProperties().set("gestureEndAction", state2);
                inspectorInfo.getProperties().set("pressOffset", mutableState);
                inspectorInfo.getProperties().set(c3.f2342e, Boolean.valueOf(z12));
            }
        } : InspectableValueKt.getNoInspectorInfo(), new q<Modifier, Composer, Integer, Modifier>() { // from class: androidx.compose.material.SliderKt$sliderTapModifier$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(3);
            }

            @Override // x00.q
            public /* bridge */ /* synthetic */ Modifier invoke(Modifier modifier2, Composer composer, Integer num) {
                return invoke(modifier2, composer, num.intValue());
            }

            @Composable
            public final Modifier invoke(Modifier modifier2, Composer composer, int i11) {
                composer.startReplaceGroup(1945228890);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1945228890, i11, -1, "androidx.compose.material.sliderTapModifier.<anonymous> (Slider.kt:1002)");
                }
                if (z12) {
                    composer.startReplaceGroup(-394118969);
                    Object rememberedValue = composer.rememberedValue();
                    Composer.Companion companion = Composer.Companion;
                    if (rememberedValue == companion.getEmpty()) {
                        rememberedValue = EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, composer);
                        composer.updateRememberedValue(rememberedValue);
                    }
                    r0 r0Var = (r0) rememberedValue;
                    Object[] objArr = {draggableState, mutableInteractionSource, Float.valueOf(f11), Boolean.valueOf(z11)};
                    boolean changed = composer.changed(z11) | composer.changed(f11) | composer.changed(mutableState) | composer.changed(state) | composer.changedInstance(r0Var) | composer.changedInstance(draggableState) | composer.changed(state2);
                    boolean z13 = z11;
                    float f12 = f11;
                    MutableState<Float> mutableState2 = mutableState;
                    State<Float> state3 = state;
                    DraggableState draggableState2 = draggableState;
                    State<l<Float, g2>> state4 = state2;
                    Object rememberedValue2 = composer.rememberedValue();
                    if (changed || rememberedValue2 == companion.getEmpty()) {
                        Object sliderKt$sliderTapModifier$2$1$1 = new SliderKt$sliderTapModifier$2$1$1(z13, f12, mutableState2, state3, r0Var, draggableState2, state4, null);
                        composer.updateRememberedValue(sliderKt$sliderTapModifier$2$1$1);
                        rememberedValue2 = sliderKt$sliderTapModifier$2$1$1;
                    }
                    modifier2 = modifier2.then(new SuspendPointerInputElement(null, null, objArr, new SuspendingPointerInputFilterKt$sam$androidx_compose_ui_input_pointer_PointerInputEventHandler$0((p) rememberedValue2), 3, null));
                    composer.endReplaceGroup();
                } else {
                    composer.startReplaceGroup(-393026932);
                    composer.endReplaceGroup();
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                composer.endReplaceGroup();
                return modifier2;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float snapValueToTick(float f11, List<Float> list, float f12, float f13) {
        Float f14;
        if (list.isEmpty()) {
            f14 = null;
        } else {
            Float f15 = list.get(0);
            float abs = Math.abs(MathHelpersKt.lerp(f12, f13, f15.floatValue()) - f11);
            int L = h0.L(list);
            int i11 = 1;
            if (1 <= L) {
                while (true) {
                    Float f16 = list.get(i11);
                    float abs2 = Math.abs(MathHelpersKt.lerp(f12, f13, f16.floatValue()) - f11);
                    if (Float.compare(abs, abs2) > 0) {
                        f15 = f16;
                        abs = abs2;
                    }
                    if (i11 == L) {
                        break;
                    }
                    i11++;
                }
            }
            f14 = f15;
        }
        Float f17 = f14;
        return f17 != null ? MathHelpersKt.lerp(f12, f13, f17.floatValue()) : f11;
    }

    private static final List<Float> stepsToTickFractions(int i11) {
        if (i11 == 0) {
            return h0.J();
        }
        int i12 = i11 + 2;
        ArrayList arrayList = new ArrayList(i12);
        for (int i13 = 0; i13 < i12; i13++) {
            arrayList.add(Float.valueOf(i13 / (i11 + 1)));
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final f<Float> scale(float f11, float f12, f<Float> fVar, float f13, float f14) {
        return t.e(scale(f11, f12, fVar.getStart().floatValue(), f13, f14), scale(f11, f12, fVar.getEndInclusive().floatValue(), f13, f14));
    }
}
