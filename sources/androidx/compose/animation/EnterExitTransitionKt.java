package androidx.compose.animation;

import a00.k1;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.AnimationVector2D;
import androidx.compose.animation.core.FiniteAnimationSpec;
import androidx.compose.animation.core.SpringSpec;
import androidx.compose.animation.core.Transition;
import androidx.compose.animation.core.TwoWayConverter;
import androidx.compose.animation.core.VectorConvertersKt;
import androidx.compose.animation.core.VisibilityThresholdsKt;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.Stable;
import androidx.compose.runtime.State;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.GraphicsLayerModifierKt;
import androidx.compose.ui.graphics.GraphicsLayerScope;
import androidx.compose.ui.graphics.TransformOrigin;
import androidx.compose.ui.graphics.TransformOriginKt;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntSize;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import m80.k;
import x00.l;
import yz.g2;
import yz.h1;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nEnterExitTransition.kt\nKotlin\n*S Kotlin\n*F\n+ 1 EnterExitTransition.kt\nandroidx/compose/animation/EnterExitTransitionKt\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 3 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,1274:1\n1247#2,6:1275\n1247#2,6:1281\n1247#2,6:1287\n1247#2,6:1293\n1247#2,6:1299\n1247#2,6:1305\n1247#2,6:1311\n1247#2,6:1317\n1247#2,6:1323\n85#3:1329\n113#3,2:1330\n85#3:1332\n113#3,2:1333\n*S KotlinDebug\n*F\n+ 1 EnterExitTransition.kt\nandroidx/compose/animation/EnterExitTransitionKt\n*L\n871#1:1275,6\n877#1:1281,6\n884#1:1287,6\n893#1:1293,6\n914#1:1299,6\n934#1:1305,6\n969#1:1311,6\n977#1:1317,6\n989#1:1323,6\n914#1:1329\n914#1:1330,2\n934#1:1332\n934#1:1333,2\n*E\n"})
/* loaded from: classes.dex */
public final class EnterExitTransitionKt {

    @k
    private static final TwoWayConverter<TransformOrigin, AnimationVector2D> TransformOriginVectorConverter = VectorConvertersKt.TwoWayConverter(new l<TransformOrigin, AnimationVector2D>() { // from class: androidx.compose.animation.EnterExitTransitionKt$TransformOriginVectorConverter$1
        @Override // x00.l
        public /* bridge */ /* synthetic */ AnimationVector2D invoke(TransformOrigin transformOrigin) {
            return m80invoke__ExYCQ(transformOrigin.m2899unboximpl());
        }

        /* renamed from: invoke-__ExYCQ, reason: not valid java name */
        public final AnimationVector2D m80invoke__ExYCQ(long j11) {
            return new AnimationVector2D(TransformOrigin.m2895getPivotFractionXimpl(j11), TransformOrigin.m2896getPivotFractionYimpl(j11));
        }
    }, new l<AnimationVector2D, TransformOrigin>() { // from class: androidx.compose.animation.EnterExitTransitionKt$TransformOriginVectorConverter$2
        @Override // x00.l
        public /* bridge */ /* synthetic */ TransformOrigin invoke(AnimationVector2D animationVector2D) {
            return TransformOrigin.m2887boximpl(m81invokeLIALnN8(animationVector2D));
        }

        /* renamed from: invoke-LIALnN8, reason: not valid java name */
        public final long m81invokeLIALnN8(AnimationVector2D animationVector2D) {
            return TransformOriginKt.TransformOrigin(animationVector2D.getV1(), animationVector2D.getV2());
        }
    });

    @k
    private static final SpringSpec<Float> DefaultAlphaAndScaleSpring = AnimationSpecKt.spring$default(0.0f, 400.0f, null, 5, null);

    @k
    private static final SpringSpec<IntOffset> DefaultOffsetAnimationSpec = AnimationSpecKt.spring$default(0.0f, 400.0f, IntOffset.m5234boximpl(VisibilityThresholdsKt.getVisibilityThreshold(IntOffset.Companion)), 1, null);

    @k
    private static final SpringSpec<IntSize> DefaultSizeAnimationSpec = AnimationSpecKt.spring$default(0.0f, 400.0f, IntSize.m5278boximpl(VisibilityThresholdsKt.getVisibilityThreshold(IntSize.Companion)), 1, null);

