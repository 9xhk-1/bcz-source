package androidx.compose.foundation.gestures;

import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.animation.core.DecayAnimationSpec;
import j00.c;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.u0;
import l00.d;
import x00.r;
import yz.g2;

/* JADX INFO: Add missing generic type declarations: [T] */
/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@d(c = "androidx.compose.foundation.gestures.AnchoredDraggableKt$animateToWithDecay$2", f = "AnchoredDraggable.kt", i = {}, l = {1391, 1409, 1433}, m = "invokeSuspend", n = {}, s = {})
@u0({"SMAP\nAnchoredDraggable.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AnchoredDraggable.kt\nandroidx/compose/foundation/gestures/AnchoredDraggableKt$animateToWithDecay$2\n+ 2 AnchoredDraggable.kt\nandroidx/compose/foundation/gestures/AnchoredDraggableKt\n*L\n1#1,1753:1\n1749#2,4:1754\n1749#2,4:1758\n*S KotlinDebug\n*F\n+ 1 AnchoredDraggable.kt\nandroidx/compose/foundation/gestures/AnchoredDraggableKt$animateToWithDecay$2\n*L\n1396#1:1754,4\n1408#1:1758,4\n*E\n"})
/* loaded from: classes.dex */
public final class AnchoredDraggableKt$animateToWithDecay$2<T> extends SuspendLambda implements r<AnchoredDragScope, DraggableAnchors<T>, T, c<? super g2>, Object> {
    final /* synthetic */ DecayAnimationSpec<Float> $decayAnimationSpec;
    final /* synthetic */ Ref.FloatRef $remainingVelocity;
    final /* synthetic */ AnimationSpec<Float> $snapAnimationSpec;
    final /* synthetic */ AnchoredDraggableState<T> $this_animateToWithDecay;
    final /* synthetic */ float $velocity;
    private /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    /* synthetic */ Object L$2;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AnchoredDraggableKt$animateToWithDecay$2(AnchoredDraggableState<T> anchoredDraggableState, float f11, AnimationSpec<Float> animationSpec, Ref.FloatRef floatRef, DecayAnimationSpec<Float> decayAnimationSpec, c<? super AnchoredDraggableKt$animateToWithDecay$2> cVar) {
        super(4, cVar);
        this.$this_animateToWithDecay = anchoredDraggableState;
        this.$velocity = f11;
        this.$snapAnimationSpec = animationSpec;
        this.$remainingVelocity = floatRef;
        this.$decayAnimationSpec = decayAnimationSpec;
    }

    public final Object invoke(AnchoredDragScope anchoredDragScope, DraggableAnchors<T> draggableAnchors, T t11, c<? super g2> cVar) {
        AnchoredDraggableKt$animateToWithDecay$2 anchoredDraggableKt$animateToWithDecay$2 = new AnchoredDraggableKt$animateToWithDecay$2(this.$this_animateToWithDecay, this.$velocity, this.$snapAnimationSpec, this.$remainingVelocity, this.$decayAnimationSpec, cVar);
        anchoredDraggableKt$animateToWithDecay$2.L$0 = anchoredDragScope;
        anchoredDraggableKt$animateToWithDecay$2.L$1 = draggableAnchors;
        anchoredDraggableKt$animateToWithDecay$2.L$2 = t11;
        return anchoredDraggableKt$animateToWithDecay$2.invokeSuspend(g2.f100423a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x00d5, code lost:
    
        if (r0 != r7) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00bd, code lost:
    
        if (androidx.compose.animation.core.SuspendAnimationKt.animateDecay$default(r1, r1, false, r3, r24, 2, null) != r7) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00ed, code lost:
    
        if (r0 == r7) goto L44;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r25) {
        /*
            Method dump skipped, instructions count: 247
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.AnchoredDraggableKt$animateToWithDecay$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // x00.r
    public /* bridge */ /* synthetic */ Object invoke(AnchoredDragScope anchoredDragScope, Object obj, Object obj2, c<? super g2> cVar) {
        return invoke(anchoredDragScope, (DraggableAnchors<DraggableAnchors<T>>) obj, (DraggableAnchors<T>) obj2, cVar);
    }
}
