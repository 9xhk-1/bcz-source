package ia0;

import ba0.l;
import ca0.q;
import ca0.v;
import da0.c;
import da0.s1;
import java.util.ArrayList;
import java.util.function.Predicate;
import org.apiguardian.api.API;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@API(since = "1.5", status = API.Status.DEPRECATED)
@Deprecated
/* loaded from: classes9.dex */
public final class a {
    @Deprecated
    public static l a(q request, Predicate<Class<?>> classPredicate) {
        return l.e(b(request), classPredicate);
    }

    @Deprecated
    public static Predicate<String> b(q request) {
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(request.b(c.class));
        arrayList.addAll(request.b(s1.class));
        return v.e(arrayList).h();
    }
}
