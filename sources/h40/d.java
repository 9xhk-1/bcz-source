package h40;

import java.lang.reflect.Method;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.locks.ReentrantLock;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    @m80.l
    public static final Method f58187a;

    static {
        Method method;
        try {
            method = ScheduledThreadPoolExecutor.class.getMethod("setRemoveOnCancelPolicy", Boolean.TYPE);
        } catch (Throwable unused) {
            method = null;
        }
        f58187a = method;
    }

    @m80.k
    public static final <E> Set<E> a(int i11) {
        return Collections.newSetFromMap(new IdentityHashMap(i11));
    }

    public static final boolean b(@m80.k Executor executor) {
        Method method;
        try {
            ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = executor instanceof ScheduledThreadPoolExecutor ? (ScheduledThreadPoolExecutor) executor : null;
            if (scheduledThreadPoolExecutor == null || (method = f58187a) == null) {
                return false;
            }
            method.invoke(scheduledThreadPoolExecutor, Boolean.TRUE);
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }

    public static final <T> T c(@m80.k ReentrantLock reentrantLock, @m80.k x00.a<? extends T> aVar) {
        reentrantLock.lock();
        try {
            return aVar.invoke();
        } finally {
            kotlin.jvm.internal.d0.d(1);
            reentrantLock.unlock();
            kotlin.jvm.internal.d0.c(1);
        }
    }
}
