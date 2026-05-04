package bo;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public class b {

    /* renamed from: a, reason: collision with root package name */
    public static final bo.a f7002a = new a();

    /* renamed from: b, reason: collision with root package name */
    public static final bo.a f7003b = new C0120b();

    /* renamed from: c, reason: collision with root package name */
    public static final bo.a f7004c = new c();

    /* renamed from: d, reason: collision with root package name */
    public static final bo.a f7005d = new d();

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class a implements bo.a {
        @Override // bo.a
        public bo.c a(float f11, float f12, float f13, float f14) {
            return bo.c.a(255, v.o(0, 255, f12, f13, f11));
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    /* renamed from: bo.b$b, reason: collision with other inner class name */
    public class C0120b implements bo.a {
        @Override // bo.a
        public bo.c a(float f11, float f12, float f13, float f14) {
            return bo.c.b(v.o(255, 0, f12, f13, f11), 255);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class c implements bo.a {
        @Override // bo.a
        public bo.c a(float f11, float f12, float f13, float f14) {
            return bo.c.b(v.o(255, 0, f12, f13, f11), v.o(0, 255, f12, f13, f11));
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class d implements bo.a {
        @Override // bo.a
        public bo.c a(float f11, float f12, float f13, float f14) {
            float f15 = ((f13 - f12) * f14) + f12;
            return bo.c.b(v.o(255, 0, f12, f15, f11), v.o(0, 255, f15, f13, f11));
        }
    }

    public static bo.a a(int i11, boolean z11) {
        if (i11 == 0) {
            return z11 ? f7002a : f7003b;
        }
        if (i11 == 1) {
            return z11 ? f7003b : f7002a;
        }
        if (i11 == 2) {
            return f7004c;
        }
        if (i11 == 3) {
            return f7005d;
        }
        throw new IllegalArgumentException("Invalid fade mode: " + i11);
    }
}
