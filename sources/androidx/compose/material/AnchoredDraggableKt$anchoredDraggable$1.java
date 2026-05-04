package androidx.compose.material;

import c40.k;
import c40.r0;
import j00.c;
import kotlin.coroutines.intrinsics.b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.e;
import l00.d;
import x00.p;
import x00.q;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@d(c = "androidx.compose.material.AnchoredDraggableKt$anchoredDraggable$1", f = "AnchoredDraggable.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes.dex */
public final class AnchoredDraggableKt$anchoredDraggable$1 extends SuspendLambda implements q<r0, Float, c<? super g2>, Object> {
    final /* synthetic */ AnchoredDraggableState<T> $state;
    /* synthetic */ float F$0;
    private /* synthetic */ Object L$0;
    int label;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @d(c = "androidx.compose.material.AnchoredDraggableKt$anchoredDraggable$1$1", f = "AnchoredDraggable.kt", i = {}, l = {179}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: androidx.compose.material.AnchoredDraggableKt$anchoredDraggable$1$1, reason: invalid class name */
    public static final class AnonymousClass1 extends SuspendLambda implements p<r0, c<? super g2>, Object> {
        final /* synthetic */ AnchoredDraggableState<T> $state;
        final /* synthetic */ float $velocity;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(AnchoredDraggableState<T> anchoredDraggableState, float f11, c<? super AnonymousClass1> cVar) {
            super(2, cVar);
            this.$state = anchoredDraggableState;
            this.$velocity = f11;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final c<g2> create(Object obj, c<?> cVar) {
            return new AnonymousClass1(this.$state, this.$velocity, cVar);
        }

        @Override // x00.p
        public final Object invoke(r0 r0Var, c<? super g2> cVar) {
            return ((AnonymousClass1) create(r0Var, cVar)).invokeSuspend(g2.f100423a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object l11 = b.l();
            int i11 = this.label;
            if (i11 == 0) {
                e.n(obj);
                AnchoredDraggableState<T> anchoredDraggableState = this.$state;
                float f11 = this.$velocity;
                this.label = 1;
                if (anchoredDraggableState.settle(f11, this) == l11) {
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
    public AnchoredDraggableKt$anchoredDraggable$1(AnchoredDraggableState<T> anchoredDraggableState, c<? super AnchoredDraggableKt$anchoredDraggable$1> cVar) {
        super(3, cVar);
        this.$state = anchoredDraggableState;
    }

    public final Object invoke(r0 r0Var, float f11, c<? super g2> cVar) {
        AnchoredDraggableKt$anchoredDraggable$1 anchoredDraggableKt$anchoredDraggable$1 = new AnchoredDraggableKt$anchoredDraggable$1(this.$state, cVar);
        anchoredDraggableKt$anchoredDraggable$1.L$0 = r0Var;
        anchoredDraggableKt$anchoredDraggable$1.F$0 = f11;
        return anchoredDraggableKt$anchoredDraggable$1.invokeSuspend(g2.f100423a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        b.l();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        e.n(obj);
        k.f((r0) this.L$0, null, null, new AnonymousClass1(this.$state, this.F$0, null), 3, null);
        return g2.f100423a;
    }

    @Override // x00.q
    public /* bridge */ /* synthetic */ Object invoke(r0 r0Var, Float f11, c<? super g2> cVar) {
        return invoke(r0Var, f11.floatValue(), cVar);
    }
}
