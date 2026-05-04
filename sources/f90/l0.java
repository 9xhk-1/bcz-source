package f90;

import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.Optional;
import java.util.Set;
import java.util.SortedMap;
import java.util.SortedSet;
import java.util.function.Supplier;
import java.util.stream.Stream;
import org.junit.platform.commons.PreconditionViolationException;
import org.junit.platform.commons.util.ReflectionUtils;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public class l0 implements e {
    public static Optional<Constructor<?>> c(Class<?> clazz) {
        try {
            return Optional.of(clazz.getConstructor(null));
        } catch (NoSuchMethodException unused) {
            return Optional.empty();
        }
    }

    @Override // f90.e
    public Stream<? extends d> a(p80.n context) {
        NavigableMap emptyNavigableMap;
        SortedMap emptySortedMap;
        NavigableSet emptyNavigableSet;
        SortedSet emptySortedSet;
        final Method a02 = context.a0();
        Class<?>[] parameterTypes = a02.getParameterTypes();
        ba0.c2.f(parameterTypes.length > 0, new Supplier() { // from class: f90.k0
            @Override // java.util.function.Supplier
            public final Object get() {
                String format;
                format = String.format("@EmptySource cannot provide an empty argument to method [%s]: the method does not declare any formal parameters.", a02.toGenericString());
                return format;
            }
        });
        Class<?> cls = parameterTypes[0];
        if (String.class.equals(cls)) {
            return Stream.of(d.c(""));
        }
        if (Collection.class.equals(cls)) {
            return Stream.of(d.c(Collections.EMPTY_SET));
        }
        if (List.class.equals(cls)) {
            return Stream.of(d.c(Collections.EMPTY_LIST));
        }
        if (Set.class.equals(cls)) {
            return Stream.of(d.c(Collections.EMPTY_SET));
        }
        if (SortedSet.class.equals(cls)) {
            emptySortedSet = Collections.emptySortedSet();
            return Stream.of(d.c(emptySortedSet));
        }
        if (NavigableSet.class.equals(cls)) {
            emptyNavigableSet = Collections.emptyNavigableSet();
            return Stream.of(d.c(emptyNavigableSet));
        }
        if (Map.class.equals(cls)) {
            return Stream.of(d.c(Collections.EMPTY_MAP));
        }
        if (SortedMap.class.equals(cls)) {
            emptySortedMap = Collections.emptySortedMap();
            return Stream.of(d.c(emptySortedMap));
        }
        if (NavigableMap.class.equals(cls)) {
            emptyNavigableMap = Collections.emptyNavigableMap();
            return Stream.of(d.c(emptyNavigableMap));
        }
        if (Collection.class.isAssignableFrom(cls) || Map.class.isAssignableFrom(cls)) {
            Optional<Constructor<?>> c11 = c(cls);
            if (c11.isPresent()) {
                return Stream.of(d.c(ReflectionUtils.y1(c11.get(), new Object[0])));
            }
        }
        if (cls.isArray()) {
            return Stream.of(d.c(Array.newInstance(cls.getComponentType(), 0)));
        }
        throw new PreconditionViolationException(String.format("@EmptySource cannot provide an empty argument to method [%s]: [%s] is not a supported type.", a02.toGenericString(), cls.getName()));
    }
}
