package y80;

import java.util.function.Predicate;
import org.apiguardian.api.API;
import org.junit.platform.commons.util.ReflectionUtils;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@API(since = "5.0", status = API.Status.INTERNAL)
/* loaded from: classes9.dex */
public class c implements Predicate<Class<?>> {
    @Override // java.util.function.Predicate
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public boolean test(Class<?> candidate) {
        if (ReflectionUtils.i1(candidate) || ReflectionUtils.M0(candidate) || candidate.isLocalClass() || candidate.isAnonymousClass()) {
            return false;
        }
        return !ReflectionUtils.W0(candidate);
    }
}
