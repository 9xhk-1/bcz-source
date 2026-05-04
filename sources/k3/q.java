package k3;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public abstract class q {

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a extends q {

        /* renamed from: a, reason: collision with root package name */
        public final int f65530a;

        /* renamed from: b, reason: collision with root package name */
        public final int f65531b;

        /* renamed from: c, reason: collision with root package name */
        public final int f65532c;

        /* renamed from: d, reason: collision with root package name */
        @m80.k
        public final String f65533d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(int i11, int i12, int i13, @m80.k String bookName) {
            super(null);
            kotlin.jvm.internal.g0.p(bookName, "bookName");
            this.f65530a = i11;
            this.f65531b = i12;
            this.f65532c = i13;
            this.f65533d = bookName;
        }

        public static /* synthetic */ a j(a aVar, int i11, int i12, int i13, String str, int i14, Object obj) {
            if ((i14 & 1) != 0) {
                i11 = aVar.f65530a;
            }
            if ((i14 & 2) != 0) {
                i12 = aVar.f65531b;
            }
            if ((i14 & 4) != 0) {
                i13 = aVar.f65532c;
            }
            if ((i14 & 8) != 0) {
                str = aVar.f65533d;
            }
            return aVar.i(i11, i12, i13, str);
        }

        @Override // k3.q
        public int a() {
            return this.f65530a;
        }

        @Override // k3.q
        @m80.k
        public String b() {
            return this.f65533d;
        }

        @Override // k3.q
        public int c() {
            return this.f65532c;
        }

        @Override // k3.q
        public int d() {
            return this.f65531b;
        }

        public final int e() {
            return this.f65530a;
        }

        public boolean equals(@m80.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.f65530a == aVar.f65530a && this.f65531b == aVar.f65531b && this.f65532c == aVar.f65532c && kotlin.jvm.internal.g0.g(this.f65533d, aVar.f65533d);
        }

        public final int f() {
            return this.f65531b;
        }

        public final int g() {
            return this.f65532c;
        }

        @m80.k
        public final String h() {
            return this.f65533d;
        }

        public int hashCode() {
            return (((((Integer.hashCode(this.f65530a) * 31) + Integer.hashCode(this.f65531b)) * 31) + Integer.hashCode(this.f65532c)) * 31) + this.f65533d.hashCode();
        }

        @m80.k
        public final a i(int i11, int i12, int i13, @m80.k String bookName) {
            kotlin.jvm.internal.g0.p(bookName, "bookName");
            return new a(i11, i12, i13, bookName);
        }

        @m80.k
        public String toString() {
            return "AllDone(bookCount=" + this.f65530a + ", masteredCount=" + this.f65531b + ", learnedCount=" + this.f65532c + ", bookName=" + this.f65533d + ')';
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class b extends q {

        /* renamed from: a, reason: collision with root package name */
        public final int f65534a;

        /* renamed from: b, reason: collision with root package name */
        public final int f65535b;

        /* renamed from: c, reason: collision with root package name */
        public final int f65536c;

        /* renamed from: d, reason: collision with root package name */
        @m80.k
        public final String f65537d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(int i11, int i12, int i13, @m80.k String bookName) {
            super(null);
            kotlin.jvm.internal.g0.p(bookName, "bookName");
            this.f65534a = i11;
            this.f65535b = i12;
            this.f65536c = i13;
            this.f65537d = bookName;
        }

        public static /* synthetic */ b j(b bVar, int i11, int i12, int i13, String str, int i14, Object obj) {
            if ((i14 & 1) != 0) {
                i11 = bVar.f65534a;
            }
            if ((i14 & 2) != 0) {
                i12 = bVar.f65535b;
            }
            if ((i14 & 4) != 0) {
                i13 = bVar.f65536c;
            }
            if ((i14 & 8) != 0) {
                str = bVar.f65537d;
            }
            return bVar.i(i11, i12, i13, str);
        }

        @Override // k3.q
        public int a() {
            return this.f65534a;
        }

        @Override // k3.q
        @m80.k
        public String b() {
            return this.f65537d;
        }

        @Override // k3.q
        public int c() {
            return this.f65536c;
        }

        @Override // k3.q
        public int d() {
            return this.f65535b;
        }

        public final int e() {
            return this.f65534a;
        }

        public boolean equals(@m80.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.f65534a == bVar.f65534a && this.f65535b == bVar.f65535b && this.f65536c == bVar.f65536c && kotlin.jvm.internal.g0.g(this.f65537d, bVar.f65537d);
        }

        public final int f() {
            return this.f65535b;
        }

        public final int g() {
            return this.f65536c;
        }

        @m80.k
        public final String h() {
            return this.f65537d;
        }

        public int hashCode() {
            return (((((Integer.hashCode(this.f65534a) * 31) + Integer.hashCode(this.f65535b)) * 31) + Integer.hashCode(this.f65536c)) * 31) + this.f65537d.hashCode();
        }

        @m80.k
        public final b i(int i11, int i12, int i13, @m80.k String bookName) {
            kotlin.jvm.internal.g0.p(bookName, "bookName");
            return new b(i11, i12, i13, bookName);
        }

        @m80.k
        public String toString() {
            return "Doing(bookCount=" + this.f65534a + ", masteredCount=" + this.f65535b + ", learnedCount=" + this.f65536c + ", bookName=" + this.f65537d + ')';
        }
    }

    public /* synthetic */ q(kotlin.jvm.internal.v vVar) {
        this();
    }

    public abstract int a();

    @m80.k
    public abstract String b();

    public abstract int c();

    public abstract int d();

    public q() {
    }
}
