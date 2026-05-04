package ho;

import com.google.common.base.Preconditions;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Pattern;
import javax.annotation.CheckForNull;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@ho.j
@go.b(emulated = true)
/* loaded from: classes7.dex */
public final class j0 {

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class b<T> implements i0<T>, Serializable {
        private static final long serialVersionUID = 0;

        /* renamed from: a, reason: collision with root package name */
        public final List<? extends i0<? super T>> f59625a;

        @Override // ho.i0
        public boolean apply(@f0 T t11) {
            for (int i11 = 0; i11 < this.f59625a.size(); i11++) {
                if (!this.f59625a.get(i11).apply(t11)) {
                    return false;
                }
            }
            return true;
        }

        @Override // ho.i0
        public boolean equals(@CheckForNull Object obj) {
            if (obj instanceof b) {
                return this.f59625a.equals(((b) obj).f59625a);
            }
            return false;
        }

        public int hashCode() {
            return this.f59625a.hashCode() + 306654252;
        }

        public String toString() {
            return j0.w("and", this.f59625a);
        }

        public b(List<? extends i0<? super T>> components) {
            this.f59625a = components;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class c<A, B> implements i0<A>, Serializable {
        private static final long serialVersionUID = 0;

        /* renamed from: a, reason: collision with root package name */
        public final i0<B> f59626a;

        /* renamed from: b, reason: collision with root package name */
        public final r<A, ? extends B> f59627b;

        @Override // ho.i0
        public boolean apply(@f0 A a11) {
            return this.f59626a.apply(this.f59627b.apply(a11));
        }

        @Override // ho.i0
        public boolean equals(@CheckForNull Object obj) {
            if (obj instanceof c) {
                c cVar = (c) obj;
                if (this.f59627b.equals(cVar.f59627b) && this.f59626a.equals(cVar.f59626a)) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            return this.f59627b.hashCode() ^ this.f59626a.hashCode();
        }

        public String toString() {
            return this.f59626a + pn.j.f81006c + this.f59627b + pn.j.f81007d;
        }

        public c(i0<B> p11, r<A, ? extends B> f11) {
            this.f59626a = (i0) Preconditions.checkNotNull(p11);
            this.f59627b = (r) Preconditions.checkNotNull(f11);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @go.c
    public static class d extends e {
        private static final long serialVersionUID = 0;

        public d(String string) {
            super(h0.a(string));
        }

        @Override // ho.j0.e
        public String toString() {
            return "Predicates.containsPattern(" + this.f59628a.e() + pn.j.f81007d;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @go.c
    public static class e implements i0<CharSequence>, Serializable {
        private static final long serialVersionUID = 0;

        /* renamed from: a, reason: collision with root package name */
        public final ho.g f59628a;

        public e(ho.g pattern) {
            this.f59628a = (ho.g) Preconditions.checkNotNull(pattern);
        }

        @Override // ho.i0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public boolean apply(CharSequence t11) {
            return this.f59628a.d(t11).b();
        }

        @Override // ho.i0
        public boolean equals(@CheckForNull Object obj) {
            if (obj instanceof e) {
                e eVar = (e) obj;
                if (d0.a(this.f59628a.e(), eVar.f59628a.e()) && this.f59628a.b() == eVar.f59628a.b()) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            return d0.b(this.f59628a.e(), Integer.valueOf(this.f59628a.b()));
        }

        public String toString() {
            return "Predicates.contains(" + b0.c(this.f59628a).f("pattern", this.f59628a.e()).d("pattern.flags", this.f59628a.b()).toString() + pn.j.f81007d;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class f<T> implements i0<T>, Serializable {
        private static final long serialVersionUID = 0;

        /* renamed from: a, reason: collision with root package name */
        public final Collection<?> f59629a;

        @Override // ho.i0
        public boolean apply(@f0 T t11) {
            try {
                return this.f59629a.contains(t11);
            } catch (ClassCastException | NullPointerException unused) {
                return false;
            }
        }

        @Override // ho.i0
        public boolean equals(@CheckForNull Object obj) {
            if (obj instanceof f) {
                return this.f59629a.equals(((f) obj).f59629a);
            }
            return false;
        }

        public int hashCode() {
            return this.f59629a.hashCode();
        }

        public String toString() {
            return "Predicates.in(" + this.f59629a + pn.j.f81007d;
        }

        public f(Collection<?> target) {
            this.f59629a = (Collection) Preconditions.checkNotNull(target);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @go.c
    public static class g<T> implements i0<T>, Serializable {

        @go.d
        private static final long serialVersionUID = 0;

        /* renamed from: a, reason: collision with root package name */
        public final Class<?> f59630a;

        @Override // ho.i0
        public boolean apply(@f0 T o11) {
            return this.f59630a.isInstance(o11);
        }

        @Override // ho.i0
        public boolean equals(@CheckForNull Object obj) {
            return (obj instanceof g) && this.f59630a == ((g) obj).f59630a;
        }

        public int hashCode() {
            return this.f59630a.hashCode();
        }

        public String toString() {
            return "Predicates.instanceOf(" + this.f59630a.getName() + pn.j.f81007d;
        }

        public g(Class<?> clazz) {
            this.f59630a = (Class) Preconditions.checkNotNull(clazz);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class h implements i0<Object>, Serializable {
        private static final long serialVersionUID = 0;

        /* renamed from: a, reason: collision with root package name */
        public final Object f59631a;

        @Override // ho.i0
        public boolean apply(@CheckForNull Object o11) {
            return this.f59631a.equals(o11);
        }

        @Override // ho.i0
        public boolean equals(@CheckForNull Object obj) {
            if (obj instanceof h) {
                return this.f59631a.equals(((h) obj).f59631a);
            }
            return false;
        }

        public int hashCode() {
            return this.f59631a.hashCode();
        }

        public String toString() {
            return "Predicates.equalTo(" + this.f59631a + pn.j.f81007d;
        }

        public h(Object target) {
            this.f59631a = target;
        }

        public <T> i0<T> a() {
            return this;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class i<T> implements i0<T>, Serializable {
        private static final long serialVersionUID = 0;

        /* renamed from: a, reason: collision with root package name */
        public final i0<T> f59632a;

        public i(i0<T> predicate) {
            this.f59632a = (i0) Preconditions.checkNotNull(predicate);
        }

        @Override // ho.i0
        public boolean apply(@f0 T t11) {
            return !this.f59632a.apply(t11);
        }

        @Override // ho.i0
        public boolean equals(@CheckForNull Object obj) {
            if (obj instanceof i) {
                return this.f59632a.equals(((i) obj).f59632a);
            }
            return false;
        }

        public int hashCode() {
            return ~this.f59632a.hashCode();
        }

        public String toString() {
            return "Predicates.not(" + this.f59632a + pn.j.f81007d;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class k<T> implements i0<T>, Serializable {
        private static final long serialVersionUID = 0;

        /* renamed from: a, reason: collision with root package name */
        public final List<? extends i0<? super T>> f59638a;

        @Override // ho.i0
        public boolean apply(@f0 T t11) {
            for (int i11 = 0; i11 < this.f59638a.size(); i11++) {
                if (this.f59638a.get(i11).apply(t11)) {
                    return true;
                }
            }
            return false;
        }

        @Override // ho.i0
        public boolean equals(@CheckForNull Object obj) {
            if (obj instanceof k) {
                return this.f59638a.equals(((k) obj).f59638a);
            }
            return false;
        }

        public int hashCode() {
            return this.f59638a.hashCode() + 87855567;
        }

        public String toString() {
            return j0.w("or", this.f59638a);
        }

        public k(List<? extends i0<? super T>> components) {
            this.f59638a = components;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @go.d
    @go.c
    public static class l implements i0<Class<?>>, Serializable {
        private static final long serialVersionUID = 0;

        /* renamed from: a, reason: collision with root package name */
        public final Class<?> f59639a;

        @Override // ho.i0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public boolean apply(Class<?> input) {
            return this.f59639a.isAssignableFrom(input);
        }

        @Override // ho.i0
        public boolean equals(@CheckForNull Object obj) {
            return (obj instanceof l) && this.f59639a == ((l) obj).f59639a;
        }

        public int hashCode() {
            return this.f59639a.hashCode();
        }

        public String toString() {
            return "Predicates.subtypeOf(" + this.f59639a.getName() + pn.j.f81007d;
        }

        public l(Class<?> clazz) {
            this.f59639a = (Class) Preconditions.checkNotNull(clazz);
        }
    }

    @go.b(serializable = true)
    public static <T> i0<T> b() {
        return j.f59634b.b();
    }

    @go.b(serializable = true)
    public static <T> i0<T> c() {
        return j.f59633a.b();
    }

    public static <T> i0<T> d(i0<? super T> first, i0<? super T> second) {
        return new b(g((i0) Preconditions.checkNotNull(first), (i0) Preconditions.checkNotNull(second)));
    }

    public static <T> i0<T> e(Iterable<? extends i0<? super T>> components) {
        return new b(k(components));
    }

    @SafeVarargs
    public static <T> i0<T> f(i0<? super T>... components) {
        return new b(l(components));
    }

    public static <T> List<i0<? super T>> g(i0<? super T> first, i0<? super T> second) {
        return Arrays.asList(first, second);
    }

    public static <A, B> i0<A> h(i0<B> predicate, r<A, ? extends B> function) {
        return new c(predicate, function);
    }

    @go.c("java.util.regex.Pattern")
    public static i0<CharSequence> i(Pattern pattern) {
        return new e(new z(pattern));
    }

    @go.c
    public static i0<CharSequence> j(String pattern) {
        return new d(pattern);
    }

    public static <T> List<T> k(Iterable<T> iterable) {
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = iterable.iterator();
        while (it.hasNext()) {
            arrayList.add(Preconditions.checkNotNull(it.next()));
        }
        return arrayList;
    }

    public static <T> List<T> l(T... array) {
        return k(Arrays.asList(array));
    }

    public static <T> i0<T> m(@f0 T target) {
        return target == null ? p() : new h(target).a();
    }

    public static <T> i0<T> n(Collection<? extends T> target) {
        return new f(target);
    }

    @go.c
    public static <T> i0<T> o(Class<?> clazz) {
        return new g(clazz);
    }

    @go.b(serializable = true)
    public static <T> i0<T> p() {
        return j.f59635c.b();
    }

    public static <T> i0<T> q(i0<T> predicate) {
        return new i(predicate);
    }

    @go.b(serializable = true)
    public static <T> i0<T> r() {
        return j.f59636d.b();
    }

    public static <T> i0<T> s(i0<? super T> first, i0<? super T> second) {
        return new k(g((i0) Preconditions.checkNotNull(first), (i0) Preconditions.checkNotNull(second)));
    }

    public static <T> i0<T> t(Iterable<? extends i0<? super T>> components) {
        return new k(k(components));
    }

    @SafeVarargs
    public static <T> i0<T> u(i0<? super T>... components) {
        return new k(l(components));
    }

    @go.d
    @go.c
    public static i0<Class<?>> v(Class<?> clazz) {
        return new l(clazz);
    }

    public static String w(String methodName, Iterable<?> components) {
        StringBuilder sb2 = new StringBuilder("Predicates.");
        sb2.append(methodName);
        sb2.append('(');
        boolean z11 = true;
        for (Object obj : components) {
            if (!z11) {
                sb2.append(',');
            }
            sb2.append(obj);
            z11 = false;
        }
        sb2.append(')');
        return sb2.toString();
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static abstract class j implements i0<Object> {

        /* renamed from: a, reason: collision with root package name */
        public static final j f59633a = new a("ALWAYS_TRUE", 0);

        /* renamed from: b, reason: collision with root package name */
        public static final j f59634b = new b("ALWAYS_FALSE", 1);

        /* renamed from: c, reason: collision with root package name */
        public static final j f59635c = new c("IS_NULL", 2);

        /* renamed from: d, reason: collision with root package name */
        public static final j f59636d = new d("NOT_NULL", 3);

        /* renamed from: e, reason: collision with root package name */
        public static final /* synthetic */ j[] f59637e = a();

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public enum a extends j {
            public a(String $enum$name, int $enum$ordinal) {
                super($enum$name, $enum$ordinal);
            }

            @Override // ho.i0
            public boolean apply(@CheckForNull Object o11) {
                return true;
            }

            @Override // java.lang.Enum
            public String toString() {
                return "Predicates.alwaysTrue()";
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public enum b extends j {
            public b(String $enum$name, int $enum$ordinal) {
                super($enum$name, $enum$ordinal);
            }

            @Override // ho.i0
            public boolean apply(@CheckForNull Object o11) {
                return false;
            }

            @Override // java.lang.Enum
            public String toString() {
                return "Predicates.alwaysFalse()";
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public enum c extends j {
            public c(String $enum$name, int $enum$ordinal) {
                super($enum$name, $enum$ordinal);
            }

            @Override // ho.i0
            public boolean apply(@CheckForNull Object o11) {
                return o11 == null;
            }

            @Override // java.lang.Enum
            public String toString() {
                return "Predicates.isNull()";
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public enum d extends j {
            public d(String $enum$name, int $enum$ordinal) {
                super($enum$name, $enum$ordinal);
            }

            @Override // ho.i0
            public boolean apply(@CheckForNull Object o11) {
                return o11 != null;
            }

            @Override // java.lang.Enum
            public String toString() {
                return "Predicates.notNull()";
            }
        }

        public j(String $enum$name, int $enum$ordinal) {
        }

        public static /* synthetic */ j[] a() {
            return new j[]{f59633a, f59634b, f59635c, f59636d};
        }

        public static j valueOf(String name) {
            return (j) Enum.valueOf(j.class, name);
        }

        public static j[] values() {
            return (j[]) f59637e.clone();
        }

        public <T> i0<T> b() {
            return this;
        }
    }
}
