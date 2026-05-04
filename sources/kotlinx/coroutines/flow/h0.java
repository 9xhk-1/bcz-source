package kotlinx.coroutines.flow;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public interface h0 {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public static final a f68148a = a.f68149a;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ a f68149a = new a();

        /* renamed from: b, reason: collision with root package name */
        @m80.k
        public static final h0 f68150b = new j0();

        /* renamed from: c, reason: collision with root package name */
        @m80.k
        public static final h0 f68151c = new k0();

        public static /* synthetic */ h0 b(a aVar, long j11, long j12, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                j11 = 0;
            }
            if ((i11 & 2) != 0) {
                j12 = Long.MAX_VALUE;
            }
            return aVar.a(j11, j12);
        }

        @m80.k
        public final h0 a(long j11, long j12) {
            return new l0(j11, j12);
        }

        @m80.k
        public final h0 c() {
            return f68150b;
        }

        @m80.k
        public final h0 d() {
            return f68151c;
        }
    }

    @m80.k
    i<SharingCommand> a(@m80.k m0<Integer> m0Var);
}
