package y80;

import java.util.function.Predicate;
import org.apiguardian.api.API;
import org.junit.jupiter.api.v2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@API(since = "5.0", status = API.Status.INTERNAL)
/* loaded from: classes9.dex */
public class b implements Predicate<Class<?>> {

    /* renamed from: a, reason: collision with root package name */
    public static final a f99673a = new a();

    @Override // java.util.function.Predicate
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public boolean test(Class<?> candidate) {
        if (f99673a.test(candidate)) {
            return org.junit.platform.commons.util.a.y(candidate, v2.class);
        }
        return false;
    }
}
