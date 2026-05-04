package u30;

import java.util.Iterator;
import java.util.List;
import java.util.regex.MatchResult;
import java.util.regex.Matcher;
import u30.o;
import u30.p;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class p implements o {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final Matcher f91684a;

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public final CharSequence f91685b;

    /* renamed from: c, reason: collision with root package name */
    @m80.k
    public final m f91686c;

    /* renamed from: d, reason: collision with root package name */
    @m80.l
    public List<String> f91687d;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a extends a00.d<String> {
        public a() {
        }

        @Override // a00.b, java.util.Collection
        public final /* bridge */ boolean contains(Object obj) {
            if (obj instanceof String) {
                return contains((String) obj);
            }
            return false;
        }

        @Override // a00.d, java.util.List
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public String get(int i11) {
            String group = p.this.f().group(i11);
            return group == null ? "" : group;
        }

        public /* bridge */ int f(String str) {
            return super.indexOf(str);
        }

        public /* bridge */ int g(String str) {
            return super.lastIndexOf(str);
        }

        @Override // a00.d, a00.b
        public int getSize() {
            return p.this.f().groupCount() + 1;
        }

        @Override // a00.d, java.util.List
        public final /* bridge */ int indexOf(Object obj) {
            if (obj instanceof String) {
                return f((String) obj);
            }
            return -1;
        }

        @Override // a00.d, java.util.List
        public final /* bridge */ int lastIndexOf(Object obj) {
            if (obj instanceof String) {
                return g((String) obj);
            }
            return -1;
        }

        public /* bridge */ boolean contains(String str) {
            return super.contains((Object) str);
        }
    }

    public p(@m80.k Matcher matcher, @m80.k CharSequence input) {
        kotlin.jvm.internal.g0.p(matcher, "matcher");
        kotlin.jvm.internal.g0.p(input, "input");
        this.f91684a = matcher;
        this.f91685b = input;
        this.f91686c = new b();
    }

    @Override // u30.o
    @m80.k
    public /* bridge */ o.b a() {
        return o.a.a(this);
    }

    @Override // u30.o
    @m80.k
    public List<String> b() {
        if (this.f91687d == null) {
            this.f91687d = new a();
        }
        List<String> list = this.f91687d;
        kotlin.jvm.internal.g0.m(list);
        return list;
    }

    @Override // u30.o
    @m80.k
    public m c() {
        return this.f91686c;
    }

    @Override // u30.o
    @m80.k
    public g10.l d() {
        g10.l i11;
        i11 = s.i(f());
        return i11;
    }

    public final MatchResult f() {
        return this.f91684a;
    }

    @Override // u30.o
    @m80.k
    public String getValue() {
        String group = f().group();
        kotlin.jvm.internal.g0.o(group, "group(...)");
        return group;
    }

    @Override // u30.o
    @m80.l
    public o next() {
        o f11;
        int end = f().end() + (f().end() == f().start() ? 1 : 0);
        if (end > this.f91685b.length()) {
            return null;
        }
        Matcher matcher = this.f91684a.pattern().matcher(this.f91685b);
        kotlin.jvm.internal.g0.o(matcher, "matcher(...)");
        f11 = s.f(matcher, end, this.f91685b);
        return f11;
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class b extends a00.b<l> implements n {
        public b() {
        }

        public static final l g(b bVar, int i11) {
            return bVar.get(i11);
        }

        @Override // a00.b, java.util.Collection
        public final /* bridge */ boolean contains(Object obj) {
            if (obj == null ? true : obj instanceof l) {
                return f((l) obj);
            }
            return false;
        }

        public /* bridge */ boolean f(l lVar) {
            return super.contains(lVar);
        }

        @Override // u30.m
        public l get(int i11) {
            g10.l j11;
            j11 = s.j(p.this.f(), i11);
            if (j11.getStart().intValue() < 0) {
                return null;
            }
            String group = p.this.f().group(i11);
            kotlin.jvm.internal.g0.o(group, "group(...)");
            return new l(group, j11);
        }

        @Override // a00.b
        public int getSize() {
            return p.this.f().groupCount() + 1;
        }

        @Override // a00.b, java.util.Collection
        public boolean isEmpty() {
            return false;
        }

        @Override // a00.b, java.util.Collection, java.lang.Iterable
        public Iterator<l> iterator() {
            return q30.k0.N1(a00.r0.E1(a00.h0.K(this)), new x00.l() { // from class: u30.q
                @Override // x00.l
                public final Object invoke(Object obj) {
                    l g11;
                    g11 = p.b.g(p.b.this, ((Integer) obj).intValue());
                    return g11;
                }
            }).iterator();
        }

        @Override // u30.n
        public l get(String name) {
            kotlin.jvm.internal.g0.p(name, "name");
            return o00.n.f75505a.c(p.this.f(), name);
        }
    }
}
