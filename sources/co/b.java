package co;

import androidx.annotation.RequiresApi;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@RequiresApi(21)
/* loaded from: classes7.dex */
public class b {

    /* renamed from: a, reason: collision with root package name */
    public static final co.a f9363a = new a();

    /* renamed from: b, reason: collision with root package name */
    public static final co.a f9364b = new C0152b();

    /* renamed from: c, reason: collision with root package name */
    public static final co.a f9365c = new c();

    /* renamed from: d, reason: collision with root package name */
    public static final co.a f9366d = new d();

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class a implements co.a {
        @Override // co.a
        public co.c a(float f11, float f12, float f13, float f14) {
            return co.c.a(255, w.o(0, 255, f12, f13, f11));
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    /* renamed from: co.b$b, reason: collision with other inner class name */
    public class C0152b implements co.a {
        @Override // co.a
        public co.c a(float f11, float f12, float f13, float f14) {
            return co.c.b(w.o(255, 0, f12, f13, f11), 255);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class c implements co.a {
        @Override // co.a
        public co.c a(float f11, float f12, float f13, float f14) {
            return co.c.b(w.o(255, 0, f12, f13, f11), w.o(0, 255, f12, f13, f11));
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class d implements co.a {
        @Override // co.a
        public co.c a(float f11, float f12, float f13, float f14) {
            float f15 = ((f13 - f12) * f14) + f12;
            return co.c.b(w.o(255, 0, f12, f15, f11), w.o(0, 255, f15, f13, f11));
        }
    }

    public static co.a a(int i11, boolean z11) {
        if (i11 == 0) {
            return z11 ? f9363a : f9364b;
        }
        if (i11 == 1) {
            return z11 ? f9364b : f9363a;
        }
        if (i11 == 2) {
            return f9365c;
        }
        if (i11 == 3) {
            return f9366d;
        }
        throw new IllegalArgumentException("Invalid fade mode: " + i11);
    }
}
