package org.junit.platform.engine.support.hierarchical;

import ba0.c2;
import ja0.i1;
import ja0.p1;
import java.util.HashSet;
import java.util.Set;
import java.util.function.Consumer;
import java.util.function.Predicate;
import org.junit.platform.engine.TestDescriptor;
import org.junit.platform.engine.support.hierarchical.ExclusiveResource;
import org.junit.platform.engine.support.hierarchical.Node;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public class j {

    /* renamed from: a, reason: collision with root package name */
    public final f f78309a;

    /* renamed from: b, reason: collision with root package name */
    public final p1 f78310b;

    /* renamed from: c, reason: collision with root package name */
    public final p1 f78311c;

    public j() {
        this(new f());
    }

    public static /* synthetic */ void b(j jVar, Set set, g gVar, TestDescriptor testDescriptor) {
        set.addAll(jVar.k(testDescriptor));
        gVar.b(testDescriptor, Node.ExecutionMode.SAME_THREAD);
    }

    public static /* synthetic */ boolean e(ExclusiveResource exclusiveResource) {
        return exclusiveResource.c() == ExclusiveResource.LockMode.READ;
    }

    public static /* synthetic */ void g(g gVar, TestDescriptor testDescriptor) {
        gVar.b(testDescriptor, Node.ExecutionMode.SAME_THREAD);
        gVar.f(testDescriptor);
    }

    public static /* synthetic */ void h(j jVar, Consumer consumer, TestDescriptor testDescriptor) {
        jVar.getClass();
        consumer.accept(testDescriptor);
        jVar.i(testDescriptor, consumer);
    }

    public final void i(TestDescriptor parent, final Consumer<TestDescriptor> consumer) {
        parent.C().forEach(new Consumer() { // from class: ja0.h1
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                org.junit.platform.engine.support.hierarchical.j.h(org.junit.platform.engine.support.hierarchical.j.this, consumer, (TestDescriptor) obj);
            }
        });
    }

    public final void j(final g advisor, TestDescriptor testDescriptor) {
        advisor.b(testDescriptor, Node.ExecutionMode.SAME_THREAD);
        i(testDescriptor, new Consumer() { // from class: ja0.e1
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                org.junit.platform.engine.support.hierarchical.g.this.b((TestDescriptor) obj, Node.ExecutionMode.SAME_THREAD);
            }
        });
    }

    public final Set<ExclusiveResource> k(TestDescriptor testDescriptor) {
        return i1.a(testDescriptor).n();
    }

    public final boolean l(Set<ExclusiveResource> exclusiveResources) {
        return exclusiveResources.stream().allMatch(new Predicate() { // from class: ja0.g1
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return org.junit.platform.engine.support.hierarchical.j.e((ExclusiveResource) obj);
            }
        });
    }

    public g m(TestDescriptor rootDescriptor) {
        c2.e(k(rootDescriptor).isEmpty(), "Engine descriptor must not declare exclusive resources");
        final g gVar = new g();
        rootDescriptor.C().forEach(new Consumer() { // from class: ja0.f1
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                org.junit.platform.engine.support.hierarchical.j.this.c((TestDescriptor) obj, r3, gVar);
            }
        });
        return gVar;
    }

    /* renamed from: n, reason: merged with bridge method [inline-methods] */
    public final void c(final TestDescriptor globalLockDescriptor, TestDescriptor testDescriptor, final g advisor) {
        if (advisor.d(globalLockDescriptor) == this.f78311c) {
            return;
        }
        Set<ExclusiveResource> k11 = k(testDescriptor);
        if (k11.isEmpty()) {
            if (globalLockDescriptor.equals(testDescriptor)) {
                advisor.g(globalLockDescriptor, this.f78310b);
            }
            testDescriptor.C().forEach(new Consumer() { // from class: ja0.a1
                @Override // java.util.function.Consumer
                public final void accept(Object obj) {
                    org.junit.platform.engine.support.hierarchical.j.this.c(globalLockDescriptor, (TestDescriptor) obj, advisor);
                }
            });
            return;
        }
        final HashSet hashSet = new HashSet(k11);
        if (l(hashSet)) {
            i(testDescriptor, new Consumer() { // from class: ja0.b1
                @Override // java.util.function.Consumer
                public final void accept(Object obj) {
                    hashSet.addAll(org.junit.platform.engine.support.hierarchical.j.this.k((TestDescriptor) obj));
                }
            });
            if (!l(hashSet)) {
                j(advisor, testDescriptor);
            }
        } else {
            advisor.b(testDescriptor, Node.ExecutionMode.SAME_THREAD);
            i(testDescriptor, new Consumer() { // from class: ja0.c1
                @Override // java.util.function.Consumer
                public final void accept(Object obj) {
                    org.junit.platform.engine.support.hierarchical.j.b(org.junit.platform.engine.support.hierarchical.j.this, hashSet, advisor, (TestDescriptor) obj);
                }
            });
        }
        if (hashSet.contains(ExclusiveResource.f78259f)) {
            advisor.b(globalLockDescriptor, Node.ExecutionMode.SAME_THREAD);
            i(globalLockDescriptor, new Consumer() { // from class: ja0.d1
                @Override // java.util.function.Consumer
                public final void accept(Object obj) {
                    org.junit.platform.engine.support.hierarchical.j.g(org.junit.platform.engine.support.hierarchical.g.this, (TestDescriptor) obj);
                }
            });
            advisor.g(globalLockDescriptor, this.f78311c);
        } else {
            if (globalLockDescriptor.equals(testDescriptor)) {
                hashSet.add(ExclusiveResource.f78258e);
            } else {
                hashSet.remove(ExclusiveResource.f78258e);
            }
            advisor.g(testDescriptor, this.f78309a.e(hashSet));
        }
    }

    public j(f lockManager) {
        this.f78309a = lockManager;
        this.f78310b = lockManager.d(ExclusiveResource.f78258e);
        this.f78311c = lockManager.d(ExclusiveResource.f78259f);
    }
}
