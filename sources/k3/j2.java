package k3;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public abstract class j2 {

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a extends j2 {

        /* renamed from: a, reason: collision with root package name */
        public final int f65386a;

        public a() {
            this(0, 1, null);
        }

        private final int a() {
            return this.f65386a;
        }

        public static /* synthetic */ a c(a aVar, int i11, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                i11 = aVar.f65386a;
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
            return (obj instanceof a) && this.f65386a == ((a) obj).f65386a;
        }

        public int hashCode() {
            return Integer.hashCode(this.f65386a);
        }

        @m80.k
        public String toString() {
            return "AllMastered(nothing=" + this.f65386a + ')';
        }

        public a(int i11) {
            super(null);
            this.f65386a = i11;
        }

        public /* synthetic */ a(int i11, int i12, kotlin.jvm.internal.v vVar) {
            this((i12 & 1) != 0 ? 1 : i11);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class b extends j2 {

        /* renamed from: a, reason: collision with root package name */
        public final int f65387a;

        public b() {
            this(0, 1, null);
        }

        private final int a() {
            return this.f65387a;
        }

        public static /* synthetic */ b c(b bVar, int i11, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                i11 = bVar.f65387a;
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
            return (obj instanceof b) && this.f65387a == ((b) obj).f65387a;
        }

        public int hashCode() {
            return Integer.hashCode(this.f65387a);
        }

        @m80.k
        public String toString() {
            return "NoReviewWords(nothing=" + this.f65387a + ')';
        }

        public b(int i11) {
            super(null);
            this.f65387a = i11;
        }

        public /* synthetic */ b(int i11, int i12, kotlin.jvm.internal.v vVar) {
            this((i12 & 1) != 0 ? 1 : i11);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class c extends j2 {

        /* renamed from: a, reason: collision with root package name */
        public final int f65388a;

        /* renamed from: b, reason: collision with root package name */
        public final int f65389b;

        /* renamed from: c, reason: collision with root package name */
        public final boolean f65390c;

        public c(int i11, int i12, boolean z11) {
            super(null);
            this.f65388a = i11;
            this.f65389b = i12;
            this.f65390c = z11;
        }

        public static /* synthetic */ c e(c cVar, int i11, int i12, boolean z11, int i13, Object obj) {
            if ((i13 & 1) != 0) {
                i11 = cVar.f65388a;
            }
            if ((i13 & 2) != 0) {
                i12 = cVar.f65389b;
            }
            if ((i13 & 4) != 0) {
                z11 = cVar.f65390c;
            }
            return cVar.d(i11, i12, z11);
        }

        public final int a() {
            return this.f65388a;
        }

        public final int b() {
            return this.f65389b;
        }

        public final boolean c() {
            return this.f65390c;
        }

        @m80.k
        public final c d(int i11, int i12, boolean z11) {
            return new c(i11, i12, z11);
        }

        public boolean equals(@m80.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return this.f65388a == cVar.f65388a && this.f65389b == cVar.f65389b && this.f65390c == cVar.f65390c;
        }

        public final boolean f() {
            return this.f65390c;
        }

        public final int g() {
            return this.f65388a;
        }

        public final int h() {
            return this.f65389b;
        }

        public int hashCode() {
            return (((Integer.hashCode(this.f65388a) * 31) + Integer.hashCode(this.f65389b)) * 31) + Boolean.hashCode(this.f65390c);
        }

        @m80.k
        public String toString() {
            return "Reviewing(reviewCompletedRound=" + this.f65388a + ", reviewTargetRound=" + this.f65389b + ", hasUnFinishGame=" + this.f65390c + ')';
        }
    }

    public /* synthetic */ j2(kotlin.jvm.internal.v vVar) {
        this();
    }

    public j2() {
    }
}
