package pl;

import java.lang.reflect.Array;
import org.junit.jupiter.api.j2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes6.dex */
public class g {

    /* renamed from: a, reason: collision with root package name */
    public static final float f80812a = 3.1415927f;

    /* renamed from: b, reason: collision with root package name */
    public static final float f80813b = 6.2831855f;

    /* renamed from: c, reason: collision with root package name */
    public static final float f80814c = 0.15915494f;

    /* renamed from: d, reason: collision with root package name */
    public static final float f80815d = 57.295776f;

    /* renamed from: e, reason: collision with root package name */
    public static final float f80816e = 57.295776f;

    /* renamed from: f, reason: collision with root package name */
    public static final float f80817f = 0.017453292f;

    /* renamed from: g, reason: collision with root package name */
    public static final float f80818g = 0.017453292f;

    public static void a(Object obj, int i11, Object obj2, int i12, int i13) {
        if (obj == null) {
            throw new IllegalArgumentException("src cannot be null.");
        }
        if (obj2 == null) {
            throw new IllegalArgumentException("dest cannot be null.");
        }
        try {
            System.arraycopy(obj, i11, obj2, i12, i13);
        } catch (ArrayIndexOutOfBoundsException unused) {
            throw new ArrayIndexOutOfBoundsException("Src: " + Array.getLength(obj) + j2.O + i11 + ", dest: " + Array.getLength(obj2) + j2.O + i12 + ", count: " + i13);
        }
    }

    public static float b(float f11, float f12) {
        return (float) Math.atan2(f11, f12);
    }

    public static float c(float f11, float f12) {
        return ((float) Math.atan2(f11, f12)) * 57.295776f;
    }

    public static float d(float f11) {
        return (float) Math.cos(f11);
    }

    public static float e(float f11) {
        return (float) Math.cos(f11 * 0.017453292f);
    }

    public static float f(float f11) {
        return (float) Math.sin(f11);
    }

    public static float g(float f11) {
        return (float) Math.sin(f11 * 0.017453292f);
    }
}
