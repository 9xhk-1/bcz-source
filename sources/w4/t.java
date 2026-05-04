package w4;

import a00.l1;
import java.util.Map;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.o0;
import l3.o;
import yz.h1;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public final class t {

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public static final a f95174b = new a(null);

    /* renamed from: c, reason: collision with root package name */
    @m80.k
    public static final Map<h10.d<? extends l3.o>, Integer> f95175c = l1.W(h1.a(o0.d(o.v.class), 100), h1.a(o0.d(o.z.class), 200), h1.a(o0.d(o.y.class), 201), h1.a(o0.d(o.s.class), 200), h1.a(o0.d(o.u.class), 300), h1.a(o0.d(o.q.class), Integer.valueOf(tt.a.f90880d)), h1.a(o0.d(o.c.class), 400), h1.a(o0.d(o.f.class), 500));

    /* renamed from: d, reason: collision with root package name */
    @m80.k
    public static final Map<h10.d<? extends l3.o>, Integer> f95176d = l1.W(h1.a(o0.d(o.n.class), 1), h1.a(o0.d(o.c.class), 99), h1.a(o0.d(o.a0.class), 100), h1.a(o0.d(o.v.class), 102), h1.a(o0.d(o.y.class), 103), h1.a(o0.d(o.z.class), 104), h1.a(o0.d(o.w.class), 106), h1.a(o0.d(o.k.class), 201), h1.a(o0.d(o.a.class), 203), h1.a(o0.d(o.d.class), 204), h1.a(o0.d(o.C0837o.class), 206), h1.a(o0.d(o.j.class), 207), h1.a(o0.d(o.h.class), 209), h1.a(o0.d(o.i.class), 210), h1.a(o0.d(o.f.class), 301), h1.a(o0.d(o.e.class), 302), h1.a(o0.d(o.x.class), 303), h1.a(o0.d(o.q.class), 304), h1.a(o0.d(o.p.class), 309), h1.a(o0.d(o.m.class), 310));

    /* renamed from: e, reason: collision with root package name */
    @m80.k
    public static final Map<h10.d<? extends l3.o>, Integer> f95177e = l1.W(h1.a(o0.d(o.c.class), 100), h1.a(o0.d(o.v.class), 101), h1.a(o0.d(o.t.class), 102), h1.a(o0.d(o.s.class), 103), h1.a(o0.d(o.w.class), 106), h1.a(o0.d(o.q.class), 150), h1.a(o0.d(o.C0837o.class), 206), h1.a(o0.d(o.g.class), 206), h1.a(o0.d(o.j.class), 207), h1.a(o0.d(o.h.class), 210), h1.a(o0.d(o.f.class), 301), h1.a(o0.d(o.x.class), 302), h1.a(o0.d(o.q.class), 303), h1.a(o0.d(o.p.class), 309), h1.a(o0.d(o.m.class), 310));

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final Map<h10.d<? extends l3.o>, Integer> f95178a;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.v vVar) {
            this();
        }

        @m80.k
        public final Map<h10.d<? extends l3.o>, Integer> a() {
            return t.f95175c;
        }

        @m80.k
        public final Map<h10.d<? extends l3.o>, Integer> b() {
            return t.f95177e;
        }

        @m80.k
        public final Map<h10.d<? extends l3.o>, Integer> c() {
            return t.f95176d;
        }

        public a() {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public t() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ t f(t tVar, Map map, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            map = tVar.f95178a;
        }
        return tVar.e(map);
    }

    @m80.k
    public final Map<h10.d<? extends l3.o>, Integer> d() {
        return this.f95178a;
    }

    @m80.k
    public final t e(@m80.k Map<h10.d<? extends l3.o>, Integer> priorities) {
        g0.p(priorities, "priorities");
        return new t(priorities);
    }

    public boolean equals(@m80.l Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof t) && g0.g(this.f95178a, ((t) obj).f95178a);
    }

    @m80.k
    public final Map<h10.d<? extends l3.o>, Integer> g() {
        return this.f95178a;
    }

    public final int h(@m80.k h10.d<? extends l3.o> effectClass) {
        g0.p(effectClass, "effectClass");
        Integer num = this.f95178a.get(effectClass);
        if (num != null) {
            return num.intValue();
        }
        return Integer.MAX_VALUE;
    }

    public int hashCode() {
        return this.f95178a.hashCode();
    }

    @m80.k
    public String toString() {
        return "UIEffectPriorityConfig(priorities=" + this.f95178a + ')';
    }

    public t(@m80.k Map<h10.d<? extends l3.o>, Integer> priorities) {
        g0.p(priorities, "priorities");
        this.f95178a = priorities;
    }

    public /* synthetic */ t(Map map, int i11, kotlin.jvm.internal.v vVar) {
        this((i11 & 1) != 0 ? f95175c : map);
    }
}
