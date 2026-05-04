package org.junit.platform.engine.support.hierarchical;

import ba0.g4;
import ba0.n1;
import ja0.p1;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.locks.Lock;
import org.junit.platform.engine.support.hierarchical.ExclusiveResource;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public class l implements p1 {

    /* renamed from: a, reason: collision with root package name */
    public final List<ExclusiveResource> f78312a;

    /* renamed from: b, reason: collision with root package name */
    public final Lock f78313b;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class b implements ForkJoinPool.ManagedBlocker {

        /* renamed from: a, reason: collision with root package name */
        public volatile boolean f78314a;

        public b() {
        }

        @Override // java.util.concurrent.ForkJoinPool.ManagedBlocker
        public boolean block() throws InterruptedException {
            if (!this.f78314a) {
                l.this.f78313b.lockInterruptibly();
                this.f78314a = true;
            }
            return true;
        }

        @Override // java.util.concurrent.ForkJoinPool.ManagedBlocker
        public boolean isReleasable() {
            if (this.f78314a) {
                return true;
            }
            boolean tryLock = l.this.f78313b.tryLock();
            this.f78314a = tryLock;
            return tryLock;
        }
    }

    public l(ExclusiveResource resource, Lock lock) {
        this.f78312a = Collections.singletonList(resource);
        this.f78313b = lock;
    }

    @Override // ja0.p1
    public boolean O0() {
        return this.f78312a.get(0).c() == ExclusiveResource.LockMode.READ_WRITE;
    }

    @Override // ja0.p1
    public p1 acquire() throws InterruptedException {
        ForkJoinPool.managedBlock(new b());
        return this;
    }

    public Lock c() {
        return this.f78313b;
    }

    @Override // ja0.p1
    public void release() {
        this.f78313b.unlock();
    }

    public String toString() {
        return new g4(this).a("resource", n1.f(this.f78312a)).toString();
    }

    @Override // ja0.p1
    public List<ExclusiveResource> v8() {
        return this.f78312a;
    }
}
