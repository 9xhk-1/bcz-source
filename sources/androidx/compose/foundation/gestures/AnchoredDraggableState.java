package androidx.compose.foundation.gestures;

import androidx.annotation.FloatRange;
import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.animation.core.DecayAnimationSpec;
import androidx.compose.foundation.MutatePriority;
import androidx.compose.foundation.MutatorMutex;
import androidx.compose.foundation.internal.InlineClassHelperKt;
import androidx.compose.runtime.MutableFloatState;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.PrimitiveSnapshotStateKt;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.Stable;
import androidx.compose.runtime.State;
import androidx.compose.runtime.saveable.Saver;
import androidx.compose.runtime.saveable.SaverKt;
import androidx.compose.runtime.saveable.SaverScope;
import g10.u;
import j00.c;
import kotlin.DeprecationLevel;
import kotlin.coroutines.intrinsics.b;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import kotlin.jvm.internal.v;
import m80.k;
import x00.a;
import x00.l;
import x00.p;
import x00.q;
import x00.r;
import yz.g2;
import yz.n;
import yz.w0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nAnchoredDraggable.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AnchoredDraggable.kt\nandroidx/compose/foundation/gestures/AnchoredDraggableState\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 3 SnapshotFloatState.kt\nandroidx/compose/runtime/PrimitiveSnapshotStateKt__SnapshotFloatStateKt\n+ 4 InlineClassHelper.kt\nandroidx/compose/foundation/internal/InlineClassHelperKt\n+ 5 MutatorMutex.kt\nandroidx/compose/foundation/MutatorMutex\n*L\n1#1,1753:1\n85#2:1754\n113#2,2:1755\n85#2:1757\n113#2,2:1758\n85#2:1760\n85#2:1769\n85#2:1773\n113#2,2:1774\n85#2:1776\n113#2,2:1777\n79#3:1761\n112#3,2:1762\n79#3:1770\n112#3,2:1771\n50#4,5:1764\n96#4,5:1779\n186#5,9:1784\n*S KotlinDebug\n*F\n+ 1 AnchoredDraggable.kt\nandroidx/compose/foundation/gestures/AnchoredDraggableState\n*L\n851#1:1754\n851#1:1755,2\n860#1:1757\n860#1:1758,2\n867#1:1760\n940#1:1769\n959#1:1773\n959#1:1774,2\n961#1:1776\n961#1:1777,2\n885#1:1761\n885#1:1762,2\n956#1:1770\n956#1:1771,2\n895#1:1764,5\n1029#1:1779,5\n1226#1:1784,9\n*E\n"})
@Stable
/* loaded from: classes.dex */
public final class AnchoredDraggableState<T> {
    public static final int $stable = 0;

    @k
    public static final Companion Companion = new Companion(null);

    @k
    private final AnchoredDraggableState$anchoredDragScope$1 anchoredDragScope;

    @k
    private final MutableState anchors$delegate;

    @k
    private l<? super T, Boolean> confirmValueChange;

    @k
    private final MutableState currentValue$delegate;
    public DecayAnimationSpec<Float> decayAnimationSpec;

    @k
    private final MutatorMutex dragMutex;

    @k
    private final MutableState dragTarget$delegate;

    @k
    private final MutableFloatState lastVelocity$delegate;

    @k
    private final MutableFloatState offset$delegate;
    public l<? super Float, Float> positionalThreshold;

    @k
    private final State progress$delegate;

    @k
    private final MutableState settledValue$delegate;
    public AnimationSpec<Float> snapAnimationSpec;

