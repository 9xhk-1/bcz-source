package ja0;

import java.util.concurrent.ForkJoinPool;
import java.util.function.Predicate;
import org.apiguardian.api.API;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@API(since = "1.10", status = API.Status.STABLE)
/* loaded from: classes9.dex */
public interface l1 {
    int a();

    int b();

    int c();

    @API(since = "1.11", status = API.Status.STABLE)
    default Predicate<? super ForkJoinPool> d() {
        return null;
    }

    int e();

    int f();
}
