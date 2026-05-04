package ho;

import com.google.common.base.Preconditions;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import javax.annotation.CheckForNull;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@j
@go.b(emulated = true)
/* loaded from: classes7.dex */
public final class t0 {

    /* renamed from: a, reason: collision with root package name */
    @go.d
    @go.c
    public static final String f59719a = "sun.misc.JavaLangAccess";

    /* renamed from: b, reason: collision with root package name */
    @go.d
    @go.c
    @go.e
    public static final String f59720b = "sun.misc.SharedSecrets";

    /* renamed from: c, reason: collision with root package name */
    @go.d
    @go.c
    @CheckForNull
    public static final Object f59721c;

    /* renamed from: d, reason: collision with root package name */
    @go.d
    @go.c
    @CheckForNull
    public static final Method f59722d;

    /* renamed from: e, reason: collision with root package name */
    @go.d
    @go.c
    @CheckForNull
    public static final Method f59723e;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class a extends AbstractList<StackTraceElement> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Throwable f59724a;

        public a(final Throwable val$t) {
            this.f59724a = val$t;
        }

        @Override // java.util.AbstractList, java.util.List
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public StackTraceElement get(int n11) {
            Method method = t0.f59722d;
            Objects.requireNonNull(method);
            Object obj = t0.f59721c;
            Objects.requireNonNull(obj);
            return (StackTraceElement) t0.m(method, obj, this.f59724a, Integer.valueOf(n11));
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            Method method = t0.f59723e;
            Objects.requireNonNull(method);
            Object obj = t0.f59721c;
            Objects.requireNonNull(obj);
            return ((Integer) t0.m(method, obj, this.f59724a)).intValue();
        }
    }

    static {
        Object h11 = h();
        f59721c = h11;
        f59722d = h11 == null ? null : g();
        f59723e = h11 != null ? k(h11) : null;
    }

    public static List<Throwable> e(Throwable throwable) {
        Preconditions.checkNotNull(throwable);
        ArrayList arrayList = new ArrayList(4);
        arrayList.add(throwable);
        boolean z11 = false;
        Throwable th2 = throwable;
        while (true) {
            throwable = throwable.getCause();
            if (throwable == null) {
                return Collections.unmodifiableList(arrayList);
            }
            arrayList.add(throwable);
            if (throwable == th2) {
                throw new IllegalArgumentException("Loop in causal chain detected.", throwable);
            }
            if (z11) {
                th2 = th2.getCause();
            }
            z11 = !z11;
        }
    }

    @go.c
    @CheckForNull
    public static <X extends Throwable> X f(Throwable throwable, Class<X> expectedCauseType) {
        try {
            return expectedCauseType.cast(throwable.getCause());
        } catch (ClassCastException e11) {
            e11.initCause(throwable);
            throw e11;
        }
    }

    @go.d
    @go.c
    @CheckForNull
    public static Method g() {
        return i("getStackTraceElement", Throwable.class, Integer.TYPE);
    }

    @go.d
    @go.c
    @CheckForNull
    public static Object h() {
        try {
            return Class.forName(f59720b, false, null).getMethod("getJavaLangAccess", null).invoke(null, null);
        } catch (ThreadDeath e11) {
            throw e11;
        } catch (Throwable unused) {
            return null;
        }
    }

    @CheckForNull
    @go.d
    @go.c
    public static Method i(String name, Class<?>... parameterTypes) throws ThreadDeath {
        try {
            return Class.forName(f59719a, false, null).getMethod(name, parameterTypes);
        } catch (ThreadDeath e11) {
            throw e11;
        } catch (Throwable unused) {
            return null;
        }
    }

    public static Throwable j(Throwable throwable) {
        boolean z11 = false;
        Throwable th2 = throwable;
        while (true) {
            Throwable cause = throwable.getCause();
            if (cause == null) {
                return throwable;
            }
            if (cause == th2) {
                throw new IllegalArgumentException("Loop in causal chain detected.", cause);
            }
            if (z11) {
                th2 = th2.getCause();
            }
            z11 = !z11;
            throwable = cause;
        }
    }

    @go.d
    @go.c
    @CheckForNull
    public static Method k(Object jla) {
        try {
            Method i11 = i("getStackTraceDepth", Throwable.class);
            if (i11 == null) {
                return null;
            }
            i11.invoke(jla, new Throwable());
            return i11;
        } catch (IllegalAccessException | UnsupportedOperationException | InvocationTargetException unused) {
            return null;
        }
    }

    @go.c
    public static String l(Throwable throwable) {
        StringWriter stringWriter = new StringWriter();
        throwable.printStackTrace(new PrintWriter(stringWriter));
        return stringWriter.toString();
    }

    @go.d
    @go.c
    public static Object m(Method method, Object receiver, Object... params) {
        try {
            return method.invoke(receiver, params);
        } catch (IllegalAccessException e11) {
            throw new RuntimeException(e11);
        } catch (InvocationTargetException e12) {
            throw q(e12.getCause());
        }
    }

    @go.d
    @go.c
    public static List<StackTraceElement> n(Throwable t11) {
        Preconditions.checkNotNull(t11);
        return new a(t11);
    }

    @Deprecated
    @go.d
    @go.c
    public static List<StackTraceElement> o(Throwable throwable) {
        return p() ? n(throwable) : Collections.unmodifiableList(Arrays.asList(throwable.getStackTrace()));
    }

    @go.d
    @go.c
    @Deprecated
    public static boolean p() {
        return (f59722d == null || f59723e == null) ? false : true;
    }

    @Deprecated
    @go.d
    @go.c
    @uo.a
    public static RuntimeException q(Throwable throwable) {
        w(throwable);
        throw new RuntimeException(throwable);
    }

    @Deprecated
    @go.d
    @go.c
    public static <X extends Throwable> void r(@CheckForNull Throwable throwable, Class<X> declaredType) throws Throwable {
        if (throwable != null) {
            v(throwable, declaredType);
        }
    }

    @go.d
    @go.c
    @Deprecated
    public static void s(@CheckForNull Throwable throwable) {
        if (throwable != null) {
            w(throwable);
        }
    }

    @Deprecated
    @go.d
    @go.c
    public static <X extends Throwable> void t(@CheckForNull Throwable throwable, Class<X> declaredType) throws Throwable {
        r(throwable, declaredType);
        s(throwable);
    }

    @Deprecated
    @go.d
    @go.c
    public static <X1 extends Throwable, X2 extends Throwable> void u(@CheckForNull Throwable throwable, Class<X1> declaredType1, Class<X2> declaredType2) throws Throwable, Throwable {
        Preconditions.checkNotNull(declaredType2);
        r(throwable, declaredType1);
        t(throwable, declaredType2);
    }

    @go.c
    public static <X extends Throwable> void v(Throwable throwable, Class<X> declaredType) throws Throwable {
        Preconditions.checkNotNull(throwable);
        if (declaredType.isInstance(throwable)) {
            throw declaredType.cast(throwable);
        }
    }

    public static void w(Throwable throwable) {
        Preconditions.checkNotNull(throwable);
        if (throwable instanceof RuntimeException) {
            throw ((RuntimeException) throwable);
        }
        if (throwable instanceof Error) {
            throw ((Error) throwable);
        }
    }
}
