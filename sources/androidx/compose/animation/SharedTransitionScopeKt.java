package androidx.compose.animation;

import androidx.collection.MutableScatterMap;
import androidx.compose.animation.SharedTransitionScope;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.FiniteAnimationSpec;
import androidx.compose.animation.core.SpringSpec;
import androidx.compose.animation.core.VisibilityThresholdsKt;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableInferredTarget;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.DrawModifierKt;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.graphics.Path;
import androidx.compose.ui.graphics.drawscope.ContentDrawScope;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.layout.LayoutModifierKt;
import androidx.compose.ui.layout.LookaheadScope;
import androidx.compose.ui.layout.LookaheadScopeKt;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;
import c40.r0;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import m80.k;
import m80.l;
import x00.p;
import x00.q;
import x00.r;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nSharedTransitionScope.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SharedTransitionScope.kt\nandroidx/compose/animation/SharedTransitionScopeKt\n+ 2 ScatterMap.kt\nandroidx/collection/MutableScatterMap\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,1221:1\n683#2:1222\n683#2:1224\n1#3:1223\n1#3:1225\n*S KotlinDebug\n*F\n+ 1 SharedTransitionScope.kt\nandroidx/compose/animation/SharedTransitionScopeKt\n*L\n1180#1:1222\n1181#1:1224\n1180#1:1223\n1181#1:1225\n*E\n"})
/* loaded from: classes.dex */
public final class SharedTransitionScopeKt {
    public static final boolean VisualDebugging = false;

    @k
    private static final SpringSpec<Rect> DefaultSpring = AnimationSpecKt.spring$default(0.0f, 400.0f, VisibilityThresholdsKt.getVisibilityThreshold(Rect.Companion), 1, null);

    @k
    private static final SharedTransitionScope.OverlayClip ParentClip = new SharedTransitionScope.OverlayClip() { // from class: androidx.compose.animation.SharedTransitionScopeKt$ParentClip$1
        @Override // androidx.compose.animation.SharedTransitionScope.OverlayClip
        public Path getClipPath(SharedTransitionScope.SharedContentState sharedContentState, Rect rect, LayoutDirection layoutDirection, Density density) {
            SharedTransitionScope.SharedContentState parentSharedContentState = sharedContentState.getParentSharedContentState();
            if (parentSharedContentState != null) {
                return parentSharedContentState.getClipPathInOverlay();
            }
            return null;
        }
    };

    @k
    private static final p<LayoutDirection, Density, Path> DefaultClipInOverlayDuringTransition = new p() { // from class: androidx.compose.animation.SharedTransitionScopeKt$DefaultClipInOverlayDuringTransition$1
        @Override // x00.p
        public final Void invoke(LayoutDirection layoutDirection, Density density) {
            return null;
        }
    };

    @k
    private static final BoundsTransform DefaultBoundsTransform = new BoundsTransform() { // from class: androidx.compose.animation.c
        @Override // androidx.compose.animation.BoundsTransform
        public final FiniteAnimationSpec transform(Rect rect, Rect rect2) {
            FiniteAnimationSpec DefaultBoundsTransform$lambda$0;
            DefaultBoundsTransform$lambda$0 = SharedTransitionScopeKt.DefaultBoundsTransform$lambda$0(rect, rect2);
            return DefaultBoundsTransform$lambda$0;
        }
    };

    @k
    private static final MutableScatterMap<ContentScale, MutableScatterMap<Alignment, ScaleToBoundsImpl>> cachedScaleToBoundsImplMap = new MutableScatterMap<>(0, 1, null);

