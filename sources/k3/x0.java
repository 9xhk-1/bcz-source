package k3;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public abstract class x0 {

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a extends x0 {

        /* renamed from: a, reason: collision with root package name */
        public final int f65695a;

        /* renamed from: b, reason: collision with root package name */
        @m80.k
        public final String f65696b;

        /* renamed from: c, reason: collision with root package name */
        @m80.k
        public final y1 f65697c;

        /* renamed from: d, reason: collision with root package name */
        @m80.k
        public final String f65698d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(int i11, @m80.k String icon, @m80.k y1 navType, @m80.k String intent) {
            super(null);
            kotlin.jvm.internal.g0.p(icon, "icon");
            kotlin.jvm.internal.g0.p(navType, "navType");
            kotlin.jvm.internal.g0.p(intent, "intent");
            this.f65695a = i11;
            this.f65696b = icon;
            this.f65697c = navType;
            this.f65698d = intent;
        }

        public static /* synthetic */ a f(a aVar, int i11, String str, y1 y1Var, String str2, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                i11 = aVar.f65695a;
            }
            if ((i12 & 2) != 0) {
                str = aVar.f65696b;
            }
            if ((i12 & 4) != 0) {
                y1Var = aVar.f65697c;
            }
            if ((i12 & 8) != 0) {
                str2 = aVar.f65698d;
            }
            return aVar.e(i11, str, y1Var, str2);
        }

        public final int a() {
            return this.f65695a;
        }

        @m80.k
        public final String b() {
            return this.f65696b;
        }

        @m80.k
        public final y1 c() {
            return this.f65697c;
        }

        @m80.k
        public final String d() {
            return this.f65698d;
        }

        @m80.k
        public final a e(int i11, @m80.k String icon, @m80.k y1 navType, @m80.k String intent) {
            kotlin.jvm.internal.g0.p(icon, "icon");
            kotlin.jvm.internal.g0.p(navType, "navType");
            kotlin.jvm.internal.g0.p(intent, "intent");
            return new a(i11, icon, navType, intent);
        }

        public boolean equals(@m80.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.f65695a == aVar.f65695a && kotlin.jvm.internal.g0.g(this.f65696b, aVar.f65696b) && kotlin.jvm.internal.g0.g(this.f65697c, aVar.f65697c) && kotlin.jvm.internal.g0.g(this.f65698d, aVar.f65698d);
        }

        public final int g() {
            return this.f65695a;
        }

        @m80.k
        public final String h() {
            return this.f65696b;
        }

        public int hashCode() {
            return (((((Integer.hashCode(this.f65695a) * 31) + this.f65696b.hashCode()) * 31) + this.f65697c.hashCode()) * 31) + this.f65698d.hashCode();
        }

        @m80.k
        public final String i() {
            return this.f65698d;
        }

        @m80.k
        public final y1 j() {
            return this.f65697c;
        }

        @m80.k
        public String toString() {
            return "GoldenBanner(aid=" + this.f65695a + ", icon=" + this.f65696b + ", navType=" + this.f65697c + ", intent=" + this.f65698d + ')';
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class b extends x0 {

        /* renamed from: a, reason: collision with root package name */
        public final int f65699a;

        /* renamed from: b, reason: collision with root package name */
        @m80.k
        public final String f65700b;

        /* renamed from: c, reason: collision with root package name */
        @m80.k
        public final String f65701c;

        /* renamed from: d, reason: collision with root package name */
        @m80.k
        public final y1 f65702d;

        /* renamed from: e, reason: collision with root package name */
        @m80.k
        public final String f65703e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(int i11, @m80.k String icon, @m80.k String title, @m80.k y1 navType, @m80.k String intent) {
            super(null);
            kotlin.jvm.internal.g0.p(icon, "icon");
            kotlin.jvm.internal.g0.p(title, "title");
            kotlin.jvm.internal.g0.p(navType, "navType");
            kotlin.jvm.internal.g0.p(intent, "intent");
            this.f65699a = i11;
            this.f65700b = icon;
            this.f65701c = title;
            this.f65702d = navType;
            this.f65703e = intent;
        }

        public static /* synthetic */ b g(b bVar, int i11, String str, String str2, y1 y1Var, String str3, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                i11 = bVar.f65699a;
            }
            if ((i12 & 2) != 0) {
                str = bVar.f65700b;
            }
            if ((i12 & 4) != 0) {
                str2 = bVar.f65701c;
            }
            if ((i12 & 8) != 0) {
                y1Var = bVar.f65702d;
            }
            if ((i12 & 16) != 0) {
                str3 = bVar.f65703e;
            }
            String str4 = str3;
            String str5 = str2;
            return bVar.f(i11, str, str5, y1Var, str4);
        }

        public final int a() {
            return this.f65699a;
        }

        @m80.k
        public final String b() {
            return this.f65700b;
        }

        @m80.k
        public final String c() {
            return this.f65701c;
        }

        @m80.k
        public final y1 d() {
            return this.f65702d;
        }

        @m80.k
        public final String e() {
            return this.f65703e;
        }

        public boolean equals(@m80.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.f65699a == bVar.f65699a && kotlin.jvm.internal.g0.g(this.f65700b, bVar.f65700b) && kotlin.jvm.internal.g0.g(this.f65701c, bVar.f65701c) && kotlin.jvm.internal.g0.g(this.f65702d, bVar.f65702d) && kotlin.jvm.internal.g0.g(this.f65703e, bVar.f65703e);
        }

        @m80.k
        public final b f(int i11, @m80.k String icon, @m80.k String title, @m80.k y1 navType, @m80.k String intent) {
            kotlin.jvm.internal.g0.p(icon, "icon");
            kotlin.jvm.internal.g0.p(title, "title");
            kotlin.jvm.internal.g0.p(navType, "navType");
            kotlin.jvm.internal.g0.p(intent, "intent");
            return new b(i11, icon, title, navType, intent);
        }

        public final int h() {
            return this.f65699a;
        }

        public int hashCode() {
            return (((((((Integer.hashCode(this.f65699a) * 31) + this.f65700b.hashCode()) * 31) + this.f65701c.hashCode()) * 31) + this.f65702d.hashCode()) * 31) + this.f65703e.hashCode();
        }

        @m80.k
        public final String i() {
            return this.f65700b;
        }

        @m80.k
        public final String j() {
            return this.f65703e;
        }

        @m80.k
        public final y1 k() {
            return this.f65702d;
        }

        @m80.k
        public final String l() {
            return this.f65701c;
        }

        @m80.k
        public String toString() {
            return "GoldenItemSimple(aid=" + this.f65699a + ", icon=" + this.f65700b + ", title=" + this.f65701c + ", navType=" + this.f65702d + ", intent=" + this.f65703e + ')';
        }
    }

    public /* synthetic */ x0(kotlin.jvm.internal.v vVar) {
        this();
    }

    public x0() {
    }
}
