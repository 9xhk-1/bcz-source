package androidx.compose.foundation.gestures;

import a00.h0;
import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.animation.core.DecayAnimationSpec;
import androidx.compose.animation.core.DecayAnimationSpecKt;
import androidx.compose.animation.core.FloatDecayAnimationSpec;
import androidx.compose.animation.core.SuspendAnimationKt;
import androidx.compose.foundation.OverscrollEffect;
import androidx.compose.foundation.gestures.snapping.SnapFlingBehaviorKt;
import androidx.compose.foundation.gestures.snapping.SnapLayoutInfoProvider;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.input.pointer.PointerInputChange;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import g10.u;
import j00.c;
import kotlin.DeprecationLevel;
import kotlin.coroutines.intrinsics.b;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.u0;
import m80.k;
import x00.a;
import x00.l;
import x00.p;
import yz.g2;
import yz.n;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nAnchoredDraggable.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AnchoredDraggable.kt\nandroidx/compose/foundation/gestures/AnchoredDraggableKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,1753:1\n1749#1,4:1755\n1#2:1754\n113#3:1759\n*S KotlinDebug\n*F\n+ 1 AnchoredDraggable.kt\nandroidx/compose/foundation/gestures/AnchoredDraggableKt\n*L\n1313#1:1755,4\n1655#1:1759\n*E\n"})
/* loaded from: classes.dex */
public final class AnchoredDraggableKt {

    @k
    private static final String ConfigurationMovedToModifier = "This constructor of AnchoredDraggableState has been deprecated. Please pass thresholds and animation specs to anchoredDraggableFlingBehavior(..) instead, which can be passed to Modifier.anchoredDraggable.";

    @k
    private static final String ConfirmValueChangeDeprecated = "confirmValueChange is deprecated without replacement. Rather than relying on a callback to veto state changes, the anchor set should not include disallowed anchors. See androidx.compose.foundation.samples.AnchoredDraggableDynamicAnchorsSample for an example of using dynamic anchors over confirmValueChange.";
    private static final boolean DEBUG = false;

    @k
    private static final String SettleWithVelocityDeprecated = "settle does not accept a velocity anymore. Please use FlingBehavior#performFling instead. See AnchoredDraggableSamples.kt for example usages.";

    @k
    private static final String StartDragImmediatelyDeprecated = "startDragImmediately has been removed without replacement. Modifier.anchoredDraggable sets startDragImmediately to true by default when animations are running.";

    @k
    private static final l<PointerInputChange, Boolean> AlwaysDrag = new l<PointerInputChange, Boolean>() { // from class: androidx.compose.foundation.gestures.AnchoredDraggableKt$AlwaysDrag$1
        @Override // x00.l
        public final Boolean invoke(PointerInputChange pointerInputChange) {
            return Boolean.TRUE;
        }
    };

    @k
    private static final l<Integer, Float> GetOrNan = new l<Integer, Float>() { // from class: androidx.compose.foundation.gestures.AnchoredDraggableKt$GetOrNan$1
        public final Float invoke(int i11) {
            return Float.valueOf(Float.NaN);
        }

        @Override // x00.l
        public /* bridge */ /* synthetic */ Float invoke(Integer num) {
            return invoke(num.intValue());
        }
    };
    private static final float AnchoredDraggableMinFlingVelocity = Dp.m5115constructorimpl(125);

    @k
    private static final DecayAnimationSpec<Float> NoOpDecayAnimationSpec = DecayAnimationSpecKt.generateDecayAnimationSpec(new FloatDecayAnimationSpec() { // from class: androidx.compose.foundation.gestures.AnchoredDraggableKt$NoOpDecayAnimationSpec$1
        private final float absVelocityThreshold;

        @Override // androidx.compose.animation.core.FloatDecayAnimationSpec
        public float getAbsVelocityThreshold() {
            return this.absVelocityThreshold;
        }

        @Override // androidx.compose.animation.core.FloatDecayAnimationSpec
        public long getDurationNanos(float f11, float f12) {
            return 0L;
        }

        @Override // androidx.compose.animation.core.FloatDecayAnimationSpec
        public float getTargetValue(float f11, float f12) {
            return 0.0f;
        }

        @Override // androidx.compose.animation.core.FloatDecayAnimationSpec
        public float getValueFromNanos(long j11, float f11, float f12) {
            return 0.0f;
        }

        @Override // androidx.compose.animation.core.FloatDecayAnimationSpec
        public float getVelocityFromNanos(long j11, float f11, float f12) {
            return 0.0f;
        }
    });

