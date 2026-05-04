package androidx.constraintlayout.compose;

import android.annotation.SuppressLint;
import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.AnimatableKt;
import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableInferredTarget;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableIntState;
import androidx.compose.runtime.MutableLongState;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotIntStateKt;
import androidx.compose.runtime.SnapshotLongStateKt;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ScaleKt;
import androidx.compose.ui.graphics.GraphicsLayerScope;
import androidx.compose.ui.graphics.TransformOriginKt;
import androidx.compose.ui.layout.LayoutIdKt;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.node.Ref;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntOffsetKt;
import androidx.constraintlayout.compose.Dimension;
import androidx.constraintlayout.core.state.WidgetFrame;
import androidx.constraintlayout.core.widgets.ConstraintWidget;
import c40.r0;
import e40.o;
import e40.r;
import java.util.List;
import kotlin.DeprecationLevel;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import l80.d;
import m80.k;
import m80.l;
import x00.p;
import x00.q;
import yz.g2;
import yz.n;
import yz.w0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nConstraintLayout.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ConstraintLayout.kt\nandroidx/constraintlayout/compose/ConstraintLayoutKt\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 5 MotionLayout.kt\nandroidx/constraintlayout/compose/MotionLayoutKt\n+ 6 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 7 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 8 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 9 Composer.kt\nandroidx/compose/runtime/Updater\n+ 10 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n+ 11 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,2303:1\n359#1,2:2390\n361#1,2:2398\n363#1,7:2401\n401#1,10:2408\n400#1:2418\n412#1,4:2419\n416#1,7:2424\n446#1,12:2431\n472#1:2443\n768#1,3:2604\n771#1,8:2613\n796#1,3:2621\n795#1:2624\n802#1,5:2659\n807#1,2:2665\n829#1,9:2667\n838#1,7:2713\n845#1,16:2724\n1225#2,6:2304\n1225#2,6:2310\n1225#2,3:2316\n1228#2,3:2320\n1225#2,6:2323\n1225#2,6:2329\n1225#2,6:2335\n1225#2,6:2342\n1225#2,6:2348\n1225#2,6:2354\n1225#2,6:2360\n1225#2,6:2366\n1225#2,6:2372\n1225#2,6:2378\n1225#2,6:2384\n1225#2,6:2392\n1225#2,6:2444\n1225#2,6:2450\n1225#2,6:2456\n1225#2,6:2462\n1225#2,6:2468\n1225#2,6:2474\n1225#2,6:2480\n1225#2,6:2500\n1225#2,6:2526\n1225#2,6:2532\n1225#2,6:2539\n1225#2,6:2545\n1225#2,6:2588\n1225#2,6:2598\n1225#2,6:2607\n1225#2,6:2740\n1#3:2319\n1#3:2400\n1#3:2508\n1#3:2641\n77#4:2341\n77#4:2423\n77#4:2538\n77#4:2664\n139#5:2486\n134#5,13:2487\n147#5,2:2506\n152#5:2509\n168#5,14:2510\n167#5:2524\n183#5:2525\n139#5:2625\n134#5,15:2626\n152#5:2642\n168#5,14:2643\n167#5:2657\n183#5:2658\n71#6:2551\n67#6,7:2552\n74#6:2587\n78#6:2597\n71#6:2676\n67#6,7:2677\n74#6:2712\n78#6:2723\n79#7,6:2559\n86#7,4:2574\n90#7,2:2584\n94#7:2596\n79#7,6:2684\n86#7,4:2699\n90#7,2:2709\n94#7:2722\n368#8,9:2565\n377#8:2586\n378#8,2:2594\n368#8,9:2690\n377#8:2711\n378#8,2:2720\n4034#9,6:2578\n4034#9,6:2703\n33#10,6:2746\n81#11:2752\n107#11,2:2753\n81#11:2755\n107#11,2:2756\n*S KotlinDebug\n*F\n+ 1 ConstraintLayout.kt\nandroidx/constraintlayout/compose/ConstraintLayoutKt\n*L\n496#1:2390,2\n496#1:2398,2\n496#1:2401,7\n496#1:2408,10\n496#1:2418\n496#1:2419,4\n496#1:2424,7\n496#1:2431,12\n496#1:2443\n886#1:2604,3\n886#1:2613,8\n886#1:2621,3\n886#1:2624\n886#1:2659,5\n886#1:2665,2\n886#1:2667,9\n886#1:2713,7\n886#1:2724,16\n360#1:2304,6\n361#1:2310,6\n362#1:2316,3\n362#1:2320,3\n363#1:2323,6\n364#1:2329,6\n367#1:2335,6\n416#1:2342,6\n417#1:2348,6\n418#1:2354,6\n419#1:2360,6\n420#1:2366,6\n422#1:2372,6\n446#1:2378,6\n455#1:2384,6\n496#1:2392,6\n770#1:2444,6\n771#1:2450,6\n772#1:2456,6\n773#1:2462,6\n774#1:2468,6\n776#1:2474,6\n778#1:2480,6\n795#1:2500,6\n803#1:2526,6\n805#1:2532,6\n807#1:2539,6\n808#1:2545,6\n840#1:2588,6\n848#1:2598,6\n886#1:2607,6\n1350#1:2740,6\n496#1:2400\n795#1:2508\n886#1:2641\n415#1:2341\n496#1:2423\n806#1:2538\n886#1:2664\n795#1:2486\n795#1:2487,13\n795#1:2506,2\n795#1:2509\n795#1:2510,14\n795#1:2524\n795#1:2525\n886#1:2625\n886#1:2626,15\n886#1:2642\n886#1:2643,14\n886#1:2657\n886#1:2658\n837#1:2551\n837#1:2552,7\n837#1:2587\n837#1:2597\n886#1:2676\n886#1:2677,7\n886#1:2712\n886#1:2723\n837#1:2559,6\n837#1:2574,4\n837#1:2584,2\n837#1:2596\n886#1:2684,6\n886#1:2699,4\n886#1:2709,2\n886#1:2722\n837#1:2565,9\n837#1:2586\n837#1:2594,2\n886#1:2690,9\n886#1:2711\n886#1:2720,2\n837#1:2578,6\n886#1:2703,6\n2274#1:2746,6\n770#1:2752\n770#1:2753,2\n771#1:2755\n771#1:2756,2\n*E\n"})
/* loaded from: classes2.dex */
public final class ConstraintLayoutKt {
    private static final boolean DEBUG = false;

    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    public static final void ConstraintLayout(@l Modifier modifier, int i11, @l AnimationSpec<Float> animationSpec, @l x00.a<g2> aVar, @k q<? super ConstraintLayoutScope, ? super Composer, ? super Integer, g2> qVar, @l Composer composer, int i12, int i13) {
        composer.startReplaceGroup(-1003410150);
        Modifier modifier2 = (i13 & 1) != 0 ? Modifier.Companion : modifier;
        int i14 = (i13 & 2) != 0 ? 257 : i11;
        AnimationSpec<Float> animationSpec2 = (i13 & 4) != 0 ? null : animationSpec;
        x00.a<g2> aVar2 = (i13 & 8) != 0 ? null : aVar;
        composer.startReplaceGroup(212064437);
        if (animationSpec2 != null) {
            Object rememberedValue = composer.rememberedValue();
            Composer.Companion companion = Composer.Companion;
            if (rememberedValue == companion.getEmpty()) {
                rememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
                composer.updateRememberedValue(rememberedValue);
            }
            MutableState mutableState = (MutableState) rememberedValue;
            Object rememberedValue2 = composer.rememberedValue();
            if (rememberedValue2 == companion.getEmpty()) {
                rememberedValue2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
                composer.updateRememberedValue(rememberedValue2);
            }
            MutableState mutableState2 = (MutableState) rememberedValue2;
            Object rememberedValue3 = composer.rememberedValue();
            Object obj = rememberedValue3;
            if (rememberedValue3 == companion.getEmpty()) {
                ConstraintLayoutScope constraintLayoutScope = new ConstraintLayoutScope();
                constraintLayoutScope.setAnimateChanges(true);
                composer.updateRememberedValue(constraintLayoutScope);
                obj = constraintLayoutScope;
            }
            ConstraintLayoutScope constraintLayoutScope2 = (ConstraintLayoutScope) obj;
            Object rememberedValue4 = composer.rememberedValue();
            if (rememberedValue4 == companion.getEmpty()) {
                rememberedValue4 = SnapshotStateKt.mutableStateOf(g2.f100423a, SnapshotStateKt.neverEqualPolicy());
                composer.updateRememberedValue(rememberedValue4);
            }
            MutableState mutableState3 = (MutableState) rememberedValue4;
            Object rememberedValue5 = composer.rememberedValue();
            Object obj2 = rememberedValue5;
            if (rememberedValue5 == companion.getEmpty()) {
                Ref ref = new Ref();
                ref.setValue(CompositionSource.Unknown);
                composer.updateRememberedValue(ref);
                obj2 = ref;
            }
            Ref ref2 = (Ref) obj2;
            Object rememberedValue6 = composer.rememberedValue();
            if (rememberedValue6 == companion.getEmpty()) {
                rememberedValue6 = r.d(-1, null, null, 6, null);
                composer.updateRememberedValue(rememberedValue6);
            }
            o oVar = (o) rememberedValue6;
            LateMotionLayoutKt.LateMotionLayout(mutableState, mutableState2, animationSpec2, oVar, mutableState3, ref2, i14, aVar2, modifier2, ComposableLambdaKt.rememberComposableLambda(-74958949, true, new ConstraintLayoutKt$ConstraintLayout$contentDelegate$1(mutableState3, ref2, constraintLayoutScope2, qVar, oVar, mutableState, mutableState2), composer, 54), composer, (i12 & 896) | 805330998 | (Ref.$stable << 15) | ((i12 << 15) & 3670016) | ((i12 << 12) & 29360128) | ((i12 << 24) & 234881024));
            composer.endReplaceGroup();
            composer.endReplaceGroup();
            return;
        }
        composer.endReplaceGroup();
        Density density = (Density) composer.consume(CompositionLocalsKt.getLocalDensity());
        Object rememberedValue7 = composer.rememberedValue();
        Composer.Companion companion2 = Composer.Companion;
        if (rememberedValue7 == companion2.getEmpty()) {
            rememberedValue7 = new Measurer2(density);
            composer.updateRememberedValue(rememberedValue7);
        }
        Measurer2 measurer2 = (Measurer2) rememberedValue7;
        Object rememberedValue8 = composer.rememberedValue();
        if (rememberedValue8 == companion2.getEmpty()) {
            rememberedValue8 = new ConstraintLayoutScope();
            composer.updateRememberedValue(rememberedValue8);
        }
        ConstraintLayoutScope constraintLayoutScope3 = (ConstraintLayoutScope) rememberedValue8;
        Object rememberedValue9 = composer.rememberedValue();
        if (rememberedValue9 == companion2.getEmpty()) {
            rememberedValue9 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
            composer.updateRememberedValue(rememberedValue9);
        }
        MutableState mutableState4 = (MutableState) rememberedValue9;
        Object rememberedValue10 = composer.rememberedValue();
        if (rememberedValue10 == companion2.getEmpty()) {
            rememberedValue10 = new ConstraintSetForInlineDsl(constraintLayoutScope3);
            composer.updateRememberedValue(rememberedValue10);
        }
        ConstraintSetForInlineDsl constraintSetForInlineDsl = (ConstraintSetForInlineDsl) rememberedValue10;
        Object rememberedValue11 = composer.rememberedValue();
        if (rememberedValue11 == companion2.getEmpty()) {
            rememberedValue11 = SnapshotStateKt.mutableStateOf(g2.f100423a, SnapshotStateKt.neverEqualPolicy());
            composer.updateRememberedValue(rememberedValue11);
        }
        MutableState mutableState5 = (MutableState) rememberedValue11;
        boolean changedInstance = ((((i12 & 112) ^ 48) > 32 && composer.changed(i14)) || (i12 & 48) == 32) | composer.changedInstance(measurer2);
        Object rememberedValue12 = composer.rememberedValue();
        if (changedInstance || rememberedValue12 == companion2.getEmpty()) {
            Object constraintLayoutKt$ConstraintLayout$measurePolicy$1$1 = new ConstraintLayoutKt$ConstraintLayout$measurePolicy$1$1(mutableState5, measurer2, constraintSetForInlineDsl, i14, mutableState4);
            composer.updateRememberedValue(constraintLayoutKt$ConstraintLayout$measurePolicy$1$1);
            rememberedValue12 = constraintLayoutKt$ConstraintLayout$measurePolicy$1$1;
        }
        MeasurePolicy measurePolicy = (MeasurePolicy) rememberedValue12;
        Object rememberedValue13 = composer.rememberedValue();
        if (rememberedValue13 == companion2.getEmpty()) {
            rememberedValue13 = new ConstraintLayoutKt$ConstraintLayout$onHelpersChanged$1$1(mutableState4, constraintSetForInlineDsl);
            composer.updateRememberedValue(rememberedValue13);
        }
        x00.a aVar3 = (x00.a) rememberedValue13;
        boolean changedInstance2 = composer.changedInstance(measurer2);
        Object rememberedValue14 = composer.rememberedValue();
        if (changedInstance2 || rememberedValue14 == companion2.getEmpty()) {
            rememberedValue14 = new ConstraintLayoutKt$ConstraintLayout$1$1(measurer2);
            composer.updateRememberedValue(rememberedValue14);
        }
        LayoutKt.MultiMeasureLayout(SemanticsModifierKt.semantics$default(modifier2, false, (x00.l) rememberedValue14, 1, null), ComposableLambdaKt.rememberComposableLambda(1200550679, true, new ConstraintLayoutKt$ConstraintLayout$2(mutableState5, constraintLayoutScope3, qVar, aVar3), composer, 54), measurePolicy, composer, 48, 0);
        composer.endReplaceGroup();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ConstraintLayout$lambda-17, reason: not valid java name */
    public static final ConstraintSet m5443ConstraintLayout$lambda17(MutableState<ConstraintSet> mutableState) {
        return mutableState.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ConstraintLayout$lambda-20, reason: not valid java name */
    public static final ConstraintSet m5445ConstraintLayout$lambda20(MutableState<ConstraintSet> mutableState) {
        return mutableState.getValue();
    }

    @Composable
    @SuppressLint({"ComposableNaming"})
    @k
    public static final ConstraintSet ConstraintSet(@d("json5") @k String str, @l @d("json5") String str2, @l Composer composer, int i11, int i12) {
        if ((i12 & 2) != 0) {
            str2 = null;
        }
        String str3 = str2;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1420317079, i11, -1, "androidx.constraintlayout.compose.ConstraintSet (ConstraintLayout.kt:1347)");
        }
        boolean z11 = ((((i11 & 14) ^ 6) > 4 && composer.changed(str)) || (i11 & 6) == 4) | ((((i11 & 112) ^ 48) > 32 && composer.changed(str3)) || (i11 & 48) == 32);
        Object rememberedValue = composer.rememberedValue();
        if (z11 || rememberedValue == Composer.Companion.getEmpty()) {
            JSONConstraintSet jSONConstraintSet = new JSONConstraintSet(str, str3, null, 4, null);
            composer.updateRememberedValue(jSONConstraintSet);
            rememberedValue = jSONConstraintSet;
        }
        JSONConstraintSet jSONConstraintSet2 = (JSONConstraintSet) rememberedValue;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return jSONConstraintSet2;
    }

