package androidx.compose.foundation.pager;

import androidx.compose.foundation.gestures.ScrollScope;
import androidx.compose.foundation.internal.InlineClassHelperKt;
import j00.c;
import kotlin.coroutines.intrinsics.b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.e;
import kotlin.jvm.internal.u0;
import l00.d;
import x00.p;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@d(c = "androidx.compose.foundation.pager.PagerState$scrollToPage$2", f = "PagerState.kt", i = {}, l = {507}, m = "invokeSuspend", n = {}, s = {})
@u0({"SMAP\nPagerState.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PagerState.kt\nandroidx/compose/foundation/pager/PagerState$scrollToPage$2\n+ 2 PagerState.kt\nandroidx/compose/foundation/pager/PagerStateKt\n+ 3 InlineClassHelper.kt\nandroidx/compose/foundation/internal/InlineClassHelperKt\n*L\n1#1,994:1\n897#2,4:995\n96#3,5:999\n*S KotlinDebug\n*F\n+ 1 PagerState.kt\nandroidx/compose/foundation/pager/PagerState$scrollToPage$2\n*L\n506#1:995,4\n508#1:999,5\n*E\n"})
/* loaded from: classes.dex */
public final class PagerState$scrollToPage$2 extends SuspendLambda implements p<ScrollScope, c<? super g2>, Object> {
    final /* synthetic */ int $page;
    final /* synthetic */ float $pageOffsetFraction;
    int label;
    final /* synthetic */ PagerState this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PagerState$scrollToPage$2(PagerState pagerState, float f11, int i11, c<? super PagerState$scrollToPage$2> cVar) {
        super(2, cVar);
        this.this$0 = pagerState;
        this.$pageOffsetFraction = f11;
        this.$page = i11;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final c<g2> create(Object obj, c<?> cVar) {
        return new PagerState$scrollToPage$2(this.this$0, this.$pageOffsetFraction, this.$page, cVar);
    }

    @Override // x00.p
    public final Object invoke(ScrollScope scrollScope, c<? super g2> cVar) {
        return ((PagerState$scrollToPage$2) create(scrollScope, cVar)).invokeSuspend(g2.f100423a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object awaitScrollDependencies;
        int coerceInPageRange;
        Object l11 = b.l();
        int i11 = this.label;
        if (i11 == 0) {
            e.n(obj);
            PagerState pagerState = this.this$0;
            this.label = 1;
            awaitScrollDependencies = pagerState.awaitScrollDependencies(this);
            if (awaitScrollDependencies == l11) {
                return l11;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            e.n(obj);
        }
        float f11 = this.$pageOffsetFraction;
        double d11 = f11;
        boolean z11 = false;
        if (-0.5d <= d11 && d11 <= 0.5d) {
            z11 = true;
        }
        if (!z11) {
            InlineClassHelperKt.throwIllegalArgumentException("pageOffsetFraction " + f11 + " is not within the range -0.5 to 0.5");
        }
        coerceInPageRange = this.this$0.coerceInPageRange(this.$page);
        this.this$0.snapToItem$foundation_release(coerceInPageRange, this.$pageOffsetFraction, true);
        return g2.f100423a;
    }
}