    private static final <T> SnapLayoutInfoProvider AnchoredDraggableLayoutInfoProvider(final AnchoredDraggableState<T> anchoredDraggableState, final l<? super Float, Float> lVar, final a<Float> aVar) {
        return new SnapLayoutInfoProvider() { // from class: androidx.compose.foundation.gestures.AnchoredDraggableKt$AnchoredDraggableLayoutInfoProvider$1
            @Override // androidx.compose.foundation.gestures.snapping.SnapLayoutInfoProvider
            public float calculateApproachOffset(float f11, float f12) {
                return 0.0f;
            }

            @Override // androidx.compose.foundation.gestures.snapping.SnapLayoutInfoProvider
            public float calculateSnapOffset(float f11) {
                float requireOffset = anchoredDraggableState.requireOffset();
                return anchoredDraggableState.getAnchors().positionOf(AnchoredDraggableKt.computeTarget(anchoredDraggableState.getAnchors(), requireOffset, f11, lVar, aVar)) - requireOffset;
            }
        };
    }

    @n(level = DeprecationLevel.WARNING, message = ConfigurationMovedToModifier)
    @k
    public static final <T> AnchoredDraggableState<T> AnchoredDraggableState(T t11, @k l<? super Float, Float> lVar, @k a<Float> aVar, @k AnimationSpec<Float> animationSpec, @k DecayAnimationSpec<Float> decayAnimationSpec, @k l<? super T, Boolean> lVar2) {
        AnchoredDraggableState<T> anchoredDraggableState = new AnchoredDraggableState<>(t11, lVar2);
        anchoredDraggableState.setPositionalThreshold$foundation_release(lVar);
        anchoredDraggableState.setVelocityThreshold$foundation_release(aVar);
        anchoredDraggableState.setSnapAnimationSpec$foundation_release(animationSpec);
        anchoredDraggableState.setDecayAnimationSpec$foundation_release(decayAnimationSpec);
        return anchoredDraggableState;
    }

    public static /* synthetic */ AnchoredDraggableState AnchoredDraggableState$default(Object obj, l lVar, a aVar, AnimationSpec animationSpec, DecayAnimationSpec decayAnimationSpec, l lVar2, int i11, Object obj2) {
        if ((i11 & 32) != 0) {
            lVar2 = new l<Object, Boolean>() { // from class: androidx.compose.foundation.gestures.AnchoredDraggableKt$AnchoredDraggableState$1
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // x00.l
                public final Boolean invoke(Object obj3) {
                    return Boolean.TRUE;
                }
            };
        }
        return AnchoredDraggableState(obj, lVar, aVar, animationSpec, decayAnimationSpec, lVar2);
    }

    @k
    public static final <T> DraggableAnchors<T> DraggableAnchors(@k l<? super DraggableAnchorsConfig<T>, g2> lVar) {
        DraggableAnchorsConfig draggableAnchorsConfig = new DraggableAnchorsConfig();
        lVar.invoke(draggableAnchorsConfig);
        return new DefaultDraggableAnchors(draggableAnchorsConfig.buildKeys$foundation_release(), draggableAnchorsConfig.buildPositions$foundation_release());
    }

