package com.google.common.cache;

import com.google.common.base.Preconditions;
import com.google.common.cache.d;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import ho.b0;
import ho.d0;
import ho.m0;
import ho.o0;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import javax.annotation.CheckForNull;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@go.c
@jo.e
/* loaded from: classes7.dex */
public final class c {

    /* renamed from: o, reason: collision with root package name */
    public static final m0 f32776o = m0.h(',').q();

    /* renamed from: p, reason: collision with root package name */
    public static final m0 f32777p = m0.h('=').q();

    /* renamed from: q, reason: collision with root package name */
    public static final ImmutableMap<String, m> f32778q;

    /* renamed from: a, reason: collision with root package name */
    @CheckForNull
    @go.e
    public Integer f32779a;

    /* renamed from: b, reason: collision with root package name */
    @CheckForNull
    @go.e
    public Long f32780b;

    /* renamed from: c, reason: collision with root package name */
    @CheckForNull
    @go.e
    public Long f32781c;

    /* renamed from: d, reason: collision with root package name */
    @CheckForNull
    @go.e
    public Integer f32782d;

    /* renamed from: e, reason: collision with root package name */
    @CheckForNull
    @go.e
    public d.t f32783e;

    /* renamed from: f, reason: collision with root package name */
    @CheckForNull
    @go.e
    public d.t f32784f;

    /* renamed from: g, reason: collision with root package name */
    @CheckForNull
    @go.e
    public Boolean f32785g;

    /* renamed from: h, reason: collision with root package name */
    @go.e
    public long f32786h;

    /* renamed from: i, reason: collision with root package name */
    @CheckForNull
    @go.e
    public TimeUnit f32787i;

    /* renamed from: j, reason: collision with root package name */
    @go.e
    public long f32788j;

    /* renamed from: k, reason: collision with root package name */
    @CheckForNull
    @go.e
    public TimeUnit f32789k;

    /* renamed from: l, reason: collision with root package name */
    @go.e
    public long f32790l;

    /* renamed from: m, reason: collision with root package name */
    @CheckForNull
    @go.e
    public TimeUnit f32791m;

    /* renamed from: n, reason: collision with root package name */
    public final String f32792n;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f32793a;

