package k3;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public abstract class a2 {

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a extends a2 {

        /* renamed from: a, reason: collision with root package name */
        public final int f65206a;

        public a() {
            this(0, 1, null);
        }

        public static /* synthetic */ a c(a aVar, int i11, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                i11 = aVar.f65206a;
            }
            return aVar.b(i11);
        }

        public final int a() {
            return this.f65206a;
        }

        @m80.k
        public final a b(int i11) {
            return new a(i11);
        }

        public boolean equals(@m80.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && this.f65206a == ((a) obj).f65206a;
        }

        public int hashCode() {
            return Integer.hashCode(this.f65206a);
        }

        @m80.k
        public String toString() {
            return "Hint(int=" + this.f65206a + ')';
        }

        public a(int i11) {
            super(null);
            this.f65206a = i11;
        }

        public /* synthetic */ a(int i11, int i12, kotlin.jvm.internal.v vVar) {
            this((i12 & 1) != 0 ? 2 : i11);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class b extends a2 {

        /* renamed from: a, reason: collision with root package name */
        public final int f65207a;

        public b() {
            this(0, 1, null);
        }

        private final int a() {
            return this.f65207a;
        }

        public static /* synthetic */ b c(b bVar, int i11, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                i11 = bVar.f65207a;
            }
            return bVar.b(i11);
        }

        @m80.k
        public final b b(int i11) {
            return new b(i11);
        }

        public boolean equals(@m80.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && this.f65207a == ((b) obj).f65207a;
        }

        public int hashCode() {
            return Integer.hashCode(this.f65207a);
        }

        @m80.k
        public String toString() {
            return "Normal(int=" + this.f65207a + ')';
        }

        public b(int i11) {
            super(null);
            this.f65207a = i11;
        }

        public /* synthetic */ b(int i11, int i12, kotlin.jvm.internal.v vVar) {
            this((i12 & 1) != 0 ? 1 : i11);
        }
    }

    public /* synthetic */ a2(kotlin.jvm.internal.v vVar) {
        this();
    }

    public a2() {
    }
}