    @k
    private final State targetValue$delegate;
    public a<Float> velocityThreshold;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class Companion {
        public /* synthetic */ Companion(v vVar) {
            this();
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Saver Saver$default(Companion companion, l lVar, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                lVar = new l<T, Boolean>() { // from class: androidx.compose.foundation.gestures.AnchoredDraggableState$Companion$Saver$3
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // x00.l
                    public final Boolean invoke(T t11) {
                        return Boolean.TRUE;
                    }

                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // x00.l
                    public /* bridge */ /* synthetic */ Boolean invoke(Object obj2) {
                        return invoke((AnchoredDraggableState$Companion$Saver$3<T>) obj2);
                    }
                };
            }
            return companion.Saver(lVar);
        }

        @k
        public final <T> Saver<AnchoredDraggableState<T>, T> Saver() {
            return SaverKt.Saver(new p<SaverScope, AnchoredDraggableState<T>, T>() { // from class: androidx.compose.foundation.gestures.AnchoredDraggableState$Companion$Saver$1
                @Override // x00.p
                public final T invoke(SaverScope saverScope, AnchoredDraggableState<T> anchoredDraggableState) {
                    return anchoredDraggableState.getCurrentValue();
                }
            }, new l<T, AnchoredDraggableState<T>>() { // from class: androidx.compose.foundation.gestures.AnchoredDraggableState$Companion$Saver$2
                /* JADX WARN: Multi-variable type inference failed */
                @Override // x00.l
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    return invoke((AnchoredDraggableState$Companion$Saver$2<T>) obj);
                }

                @Override // x00.l
                public final AnchoredDraggableState<T> invoke(T t11) {
                    return new AnchoredDraggableState<>(t11);
                }
            });
        }

        private Companion() {
        }

        public static /* synthetic */ Saver Saver$default(Companion companion, AnimationSpec animationSpec, DecayAnimationSpec decayAnimationSpec, l lVar, a aVar, l lVar2, int i11, Object obj) {
            if ((i11 & 16) != 0) {
                lVar2 = new l<T, Boolean>() { // from class: androidx.compose.foundation.gestures.AnchoredDraggableState$Companion$Saver$6
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // x00.l
                    public final Boolean invoke(T t11) {
                        return Boolean.TRUE;
                    }

                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // x00.l
                    public /* bridge */ /* synthetic */ Boolean invoke(Object obj2) {
                        return invoke((AnchoredDraggableState$Companion$Saver$6<T>) obj2);
                    }
                };
            }
            return companion.Saver(animationSpec, decayAnimationSpec, lVar, aVar, lVar2);
        }

