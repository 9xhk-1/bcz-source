package a3;

import com.badlogic.gdx.math.Vector2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public abstract class q0 {

    /* renamed from: a, reason: collision with root package name */
    public static final Vector2 f1615a = new Vector2();

    /* renamed from: b, reason: collision with root package name */
    public static final q0 f1616b = new a();

    /* renamed from: c, reason: collision with root package name */
    public static final q0 f1617c = new b();

    /* renamed from: d, reason: collision with root package name */
    public static final q0 f1618d = new c();

    /* renamed from: e, reason: collision with root package name */
    public static final q0 f1619e = new d();

    /* renamed from: f, reason: collision with root package name */
    public static final q0 f1620f = new e();

    /* renamed from: g, reason: collision with root package name */
    public static final q0 f1621g = new f();

    /* renamed from: h, reason: collision with root package name */
    public static final q0 f1622h = new g();

    /* renamed from: i, reason: collision with root package name */
    public static final q0 f1623i = new h();

    /* renamed from: j, reason: collision with root package name */
    public static final q0 f1624j = new i();

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class a extends q0 {
        @Override // a3.q0
        public Vector2 a(float f11, float f12, float f13, float f14) {
            float f15 = f14 / f13 > f12 / f11 ? f13 / f11 : f14 / f12;
            Vector2 vector2 = q0.f1615a;
            vector2.f12535x = f11 * f15;
            vector2.f12536y = f12 * f15;
            return vector2;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class b extends q0 {
        @Override // a3.q0
        public Vector2 a(float f11, float f12, float f13, float f14) {
            float f15 = f14 / f13 > f12 / f11 ? f13 / f11 : f14 / f12;
            if (f15 > 1.0f) {
                f15 = 1.0f;
            }
            Vector2 vector2 = q0.f1615a;
            vector2.f12535x = f11 * f15;
            vector2.f12536y = f12 * f15;
            return vector2;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class c extends q0 {
        @Override // a3.q0
        public Vector2 a(float f11, float f12, float f13, float f14) {
            float f15 = f14 / f13 < f12 / f11 ? f13 / f11 : f14 / f12;
            Vector2 vector2 = q0.f1615a;
            vector2.f12535x = f11 * f15;
            vector2.f12536y = f12 * f15;
            return vector2;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class d extends q0 {
        @Override // a3.q0
        public Vector2 a(float f11, float f12, float f13, float f14) {
            float f15 = f13 / f11;
            Vector2 vector2 = q0.f1615a;
            vector2.f12535x = f11 * f15;
            vector2.f12536y = f12 * f15;
            return vector2;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class e extends q0 {
        @Override // a3.q0
        public Vector2 a(float f11, float f12, float f13, float f14) {
            float f15 = f14 / f12;
            Vector2 vector2 = q0.f1615a;
            vector2.f12535x = f11 * f15;
            vector2.f12536y = f12 * f15;
            return vector2;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class f extends q0 {
        @Override // a3.q0
        public Vector2 a(float f11, float f12, float f13, float f14) {
            Vector2 vector2 = q0.f1615a;
            vector2.f12535x = f13;
            vector2.f12536y = f14;
            return vector2;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class g extends q0 {
        @Override // a3.q0
        public Vector2 a(float f11, float f12, float f13, float f14) {
            Vector2 vector2 = q0.f1615a;
            vector2.f12535x = f13;
            vector2.f12536y = f12;
            return vector2;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class h extends q0 {
        @Override // a3.q0
        public Vector2 a(float f11, float f12, float f13, float f14) {
            Vector2 vector2 = q0.f1615a;
            vector2.f12535x = f11;
            vector2.f12536y = f14;
            return vector2;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class i extends q0 {
        @Override // a3.q0
        public Vector2 a(float f11, float f12, float f13, float f14) {
            Vector2 vector2 = q0.f1615a;
            vector2.f12535x = f11;
            vector2.f12536y = f12;
            return vector2;
        }
    }

    public abstract Vector2 a(float f11, float f12, float f13, float f14);
}
