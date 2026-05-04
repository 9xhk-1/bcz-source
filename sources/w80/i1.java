package w80;

import java.util.HashSet;
import java.util.Set;
import java.util.function.BiPredicate;
import java.util.function.Predicate;
import org.apiguardian.api.API;
import org.junit.platform.engine.UniqueId;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@API(since = "5.1", status = API.Status.INTERNAL)
/* loaded from: classes9.dex */
public class i1 implements BiPredicate<UniqueId, Integer> {

    /* renamed from: a, reason: collision with root package name */
    public final Set<UniqueId> f95832a = new HashSet();

    /* renamed from: b, reason: collision with root package name */
    public final Set<Integer> f95833b = new HashSet();

    /* renamed from: c, reason: collision with root package name */
    public b f95834c = b.EXPLICIT;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public enum b {
        EXPLICIT,
        ALLOW_ALL
    }

    public void d() {
        this.f95834c = b.ALLOW_ALL;
        this.f95832a.clear();
        this.f95833b.clear();
    }

    public void e(Set<Integer> indices) {
        if (this.f95834c == b.EXPLICIT) {
            this.f95833b.addAll(indices);
        }
    }

    public void f(UniqueId uniqueId) {
        if (this.f95834c == b.EXPLICIT) {
            this.f95832a.add(uniqueId);
        }
    }

    public final boolean g() {
        return this.f95832a.isEmpty() && this.f95833b.isEmpty();
    }

    public final boolean h(UniqueId currentUniqueId, UniqueId allowedUniqueId) {
        return allowedUniqueId.hasPrefix(currentUniqueId) || currentUniqueId.hasPrefix(allowedUniqueId);
    }

    public final boolean i(final UniqueId uniqueId) {
        return this.f95832a.stream().anyMatch(new Predicate() { // from class: w80.h1
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                boolean h11;
                h11 = i1.this.h(uniqueId, (UniqueId) obj);
                return h11;
            }
        });
    }

    @Override // java.util.function.BiPredicate
    /* renamed from: j */
    public boolean test(UniqueId uniqueId, Integer index) {
        return g() || i(uniqueId) || this.f95833b.contains(index);
    }

    public i1 k() {
        return new c();
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class c extends i1 {
        public c() {
        }

        @Override // w80.i1, java.util.function.BiPredicate
        /* renamed from: j, reason: merged with bridge method [inline-methods] */
        public boolean test(UniqueId uniqueId, Integer index) {
            return i1.this.g() || i1.this.i(uniqueId);
        }

        @Override // w80.i1
        public i1 k() {
            return this;
        }
    }
}
