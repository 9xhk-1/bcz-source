package u30;

import java.util.List;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public interface o {

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a {
        @m80.k
        public static b a(@m80.k o oVar) {
            return new b(oVar);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        @m80.k
        public final o f91683a;

        public b(@m80.k o match) {
            kotlin.jvm.internal.g0.p(match, "match");
            this.f91683a = match;
        }

        @o00.f
        public final String a() {
            return k().b().get(1);
        }

        @o00.f
        public final String b() {
            return k().b().get(10);
        }

        @o00.f
        public final String c() {
            return k().b().get(2);
        }

        @o00.f
        public final String d() {
            return k().b().get(3);
        }

        @o00.f
        public final String e() {
            return k().b().get(4);
        }

        @o00.f
        public final String f() {
            return k().b().get(5);
        }

        @o00.f
        public final String g() {
            return k().b().get(6);
        }

        @o00.f
        public final String h() {
            return k().b().get(7);
        }

        @o00.f
        public final String i() {
            return k().b().get(8);
        }

        @o00.f
        public final String j() {
            return k().b().get(9);
        }

        @m80.k
        public final o k() {
            return this.f91683a;
        }

        @m80.k
        public final List<String> l() {
            return this.f91683a.b().subList(1, this.f91683a.b().size());
        }
    }

    @m80.k
    b a();

    @m80.k
    List<String> b();

    @m80.k
    m c();

    @m80.k
    g10.l d();

    @m80.k
    String getValue();

    @m80.l
    o next();
}
