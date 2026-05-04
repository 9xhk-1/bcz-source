package k3;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public abstract class h {

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a extends h {

        /* renamed from: a, reason: collision with root package name */
        public final boolean f65329a;

        public a(boolean z11) {
            super(null);
            this.f65329a = z11;
        }

        public static /* synthetic */ a c(a aVar, boolean z11, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                z11 = aVar.f65329a;
            }
            return aVar.b(z11);
        }

        public final boolean a() {
            return this.f65329a;
        }

        @m80.k
        public final a b(boolean z11) {
            return new a(z11);
        }

        public final boolean d() {
            return this.f65329a;
        }

        public boolean equals(@m80.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && this.f65329a == ((a) obj).f65329a;
        }

        public int hashCode() {
            return Boolean.hashCode(this.f65329a);
        }

        @m80.k
        public String toString() {
            return "Available(hasUnFinishGame=" + this.f65329a + ')';
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class b extends h {

        /* renamed from: a, reason: collision with root package name */
        public final int f65330a;

        public b() {
            this(0, 1, null);
        }

        public static /* synthetic */ b c(b bVar, int i11, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                i11 = bVar.f65330a;
            }
            return bVar.b(i11);
        }

        public final int a() {
            return this.f65330a;
        }

        @m80.k
        public final b b(int i11) {
            return new b(i11);
        }

        public boolean equals(@m80.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && this.f65330a == ((b) obj).f65330a;
        }

        public int hashCode() {
            return Integer.hashCode(this.f65330a);
        }

        @m80.k
        public String toString() {
            return "NoMoreWords(nothing=" + this.f65330a + ')';
        }

        public b(int i11) {
            super(null);
            this.f65330a = i11;
        }

        public /* synthetic */ b(int i11, int i12, kotlin.jvm.internal.v vVar) {
            this((i12 & 1) != 0 ? 1 : i11);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class c extends h {

        /* renamed from: a, reason: collision with root package name */
        public final int f65331a;

        public c() {
            this(0, 1, null);
        }

        private final int a() {
            return this.f65331a;
        }

        public static /* synthetic */ c c(c cVar, int i11, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                i11 = cVar.f65331a;
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
            return (obj instanceof c) && this.f65331a == ((c) obj).f65331a;
        }

        public int hashCode() {
            return Integer.hashCode(this.f65331a);
        }

        @m80.k
        public String toString() {
            return "None(nothing=" + this.f65331a + ')';
        }

        public c(int i11) {
            super(null);
            this.f65331a = i11;
        }

        public /* synthetic */ c(int i11, int i12, kotlin.jvm.internal.v vVar) {
            this((i12 & 1) != 0 ? 1 : i11);
        }
    }

    public /* synthetic */ h(kotlin.jvm.internal.v vVar) {
        this();
    }

    public h() {
    }
}