    /* JADX INFO: Access modifiers changed from: private */
    public static final FiniteAnimationSpec DefaultBoundsTransform$lambda$0(Rect rect, Rect rect2) {
        return DefaultSpring;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @ExperimentalSharedTransitionApi
    public static final ScaleToBoundsImpl ScaleToBoundsCached(ContentScale contentScale, Alignment alignment) {
        if (!getShouldCache(contentScale) || !getShouldCache(alignment)) {
            return new ScaleToBoundsImpl(contentScale, alignment);
        }
        MutableScatterMap<ContentScale, MutableScatterMap<Alignment, ScaleToBoundsImpl>> mutableScatterMap = cachedScaleToBoundsImplMap;
        MutableScatterMap<Alignment, ScaleToBoundsImpl> mutableScatterMap2 = mutableScatterMap.get(contentScale);
        if (mutableScatterMap2 == null) {
            mutableScatterMap2 = new MutableScatterMap<>(0, 1, null);
            mutableScatterMap.set(contentScale, mutableScatterMap2);
        }
        MutableScatterMap<Alignment, ScaleToBoundsImpl> mutableScatterMap3 = mutableScatterMap2;
        ScaleToBoundsImpl scaleToBoundsImpl = mutableScatterMap3.get(alignment);
        if (scaleToBoundsImpl == null) {
            scaleToBoundsImpl = new ScaleToBoundsImpl(contentScale, alignment);
            mutableScatterMap3.set(alignment, scaleToBoundsImpl);
        }
        return scaleToBoundsImpl;
    }

    @ExperimentalSharedTransitionApi
    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    public static final void SharedTransitionLayout(@l final Modifier modifier, @k final q<? super SharedTransitionScope, ? super Composer, ? super Integer, g2> qVar, @l Composer composer, final int i11, final int i12) {
        int i13;
        Composer startRestartGroup = composer.startRestartGroup(2043053727);
        int i14 = i12 & 1;
        if (i14 != 0) {
            i13 = i11 | 6;
        } else if ((i11 & 6) == 0) {
            i13 = (startRestartGroup.changed(modifier) ? 4 : 2) | i11;
        } else {
            i13 = i11;
        }
        if ((i12 & 2) != 0) {
            i13 |= 48;
        } else if ((i11 & 48) == 0) {
            i13 |= startRestartGroup.changedInstance(qVar) ? 32 : 16;
        }
        if (startRestartGroup.shouldExecute((i13 & 19) != 18, i13 & 1)) {
            if (i14 != 0) {
                modifier = Modifier.Companion;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(2043053727, i13, -1, "androidx.compose.animation.SharedTransitionLayout (SharedTransitionScope.kt:98)");
            }
            SharedTransitionScope(ComposableLambdaKt.rememberComposableLambda(-130587847, true, new r<SharedTransitionScope, Modifier, Composer, Integer, g2>() { // from class: androidx.compose.animation.SharedTransitionScopeKt$SharedTransitionLayout$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(4);
                }

                @Override // x00.r
                public /* bridge */ /* synthetic */ g2 invoke(SharedTransitionScope sharedTransitionScope, Modifier modifier2, Composer composer2, Integer num) {
                    invoke(sharedTransitionScope, modifier2, composer2, num.intValue());
                    return g2.f100423a;
                }

                @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                @Composable
                public final void invoke(SharedTransitionScope sharedTransitionScope, Modifier modifier2, Composer composer2, int i15) {
                    int i16;
                    if ((i15 & 6) == 0) {
                        i16 = (composer2.changed(sharedTransitionScope) ? 4 : 2) | i15;
                    } else {
                        i16 = i15;
                    }
                    if ((i15 & 48) == 0) {
                        i16 |= composer2.changed(modifier2) ? 32 : 16;
                    }
                    if (!composer2.shouldExecute((i16 & 147) != 146, i16 & 1)) {
                        composer2.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-130587847, i16, -1, "androidx.compose.animation.SharedTransitionLayout.<anonymous> (SharedTransitionScope.kt:102)");
                    }
                    Modifier then = Modifier.this.then(modifier2);
                    q<SharedTransitionScope, Composer, Integer, g2> qVar2 = qVar;
                    MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.getTopStart(), false);
                    int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                    CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                    Modifier materializeModifier = ComposedModifierKt.materializeModifier(composer2, then);
                    ComposeUiNode.Companion companion = ComposeUiNode.Companion;
                    x00.a<ComposeUiNode> constructor = companion.getConstructor();
                    if (composer2.getApplier() == null) {
                        ComposablesKt.invalidApplier();
                    }
                    composer2.startReusableNode();
                    if (composer2.getInserting()) {
                        composer2.createNode(constructor);
                    } else {
                        composer2.useNode();
                    }
                    Composer m1951constructorimpl = Updater.m1951constructorimpl(composer2);
                    Updater.m1958setimpl(m1951constructorimpl, maybeCachedBoxMeasurePolicy, companion.getSetMeasurePolicy());
                    Updater.m1958setimpl(m1951constructorimpl, currentCompositionLocalMap, companion.getSetResolvedCompositionLocals());
                    p<ComposeUiNode, Integer, g2> setCompositeKeyHash = companion.getSetCompositeKeyHash();
                    if (m1951constructorimpl.getInserting() || !g0.g(m1951constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                        m1951constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                        m1951constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                    }
                    Updater.m1958setimpl(m1951constructorimpl, materializeModifier, companion.getSetModifier());
                    BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                    qVar2.invoke(sharedTransitionScope, composer2, Integer.valueOf(i16 & 14));
                    composer2.endNode();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, startRestartGroup, 54), startRestartGroup, 6);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new p<Composer, Integer, g2>() { // from class: androidx.compose.animation.SharedTransitionScopeKt$SharedTransitionLayout$2
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

                public final void invoke(Composer composer2, int i15) {
                    SharedTransitionScopeKt.SharedTransitionLayout(Modifier.this, qVar, composer2, RecomposeScopeImplKt.updateChangedFlags(i11 | 1), i12);
                }
            });
        }
    }

