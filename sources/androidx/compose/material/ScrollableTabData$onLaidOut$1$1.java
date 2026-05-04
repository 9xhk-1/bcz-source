package androidx.compose.material;

import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.foundation.ScrollState;
import c40.r0;
import j00.c;
import kotlin.coroutines.intrinsics.b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.e;
import l00.d;
import x00.p;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@d(c = "androidx.compose.material.ScrollableTabData$onLaidOut$1$1", f = "TabRow.kt", i = {}, l = {452}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes.dex */
public final class ScrollableTabData$onLaidOut$1$1 extends SuspendLambda implements p<r0, c<? super g2>, Object> {
    final /* synthetic */ int $calculatedOffset;
    int label;
    final /* synthetic */ ScrollableTabData this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScrollableTabData$onLaidOut$1$1(ScrollableTabData scrollableTabData, int i11, c<? super ScrollableTabData$onLaidOut$1$1> cVar) {
        super(2, cVar);
        this.this$0 = scrollableTabData;
        this.$calculatedOffset = i11;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final c<g2> create(Object obj, c<?> cVar) {
        return new ScrollableTabData$onLaidOut$1$1(this.this$0, this.$calculatedOffset, cVar);
    }

    @Override // x00.p
    public final Object invoke(r0 r0Var, c<? super g2> cVar) {
        return ((ScrollableTabData$onLaidOut$1$1) create(r0Var, cVar)).invokeSuspend(g2.f100423a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        ScrollState scrollState;
        AnimationSpec<Float> animationSpec;
        Object l11 = b.l();
        int i11 = this.label;
        if (i11 == 0) {
            e.n(obj);
            scrollState = this.this$0.scrollState;
            int i12 = this.$calculatedOffset;
            animationSpec = TabRowKt.ScrollableTabRowScrollSpec;
            this.label = 1;
            if (scrollState.animateScrollTo(i12, animationSpec, this) == l11) {
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
