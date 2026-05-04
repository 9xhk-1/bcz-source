package androidx.collection;

import androidx.annotation.IntRange;
import androidx.collection.internal.Lock;
import androidx.collection.internal.LruHashMap;
import androidx.collection.internal.RuntimeHelpersKt;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import m80.k;
import m80.l;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nLruCache.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LruCache.kt\nandroidx/collection/LruCache\n+ 2 RuntimeHelpers.kt\nandroidx/collection/internal/RuntimeHelpersKt\n+ 3 LockExt.kt\nandroidx/collection/internal/LockExtKt\n+ 4 Lock.jvm.kt\nandroidx/collection/internal/Lock\n+ 5 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,356:1\n59#2,5:357\n59#2,5:362\n45#2,5:382\n45#2,5:390\n26#3,2:367\n26#3,2:370\n26#3,2:373\n26#3,2:376\n26#3,2:379\n26#3,2:387\n26#3,2:395\n26#3,2:398\n26#3,2:401\n26#3,2:404\n26#3,2:407\n26#3,2:410\n26#3,2:413\n26#3,2:416\n26#3,2:421\n26#4:369\n26#4:372\n26#4:375\n26#4:378\n26#4:381\n26#4:389\n26#4:397\n26#4:400\n26#4:403\n26#4:406\n26#4:409\n26#4:412\n26#4:415\n26#4:418\n26#4:423\n1855#5,2:419\n*S KotlinDebug\n*F\n+ 1 LruCache.kt\nandroidx/collection/LruCache\n*L\n62#1:357,5\n83#1:362,5\n170#1:382,5\n245#1:390,5\n85#1:367,2\n96#1:370,2\n113#1:373,2\n140#1:376,2\n169#1:379,2\n198#1:387,2\n267#1:395,2\n274#1:398,2\n277#1:401,2\n280#1:404,2\n283#1:407,2\n286#1:410,2\n289#1:413,2\n298#1:416,2\n306#1:421,2\n85#1:369\n96#1:372\n113#1:375\n140#1:378\n169#1:381\n198#1:389\n267#1:397\n274#1:400\n277#1:403\n280#1:406\n283#1:409\n286#1:412\n289#1:415\n298#1:418\n306#1:423\n300#1:419,2\n*E\n"})
/* loaded from: classes.dex */
public class LruCache<K, V> {
    private int createCount;
    private int evictionCount;
    private int hitCount;

    @k
    private final Lock lock;

    @k
    private final LruHashMap<K, V> map;
    private int maxSize;
    private int missCount;
    private int putCount;
    private int size;

    public LruCache(@IntRange(from = 1, to = 2147483647L) int i11) {
        this.maxSize = i11;
        if (!(i11 > 0)) {
            RuntimeHelpersKt.throwIllegalArgumentException("maxSize <= 0");
        }
        this.map = new LruHashMap<>(0, 0.75f);
        this.lock = new Lock();
    }

    private final int safeSizeOf(K k11, V v11) {
        int sizeOf = sizeOf(k11, v11);
        if (!(sizeOf >= 0)) {
            RuntimeHelpersKt.throwIllegalStateException("Negative size: " + k11 + '=' + v11);
        }
        return sizeOf;
    }

    @l
    public V create(@k K key) {
        g0.p(key, "key");
        return null;
    }

    public final int createCount() {
        int i11;
        synchronized (this.lock) {
            i11 = this.createCount;
        }
        return i11;
    }

    public void entryRemoved(boolean z11, @k K key, @k V oldValue, @l V v11) {
        g0.p(key, "key");
        g0.p(oldValue, "oldValue");
    }

    public final void evictAll() {
        trimToSize(-1);
    }

    public final int evictionCount() {
        int i11;
        synchronized (this.lock) {
            i11 = this.evictionCount;
        }
        return i11;
    }

