package k3;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public abstract class t2 {

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a extends t2 {

        /* renamed from: a, reason: collision with root package name */
        public final int f65618a;

        /* renamed from: b, reason: collision with root package name */
        @m80.k
        public final String f65619b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(int i11, @m80.k String display) {
            super(null);
            kotlin.jvm.internal.g0.p(display, "display");
            this.f65618a = i11;
            this.f65619b = display;
        }

        public static /* synthetic */ a d(a aVar, int i11, String str, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                i11 = aVar.f65618a;
            }
            if ((i12 & 2) != 0) {
                str = aVar.f65619b;
            }
            return aVar.c(i11, str);
        }

        public final int a() {
            return this.f65618a;
        }

        @m80.k
        public final String b() {
            return this.f65619b;
        }

        @m80.k
        public final a c(int i11, @m80.k String display) {
            kotlin.jvm.internal.g0.p(display, "display");
            return new a(i11, display);
        }

        @m80.k
        public final String e() {
            return this.f65619b;
        }

        public boolean equals(@m80.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.f65618a == aVar.f65618a && kotlin.jvm.internal.g0.g(this.f65619b, aVar.f65619b);
        }

        public final int f() {
            return this.f65618a;
        }

        public int hashCode() {
            return (Integer.hashCode(this.f65618a) * 31) + this.f65619b.hashCode();
        }

        @m80.k
        public String toString() {
            return "Entrance(skuId=" + this.f65618a + ", display=" + this.f65619b + ')';
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class b extends t2 {

        /* renamed from: a, reason: collision with root package name */
        @m80.k
        public static final b f65620a = new b();

        public b() {
            super(null);
        }
    }

    public /* synthetic */ t2(kotlin.jvm.internal.v vVar) {
        this();
    }

    public t2() {
    }
}
