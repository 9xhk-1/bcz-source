package t3;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public abstract class n {

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a extends n {

        /* renamed from: a, reason: collision with root package name */
        @m80.k
        public static final a f89274a = new a();

        public a() {
            super(null);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class b extends n {

        /* renamed from: a, reason: collision with root package name */
        @m80.k
        public static final b f89275a = new b();

        public b() {
            super(null);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class c extends n {

        /* renamed from: a, reason: collision with root package name */
        @m80.k
        public static final c f89276a = new c();

        public c() {
            super(null);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class d extends n {

        /* renamed from: a, reason: collision with root package name */
        public final long f89277a;

        public d(long j11) {
            super(null);
            this.f89277a = j11;
        }

        public static /* synthetic */ d c(d dVar, long j11, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                j11 = dVar.f89277a;
            }
            return dVar.b(j11);
        }

        public final long a() {
            return this.f89277a;
        }

        @m80.k
        public final d b(long j11) {
            return new d(j11);
        }

        public final long d() {
            return this.f89277a;
        }

        public boolean equals(@m80.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof d) && this.f89277a == ((d) obj).f89277a;
        }

        public int hashCode() {
            return Long.hashCode(this.f89277a);
        }

        @m80.k
        public String toString() {
            return "Time(time=" + this.f89277a + ')';
        }
    }

    public /* synthetic */ n(kotlin.jvm.internal.v vVar) {
        this();
    }

    public n() {
    }
}