    /* JADX WARN: Code restructure failed: missing block: B:30:0x0115, code lost:
    
        if (r3.changed(r1) == false) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0130, code lost:
    
        if (r3.changed(r2) == false) goto L51;
     */
    /* JADX WARN: Removed duplicated region for block: B:34:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x014b  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0163  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0182  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x013b  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0133  */
    @androidx.compose.runtime.Composable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static final androidx.compose.animation.GraphicsLayerBlockForEnterExit createGraphicsLayerBlock(final androidx.compose.animation.core.Transition<androidx.compose.animation.EnterExitState> r19, androidx.compose.animation.EnterTransition r20, androidx.compose.animation.ExitTransition r21, java.lang.String r22, androidx.compose.runtime.Composer r23, int r24) {
        /*
            Method dump skipped, instructions count: 390
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.animation.EnterExitTransitionKt.createGraphicsLayerBlock(androidx.compose.animation.core.Transition, androidx.compose.animation.EnterTransition, androidx.compose.animation.ExitTransition, java.lang.String, androidx.compose.runtime.Composer, int):androidx.compose.animation.GraphicsLayerBlockForEnterExit");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final l createGraphicsLayerBlock$lambda$13$lambda$12(Transition.DeferredAnimation deferredAnimation, Transition.DeferredAnimation deferredAnimation2, Transition transition, final EnterTransition enterTransition, final ExitTransition exitTransition, Transition.DeferredAnimation deferredAnimation3) {
        final TransformOrigin m2887boximpl;
        final State animate = deferredAnimation != null ? deferredAnimation.animate(new l<Transition.Segment<EnterExitState>, FiniteAnimationSpec<Float>>() { // from class: androidx.compose.animation.EnterExitTransitionKt$createGraphicsLayerBlock$1$1$alpha$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // x00.l
            public final FiniteAnimationSpec<Float> invoke(Transition.Segment<EnterExitState> segment) {
                SpringSpec springSpec;
                SpringSpec springSpec2;
                FiniteAnimationSpec<Float> animationSpec;
                SpringSpec springSpec3;
                FiniteAnimationSpec<Float> animationSpec2;
                EnterExitState enterExitState = EnterExitState.PreEnter;
                EnterExitState enterExitState2 = EnterExitState.Visible;
                if (segment.isTransitioningTo(enterExitState, enterExitState2)) {
                    Fade fade = EnterTransition.this.getData$animation().getFade();
                    if (fade != null && (animationSpec2 = fade.getAnimationSpec()) != null) {
                        return animationSpec2;
                    }
                    springSpec3 = EnterExitTransitionKt.DefaultAlphaAndScaleSpring;
                    return springSpec3;
                }
                if (!segment.isTransitioningTo(enterExitState2, EnterExitState.PostExit)) {
                    springSpec = EnterExitTransitionKt.DefaultAlphaAndScaleSpring;
                    return springSpec;
                }
                Fade fade2 = exitTransition.getData$animation().getFade();
                if (fade2 != null && (animationSpec = fade2.getAnimationSpec()) != null) {
                    return animationSpec;
                }
                springSpec2 = EnterExitTransitionKt.DefaultAlphaAndScaleSpring;
                return springSpec2;
            }
        }, new l<EnterExitState, Float>() { // from class: androidx.compose.animation.EnterExitTransitionKt$createGraphicsLayerBlock$1$1$alpha$2

            /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
            public /* synthetic */ class WhenMappings {
                public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                static {
                    int[] iArr = new int[EnterExitState.values().length];
                    try {
                        iArr[EnterExitState.Visible.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    try {
                        iArr[EnterExitState.PreEnter.ordinal()] = 2;
                    } catch (NoSuchFieldError unused2) {
                    }
                    try {
                        iArr[EnterExitState.PostExit.ordinal()] = 3;
                    } catch (NoSuchFieldError unused3) {
                    }
                    $EnumSwitchMapping$0 = iArr;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // x00.l
            public final Float invoke(EnterExitState enterExitState) {
                int i11 = WhenMappings.$EnumSwitchMapping$0[enterExitState.ordinal()];
                float f11 = 1.0f;
                if (i11 != 1) {
                    if (i11 == 2) {
                        Fade fade = EnterTransition.this.getData$animation().getFade();
                        if (fade != null) {
                            f11 = fade.getAlpha();
                        }
                    } else {
                        if (i11 != 3) {
                            throw new NoWhenBranchMatchedException();
                        }
                        Fade fade2 = exitTransition.getData$animation().getFade();
                        if (fade2 != null) {
                            f11 = fade2.getAlpha();
                        }
                    }
                }
                return Float.valueOf(f11);
            }
        }) : null;
        final State animate2 = deferredAnimation2 != null ? deferredAnimation2.animate(new l<Transition.Segment<EnterExitState>, FiniteAnimationSpec<Float>>() { // from class: androidx.compose.animation.EnterExitTransitionKt$createGraphicsLayerBlock$1$1$scale$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // x00.l
            public final FiniteAnimationSpec<Float> invoke(Transition.Segment<EnterExitState> segment) {
                SpringSpec springSpec;
                SpringSpec springSpec2;
                FiniteAnimationSpec<Float> animationSpec;
                SpringSpec springSpec3;
                FiniteAnimationSpec<Float> animationSpec2;
                EnterExitState enterExitState = EnterExitState.PreEnter;
                EnterExitState enterExitState2 = EnterExitState.Visible;
                if (segment.isTransitioningTo(enterExitState, enterExitState2)) {
                    Scale scale = EnterTransition.this.getData$animation().getScale();
                    if (scale != null && (animationSpec2 = scale.getAnimationSpec()) != null) {
                        return animationSpec2;
                    }
                    springSpec3 = EnterExitTransitionKt.DefaultAlphaAndScaleSpring;
                    return springSpec3;
                }
                if (!segment.isTransitioningTo(enterExitState2, EnterExitState.PostExit)) {
                    springSpec = EnterExitTransitionKt.DefaultAlphaAndScaleSpring;
                    return springSpec;
                }
                Scale scale2 = exitTransition.getData$animation().getScale();
                if (scale2 != null && (animationSpec = scale2.getAnimationSpec()) != null) {
                    return animationSpec;
                }
                springSpec2 = EnterExitTransitionKt.DefaultAlphaAndScaleSpring;
                return springSpec2;
            }
        }, new l<EnterExitState, Float>() { // from class: androidx.compose.animation.EnterExitTransitionKt$createGraphicsLayerBlock$1$1$scale$2

            /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
            public /* synthetic */ class WhenMappings {
                public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                static {
                    int[] iArr = new int[EnterExitState.values().length];
                    try {
                        iArr[EnterExitState.Visible.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    try {
                        iArr[EnterExitState.PreEnter.ordinal()] = 2;
                    } catch (NoSuchFieldError unused2) {
                    }
                    try {
                        iArr[EnterExitState.PostExit.ordinal()] = 3;
                    } catch (NoSuchFieldError unused3) {
                    }
                    $EnumSwitchMapping$0 = iArr;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // x00.l
            public final Float invoke(EnterExitState enterExitState) {
                int i11 = WhenMappings.$EnumSwitchMapping$0[enterExitState.ordinal()];
                float f11 = 1.0f;
                if (i11 != 1) {
                    if (i11 == 2) {
                        Scale scale = EnterTransition.this.getData$animation().getScale();
                        if (scale != null) {
                            f11 = scale.getScale();
                        }
                    } else {
                        if (i11 != 3) {
                            throw new NoWhenBranchMatchedException();
                        }
                        Scale scale2 = exitTransition.getData$animation().getScale();
                        if (scale2 != null) {
                            f11 = scale2.getScale();
                        }
                    }
                }
                return Float.valueOf(f11);
            }
        }) : null;
        if (transition.getCurrentState() == EnterExitState.PreEnter) {
            Scale scale = enterTransition.getData$animation().getScale();
            if (scale != null || (scale = exitTransition.getData$animation().getScale()) != null) {
                m2887boximpl = TransformOrigin.m2887boximpl(scale.m104getTransformOriginSzJe1aQ());
            }
            m2887boximpl = null;
        } else {
            Scale scale2 = exitTransition.getData$animation().getScale();
            if (scale2 != null || (scale2 = enterTransition.getData$animation().getScale()) != null) {
                m2887boximpl = TransformOrigin.m2887boximpl(scale2.m104getTransformOriginSzJe1aQ());
            }
            m2887boximpl = null;
        }
        final State animate3 = deferredAnimation3 != null ? deferredAnimation3.animate(new l<Transition.Segment<EnterExitState>, FiniteAnimationSpec<TransformOrigin>>() { // from class: androidx.compose.animation.EnterExitTransitionKt$createGraphicsLayerBlock$1$1$transformOrigin$1
            @Override // x00.l
            public final FiniteAnimationSpec<TransformOrigin> invoke(Transition.Segment<EnterExitState> segment) {
                return AnimationSpecKt.spring$default(0.0f, 0.0f, null, 7, null);
            }
        }, new l<EnterExitState, TransformOrigin>() { // from class: androidx.compose.animation.EnterExitTransitionKt$createGraphicsLayerBlock$1$1$transformOrigin$2

            /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
            public /* synthetic */ class WhenMappings {
                public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                static {
                    int[] iArr = new int[EnterExitState.values().length];
                    try {
                        iArr[EnterExitState.Visible.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    try {
                        iArr[EnterExitState.PreEnter.ordinal()] = 2;
                    } catch (NoSuchFieldError unused2) {
                    }
                    try {
                        iArr[EnterExitState.PostExit.ordinal()] = 3;
                    } catch (NoSuchFieldError unused3) {
                    }
                    $EnumSwitchMapping$0 = iArr;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // x00.l
            public /* bridge */ /* synthetic */ TransformOrigin invoke(EnterExitState enterExitState) {
                return TransformOrigin.m2887boximpl(m82invokeLIALnN8(enterExitState));
            }

            /* renamed from: invoke-LIALnN8, reason: not valid java name */
            public final long m82invokeLIALnN8(EnterExitState enterExitState) {
                TransformOrigin transformOrigin;
                int i11 = WhenMappings.$EnumSwitchMapping$0[enterExitState.ordinal()];
                if (i11 != 1) {
                    transformOrigin = null;
                    if (i11 == 2) {
                        Scale scale3 = enterTransition.getData$animation().getScale();
                        if (scale3 != null || (scale3 = exitTransition.getData$animation().getScale()) != null) {
                            transformOrigin = TransformOrigin.m2887boximpl(scale3.m104getTransformOriginSzJe1aQ());
                        }
                    } else {
                        if (i11 != 3) {
                            throw new NoWhenBranchMatchedException();
                        }
                        Scale scale4 = exitTransition.getData$animation().getScale();
                        if (scale4 != null || (scale4 = enterTransition.getData$animation().getScale()) != null) {
                            transformOrigin = TransformOrigin.m2887boximpl(scale4.m104getTransformOriginSzJe1aQ());
                        }
                    }
                } else {
                    transformOrigin = TransformOrigin.this;
                }
                return transformOrigin != null ? transformOrigin.m2899unboximpl() : TransformOrigin.Companion.m2900getCenterSzJe1aQ();
            }
        }) : null;
        return new l<GraphicsLayerScope, g2>() { // from class: androidx.compose.animation.EnterExitTransitionKt$createGraphicsLayerBlock$1$1$block$1
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
                State<Float> state = animate;
                graphicsLayerScope.setAlpha(state != null ? state.getValue().floatValue() : 1.0f);
                State<Float> state2 = animate2;
                graphicsLayerScope.setScaleX(state2 != null ? state2.getValue().floatValue() : 1.0f);
                State<Float> state3 = animate2;
                graphicsLayerScope.setScaleY(state3 != null ? state3.getValue().floatValue() : 1.0f);
                State<TransformOrigin> state4 = animate3;
                graphicsLayerScope.mo2701setTransformOrigin__ExYCQ(state4 != null ? state4.getValue().m2899unboximpl() : TransformOrigin.Companion.m2900getCenterSzJe1aQ());
            }
        };
    }

    @Composable
    @k
    public static final Modifier createModifier(@k Transition<EnterExitState> transition, @k EnterTransition enterTransition, @k ExitTransition exitTransition, @m80.l x00.a<Boolean> aVar, @k String str, @m80.l Composer composer, int i11, int i12) {
        Transition.DeferredAnimation deferredAnimation;
        Transition.DeferredAnimation deferredAnimation2;
        ChangeSize changeSize;
        final x00.a<Boolean> aVar2 = (i12 & 4) != 0 ? new x00.a<Boolean>() { // from class: androidx.compose.animation.EnterExitTransitionKt$createModifier$1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // x00.a
            public final Boolean invoke() {
                return Boolean.TRUE;
            }
        } : aVar;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(28261782, i11, -1, "androidx.compose.animation.createModifier (EnterExitTransition.kt:860)");
        }
        int i13 = i11 & 14;
        EnterTransition trackActiveEnter = trackActiveEnter(transition, enterTransition, composer, i11 & 126);
        int i14 = i11 >> 3;
        ExitTransition trackActiveExit = trackActiveExit(transition, exitTransition, composer, (i14 & 112) | i13);
        boolean z11 = true;
        boolean z12 = (trackActiveEnter.getData$animation().getSlide() == null && trackActiveExit.getData$animation().getSlide() == null) ? false : true;
        boolean z13 = (trackActiveEnter.getData$animation().getChangeSize() == null && trackActiveExit.getData$animation().getChangeSize() == null) ? false : true;
        Transition.DeferredAnimation deferredAnimation3 = null;
        if (z12) {
            composer.startReplaceGroup(-821159459);
            TwoWayConverter<IntOffset, AnimationVector2D> vectorConverter = VectorConvertersKt.getVectorConverter(IntOffset.Companion);
            Object rememberedValue = composer.rememberedValue();
            if (rememberedValue == Composer.Companion.getEmpty()) {
                rememberedValue = str + " slide";
                composer.updateRememberedValue(rememberedValue);
            }
            Transition.DeferredAnimation createDeferredAnimation = androidx.compose.animation.core.TransitionKt.createDeferredAnimation(transition, vectorConverter, (String) rememberedValue, composer, i13 | 384, 0);
            composer.endReplaceGroup();
            deferredAnimation = createDeferredAnimation;
        } else {
            composer.startReplaceGroup(-821053656);
            composer.endReplaceGroup();
            deferredAnimation = null;
        }
        if (z13) {
            composer.startReplaceGroup(-820961865);
            TwoWayConverter<IntSize, AnimationVector2D> vectorConverter2 = VectorConvertersKt.getVectorConverter(IntSize.Companion);
            Object rememberedValue2 = composer.rememberedValue();
            if (rememberedValue2 == Composer.Companion.getEmpty()) {
                rememberedValue2 = str + " shrink/expand";
                composer.updateRememberedValue(rememberedValue2);
            }
            Transition.DeferredAnimation createDeferredAnimation2 = androidx.compose.animation.core.TransitionKt.createDeferredAnimation(transition, vectorConverter2, (String) rememberedValue2, composer, i13 | 384, 0);
            composer.endReplaceGroup();
            deferredAnimation2 = createDeferredAnimation2;
        } else {
            composer.startReplaceGroup(-820851041);
            composer.endReplaceGroup();
            deferredAnimation2 = null;
        }
        if (z13) {
            composer.startReplaceGroup(-820777446);
            TwoWayConverter<IntOffset, AnimationVector2D> vectorConverter3 = VectorConvertersKt.getVectorConverter(IntOffset.Companion);
            Object rememberedValue3 = composer.rememberedValue();
            if (rememberedValue3 == Composer.Companion.getEmpty()) {
                rememberedValue3 = str + " InterruptionHandlingOffset";
                composer.updateRememberedValue(rememberedValue3);
            }
            deferredAnimation3 = androidx.compose.animation.core.TransitionKt.createDeferredAnimation(transition, vectorConverter3, (String) rememberedValue3, composer, i13 | 384, 0);
            composer.endReplaceGroup();
        } else {
            composer.startReplaceGroup(-820608001);
            composer.endReplaceGroup();
        }
        ChangeSize changeSize2 = trackActiveEnter.getData$animation().getChangeSize();
        final boolean z14 = ((changeSize2 == null || changeSize2.getClip()) && ((changeSize = trackActiveExit.getData$animation().getChangeSize()) == null || changeSize.getClip()) && z13) ? false : true;
        GraphicsLayerBlockForEnterExit createGraphicsLayerBlock = createGraphicsLayerBlock(transition, trackActiveEnter, trackActiveExit, str, composer, i13 | (i14 & 7168));
        Modifier.Companion companion = Modifier.Companion;
        boolean changed = composer.changed(z14);
        if ((((i11 & 7168) ^ 3072) <= 2048 || !composer.changed(aVar2)) && (i11 & 3072) != 2048) {
            z11 = false;
        }
        boolean z15 = changed | z11;
        Object rememberedValue4 = composer.rememberedValue();
        if (z15 || rememberedValue4 == Composer.Companion.getEmpty()) {
            rememberedValue4 = new l<GraphicsLayerScope, g2>() { // from class: androidx.compose.animation.EnterExitTransitionKt$createModifier$2$1
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
                    graphicsLayerScope.setClip(!z14 && aVar2.invoke().booleanValue());
                }
            };
            composer.updateRememberedValue(rememberedValue4);
        }
        Modifier then = GraphicsLayerModifierKt.graphicsLayer(companion, (l) rememberedValue4).then(new EnterExitTransitionElement(transition, deferredAnimation2, deferredAnimation3, deferredAnimation, trackActiveEnter, trackActiveExit, aVar2, createGraphicsLayerBlock));
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return then;
    }

    @Stable
    @k
    public static final EnterTransition expandHorizontally(@k FiniteAnimationSpec<IntSize> finiteAnimationSpec, @k Alignment.Horizontal horizontal, boolean z11, @k final l<? super Integer, Integer> lVar) {
        return expandIn(finiteAnimationSpec, toAlignment(horizontal), z11, new l<IntSize, IntSize>() { // from class: androidx.compose.animation.EnterExitTransitionKt$expandHorizontally$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(1);
            }

            @Override // x00.l
            public /* bridge */ /* synthetic */ IntSize invoke(IntSize intSize) {
                return IntSize.m5278boximpl(m83invokemzRDjE0(intSize.m5290unboximpl()));
            }

            /* renamed from: invoke-mzRDjE0, reason: not valid java name */
            public final long m83invokemzRDjE0(long j11) {
                return IntSize.m5281constructorimpl((((int) (j11 & 4294967295L)) & 4294967295L) | (lVar.invoke(Integer.valueOf((int) (j11 >> 32))).intValue() << 32));
            }
        });
    }

    public static /* synthetic */ EnterTransition expandHorizontally$default(FiniteAnimationSpec finiteAnimationSpec, Alignment.Horizontal horizontal, boolean z11, l lVar, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            finiteAnimationSpec = AnimationSpecKt.spring$default(0.0f, 400.0f, IntSize.m5278boximpl(VisibilityThresholdsKt.getVisibilityThreshold(IntSize.Companion)), 1, null);
        }
        if ((i11 & 2) != 0) {
            horizontal = Alignment.Companion.getEnd();
        }
        if ((i11 & 4) != 0) {
            z11 = true;
        }
        if ((i11 & 8) != 0) {
            lVar = new l<Integer, Integer>() { // from class: androidx.compose.animation.EnterExitTransitionKt$expandHorizontally$1
                public final Integer invoke(int i12) {
                    return 0;
                }

                @Override // x00.l
                public /* bridge */ /* synthetic */ Integer invoke(Integer num) {
                    return invoke(num.intValue());
                }
            };
        }
        return expandHorizontally(finiteAnimationSpec, horizontal, z11, lVar);
    }

    @Stable
    @k
    public static final EnterTransition expandIn(@k FiniteAnimationSpec<IntSize> finiteAnimationSpec, @k Alignment alignment, boolean z11, @k l<? super IntSize, IntSize> lVar) {
        return new EnterTransitionImpl(new TransitionData(null, null, new ChangeSize(alignment, lVar, finiteAnimationSpec, z11), null, false, null, 59, null));
    }

    public static /* synthetic */ EnterTransition expandIn$default(FiniteAnimationSpec finiteAnimationSpec, Alignment alignment, boolean z11, l lVar, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            finiteAnimationSpec = AnimationSpecKt.spring$default(0.0f, 400.0f, IntSize.m5278boximpl(VisibilityThresholdsKt.getVisibilityThreshold(IntSize.Companion)), 1, null);
        }
        if ((i11 & 2) != 0) {
            alignment = Alignment.Companion.getBottomEnd();
        }
        if ((i11 & 4) != 0) {
            z11 = true;
        }
        if ((i11 & 8) != 0) {
            lVar = new l<IntSize, IntSize>() { // from class: androidx.compose.animation.EnterExitTransitionKt$expandIn$1
                @Override // x00.l
                public /* bridge */ /* synthetic */ IntSize invoke(IntSize intSize) {
                    return IntSize.m5278boximpl(m84invokemzRDjE0(intSize.m5290unboximpl()));
                }

                /* renamed from: invoke-mzRDjE0, reason: not valid java name */
                public final long m84invokemzRDjE0(long j11) {
                    long j12 = 0;
                    return IntSize.m5281constructorimpl((j12 & 4294967295L) | (j12 << 32));
                }
            };
        }
        return expandIn(finiteAnimationSpec, alignment, z11, lVar);
    }

    @Stable
    @k
    public static final EnterTransition expandVertically(@k FiniteAnimationSpec<IntSize> finiteAnimationSpec, @k Alignment.Vertical vertical, boolean z11, @k final l<? super Integer, Integer> lVar) {
        return expandIn(finiteAnimationSpec, toAlignment(vertical), z11, new l<IntSize, IntSize>() { // from class: androidx.compose.animation.EnterExitTransitionKt$expandVertically$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(1);
            }

            @Override // x00.l
            public /* bridge */ /* synthetic */ IntSize invoke(IntSize intSize) {
                return IntSize.m5278boximpl(m85invokemzRDjE0(intSize.m5290unboximpl()));
            }

            /* renamed from: invoke-mzRDjE0, reason: not valid java name */
            public final long m85invokemzRDjE0(long j11) {
                return IntSize.m5281constructorimpl((lVar.invoke(Integer.valueOf((int) (j11 & 4294967295L))).intValue() & 4294967295L) | (((int) (j11 >> 32)) << 32));
            }
        });
    }

    public static /* synthetic */ EnterTransition expandVertically$default(FiniteAnimationSpec finiteAnimationSpec, Alignment.Vertical vertical, boolean z11, l lVar, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            finiteAnimationSpec = AnimationSpecKt.spring$default(0.0f, 400.0f, IntSize.m5278boximpl(VisibilityThresholdsKt.getVisibilityThreshold(IntSize.Companion)), 1, null);
        }
        if ((i11 & 2) != 0) {
            vertical = Alignment.Companion.getBottom();
        }
        if ((i11 & 4) != 0) {
            z11 = true;
        }
        if ((i11 & 8) != 0) {
            lVar = new l<Integer, Integer>() { // from class: androidx.compose.animation.EnterExitTransitionKt$expandVertically$1
                public final Integer invoke(int i12) {
                    return 0;
                }

                @Override // x00.l
                public /* bridge */ /* synthetic */ Integer invoke(Integer num) {
                    return invoke(num.intValue());
                }
            };
        }
        return expandVertically(finiteAnimationSpec, vertical, z11, lVar);
    }

    @Stable
    @k
    public static final EnterTransition fadeIn(@k FiniteAnimationSpec<Float> finiteAnimationSpec, float f11) {
        return new EnterTransitionImpl(new TransitionData(new Fade(f11, finiteAnimationSpec), null, null, null, false, null, 62, null));
    }

    public static /* synthetic */ EnterTransition fadeIn$default(FiniteAnimationSpec finiteAnimationSpec, float f11, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            finiteAnimationSpec = AnimationSpecKt.spring$default(0.0f, 400.0f, null, 5, null);
        }
        if ((i11 & 2) != 0) {
            f11 = 0.0f;
        }
        return fadeIn(finiteAnimationSpec, f11);
    }

    @Stable
    @k
    public static final ExitTransition fadeOut(@k FiniteAnimationSpec<Float> finiteAnimationSpec, float f11) {
        return new ExitTransitionImpl(new TransitionData(new Fade(f11, finiteAnimationSpec), null, null, null, false, null, 62, null));
    }

    public static /* synthetic */ ExitTransition fadeOut$default(FiniteAnimationSpec finiteAnimationSpec, float f11, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            finiteAnimationSpec = AnimationSpecKt.spring$default(0.0f, 400.0f, null, 5, null);
        }
        if ((i11 & 2) != 0) {
            f11 = 0.0f;
        }
        return fadeOut(finiteAnimationSpec, f11);
    }

