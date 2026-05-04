package rx.internal.schedulers;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadFactory;
import rx.internal.util.RxThreadFactory;
import wb0.o;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public enum e {
    ;


    /* renamed from: a, reason: collision with root package name */
    public static final String f86578a = "RxScheduledExecutorPool-";

    /* renamed from: b, reason: collision with root package name */
    public static final RxThreadFactory f86579b = new RxThreadFactory(f86578a);

    public static ScheduledExecutorService a() {
        o<? extends ScheduledExecutorService> j11 = ac0.c.j();
        return j11 == null ? b() : j11.call();
    }

    public static ScheduledExecutorService b() {
        return Executors.newScheduledThreadPool(1, c());
    }

    public static ThreadFactory c() {
        return f86579b;
    }
}
