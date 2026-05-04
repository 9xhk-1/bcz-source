package ba0;

import java.util.function.Function;
import java.util.function.Predicate;
import org.apiguardian.api.API;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@API(since = "1.0", status = API.Status.INTERNAL)
/* loaded from: classes9.dex */
public final class q1 {
    public static <T, V> Predicate<T> b(final Function<T, V> function, final Predicate<? super V> predicate) {
        c2.r(function, "function must not be null");
        c2.r(predicate, "predicate must not be null");
        return new Predicate() { // from class: ba0.p1
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                boolean test;
                test = predicate.test(function.apply(obj));
                return test;
            }
        };
    }
}
