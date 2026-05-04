package vb0;

import java.util.HashSet;
import java.util.List;
import qb0.c;
import qb0.f;
import rx.exceptions.CompositeException;
import rx.exceptions.OnCompletedFailedException;
import rx.exceptions.OnErrorFailedException;
import rx.exceptions.OnErrorNotImplementedException;
import rx.exceptions.OnErrorThrowable;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public static final int f93824a = 25;

    public a() {
        throw new IllegalStateException("No instances!");
    }

    public static void a(Throwable th2, Throwable th3) {
        HashSet hashSet = new HashSet();
        int i11 = 0;
        while (th2.getCause() != null) {
            int i12 = i11 + 1;
            if (i11 >= 25) {
                return;
            }
            th2 = th2.getCause();
            if (!hashSet.contains(th2.getCause())) {
                hashSet.add(th2.getCause());
                i11 = i12;
            }
        }
        try {
            th2.initCause(th3);
        } catch (Throwable unused) {
        }
    }

    public static Throwable b(Throwable th2) {
        int i11 = 0;
        while (th2.getCause() != null) {
            int i12 = i11 + 1;
            if (i11 >= 25) {
                return new RuntimeException("Stack too deep to get final cause");
            }
            th2 = th2.getCause();
            i11 = i12;
        }
        return th2;
    }

    public static RuntimeException c(Throwable th2) {
        if (th2 instanceof RuntimeException) {
            throw ((RuntimeException) th2);
        }
        if (th2 instanceof Error) {
            throw ((Error) th2);
        }
        throw new RuntimeException(th2);
    }

    public static void d(List<? extends Throwable> list) {
        if (list == null || list.isEmpty()) {
            return;
        }
        if (list.size() != 1) {
            throw new CompositeException(list);
        }
        Throwable th2 = list.get(0);
        if (th2 instanceof RuntimeException) {
            throw ((RuntimeException) th2);
        }
        if (!(th2 instanceof Error)) {
            throw new RuntimeException(th2);
        }
        throw ((Error) th2);
    }

    public static void e(Throwable th2) {
        if (th2 instanceof OnErrorNotImplementedException) {
            throw ((OnErrorNotImplementedException) th2);
        }
        if (th2 instanceof OnErrorFailedException) {
            throw ((OnErrorFailedException) th2);
        }
        if (th2 instanceof OnCompletedFailedException) {
            throw ((OnCompletedFailedException) th2);
        }
        if (th2 instanceof VirtualMachineError) {
            throw ((VirtualMachineError) th2);
        }
        if (th2 instanceof ThreadDeath) {
            throw ((ThreadDeath) th2);
        }
        if (th2 instanceof LinkageError) {
            throw ((LinkageError) th2);
        }
    }

    public static void f(Throwable th2, c<?> cVar) {
        e(th2);
        cVar.onError(th2);
    }

    public static void g(Throwable th2, c<?> cVar, Object obj) {
        e(th2);
        cVar.onError(OnErrorThrowable.addValueAsLastCause(th2, obj));
    }

    public static void h(Throwable th2, f<?> fVar) {
        e(th2);
        fVar.onError(th2);
    }

    public static void i(Throwable th2, f<?> fVar, Object obj) {
        e(th2);
        fVar.onError(OnErrorThrowable.addValueAsLastCause(th2, obj));
    }
}
