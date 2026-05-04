package androidx.constraintlayout.compose;

import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.animation.core.AnimationVector1D;
import androidx.compose.runtime.MutableState;
import c40.r0;
import e40.o;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import l00.d;
import x00.p;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@d(c = "androidx.constraintlayout.compose.MotionLayoutKt$MotionLayoutCore$3$1", f = "MotionLayout.kt", i = {}, l = {475, 485}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes2.dex */
public final class MotionLayoutKt$MotionLayoutCore$3$1 extends SuspendLambda implements p<r0, j00.c<? super g2>, Object> {
    final /* synthetic */ MutableState<Boolean> $animateToEnd$delegate;
    final /* synthetic */ AnimationSpec<Float> $animationSpec;
    final /* synthetic */ o<ConstraintSet> $channel;
    final /* synthetic */ MutableState<ConstraintSet> $end$delegate;
    final /* synthetic */ x00.a<g2> $finishedAnimationListener;
    final /* synthetic */ Animatable<Float, AnimationVector1D> $progress;
    final /* synthetic */ MutableState<ConstraintSet> $start$delegate;
    Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MotionLayoutKt$MotionLayoutCore$3$1(o<ConstraintSet> oVar, Animatable<Float, AnimationVector1D> animatable, AnimationSpec<Float> animationSpec, x00.a<g2> aVar, MutableState<Boolean> mutableState, MutableState<ConstraintSet> mutableState2, MutableState<ConstraintSet> mutableState3, j00.c<? super MotionLayoutKt$MotionLayoutCore$3$1> cVar) {
        super(2, cVar);
        this.$channel = oVar;
        this.$progress = animatable;
        this.$animationSpec = animationSpec;
        this.$finishedAnimationListener = aVar;
        this.$animateToEnd$delegate = mutableState;
        this.$start$delegate = mutableState2;
        this.$end$delegate = mutableState3;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final j00.c<g2> create(Object obj, j00.c<?> cVar) {
        return new MotionLayoutKt$MotionLayoutCore$3$1(this.$channel, this.$progress, this.$animationSpec, this.$finishedAnimationListener, this.$animateToEnd$delegate, this.$start$delegate, this.$end$delegate, cVar);
    }

    @Override // x00.p
    public final Object invoke(r0 r0Var, j00.c<? super g2> cVar) {
        return ((MotionLayoutKt$MotionLayoutCore$3$1) create(r0Var, cVar)).invokeSuspend(g2.f100423a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x003a, code lost:
    
        if (r1 != r8) goto L10;
     */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00be  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:29:0x00af -> B:6:0x00b0). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:31:0x00c3 -> B:8:0x0032). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r13) {
        /*
            r12 = this;
            java.lang.Object r8 = kotlin.coroutines.intrinsics.b.l()
            int r0 = r12.label
            r9 = 2
            r10 = 1
            if (r0 == 0) goto L29
            if (r0 == r10) goto L1f
            if (r0 != r9) goto L17
            java.lang.Object r0 = r12.L$0
            e40.q r0 = (e40.q) r0
            kotlin.e.n(r13)
            goto Lb0
        L17:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L1f:
            java.lang.Object r0 = r12.L$0
            e40.q r0 = (e40.q) r0
            kotlin.e.n(r13)
            r1 = r13
        L27:
            r11 = r0
            goto L3e
        L29:
            kotlin.e.n(r13)
            e40.o<androidx.constraintlayout.compose.ConstraintSet> r0 = r12.$channel
            e40.q r0 = r0.iterator()
        L32:
            r12.L$0 = r0
            r12.label = r10
            java.lang.Object r1 = r0.a(r12)
            if (r1 != r8) goto L27
            goto Lae
        L3e:
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r0 = r1.booleanValue()
            if (r0 == 0) goto Lc6
            java.lang.Object r0 = r11.next()
            androidx.constraintlayout.compose.ConstraintSet r0 = (androidx.constraintlayout.compose.ConstraintSet) r0
            e40.o<androidx.constraintlayout.compose.ConstraintSet> r1 = r12.$channel
            java.lang.Object r1 = r1.O()
            java.lang.Object r1 = e40.s.h(r1)
            androidx.constraintlayout.compose.ConstraintSet r1 = (androidx.constraintlayout.compose.ConstraintSet) r1
            if (r1 != 0) goto L5b
            goto L5c
        L5b:
            r0 = r1
        L5c:
            androidx.compose.runtime.MutableState<java.lang.Boolean> r1 = r12.$animateToEnd$delegate
            boolean r1 = androidx.constraintlayout.compose.MotionLayoutKt.access$MotionLayoutCore_TEds9UA$lambda$23(r1)
            if (r1 == 0) goto L67
            r1 = 1065353216(0x3f800000, float:1.0)
            goto L68
        L67:
            r1 = 0
        L68:
            androidx.compose.runtime.MutableState<java.lang.Boolean> r2 = r12.$animateToEnd$delegate
            boolean r2 = androidx.constraintlayout.compose.MotionLayoutKt.access$MotionLayoutCore_TEds9UA$lambda$23(r2)
            if (r2 == 0) goto L77
            androidx.compose.runtime.MutableState<androidx.constraintlayout.compose.ConstraintSet> r2 = r12.$start$delegate
            androidx.constraintlayout.compose.ConstraintSet r2 = androidx.constraintlayout.compose.MotionLayoutKt.access$MotionLayoutCore_TEds9UA$lambda$14(r2)
            goto L7d
        L77:
            androidx.compose.runtime.MutableState<androidx.constraintlayout.compose.ConstraintSet> r2 = r12.$end$delegate
            androidx.constraintlayout.compose.ConstraintSet r2 = androidx.constraintlayout.compose.MotionLayoutKt.access$MotionLayoutCore_TEds9UA$lambda$17(r2)
        L7d:
            boolean r2 = kotlin.jvm.internal.g0.g(r0, r2)
            if (r2 != 0) goto Lc3
            androidx.compose.runtime.MutableState<java.lang.Boolean> r2 = r12.$animateToEnd$delegate
            boolean r2 = androidx.constraintlayout.compose.MotionLayoutKt.access$MotionLayoutCore_TEds9UA$lambda$23(r2)
            if (r2 == 0) goto L91
            androidx.compose.runtime.MutableState<androidx.constraintlayout.compose.ConstraintSet> r2 = r12.$end$delegate
            androidx.constraintlayout.compose.MotionLayoutKt.access$MotionLayoutCore_TEds9UA$lambda$18(r2, r0)
            goto L96
        L91:
            androidx.compose.runtime.MutableState<androidx.constraintlayout.compose.ConstraintSet> r2 = r12.$start$delegate
            androidx.constraintlayout.compose.MotionLayoutKt.access$MotionLayoutCore_TEds9UA$lambda$15(r2, r0)
        L96:
            androidx.compose.animation.core.Animatable<java.lang.Float, androidx.compose.animation.core.AnimationVector1D> r0 = r12.$progress
            java.lang.Float r1 = l00.a.e(r1)
            androidx.compose.animation.core.AnimationSpec<java.lang.Float> r2 = r12.$animationSpec
            r12.L$0 = r11
            r12.label = r9
            r3 = 0
            r4 = 0
            r6 = 12
            r7 = 0
            r5 = r12
            java.lang.Object r0 = androidx.compose.animation.core.Animatable.animateTo$default(r0, r1, r2, r3, r4, r5, r6, r7)
            if (r0 != r8) goto Laf
        Lae:
            return r8
        Laf:
            r0 = r11
        Lb0:
            androidx.compose.runtime.MutableState<java.lang.Boolean> r1 = r12.$animateToEnd$delegate
            boolean r2 = androidx.constraintlayout.compose.MotionLayoutKt.access$MotionLayoutCore_TEds9UA$lambda$23(r1)
            r2 = r2 ^ r10
            androidx.constraintlayout.compose.MotionLayoutKt.access$MotionLayoutCore_TEds9UA$lambda$24(r1, r2)
            x00.a<yz.g2> r1 = r12.$finishedAnimationListener
            if (r1 == 0) goto L32
            r1.invoke()
            goto L32
        Lc3:
            r0 = r11
            goto L32
        Lc6:
            yz.g2 r0 = yz.g2.f100423a
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.compose.MotionLayoutKt$MotionLayoutCore$3$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
