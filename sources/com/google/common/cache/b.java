package com.google.common.cache;

import com.google.common.base.Equivalence;
import com.google.common.base.Preconditions;
import com.google.common.cache.a;
import com.google.common.cache.d;
import com.meizu.cloud.pushsdk.notification.model.NotificationStyle;
import ho.b0;
import ho.p0;
import ho.r0;
import ho.u0;
import java.time.Duration;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.annotation.CheckForNull;
import jo.h;
import jo.i;
import jo.p;
import jo.u;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@jo.e
@go.b(emulated = true)
/* loaded from: classes7.dex */
public final class b<K, V> {

    /* renamed from: q, reason: collision with root package name */
    public static final int f32746q = 16;

    /* renamed from: r, reason: collision with root package name */
    public static final int f32747r = 4;

    /* renamed from: s, reason: collision with root package name */
    public static final int f32748s = 0;

    /* renamed from: t, reason: collision with root package name */
    public static final int f32749t = 0;

    /* renamed from: u, reason: collision with root package name */
    public static final p0<? extends a.b> f32750u = r0.e(new a());

    /* renamed from: v, reason: collision with root package name */
    public static final jo.d f32751v = new jo.d(0, 0, 0, 0, 0, 0);

    /* renamed from: w, reason: collision with root package name */
    public static final p0<a.b> f32752w = new C0382b();

    /* renamed from: x, reason: collision with root package name */
    public static final u0 f32753x = new c();

    /* renamed from: y, reason: collision with root package name */
    public static final int f32754y = -1;

    /* renamed from: f, reason: collision with root package name */
    @CheckForNull
    public u<? super K, ? super V> f32760f;

    /* renamed from: g, reason: collision with root package name */
    @CheckForNull
    public d.t f32761g;

    /* renamed from: h, reason: collision with root package name */
    @CheckForNull
    public d.t f32762h;

    /* renamed from: l, reason: collision with root package name */
    @CheckForNull
    public Equivalence<Object> f32766l;

    /* renamed from: m, reason: collision with root package name */
    @CheckForNull
    public Equivalence<Object> f32767m;

    /* renamed from: n, reason: collision with root package name */
    @CheckForNull
    public p<? super K, ? super V> f32768n;

    /* renamed from: o, reason: collision with root package name */
    @CheckForNull
    public u0 f32769o;

    /* renamed from: a, reason: collision with root package name */
    public boolean f32755a = true;

    /* renamed from: b, reason: collision with root package name */
    public int f32756b = -1;

    /* renamed from: c, reason: collision with root package name */
    public int f32757c = -1;

    /* renamed from: d, reason: collision with root package name */
    public long f32758d = -1;

    /* renamed from: e, reason: collision with root package name */
    public long f32759e = -1;

    /* renamed from: i, reason: collision with root package name */
    public long f32763i = -1;

    /* renamed from: j, reason: collision with root package name */
    public long f32764j = -1;

    /* renamed from: k, reason: collision with root package name */
    public long f32765k = -1;

