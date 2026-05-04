package z80;

import ba0.c2;
import ba0.e4;
import ba0.h4;
import java.lang.reflect.Constructor;
import java.lang.reflect.Executable;
import java.lang.reflect.Method;
import java.lang.reflect.Parameter;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import org.apiguardian.api.API;
import org.junit.jupiter.api.extension.ParameterResolutionException;
import org.junit.jupiter.api.j2;
import org.junit.platform.commons.util.ReflectionUtils;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@API(since = "5.9", status = API.Status.INTERNAL)
/* loaded from: classes9.dex */
public class k0 {

    /* renamed from: a, reason: collision with root package name */
    public static final y90.e f102387a = y90.g.c(k0.class);

    public static /* synthetic */ String b(p80.u uVar, Object obj, p80.t tVar, Executable executable) {
        String genericString;
        String name = uVar.getClass().getName();
        String name2 = obj != null ? obj.getClass().getName() : null;
        Parameter b11 = tVar.b();
        String c11 = c(executable);
        genericString = executable.toGenericString();
        return String.format("ParameterResolver [%s] resolved a value of type [%s] for parameter [%s] in %s [%s].", name, name2, b11, c11, genericString);
    }

    public static String c(Executable executable) {
        return executable instanceof Constructor ? "constructor" : "method";
    }

    public static Object d(final p80.t parameterContext, final Executable executable, final p80.n extensionContext, a90.o extensionRegistry) {
        String genericString;
        String genericString2;
        String genericString3;
        try {
            List list = (List) extensionRegistry.a(p80.u.class).filter(new Predicate() { // from class: z80.h0
                @Override // java.util.function.Predicate
                public final boolean test(Object obj) {
                    boolean a11;
                    a11 = ((p80.u) obj).a(p80.t.this, extensionContext);
                    return a11;
                }
            }).collect(Collectors.toList());
            if (list.isEmpty()) {
                Parameter b11 = parameterContext.b();
                String c11 = c(executable);
                genericString2 = executable.toGenericString();
                throw new ParameterResolutionException(String.format("No ParameterResolver registered for parameter [%s] in %s [%s].", b11, c11, genericString2));
            }
            if (list.size() <= 1) {
                final p80.u uVar = (p80.u) list.get(0);
                final Object u11 = uVar.u(parameterContext, extensionContext);
                g(parameterContext.b(), u11, executable, uVar);
                f102387a.l(new Supplier() { // from class: z80.j0
                    @Override // java.util.function.Supplier
                    public final Object get() {
                        return k0.b(p80.u.this, u11, parameterContext, executable);
                    }
                });
                return u11;
            }
            String str = (String) list.stream().map(new Function() { // from class: z80.i0
                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    return e4.d((p80.u) obj);
                }
            }).collect(Collectors.joining(j2.O));
            Parameter b12 = parameterContext.b();
            String c12 = c(executable);
            genericString3 = executable.toGenericString();
            throw new ParameterResolutionException(String.format("Discovered multiple competing ParameterResolvers for parameter [%s] in %s [%s]: %s", b12, c12, genericString3, str));
        } catch (ParameterResolutionException e11) {
            throw e11;
        } catch (Throwable th2) {
            h4.a(th2);
            Parameter b13 = parameterContext.b();
            String c13 = c(executable);
            genericString = executable.toGenericString();
            String format = String.format("Failed to resolve parameter [%s] in %s [%s]", b13, c13, genericString);
            if (e4.h(th2.getMessage())) {
                format = format + ": " + th2.getMessage();
            }
            throw new ParameterResolutionException(format, th2);
        }
    }

    public static Object[] e(Executable executable, Optional<Object> target, Optional<Object> outerInstance, p80.n extensionContext, a90.o extensionRegistry) {
        Parameter[] parameters;
        c2.r(target, "target must not be null");
        parameters = executable.getParameters();
        Object[] objArr = new Object[parameters.length];
        int i11 = 0;
        if (outerInstance.isPresent()) {
            objArr[0] = outerInstance.get();
            i11 = 1;
        }
        while (i11 < parameters.length) {
            objArr[i11] = d(new j(parameters[i11], i11, target), executable, extensionContext, extensionRegistry);
            i11++;
        }
        return objArr;
    }

    public static Object[] f(Method method, Optional<Object> target, p80.n extensionContext, a90.o extensionRegistry) {
        return e(method, target, Optional.empty(), extensionContext, extensionRegistry);
    }

    public static void g(Parameter parameter, Object value, Executable executable, p80.u resolver) {
        Class type;
        String genericString;
        String format;
        String genericString2;
        type = parameter.getType();
        if (ReflectionUtils.Q0(value, type)) {
            return;
        }
        if (value == null && type.isPrimitive()) {
            String name = resolver.getClass().getName();
            String c11 = c(executable);
            genericString2 = executable.toGenericString();
            format = String.format("ParameterResolver [%s] resolved a null value for parameter [%s] in %s [%s], but a primitive of type [%s] is required.", name, parameter, c11, genericString2, type.getName());
        } else {
            String name2 = resolver.getClass().getName();
            String name3 = value != null ? value.getClass().getName() : null;
            String c12 = c(executable);
            genericString = executable.toGenericString();
            format = String.format("ParameterResolver [%s] resolved a value of type [%s] for parameter [%s] in %s [%s], but a value assignment compatible with [%s] is required.", name2, name3, parameter, c12, genericString, type.getName());
        }
        throw new ParameterResolutionException(format);
    }
}
