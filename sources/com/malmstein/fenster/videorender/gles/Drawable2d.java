package com.malmstein.fenster.videorender.gles;

import java.nio.FloatBuffer;
import qs.d;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public class Drawable2d {

    /* renamed from: h, reason: collision with root package name */
    public static final int f39203h = 4;

    /* renamed from: i, reason: collision with root package name */
    public static final float[] f39204i;

    /* renamed from: j, reason: collision with root package name */
    public static final float[] f39205j;

    /* renamed from: k, reason: collision with root package name */
    public static final FloatBuffer f39206k;

    /* renamed from: l, reason: collision with root package name */
    public static final FloatBuffer f39207l;

    /* renamed from: m, reason: collision with root package name */
    public static final float[] f39208m;

    /* renamed from: n, reason: collision with root package name */
    public static final float[] f39209n;

    /* renamed from: o, reason: collision with root package name */
    public static final FloatBuffer f39210o;

    /* renamed from: p, reason: collision with root package name */
    public static final FloatBuffer f39211p;

    /* renamed from: q, reason: collision with root package name */
    public static final float[] f39212q;

    /* renamed from: r, reason: collision with root package name */
    public static final float[] f39213r;

    /* renamed from: s, reason: collision with root package name */
    public static final FloatBuffer f39214s;

    /* renamed from: t, reason: collision with root package name */
    public static final FloatBuffer f39215t;

    /* renamed from: a, reason: collision with root package name */
    public FloatBuffer f39216a;

    /* renamed from: b, reason: collision with root package name */
    public FloatBuffer f39217b;

    /* renamed from: c, reason: collision with root package name */
    public int f39218c;

    /* renamed from: d, reason: collision with root package name */
    public int f39219d;

    /* renamed from: e, reason: collision with root package name */
    public int f39220e;

    /* renamed from: f, reason: collision with root package name */
    public int f39221f;

    /* renamed from: g, reason: collision with root package name */
    public Prefab f39222g;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public enum Prefab {
        TRIANGLE,
        RECTANGLE,
        FULL_RECTANGLE
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f39223a;

        static {
            int[] iArr = new int[Prefab.values().length];
            f39223a = iArr;
            try {
                iArr[Prefab.TRIANGLE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f39223a[Prefab.RECTANGLE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f39223a[Prefab.FULL_RECTANGLE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    static {
        float[] fArr = {0.0f, 0.57735026f, -0.5f, -0.28867513f, 0.5f, -0.28867513f};
        f39204i = fArr;
        float[] fArr2 = {0.5f, 0.0f, 0.0f, 1.0f, 1.0f, 1.0f};
        f39205j = fArr2;
        f39206k = d.c(fArr);
        f39207l = d.c(fArr2);
        float[] fArr3 = {-0.5f, -0.5f, 0.5f, -0.5f, -0.5f, 0.5f, 0.5f, 0.5f};
        f39208m = fArr3;
        float[] fArr4 = {0.0f, 1.0f, 1.0f, 1.0f, 0.0f, 0.0f, 1.0f, 0.0f};
        f39209n = fArr4;
        f39210o = d.c(fArr3);
        f39211p = d.c(fArr4);
        float[] fArr5 = {-1.0f, -1.0f, 1.0f, -1.0f, -1.0f, 1.0f, 1.0f, 1.0f};
        f39212q = fArr5;
        float[] fArr6 = {0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 1.0f, 1.0f, 1.0f};
        f39213r = fArr6;
        f39214s = d.c(fArr5);
        f39215t = d.c(fArr6);
    }

    public Drawable2d(Prefab shape) {
        int i11 = a.f39223a[shape.ordinal()];
        if (i11 == 1) {
            this.f39216a = f39206k;
            this.f39217b = f39207l;
            this.f39219d = 2;
            this.f39220e = 2 * 4;
            this.f39218c = f39204i.length / 2;
        } else if (i11 == 2) {
            this.f39216a = f39210o;
            this.f39217b = f39211p;
            this.f39219d = 2;
            this.f39220e = 2 * 4;
            this.f39218c = f39208m.length / 2;
        } else {
            if (i11 != 3) {
                throw new RuntimeException("Unknown shape " + shape);
            }
            this.f39216a = f39214s;
            this.f39217b = f39215t;
            this.f39219d = 2;
            this.f39220e = 2 * 4;
            this.f39218c = f39212q.length / 2;
        }
        this.f39221f = 8;
        this.f39222g = shape;
    }

    public int a() {
        return this.f39219d;
    }

    public FloatBuffer b() {
        return this.f39217b;
    }

    public int c() {
        return this.f39221f;
    }

    public FloatBuffer d() {
        return this.f39216a;
    }

    public int e() {
        return this.f39218c;
    }

    public int f() {
        return this.f39220e;
    }

    public String toString() {
        if (this.f39222g == null) {
            return "[Drawable2d: ...]";
        }
        return "[Drawable2d: " + this.f39222g + "]";
    }
}
