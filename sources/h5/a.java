package h5;

import a90.c3;
import java.util.Locale;
import java.util.Map;
import java.util.Set;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public abstract class a<T> {

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    /* renamed from: h5.a$a, reason: collision with other inner class name */
    public static final class C0658a extends a<Boolean> {

        /* renamed from: a, reason: collision with root package name */
        @m80.k
        public final String f58295a;

        /* renamed from: b, reason: collision with root package name */
        public final boolean f58296b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0658a(@m80.k String key, boolean z11) {
            super(null);
            kotlin.jvm.internal.g0.p(key, "key");
            this.f58295a = key;
            this.f58296b = z11;
        }

        public static /* synthetic */ C0658a h(C0658a c0658a, String str, boolean z11, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = c0658a.f58295a;
            }
            if ((i11 & 2) != 0) {
                z11 = c0658a.f58296b;
            }
            return c0658a.g(str, z11);
        }

        @Override // h5.a
        @m80.k
        public String b() {
            return this.f58295a;
        }

        @Override // h5.a
        public /* bridge */ /* synthetic */ boolean d(Boolean bool) {
            return k(bool.booleanValue());
        }

        @m80.k
        public final String e() {
            return this.f58295a;
        }

        public boolean equals(@m80.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C0658a)) {
                return false;
            }
            C0658a c0658a = (C0658a) obj;
            return kotlin.jvm.internal.g0.g(this.f58295a, c0658a.f58295a) && this.f58296b == c0658a.f58296b;
        }

        public final boolean f() {
            return this.f58296b;
        }

        @m80.k
        public final C0658a g(@m80.k String key, boolean z11) {
            kotlin.jvm.internal.g0.p(key, "key");
            return new C0658a(key, z11);
        }

        public int hashCode() {
            return (this.f58295a.hashCode() * 31) + Boolean.hashCode(this.f58296b);
        }

        @Override // h5.a
        @m80.k
        /* renamed from: i, reason: merged with bridge method [inline-methods] */
        public Boolean a() {
            return Boolean.valueOf(this.f58296b);
        }

        @Override // h5.a
        @m80.l
        /* renamed from: j, reason: merged with bridge method [inline-methods] */
        public Boolean c(@m80.k String value) {
            kotlin.jvm.internal.g0.p(value, "value");
            String lowerCase = value.toLowerCase(Locale.ROOT);
            kotlin.jvm.internal.g0.o(lowerCase, "toLowerCase(...)");
            switch (lowerCase.hashCode()) {
                case -1609594047:
                    if (!lowerCase.equals(c3.f2342e)) {
                        return null;
                    }
                    break;
                case 48:
                    if (!lowerCase.equals("0")) {
                        return null;
                    }
                    return Boolean.FALSE;
                case 49:
                    if (!lowerCase.equals("1")) {
                        return null;
                    }
                    break;
                case 3521:
                    if (!lowerCase.equals(ma.b.I0)) {
                        return null;
                    }
                    return Boolean.FALSE;
                case 3551:
                    if (!lowerCase.equals(c40.t0.f7979d)) {
                        return null;
                    }
                    break;
                case 109935:
                    if (!lowerCase.equals(c40.t0.f7980e)) {
                        return null;
                    }
                    return Boolean.FALSE;
                case 119527:
                    if (!lowerCase.equals(ma.b.H0)) {
                        return null;
                    }
                    break;
                case 3569038:
                    if (!lowerCase.equals(n6.m.f74525c)) {
                        return null;
                    }
                    break;
                case 97196323:
                    if (!lowerCase.equals("false")) {
                        return null;
                    }
                    return Boolean.FALSE;
                case 270940796:
                    if (!lowerCase.equals(c3.f2343f)) {
                        return null;
                    }
                    return Boolean.FALSE;
                default:
                    return null;
            }
            return Boolean.TRUE;
        }

        public boolean k(boolean z11) {
            return true;
        }

        @m80.k
        public String toString() {
            return "BooleanDef(key=" + this.f58295a + ", defaultValue=" + this.f58296b + ')';
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class b<E extends Enum<E>> extends a<E> {

        /* renamed from: a, reason: collision with root package name */
        @m80.k
        public final String f58297a;

        /* renamed from: b, reason: collision with root package name */
        @m80.l
        public final E f58298b;

        /* renamed from: c, reason: collision with root package name */
        @m80.k
        public final Map<String, E> f58299c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public b(@m80.k String key, @m80.l E e11, @m80.k Map<String, ? extends E> valueMapping) {
            super(null);
            kotlin.jvm.internal.g0.p(key, "key");
            kotlin.jvm.internal.g0.p(valueMapping, "valueMapping");
            this.f58297a = key;
            this.f58298b = e11;
            this.f58299c = valueMapping;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ b i(b bVar, String str, Enum r22, Map map, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = bVar.f58297a;
            }
            if ((i11 & 2) != 0) {
                r22 = bVar.f58298b;
            }
            if ((i11 & 4) != 0) {
                map = bVar.f58299c;
            }
            return bVar.h(str, r22, map);
        }

        @Override // h5.a
        @m80.k
        public String b() {
            return this.f58297a;
        }

        @m80.k
        public final String e() {
            return this.f58297a;
        }

        public boolean equals(@m80.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return kotlin.jvm.internal.g0.g(this.f58297a, bVar.f58297a) && kotlin.jvm.internal.g0.g(this.f58298b, bVar.f58298b) && kotlin.jvm.internal.g0.g(this.f58299c, bVar.f58299c);
        }

        @m80.l
        public final E f() {
            return this.f58298b;
        }

        public final Map<String, E> g() {
            return this.f58299c;
        }

        @m80.k
        public final b<E> h(@m80.k String key, @m80.l E e11, @m80.k Map<String, ? extends E> valueMapping) {
            kotlin.jvm.internal.g0.p(key, "key");
            kotlin.jvm.internal.g0.p(valueMapping, "valueMapping");
            return new b<>(key, e11, valueMapping);
        }

        public int hashCode() {
            int hashCode = this.f58297a.hashCode() * 31;
            E e11 = this.f58298b;
            return ((hashCode + (e11 == null ? 0 : e11.hashCode())) * 31) + this.f58299c.hashCode();
        }

        @Override // h5.a
        @m80.l
        /* renamed from: j, reason: merged with bridge method [inline-methods] */
        public E a() {
            return this.f58298b;
        }

        @Override // h5.a
        @m80.l
        /* renamed from: k, reason: merged with bridge method [inline-methods] */
        public E c(@m80.k String value) {
            kotlin.jvm.internal.g0.p(value, "value");
            return this.f58299c.get(value);
        }

        @Override // h5.a
        /* renamed from: l, reason: merged with bridge method [inline-methods] */
        public boolean d(@m80.l E e11) {
            return true;
        }

        @m80.k
        public String toString() {
            return "EnumDef(key=" + this.f58297a + ", defaultValue=" + this.f58298b + ", valueMapping=" + this.f58299c + ')';
        }
    }

    public /* synthetic */ a(kotlin.jvm.internal.v vVar) {
        this();
    }

    public abstract T a();

    @m80.k
    public abstract String b();

    @m80.l
    public abstract T c(@m80.k String str);

    public abstract boolean d(T t11);

    public a() {
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class c extends a<Integer> {

        /* renamed from: a, reason: collision with root package name */
        @m80.k
        public final String f58300a;

        /* renamed from: b, reason: collision with root package name */
        public final int f58301b;

        /* renamed from: c, reason: collision with root package name */
        @m80.l
        public final g10.l f58302c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(@m80.k String key, int i11, @m80.l g10.l lVar) {
            super(null);
            kotlin.jvm.internal.g0.p(key, "key");
            this.f58300a = key;
            this.f58301b = i11;
            this.f58302c = lVar;
        }

        public static /* synthetic */ c i(c cVar, String str, int i11, g10.l lVar, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                str = cVar.f58300a;
            }
            if ((i12 & 2) != 0) {
                i11 = cVar.f58301b;
            }
            if ((i12 & 4) != 0) {
                lVar = cVar.f58302c;
            }
            return cVar.h(str, i11, lVar);
        }

        @Override // h5.a
        @m80.k
        public String b() {
            return this.f58300a;
        }

        @Override // h5.a
        public /* bridge */ /* synthetic */ boolean d(Integer num) {
            return m(num.intValue());
        }

        @m80.k
        public final String e() {
            return this.f58300a;
        }

        public boolean equals(@m80.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return kotlin.jvm.internal.g0.g(this.f58300a, cVar.f58300a) && this.f58301b == cVar.f58301b && kotlin.jvm.internal.g0.g(this.f58302c, cVar.f58302c);
        }

        public final int f() {
            return this.f58301b;
        }

        @m80.l
        public final g10.l g() {
            return this.f58302c;
        }

        @m80.k
        public final c h(@m80.k String key, int i11, @m80.l g10.l lVar) {
            kotlin.jvm.internal.g0.p(key, "key");
            return new c(key, i11, lVar);
        }

        public int hashCode() {
            int hashCode = ((this.f58300a.hashCode() * 31) + Integer.hashCode(this.f58301b)) * 31;
            g10.l lVar = this.f58302c;
            return hashCode + (lVar == null ? 0 : lVar.hashCode());
        }

        @Override // h5.a
        @m80.k
        /* renamed from: j, reason: merged with bridge method [inline-methods] */
        public Integer a() {
            return Integer.valueOf(this.f58301b);
        }

        @m80.l
        public final g10.l k() {
            return this.f58302c;
        }

        @Override // h5.a
        @m80.l
        /* renamed from: l, reason: merged with bridge method [inline-methods] */
        public Integer c(@m80.k String value) {
            kotlin.jvm.internal.g0.p(value, "value");
            return u30.e0.p1(value);
        }

        public boolean m(int i11) {
            g10.l lVar = this.f58302c;
            if (lVar != null) {
                return lVar.k(i11);
            }
            return true;
        }

        @m80.k
        public String toString() {
            return "IntDef(key=" + this.f58300a + ", defaultValue=" + this.f58301b + ", range=" + this.f58302c + ')';
        }

        public /* synthetic */ c(String str, int i11, g10.l lVar, int i12, kotlin.jvm.internal.v vVar) {
            this(str, i11, (i12 & 4) != 0 ? null : lVar);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class d extends a<String> {

        /* renamed from: a, reason: collision with root package name */
        @m80.k
        public final String f58303a;

        /* renamed from: b, reason: collision with root package name */
        @m80.k
        public final String f58304b;

        /* renamed from: c, reason: collision with root package name */
        @m80.l
        public final Set<String> f58305c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(@m80.k String key, @m80.k String defaultValue, @m80.l Set<String> set) {
            super(null);
            kotlin.jvm.internal.g0.p(key, "key");
            kotlin.jvm.internal.g0.p(defaultValue, "defaultValue");
            this.f58303a = key;
            this.f58304b = defaultValue;
            this.f58305c = set;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ d i(d dVar, String str, String str2, Set set, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = dVar.f58303a;
            }
            if ((i11 & 2) != 0) {
                str2 = dVar.f58304b;
            }
            if ((i11 & 4) != 0) {
                set = dVar.f58305c;
            }
            return dVar.h(str, str2, set);
        }

        @Override // h5.a
        @m80.k
        public String b() {
            return this.f58303a;
        }

        @m80.k
        public final String e() {
            return this.f58303a;
        }

        public boolean equals(@m80.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return kotlin.jvm.internal.g0.g(this.f58303a, dVar.f58303a) && kotlin.jvm.internal.g0.g(this.f58304b, dVar.f58304b) && kotlin.jvm.internal.g0.g(this.f58305c, dVar.f58305c);
        }

        @m80.k
        public final String f() {
            return this.f58304b;
        }

        @m80.l
        public final Set<String> g() {
            return this.f58305c;
        }

        @m80.k
        public final d h(@m80.k String key, @m80.k String defaultValue, @m80.l Set<String> set) {
            kotlin.jvm.internal.g0.p(key, "key");
            kotlin.jvm.internal.g0.p(defaultValue, "defaultValue");
            return new d(key, defaultValue, set);
        }

        public int hashCode() {
            int hashCode = ((this.f58303a.hashCode() * 31) + this.f58304b.hashCode()) * 31;
            Set<String> set = this.f58305c;
            return hashCode + (set == null ? 0 : set.hashCode());
        }

        @m80.l
        public final Set<String> j() {
            return this.f58305c;
        }

        @Override // h5.a
        @m80.k
        /* renamed from: k, reason: merged with bridge method [inline-methods] */
        public String a() {
            return this.f58304b;
        }

        @Override // h5.a
        @m80.k
        /* renamed from: l, reason: merged with bridge method [inline-methods] */
        public String c(@m80.k String value) {
            kotlin.jvm.internal.g0.p(value, "value");
            return value;
        }

        @Override // h5.a
        /* renamed from: m, reason: merged with bridge method [inline-methods] */
        public boolean d(@m80.k String value) {
            kotlin.jvm.internal.g0.p(value, "value");
            Set<String> set = this.f58305c;
            if (set != null) {
                return set.contains(value);
            }
            return true;
        }

        @m80.k
        public String toString() {
            return "StringDef(key=" + this.f58303a + ", defaultValue=" + this.f58304b + ", allowedValues=" + this.f58305c + ')';
        }

        public /* synthetic */ d(String str, String str2, Set set, int i11, kotlin.jvm.internal.v vVar) {
            this(str, str2, (i11 & 4) != 0 ? null : set);
        }
    }
}
