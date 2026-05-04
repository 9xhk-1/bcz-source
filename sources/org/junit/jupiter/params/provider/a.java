package org.junit.jupiter.params.provider;

import ba0.c2;
import f90.b;
import f90.d;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.EnumSet;
import java.util.Set;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import org.junit.jupiter.params.provider.EnumSource;
import p80.n;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public class a extends b<EnumSource> {
    public static /* synthetic */ String e(EnumSource enumSource) {
        return "Duplicate enum constant name(s) found in " + enumSource;
    }

    public static /* synthetic */ String f(Method method) {
        return "First parameter must reference an Enum type (alternatively, use the annotation's 'value' attribute to specify the type explicitly): " + method.toGenericString();
    }

    public static /* synthetic */ String g(Method method) {
        return "Test method must declare at least one parameter: " + method.toGenericString();
    }

    public static /* synthetic */ boolean i(EnumSource.Mode mode, Set set, Enum r22) {
        return !mode.select(r22, set);
    }

    public final <E extends Enum<E>> Class<E> j(n nVar, EnumSource enumSource) {
        Class<E> cls = (Class<E>) enumSource.value();
        if (!cls.equals(NullEnum.class)) {
            return cls;
        }
        final Method a02 = nVar.a0();
        Class[] parameterTypes = a02.getParameterTypes();
        c2.f(parameterTypes.length > 0, new Supplier() { // from class: f90.n0
            @Override // java.util.function.Supplier
            public final Object get() {
                return org.junit.jupiter.params.provider.a.g(a02);
            }
        });
        c2.f(Enum.class.isAssignableFrom(parameterTypes[0]), new Supplier() { // from class: f90.o0
            @Override // java.util.function.Supplier
            public final Object get() {
                return org.junit.jupiter.params.provider.a.f(a02);
            }
        });
        return parameterTypes[0];
    }

    public final <E extends Enum<E>> Set<? extends E> k(n context, EnumSource enumSource) {
        return EnumSet.allOf(j(context, enumSource));
    }

    @Override // f90.b
    /* renamed from: l, reason: merged with bridge method [inline-methods] */
    public Stream<? extends d> d(n context, final EnumSource enumSource) {
        Set<? extends Enum<?>> k11 = k(context, enumSource);
        final EnumSource.Mode mode = enumSource.mode();
        String[] names = enumSource.names();
        if (names.length > 0) {
            final Set<String> set = (Set) Arrays.stream(names).collect(Collectors.toSet());
            c2.f(set.size() == names.length, new Supplier() { // from class: f90.p0
                @Override // java.util.function.Supplier
                public final Object get() {
                    return org.junit.jupiter.params.provider.a.e(EnumSource.this);
                }
            });
            mode.validate(enumSource, k11, set);
            k11.removeIf(new Predicate() { // from class: f90.q0
                @Override // java.util.function.Predicate
                public final boolean test(Object obj) {
                    return org.junit.jupiter.params.provider.a.i(EnumSource.Mode.this, set, (Enum) obj);
                }
            });
        }
        return k11.stream().map(new Function() { // from class: f90.r0
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                d of2;
                of2 = d.of((Enum) obj);
                return of2;
            }
        });
    }
}
