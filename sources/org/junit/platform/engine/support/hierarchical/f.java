package org.junit.platform.engine.support.hierarchical;

import ba0.n1;
import com.google.common.collect.i2;
import ja0.j1;
import ja0.p1;
import ja0.q;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import java.util.function.Function;
import java.util.stream.Collectors;
import org.junit.platform.engine.support.hierarchical.ExclusiveResource;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public class f {

    /* renamed from: a, reason: collision with root package name */
    public final Map<String, ReadWriteLock> f78286a = new ConcurrentHashMap();

    /* renamed from: b, reason: collision with root package name */
    public final l f78287b;

    /* renamed from: c, reason: collision with root package name */
    public final l f78288c;

    public f() {
        ExclusiveResource exclusiveResource = ExclusiveResource.f78258e;
        this.f78287b = new l(exclusiveResource, g(exclusiveResource));
        ExclusiveResource exclusiveResource2 = ExclusiveResource.f78259f;
        this.f78288c = new l(exclusiveResource2, g(exclusiveResource2));
    }

    public static /* synthetic */ ExclusiveResource b(List list) {
        return (ExclusiveResource) list.get(0);
    }

    public static /* synthetic */ ReadWriteLock c(String str) {
        return new ReentrantReadWriteLock();
    }

    public p1 d(ExclusiveResource resource) {
        return i(Collections.singletonList(resource));
    }

    public p1 e(Collection<ExclusiveResource> resources) {
        return i(f(resources));
    }

    public final List<ExclusiveResource> f(Collection<ExclusiveResource> resources) {
        return resources.isEmpty() ? Collections.EMPTY_LIST : resources.size() == 1 ? Collections.singletonList((ExclusiveResource) n1.f(resources)) : (List) ((Map) resources.stream().sorted(ExclusiveResource.f78260g).distinct().collect(Collectors.groupingBy(new q(), new i2(), Collectors.toList()))).values().stream().map(new Function() { // from class: ja0.g0
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return org.junit.platform.engine.support.hierarchical.f.b((List) obj);
            }
        }).collect(n1.j());
    }

    public final Lock g(ExclusiveResource resource) {
        ReadWriteLock computeIfAbsent = this.f78286a.computeIfAbsent(resource.b(), new Function() { // from class: ja0.f0
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return org.junit.platform.engine.support.hierarchical.f.c((String) obj);
            }
        });
        return resource.c() == ExclusiveResource.LockMode.READ ? computeIfAbsent.readLock() : computeIfAbsent.writeLock();
    }

    public final List<Lock> h(List<ExclusiveResource> resources) {
        return (List) resources.stream().map(new Function() { // from class: ja0.e0
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                Lock g11;
                g11 = org.junit.platform.engine.support.hierarchical.f.this.g((ExclusiveResource) obj);
                return g11;
            }
        }).collect(n1.j());
    }

    public final p1 i(List<ExclusiveResource> resources) {
        int size = resources.size();
        return size != 0 ? size != 1 ? new a(resources, h(resources)) : j((ExclusiveResource) n1.f(resources)) : j1.f63967a;
    }

    public final l j(ExclusiveResource resource) {
        return ExclusiveResource.f78258e.equals(resource) ? this.f78287b : ExclusiveResource.f78259f.equals(resource) ? this.f78288c : new l(resource, g(resource));
    }
}
