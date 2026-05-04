package androidx.core.util;

import androidx.annotation.IntRange;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import m80.k;
import m80.l;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes2.dex */
public final class Pools {

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public interface Pool<T> {
        @l
        T acquire();

        boolean release(@k T t11);
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @u0({"SMAP\nPools.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Pools.kt\nandroidx/core/util/Pools$SimplePool\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,134:1\n1#2:135\n*E\n"})
    public static class SimplePool<T> implements Pool<T> {

        @k
        private final Object[] pool;
        private int poolSize;

        public SimplePool(@IntRange(from = 1) int i11) {
            if (i11 <= 0) {
                throw new IllegalArgumentException("The max pool size must be > 0");
            }
            this.pool = new Object[i11];
        }

        private final boolean isInPool(T t11) {
            int i11 = this.poolSize;
            for (int i12 = 0; i12 < i11; i12++) {
                if (this.pool[i12] == t11) {
                    return true;
                }
            }
            return false;
        }

        @Override // androidx.core.util.Pools.Pool
        @l
        public T acquire() {
            int i11 = this.poolSize;
            if (i11 <= 0) {
                return null;
            }
            int i12 = i11 - 1;
            T t11 = (T) this.pool[i12];
            g0.n(t11, "null cannot be cast to non-null type T of androidx.core.util.Pools.SimplePool");
            this.pool[i12] = null;
            this.poolSize--;
            return t11;
        }

        @Override // androidx.core.util.Pools.Pool
        public boolean release(@k T instance) {
            g0.p(instance, "instance");
            if (isInPool(instance)) {
                throw new IllegalStateException("Already in the pool!");
            }
            int i11 = this.poolSize;
            Object[] objArr = this.pool;
            if (i11 >= objArr.length) {
                return false;
            }
            objArr[i11] = instance;
            this.poolSize = i11 + 1;
            return true;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @u0({"SMAP\nPools.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Pools.kt\nandroidx/core/util/Pools$SynchronizedPool\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,134:1\n1#2:135\n*E\n"})
    public static class SynchronizedPool<T> extends SimplePool<T> {

        @k
        private final Object lock;

        public SynchronizedPool(int i11) {
            super(i11);
            this.lock = new Object();
        }

        @Override // androidx.core.util.Pools.SimplePool, androidx.core.util.Pools.Pool
        @l
        public T acquire() {
            T t11;
            synchronized (this.lock) {
                t11 = (T) super.acquire();
            }
            return t11;
        }

        @Override // androidx.core.util.Pools.SimplePool, androidx.core.util.Pools.Pool
        public boolean release(@k T instance) {
            boolean release;
            g0.p(instance, "instance");
            synchronized (this.lock) {
                release = super.release(instance);
            }
            return release;
        }
    }

    private Pools() {
    }
}
