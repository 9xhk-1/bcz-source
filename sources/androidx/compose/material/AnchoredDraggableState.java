package androidx.compose.material;

import androidx.annotation.FloatRange;
import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.foundation.MutatePriority;
import androidx.compose.foundation.gestures.DraggableState;
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

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nAnchoredDraggable.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AnchoredDraggable.kt\nandroidx/compose/material/AnchoredDraggableState\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 3 SnapshotFloatState.kt\nandroidx/compose/runtime/PrimitiveSnapshotStateKt__SnapshotFloatStateKt\n*L\n1#1,879:1\n85#2:880\n113#2,2:881\n85#2:883\n85#2:884\n85#2:888\n85#2:892\n113#2,2:893\n85#2:895\n113#2,2:896\n79#3:885\n112#3,2:886\n79#3:889\n112#3,2:890\n*S KotlinDebug\n*F\n+ 1 AnchoredDraggable.kt\nandroidx/compose/material/AnchoredDraggableState\n*L\n292#1:880\n292#1:881,2\n300#1:883\n315#1:884\n360#1:888\n379#1:892\n379#1:893,2\n381#1:895\n381#1:896,2\n333#1:885\n333#1:886,2\n376#1:889\n376#1:890,2\n*E\n"})
@Stable
@ExperimentalMaterialApi
/* loaded from: classes.dex */
public final class AnchoredDraggableState<T> {
    public static final int $stable = 0;

    @k
    public static final Companion Companion = new Companion(null);

    @k
    private final AnchoredDragScope anchoredDragScope;

    @k
    private final MutableState anchors$delegate;

    @k
    private final AnimationSpec<Float> animationSpec;

    @k
    private final State closestValue$delegate;

    @k
    private final l<T, Boolean> confirmValueChange;

    @k
    private final MutableState currentValue$delegate;

    @k
    private final InternalMutatorMutex dragMutex;

    @k
    private final MutableState dragTarget$delegate;

    @k
    private final DraggableState draggableState;

    @k
    private final MutableFloatState lastVelocity$delegate;

    @k
    private final MutableFloatState offset$delegate;

    @k
    private final l<Float, Float> positionalThreshold;

    @k
    private final State progress$delegate;

    @k
    private final State targetValue$delegate;

