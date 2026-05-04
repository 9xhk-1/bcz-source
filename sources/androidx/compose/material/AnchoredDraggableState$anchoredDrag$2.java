package androidx.compose.material;

import j00.c;
import kotlin.coroutines.intrinsics.b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.e;
import l00.d;
import x00.a;
import x00.l;
import x00.p;
import x00.q;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@d(c = "androidx.compose.material.AnchoredDraggableState$anchoredDrag$2", f = "AnchoredDraggable.kt", i = {}, l = {526}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes.dex */
public final class AnchoredDraggableState$anchoredDrag$2 extends SuspendLambda implements l<c<? super g2>, Object> {
    final /* synthetic */ q<AnchoredDragScope, DraggableAnchors<T>, c<? super g2>, Object> $block;
    int label;
    final /* synthetic */ AnchoredDraggableState<T> this$0;

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @d(c = "androidx.compose.material.AnchoredDraggableState$anchoredDrag$2$2", f = "AnchoredDraggable.kt", i = {}, l = {527}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: androidx.compose.material.AnchoredDraggableState$anchoredDrag$2$2, reason: invalid class name */
    public static final class AnonymousClass2<T> extends SuspendLambda implements p<DraggableAnchors<T>, c<? super g2>, Object> {
        final /* synthetic */ q<AnchoredDragScope, DraggableAnchors<T>, c<? super g2>, Object> $block;
        /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ AnchoredDraggableState<T> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass2(q<? super AnchoredDragScope, ? super DraggableAnchors<T>, ? super c<? super g2>, ? extends Object> qVar, AnchoredDraggableState<T> anchoredDraggableState, c<? super AnonymousClass2> cVar) {
            super(2, cVar);
            this.$block = qVar;
            this.this$0 = anchoredDraggableState;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final c<g2> create(Object obj, c<?> cVar) {
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.$block, this.this$0, cVar);
            anonymousClass2.L$0 = obj;
            return anonymousClass2;
        }

        @Override // x00.p
        public final Object invoke(DraggableAnchors<T> draggableAnchors, c<? super g2> cVar) {
            return ((AnonymousClass2) create(draggableAnchors, cVar)).invokeSuspend(g2.f100423a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            AnchoredDragScope anchoredDragScope;
            Object l11 = b.l();
            int i11 = this.label;
            if (i11 == 0) {
                e.n(obj);
                DraggableAnchors<T> draggableAnchors = (DraggableAnchors) this.L$0;
                q<AnchoredDragScope, DraggableAnchors<T>, c<? super g2>, Object> qVar = this.$block;
                anchoredDragScope = ((AnchoredDraggableState) this.this$0).anchoredDragScope;
                this.label = 1;
                if (qVar.invoke(anchoredDragScope, draggableAnchors, this) == l11) {
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
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AnchoredDraggableState$anchoredDrag$2(AnchoredDraggableState<T> anchoredDraggableState, q<? super AnchoredDragScope, ? super DraggableAnchors<T>, ? super c<? super g2>, ? extends Object> qVar, c<? super AnchoredDraggableState$anchoredDrag$2> cVar) {
        super(1, cVar);
        this.this$0 = anchoredDraggableState;
        this.$block = qVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final c<g2> create(c<?> cVar) {
        return new AnchoredDraggableState$anchoredDrag$2(this.this$0, this.$block, cVar);
    }

    @Override // x00.l
    public final Object invoke(c<? super g2> cVar) {
        return ((AnchoredDraggableState$anchoredDrag$2) create(cVar)).invokeSuspend(g2.f100423a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object restartable;
        Object l11 = b.l();
        int i11 = this.label;
        if (i11 == 0) {
            e.n(obj);
            final AnchoredDraggableState<T> anchoredDraggableState = this.this$0;
            a<DraggableAnchors<T>> aVar = new a<DraggableAnchors<T>>() { // from class: androidx.compose.material.AnchoredDraggableState$anchoredDrag$2.1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // x00.a
                public final DraggableAnchors<T> invoke() {
                    return anchoredDraggableState.getAnchors();
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
        return g2.f100423a;
    }
}
