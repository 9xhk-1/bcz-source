package androidx.navigation.compose;

import androidx.compose.animation.core.SeekableTransitionState;
import androidx.compose.animation.core.Transition;
import androidx.navigation.NavBackStackEntry;
import c40.r0;
import j00.c;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import l00.d;
import x00.p;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@d(c = "androidx.navigation.compose.NavHostKt$NavHost$29$1", f = "NavHost.kt", i = {}, l = {628, 635}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes3.dex */
public final class NavHostKt$NavHost$29$1 extends SuspendLambda implements p<r0, c<? super g2>, Object> {
    final /* synthetic */ NavBackStackEntry $backStackEntry;
    final /* synthetic */ Transition<NavBackStackEntry> $transition;
    final /* synthetic */ SeekableTransitionState<NavBackStackEntry> $transitionState;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NavHostKt$NavHost$29$1(SeekableTransitionState<NavBackStackEntry> seekableTransitionState, NavBackStackEntry navBackStackEntry, Transition<NavBackStackEntry> transition, c<? super NavHostKt$NavHost$29$1> cVar) {
        super(2, cVar);
        this.$transitionState = seekableTransitionState;
        this.$backStackEntry = navBackStackEntry;
        this.$transition = transition;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final c<g2> create(Object obj, c<?> cVar) {
        NavHostKt$NavHost$29$1 navHostKt$NavHost$29$1 = new NavHostKt$NavHost$29$1(this.$transitionState, this.$backStackEntry, this.$transition, cVar);
        navHostKt$NavHost$29$1.L$0 = obj;
        return navHostKt$NavHost$29$1;
    }

    @Override // x00.p
    public final Object invoke(r0 r0Var, c<? super g2> cVar) {
        return ((NavHostKt$NavHost$29$1) create(r0Var, cVar)).invokeSuspend(g2.f100423a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0043, code lost:
    
        if (androidx.compose.animation.core.SeekableTransitionState.animateTo$default(r4, r5, null, r10, 2, null) == r0) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x007d, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x007b, code lost:
    
        if (androidx.compose.animation.core.SuspendAnimationKt.animate$default(r1, 0.0f, 0.0f, r4, r5, r10, 4, null) == r0) goto L17;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r11) {
        /*
            r10 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.b.l()
            int r1 = r10.label
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L1f
            if (r1 == r3) goto L1a
            if (r1 != r2) goto L12
            kotlin.e.n(r11)
            goto L7e
        L12:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r0)
            throw r11
        L1a:
            kotlin.e.n(r11)
            r6 = r10
            goto L7e
        L1f:
            kotlin.e.n(r11)
            java.lang.Object r11 = r10.L$0
            c40.r0 r11 = (c40.r0) r11
            androidx.compose.animation.core.SeekableTransitionState<androidx.navigation.NavBackStackEntry> r1 = r10.$transitionState
            java.lang.Object r1 = r1.getCurrentState()
            androidx.navigation.NavBackStackEntry r4 = r10.$backStackEntry
            boolean r1 = kotlin.jvm.internal.g0.g(r1, r4)
            if (r1 != 0) goto L46
            androidx.compose.animation.core.SeekableTransitionState<androidx.navigation.NavBackStackEntry> r4 = r10.$transitionState
            androidx.navigation.NavBackStackEntry r5 = r10.$backStackEntry
            r10.label = r3
            r6 = 0
            r8 = 2
            r9 = 0
            r7 = r10
            java.lang.Object r11 = androidx.compose.animation.core.SeekableTransitionState.animateTo$default(r4, r5, r6, r7, r8, r9)
            r6 = r7
            if (r11 != r0) goto L7e
            goto L7d
        L46:
            r6 = r10
            androidx.compose.animation.core.Transition<androidx.navigation.NavBackStackEntry> r1 = r6.$transition
            long r3 = r1.getTotalDurationNanos()
            r1 = 1000000(0xf4240, float:1.401298E-39)
            long r7 = (long) r1
            long r3 = r3 / r7
            androidx.compose.animation.core.SeekableTransitionState<androidx.navigation.NavBackStackEntry> r1 = r6.$transitionState
            float r1 = r1.getFraction()
            androidx.compose.animation.core.SeekableTransitionState<androidx.navigation.NavBackStackEntry> r5 = r6.$transitionState
            float r5 = r5.getFraction()
            float r3 = (float) r3
            float r5 = r5 * r3
            int r3 = (int) r5
            r4 = 0
            r5 = 6
            r7 = 0
            androidx.compose.animation.core.TweenSpec r4 = androidx.compose.animation.core.AnimationSpecKt.tween$default(r3, r4, r7, r5, r7)
            androidx.navigation.compose.NavHostKt$NavHost$29$1$1 r5 = new androidx.navigation.compose.NavHostKt$NavHost$29$1$1
            androidx.compose.animation.core.SeekableTransitionState<androidx.navigation.NavBackStackEntry> r3 = r6.$transitionState
            androidx.navigation.NavBackStackEntry r7 = r6.$backStackEntry
            r5.<init>()
            r6.label = r2
            r2 = 0
            r3 = 0
            r7 = 4
            r8 = 0
            java.lang.Object r11 = androidx.compose.animation.core.SuspendAnimationKt.animate$default(r1, r2, r3, r4, r5, r6, r7, r8)
            if (r11 != r0) goto L7e
        L7d:
            return r0
        L7e:
            yz.g2 r11 = yz.g2.f100423a
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.navigation.compose.NavHostKt$NavHost$29$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
