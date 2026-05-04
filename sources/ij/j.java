package ij;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes5.dex */
public interface j {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public static final a f60650a = a.f60651a;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ a f60651a = new a();

        /* renamed from: b, reason: collision with root package name */
        public static final String f60652b = j.class.getSimpleName();
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class b {
        @Deprecated
        public static boolean a(@m80.k j jVar) {
            return j.super.i();
        }
    }

    int a();

    long b();

    void c(long j11);

    long d();

    void e(long j11);

    void g(int i11);

    void h(int i11);

    default boolean i() {
        qb.c.b(a.f60652b, "[Local]" + b() + " - [Remote]" + d() + " - [Limit]" + a(), new Object[0]);
        return (d() > 0 && b() != d()) || a() == 0;
    }

    int j();
}
