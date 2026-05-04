package androidx.datastore.core;

import j00.c;
import kotlin.coroutines.intrinsics.b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.e;
import kotlinx.coroutines.flow.j;
import l00.d;
import m80.k;
import m80.l;
import x00.p;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@d(c = "androidx.datastore.core.SingleProcessCoordinator$updateNotifications$1", f = "SingleProcessCoordinator.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes2.dex */
public final class SingleProcessCoordinator$updateNotifications$1 extends SuspendLambda implements p<j<? super g2>, c<? super g2>, Object> {
    int label;

    public SingleProcessCoordinator$updateNotifications$1(c<? super SingleProcessCoordinator$updateNotifications$1> cVar) {
        super(2, cVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @k
    public final c<g2> create(@l Object obj, @k c<?> cVar) {
        return new SingleProcessCoordinator$updateNotifications$1(cVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @l
    public final Object invokeSuspend(@k Object obj) {
        b.l();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        e.n(obj);
        return g2.f100423a;
    }

    @Override // x00.p
    @l
    public final Object invoke(@k j<? super g2> jVar, @l c<? super g2> cVar) {
        return ((SingleProcessCoordinator$updateNotifications$1) create(jVar, cVar)).invokeSuspend(g2.f100423a);
    }
}
