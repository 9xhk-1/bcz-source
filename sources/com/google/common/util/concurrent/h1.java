package com.google.common.util.concurrent;

import com.google.common.base.Preconditions;
import com.google.common.collect.s7;
import java.lang.ref.WeakReference;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import javax.annotation.CheckForNull;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@go.d
@go.c
@l0
/* loaded from: classes7.dex */
public final class h1 {

    /* renamed from: a, reason: collision with root package name */
    public static final s7<List<Class<?>>> f34664a;

    /* renamed from: b, reason: collision with root package name */
    public static final s7<Constructor<?>> f34665b;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @go.e
    public interface a {
        void a(Class<? extends Exception> exceptionClass);
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @go.e
    public static class b {

        /* renamed from: a, reason: collision with root package name */
        public static final a f34666a = a();

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public enum a implements a {
            INSTANCE;


            /* renamed from: b, reason: collision with root package name */
            public static final Set<WeakReference<Class<? extends Exception>>> f34668b = new CopyOnWriteArraySet();

            @Override // com.google.common.util.concurrent.h1.a
            public void a(Class<? extends Exception> exceptionClass) {
                Iterator<WeakReference<Class<? extends Exception>>> it = f34668b.iterator();
                while (it.hasNext()) {
                    if (exceptionClass.equals(it.next().get())) {
                        return;
                    }
                }
                h1.e(exceptionClass);
                Set<WeakReference<Class<? extends Exception>>> set = f34668b;
                if (set.size() > 1000) {
                    set.clear();
                }
                set.add(new WeakReference<>(exceptionClass));
            }
        }

        public static a a() {
            return h1.n();
        }
    }

    static {
        s7<List<Class<?>>> F = s7.z().D(new ho.r() { // from class: com.google.common.util.concurrent.e1
            @Override // ho.r
            public final Object apply(Object obj) {
                Comparable valueOf;
                valueOf = Boolean.valueOf(((List) obj).contains(String.class));
                return valueOf;
            }
        }).e(s7.z().D(new ho.r() { // from class: com.google.common.util.concurrent.f1
            @Override // ho.r
            public final Object apply(Object obj) {
                Comparable valueOf;
                valueOf = Boolean.valueOf(((List) obj).contains(Throwable.class));
                return valueOf;
            }
        })).F();
        f34664a = F;
        f34665b = F.D(new ho.r() { // from class: com.google.common.util.concurrent.g1
            @Override // ho.r
            public final Object apply(Object obj) {
                List asList;
                asList = Arrays.asList(((Constructor) obj).getParameterTypes());
                return asList;
            }
        });
    }

    public static a d() {
        return b.f34666a;
    }

    @go.e
    public static void e(Class<? extends Exception> exceptionClass) {
        Preconditions.checkArgument(j(exceptionClass), "Futures.getChecked exception type (%s) must not be a RuntimeException", exceptionClass);
        Preconditions.checkArgument(i(exceptionClass), "Futures.getChecked exception type (%s) must be an accessible class with an accessible constructor whose parameters (if any) must be of type String and/or Throwable", exceptionClass);
    }

    @z1
    @go.e
    @uo.a
    public static <V, X extends Exception> V f(a validator, Future<V> future, Class<X> exceptionClass) throws Exception {
        validator.a(exceptionClass);
        try {
            return future.get();
        } catch (InterruptedException e11) {
            Thread.currentThread().interrupt();
            throw l(exceptionClass, e11);
        } catch (ExecutionException e12) {
            o(e12.getCause(), exceptionClass);
            throw new AssertionError();
        }
    }

    @z1
    @uo.a
    public static <V, X extends Exception> V g(Future<V> future, Class<X> cls) throws Exception {
        return (V) f(d(), future, cls);
    }

    @z1
    @uo.a
    public static <V, X extends Exception> V h(Future<V> future, Class<X> exceptionClass, long timeout, TimeUnit unit) throws Exception {
        d().a(exceptionClass);
        try {
            return future.get(timeout, unit);
        } catch (InterruptedException e11) {
            Thread.currentThread().interrupt();
            throw l(exceptionClass, e11);
        } catch (ExecutionException e12) {
            o(e12.getCause(), exceptionClass);
            throw new AssertionError();
        } catch (TimeoutException e13) {
            throw l(exceptionClass, e13);
        }
    }

    public static boolean i(Class<? extends Exception> exceptionClass) {
        try {
            l(exceptionClass, new Exception());
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }

    @go.e
    public static boolean j(Class<? extends Exception> type) {
        return !RuntimeException.class.isAssignableFrom(type);
    }

    @CheckForNull
    public static <X> X k(Constructor<X> constructor, Throwable cause) {
        Class<?>[] parameterTypes = constructor.getParameterTypes();
        Object[] objArr = new Object[parameterTypes.length];
        for (int i11 = 0; i11 < parameterTypes.length; i11++) {
            Class<?> cls = parameterTypes[i11];
            if (cls.equals(String.class)) {
                objArr[i11] = cause.toString();
            } else {
                if (!cls.equals(Throwable.class)) {
                    return null;
                }
                objArr[i11] = cause;
            }
        }
        try {
            return constructor.newInstance(objArr);
        } catch (IllegalAccessException | IllegalArgumentException | InstantiationException | InvocationTargetException unused) {
            return null;
        }
    }

    public static <X extends Exception> X l(Class<X> exceptionClass, Throwable cause) {
        Iterator it = m(Arrays.asList(exceptionClass.getConstructors())).iterator();
        while (it.hasNext()) {
            X x11 = (X) k((Constructor) it.next(), cause);
            if (x11 != null) {
                if (x11.getCause() == null) {
                    x11.initCause(cause);
                }
                return x11;
            }
        }
        throw new IllegalArgumentException("No appropriate constructor for exception of type " + exceptionClass + " in response to chained exception", cause);
    }

    public static <X extends Exception> List<Constructor<X>> m(List<Constructor<X>> list) {
        return (List<Constructor<X>>) f34665b.G(list);
    }

    @go.e
    public static a n() {
        return b.a.INSTANCE;
    }

    public static <X extends Exception> void o(Throwable cause, Class<X> exceptionClass) throws Exception {
        if (cause instanceof Error) {
            throw new ExecutionError((Error) cause);
        }
        if (!(cause instanceof RuntimeException)) {
            throw l(exceptionClass, cause);
        }
        throw new UncheckedExecutionException(cause);
    }
}
