package ba0;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Optional;
import java.util.Set;
import java.util.Spliterators;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.IntFunction;
import java.util.function.Supplier;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;
import java.util.stream.StreamSupport;
import org.apiguardian.api.API;
import org.junit.platform.commons.PreconditionViolationException;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@API(since = "1.0", status = API.Status.INTERNAL)
/* loaded from: classes9.dex */
public final class n1 {
    public static /* synthetic */ String a(Collection collection) {
        return "collection must contain exactly one element: " + collection;
    }

    public static <T> T c(Collection<T> collection) {
        return collection instanceof List ? (T) ((List) collection).get(0) : collection.iterator().next();
    }

    @API(since = "1.9.2", status = API.Status.INTERNAL)
    public static <T> void d(List<T> list, Consumer<? super T> action) {
        if (list.isEmpty()) {
            return;
        }
        if (list.size() == 1) {
            action.accept(list.get(0));
            return;
        }
        ListIterator<T> listIterator = list.listIterator(list.size());
        while (listIterator.hasPrevious()) {
            action.accept(listIterator.previous());
        }
    }

    @API(since = "1.11", status = API.Status.INTERNAL)
    public static <T> Optional<T> e(Collection<T> collection) {
        c2.r(collection, "collection must not be null");
        return collection.isEmpty() ? Optional.empty() : Optional.ofNullable(c(collection));
    }

    public static <T> T f(final Collection<T> collection) {
        c2.r(collection, "collection must not be null");
        c2.f(collection.size() == 1, new Supplier() { // from class: ba0.l1
            @Override // java.util.function.Supplier
            public final Object get() {
                return n1.a(collection);
            }
        });
        return (T) c(collection);
    }

    @API(since = "1.9.1", status = API.Status.INTERNAL)
    public static boolean g(Class<?> type) {
        if (type == null || type == Void.TYPE) {
            return false;
        }
        if (Stream.class.isAssignableFrom(type) || DoubleStream.class.isAssignableFrom(type) || IntStream.class.isAssignableFrom(type) || LongStream.class.isAssignableFrom(type) || Iterable.class.isAssignableFrom(type) || Iterator.class.isAssignableFrom(type) || Object[].class.isAssignableFrom(type)) {
            return true;
        }
        return type.isArray() && type.getComponentType().isPrimitive();
    }

    @API(since = "1.6", status = API.Status.INTERNAL)
    public static <T> Set<T> h(T[] values) {
        c2.r(values, "values array must not be null");
        if (values.length == 0) {
            return Collections.EMPTY_SET;
        }
        if (values.length == 1) {
            return Collections.singleton(values[0]);
        }
        HashSet hashSet = new HashSet();
        Collections.addAll(hashSet, values);
        return hashSet;
    }

    public static Stream<?> i(final Object object) {
        c2.r(object, "Object must not be null");
        if (object instanceof Stream) {
            return (Stream) object;
        }
        if (object instanceof DoubleStream) {
            return ((DoubleStream) object).boxed();
        }
        if (object instanceof IntStream) {
            return ((IntStream) object).boxed();
        }
        if (object instanceof LongStream) {
            return ((LongStream) object).boxed();
        }
        if (object instanceof Collection) {
            return ((Collection) object).stream();
        }
        if (object instanceof Iterable) {
            return StreamSupport.stream(((Iterable) object).spliterator(), false);
        }
        if (object instanceof Iterator) {
            return StreamSupport.stream(Spliterators.spliteratorUnknownSize((Iterator) object, 16), false);
        }
        if (object instanceof Object[]) {
            return Arrays.stream((Object[]) object);
        }
        if (object instanceof double[]) {
            return DoubleStream.of((double[]) object).boxed();
        }
        if (object instanceof int[]) {
            return IntStream.of((int[]) object).boxed();
        }
        if (object instanceof long[]) {
            return LongStream.of((long[]) object).boxed();
        }
        if (object.getClass().isArray() && object.getClass().getComponentType().isPrimitive()) {
            return IntStream.range(0, Array.getLength(object)).mapToObj(new IntFunction() { // from class: ba0.k1
                @Override // java.util.function.IntFunction
                public final Object apply(int i11) {
                    Object obj;
                    obj = Array.get(object, i11);
                    return obj;
                }
            });
        }
        throw new PreconditionViolationException("Cannot convert instance of " + object.getClass().getName() + " into a Stream: " + object);
    }

    public static <T> Collector<T, ?, List<T>> j() {
        return Collectors.collectingAndThen(Collectors.toList(), new Function() { // from class: ba0.m1
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return Collections.unmodifiableList((List) obj);
            }
        });
    }
}
