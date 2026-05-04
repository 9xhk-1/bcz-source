package o00;

import a00.a0;
import a00.h0;
import java.lang.reflect.Method;
import java.util.List;
import java.util.regex.MatchResult;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import kotlin.random.Random;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nPlatformImplementations.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PlatformImplementations.kt\nkotlin/internal/PlatformImplementations\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,86:1\n1#2:87\n*E\n"})
/* loaded from: classes8.dex */
public class m {

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @u0({"SMAP\nPlatformImplementations.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PlatformImplementations.kt\nkotlin/internal/PlatformImplementations$ReflectThrowable\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,86:1\n1#2:87\n*E\n"})
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        @m80.k
        public static final a f75502a = new a();

        /* renamed from: b, reason: collision with root package name */
        @m80.l
        @w00.g
        public static final Method f75503b;

        /* renamed from: c, reason: collision with root package name */
        @m80.l
        @w00.g
        public static final Method f75504c;

        static {
            Method method;
            Method method2;
            Method[] methods = Throwable.class.getMethods();
            g0.m(methods);
            int length = methods.length;
            int i11 = 0;
            int i12 = 0;
            while (true) {
                method = null;
                if (i12 >= length) {
                    method2 = null;
                    break;
                }
                method2 = methods[i12];
                if (g0.g(method2.getName(), "addSuppressed")) {
                    Class<?>[] parameterTypes = method2.getParameterTypes();
                    g0.o(parameterTypes, "getParameterTypes(...)");
                    if (g0.g(a0.Ut(parameterTypes), Throwable.class)) {
                        break;
                    }
                }
                i12++;
            }
            f75503b = method2;
            int length2 = methods.length;
            while (true) {
                if (i11 >= length2) {
                    break;
                }
                Method method3 = methods[i11];
                if (g0.g(method3.getName(), "getSuppressed")) {
                    method = method3;
                    break;
                }
                i11++;
            }
            f75504c = method;
        }
    }

    public void a(@m80.k Throwable cause, @m80.k Throwable exception) {
        g0.p(cause, "cause");
        g0.p(exception, "exception");
        Method method = a.f75503b;
        if (method != null) {
            method.invoke(cause, exception);
        }
    }

    @m80.k
    public Random b() {
        return new e10.b();
    }

    @m80.l
    public u30.l c(@m80.k MatchResult matchResult, @m80.k String name) {
        g0.p(matchResult, "matchResult");
        g0.p(name, "name");
        throw new UnsupportedOperationException("Retrieving groups by name is not supported on this platform.");
    }

    @m80.k
    public List<Throwable> d(@m80.k Throwable exception) {
        Object invoke;
        List<Throwable> t11;
        g0.p(exception, "exception");
        Method method = a.f75504c;
        return (method == null || (invoke = method.invoke(exception, null)) == null || (t11 = a00.q.t((Throwable[]) invoke)) == null) ? h0.J() : t11;
    }

    @w30.h
    @m80.k
    public w30.b e() {
        throw new UnsupportedOperationException("getSystemClock should not be called on the base PlatformImplementations.");
    }
}
