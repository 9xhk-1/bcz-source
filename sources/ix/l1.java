package ix;

import java.util.List;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class l1 extends o0 {

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        @m80.k
        public static final a f62923a = new a();

        /* renamed from: b, reason: collision with root package name */
        @m80.k
        public static final String f62924b = "rel";

        /* renamed from: c, reason: collision with root package name */
        @m80.k
        public static final String f62925c = "anchor";

        /* renamed from: d, reason: collision with root package name */
        @m80.k
        public static final String f62926d = "Rev";

        /* renamed from: e, reason: collision with root package name */
        @m80.k
        public static final String f62927e = "hreflang";

        /* renamed from: f, reason: collision with root package name */
        @m80.k
        public static final String f62928f = "media";

        /* renamed from: g, reason: collision with root package name */
        @m80.k
        public static final String f62929g = "title";

        /* renamed from: h, reason: collision with root package name */
        @m80.k
        public static final String f62930h = "type";
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        @m80.k
        public static final b f62931a = new b();

        /* renamed from: b, reason: collision with root package name */
        @m80.k
        public static final String f62932b = "stylesheet";

        /* renamed from: c, reason: collision with root package name */
        @m80.k
        public static final String f62933c = "prefetch";

        /* renamed from: d, reason: collision with root package name */
        @m80.k
        public static final String f62934d = "dns-prefetch";

        /* renamed from: e, reason: collision with root package name */
        @m80.k
        public static final String f62935e = "preconnect";

        /* renamed from: f, reason: collision with root package name */
        @m80.k
        public static final String f62936f = "preload";

        /* renamed from: g, reason: collision with root package name */
        @m80.k
        public static final String f62937g = "prerender";

        /* renamed from: h, reason: collision with root package name */
        @m80.k
        public static final String f62938h = "next";
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l1(@m80.k String uri, @m80.k List<n0> params) {
        super(u30.u0.f91709e + uri + u30.u0.f91710f, params);
        kotlin.jvm.internal.g0.p(uri, "uri");
        kotlin.jvm.internal.g0.p(params, "params");
    }

    @m80.k
    public final String d() {
        return u30.k0.D4(u30.k0.x4(a(), "<"), ">");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public l1(@m80.k String uri, @m80.k String rel) {
        this(uri, (List<n0>) a00.g0.l(new n0(a.f62924b, rel)));
        kotlin.jvm.internal.g0.p(uri, "uri");
        kotlin.jvm.internal.g0.p(rel, "rel");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public l1(@m80.k String uri, @m80.k String... rel) {
        this(uri, (List<n0>) a00.g0.l(new n0(a.f62924b, a00.a0.Eh(rel, " ", null, null, 0, null, null, 62, null))));
        kotlin.jvm.internal.g0.p(uri, "uri");
        kotlin.jvm.internal.g0.p(rel, "rel");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public l1(@m80.k String uri, @m80.k List<String> rel, @m80.k k type) {
        this(uri, (List<n0>) a00.h0.Q(new n0(a.f62924b, a00.r0.r3(rel, " ", null, null, 0, null, null, 62, null)), new n0("type", type.toString())));
        kotlin.jvm.internal.g0.p(uri, "uri");
        kotlin.jvm.internal.g0.p(rel, "rel");
        kotlin.jvm.internal.g0.p(type, "type");
    }
}