        @n(level = DeprecationLevel.WARNING, message = "confirmValueChange is deprecated without replacement. Rather than relying on a callback to veto state changes, the anchor set should not include disallowed anchors. See androidx.compose.foundation.samples.AnchoredDraggableDynamicAnchorsSample for an example of using dynamic anchors over confirmValueChange.")
        @k
        public final <T> Saver<AnchoredDraggableState<T>, T> Saver(@k final l<? super T, Boolean> lVar) {
            return SaverKt.Saver(new p<SaverScope, AnchoredDraggableState<T>, T>() { // from class: androidx.compose.foundation.gestures.AnchoredDraggableState$Companion$Saver$4
                @Override // x00.p
                public final T invoke(SaverScope saverScope, AnchoredDraggableState<T> anchoredDraggableState) {
                    return anchoredDraggableState.getCurrentValue();
                }
            }, new l<T, AnchoredDraggableState<T>>() { // from class: androidx.compose.foundation.gestures.AnchoredDraggableState$Companion$Saver$5
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(1);
                }

                /* JADX WARN: Multi-variable type inference failed */
                @Override // x00.l
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    return invoke((AnchoredDraggableState$Companion$Saver$5<T>) obj);
                }

                @Override // x00.l
                public final AnchoredDraggableState<T> invoke(T t11) {
                    return new AnchoredDraggableState<>(t11, lVar);
                }
            });
        }

        @n(level = DeprecationLevel.WARNING, message = "This constructor of AnchoredDraggableState has been deprecated. Please pass thresholds and animation specs to anchoredDraggableFlingBehavior(..) instead, which can be passed to Modifier.anchoredDraggable.")
        @k
        public final <T> Saver<AnchoredDraggableState<T>, T> Saver(@k final AnimationSpec<Float> animationSpec, @k final DecayAnimationSpec<Float> decayAnimationSpec, @k final l<? super Float, Float> lVar, @k final a<Float> aVar, @k final l<? super T, Boolean> lVar2) {
            return SaverKt.Saver(new p<SaverScope, AnchoredDraggableState<T>, T>() { // from class: androidx.compose.foundation.gestures.AnchoredDraggableState$Companion$Saver$7
                @Override // x00.p
                public final T invoke(SaverScope saverScope, AnchoredDraggableState<T> anchoredDraggableState) {
                    return anchoredDraggableState.getCurrentValue();
                }
            }, new l<T, AnchoredDraggableState<T>>() { // from class: androidx.compose.foundation.gestures.AnchoredDraggableState$Companion$Saver$8
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(1);
                }

                /* JADX WARN: Multi-variable type inference failed */
                @Override // x00.l
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    return invoke((AnchoredDraggableState$Companion$Saver$8<T>) obj);
                }

                @Override // x00.l
                public final AnchoredDraggableState<T> invoke(T t11) {
                    return AnchoredDraggableKt.AnchoredDraggableState(t11, lVar, aVar, animationSpec, decayAnimationSpec, lVar2);
                }
            });
        }
    }

    public AnchoredDraggableState(T t11) {
        this.confirmValueChange = new l<T, Boolean>() { // from class: androidx.compose.foundation.gestures.AnchoredDraggableState$confirmValueChange$1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // x00.l
            public final Boolean invoke(T t12) {
                return Boolean.TRUE;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // x00.l
            public /* bridge */ /* synthetic */ Boolean invoke(Object obj) {
                return invoke((AnchoredDraggableState$confirmValueChange$1<T>) obj);
            }
        };
        this.dragMutex = new MutatorMutex();
        this.currentValue$delegate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(t11, null, 2, null);
        this.settledValue$delegate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(t11, null, 2, null);
        this.targetValue$delegate = SnapshotStateKt.derivedStateOf(new a<T>(this) { // from class: androidx.compose.foundation.gestures.AnchoredDraggableState$targetValue$2
            final /* synthetic */ AnchoredDraggableState<T> this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
                this.this$0 = this;
            }

            @Override // x00.a
            public final T invoke() {
                Object dragTarget;
                dragTarget = this.this$0.getDragTarget();
                T t12 = (T) dragTarget;
                if (t12 != null) {
                    return t12;
                }
                AnchoredDraggableState<T> anchoredDraggableState = this.this$0;
                if (Float.isNaN(anchoredDraggableState.getOffset())) {
                    return anchoredDraggableState.getCurrentValue();
                }
                T closestAnchor = anchoredDraggableState.getAnchors().closestAnchor(anchoredDraggableState.getOffset());
                return closestAnchor == null ? anchoredDraggableState.getCurrentValue() : closestAnchor;
            }
        });
        this.offset$delegate = PrimitiveSnapshotStateKt.mutableFloatStateOf(Float.NaN);
        this.progress$delegate = SnapshotStateKt.derivedStateOf(SnapshotStateKt.structuralEqualityPolicy(), new a<Float>(this) { // from class: androidx.compose.foundation.gestures.AnchoredDraggableState$progress$2
            final /* synthetic */ AnchoredDraggableState<T> this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
                this.this$0 = this;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // x00.a
            public final Float invoke() {
                float positionOf = this.this$0.getAnchors().positionOf(this.this$0.getSettledValue());
                float positionOf2 = this.this$0.getAnchors().positionOf(this.this$0.getTargetValue()) - positionOf;
                float abs = Math.abs(positionOf2);
                float f11 = 1.0f;
                if (!Float.isNaN(abs) && abs > 1.0E-6f) {
                    float requireOffset = (this.this$0.requireOffset() - positionOf) / positionOf2;
                    if (requireOffset < 1.0E-6f) {
                        f11 = 0.0f;
                    } else if (requireOffset <= 0.999999f) {
                        f11 = requireOffset;
                    }
                }
                return Float.valueOf(f11);
            }
        });
        this.lastVelocity$delegate = PrimitiveSnapshotStateKt.mutableFloatStateOf(0.0f);
        this.dragTarget$delegate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
        this.anchors$delegate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(AnchoredDraggableKt.emptyDraggableAnchors(), null, 2, null);
        this.anchoredDragScope = new AnchoredDraggableState$anchoredDragScope$1(this);
    }

    public static /* synthetic */ Object anchoredDrag$default(AnchoredDraggableState anchoredDraggableState, MutatePriority mutatePriority, q qVar, c cVar, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            mutatePriority = MutatePriority.Default;
        }
        return anchoredDraggableState.anchoredDrag(mutatePriority, qVar, cVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final T getDragTarget() {
        return this.dragTarget$delegate.getValue();
    }

    private final void setAnchors(DraggableAnchors<T> draggableAnchors) {
        this.anchors$delegate.setValue(draggableAnchors);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setCurrentValue(T t11) {
        this.currentValue$delegate.setValue(t11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setDragTarget(T t11) {
        this.dragTarget$delegate.setValue(t11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setLastVelocity(float f11) {
        this.lastVelocity$delegate.setFloatValue(f11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setOffset(float f11) {
        this.offset$delegate.setFloatValue(f11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setSettledValue(T t11) {
        this.settledValue$delegate.setValue(t11);
    }

    private final boolean trySnapTo(T t11) {
        MutatorMutex mutatorMutex = this.dragMutex;
        boolean tryLock = mutatorMutex.tryLock();
        if (!tryLock) {
            return tryLock;
        }
        try {
            AnchoredDraggableState$anchoredDragScope$1 anchoredDraggableState$anchoredDragScope$1 = this.anchoredDragScope;
            float positionOf = getAnchors().positionOf(t11);
            if (!Float.isNaN(positionOf)) {
                AnchoredDragScope.dragTo$default(anchoredDraggableState$anchoredDragScope$1, positionOf, 0.0f, 2, null);
                setDragTarget(null);
            }
            setCurrentValue(t11);
            setSettledValue(t11);
            mutatorMutex.unlock();
            return tryLock;
        } catch (Throwable th2) {
            mutatorMutex.unlock();
            throw th2;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void updateAnchors$default(AnchoredDraggableState anchoredDraggableState, DraggableAnchors draggableAnchors, Object obj, int i11, Object obj2) {
        if ((i11 & 2) != 0) {
            if (Float.isNaN(anchoredDraggableState.getOffset())) {
                obj = anchoredDraggableState.getTargetValue();
            } else {
                obj = draggableAnchors.closestAnchor(anchoredDraggableState.getOffset());
                if (obj == null) {
                    obj = anchoredDraggableState.getTargetValue();
                }
            }
        }
        anchoredDraggableState.updateAnchors(draggableAnchors, obj);
    }

    @m80.l
    public final Object anchoredDrag(@k MutatePriority mutatePriority, @k q<? super AnchoredDragScope, ? super DraggableAnchors<T>, ? super c<? super g2>, ? extends Object> qVar, @k c<? super g2> cVar) {
        Object mutate = this.dragMutex.mutate(mutatePriority, new AnchoredDraggableState$anchoredDrag$2(this, qVar, null), cVar);
        return mutate == b.l() ? mutate : g2.f100423a;
    }

    public final float dispatchRawDelta(float f11) {
        float newOffsetForDelta$foundation_release = newOffsetForDelta$foundation_release(f11);
        float requireOffset = newOffsetForDelta$foundation_release - requireOffset();
        AnchoredDragScope.dragTo$default(this.anchoredDragScope, newOffsetForDelta$foundation_release, 0.0f, 2, null);
        return requireOffset;
    }

    @k
    public final DraggableAnchors<T> getAnchors() {
        return (DraggableAnchors) this.anchors$delegate.getValue();
    }

    @k
    public final l<T, Boolean> getConfirmValueChange$foundation_release() {
        return this.confirmValueChange;
    }

    public final T getCurrentValue() {
        return this.currentValue$delegate.getValue();
    }

    @k
    public final DecayAnimationSpec<Float> getDecayAnimationSpec() {
        DecayAnimationSpec<Float> decayAnimationSpec = this.decayAnimationSpec;
        if (decayAnimationSpec != null) {
            return decayAnimationSpec;
        }
        g0.S("decayAnimationSpec");
        return null;
    }

    public final float getLastVelocity() {
        return this.lastVelocity$delegate.getFloatValue();
    }

    public final float getOffset() {
        return this.offset$delegate.getFloatValue();
    }

    @k
    public final l<Float, Float> getPositionalThreshold$foundation_release() {
        l lVar = this.positionalThreshold;
        if (lVar != null) {
            return lVar;
        }
        g0.S("positionalThreshold");
        return null;
    }

    @FloatRange(from = 0.0d, to = 1.0d)
    public final float getProgress() {
        return ((Number) this.progress$delegate.getValue()).floatValue();
    }

    public final T getSettledValue() {
        return this.settledValue$delegate.getValue();
    }

    @k
    public final AnimationSpec<Float> getSnapAnimationSpec() {
        AnimationSpec<Float> animationSpec = this.snapAnimationSpec;
        if (animationSpec != null) {
            return animationSpec;
        }
        g0.S("snapAnimationSpec");
        return null;
    }

    public final T getTargetValue() {
        return (T) this.targetValue$delegate.getValue();
    }

    public final boolean getUsePreModifierChangeBehavior$foundation_release() {
        return (this.positionalThreshold == null || this.velocityThreshold == null || this.snapAnimationSpec == null || this.decayAnimationSpec == null) ? false : true;
    }

    @k
    public final a<Float> getVelocityThreshold$foundation_release() {
        a<Float> aVar = this.velocityThreshold;
        if (aVar != null) {
            return aVar;
        }
        g0.S("velocityThreshold");
        return null;
    }

    public final boolean isAnimationRunning() {
        return getDragTarget() != null;
    }

    public final float newOffsetForDelta$foundation_release(float f11) {
        return u.H((Float.isNaN(getOffset()) ? 0.0f : getOffset()) + f11, getAnchors().minPosition(), getAnchors().maxPosition());
    }

    @FloatRange(from = 0.0d, to = 1.0d)
    public final float progress(T t11, T t12) {
        float positionOf = getAnchors().positionOf(t11);
        float positionOf2 = getAnchors().positionOf(t12);
        float H = (u.H(getOffset(), Math.min(positionOf, positionOf2), Math.max(positionOf, positionOf2)) - positionOf) / (positionOf2 - positionOf);
        if (Float.isNaN(H)) {
            return 1.0f;
        }
        if (H < 1.0E-6f) {
            return 0.0f;
        }
        if (H > 0.999999f) {
            return 1.0f;
        }
        return Math.abs(H);
    }

    public final float requireOffset() {
        if (Float.isNaN(getOffset())) {
            InlineClassHelperKt.throwIllegalStateException("The offset was read before being initialized. Did you access the offset in a phase before layout, like effects or composition?");
        }
        return getOffset();
    }

    public final void setConfirmValueChange$foundation_release(@k l<? super T, Boolean> lVar) {
        this.confirmValueChange = lVar;
    }

    public final void setDecayAnimationSpec$foundation_release(@k DecayAnimationSpec<Float> decayAnimationSpec) {
        this.decayAnimationSpec = decayAnimationSpec;
    }

    public final void setPositionalThreshold$foundation_release(@k l<? super Float, Float> lVar) {
        this.positionalThreshold = lVar;
    }

    public final void setSnapAnimationSpec$foundation_release(@k AnimationSpec<Float> animationSpec) {
        this.snapAnimationSpec = animationSpec;
    }

    public final void setVelocityThreshold$foundation_release(@k a<Float> aVar) {
        this.velocityThreshold = aVar;
    }

    @m80.l
    public final Object settle(@k AnimationSpec<Float> animationSpec, @k c<? super g2> cVar) {
        T currentValue = getCurrentValue();
        T closestAnchor = getAnchors().closestAnchor(requireOffset());
        if (closestAnchor == null || !this.confirmValueChange.invoke(closestAnchor).booleanValue()) {
            Object animateTo = AnchoredDraggableKt.animateTo(this, currentValue, animationSpec, cVar);
            return animateTo == b.l() ? animateTo : g2.f100423a;
        }
        Object animateTo2 = AnchoredDraggableKt.animateTo(this, closestAnchor, animationSpec, cVar);
        return animateTo2 == b.l() ? animateTo2 : g2.f100423a;
    }

    public final void updateAnchors(@k DraggableAnchors<T> draggableAnchors, T t11) {
        if (g0.g(getAnchors(), draggableAnchors)) {
            return;
        }
        setAnchors(draggableAnchors);
        if (trySnapTo(t11)) {
            return;
        }
        setDragTarget(t11);
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @m80.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object anchoredDrag(T r6, @m80.k androidx.compose.foundation.MutatePriority r7, @m80.k x00.r<? super androidx.compose.foundation.gestures.AnchoredDragScope, ? super androidx.compose.foundation.gestures.DraggableAnchors<T>, ? super T, ? super j00.c<? super yz.g2>, ? extends java.lang.Object> r8, @m80.k j00.c<? super yz.g2> r9) {
        /*
            r5 = this;
            boolean r0 = r9 instanceof androidx.compose.foundation.gestures.AnchoredDraggableState$anchoredDrag$3
            if (r0 == 0) goto L13
            r0 = r9
            androidx.compose.foundation.gestures.AnchoredDraggableState$anchoredDrag$3 r0 = (androidx.compose.foundation.gestures.AnchoredDraggableState$anchoredDrag$3) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            androidx.compose.foundation.gestures.AnchoredDraggableState$anchoredDrag$3 r0 = new androidx.compose.foundation.gestures.AnchoredDraggableState$anchoredDrag$3
            r0.<init>(r5, r9)
        L18:
            java.lang.Object r9 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
            int r2 = r0.label
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L38
            if (r2 != r3) goto L30
            java.lang.Object r6 = r0.L$0
            androidx.compose.foundation.gestures.AnchoredDraggableState r6 = (androidx.compose.foundation.gestures.AnchoredDraggableState) r6
            kotlin.e.n(r9)     // Catch: java.lang.Throwable -> L2e
            goto L58
        L2e:
            r7 = move-exception
            goto L5e
        L30:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L38:
            kotlin.e.n(r9)
            androidx.compose.foundation.gestures.DraggableAnchors r9 = r5.getAnchors()
            boolean r9 = r9.hasPositionFor(r6)
            if (r9 == 0) goto L62
            androidx.compose.foundation.MutatorMutex r9 = r5.dragMutex     // Catch: java.lang.Throwable -> L5c
            androidx.compose.foundation.gestures.AnchoredDraggableState$anchoredDrag$4 r2 = new androidx.compose.foundation.gestures.AnchoredDraggableState$anchoredDrag$4     // Catch: java.lang.Throwable -> L5c
            r2.<init>(r5, r6, r8, r4)     // Catch: java.lang.Throwable -> L5c
            r0.L$0 = r5     // Catch: java.lang.Throwable -> L5c
            r0.label = r3     // Catch: java.lang.Throwable -> L5c
            java.lang.Object r6 = r9.mutate(r7, r2, r0)     // Catch: java.lang.Throwable -> L5c
            if (r6 != r1) goto L57
            return r1
        L57:
            r6 = r5
        L58:
            r6.setDragTarget(r4)
            goto L76
        L5c:
            r7 = move-exception
            r6 = r5
        L5e:
            r6.setDragTarget(r4)
            throw r7
        L62:
            x00.l<? super T, java.lang.Boolean> r7 = r5.confirmValueChange
            java.lang.Object r7 = r7.invoke(r6)
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            boolean r7 = r7.booleanValue()
            if (r7 == 0) goto L76
            r5.setSettledValue(r6)
            r5.setCurrentValue(r6)
        L76:
            yz.g2 r6 = yz.g2.f100423a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.AnchoredDraggableState.anchoredDrag(java.lang.Object, androidx.compose.foundation.MutatePriority, x00.r, j00.c):java.lang.Object");
    }

    public static /* synthetic */ Object anchoredDrag$default(AnchoredDraggableState anchoredDraggableState, Object obj, MutatePriority mutatePriority, r rVar, c cVar, int i11, Object obj2) {
        if ((i11 & 2) != 0) {
            mutatePriority = MutatePriority.Default;
        }
        return anchoredDraggableState.anchoredDrag(obj, mutatePriority, rVar, cVar);
    }

    @m80.l
    @n(level = DeprecationLevel.WARNING, message = "settle does not accept a velocity anymore. Please use FlingBehavior#performFling instead. See AnchoredDraggableSamples.kt for example usages.")
    public final Object settle(float f11, @k c<? super Float> cVar) {
        if (!getUsePreModifierChangeBehavior$foundation_release()) {
            InlineClassHelperKt.throwIllegalArgumentException("AnchoredDraggableState was configured through a constructor without providing positional and velocity threshold. This overload of settle has been deprecated. Please refer to AnchoredDraggableState#settle(animationSpec) for more information.");
        }
        T currentValue = getCurrentValue();
        Object computeTarget = AnchoredDraggableKt.computeTarget(getAnchors(), requireOffset(), f11, getPositionalThreshold$foundation_release(), getVelocityThreshold$foundation_release());
        if (this.confirmValueChange.invoke(computeTarget).booleanValue()) {
            return AnchoredDraggableKt.animateToWithDecay$default(this, computeTarget, f11, null, null, cVar, 12, null);
        }
        return AnchoredDraggableKt.animateToWithDecay$default(this, currentValue, f11, null, null, cVar, 12, null);
    }

    public AnchoredDraggableState(T t11, @k DraggableAnchors<T> draggableAnchors) {
        this(t11);
        setAnchors(draggableAnchors);
        trySnapTo(t11);
    }

    @n(level = DeprecationLevel.WARNING, message = "confirmValueChange is deprecated without replacement. Rather than relying on a callback to veto state changes, the anchor set should not include disallowed anchors. See androidx.compose.foundation.samples.AnchoredDraggableDynamicAnchorsSample for an example of using dynamic anchors over confirmValueChange.")
    public AnchoredDraggableState(T t11, @k l<? super T, Boolean> lVar) {
        this(t11);
        this.confirmValueChange = lVar;
    }

    @n(level = DeprecationLevel.WARNING, message = "This constructor of AnchoredDraggableState has been deprecated. Please pass thresholds and animation specs to anchoredDraggableFlingBehavior(..) instead, which can be passed to Modifier.anchoredDraggable.")
    public static /* synthetic */ void getDecayAnimationSpec$annotations() {
    }

    @n(message = "Use the progress function to query the progress between two specified anchors.", replaceWith = @w0(expression = "progress(state.settledValue, state.targetValue)", imports = {}))
    public static /* synthetic */ void getProgress$annotations() {
    }

    @n(level = DeprecationLevel.WARNING, message = "This constructor of AnchoredDraggableState has been deprecated. Please pass thresholds and animation specs to anchoredDraggableFlingBehavior(..) instead, which can be passed to Modifier.anchoredDraggable.")
    public static /* synthetic */ void getSnapAnimationSpec$annotations() {
    }

    public static /* synthetic */ void getUsePreModifierChangeBehavior$foundation_release$annotations() {
    }

    public /* synthetic */ AnchoredDraggableState(Object obj, DraggableAnchors draggableAnchors, l lVar, int i11, v vVar) {
        this(obj, draggableAnchors, (i11 & 4) != 0 ? new l<T, Boolean>() { // from class: androidx.compose.foundation.gestures.AnchoredDraggableState.1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // x00.l
            public final Boolean invoke(T t11) {
                return Boolean.TRUE;
            }

            @Override // x00.l
            public /* bridge */ /* synthetic */ Boolean invoke(Object obj2) {
                return invoke((AnonymousClass1) obj2);
            }
        } : lVar);
    }

    @n(level = DeprecationLevel.WARNING, message = "confirmValueChange is deprecated without replacement. Rather than relying on a callback to veto state changes, the anchor set should not include disallowed anchors. See androidx.compose.foundation.samples.AnchoredDraggableDynamicAnchorsSample for an example of using dynamic anchors over confirmValueChange.")
    public AnchoredDraggableState(T t11, @k DraggableAnchors<T> draggableAnchors, @k l<? super T, Boolean> lVar) {
        this(t11, lVar);
        setAnchors(draggableAnchors);
        trySnapTo(t11);
    }
}
