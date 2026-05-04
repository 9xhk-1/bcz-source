package f90;

import java.io.Serializable;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.IntFunction;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public class q2 extends b<r2> {
    public static /* synthetic */ boolean f(Serializable serializable) {
        return Array.getLength(serializable) > 0;
    }

    public static /* synthetic */ String g(List list) {
        return "Exactly one type of input must be provided in the @" + r2.class.getSimpleName() + " annotation, but there were " + list.size();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Object[] i(r2 valueSource) {
        final List list = (List) Stream.of((Object[]) new Serializable[]{valueSource.shorts(), valueSource.bytes(), valueSource.ints(), valueSource.longs(), valueSource.floats(), valueSource.doubles(), valueSource.chars(), valueSource.booleans(), valueSource.strings(), valueSource.classes()}).filter(new Predicate() { // from class: f90.n2
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return q2.f((Serializable) obj);
            }
        }).collect(Collectors.toList());
        ba0.c2.f(list.size() == 1, new Supplier() { // from class: f90.o2
            @Override // java.util.function.Supplier
            public final Object get() {
                return q2.g(list);
            }
        });
        final Object obj = list.get(0);
        return IntStream.range(0, Array.getLength(obj)).mapToObj(new IntFunction() { // from class: f90.p2
            @Override // java.util.function.IntFunction
            public final Object apply(int i11) {
                Object obj2;
                obj2 = Array.get(obj, i11);
                return obj2;
            }
        }).toArray();
    }

    @Override // f90.b
    /* renamed from: j, reason: merged with bridge method [inline-methods] */
    public Stream<? extends d> d(p80.n context, r2 valueSource) {
        return Arrays.stream(i(valueSource)).map(new Function() { // from class: f90.m2
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                d of2;
                of2 = d.of(obj);
                return of2;
            }
        });
    }
}
