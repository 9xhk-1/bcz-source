package androidx.compose.foundation.gestures;

import android.support.v4.media.session.MediaSessionCompat;
import androidx.compose.foundation.MutatePriority;
import androidx.compose.foundation.MutatorMutex;
import c40.r0;
import j00.c;
import kotlin.coroutines.intrinsics.b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.e;
import l00.d;
import x00.p;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@d(c = "androidx.compose.foundation.gestures.DefaultDraggable2DState$drag$2", f = "Draggable2D.kt", i = {}, l = {MediaSessionCompat.K}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes.dex */
public final class DefaultDraggable2DState$drag$2 extends SuspendLambda implements p<r0, c<? super g2>, Object> {
    final /* synthetic */ p<Drag2DScope, c<? super g2>, Object> $block;
    final /* synthetic */ MutatePriority $dragPriority;
    int label;
    final /* synthetic */ DefaultDraggable2DState this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public DefaultDraggable2DState$drag$2(DefaultDraggable2DState defaultDraggable2DState, MutatePriority mutatePriority, p<? super Drag2DScope, ? super c<? super g2>, ? extends Object> pVar, c<? super DefaultDraggable2DState$drag$2> cVar) {
        super(2, cVar);
        this.this$0 = defaultDraggable2DState;
        this.$dragPriority = mutatePriority;
        this.$block = pVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final c<g2> create(Object obj, c<?> cVar) {
        return new DefaultDraggable2DState$drag$2(this.this$0, this.$dragPriority, this.$block, cVar);
    }

    @Override // x00.p
    public final Object invoke(r0 r0Var, c<? super g2> cVar) {
        return ((DefaultDraggable2DState$drag$2) create(r0Var, cVar)).invokeSuspend(g2.f100423a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        MutatorMutex mutatorMutex;
        Drag2DScope drag2DScope;
        Object l11 = b.l();
        int i11 = this.label;
        if (i11 == 0) {
            e.n(obj);
            mutatorMutex = this.this$0.drag2DMutex;
            drag2DScope = this.this$0.drag2DScope;
            MutatePriority mutatePriority = this.$dragPriority;
            p<Drag2DScope, c<? super g2>, Object> pVar = this.$block;
            this.label = 1;
            if (mutatorMutex.mutateWith(drag2DScope, mutatePriority, pVar, this) == l11) {
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
