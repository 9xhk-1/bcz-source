package k3;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public abstract class u2 {

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a extends u2 {

        /* renamed from: a, reason: collision with root package name */
        @m80.k
        public final w2 f65636a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(@m80.k w2 homeData) {
            super(null);
            kotlin.jvm.internal.g0.p(homeData, "homeData");
            this.f65636a = homeData;
        }

        public static /* synthetic */ a c(a aVar, w2 w2Var, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                w2Var = aVar.f65636a;
            }
            return aVar.b(w2Var);
        }

        @m80.k
        public final w2 a() {
            return this.f65636a;
        }

        @m80.k
        public final a b(@m80.k w2 homeData) {
            kotlin.jvm.internal.g0.p(homeData, "homeData");
            return new a(homeData);
        }

        @m80.k
        public final w2 d() {
            return this.f65636a;
        }

        public boolean equals(@m80.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && kotlin.jvm.internal.g0.g(this.f65636a, ((a) obj).f65636a);
        }

        public int hashCode() {
            return this.f65636a.hashCode();
        }

        @m80.k
        public String toString() {
            return "Content(homeData=" + this.f65636a + ')';
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class b extends u2 {

        /* renamed from: a, reason: collision with root package name */
        @m80.k
        public final String f65637a;

        /* renamed from: b, reason: collision with root package name */
        @m80.k
        public final l3.g2 f65638b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(@m80.k String message, @m80.k l3.g2 retry) {
            super(null);
            kotlin.jvm.internal.g0.p(message, "message");
            kotlin.jvm.internal.g0.p(retry, "retry");
            this.f65637a = message;
            this.f65638b = retry;
        }

        public static /* synthetic */ b d(b bVar, String str, l3.g2 g2Var, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = bVar.f65637a;
            }
            if ((i11 & 2) != 0) {
                g2Var = bVar.f65638b;
            }
            return bVar.c(str, g2Var);
        }

        @m80.k
        public final String a() {
            return this.f65637a;
        }

        @m80.k
        public final l3.g2 b() {
            return this.f65638b;
        }

        @m80.k
        public final b c(@m80.k String message, @m80.k l3.g2 retry) {
            kotlin.jvm.internal.g0.p(message, "message");
            kotlin.jvm.internal.g0.p(retry, "retry");
            return new b(message, retry);
        }

        @m80.k
        public final String e() {
            return this.f65637a;
        }

        public boolean equals(@m80.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return kotlin.jvm.internal.g0.g(this.f65637a, bVar.f65637a) && kotlin.jvm.internal.g0.g(this.f65638b, bVar.f65638b);
        }

        @m80.k
        public final l3.g2 f() {
            return this.f65638b;
        }

        public int hashCode() {
            return (this.f65637a.hashCode() * 31) + this.f65638b.hashCode();
        }

        @m80.k
        public String toString() {
            return "Error(message=" + this.f65637a + ", retry=" + this.f65638b + ')';
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class c extends u2 {

        /* renamed from: a, reason: collision with root package name */
        public final int f65639a;

        public c() {
            this(0, 1, null);
        }

        public static /* synthetic */ c c(c cVar, int i11, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                i11 = cVar.f65639a;
            }
            return cVar.b(i11);
        }

        public final int a() {
            return this.f65639a;
        }

        @m80.k
        public final c b(int i11) {
            return new c(i11);
        }

        public boolean equals(@m80.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && this.f65639a == ((c) obj).f65639a;
        }

        public int hashCode() {
            return Integer.hashCode(this.f65639a);
        }

        @m80.k
        public String toString() {
            return "Loading(nothing=" + this.f65639a + ')';
        }

        public c(int i11) {
            super(null);
            this.f65639a = i11;
        }

        public /* synthetic */ c(int i11, int i12, kotlin.jvm.internal.v vVar) {
            this((i12 & 1) != 0 ? 1 : i11);
        }
    }

    public /* synthetic */ u2(kotlin.jvm.internal.v vVar) {
        this();
    }

    public u2() {
    }
}
