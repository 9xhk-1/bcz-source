package androidx.compose.foundation.gestures;

import androidx.compose.foundation.ComposeFoundationFlags;
import androidx.compose.ui.input.nestedscroll.NestedScrollSource;
import j00.c;
import kotlin.coroutines.intrinsics.b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.e;
import kotlin.jvm.internal.Ref;
import l00.d;
import x00.p;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@d(c = "androidx.compose.foundation.gestures.ScrollingLogic$doFlingAnimation$2", f = "Scrollable.kt", i = {}, l = {814}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes.dex */
public final class ScrollingLogic$doFlingAnimation$2 extends SuspendLambda implements p<NestedScrollScope, c<? super g2>, Object> {
    final /* synthetic */ long $available;
    final /* synthetic */ Ref.LongRef $result;
    long J$0;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    int label;
    final /* synthetic */ ScrollingLogic this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScrollingLogic$doFlingAnimation$2(ScrollingLogic scrollingLogic, Ref.LongRef longRef, long j11, c<? super ScrollingLogic$doFlingAnimation$2> cVar) {
        super(2, cVar);
        this.this$0 = scrollingLogic;
        this.$result = longRef;
        this.$available = j11;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final c<g2> create(Object obj, c<?> cVar) {
        ScrollingLogic$doFlingAnimation$2 scrollingLogic$doFlingAnimation$2 = new ScrollingLogic$doFlingAnimation$2(this.this$0, this.$result, this.$available, cVar);
        scrollingLogic$doFlingAnimation$2.L$0 = obj;
        return scrollingLogic$doFlingAnimation$2;
    }

    @Override // x00.p
    public final Object invoke(NestedScrollScope nestedScrollScope, c<? super g2> cVar) {
        return ((ScrollingLogic$doFlingAnimation$2) create(nestedScrollScope, cVar)).invokeSuspend(g2.f100423a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        ScrollingLogic scrollingLogic;
        FlingBehavior flingBehavior;
        float m508toFloatTH1AsA0;
        Ref.LongRef longRef;
        ScrollingLogic scrollingLogic2;
        long j11;
        long m509updateQWom1Mo;
        Object l11 = b.l();
        int i11 = this.label;
        if (i11 == 0) {
            e.n(obj);
            final NestedScrollScope nestedScrollScope = (NestedScrollScope) this.L$0;
            final ScrollingLogic scrollingLogic3 = this.this$0;
            ScrollScope scrollScope = new ScrollScope() { // from class: androidx.compose.foundation.gestures.ScrollingLogic$doFlingAnimation$2$reverseScope$1
                @Override // androidx.compose.foundation.gestures.ScrollScope
                public float scrollBy(float f11) {
                    boolean shouldCancelFling;
                    if (ComposeFoundationFlags.NewNestedFlingPropagationEnabled && Math.abs(f11) != 0.0f) {
                        shouldCancelFling = ScrollingLogic.this.shouldCancelFling(f11);
                        if (shouldCancelFling) {
                            throw new FlingCancellationException();
                        }
                    }
                    ScrollingLogic scrollingLogic4 = ScrollingLogic.this;
                    return scrollingLogic4.reverseIfNeeded(scrollingLogic4.m515toFloatk4lQ0M(nestedScrollScope.mo470scrollByWithOverscrollOzD1aCk(scrollingLogic4.m513reverseIfNeededMKHz9U(scrollingLogic4.m516toOffsettuRUvjQ(f11)), NestedScrollSource.Companion.m3624getSideEffectWNlRxjI())));
                }
            };
            scrollingLogic = this.this$0;
            Ref.LongRef longRef2 = this.$result;
            long j12 = this.$available;
            flingBehavior = scrollingLogic.flingBehavior;
            long j13 = longRef2.element;
            m508toFloatTH1AsA0 = scrollingLogic.m508toFloatTH1AsA0(j12);
            float reverseIfNeeded = scrollingLogic.reverseIfNeeded(m508toFloatTH1AsA0);
            this.L$0 = scrollingLogic;
            this.L$1 = scrollingLogic;
            this.L$2 = longRef2;
            this.J$0 = j13;
            this.label = 1;
            Object performFling = flingBehavior.performFling(scrollScope, reverseIfNeeded, this);
            if (performFling == l11) {
                return l11;
            }
            longRef = longRef2;
            obj = performFling;
            scrollingLogic2 = scrollingLogic;
            j11 = j13;
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            j11 = this.J$0;
            longRef = (Ref.LongRef) this.L$2;
            scrollingLogic = (ScrollingLogic) this.L$1;
            scrollingLogic2 = (ScrollingLogic) this.L$0;
            e.n(obj);
        }
        m509updateQWom1Mo = scrollingLogic.m509updateQWom1Mo(j11, scrollingLogic2.reverseIfNeeded(((Number) obj).floatValue()));
        longRef.element = m509updateQWom1Mo;
        return g2.f100423a;
    }
}
