package ac0;

import java.util.concurrent.ThreadFactory;
import rx.internal.util.RxThreadFactory;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public class g {

    /* renamed from: a, reason: collision with root package name */
    public static final g f2624a = new g();

    public static rx.d a() {
        return b(new RxThreadFactory("RxComputationScheduler-"));
    }

    public static rx.d b(ThreadFactory threadFactory) {
        if (threadFactory != null) {
            return new rx.internal.schedulers.b(threadFactory);
        }
        throw new NullPointerException("threadFactory == null");
    }

    public static rx.d c() {
        return d(new RxThreadFactory("RxIoScheduler-"));
    }

    public static rx.d d(ThreadFactory threadFactory) {
        if (threadFactory != null) {
            return new rx.internal.schedulers.a(threadFactory);
        }
        throw new NullPointerException("threadFactory == null");
    }

    public static rx.d e() {
        return f(new RxThreadFactory("RxNewThreadScheduler-"));
    }

    public static rx.d f(ThreadFactory threadFactory) {
        if (threadFactory != null) {
            return new rx.internal.schedulers.g(threadFactory);
        }
        throw new NullPointerException("threadFactory == null");
    }

    public static g h() {
        return f2624a;
    }

    public rx.d g() {
        return null;
    }

    public rx.d i() {
        return null;
    }

    public rx.d j() {
        return null;
    }

    @Deprecated
    public wb0.a k(wb0.a aVar) {
        return aVar;
    }
}
