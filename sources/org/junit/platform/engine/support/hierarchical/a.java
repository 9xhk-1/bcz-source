package org.junit.platform.engine.support.hierarchical;

import ba0.c2;
import ba0.g4;
import ja0.p1;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.locks.Lock;
import java.util.function.Predicate;
import org.junit.platform.engine.support.hierarchical.ExclusiveResource;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public class a implements p1 {

    /* renamed from: a, reason: collision with root package name */
    public final List<ExclusiveResource> f78267a;

    /* renamed from: b, reason: collision with root package name */
    public final List<Lock> f78268b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f78269c;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class b implements ForkJoinPool.ManagedBlocker {

        /* renamed from: a, reason: collision with root package name */
        public volatile boolean f78270a;

        public b() {
        }

        @Override // java.util.concurrent.ForkJoinPool.ManagedBlocker
        public boolean block() throws InterruptedException {
            if (!this.f78270a) {
                a.this.e();
                this.f78270a = true;
            }
            return true;
        }

        @Override // java.util.concurrent.ForkJoinPool.ManagedBlocker
        public boolean isReleasable() {
            return this.f78270a;
        }
    }

    public a(List<ExclusiveResource> resources, List<Lock> locks) {
        c2.e(resources.size() == locks.size(), "Resources and locks must have the same size");
        this.f78267a = Collections.unmodifiableList(resources);
        this.f78268b = (List) c2.m(locks, "Locks must not be empty");
        this.f78269c = resources.stream().anyMatch(new Predicate() { // from class: ja0.a
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return org.junit.platform.engine.support.hierarchical.a.a((ExclusiveResource) obj);
            }
        });
    }

    public static /* synthetic */ boolean a(ExclusiveResource exclusiveResource) {
        return exclusiveResource.c() == ExclusiveResource.LockMode.READ_WRITE;
    }

    @Override // ja0.p1
    public boolean O0() {
        return this.f78269c;
    }

    @Override // ja0.p1
    public p1 acquire() throws InterruptedException {
        ForkJoinPool.managedBlock(new b());
        return this;
    }

    public final void e() throws InterruptedException {
        ArrayList arrayList = new ArrayList(this.f78268b.size());
        try {
            for (Lock lock : this.f78268b) {
                lock.lockInterruptibly();
                arrayList.add(lock);
            }
        } catch (InterruptedException e11) {
            i(arrayList);
            throw e11;
        }
    }

    public List<Lock> f() {
        return this.f78268b;
    }

    public final void i(List<Lock> acquiredLocks) {
        for (int size = acquiredLocks.size() - 1; size >= 0; size--) {
            acquiredLocks.get(size).unlock();
        }
    }

    @Override // ja0.p1
    public void release() {
        i(this.f78268b);
    }

    public String toString() {
        return new g4(this).a("resources", this.f78267a).toString();
    }

    @Override // ja0.p1
    public List<ExclusiveResource> v8() {
        return this.f78267a;
    }
}