    @k
    /* renamed from: atLeast-3ABfNKs, reason: not valid java name */
    public static final Dimension.MaxCoercible m5451atLeast3ABfNKs(@k Dimension.Coercible coercible, float f11) {
        g0.n(coercible, "null cannot be cast to non-null type androidx.constraintlayout.compose.DimensionDescription");
        DimensionDescription dimensionDescription = (DimensionDescription) coercible;
        dimensionDescription.getMin$constraintlayout_compose_release().m5474update0680j_4(f11);
        return dimensionDescription;
    }

    @n(message = "Unintended method name, use atLeast(dp) instead", replaceWith = @w0(expression = "this.atLeast(dp)", imports = {"androidx.constraintlayout.compose.atLeast"}))
    @k
    /* renamed from: atLeastWrapContent-3ABfNKs, reason: not valid java name */
    public static final Dimension m5453atLeastWrapContent3ABfNKs(@k Dimension.MinCoercible minCoercible, float f11) {
        g0.n(minCoercible, "null cannot be cast to non-null type androidx.constraintlayout.compose.DimensionDescription");
        DimensionDescription dimensionDescription = (DimensionDescription) minCoercible;
        dimensionDescription.getMin$constraintlayout_compose_release().m5474update0680j_4(f11);
        return dimensionDescription;
    }

