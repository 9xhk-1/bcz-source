package k3;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public abstract class g2 {

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a extends g2 {

        /* renamed from: a, reason: collision with root package name */
        public final int f65321a;

        public a() {
            this(0, 1, null);
        }

        public static /* synthetic */ a c(a aVar, int i11, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                i11 = aVar.f65321a;
            }
            return aVar.b(i11);
        }

        public final int a() {
            return this.f65321a;
        }

        @m80.k
        public final a b(int i11) {
            return new a(i11);
        }

        public boolean equals(@m80.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && this.f65321a == ((a) obj).f65321a;
        }

        public int hashCode() {
            return Integer.hashCode(this.f65321a);
        }

        @m80.k
        public String toString() {
            return "Disable(int=" + this.f65321a + ')';
        }

        public a(int i11) {
            super(null);
            this.f65321a = i11;
        }

        public /* synthetic */ a(int i11, int i12, kotlin.jvm.internal.v vVar) {
            this((i12 & 1) != 0 ? 1 : i11);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class b extends g2 {

        /* renamed from: a, reason: collision with root package name */
        @m80.k
        public final a2 f65322a;

        /* renamed from: b, reason: collision with root package name */
        @m80.k
        public final String f65323b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(@m80.k a2 status, @m80.k String url) {
            super(null);
            kotlin.jvm.internal.g0.p(status, "status");
            kotlin.jvm.internal.g0.p(url, "url");
            this.f65322a = status;
            this.f65323b = url;
        }

        public static /* synthetic */ b d(b bVar, a2 a2Var, String str, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                a2Var = bVar.f65322a;
            }
            if ((i11 & 2) != 0) {
                str = bVar.f65323b;
            }
            return bVar.c(a2Var, str);
        }

        @m80.k
        public final a2 a() {
            return this.f65322a;
        }

        @m80.k
        public final String b() {
            return this.f65323b;
        }

        @m80.k
        public final b c(@m80.k a2 status, @m80.k String url) {
            kotlin.jvm.internal.g0.p(status, "status");
            kotlin.jvm.internal.g0.p(url, "url");
            return new b(status, url);
        }

        @m80.k
        public final a2 e() {
            return this.f65322a;
        }

        public boolean equals(@m80.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return kotlin.jvm.internal.g0.g(this.f65322a, bVar.f65322a) && kotlin.jvm.internal.g0.g(this.f65323b, bVar.f65323b);
        }

        @m80.k
        public final String f() {
            return this.f65323b;
        }

        public int hashCode() {
            return (this.f65322a.hashCode() * 31) + this.f65323b.hashCode();
        }

        @m80.k
        public String toString() {
            return "Ranking(status=" + this.f65322a + ", url=" + this.f65323b + ')';
        }
    }

    public /* synthetic */ g2(kotlin.jvm.internal.v vVar) {
        this();
    }

    public g2() {
    }
}