    @m80.l
    public static final <T extends TransitionEffect> T get(@k EnterTransition enterTransition, @k TransitionEffectKey<T> transitionEffectKey) {
        TransitionEffect transitionEffect = enterTransition.getData$animation().getEffectsMap().get(transitionEffectKey);
        if (transitionEffect instanceof TransitionEffect) {
            return (T) transitionEffect;
        }
        return null;
    }

    @Stable
    @k
    /* renamed from: scaleIn-L8ZKh-E, reason: not valid java name */
    public static final EnterTransition m76scaleInL8ZKhE(@k FiniteAnimationSpec<Float> finiteAnimationSpec, float f11, long j11) {
        return new EnterTransitionImpl(new TransitionData(null, null, null, new Scale(f11, j11, finiteAnimationSpec, null), false, null, 55, null));
    }

    /* renamed from: scaleIn-L8ZKh-E$default, reason: not valid java name */
    public static /* synthetic */ EnterTransition m77scaleInL8ZKhE$default(FiniteAnimationSpec finiteAnimationSpec, float f11, long j11, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            finiteAnimationSpec = AnimationSpecKt.spring$default(0.0f, 400.0f, null, 5, null);
        }
        if ((i11 & 2) != 0) {
            f11 = 0.0f;
        }
        if ((i11 & 4) != 0) {
            j11 = TransformOrigin.Companion.m2900getCenterSzJe1aQ();
        }
        return m76scaleInL8ZKhE(finiteAnimationSpec, f11, j11);
    }

    @Stable
    @k
    /* renamed from: scaleOut-L8ZKh-E, reason: not valid java name */
    public static final ExitTransition m78scaleOutL8ZKhE(@k FiniteAnimationSpec<Float> finiteAnimationSpec, float f11, long j11) {
        return new ExitTransitionImpl(new TransitionData(null, null, null, new Scale(f11, j11, finiteAnimationSpec, null), false, null, 55, null));
    }

    /* renamed from: scaleOut-L8ZKh-E$default, reason: not valid java name */
    public static /* synthetic */ ExitTransition m79scaleOutL8ZKhE$default(FiniteAnimationSpec finiteAnimationSpec, float f11, long j11, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            finiteAnimationSpec = AnimationSpecKt.spring$default(0.0f, 400.0f, null, 5, null);
        }
        if ((i11 & 2) != 0) {
            f11 = 0.0f;
        }
        if ((i11 & 4) != 0) {
            j11 = TransformOrigin.Companion.m2900getCenterSzJe1aQ();
        }
        return m78scaleOutL8ZKhE(finiteAnimationSpec, f11, j11);
    }

    @Stable
    @k
    public static final ExitTransition shrinkHorizontally(@k FiniteAnimationSpec<IntSize> finiteAnimationSpec, @k Alignment.Horizontal horizontal, boolean z11, @k final l<? super Integer, Integer> lVar) {
        return shrinkOut(finiteAnimationSpec, toAlignment(horizontal), z11, new l<IntSize, IntSize>() { // from class: androidx.compose.animation.EnterExitTransitionKt$shrinkHorizontally$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(1);
            }

            @Override // x00.l
            public /* bridge */ /* synthetic */ IntSize invoke(IntSize intSize) {
                return IntSize.m5278boximpl(m86invokemzRDjE0(intSize.m5290unboximpl()));
            }

            /* renamed from: invoke-mzRDjE0, reason: not valid java name */
            public final long m86invokemzRDjE0(long j11) {
                return IntSize.m5281constructorimpl((((int) (j11 & 4294967295L)) & 4294967295L) | (lVar.invoke(Integer.valueOf((int) (j11 >> 32))).intValue() << 32));
            }
        });
    }

    public static /* synthetic */ ExitTransition shrinkHorizontally$default(FiniteAnimationSpec finiteAnimationSpec, Alignment.Horizontal horizontal, boolean z11, l lVar, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            finiteAnimationSpec = AnimationSpecKt.spring$default(0.0f, 400.0f, IntSize.m5278boximpl(VisibilityThresholdsKt.getVisibilityThreshold(IntSize.Companion)), 1, null);
        }
        if ((i11 & 2) != 0) {
            horizontal = Alignment.Companion.getEnd();
        }
        if ((i11 & 4) != 0) {
            z11 = true;
        }
        if ((i11 & 8) != 0) {
            lVar = new l<Integer, Integer>() { // from class: androidx.compose.animation.EnterExitTransitionKt$shrinkHorizontally$1
                public final Integer invoke(int i12) {
                    return 0;
                }

                @Override // x00.l
                public /* bridge */ /* synthetic */ Integer invoke(Integer num) {
                    return invoke(num.intValue());
                }
            };
        }
        return shrinkHorizontally(finiteAnimationSpec, horizontal, z11, lVar);
    }

    @Stable
    @k
    public static final ExitTransition shrinkOut(@k FiniteAnimationSpec<IntSize> finiteAnimationSpec, @k Alignment alignment, boolean z11, @k l<? super IntSize, IntSize> lVar) {
        return new ExitTransitionImpl(new TransitionData(null, null, new ChangeSize(alignment, lVar, finiteAnimationSpec, z11), null, false, null, 59, null));
    }

    public static /* synthetic */ ExitTransition shrinkOut$default(FiniteAnimationSpec finiteAnimationSpec, Alignment alignment, boolean z11, l lVar, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            finiteAnimationSpec = AnimationSpecKt.spring$default(0.0f, 400.0f, IntSize.m5278boximpl(VisibilityThresholdsKt.getVisibilityThreshold(IntSize.Companion)), 1, null);
        }
        if ((i11 & 2) != 0) {
            alignment = Alignment.Companion.getBottomEnd();
        }
        if ((i11 & 4) != 0) {
            z11 = true;
        }
        if ((i11 & 8) != 0) {
            lVar = new l<IntSize, IntSize>() { // from class: androidx.compose.animation.EnterExitTransitionKt$shrinkOut$1
                @Override // x00.l
                public /* bridge */ /* synthetic */ IntSize invoke(IntSize intSize) {
                    return IntSize.m5278boximpl(m87invokemzRDjE0(intSize.m5290unboximpl()));
                }

                /* renamed from: invoke-mzRDjE0, reason: not valid java name */
                public final long m87invokemzRDjE0(long j11) {
                    long j12 = 0;
                    return IntSize.m5281constructorimpl((j12 & 4294967295L) | (j12 << 32));
                }
            };
        }
        return shrinkOut(finiteAnimationSpec, alignment, z11, lVar);
    }

    @Stable
    @k
    public static final ExitTransition shrinkVertically(@k FiniteAnimationSpec<IntSize> finiteAnimationSpec, @k Alignment.Vertical vertical, boolean z11, @k final l<? super Integer, Integer> lVar) {
        return shrinkOut(finiteAnimationSpec, toAlignment(vertical), z11, new l<IntSize, IntSize>() { // from class: androidx.compose.animation.EnterExitTransitionKt$shrinkVertically$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(1);
            }

            @Override // x00.l
            public /* bridge */ /* synthetic */ IntSize invoke(IntSize intSize) {
                return IntSize.m5278boximpl(m88invokemzRDjE0(intSize.m5290unboximpl()));
            }

            /* renamed from: invoke-mzRDjE0, reason: not valid java name */
            public final long m88invokemzRDjE0(long j11) {
                return IntSize.m5281constructorimpl((lVar.invoke(Integer.valueOf((int) (j11 & 4294967295L))).intValue() & 4294967295L) | (((int) (j11 >> 32)) << 32));
            }
        });
    }

    public static /* synthetic */ ExitTransition shrinkVertically$default(FiniteAnimationSpec finiteAnimationSpec, Alignment.Vertical vertical, boolean z11, l lVar, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            finiteAnimationSpec = AnimationSpecKt.spring$default(0.0f, 400.0f, IntSize.m5278boximpl(VisibilityThresholdsKt.getVisibilityThreshold(IntSize.Companion)), 1, null);
        }
        if ((i11 & 2) != 0) {
            vertical = Alignment.Companion.getBottom();
        }
        if ((i11 & 4) != 0) {
            z11 = true;
        }
        if ((i11 & 8) != 0) {
            lVar = new l<Integer, Integer>() { // from class: androidx.compose.animation.EnterExitTransitionKt$shrinkVertically$1
                public final Integer invoke(int i12) {
                    return 0;
                }

                @Override // x00.l
                public /* bridge */ /* synthetic */ Integer invoke(Integer num) {
                    return invoke(num.intValue());
                }
            };
        }
        return shrinkVertically(finiteAnimationSpec, vertical, z11, lVar);
    }

    @Stable
    @k
    public static final EnterTransition slideIn(@k FiniteAnimationSpec<IntOffset> finiteAnimationSpec, @k l<? super IntSize, IntOffset> lVar) {
        return new EnterTransitionImpl(new TransitionData(null, new Slide(lVar, finiteAnimationSpec), null, null, false, null, 61, null));
    }

    public static /* synthetic */ EnterTransition slideIn$default(FiniteAnimationSpec finiteAnimationSpec, l lVar, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            finiteAnimationSpec = AnimationSpecKt.spring$default(0.0f, 400.0f, IntOffset.m5234boximpl(VisibilityThresholdsKt.getVisibilityThreshold(IntOffset.Companion)), 1, null);
        }
        return slideIn(finiteAnimationSpec, lVar);
    }

    @Stable
    @k
    public static final EnterTransition slideInHorizontally(@k FiniteAnimationSpec<IntOffset> finiteAnimationSpec, @k final l<? super Integer, Integer> lVar) {
        return slideIn(finiteAnimationSpec, new l<IntSize, IntOffset>() { // from class: androidx.compose.animation.EnterExitTransitionKt$slideInHorizontally$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(1);
            }

            @Override // x00.l
            public /* bridge */ /* synthetic */ IntOffset invoke(IntSize intSize) {
                return IntOffset.m5234boximpl(m89invokemHKZG7I(intSize.m5290unboximpl()));
            }

            /* renamed from: invoke-mHKZG7I, reason: not valid java name */
            public final long m89invokemHKZG7I(long j11) {
                return IntOffset.m5237constructorimpl((lVar.invoke(Integer.valueOf((int) (j11 >> 32))).intValue() << 32) | (0 & 4294967295L));
            }
        });
    }

    public static /* synthetic */ EnterTransition slideInHorizontally$default(FiniteAnimationSpec finiteAnimationSpec, l lVar, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            finiteAnimationSpec = AnimationSpecKt.spring$default(0.0f, 400.0f, IntOffset.m5234boximpl(VisibilityThresholdsKt.getVisibilityThreshold(IntOffset.Companion)), 1, null);
        }
        if ((i11 & 2) != 0) {
            lVar = new l<Integer, Integer>() { // from class: androidx.compose.animation.EnterExitTransitionKt$slideInHorizontally$1
                public final Integer invoke(int i12) {
                    return Integer.valueOf((-i12) / 2);
                }

                @Override // x00.l
                public /* bridge */ /* synthetic */ Integer invoke(Integer num) {
                    return invoke(num.intValue());
                }
            };
        }
        return slideInHorizontally(finiteAnimationSpec, lVar);
    }

    @Stable
    @k
    public static final EnterTransition slideInVertically(@k FiniteAnimationSpec<IntOffset> finiteAnimationSpec, @k final l<? super Integer, Integer> lVar) {
        return slideIn(finiteAnimationSpec, new l<IntSize, IntOffset>() { // from class: androidx.compose.animation.EnterExitTransitionKt$slideInVertically$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(1);
            }

            @Override // x00.l
            public /* bridge */ /* synthetic */ IntOffset invoke(IntSize intSize) {
                return IntOffset.m5234boximpl(m90invokemHKZG7I(intSize.m5290unboximpl()));
            }

            /* renamed from: invoke-mHKZG7I, reason: not valid java name */
            public final long m90invokemHKZG7I(long j11) {
                return IntOffset.m5237constructorimpl((lVar.invoke(Integer.valueOf((int) (j11 & 4294967295L))).intValue() & 4294967295L) | (0 << 32));
            }
        });
    }

    public static /* synthetic */ EnterTransition slideInVertically$default(FiniteAnimationSpec finiteAnimationSpec, l lVar, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            finiteAnimationSpec = AnimationSpecKt.spring$default(0.0f, 400.0f, IntOffset.m5234boximpl(VisibilityThresholdsKt.getVisibilityThreshold(IntOffset.Companion)), 1, null);
        }
        if ((i11 & 2) != 0) {
            lVar = new l<Integer, Integer>() { // from class: androidx.compose.animation.EnterExitTransitionKt$slideInVertically$1
                public final Integer invoke(int i12) {
                    return Integer.valueOf((-i12) / 2);
                }

                @Override // x00.l
                public /* bridge */ /* synthetic */ Integer invoke(Integer num) {
                    return invoke(num.intValue());
                }
            };
        }
        return slideInVertically(finiteAnimationSpec, lVar);
    }

    @Stable
    @k
    public static final ExitTransition slideOut(@k FiniteAnimationSpec<IntOffset> finiteAnimationSpec, @k l<? super IntSize, IntOffset> lVar) {
        return new ExitTransitionImpl(new TransitionData(null, new Slide(lVar, finiteAnimationSpec), null, null, false, null, 61, null));
    }

    public static /* synthetic */ ExitTransition slideOut$default(FiniteAnimationSpec finiteAnimationSpec, l lVar, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            finiteAnimationSpec = AnimationSpecKt.spring$default(0.0f, 400.0f, IntOffset.m5234boximpl(VisibilityThresholdsKt.getVisibilityThreshold(IntOffset.Companion)), 1, null);
        }
        return slideOut(finiteAnimationSpec, lVar);
    }

    @Stable
    @k
    public static final ExitTransition slideOutHorizontally(@k FiniteAnimationSpec<IntOffset> finiteAnimationSpec, @k final l<? super Integer, Integer> lVar) {
        return slideOut(finiteAnimationSpec, new l<IntSize, IntOffset>() { // from class: androidx.compose.animation.EnterExitTransitionKt$slideOutHorizontally$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(1);
            }

            @Override // x00.l
            public /* bridge */ /* synthetic */ IntOffset invoke(IntSize intSize) {
                return IntOffset.m5234boximpl(m91invokemHKZG7I(intSize.m5290unboximpl()));
            }

            /* renamed from: invoke-mHKZG7I, reason: not valid java name */
            public final long m91invokemHKZG7I(long j11) {
                return IntOffset.m5237constructorimpl((lVar.invoke(Integer.valueOf((int) (j11 >> 32))).intValue() << 32) | (0 & 4294967295L));
            }
        });
    }

    public static /* synthetic */ ExitTransition slideOutHorizontally$default(FiniteAnimationSpec finiteAnimationSpec, l lVar, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            finiteAnimationSpec = AnimationSpecKt.spring$default(0.0f, 400.0f, IntOffset.m5234boximpl(VisibilityThresholdsKt.getVisibilityThreshold(IntOffset.Companion)), 1, null);
        }
        if ((i11 & 2) != 0) {
            lVar = new l<Integer, Integer>() { // from class: androidx.compose.animation.EnterExitTransitionKt$slideOutHorizontally$1
                public final Integer invoke(int i12) {
                    return Integer.valueOf((-i12) / 2);
                }

                @Override // x00.l
                public /* bridge */ /* synthetic */ Integer invoke(Integer num) {
                    return invoke(num.intValue());
                }
            };
        }
        return slideOutHorizontally(finiteAnimationSpec, lVar);
    }

    @Stable
    @k
    public static final ExitTransition slideOutVertically(@k FiniteAnimationSpec<IntOffset> finiteAnimationSpec, @k final l<? super Integer, Integer> lVar) {
        return slideOut(finiteAnimationSpec, new l<IntSize, IntOffset>() { // from class: androidx.compose.animation.EnterExitTransitionKt$slideOutVertically$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(1);
            }

            @Override // x00.l
            public /* bridge */ /* synthetic */ IntOffset invoke(IntSize intSize) {
                return IntOffset.m5234boximpl(m92invokemHKZG7I(intSize.m5290unboximpl()));
            }

            /* renamed from: invoke-mHKZG7I, reason: not valid java name */
            public final long m92invokemHKZG7I(long j11) {
                return IntOffset.m5237constructorimpl((lVar.invoke(Integer.valueOf((int) (j11 & 4294967295L))).intValue() & 4294967295L) | (0 << 32));
            }
        });
    }

    public static /* synthetic */ ExitTransition slideOutVertically$default(FiniteAnimationSpec finiteAnimationSpec, l lVar, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            finiteAnimationSpec = AnimationSpecKt.spring$default(0.0f, 400.0f, IntOffset.m5234boximpl(VisibilityThresholdsKt.getVisibilityThreshold(IntOffset.Companion)), 1, null);
        }
        if ((i11 & 2) != 0) {
            lVar = new l<Integer, Integer>() { // from class: androidx.compose.animation.EnterExitTransitionKt$slideOutVertically$1
                public final Integer invoke(int i12) {
                    return Integer.valueOf((-i12) / 2);
                }

                @Override // x00.l
                public /* bridge */ /* synthetic */ Integer invoke(Integer num) {
                    return invoke(num.intValue());
                }
            };
        }
        return slideOutVertically(finiteAnimationSpec, lVar);
    }

    private static final Alignment toAlignment(Alignment.Horizontal horizontal) {
        Alignment.Companion companion = Alignment.Companion;
        return g0.g(horizontal, companion.getStart()) ? companion.getCenterStart() : g0.g(horizontal, companion.getEnd()) ? companion.getCenterEnd() : companion.getCenter();
    }

    @Composable
    @k
    public static final EnterTransition trackActiveEnter(@k Transition<EnterExitState> transition, @k EnterTransition enterTransition, @m80.l Composer composer, int i11) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(21614502, i11, -1, "androidx.compose.animation.trackActiveEnter (EnterExitTransition.kt:908)");
        }
        boolean z11 = (((i11 & 14) ^ 6) > 4 && composer.changed(transition)) || (i11 & 6) == 4;
        Object rememberedValue = composer.rememberedValue();
        if (z11 || rememberedValue == Composer.Companion.getEmpty()) {
            rememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(enterTransition, null, 2, null);
            composer.updateRememberedValue(rememberedValue);
        }
        MutableState mutableState = (MutableState) rememberedValue;
        if (transition.getCurrentState() == transition.getTargetState() && transition.getCurrentState() == EnterExitState.Visible) {
            if (transition.isSeeking()) {
                mutableState.setValue(enterTransition);
            } else {
                mutableState.setValue(EnterTransition.Companion.getNone());
            }
        } else if (transition.getTargetState() == EnterExitState.Visible) {
            mutableState.setValue(trackActiveEnter$lambda$5(mutableState).plus(enterTransition));
        }
        EnterTransition trackActiveEnter$lambda$5 = trackActiveEnter$lambda$5(mutableState);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return trackActiveEnter$lambda$5;
    }

    private static final EnterTransition trackActiveEnter$lambda$5(MutableState<EnterTransition> mutableState) {
        return mutableState.getValue();
    }

    @Composable
    @k
    public static final ExitTransition trackActiveExit(@k Transition<EnterExitState> transition, @k ExitTransition exitTransition, @m80.l Composer composer, int i11) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1363864804, i11, -1, "androidx.compose.animation.trackActiveExit (EnterExitTransition.kt:928)");
        }
        boolean z11 = (((i11 & 14) ^ 6) > 4 && composer.changed(transition)) || (i11 & 6) == 4;
        Object rememberedValue = composer.rememberedValue();
        if (z11 || rememberedValue == Composer.Companion.getEmpty()) {
            rememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(exitTransition, null, 2, null);
            composer.updateRememberedValue(rememberedValue);
        }
        MutableState mutableState = (MutableState) rememberedValue;
        if (transition.getCurrentState() == transition.getTargetState() && transition.getCurrentState() == EnterExitState.Visible) {
            if (transition.isSeeking()) {
                mutableState.setValue(exitTransition);
            } else {
                mutableState.setValue(ExitTransition.Companion.getNone());
            }
        } else if (transition.getTargetState() != EnterExitState.Visible) {
            mutableState.setValue(trackActiveExit$lambda$8(mutableState).plus(exitTransition));
        }
        ExitTransition trackActiveExit$lambda$8 = trackActiveExit$lambda$8(mutableState);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return trackActiveExit$lambda$8;
    }

    private static final ExitTransition trackActiveExit$lambda$8(MutableState<ExitTransition> mutableState) {
        return mutableState.getValue();
    }

    @k
    public static final EnterTransition withEffect(@k EnterTransition enterTransition, @k TransitionEffect transitionEffect) {
        return new EnterTransitionImpl(new TransitionData(null, null, null, null, false, k1.k(h1.a(transitionEffect.getKey$animation(), transitionEffect)), 31, null));
    }

    @m80.l
    public static final <T extends TransitionEffect> T get(@k ExitTransition exitTransition, @k TransitionEffectKey<T> transitionEffectKey) {
        TransitionEffect transitionEffect = exitTransition.getData$animation().getEffectsMap().get(transitionEffectKey);
        if (transitionEffect instanceof TransitionEffect) {
            return (T) transitionEffect;
        }
        return null;
    }

    @k
    public static final ExitTransition withEffect(@k ExitTransition exitTransition, @k TransitionEffect transitionEffect) {
        return new ExitTransitionImpl(new TransitionData(null, null, null, null, false, k1.k(h1.a(transitionEffect.getKey$animation(), transitionEffect)), 31, null));
    }

    private static final Alignment toAlignment(Alignment.Vertical vertical) {
        Alignment.Companion companion = Alignment.Companion;
        return g0.g(vertical, companion.getTop()) ? companion.getTopCenter() : g0.g(vertical, companion.getBottom()) ? companion.getBottomCenter() : companion.getCenter();
    }
}
