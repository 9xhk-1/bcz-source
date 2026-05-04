package k3;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public abstract class m1 {

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a extends m1 {

        /* renamed from: a, reason: collision with root package name */
        @m80.k
        public final w3 f65442a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(@m80.k w3 userInfo) {
            super(null);
            kotlin.jvm.internal.g0.p(userInfo, "userInfo");
            this.f65442a = userInfo;
        }

        public static /* synthetic */ a c(a aVar, w3 w3Var, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                w3Var = aVar.f65442a;
            }
            return aVar.b(w3Var);
        }

        @m80.k
        public final w3 a() {
            return this.f65442a;
        }

        @m80.k
        public final a b(@m80.k w3 userInfo) {
            kotlin.jvm.internal.g0.p(userInfo, "userInfo");
            return new a(userInfo);
        }

        @m80.k
        public final w3 d() {
            return this.f65442a;
        }

        public boolean equals(@m80.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && kotlin.jvm.internal.g0.g(this.f65442a, ((a) obj).f65442a);
        }

        public int hashCode() {
            return this.f65442a.hashCode();
        }

        @m80.k
        public String toString() {
            return "Login(userInfo=" + this.f65442a + ')';
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class b extends m1 {

        /* renamed from: a, reason: collision with root package name */
        @m80.k
        public static final b f65443a = new b();

        public b() {
            super(null);
        }
    }

    public /* synthetic */ m1(kotlin.jvm.internal.v vVar) {
        this();
    }

    public m1() {
    }
}
