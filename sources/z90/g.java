package z90;

import ba0.y;
import java.util.function.Function;
import org.apiguardian.api.API;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@API(since = "1.1", status = API.Status.MAINTAINED)
/* loaded from: classes9.dex */
public final class g {
    public static String a(Function<? super Class<?>, ? extends String> mapper, Class<?>... classes) {
        return y.c(mapper, classes);
    }

    public static String b(Class<?>... classes) {
        return y.d(classes);
    }
}
