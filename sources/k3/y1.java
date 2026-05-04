package k3;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public abstract class y1 {

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a extends y1 {

        /* renamed from: a, reason: collision with root package name */
        public final int f65716a;

        public a() {
            this(0, 1, null);
        }

        public static /* synthetic */ a c(a aVar, int i11, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                i11 = aVar.f65716a;
            }
            return aVar.b(i11);
        }

        public final int a() {
            return this.f65716a;
        }

        @m80.k
        public final a b(int i11) {
            return new a(i11);
        }

        public boolean equals(@m80.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && this.f65716a == ((a) obj).f65716a;
        }

        public int hashCode() {
            return Integer.hashCode(this.f65716a);
        }

        @m80.k
        public String toString() {
            return "Native(order=" + this.f65716a + ')';
        }

        public a(int i11) {
            super(null);
            this.f65716a = i11;
        }

        public /* synthetic */ a(int i11, int i12, kotlin.jvm.internal.v vVar) {
            this((i12 & 1) != 0 ? 1 : i11);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class b extends y1 {

        /* renamed from: a, reason: collision with root package name */
        public final int f65717a;

        public b() {
            this(0, 1, null);
        }

        private final int a() {
            return this.f65717a;
        }

        public static /* synthetic */ b c(b bVar, int i11, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                i11 = bVar.f65717a;
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
            return (obj instanceof b) && this.f65717a == ((b) obj).f65717a;
        }

        public int hashCode() {
            return Integer.hashCode(this.f65717a);
        }

        @m80.k
        public String toString() {
            return "Unknown(order=" + this.f65717a + ')';
        }

        public b(int i11) {
            super(null);
            this.f65717a = i11;
        }

        public /* synthetic */ b(int i11, int i12, kotlin.jvm.internal.v vVar) {
            this((i12 & 1) != 0 ? 3 : i11);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class c extends y1 {

        /* renamed from: a, reason: collision with root package name */
        public final int f65718a;

        public c() {
            this(0, 1, null);
        }

        private final int a() {
            return this.f65718a;
        }

        public static /* synthetic */ c c(c cVar, int i11, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                i11 = cVar.f65718a;
            }
            return cVar.b(i11);
        }

        @m80.k
        public final c b(int i11) {
            return new c(i11);
        }

        public boolean equals(@m80.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && this.f65718a == ((c) obj).f65718a;
        }

        public int hashCode() {
            return Integer.hashCode(this.f65718a);
        }

        @m80.k
        public String toString() {
            return "Web(order=" + this.f65718a + ')';
        }

        public c(int i11) {
            super(null);
            this.f65718a = i11;
        }

        public /* synthetic */ c(int i11, int i12, kotlin.jvm.internal.v vVar) {
            this((i12 & 1) != 0 ? 2 : i11);
        }
    }

    public /* synthetic */ y1(kotlin.jvm.internal.v vVar) {
        this();
    }

    public y1() {
    }
}
