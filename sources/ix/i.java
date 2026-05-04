package ix;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public abstract class i {

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a extends i {

        /* renamed from: a, reason: collision with root package name */
        public final long f62839a;

        /* renamed from: b, reason: collision with root package name */
        public final long f62840b;

        public a(long j11, long j12) {
            super(null);
            this.f62839a = j11;
            this.f62840b = j12;
        }

        public static /* synthetic */ a d(a aVar, long j11, long j12, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                j11 = aVar.f62839a;
            }
            if ((i11 & 2) != 0) {
                j12 = aVar.f62840b;
            }
            return aVar.c(j11, j12);
        }

        public final long a() {
            return this.f62839a;
        }

        public final long b() {
            return this.f62840b;
        }

        @m80.k
        public final a c(long j11, long j12) {
            return new a(j11, j12);
        }

        public final long e() {
            return this.f62839a;
        }

        public boolean equals(@m80.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.f62839a == aVar.f62839a && this.f62840b == aVar.f62840b;
        }

        public final long f() {
            return this.f62840b;
        }

        public int hashCode() {
            return (Long.hashCode(this.f62839a) * 31) + Long.hashCode(this.f62840b);
        }

        @m80.k
        public String toString() {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(this.f62839a);
            sb2.append('-');
            sb2.append(this.f62840b);
            return sb2.toString();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class b extends i {

        /* renamed from: a, reason: collision with root package name */
        public final long f62841a;

        public b(long j11) {
            super(null);
            this.f62841a = j11;
        }

        public static /* synthetic */ b c(b bVar, long j11, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                j11 = bVar.f62841a;
            }
            return bVar.b(j11);
        }

        public final long a() {
            return this.f62841a;
        }

        @m80.k
        public final b b(long j11) {
            return new b(j11);
        }

        public final long d() {
            return this.f62841a;
        }

        public boolean equals(@m80.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && this.f62841a == ((b) obj).f62841a;
        }

        public int hashCode() {
            return Long.hashCode(this.f62841a);
        }

        @m80.k
        public String toString() {
            StringBuilder sb2 = new StringBuilder();
            sb2.append('-');
            sb2.append(this.f62841a);
            return sb2.toString();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class c extends i {

        /* renamed from: a, reason: collision with root package name */
        public final long f62842a;

        public c(long j11) {
            super(null);
            this.f62842a = j11;
        }

        public static /* synthetic */ c c(c cVar, long j11, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                j11 = cVar.f62842a;
            }
            return cVar.b(j11);
        }

        public final long a() {
            return this.f62842a;
        }

        @m80.k
        public final c b(long j11) {
            return new c(j11);
        }

        public final long d() {
            return this.f62842a;
        }

        public boolean equals(@m80.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && this.f62842a == ((c) obj).f62842a;
        }

        public int hashCode() {
            return Long.hashCode(this.f62842a);
        }

        @m80.k
        public String toString() {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(this.f62842a);
            sb2.append('-');
            return sb2.toString();
        }
    }

    public /* synthetic */ i(kotlin.jvm.internal.v vVar) {
        this();
    }

    public i() {
    }
}
