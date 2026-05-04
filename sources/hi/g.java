package hi;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public class g {

    /* renamed from: g, reason: collision with root package name */
    public static final String f59356g = "g";

    /* renamed from: a, reason: collision with root package name */
    public int f59357a;

    /* renamed from: b, reason: collision with root package name */
    public int f59358b;

    /* renamed from: c, reason: collision with root package name */
    public int f59359c;

    /* renamed from: d, reason: collision with root package name */
    public int f59360d;

    /* renamed from: e, reason: collision with root package name */
    public int f59361e;

    /* renamed from: f, reason: collision with root package name */
    public int f59362f;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public static g f59363a = new g();
    }

    public static g a() {
        return a.f59363a;
    }

    public final int b() {
        int i11 = this.f59362f;
        return i11 != 0 ? i11 : i9.f.d(pb.a.a(), i9.f.f60379j0);
    }

    public boolean c() {
        return (b() & this.f59360d) != 0;
    }

    public boolean d() {
        return (b() & this.f59358b) != 0;
    }

    public boolean e() {
        return (b() & this.f59359c) != 0;
    }

    public boolean f() {
        return (b() & this.f59361e) != 0;
    }

    public void g(int flags) {
        qb.c.i(f59356g, "setFlags: " + Integer.toBinaryString(flags), new Object[0]);
        this.f59362f = flags;
        if (flags != 0) {
            i9.f.k(pb.a.a(), i9.f.f60379j0, this.f59362f);
        }
    }

    public g() {
        this.f59357a = 0;
        this.f59358b = 1;
        this.f59359c = 2;
        this.f59360d = 4;
        this.f59361e = 8;
        this.f59362f = 0;
    }
}
