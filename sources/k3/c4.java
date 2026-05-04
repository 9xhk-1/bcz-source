package k3;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public abstract class c4 {

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a extends c4 {

        /* renamed from: a, reason: collision with root package name */
        public final int f65257a;

        public a() {
            this(0, 1, null);
        }

        private final int a() {
            return this.f65257a;
        }

        public static /* synthetic */ a c(a aVar, int i11, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                i11 = aVar.f65257a;
            }
            return aVar.b(i11);
        }

        @m80.k
        public final a b(int i11) {
            return new a(i11);
        }

        public boolean equals(@m80.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && this.f65257a == ((a) obj).f65257a;
        }

        public int hashCode() {
            return Integer.hashCode(this.f65257a);
        }

        @m80.k
        public String toString() {
            return "Disable(int=" + this.f65257a + ')';
        }

        public a(int i11) {
            super(null);
            this.f65257a = i11;
        }

        public /* synthetic */ a(int i11, int i12, kotlin.jvm.internal.v vVar) {
            this((i12 & 1) != 0 ? 1 : i11);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class b extends c4 {

        /* renamed from: a, reason: collision with root package name */
        public final int f65258a;

        /* renamed from: b, reason: collision with root package name */
        @m80.k
        public final d4 f65259b;

        /* renamed from: c, reason: collision with root package name */
        @m80.k
        public final String f65260c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(int i11, @m80.k d4 status, @m80.k String url) {
            super(null);
            kotlin.jvm.internal.g0.p(status, "status");
            kotlin.jvm.internal.g0.p(url, "url");
            this.f65258a = i11;
            this.f65259b = status;
            this.f65260c = url;
        }

        public static /* synthetic */ b e(b bVar, int i11, d4 d4Var, String str, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                i11 = bVar.f65258a;
            }
            if ((i12 & 2) != 0) {
                d4Var = bVar.f65259b;
            }
            if ((i12 & 4) != 0) {
                str = bVar.f65260c;
            }
            return bVar.d(i11, d4Var, str);
        }

        public final int a() {
            return this.f65258a;
        }

        @m80.k
        public final d4 b() {
            return this.f65259b;
        }

        @m80.k
        public final String c() {
            return this.f65260c;
        }

        @m80.k
        public final b d(int i11, @m80.k d4 status, @m80.k String url) {
            kotlin.jvm.internal.g0.p(status, "status");
            kotlin.jvm.internal.g0.p(url, "url");
            return new b(i11, status, url);
        }

        public boolean equals(@m80.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.f65258a == bVar.f65258a && kotlin.jvm.internal.g0.g(this.f65259b, bVar.f65259b) && kotlin.jvm.internal.g0.g(this.f65260c, bVar.f65260c);
        }

        public final int f() {
            return this.f65258a;
        }

        @m80.k
        public final d4 g() {
            return this.f65259b;
        }

        @m80.k
        public final String h() {
            return this.f65260c;
        }

        public int hashCode() {
            return (((Integer.hashCode(this.f65258a) * 31) + this.f65259b.hashCode()) * 31) + this.f65260c.hashCode();
        }

        @m80.k
        public String toString() {
            return "WinningStreak(days=" + this.f65258a + ", status=" + this.f65259b + ", url=" + this.f65260c + ')';
        }
    }

    public /* synthetic */ c4(kotlin.jvm.internal.v vVar) {
        this();
    }

    public c4() {
    }
}
