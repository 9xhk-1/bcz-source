package z80;

import ba0.c2;
import java.util.function.Function;
import java.util.function.Supplier;
import org.apiguardian.api.API;
import org.junit.jupiter.api.extension.ExtensionContextException;
import org.junit.platform.engine.support.store.NamespacedHierarchicalStoreException;
import p80.n;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@API(since = "5.0", status = API.Status.INTERNAL)
/* loaded from: classes9.dex */
public class e0 implements n.b {

    /* renamed from: a, reason: collision with root package name */
    public final ka0.i<n.a> f102369a;

    /* renamed from: b, reason: collision with root package name */
    public final n.a f102370b;

    public e0(ka0.i<n.a> valuesStore, n.a namespace) {
        this.f102369a = valuesStore;
        this.f102370b = namespace;
    }

    @Override // p80.n.b
    public <K, V> V c(final K k11, final Function<K, V> function, final Class<V> cls) {
        c2.r(k11, "key must not be null");
        c2.r(function, "defaultCreator function must not be null");
        c2.r(cls, "requiredType must not be null");
        return (V) o(new Supplier() { // from class: z80.x
            @Override // java.util.function.Supplier
            public final Object get() {
                Object H;
                H = r0.f102369a.H(e0.this.f102370b, k11, function, cls);
                return H;
            }
        });
    }

    @Override // p80.n.b
    public <K, V> Object d(final K key, final Function<K, V> defaultCreator) {
        c2.r(key, "key must not be null");
        c2.r(defaultCreator, "defaultCreator function must not be null");
        return o(new Supplier() { // from class: z80.c0
            @Override // java.util.function.Supplier
            public final Object get() {
                Object E;
                E = r0.f102369a.E(e0.this.f102370b, key, defaultCreator);
                return E;
            }
        });
    }

    @Override // p80.n.b
    public <T> T e(final Object obj, final Class<T> cls) {
        c2.r(obj, "key must not be null");
        c2.r(cls, "requiredType must not be null");
        return (T) o(new Supplier() { // from class: z80.d0
            @Override // java.util.function.Supplier
            public final Object get() {
                Object C;
                C = r0.f102369a.C(e0.this.f102370b, obj, cls);
                return C;
            }
        });
    }

    @Override // p80.n.b
    public <T> T f(final Object obj, final Class<T> cls) {
        c2.r(obj, "key must not be null");
        c2.r(cls, "requiredType must not be null");
        return (T) o(new Supplier() { // from class: z80.a0
            @Override // java.util.function.Supplier
            public final Object get() {
                Object Z;
                Z = r0.f102369a.Z(e0.this.f102370b, obj, cls);
                return Z;
            }
        });
    }

    @Override // p80.n.b
    public Object get(final Object key) {
        c2.r(key, "key must not be null");
        return o(new Supplier() { // from class: z80.y
            @Override // java.util.function.Supplier
            public final Object get() {
                Object w11;
                w11 = r0.f102369a.w(e0.this.f102370b, key);
                return w11;
            }
        });
    }

    public final <T> T o(Supplier<T> action) {
        try {
            return action.get();
        } catch (NamespacedHierarchicalStoreException e11) {
            throw new ExtensionContextException(e11.getMessage(), e11);
        }
    }

    @Override // p80.n.b
    public void put(final Object key, final Object value) {
        c2.r(key, "key must not be null");
        o(new Supplier() { // from class: z80.z
            @Override // java.util.function.Supplier
            public final Object get() {
                Object S;
                S = r0.f102369a.S(e0.this.f102370b, key, value);
                return S;
            }
        });
    }

    @Override // p80.n.b
    public Object remove(final Object key) {
        c2.r(key, "key must not be null");
        return o(new Supplier() { // from class: z80.b0
            @Override // java.util.function.Supplier
            public final Object get() {
                Object V;
                V = r0.f102369a.V(e0.this.f102370b, key);
                return V;
            }
        });
    }
}
