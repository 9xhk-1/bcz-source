package org.junit.platform.engine.support.descriptor;

import ba0.c2;
import ba0.e4;
import ba0.g4;
import ba0.y;
import com.vivo.push.PushClientConstants;
import java.lang.reflect.Method;
import java.util.Objects;
import java.util.function.Function;
import java.util.function.Supplier;
import org.apiguardian.api.API;
import org.junit.platform.commons.PreconditionViolationException;
import org.junit.platform.commons.util.ReflectionUtils;
import org.junit.platform.engine.TestSource;
import org.junit.platform.engine.support.descriptor.MethodSource;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@API(since = "1.0", status = API.Status.STABLE)
/* loaded from: classes9.dex */
public class MethodSource implements TestSource {
    private static final long serialVersionUID = 1;
    private final String className;
    private Class<?> javaClass;
    private transient Method javaMethod;
    private final String methodName;
    private final String methodParameterTypes;

    private MethodSource(String className, String methodName) {
        this(className, methodName, null);
    }

    public static /* synthetic */ PreconditionViolationException a(MethodSource methodSource, Exception exc) {
        methodSource.getClass();
        return new PreconditionViolationException("Could not load class with name: " + methodSource.className, exc);
    }

    public static /* synthetic */ PreconditionViolationException b(MethodSource methodSource) {
        methodSource.getClass();
        return new PreconditionViolationException(String.format("Could not find method with name [%s] in class [%s].", methodSource.methodName, methodSource.javaClass.getName()));
    }

    public static /* synthetic */ PreconditionViolationException c(MethodSource methodSource) {
        methodSource.getClass();
        return new PreconditionViolationException(String.format("Could not find method with name [%s] and parameter types [%s] in class [%s].", methodSource.methodName, methodSource.methodParameterTypes, methodSource.javaClass.getName()));
    }

    public static MethodSource from(String className, String methodName) {
        return new MethodSource(className, methodName);
    }

    private void lazyLoadJavaClass() {
        if (this.javaClass == null) {
            this.javaClass = ReflectionUtils.X1(this.className).j(new Function() { // from class: ga0.j
                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    return MethodSource.a(MethodSource.this, (Exception) obj);
                }
            });
        }
    }

    private void lazyLoadJavaMethod() {
        lazyLoadJavaClass();
        if (this.javaMethod == null) {
            if (e4.h(this.methodParameterTypes)) {
                this.javaMethod = ReflectionUtils.h0(this.javaClass, this.methodName, this.methodParameterTypes).orElseThrow(new Supplier() { // from class: ga0.k
                    @Override // java.util.function.Supplier
                    public final Object get() {
                        return MethodSource.c(MethodSource.this);
                    }
                });
            } else {
                this.javaMethod = ReflectionUtils.i0(this.javaClass, this.methodName, new Class[0]).orElseThrow(new Supplier() { // from class: ga0.l
                    @Override // java.util.function.Supplier
                    public final Object get() {
                        return MethodSource.b(MethodSource.this);
                    }
                });
            }
        }
    }

    public boolean equals(Object o11) {
        if (this == o11) {
            return true;
        }
        if (o11 != null && getClass() == o11.getClass()) {
            MethodSource methodSource = (MethodSource) o11;
            if (Objects.equals(this.className, methodSource.className) && Objects.equals(this.methodName, methodSource.methodName) && Objects.equals(this.methodParameterTypes, methodSource.methodParameterTypes)) {
                return true;
            }
        }
        return false;
    }

    public String getClassName() {
        return this.className;
    }

    @API(since = "1.7", status = API.Status.STABLE)
    public final Class<?> getJavaClass() {
        lazyLoadJavaClass();
        return this.javaClass;
    }

    @API(since = "1.7", status = API.Status.STABLE)
    public final Method getJavaMethod() {
        lazyLoadJavaMethod();
        return this.javaMethod;
    }

    public final String getMethodName() {
        return this.methodName;
    }

    public final String getMethodParameterTypes() {
        return this.methodParameterTypes;
    }

    public int hashCode() {
        return Objects.hash(this.className, this.methodName, this.methodParameterTypes);
    }

    public String toString() {
        return new g4(this).a(PushClientConstants.TAG_CLASS_NAME, this.className).a("methodName", this.methodName).a("methodParameterTypes", this.methodParameterTypes).toString();
    }

    private MethodSource(String className, String methodName, String methodParameterTypes) {
        c2.k(className, "Class name must not be null or blank");
        c2.k(methodName, "Method name must not be null or blank");
        this.className = className;
        this.methodName = methodName;
        this.methodParameterTypes = methodParameterTypes;
    }

    public static MethodSource from(String className, String methodName, String methodParameterTypes) {
        return new MethodSource(className, methodName, methodParameterTypes);
    }

    @API(since = "1.5", status = API.Status.STABLE)
    public static MethodSource from(String className, String methodName, Class<?>... methodParameterTypes) {
        return new MethodSource(className, methodName, y.d(methodParameterTypes));
    }

    public static MethodSource from(Method testMethod) {
        return new MethodSource(testMethod);
    }

    @API(since = "1.3", status = API.Status.STABLE)
    public static MethodSource from(Class<?> testClass, Method testMethod) {
        return new MethodSource(testClass, testMethod);
    }

    private MethodSource(Method testMethod) {
        this(((Method) c2.r(testMethod, "Method must not be null")).getDeclaringClass(), testMethod);
    }

    private MethodSource(Class<?> testClass, Method testMethod) {
        c2.r(testClass, "Class must not be null");
        c2.r(testMethod, "Method must not be null");
        this.className = testClass.getName();
        this.methodName = testMethod.getName();
        this.methodParameterTypes = y.d(testMethod.getParameterTypes());
        this.javaClass = testClass;
        this.javaMethod = testMethod;
    }
}
