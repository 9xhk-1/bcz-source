package com.badlogic.gdx.math;

import com.badlogic.gdx.math.Plane;
import com.badlogic.gdx.math.collision.BoundingBox;
import com.badlogic.gdx.math.collision.OrientedBoundingBox;
import com.badlogic.gdx.math.collision.Ray;
import java.util.Arrays;
import java.util.List;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public final class m {

    /* renamed from: a, reason: collision with root package name */
    public static final Vector3 f12641a = new Vector3();

    /* renamed from: b, reason: collision with root package name */
    public static final Vector3 f12642b = new Vector3();

    /* renamed from: c, reason: collision with root package name */
    public static final Vector3 f12643c = new Vector3();

    /* renamed from: d, reason: collision with root package name */
    public static final a3.r f12644d = new a3.r();

    /* renamed from: e, reason: collision with root package name */
    public static final a3.r f12645e = new a3.r();

    /* renamed from: f, reason: collision with root package name */
    public static final Vector2 f12646f = new Vector2();

    /* renamed from: g, reason: collision with root package name */
    public static final Vector2 f12647g = new Vector2();

    /* renamed from: h, reason: collision with root package name */
    public static final Vector2 f12648h = new Vector2();

    /* renamed from: i, reason: collision with root package name */
    public static final Vector2 f12649i = new Vector2();

    /* renamed from: j, reason: collision with root package name */
    public static final Vector2 f12650j = new Vector2();

    /* renamed from: k, reason: collision with root package name */
    public static Vector2 f12651k = new Vector2();

    /* renamed from: l, reason: collision with root package name */
    public static Vector2 f12652l = new Vector2();

    /* renamed from: m, reason: collision with root package name */
    public static Vector2 f12653m = new Vector2();

    /* renamed from: n, reason: collision with root package name */
    public static Vector2 f12654n = new Vector2();

    /* renamed from: o, reason: collision with root package name */
    public static final Plane f12655o = new Plane(new Vector3(), 0.0f);

    /* renamed from: p, reason: collision with root package name */
    public static final Vector3 f12656p = new Vector3();

    /* renamed from: q, reason: collision with root package name */
    public static final Vector3 f12657q = new Vector3();

    /* renamed from: r, reason: collision with root package name */
    public static final Vector3 f12658r = new Vector3();

    /* renamed from: s, reason: collision with root package name */
    public static Vector3 f12659s = new Vector3();

    /* renamed from: t, reason: collision with root package name */
    public static Vector3 f12660t = new Vector3();

    /* renamed from: u, reason: collision with root package name */
    public static Vector3 f12661u = new Vector3();

    /* renamed from: v, reason: collision with root package name */
    public static Vector3 f12662v = new Vector3();

    /* renamed from: w, reason: collision with root package name */
    public static Vector3 f12663w = new Vector3();

    /* renamed from: x, reason: collision with root package name */
    public static Vector3 f12664x = new Vector3();

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public Vector2 f12665a = new Vector2();

        /* renamed from: b, reason: collision with root package name */
        public float f12666b = 0.0f;
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class b {

        /* renamed from: a, reason: collision with root package name */
        public float[] f12667a;

        /* renamed from: b, reason: collision with root package name */
        public float[] f12668b;

        /* renamed from: c, reason: collision with root package name */
        public float[] f12669c;

        /* renamed from: d, reason: collision with root package name */
        public int f12670d;

        /* renamed from: e, reason: collision with root package name */
        public int f12671e;

        /* renamed from: f, reason: collision with root package name */
        public int f12672f;

        /* renamed from: g, reason: collision with root package name */
        public boolean f12673g = false;

        /* renamed from: h, reason: collision with root package name */
        public int f12674h = 0;

        /* renamed from: i, reason: collision with root package name */
        public int f12675i = 0;

        public b(int i11) {
            int i12 = i11 * 6;
            this.f12667a = new float[i12];
            this.f12668b = new float[i12];
            this.f12669c = new float[i11];
        }

        public void a(float[] fArr, int i11, int i12) {
            if (this.f12673g) {
                System.arraycopy(fArr, i11, this.f12667a, this.f12674h, i12);
                this.f12674h += i12;
            } else {
                System.arraycopy(fArr, i11, this.f12668b, this.f12675i, i12);
                this.f12675i += i12;
            }
        }

        public boolean b() {
            return this.f12673g;
        }

        public void c() {
            this.f12673g = false;
            this.f12674h = 0;
            this.f12675i = 0;
            this.f12670d = 0;
            this.f12671e = 0;
            this.f12672f = 0;
        }

        public void d(boolean z11) {
            this.f12673g = z11;
        }

        public String toString() {
            return "SplitTriangle [front=" + Arrays.toString(this.f12667a) + ", back=" + Arrays.toString(this.f12668b) + ", numFront=" + this.f12670d + ", numBack=" + this.f12671e + ", total=" + this.f12672f + "]";
        }
    }

    public static float A(Vector2 vector2, Vector2 vector22, Vector2 vector23, Vector2 vector24) {
        float f11 = vector23.f12535x - vector2.f12535x;
        float f12 = vector23.f12536y - vector2.f12536y;
        float f13 = vector22.f12535x;
        float f14 = vector24.f12536y;
        float f15 = vector22.f12536y;
        float f16 = vector24.f12535x;
        float f17 = (f13 * f14) - (f15 * f16);
        if (f17 == 0.0f) {
            return Float.POSITIVE_INFINITY;
        }
        return (f11 * (f14 / f17)) - (f12 * (f16 / f17));
    }

    public static boolean B(Ray ray, Vector3 vector3, float f11, Vector3 vector32) {
        Vector3 vector33 = ray.direction;
        float f12 = vector3.f12537x;
        Vector3 vector34 = ray.origin;
        float dot = vector33.dot(f12 - vector34.f12537x, vector3.f12538y - vector34.f12538y, vector3.f12539z - vector34.f12539z);
        if (dot < 0.0f) {
            return false;
        }
        Vector3 vector35 = ray.origin;
        float f13 = vector35.f12537x;
        Vector3 vector36 = ray.direction;
        if (vector3.dst2(f13 + (vector36.f12537x * dot), vector35.f12538y + (vector36.f12538y * dot), vector35.f12539z + (vector36.f12539z * dot)) > f11 * f11) {
            return false;
        }
        if (vector32 == null) {
            return true;
        }
        vector32.set(ray.direction).scl(dot - ((float) Math.sqrt(r9 - r8))).add(ray.origin);
        return true;
    }

    public static boolean C(Ray ray, Vector3 vector3, Vector3 vector32, Vector3 vector33, Vector3 vector34) {
        Vector3 sub = f12641a.set(vector32).sub(vector3);
        Vector3 sub2 = f12642b.set(vector33).sub(vector3);
        Vector3 crs = f12643c.set(ray.direction).crs(sub2);
        float dot = sub.dot(crs);
        if (n.z(dot)) {
            Plane plane = f12655o;
            plane.set(vector3, vector32, vector33);
            if (plane.testPoint(ray.origin) != Plane.PlaneSide.OnPlane || !T(ray.origin, vector3, vector32, vector33)) {
                return false;
            }
            if (vector34 != null) {
                vector34.set(ray.origin);
            }
            return true;
        }
        float f11 = 1.0f / dot;
        Vector3 sub3 = f12656p.set(ray.origin).sub(vector3);
        float dot2 = sub3.dot(crs) * f11;
        if (dot2 >= 0.0f && dot2 <= 1.0f) {
            Vector3 crs2 = sub3.crs(sub);
            float dot3 = ray.direction.dot(crs2) * f11;
            if (dot3 >= 0.0f && dot2 + dot3 <= 1.0f) {
                float dot4 = sub2.dot(crs2) * f11;
                if (dot4 < 0.0f) {
                    return false;
                }
                if (vector34 != null) {
                    if (dot4 <= 1.0E-6f) {
                        vector34.set(ray.origin);
                    } else {
                        ray.getEndPoint(vector34, dot4);
                    }
                }
                return true;
            }
        }
        return false;
    }

    public static boolean D(Ray ray, List<Vector3> list, Vector3 vector3) {
        if (list.size() % 3 != 0) {
            throw new RuntimeException("triangle list size is not a multiple of 3");
        }
        float f11 = Float.MAX_VALUE;
        boolean z11 = false;
        for (int i11 = 0; i11 < list.size(); i11 += 3) {
            if (C(ray, list.get(i11), list.get(i11 + 1), list.get(i11 + 2), f12660t)) {
                float dst2 = ray.origin.dst2(f12660t);
                if (dst2 < f11) {
                    f12659s.set(f12660t);
                    f11 = dst2;
                    z11 = true;
                }
            }
        }
        if (!z11) {
            return false;
        }
        if (vector3 != null) {
            vector3.set(f12659s);
        }
        return true;
    }

    public static boolean E(Ray ray, float[] fArr, Vector3 vector3) {
        if (fArr.length % 9 != 0) {
            throw new RuntimeException("triangles array size is not a multiple of 9");
        }
        float f11 = Float.MAX_VALUE;
        boolean z11 = false;
        for (int i11 = 0; i11 < fArr.length; i11 += 9) {
            if (C(ray, f12661u.set(fArr[i11], fArr[i11 + 1], fArr[i11 + 2]), f12662v.set(fArr[i11 + 3], fArr[i11 + 4], fArr[i11 + 5]), f12663w.set(fArr[i11 + 6], fArr[i11 + 7], fArr[i11 + 8]), f12660t)) {
                float dst2 = ray.origin.dst2(f12660t);
                if (dst2 < f11) {
                    f12659s.set(f12660t);
                    f11 = dst2;
                    z11 = true;
                }
            }
        }
        if (!z11) {
            return false;
        }
        if (vector3 != null) {
            vector3.set(f12659s);
        }
        return true;
    }

    public static boolean F(Ray ray, float[] fArr, short[] sArr, int i11, Vector3 vector3) {
        if (sArr.length % 3 != 0) {
            throw new RuntimeException("triangle list size is not a multiple of 3");
        }
        float f11 = Float.MAX_VALUE;
        boolean z11 = false;
        for (int i12 = 0; i12 < sArr.length; i12 += 3) {
            int i13 = sArr[i12] * i11;
            int i14 = sArr[i12 + 1] * i11;
            int i15 = sArr[i12 + 2] * i11;
            if (C(ray, f12661u.set(fArr[i13], fArr[i13 + 1], fArr[i13 + 2]), f12662v.set(fArr[i14], fArr[i14 + 1], fArr[i14 + 2]), f12663w.set(fArr[i15], fArr[i15 + 1], fArr[i15 + 2]), f12660t)) {
                float dst2 = ray.origin.dst2(f12660t);
                if (dst2 < f11) {
                    f12659s.set(f12660t);
                    f11 = dst2;
                    z11 = true;
                }
            }
        }
        if (!z11) {
            return false;
        }
        if (vector3 != null) {
            vector3.set(f12659s);
        }
        return true;
    }

    public static boolean G(Rectangle rectangle, Rectangle rectangle2, Rectangle rectangle3) {
        if (!rectangle.overlaps(rectangle2)) {
            return false;
        }
        rectangle3.f12533x = Math.max(rectangle.f12533x, rectangle2.f12533x);
        rectangle3.width = Math.min(rectangle.f12533x + rectangle.width, rectangle2.f12533x + rectangle2.width) - rectangle3.f12533x;
        rectangle3.f12534y = Math.max(rectangle.f12534y, rectangle2.f12534y);
        rectangle3.height = Math.min(rectangle.f12534y + rectangle.height, rectangle2.f12534y + rectangle2.height) - rectangle3.f12534y;
        return true;
    }

    public static boolean H(Vector2 vector2, Vector2 vector22, Circle circle, a aVar) {
        f12651k.set(vector22).sub(vector2);
        f12652l.set(circle.f12519x - vector2.f12535x, circle.f12520y - vector2.f12536y);
        float len = f12651k.len();
        float dot = f12652l.dot(f12651k.nor());
        if (dot <= 0.0f) {
            f12653m.set(vector2);
        } else if (dot >= len) {
            f12653m.set(vector22);
        } else {
            f12654n.set(f12651k.scl(dot));
            f12653m.set(f12654n).add(vector2);
        }
        Vector2 vector23 = f12651k;
        Vector2 vector24 = f12653m;
        vector23.set(vector24.f12535x - circle.f12519x, vector24.f12536y - circle.f12520y);
        if (aVar != null) {
            if (f12651k.equals(Vector2.Zero)) {
                f12654n.set(vector22.f12536y - vector2.f12536y, vector2.f12535x - vector22.f12535x);
                aVar.f12665a.set(f12654n).nor();
                aVar.f12666b = circle.radius;
            } else {
                aVar.f12665a.set(f12651k).nor();
                aVar.f12666b = circle.radius - f12651k.len();
            }
        }
        float len2 = f12651k.len2();
        float f11 = circle.radius;
        return len2 <= f11 * f11;
    }

    public static boolean I(Vector2 vector2, Vector2 vector22, Vector2 vector23, float f11) {
        f12660t.set(vector22.f12535x - vector2.f12535x, vector22.f12536y - vector2.f12536y, 0.0f);
        f12661u.set(vector23.f12535x - vector2.f12535x, vector23.f12536y - vector2.f12536y, 0.0f);
        float len = f12660t.len();
        float dot = f12661u.dot(f12660t.nor());
        if (dot <= 0.0f) {
            f12662v.set(vector2.f12535x, vector2.f12536y, 0.0f);
        } else if (dot >= len) {
            f12662v.set(vector22.f12535x, vector22.f12536y, 0.0f);
        } else {
            f12663w.set(f12660t.scl(dot));
            Vector3 vector3 = f12662v;
            Vector3 vector32 = f12663w;
            vector3.set(vector32.f12537x + vector2.f12535x, vector32.f12538y + vector2.f12536y, 0.0f);
        }
        float f12 = vector23.f12535x;
        Vector3 vector33 = f12662v;
        float f13 = f12 - vector33.f12537x;
        float f14 = vector23.f12536y - vector33.f12538y;
        return (f13 * f13) + (f14 * f14) <= f11;
    }

    public static boolean J(Vector3 vector3, Vector3 vector32, Plane plane, Vector3 vector33) {
        Vector3 sub = f12641a.set(vector32).sub(vector3);
        float dot = sub.dot(plane.getNormal());
        if (dot == 0.0f) {
            return false;
        }
        float f11 = (-(vector3.dot(plane.getNormal()) + plane.getD())) / dot;
        if (f11 < 0.0f || f11 > 1.0f) {
            return false;
        }
        vector33.set(vector3).add(sub.scl(f11));
        return true;
    }

    public static boolean K(Vector2 vector2, Vector2 vector22, q qVar) {
        float[] j11 = qVar.j();
        float f11 = vector2.f12535x;
        float f12 = vector2.f12536y;
        float f13 = vector22.f12535x;
        float f14 = vector22.f12536y;
        int length = j11.length;
        float f15 = j11[length - 2];
        float f16 = j11[length - 1];
        int i11 = 0;
        while (i11 < length) {
            float f17 = j11[i11];
            float f18 = j11[i11 + 1];
            float f19 = f18 - f16;
            float f21 = f13 - f11;
            float f22 = f17 - f15;
            float f23 = f14 - f12;
            float f24 = (f19 * f21) - (f22 * f23);
            if (f24 != 0.0f) {
                float f25 = f12 - f16;
                float f26 = f11 - f15;
                float f27 = ((f22 * f25) - (f19 * f26)) / f24;
                if (f27 >= 0.0f && f27 <= 1.0f) {
                    float f28 = ((f21 * f25) - (f23 * f26)) / f24;
                    if (f28 >= 0.0f && f28 <= 1.0f) {
                        return true;
                    }
                }
            }
            i11 += 2;
            f15 = f17;
            f16 = f18;
        }
        return false;
    }

    public static boolean L(float f11, float f12, float f13, float f14, Rectangle rectangle) {
        float f15 = rectangle.f12533x;
        float f16 = f15 + rectangle.width;
        float f17 = rectangle.f12534y;
        float f18 = f17 + rectangle.height;
        if (N(f11, f12, f13, f14, f15, f17, f15, f18, null)) {
            return true;
        }
        float f19 = rectangle.f12533x;
        float f21 = rectangle.f12534y;
        if (N(f11, f12, f13, f14, f19, f21, f16, f21, null) || N(f11, f12, f13, f14, f16, rectangle.f12534y, f16, f18, null) || N(f11, f12, f13, f14, rectangle.f12533x, f18, f16, f18, null)) {
            return true;
        }
        return rectangle.contains(f11, f12);
    }

    public static boolean M(Vector2 vector2, Vector2 vector22, Rectangle rectangle) {
        return L(vector2.f12535x, vector2.f12536y, vector22.f12535x, vector22.f12536y, rectangle);
    }

    public static boolean N(float f11, float f12, float f13, float f14, float f15, float f16, float f17, float f18, Vector2 vector2) {
        float f19 = f18 - f16;
        float f21 = f13 - f11;
        float f22 = f17 - f15;
        float f23 = f14 - f12;
        float f24 = (f19 * f21) - (f22 * f23);
        if (f24 == 0.0f) {
            return false;
        }
        float f25 = f12 - f16;
        float f26 = f11 - f15;
        float f27 = ((f22 * f25) - (f19 * f26)) / f24;
        if (f27 >= 0.0f && f27 <= 1.0f) {
            float f28 = ((f25 * f21) - (f26 * f23)) / f24;
            if (f28 >= 0.0f && f28 <= 1.0f) {
                if (vector2 == null) {
                    return true;
                }
                vector2.set(f11 + (f21 * f27), f12 + (f23 * f27));
                return true;
            }
        }
        return false;
    }

    public static boolean O(Vector2 vector2, Vector2 vector22, Vector2 vector23, Vector2 vector24, Vector2 vector25) {
        return N(vector2.f12535x, vector2.f12536y, vector22.f12535x, vector22.f12536y, vector23.f12535x, vector23.f12536y, vector24.f12535x, vector24.f12536y, vector25);
    }

    public static boolean P(com.badlogic.gdx.utils.a<Vector2> aVar, Vector2 vector2) {
        Vector2 peek = aVar.peek();
        float f11 = vector2.f12535x;
        float f12 = vector2.f12536y;
        int i11 = 0;
        boolean z11 = false;
        while (i11 < aVar.f13179b) {
            Vector2 vector22 = aVar.get(i11);
            float f13 = vector22.f12536y;
            if ((f13 < f12 && peek.f12536y >= f12) || (peek.f12536y < f12 && f13 >= f12)) {
                float f14 = vector22.f12535x;
                if (f14 + (((f12 - f13) / (peek.f12536y - f13)) * (peek.f12535x - f14)) < f11) {
                    z11 = !z11;
                }
            }
            i11++;
            peek = vector22;
        }
        return z11;
    }

    public static boolean Q(float[] fArr, int i11, int i12, float f11, float f12) {
        float f13 = fArr[i11];
        float f14 = fArr[i11 + 1];
        int i13 = i11 + 3;
        int i14 = i11 + i12;
        boolean z11 = false;
        float f15 = f14;
        while (i13 < i14) {
            float f16 = fArr[i13];
            if ((f16 < f12 && f15 >= f12) || (f15 < f12 && f16 >= f12)) {
                float f17 = fArr[i13 - 1];
                if (f17 + (((f12 - f16) / (f15 - f16)) * (fArr[i13 - 3] - f17)) < f11) {
                    z11 = !z11;
                }
            }
            i13 += 2;
            f15 = f16;
        }
        return (((f14 >= f12 || f15 < f12) && (f15 >= f12 || f14 < f12)) || f13 + (((f12 - f14) / (f15 - f14)) * (fArr[i13 + (-3)] - f13)) >= f11) ? z11 : !z11;
    }

    public static boolean R(float f11, float f12, float f13, float f14, float f15, float f16, float f17, float f18) {
        float f19 = f11 - f13;
        float f21 = f12 - f14;
        boolean z11 = ((f15 - f13) * f21) - ((f16 - f14) * f19) > 0.0f;
        if ((((f17 - f13) * f21) - ((f18 - f14) * f19) > 0.0f) == z11) {
            return false;
        }
        return (((((f17 - f15) * (f12 - f16)) - ((f18 - f16) * (f11 - f15))) > 0.0f ? 1 : ((((f17 - f15) * (f12 - f16)) - ((f18 - f16) * (f11 - f15))) == 0.0f ? 0 : -1)) > 0) == z11;
    }

    public static boolean S(Vector2 vector2, Vector2 vector22, Vector2 vector23, Vector2 vector24) {
        return R(vector2.f12535x, vector2.f12536y, vector22.f12535x, vector22.f12536y, vector23.f12535x, vector23.f12536y, vector24.f12535x, vector24.f12536y);
    }

    public static boolean T(Vector3 vector3, Vector3 vector32, Vector3 vector33, Vector3 vector34) {
        Vector3 vector35 = f12641a;
        vector35.set(vector32).sub(vector3);
        Vector3 vector36 = f12642b;
        vector36.set(vector33).sub(vector3);
        Vector3 vector37 = f12643c;
        vector37.set(vector34).sub(vector3);
        vector36.crs(vector37);
        vector37.crs(vector35);
        if (vector36.dot(vector37) < 0.0f) {
            return false;
        }
        vector35.crs(vector37.set(vector33).sub(vector3));
        return vector36.dot(vector35) >= 0.0f;
    }

    public static Vector2 U(float f11, float f12, float f13, float f14, float f15, float f16, Vector2 vector2) {
        float f17 = f13 - f11;
        float f18 = f14 - f12;
        float f19 = (f17 * f17) + (f18 * f18);
        if (f19 == 0.0f) {
            return vector2.set(f11, f12);
        }
        float f21 = (((f15 - f11) * f17) + ((f16 - f12) * f18)) / f19;
        return f21 <= 0.0f ? vector2.set(f11, f12) : f21 >= 1.0f ? vector2.set(f13, f14) : vector2.set(f11 + (f17 * f21), f12 + (f21 * f18));
    }

    public static Vector2 V(Vector2 vector2, Vector2 vector22, Vector2 vector23, Vector2 vector24) {
        float dst2 = vector2.dst2(vector22);
        if (dst2 == 0.0f) {
            return vector24.set(vector2);
        }
        float f11 = vector23.f12535x;
        float f12 = vector2.f12535x;
        float f13 = vector22.f12535x;
        float f14 = vector23.f12536y;
        float f15 = vector2.f12536y;
        float f16 = vector22.f12536y;
        float f17 = (((f11 - f12) * (f13 - f12)) + ((f14 - f15) * (f16 - f15))) / dst2;
        return f17 <= 0.0f ? vector24.set(vector2) : f17 >= 1.0f ? vector24.set(vector22) : vector24.set(f12 + ((f13 - f12) * f17), f15 + (f17 * (f16 - f15)));
    }

    public static boolean W(q qVar, q qVar2) {
        return X(qVar, qVar2, null);
    }

    public static boolean X(q qVar, q qVar2, a aVar) {
        return Z(qVar.j(), qVar2.j(), aVar);
    }

    public static boolean Y(float[] fArr, int i11, int i12, float[] fArr2, int i13, int i14, a aVar) {
        if (aVar != null) {
            aVar.f12666b = Float.MAX_VALUE;
            aVar.f12665a.setZero();
        }
        boolean d02 = d0(fArr2, i13, i14, fArr, i11, i12, aVar, true);
        if (d02) {
            d02 = d0(fArr, i11, i12, fArr2, i13, i14, aVar, false);
        }
        if (d02) {
            return true;
        }
        if (aVar == null) {
            return false;
        }
        aVar.f12666b = 0.0f;
        aVar.f12665a.setZero();
        return false;
    }

    public static boolean Z(float[] fArr, float[] fArr2, a aVar) {
        return Y(fArr, 0, fArr.length, fArr2, 0, fArr2.length, aVar);
    }

    public static float a(float f11, float f12, float f13, float f14) {
        return (f11 * f14) - (f12 * f13);
    }

    public static boolean a0(Circle circle, Circle circle2) {
        return circle.overlaps(circle2);
    }

    public static double b(double d11, double d12, double d13, double d14) {
        return (d11 * d14) - (d12 * d13);
    }

    public static boolean b0(Circle circle, Rectangle rectangle) {
        float f11 = circle.f12519x;
        float f12 = circle.f12520y;
        float f13 = rectangle.f12533x;
        if (f11 >= f13) {
            float f14 = rectangle.width;
            f13 = f11 > f13 + f14 ? f13 + f14 : f11;
        }
        float f15 = rectangle.f12534y;
        if (f12 >= f15) {
            float f16 = rectangle.height;
            f15 = f12 > f15 + f16 ? f15 + f16 : f12;
        }
        float f17 = f13 - f11;
        float f18 = f15 - f12;
        float f19 = (f17 * f17) + (f18 * f18);
        float f21 = circle.radius;
        return f19 < f21 * f21;
    }

    public static float c(float f11, float f12, float f13, float f14, float f15, float f16) {
        float f17 = f13 - f11;
        float f18 = f14 - f12;
        return Math.abs(((f15 - f11) * f18) - ((f16 - f12) * f17)) / Vector2.len(f17, f18);
    }

    public static boolean c0(Rectangle rectangle, Rectangle rectangle2) {
        return rectangle.overlaps(rectangle2);
    }

    public static float d(float f11, float f12, float f13, float f14, float f15, float f16) {
        return U(f11, f12, f13, f14, f15, f16, f12651k).dst(f15, f16);
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x00be, code lost:
    
        if (r8 != false) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00c1, code lost:
    
        r3 = -r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00d1, code lost:
    
        if (r14 != false) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00d3, code lost:
    
        if (r15 == false) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00e5, code lost:
    
        r24.f12665a.set(r6, r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00d7, code lost:
    
        if (r5 <= r4) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00d9, code lost:
    
        r4 = r23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00dd, code lost:
    
        if (r4 == false) goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00e0, code lost:
    
        r6 = -r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00e1, code lost:
    
        if (r4 == false) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00e4, code lost:
    
        r3 = -r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00dc, code lost:
    
        r4 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x00cf, code lost:
    
        if (r8 != false) goto L54;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean d0(float[] r18, int r19, int r20, float[] r21, int r22, int r23, com.badlogic.gdx.math.m.a r24, boolean r25) {
        /*
            Method dump skipped, instructions count: 241
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.badlogic.gdx.math.m.d0(float[], int, int, float[], int, int, com.badlogic.gdx.math.m$a, boolean):boolean");
    }

    public static float e(Vector2 vector2, Vector2 vector22, Vector2 vector23) {
        return V(vector2, vector22, vector23, f12651k).dst(vector23);
    }

    public static int e0(float f11, float f12, float f13, float f14, float f15, float f16) {
        return (int) Math.signum(((f13 - f11) * (f16 - f12)) - ((f14 - f12) * (f15 - f11)));
    }

    public static boolean f(Vector3[] vector3Arr, Vector3[] vector3Arr2, Vector3[] vector3Arr3) {
        for (Vector3 vector3 : vector3Arr) {
            float f11 = -3.4028235E38f;
            float f12 = Float.MAX_VALUE;
            float f13 = -3.4028235E38f;
            float f14 = Float.MAX_VALUE;
            for (Vector3 vector32 : vector3Arr2) {
                float dot = vector32.dot(vector3);
                f14 = Math.min(f14, dot);
                f13 = Math.max(f13, dot);
            }
            for (Vector3 vector33 : vector3Arr3) {
                float dot2 = vector33.dot(vector3);
                f12 = Math.min(f12, dot2);
                f11 = Math.max(f11, dot2);
            }
            if (f13 < f12 || f11 < f14) {
                return false;
            }
        }
        return true;
    }

    public static int f0(Vector2 vector2, Vector2 vector22, Vector2 vector23) {
        float f11 = vector22.f12535x;
        float f12 = vector2.f12535x;
        float f13 = vector23.f12536y;
        float f14 = vector2.f12536y;
        return (int) Math.signum(((f11 - f12) * (f13 - f14)) - ((vector22.f12536y - f14) * (vector23.f12535x - f12)));
    }

    public static boolean g(Vector3 vector3, Vector3 vector32, Vector3 vector33, float f11) {
        return Math.abs(vector33.dot(vector3) - f11) <= ((vector32.f12537x * Math.abs(vector33.f12537x)) + (vector32.f12538y * Math.abs(vector33.f12538y))) + (vector32.f12539z * Math.abs(vector33.f12539z));
    }

    public static void g0(float[] fArr, int i11, int i12, int i13, Plane plane, float[] fArr2, int i14) {
        float k11 = k(fArr[i11], fArr[i11 + 1], fArr[i11 + 2], fArr[i12], fArr[i12 + 1], fArr[i12 + 2], plane, f12664x);
        Vector3 vector3 = f12664x;
        fArr2[i14] = vector3.f12537x;
        fArr2[i14 + 1] = vector3.f12538y;
        fArr2[i14 + 2] = vector3.f12539z;
        for (int i15 = 3; i15 < i13; i15++) {
            float f11 = fArr[i11 + i15];
            fArr2[i14 + i15] = f11 + ((fArr[i12 + i15] - f11) * k11);
        }
    }

    public static boolean h(BoundingBox boundingBox, Plane plane) {
        return g(boundingBox.getCenter(f12661u), boundingBox.getDimensions(f12662v).scl(0.5f), plane.normal, plane.f12528d);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void h0(float[] fArr, Plane plane, b bVar) {
        int length = fArr.length / 3;
        Plane.PlaneSide testPoint = plane.testPoint(fArr[0], fArr[1], fArr[2]);
        Plane.PlaneSide planeSide = Plane.PlaneSide.Back;
        int i11 = testPoint == planeSide ? 1 : 0;
        int i12 = plane.testPoint(fArr[length], fArr[length + 1], fArr[length + 2]) == planeSide ? 1 : 0;
        int i13 = length * 2;
        int i14 = plane.testPoint(fArr[i13], fArr[i13 + 1], fArr[i13 + 2]) == planeSide ? 1 : 0;
        bVar.c();
        if (i11 == i12 && i12 == i14) {
            bVar.f12672f = 1;
            if (i11 != 0) {
                bVar.f12671e = 1;
                System.arraycopy(fArr, 0, bVar.f12668b, 0, fArr.length);
                return;
            } else {
                bVar.f12670d = 1;
                System.arraycopy(fArr, 0, bVar.f12667a, 0, fArr.length);
                return;
            }
        }
        bVar.f12672f = 3;
        int i15 = (i11 ^ 1) + (i12 ^ 1) + (i14 ^ 1);
        bVar.f12670d = i15;
        bVar.f12671e = 3 - i15;
        bVar.d(i11 ^ 1);
        int i16 = length;
        if (i11 != i12) {
            g0(fArr, 0, i16, i16, plane, bVar.f12669c, 0);
            bVar.a(fArr, 0, i16);
            bVar.a(bVar.f12669c, 0, i16);
            bVar.d(!bVar.b());
            bVar.a(bVar.f12669c, 0, i16);
        } else {
            bVar.a(fArr, 0, i16);
        }
        int i17 = i16 + i16;
        if (i12 != i14) {
            g0(fArr, i16, i17, i16, plane, bVar.f12669c, 0);
            i16 = i16;
            i17 = i17;
            bVar.a(fArr, i16, i16);
            bVar.a(bVar.f12669c, 0, i16);
            bVar.d(!bVar.b());
            bVar.a(bVar.f12669c, 0, i16);
        } else {
            bVar.a(fArr, i16, i16);
        }
        if (i14 != i11) {
            int i18 = i16;
            g0(fArr, i17, 0, i18, plane, bVar.f12669c, 0);
            i16 = i18;
            bVar.a(fArr, i17, i16);
            bVar.a(bVar.f12669c, 0, i16);
            bVar.d(!bVar.b());
            bVar.a(bVar.f12669c, 0, i16);
        } else {
            bVar.a(fArr, i17, i16);
        }
        if (bVar.f12670d == 2) {
            float[] fArr2 = bVar.f12667a;
            System.arraycopy(fArr2, i13, fArr2, i16 * 3, i13);
            float[] fArr3 = bVar.f12667a;
            System.arraycopy(fArr3, 0, fArr3, i16 * 5, i16);
            return;
        }
        float[] fArr4 = bVar.f12668b;
        System.arraycopy(fArr4, i13, fArr4, i16 * 3, i13);
        float[] fArr5 = bVar.f12668b;
        System.arraycopy(fArr5, 0, fArr5, i16 * 5, i16);
    }

    public static boolean i(j jVar, BoundingBox boundingBox) {
        if (jVar.f(boundingBox.getCorner000(f12660t)) || jVar.f(boundingBox.getCorner001(f12660t)) || jVar.f(boundingBox.getCorner010(f12660t)) || jVar.f(boundingBox.getCorner011(f12660t)) || jVar.f(boundingBox.getCorner100(f12660t)) || jVar.f(boundingBox.getCorner101(f12660t)) || jVar.f(boundingBox.getCorner110(f12660t)) || jVar.f(boundingBox.getCorner111(f12660t))) {
            return true;
        }
        boolean z11 = false;
        for (Vector3 vector3 : jVar.f12610b) {
            z11 |= boundingBox.contains(vector3);
        }
        return z11;
    }

    public static boolean j(j jVar, OrientedBoundingBox orientedBoundingBox) {
        boolean z11 = false;
        for (Vector3 vector3 : orientedBoundingBox.getVertices()) {
            z11 |= jVar.f(vector3);
        }
        if (z11) {
            return true;
        }
        boolean z12 = false;
        for (Vector3 vector32 : jVar.f12610b) {
            z12 |= orientedBoundingBox.contains(vector32);
        }
        return z12;
    }

    public static float k(float f11, float f12, float f13, float f14, float f15, float f16, Plane plane, Vector3 vector3) {
        Vector3 sub = f12660t.set(f14, f15, f16).sub(f11, f12, f13);
        Vector3 vector32 = f12662v.set(f11, f12, f13);
        float dot = sub.dot(plane.getNormal());
        if (dot != 0.0f) {
            float f17 = (-(vector32.dot(plane.getNormal()) + plane.getD())) / dot;
            if (vector3 != null) {
                vector3.set(vector32).add(sub.scl(f17));
            }
            return f17;
        }
        if (plane.testPoint(vector32) != Plane.PlaneSide.OnPlane) {
            return -1.0f;
        }
        if (vector3 != null) {
            vector3.set(vector32);
        }
        return 0.0f;
    }

    public static boolean l(Vector2 vector2, Vector2 vector22, q qVar) {
        float[] j11 = qVar.j();
        float f11 = vector2.f12535x;
        float f12 = vector2.f12536y;
        float f13 = vector22.f12535x;
        float f14 = vector22.f12536y;
        int length = j11.length;
        float f15 = j11[length - 2];
        float f16 = j11[length - 1];
        int i11 = 0;
        while (i11 < length) {
            float f17 = j11[i11];
            float f18 = j11[i11 + 1];
            float f19 = f18 - f16;
            float f21 = f17 - f15;
            float f22 = ((f13 - f11) * f19) - ((f14 - f12) * f21);
            if (f22 != 0.0f) {
                float f23 = ((f21 * (f12 - f16)) - (f19 * (f11 - f15))) / f22;
                if (f23 >= 0.0f && f23 <= 1.0f) {
                    return true;
                }
            }
            i11 += 2;
            f15 = f17;
            f16 = f18;
        }
        return false;
    }

    public static boolean m(float f11, float f12, float f13, float f14, float f15, float f16, float f17, float f18, Vector2 vector2) {
        float f19 = f18 - f16;
        float f21 = f13 - f11;
        float f22 = f17 - f15;
        float f23 = f14 - f12;
        float f24 = (f19 * f21) - (f22 * f23);
        if (f24 == 0.0f) {
            return false;
        }
        if (vector2 == null) {
            return true;
        }
        float f25 = ((f22 * (f12 - f16)) - (f19 * (f11 - f15))) / f24;
        vector2.set(f11 + (f21 * f25), f12 + (f23 * f25));
        return true;
    }

    public static boolean n(Vector2 vector2, Vector2 vector22, Vector2 vector23, Vector2 vector24, Vector2 vector25) {
        return m(vector2.f12535x, vector2.f12536y, vector22.f12535x, vector22.f12536y, vector23.f12535x, vector23.f12536y, vector24.f12535x, vector24.f12536y, vector25);
    }

    public static boolean o(Plane plane, Plane plane2, Plane plane3, Vector3 vector3) {
        f12661u.set(plane.normal).crs(plane2.normal);
        f12662v.set(plane2.normal).crs(plane3.normal);
        f12663w.set(plane3.normal).crs(plane.normal);
        float f11 = -plane.normal.dot(f12662v);
        if (Math.abs(f11) < 1.0E-6f) {
            return false;
        }
        f12661u.scl(plane3.f12528d);
        f12662v.scl(plane.f12528d);
        f12663w.scl(plane2.f12528d);
        Vector3 vector32 = f12661u;
        float f12 = vector32.f12537x;
        Vector3 vector33 = f12662v;
        float f13 = f12 + vector33.f12537x;
        Vector3 vector34 = f12663w;
        vector3.set(f13 + vector34.f12537x, vector32.f12538y + vector33.f12538y + vector34.f12538y, vector32.f12539z + vector33.f12539z + vector34.f12539z);
        vector3.scl(1.0f / f11);
        return true;
    }

    public static boolean p(a3.r rVar, a3.r rVar2) {
        int i11 = rVar.f1626b;
        int i12 = i11 - 2;
        int i13 = rVar2.f1626b;
        int i14 = i13 - 2;
        float[] fArr = rVar.f1625a;
        float[] fArr2 = rVar2.f1625a;
        float f11 = fArr[i12];
        float f12 = fArr[i11 - 1];
        float f13 = f11;
        int i15 = 0;
        while (i15 <= i12) {
            float f14 = fArr[i15];
            float f15 = fArr[i15 + 1];
            float f16 = fArr2[i14];
            float f17 = fArr2[i13 - 1];
            float f18 = f16;
            int i16 = 0;
            while (i16 <= i14) {
                float f19 = fArr2[i16];
                float f21 = fArr2[i16 + 1];
                if (N(f13, f12, f14, f15, f18, f17, f19, f21, null)) {
                    return true;
                }
                i16 += 2;
                f18 = f19;
                f17 = f21;
            }
            i15 += 2;
            f13 = f14;
            f12 = f15;
        }
        return false;
    }

    public static boolean q(a3.r rVar, a3.r rVar2) {
        float[] fArr = rVar.f1625a;
        int i11 = rVar.f1626b;
        float[] fArr2 = rVar2.f1625a;
        if (Q(fArr, 0, i11, fArr2[0], fArr2[1])) {
            return true;
        }
        float[] fArr3 = rVar2.f1625a;
        int i12 = rVar2.f1626b;
        float[] fArr4 = rVar.f1625a;
        if (Q(fArr3, 0, i12, fArr4[0], fArr4[1])) {
            return true;
        }
        return p(rVar, rVar2);
    }

    public static boolean r(q qVar, q qVar2, q qVar3) {
        if (qVar.m().length != 0 && qVar2.m().length != 0) {
            Vector2 vector2 = f12646f;
            Vector2 vector22 = f12647g;
            Vector2 vector23 = f12648h;
            Vector2 vector24 = f12649i;
            Vector2 vector25 = f12650j;
            a3.r rVar = f12644d;
            a3.r rVar2 = f12645e;
            rVar.i();
            rVar2.i();
            rVar2.g(qVar.j());
            float[] j11 = qVar2.j();
            int length = j11.length - 2;
            int i11 = 0;
            while (true) {
                boolean z11 = true;
                if (i11 <= length) {
                    vector22.set(j11[i11], j11[i11 + 1]);
                    if (i11 < length) {
                        vector23.set(j11[i11 + 2], j11[i11 + 3]);
                    } else {
                        vector23.set(j11[0], j11[1]);
                    }
                    int i12 = rVar2.f1626b;
                    if (i12 == 0) {
                        return false;
                    }
                    vector24.set(rVar2.n(i12 - 2), rVar2.n(rVar2.f1626b - 1));
                    int i13 = 0;
                    while (i13 < rVar2.f1626b) {
                        boolean z12 = z11;
                        vector25.set(rVar2.n(i13), rVar2.n(i13 + 1));
                        boolean z13 = f0(vector23, vector22, vector24) > 0 ? z12 : false;
                        if (f0(vector23, vector22, vector25) > 0) {
                            if (!z13) {
                                n(vector24, vector25, vector22, vector23, vector2);
                                int i14 = rVar.f1626b;
                                if (i14 < 2 || rVar.n(i14 - 2) != vector2.f12535x || rVar.n(rVar.f1626b - 1) != vector2.f12536y) {
                                    rVar.a(vector2.f12535x);
                                    rVar.a(vector2.f12536y);
                                }
                            }
                            rVar.a(vector25.f12535x);
                            rVar.a(vector25.f12536y);
                        } else if (z13) {
                            n(vector24, vector25, vector22, vector23, vector2);
                            rVar.a(vector2.f12535x);
                            rVar.a(vector2.f12536y);
                        }
                        vector24.set(vector25.f12535x, vector25.f12536y);
                        i13 += 2;
                        z11 = z12;
                    }
                    rVar2.i();
                    rVar2.e(rVar);
                    rVar.i();
                    i11 += 2;
                } else {
                    if (rVar2.f1626b >= 6 && rVar2.n(0) == rVar2.n(rVar2.f1626b - 2) && rVar2.n(1) == rVar2.n(rVar2.f1626b - 1)) {
                        rVar2.I(rVar2.f1626b - 2);
                    }
                    if (rVar2.f1626b >= 6) {
                        if (qVar3 == null) {
                            return true;
                        }
                        qVar3.p();
                        if (qVar3.m().length == rVar2.f1626b) {
                            System.arraycopy(rVar2.f1625a, 0, qVar3.m(), 0, rVar2.f1626b);
                            return true;
                        }
                        qVar3.x(rVar2.N());
                        return true;
                    }
                }
            }
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:113:0x01f7 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0212  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0227  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x023c  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x023f  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x022a  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0215  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x015e  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x01af  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean s(com.badlogic.gdx.math.collision.Ray r10, com.badlogic.gdx.math.collision.BoundingBox r11, com.badlogic.gdx.math.Vector3 r12) {
        /*
            Method dump skipped, instructions count: 586
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.badlogic.gdx.math.m.s(com.badlogic.gdx.math.collision.Ray, com.badlogic.gdx.math.collision.BoundingBox, com.badlogic.gdx.math.Vector3):boolean");
    }

    public static boolean t(Ray ray, Vector3 vector3, Vector3 vector32) {
        Vector3 vector33 = ray.direction;
        float f11 = 1.0f / vector33.f12537x;
        float f12 = 1.0f / vector33.f12538y;
        float f13 = 1.0f / vector33.f12539z;
        float f14 = vector3.f12537x;
        float f15 = vector32.f12537x;
        Vector3 vector34 = ray.origin;
        float f16 = vector34.f12537x;
        float f17 = ((f14 - (f15 * 0.5f)) - f16) * f11;
        float f18 = ((f14 + (f15 * 0.5f)) - f16) * f11;
        if (f17 > f18) {
            f17 = f18;
            f18 = f17;
        }
        float f19 = vector3.f12538y;
        float f21 = vector32.f12538y;
        float f22 = vector34.f12538y;
        float f23 = ((f19 - (f21 * 0.5f)) - f22) * f12;
        float f24 = ((f19 + (f21 * 0.5f)) - f22) * f12;
        if (f23 > f24) {
            f23 = f24;
            f24 = f23;
        }
        float f25 = vector3.f12539z;
        float f26 = vector32.f12539z;
        float f27 = vector34.f12539z;
        float f28 = ((f25 - (f26 * 0.5f)) - f27) * f13;
        float f29 = ((f25 + (f26 * 0.5f)) - f27) * f13;
        if (f28 > f29) {
            f28 = f29;
            f29 = f28;
        }
        float max = Math.max(Math.max(f17, f23), f28);
        float min = Math.min(Math.min(f18, f24), f29);
        return min >= 0.0f && min >= max;
    }

    public static boolean u(Ray ray, BoundingBox boundingBox) {
        return t(ray, boundingBox.getCenter(f12661u), boundingBox.getDimensions(f12662v));
    }

    /* JADX WARN: Code restructure failed: missing block: B:50:0x012f, code lost:
    
        if ((r2 + r18.max.f12539z) >= 0.0f) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x00d1, code lost:
    
        if ((r5 + r18.max.f12538y) >= 0.0f) goto L44;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean v(com.badlogic.gdx.math.collision.Ray r17, com.badlogic.gdx.math.collision.BoundingBox r18, com.badlogic.gdx.math.Matrix4 r19, com.badlogic.gdx.math.Vector3 r20) {
        /*
            Method dump skipped, instructions count: 313
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.badlogic.gdx.math.m.v(com.badlogic.gdx.math.collision.Ray, com.badlogic.gdx.math.collision.BoundingBox, com.badlogic.gdx.math.Matrix4, com.badlogic.gdx.math.Vector3):boolean");
    }

    public static boolean w(Ray ray, OrientedBoundingBox orientedBoundingBox, Vector3 vector3) {
        return v(ray, orientedBoundingBox.getBounds(), orientedBoundingBox.getTransform(), vector3);
    }

    public static boolean x(Ray ray, BoundingBox boundingBox, Matrix4 matrix4) {
        return v(ray, boundingBox, matrix4, null);
    }

    public static boolean y(Ray ray, OrientedBoundingBox orientedBoundingBox) {
        return w(ray, orientedBoundingBox, null);
    }

    public static boolean z(Ray ray, Plane plane, Vector3 vector3) {
        float dot = ray.direction.dot(plane.getNormal());
        if (dot == 0.0f) {
            if (plane.testPoint(ray.origin) != Plane.PlaneSide.OnPlane) {
                return false;
            }
            if (vector3 != null) {
                vector3.set(ray.origin);
            }
            return true;
        }
        float f11 = (-(ray.origin.dot(plane.getNormal()) + plane.getD())) / dot;
        if (f11 < 0.0f) {
            return false;
        }
        if (vector3 != null) {
            vector3.set(ray.origin).add(f12641a.set(ray.direction).scl(f11));
        }
        return true;
    }
}
