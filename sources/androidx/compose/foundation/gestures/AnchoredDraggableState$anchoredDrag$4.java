package androidx.compose.foundation.gestures;

import j00.c;
import kotlin.Pair;
import kotlin.coroutines.intrinsics.b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.e;
import l00.d;
import x00.a;
import x00.l;
import x00.p;
import x00.r;
import yz.g2;
import yz.h1;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@d(c = "androidx.compose.foundation.gestures.AnchoredDraggableState$anchoredDrag$4", f = "AnchoredDraggable.kt", i = {}, l = {1172}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes.dex */
public final class AnchoredDraggableState$anchoredDrag$4 extends SuspendLambda implements l<c<? super g2>, Object> {
    final /* synthetic */ r<AnchoredDragScope, DraggableAnchors<T>, T, c<? super g2>, Object> $block;
    final /* synthetic */ T $targetValue;
    int label;
    final /* synthetic */ AnchoredDraggableState<T> this$0;

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @d(c = "androidx.compose.foundation.gestures.AnchoredDraggableState$anchoredDrag$4$2", f = "AnchoredDraggable.kt", i = {}, l = {1174}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: androidx.compose.foundation.gestures.AnchoredDraggableState$anchoredDrag$4$2, reason: invalid class name */
    public static final class AnonymousClass2<T> extends SuspendLambda implements p<Pair<? extends DraggableAnchors<T>, ? extends T>, c<? super g2>, Object> {
        final /* synthetic */ r<AnchoredDragScope, DraggableAnchors<T>, T, c<? super g2>, Object> $block;
        /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ AnchoredDraggableState<T> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass2(r<? super AnchoredDragScope, ? super DraggableAnchors<T>, ? super T, ? super c<? super g2>, ? extends Object> rVar, AnchoredDraggableState<T> anchoredDraggableState, c<? super AnonymousClass2> cVar) {
            super(2, cVar);
            this.$block = rVar;
            this.this$0 = anchoredDraggableState;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final c<g2> create(Object obj, c<?> cVar) {
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.$block, this.this$0, cVar);
            anonymousClass2.L$0 = obj;
            return anonymousClass2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            AnchoredDraggableState$anchoredDragScope$1 anchoredDraggableState$anchoredDragScope$1;
            Object l11 = b.l();
            int i11 = this.label;
            if (i11 == 0) {
                e.n(obj);
                Pair pair = (Pair) this.L$0;
                DraggableAnchors draggableAnchors = (DraggableAnchors) pair.component1();
                Object component2 = pair.component2();
                r<AnchoredDragScope, DraggableAnchors<T>, T, c<? super g2>, Object> rVar = this.$block;
                anchoredDraggableState$anchoredDragScope$1 = ((AnchoredDraggableState) this.this$0).anchoredDragScope;
                this.label = 1;
                if (rVar.invoke(anchoredDraggableState$anchoredDragScope$1, draggableAnchors, component2, this) == l11) {
                    return l11;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                e.n(obj);
            }
            return g2.f100423a;
        }

        @Override // x00.p
        public final Object invoke(Pair<? extends DraggableAnchors<T>, ? extends T> pair, c<? super g2> cVar) {
            return ((AnonymousClass2) create(pair, cVar)).invokeSuspend(g2.f100423a);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AnchoredDraggableState$anchoredDrag$4(AnchoredDraggableState<T> anchoredDraggableState, T t11, r<? super AnchoredDragScope, ? super DraggableAnchors<T>, ? super T, ? super c<? super g2>, ? extends Object> rVar, c<? super AnchoredDraggableState$anchoredDrag$4> cVar) {
        super(1, cVar);
        this.this$0 = anchoredDraggableState;
        this.$targetValue = t11;
        this.$block = rVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final c<g2> create(c<?> cVar) {
        return new AnchoredDraggableState$anchoredDrag$4(this.this$0, this.$targetValue, this.$block, cVar);
    }

    @Override // x00.l
    public final Object invoke(c<? super g2> cVar) {
        return ((AnchoredDraggableState$anchoredDrag$4) create(cVar)).invokeSuspend(g2.f100423a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object restartable;
        AnchoredDraggableState$anchoredDragScope$1 anchoredDraggableState$anchoredDragScope$1;
        Object l11 = b.l();
        int i11 = this.label;
        if (i11 == 0) {
            e.n(obj);
            this.this$0.setDragTarget(this.$targetValue);
            final AnchoredDraggableState<T> anchoredDraggableState = this.this$0;
            a<Pair<? extends DraggableAnchors<T>, ? extends T>> aVar = new a<Pair<? extends DraggableAnchors<T>, ? extends T>>() { // from class: androidx.compose.foundation.gestures.AnchoredDraggableState$anchoredDrag$4.1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // x00.a
                public final Pair<DraggableAnchors<T>, T> invoke() {
                    return h1.a(anchoredDraggableState.getAnchors(), anchoredDraggableState.getTargetValue());
                }
            };
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.$block, this.this$0, null);
            this.label = 1;
            restartable = AnchoredDraggableKt.restartable(aVar, anonymousClass2, this);
            if (restartable == l11) {
                return l11;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            e.n(obj);
        }
        if (((Boolean) this.this$0.getConfirmValueChange$foundation_release().invoke(this.$targetValue)).booleanValue()) {
            float positionOf = this.this$0.getAnchors().positionOf(this.$targetValue);
            anchoredDraggableState$anchoredDragScope$1 = ((AnchoredDraggableState) this.this$0).anchoredDragScope;
            anchoredDraggableState$anchoredDragScope$1.dragTo(positionOf, this.this$0.getLastVelocity());
            this.this$0.setSettledValue(this.$targetValue);
            this.this$0.setCurrentValue(this.$targetValue);
        }
        return g2.f100423a;
    }
}
