package androidx.compose.foundation.lazy;

import android.support.v4.media.session.MediaSessionCompat;
import androidx.compose.foundation.gestures.ScrollScope;
import androidx.compose.foundation.gestures.ScrollableState;
import c40.r0;
import j00.c;
import kotlin.coroutines.intrinsics.b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.e;
import l00.d;
import x00.p;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@d(c = "androidx.compose.foundation.lazy.LazyListState$requestScrollToItem$1", f = "LazyListState.kt", i = {}, l = {MediaSessionCompat.K}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes.dex */
public final class LazyListState$requestScrollToItem$1 extends SuspendLambda implements p<r0, c<? super g2>, Object> {
    int label;
    final /* synthetic */ LazyListState this$0;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @d(c = "androidx.compose.foundation.lazy.LazyListState$requestScrollToItem$1$1", f = "LazyListState.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: androidx.compose.foundation.lazy.LazyListState$requestScrollToItem$1$1, reason: invalid class name */
    public static final class AnonymousClass1 extends SuspendLambda implements p<ScrollScope, c<? super g2>, Object> {
        int label;

        public AnonymousClass1(c<? super AnonymousClass1> cVar) {
            super(2, cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final c<g2> create(Object obj, c<?> cVar) {
            return new AnonymousClass1(cVar);
        }

        @Override // x00.p
        public final Object invoke(ScrollScope scrollScope, c<? super g2> cVar) {
            return ((AnonymousClass1) create(scrollScope, cVar)).invokeSuspend(g2.f100423a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            b.l();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            e.n(obj);
            return g2.f100423a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LazyListState$requestScrollToItem$1(LazyListState lazyListState, c<? super LazyListState$requestScrollToItem$1> cVar) {
        super(2, cVar);
        this.this$0 = lazyListState;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final c<g2> create(Object obj, c<?> cVar) {
        return new LazyListState$requestScrollToItem$1(this.this$0, cVar);
    }

    @Override // x00.p
    public final Object invoke(r0 r0Var, c<? super g2> cVar) {
        return ((LazyListState$requestScrollToItem$1) create(r0Var, cVar)).invokeSuspend(g2.f100423a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object l11 = b.l();
        int i11 = this.label;
        if (i11 == 0) {
            e.n(obj);
            LazyListState lazyListState = this.this$0;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(null);
            this.label = 1;
            if (ScrollableState.scroll$default(lazyListState, null, anonymousClass1, this, 1, null) == l11) {
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
