package ba0;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;
import org.apiguardian.api.API;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@API(since = "1.7", status = API.Status.INTERNAL)
/* loaded from: classes9.dex */
public class w {

    /* renamed from: a, reason: collision with root package name */
    public static final String f6621a = "*";

    public static /* synthetic */ boolean b(Object obj) {
        return true;
    }

    public static /* synthetic */ boolean f(Object obj) {
        return false;
    }

    public static List<Pattern> h(String patterns) {
        return (List) Arrays.stream(patterns.split(",")).filter(new o()).map(new org.junit.jupiter.api.t1()).map(new Function() { // from class: ba0.r
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                String m11;
                m11 = w.m((String) obj);
                return m11;
            }
        }).map(new s()).collect(Collectors.toList());
    }

    public static <T> Predicate<T> i(String patterns, final Function<T, String> classNameProvider) {
        if ("*".equals(patterns)) {
            return new Predicate() { // from class: ba0.t
                @Override // java.util.function.Predicate
                public final boolean test(Object obj) {
                    return w.f(obj);
                }
            };
        }
        final List<Pattern> h11 = h(patterns);
        return new Predicate() { // from class: ba0.u
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                boolean noneMatch;
                noneMatch = h11.stream().noneMatch(new Predicate() { // from class: ba0.v
                    @Override // java.util.function.Predicate
                    public final boolean test(Object obj2) {
                        boolean matches;
                        matches = ((Pattern) obj2).matcher((CharSequence) r1.apply(obj)).matches();
                        return matches;
                    }
                });
                return noneMatch;
            }
        };
    }

    public static Predicate<String> j(String patterns) {
        return l(patterns, Function.identity());
    }

    public static <T> Predicate<T> k(String patterns) {
        return l(patterns, new Function() { // from class: ba0.n
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                String name;
                name = obj.getClass().getName();
                return name;
            }
        });
    }

    public static <T> Predicate<T> l(String patterns, final Function<T, String> classNameGetter) {
        return (Predicate) Optional.ofNullable(patterns).filter(new o()).map(new org.junit.jupiter.api.t1()).map(new Function() { // from class: ba0.p
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                Predicate i11;
                i11 = w.i((String) obj, classNameGetter);
                return i11;
            }
        }).orElse(new Predicate() { // from class: ba0.q
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return w.b(obj);
            }
        });
    }

    public static String m(String pattern) {
        return Matcher.quoteReplacement(pattern).replace(".", "[.$]").replace("*", ".+");
    }
}