    @k
    public static final <T> Modifier anchoredDraggable(@k Modifier modifier, @k AnchoredDraggableState<T> anchoredDraggableState, boolean z11, @k Orientation orientation, boolean z12, @m80.l MutableInteractionSource mutableInteractionSource, @m80.l OverscrollEffect overscrollEffect, @m80.l FlingBehavior flingBehavior) {
        return modifier.then(new AnchoredDraggableElement(anchoredDraggableState, orientation, z12, Boolean.valueOf(z11), mutableInteractionSource, null, overscrollEffect, flingBehavior, 32, null));
    }

    public static /* synthetic */ Modifier anchoredDraggable$default(Modifier modifier, AnchoredDraggableState anchoredDraggableState, boolean z11, Orientation orientation, boolean z12, MutableInteractionSource mutableInteractionSource, OverscrollEffect overscrollEffect, FlingBehavior flingBehavior, int i11, Object obj) {
        FlingBehavior flingBehavior2;
        Modifier modifier2;
        AnchoredDraggableState anchoredDraggableState2;
        boolean z13;
        Orientation orientation2;
        if ((i11 & 8) != 0) {
            z12 = true;
        }
        boolean z14 = z12;
        MutableInteractionSource mutableInteractionSource2 = (i11 & 16) != 0 ? null : mutableInteractionSource;
        OverscrollEffect overscrollEffect2 = (i11 & 32) != 0 ? null : overscrollEffect;
        if ((i11 & 64) != 0) {
            flingBehavior2 = null;
            anchoredDraggableState2 = anchoredDraggableState;
            z13 = z11;
            orientation2 = orientation;
            modifier2 = modifier;
        } else {
            flingBehavior2 = flingBehavior;
            modifier2 = modifier;
            anchoredDraggableState2 = anchoredDraggableState;
            z13 = z11;
            orientation2 = orientation;
        }
        return anchoredDraggable(modifier2, anchoredDraggableState2, z13, orientation2, z14, mutableInteractionSource2, overscrollEffect2, flingBehavior2);
    }

