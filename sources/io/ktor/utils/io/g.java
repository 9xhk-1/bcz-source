package io.ktor.utils.io;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public interface g {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public static final a f62105a = a.f62106a;

    void a(@m80.l Throwable th2);

    @m80.l
    Throwable b();

    @m80.l
    Object d(int i11, @m80.k j00.c<? super Boolean> cVar);

    @m80.k
    y40.c0 e();

    boolean f();

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ a f62106a = new a();

        /* renamed from: b, reason: collision with root package name */
        @m80.k
        public static final g f62107b = new C0724a();

        @m80.k
        public final g a() {
            return f62107b;
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        /* renamed from: io.ktor.utils.io.g$a$a, reason: collision with other inner class name */
        public static final class C0724a implements g {

            /* renamed from: b, reason: collision with root package name */
            public final Throwable f62108b;

            /* renamed from: c, reason: collision with root package name */
            public final y40.c0 f62109c = new y40.b();

            @Override // io.ktor.utils.io.g, io.ktor.utils.io.m
            public Throwable b() {
                return this.f62108b;
            }

            @Override // io.ktor.utils.io.g
            public Object d(int i11, j00.c<? super Boolean> cVar) {
                return l00.a.a(false);
            }

            @Override // io.ktor.utils.io.g
            public y40.c0 e() {
                return this.f62109c;
            }

            @Override // io.ktor.utils.io.g
            public boolean f() {
                return true;
            }

            @b0
            public static /* synthetic */ void c() {
            }

            @Override // io.ktor.utils.io.g, io.ktor.utils.io.m
            public void a(Throwable th2) {
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class b {
        public static /* synthetic */ Object a(g gVar, int i11, j00.c cVar, int i12, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: awaitContent");
            }
            if ((i12 & 1) != 0) {
                i11 = 1;
            }
            return gVar.d(i11, cVar);
        }

        @b0
        public static /* synthetic */ void b() {
        }
    }
}
