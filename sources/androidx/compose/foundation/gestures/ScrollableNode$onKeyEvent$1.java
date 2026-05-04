package androidx.compose.foundation.gestures;

import androidx.compose.foundation.MutatePriority;
import androidx.compose.ui.input.nestedscroll.NestedScrollSource;
import c40.r0;
import j00.c;
import kotlin.coroutines.intrinsics.b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.e;
import l00.d;
import x00.p;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@d(c = "androidx.compose.foundation.gestures.ScrollableNode$onKeyEvent$1", f = "Scrollable.kt", i = {}, l = {475}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes.dex */
public final class ScrollableNode$onKeyEvent$1 extends SuspendLambda implements p<r0, c<? super g2>, Object> {
    final /* synthetic */ long $scrollAmount;
    int label;
    final /* synthetic */ ScrollableNode this$0;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @d(c = "androidx.compose.foundation.gestures.ScrollableNode$onKeyEvent$1$1", f = "Scrollable.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: androidx.compose.foundation.gestures.ScrollableNode$onKeyEvent$1$1, reason: invalid class name */
    public static final class AnonymousClass1 extends SuspendLambda implements p<NestedScrollScope, c<? super g2>, Object> {
        final /* synthetic */ long $scrollAmount;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(long j11, c<? super AnonymousClass1> cVar) {
            super(2, cVar);
            this.$scrollAmount = j11;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final c<g2> create(Object obj, c<?> cVar) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$scrollAmount, cVar);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        @Override // x00.p
        public final Object invoke(NestedScrollScope nestedScrollScope, c<? super g2> cVar) {
            return ((AnonymousClass1) create(nestedScrollScope, cVar)).invokeSuspend(g2.f100423a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            b.l();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            e.n(obj);
            ((NestedScrollScope) this.L$0).mo469scrollByOzD1aCk(this.$scrollAmount, NestedScrollSource.Companion.m3625getUserInputWNlRxjI());
            return g2.f100423a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScrollableNode$onKeyEvent$1(ScrollableNode scrollableNode, long j11, c<? super ScrollableNode$onKeyEvent$1> cVar) {
        super(2, cVar);
        this.this$0 = scrollableNode;
        this.$scrollAmount = j11;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final c<g2> create(Object obj, c<?> cVar) {
        return new ScrollableNode$onKeyEvent$1(this.this$0, this.$scrollAmount, cVar);
    }

    @Override // x00.p
    public final Object invoke(r0 r0Var, c<? super g2> cVar) {
        return ((ScrollableNode$onKeyEvent$1) create(r0Var, cVar)).invokeSuspend(g2.f100423a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        ScrollingLogic scrollingLogic;
        Object l11 = b.l();
        int i11 = this.label;
        if (i11 == 0) {
            e.n(obj);
            scrollingLogic = this.this$0.scrollingLogic;
            MutatePriority mutatePriority = MutatePriority.UserInput;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$scrollAmount, null);
            this.label = 1;
            if (scrollingLogic.scroll(mutatePriority, anonymousClass1, this) == l11) {
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
