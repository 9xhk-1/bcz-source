package ga0;

import ba0.c2;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.Optional;
import java.util.Set;
import java.util.function.Consumer;
import java.util.function.Function;
import org.apiguardian.api.API;
import org.junit.platform.engine.TestDescriptor;
import org.junit.platform.engine.TestSource;
import org.junit.platform.engine.TestTag;
import org.junit.platform.engine.UniqueId;
import w80.d1;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@API(since = "1.0", status = API.Status.STABLE)
/* loaded from: classes9.dex */
public abstract class c implements TestDescriptor {

    /* renamed from: a, reason: collision with root package name */
    public final UniqueId f53525a;

    /* renamed from: b, reason: collision with root package name */
    public final String f53526b;

    /* renamed from: c, reason: collision with root package name */
    public final TestSource f53527c;

    /* renamed from: d, reason: collision with root package name */
    public TestDescriptor f53528d;

    /* renamed from: e, reason: collision with root package name */
    public final Set<TestDescriptor> f53529e;

    public c(UniqueId uniqueId, String displayName) {
        this(uniqueId, displayName, null);
    }

    @Override // org.junit.platform.engine.TestDescriptor
    public Optional<? extends TestDescriptor> B(final UniqueId uniqueId) {
        c2.r(uniqueId, "UniqueId must not be null");
        return getUniqueId().equals(uniqueId) ? Optional.of(this) : (Optional) this.f53529e.stream().map(new Function() { // from class: ga0.b
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                Optional B;
                B = ((TestDescriptor) obj).B(UniqueId.this);
                return B;
            }
        }).filter(new d1()).findAny().orElse(Optional.empty());
    }

    @Override // org.junit.platform.engine.TestDescriptor
    public final Set<? extends TestDescriptor> C() {
        return Collections.unmodifiableSet(this.f53529e);
    }

    @Override // org.junit.platform.engine.TestDescriptor
    public final String a() {
        return this.f53526b;
    }

    public final boolean equals(Object other) {
        if (other != null && getClass() == other.getClass()) {
            return getUniqueId().equals(((TestDescriptor) other).getUniqueId());
        }
        return false;
    }

    @Override // org.junit.platform.engine.TestDescriptor
    public Set<TestTag> f() {
        return Collections.EMPTY_SET;
    }

    @Override // org.junit.platform.engine.TestDescriptor
    public final Optional<TestDescriptor> getParent() {
        return Optional.ofNullable(this.f53528d);
    }

    @Override // org.junit.platform.engine.TestDescriptor
    public Optional<TestSource> getSource() {
        return Optional.ofNullable(this.f53527c);
    }

    @Override // org.junit.platform.engine.TestDescriptor
    public final UniqueId getUniqueId() {
        return this.f53525a;
    }

    public final int hashCode() {
        return this.f53525a.hashCode();
    }

    @Override // org.junit.platform.engine.TestDescriptor
    public void i(TestDescriptor child) {
        c2.r(child, "child must not be null");
        child.o(this);
        this.f53529e.add(child);
    }

    @Override // org.junit.platform.engine.TestDescriptor
    public final void o(TestDescriptor parent) {
        this.f53528d = parent;
    }

    @Override // org.junit.platform.engine.TestDescriptor
    public void q(TestDescriptor child) {
        c2.r(child, "child must not be null");
        this.f53529e.remove(child);
        child.o(null);
    }

    @Override // org.junit.platform.engine.TestDescriptor
    public void r() {
        c2.e(!s(), "cannot remove the root of a hierarchy");
        this.f53528d.q(this);
        this.f53529e.forEach(new Consumer() { // from class: ga0.a
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                ((TestDescriptor) obj).o(null);
            }
        });
        this.f53529e.clear();
    }

    public String toString() {
        return getClass().getSimpleName() + ": " + getUniqueId();
    }

    public c(UniqueId uniqueId, String displayName, TestSource source) {
        this.f53529e = Collections.synchronizedSet(new LinkedHashSet(16));
        this.f53525a = (UniqueId) c2.r(uniqueId, "UniqueId must not be null");
        this.f53526b = c2.k(displayName, "displayName must not be null or blank");
        this.f53527c = source;
    }
}
