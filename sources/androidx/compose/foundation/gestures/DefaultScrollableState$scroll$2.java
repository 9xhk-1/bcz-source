package androidx.compose.foundation.gestures;

import androidx.compose.foundation.MutatePriority;
import androidx.compose.foundation.MutatorMutex;
import androidx.compose.runtime.MutableState;
import c40.r0;
import j00.c;
import kotlin.coroutines.intrinsics.b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.e;
import l00.a;
import l00.d;
import x00.p;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@d(c = "androidx.compose.foundation.gestures.DefaultScrollableState$scroll$2", f = "ScrollableState.kt", i = {}, l = {198}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes.dex */
public final class DefaultScrollableState$scroll$2 extends SuspendLambda implements p<r0, c<? super g2>, Object> {
    final /* synthetic */ p<ScrollScope, c<? super g2>, Object> $block;
    final /* synthetic */ MutatePriority $scrollPriority;
    int label;
    final /* synthetic */ DefaultScrollableState this$0;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @d(c = "androidx.compose.foundation.gestures.DefaultScrollableState$scroll$2$1", f = "ScrollableState.kt", i = {}, l = {201}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: androidx.compose.foundation.gestures.DefaultScrollableState$scroll$2$1, reason: invalid class name */
    public static final class AnonymousClass1 extends SuspendLambda implements p<ScrollScope, c<? super g2>, Object> {
        final /* synthetic */ p<ScrollScope, c<? super g2>, Object> $block;
        private /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ DefaultScrollableState this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass1(DefaultScrollableState defaultScrollableState, p<? super ScrollScope, ? super c<? super g2>, ? extends Object> pVar, c<? super AnonymousClass1> cVar) {
            super(2, cVar);
            this.this$0 = defaultScrollableState;
            this.$block = pVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final c<g2> create(Object obj, c<?> cVar) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, this.$block, cVar);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        @Override // x00.p
        public final Object invoke(ScrollScope scrollScope, c<? super g2> cVar) {
            return ((AnonymousClass1) create(scrollScope, cVar)).invokeSuspend(g2.f100423a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            MutableState mutableState;
            MutableState mutableState2;
            MutableState mutableState3;
            Object l11 = b.l();
            int i11 = this.label;
            try {
                if (i11 == 0) {
                    e.n(obj);
                    ScrollScope scrollScope = (ScrollScope) this.L$0;
                    mutableState2 = this.this$0.isScrollingState;
                    mutableState2.setValue(a.a(true));
                    p<ScrollScope, c<? super g2>, Object> pVar = this.$block;
                    this.label = 1;
                    if (pVar.invoke(scrollScope, this) == l11) {
                        return l11;
                    }
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    e.n(obj);
                }
                mutableState3 = this.this$0.isScrollingState;
                mutableState3.setValue(a.a(false));
                return g2.f100423a;
            } catch (Throwable th2) {
                mutableState = this.this$0.isScrollingState;
                mutableState.setValue(a.a(false));
                throw th2;
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public DefaultScrollableState$scroll$2(DefaultScrollableState defaultScrollableState, MutatePriority mutatePriority, p<? super ScrollScope, ? super c<? super g2>, ? extends Object> pVar, c<? super DefaultScrollableState$scroll$2> cVar) {
        super(2, cVar);
        this.this$0 = defaultScrollableState;
        this.$scrollPriority = mutatePriority;
        this.$block = pVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final c<g2> create(Object obj, c<?> cVar) {
        return new DefaultScrollableState$scroll$2(this.this$0, this.$scrollPriority, this.$block, cVar);
    }

    @Override // x00.p
    public final Object invoke(r0 r0Var, c<? super g2> cVar) {
        return ((DefaultScrollableState$scroll$2) create(r0Var, cVar)).invokeSuspend(g2.f100423a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        MutatorMutex mutatorMutex;
        ScrollScope scrollScope;
        Object l11 = b.l();
        int i11 = this.label;
        if (i11 == 0) {
            e.n(obj);
            mutatorMutex = this.this$0.scrollMutex;
            scrollScope = this.this$0.scrollScope;
            MutatePriority mutatePriority = this.$scrollPriority;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, this.$block, null);
            this.label = 1;
            if (mutatorMutex.mutateWith(scrollScope, mutatePriority, anonymousClass1, this) == l11) {
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
