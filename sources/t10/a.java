package t10;

import kotlin.jvm.internal.g0;
import m80.k;
import m80.l;
import p10.n1;
import p10.o1;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public static final a f89203a = new a();

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    /* renamed from: t10.a$a, reason: collision with other inner class name */
    public static final class C1171a extends o1 {

        /* renamed from: c, reason: collision with root package name */
        @k
        public static final C1171a f89204c = new C1171a();

        public C1171a() {
            super("package", false);
        }

        @Override // p10.o1
        @l
        public Integer a(@k o1 visibility) {
            g0.p(visibility, "visibility");
            if (this == visibility) {
                return 0;
            }
            return n1.f78574a.b(visibility) ? 1 : -1;
        }

        @Override // p10.o1
        @k
        public String b() {
            return "public/*package*/";
        }

        @Override // p10.o1
        @k
        public o1 d() {
            return n1.g.f78583c;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class b extends o1 {

        /* renamed from: c, reason: collision with root package name */
        @k
        public static final b f89205c = new b();

        public b() {
            super("protected_and_package", true);
        }

        @Override // p10.o1
        @l
        public Integer a(@k o1 visibility) {
            g0.p(visibility, "visibility");
            if (g0.g(this, visibility)) {
                return 0;
            }
            if (visibility == n1.b.f78578c) {
                return null;
            }
            return n1.f78574a.b(visibility) ? 1 : -1;
        }

        @Override // p10.o1
        @k
        public String b() {
            return "protected/*protected and package*/";
        }

        @Override // p10.o1
        @k
        public o1 d() {
            return n1.g.f78583c;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class c extends o1 {

        /* renamed from: c, reason: collision with root package name */
        @k
        public static final c f89206c = new c();

        public c() {
            super("protected_static", true);
        }

        @Override // p10.o1
        @k
        public String b() {
            return "protected/*protected static*/";
        }

        @Override // p10.o1
        @k
        public o1 d() {
            return n1.g.f78583c;
        }
    }
}