    /* renamed from: p, reason: collision with root package name */
    public p0<? extends a.b> f32770p = f32750u;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    /* renamed from: com.google.common.cache.b$b, reason: collision with other inner class name */
    public class C0382b implements p0<a.b> {
        @Override // ho.p0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public a.b get() {
            return new a.C0381a();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class c extends u0 {
        @Override // ho.u0
        public long a() {
            return 0L;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class d {

        /* renamed from: a, reason: collision with root package name */
        public static final Logger f32771a = Logger.getLogger(b.class.getName());
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public enum f implements u<Object, Object> {
        INSTANCE;

        @Override // jo.u
        public int a(Object key, Object value) {
            return 1;
        }
    }

    public static b<Object, Object> F() {
        return new b<>();
    }

    @h
    @go.c
    public static long O(Duration duration) {
        boolean isNegative;
        long nanos;
        try {
            nanos = duration.toNanos();
            return nanos;
        } catch (ArithmeticException unused) {
            isNegative = duration.isNegative();
            return isNegative ? Long.MIN_VALUE : Long.MAX_VALUE;
        }
    }

    @go.c
    public static b<Object, Object> j(com.google.common.cache.c spec) {
        return spec.f().C();
    }

    @go.c
    public static b<Object, Object> k(String spec) {
        return j(com.google.common.cache.c.e(spec));
    }

    public boolean A() {
        return this.f32770p == f32752w;
    }

    @go.c
    @uo.a
    public b<K, V> B(Equivalence<Object> equivalence) {
        Equivalence<Object> equivalence2 = this.f32766l;
        Preconditions.checkState(equivalence2 == null, "key equivalence was already set to %s", equivalence2);
        this.f32766l = (Equivalence) Preconditions.checkNotNull(equivalence);
        return this;
    }

    @go.c
    @uo.a
    public b<K, V> C() {
        this.f32755a = false;
        return this;
    }

    @uo.a
    public b<K, V> D(long maximumSize) {
        long j11 = this.f32758d;
        Preconditions.checkState(j11 == -1, "maximum size was already set to %s", j11);
        long j12 = this.f32759e;
        Preconditions.checkState(j12 == -1, "maximum weight was already set to %s", j12);
        Preconditions.checkState(this.f32760f == null, "maximum size can not be combined with weigher");
        Preconditions.checkArgument(maximumSize >= 0, "maximum size must not be negative");
        this.f32758d = maximumSize;
        return this;
    }

    @go.c
    @uo.a
    public b<K, V> E(long maximumWeight) {
        long j11 = this.f32759e;
        Preconditions.checkState(j11 == -1, "maximum weight was already set to %s", j11);
        long j12 = this.f32758d;
        Preconditions.checkState(j12 == -1, "maximum size was already set to %s", j12);
        Preconditions.checkArgument(maximumWeight >= 0, "maximum weight must not be negative");
        this.f32759e = maximumWeight;
        return this;
    }

    @uo.a
    public b<K, V> G() {
        this.f32770p = f32752w;
        return this;
    }

    @go.c
    @uo.a
    public b<K, V> H(long duration, TimeUnit unit) {
        Preconditions.checkNotNull(unit);
        long j11 = this.f32765k;
        Preconditions.checkState(j11 == -1, "refresh was already set to %s ns", j11);
        Preconditions.checkArgument(duration > 0, "duration must be positive: %s %s", duration, unit);
        this.f32765k = unit.toNanos(duration);
        return this;
    }

    @h
    @go.c
    @uo.a
    public b<K, V> I(Duration duration) {
        return H(O(duration), TimeUnit.NANOSECONDS);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public <K1 extends K, V1 extends V> b<K1, V1> J(p<? super K1, ? super V1> listener) {
        Preconditions.checkState(this.f32768n == null);
        this.f32768n = (p) Preconditions.checkNotNull(listener);
        return this;
    }

    @uo.a
    public b<K, V> K(d.t strength) {
        d.t tVar = this.f32761g;
        Preconditions.checkState(tVar == null, "Key strength was already set to %s", tVar);
        this.f32761g = (d.t) Preconditions.checkNotNull(strength);
        return this;
    }

    @uo.a
    public b<K, V> L(d.t strength) {
        d.t tVar = this.f32762h;
        Preconditions.checkState(tVar == null, "Value strength was already set to %s", tVar);
        this.f32762h = (d.t) Preconditions.checkNotNull(strength);
        return this;
    }

    @go.c
    @uo.a
    public b<K, V> M() {
        return L(d.t.f32919b);
    }

    @uo.a
    public b<K, V> N(u0 ticker) {
        Preconditions.checkState(this.f32769o == null);
        this.f32769o = (u0) Preconditions.checkNotNull(ticker);
        return this;
    }

    @go.c
    @uo.a
    public b<K, V> P(Equivalence<Object> equivalence) {
        Equivalence<Object> equivalence2 = this.f32767m;
        Preconditions.checkState(equivalence2 == null, "value equivalence was already set to %s", equivalence2);
        this.f32767m = (Equivalence) Preconditions.checkNotNull(equivalence);
        return this;
    }

    @go.c
    @uo.a
    public b<K, V> Q() {
        return K(d.t.f32920c);
    }

    @go.c
    @uo.a
    public b<K, V> R() {
        return L(d.t.f32920c);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @go.c
    @uo.a
    public <K1 extends K, V1 extends V> b<K1, V1> S(u<? super K1, ? super V1> weigher) {
        Preconditions.checkState(this.f32760f == null);
        if (this.f32755a) {
            long j11 = this.f32758d;
            Preconditions.checkState(j11 == -1, "weigher can not be combined with maximum size (%s provided)", j11);
        }
        this.f32760f = (u) Preconditions.checkNotNull(weigher);
        return this;
    }

    public <K1 extends K, V1 extends V> jo.b<K1, V1> a() {
        d();
        c();
        return new d.o(this);
    }

    public <K1 extends K, V1 extends V> i<K1, V1> b(CacheLoader<? super K1, V1> loader) {
        d();
        return new d.n(this, loader);
    }

    public final void c() {
        Preconditions.checkState(this.f32765k == -1, "refreshAfterWrite requires a LoadingCache");
    }

    public final void d() {
        if (this.f32760f == null) {
            Preconditions.checkState(this.f32759e == -1, "maximumWeight requires weigher");
        } else if (this.f32755a) {
            Preconditions.checkState(this.f32759e != -1, "weigher requires maximumWeight");
        } else if (this.f32759e == -1) {
            d.f32771a.log(Level.WARNING, "ignoring weigher specified without maximumWeight");
        }
    }

    @uo.a
    public b<K, V> e(int concurrencyLevel) {
        int i11 = this.f32757c;
        Preconditions.checkState(i11 == -1, "concurrency level was already set to %s", i11);
        Preconditions.checkArgument(concurrencyLevel > 0);
        this.f32757c = concurrencyLevel;
        return this;
    }

    @uo.a
    public b<K, V> f(long duration, TimeUnit unit) {
        long j11 = this.f32764j;
        Preconditions.checkState(j11 == -1, "expireAfterAccess was already set to %s ns", j11);
        Preconditions.checkArgument(duration >= 0, "duration cannot be negative: %s %s", duration, unit);
        this.f32764j = unit.toNanos(duration);
        return this;
    }

    @h
    @go.c
    @uo.a
    public b<K, V> g(Duration duration) {
        return f(O(duration), TimeUnit.NANOSECONDS);
    }

    @uo.a
    public b<K, V> h(long duration, TimeUnit unit) {
        long j11 = this.f32763i;
        Preconditions.checkState(j11 == -1, "expireAfterWrite was already set to %s ns", j11);
        Preconditions.checkArgument(duration >= 0, "duration cannot be negative: %s %s", duration, unit);
        this.f32763i = unit.toNanos(duration);
        return this;
    }

    @h
    @go.c
    @uo.a
    public b<K, V> i(Duration duration) {
        return h(O(duration), TimeUnit.NANOSECONDS);
    }

    public int l() {
        int i11 = this.f32757c;
        if (i11 == -1) {
            return 4;
        }
        return i11;
    }

    public long m() {
        long j11 = this.f32764j;
        if (j11 == -1) {
            return 0L;
        }
        return j11;
    }

    public long n() {
        long j11 = this.f32763i;
        if (j11 == -1) {
            return 0L;
        }
        return j11;
    }

    public int o() {
        int i11 = this.f32756b;
        if (i11 == -1) {
            return 16;
        }
        return i11;
    }

    public Equivalence<Object> p() {
        return (Equivalence) b0.a(this.f32766l, q().b());
    }

    public d.t q() {
        return (d.t) b0.a(this.f32761g, d.t.f32918a);
    }

    public long r() {
        if (this.f32763i == 0 || this.f32764j == 0) {
            return 0L;
        }
        return this.f32760f == null ? this.f32758d : this.f32759e;
    }

    public long s() {
        long j11 = this.f32765k;
        if (j11 == -1) {
            return 0L;
        }
        return j11;
    }

    public <K1 extends K, V1 extends V> p<K1, V1> t() {
        return (p) b0.a(this.f32768n, e.INSTANCE);
    }

    public String toString() {
        b0.b c11 = b0.c(this);
        int i11 = this.f32756b;
        if (i11 != -1) {
            c11.d("initialCapacity", i11);
        }
        int i12 = this.f32757c;
        if (i12 != -1) {
            c11.d("concurrencyLevel", i12);
        }
        long j11 = this.f32758d;
        if (j11 != -1) {
            c11.e("maximumSize", j11);
        }
        long j12 = this.f32759e;
        if (j12 != -1) {
            c11.e("maximumWeight", j12);
        }
        if (this.f32763i != -1) {
            c11.f("expireAfterWrite", this.f32763i + NotificationStyle.NOTIFICATION_STYLE);
        }
        if (this.f32764j != -1) {
            c11.f("expireAfterAccess", this.f32764j + NotificationStyle.NOTIFICATION_STYLE);
        }
        d.t tVar = this.f32761g;
        if (tVar != null) {
            c11.f("keyStrength", ho.c.g(tVar.toString()));
        }
        d.t tVar2 = this.f32762h;
        if (tVar2 != null) {
            c11.f("valueStrength", ho.c.g(tVar2.toString()));
        }
        if (this.f32766l != null) {
            c11.s("keyEquivalence");
        }
        if (this.f32767m != null) {
            c11.s("valueEquivalence");
        }
        if (this.f32768n != null) {
            c11.s("removalListener");
        }
        return c11.toString();
    }

    public p0<? extends a.b> u() {
        return this.f32770p;
    }

    public u0 v(boolean recordsTime) {
        u0 u0Var = this.f32769o;
        return u0Var != null ? u0Var : recordsTime ? u0.b() : f32753x;
    }

    public Equivalence<Object> w() {
        return (Equivalence) b0.a(this.f32767m, x().b());
    }

    public d.t x() {
        return (d.t) b0.a(this.f32762h, d.t.f32918a);
    }

    public <K1 extends K, V1 extends V> u<K1, V1> y() {
        return (u) b0.a(this.f32760f, f.INSTANCE);
    }

    @uo.a
    public b<K, V> z(int initialCapacity) {
        int i11 = this.f32756b;
        Preconditions.checkState(i11 == -1, "initial capacity was already set to %s", i11);
        Preconditions.checkArgument(initialCapacity >= 0);
        this.f32756b = initialCapacity;
        return this;
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class a implements a.b {
        @Override // com.google.common.cache.a.b
        public jo.d f() {
            return b.f32751v;
        }

        @Override // com.google.common.cache.a.b
        public void b() {
        }

        @Override // com.google.common.cache.a.b
        public void a(int count) {
        }

        @Override // com.google.common.cache.a.b
        public void c(long loadTime) {
        }

        @Override // com.google.common.cache.a.b
        public void d(int count) {
        }

        @Override // com.google.common.cache.a.b
        public void e(long loadTime) {
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public enum e implements p<Object, Object> {
        INSTANCE;

        @Override // jo.p
        public void a(RemovalNotification<Object, Object> notification) {
        }
    }
}
