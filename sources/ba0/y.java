package ba0;

import java.util.Arrays;
import java.util.function.Function;
import java.util.stream.Collectors;
import org.apiguardian.api.API;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@API(since = "1.0", status = API.Status.INTERNAL)
/* loaded from: classes9.dex */
public final class y {
    public static /* synthetic */ String a(Function function, Class cls) {
        return cls == null ? "null" : (String) function.apply(cls);
    }

    public static String b(Class<?> clazz) {
        return clazz == null ? "null" : clazz.getName();
    }

    public static String c(final Function<? super Class<?>, ? extends String> mapper, Class<?>... classes) {
        c2.r(mapper, "Mapping function must not be null");
        return (classes == null || classes.length == 0) ? "" : (String) Arrays.stream(classes).map(new Function() { // from class: ba0.x
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return y.a(mapper, (Class) obj);
            }
        }).collect(Collectors.joining(org.junit.jupiter.api.j2.O));
    }

    public static String d(Class<?>... classes) {
        return c(new z80.s(), classes);
    }
}
