package org.junit.platform.engine.support.hierarchical;

import ba0.c2;
import ba0.g4;
import com.baicizhan.client.business.dataset.provider.a;
import ja0.q;
import java.util.Comparator;
import java.util.Objects;
import java.util.function.Function;
import org.apiguardian.api.API;
import org.junit.platform.engine.support.hierarchical.ExclusiveResource;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@API(since = "1.10", status = API.Status.STABLE)
/* loaded from: classes9.dex */
public class ExclusiveResource {

    /* renamed from: d, reason: collision with root package name */
    @API(since = "1.10", status = API.Status.STABLE)
    public static final String f78257d = "org.junit.platform.engine.support.hierarchical.ExclusiveResource.GLOBAL_KEY";

    /* renamed from: e, reason: collision with root package name */
    public static final ExclusiveResource f78258e = new ExclusiveResource("org.junit.platform.engine.support.hierarchical.ExclusiveResource.GLOBAL_KEY", LockMode.READ);

    /* renamed from: f, reason: collision with root package name */
    public static final ExclusiveResource f78259f = new ExclusiveResource("org.junit.platform.engine.support.hierarchical.ExclusiveResource.GLOBAL_KEY", LockMode.READ_WRITE);

    /* renamed from: g, reason: collision with root package name */
    public static final Comparator<ExclusiveResource> f78260g = Comparator.comparing(new q(), d().thenComparing(Comparator.naturalOrder())).thenComparing(new Function() { // from class: ja0.r
        @Override // java.util.function.Function
        public final Object apply(Object obj) {
            return ((ExclusiveResource) obj).c();
        }
    });

    /* renamed from: a, reason: collision with root package name */
    public final String f78261a;

    /* renamed from: b, reason: collision with root package name */
    public final LockMode f78262b;

    /* renamed from: c, reason: collision with root package name */
    public int f78263c;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public enum LockMode {
        READ_WRITE,
        READ
    }

    public ExclusiveResource(String key, LockMode lockMode) {
        this.f78261a = c2.k(key, "key must not be blank");
        this.f78262b = (LockMode) c2.r(lockMode, "lockMode must not be null");
    }

    public static Comparator<String> d() {
        return Comparator.comparing(new Function() { // from class: ja0.s
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                Boolean valueOf;
                String str = (String) obj;
                valueOf = Boolean.valueOf(!"org.junit.platform.engine.support.hierarchical.ExclusiveResource.GLOBAL_KEY".equals(str));
                return valueOf;
            }
        });
    }

    public String b() {
        return this.f78261a;
    }

    public LockMode c() {
        return this.f78262b;
    }

    public boolean equals(Object o11) {
        if (this == o11) {
            return true;
        }
        if (o11 != null && getClass() == o11.getClass()) {
            ExclusiveResource exclusiveResource = (ExclusiveResource) o11;
            if (Objects.equals(this.f78261a, exclusiveResource.f78261a) && this.f78262b == exclusiveResource.f78262b) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int i11 = this.f78263c;
        if (i11 != 0) {
            return i11;
        }
        int hash = Objects.hash(this.f78261a, this.f78262b);
        this.f78263c = hash;
        return hash;
    }

    public String toString() {
        return new g4(this).a(a.d.C0245a.f16161a, this.f78261a).a("lockMode", this.f78262b).toString();
    }
}
