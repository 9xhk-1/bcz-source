package rx.internal.schedulers;

import androidx.camera.view.q;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import rx.d;
import rx.internal.util.RxThreadFactory;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public class h extends d.a implements qb0.h {

    /* renamed from: d, reason: collision with root package name */
    public static final String f86586d = "rx.scheduler.jdk6.purge-force";

    /* renamed from: e, reason: collision with root package name */
    public static final String f86587e = "RxSchedulerPurge-";

    /* renamed from: f, reason: collision with root package name */
    public static final boolean f86588f;

    /* renamed from: j, reason: collision with root package name */
    public static volatile Object f86592j;

    /* renamed from: a, reason: collision with root package name */
    public final ScheduledExecutorService f86594a;

    /* renamed from: b, reason: collision with root package name */
    public volatile boolean f86595b;

    /* renamed from: k, reason: collision with root package name */
    public static final Object f86593k = new Object();

    /* renamed from: h, reason: collision with root package name */
    public static final ConcurrentHashMap<ScheduledThreadPoolExecutor, ScheduledThreadPoolExecutor> f86590h = new ConcurrentHashMap<>();

    /* renamed from: i, reason: collision with root package name */
    public static final AtomicReference<ScheduledExecutorService> f86591i = new AtomicReference<>();

    /* renamed from: c, reason: collision with root package name */
    public static final String f86585c = "rx.scheduler.jdk6.purge-frequency-millis";

    /* renamed from: g, reason: collision with root package name */
    public static final int f86589g = Integer.getInteger(f86585c, 1000).intValue();

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class a implements Runnable {
        @Override // java.lang.Runnable
        public void run() {
            h.C();
        }
    }

    static {
        boolean z11 = Boolean.getBoolean(f86586d);
        int a11 = rx.internal.util.i.a();
        f86588f = !z11 && (a11 == 0 || a11 >= 21);
    }

    public h(ThreadFactory threadFactory) {
        ScheduledExecutorService newScheduledThreadPool = Executors.newScheduledThreadPool(1, threadFactory);
        if (!L(newScheduledThreadPool) && (newScheduledThreadPool instanceof ScheduledThreadPoolExecutor)) {
            D((ScheduledThreadPoolExecutor) newScheduledThreadPool);
        }
        this.f86594a = newScheduledThreadPool;
    }

    public static void C() {
        try {
            Iterator<ScheduledThreadPoolExecutor> it = f86590h.keySet().iterator();
            while (it.hasNext()) {
                ScheduledThreadPoolExecutor next = it.next();
                if (next.isShutdown()) {
                    it.remove();
                } else {
                    next.purge();
                }
            }
        } catch (Throwable th2) {
            vb0.a.e(th2);
            ac0.c.I(th2);
        }
    }

    public static void D(ScheduledThreadPoolExecutor scheduledThreadPoolExecutor) {
        while (true) {
            AtomicReference<ScheduledExecutorService> atomicReference = f86591i;
            if (atomicReference.get() != null) {
                break;
            }
            ScheduledExecutorService newScheduledThreadPool = Executors.newScheduledThreadPool(1, new RxThreadFactory(f86587e));
            if (q.a(atomicReference, null, newScheduledThreadPool)) {
                a aVar = new a();
                int i11 = f86589g;
                newScheduledThreadPool.scheduleAtFixedRate(aVar, i11, i11, TimeUnit.MILLISECONDS);
                break;
            }
            newScheduledThreadPool.shutdownNow();
        }
        f86590h.putIfAbsent(scheduledThreadPoolExecutor, scheduledThreadPoolExecutor);
    }

    public static boolean L(ScheduledExecutorService scheduledExecutorService) {
        Method r11;
        if (f86588f) {
            if (scheduledExecutorService instanceof ScheduledThreadPoolExecutor) {
                Object obj = f86592j;
                Object obj2 = f86593k;
                if (obj == obj2) {
                    return false;
                }
                if (obj == null) {
                    r11 = r(scheduledExecutorService);
                    if (r11 != null) {
                        obj2 = r11;
                    }
                    f86592j = obj2;
                } else {
                    r11 = (Method) obj;
                }
            } else {
                r11 = r(scheduledExecutorService);
            }
            if (r11 != null) {
                try {
                    r11.invoke(scheduledExecutorService, Boolean.TRUE);
                    return true;
                } catch (IllegalAccessException e11) {
                    ac0.c.I(e11);
                } catch (IllegalArgumentException e12) {
                    ac0.c.I(e12);
                } catch (InvocationTargetException e13) {
                    ac0.c.I(e13);
                }
            }
        }
        return false;
    }

    public static void q(ScheduledExecutorService scheduledExecutorService) {
        f86590h.remove(scheduledExecutorService);
    }

    public static Method r(ScheduledExecutorService scheduledExecutorService) {
        for (Method method : scheduledExecutorService.getClass().getMethods()) {
            if (method.getName().equals("setRemoveOnCancelPolicy")) {
                Class<?>[] parameterTypes = method.getParameterTypes();
                if (parameterTypes.length == 1 && parameterTypes[0] == Boolean.TYPE) {
                    return method;
                }
            }
        }
        return null;
    }

    public ScheduledAction E(wb0.a aVar, long j11, TimeUnit timeUnit) {
        ScheduledAction scheduledAction = new ScheduledAction(ac0.c.P(aVar));
        scheduledAction.add(j11 <= 0 ? this.f86594a.submit(scheduledAction) : this.f86594a.schedule(scheduledAction, j11, timeUnit));
        return scheduledAction;
    }

    public ScheduledAction H(wb0.a aVar, long j11, TimeUnit timeUnit, ec0.b bVar) {
        ScheduledAction scheduledAction = new ScheduledAction(ac0.c.P(aVar), bVar);
        bVar.a(scheduledAction);
        scheduledAction.add(j11 <= 0 ? this.f86594a.submit(scheduledAction) : this.f86594a.schedule(scheduledAction, j11, timeUnit));
        return scheduledAction;
    }

    public ScheduledAction I(wb0.a aVar, long j11, TimeUnit timeUnit, rx.internal.util.m mVar) {
        ScheduledAction scheduledAction = new ScheduledAction(ac0.c.P(aVar), mVar);
        mVar.a(scheduledAction);
        scheduledAction.add(j11 <= 0 ? this.f86594a.submit(scheduledAction) : this.f86594a.schedule(scheduledAction, j11, timeUnit));
        return scheduledAction;
    }

    @Override // rx.d.a
    public qb0.h h(wb0.a aVar) {
        return j(aVar, 0L, null);
    }

    @Override // qb0.h
    public boolean isUnsubscribed() {
        return this.f86595b;
    }

    @Override // rx.d.a
    public qb0.h j(wb0.a aVar, long j11, TimeUnit timeUnit) {
        return this.f86595b ? ec0.f.e() : E(aVar, j11, timeUnit);
    }

    @Override // qb0.h
    public void unsubscribe() {
        this.f86595b = true;
        this.f86594a.shutdownNow();
        q(this.f86594a);
    }
}