    @k
    private final a<Float> velocityThreshold;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class Companion {
        public /* synthetic */ Companion(v vVar) {
            this();
        }

        @ExperimentalMaterialApi
        @k
        public final <T> Saver<AnchoredDraggableState<T>, T> Saver(@k final AnimationSpec<Float> animationSpec, @k final l<? super T, Boolean> lVar, @k final l<? super Float, Float> lVar2, @k final a<Float> aVar) {
            return SaverKt.Saver(new p<SaverScope, AnchoredDraggableState<T>, T>() { // from class: androidx.compose.material.AnchoredDraggableState$Companion$Saver$1
                @Override // x00.p
                public final T invoke(SaverScope saverScope, AnchoredDraggableState<T> anchoredDraggableState) {
                    return anchoredDraggableState.getCurrentValue();
                }
            }, new l<T, AnchoredDraggableState<T>>() { // from class: androidx.compose.material.AnchoredDraggableState$Companion$Saver$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(1);
                }

                /* JADX WARN: Multi-variable type inference failed */
                @Override // x00.l
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    return invoke((AnchoredDraggableState$Companion$Saver$2<T>) obj);
                }

                @Override // x00.l
                public final AnchoredDraggableState<T> invoke(T t11) {
                    return new AnchoredDraggableState<>(t11, lVar2, aVar, animationSpec, lVar);
                }
            });
        }

        private Companion() {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public AnchoredDraggableState(T t11, @k l<? super Float, Float> lVar, @k a<Float> aVar, @k AnimationSpec<Float> animationSpec, @k l<? super T, Boolean> lVar2) {
        MapDraggableAnchors emptyDraggableAnchors;
        this.positionalThreshold = lVar;
        this.velocityThreshold = aVar;
        this.animationSpec = animationSpec;
        this.confirmValueChange = lVar2;
        this.dragMutex = new InternalMutatorMutex();
        this.draggableState = new AnchoredDraggableState$draggableState$1(this);
        this.currentValue$delegate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(t11, null, 2, null);
        this.targetValue$delegate = SnapshotStateKt.derivedStateOf(new a<T>(this) { // from class: androidx.compose.material.AnchoredDraggableState$targetValue$2
            final /* synthetic */ AnchoredDraggableState<T> this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
                this.this$0 = this;
            }

            @Override // x00.a
            public final T invoke() {
                Object dragTarget;
                Object computeTarget;
                dragTarget = this.this$0.getDragTarget();
                T t12 = (T) dragTarget;
                if (t12 != null) {
                    return t12;
                }
                AnchoredDraggableState<T> anchoredDraggableState = this.this$0;
                float offset = anchoredDraggableState.getOffset();
                if (Float.isNaN(offset)) {
                    return anchoredDraggableState.getCurrentValue();
                }
                computeTarget = anchoredDraggableState.computeTarget(offset, anchoredDraggableState.getCurrentValue(), 0.0f);
                return (T) computeTarget;
            }
        });
        this.closestValue$delegate = SnapshotStateKt.derivedStateOf(new a<T>(this) { // from class: androidx.compose.material.AnchoredDraggableState$closestValue$2
            final /* synthetic */ AnchoredDraggableState<T> this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
                this.this$0 = this;
            }

            @Override // x00.a
            public final T invoke() {
                Object dragTarget;
                Object computeTargetWithoutThresholds;
                dragTarget = this.this$0.getDragTarget();
                T t12 = (T) dragTarget;
                if (t12 != null) {
                    return t12;
                }
                AnchoredDraggableState<T> anchoredDraggableState = this.this$0;
                float offset = anchoredDraggableState.getOffset();
                if (Float.isNaN(offset)) {
                    return anchoredDraggableState.getCurrentValue();
                }
                computeTargetWithoutThresholds = anchoredDraggableState.computeTargetWithoutThresholds(offset, anchoredDraggableState.getCurrentValue());
                return (T) computeTargetWithoutThresholds;
            }
        });
        this.offset$delegate = PrimitiveSnapshotStateKt.mutableFloatStateOf(Float.NaN);
        this.progress$delegate = SnapshotStateKt.derivedStateOf(SnapshotStateKt.structuralEqualityPolicy(), new a<Float>(this) { // from class: androidx.compose.material.AnchoredDraggableState$progress$2
            final /* synthetic */ AnchoredDraggableState<T> this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
                this.this$0 = this;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // x00.a
            public final Float invoke() {
                float positionOf = this.this$0.getAnchors().positionOf(this.this$0.getCurrentValue());
                float positionOf2 = this.this$0.getAnchors().positionOf(this.this$0.getClosestValue$material_release()) - positionOf;
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
        emptyDraggableAnchors = AnchoredDraggableKt.emptyDraggableAnchors();
        this.anchors$delegate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(emptyDraggableAnchors, null, 2, null);
        this.anchoredDragScope = new AnchoredDragScope(this) { // from class: androidx.compose.material.AnchoredDraggableState$anchoredDragScope$1
            final /* synthetic */ AnchoredDraggableState<T> this$0;

            {
                this.this$0 = this;
            }

            @Override // androidx.compose.material.AnchoredDragScope
            public void dragTo(float f11, float f12) {
                this.this$0.setOffset(f11);
                this.this$0.setLastVelocity(f12);
            }
        };
    }

    public static /* synthetic */ Object anchoredDrag$default(AnchoredDraggableState anchoredDraggableState, MutatePriority mutatePriority, q qVar, c cVar, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            mutatePriority = MutatePriority.Default;
        }
        return anchoredDraggableState.anchoredDrag(mutatePriority, qVar, cVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final T computeTarget(float f11, T t11, float f12) {
        DraggableAnchors<T> anchors = getAnchors();
        float positionOf = anchors.positionOf(t11);
        float floatValue = this.velocityThreshold.invoke().floatValue();
        if (positionOf == f11) {
            return t11;
        }
        if (!Float.isNaN(positionOf)) {
            if (positionOf < f11) {
                if (f12 >= floatValue) {
                    T closestAnchor = anchors.closestAnchor(f11, true);
                    g0.m(closestAnchor);
                    return closestAnchor;
                }
                T closestAnchor2 = anchors.closestAnchor(f11, true);
                g0.m(closestAnchor2);
                if (f11 >= Math.abs(positionOf + Math.abs(this.positionalThreshold.invoke(Float.valueOf(Math.abs(anchors.positionOf(closestAnchor2) - positionOf))).floatValue()))) {
                    return closestAnchor2;
                }
            } else {
                if (f12 <= (-floatValue)) {
                    T closestAnchor3 = anchors.closestAnchor(f11, false);
                    g0.m(closestAnchor3);
                    return closestAnchor3;
                }
                T closestAnchor4 = anchors.closestAnchor(f11, false);
                g0.m(closestAnchor4);
                float abs = Math.abs(positionOf - Math.abs(this.positionalThreshold.invoke(Float.valueOf(Math.abs(positionOf - anchors.positionOf(closestAnchor4)))).floatValue()));
                if (f11 >= 0.0f ? f11 <= abs : Math.abs(f11) >= abs) {
                    return closestAnchor4;
                }
            }
        }
        return t11;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final T computeTargetWithoutThresholds(float f11, T t11) {
        DraggableAnchors<T> anchors = getAnchors();
        float positionOf = anchors.positionOf(t11);
        if (positionOf == f11) {
            return t11;
        }
        if (!Float.isNaN(positionOf)) {
            if (positionOf < f11) {
                T closestAnchor = anchors.closestAnchor(f11, true);
                if (closestAnchor != null) {
                    return closestAnchor;
                }
            } else {
                T closestAnchor2 = anchors.closestAnchor(f11, false);
                if (closestAnchor2 != null) {
                    return closestAnchor2;
                }
            }
        }
        return t11;
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

    private final boolean trySnapTo(final T t11) {
        return this.dragMutex.tryMutate(new a<g2>(this) { // from class: androidx.compose.material.AnchoredDraggableState$trySnapTo$1
            final /* synthetic */ AnchoredDraggableState<T> this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
                this.this$0 = this;
            }

            @Override // x00.a
            public /* bridge */ /* synthetic */ g2 invoke() {
                invoke2();
                return g2.f100423a;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                AnchoredDragScope anchoredDragScope;
                anchoredDragScope = ((AnchoredDraggableState) this.this$0).anchoredDragScope;
                AnchoredDraggableState<T> anchoredDraggableState = this.this$0;
                T t12 = t11;
                float positionOf = anchoredDraggableState.getAnchors().positionOf(t12);
                if (!Float.isNaN(positionOf)) {
                    AnchoredDragScope.dragTo$default(anchoredDragScope, positionOf, 0.0f, 2, null);
                    anchoredDraggableState.setDragTarget(null);
                }
                anchoredDraggableState.setCurrentValue(t12);
            }
        });
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

    /* JADX WARN: Removed duplicated region for block: B:34:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    @m80.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object anchoredDrag(@m80.k androidx.compose.foundation.MutatePriority r7, @m80.k x00.q<? super androidx.compose.material.AnchoredDragScope, ? super androidx.compose.material.DraggableAnchors<T>, ? super j00.c<? super yz.g2>, ? extends java.lang.Object> r8, @m80.k j00.c<? super yz.g2> r9) {
        /*
            r6 = this;
            boolean r0 = r9 instanceof androidx.compose.material.AnchoredDraggableState$anchoredDrag$1
            if (r0 == 0) goto L13
            r0 = r9
            androidx.compose.material.AnchoredDraggableState$anchoredDrag$1 r0 = (androidx.compose.material.AnchoredDraggableState$anchoredDrag$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            androidx.compose.material.AnchoredDraggableState$anchoredDrag$1 r0 = new androidx.compose.material.AnchoredDraggableState$anchoredDrag$1
            r0.<init>(r6, r9)
        L18:
            java.lang.Object r9 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
            int r2 = r0.label
            r3 = 1056964608(0x3f000000, float:0.5)
            r4 = 1
            if (r2 == 0) goto L39
            if (r2 != r4) goto L31
            java.lang.Object r7 = r0.L$0
            androidx.compose.material.AnchoredDraggableState r7 = (androidx.compose.material.AnchoredDraggableState) r7
            kotlin.e.n(r9)     // Catch: java.lang.Throwable -> L2f
            goto L50
        L2f:
            r8 = move-exception
            goto L89
        L31:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L39:
            kotlin.e.n(r9)
            androidx.compose.material.InternalMutatorMutex r9 = r6.dragMutex     // Catch: java.lang.Throwable -> L87
            androidx.compose.material.AnchoredDraggableState$anchoredDrag$2 r2 = new androidx.compose.material.AnchoredDraggableState$anchoredDrag$2     // Catch: java.lang.Throwable -> L87
            r5 = 0
            r2.<init>(r6, r8, r5)     // Catch: java.lang.Throwable -> L87
            r0.L$0 = r6     // Catch: java.lang.Throwable -> L87
            r0.label = r4     // Catch: java.lang.Throwable -> L87
            java.lang.Object r7 = r9.mutate(r7, r2, r0)     // Catch: java.lang.Throwable -> L87
            if (r7 != r1) goto L4f
            return r1
        L4f:
            r7 = r6
        L50:
            androidx.compose.material.DraggableAnchors r8 = r7.getAnchors()
            float r9 = r7.getOffset()
            java.lang.Object r8 = r8.closestAnchor(r9)
            if (r8 == 0) goto L84
            float r9 = r7.getOffset()
            androidx.compose.material.DraggableAnchors r0 = r7.getAnchors()
            float r0 = r0.positionOf(r8)
            float r9 = r9 - r0
            float r9 = java.lang.Math.abs(r9)
            int r9 = (r9 > r3 ? 1 : (r9 == r3 ? 0 : -1))
            if (r9 > 0) goto L84
            x00.l<T, java.lang.Boolean> r9 = r7.confirmValueChange
            java.lang.Object r9 = r9.invoke(r8)
            java.lang.Boolean r9 = (java.lang.Boolean) r9
            boolean r9 = r9.booleanValue()
            if (r9 == 0) goto L84
            r7.setCurrentValue(r8)
        L84:
            yz.g2 r7 = yz.g2.f100423a
            return r7
        L87:
            r8 = move-exception
            r7 = r6
        L89:
            androidx.compose.material.DraggableAnchors r9 = r7.getAnchors()
            float r0 = r7.getOffset()
            java.lang.Object r9 = r9.closestAnchor(r0)
            if (r9 == 0) goto Lbd
            float r0 = r7.getOffset()
            androidx.compose.material.DraggableAnchors r1 = r7.getAnchors()
            float r1 = r1.positionOf(r9)
            float r0 = r0 - r1
            float r0 = java.lang.Math.abs(r0)
            int r0 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r0 > 0) goto Lbd
            x00.l<T, java.lang.Boolean> r0 = r7.confirmValueChange
            java.lang.Object r0 = r0.invoke(r9)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto Lbd
            r7.setCurrentValue(r9)
        Lbd:
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.AnchoredDraggableState.anchoredDrag(androidx.compose.foundation.MutatePriority, x00.q, j00.c):java.lang.Object");
    }

    public final float dispatchRawDelta(float f11) {
        float newOffsetForDelta$material_release = newOffsetForDelta$material_release(f11);
        float offset = Float.isNaN(getOffset()) ? 0.0f : getOffset();
        setOffset(newOffsetForDelta$material_release);
        return newOffsetForDelta$material_release - offset;
    }

    @k
    public final DraggableAnchors<T> getAnchors() {
        return (DraggableAnchors) this.anchors$delegate.getValue();
    }

    @k
    public final AnimationSpec<Float> getAnimationSpec() {
        return this.animationSpec;
    }

    public final T getClosestValue$material_release() {
        return (T) this.closestValue$delegate.getValue();
    }

    @k
    public final l<T, Boolean> getConfirmValueChange$material_release() {
        return this.confirmValueChange;
    }

    public final T getCurrentValue() {
        return this.currentValue$delegate.getValue();
    }

    @k
    public final DraggableState getDraggableState$material_release() {
        return this.draggableState;
    }

    public final float getLastVelocity() {
        return this.lastVelocity$delegate.getFloatValue();
    }

    public final float getOffset() {
        return this.offset$delegate.getFloatValue();
    }

    @k
    public final l<Float, Float> getPositionalThreshold$material_release() {
        return this.positionalThreshold;
    }

    @FloatRange(from = 0.0d, to = 1.0d)
    public final float getProgress() {
        return ((Number) this.progress$delegate.getValue()).floatValue();
    }

    public final T getTargetValue() {
        return (T) this.targetValue$delegate.getValue();
    }

    @k
    public final a<Float> getVelocityThreshold$material_release() {
        return this.velocityThreshold;
    }

    public final boolean isAnimationRunning() {
        return getDragTarget() != null;
    }

    public final float newOffsetForDelta$material_release(float f11) {
        return u.H((Float.isNaN(getOffset()) ? 0.0f : getOffset()) + f11, getAnchors().minAnchor(), getAnchors().maxAnchor());
    }

    public final float requireOffset() {
        if (Float.isNaN(getOffset())) {
            throw new IllegalStateException("The offset was read before being initialized. Did you access the offset in a phase before layout, like effects or composition?");
        }
        return getOffset();
    }

    @m80.l
    public final Object settle(float f11, @k c<? super g2> cVar) {
        T currentValue = getCurrentValue();
        T computeTarget = computeTarget(requireOffset(), currentValue, f11);
        if (this.confirmValueChange.invoke(computeTarget).booleanValue()) {
            Object animateTo = AnchoredDraggableKt.animateTo(this, computeTarget, f11, cVar);
            return animateTo == b.l() ? animateTo : g2.f100423a;
        }
        Object animateTo2 = AnchoredDraggableKt.animateTo(this, currentValue, f11, cVar);
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

    public static /* synthetic */ Object anchoredDrag$default(AnchoredDraggableState anchoredDraggableState, Object obj, MutatePriority mutatePriority, r rVar, c cVar, int i11, Object obj2) {
        if ((i11 & 2) != 0) {
            mutatePriority = MutatePriority.Default;
        }
        return anchoredDraggableState.anchoredDrag(obj, mutatePriority, rVar, cVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    @m80.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object anchoredDrag(T r7, @m80.k androidx.compose.foundation.MutatePriority r8, @m80.k x00.r<? super androidx.compose.material.AnchoredDragScope, ? super androidx.compose.material.DraggableAnchors<T>, ? super T, ? super j00.c<? super yz.g2>, ? extends java.lang.Object> r9, @m80.k j00.c<? super yz.g2> r10) {
        /*
            r6 = this;
            boolean r0 = r10 instanceof androidx.compose.material.AnchoredDraggableState$anchoredDrag$3
            if (r0 == 0) goto L13
            r0 = r10
            androidx.compose.material.AnchoredDraggableState$anchoredDrag$3 r0 = (androidx.compose.material.AnchoredDraggableState$anchoredDrag$3) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            androidx.compose.material.AnchoredDraggableState$anchoredDrag$3 r0 = new androidx.compose.material.AnchoredDraggableState$anchoredDrag$3
            r0.<init>(r6, r10)
        L18:
            java.lang.Object r10 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
            int r2 = r0.label
            r3 = 1056964608(0x3f000000, float:0.5)
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L3a
            if (r2 != r4) goto L32
            java.lang.Object r7 = r0.L$0
            androidx.compose.material.AnchoredDraggableState r7 = (androidx.compose.material.AnchoredDraggableState) r7
            kotlin.e.n(r10)     // Catch: java.lang.Throwable -> L30
            goto L5a
        L30:
            r8 = move-exception
            goto L94
        L32:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L3a:
            kotlin.e.n(r10)
            androidx.compose.material.DraggableAnchors r10 = r6.getAnchors()
            boolean r10 = r10.hasAnchorFor(r7)
            if (r10 == 0) goto Lcc
            androidx.compose.material.InternalMutatorMutex r10 = r6.dragMutex     // Catch: java.lang.Throwable -> L92
            androidx.compose.material.AnchoredDraggableState$anchoredDrag$4 r2 = new androidx.compose.material.AnchoredDraggableState$anchoredDrag$4     // Catch: java.lang.Throwable -> L92
            r2.<init>(r6, r7, r9, r5)     // Catch: java.lang.Throwable -> L92
            r0.L$0 = r6     // Catch: java.lang.Throwable -> L92
            r0.label = r4     // Catch: java.lang.Throwable -> L92
            java.lang.Object r7 = r10.mutate(r8, r2, r0)     // Catch: java.lang.Throwable -> L92
            if (r7 != r1) goto L59
            return r1
        L59:
            r7 = r6
        L5a:
            r7.setDragTarget(r5)
            androidx.compose.material.DraggableAnchors r8 = r7.getAnchors()
            float r9 = r7.getOffset()
            java.lang.Object r8 = r8.closestAnchor(r9)
            if (r8 == 0) goto Lcf
            float r9 = r7.getOffset()
            androidx.compose.material.DraggableAnchors r10 = r7.getAnchors()
            float r10 = r10.positionOf(r8)
            float r9 = r9 - r10
            float r9 = java.lang.Math.abs(r9)
            int r9 = (r9 > r3 ? 1 : (r9 == r3 ? 0 : -1))
            if (r9 > 0) goto Lcf
            x00.l<T, java.lang.Boolean> r9 = r7.confirmValueChange
            java.lang.Object r9 = r9.invoke(r8)
            java.lang.Boolean r9 = (java.lang.Boolean) r9
            boolean r9 = r9.booleanValue()
            if (r9 == 0) goto Lcf
            r7.setCurrentValue(r8)
            goto Lcf
        L92:
            r8 = move-exception
            r7 = r6
        L94:
            r7.setDragTarget(r5)
            androidx.compose.material.DraggableAnchors r9 = r7.getAnchors()
            float r10 = r7.getOffset()
            java.lang.Object r9 = r9.closestAnchor(r10)
            if (r9 == 0) goto Lcb
            float r10 = r7.getOffset()
            androidx.compose.material.DraggableAnchors r0 = r7.getAnchors()
            float r0 = r0.positionOf(r9)
            float r10 = r10 - r0
            float r10 = java.lang.Math.abs(r10)
            int r10 = (r10 > r3 ? 1 : (r10 == r3 ? 0 : -1))
            if (r10 > 0) goto Lcb
            x00.l<T, java.lang.Boolean> r10 = r7.confirmValueChange
            java.lang.Object r10 = r10.invoke(r9)
            java.lang.Boolean r10 = (java.lang.Boolean) r10
            boolean r10 = r10.booleanValue()
            if (r10 == 0) goto Lcb
            r7.setCurrentValue(r9)
        Lcb:
            throw r8
        Lcc:
            r6.setCurrentValue(r7)
        Lcf:
            yz.g2 r7 = yz.g2.f100423a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.AnchoredDraggableState.anchoredDrag(java.lang.Object, androidx.compose.foundation.MutatePriority, x00.r, j00.c):java.lang.Object");
    }

    public /* synthetic */ AnchoredDraggableState(Object obj, l lVar, a aVar, AnimationSpec animationSpec, l lVar2, int i11, v vVar) {
        this(obj, lVar, aVar, animationSpec, (i11 & 16) != 0 ? new l<T, Boolean>() { // from class: androidx.compose.material.AnchoredDraggableState.1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // x00.l
            public final Boolean invoke(T t11) {
                return Boolean.TRUE;
            }

            @Override // x00.l
            public /* bridge */ /* synthetic */ Boolean invoke(Object obj2) {
                return invoke((AnonymousClass1) obj2);
            }
        } : lVar2);
    }

    public /* synthetic */ AnchoredDraggableState(Object obj, DraggableAnchors draggableAnchors, l lVar, a aVar, AnimationSpec animationSpec, l lVar2, int i11, v vVar) {
        this(obj, draggableAnchors, lVar, aVar, animationSpec, (i11 & 32) != 0 ? new l<T, Boolean>() { // from class: androidx.compose.material.AnchoredDraggableState.2
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // x00.l
            public final Boolean invoke(T t11) {
                return Boolean.TRUE;
            }

            @Override // x00.l
            public /* bridge */ /* synthetic */ Boolean invoke(Object obj2) {
                return invoke((AnonymousClass2) obj2);
            }
        } : lVar2);
    }

    @ExperimentalMaterialApi
    public AnchoredDraggableState(T t11, @k DraggableAnchors<T> draggableAnchors, @k l<? super Float, Float> lVar, @k a<Float> aVar, @k AnimationSpec<Float> animationSpec, @k l<? super T, Boolean> lVar2) {
        this(t11, lVar, aVar, animationSpec, lVar2);
        setAnchors(draggableAnchors);
        trySnapTo(t11);
    }
}
