package com.google.common.util.concurrent;

import com.google.common.base.Preconditions;
import com.google.common.collect.p7;
import com.google.common.collect.q8;
import com.google.common.util.concurrent.j2;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import javax.annotation.CheckForNull;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@go.d
@go.c
@l0
/* loaded from: classes7.dex */
public final class j2 implements u2 {

    /* renamed from: a, reason: collision with root package name */
    public final ExecutorService f34687a;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class a implements InvocationHandler {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Object f34688a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ long f34689b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ TimeUnit f34690c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ Set f34691d;

        /* renamed from: e, reason: collision with root package name */
        public final /* synthetic */ j2 f34692e;

        public a(final j2 this$0, final Object val$target, final long val$timeoutDuration, final TimeUnit val$timeoutUnit, final Set val$interruptibleMethods) {
            this.f34688a = val$target;
            this.f34689b = val$timeoutDuration;
            this.f34690c = val$timeoutUnit;
            this.f34691d = val$interruptibleMethods;
            this.f34692e = this$0;
        }

        public static /* synthetic */ Object a(Method method, Object obj, Object[] objArr) {
            try {
                return method.invoke(obj, objArr);
            } catch (InvocationTargetException e11) {
                throw j2.n(e11, false);
            }
        }

        @Override // java.lang.reflect.InvocationHandler
        @CheckForNull
        public Object invoke(Object obj, final Method method, @CheckForNull final Object[] args) throws Throwable {
            final Object obj2 = this.f34688a;
            return this.f34692e.h(new Callable() { // from class: com.google.common.util.concurrent.i2
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return j2.a.a(method, obj2, args);
                }
            }, this.f34689b, this.f34690c, this.f34691d.contains(method));
        }
    }

    public j2(ExecutorService executor) {
        this.f34687a = (ExecutorService) Preconditions.checkNotNull(executor);
    }

    public static void i(long timeoutDuration) {
        Preconditions.checkArgument(timeoutDuration > 0, "timeout must be positive: %s", timeoutDuration);
    }

    public static j2 j(ExecutorService executor) {
        return new j2(executor);
    }

    public static boolean k(Method method) {
        for (Class<?> cls : method.getExceptionTypes()) {
            if (cls == InterruptedException.class) {
                return true;
            }
        }
        return false;
    }

    public static Set<Method> l(Class<?> interfaceType) {
        HashSet u11 = q8.u();
        for (Method method : interfaceType.getMethods()) {
            if (k(method)) {
                u11.add(method);
            }
        }
        return u11;
    }

    public static <T> T m(Class<T> interfaceType, InvocationHandler handler) {
        return interfaceType.cast(Proxy.newProxyInstance(interfaceType.getClassLoader(), new Class[]{interfaceType}, handler));
    }

    public static Exception n(Exception e11, boolean combineStackTraces) throws Exception {
        Throwable cause = e11.getCause();
        if (cause == null) {
            throw e11;
        }
        if (combineStackTraces) {
            cause.setStackTrace((StackTraceElement[]) p7.f(cause.getStackTrace(), e11.getStackTrace(), StackTraceElement.class));
        }
        if (cause instanceof Exception) {
            throw ((Exception) cause);
        }
        if (cause instanceof Error) {
            throw ((Error) cause);
        }
        throw e11;
    }

    @Override // com.google.common.util.concurrent.u2
    public void a(Runnable runnable, long timeoutDuration, TimeUnit timeoutUnit) throws TimeoutException {
        Preconditions.checkNotNull(runnable);
        Preconditions.checkNotNull(timeoutUnit);
        i(timeoutDuration);
        Future<?> submit = this.f34687a.submit(runnable);
        try {
            y2.g(submit, timeoutDuration, timeoutUnit);
        } catch (ExecutionException e11) {
            p(e11.getCause());
            throw new AssertionError();
        } catch (TimeoutException e12) {
            submit.cancel(true);
            throw e12;
        }
    }

    @Override // com.google.common.util.concurrent.u2
    @z1
    @uo.a
    public <T> T b(Callable<T> callable, long j11, TimeUnit timeUnit) throws TimeoutException, ExecutionException {
        Preconditions.checkNotNull(callable);
        Preconditions.checkNotNull(timeUnit);
        i(j11);
        Future<T> submit = this.f34687a.submit(callable);
        try {
            return (T) y2.g(submit, j11, timeUnit);
        } catch (ExecutionException e11) {
            o(e11.getCause());
            throw new AssertionError();
        } catch (TimeoutException e12) {
            submit.cancel(true);
            throw e12;
        }
    }

    @Override // com.google.common.util.concurrent.u2
    @z1
    @uo.a
    public <T> T c(Callable<T> callable, long timeoutDuration, TimeUnit timeoutUnit) throws TimeoutException, InterruptedException, ExecutionException {
        Preconditions.checkNotNull(callable);
        Preconditions.checkNotNull(timeoutUnit);
        i(timeoutDuration);
        Future<T> submit = this.f34687a.submit(callable);
        try {
            return submit.get(timeoutDuration, timeoutUnit);
        } catch (InterruptedException e11) {
            e = e11;
            submit.cancel(true);
            throw e;
        } catch (ExecutionException e12) {
            o(e12.getCause());
            throw new AssertionError();
        } catch (TimeoutException e13) {
            e = e13;
            submit.cancel(true);
            throw e;
        }
    }

    @Override // com.google.common.util.concurrent.u2
    public void d(Runnable runnable, long timeoutDuration, TimeUnit timeoutUnit) throws TimeoutException, InterruptedException {
        Preconditions.checkNotNull(runnable);
        Preconditions.checkNotNull(timeoutUnit);
        i(timeoutDuration);
        Future<?> submit = this.f34687a.submit(runnable);
        try {
            submit.get(timeoutDuration, timeoutUnit);
        } catch (InterruptedException e11) {
            e = e11;
            submit.cancel(true);
            throw e;
        } catch (ExecutionException e12) {
            p(e12.getCause());
            throw new AssertionError();
        } catch (TimeoutException e13) {
            e = e13;
            submit.cancel(true);
            throw e;
        }
    }

    @Override // com.google.common.util.concurrent.u2
    public <T> T e(T t11, Class<T> cls, long j11, TimeUnit timeUnit) {
        Preconditions.checkNotNull(t11);
        Preconditions.checkNotNull(cls);
        Preconditions.checkNotNull(timeUnit);
        i(j11);
        Preconditions.checkArgument(cls.isInterface(), "interfaceType must be an interface type");
        return (T) m(cls, new a(this, t11, j11, timeUnit, l(cls)));
    }

    @z1
    public final <T> T h(Callable<T> callable, long j11, TimeUnit timeUnit, boolean z11) throws Exception {
        Preconditions.checkNotNull(callable);
        Preconditions.checkNotNull(timeUnit);
        i(j11);
        Future<T> submit = this.f34687a.submit(callable);
        try {
            return z11 ? submit.get(j11, timeUnit) : (T) y2.g(submit, j11, timeUnit);
        } catch (InterruptedException e11) {
            submit.cancel(true);
            throw e11;
        } catch (ExecutionException e12) {
            throw n(e12, true);
        } catch (TimeoutException e13) {
            submit.cancel(true);
            throw new UncheckedTimeoutException(e13);
        }
    }

    public final void o(Throwable cause) throws ExecutionException {
        if (cause instanceof Error) {
            throw new ExecutionError((Error) cause);
        }
        if (!(cause instanceof RuntimeException)) {
            throw new ExecutionException(cause);
        }
        throw new UncheckedExecutionException(cause);
    }

    public final void p(Throwable cause) {
        if (!(cause instanceof Error)) {
            throw new UncheckedExecutionException(cause);
        }
        throw new ExecutionError((Error) cause);
    }
}