    @k
    /* renamed from: atMost-3ABfNKs, reason: not valid java name */
    public static final Dimension.MinCoercible m5454atMost3ABfNKs(@k Dimension.Coercible coercible, float f11) {
        g0.n(coercible, "null cannot be cast to non-null type androidx.constraintlayout.compose.DimensionDescription");
        DimensionDescription dimensionDescription = (DimensionDescription) coercible;
        dimensionDescription.getMax$constraintlayout_compose_release().m5474update0680j_4(f11);
        return dimensionDescription;
    }

    public static final void buildMapping(@k State state, @k List<? extends Measurable> list) {
        int size = list.size();
        for (int i11 = 0; i11 < size; i11++) {
            Measurable measurable = list.get(i11);
            Object layoutId = LayoutIdKt.getLayoutId(measurable);
            if (layoutId == null && (layoutId = ConstraintLayoutTagKt.getConstraintLayoutId(measurable)) == null) {
                layoutId = createId();
            }
            state.map(layoutId.toString(), measurable);
            Object constraintLayoutTag = ConstraintLayoutTagKt.getConstraintLayoutTag(measurable);
            if (constraintLayoutTag != null && (constraintLayoutTag instanceof String) && (layoutId instanceof String)) {
                state.setTag((String) layoutId, (String) constraintLayoutTag);
            }
        }
    }

    @k
    public static final Object createId() {
        return new Object() { // from class: androidx.constraintlayout.compose.ConstraintLayoutKt$createId$1
        };
    }

    @k
    public static final Dimension.MaxCoercible getAtLeastWrapContent(@k Dimension.Coercible coercible) {
        g0.n(coercible, "null cannot be cast to non-null type androidx.constraintlayout.compose.DimensionDescription");
        DimensionDescription dimensionDescription = (DimensionDescription) coercible;
        dimensionDescription.getMin$constraintlayout_compose_release().update("wrap");
        return dimensionDescription;
    }

    @k
    public static final Dimension.MinCoercible getAtMostWrapContent(@k Dimension.Coercible coercible) {
        g0.n(coercible, "null cannot be cast to non-null type androidx.constraintlayout.compose.DimensionDescription");
        DimensionDescription dimensionDescription = (DimensionDescription) coercible;
        dimensionDescription.getMax$constraintlayout_compose_release().update("wrap");
        return dimensionDescription;
    }

