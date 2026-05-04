package androidx.compose.material;

import a00.r0;
import androidx.compose.animation.core.AnimateAsStateKt;
import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.animation.core.TweenSpec;
import androidx.compose.foundation.CanvasKt;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableInferredTarget;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Stable;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.saveable.RememberSaveableKt;
import androidx.compose.runtime.saveable.Saver;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.GraphicsLayerModifierKt;
import androidx.compose.ui.graphics.GraphicsLayerScope;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.input.nestedscroll.NestedScrollConnection;
import androidx.compose.ui.input.pointer.SuspendPointerInputElement;
import androidx.compose.ui.input.pointer.SuspendingPointerInputFilterKt$sam$androidx_compose_ui_input_pointer_PointerInputEventHandler$0;
import androidx.compose.ui.layout.LayoutModifierKt;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.layout.SubcomposeLayoutKt;
import androidx.compose.ui.layout.SubcomposeMeasureScope;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import m80.k;
import x00.a;
import x00.l;
import x00.p;
import x00.q;
import x00.r;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nBackdropScaffold.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BackdropScaffold.kt\nandroidx/compose/material/BackdropScaffoldKt\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 3 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 5 Color.kt\nandroidx/compose/ui/graphics/ColorKt\n+ 6 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 7 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 8 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 9 Composer.kt\nandroidx/compose/runtime/Updater\n+ 10 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 11 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,696:1\n1247#2,6:697\n1247#2,6:704\n1247#2,6:711\n1247#2,6:720\n1247#2,6:727\n1247#2,6:733\n1247#2,6:777\n1247#2,6:783\n1247#2,6:829\n1247#2,6:835\n1247#2,6:885\n75#3:703\n75#3:710\n75#3:717\n75#3:719\n75#3:739\n1#4:718\n696#5:726\n71#6:740\n67#6,7:741\n74#6:776\n71#6:789\n68#6,6:790\n74#6:824\n78#6:828\n71#6:841\n68#6,6:842\n74#6:876\n78#6:880\n78#6:884\n79#7,6:748\n86#7,4:763\n90#7,2:773\n79#7,6:796\n86#7,4:811\n90#7,2:821\n94#7:827\n79#7,6:848\n86#7,4:863\n90#7,2:873\n94#7:879\n94#7:883\n368#8,9:754\n377#8:775\n368#8,9:802\n377#8:823\n378#8,2:825\n368#8,9:854\n377#8:875\n378#8,2:877\n378#8,2:881\n4034#9,6:767\n4034#9,6:815\n4034#9,6:867\n85#10:891\n85#10:892\n149#11:893\n149#11:894\n149#11:895\n*S KotlinDebug\n*F\n+ 1 BackdropScaffold.kt\nandroidx/compose/material/BackdropScaffoldKt\n*L\n257#1:697,6\n271#1:704,6\n368#1:711,6\n388#1:720,6\n501#1:727,6\n505#1:733,6\n533#1:777,6\n540#1:783,6\n550#1:829,6\n557#1:835,6\n575#1:885,6\n259#1:703\n367#1:710\n370#1:717\n371#1:719\n529#1:739\n496#1:726\n531#1:740\n531#1:741,7\n531#1:776\n532#1:789\n532#1:790,6\n532#1:824\n532#1:828\n548#1:841\n548#1:842,6\n548#1:876\n548#1:880\n531#1:884\n531#1:748,6\n531#1:763,4\n531#1:773,2\n532#1:796,6\n532#1:811,4\n532#1:821,2\n532#1:827\n548#1:848,6\n548#1:863,4\n548#1:873,2\n548#1:879\n531#1:883\n531#1:754,9\n531#1:775\n532#1:802,9\n532#1:823\n532#1:825,2\n548#1:854,9\n548#1:875\n548#1:877,2\n531#1:881,2\n531#1:767,6\n532#1:815,6\n548#1:867,6\n498#1:891\n525#1:892\n636#1:893\n637#1:894\n638#1:895\n*E\n"})
/* loaded from: classes.dex */
public final class BackdropScaffoldKt {
    private static final float AnimationSlideOffset = Dp.m5115constructorimpl(20);
    private static final float VelocityThreshold = Dp.m5115constructorimpl(125);
    private static final float PositionalThreshold = Dp.m5115constructorimpl(56);

