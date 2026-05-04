package androidx.compose.foundation.lazy.layout;

import androidx.compose.animation.core.FiniteAnimationSpec;
import androidx.compose.ui.graphics.layer.GraphicsLayer;
import c40.r0;
import j00.c;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import l00.d;
import x00.p;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@d(c = "androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimation$animateAppearance$2", f = "LazyLayoutItemAnimation.kt", i = {}, l = {183, 185}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes.dex */
public final class LazyLayoutItemAnimation$animateAppearance$2 extends SuspendLambda implements p<r0, c<? super g2>, Object> {
    final /* synthetic */ GraphicsLayer $layer;
    final /* synthetic */ boolean $shouldResetValue;
    final /* synthetic */ FiniteAnimationSpec<Float> $spec;
    int label;
    final /* synthetic */ LazyLayoutItemAnimation this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LazyLayoutItemAnimation$animateAppearance$2(boolean z11, LazyLayoutItemAnimation lazyLayoutItemAnimation, FiniteAnimationSpec<Float> finiteAnimationSpec, GraphicsLayer graphicsLayer, c<? super LazyLayoutItemAnimation$animateAppearance$2> cVar) {
        super(2, cVar);
        this.$shouldResetValue = z11;
        this.this$0 = lazyLayoutItemAnimation;
        this.$spec = finiteAnimationSpec;
        this.$layer = graphicsLayer;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final c<g2> create(Object obj, c<?> cVar) {
        return new LazyLayoutItemAnimation$animateAppearance$2(this.$shouldResetValue, this.this$0, this.$spec, this.$layer, cVar);
    }

    @Override // x00.p
    public final Object invoke(r0 r0Var, c<? super g2> cVar) {
        return ((LazyLayoutItemAnimation$animateAppearance$2) create(r0Var, cVar)).invokeSuspend(g2.f100423a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0061, code lost:
    
        if (androidx.compose.animation.core.Animatable.animateTo$default(r4, r5, r6, null, r8, r9, 4, null) == r0) goto L24;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r13) {
        /*
            r12 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.b.l()
            int r1 = r12.label
            r2 = 0
            r3 = 2
            r4 = 1
            if (r1 == 0) goto L24
            if (r1 == r4) goto L20
            if (r1 != r3) goto L18
            kotlin.e.n(r13)     // Catch: java.lang.Throwable -> L14
            r9 = r12
            goto L64
        L14:
            r0 = move-exception
            r13 = r0
            r9 = r12
            goto L72
        L18:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r0)
            throw r13
        L20:
            kotlin.e.n(r13)     // Catch: java.lang.Throwable -> L14
            goto L40
        L24:
            kotlin.e.n(r13)
            boolean r13 = r12.$shouldResetValue     // Catch: java.lang.Throwable -> L6f
            if (r13 == 0) goto L40
            androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimation r13 = r12.this$0     // Catch: java.lang.Throwable -> L14
            androidx.compose.animation.core.Animatable r13 = androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimation.access$getVisibilityAnimation$p(r13)     // Catch: java.lang.Throwable -> L14
            r1 = 0
            java.lang.Float r1 = l00.a.e(r1)     // Catch: java.lang.Throwable -> L14
            r12.label = r4     // Catch: java.lang.Throwable -> L14
            java.lang.Object r13 = r13.snapTo(r1, r12)     // Catch: java.lang.Throwable -> L14
            if (r13 != r0) goto L40
            r9 = r12
            goto L63
        L40:
            androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimation r13 = r12.this$0     // Catch: java.lang.Throwable -> L6f
            androidx.compose.animation.core.Animatable r4 = androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimation.access$getVisibilityAnimation$p(r13)     // Catch: java.lang.Throwable -> L6f
            r13 = 1065353216(0x3f800000, float:1.0)
            java.lang.Float r5 = l00.a.e(r13)     // Catch: java.lang.Throwable -> L6f
            androidx.compose.animation.core.FiniteAnimationSpec<java.lang.Float> r6 = r12.$spec     // Catch: java.lang.Throwable -> L6f
            androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimation$animateAppearance$2$1 r8 = new androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimation$animateAppearance$2$1     // Catch: java.lang.Throwable -> L6f
            androidx.compose.ui.graphics.layer.GraphicsLayer r13 = r12.$layer     // Catch: java.lang.Throwable -> L6f
            androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimation r1 = r12.this$0     // Catch: java.lang.Throwable -> L6f
            r8.<init>()     // Catch: java.lang.Throwable -> L6f
            r12.label = r3     // Catch: java.lang.Throwable -> L6f
            r7 = 0
            r10 = 4
            r11 = 0
            r9 = r12
            java.lang.Object r13 = androidx.compose.animation.core.Animatable.animateTo$default(r4, r5, r6, r7, r8, r9, r10, r11)     // Catch: java.lang.Throwable -> L6c
            if (r13 != r0) goto L64
        L63:
            return r0
        L64:
            androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimation r13 = r9.this$0
            androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimation.access$setAppearanceAnimationInProgress(r13, r2)
            yz.g2 r13 = yz.g2.f100423a
            return r13
        L6c:
            r0 = move-exception
        L6d:
            r13 = r0
            goto L72
        L6f:
            r0 = move-exception
            r9 = r12
            goto L6d
        L72:
            androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimation r0 = r9.this$0
            androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimation.access$setAppearanceAnimationInProgress(r0, r2)
            throw r13
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimation$animateAppearance$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
