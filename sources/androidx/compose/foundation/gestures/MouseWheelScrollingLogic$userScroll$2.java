package androidx.compose.foundation.gestures;

import androidx.compose.foundation.MutatePriority;
import c40.r0;
import j00.c;
import kotlin.coroutines.intrinsics.b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.e;
import l00.d;
import x00.p;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@d(c = "androidx.compose.foundation.gestures.MouseWheelScrollingLogic$userScroll$2", f = "MouseWheelScrollable.kt", i = {}, l = {122}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes.dex */
public final class MouseWheelScrollingLogic$userScroll$2 extends SuspendLambda implements p<r0, c<? super g2>, Object> {
    final /* synthetic */ p<NestedScrollScope, c<? super g2>, Object> $block;
    final /* synthetic */ ScrollingLogic $this_userScroll;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public MouseWheelScrollingLogic$userScroll$2(ScrollingLogic scrollingLogic, p<? super NestedScrollScope, ? super c<? super g2>, ? extends Object> pVar, c<? super MouseWheelScrollingLogic$userScroll$2> cVar) {
        super(2, cVar);
        this.$this_userScroll = scrollingLogic;
        this.$block = pVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final c<g2> create(Object obj, c<?> cVar) {
        return new MouseWheelScrollingLogic$userScroll$2(this.$this_userScroll, this.$block, cVar);
    }

    @Override // x00.p
    public final Object invoke(r0 r0Var, c<? super g2> cVar) {
        return ((MouseWheelScrollingLogic$userScroll$2) create(r0Var, cVar)).invokeSuspend(g2.f100423a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object l11 = b.l();
        int i11 = this.label;
        if (i11 == 0) {
            e.n(obj);
            ScrollingLogic scrollingLogic = this.$this_userScroll;
            MutatePriority mutatePriority = MutatePriority.UserInput;
            p<NestedScrollScope, c<? super g2>, Object> pVar = this.$block;
            this.label = 1;
            if (scrollingLogic.scroll(mutatePriority, pVar, this) == l11) {
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