    /* renamed from: placeWithFrameTransform-Ktjjmr4, reason: not valid java name */
    public static final void m5456placeWithFrameTransformKtjjmr4(@k Placeable.PlacementScope placementScope, @k Placeable placeable, @k final WidgetFrame widgetFrame, long j11) {
        if (widgetFrame.visibility == 8) {
            return;
        }
        if (widgetFrame.isDefaultTransform()) {
            Placeable.PlacementScope.m3921place70tqf50$default(placementScope, placeable, IntOffsetKt.IntOffset(widgetFrame.left - IntOffset.m5243getXimpl(j11), widgetFrame.top - IntOffset.m5244getYimpl(j11)), 0.0f, 2, null);
        } else {
            placementScope.placeWithLayer(placeable, widgetFrame.left - IntOffset.m5243getXimpl(j11), widgetFrame.top - IntOffset.m5244getYimpl(j11), Float.isNaN(widgetFrame.translationZ) ? 0.0f : widgetFrame.translationZ, new x00.l<GraphicsLayerScope, g2>() { // from class: androidx.constraintlayout.compose.ConstraintLayoutKt$placeWithFrameTransform$layerBlock$1
                {
                    super(1);
                }

                @Override // x00.l
                public /* bridge */ /* synthetic */ g2 invoke(GraphicsLayerScope graphicsLayerScope) {
                    invoke2(graphicsLayerScope);
                    return g2.f100423a;
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(GraphicsLayerScope graphicsLayerScope) {
                    if (!Float.isNaN(WidgetFrame.this.pivotX) || !Float.isNaN(WidgetFrame.this.pivotY)) {
                        graphicsLayerScope.mo2701setTransformOrigin__ExYCQ(TransformOriginKt.TransformOrigin(Float.isNaN(WidgetFrame.this.pivotX) ? 0.5f : WidgetFrame.this.pivotX, Float.isNaN(WidgetFrame.this.pivotY) ? 0.5f : WidgetFrame.this.pivotY));
                    }
                    if (!Float.isNaN(WidgetFrame.this.rotationX)) {
                        graphicsLayerScope.setRotationX(WidgetFrame.this.rotationX);
                    }
                    if (!Float.isNaN(WidgetFrame.this.rotationY)) {
                        graphicsLayerScope.setRotationY(WidgetFrame.this.rotationY);
                    }
                    if (!Float.isNaN(WidgetFrame.this.rotationZ)) {
                        graphicsLayerScope.setRotationZ(WidgetFrame.this.rotationZ);
                    }
                    if (!Float.isNaN(WidgetFrame.this.translationX)) {
                        graphicsLayerScope.setTranslationX(WidgetFrame.this.translationX);
                    }
                    if (!Float.isNaN(WidgetFrame.this.translationY)) {
                        graphicsLayerScope.setTranslationY(WidgetFrame.this.translationY);
                    }
                    if (!Float.isNaN(WidgetFrame.this.translationZ)) {
                        graphicsLayerScope.setShadowElevation(WidgetFrame.this.translationZ);
                    }
                    if (!Float.isNaN(WidgetFrame.this.scaleX) || !Float.isNaN(WidgetFrame.this.scaleY)) {
                        graphicsLayerScope.setScaleX(Float.isNaN(WidgetFrame.this.scaleX) ? 1.0f : WidgetFrame.this.scaleX);
                        graphicsLayerScope.setScaleY(Float.isNaN(WidgetFrame.this.scaleY) ? 1.0f : WidgetFrame.this.scaleY);
                    }
                    if (Float.isNaN(WidgetFrame.this.alpha)) {
                        return;
                    }
                    graphicsLayerScope.setAlpha(WidgetFrame.this.alpha);
                }
            });
        }
    }

    /* renamed from: placeWithFrameTransform-Ktjjmr4$default, reason: not valid java name */
    public static /* synthetic */ void m5457placeWithFrameTransformKtjjmr4$default(Placeable.PlacementScope placementScope, Placeable placeable, WidgetFrame widgetFrame, long j11, int i11, Object obj) {
        if ((i11 & 4) != 0) {
            j11 = IntOffset.Companion.m5254getZeronOccac();
        }
        m5456placeWithFrameTransformKtjjmr4(placementScope, placeable, widgetFrame, j11);
    }

    @k
    public static final String toDebugString(@k ConstraintWidget constraintWidget) {
        return constraintWidget.getDebugName() + " width " + constraintWidget.getWidth() + " minWidth " + constraintWidget.getMinWidth() + " maxWidth " + constraintWidget.getMaxWidth() + " height " + constraintWidget.getHeight() + " minHeight " + constraintWidget.getMinHeight() + " maxHeight " + constraintWidget.getMaxHeight() + " HDB " + constraintWidget.getHorizontalDimensionBehaviour() + " VDB " + constraintWidget.getVerticalDimensionBehaviour() + " MCW " + constraintWidget.mMatchConstraintDefaultWidth + " MCH " + constraintWidget.mMatchConstraintDefaultHeight + " percentW " + constraintWidget.mMatchConstraintPercentWidth + " percentH " + constraintWidget.mMatchConstraintPercentHeight;
    }

    @k
    /* renamed from: atLeast-3ABfNKs, reason: not valid java name */
    public static final Dimension m5452atLeast3ABfNKs(@k Dimension.MinCoercible minCoercible, float f11) {
        g0.n(minCoercible, "null cannot be cast to non-null type androidx.constraintlayout.compose.DimensionDescription");
        DimensionDescription dimensionDescription = (DimensionDescription) minCoercible;
        dimensionDescription.getMin$constraintlayout_compose_release().m5474update0680j_4(f11);
        return dimensionDescription;
    }

    @k
    /* renamed from: atMost-3ABfNKs, reason: not valid java name */
    public static final Dimension m5455atMost3ABfNKs(@k Dimension.MaxCoercible maxCoercible, float f11) {
        g0.n(maxCoercible, "null cannot be cast to non-null type androidx.constraintlayout.compose.DimensionDescription");
        DimensionDescription dimensionDescription = (DimensionDescription) maxCoercible;
        dimensionDescription.getMax$constraintlayout_compose_release().m5474update0680j_4(f11);
        return dimensionDescription;
    }

    @k
    public static final Dimension getAtLeastWrapContent(@k Dimension.MinCoercible minCoercible) {
        g0.n(minCoercible, "null cannot be cast to non-null type androidx.constraintlayout.compose.DimensionDescription");
        DimensionDescription dimensionDescription = (DimensionDescription) minCoercible;
        dimensionDescription.getMin$constraintlayout_compose_release().update("wrap");
        return dimensionDescription;
    }

    @k
    public static final Dimension getAtMostWrapContent(@k Dimension.MaxCoercible maxCoercible) {
        g0.n(maxCoercible, "null cannot be cast to non-null type androidx.constraintlayout.compose.DimensionDescription");
        DimensionDescription dimensionDescription = (DimensionDescription) maxCoercible;
        dimensionDescription.getMax$constraintlayout_compose_release().update("wrap");
        return dimensionDescription;
    }

    @k
    public static final ConstraintSet ConstraintSet(@d("json5") @k String str) {
        return new JSONConstraintSet(str, null, null, 6, null);
    }

    @k
    public static final ConstraintSet ConstraintSet(@k ConstraintSet constraintSet, @d("json5") @k String str) {
        return new JSONConstraintSet(str, null, constraintSet, 2, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @k
    public static final ConstraintSet ConstraintSet(@k x00.l<? super ConstraintSetScope, g2> lVar) {
        return new DslConstraintSet(lVar, null, 2, 0 == true ? 1 : 0);
    }

    @k
    public static final ConstraintSet ConstraintSet(@k ConstraintSet constraintSet, @k x00.l<? super ConstraintSetScope, g2> lVar) {
        return new DslConstraintSet(lVar, constraintSet);
    }

    @Composable
    @n(level = DeprecationLevel.WARNING, message = "Prefer version that takes a nullable AnimationSpec to animate changes.", replaceWith = @w0(expression = "ConstraintLayout(modifier = modifier, optimizationLevel = optimizationLevel, animateChangesSpec = animationSpec, finishedAnimationListener = finishedAnimationListener) { content() }", imports = {}))
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    public static final void ConstraintLayout(@l Modifier modifier, int i11, boolean z11, @l AnimationSpec<Float> animationSpec, @l x00.a<g2> aVar, @k q<? super ConstraintLayoutScope, ? super Composer, ? super Integer, g2> qVar, @l Composer composer, int i12, int i13) {
        Measurer2 measurer2;
        MutableState mutableState;
        Object constraintLayoutKt$ConstraintLayout$measurePolicy$1$1;
        Modifier modifier2 = (i13 & 1) != 0 ? Modifier.Companion : modifier;
        int i14 = (i13 & 2) != 0 ? 257 : i11;
        boolean z12 = (i13 & 4) != 0 ? false : z11;
        AnimationSpec<Float> tween$default = (i13 & 8) != 0 ? AnimationSpecKt.tween$default(0, 0, null, 7, null) : animationSpec;
        x00.a<g2> aVar2 = (i13 & 16) != 0 ? null : aVar;
        if (!z12) {
            tween$default = null;
        }
        int i15 = i12 >> 3;
        int i16 = (i12 & 126) | (i15 & 7168) | (i15 & 57344);
        composer.startReplaceGroup(-1003410150);
        composer.startReplaceGroup(212064437);
        if (tween$default != null) {
            Object rememberedValue = composer.rememberedValue();
            Composer.Companion companion = Composer.Companion;
            if (rememberedValue == companion.getEmpty()) {
                rememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
                composer.updateRememberedValue(rememberedValue);
            }
            MutableState mutableState2 = (MutableState) rememberedValue;
            Object rememberedValue2 = composer.rememberedValue();
            if (rememberedValue2 == companion.getEmpty()) {
                rememberedValue2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
                composer.updateRememberedValue(rememberedValue2);
            }
            MutableState mutableState3 = (MutableState) rememberedValue2;
            Object rememberedValue3 = composer.rememberedValue();
            Object obj = rememberedValue3;
            if (rememberedValue3 == companion.getEmpty()) {
                ConstraintLayoutScope constraintLayoutScope = new ConstraintLayoutScope();
                constraintLayoutScope.setAnimateChanges(true);
                composer.updateRememberedValue(constraintLayoutScope);
                obj = constraintLayoutScope;
            }
            ConstraintLayoutScope constraintLayoutScope2 = (ConstraintLayoutScope) obj;
            Object rememberedValue4 = composer.rememberedValue();
            if (rememberedValue4 == companion.getEmpty()) {
                rememberedValue4 = SnapshotStateKt.mutableStateOf(g2.f100423a, SnapshotStateKt.neverEqualPolicy());
                composer.updateRememberedValue(rememberedValue4);
            }
            MutableState mutableState4 = (MutableState) rememberedValue4;
            Object rememberedValue5 = composer.rememberedValue();
            Object obj2 = rememberedValue5;
            if (rememberedValue5 == companion.getEmpty()) {
                Ref ref = new Ref();
                ref.setValue(CompositionSource.Unknown);
                composer.updateRememberedValue(ref);
                obj2 = ref;
            }
            Ref ref2 = (Ref) obj2;
            Object rememberedValue6 = composer.rememberedValue();
            if (rememberedValue6 == companion.getEmpty()) {
                rememberedValue6 = r.d(-1, null, null, 6, null);
                composer.updateRememberedValue(rememberedValue6);
            }
            o oVar = (o) rememberedValue6;
            LateMotionLayoutKt.LateMotionLayout(mutableState2, mutableState3, tween$default, oVar, mutableState4, ref2, i14, aVar2, modifier2, ComposableLambdaKt.rememberComposableLambda(-74958949, true, new ConstraintLayoutKt$ConstraintLayout$contentDelegate$1(mutableState4, ref2, constraintLayoutScope2, qVar, oVar, mutableState2, mutableState3), composer, 54), composer, (Ref.$stable << 15) | 805330998 | ((i16 << 15) & 3670016) | ((i16 << 12) & 29360128) | ((i16 << 24) & 234881024));
            composer.endReplaceGroup();
            composer.endReplaceGroup();
            return;
        }
        composer.endReplaceGroup();
        Density density = (Density) composer.consume(CompositionLocalsKt.getLocalDensity());
        Object rememberedValue7 = composer.rememberedValue();
        Composer.Companion companion2 = Composer.Companion;
        if (rememberedValue7 == companion2.getEmpty()) {
            rememberedValue7 = new Measurer2(density);
            composer.updateRememberedValue(rememberedValue7);
        }
        Measurer2 measurer22 = (Measurer2) rememberedValue7;
        Object rememberedValue8 = composer.rememberedValue();
        if (rememberedValue8 == companion2.getEmpty()) {
            rememberedValue8 = new ConstraintLayoutScope();
            composer.updateRememberedValue(rememberedValue8);
        }
        ConstraintLayoutScope constraintLayoutScope3 = (ConstraintLayoutScope) rememberedValue8;
        Object rememberedValue9 = composer.rememberedValue();
        if (rememberedValue9 == companion2.getEmpty()) {
            rememberedValue9 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
            composer.updateRememberedValue(rememberedValue9);
        }
        MutableState mutableState5 = (MutableState) rememberedValue9;
        Object rememberedValue10 = composer.rememberedValue();
        if (rememberedValue10 == companion2.getEmpty()) {
            rememberedValue10 = new ConstraintSetForInlineDsl(constraintLayoutScope3);
            composer.updateRememberedValue(rememberedValue10);
        }
        ConstraintSetForInlineDsl constraintSetForInlineDsl = (ConstraintSetForInlineDsl) rememberedValue10;
        Object rememberedValue11 = composer.rememberedValue();
        if (rememberedValue11 == companion2.getEmpty()) {
            rememberedValue11 = SnapshotStateKt.mutableStateOf(g2.f100423a, SnapshotStateKt.neverEqualPolicy());
            composer.updateRememberedValue(rememberedValue11);
        }
        MutableState mutableState6 = (MutableState) rememberedValue11;
        boolean changedInstance = ((((i16 & 112) ^ 48) > 32 && composer.changed(i14)) || (i16 & 48) == 32) | composer.changedInstance(measurer22);
        Object rememberedValue12 = composer.rememberedValue();
        if (changedInstance || rememberedValue12 == companion2.getEmpty()) {
            measurer2 = measurer22;
            mutableState = mutableState6;
            constraintLayoutKt$ConstraintLayout$measurePolicy$1$1 = new ConstraintLayoutKt$ConstraintLayout$measurePolicy$1$1(mutableState, measurer2, constraintSetForInlineDsl, i14, mutableState5);
            composer.updateRememberedValue(constraintLayoutKt$ConstraintLayout$measurePolicy$1$1);
        } else {
            mutableState = mutableState6;
            constraintLayoutKt$ConstraintLayout$measurePolicy$1$1 = rememberedValue12;
            measurer2 = measurer22;
        }
        MeasurePolicy measurePolicy = (MeasurePolicy) constraintLayoutKt$ConstraintLayout$measurePolicy$1$1;
        Object rememberedValue13 = composer.rememberedValue();
        if (rememberedValue13 == companion2.getEmpty()) {
            rememberedValue13 = new ConstraintLayoutKt$ConstraintLayout$onHelpersChanged$1$1(mutableState5, constraintSetForInlineDsl);
            composer.updateRememberedValue(rememberedValue13);
        }
        x00.a aVar3 = (x00.a) rememberedValue13;
        boolean changedInstance2 = composer.changedInstance(measurer2);
        Object rememberedValue14 = composer.rememberedValue();
        if (changedInstance2 || rememberedValue14 == companion2.getEmpty()) {
            rememberedValue14 = new ConstraintLayoutKt$ConstraintLayout$1$1(measurer2);
            composer.updateRememberedValue(rememberedValue14);
        }
        LayoutKt.MultiMeasureLayout(SemanticsModifierKt.semantics$default(modifier2, false, (x00.l) rememberedValue14, 1, null), ComposableLambdaKt.rememberComposableLambda(1200550679, true, new ConstraintLayoutKt$ConstraintLayout$2(mutableState, constraintLayoutScope3, qVar, aVar3), composer, 54), measurePolicy, composer, 48, 0);
        composer.endReplaceGroup();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    public static final void ConstraintLayout(@k ConstraintSet constraintSet, @l Modifier modifier, int i11, @l AnimationSpec<Float> animationSpec, @l x00.a<g2> aVar, @k p<? super Composer, ? super Integer, g2> pVar, @l Composer composer, int i12, int i13) {
        Animatable animatable;
        Modifier modifier2 = (i13 & 2) != 0 ? Modifier.Companion : modifier;
        int i14 = (i13 & 4) != 0 ? 257 : i11;
        AnimationSpec<Float> animationSpec2 = (i13 & 8) != 0 ? null : animationSpec;
        x00.a<g2> aVar2 = (i13 & 16) != 0 ? null : aVar;
        if (animationSpec2 != null) {
            composer.startReplaceGroup(-2000135165);
            Object rememberedValue = composer.rememberedValue();
            Composer.Companion companion = Composer.Companion;
            if (rememberedValue == companion.getEmpty()) {
                rememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(constraintSet, null, 2, null);
                composer.updateRememberedValue(rememberedValue);
            }
            MutableState mutableState = (MutableState) rememberedValue;
            Object rememberedValue2 = composer.rememberedValue();
            if (rememberedValue2 == companion.getEmpty()) {
                rememberedValue2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(constraintSet, null, 2, null);
                composer.updateRememberedValue(rememberedValue2);
            }
            MutableState mutableState2 = (MutableState) rememberedValue2;
            Object rememberedValue3 = composer.rememberedValue();
            if (rememberedValue3 == companion.getEmpty()) {
                rememberedValue3 = AnimatableKt.Animatable$default(0.0f, 0.0f, 2, null);
                composer.updateRememberedValue(rememberedValue3);
            }
            Animatable animatable2 = (Animatable) rememberedValue3;
            Object rememberedValue4 = composer.rememberedValue();
            if (rememberedValue4 == companion.getEmpty()) {
                rememberedValue4 = r.d(-1, null, null, 6, null);
                composer.updateRememberedValue(rememberedValue4);
            }
            o oVar = (o) rememberedValue4;
            Object rememberedValue5 = composer.rememberedValue();
            if (rememberedValue5 == companion.getEmpty()) {
                rememberedValue5 = SnapshotIntStateKt.mutableIntStateOf(1);
                composer.updateRememberedValue(rememberedValue5);
            }
            MutableIntState mutableIntState = (MutableIntState) rememberedValue5;
            boolean changedInstance = composer.changedInstance(oVar) | (((6 ^ (i12 & 14)) > 4 && composer.changed(constraintSet)) || (i12 & 6) == 4);
            Object rememberedValue6 = composer.rememberedValue();
            if (changedInstance || rememberedValue6 == companion.getEmpty()) {
                rememberedValue6 = new ConstraintLayoutKt$ConstraintLayout$3$1(oVar, constraintSet);
                composer.updateRememberedValue(rememberedValue6);
            }
            EffectsKt.SideEffect((x00.a) rememberedValue6, composer, 0);
            boolean changedInstance2 = composer.changedInstance(oVar) | composer.changedInstance(animatable2) | composer.changedInstance(animationSpec2) | ((((57344 & i12) ^ 24576) > 16384 && composer.changed(aVar2)) || (i12 & 24576) == 16384);
            Object rememberedValue7 = composer.rememberedValue();
            if (changedInstance2 || rememberedValue7 == companion.getEmpty()) {
                animatable = animatable2;
                Object constraintLayoutKt$ConstraintLayout$4$1 = new ConstraintLayoutKt$ConstraintLayout$4$1(oVar, mutableIntState, animatable, animationSpec2, aVar2, mutableState, mutableState2, null);
                composer.updateRememberedValue(constraintLayoutKt$ConstraintLayout$4$1);
                rememberedValue7 = constraintLayoutKt$ConstraintLayout$4$1;
            } else {
                animatable = animatable2;
            }
            EffectsKt.LaunchedEffect(oVar, (p<? super r0, ? super j00.c<? super g2>, ? extends Object>) rememberedValue7, composer, 0);
            ConstraintSet m5443ConstraintLayout$lambda17 = m5443ConstraintLayout$lambda17(mutableState);
            ConstraintSet m5445ConstraintLayout$lambda20 = m5445ConstraintLayout$lambda20(mutableState2);
            float floatValue = ((Number) animatable.getValue()).floatValue();
            int i15 = (i12 << 6) & 7168;
            int m5471getNonebfy_xzQ = DebugFlags.Companion.m5471getNonebfy_xzQ();
            InvalidationStrategy defaultInvalidationStrategy = InvalidationStrategy.Companion.getDefaultInvalidationStrategy();
            Object rememberedValue8 = composer.rememberedValue();
            if (rememberedValue8 == companion.getEmpty()) {
                rememberedValue8 = SnapshotStateKt.mutableStateOf(g2.f100423a, SnapshotStateKt.neverEqualPolicy());
                composer.updateRememberedValue(rememberedValue8);
            }
            MutableState mutableState3 = (MutableState) rememberedValue8;
            Object rememberedValue9 = composer.rememberedValue();
            Object obj = rememberedValue9;
            if (rememberedValue9 == companion.getEmpty()) {
                Ref ref = new Ref();
                ref.setValue(CompositionSource.Unknown);
                composer.updateRememberedValue(ref);
                obj = ref;
            }
            Ref ref2 = (Ref) obj;
            MotionLayoutKt.MotionLayoutCore(m5443ConstraintLayout$lambda17, m5445ConstraintLayout$lambda20, null, floatValue, null, 257, DebugFlags.m5464getShowBoundsimpl(m5471getNonebfy_xzQ), DebugFlags.m5466getShowPathsimpl(m5471getNonebfy_xzQ), DebugFlags.m5465getShowKeyPositionsimpl(m5471getNonebfy_xzQ), modifier2, mutableState3, ref2, defaultInvalidationStrategy, ComposableLambdaKt.rememberComposableLambda(284503157, true, new ConstraintLayoutKt$ConstraintLayout$$inlined$MotionLayoutT3LJ6Qw$1(mutableState3, defaultInvalidationStrategy, ref2, pVar, i12), composer, 54), composer, 24576 | ((i15 << 18) & 1879048192), (Ref.$stable << 3) | 3078);
            composer.endReplaceGroup();
            return;
        }
        composer.startReplaceGroup(-1998673515);
        Object rememberedValue10 = composer.rememberedValue();
        Composer.Companion companion2 = Composer.Companion;
        if (rememberedValue10 == companion2.getEmpty()) {
            rememberedValue10 = SnapshotLongStateKt.mutableLongStateOf(0L);
            composer.updateRememberedValue(rememberedValue10);
        }
        MutableLongState mutableLongState = (MutableLongState) rememberedValue10;
        Object rememberedValue11 = composer.rememberedValue();
        if (rememberedValue11 == companion2.getEmpty()) {
            rememberedValue11 = SnapshotStateKt.mutableStateOf(g2.f100423a, SnapshotStateKt.neverEqualPolicy());
            composer.updateRememberedValue(rememberedValue11);
        }
        MutableState mutableState4 = (MutableState) rememberedValue11;
        Density density = (Density) composer.consume(CompositionLocalsKt.getLocalDensity());
        Object rememberedValue12 = composer.rememberedValue();
        if (rememberedValue12 == companion2.getEmpty()) {
            rememberedValue12 = new Measurer2(density);
            composer.updateRememberedValue(rememberedValue12);
        }
        Measurer2 measurer2 = (Measurer2) rememberedValue12;
        boolean changedInstance3 = ((((i12 & 896) ^ 384) > 256 && composer.changed(i14)) || (i12 & 384) == 256) | composer.changedInstance(measurer2) | ((((i12 & 14) ^ 6) > 4 && composer.changed(constraintSet)) || (i12 & 6) == 4);
        Object rememberedValue13 = composer.rememberedValue();
        if (changedInstance3 || rememberedValue13 == companion2.getEmpty()) {
            rememberedValue13 = new ConstraintLayoutKt$ConstraintLayout$measurePolicy$2$1(mutableState4, measurer2, constraintSet, i14);
            composer.updateRememberedValue(rememberedValue13);
        }
        MeasurePolicy measurePolicy = (MeasurePolicy) rememberedValue13;
        if (constraintSet instanceof EditableJSONLayout) {
            ((EditableJSONLayout) constraintSet).setUpdateFlag(mutableLongState);
        }
        measurer2.addLayoutInformationReceiver(constraintSet instanceof LayoutInformationReceiver ? (LayoutInformationReceiver) constraintSet : null);
        if (!Float.isNaN(measurer2.getForcedScaleFactor())) {
            composer.startReplaceGroup(-1997256040);
            Modifier scale = ScaleKt.scale(modifier2, measurer2.getForcedScaleFactor());
            Modifier.Companion companion3 = Modifier.Companion;
            MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.getTopStart(), false);
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
            CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
            Modifier materializeModifier = ComposedModifierKt.materializeModifier(composer, companion3);
            ComposeUiNode.Companion companion4 = ComposeUiNode.Companion;
            x00.a<ComposeUiNode> constructor = companion4.getConstructor();
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
            Updater.m1958setimpl(m1951constructorimpl, maybeCachedBoxMeasurePolicy, companion4.getSetMeasurePolicy());
            Updater.m1958setimpl(m1951constructorimpl, currentCompositionLocalMap, companion4.getSetResolvedCompositionLocals());
            p<ComposeUiNode, Integer, g2> setCompositeKeyHash = companion4.getSetCompositeKeyHash();
            if (m1951constructorimpl.getInserting() || !g0.g(m1951constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                m1951constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                m1951constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m1958setimpl(m1951constructorimpl, materializeModifier, companion4.getSetModifier());
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            boolean changedInstance4 = composer.changedInstance(measurer2);
            Object rememberedValue14 = composer.rememberedValue();
            if (changedInstance4 || rememberedValue14 == companion2.getEmpty()) {
                rememberedValue14 = new ConstraintLayoutKt$ConstraintLayout$6$1$1(measurer2);
                composer.updateRememberedValue(rememberedValue14);
            }
            LayoutKt.MultiMeasureLayout(SemanticsModifierKt.semantics$default(scale, false, (x00.l) rememberedValue14, 1, null), ComposableLambdaKt.rememberComposableLambda(1131308473, true, new ConstraintLayoutKt$ConstraintLayout$6$2(pVar), composer, 54), measurePolicy, composer, 48, 0);
            composer.endNode();
            composer.endReplaceGroup();
        } else {
            composer.startReplaceGroup(-1996827620);
            boolean changedInstance5 = composer.changedInstance(measurer2);
            Object rememberedValue15 = composer.rememberedValue();
            if (changedInstance5 || rememberedValue15 == companion2.getEmpty()) {
                rememberedValue15 = new ConstraintLayoutKt$ConstraintLayout$7$1(measurer2);
                composer.updateRememberedValue(rememberedValue15);
            }
            LayoutKt.MultiMeasureLayout(SemanticsModifierKt.semantics$default(modifier2, false, (x00.l) rememberedValue15, 1, null), ComposableLambdaKt.rememberComposableLambda(-207512644, true, new ConstraintLayoutKt$ConstraintLayout$8(mutableState4, pVar), composer, 54), measurePolicy, composer, 48, 0);
            composer.endReplaceGroup();
        }
        composer.endReplaceGroup();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Composable
    @n(level = DeprecationLevel.WARNING, message = "Prefer version that takes a nullable AnimationSpec to animate changes.", replaceWith = @w0(expression = "ConstraintLayout(constraintSet = constraintSet, modifier = modifier, optimizationLevel = optimizationLevel, animateChangesSpec = animationSpec, finishedAnimationListener = finishedAnimationListener) { content() }", imports = {}))
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    public static final void ConstraintLayout(@k ConstraintSet constraintSet, @l Modifier modifier, int i11, boolean z11, @l AnimationSpec<Float> animationSpec, @l x00.a<g2> aVar, @k p<? super Composer, ? super Integer, g2> pVar, @l Composer composer, int i12, int i13) {
        Animatable animatable;
        Modifier modifier2 = (i13 & 2) != 0 ? Modifier.Companion : modifier;
        int i14 = (i13 & 4) != 0 ? 257 : i11;
        boolean z12 = (i13 & 8) != 0 ? false : z11;
        AnimationSpec<Float> tween$default = (i13 & 16) != 0 ? AnimationSpecKt.tween$default(0, 0, null, 7, null) : animationSpec;
        x00.a<g2> aVar2 = (i13 & 32) != 0 ? null : aVar;
        if (!z12) {
            tween$default = null;
        }
        int i15 = i12 >> 3;
        int i16 = (i15 & 458752) | (i12 & 1022) | (i15 & 57344);
        if (tween$default != null) {
            composer.startReplaceGroup(-2000135165);
            Object rememberedValue = composer.rememberedValue();
            Composer.Companion companion = Composer.Companion;
            if (rememberedValue == companion.getEmpty()) {
                rememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(constraintSet, null, 2, null);
                composer.updateRememberedValue(rememberedValue);
            }
            MutableState mutableState = (MutableState) rememberedValue;
            Object rememberedValue2 = composer.rememberedValue();
            if (rememberedValue2 == companion.getEmpty()) {
                rememberedValue2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(constraintSet, null, 2, null);
                composer.updateRememberedValue(rememberedValue2);
            }
            MutableState mutableState2 = (MutableState) rememberedValue2;
            Object rememberedValue3 = composer.rememberedValue();
            if (rememberedValue3 == companion.getEmpty()) {
                rememberedValue3 = AnimatableKt.Animatable$default(0.0f, 0.0f, 2, null);
                composer.updateRememberedValue(rememberedValue3);
            }
            Animatable animatable2 = (Animatable) rememberedValue3;
            Object rememberedValue4 = composer.rememberedValue();
            if (rememberedValue4 == companion.getEmpty()) {
                rememberedValue4 = r.d(-1, null, null, 6, null);
                composer.updateRememberedValue(rememberedValue4);
            }
            o oVar = (o) rememberedValue4;
            Object rememberedValue5 = composer.rememberedValue();
            if (rememberedValue5 == companion.getEmpty()) {
                rememberedValue5 = SnapshotIntStateKt.mutableIntStateOf(1);
                composer.updateRememberedValue(rememberedValue5);
            }
            MutableIntState mutableIntState = (MutableIntState) rememberedValue5;
            boolean changedInstance = composer.changedInstance(oVar) | (((6 ^ (i16 & 14)) > 4 && composer.changed(constraintSet)) || (i16 & 6) == 4);
            Object rememberedValue6 = composer.rememberedValue();
            if (changedInstance || rememberedValue6 == companion.getEmpty()) {
                rememberedValue6 = new ConstraintLayoutKt$ConstraintLayout$3$1(oVar, constraintSet);
                composer.updateRememberedValue(rememberedValue6);
            }
            EffectsKt.SideEffect((x00.a) rememberedValue6, composer, 0);
            boolean changedInstance2 = composer.changedInstance(oVar) | composer.changedInstance(animatable2) | composer.changedInstance(tween$default) | ((((i16 & 57344) ^ 24576) > 16384 && composer.changed(aVar2)) || (i16 & 24576) == 16384);
            Object rememberedValue7 = composer.rememberedValue();
            if (changedInstance2 || rememberedValue7 == companion.getEmpty()) {
                animatable = animatable2;
                Object constraintLayoutKt$ConstraintLayout$4$1 = new ConstraintLayoutKt$ConstraintLayout$4$1(oVar, mutableIntState, animatable, tween$default, aVar2, mutableState, mutableState2, null);
                composer.updateRememberedValue(constraintLayoutKt$ConstraintLayout$4$1);
                rememberedValue7 = constraintLayoutKt$ConstraintLayout$4$1;
            } else {
                animatable = animatable2;
            }
            EffectsKt.LaunchedEffect(oVar, (p<? super r0, ? super j00.c<? super g2>, ? extends Object>) rememberedValue7, composer, 0);
            ConstraintSet m5443ConstraintLayout$lambda17 = m5443ConstraintLayout$lambda17(mutableState);
            ConstraintSet m5445ConstraintLayout$lambda20 = m5445ConstraintLayout$lambda20(mutableState2);
            float floatValue = ((Number) animatable.getValue()).floatValue();
            int i17 = (i16 << 6) & 7168;
            int m5471getNonebfy_xzQ = DebugFlags.Companion.m5471getNonebfy_xzQ();
            InvalidationStrategy defaultInvalidationStrategy = InvalidationStrategy.Companion.getDefaultInvalidationStrategy();
            Object rememberedValue8 = composer.rememberedValue();
            if (rememberedValue8 == companion.getEmpty()) {
                rememberedValue8 = SnapshotStateKt.mutableStateOf(g2.f100423a, SnapshotStateKt.neverEqualPolicy());
                composer.updateRememberedValue(rememberedValue8);
            }
            MutableState mutableState3 = (MutableState) rememberedValue8;
            Object rememberedValue9 = composer.rememberedValue();
            Object obj = rememberedValue9;
            if (rememberedValue9 == companion.getEmpty()) {
                Ref ref = new Ref();
                ref.setValue(CompositionSource.Unknown);
                composer.updateRememberedValue(ref);
                obj = ref;
            }
            Ref ref2 = (Ref) obj;
            MotionLayoutKt.MotionLayoutCore(m5443ConstraintLayout$lambda17, m5445ConstraintLayout$lambda20, null, floatValue, null, 257, DebugFlags.m5464getShowBoundsimpl(m5471getNonebfy_xzQ), DebugFlags.m5466getShowPathsimpl(m5471getNonebfy_xzQ), DebugFlags.m5465getShowKeyPositionsimpl(m5471getNonebfy_xzQ), modifier2, mutableState3, ref2, defaultInvalidationStrategy, ComposableLambdaKt.rememberComposableLambda(284503157, true, new ConstraintLayoutKt$ConstraintLayout$$inlined$MotionLayoutT3LJ6Qw$1(mutableState3, defaultInvalidationStrategy, ref2, pVar, i16), composer, 54), composer, 24576 | ((i17 << 18) & 1879048192), (Ref.$stable << 3) | 3078);
            composer.endReplaceGroup();
            return;
        }
        composer.startReplaceGroup(-1998673515);
        Object rememberedValue10 = composer.rememberedValue();
        Composer.Companion companion2 = Composer.Companion;
        if (rememberedValue10 == companion2.getEmpty()) {
            rememberedValue10 = SnapshotLongStateKt.mutableLongStateOf(0L);
            composer.updateRememberedValue(rememberedValue10);
        }
        MutableLongState mutableLongState = (MutableLongState) rememberedValue10;
        Object rememberedValue11 = composer.rememberedValue();
        if (rememberedValue11 == companion2.getEmpty()) {
            rememberedValue11 = SnapshotStateKt.mutableStateOf(g2.f100423a, SnapshotStateKt.neverEqualPolicy());
            composer.updateRememberedValue(rememberedValue11);
        }
        MutableState mutableState4 = (MutableState) rememberedValue11;
        Density density = (Density) composer.consume(CompositionLocalsKt.getLocalDensity());
        Object rememberedValue12 = composer.rememberedValue();
        if (rememberedValue12 == companion2.getEmpty()) {
            rememberedValue12 = new Measurer2(density);
            composer.updateRememberedValue(rememberedValue12);
        }
        Measurer2 measurer2 = (Measurer2) rememberedValue12;
        boolean changedInstance3 = composer.changedInstance(measurer2) | ((((i16 & 14) ^ 6) > 4 && composer.changed(constraintSet)) || (i16 & 6) == 4) | ((((i16 & 896) ^ 384) > 256 && composer.changed(i14)) || (i16 & 384) == 256);
        Object rememberedValue13 = composer.rememberedValue();
        if (changedInstance3 || rememberedValue13 == companion2.getEmpty()) {
            rememberedValue13 = new ConstraintLayoutKt$ConstraintLayout$measurePolicy$2$1(mutableState4, measurer2, constraintSet, i14);
            composer.updateRememberedValue(rememberedValue13);
        }
        MeasurePolicy measurePolicy = (MeasurePolicy) rememberedValue13;
        if (constraintSet instanceof EditableJSONLayout) {
            ((EditableJSONLayout) constraintSet).setUpdateFlag(mutableLongState);
        }
        measurer2.addLayoutInformationReceiver(constraintSet instanceof LayoutInformationReceiver ? (LayoutInformationReceiver) constraintSet : null);
        if (!Float.isNaN(measurer2.getForcedScaleFactor())) {
            composer.startReplaceGroup(-1997256040);
            Modifier scale = ScaleKt.scale(modifier2, measurer2.getForcedScaleFactor());
            Modifier.Companion companion3 = Modifier.Companion;
            MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.getTopStart(), false);
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
            CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
            Modifier materializeModifier = ComposedModifierKt.materializeModifier(composer, companion3);
            ComposeUiNode.Companion companion4 = ComposeUiNode.Companion;
            x00.a<ComposeUiNode> constructor = companion4.getConstructor();
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
            Updater.m1958setimpl(m1951constructorimpl, maybeCachedBoxMeasurePolicy, companion4.getSetMeasurePolicy());
            Updater.m1958setimpl(m1951constructorimpl, currentCompositionLocalMap, companion4.getSetResolvedCompositionLocals());
            p<ComposeUiNode, Integer, g2> setCompositeKeyHash = companion4.getSetCompositeKeyHash();
            if (m1951constructorimpl.getInserting() || !g0.g(m1951constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                m1951constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                m1951constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m1958setimpl(m1951constructorimpl, materializeModifier, companion4.getSetModifier());
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            boolean changedInstance4 = composer.changedInstance(measurer2);
            Object rememberedValue14 = composer.rememberedValue();
            if (changedInstance4 || rememberedValue14 == companion2.getEmpty()) {
                rememberedValue14 = new ConstraintLayoutKt$ConstraintLayout$6$1$1(measurer2);
                composer.updateRememberedValue(rememberedValue14);
            }
            LayoutKt.MultiMeasureLayout(SemanticsModifierKt.semantics$default(scale, false, (x00.l) rememberedValue14, 1, null), ComposableLambdaKt.rememberComposableLambda(1131308473, true, new ConstraintLayoutKt$ConstraintLayout$6$2(pVar), composer, 54), measurePolicy, composer, 48, 0);
            composer.endNode();
            composer.endReplaceGroup();
        } else {
            composer.startReplaceGroup(-1996827620);
            boolean changedInstance5 = composer.changedInstance(measurer2);
            Object rememberedValue15 = composer.rememberedValue();
            if (changedInstance5 || rememberedValue15 == companion2.getEmpty()) {
                rememberedValue15 = new ConstraintLayoutKt$ConstraintLayout$7$1(measurer2);
                composer.updateRememberedValue(rememberedValue15);
            }
            LayoutKt.MultiMeasureLayout(SemanticsModifierKt.semantics$default(modifier2, false, (x00.l) rememberedValue15, 1, null), ComposableLambdaKt.rememberComposableLambda(-207512644, true, new ConstraintLayoutKt$ConstraintLayout$8(mutableState4, pVar), composer, 54), measurePolicy, composer, 48, 0);
            composer.endReplaceGroup();
        }
        composer.endReplaceGroup();
    }
}
