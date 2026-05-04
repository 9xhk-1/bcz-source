package p80;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import org.apiguardian.api.API;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@API(since = "5.10", status = API.Status.STABLE)
/* loaded from: classes9.dex */
public interface q extends m {
    @API(since = "5.8", status = API.Status.DEPRECATED)
    @Deprecated
    default void F(a<Void> invocation, n extensionContext) throws Throwable {
        invocation.b();
    }

    default void J(a<Void> invocation, v<Method> invocationContext, n extensionContext) throws Throwable {
        invocation.b();
    }

    @API(since = "5.11", status = API.Status.STABLE)
    default void K(a<Void> invocation, i invocationContext, n extensionContext) throws Throwable {
        F(invocation, extensionContext);
    }

    default void c(a<Void> invocation, v<Method> invocationContext, n extensionContext) throws Throwable {
        invocation.b();
    }

    default <T> T i(a<T> invocation, v<Constructor<T>> invocationContext, n extensionContext) throws Throwable {
        return invocation.b();
    }

    default <T> T m(a<T> invocation, v<Method> invocationContext, n extensionContext) throws Throwable {
        return invocation.b();
    }

    default void o(a<Void> invocation, v<Method> invocationContext, n extensionContext) throws Throwable {
        invocation.b();
    }

    default void p(a<Void> invocation, v<Method> invocationContext, n extensionContext) throws Throwable {
        invocation.b();
    }

    default void t(a<Void> invocation, v<Method> invocationContext, n extensionContext) throws Throwable {
        invocation.b();
    }

    default void v(a<Void> invocation, v<Method> invocationContext, n extensionContext) throws Throwable {
        invocation.b();
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @API(since = "5.10", status = API.Status.STABLE)
    public interface a<T> {
        T b() throws Throwable;

        @API(since = "5.10", status = API.Status.STABLE)
        default void skip() {
        }
    }
}
