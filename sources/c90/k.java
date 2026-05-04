package c90;

import ba0.c2;
import ba0.o1;
import java.lang.reflect.Method;
import java.util.concurrent.atomic.AtomicLong;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Stream;
import org.junit.platform.commons.JUnitException;
import org.junit.platform.commons.util.ReflectionUtils;
import p80.n;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public class k implements p80.h0 {

    /* renamed from: a, reason: collision with root package name */
    public static final String f8409a = "context";

    /* renamed from: b, reason: collision with root package name */
    public static final String f8410b = "junit.jupiter.params.displayname.argument.maxlength";

    /* renamed from: c, reason: collision with root package name */
    public static final String f8411c = "{default_display_name}";

    /* renamed from: d, reason: collision with root package name */
    public static final String f8412d = "junit.jupiter.params.displayname.default";

    public static /* synthetic */ p80.g0 L(k kVar, AtomicLong atomicLong, g0 g0Var, o oVar, f90.d dVar) {
        kVar.getClass();
        atomicLong.incrementAndGet();
        return kVar.T(g0Var, oVar, dVar, atomicLong.intValue());
    }

    public static /* synthetic */ f90.e M(Method method, f90.e eVar) {
        return (f90.e) v90.j.h(method, eVar);
    }

    public static Stream<? extends f90.d> S(f90.e provider, p80.n context) {
        try {
            return provider.a(context);
        } catch (Exception e11) {
            throw o1.e(e11);
        }
    }

    @Override // p80.h0
    public boolean D(p80.n context) {
        if (!context.k().isPresent()) {
            return false;
        }
        final Method method = context.k().get();
        if (!org.junit.platform.commons.util.a.y(method, a.class)) {
            return false;
        }
        o oVar = new o(method);
        c2.f(oVar.f(), new Supplier() { // from class: c90.b
            @Override // java.util.function.Supplier
            public final Object get() {
                String format;
                format = String.format("@ParameterizedTest method [%s] declares formal parameters in an invalid order: argument aggregators must be declared after any indexed arguments and before any arguments resolved by another ParameterResolver.", method.toGenericString());
                return format;
            }
        });
        V(context).put(f8409a, oVar);
        return true;
    }

    public final p80.g0 T(g0 formatter, o methodContext, f90.d arguments, int invocationIndex) {
        return new l(formatter, methodContext, arguments, invocationIndex);
    }

    public final g0 U(p80.n extensionContext, final Method templateMethod, o methodContext, String displayName, int argumentMaxLength) {
        a aVar = (a) org.junit.platform.commons.util.a.m(templateMethod, a.class).get();
        return new g0(c2.l((aVar.name().equals(f8411c) ? extensionContext.i(f8412d).orElse(a.f8380g) : aVar.name()).trim(), new Supplier() { // from class: c90.c
            @Override // java.util.function.Supplier
            public final Object get() {
                String format;
                format = String.format("Configuration error: @ParameterizedTest on method [%s] must be declared with a non-empty name.", templateMethod);
                return format;
            }
        }), displayName, methodContext, argumentMaxLength);
    }

    public final n.b V(p80.n context) {
        return context.U(n.a.b(k.class, context.a0()));
    }

    public final f90.e W(Class<? extends f90.e> clazz) {
        try {
            return (f90.e) ReflectionUtils.x1(clazz, new Object[0]);
        } catch (Exception e11) {
            if (e11 instanceof NoSuchMethodException) {
                throw new JUnitException(String.format("Failed to find a no-argument constructor for ArgumentsProvider [%s]. Please ensure that a no-argument constructor exists and that the class is either a top-level class or a static nested class", clazz.getName()), e11);
            }
            throw e11;
        }
    }

    @Override // p80.h0
    public Stream<p80.g0> b(final p80.n extensionContext) {
        final Method a02 = extensionContext.a0();
        String a11 = extensionContext.a();
        final o oVar = (o) V(extensionContext).e(f8409a, o.class);
        final g0 U = U(extensionContext, a02, oVar, a11, ((Integer) extensionContext.c0(f8410b, new Function() { // from class: c90.d
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return Integer.valueOf(Integer.parseInt((String) obj));
            }
        }).orElse(512)).intValue());
        final AtomicLong atomicLong = new AtomicLong(0L);
        return (Stream) org.junit.platform.commons.util.a.s(a02, f90.f.class).stream().map(new Function() { // from class: c90.e
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((f90.f) obj).value();
            }
        }).map(new Function() { // from class: c90.f
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                f90.e W;
                W = k.this.W((Class) obj);
                return W;
            }
        }).map(new Function() { // from class: c90.g
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return k.M(a02, (f90.e) obj);
            }
        }).flatMap(new Function() { // from class: c90.h
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                Stream S;
                S = k.S((f90.e) obj, p80.n.this);
                return S;
            }
        }).map(new Function() { // from class: c90.i
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return k.L(k.this, atomicLong, U, oVar, (f90.d) obj);
            }
        }).onClose(new Runnable() { // from class: c90.j
            @Override // java.lang.Runnable
            public final void run() {
                AtomicLong atomicLong2 = atomicLong;
                c2.e(r4.get() > 0, "Configuration error: You must configure at least one set of arguments for this @ParameterizedTest");
            }
        });
    }
}