    @ExperimentalSharedTransitionApi
    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    public static final void SharedTransitionScope(@k final r<? super SharedTransitionScope, ? super Modifier, ? super Composer, ? super Integer, g2> rVar, @l Composer composer, final int i11) {
        int i12;
        Composer startRestartGroup = composer.startRestartGroup(-2093217917);
        if ((i11 & 6) == 0) {
            i12 = (startRestartGroup.changedInstance(rVar) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if (startRestartGroup.shouldExecute((i12 & 3) != 2, i12 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-2093217917, i12, -1, "androidx.compose.animation.SharedTransitionScope (SharedTransitionScope.kt:121)");
            }
            LookaheadScopeKt.LookaheadScope(ComposableLambdaKt.rememberComposableLambda(-863967934, true, new q<LookaheadScope, Composer, Integer, g2>() { // from class: androidx.compose.animation.SharedTransitionScopeKt$SharedTransitionScope$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(3);
                }

                @Override // x00.q
                public /* bridge */ /* synthetic */ g2 invoke(LookaheadScope lookaheadScope, Composer composer2, Integer num) {
                    invoke(lookaheadScope, composer2, num.intValue());
                    return g2.f100423a;
                }

                @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                @Composable
                public final void invoke(LookaheadScope lookaheadScope, Composer composer2, int i13) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-863967934, i13, -1, "androidx.compose.animation.SharedTransitionScope.<anonymous> (SharedTransitionScope.kt:123)");
                    }
                    Object rememberedValue = composer2.rememberedValue();
                    Composer.Companion companion = Composer.Companion;
                    if (rememberedValue == companion.getEmpty()) {
                        rememberedValue = EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, composer2);
                        composer2.updateRememberedValue(rememberedValue);
                    }
                    r0 r0Var = (r0) rememberedValue;
                    Object rememberedValue2 = composer2.rememberedValue();
                    if (rememberedValue2 == companion.getEmpty()) {
                        rememberedValue2 = new SharedTransitionScopeImpl(lookaheadScope, r0Var);
                        composer2.updateRememberedValue(rememberedValue2);
                    }
                    final SharedTransitionScopeImpl sharedTransitionScopeImpl = (SharedTransitionScopeImpl) rememberedValue2;
                    r<SharedTransitionScope, Modifier, Composer, Integer, g2> rVar2 = rVar;
                    Modifier.Companion companion2 = Modifier.Companion;
                    Object rememberedValue3 = composer2.rememberedValue();
                    if (rememberedValue3 == companion.getEmpty()) {
                        rememberedValue3 = new q<MeasureScope, Measurable, Constraints, MeasureResult>() { // from class: androidx.compose.animation.SharedTransitionScopeKt$SharedTransitionScope$1$1$1
                            {
                                super(3);
                            }

                            @Override // x00.q
                            public /* bridge */ /* synthetic */ MeasureResult invoke(MeasureScope measureScope, Measurable measurable, Constraints constraints) {
                                return m110invoke3p2s80s(measureScope, measurable, constraints.m5074unboximpl());
                            }

                            /* renamed from: invoke-3p2s80s, reason: not valid java name */
                            public final MeasureResult m110invoke3p2s80s(final MeasureScope measureScope, Measurable measurable, long j11) {
                                final Placeable mo3857measureBRTryo0 = measurable.mo3857measureBRTryo0(j11);
                                int width = mo3857measureBRTryo0.getWidth();
                                int height = mo3857measureBRTryo0.getHeight();
                                final SharedTransitionScopeImpl sharedTransitionScopeImpl2 = SharedTransitionScopeImpl.this;
                                return MeasureScope.layout$default(measureScope, width, height, null, new x00.l<Placeable.PlacementScope, g2>() { // from class: androidx.compose.animation.SharedTransitionScopeKt$SharedTransitionScope$1$1$1.1
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
                                        LayoutCoordinates coordinates = placementScope.getCoordinates();
                                        if (coordinates != null) {
                                            if (MeasureScope.this.isLookingAhead()) {
                                                sharedTransitionScopeImpl2.setNullableLookaheadRoot$animation(coordinates);
                                            } else {
                                                sharedTransitionScopeImpl2.setRoot$animation(coordinates);
                                            }
                                        }
                                        Placeable.PlacementScope.place$default(placementScope, mo3857measureBRTryo0, 0, 0, 0.0f, 4, null);
                                    }
                                }, 4, null);
                            }
                        };
                        composer2.updateRememberedValue(rememberedValue3);
                    }
                    Modifier layout = LayoutModifierKt.layout(companion2, (q) rememberedValue3);
                    Object rememberedValue4 = composer2.rememberedValue();
                    if (rememberedValue4 == companion.getEmpty()) {
                        rememberedValue4 = new x00.l<ContentDrawScope, g2>() { // from class: androidx.compose.animation.SharedTransitionScopeKt$SharedTransitionScope$1$2$1
                            {
                                super(1);
                            }

                            @Override // x00.l
                            public /* bridge */ /* synthetic */ g2 invoke(ContentDrawScope contentDrawScope) {
                                invoke2(contentDrawScope);
                                return g2.f100423a;
                            }

                            /* renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2(ContentDrawScope contentDrawScope) {
                                contentDrawScope.drawContent();
                                SharedTransitionScopeImpl.this.drawInOverlay$animation(contentDrawScope);
                            }
                        };
                        composer2.updateRememberedValue(rememberedValue4);
                    }
                    rVar2.invoke(sharedTransitionScopeImpl, DrawModifierKt.drawWithContent(layout, (x00.l) rememberedValue4), composer2, 6);
                    g2 g2Var = g2.f100423a;
                    Object rememberedValue5 = composer2.rememberedValue();
                    if (rememberedValue5 == companion.getEmpty()) {
                        rememberedValue5 = new x00.l<DisposableEffectScope, DisposableEffectResult>() { // from class: androidx.compose.animation.SharedTransitionScopeKt$SharedTransitionScope$1$3$1
                            {
                                super(1);
                            }

                            @Override // x00.l
                            public final DisposableEffectResult invoke(DisposableEffectScope disposableEffectScope) {
                                final SharedTransitionScopeImpl sharedTransitionScopeImpl2 = SharedTransitionScopeImpl.this;
                                return new DisposableEffectResult() { // from class: androidx.compose.animation.SharedTransitionScopeKt$SharedTransitionScope$1$3$1$invoke$$inlined$onDispose$1
                                    @Override // androidx.compose.runtime.DisposableEffectResult
                                    public void dispose() {
                                        SharedTransitionScopeImpl.this.onDispose$animation();
                                    }
                                };
                            }
                        };
                        composer2.updateRememberedValue(rememberedValue5);
                    }
                    EffectsKt.DisposableEffect(g2Var, (x00.l<? super DisposableEffectScope, ? extends DisposableEffectResult>) rememberedValue5, composer2, 54);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, startRestartGroup, 54), startRestartGroup, 6);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new p<Composer, Integer, g2>() { // from class: androidx.compose.animation.SharedTransitionScopeKt$SharedTransitionScope$2
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
                    SharedTransitionScopeKt.SharedTransitionScope(rVar, composer2, RecomposeScopeImplKt.updateChangedFlags(i11 | 1));
                }
            });
        }
    }

    private static final boolean getShouldCache(Alignment alignment) {
        Alignment.Companion companion = Alignment.Companion;
        return alignment == companion.getTopStart() || alignment == companion.getTopCenter() || alignment == companion.getTopEnd() || alignment == companion.getCenterStart() || alignment == companion.getCenter() || alignment == companion.getCenterEnd() || alignment == companion.getBottomStart() || alignment == companion.getBottomCenter() || alignment == companion.getBottomEnd();
    }

    private static final boolean getShouldCache(ContentScale contentScale) {
        ContentScale.Companion companion = ContentScale.Companion;
        return contentScale == companion.getFillWidth() || contentScale == companion.getFillHeight() || contentScale == companion.getFillBounds() || contentScale == companion.getFit() || contentScale == companion.getCrop() || contentScale == companion.getNone() || contentScale == companion.getInside();
    }

    @ExperimentalSharedTransitionApi
    private static /* synthetic */ void getCachedScaleToBoundsImplMap$annotations() {
    }

    @ExperimentalSharedTransitionApi
    private static /* synthetic */ void getDefaultBoundsTransform$annotations() {
    }

    @ExperimentalSharedTransitionApi
    private static /* synthetic */ void getParentClip$annotations() {
    }
}