    @l
    public final V get(@k K key) {
        V v11;
        g0.p(key, "key");
        synchronized (this.lock) {
            V v12 = this.map.get(key);
            if (v12 != null) {
                this.hitCount++;
                return v12;
            }
            this.missCount++;
            V create = create(key);
            if (create == null) {
                return null;
            }
            synchronized (this.lock) {
                try {
                    this.createCount++;
                    v11 = (V) this.map.put(key, create);
                    if (v11 != null) {
                        this.map.put(key, v11);
                    } else {
                        this.size += safeSizeOf(key, create);
                        g2 g2Var = g2.f100423a;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            if (v11 != null) {
                entryRemoved(false, key, create, v11);
                return v11;
            }
            trimToSize(this.maxSize);
            return create;
        }
    }

    public final int hitCount() {
        int i11;
        synchronized (this.lock) {
            i11 = this.hitCount;
        }
        return i11;
    }

    public final int maxSize() {
        int i11;
        synchronized (this.lock) {
            i11 = this.maxSize;
        }
        return i11;
    }

    public final int missCount() {
        int i11;
        synchronized (this.lock) {
            i11 = this.missCount;
        }
        return i11;
    }

    @l
    public final V put(@k K key, @k V value) {
        V put;
        g0.p(key, "key");
        g0.p(value, "value");
        synchronized (this.lock) {
            try {
                this.putCount++;
                this.size += safeSizeOf(key, value);
                put = this.map.put(key, value);
                if (put != null) {
                    this.size -= safeSizeOf(key, put);
                }
                g2 g2Var = g2.f100423a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (put != null) {
            entryRemoved(false, key, put, value);
        }
        trimToSize(this.maxSize);
        return put;
    }

    public final int putCount() {
        int i11;
        synchronized (this.lock) {
            i11 = this.putCount;
        }
        return i11;
    }

    @l
    public final V remove(@k K key) {
        V remove;
        g0.p(key, "key");
        synchronized (this.lock) {
            try {
                remove = this.map.remove(key);
                if (remove != null) {
                    this.size -= safeSizeOf(key, remove);
                }
                g2 g2Var = g2.f100423a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (remove != null) {
            entryRemoved(false, key, remove, null);
        }
        return remove;
    }

    public void resize(@IntRange(from = 1, to = 2147483647L) int i11) {
        if (!(i11 > 0)) {
            RuntimeHelpersKt.throwIllegalArgumentException("maxSize <= 0");
        }
        synchronized (this.lock) {
            this.maxSize = i11;
            g2 g2Var = g2.f100423a;
        }
        trimToSize(i11);
    }

    public final int size() {
        int i11;
        synchronized (this.lock) {
            i11 = this.size;
        }
        return i11;
    }

    public int sizeOf(@k K key, @k V value) {
        g0.p(key, "key");
        g0.p(value, "value");
        return 1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @k
    public final Map<K, V> snapshot() {
        LinkedHashMap linkedHashMap;
        synchronized (this.lock) {
            linkedHashMap = new LinkedHashMap(this.map.getEntries().size());
            Iterator<T> it = this.map.getEntries().iterator();
            while (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        return linkedHashMap;
    }

    @k
    public String toString() {
        String str;
        synchronized (this.lock) {
            try {
                int i11 = this.hitCount;
                int i12 = this.missCount + i11;
                str = "LruCache[maxSize=" + this.maxSize + ",hits=" + this.hitCount + ",misses=" + this.missCount + ",hitRate=" + (i12 != 0 ? (i11 * 100) / i12 : 0) + "%]";
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return str;
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x0062, code lost:
    
        return;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:13:0x001c A[Catch: all -> 0x0015, TryCatch #0 {all -> 0x0015, blocks: (B:4:0x0003, B:6:0x0008, B:8:0x0010, B:13:0x001c, B:14:0x0021, B:16:0x0025, B:18:0x002e, B:20:0x0040), top: B:3:0x0003 }] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0040 A[Catch: all -> 0x0015, TRY_ENTER, TRY_LEAVE, TryCatch #0 {all -> 0x0015, blocks: (B:4:0x0003, B:6:0x0008, B:8:0x0010, B:13:0x001c, B:14:0x0021, B:16:0x0025, B:18:0x002e, B:20:0x0040), top: B:3:0x0003 }] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x003e A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void trimToSize(int r7) {
        /*
            r6 = this;
        L0:
            androidx.collection.internal.Lock r0 = r6.lock
            monitor-enter(r0)
            int r1 = r6.size     // Catch: java.lang.Throwable -> L15
            r2 = 1
            if (r1 < 0) goto L19
            androidx.collection.internal.LruHashMap<K, V> r1 = r6.map     // Catch: java.lang.Throwable -> L15
            boolean r1 = r1.isEmpty()     // Catch: java.lang.Throwable -> L15
            if (r1 == 0) goto L17
            int r1 = r6.size     // Catch: java.lang.Throwable -> L15
            if (r1 != 0) goto L19
            goto L17
        L15:
            r7 = move-exception
            goto L63
        L17:
            r1 = r2
            goto L1a
        L19:
            r1 = 0
        L1a:
            if (r1 != 0) goto L21
            java.lang.String r1 = "LruCache.sizeOf() is reporting inconsistent results!"
            androidx.collection.internal.RuntimeHelpersKt.throwIllegalStateException(r1)     // Catch: java.lang.Throwable -> L15
        L21:
            int r1 = r6.size     // Catch: java.lang.Throwable -> L15
            if (r1 <= r7) goto L61
            androidx.collection.internal.LruHashMap<K, V> r1 = r6.map     // Catch: java.lang.Throwable -> L15
            boolean r1 = r1.isEmpty()     // Catch: java.lang.Throwable -> L15
            if (r1 == 0) goto L2e
            goto L61
        L2e:
            androidx.collection.internal.LruHashMap<K, V> r1 = r6.map     // Catch: java.lang.Throwable -> L15
            java.util.Set r1 = r1.getEntries()     // Catch: java.lang.Throwable -> L15
            java.lang.Iterable r1 = (java.lang.Iterable) r1     // Catch: java.lang.Throwable -> L15
            java.lang.Object r1 = a00.r0.J2(r1)     // Catch: java.lang.Throwable -> L15
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1     // Catch: java.lang.Throwable -> L15
            if (r1 != 0) goto L40
            monitor-exit(r0)
            return
        L40:
            java.lang.Object r3 = r1.getKey()     // Catch: java.lang.Throwable -> L15
            java.lang.Object r1 = r1.getValue()     // Catch: java.lang.Throwable -> L15
            androidx.collection.internal.LruHashMap<K, V> r4 = r6.map     // Catch: java.lang.Throwable -> L15
            r4.remove(r3)     // Catch: java.lang.Throwable -> L15
            int r4 = r6.size     // Catch: java.lang.Throwable -> L15
            int r5 = r6.safeSizeOf(r3, r1)     // Catch: java.lang.Throwable -> L15
            int r4 = r4 - r5
            r6.size = r4     // Catch: java.lang.Throwable -> L15
            int r4 = r6.evictionCount     // Catch: java.lang.Throwable -> L15
            int r4 = r4 + r2
            r6.evictionCount = r4     // Catch: java.lang.Throwable -> L15
            monitor-exit(r0)
            r0 = 0
            r6.entryRemoved(r2, r3, r1, r0)
            goto L0
        L61:
            monitor-exit(r0)
            return
        L63:
            monitor-exit(r0)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.collection.LruCache.trimToSize(int):void");
    }
}