    /* JADX INFO: Access modifiers changed from: private */
    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    public static final void BackLayerTransition(final BackdropValue backdropValue, final p<? super Composer, ? super Integer, g2> pVar, final p<? super Composer, ? super Integer, g2> pVar2, Composer composer, final int i11) {
        int i12;
        Composer startRestartGroup = composer.startRestartGroup(-950970976);
        if ((i11 & 6) == 0) {
            i12 = (startRestartGroup.changed(backdropValue) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= startRestartGroup.changedInstance(pVar) ? 32 : 16;
        }
        if ((i11 & 384) == 0) {
            i12 |= startRestartGroup.changedInstance(pVar2) ? 256 : 128;
        }
        int i13 = i12;
        if (startRestartGroup.shouldExecute((i13 & 147) != 146, i13 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-950970976, i13, -1, "androidx.compose.material.BackLayerTransition (BackdropScaffold.kt:520)");
            }
            final State<Float> animateFloatAsState = AnimateAsStateKt.animateFloatAsState(backdropValue == BackdropValue.Revealed ? 0.0f : 2.0f, new TweenSpec(0, 0, null, 7, null), 0.0f, null, null, startRestartGroup, 48, 28);
            final float mo377toPx0680j_4 = ((Density) startRestartGroup.consume(CompositionLocalsKt.getLocalDensity())).mo377toPx0680j_4(AnimationSlideOffset);
            Modifier.Companion companion = Modifier.Companion;
            Alignment.Companion companion2 = Alignment.Companion;
            MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(companion2.getTopStart(), false);
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
            Modifier materializeModifier = ComposedModifierKt.materializeModifier(startRestartGroup, companion);
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
            boolean changed = startRestartGroup.changed(animateFloatAsState);
            Object rememberedValue = startRestartGroup.rememberedValue();
            if (changed || rememberedValue == Composer.Companion.getEmpty()) {
                rememberedValue = new q<MeasureScope, Measurable, Constraints, MeasureResult>() { // from class: androidx.compose.material.BackdropScaffoldKt$BackLayerTransition$1$1$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(3);
                    }

                    @Override // x00.q
                    public /* bridge */ /* synthetic */ MeasureResult invoke(MeasureScope measureScope, Measurable measurable, Constraints constraints) {
                        return m1540invoke3p2s80s(measureScope, measurable, constraints.m5074unboximpl());
                    }

                    /* renamed from: invoke-3p2s80s, reason: not valid java name */
                    public final MeasureResult m1540invoke3p2s80s(MeasureScope measureScope, Measurable measurable, long j11) {
                        float BackLayerTransition$lambda$10;
                        BackLayerTransition$lambda$10 = BackdropScaffoldKt.BackLayerTransition$lambda$10(animateFloatAsState);
                        final float f11 = BackLayerTransition$lambda$10 - 1;
                        if (f11 < 0.0f) {
                            f11 = 0.0f;
                        }
                        if (f11 > 1.0f) {
                            f11 = 1.0f;
                        }
                        final Placeable mo3857measureBRTryo0 = measurable.mo3857measureBRTryo0(j11);
                        return MeasureScope.layout$default(measureScope, mo3857measureBRTryo0.getWidth(), mo3857measureBRTryo0.getHeight(), null, new l<Placeable.PlacementScope, g2>() { // from class: androidx.compose.material.BackdropScaffoldKt$BackLayerTransition$1$1$1.1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(1);
                            }

                            @Override // x00.l
                            public /* bridge */ /* synthetic */ g2 invoke(Placeable.PlacementScope placementScope) {
                                invoke2(placementScope);
                                return g2.f100423a;
                            }

                            /* renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2(Placeable.PlacementScope placementScope) {
                                placementScope.place(Placeable.this, 0, 0, f11);
                            }
                        }, 4, null);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            Modifier layout = LayoutModifierKt.layout(companion, (q) rememberedValue);
            boolean changed2 = startRestartGroup.changed(animateFloatAsState) | startRestartGroup.changed(mo377toPx0680j_4);
            Object rememberedValue2 = startRestartGroup.rememberedValue();
            if (changed2 || rememberedValue2 == Composer.Companion.getEmpty()) {
                rememberedValue2 = new l<GraphicsLayerScope, g2>() { // from class: androidx.compose.material.BackdropScaffoldKt$BackLayerTransition$1$2$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
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
                        float BackLayerTransition$lambda$10;
                        BackLayerTransition$lambda$10 = BackdropScaffoldKt.BackLayerTransition$lambda$10(animateFloatAsState);
                        float f11 = 1;
                        float f12 = BackLayerTransition$lambda$10 - f11;
                        if (f12 < 0.0f) {
                            f12 = 0.0f;
                        }
                        if (f12 > 1.0f) {
                            f12 = 1.0f;
                        }
                        graphicsLayerScope.setAlpha(f12);
                        graphicsLayerScope.setTranslationY((f11 - f12) * mo377toPx0680j_4);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue2);
            }
            Modifier graphicsLayer = GraphicsLayerModifierKt.graphicsLayer(layout, (l) rememberedValue2);
            MeasurePolicy maybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(companion2.getTopStart(), false);
            int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap2 = startRestartGroup.getCurrentCompositionLocalMap();
            Modifier materializeModifier2 = ComposedModifierKt.materializeModifier(startRestartGroup, graphicsLayer);
            a<ComposeUiNode> constructor2 = companion3.getConstructor();
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
            Updater.m1958setimpl(m1951constructorimpl2, maybeCachedBoxMeasurePolicy2, companion3.getSetMeasurePolicy());
            Updater.m1958setimpl(m1951constructorimpl2, currentCompositionLocalMap2, companion3.getSetResolvedCompositionLocals());
            p<ComposeUiNode, Integer, g2> setCompositeKeyHash2 = companion3.getSetCompositeKeyHash();
            if (m1951constructorimpl2.getInserting() || !g0.g(m1951constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                m1951constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                m1951constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
            }
            Updater.m1958setimpl(m1951constructorimpl2, materializeModifier2, companion3.getSetModifier());
            pVar.invoke(startRestartGroup, Integer.valueOf((i13 >> 3) & 14));
            startRestartGroup.endNode();
            boolean changed3 = startRestartGroup.changed(animateFloatAsState);
            Object rememberedValue3 = startRestartGroup.rememberedValue();
            if (changed3 || rememberedValue3 == Composer.Companion.getEmpty()) {
                rememberedValue3 = new q<MeasureScope, Measurable, Constraints, MeasureResult>() { // from class: androidx.compose.material.BackdropScaffoldKt$BackLayerTransition$1$4$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(3);
                    }

                    @Override // x00.q
                    public /* bridge */ /* synthetic */ MeasureResult invoke(MeasureScope measureScope, Measurable measurable, Constraints constraints) {
                        return m1541invoke3p2s80s(measureScope, measurable, constraints.m5074unboximpl());
                    }

                    /* renamed from: invoke-3p2s80s, reason: not valid java name */
                    public final MeasureResult m1541invoke3p2s80s(MeasureScope measureScope, Measurable measurable, long j11) {
                        float BackLayerTransition$lambda$10;
                        BackLayerTransition$lambda$10 = BackdropScaffoldKt.BackLayerTransition$lambda$10(animateFloatAsState);
                        final float f11 = 1 - BackLayerTransition$lambda$10;
                        if (f11 < 0.0f) {
                            f11 = 0.0f;
                        }
                        if (f11 > 1.0f) {
                            f11 = 1.0f;
                        }
                        final Placeable mo3857measureBRTryo0 = measurable.mo3857measureBRTryo0(j11);
                        return MeasureScope.layout$default(measureScope, mo3857measureBRTryo0.getWidth(), mo3857measureBRTryo0.getHeight(), null, new l<Placeable.PlacementScope, g2>() { // from class: androidx.compose.material.BackdropScaffoldKt$BackLayerTransition$1$4$1.1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(1);
                            }

                            @Override // x00.l
                            public /* bridge */ /* synthetic */ g2 invoke(Placeable.PlacementScope placementScope) {
                                invoke2(placementScope);
                                return g2.f100423a;
                            }

                            /* renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2(Placeable.PlacementScope placementScope) {
                                placementScope.place(Placeable.this, 0, 0, f11);
                            }
                        }, 4, null);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue3);
            }
            Modifier layout2 = LayoutModifierKt.layout(companion, (q) rememberedValue3);
            boolean changed4 = startRestartGroup.changed(animateFloatAsState) | startRestartGroup.changed(mo377toPx0680j_4);
            Object rememberedValue4 = startRestartGroup.rememberedValue();
            if (changed4 || rememberedValue4 == Composer.Companion.getEmpty()) {
                rememberedValue4 = new l<GraphicsLayerScope, g2>() { // from class: androidx.compose.material.BackdropScaffoldKt$BackLayerTransition$1$5$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
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
                        float BackLayerTransition$lambda$10;
                        float f11 = 1;
                        BackLayerTransition$lambda$10 = BackdropScaffoldKt.BackLayerTransition$lambda$10(animateFloatAsState);
                        float f12 = f11 - BackLayerTransition$lambda$10;
                        if (f12 < 0.0f) {
                            f12 = 0.0f;
                        }
                        if (f12 > 1.0f) {
                            f12 = 1.0f;
                        }
                        graphicsLayerScope.setAlpha(f12);
                        graphicsLayerScope.setTranslationY((f11 - f12) * mo377toPx0680j_4);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue4);
            }
            Modifier graphicsLayer2 = GraphicsLayerModifierKt.graphicsLayer(layout2, (l) rememberedValue4);
            MeasurePolicy maybeCachedBoxMeasurePolicy3 = BoxKt.maybeCachedBoxMeasurePolicy(companion2.getTopStart(), false);
            int currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap3 = startRestartGroup.getCurrentCompositionLocalMap();
            Modifier materializeModifier3 = ComposedModifierKt.materializeModifier(startRestartGroup, graphicsLayer2);
            a<ComposeUiNode> constructor3 = companion3.getConstructor();
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
            Updater.m1958setimpl(m1951constructorimpl3, maybeCachedBoxMeasurePolicy3, companion3.getSetMeasurePolicy());
            Updater.m1958setimpl(m1951constructorimpl3, currentCompositionLocalMap3, companion3.getSetResolvedCompositionLocals());
            p<ComposeUiNode, Integer, g2> setCompositeKeyHash3 = companion3.getSetCompositeKeyHash();
            if (m1951constructorimpl3.getInserting() || !g0.g(m1951constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                m1951constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                m1951constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
            }
            Updater.m1958setimpl(m1951constructorimpl3, materializeModifier3, companion3.getSetModifier());
            pVar2.invoke(startRestartGroup, Integer.valueOf((i13 >> 6) & 14));
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
            endRestartGroup.updateScope(new p<Composer, Integer, g2>() { // from class: androidx.compose.material.BackdropScaffoldKt$BackLayerTransition$2
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
                    BackdropScaffoldKt.BackLayerTransition(BackdropValue.this, pVar, pVar2, composer2, RecomposeScopeImplKt.updateChangedFlags(i11 | 1));
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float BackLayerTransition$lambda$10(State<Float> state) {
        return state.getValue().floatValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x020b  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x022d  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0243  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x0519  */
    /* JADX WARN: Removed duplicated region for block: B:174:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:237:0x04f4  */
    /* JADX WARN: Removed duplicated region for block: B:240:0x021f  */
    /* JADX WARN: Removed duplicated region for block: B:242:0x0203  */
    /* JADX WARN: Removed duplicated region for block: B:244:0x01e9  */
    /* JADX WARN: Removed duplicated region for block: B:246:0x01ca  */
    /* JADX WARN: Removed duplicated region for block: B:249:0x01b0  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:251:0x0194  */
    /* JADX WARN: Removed duplicated region for block: B:254:0x0179  */
    /* JADX WARN: Removed duplicated region for block: B:255:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:263:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:272:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:275:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:276:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:283:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:292:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0161  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0180  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x019a  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x01b6  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x01d2  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x01ef  */
    @androidx.compose.runtime.Composable
    @androidx.compose.runtime.ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    /* renamed from: BackdropScaffold-0hNv9B8, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void m1537BackdropScaffold0hNv9B8(@m80.k final x00.p<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, yz.g2> r38, @m80.k final x00.p<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, yz.g2> r39, @m80.k final x00.p<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, yz.g2> r40, @m80.l androidx.compose.ui.Modifier r41, @m80.l androidx.compose.material.BackdropScaffoldState r42, @m80.l x00.q<? super androidx.compose.material.SnackbarHostState, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, yz.g2> r43, boolean r44, float r45, float r46, boolean r47, boolean r48, long r49, long r51, @m80.l androidx.compose.ui.graphics.Shape r53, float r54, long r55, long r57, long r59, @m80.l androidx.compose.runtime.Composer r61, final int r62, final int r63, final int r64) {
        /*
            Method dump skipped, instructions count: 1327
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.BackdropScaffoldKt.m1537BackdropScaffold0hNv9B8(x00.p, x00.p, x00.p, androidx.compose.ui.Modifier, androidx.compose.material.BackdropScaffoldState, x00.q, boolean, float, float, boolean, boolean, long, long, androidx.compose.ui.graphics.Shape, float, long, long, long, androidx.compose.runtime.Composer, int, int, int):void");
    }

    @Stable
    @k
    public static final BackdropScaffoldState BackdropScaffoldState(@k BackdropValue backdropValue, @k Density density, @k AnimationSpec<Float> animationSpec, @k l<? super BackdropValue, Boolean> lVar, @k SnackbarHostState snackbarHostState) {
        BackdropScaffoldState backdropScaffoldState = new BackdropScaffoldState(backdropValue, animationSpec, lVar, snackbarHostState);
        backdropScaffoldState.setDensity$material_release(density);
        return backdropScaffoldState;
    }

    public static /* synthetic */ BackdropScaffoldState BackdropScaffoldState$default(BackdropValue backdropValue, Density density, AnimationSpec animationSpec, l lVar, SnackbarHostState snackbarHostState, int i11, Object obj) {
        if ((i11 & 4) != 0) {
            animationSpec = BackdropScaffoldDefaults.INSTANCE.getAnimationSpec();
        }
        if ((i11 & 8) != 0) {
            lVar = new l<BackdropValue, Boolean>() { // from class: androidx.compose.material.BackdropScaffoldKt$BackdropScaffoldState$1
                @Override // x00.l
                public final Boolean invoke(BackdropValue backdropValue2) {
                    return Boolean.TRUE;
                }
            };
        }
        if ((i11 & 16) != 0) {
            snackbarHostState = new SnackbarHostState();
        }
        return BackdropScaffoldState(backdropValue, density, animationSpec, lVar, snackbarHostState);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[_][_]]")
    public static final void BackdropStack(final Modifier modifier, final p<? super Composer, ? super Integer, g2> pVar, final l<? super Constraints, Constraints> lVar, final r<? super Constraints, ? super Float, ? super Composer, ? super Integer, g2> rVar, Composer composer, final int i11) {
        int i12;
        Composer startRestartGroup = composer.startRestartGroup(-1248995194);
        if ((i11 & 6) == 0) {
            i12 = (startRestartGroup.changed(modifier) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= startRestartGroup.changedInstance(pVar) ? 32 : 16;
        }
        if ((i11 & 384) == 0) {
            i12 |= startRestartGroup.changedInstance(lVar) ? 256 : 128;
        }
        if ((i11 & 3072) == 0) {
            i12 |= startRestartGroup.changedInstance(rVar) ? 2048 : 1024;
        }
        if (startRestartGroup.shouldExecute((i12 & 1171) != 1170, i12 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1248995194, i12, -1, "androidx.compose.material.BackdropStack (BackdropScaffold.kt:573)");
            }
            boolean z11 = ((i12 & 112) == 32) | ((i12 & 896) == 256) | ((i12 & 7168) == 2048);
            Object rememberedValue = startRestartGroup.rememberedValue();
            if (z11 || rememberedValue == Composer.Companion.getEmpty()) {
                rememberedValue = new p<SubcomposeMeasureScope, Constraints, MeasureResult>() { // from class: androidx.compose.material.BackdropScaffoldKt$BackdropStack$1$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    @Override // x00.p
                    public /* bridge */ /* synthetic */ MeasureResult invoke(SubcomposeMeasureScope subcomposeMeasureScope, Constraints constraints) {
                        return m1545invoke0kLqBqw(subcomposeMeasureScope, constraints.m5074unboximpl());
                    }

                    /* renamed from: invoke-0kLqBqw, reason: not valid java name */
                    public final MeasureResult m1545invoke0kLqBqw(SubcomposeMeasureScope subcomposeMeasureScope, final long j11) {
                        final Placeable mo3857measureBRTryo0 = ((Measurable) r0.G2(subcomposeMeasureScope.subcompose(BackdropLayers.Back, pVar))).mo3857measureBRTryo0(lVar.invoke(Constraints.m5055boximpl(j11)).m5074unboximpl());
                        final float height = mo3857measureBRTryo0.getHeight();
                        BackdropLayers backdropLayers = BackdropLayers.Front;
                        final r<Constraints, Float, Composer, Integer, g2> rVar2 = rVar;
                        List<Measurable> subcompose = subcomposeMeasureScope.subcompose(backdropLayers, ComposableLambdaKt.composableLambdaInstance(-1222642649, true, new p<Composer, Integer, g2>() { // from class: androidx.compose.material.BackdropScaffoldKt$BackdropStack$1$1$placeables$1
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

                            @Composable
                            public final void invoke(Composer composer2, int i13) {
                                if (!composer2.shouldExecute((i13 & 3) != 2, i13 & 1)) {
                                    composer2.skipToGroupEnd();
                                    return;
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(-1222642649, i13, -1, "androidx.compose.material.BackdropStack.<anonymous>.<anonymous>.<anonymous> (BackdropScaffold.kt:583)");
                                }
                                rVar2.invoke(Constraints.m5055boximpl(j11), Float.valueOf(height), composer2, 0);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }
                        }));
                        final ArrayList arrayList = new ArrayList(subcompose.size());
                        int size = subcompose.size();
                        for (int i13 = 0; i13 < size; i13++) {
                            arrayList.add(subcompose.get(i13).mo3857measureBRTryo0(j11));
                        }
                        int max = Math.max(Constraints.m5070getMinWidthimpl(j11), mo3857measureBRTryo0.getWidth());
                        int max2 = Math.max(Constraints.m5069getMinHeightimpl(j11), mo3857measureBRTryo0.getHeight());
                        int size2 = arrayList.size();
                        int i14 = max2;
                        int i15 = max;
                        for (int i16 = 0; i16 < size2; i16++) {
                            Placeable placeable = (Placeable) arrayList.get(i16);
                            i15 = Math.max(i15, placeable.getWidth());
                            i14 = Math.max(i14, placeable.getHeight());
                        }
                        return MeasureScope.layout$default(subcomposeMeasureScope, i15, i14, null, new l<Placeable.PlacementScope, g2>() { // from class: androidx.compose.material.BackdropScaffoldKt$BackdropStack$1$1.2
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(1);
                            }

                            @Override // x00.l
                            public /* bridge */ /* synthetic */ g2 invoke(Placeable.PlacementScope placementScope) {
                                invoke2(placementScope);
                                return g2.f100423a;
                            }

                            /* renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2(Placeable.PlacementScope placementScope) {
                                Placeable.PlacementScope.placeRelative$default(placementScope, Placeable.this, 0, 0, 0.0f, 4, null);
                                List<Placeable> list = arrayList;
                                int size3 = list.size();
                                for (int i17 = 0; i17 < size3; i17++) {
                                    Placeable.PlacementScope.placeRelative$default(placementScope, list.get(i17), 0, 0, 0.0f, 4, null);
                                }
                            }
                        }, 4, null);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            SubcomposeLayoutKt.SubcomposeLayout(modifier, (p) rememberedValue, startRestartGroup, i12 & 14, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new p<Composer, Integer, g2>() { // from class: androidx.compose.material.BackdropScaffoldKt$BackdropStack$2
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

                public final void invoke(Composer composer2, int i13) {
                    BackdropScaffoldKt.BackdropStack(Modifier.this, pVar, lVar, rVar, composer2, RecomposeScopeImplKt.updateChangedFlags(i11 | 1));
                }
            });
        }
    }

    @k
    public static final NestedScrollConnection ConsumeSwipeNestedScrollConnection(@k AnchoredDraggableState<?> anchoredDraggableState, @k Orientation orientation) {
        return new BackdropScaffoldKt$ConsumeSwipeNestedScrollConnection$1(anchoredDraggableState, orientation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    /* renamed from: Scrim-3J-VO9M, reason: not valid java name */
    public static final void m1538Scrim3JVO9M(final long j11, final a<g2> aVar, final boolean z11, Composer composer, final int i11) {
        int i12;
        Modifier modifier;
        Composer startRestartGroup = composer.startRestartGroup(-92141505);
        if ((i11 & 6) == 0) {
            i12 = (startRestartGroup.changed(j11) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= startRestartGroup.changedInstance(aVar) ? 32 : 16;
        }
        if ((i11 & 384) == 0) {
            i12 |= startRestartGroup.changed(z11) ? 256 : 128;
        }
        if (startRestartGroup.shouldExecute((i12 & 147) != 146, i12 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-92141505, i12, -1, "androidx.compose.material.Scrim (BackdropScaffold.kt:494)");
            }
            if (j11 != 16) {
                startRestartGroup.startReplaceGroup(478794687);
                int i13 = i12;
                final State<Float> animateFloatAsState = AnimateAsStateKt.animateFloatAsState(z11 ? 1.0f : 0.0f, new TweenSpec(0, 0, null, 7, null), 0.0f, null, null, startRestartGroup, 48, 28);
                if (z11) {
                    startRestartGroup.startReplaceGroup(478960289);
                    Modifier.Companion companion = Modifier.Companion;
                    g2 g2Var = g2.f100423a;
                    boolean z12 = (i13 & 112) == 32;
                    Object rememberedValue = startRestartGroup.rememberedValue();
                    if (z12 || rememberedValue == Composer.Companion.getEmpty()) {
                        rememberedValue = new BackdropScaffoldKt$Scrim$dismissModifier$1$1(aVar, null);
                        startRestartGroup.updateRememberedValue(rememberedValue);
                    }
                    modifier = companion.then(new SuspendPointerInputElement(g2Var, null, null, new SuspendingPointerInputFilterKt$sam$androidx_compose_ui_input_pointer_PointerInputEventHandler$0((p) rememberedValue), 6, null));
                    startRestartGroup.endReplaceGroup();
                } else {
                    startRestartGroup.startReplaceGroup(479060698);
                    startRestartGroup.endReplaceGroup();
                    modifier = Modifier.Companion;
                }
                Modifier then = SizeKt.fillMaxSize$default(Modifier.Companion, 0.0f, 1, null).then(modifier);
                boolean changed = startRestartGroup.changed(animateFloatAsState) | ((i13 & 14) == 4);
                Object rememberedValue2 = startRestartGroup.rememberedValue();
                if (changed || rememberedValue2 == Composer.Companion.getEmpty()) {
                    rememberedValue2 = new l<DrawScope, g2>() { // from class: androidx.compose.material.BackdropScaffoldKt$Scrim$1$1
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
                            float Scrim_3J_VO9M$lambda$7;
                            long j12 = j11;
                            Scrim_3J_VO9M$lambda$7 = BackdropScaffoldKt.Scrim_3J_VO9M$lambda$7(animateFloatAsState);
                            DrawScope.m3054drawRectnJ9OG0$default(drawScope, j12, 0L, 0L, Scrim_3J_VO9M$lambda$7, null, null, 0, 118, null);
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue2);
                }
                CanvasKt.Canvas(then, (l) rememberedValue2, startRestartGroup, 0);
                startRestartGroup.endReplaceGroup();
            } else {
                startRestartGroup.startReplaceGroup(479228098);
                startRestartGroup.endReplaceGroup();
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new p<Composer, Integer, g2>() { // from class: androidx.compose.material.BackdropScaffoldKt$Scrim$2
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
                    BackdropScaffoldKt.m1538Scrim3JVO9M(j11, aVar, z11, composer2, RecomposeScopeImplKt.updateChangedFlags(i11 | 1));
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float Scrim_3J_VO9M$lambda$7(State<Float> state) {
        return state.getValue().floatValue();
    }

    @Composable
    @k
    public static final BackdropScaffoldState rememberBackdropScaffoldState(@k final BackdropValue backdropValue, @m80.l AnimationSpec<Float> animationSpec, @m80.l l<? super BackdropValue, Boolean> lVar, @m80.l SnackbarHostState snackbarHostState, @m80.l Composer composer, int i11, int i12) {
        if ((i12 & 2) != 0) {
            animationSpec = BackdropScaffoldDefaults.INSTANCE.getAnimationSpec();
        }
        final AnimationSpec<Float> animationSpec2 = animationSpec;
        if ((i12 & 4) != 0) {
            lVar = new l<BackdropValue, Boolean>() { // from class: androidx.compose.material.BackdropScaffoldKt$rememberBackdropScaffoldState$1
                @Override // x00.l
                public final Boolean invoke(BackdropValue backdropValue2) {
                    return Boolean.TRUE;
                }
            };
        }
        final l<? super BackdropValue, Boolean> lVar2 = lVar;
        if ((i12 & 8) != 0) {
            Object rememberedValue = composer.rememberedValue();
            if (rememberedValue == Composer.Companion.getEmpty()) {
                rememberedValue = new SnackbarHostState();
                composer.updateRememberedValue(rememberedValue);
            }
            snackbarHostState = (SnackbarHostState) rememberedValue;
        }
        final SnackbarHostState snackbarHostState2 = snackbarHostState;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-862178912, i11, -1, "androidx.compose.material.rememberBackdropScaffoldState (BackdropScaffold.kt:257)");
        }
        final Density density = (Density) composer.consume(CompositionLocalsKt.getLocalDensity());
        Object[] objArr = {animationSpec2, lVar2, snackbarHostState2};
        Saver<BackdropScaffoldState, ?> Saver = BackdropScaffoldState.Companion.Saver(animationSpec2, lVar2, snackbarHostState2, density);
        boolean changed = ((((i11 & 14) ^ 6) > 4 && composer.changed(backdropValue)) || (i11 & 6) == 4) | composer.changed(density) | composer.changedInstance(animationSpec2) | ((((i11 & 896) ^ 384) > 256 && composer.changed(lVar2)) || (i11 & 384) == 256) | ((((i11 & 7168) ^ 3072) > 2048 && composer.changed(snackbarHostState2)) || (i11 & 3072) == 2048);
        Object rememberedValue2 = composer.rememberedValue();
        if (changed || rememberedValue2 == Composer.Companion.getEmpty()) {
            Object obj = new a<BackdropScaffoldState>() { // from class: androidx.compose.material.BackdropScaffoldKt$rememberBackdropScaffoldState$3$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(0);
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // x00.a
                public final BackdropScaffoldState invoke() {
                    return BackdropScaffoldKt.BackdropScaffoldState(BackdropValue.this, density, animationSpec2, lVar2, snackbarHostState2);
                }
            };
            composer.updateRememberedValue(obj);
            rememberedValue2 = obj;
        }
        BackdropScaffoldState backdropScaffoldState = (BackdropScaffoldState) RememberSaveableKt.m2066rememberSaveable(objArr, (Saver) Saver, (String) null, (a) rememberedValue2, composer, 0, 4);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return backdropScaffoldState;
    }
}
