package rx.internal.schedulers;

import androidx.camera.view.q;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public final class d implements j {

    /* renamed from: b, reason: collision with root package name */
    public static final ScheduledExecutorService[] f86573b = new ScheduledExecutorService[0];

    /* renamed from: c, reason: collision with root package name */
    public static final ScheduledExecutorService f86574c;

    /* renamed from: d, reason: collision with root package name */
    public static final d f86575d;

    /* renamed from: e, reason: collision with root package name */
    public static int f86576e;

    /* renamed from: a, reason: collision with root package name */
    public final AtomicReference<ScheduledExecutorService[]> f86577a = new AtomicReference<>(f86573b);

    static {
        ScheduledExecutorService newScheduledThreadPool = Executors.newScheduledThreadPool(0);
        f86574c = newScheduledThreadPool;
        newScheduledThreadPool.shutdown();
        f86575d = new d();
    }

    public d() {
        start();
    }

    public static ScheduledExecutorService a() {
        ScheduledExecutorService[] scheduledExecutorServiceArr = f86575d.f86577a.get();
        if (scheduledExecutorServiceArr == f86573b) {
            return f86574c;
        }
        int i11 = f86576e + 1;
        if (i11 >= scheduledExecutorServiceArr.length) {
            i11 = 0;
        }
        f86576e = i11;
        return scheduledExecutorServiceArr[i11];
    }

    @Override // rx.internal.schedulers.j
    public void shutdown() {
        ScheduledExecutorService[] scheduledExecutorServiceArr;
        ScheduledExecutorService[] scheduledExecutorServiceArr2;
        do {
            scheduledExecutorServiceArr = this.f86577a.get();
            scheduledExecutorServiceArr2 = f86573b;
            if (scheduledExecutorServiceArr == scheduledExecutorServiceArr2) {
                return;
            }
        } while (!q.a(this.f86577a, scheduledExecutorServiceArr, scheduledExecutorServiceArr2));
        for (ScheduledExecutorService scheduledExecutorService : scheduledExecutorServiceArr) {
            h.q(scheduledExecutorService);
            scheduledExecutorService.shutdownNow();
        }
    }

    @Override // rx.internal.schedulers.j
    public void start() {
        int availableProcessors = Runtime.getRuntime().availableProcessors();
        if (availableProcessors > 4) {
            availableProcessors /= 2;
        }
        if (availableProcessors > 8) {
            availableProcessors = 8;
        }
        ScheduledExecutorService[] scheduledExecutorServiceArr = new ScheduledExecutorService[availableProcessors];
        int i11 = 0;
        for (int i12 = 0; i12 < availableProcessors; i12++) {
            scheduledExecutorServiceArr[i12] = e.a();
        }
        if (!q.a(this.f86577a, f86573b, scheduledExecutorServiceArr)) {
            while (i11 < availableProcessors) {
                scheduledExecutorServiceArr[i11].shutdownNow();
                i11++;
            }
        } else {
            while (i11 < availableProcessors) {
                ScheduledExecutorService scheduledExecutorService = scheduledExecutorServiceArr[i11];
                if (!h.L(scheduledExecutorService) && (scheduledExecutorService instanceof ScheduledThreadPoolExecutor)) {
                    h.D((ScheduledThreadPoolExecutor) scheduledExecutorService);
                }
                i11++;
            }
        }
    }
}
