package ja0;

import java.util.List;
import java.util.function.Predicate;
import org.apiguardian.api.API;
import org.junit.platform.engine.support.hierarchical.ExclusiveResource;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@API(since = "1.10", status = API.Status.STABLE)
/* loaded from: classes9.dex */
public interface p1 extends AutoCloseable {
    static /* synthetic */ boolean K4(List list, ExclusiveResource exclusiveResource) {
        return !list.contains(exclusiveResource);
    }

    static /* synthetic */ boolean b1(List list, ExclusiveResource exclusiveResource) {
        return ExclusiveResource.f78260g.compare(exclusiveResource, (ExclusiveResource) list.get(list.size() - 1)) < 0;
    }

    boolean O0();

    default boolean Z7(p1 other) {
        final List<ExclusiveResource> v82 = v8();
        List<ExclusiveResource> v83 = other.v8();
        if (v82.isEmpty() || v83.isEmpty()) {
            return true;
        }
        if ((!(v82.size() == 1 && ExclusiveResource.f78258e.equals(v82.get(0))) && other.O0()) || O0()) {
            return false;
        }
        return !v83.stream().filter(new Predicate() { // from class: ja0.n1
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return p1.K4(v82, (ExclusiveResource) obj);
            }
        }).findFirst().filter(new Predicate() { // from class: ja0.o1
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return p1.b1(v82, (ExclusiveResource) obj);
            }
        }).isPresent();
    }

    p1 acquire() throws InterruptedException;

    @Override // java.lang.AutoCloseable
    default void close() {
        release();
    }

    void release();

    List<ExclusiveResource> v8();
}
