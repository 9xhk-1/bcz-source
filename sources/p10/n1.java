package p10;

import java.util.Map;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class n1 {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public static final n1 f78574a = new n1();

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public static final Map<o1, Integer> f78575b;

    /* renamed from: c, reason: collision with root package name */
    @m80.k
    public static final h f78576c;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a extends o1 {

        /* renamed from: c, reason: collision with root package name */
        @m80.k
        public static final a f78577c = new a();

        public a() {
            super("inherited", false);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class b extends o1 {

        /* renamed from: c, reason: collision with root package name */
        @m80.k
        public static final b f78578c = new b();

        public b() {
            super("internal", false);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class c extends o1 {

        /* renamed from: c, reason: collision with root package name */
        @m80.k
        public static final c f78579c = new c();

        public c() {
            super("invisible_fake", false);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class d extends o1 {

        /* renamed from: c, reason: collision with root package name */
        @m80.k
        public static final d f78580c = new d();

        public d() {
            super("local", false);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class e extends o1 {

        /* renamed from: c, reason: collision with root package name */
        @m80.k
        public static final e f78581c = new e();

        public e() {
            super("private", false);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class f extends o1 {

        /* renamed from: c, reason: collision with root package name */
        @m80.k
        public static final f f78582c = new f();

        public f() {
            super("private_to_this", false);
        }

        @Override // p10.o1
        @m80.k
        public String b() {
            return "private/*private to this*/";
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class g extends o1 {

        /* renamed from: c, reason: collision with root package name */
        @m80.k
        public static final g f78583c = new g();

        public g() {
            super("protected", true);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class h extends o1 {

        /* renamed from: c, reason: collision with root package name */
        @m80.k
        public static final h f78584c = new h();

        public h() {
            super(fx.d.f52403j, true);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class i extends o1 {

        /* renamed from: c, reason: collision with root package name */
        @m80.k
        public static final i f78585c = new i();

        public i() {
            super("unknown", false);
        }
    }

    static {
        Map g11 = a00.k1.g();
        g11.put(f.f78582c, 0);
        g11.put(e.f78581c, 0);
        g11.put(b.f78578c, 1);
        g11.put(g.f78583c, 1);
        h hVar = h.f78584c;
        g11.put(hVar, 2);
        f78575b = a00.k1.d(g11);
        f78576c = hVar;
    }

    @m80.l
    public final Integer a(@m80.k o1 first, @m80.k o1 second) {
        kotlin.jvm.internal.g0.p(first, "first");
        kotlin.jvm.internal.g0.p(second, "second");
        if (first == second) {
            return 0;
        }
        Map<o1, Integer> map = f78575b;
        Integer num = map.get(first);
        Integer num2 = map.get(second);
        if (num == null || num2 == null || kotlin.jvm.internal.g0.g(num, num2)) {
            return null;
        }
        return Integer.valueOf(num.intValue() - num2.intValue());
    }

    public final boolean b(@m80.k o1 visibility) {
        kotlin.jvm.internal.g0.p(visibility, "visibility");
        return visibility == e.f78581c || visibility == f.f78582c;
    }
}
