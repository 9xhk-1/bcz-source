package com.google.common.collect;

import com.google.common.base.Preconditions;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.EnumMap;
import java.util.EnumSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeMap;
import java.util.TreeSet;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u3
@go.b
/* loaded from: classes7.dex */
public abstract class e7<K0, V0> {

    /* renamed from: a, reason: collision with root package name */
    public static final int f33404a = 8;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class a extends k<Object> {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ int f33405b;

        public a(final int val$expectedKeys) {
            this.f33405b = val$expectedKeys;
        }

        @Override // com.google.common.collect.e7.k
        public <K, V> Map<K, Collection<V>> c() {
            return v7.d(this.f33405b);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class b extends k<Object> {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ int f33406b;

        public b(final int val$expectedKeys) {
            this.f33406b = val$expectedKeys;
        }

        @Override // com.google.common.collect.e7.k
        public <K, V> Map<K, Collection<V>> c() {
            return v7.f(this.f33406b);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class c extends k<K0> {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Comparator f33407b;

        public c(final Comparator val$comparator) {
            this.f33407b = val$comparator;
        }

        @Override // com.google.common.collect.e7.k
        public <K extends K0, V> Map<K, Collection<V>> c() {
            return new TreeMap(this.f33407b);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class d extends k<K0> {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Class f33408b;

        public d(final Class val$keyClass) {
            this.f33408b = val$keyClass;
        }

        @Override // com.google.common.collect.e7.k
        public <K extends K0, V> Map<K, Collection<V>> c() {
            return new EnumMap(this.f33408b);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class e<V> implements ho.p0<List<V>>, Serializable {

        /* renamed from: a, reason: collision with root package name */
        public final int f33409a;

        public e(int expectedValuesPerKey) {
            this.f33409a = x2.b(expectedValuesPerKey, "expectedValuesPerKey");
        }

        @Override // ho.p0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public List<V> get() {
            return new ArrayList(this.f33409a);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class f<V extends Enum<V>> implements ho.p0<Set<V>>, Serializable {

        /* renamed from: a, reason: collision with root package name */
        public final Class<V> f33410a;

        public f(Class<V> clazz) {
            this.f33410a = (Class) Preconditions.checkNotNull(clazz);
        }

        @Override // ho.p0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Set<V> get() {
            return EnumSet.noneOf(this.f33410a);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class g<V> implements ho.p0<Set<V>>, Serializable {

        /* renamed from: a, reason: collision with root package name */
        public final int f33411a;

        public g(int expectedValuesPerKey) {
            this.f33411a = x2.b(expectedValuesPerKey, "expectedValuesPerKey");
        }

        @Override // ho.p0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Set<V> get() {
            return v7.e(this.f33411a);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class h<V> implements ho.p0<Set<V>>, Serializable {

        /* renamed from: a, reason: collision with root package name */
        public final int f33412a;

        public h(int expectedValuesPerKey) {
            this.f33412a = x2.b(expectedValuesPerKey, "expectedValuesPerKey");
        }

        @Override // ho.p0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Set<V> get() {
            return v7.g(this.f33412a);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public enum i implements ho.p0<List<?>> {
        INSTANCE;

        public static <V> ho.p0<List<V>> c() {
            return INSTANCE;
        }

        @Override // ho.p0
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public List<?> get() {
            return new LinkedList();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static abstract class j<K0, V0> extends e7<K0, V0> {
        public j() {
            super(null);
        }

        @Override // com.google.common.collect.e7
        /* renamed from: j, reason: merged with bridge method [inline-methods] */
        public abstract <K extends K0, V extends V0> p6<K, V> a();

        @Override // com.google.common.collect.e7
        /* renamed from: k, reason: merged with bridge method [inline-methods] */
        public <K extends K0, V extends V0> p6<K, V> b(d7<? extends K, ? extends V> multimap) {
            return (p6) super.b(multimap);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static abstract class k<K0> {

        /* renamed from: a, reason: collision with root package name */
        public static final int f33415a = 2;

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public class a extends j<K0, Object> {

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ int f33416b;

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ k f33417c;

            public a(final k this$0, final int val$expectedValuesPerKey) {
                this.f33416b = val$expectedValuesPerKey;
                this.f33417c = this$0;
            }

            @Override // com.google.common.collect.e7.j, com.google.common.collect.e7
            /* renamed from: j */
            public <K extends K0, V> p6<K, V> a() {
                return g7.v(this.f33417c.c(), new e(this.f33416b));
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public class b extends j<K0, Object> {
            public b() {
            }

            @Override // com.google.common.collect.e7.j, com.google.common.collect.e7
            /* renamed from: j */
            public <K extends K0, V> p6<K, V> a() {
                return g7.v(k.this.c(), i.c());
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public class c extends l<K0, Object> {

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ int f33419b;

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ k f33420c;

            public c(final k this$0, final int val$expectedValuesPerKey) {
                this.f33419b = val$expectedValuesPerKey;
                this.f33420c = this$0;
            }

            @Override // com.google.common.collect.e7.l, com.google.common.collect.e7
            /* renamed from: j, reason: merged with bridge method [inline-methods] */
            public <K extends K0, V> p8<K, V> a() {
                return g7.x(this.f33420c.c(), new g(this.f33419b));
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public class d extends l<K0, Object> {

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ int f33421b;

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ k f33422c;

            public d(final k this$0, final int val$expectedValuesPerKey) {
                this.f33421b = val$expectedValuesPerKey;
                this.f33422c = this$0;
            }

            @Override // com.google.common.collect.e7.l, com.google.common.collect.e7
            /* renamed from: j */
            public <K extends K0, V> p8<K, V> a() {
                return g7.x(this.f33422c.c(), new h(this.f33421b));
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public class e extends m<K0, V0> {

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ Comparator f33423b;

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ k f33424c;

            public e(final k this$0, final Comparator val$comparator) {
                this.f33423b = val$comparator;
                this.f33424c = this$0;
            }

            @Override // com.google.common.collect.e7.m, com.google.common.collect.e7.l
            /* renamed from: l, reason: merged with bridge method [inline-methods] */
            public <K extends K0, V extends V0> a9<K, V> a() {
                return g7.y(this.f33424c.c(), new n(this.f33423b));
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public class f extends l<K0, V0> {

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ Class f33425b;

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ k f33426c;

            public f(final k this$0, final Class val$valueClass) {
                this.f33425b = val$valueClass;
                this.f33426c = this$0;
            }

            @Override // com.google.common.collect.e7.l, com.google.common.collect.e7
            /* renamed from: j */
            public <K extends K0, V extends V0> p8<K, V> a() {
                return g7.x(this.f33426c.c(), new f(this.f33425b));
            }
        }

        public j<K0, Object> a() {
            return b(2);
        }

        public j<K0, Object> b(int expectedValuesPerKey) {
            x2.b(expectedValuesPerKey, "expectedValuesPerKey");
            return new a(this, expectedValuesPerKey);
        }

        public abstract <K extends K0, V> Map<K, Collection<V>> c();

        public <V0 extends Enum<V0>> l<K0, V0> d(Class<V0> valueClass) {
            Preconditions.checkNotNull(valueClass, "valueClass");
            return new f(this, valueClass);
        }

        public l<K0, Object> e() {
            return f(2);
        }

        public l<K0, Object> f(int expectedValuesPerKey) {
            x2.b(expectedValuesPerKey, "expectedValuesPerKey");
            return new c(this, expectedValuesPerKey);
        }

        public l<K0, Object> g() {
            return h(2);
        }

        public l<K0, Object> h(int expectedValuesPerKey) {
            x2.b(expectedValuesPerKey, "expectedValuesPerKey");
            return new d(this, expectedValuesPerKey);
        }

        public j<K0, Object> i() {
            return new b();
        }

        public m<K0, Comparable> j() {
            return k(s7.z());
        }

        public <V0> m<K0, V0> k(Comparator<V0> comparator) {
            Preconditions.checkNotNull(comparator, "comparator");
            return new e(this, comparator);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static abstract class l<K0, V0> extends e7<K0, V0> {
        public l() {
            super(null);
        }

        @Override // com.google.common.collect.e7
        /* renamed from: j */
        public abstract <K extends K0, V extends V0> p8<K, V> a();

        @Override // com.google.common.collect.e7
        /* renamed from: k, reason: merged with bridge method [inline-methods] */
        public <K extends K0, V extends V0> p8<K, V> b(d7<? extends K, ? extends V> multimap) {
            return (p8) super.b(multimap);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static abstract class m<K0, V0> extends l<K0, V0> {
        @Override // com.google.common.collect.e7.l
        /* renamed from: l */
        public abstract <K extends K0, V extends V0> a9<K, V> a();

        @Override // com.google.common.collect.e7.l
        /* renamed from: m, reason: merged with bridge method [inline-methods] */
        public <K extends K0, V extends V0> a9<K, V> b(d7<? extends K, ? extends V> multimap) {
            return (a9) super.b(multimap);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class n<V> implements ho.p0<SortedSet<V>>, Serializable {

        /* renamed from: a, reason: collision with root package name */
        public final Comparator<? super V> f33427a;

        public n(Comparator<? super V> comparator) {
            this.f33427a = (Comparator) Preconditions.checkNotNull(comparator);
        }

        @Override // ho.p0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public SortedSet<V> get() {
            return new TreeSet(this.f33427a);
        }
    }

    public /* synthetic */ e7(a aVar) {
        this();
    }

    public static <K0 extends Enum<K0>> k<K0> c(Class<K0> keyClass) {
        Preconditions.checkNotNull(keyClass);
        return new d(keyClass);
    }

    public static k<Object> d() {
        return e(8);
    }

    public static k<Object> e(int expectedKeys) {
        x2.b(expectedKeys, "expectedKeys");
        return new a(expectedKeys);
    }

    public static k<Object> f() {
        return g(8);
    }

    public static k<Object> g(int expectedKeys) {
        x2.b(expectedKeys, "expectedKeys");
        return new b(expectedKeys);
    }

    public static k<Comparable> h() {
        return i(s7.z());
    }

    public static <K0> k<K0> i(Comparator<K0> comparator) {
        Preconditions.checkNotNull(comparator);
        return new c(comparator);
    }

    public abstract <K extends K0, V extends V0> d7<K, V> a();

    public <K extends K0, V extends V0> d7<K, V> b(d7<? extends K, ? extends V> multimap) {
        d7<K, V> a11 = a();
        a11.putAll(multimap);
        return a11;
    }

    public e7() {
    }
}