    @k
    public static final <T> TargetedFlingBehavior anchoredDraggableFlingBehavior(@k AnchoredDraggableState<T> anchoredDraggableState, @k final Density density, @k l<? super Float, Float> lVar, @k AnimationSpec<Float> animationSpec) {
        return SnapFlingBehaviorKt.snapFlingBehavior(AnchoredDraggableLayoutInfoProvider(anchoredDraggableState, lVar, new a<Float>() { // from class: androidx.compose.foundation.gestures.AnchoredDraggableKt$anchoredDraggableFlingBehavior$1
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // x00.a
            public final Float invoke() {
                return Float.valueOf(Density.this.mo377toPx0680j_4(Dp.m5115constructorimpl(125)));
            }
        }), NoOpDecayAnimationSpec, animationSpec);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final <T> Object animateTo(AnchoredDraggableState<T> anchoredDraggableState, float f11, final AnchoredDragScope anchoredDragScope, DraggableAnchors<T> draggableAnchors, T t11, AnimationSpec<Float> animationSpec, c<? super g2> cVar) {
        Object animate;
        float positionOf = draggableAnchors.positionOf(t11);
        final Ref.FloatRef floatRef = new Ref.FloatRef();
        floatRef.element = Float.isNaN(anchoredDraggableState.getOffset()) ? 0.0f : anchoredDraggableState.getOffset();
        if (!Float.isNaN(positionOf)) {
            float f12 = floatRef.element;
            if (f12 != positionOf && (animate = SuspendAnimationKt.animate(f12, positionOf, f11, animationSpec, new p<Float, Float, g2>() { // from class: androidx.compose.foundation.gestures.AnchoredDraggableKt$animateTo$2$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // x00.p
                public /* bridge */ /* synthetic */ g2 invoke(Float f13, Float f14) {
                    invoke(f13.floatValue(), f14.floatValue());
                    return g2.f100423a;
                }

                public final void invoke(float f13, float f14) {
                    AnchoredDragScope.this.dragTo(f13, f14);
                    floatRef.element = f13;
                }
            }, cVar)) == b.l()) {
                return animate;
            }
        }
        return g2.f100423a;
    }

    public static /* synthetic */ Object animateTo$default(AnchoredDraggableState anchoredDraggableState, Object obj, AnimationSpec animationSpec, c cVar, int i11, Object obj2) {
        if ((i11 & 2) != 0) {
            animationSpec = anchoredDraggableState.getUsePreModifierChangeBehavior$foundation_release() ? anchoredDraggableState.getSnapAnimationSpec() : AnchoredDraggableDefaults.INSTANCE.getSnapAnimationSpec();
        }
        return animateTo(anchoredDraggableState, obj, animationSpec, cVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0025  */
    @m80.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final <T> java.lang.Object animateToWithDecay(@m80.k androidx.compose.foundation.gestures.AnchoredDraggableState<T> r10, T r11, float r12, @m80.k androidx.compose.animation.core.AnimationSpec<java.lang.Float> r13, @m80.k androidx.compose.animation.core.DecayAnimationSpec<java.lang.Float> r14, @m80.k j00.c<? super java.lang.Float> r15) {
        /*
            boolean r1 = r15 instanceof androidx.compose.foundation.gestures.AnchoredDraggableKt$animateToWithDecay$1
            if (r1 == 0) goto L14
            r1 = r15
            androidx.compose.foundation.gestures.AnchoredDraggableKt$animateToWithDecay$1 r1 = (androidx.compose.foundation.gestures.AnchoredDraggableKt$animateToWithDecay$1) r1
            int r3 = r1.label
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L14
            int r3 = r3 - r4
            r1.label = r3
        L12:
            r7 = r1
            goto L1a
        L14:
            androidx.compose.foundation.gestures.AnchoredDraggableKt$animateToWithDecay$1 r1 = new androidx.compose.foundation.gestures.AnchoredDraggableKt$animateToWithDecay$1
            r1.<init>(r15)
            goto L12
        L1a:
            java.lang.Object r0 = r7.result
            java.lang.Object r9 = kotlin.coroutines.intrinsics.b.l()
            int r1 = r7.label
            r8 = 1
            if (r1 == 0) goto L39
            if (r1 != r8) goto L31
            float r1 = r7.F$0
            java.lang.Object r2 = r7.L$0
            kotlin.jvm.internal.Ref$FloatRef r2 = (kotlin.jvm.internal.Ref.FloatRef) r2
            kotlin.e.n(r0)
            goto L64
        L31:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L39:
            kotlin.e.n(r0)
            kotlin.jvm.internal.Ref$FloatRef r4 = new kotlin.jvm.internal.Ref$FloatRef
            r4.<init>()
            r4.element = r12
            androidx.compose.foundation.gestures.AnchoredDraggableKt$animateToWithDecay$2 r0 = new androidx.compose.foundation.gestures.AnchoredDraggableKt$animateToWithDecay$2
            r6 = 0
            r1 = r10
            r2 = r12
            r3 = r13
            r5 = r14
            r0.<init>(r1, r2, r3, r4, r5, r6)
            r5 = r0
            r0 = r4
            r7.L$0 = r0
            r7.F$0 = r12
            r7.label = r8
            r4 = 0
            r6 = r7
            r7 = 2
            r8 = 0
            r2 = r10
            r3 = r11
            java.lang.Object r2 = androidx.compose.foundation.gestures.AnchoredDraggableState.anchoredDrag$default(r2, r3, r4, r5, r6, r7, r8)
            if (r2 != r9) goto L62
            return r9
        L62:
            r1 = r12
            r2 = r0
        L64:
            float r0 = r2.element
            float r1 = r1 - r0
            java.lang.Float r0 = l00.a.e(r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.AnchoredDraggableKt.animateToWithDecay(androidx.compose.foundation.gestures.AnchoredDraggableState, java.lang.Object, float, androidx.compose.animation.core.AnimationSpec, androidx.compose.animation.core.DecayAnimationSpec, j00.c):java.lang.Object");
    }

    public static /* synthetic */ Object animateToWithDecay$default(AnchoredDraggableState anchoredDraggableState, Object obj, float f11, AnimationSpec animationSpec, DecayAnimationSpec decayAnimationSpec, c cVar, int i11, Object obj2) {
        if ((i11 & 4) != 0) {
            animationSpec = anchoredDraggableState.getUsePreModifierChangeBehavior$foundation_release() ? anchoredDraggableState.getSnapAnimationSpec() : AnchoredDraggableDefaults.INSTANCE.getSnapAnimationSpec();
        }
        AnimationSpec animationSpec2 = animationSpec;
        if ((i11 & 8) != 0) {
            decayAnimationSpec = anchoredDraggableState.getUsePreModifierChangeBehavior$foundation_release() ? anchoredDraggableState.getDecayAnimationSpec() : AnchoredDraggableDefaults.INSTANCE.getDecayAnimationSpec();
        }
        return animateToWithDecay(anchoredDraggableState, obj, f11, animationSpec2, decayAnimationSpec, cVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float coerceToTarget(float f11, float f12) {
        if (f12 == 0.0f) {
            return 0.0f;
        }
        return f12 > 0.0f ? u.A(f11, f12) : u.t(f11, f12);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:26:0x008a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x008b A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final <T> T computeTarget(androidx.compose.foundation.gestures.DraggableAnchors<T> r5, float r6, float r7, x00.l<? super java.lang.Float, java.lang.Float> r8, x00.a<java.lang.Float> r9) {
        /*
            boolean r0 = java.lang.Float.isNaN(r6)
            if (r0 != 0) goto L92
            float r0 = java.lang.Math.abs(r7)
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            r2 = 0
            r3 = 1
            if (r0 <= 0) goto L13
            r0 = r3
            goto L14
        L13:
            r0 = r2
        L14:
            if (r0 == 0) goto L1c
            int r1 = (r7 > r1 ? 1 : (r7 == r1 ? 0 : -1))
            if (r1 <= 0) goto L1c
            r1 = r3
            goto L1d
        L1c:
            r1 = r2
        L1d:
            if (r0 != 0) goto L27
            java.lang.Object r5 = r5.closestAnchor(r6)
            kotlin.jvm.internal.g0.m(r5)
            return r5
        L27:
            float r7 = java.lang.Math.abs(r7)
            java.lang.Object r9 = r9.invoke()
            java.lang.Number r9 = (java.lang.Number) r9
            float r9 = r9.floatValue()
            float r9 = java.lang.Math.abs(r9)
            int r7 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r7 < 0) goto L45
            java.lang.Object r5 = r5.closestAnchor(r6, r1)
            kotlin.jvm.internal.g0.m(r5)
            return r5
        L45:
            java.lang.Object r7 = r5.closestAnchor(r6, r2)
            kotlin.jvm.internal.g0.m(r7)
            float r9 = r5.positionOf(r7)
            java.lang.Object r0 = r5.closestAnchor(r6, r3)
            kotlin.jvm.internal.g0.m(r0)
            float r5 = r5.positionOf(r0)
            float r4 = r9 - r5
            float r4 = java.lang.Math.abs(r4)
            java.lang.Float r4 = java.lang.Float.valueOf(r4)
            java.lang.Object r8 = r8.invoke(r4)
            java.lang.Number r8 = (java.lang.Number) r8
            float r8 = r8.floatValue()
            float r8 = java.lang.Math.abs(r8)
            if (r1 == 0) goto L76
            goto L77
        L76:
            r9 = r5
        L77:
            float r9 = r9 - r6
            float r5 = java.lang.Math.abs(r9)
            int r5 = (r5 > r8 ? 1 : (r5 == r8 ? 0 : -1))
            if (r5 < 0) goto L81
            r2 = r3
        L81:
            if (r2 != r3) goto L86
            if (r1 == 0) goto L8a
            goto L8b
        L86:
            if (r2 != 0) goto L8c
            if (r1 == 0) goto L8b
        L8a:
            return r7
        L8b:
            return r0
        L8c:
            kotlin.NoWhenBranchMatchedException r5 = new kotlin.NoWhenBranchMatchedException
            r5.<init>()
            throw r5
        L92:
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
            java.lang.String r6 = "The offset provided to computeTarget must not be NaN."
            r5.<init>(r6)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.AnchoredDraggableKt.computeTarget(androidx.compose.foundation.gestures.DraggableAnchors, float, float, x00.l, x00.a):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final <T> DefaultDraggableAnchors<T> emptyDraggableAnchors() {
        return new DefaultDraggableAnchors<>(h0.J(), new float[0]);
    }

    public static final <T> void forEach(@k DraggableAnchors<T> draggableAnchors, @k p<? super T, ? super Float, g2> pVar) {
        int size = draggableAnchors.getSize();
        for (int i11 = 0; i11 < size; i11++) {
            T anchorAt = draggableAnchors.anchorAt(i11);
            if (anchorAt == null) {
                throw new IllegalArgumentException(("There was no key at index " + i11 + ". Please report a bug.").toString());
            }
            pVar.invoke(anchorAt, Float.valueOf(draggableAnchors.positionAt(i11)));
        }
    }

    public static final float getAnchoredDraggableMinFlingVelocity() {
        return AnchoredDraggableMinFlingVelocity;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't wrap try/catch for region: R(10:0|1|(2:3|(7:5|6|7|(1:(1:10)(2:16|17))(3:18|19|(1:21))|11|12|13))|23|6|7|(0)(0)|11|12|13) */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final <I> java.lang.Object restartable(x00.a<? extends I> r4, x00.p<? super I, ? super j00.c<? super yz.g2>, ? extends java.lang.Object> r5, j00.c<? super yz.g2> r6) {
        /*
            boolean r0 = r6 instanceof androidx.compose.foundation.gestures.AnchoredDraggableKt$restartable$1
            if (r0 == 0) goto L13
            r0 = r6
            androidx.compose.foundation.gestures.AnchoredDraggableKt$restartable$1 r0 = (androidx.compose.foundation.gestures.AnchoredDraggableKt$restartable$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            androidx.compose.foundation.gestures.AnchoredDraggableKt$restartable$1 r0 = new androidx.compose.foundation.gestures.AnchoredDraggableKt$restartable$1
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            kotlin.e.n(r6)     // Catch: androidx.compose.foundation.gestures.AnchoredDragFinishedSignal -> L43
            goto L43
        L29:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L31:
            kotlin.e.n(r6)
            androidx.compose.foundation.gestures.AnchoredDraggableKt$restartable$2 r6 = new androidx.compose.foundation.gestures.AnchoredDraggableKt$restartable$2     // Catch: androidx.compose.foundation.gestures.AnchoredDragFinishedSignal -> L43
            r2 = 0
            r6.<init>(r4, r5, r2)     // Catch: androidx.compose.foundation.gestures.AnchoredDragFinishedSignal -> L43
            r0.label = r3     // Catch: androidx.compose.foundation.gestures.AnchoredDragFinishedSignal -> L43
            java.lang.Object r4 = c40.s0.g(r6, r0)     // Catch: androidx.compose.foundation.gestures.AnchoredDragFinishedSignal -> L43
            if (r4 != r1) goto L43
            return r1
        L43:
            yz.g2 r4 = yz.g2.f100423a
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.AnchoredDraggableKt.restartable(x00.a, x00.p, j00.c):java.lang.Object");
    }

    @m80.l
    public static final <T> Object snapTo(@k AnchoredDraggableState<T> anchoredDraggableState, T t11, @k c<? super g2> cVar) {
        Object anchoredDrag$default = AnchoredDraggableState.anchoredDrag$default(anchoredDraggableState, t11, null, new AnchoredDraggableKt$snapTo$2(null), cVar, 2, null);
        return anchoredDrag$default == b.l() ? anchoredDrag$default : g2.f100423a;
    }

    public static /* synthetic */ Modifier anchoredDraggable$default(Modifier modifier, AnchoredDraggableState anchoredDraggableState, boolean z11, Orientation orientation, boolean z12, MutableInteractionSource mutableInteractionSource, OverscrollEffect overscrollEffect, boolean z13, FlingBehavior flingBehavior, int i11, Object obj) {
        FlingBehavior flingBehavior2;
        Modifier modifier2;
        AnchoredDraggableState anchoredDraggableState2;
        boolean z14;
        Orientation orientation2;
        if ((i11 & 8) != 0) {
            z12 = true;
        }
        boolean z15 = z12;
        MutableInteractionSource mutableInteractionSource2 = (i11 & 16) != 0 ? null : mutableInteractionSource;
        OverscrollEffect overscrollEffect2 = (i11 & 32) != 0 ? null : overscrollEffect;
        boolean isAnimationRunning = (i11 & 64) != 0 ? anchoredDraggableState.isAnimationRunning() : z13;
        if ((i11 & 128) != 0) {
            flingBehavior2 = null;
            modifier2 = modifier;
            z14 = z11;
            orientation2 = orientation;
            anchoredDraggableState2 = anchoredDraggableState;
        } else {
            flingBehavior2 = flingBehavior;
            modifier2 = modifier;
            anchoredDraggableState2 = anchoredDraggableState;
            z14 = z11;
            orientation2 = orientation;
        }
        return anchoredDraggable(modifier2, anchoredDraggableState2, z14, orientation2, z15, mutableInteractionSource2, overscrollEffect2, isAnimationRunning, flingBehavior2);
    }

    public static /* synthetic */ AnchoredDraggableState AnchoredDraggableState$default(Object obj, DraggableAnchors draggableAnchors, l lVar, a aVar, AnimationSpec animationSpec, DecayAnimationSpec decayAnimationSpec, l lVar2, int i11, Object obj2) {
        if ((i11 & 64) != 0) {
            lVar2 = new l<Object, Boolean>() { // from class: androidx.compose.foundation.gestures.AnchoredDraggableKt$AnchoredDraggableState$3
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // x00.l
                public final Boolean invoke(Object obj3) {
                    return Boolean.TRUE;
                }
            };
        }
        return AnchoredDraggableState(obj, draggableAnchors, lVar, aVar, animationSpec, decayAnimationSpec, lVar2);
    }

    public static /* synthetic */ Modifier anchoredDraggable$default(Modifier modifier, AnchoredDraggableState anchoredDraggableState, Orientation orientation, boolean z11, MutableInteractionSource mutableInteractionSource, OverscrollEffect overscrollEffect, FlingBehavior flingBehavior, int i11, Object obj) {
        if ((i11 & 4) != 0) {
            z11 = true;
        }
        return anchoredDraggable(modifier, anchoredDraggableState, orientation, z11, (i11 & 8) != 0 ? null : mutableInteractionSource, (i11 & 16) != 0 ? null : overscrollEffect, (i11 & 32) != 0 ? null : flingBehavior);
    }

    @n(message = StartDragImmediatelyDeprecated)
    @k
    public static final <T> Modifier anchoredDraggable(@k Modifier modifier, @k AnchoredDraggableState<T> anchoredDraggableState, boolean z11, @k Orientation orientation, boolean z12, @m80.l MutableInteractionSource mutableInteractionSource, @m80.l OverscrollEffect overscrollEffect, boolean z13, @m80.l FlingBehavior flingBehavior) {
        return modifier.then(new AnchoredDraggableElement(anchoredDraggableState, orientation, z12, Boolean.valueOf(z11), mutableInteractionSource, Boolean.valueOf(z13), overscrollEffect, flingBehavior));
    }

    public static /* synthetic */ Modifier anchoredDraggable$default(Modifier modifier, AnchoredDraggableState anchoredDraggableState, Orientation orientation, boolean z11, MutableInteractionSource mutableInteractionSource, OverscrollEffect overscrollEffect, boolean z12, FlingBehavior flingBehavior, int i11, Object obj) {
        FlingBehavior flingBehavior2;
        Modifier modifier2;
        AnchoredDraggableState anchoredDraggableState2;
        Orientation orientation2;
        if ((i11 & 4) != 0) {
            z11 = true;
        }
        boolean z13 = z11;
        MutableInteractionSource mutableInteractionSource2 = (i11 & 8) != 0 ? null : mutableInteractionSource;
        OverscrollEffect overscrollEffect2 = (i11 & 16) != 0 ? null : overscrollEffect;
        if ((i11 & 32) != 0) {
            z12 = anchoredDraggableState.isAnimationRunning();
        }
        boolean z14 = z12;
        if ((i11 & 64) != 0) {
            flingBehavior2 = null;
            anchoredDraggableState2 = anchoredDraggableState;
            orientation2 = orientation;
            modifier2 = modifier;
        } else {
            flingBehavior2 = flingBehavior;
            modifier2 = modifier;
            anchoredDraggableState2 = anchoredDraggableState;
            orientation2 = orientation;
        }
        return anchoredDraggable(modifier2, anchoredDraggableState2, orientation2, z13, mutableInteractionSource2, overscrollEffect2, z14, flingBehavior2);
    }

    @n(level = DeprecationLevel.WARNING, message = ConfigurationMovedToModifier)
    @k
    public static final <T> AnchoredDraggableState<T> AnchoredDraggableState(T t11, @k DraggableAnchors<T> draggableAnchors, @k l<? super Float, Float> lVar, @k a<Float> aVar, @k AnimationSpec<Float> animationSpec, @k DecayAnimationSpec<Float> decayAnimationSpec, @k l<? super T, Boolean> lVar2) {
        AnchoredDraggableState<T> anchoredDraggableState = new AnchoredDraggableState<>(t11, draggableAnchors, lVar2);
        anchoredDraggableState.setPositionalThreshold$foundation_release(lVar);
        anchoredDraggableState.setVelocityThreshold$foundation_release(aVar);
        anchoredDraggableState.setSnapAnimationSpec$foundation_release(animationSpec);
        anchoredDraggableState.setDecayAnimationSpec$foundation_release(decayAnimationSpec);
        return anchoredDraggableState;
    }

    @m80.l
    public static final <T> Object animateTo(@k AnchoredDraggableState<T> anchoredDraggableState, T t11, @k AnimationSpec<Float> animationSpec, @k c<? super g2> cVar) {
        Object anchoredDrag$default = AnchoredDraggableState.anchoredDrag$default(anchoredDraggableState, t11, null, new AnchoredDraggableKt$animateTo$4(anchoredDraggableState, animationSpec, null), cVar, 2, null);
        return anchoredDrag$default == b.l() ? anchoredDrag$default : g2.f100423a;
    }

    @k
    public static final <T> Modifier anchoredDraggable(@k Modifier modifier, @k AnchoredDraggableState<T> anchoredDraggableState, @k Orientation orientation, boolean z11, @m80.l MutableInteractionSource mutableInteractionSource, @m80.l OverscrollEffect overscrollEffect, @m80.l FlingBehavior flingBehavior) {
        return modifier.then(new AnchoredDraggableElement(anchoredDraggableState, orientation, z11, null, mutableInteractionSource, null, overscrollEffect, flingBehavior, 32, null));
    }

    @n(message = StartDragImmediatelyDeprecated)
    @k
    public static final <T> Modifier anchoredDraggable(@k Modifier modifier, @k AnchoredDraggableState<T> anchoredDraggableState, @k Orientation orientation, boolean z11, @m80.l MutableInteractionSource mutableInteractionSource, @m80.l OverscrollEffect overscrollEffect, boolean z12, @m80.l FlingBehavior flingBehavior) {
        return modifier.then(new AnchoredDraggableElement(anchoredDraggableState, orientation, z11, null, mutableInteractionSource, Boolean.valueOf(z12), overscrollEffect, flingBehavior));
    }

    private static final void debugLog(a<String> aVar) {
    }
}
