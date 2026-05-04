package com.google.common.util.concurrent;

import com.google.common.base.Preconditions;
import com.google.common.collect.u6;
import java.io.Serializable;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicLong;
import javax.annotation.CheckForNull;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@go.d
@l0
@go.b
/* loaded from: classes7.dex */
public final class AtomicLongMap<K> implements Serializable {

    @CheckForNull
    @vo.b
    private transient Map<K, Long> asMap;
    private final ConcurrentHashMap<K, AtomicLong> map;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class a implements ho.r<AtomicLong, Long> {
        public a() {
        }

        @Override // ho.r
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Long apply(AtomicLong atomic) {
            return Long.valueOf(atomic.get());
        }
    }

    private AtomicLongMap(ConcurrentHashMap<K, AtomicLong> map) {
        this.map = (ConcurrentHashMap) Preconditions.checkNotNull(map);
    }

    public static <K> AtomicLongMap<K> create() {
        return new AtomicLongMap<>(new ConcurrentHashMap());
    }

    private Map<K, Long> createAsMap() {
        return Collections.unmodifiableMap(u6.D0(this.map, new a()));
    }

    @uo.a
    public long addAndGet(K key, long delta) {
        AtomicLong atomicLong;
        long j11;
        long j12;
        do {
            atomicLong = this.map.get(key);
            if (atomicLong == null && (atomicLong = this.map.putIfAbsent(key, new AtomicLong(delta))) == null) {
                break;
            }
            do {
                j11 = atomicLong.get();
                if (j11 != 0) {
                    j12 = j11 + delta;
                }
            } while (!atomicLong.compareAndSet(j11, j12));
            return j12;
        } while (!this.map.replace(key, atomicLong, new AtomicLong(delta)));
        return delta;
    }

    public Map<K, Long> asMap() {
        Map<K, Long> map = this.asMap;
        if (map != null) {
            return map;
        }
        Map<K, Long> createAsMap = createAsMap();
        this.asMap = createAsMap;
        return createAsMap;
    }

    public void clear() {
        this.map.clear();
    }

    public boolean containsKey(Object key) {
        return this.map.containsKey(key);
    }

    @uo.a
    public long decrementAndGet(K key) {
        return addAndGet(key, -1L);
    }

    public long get(K key) {
        AtomicLong atomicLong = this.map.get(key);
        if (atomicLong == null) {
            return 0L;
        }
        return atomicLong.get();
    }

    @uo.a
    public long getAndAdd(K key, long delta) {
        AtomicLong atomicLong;
        long j11;
        do {
            atomicLong = this.map.get(key);
            if (atomicLong == null && (atomicLong = this.map.putIfAbsent(key, new AtomicLong(delta))) == null) {
                return 0L;
            }
            do {
                j11 = atomicLong.get();
                if (j11 == 0) {
                }
            } while (!atomicLong.compareAndSet(j11, j11 + delta));
            return j11;
        } while (!this.map.replace(key, atomicLong, new AtomicLong(delta)));
        return 0L;
    }

    @uo.a
    public long getAndDecrement(K key) {
        return getAndAdd(key, -1L);
    }

    @uo.a
    public long getAndIncrement(K key) {
        return getAndAdd(key, 1L);
    }

    @uo.a
    public long incrementAndGet(K key) {
        return addAndGet(key, 1L);
    }

    public boolean isEmpty() {
        return this.map.isEmpty();
    }

    @uo.a
    public long put(K key, long newValue) {
        AtomicLong atomicLong;
        long j11;
        do {
            atomicLong = this.map.get(key);
            if (atomicLong == null && (atomicLong = this.map.putIfAbsent(key, new AtomicLong(newValue))) == null) {
                return 0L;
            }
            do {
                j11 = atomicLong.get();
                if (j11 == 0) {
                }
            } while (!atomicLong.compareAndSet(j11, newValue));
            return j11;
        } while (!this.map.replace(key, atomicLong, new AtomicLong(newValue)));
        return 0L;
    }

    public void putAll(Map<? extends K, ? extends Long> m11) {
        for (Map.Entry<? extends K, ? extends Long> entry : m11.entrySet()) {
            put(entry.getKey(), entry.getValue().longValue());
        }
    }

    public long putIfAbsent(K key, long newValue) {
        AtomicLong atomicLong;
        do {
            atomicLong = this.map.get(key);
            if (atomicLong == null && (atomicLong = this.map.putIfAbsent(key, new AtomicLong(newValue))) == null) {
                return 0L;
            }
            long j11 = atomicLong.get();
            if (j11 != 0) {
                return j11;
            }
        } while (!this.map.replace(key, atomicLong, new AtomicLong(newValue)));
        return 0L;
    }

    @uo.a
    public long remove(K key) {
        long j11;
        AtomicLong atomicLong = this.map.get(key);
        if (atomicLong == null) {
            return 0L;
        }
        do {
            j11 = atomicLong.get();
            if (j11 == 0) {
                break;
            }
        } while (!atomicLong.compareAndSet(j11, 0L));
        this.map.remove(key, atomicLong);
        return j11;
    }

    public void removeAllZeros() {
        Iterator<Map.Entry<K, AtomicLong>> it = this.map.entrySet().iterator();
        while (it.hasNext()) {
            AtomicLong value = it.next().getValue();
            if (value != null && value.get() == 0) {
                it.remove();
            }
        }
    }

    @uo.a
    public boolean removeIfZero(K key) {
        return remove(key, 0L);
    }

    public boolean replace(K key, long expectedOldValue, long newValue) {
        if (expectedOldValue == 0) {
            return putIfAbsent(key, newValue) == 0;
        }
        AtomicLong atomicLong = this.map.get(key);
        if (atomicLong == null) {
            return false;
        }
        return atomicLong.compareAndSet(expectedOldValue, newValue);
    }

    public int size() {
        return this.map.size();
    }

    public long sum() {
        Iterator<AtomicLong> it = this.map.values().iterator();
        long j11 = 0;
        while (it.hasNext()) {
            j11 += it.next().get();
        }
        return j11;
    }

    public String toString() {
        return this.map.toString();
    }

    public static <K> AtomicLongMap<K> create(Map<? extends K, ? extends Long> m11) {
        AtomicLongMap<K> create = create();
        create.putAll(m11);
        return create;
    }

    public boolean remove(K key, long value) {
        AtomicLong atomicLong = this.map.get(key);
        if (atomicLong == null) {
            return false;
        }
        long j11 = atomicLong.get();
        if (j11 != value) {
            return false;
        }
        if (j11 != 0 && !atomicLong.compareAndSet(j11, 0L)) {
            return false;
        }
        this.map.remove(key, atomicLong);
        return true;
    }
}
