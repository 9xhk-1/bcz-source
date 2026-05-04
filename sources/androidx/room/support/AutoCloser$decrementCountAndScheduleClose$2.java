package androidx.room.support;

import c40.a1;
import c40.r0;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@l00.d(c = "androidx.room.support.AutoCloser$decrementCountAndScheduleClose$2", f = "AutoCloser.android.kt", i = {}, l = {167}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes3.dex */
public final class AutoCloser$decrementCountAndScheduleClose$2 extends SuspendLambda implements x00.p<r0, j00.c<? super g2>, Object> {
    int label;
    final /* synthetic */ AutoCloser this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AutoCloser$decrementCountAndScheduleClose$2(AutoCloser autoCloser, j00.c<? super AutoCloser$decrementCountAndScheduleClose$2> cVar) {
        super(2, cVar);
        this.this$0 = autoCloser;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final j00.c<g2> create(Object obj, j00.c<?> cVar) {
        return new AutoCloser$decrementCountAndScheduleClose$2(this.this$0, cVar);
    }

    @Override // x00.p
    public final Object invoke(r0 r0Var, j00.c<? super g2> cVar) {
        return ((AutoCloser$decrementCountAndScheduleClose$2) create(r0Var, cVar)).invokeSuspend(g2.f100423a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        long j11;
        Object l11 = kotlin.coroutines.intrinsics.b.l();
        int i11 = this.label;
        if (i11 == 0) {
            kotlin.e.n(obj);
            j11 = this.this$0.autoCloseTimeoutInMs;
            this.label = 1;
            if (a1.b(j11, this) == l11) {
                return l11;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.e.n(obj);
        }
        this.this$0.autoCloseDatabase();
        return g2.f100423a;
    }
}
