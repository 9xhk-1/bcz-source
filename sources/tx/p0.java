package tx;

import java.util.HashMap;
import java.util.Map;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public abstract class p0 {

    /* renamed from: e, reason: collision with root package name */
    @m80.k
    public static final b f91164e = new b(null);

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final Map<Object, Object> f91165a;

    /* renamed from: b, reason: collision with root package name */
    public byte f91166b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f91167c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f91168d;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a extends p0 {

        /* renamed from: f, reason: collision with root package name */
        public int f91169f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(@m80.k Map<Object, Object> customOptions) {
            super(customOptions, null);
            kotlin.jvm.internal.g0.p(customOptions, "customOptions");
            this.f91169f = 511;
        }

        @Override // tx.p0
        @m80.k
        /* renamed from: l, reason: merged with bridge method [inline-methods] */
        public a b() {
            a aVar = new a(new HashMap(d()));
            aVar.c(this);
            return aVar;
        }

        public final int m() {
            return this.f91169f;
        }

        public final void n(int i11) {
            this.f91169f = i11;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class b {
        public /* synthetic */ b(kotlin.jvm.internal.v vVar) {
            this();
        }

        @m80.k
        public final p0 a() {
            return new c(new HashMap());
        }

        public b() {
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class c extends p0 {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(@m80.k Map<Object, Object> customOptions) {
            super(customOptions, null);
            kotlin.jvm.internal.g0.p(customOptions, "customOptions");
        }

        @Override // tx.p0
        @m80.k
        /* renamed from: l, reason: merged with bridge method [inline-methods] */
        public c b() {
            c cVar = new c(new HashMap(d()));
            cVar.c(this);
            return cVar;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class d extends p0 {

        /* renamed from: f, reason: collision with root package name */
        public int f91170f;

        /* renamed from: g, reason: collision with root package name */
        public int f91171g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(@m80.k Map<Object, Object> customOptions) {
            super(customOptions, null);
            kotlin.jvm.internal.g0.p(customOptions, "customOptions");
            this.f91170f = -1;
            this.f91171g = -1;
        }

        @Override // tx.p0
        public void c(@m80.k p0 from) {
            kotlin.jvm.internal.g0.p(from, "from");
            super.c(from);
            if (from instanceof d) {
                d dVar = (d) from;
                this.f91170f = dVar.f91170f;
                this.f91171g = dVar.f91171g;
            }
        }

        @Override // tx.p0
        @m80.k
        /* renamed from: l, reason: merged with bridge method [inline-methods] */
        public d b() {
            d dVar = new d(new HashMap(d()));
            dVar.c(this);
            return dVar;
        }

        public final int m() {
            return this.f91171g;
        }

        public final int n() {
            return this.f91170f;
        }

        public final void o(int i11) {
            this.f91171g = i11;
        }

        public final void p(int i11) {
            this.f91170f = i11;
        }

        @m80.k
        public final e q() {
            e eVar = new e(new HashMap(d()));
            c(this);
            return eVar;
        }

        @m80.k
        public final f r() {
            f fVar = new f(new HashMap(d()));
            c(this);
            return fVar;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class e extends d {

        /* renamed from: h, reason: collision with root package name */
        public boolean f91172h;

        /* renamed from: i, reason: collision with root package name */
        public int f91173i;

        /* renamed from: j, reason: collision with root package name */
        @m80.l
        public Boolean f91174j;

        /* renamed from: k, reason: collision with root package name */
        public long f91175k;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(@m80.k Map<Object, Object> customOptions) {
            super(customOptions);
            kotlin.jvm.internal.g0.p(customOptions, "customOptions");
            this.f91172h = true;
            this.f91173i = -1;
            this.f91175k = Long.MAX_VALUE;
        }

        public final void A(long j11) {
            this.f91175k = j11;
        }

        @Override // tx.p0.d, tx.p0
        public void c(@m80.k p0 from) {
            kotlin.jvm.internal.g0.p(from, "from");
            super.c(from);
            if (from instanceof e) {
                e eVar = (e) from;
                this.f91172h = eVar.f91172h;
                this.f91173i = eVar.f91173i;
                this.f91174j = eVar.f91174j;
            }
        }

        @Override // tx.p0.d
        @m80.k
        /* renamed from: s, reason: merged with bridge method [inline-methods] */
        public e b() {
            e eVar = new e(new HashMap(d()));
            eVar.c(this);
            return eVar;
        }

        @m80.l
        public final Boolean t() {
            return this.f91174j;
        }

        public final int u() {
            return this.f91173i;
        }

        public final boolean v() {
            return this.f91172h;
        }

        public final long w() {
            return this.f91175k;
        }

        public final void x(@m80.l Boolean bool) {
            this.f91174j = bool;
        }

        public final void y(int i11) {
            this.f91173i = i11;
        }

        public final void z(boolean z11) {
            this.f91172h = z11;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class f extends d {

        /* renamed from: h, reason: collision with root package name */
        public boolean f91176h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(@m80.k Map<Object, Object> customOptions) {
            super(customOptions);
            kotlin.jvm.internal.g0.p(customOptions, "customOptions");
        }

        @Override // tx.p0.d, tx.p0
        public void c(@m80.k p0 from) {
            kotlin.jvm.internal.g0.p(from, "from");
            super.c(from);
            if (from instanceof f) {
                this.f91176h = ((f) from).f91176h;
            }
        }

        @Override // tx.p0.d
        @m80.k
        /* renamed from: s, reason: merged with bridge method [inline-methods] */
        public f b() {
            f fVar = new f(new HashMap(d()));
            fVar.c(this);
            return fVar;
        }

        public final boolean t() {
            return this.f91176h;
        }

        public final void u(boolean z11) {
            this.f91176h = z11;
        }
    }

    public /* synthetic */ p0(Map map, kotlin.jvm.internal.v vVar) {
        this(map);
    }

    @m80.k
    public final a a() {
        a aVar = new a(new HashMap(this.f91165a));
        aVar.c(this);
        return aVar;
    }

    @m80.k
    public abstract p0 b();

    public void c(@m80.k p0 from) {
        kotlin.jvm.internal.g0.p(from, "from");
        this.f91166b = from.f91166b;
        this.f91167c = from.f91167c;
        this.f91168d = from.f91168d;
    }

    @m80.k
    public final Map<Object, Object> d() {
        return this.f91165a;
    }

    public final boolean e() {
        return this.f91167c;
    }

    public final boolean f() {
        return this.f91168d;
    }

    public final byte g() {
        return this.f91166b;
    }

    @m80.k
    public final d h() {
        d dVar = new d(new HashMap(this.f91165a));
        c(this);
        return dVar;
    }

    public final void i(boolean z11) {
        this.f91167c = z11;
    }

    public final void j(boolean z11) {
        this.f91168d = z11;
    }

    public final void k(byte b11) {
        this.f91166b = b11;
    }

    public p0(Map<Object, Object> map) {
        this.f91165a = map;
        this.f91166b = a1.f91061b.e();
    }
}
