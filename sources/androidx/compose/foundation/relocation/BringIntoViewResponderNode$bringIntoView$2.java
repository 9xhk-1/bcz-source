package androidx.compose.foundation.relocation;

import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.relocation.BringIntoViewModifierNodeKt;
import c40.k;
import c40.l2;
import c40.r0;
import j00.c;
import kotlin.coroutines.intrinsics.b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.e;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.g0;
import l00.d;
import x00.a;
import x00.p;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@d(c = "androidx.compose.foundation.relocation.BringIntoViewResponderNode$bringIntoView$2", f = "BringIntoViewResponder.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes.dex */
public final class BringIntoViewResponderNode$bringIntoView$2 extends SuspendLambda implements p<r0, c<? super l2>, Object> {
    final /* synthetic */ a<Rect> $boundsProvider;
    final /* synthetic */ LayoutCoordinates $childCoordinates;
    final /* synthetic */ a<Rect> $parentRect;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ BringIntoViewResponderNode this$0;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @d(c = "androidx.compose.foundation.relocation.BringIntoViewResponderNode$bringIntoView$2$1", f = "BringIntoViewResponder.kt", i = {}, l = {183}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: androidx.compose.foundation.relocation.BringIntoViewResponderNode$bringIntoView$2$1, reason: invalid class name */
    public static final class AnonymousClass1 extends SuspendLambda implements p<r0, c<? super g2>, Object> {
        final /* synthetic */ a<Rect> $boundsProvider;
        final /* synthetic */ LayoutCoordinates $childCoordinates;
        int label;
        final /* synthetic */ BringIntoViewResponderNode this$0;

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        /* renamed from: androidx.compose.foundation.relocation.BringIntoViewResponderNode$bringIntoView$2$1$1, reason: invalid class name and collision with other inner class name */
        public /* synthetic */ class C00571 extends FunctionReferenceImpl implements a<Rect> {
            final /* synthetic */ a<Rect> $boundsProvider;
            final /* synthetic */ LayoutCoordinates $childCoordinates;
            final /* synthetic */ BringIntoViewResponderNode this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C00571(BringIntoViewResponderNode bringIntoViewResponderNode, LayoutCoordinates layoutCoordinates, a<Rect> aVar) {
                super(0, g0.a.class, "localRect", "bringIntoView$localRect(Landroidx/compose/foundation/relocation/BringIntoViewResponderNode;Landroidx/compose/ui/layout/LayoutCoordinates;Lkotlin/jvm/functions/Function0;)Landroidx/compose/ui/geometry/Rect;", 0);
                this.this$0 = bringIntoViewResponderNode;
                this.$childCoordinates = layoutCoordinates;
                this.$boundsProvider = aVar;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // x00.a
            public final Rect invoke() {
                Rect bringIntoView$localRect;
                bringIntoView$localRect = BringIntoViewResponderNode.bringIntoView$localRect(this.this$0, this.$childCoordinates, this.$boundsProvider);
                return bringIntoView$localRect;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(BringIntoViewResponderNode bringIntoViewResponderNode, LayoutCoordinates layoutCoordinates, a<Rect> aVar, c<? super AnonymousClass1> cVar) {
            super(2, cVar);
            this.this$0 = bringIntoViewResponderNode;
            this.$childCoordinates = layoutCoordinates;
            this.$boundsProvider = aVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final c<g2> create(Object obj, c<?> cVar) {
            return new AnonymousClass1(this.this$0, this.$childCoordinates, this.$boundsProvider, cVar);
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
                BringIntoViewResponder responder = this.this$0.getResponder();
                C00571 c00571 = new C00571(this.this$0, this.$childCoordinates, this.$boundsProvider);
                this.label = 1;
                if (responder.bringChildIntoView(c00571, this) == l11) {
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

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @d(c = "androidx.compose.foundation.relocation.BringIntoViewResponderNode$bringIntoView$2$2", f = "BringIntoViewResponder.kt", i = {}, l = {191}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: androidx.compose.foundation.relocation.BringIntoViewResponderNode$bringIntoView$2$2, reason: invalid class name */
    public static final class AnonymousClass2 extends SuspendLambda implements p<r0, c<? super g2>, Object> {
        final /* synthetic */ a<Rect> $parentRect;
        int label;
        final /* synthetic */ BringIntoViewResponderNode this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(BringIntoViewResponderNode bringIntoViewResponderNode, a<Rect> aVar, c<? super AnonymousClass2> cVar) {
            super(2, cVar);
            this.this$0 = bringIntoViewResponderNode;
            this.$parentRect = aVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final c<g2> create(Object obj, c<?> cVar) {
            return new AnonymousClass2(this.this$0, this.$parentRect, cVar);
        }

        @Override // x00.p
        public final Object invoke(r0 r0Var, c<? super g2> cVar) {
            return ((AnonymousClass2) create(r0Var, cVar)).invokeSuspend(g2.f100423a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object l11 = b.l();
            int i11 = this.label;
            if (i11 == 0) {
                e.n(obj);
                BringIntoViewResponderNode bringIntoViewResponderNode = this.this$0;
                a<Rect> aVar = this.$parentRect;
                this.label = 1;
                if (BringIntoViewModifierNodeKt.bringIntoView(bringIntoViewResponderNode, aVar, this) == l11) {
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
    public BringIntoViewResponderNode$bringIntoView$2(BringIntoViewResponderNode bringIntoViewResponderNode, LayoutCoordinates layoutCoordinates, a<Rect> aVar, a<Rect> aVar2, c<? super BringIntoViewResponderNode$bringIntoView$2> cVar) {
        super(2, cVar);
        this.this$0 = bringIntoViewResponderNode;
        this.$childCoordinates = layoutCoordinates;
        this.$boundsProvider = aVar;
        this.$parentRect = aVar2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final c<g2> create(Object obj, c<?> cVar) {
        BringIntoViewResponderNode$bringIntoView$2 bringIntoViewResponderNode$bringIntoView$2 = new BringIntoViewResponderNode$bringIntoView$2(this.this$0, this.$childCoordinates, this.$boundsProvider, this.$parentRect, cVar);
        bringIntoViewResponderNode$bringIntoView$2.L$0 = obj;
        return bringIntoViewResponderNode$bringIntoView$2;
    }

    @Override // x00.p
    public final Object invoke(r0 r0Var, c<? super l2> cVar) {
        return ((BringIntoViewResponderNode$bringIntoView$2) create(r0Var, cVar)).invokeSuspend(g2.f100423a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        l2 f11;
        b.l();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        e.n(obj);
        r0 r0Var = (r0) this.L$0;
        k.f(r0Var, null, null, new AnonymousClass1(this.this$0, this.$childCoordinates, this.$boundsProvider, null), 3, null);
        f11 = k.f(r0Var, null, null, new AnonymousClass2(this.this$0, this.$parentRect, null), 3, null);
        return f11;
    }
}