        static {
            int[] iArr = new int[d.t.values().length];
            f32793a = iArr;
            try {
                iArr[d.t.f32920c.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f32793a[d.t.f32919b.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class b extends d {
        @Override // com.google.common.cache.c.d
        public void b(c spec, long duration, TimeUnit unit) {
            Preconditions.checkArgument(spec.f32789k == null, "expireAfterAccess already set");
            spec.f32788j = duration;
            spec.f32789k = unit;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    /* renamed from: com.google.common.cache.c$c, reason: collision with other inner class name */
    public static class C0383c extends f {
        @Override // com.google.common.cache.c.f
        public void b(c spec, int value) {
            Integer num = spec.f32782d;
            Preconditions.checkArgument(num == null, "concurrency level was already set to %s", num);
            spec.f32782d = Integer.valueOf(value);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static abstract class d implements m {
        @Override // com.google.common.cache.c.m
        public void a(c spec, String key, @CheckForNull String value) {
            TimeUnit timeUnit;
            if (o0.d(value)) {
                throw new IllegalArgumentException("value of key " + key + " omitted");
            }
            try {
                char charAt = value.charAt(value.length() - 1);
                if (charAt == 'd') {
                    timeUnit = TimeUnit.DAYS;
                } else if (charAt == 'h') {
                    timeUnit = TimeUnit.HOURS;
                } else if (charAt == 'm') {
                    timeUnit = TimeUnit.MINUTES;
                } else {
                    if (charAt != 's') {
                        throw new IllegalArgumentException(c.d("key %s invalid unit: was %s, must end with one of [dhms]", key, value));
                    }
                    timeUnit = TimeUnit.SECONDS;
                }
                b(spec, Long.parseLong(value.substring(0, value.length() - 1)), timeUnit);
            } catch (NumberFormatException unused) {
                throw new IllegalArgumentException(c.d("key %s value set to %s, must be integer", key, value));
            }
        }

        public abstract void b(c spec, long duration, TimeUnit unit);
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class e extends f {
        @Override // com.google.common.cache.c.f
        public void b(c spec, int value) {
            Integer num = spec.f32779a;
            Preconditions.checkArgument(num == null, "initial capacity was already set to %s", num);
            spec.f32779a = Integer.valueOf(value);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static abstract class f implements m {
        @Override // com.google.common.cache.c.m
        public void a(c spec, String key, String value) {
            if (!o0.d(value)) {
                try {
                    b(spec, Integer.parseInt(value));
                } catch (NumberFormatException e11) {
                    throw new IllegalArgumentException(c.d("key %s value set to %s, must be integer", key, value), e11);
                }
            } else {
                throw new IllegalArgumentException("value of key " + key + " omitted");
            }
        }

        public abstract void b(c spec, int value);
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class g implements m {

        /* renamed from: a, reason: collision with root package name */
        public final d.t f32794a;

        public g(d.t strength) {
            this.f32794a = strength;
        }

        @Override // com.google.common.cache.c.m
        public void a(c spec, String key, @CheckForNull String value) {
            Preconditions.checkArgument(value == null, "key %s does not take values", key);
            d.t tVar = spec.f32783e;
            Preconditions.checkArgument(tVar == null, "%s was already set to %s", key, tVar);
            spec.f32783e = this.f32794a;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static abstract class h implements m {
        @Override // com.google.common.cache.c.m
        public void a(c spec, String key, String value) {
            if (!o0.d(value)) {
                try {
                    b(spec, Long.parseLong(value));
                } catch (NumberFormatException e11) {
                    throw new IllegalArgumentException(c.d("key %s value set to %s, must be integer", key, value), e11);
                }
            } else {
                throw new IllegalArgumentException("value of key " + key + " omitted");
            }
        }

        public abstract void b(c spec, long value);
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class i extends h {
        @Override // com.google.common.cache.c.h
        public void b(c spec, long value) {
            Long l11 = spec.f32780b;
            Preconditions.checkArgument(l11 == null, "maximum size was already set to %s", l11);
            Long l12 = spec.f32781c;
            Preconditions.checkArgument(l12 == null, "maximum weight was already set to %s", l12);
            spec.f32780b = Long.valueOf(value);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class j extends h {
        @Override // com.google.common.cache.c.h
        public void b(c spec, long value) {
            Long l11 = spec.f32781c;
            Preconditions.checkArgument(l11 == null, "maximum weight was already set to %s", l11);
            Long l12 = spec.f32780b;
            Preconditions.checkArgument(l12 == null, "maximum size was already set to %s", l12);
            spec.f32781c = Long.valueOf(value);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class k implements m {
        @Override // com.google.common.cache.c.m
        public void a(c spec, String key, @CheckForNull String value) {
            Preconditions.checkArgument(value == null, "recordStats does not take values");
            Preconditions.checkArgument(spec.f32785g == null, "recordStats already set");
            spec.f32785g = Boolean.TRUE;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class l extends d {
        @Override // com.google.common.cache.c.d
        public void b(c spec, long duration, TimeUnit unit) {
            Preconditions.checkArgument(spec.f32791m == null, "refreshAfterWrite already set");
            spec.f32790l = duration;
            spec.f32791m = unit;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public interface m {
        void a(c spec, String key, @CheckForNull String value);
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class n implements m {

        /* renamed from: a, reason: collision with root package name */
        public final d.t f32795a;

        public n(d.t strength) {
            this.f32795a = strength;
        }

        @Override // com.google.common.cache.c.m
        public void a(c spec, String key, @CheckForNull String value) {
            Preconditions.checkArgument(value == null, "key %s does not take values", key);
            d.t tVar = spec.f32784f;
            Preconditions.checkArgument(tVar == null, "%s was already set to %s", key, tVar);
            spec.f32784f = this.f32795a;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class o extends d {
        @Override // com.google.common.cache.c.d
        public void b(c spec, long duration, TimeUnit unit) {
            Preconditions.checkArgument(spec.f32787i == null, "expireAfterWrite already set");
            spec.f32786h = duration;
            spec.f32787i = unit;
        }
    }

    static {
        ImmutableMap.b i11 = ImmutableMap.builder().i("initialCapacity", new e()).i("maximumSize", new i()).i("maximumWeight", new j()).i("concurrencyLevel", new C0383c());
        d.t tVar = d.t.f32920c;
        f32778q = i11.i("weakKeys", new g(tVar)).i("softValues", new n(d.t.f32919b)).i("weakValues", new n(tVar)).i("recordStats", new k()).i("expireAfterAccess", new b()).i("expireAfterWrite", new o()).i("refreshAfterWrite", new l()).i("refreshInterval", new l()).d();
    }

    public c(String specification) {
        this.f32792n = specification;
    }

    public static c b() {
        return e("maximumSize=0");
    }

    @CheckForNull
    public static Long c(long duration, @CheckForNull TimeUnit unit) {
        if (unit == null) {
            return null;
        }
        return Long.valueOf(unit.toNanos(duration));
    }

    public static String d(String format, Object... args) {
        return String.format(Locale.ROOT, format, args);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static c e(String cacheBuilderSpecification) {
        c cVar = new c(cacheBuilderSpecification);
        if (!cacheBuilderSpecification.isEmpty()) {
            for (String str : f32776o.n(cacheBuilderSpecification)) {
                ImmutableList copyOf = ImmutableList.copyOf(f32777p.n(str));
                Preconditions.checkArgument(!copyOf.isEmpty(), "blank key-value pair");
                Preconditions.checkArgument(copyOf.size() <= 2, "key-value pair %s with more than one equals sign", str);
                String str2 = (String) copyOf.get(0);
                m mVar = f32778q.get(str2);
                Preconditions.checkArgument(mVar != null, "unknown key %s", str2);
                mVar.a(cVar, str2, copyOf.size() == 1 ? null : (String) copyOf.get(1));
            }
        }
        return cVar;
    }

    public boolean equals(@CheckForNull Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return d0.a(this.f32779a, cVar.f32779a) && d0.a(this.f32780b, cVar.f32780b) && d0.a(this.f32781c, cVar.f32781c) && d0.a(this.f32782d, cVar.f32782d) && d0.a(this.f32783e, cVar.f32783e) && d0.a(this.f32784f, cVar.f32784f) && d0.a(this.f32785g, cVar.f32785g) && d0.a(c(this.f32786h, this.f32787i), c(cVar.f32786h, cVar.f32787i)) && d0.a(c(this.f32788j, this.f32789k), c(cVar.f32788j, cVar.f32789k)) && d0.a(c(this.f32790l, this.f32791m), c(cVar.f32790l, cVar.f32791m));
    }

    public com.google.common.cache.b<Object, Object> f() {
        com.google.common.cache.b<Object, Object> F = com.google.common.cache.b.F();
        Integer num = this.f32779a;
        if (num != null) {
            F.z(num.intValue());
        }
        Long l11 = this.f32780b;
        if (l11 != null) {
            F.D(l11.longValue());
        }
        Long l12 = this.f32781c;
        if (l12 != null) {
            F.E(l12.longValue());
        }
        Integer num2 = this.f32782d;
        if (num2 != null) {
            F.e(num2.intValue());
        }
        d.t tVar = this.f32783e;
        if (tVar != null) {
            if (a.f32793a[tVar.ordinal()] != 1) {
                throw new AssertionError();
            }
            F.Q();
        }
        d.t tVar2 = this.f32784f;
        if (tVar2 != null) {
            int i11 = a.f32793a[tVar2.ordinal()];
            if (i11 == 1) {
                F.R();
            } else {
                if (i11 != 2) {
                    throw new AssertionError();
                }
                F.M();
            }
        }
        Boolean bool = this.f32785g;
        if (bool != null && bool.booleanValue()) {
            F.G();
        }
        TimeUnit timeUnit = this.f32787i;
        if (timeUnit != null) {
            F.h(this.f32786h, timeUnit);
        }
        TimeUnit timeUnit2 = this.f32789k;
        if (timeUnit2 != null) {
            F.f(this.f32788j, timeUnit2);
        }
        TimeUnit timeUnit3 = this.f32791m;
        if (timeUnit3 != null) {
            F.H(this.f32790l, timeUnit3);
        }
        return F;
    }

    public String g() {
        return this.f32792n;
    }

    public int hashCode() {
        return d0.b(this.f32779a, this.f32780b, this.f32781c, this.f32782d, this.f32783e, this.f32784f, this.f32785g, c(this.f32786h, this.f32787i), c(this.f32788j, this.f32789k), c(this.f32790l, this.f32791m));
    }

    public String toString() {
        return b0.c(this).s(g()).toString();
    }
}
