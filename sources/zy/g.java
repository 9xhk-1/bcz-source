package zy;

import a00.l1;
import io.ktor.utils.io.b0;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import m80.k;
import x00.l;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@b0
@u0({"SMAP\nCopyOnWriteHashMap.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CopyOnWriteHashMap.kt\nio/ktor/util/collections/CopyOnWriteHashMap\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,74:1\n1#2:75\n*E\n"})
/* loaded from: classes8.dex */
public final class g<K, V> {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f103147a = AtomicReferenceFieldUpdater.newUpdater(g.class, Object.class, "current");

    @k
    private volatile /* synthetic */ Object current = l1.z();

    @k
    public final V a(@k K key, @k l<? super K, ? extends V> producer) {
        Map map;
        HashMap hashMap;
        V invoke;
        g0.p(key, "key");
        g0.p(producer, "producer");
        do {
            map = (Map) this.current;
            V v11 = (V) map.get(key);
            if (v11 != null) {
                return v11;
            }
            hashMap = new HashMap(map);
            invoke = producer.invoke(key);
            hashMap.put(key, invoke);
        } while (!androidx.concurrent.futures.a.a(f103147a, this, map, hashMap));
        return invoke;
    }

    @m80.l
    public final V b(@k K key) {
        g0.p(key, "key");
        return (V) ((Map) this.current).get(key);
    }

    @m80.l
    public final V c(@k K key, @k V value) {
        Map map;
        HashMap hashMap;
        V v11;
        g0.p(key, "key");
        g0.p(value, "value");
        do {
            map = (Map) this.current;
            if (map.get(key) == value) {
                return value;
            }
            hashMap = new HashMap(map);
            v11 = (V) hashMap.put(key, value);
        } while (!androidx.concurrent.futures.a.a(f103147a, this, map, hashMap));
        return v11;
    }

    @m80.l
    public final V d(@k K key) {
        Map map;
        HashMap hashMap;
        V v11;
        g0.p(key, "key");
        do {
            map = (Map) this.current;
            if (map.get(key) == null) {
                return null;
            }
            hashMap = new HashMap(map);
            v11 = (V) hashMap.remove(key);
        } while (!androidx.concurrent.futures.a.a(f103147a, this, map, hashMap));
        return v11;
    }

    public final void e(@k K key, @k V value) {
        g0.p(key, "key");
        g0.p(value, "value");
        c(key, value);
    }
}
