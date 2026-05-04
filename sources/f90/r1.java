package f90;

import java.lang.reflect.Field;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Arrays;
import java.util.Iterator;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.BaseStream;
import java.util.stream.Stream;
import org.junit.platform.commons.JUnitException;
import org.junit.platform.commons.util.ReflectionUtils;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public class r1 extends b<s1> {
    public static /* synthetic */ Stream e(Object obj) {
        if (obj instanceof Supplier) {
            obj = ((Supplier) obj).get();
        }
        return ba0.n1.i(obj);
    }

    public static /* synthetic */ JUnitException n(Field field, Exception exc) {
        return new JUnitException(String.format("Could not read field [%s]", field.getName()), exc);
    }

    public static Field q(final Class<?> testClass, String fieldName) {
        ba0.c2.k(fieldName, "Field name must not be blank");
        final String trim = fieldName.trim();
        if (trim.contains("#") || trim.contains(".")) {
            String[] z12 = ReflectionUtils.z1(trim);
            String str = z12[0];
            trim = z12[1];
            testClass = ReflectionUtils.t1(str, ba0.m.a(testClass));
        }
        Field orElse = ReflectionUtils.R1(testClass, new Predicate() { // from class: f90.i1
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                boolean equals;
                equals = ((Field) obj).getName().equals(trim);
                return equals;
            }
        }, ReflectionUtils.HierarchyTraversalMode.BOTTOM_UP).findFirst().orElse(null);
        ba0.c2.s(orElse, new Supplier() { // from class: f90.j1
            @Override // java.util.function.Supplier
            public final Object get() {
                String format;
                format = String.format("Could not find field named [%s] in class [%s]", trim, testClass.getName());
                return format;
            }
        });
        return orElse;
    }

    public static boolean r(Field field, Object value) {
        if (ba0.n1.g(value.getClass())) {
            return true;
        }
        if (Supplier.class.isAssignableFrom(field.getType())) {
            Type genericType = field.getGenericType();
            if (genericType instanceof ParameterizedType) {
                Type[] actualTypeArguments = ((ParameterizedType) genericType).getActualTypeArguments();
                if (actualTypeArguments.length == 1) {
                    Type type = actualTypeArguments[0];
                    if (type instanceof Class) {
                        return ba0.n1.g((Class) type);
                    }
                    if (type instanceof ParameterizedType) {
                        Type rawType = ((ParameterizedType) type).getRawType();
                        if (rawType instanceof Class) {
                            return ba0.n1.g((Class) rawType);
                        }
                    }
                }
            }
        }
        return false;
    }

    public static Object t(final Field field, Object testInstance) {
        Object j11 = ReflectionUtils.b2(field, testInstance).j(new Function() { // from class: f90.p1
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return r1.n(field, (Exception) obj);
            }
        });
        final String name = field.getName();
        final String name2 = field.getDeclaringClass().getName();
        ba0.c2.s(j11, new Supplier() { // from class: f90.q1
            @Override // java.util.function.Supplier
            public final Object get() {
                String format;
                format = String.format("The value of field [%s] in class [%s] must not be null", name, name2);
                return format;
            }
        });
        ba0.c2.f(!(j11 instanceof BaseStream), new Supplier() { // from class: f90.f1
            @Override // java.util.function.Supplier
            public final Object get() {
                String format;
                format = String.format("The value of field [%s] in class [%s] must not be a stream", name, name2);
                return format;
            }
        });
        ba0.c2.f(!(j11 instanceof Iterator), new Supplier() { // from class: f90.g1
            @Override // java.util.function.Supplier
            public final Object get() {
                String format;
                format = String.format("The value of field [%s] in class [%s] must not be an Iterator", name, name2);
                return format;
            }
        });
        ba0.c2.f(r(field, j11), new Supplier() { // from class: f90.h1
            @Override // java.util.function.Supplier
            public final Object get() {
                String format;
                format = String.format("The value of field [%s] in class [%s] must be convertible to a Stream", name, name2);
                return format;
            }
        });
        return j11;
    }

    public static Field u(final Field field, Object testInstance) {
        ba0.c2.f(field.getDeclaringClass().isInstance(testInstance) || ReflectionUtils.o1(field), new Supplier() { // from class: f90.e1
            @Override // java.util.function.Supplier
            public final Object get() {
                String format;
                format = String.format("Field '%s' must be static: local @FieldSource fields must be static unless the PER_CLASS @TestInstance lifecycle mode is used; external @FieldSource fields must always be static.", field.toGenericString());
                return format;
            }
        });
        return field;
    }

    @Override // f90.b
    /* renamed from: s, reason: merged with bridge method [inline-methods] */
    public Stream<? extends d> d(p80.n context, s1 fieldSource) {
        final Class<?> Z = context.Z();
        final Object orElse = context.E().orElse(null);
        String[] value = fieldSource.value();
        if (value.length == 0) {
            value = new String[]{context.a0().getName()};
        }
        return Arrays.stream(value).map(new Function() { // from class: f90.k1
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                Field q11;
                q11 = r1.q(Z, (String) obj);
                return q11;
            }
        }).map(new Function() { // from class: f90.l1
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                Field u11;
                u11 = r1.u((Field) obj, orElse);
                return u11;
            }
        }).map(new Function() { // from class: f90.m1
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                Object t11;
                t11 = r1.t((Field) obj, orElse);
                return t11;
            }
        }).flatMap(new Function() { // from class: f90.n1
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return r1.e(obj);
            }
        }).map(new o1());
    }
}
