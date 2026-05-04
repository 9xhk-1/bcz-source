package cm;

import android.animation.TimeInterpolator;
import androidx.annotation.RequiresApi;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@RequiresApi(11)
/* loaded from: classes6.dex */
public class b {

    /* renamed from: a, reason: collision with root package name */
    public static final float f8791a = 6.2831855f;

    /* renamed from: b, reason: collision with root package name */
    public static final c0 f8792b = new k();

    /* renamed from: c, reason: collision with root package name */
    public static final c0 f8793c = new u();

    /* renamed from: d, reason: collision with root package name */
    public static final c0 f8794d = new v();

    /* renamed from: e, reason: collision with root package name */
    public static final c0 f8795e = new w();

    /* renamed from: f, reason: collision with root package name */
    public static final c0 f8796f = new x();

    /* renamed from: g, reason: collision with root package name */
    public static final c0 f8797g = new y();

    /* renamed from: h, reason: collision with root package name */
    public static final c0 f8798h = new z();

    /* renamed from: i, reason: collision with root package name */
    public static final c0 f8799i = new a0();

    /* renamed from: j, reason: collision with root package name */
    public static final c0 f8800j = new b0();

    /* renamed from: k, reason: collision with root package name */
    public static final c0 f8801k = new a();

    /* renamed from: l, reason: collision with root package name */
    public static final c0 f8802l = new C0150b();

    /* renamed from: m, reason: collision with root package name */
    public static final c0 f8803m = new c();

    /* renamed from: n, reason: collision with root package name */
    public static final c0 f8804n = new d();

    /* renamed from: o, reason: collision with root package name */
    public static final c0 f8805o = new e();

    /* renamed from: p, reason: collision with root package name */
    public static final c0 f8806p = new f();

    /* renamed from: q, reason: collision with root package name */
    public static final c0 f8807q = new g();

    /* renamed from: r, reason: collision with root package name */
    public static final c0 f8808r = new h();

    /* renamed from: s, reason: collision with root package name */
    public static final c0 f8809s = new i();

    /* renamed from: t, reason: collision with root package name */
    public static final c0 f8810t = new j();

    /* renamed from: u, reason: collision with root package name */
    public static final c0 f8811u = new l();

    /* renamed from: v, reason: collision with root package name */
    public static final c0 f8812v = new m();

    /* renamed from: w, reason: collision with root package name */
    public static final c0 f8813w = new n();

    /* renamed from: x, reason: collision with root package name */
    public static final c0 f8814x = new o();

    /* renamed from: y, reason: collision with root package name */
    public static final c0 f8815y = new p();

