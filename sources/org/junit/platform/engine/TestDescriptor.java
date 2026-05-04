package org.junit.platform.engine;

import ba0.c2;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Optional;
import java.util.Set;
import java.util.function.Consumer;
import java.util.function.Predicate;
import org.apiguardian.api.API;
import org.junit.platform.engine.TestDescriptor;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@API(since = "1.0", status = API.Status.STABLE)
/* loaded from: classes9.dex */
public interface TestDescriptor {

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public enum Type {
        CONTAINER,
        TEST,
        CONTAINER_AND_TEST;

        public boolean isContainer() {
            return this == CONTAINER || this == CONTAINER_AND_TEST;
        }

        public boolean isTest() {
            return this == TEST || this == CONTAINER_AND_TEST;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @FunctionalInterface
    public interface a {
        void a(TestDescriptor descriptor);
    }

    static boolean d(TestDescriptor testDescriptor) {
        c2.r(testDescriptor, "TestDescriptor must not be null");
        return testDescriptor.u() || testDescriptor.A() || testDescriptor.C().stream().anyMatch(new Predicate() { // from class: ca0.z
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return TestDescriptor.d((TestDescriptor) obj);
            }
        });
    }

    default boolean A() {
        return false;
    }

    Optional<? extends TestDescriptor> B(UniqueId uniqueId);

    Set<? extends TestDescriptor> C();

    String a();

    default Set<? extends TestDescriptor> b() {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        linkedHashSet.addAll(C());
        Iterator<? extends TestDescriptor> it = C().iterator();
        while (it.hasNext()) {
            linkedHashSet.addAll(it.next().b());
        }
        return Collections.unmodifiableSet(linkedHashSet);
    }

    default String c() {
        return a();
    }

    default void e(final a visitor) {
        c2.r(visitor, "Visitor must not be null");
        visitor.a(this);
        new LinkedHashSet(C()).forEach(new Consumer() { // from class: ca0.a0
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                ((TestDescriptor) obj).e(TestDescriptor.a.this);
            }
        });
    }

    Set<TestTag> f();

    default boolean g() {
        return getType().isContainer();
    }

    Optional<TestDescriptor> getParent();

    Optional<TestSource> getSource();

    Type getType();

    UniqueId getUniqueId();

    void i(TestDescriptor descriptor);

    default void m() {
        if (s() || d(this)) {
            return;
        }
        r();
    }

    void o(TestDescriptor parent);

    void q(TestDescriptor descriptor);

    void r();

    default boolean s() {
        return !getParent().isPresent();
    }

    default boolean u() {
        return getType().isTest();
    }

    @API(since = "1.10", status = API.Status.STABLE)
    default Set<? extends TestDescriptor> w() {
        if (!getParent().isPresent()) {
            return Collections.EMPTY_SET;
        }
        TestDescriptor testDescriptor = getParent().get();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        linkedHashSet.add(testDescriptor);
        if (testDescriptor.getParent().isPresent()) {
            linkedHashSet.addAll(testDescriptor.w());
        }
        return Collections.unmodifiableSet(linkedHashSet);
    }
}
