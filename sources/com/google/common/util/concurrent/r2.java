package com.google.common.util.concurrent;

import com.google.common.base.Preconditions;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.q6;
import com.google.common.collect.s6;
import com.google.common.util.concurrent.r2;
import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.Semaphore;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@go.d
@go.c
@l0
/* loaded from: classes7.dex */
public abstract class r2<L> {

    /* renamed from: a, reason: collision with root package name */
    public static final int f34817a = 1024;

    /* renamed from: b, reason: collision with root package name */
    public static final int f34818b = -1;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class b<L> extends f<L> {

        /* renamed from: d, reason: collision with root package name */
        public final Object[] f34819d;

        @Override // com.google.common.util.concurrent.r2
        public L j(int i11) {
            return (L) this.f34819d[i11];
        }

        @Override // com.google.common.util.concurrent.r2
        public int s() {
            return this.f34819d.length;
        }

        public b(int stripes, ho.p0<L> supplier) {
            super(stripes);
            int i11 = 0;
            Preconditions.checkArgument(stripes <= 1073741824, "Stripes must be <= 2^30)");
            this.f34819d = new Object[this.f34829c + 1];
            while (true) {
                Object[] objArr = this.f34819d;
                if (i11 >= objArr.length) {
                    return;
                }
                objArr[i11] = supplier.get();
                i11++;
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @go.e
    public static class c<L> extends f<L> {

        /* renamed from: d, reason: collision with root package name */
        public final ConcurrentMap<Integer, L> f34820d;

        /* renamed from: e, reason: collision with root package name */
        public final ho.p0<L> f34821e;

        /* renamed from: f, reason: collision with root package name */
        public final int f34822f;

        public c(int stripes, ho.p0<L> supplier) {
            super(stripes);
            int i11 = this.f34829c;
            this.f34822f = i11 == -1 ? Integer.MAX_VALUE : i11 + 1;
            this.f34821e = supplier;
            this.f34820d = new s6().m().i();
        }

        @Override // com.google.common.util.concurrent.r2
        public L j(int i11) {
            if (this.f34822f != Integer.MAX_VALUE) {
                Preconditions.checkElementIndex(i11, s());
            }
            L l11 = this.f34820d.get(Integer.valueOf(i11));
            if (l11 != null) {
                return l11;
            }
            L l12 = this.f34821e.get();
            return (L) ho.b0.a(this.f34820d.putIfAbsent(Integer.valueOf(i11), l12), l12);
        }

        @Override // com.google.common.util.concurrent.r2
        public int s() {
            return this.f34822f;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class d extends ReentrantLock {

        /* renamed from: a, reason: collision with root package name */
        public long f34823a;

        /* renamed from: b, reason: collision with root package name */
        public long f34824b;

        /* renamed from: c, reason: collision with root package name */
        public long f34825c;

        public d() {
            super(false);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class e extends Semaphore {

        /* renamed from: a, reason: collision with root package name */
        public long f34826a;

        /* renamed from: b, reason: collision with root package name */
        public long f34827b;

        /* renamed from: c, reason: collision with root package name */
        public long f34828c;

        public e(int permits) {
            super(permits, false);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static abstract class f<L> extends r2<L> {

        /* renamed from: c, reason: collision with root package name */
        public final int f34829c;

        public f(int stripes) {
            super();
            Preconditions.checkArgument(stripes > 0, "Stripes must be positive");
            this.f34829c = stripes > 1073741824 ? -1 : r2.g(stripes) - 1;
        }

        @Override // com.google.common.util.concurrent.r2
        public final L i(Object key) {
            return j(k(key));
        }

        @Override // com.google.common.util.concurrent.r2
        public final int k(Object key) {
            return r2.t(key.hashCode()) & this.f34829c;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @go.e
    public static class g<L> extends f<L> {

        /* renamed from: d, reason: collision with root package name */
        public final AtomicReferenceArray<a<? extends L>> f34830d;

        /* renamed from: e, reason: collision with root package name */
        public final ho.p0<L> f34831e;

        /* renamed from: f, reason: collision with root package name */
        public final int f34832f;

        /* renamed from: g, reason: collision with root package name */
        public final ReferenceQueue<L> f34833g;

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static final class a<L> extends WeakReference<L> {

            /* renamed from: a, reason: collision with root package name */
            public final int f34834a;

            public a(L referent, int index, ReferenceQueue<L> queue) {
                super(referent, queue);
                this.f34834a = index;
            }
        }

        public g(int stripes, ho.p0<L> supplier) {
            super(stripes);
            this.f34833g = new ReferenceQueue<>();
            int i11 = this.f34829c;
            int i12 = i11 == -1 ? Integer.MAX_VALUE : i11 + 1;
            this.f34832f = i12;
            this.f34830d = new AtomicReferenceArray<>(i12);
            this.f34831e = supplier;
        }

        @Override // com.google.common.util.concurrent.r2
        public L j(int index) {
            if (this.f34832f != Integer.MAX_VALUE) {
                Preconditions.checkElementIndex(index, s());
            }
            a<? extends L> aVar = this.f34830d.get(index);
            L l11 = aVar == null ? null : aVar.get();
            if (l11 != null) {
                return l11;
            }
            L l12 = this.f34831e.get();
            a aVar2 = new a(l12, index, this.f34833g);
            while (!s2.a(this.f34830d, index, aVar, aVar2)) {
                aVar = this.f34830d.get(index);
                L l13 = aVar == null ? null : aVar.get();
                if (l13 != null) {
                    return l13;
                }
            }
            u();
            return l12;
        }

        @Override // com.google.common.util.concurrent.r2
        public int s() {
            return this.f34832f;
        }

        public final void u() {
            while (true) {
                Reference<? extends L> poll = this.f34833g.poll();
                if (poll == null) {
                    return;
                }
                a aVar = (a) poll;
                s2.a(this.f34830d, aVar.f34834a, aVar, null);
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class h extends t0 {

        /* renamed from: a, reason: collision with root package name */
        public final Condition f34835a;

        /* renamed from: b, reason: collision with root package name */
        public final j f34836b;

        public h(Condition delegate, j strongReference) {
            this.f34835a = delegate;
            this.f34836b = strongReference;
        }

        @Override // com.google.common.util.concurrent.t0
        public Condition a() {
            return this.f34835a;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class i extends z0 {

        /* renamed from: a, reason: collision with root package name */
        public final Lock f34837a;

        /* renamed from: b, reason: collision with root package name */
        public final j f34838b;

        public i(Lock delegate, j strongReference) {
            this.f34837a = delegate;
            this.f34838b = strongReference;
        }

        @Override // com.google.common.util.concurrent.z0
        public Lock a() {
            return this.f34837a;
        }

        @Override // com.google.common.util.concurrent.z0, java.util.concurrent.locks.Lock
        public Condition newCondition() {
            return new h(this.f34837a.newCondition(), this.f34838b);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class j implements ReadWriteLock {

        /* renamed from: a, reason: collision with root package name */
        public final ReadWriteLock f34839a = new ReentrantReadWriteLock();

        @Override // java.util.concurrent.locks.ReadWriteLock
        public Lock readLock() {
            return new i(this.f34839a.readLock(), this);
        }

        @Override // java.util.concurrent.locks.ReadWriteLock
        public Lock writeLock() {
            return new i(this.f34839a.writeLock(), this);
        }
    }

    public static /* synthetic */ Semaphore a(int i11) {
        return new e(i11);
    }

    public static /* synthetic */ Lock b() {
        return new ReentrantLock(false);
    }

    public static /* synthetic */ Semaphore c(int i11) {
        return new Semaphore(i11, false);
    }

    public static int g(int x11) {
        return 1 << com.google.common.math.f.p(x11, RoundingMode.CEILING);
    }

    public static <L> r2<L> h(int stripes, ho.p0<L> supplier) {
        return new b(stripes, supplier);
    }

    public static <L> r2<L> l(int stripes, ho.p0<L> supplier) {
        return stripes < 1024 ? new g(stripes, supplier) : new c(stripes, supplier);
    }

    public static r2<Lock> m(int stripes) {
        return l(stripes, new ho.p0() { // from class: com.google.common.util.concurrent.p2
            @Override // ho.p0
            public final Object get() {
                return r2.b();
            }
        });
    }

    public static r2<ReadWriteLock> n(int stripes) {
        return l(stripes, new ho.p0() { // from class: com.google.common.util.concurrent.l2
            @Override // ho.p0
            public final Object get() {
                return new r2.j();
            }
        });
    }

    public static r2<Semaphore> o(int stripes, final int permits) {
        return l(stripes, new ho.p0() { // from class: com.google.common.util.concurrent.o2
            @Override // ho.p0
            public final Object get() {
                return r2.c(permits);
            }
        });
    }

    public static r2<Lock> p(int stripes) {
        return h(stripes, new ho.p0() { // from class: com.google.common.util.concurrent.m2
            @Override // ho.p0
            public final Object get() {
                return new r2.d();
            }
        });
    }

    public static r2<ReadWriteLock> q(int stripes) {
        return h(stripes, new ho.p0() { // from class: com.google.common.util.concurrent.q2
            @Override // ho.p0
            public final Object get() {
                return new ReentrantReadWriteLock();
            }
        });
    }

    public static r2<Semaphore> r(int stripes, final int permits) {
        return h(stripes, new ho.p0() { // from class: com.google.common.util.concurrent.n2
            @Override // ho.p0
            public final Object get() {
                return r2.a(permits);
            }
        });
    }

    public static int t(int hashCode) {
        int i11 = hashCode ^ ((hashCode >>> 20) ^ (hashCode >>> 12));
        return (i11 >>> 4) ^ ((i11 >>> 7) ^ i11);
    }

    public Iterable<L> f(Iterable<? extends Object> keys) {
        ArrayList r11 = q6.r(keys);
        if (r11.isEmpty()) {
            return ImmutableList.of();
        }
        int[] iArr = new int[r11.size()];
        for (int i11 = 0; i11 < r11.size(); i11++) {
            iArr[i11] = k(r11.get(i11));
        }
        Arrays.sort(iArr);
        int i12 = iArr[0];
        r11.set(0, j(i12));
        for (int i13 = 1; i13 < r11.size(); i13++) {
            int i14 = iArr[i13];
            if (i14 == i12) {
                r11.set(i13, r11.get(i13 - 1));
            } else {
                r11.set(i13, j(i14));
                i12 = i14;
            }
        }
        return Collections.unmodifiableList(r11);
    }

    public abstract L i(Object key);

    public abstract L j(int index);

    public abstract int k(Object key);

    public abstract int s();

    public r2() {
    }
}
