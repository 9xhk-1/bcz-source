package k3;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public abstract class d4 {

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a extends d4 {

        /* renamed from: a, reason: collision with root package name */
        public final int f65279a;

        public a() {
            this(0, 1, null);
        }

        public static /* synthetic */ a c(a aVar, int i11, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                i11 = aVar.f65279a;
            }
            return aVar.b(i11);
        }

        public final int a() {
            return this.f65279a;
        }

        @m80.k
        public final a b(int i11) {
            return new a(i11);
        }

        public boolean equals(@m80.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && this.f65279a == ((a) obj).f65279a;
        }

        public int hashCode() {
            return Integer.hashCode(this.f65279a);
        }

        @m80.k
        public String toString() {
            return "ComeOn(type=" + this.f65279a + ')';
        }

        public a(int i11) {
            super(null);
            this.f65279a = i11;
        }

        public /* synthetic */ a(int i11, int i12, kotlin.jvm.internal.v vVar) {
            this((i12 & 1) != 0 ? 2 : i11);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class b extends d4 {

        /* renamed from: a, reason: collision with root package name */
        public final int f65280a;

        public b() {
            this(0, 1, null);
        }

        private final int a() {
            return this.f65280a;
        }

        public static /* synthetic */ b c(b bVar, int i11, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                i11 = bVar.f65280a;
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
            return (obj instanceof b) && this.f65280a == ((b) obj).f65280a;
        }

        public int hashCode() {
            return Integer.hashCode(this.f65280a);
        }

        @m80.k
        public String toString() {
            return "Finish(type=" + this.f65280a + ')';
        }

        public b(int i11) {
            super(null);
            this.f65280a = i11;
        }

        public /* synthetic */ b(int i11, int i12, kotlin.jvm.internal.v vVar) {
            this((i12 & 1) != 0 ? 3 : i11);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class c extends d4 {

        /* renamed from: a, reason: collision with root package name */
        public final int f65281a;

        public c() {
            this(0, 1, null);
        }

        private final int a() {
            return this.f65281a;
        }

        public static /* synthetic */ c c(c cVar, int i11, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                i11 = cVar.f65281a;
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
            return (obj instanceof c) && this.f65281a == ((c) obj).f65281a;
        }

        public int hashCode() {
            return Integer.hashCode(this.f65281a);
        }

        @m80.k
        public String toString() {
            return "Hint(type=" + this.f65281a + ')';
        }

        public c(int i11) {
            super(null);
            this.f65281a = i11;
        }

        public /* synthetic */ c(int i11, int i12, kotlin.jvm.internal.v vVar) {
            this((i12 & 1) != 0 ? 1 : i11);
        }
    }

    public /* synthetic */ d4(kotlin.jvm.internal.v vVar) {
        this();
    }

    public d4() {
    }
}
