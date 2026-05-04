package c90;

import ba0.e4;
import c90.o;
import java.lang.reflect.Method;
import java.lang.reflect.Parameter;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;
import org.junit.jupiter.api.extension.ParameterResolutionException;
import org.junit.platform.commons.util.ReflectionUtils;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public class o {

    /* renamed from: a, reason: collision with root package name */
    public final Parameter[] f8422a;

    /* renamed from: b, reason: collision with root package name */
    public final d[] f8423b;

    /* renamed from: c, reason: collision with root package name */
    public final List<e> f8424c;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class c implements d {

        /* renamed from: b, reason: collision with root package name */
        public static final c f8427b = new c(e90.e.f49610a);

        /* renamed from: a, reason: collision with root package name */
        public final e90.b f8428a;

        public c(e90.b argumentConverter) {
            this.f8428a = argumentConverter;
        }

        @Override // c90.o.d
        public Object a(p80.t parameterContext, Object[] arguments, int invocationIndex) {
            try {
                return this.f8428a.a(arguments[parameterContext.getIndex()], parameterContext);
            } catch (Exception e11) {
                throw o.j("Error converting parameter", e11, parameterContext);
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public interface d {
        Object a(p80.t parameterContext, Object[] arguments, int invocationIndex);
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static abstract class e {

        /* renamed from: a, reason: collision with root package name */
        public static final e f8429a = new a("CONVERTER", 0);

        /* renamed from: b, reason: collision with root package name */
        public static final e f8430b = new b("AGGREGATOR", 1);

        /* renamed from: c, reason: collision with root package name */
        public static final /* synthetic */ e[] f8431c = a();

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public enum a extends e {
            public a(String $enum$name, int $enum$ordinal) {
                super($enum$name, $enum$ordinal);
            }

            public static /* synthetic */ e90.b c(p80.t tVar, e90.b bVar) {
                return (e90.b) v90.j.h(tVar.b(), bVar);
            }

            public static /* synthetic */ e90.b d(Class cls) {
                return (e90.b) ReflectionUtils.x1(cls, new Object[0]);
            }

            @Override // c90.o.e
            public d b(final p80.t parameterContext) {
                try {
                    return (d) org.junit.platform.commons.util.a.m(parameterContext.b(), e90.c.class).map(new Function() { // from class: c90.q
                        @Override // java.util.function.Function
                        public final Object apply(Object obj) {
                            return ((e90.c) obj).value();
                        }
                    }).map(new Function() { // from class: c90.r
                        @Override // java.util.function.Function
                        public final Object apply(Object obj) {
                            return o.e.a.d((Class) obj);
                        }
                    }).map(new Function() { // from class: c90.s
                        @Override // java.util.function.Function
                        public final Object apply(Object obj) {
                            return o.e.a.c(p80.t.this, (e90.b) obj);
                        }
                    }).map(new Function() { // from class: c90.t
                        @Override // java.util.function.Function
                        public final Object apply(Object obj) {
                            return new o.c((e90.b) obj);
                        }
                    }).orElse(c.f8427b);
                } catch (Exception e11) {
                    throw o.j("Error creating ArgumentConverter", e11, parameterContext);
                }
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public enum b extends e {
            public b(String $enum$name, int $enum$ordinal) {
                super($enum$name, $enum$ordinal);
            }

            public static /* synthetic */ d90.d c(Class cls) {
                return (d90.d) z90.i.n(cls, new Object[0]);
            }

            @Override // c90.o.e
            public d b(p80.t parameterContext) {
                try {
                    return (d) org.junit.platform.commons.util.a.m(parameterContext.b(), d90.a.class).map(new Function() { // from class: c90.u
                        @Override // java.util.function.Function
                        public final Object apply(Object obj) {
                            return ((d90.a) obj).value();
                        }
                    }).map(new Function() { // from class: c90.v
                        @Override // java.util.function.Function
                        public final Object apply(Object obj) {
                            return o.e.b.c((Class) obj);
                        }
                    }).map(new Function() { // from class: c90.w
                        @Override // java.util.function.Function
                        public final Object apply(Object obj) {
                            return new o.b((d90.d) obj);
                        }
                    }).orElse(b.f8425b);
                } catch (Exception e11) {
                    throw o.j("Error creating ArgumentsAggregator", e11, parameterContext);
                }
            }
        }

        public e(String $enum$name, int $enum$ordinal) {
        }

        public static /* synthetic */ e[] a() {
            return new e[]{f8429a, f8430b};
        }

        public static e valueOf(String name) {
            return (e) Enum.valueOf(e.class, name);
        }

        public static e[] values() {
            return (e[]) f8431c.clone();
        }

        public abstract d b(p80.t parameterContext);
    }

    public o(Method testMethod) {
        Parameter[] parameters;
        parameters = testMethod.getParameters();
        this.f8422a = parameters;
        this.f8423b = new d[parameters.length];
        this.f8424c = new ArrayList(parameters.length);
        for (Parameter parameter : parameters) {
            this.f8424c.add(i(parameter) ? e.f8430b : e.f8429a);
        }
    }

    public static boolean i(Parameter parameter) {
        Class type;
        type = parameter.getType();
        return d90.b.class.isAssignableFrom(type) || org.junit.platform.commons.util.a.y(parameter, d90.a.class);
    }

    public static ParameterResolutionException j(String message, Exception cause, p80.t parameterContext) {
        String str = message + " at index " + parameterContext.getIndex();
        if (e4.h(cause.getMessage())) {
            str = str + ": " + cause.getMessage();
        }
        return new ParameterResolutionException(str, cause);
    }

    public int b() {
        return this.f8422a.length;
    }

    public Optional<String> c(int parameterIndex) {
        boolean isNamePresent;
        String name;
        if (parameterIndex >= b()) {
            return Optional.empty();
        }
        Parameter parameter = this.f8422a[parameterIndex];
        isNamePresent = parameter.isNamePresent();
        if (!isNamePresent) {
            return Optional.empty();
        }
        if (e() && parameterIndex >= g()) {
            return Optional.empty();
        }
        name = parameter.getName();
        return Optional.of(name);
    }

    public final d d(p80.t parameterContext) {
        int index = parameterContext.getIndex();
        d[] dVarArr = this.f8423b;
        if (dVarArr[index] == null) {
            dVarArr[index] = this.f8424c.get(index).b(parameterContext);
        }
        return this.f8423b[index];
    }

    public boolean e() {
        return this.f8424c.contains(e.f8430b);
    }

    public boolean f() {
        int i11 = -1;
        for (int i12 = 0; i12 < b(); i12++) {
            if (h(i12)) {
                if (i11 != -1 && i12 != i11 + 1) {
                    return false;
                }
                i11 = i12;
            }
        }
        return true;
    }

    public int g() {
        return this.f8424c.indexOf(e.f8430b);
    }

    public boolean h(int parameterIndex) {
        return this.f8424c.get(parameterIndex) == e.f8430b;
    }

    public Object k(p80.t parameterContext, Object[] arguments, int invocationIndex) {
        return d(parameterContext).a(parameterContext, arguments, invocationIndex);
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class b implements d {

        /* renamed from: b, reason: collision with root package name */
        public static final b f8425b = new b(new d90.d() { // from class: c90.p
            @Override // d90.d
            public final Object a(d90.b bVar, p80.t tVar) {
                return o.b.b(bVar, tVar);
            }
        });

        /* renamed from: a, reason: collision with root package name */
        public final d90.d f8426a;

        public b(d90.d argumentsAggregator) {
            this.f8426a = argumentsAggregator;
        }

        @Override // c90.o.d
        public Object a(p80.t parameterContext, Object[] arguments, int invocationIndex) {
            try {
                return this.f8426a.a(new d90.g(parameterContext, invocationIndex, arguments), parameterContext);
            } catch (Exception e11) {
                throw o.j("Error aggregating arguments for parameter", e11, parameterContext);
            }
        }

        public static /* synthetic */ Object b(d90.b bVar, p80.t tVar) {
            return bVar;
        }
    }
}
