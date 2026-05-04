package androidx.compose.foundation;

import androidx.compose.runtime.SnapshotStateKt;
import c40.r0;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import x00.p;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@l00.d(c = "androidx.compose.foundation.MarqueeModifierNode$runAnimation$2", f = "BasicMarquee.kt", i = {}, l = {402}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes.dex */
public final class MarqueeModifierNode$runAnimation$2 extends SuspendLambda implements p<r0, j00.c<? super g2>, Object> {
    int label;
    final /* synthetic */ MarqueeModifierNode this$0;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "androidx.compose.foundation.MarqueeModifierNode$runAnimation$2$2", f = "BasicMarquee.kt", i = {0, 0}, l = {416, 418, 422, 422}, m = "invokeSuspend", n = {"contentWithSpacingWidth", "spec"}, s = {"L$0", "L$1"})
    /* renamed from: androidx.compose.foundation.MarqueeModifierNode$runAnimation$2$2, reason: invalid class name */
    public static final class AnonymousClass2 extends SuspendLambda implements p<Float, j00.c<? super g2>, Object> {
        /* synthetic */ Object L$0;
        Object L$1;
        int label;
        final /* synthetic */ MarqueeModifierNode this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(MarqueeModifierNode marqueeModifierNode, j00.c<? super AnonymousClass2> cVar) {
            super(2, cVar);
            this.this$0 = marqueeModifierNode;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final j00.c<g2> create(Object obj, j00.c<?> cVar) {
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.this$0, cVar);
            anonymousClass2.L$0 = obj;
            return anonymousClass2;
        }

        @Override // x00.p
        public final Object invoke(Float f11, j00.c<? super g2> cVar) {
            return ((AnonymousClass2) create(f11, cVar)).invokeSuspend(g2.f100423a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:18:0x00bb, code lost:
        
            if (r0.snapTo(r1, r20) == r8) goto L35;
         */
        /* JADX WARN: Code restructure failed: missing block: B:23:0x00a8, code lost:
        
            if (androidx.compose.animation.core.Animatable.animateTo$default(r3, r0, r2, null, null, r20, 12, null) == r8) goto L35;
         */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r21) {
            /*
                r20 = this;
                r5 = r20
                java.lang.Object r8 = kotlin.coroutines.intrinsics.b.l()
                int r0 = r5.label
                r9 = 4
                r10 = 3
                r1 = 2
                r2 = 1
                r11 = 0
                r12 = 0
                if (r0 == 0) goto L47
                if (r0 == r2) goto L36
                if (r0 == r1) goto L2e
                if (r0 == r10) goto L29
                if (r0 == r9) goto L20
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
                r0.<init>(r1)
                throw r0
            L20:
                java.lang.Object r0 = r5.L$0
                java.lang.Throwable r0 = (java.lang.Throwable) r0
                kotlin.e.n(r21)
                goto Ld8
            L29:
                kotlin.e.n(r21)
                goto Lbe
            L2e:
                kotlin.e.n(r21)     // Catch: java.lang.Throwable -> L33
                goto Lab
            L33:
                r0 = move-exception
                goto Lc1
            L36:
                java.lang.Object r0 = r5.L$1
                androidx.compose.animation.core.AnimationSpec r0 = (androidx.compose.animation.core.AnimationSpec) r0
                java.lang.Object r2 = r5.L$0
                java.lang.Float r2 = (java.lang.Float) r2
                kotlin.e.n(r21)
                r19 = r2
                r2 = r0
                r0 = r19
                goto L91
            L47:
                kotlin.e.n(r21)
                java.lang.Object r0 = r5.L$0
                java.lang.Float r0 = (java.lang.Float) r0
                if (r0 != 0) goto L53
                yz.g2 r0 = yz.g2.f100423a
                return r0
            L53:
                androidx.compose.foundation.MarqueeModifierNode r3 = r5.this$0
                int r13 = androidx.compose.foundation.MarqueeModifierNode.access$getIterations$p(r3)
                float r14 = r0.floatValue()
                androidx.compose.foundation.MarqueeModifierNode r3 = r5.this$0
                int r15 = androidx.compose.foundation.MarqueeModifierNode.access$getInitialDelayMillis$p(r3)
                androidx.compose.foundation.MarqueeModifierNode r3 = r5.this$0
                int r16 = androidx.compose.foundation.MarqueeModifierNode.access$getDelayMillis$p(r3)
                androidx.compose.foundation.MarqueeModifierNode r3 = r5.this$0
                float r17 = androidx.compose.foundation.MarqueeModifierNode.access$getVelocity$p(r3)
                androidx.compose.foundation.MarqueeModifierNode r3 = r5.this$0
                androidx.compose.ui.unit.Density r18 = androidx.compose.ui.node.DelegatableNodeKt.requireDensity(r3)
                androidx.compose.animation.core.AnimationSpec r3 = androidx.compose.foundation.BasicMarqueeKt.m239access$createMarqueeAnimationSpecZ4HSEVQ(r13, r14, r15, r16, r17, r18)
                androidx.compose.foundation.MarqueeModifierNode r4 = r5.this$0
                androidx.compose.animation.core.Animatable r4 = androidx.compose.foundation.MarqueeModifierNode.access$getOffset$p(r4)
                java.lang.Float r6 = l00.a.e(r12)
                r5.L$0 = r0
                r5.L$1 = r3
                r5.label = r2
                java.lang.Object r2 = r4.snapTo(r6, r5)
                if (r2 != r8) goto L90
                goto Ld7
            L90:
                r2 = r3
            L91:
                androidx.compose.foundation.MarqueeModifierNode r3 = r5.this$0     // Catch: java.lang.Throwable -> L33
                androidx.compose.animation.core.Animatable r3 = androidx.compose.foundation.MarqueeModifierNode.access$getOffset$p(r3)     // Catch: java.lang.Throwable -> L33
                r5.L$0 = r11     // Catch: java.lang.Throwable -> L33
                r5.L$1 = r11     // Catch: java.lang.Throwable -> L33
                r5.label = r1     // Catch: java.lang.Throwable -> L33
                r1 = r0
                r0 = r3
                r3 = 0
                r4 = 0
                r6 = 12
                r7 = 0
                java.lang.Object r0 = androidx.compose.animation.core.Animatable.animateTo$default(r0, r1, r2, r3, r4, r5, r6, r7)     // Catch: java.lang.Throwable -> L33
                if (r0 != r8) goto Lab
                goto Ld7
            Lab:
                androidx.compose.foundation.MarqueeModifierNode r0 = r5.this$0
                androidx.compose.animation.core.Animatable r0 = androidx.compose.foundation.MarqueeModifierNode.access$getOffset$p(r0)
                java.lang.Float r1 = l00.a.e(r12)
                r5.label = r10
                java.lang.Object r0 = r0.snapTo(r1, r5)
                if (r0 != r8) goto Lbe
                goto Ld7
            Lbe:
                yz.g2 r0 = yz.g2.f100423a
                return r0
            Lc1:
                androidx.compose.foundation.MarqueeModifierNode r1 = r5.this$0
                androidx.compose.animation.core.Animatable r1 = androidx.compose.foundation.MarqueeModifierNode.access$getOffset$p(r1)
                java.lang.Float r2 = l00.a.e(r12)
                r5.L$0 = r0
                r5.L$1 = r11
                r5.label = r9
                java.lang.Object r1 = r1.snapTo(r2, r5)
                if (r1 != r8) goto Ld8
            Ld7:
                return r8
            Ld8:
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.MarqueeModifierNode$runAnimation$2.AnonymousClass2.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MarqueeModifierNode$runAnimation$2(MarqueeModifierNode marqueeModifierNode, j00.c<? super MarqueeModifierNode$runAnimation$2> cVar) {
        super(2, cVar);
        this.this$0 = marqueeModifierNode;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final j00.c<g2> create(Object obj, j00.c<?> cVar) {
        return new MarqueeModifierNode$runAnimation$2(this.this$0, cVar);
    }

    @Override // x00.p
    public final Object invoke(r0 r0Var, j00.c<? super g2> cVar) {
        return ((MarqueeModifierNode$runAnimation$2) create(r0Var, cVar)).invokeSuspend(g2.f100423a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object l11 = kotlin.coroutines.intrinsics.b.l();
        int i11 = this.label;
        if (i11 == 0) {
            kotlin.e.n(obj);
            final MarqueeModifierNode marqueeModifierNode = this.this$0;
            kotlinx.coroutines.flow.i snapshotFlow = SnapshotStateKt.snapshotFlow(new x00.a<Float>() { // from class: androidx.compose.foundation.MarqueeModifierNode$runAnimation$2.1
                {
                    super(0);
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // x00.a
                public final Float invoke() {
                    int contentWidth;
                    int containerWidth;
                    int contentWidth2;
                    int spacingPx;
                    boolean hasFocus;
                    contentWidth = MarqueeModifierNode.this.getContentWidth();
                    containerWidth = MarqueeModifierNode.this.getContainerWidth();
                    if (contentWidth <= containerWidth) {
                        return null;
                    }
                    if (MarqueeAnimationMode.m310equalsimpl0(MarqueeModifierNode.this.m321getAnimationModeZbEOnfQ(), MarqueeAnimationMode.Companion.m315getWhileFocusedZbEOnfQ())) {
                        hasFocus = MarqueeModifierNode.this.getHasFocus();
                        if (!hasFocus) {
                            return null;
                        }
                    }
                    contentWidth2 = MarqueeModifierNode.this.getContentWidth();
                    spacingPx = MarqueeModifierNode.this.getSpacingPx();
                    return Float.valueOf(contentWidth2 + spacingPx);
                }
            });
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.this$0, null);
            this.label = 1;
            if (kotlinx.coroutines.flow.k.C(snapshotFlow, anonymousClass2, this) == l11) {
                return l11;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.e.n(obj);
        }
        return g2.f100423a;
    }
}
