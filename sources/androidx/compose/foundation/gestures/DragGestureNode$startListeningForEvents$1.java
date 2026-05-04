package androidx.compose.foundation.gestures;

import androidx.compose.foundation.gestures.DragEvent;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.core.app.NotificationCompat;
import c40.r0;
import j00.c;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Ref;
import l00.d;
import x00.l;
import x00.p;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@d(c = "androidx.compose.foundation.gestures.DragGestureNode$startListeningForEvents$1", f = "Draggable.kt", i = {0, 0, 1, 1, 2, 2, 3, 4, 5}, l = {421, 423, TypedValues.CycleType.TYPE_WAVE_PHASE, 432, 434, 437}, m = "invokeSuspend", n = {"$this$launch", NotificationCompat.CATEGORY_EVENT, "$this$launch", NotificationCompat.CATEGORY_EVENT, "$this$launch", NotificationCompat.CATEGORY_EVENT, "$this$launch", "$this$launch", "$this$launch"}, s = {"L$0", "L$1", "L$0", "L$1", "L$0", "L$1", "L$0", "L$0", "L$0"})
/* loaded from: classes.dex */
public final class DragGestureNode$startListeningForEvents$1 extends SuspendLambda implements p<r0, c<? super g2>, Object> {
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    int label;
    final /* synthetic */ DragGestureNode this$0;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @d(c = "androidx.compose.foundation.gestures.DragGestureNode$startListeningForEvents$1$1", f = "Draggable.kt", i = {0}, l = {428}, m = "invokeSuspend", n = {"processDelta"}, s = {"L$0"})
    /* renamed from: androidx.compose.foundation.gestures.DragGestureNode$startListeningForEvents$1$1, reason: invalid class name */
    public static final class AnonymousClass1 extends SuspendLambda implements p<l<? super DragEvent.DragDelta, ? extends g2>, c<? super g2>, Object> {
        final /* synthetic */ Ref.ObjectRef<DragEvent> $event;
        /* synthetic */ Object L$0;
        Object L$1;
        int label;
        final /* synthetic */ DragGestureNode this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(Ref.ObjectRef<DragEvent> objectRef, DragGestureNode dragGestureNode, c<? super AnonymousClass1> cVar) {
            super(2, cVar);
            this.$event = objectRef;
            this.this$0 = dragGestureNode;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final c<g2> create(Object obj, c<?> cVar) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$event, this.this$0, cVar);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        @Override // x00.p
        public /* bridge */ /* synthetic */ Object invoke(l<? super DragEvent.DragDelta, ? extends g2> lVar, c<? super g2> cVar) {
            return invoke2((l<? super DragEvent.DragDelta, g2>) lVar, cVar);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:9:0x002f  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x0049 -> B:6:0x005b). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x0055 -> B:5:0x0058). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r6) {
            /*
                r5 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.b.l()
                int r1 = r5.label
                r2 = 1
                if (r1 == 0) goto L1f
                if (r1 != r2) goto L17
                java.lang.Object r1 = r5.L$1
                kotlin.jvm.internal.Ref$ObjectRef r1 = (kotlin.jvm.internal.Ref.ObjectRef) r1
                java.lang.Object r3 = r5.L$0
                x00.l r3 = (x00.l) r3
                kotlin.e.n(r6)
                goto L58
            L17:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r0)
                throw r6
            L1f:
                kotlin.e.n(r6)
                java.lang.Object r6 = r5.L$0
                x00.l r6 = (x00.l) r6
                r3 = r6
            L27:
                kotlin.jvm.internal.Ref$ObjectRef<androidx.compose.foundation.gestures.DragEvent> r6 = r5.$event
                T r6 = r6.element
                boolean r1 = r6 instanceof androidx.compose.foundation.gestures.DragEvent.DragStopped
                if (r1 != 0) goto L5e
                boolean r1 = r6 instanceof androidx.compose.foundation.gestures.DragEvent.DragCancelled
                if (r1 != 0) goto L5e
                boolean r1 = r6 instanceof androidx.compose.foundation.gestures.DragEvent.DragDelta
                r4 = 0
                if (r1 == 0) goto L3b
                androidx.compose.foundation.gestures.DragEvent$DragDelta r6 = (androidx.compose.foundation.gestures.DragEvent.DragDelta) r6
                goto L3c
            L3b:
                r6 = r4
            L3c:
                if (r6 == 0) goto L41
                r3.invoke(r6)
            L41:
                kotlin.jvm.internal.Ref$ObjectRef<androidx.compose.foundation.gestures.DragEvent> r1 = r5.$event
                androidx.compose.foundation.gestures.DragGestureNode r6 = r5.this$0
                e40.o r6 = androidx.compose.foundation.gestures.DragGestureNode.access$getChannel$p(r6)
                if (r6 == 0) goto L5b
                r5.L$0 = r3
                r5.L$1 = r1
                r5.label = r2
                java.lang.Object r6 = r6.H(r5)
                if (r6 != r0) goto L58
                return r0
            L58:
                r4 = r6
                androidx.compose.foundation.gestures.DragEvent r4 = (androidx.compose.foundation.gestures.DragEvent) r4
            L5b:
                r1.element = r4
                goto L27
            L5e:
                yz.g2 r6 = yz.g2.f100423a
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.DragGestureNode$startListeningForEvents$1.AnonymousClass1.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(l<? super DragEvent.DragDelta, g2> lVar, c<? super g2> cVar) {
            return ((AnonymousClass1) create(lVar, cVar)).invokeSuspend(g2.f100423a);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DragGestureNode$startListeningForEvents$1(DragGestureNode dragGestureNode, c<? super DragGestureNode$startListeningForEvents$1> cVar) {
        super(2, cVar);
        this.this$0 = dragGestureNode;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final c<g2> create(Object obj, c<?> cVar) {
        DragGestureNode$startListeningForEvents$1 dragGestureNode$startListeningForEvents$1 = new DragGestureNode$startListeningForEvents$1(this.this$0, cVar);
        dragGestureNode$startListeningForEvents$1.L$0 = obj;
        return dragGestureNode$startListeningForEvents$1;
    }

    @Override // x00.p
    public final Object invoke(r0 r0Var, c<? super g2> cVar) {
        return ((DragGestureNode$startListeningForEvents$1) create(r0Var, cVar)).invokeSuspend(g2.f100423a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x00b8, code lost:
    
        if (r7.drag(r4, r6) != r0) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00eb, code lost:
    
        if (r7 == r0) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00fb, code lost:
    
        if (r7 != r0) goto L11;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Path cross not found for [B:30:0x00da, B:27:0x00c1], limit reached: 56 */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00fe  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x008e -> B:8:0x005e). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:28:0x00d5 -> B:8:0x005e). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:31:0x00dc -> B:8:0x005e). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:33:0x00eb -> B:8:0x005e). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:37:0x00fb -> B:7:0x0027). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r7) {
        /*
            Method dump skipped, instructions count: 276
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.DragGestureNode$startListeningForEvents$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
