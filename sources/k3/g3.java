package k3;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public abstract class g3 {

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a extends g3 {

        /* renamed from: a, reason: collision with root package name */
        public final int f65324a;

        public a() {
            this(0, 1, null);
        }

        public static /* synthetic */ a c(a aVar, int i11, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                i11 = aVar.f65324a;
            }
            return aVar.b(i11);
        }

        public final int a() {
            return this.f65324a;
        }

        @m80.k
        public final a b(int i11) {
            return new a(i11);
        }

        public boolean equals(@m80.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && this.f65324a == ((a) obj).f65324a;
        }

        public int hashCode() {
            return Integer.hashCode(this.f65324a);
        }

        @m80.k
        public String toString() {
            return "Disable(int=" + this.f65324a + ')';
        }

        public a(int i11) {
            super(null);
            this.f65324a = i11;
        }

        public /* synthetic */ a(int i11, int i12, kotlin.jvm.internal.v vVar) {
            this((i12 & 1) != 0 ? 1 : i11);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class b extends g3 {

        /* renamed from: a, reason: collision with root package name */
        @m80.k
        public final a2 f65325a;

        /* renamed from: b, reason: collision with root package name */
        @m80.k
        public final String f65326b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(@m80.k a2 status, @m80.k String url) {
            super(null);
            kotlin.jvm.internal.g0.p(status, "status");
            kotlin.jvm.internal.g0.p(url, "url");
            this.f65325a = status;
            this.f65326b = url;
        }

        public static /* synthetic */ b d(b bVar, a2 a2Var, String str, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                a2Var = bVar.f65325a;
            }
            if ((i11 & 2) != 0) {
                str = bVar.f65326b;
            }
            return bVar.c(a2Var, str);
        }

        @m80.k
        public final a2 a() {
            return this.f65325a;
        }

        @m80.k
        public final String b() {
            return this.f65326b;
        }

        @m80.k
        public final b c(@m80.k a2 status, @m80.k String url) {
            kotlin.jvm.internal.g0.p(status, "status");
            kotlin.jvm.internal.g0.p(url, "url");
            return new b(status, url);
        }

        @m80.k
        public final a2 e() {
            return this.f65325a;
        }

        public boolean equals(@m80.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return kotlin.jvm.internal.g0.g(this.f65325a, bVar.f65325a) && kotlin.jvm.internal.g0.g(this.f65326b, bVar.f65326b);
        }

        @m80.k
        public final String f() {
            return this.f65326b;
        }

        public int hashCode() {
            return (this.f65325a.hashCode() * 31) + this.f65326b.hashCode();
        }

        @m80.k
        public String toString() {
            return "Task(status=" + this.f65325a + ", url=" + this.f65326b + ')';
        }
    }

    public /* synthetic */ g3(kotlin.jvm.internal.v vVar) {
        this();
    }

    public g3() {
    }
}
