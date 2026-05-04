package d30;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.jvm.internal.g0;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class c extends d {

    /* renamed from: c, reason: collision with root package name */
    @m80.k
    public final Runnable f47120c;

    /* renamed from: d, reason: collision with root package name */
    @m80.k
    public final x00.l<InterruptedException, g2> f47121d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public c(@m80.k Lock lock, @m80.k Runnable checkCancelled, @m80.k x00.l<? super InterruptedException, g2> interruptedExceptionHandler) {
        super(lock);
        g0.p(lock, "lock");
        g0.p(checkCancelled, "checkCancelled");
        g0.p(interruptedExceptionHandler, "interruptedExceptionHandler");
        this.f47120c = checkCancelled;
        this.f47121d = interruptedExceptionHandler;
    }

    @Override // d30.d, d30.k
    public void lock() {
        while (!a().tryLock(50L, TimeUnit.MILLISECONDS)) {
            try {
                this.f47120c.run();
            } catch (InterruptedException e11) {
                this.f47121d.invoke(e11);
                return;
            }
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public c(@m80.k Runnable checkCancelled, @m80.k x00.l<? super InterruptedException, g2> interruptedExceptionHandler) {
        this(new ReentrantLock(), checkCancelled, interruptedExceptionHandler);
        g0.p(checkCancelled, "checkCancelled");
        g0.p(interruptedExceptionHandler, "interruptedExceptionHandler");
    }
}
