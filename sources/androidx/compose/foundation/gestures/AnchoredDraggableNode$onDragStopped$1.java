package androidx.compose.foundation.gestures;

import androidx.compose.ui.unit.Velocity;
import c40.r0;
import j00.c;
import kotlin.coroutines.intrinsics.b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.e;
import l00.d;
import x00.p;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@d(c = "androidx.compose.foundation.gestures.AnchoredDraggableNode$onDragStopped$1", f = "AnchoredDraggable.kt", i = {}, l = {434, 436}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes.dex */
public final class AnchoredDraggableNode$onDragStopped$1 extends SuspendLambda implements p<r0, c<? super g2>, Object> {
    final /* synthetic */ long $velocity;
    int label;
    final /* synthetic */ AnchoredDraggableNode<T> this$0;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @d(c = "androidx.compose.foundation.gestures.AnchoredDraggableNode$onDragStopped$1$1", f = "AnchoredDraggable.kt", i = {0}, l = {438}, m = "invokeSuspend", n = {"availableVelocity"}, s = {"J$0"})
    /* renamed from: androidx.compose.foundation.gestures.AnchoredDraggableNode$onDragStopped$1$1, reason: invalid class name */
    public static final class AnonymousClass1 extends SuspendLambda implements p<Velocity, c<? super Velocity>, Object> {
        /* synthetic */ long J$0;
        int label;
        final /* synthetic */ AnchoredDraggableNode<T> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(AnchoredDraggableNode<T> anchoredDraggableNode, c<? super AnonymousClass1> cVar) {
            super(2, cVar);
            this.this$0 = anchoredDraggableNode;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final c<g2> create(Object obj, c<?> cVar) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, cVar);
            anonymousClass1.J$0 = ((Velocity) obj).m5362unboximpl();
            return anonymousClass1;
        }

        @Override // x00.p
        public /* bridge */ /* synthetic */ Object invoke(Velocity velocity, c<? super Velocity> cVar) {
            return m398invokesFctU(velocity.m5362unboximpl(), cVar);
        }

        /* renamed from: invoke-sF-c-tU, reason: not valid java name */
        public final Object m398invokesFctU(long j11, c<? super Velocity> cVar) {
            return ((AnonymousClass1) create(Velocity.m5344boximpl(j11), cVar)).invokeSuspend(g2.f100423a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            float m391toFloatTH1AsA0;
            long j11;
            AnchoredDraggableState anchoredDraggableState;
            AnchoredDraggableState anchoredDraggableState2;
            AnchoredDraggableState anchoredDraggableState3;
            Object l11 = b.l();
            int i11 = this.label;
            if (i11 == 0) {
                e.n(obj);
                long j12 = this.J$0;
                AnchoredDraggableNode<T> anchoredDraggableNode = this.this$0;
                m391toFloatTH1AsA0 = anchoredDraggableNode.m391toFloatTH1AsA0(j12);
                this.J$0 = j12;
                this.label = 1;
                obj = anchoredDraggableNode.fling(m391toFloatTH1AsA0, this);
                if (obj == l11) {
                    return l11;
                }
                j11 = j12;
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                j11 = this.J$0;
                e.n(obj);
            }
            float floatValue = ((Number) obj).floatValue();
            anchoredDraggableState = ((AnchoredDraggableNode) this.this$0).state;
            float requireOffset = anchoredDraggableState.requireOffset();
            anchoredDraggableState2 = ((AnchoredDraggableNode) this.this$0).state;
            float minPosition = anchoredDraggableState2.getAnchors().minPosition();
            anchoredDraggableState3 = ((AnchoredDraggableNode) this.this$0).state;
            if (requireOffset >= anchoredDraggableState3.getAnchors().maxPosition() || requireOffset <= minPosition) {
                j11 = this.this$0.m394toVelocityadjELrA(floatValue);
            }
            return Velocity.m5344boximpl(j11);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AnchoredDraggableNode$onDragStopped$1(AnchoredDraggableNode<T> anchoredDraggableNode, long j11, c<? super AnchoredDraggableNode$onDragStopped$1> cVar) {
        super(2, cVar);
        this.this$0 = anchoredDraggableNode;
        this.$velocity = j11;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final c<g2> create(Object obj, c<?> cVar) {
        return new AnchoredDraggableNode$onDragStopped$1(this.this$0, this.$velocity, cVar);
    }

    @Override // x00.p
    public final Object invoke(r0 r0Var, c<? super g2> cVar) {
        return ((AnchoredDraggableNode$onDragStopped$1) create(r0Var, cVar)).invokeSuspend(g2.f100423a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x003a, code lost:
    
        if (r8 == r0) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x005c, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x005a, code lost:
    
        if (r1.mo213applyToFlingBMRW4eQ(r3, r8, r7) == r0) goto L17;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r8) {
        /*
            r7 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.b.l()
            int r1 = r7.label
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L1b
            if (r1 == r3) goto L17
            if (r1 != r2) goto Lf
            goto L17
        Lf:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L17:
            kotlin.e.n(r8)
            goto L5d
        L1b:
            kotlin.e.n(r8)
            androidx.compose.foundation.gestures.AnchoredDraggableNode<T> r8 = r7.this$0
            long r4 = r7.$velocity
            long r4 = androidx.compose.foundation.gestures.AnchoredDraggableNode.m383access$reverseIfNeededAH228Gc(r8, r4)
            float r8 = androidx.compose.foundation.gestures.AnchoredDraggableNode.m385access$toFloatTH1AsA0(r8, r4)
            androidx.compose.foundation.gestures.AnchoredDraggableNode<T> r1 = r7.this$0
            androidx.compose.foundation.OverscrollEffect r1 = androidx.compose.foundation.gestures.AnchoredDraggableNode.access$getOverscrollEffect$p(r1)
            if (r1 != 0) goto L3d
            androidx.compose.foundation.gestures.AnchoredDraggableNode<T> r1 = r7.this$0
            r7.label = r3
            java.lang.Object r8 = androidx.compose.foundation.gestures.AnchoredDraggableNode.access$fling(r1, r8, r7)
            if (r8 != r0) goto L5d
            goto L5c
        L3d:
            androidx.compose.foundation.gestures.AnchoredDraggableNode<T> r1 = r7.this$0
            androidx.compose.foundation.OverscrollEffect r1 = androidx.compose.foundation.gestures.AnchoredDraggableNode.access$getOverscrollEffect$p(r1)
            kotlin.jvm.internal.g0.m(r1)
            androidx.compose.foundation.gestures.AnchoredDraggableNode<T> r3 = r7.this$0
            long r3 = androidx.compose.foundation.gestures.AnchoredDraggableNode.m388access$toVelocityadjELrA(r3, r8)
            androidx.compose.foundation.gestures.AnchoredDraggableNode$onDragStopped$1$1 r8 = new androidx.compose.foundation.gestures.AnchoredDraggableNode$onDragStopped$1$1
            androidx.compose.foundation.gestures.AnchoredDraggableNode<T> r5 = r7.this$0
            r6 = 0
            r8.<init>(r5, r6)
            r7.label = r2
            java.lang.Object r8 = r1.mo213applyToFlingBMRW4eQ(r3, r8, r7)
            if (r8 != r0) goto L5d
        L5c:
            return r0
        L5d:
            yz.g2 r8 = yz.g2.f100423a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.AnchoredDraggableNode$onDragStopped$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
