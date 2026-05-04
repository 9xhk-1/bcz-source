package androidx.compose.ui.viewinterop;

import androidx.compose.ui.input.nestedscroll.NestedScrollDispatcher;
import c40.r0;
import j00.c;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.e;
import l00.d;
import x00.p;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@d(c = "androidx.compose.ui.viewinterop.AndroidViewHolder$onNestedPreFling$1", f = "AndroidViewHolder.android.kt", i = {}, l = {650}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes2.dex */
public final class AndroidViewHolder$onNestedPreFling$1 extends SuspendLambda implements p<r0, c<? super g2>, Object> {
    final /* synthetic */ long $toBeConsumed;
    int label;
    final /* synthetic */ AndroidViewHolder this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AndroidViewHolder$onNestedPreFling$1(AndroidViewHolder androidViewHolder, long j11, c<? super AndroidViewHolder$onNestedPreFling$1> cVar) {
        super(2, cVar);
        this.this$0 = androidViewHolder;
        this.$toBeConsumed = j11;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final c<g2> create(Object obj, c<?> cVar) {
        return new AndroidViewHolder$onNestedPreFling$1(this.this$0, this.$toBeConsumed, cVar);
    }

    @Override // x00.p
    public final Object invoke(r0 r0Var, c<? super g2> cVar) {
        return ((AndroidViewHolder$onNestedPreFling$1) create(r0Var, cVar)).invokeSuspend(g2.f100423a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        NestedScrollDispatcher nestedScrollDispatcher;
        Object l11 = kotlin.coroutines.intrinsics.b.l();
        int i11 = this.label;
        if (i11 == 0) {
            e.n(obj);
            nestedScrollDispatcher = this.this$0.dispatcher;
            long j11 = this.$toBeConsumed;
            this.label = 1;
            if (nestedScrollDispatcher.m3608dispatchPreFlingQWom1Mo(j11, this) == l11) {
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
