package ho;

import com.google.common.base.Preconditions;
import java.io.Serializable;
import java.util.Map;
import javax.annotation.CheckForNull;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@j
@go.b
/* loaded from: classes7.dex */
public final class t {

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class b<E> implements r<Object, E>, Serializable {
        private static final long serialVersionUID = 0;

        /* renamed from: a, reason: collision with root package name */
        @f0
        public final E f59707a;

        public b(@f0 E value) {
            this.f59707a = value;
        }

        @Override // ho.r
        @f0
        public E apply(@CheckForNull Object from) {
            return this.f59707a;
        }

        @Override // ho.r
        public boolean equals(@CheckForNull Object obj) {
            if (obj instanceof b) {
                return d0.a(this.f59707a, ((b) obj).f59707a);
            }
            return false;
        }

        public int hashCode() {
            E e11 = this.f59707a;
            if (e11 == null) {
                return 0;
            }
            return e11.hashCode();
        }

        public String toString() {
            return "Functions.constant(" + this.f59707a + pn.j.f81007d;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class c<K, V> implements r<K, V>, Serializable {
        private static final long serialVersionUID = 0;

        /* renamed from: a, reason: collision with root package name */
        public final Map<K, ? extends V> f59708a;

        /* renamed from: b, reason: collision with root package name */
        @f0
        public final V f59709b;

        public c(Map<K, ? extends V> map, @f0 V defaultValue) {
            this.f59708a = (Map) Preconditions.checkNotNull(map);
            this.f59709b = defaultValue;
        }

        @Override // ho.r
        @f0
        public V apply(@f0 K k11) {
            V v11 = this.f59708a.get(k11);
            return (v11 != null || this.f59708a.containsKey(k11)) ? (V) c0.a(v11) : this.f59709b;
        }

        @Override // ho.r
        public boolean equals(@CheckForNull Object o11) {
            if (o11 instanceof c) {
                c cVar = (c) o11;
                if (this.f59708a.equals(cVar.f59708a) && d0.a(this.f59709b, cVar.f59709b)) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            return d0.b(this.f59708a, this.f59709b);
        }

        public String toString() {
            return "Functions.forMap(" + this.f59708a + ", defaultValue=" + this.f59709b + pn.j.f81007d;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class d<A, B, C> implements r<A, C>, Serializable {
        private static final long serialVersionUID = 0;

        /* renamed from: a, reason: collision with root package name */
        public final r<B, C> f59710a;

        /* renamed from: b, reason: collision with root package name */
        public final r<A, ? extends B> f59711b;

        public d(r<B, C> g11, r<A, ? extends B> f11) {
            this.f59710a = (r) Preconditions.checkNotNull(g11);
            this.f59711b = (r) Preconditions.checkNotNull(f11);
        }

        @Override // ho.r
        @f0
        public C apply(@f0 A a11) {
            return (C) this.f59710a.apply(this.f59711b.apply(a11));
        }

        @Override // ho.r
        public boolean equals(@CheckForNull Object obj) {
            if (obj instanceof d) {
                d dVar = (d) obj;
                if (this.f59711b.equals(dVar.f59711b) && this.f59710a.equals(dVar.f59710a)) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            return this.f59711b.hashCode() ^ this.f59710a.hashCode();
        }

        public String toString() {
            return this.f59710a + pn.j.f81006c + this.f59711b + pn.j.f81007d;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class e<K, V> implements r<K, V>, Serializable {
        private static final long serialVersionUID = 0;

        /* renamed from: a, reason: collision with root package name */
        public final Map<K, V> f59712a;

        public e(Map<K, V> map) {
            this.f59712a = (Map) Preconditions.checkNotNull(map);
        }

        @Override // ho.r
        @f0
        public V apply(@f0 K k11) {
            V v11 = this.f59712a.get(k11);
            Preconditions.checkArgument(v11 != null || this.f59712a.containsKey(k11), "Key '%s' not present in map", k11);
            return (V) c0.a(v11);
        }

        @Override // ho.r
        public boolean equals(@CheckForNull Object o11) {
            if (o11 instanceof e) {
                return this.f59712a.equals(((e) o11).f59712a);
            }
            return false;
        }

        public int hashCode() {
            return this.f59712a.hashCode();
        }

        public String toString() {
            return "Functions.forMap(" + this.f59712a + pn.j.f81007d;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class g<T> implements r<T, Boolean>, Serializable {
        private static final long serialVersionUID = 0;

        /* renamed from: a, reason: collision with root package name */
        public final i0<T> f59715a;

        @Override // ho.r
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Boolean apply(@f0 T t11) {
            return Boolean.valueOf(this.f59715a.apply(t11));
        }

        @Override // ho.r
        public boolean equals(@CheckForNull Object obj) {
            if (obj instanceof g) {
                return this.f59715a.equals(((g) obj).f59715a);
            }
            return false;
        }

        public int hashCode() {
            return this.f59715a.hashCode();
        }

        public String toString() {
            return "Functions.forPredicate(" + this.f59715a + pn.j.f81007d;
        }

        public g(i0<T> predicate) {
            this.f59715a = (i0) Preconditions.checkNotNull(predicate);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class h<F, T> implements r<F, T>, Serializable {
        private static final long serialVersionUID = 0;

        /* renamed from: a, reason: collision with root package name */
        public final p0<T> f59716a;

        @Override // ho.r
        @f0
        public T apply(@f0 F input) {
            return this.f59716a.get();
        }

        @Override // ho.r
        public boolean equals(@CheckForNull Object obj) {
            if (obj instanceof h) {
                return this.f59716a.equals(((h) obj).f59716a);
            }
            return false;
        }

        public int hashCode() {
            return this.f59716a.hashCode();
        }

        public String toString() {
            return "Functions.forSupplier(" + this.f59716a + pn.j.f81007d;
        }

        public h(p0<T> supplier) {
            this.f59716a = (p0) Preconditions.checkNotNull(supplier);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public enum i implements r<Object, String> {
        INSTANCE;

        @Override // ho.r
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public String apply(Object o11) {
            Preconditions.checkNotNull(o11);
            return o11.toString();
        }

        @Override // java.lang.Enum
        public String toString() {
            return "Functions.toStringFunction()";
        }
    }

    public static <A, B, C> r<A, C> a(r<B, C> g11, r<A, ? extends B> f11) {
        return new d(g11, f11);
    }

    public static <E> r<Object, E> b(@f0 E value) {
        return new b(value);
    }

    public static <K, V> r<K, V> c(Map<K, V> map) {
        return new e(map);
    }

    public static <K, V> r<K, V> d(Map<K, ? extends V> map, @f0 V defaultValue) {
        return new c(map, defaultValue);
    }

    public static <T> r<T, Boolean> e(i0<T> predicate) {
        return new g(predicate);
    }

    public static <F, T> r<F, T> f(p0<T> supplier) {
        return new h(supplier);
    }

    public static <E> r<E, E> g() {
        return f.INSTANCE;
    }

    public static r<Object, String> h() {
        return i.INSTANCE;
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public enum f implements r<Object, Object> {
        INSTANCE;

        @Override // java.lang.Enum
        public String toString() {
            return "Functions.identity()";
        }

        @Override // ho.r
        @CheckForNull
        public Object apply(@CheckForNull Object o11) {
            return o11;
        }
    }
}
