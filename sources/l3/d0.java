package l3;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public abstract class d0 {

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a extends d0 {

        /* renamed from: a, reason: collision with root package name */
        @m80.k
        public final String f69296a;

        /* renamed from: b, reason: collision with root package name */
        @m80.k
        public final String f69297b;

        /* renamed from: c, reason: collision with root package name */
        @m80.k
        public final String f69298c;

        /* renamed from: d, reason: collision with root package name */
        @m80.k
        public final g2 f69299d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(@m80.k String aId, @m80.k String img, @m80.k String link, @m80.k g2 closed) {
            super(null);
            kotlin.jvm.internal.g0.p(aId, "aId");
            kotlin.jvm.internal.g0.p(img, "img");
            kotlin.jvm.internal.g0.p(link, "link");
            kotlin.jvm.internal.g0.p(closed, "closed");
            this.f69296a = aId;
            this.f69297b = img;
            this.f69298c = link;
            this.f69299d = closed;
        }

        public static /* synthetic */ a f(a aVar, String str, String str2, String str3, g2 g2Var, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = aVar.f69296a;
            }
            if ((i11 & 2) != 0) {
                str2 = aVar.f69297b;
            }
            if ((i11 & 4) != 0) {
                str3 = aVar.f69298c;
            }
            if ((i11 & 8) != 0) {
                g2Var = aVar.f69299d;
            }
            return aVar.e(str, str2, str3, g2Var);
        }

        @m80.k
        public final String a() {
            return this.f69296a;
        }

        @m80.k
        public final String b() {
            return this.f69297b;
        }

        @m80.k
        public final String c() {
            return this.f69298c;
        }

        @m80.k
        public final g2 d() {
            return this.f69299d;
        }

        @m80.k
        public final a e(@m80.k String aId, @m80.k String img, @m80.k String link, @m80.k g2 closed) {
            kotlin.jvm.internal.g0.p(aId, "aId");
            kotlin.jvm.internal.g0.p(img, "img");
            kotlin.jvm.internal.g0.p(link, "link");
            kotlin.jvm.internal.g0.p(closed, "closed");
            return new a(aId, img, link, closed);
        }

        public boolean equals(@m80.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return kotlin.jvm.internal.g0.g(this.f69296a, aVar.f69296a) && kotlin.jvm.internal.g0.g(this.f69297b, aVar.f69297b) && kotlin.jvm.internal.g0.g(this.f69298c, aVar.f69298c) && kotlin.jvm.internal.g0.g(this.f69299d, aVar.f69299d);
        }

        @m80.k
        public final String g() {
            return this.f69296a;
        }

        @m80.k
        public final g2 h() {
            return this.f69299d;
        }

        public int hashCode() {
            return (((((this.f69296a.hashCode() * 31) + this.f69297b.hashCode()) * 31) + this.f69298c.hashCode()) * 31) + this.f69299d.hashCode();
        }

        @m80.k
        public final String i() {
            return this.f69297b;
        }

        @m80.k
        public final String j() {
            return this.f69298c;
        }

        @m80.k
        public String toString() {
            return "AdContent(aId=" + this.f69296a + ", img=" + this.f69297b + ", link=" + this.f69298c + ", closed=" + this.f69299d + ')';
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class b extends d0 {

        /* renamed from: a, reason: collision with root package name */
        public final int f69300a;

        public b() {
            this(0, 1, null);
        }

        public static /* synthetic */ b c(b bVar, int i11, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                i11 = bVar.f69300a;
            }
            return bVar.b(i11);
        }

        public final int a() {
            return this.f69300a;
        }

        @m80.k
        public final b b(int i11) {
            return new b(i11);
        }

        public boolean equals(@m80.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && this.f69300a == ((b) obj).f69300a;
        }

        public int hashCode() {
            return Integer.hashCode(this.f69300a);
        }

        @m80.k
        public String toString() {
            return "None(none=" + this.f69300a + ')';
        }

        public b(int i11) {
            super(null);
            this.f69300a = i11;
        }

        public /* synthetic */ b(int i11, int i12, kotlin.jvm.internal.v vVar) {
            this((i12 & 1) != 0 ? 1 : i11);
        }
    }

    public /* synthetic */ d0(kotlin.jvm.internal.v vVar) {
        this();
    }

    public d0() {
    }
}
