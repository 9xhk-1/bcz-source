package j50;

import com.baicizhan.client.business.dataset.provider.a;
import h50.n;
import java.util.Map;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@yz.v0
/* loaded from: classes8.dex */
public final class n1<K, V> extends d1<K, V, Map.Entry<? extends K, ? extends V>> {

    /* renamed from: c, reason: collision with root package name */
    @m80.k
    public final h50.f f63431c;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a<K, V> implements Map.Entry<K, V>, y00.a {

        /* renamed from: a, reason: collision with root package name */
        public final K f63432a;

        /* renamed from: b, reason: collision with root package name */
        public final V f63433b;

        public a(K k11, V v11) {
            this.f63432a = k11;
            this.f63433b = v11;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ a d(a aVar, Object obj, Object obj2, int i11, Object obj3) {
            if ((i11 & 1) != 0) {
                obj = aVar.f63432a;
            }
            if ((i11 & 2) != 0) {
                obj2 = aVar.f63433b;
            }
            return aVar.c(obj, obj2);
        }

        public final K a() {
            return this.f63432a;
        }

        public final V b() {
            return this.f63433b;
        }

        @m80.k
        public final a<K, V> c(K k11, V v11) {
            return new a<>(k11, v11);
        }

        @Override // java.util.Map.Entry
        public boolean equals(@m80.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return kotlin.jvm.internal.g0.g(this.f63432a, aVar.f63432a) && kotlin.jvm.internal.g0.g(this.f63433b, aVar.f63433b);
        }

        @Override // java.util.Map.Entry
        public K getKey() {
            return this.f63432a;
        }

        @Override // java.util.Map.Entry
        public V getValue() {
            return this.f63433b;
        }

        @Override // java.util.Map.Entry
        public int hashCode() {
            K k11 = this.f63432a;
            int hashCode = (k11 == null ? 0 : k11.hashCode()) * 31;
            V v11 = this.f63433b;
            return hashCode + (v11 != null ? v11.hashCode() : 0);
        }

        @Override // java.util.Map.Entry
        public V setValue(V v11) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @m80.k
        public String toString() {
            return "MapEntry(key=" + this.f63432a + ", value=" + this.f63433b + ')';
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n1(@m80.k final f50.i<K> keySerializer, @m80.k final f50.i<V> valueSerializer) {
        super(keySerializer, valueSerializer, null);
        kotlin.jvm.internal.g0.p(keySerializer, "keySerializer");
        kotlin.jvm.internal.g0.p(valueSerializer, "valueSerializer");
        this.f63431c = h50.l.h("kotlin.collections.Map.Entry", n.c.f58543a, new h50.f[0], new x00.l() { // from class: j50.m1
            @Override // x00.l
            public final Object invoke(Object obj) {
                yz.g2 m11;
                m11 = n1.m(f50.i.this, valueSerializer, (h50.a) obj);
                return m11;
            }
        });
    }

    public static final yz.g2 m(f50.i iVar, f50.i iVar2, h50.a buildSerialDescriptor) {
        kotlin.jvm.internal.g0.p(buildSerialDescriptor, "$this$buildSerialDescriptor");
        h50.a.b(buildSerialDescriptor, a.d.C0245a.f16161a, iVar.a(), null, false, 12, null);
        h50.a.b(buildSerialDescriptor, "value", iVar2.a(), null, false, 12, null);
        return yz.g2.f100423a;
    }

    @Override // f50.i, f50.b0, f50.e
    @m80.k
    public h50.f a() {
        return this.f63431c;
    }

    @Override // j50.d1
    /* renamed from: n, reason: merged with bridge method [inline-methods] */
    public K g(@m80.k Map.Entry<? extends K, ? extends V> entry) {
        kotlin.jvm.internal.g0.p(entry, "<this>");
        return entry.getKey();
    }

    @Override // j50.d1
    /* renamed from: o, reason: merged with bridge method [inline-methods] */
    public V i(@m80.k Map.Entry<? extends K, ? extends V> entry) {
        kotlin.jvm.internal.g0.p(entry, "<this>");
        return entry.getValue();
    }

    @Override // j50.d1
    @m80.k
    /* renamed from: p, reason: merged with bridge method [inline-methods] */
    public Map.Entry<K, V> k(K k11, V v11) {
        return new a(k11, v11);
    }
}
