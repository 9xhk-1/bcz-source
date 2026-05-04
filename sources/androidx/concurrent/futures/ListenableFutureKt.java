package androidx.concurrent.futures;

import c40.p;
import com.google.common.util.concurrent.p1;
import j00.c;
import java.util.concurrent.ExecutionException;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt;
import kotlin.coroutines.intrinsics.b;
import kotlin.jvm.internal.g0;
import l00.f;
import m80.k;
import m80.l;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes2.dex */
public final class ListenableFutureKt {
    @l
    public static final <T> Object await(@k final p1<T> p1Var, @k c<? super T> cVar) {
        try {
            if (p1Var.isDone()) {
                return AbstractResolvableFuture.getUninterruptibly(p1Var);
            }
            p pVar = new p(IntrinsicsKt__IntrinsicsJvmKt.e(cVar), 1);
            p1Var.addListener(new ToContinuation(p1Var, pVar), DirectExecutor.INSTANCE);
            pVar.p(new x00.l<Throwable, g2>() { // from class: androidx.concurrent.futures.ListenableFutureKt$await$$inlined$suspendCancellableCoroutine$lambda$1
                {
                    super(1);
                }

                @Override // x00.l
                public /* bridge */ /* synthetic */ g2 invoke(Throwable th2) {
                    invoke2(th2);
                    return g2.f100423a;
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@l Throwable th2) {
                    p1.this.cancel(false);
                }
            });
            Object F = pVar.F();
            if (F == b.l()) {
                f.c(cVar);
            }
            return F;
        } catch (ExecutionException e11) {
            throw nonNullCause(e11);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Throwable nonNullCause(@k ExecutionException executionException) {
        Throwable cause = executionException.getCause();
        if (cause == null) {
            g0.L();
        }
        return cause;
    }
}