    /* renamed from: z, reason: collision with root package name */
    public static final c0 f8816z = new q();
    public static final c0 A = new r();
    public static final c0 B = new s();
    public static final c0 C = new t();

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class a implements c0 {
        @Override // cm.b.c0, android.animation.TimeInterpolator
        public float getInterpolation(float f11) {
            float pow;
            float f12;
            float f13 = f11 * 2.0f;
            if (f13 < 1.0f) {
                pow = (float) Math.pow(f13, 4.0d);
                f12 = 0.5f;
            } else {
                pow = ((float) Math.pow(f13 - 2.0f, 4.0d)) - 2.0f;
                f12 = -0.5f;
            }
            return pow * f12;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class a0 implements c0 {
        @Override // cm.b.c0, android.animation.TimeInterpolator
        public float getInterpolation(float f11) {
            return (float) Math.pow(f11, 4.0d);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    /* renamed from: cm.b$b, reason: collision with other inner class name */
    public static class C0150b implements c0 {
        @Override // cm.b.c0, android.animation.TimeInterpolator
        public float getInterpolation(float f11) {
            return (-((float) Math.cos(f11 * 1.5707963267948966d))) + 1.0f;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class b0 implements c0 {
        @Override // cm.b.c0, android.animation.TimeInterpolator
        public float getInterpolation(float f11) {
            return -(((float) Math.pow(f11 - 1.0f, 4.0d)) - 1.0f);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class c implements c0 {
        @Override // cm.b.c0, android.animation.TimeInterpolator
        public float getInterpolation(float f11) {
            return (float) Math.sin(f11 * 1.5707963267948966d);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public interface c0 extends TimeInterpolator {
        @Override // android.animation.TimeInterpolator
        float getInterpolation(float f11);
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class d implements c0 {
        @Override // cm.b.c0, android.animation.TimeInterpolator
        public float getInterpolation(float f11) {
            return (((float) Math.cos(f11 * 3.141592653589793d)) - 1.0f) * (-0.5f);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class e implements c0 {
        @Override // cm.b.c0, android.animation.TimeInterpolator
        public float getInterpolation(float f11) {
            if (f11 == 0.0f) {
                return 0.0f;
            }
            return (float) Math.pow(2.0d, (f11 - 1.0f) * 10.0f);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class f implements c0 {
        @Override // cm.b.c0, android.animation.TimeInterpolator
        public float getInterpolation(float f11) {
            if (f11 == 1.0f) {
                return 1.0f;
            }
            return -((float) Math.pow(2.0d, (f11 + 1.0f) * (-10.0f)));
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class g implements c0 {
        @Override // cm.b.c0, android.animation.TimeInterpolator
        public float getInterpolation(float f11) {
            if (f11 == 0.0f) {
                return 0.0f;
            }
            if (f11 == 1.0f) {
                return 1.0f;
            }
            return (f11 * 2.0f < 1.0f ? (float) Math.pow(2.0d, (r9 - 1.0f) * 10.0f) : (-((float) Math.pow(2.0d, (r9 - 1.0f) * (-10.0f)))) + 2.0f) * 0.5f;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class h implements c0 {
        @Override // cm.b.c0, android.animation.TimeInterpolator
        public float getInterpolation(float f11) {
            return -(((float) Math.sqrt(1.0f - (f11 * f11))) - 1.0f);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class i implements c0 {
        @Override // cm.b.c0, android.animation.TimeInterpolator
        public float getInterpolation(float f11) {
            float f12 = f11 - 1.0f;
            return (float) Math.sqrt(1.0f - (f12 * f12));
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class j implements c0 {
        @Override // cm.b.c0, android.animation.TimeInterpolator
        public float getInterpolation(float f11) {
            float sqrt;
            float f12;
            float f13 = f11 * 2.0f;
            if (f13 < 1.0f) {
                sqrt = ((float) Math.sqrt(1.0f - (f13 * f13))) - 1.0f;
                f12 = -0.5f;
            } else {
                float f14 = f13 - 2.0f;
                sqrt = ((float) Math.sqrt(1.0f - (f14 * f14))) + 1.0f;
                f12 = 0.5f;
            }
            return sqrt * f12;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class l implements c0 {
        @Override // cm.b.c0, android.animation.TimeInterpolator
        public float getInterpolation(float f11) {
            if (f11 == 0.0f) {
                return 0.0f;
            }
            if (f11 == 1.0f) {
                return 1.0f;
            }
            float f12 = f11 - 1.0f;
            return -(((float) Math.pow(2.0d, 10.0f * f12)) * ((float) Math.sin(((f12 - (0.047746483f * ((float) Math.asin(1.0d)))) * 6.2831855f) / 0.3f)));
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class m implements c0 {
        @Override // cm.b.c0, android.animation.TimeInterpolator
        public float getInterpolation(float f11) {
            if (f11 == 0.0f) {
                return 0.0f;
            }
            if (f11 == 1.0f) {
                return 1.0f;
            }
            return (((float) Math.pow(2.0d, (-10.0f) * f11)) * ((float) Math.sin(((f11 - (0.047746483f * ((float) Math.asin(1.0d)))) * 6.2831855f) / 0.3f))) + 1.0f;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class n implements c0 {
        @Override // cm.b.c0, android.animation.TimeInterpolator
        public float getInterpolation(float f11) {
            if (f11 == 0.0f) {
                return 0.0f;
            }
            float f12 = f11 * 2.0f;
            if (f12 == 2.0f) {
                return 1.0f;
            }
            float asin = ((float) Math.asin(1.0d)) * 0.07161972f;
            if (f12 < 1.0f) {
                float f13 = f12 - 1.0f;
                return ((float) Math.pow(2.0d, 10.0f * f13)) * ((float) Math.sin(((f13 * 1.0f) - asin) * 6.2831855f * 2.2222223f)) * (-0.5f);
            }
            float f14 = f12 - 1.0f;
            return (((float) Math.pow(2.0d, (-10.0f) * f14)) * 0.5f * ((float) Math.sin(((f14 * 1.0f) - asin) * 6.2831855f * 2.2222223f))) + 1.0f;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class o implements c0 {
        @Override // cm.b.c0, android.animation.TimeInterpolator
        public float getInterpolation(float f11) {
            return f11 * f11 * ((f11 * 2.70158f) - 1.70158f);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class p implements c0 {
        @Override // cm.b.c0, android.animation.TimeInterpolator
        public float getInterpolation(float f11) {
            float f12 = f11 - 1.0f;
            return (f12 * f12 * ((f12 * 2.70158f) + 1.70158f)) + 1.0f;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class q implements c0 {
        @Override // cm.b.c0, android.animation.TimeInterpolator
        public float getInterpolation(float f11) {
            float f12 = f11 * 2.0f;
            if (f12 < 1.0f) {
                return f12 * f12 * ((3.5949094f * f12) - 2.5949094f) * 0.5f;
            }
            float f13 = f12 - 2.0f;
            return ((f13 * f13 * ((3.5949094f * f13) + 2.5949094f)) + 2.0f) * 0.5f;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class r implements c0 {
        @Override // cm.b.c0, android.animation.TimeInterpolator
        public float getInterpolation(float f11) {
            return 1.0f - b.B.getInterpolation(1.0f - f11);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class s implements c0 {
        @Override // cm.b.c0, android.animation.TimeInterpolator
        public float getInterpolation(float f11) {
            if (f11 < 0.36363637f) {
                return 7.5625f * f11 * f11;
            }
            if (f11 < 0.72727275f) {
                float f12 = f11 - 0.54545456f;
                return (7.5625f * f12 * f12) + 0.75f;
            }
            if (f11 < 0.90909094f) {
                float f13 = f11 - 0.8181818f;
                return (7.5625f * f13 * f13) + 0.9375f;
            }
            float f14 = f11 - 0.95454544f;
            return (7.5625f * f14 * f14) + 0.984375f;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class t implements c0 {
        @Override // cm.b.c0, android.animation.TimeInterpolator
        public float getInterpolation(float f11) {
            return f11 < 0.5f ? b.A.getInterpolation(f11 * 2.0f) * 0.5f : (b.B.getInterpolation((f11 * 2.0f) - 1.0f) * 0.5f) + 0.5f;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class u implements c0 {
        @Override // cm.b.c0, android.animation.TimeInterpolator
        public float getInterpolation(float f11) {
            return f11 * f11;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class v implements c0 {
        @Override // cm.b.c0, android.animation.TimeInterpolator
        public float getInterpolation(float f11) {
            return (-f11) * (f11 - 2.0f);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class w implements c0 {
        @Override // cm.b.c0, android.animation.TimeInterpolator
        public float getInterpolation(float f11) {
            float f12 = f11 * 2.0f;
            if (f12 < 1.0f) {
                return 0.5f * f12 * f12;
            }
            float f13 = f12 - 1.0f;
            return ((f13 * (f13 - 2.0f)) - 1.0f) * (-0.5f);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class x implements c0 {
        @Override // cm.b.c0, android.animation.TimeInterpolator
        public float getInterpolation(float f11) {
            return (float) Math.pow(f11, 3.0d);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class y implements c0 {
        @Override // cm.b.c0, android.animation.TimeInterpolator
        public float getInterpolation(float f11) {
            return ((float) Math.pow(f11 - 1.0f, 3.0d)) + 1.0f;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class z implements c0 {
        @Override // cm.b.c0, android.animation.TimeInterpolator
        public float getInterpolation(float f11) {
            float f12 = f11 * 2.0f;
            return (f12 < 1.0f ? (float) Math.pow(f12, 3.0d) : ((float) Math.pow(f12 - 2.0f, 3.0d)) + 2.0f) * 0.5f;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class k implements c0 {
        @Override // cm.b.c0, android.animation.TimeInterpolator
        public float getInterpolation(float f11) {
            return f11;
        }
    }
}
