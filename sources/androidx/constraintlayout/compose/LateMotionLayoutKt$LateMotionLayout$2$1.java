package androidx.constraintlayout.compose;

import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.animation.core.AnimationVector1D;
import androidx.compose.runtime.MutableIntState;
import androidx.compose.runtime.MutableState;
import androidx.compose.ui.node.Ref;
import c40.r0;
import e40.o;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import l00.d;
import x00.p;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@d(c = "androidx.constraintlayout.compose.LateMotionLayoutKt$LateMotionLayout$2$1", f = "LateMotionLayout.kt", i = {}, l = {87, 100}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes2.dex */
public final class LateMotionLayoutKt$LateMotionLayout$2$1 extends SuspendLambda implements p<r0, j00.c<? super g2>, Object> {
    final /* synthetic */ Animatable<Float, AnimationVector1D> $animatableProgress;
    final /* synthetic */ AnimationSpec<Float> $animationSpec;
    final /* synthetic */ o<ConstraintSet> $channel;
    final /* synthetic */ Ref<CompositionSource> $compositionSource;
    final /* synthetic */ MutableIntState $direction;
    final /* synthetic */ MutableState<ConstraintSet> $end;
    final /* synthetic */ x00.a<g2> $finishedAnimationListener;
    final /* synthetic */ MutableState<ConstraintSet> $start;
    Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LateMotionLayoutKt$LateMotionLayout$2$1(o<ConstraintSet> oVar, MutableIntState mutableIntState, MutableState<ConstraintSet> mutableState, MutableState<ConstraintSet> mutableState2, Ref<CompositionSource> ref, Animatable<Float, AnimationVector1D> animatable, AnimationSpec<Float> animationSpec, x00.a<g2> aVar, j00.c<? super LateMotionLayoutKt$LateMotionLayout$2$1> cVar) {
        super(2, cVar);
        this.$channel = oVar;
        this.$direction = mutableIntState;
        this.$start = mutableState;
        this.$end = mutableState2;
        this.$compositionSource = ref;
        this.$animatableProgress = animatable;
        this.$animationSpec = animationSpec;
        this.$finishedAnimationListener = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final j00.c<g2> create(Object obj, j00.c<?> cVar) {
        return new LateMotionLayoutKt$LateMotionLayout$2$1(this.$channel, this.$direction, this.$start, this.$end, this.$compositionSource, this.$animatableProgress, this.$animationSpec, this.$finishedAnimationListener, cVar);
    }

    @Override // x00.p
    public final Object invoke(r0 r0Var, j00.c<? super g2> cVar) {
        return ((LateMotionLayoutKt$LateMotionLayout$2$1) create(r0Var, cVar)).invokeSuspend(g2.f100423a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x00b1, code lost:
    
        if (androidx.compose.animation.core.Animatable.animateTo$default(r5, r6, r7, null, null, r10, 12, null) == r0) goto L35;
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00cf  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:33:0x00b1 -> B:6:0x0016). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:35:0x00cb -> B:12:0x0032). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r15) {
        /*
            r14 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.b.l()
            int r1 = r14.label
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L29
            if (r1 == r3) goto L21
            if (r1 != r2) goto L19
            java.lang.Object r1 = r14.L$0
            e40.q r1 = (e40.q) r1
            kotlin.e.n(r15)
            r10 = r14
        L16:
            r15 = r1
            goto Lb4
        L19:
            java.lang.IllegalStateException r15 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r15.<init>(r0)
            throw r15
        L21:
            java.lang.Object r1 = r14.L$0
            e40.q r1 = (e40.q) r1
            kotlin.e.n(r15)
            goto L42
        L29:
            kotlin.e.n(r15)
            e40.o<androidx.constraintlayout.compose.ConstraintSet> r15 = r14.$channel
            e40.q r15 = r15.iterator()
        L32:
            r14.L$0 = r15
            r14.label = r3
            java.lang.Object r1 = r15.a(r14)
            if (r1 != r0) goto L3f
            r10 = r14
            goto Lb3
        L3f:
            r13 = r1
            r1 = r15
            r15 = r13
        L42:
            java.lang.Boolean r15 = (java.lang.Boolean) r15
            boolean r15 = r15.booleanValue()
            if (r15 == 0) goto Lcf
            java.lang.Object r15 = r1.next()
            androidx.constraintlayout.compose.ConstraintSet r15 = (androidx.constraintlayout.compose.ConstraintSet) r15
            e40.o<androidx.constraintlayout.compose.ConstraintSet> r4 = r14.$channel
            java.lang.Object r4 = r4.O()
            java.lang.Object r4 = e40.s.h(r4)
            androidx.constraintlayout.compose.ConstraintSet r4 = (androidx.constraintlayout.compose.ConstraintSet) r4
            if (r4 != 0) goto L5f
            goto L60
        L5f:
            r15 = r4
        L60:
            androidx.compose.runtime.MutableIntState r4 = r14.$direction
            int r4 = r4.getIntValue()
            if (r4 != r3) goto L71
            androidx.compose.runtime.MutableState<androidx.constraintlayout.compose.ConstraintSet> r4 = r14.$start
        L6a:
            java.lang.Object r4 = r4.getValue()
            androidx.constraintlayout.compose.ConstraintSet r4 = (androidx.constraintlayout.compose.ConstraintSet) r4
            goto L74
        L71:
            androidx.compose.runtime.MutableState<androidx.constraintlayout.compose.ConstraintSet> r4 = r14.$end
            goto L6a
        L74:
            boolean r4 = kotlin.jvm.internal.g0.g(r15, r4)
            if (r4 != 0) goto Lcb
            androidx.compose.runtime.MutableIntState r4 = r14.$direction
            int r4 = r4.getIntValue()
            if (r4 != r3) goto L88
            androidx.compose.runtime.MutableState<androidx.constraintlayout.compose.ConstraintSet> r4 = r14.$end
            r4.setValue(r15)
            goto L8d
        L88:
            androidx.compose.runtime.MutableState<androidx.constraintlayout.compose.ConstraintSet> r4 = r14.$start
            r4.setValue(r15)
        L8d:
            androidx.compose.ui.node.Ref<androidx.constraintlayout.compose.CompositionSource> r15 = r14.$compositionSource
            androidx.constraintlayout.compose.CompositionSource r4 = androidx.constraintlayout.compose.CompositionSource.Content
            r15.setValue(r4)
            androidx.compose.animation.core.Animatable<java.lang.Float, androidx.compose.animation.core.AnimationVector1D> r5 = r14.$animatableProgress
            androidx.compose.runtime.MutableIntState r15 = r14.$direction
            int r15 = r15.getIntValue()
            float r15 = (float) r15
            java.lang.Float r6 = l00.a.e(r15)
            androidx.compose.animation.core.AnimationSpec<java.lang.Float> r7 = r14.$animationSpec
            r14.L$0 = r1
            r14.label = r2
            r8 = 0
            r9 = 0
            r11 = 12
            r12 = 0
            r10 = r14
            java.lang.Object r15 = androidx.compose.animation.core.Animatable.animateTo$default(r5, r6, r7, r8, r9, r10, r11, r12)
            if (r15 != r0) goto L16
        Lb3:
            return r0
        Lb4:
            androidx.compose.runtime.MutableIntState r1 = r10.$direction
            int r4 = r1.getIntValue()
            if (r4 != r3) goto Lbe
            r4 = 0
            goto Lbf
        Lbe:
            r4 = r3
        Lbf:
            r1.setIntValue(r4)
            x00.a<yz.g2> r1 = r10.$finishedAnimationListener
            if (r1 == 0) goto L32
            r1.invoke()
            goto L32
        Lcb:
            r10 = r14
            r15 = r1
            goto L32
        Lcf:
            r10 = r14
            yz.g2 r15 = yz.g2.f100423a
            return r15
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.compose.LateMotionLayoutKt$LateMotionLayout$2$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
