package h1;

import android.graphics.PointF;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;
import androidx.annotation.Nullable;
import androidx.collection.SparseArrayCompat;
import androidx.core.view.animation.PathInterpolatorCompat;
import androidx.media3.exoplayer.upstream.CmcdData;
import com.airbnb.lottie.parser.moshi.JsonReader;
import java.io.IOException;
import java.lang.ref.WeakReference;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public class t {

    /* renamed from: a, reason: collision with root package name */
    public static final float f57938a = 100.0f;

    /* renamed from: c, reason: collision with root package name */
    public static SparseArrayCompat<WeakReference<Interpolator>> f57940c;

    /* renamed from: b, reason: collision with root package name */
    public static final Interpolator f57939b = new LinearInterpolator();

    /* renamed from: d, reason: collision with root package name */
    public static JsonReader.a f57941d = JsonReader.a.a("t", "s", "e", "o", "i", CmcdData.STREAMING_FORMAT_HLS, "to", "ti");

    /* renamed from: e, reason: collision with root package name */
    public static JsonReader.a f57942e = JsonReader.a.a("x", "y");

    @Nullable
    public static WeakReference<Interpolator> a(int i11) {
        WeakReference<Interpolator> weakReference;
        synchronized (t.class) {
            weakReference = g().get(i11);
        }
        return weakReference;
    }

    public static Interpolator b(PointF pointF, PointF pointF2) {
        Interpolator create;
        pointF.x = j1.i.c(pointF.x, -1.0f, 1.0f);
        pointF.y = j1.i.c(pointF.y, -100.0f, 100.0f);
        pointF2.x = j1.i.c(pointF2.x, -1.0f, 1.0f);
        float c11 = j1.i.c(pointF2.y, -100.0f, 100.0f);
        pointF2.y = c11;
        int i11 = j1.j.i(pointF.x, pointF.y, pointF2.x, c11);
        WeakReference<Interpolator> a11 = a(i11);
        Interpolator interpolator = a11 != null ? a11.get() : null;
        if (a11 != null && interpolator != null) {
            return interpolator;
        }
        try {
            create = PathInterpolatorCompat.create(pointF.x, pointF.y, pointF2.x, pointF2.y);
        } catch (IllegalArgumentException e11) {
            create = "The Path cannot loop back on itself.".equals(e11.getMessage()) ? PathInterpolatorCompat.create(Math.min(pointF.x, 1.0f), pointF.y, Math.max(pointF2.x, 0.0f), pointF2.y) : new LinearInterpolator();
        }
        try {
            h(i11, new WeakReference(create));
        } catch (ArrayIndexOutOfBoundsException unused) {
        }
        return create;
    }

    public static <T> k1.a<T> c(JsonReader jsonReader, com.airbnb.lottie.k kVar, float f11, n0<T> n0Var, boolean z11, boolean z12) throws IOException {
        return (z11 && z12) ? e(kVar, jsonReader, f11, n0Var) : z11 ? d(kVar, jsonReader, f11, n0Var) : f(jsonReader, f11, n0Var);
    }

    public static <T> k1.a<T> d(com.airbnb.lottie.k kVar, JsonReader jsonReader, float f11, n0<T> n0Var) throws IOException {
        Interpolator b11;
        T t11;
        jsonReader.e();
        PointF pointF = null;
        T t12 = null;
        T t13 = null;
        PointF pointF2 = null;
        PointF pointF3 = null;
        float f12 = 0.0f;
        boolean z11 = false;
        PointF pointF4 = null;
        while (jsonReader.k()) {
            switch (jsonReader.S(f57941d)) {
                case 0:
                    f12 = (float) jsonReader.r();
                    break;
                case 1:
                    t13 = n0Var.a(jsonReader, f11);
                    break;
                case 2:
                    t12 = n0Var.a(jsonReader, f11);
                    break;
                case 3:
                    pointF = s.e(jsonReader, 1.0f);
                    break;
                case 4:
                    pointF4 = s.e(jsonReader, 1.0f);
                    break;
                case 5:
                    if (jsonReader.w() != 1) {
                        z11 = false;
                        break;
                    } else {
                        z11 = true;
                        break;
                    }
                case 6:
                    pointF2 = s.e(jsonReader, f11);
                    break;
                case 7:
                    pointF3 = s.e(jsonReader, f11);
                    break;
                default:
                    jsonReader.V();
                    break;
            }
        }
        jsonReader.j();
        if (z11) {
            b11 = f57939b;
            t11 = t13;
        } else {
            b11 = (pointF == null || pointF4 == null) ? f57939b : b(pointF, pointF4);
            t11 = t12;
        }
        k1.a<T> aVar = new k1.a<>(kVar, t13, t11, b11, f12, null);
        aVar.f64889o = pointF2;
        aVar.f64890p = pointF3;
        return aVar;
    }

    public static <T> k1.a<T> e(com.airbnb.lottie.k kVar, JsonReader jsonReader, float f11, n0<T> n0Var) throws IOException {
        Interpolator interpolator;
        Interpolator b11;
        Interpolator b12;
        T t11;
        Interpolator interpolator2;
        PointF pointF;
        PointF pointF2;
        k1.a<T> aVar;
        PointF pointF3;
        boolean z11;
        float f12;
        jsonReader.e();
        boolean z12 = false;
        PointF pointF4 = null;
        PointF pointF5 = null;
        PointF pointF6 = null;
        T t12 = null;
        PointF pointF7 = null;
        PointF pointF8 = null;
        PointF pointF9 = null;
        PointF pointF10 = null;
        PointF pointF11 = null;
        float f13 = 0.0f;
        T t13 = null;
        while (jsonReader.k()) {
            switch (jsonReader.S(f57941d)) {
                case 0:
                    f13 = (float) jsonReader.r();
                    break;
                case 1:
                    t12 = n0Var.a(jsonReader, f11);
                    break;
                case 2:
                    t13 = n0Var.a(jsonReader, f11);
                    break;
                case 3:
                    boolean z13 = z12;
                    if (jsonReader.I() == JsonReader.Token.BEGIN_OBJECT) {
                        jsonReader.e();
                        float f14 = 0.0f;
                        float f15 = 0.0f;
                        float f16 = 0.0f;
                        float f17 = 0.0f;
                        while (jsonReader.k()) {
                            int S = jsonReader.S(f57942e);
                            if (S == 0) {
                                pointF3 = pointF8;
                                JsonReader.Token I = jsonReader.I();
                                JsonReader.Token token = JsonReader.Token.NUMBER;
                                if (I == token) {
                                    f16 = (float) jsonReader.r();
                                    f14 = f16;
                                } else {
                                    jsonReader.c();
                                    f14 = (float) jsonReader.r();
                                    f16 = jsonReader.I() == token ? (float) jsonReader.r() : f14;
                                    jsonReader.f();
                                }
                            } else if (S != 1) {
                                jsonReader.V();
                            } else {
                                JsonReader.Token I2 = jsonReader.I();
                                JsonReader.Token token2 = JsonReader.Token.NUMBER;
                                if (I2 == token2) {
                                    pointF3 = pointF8;
                                    f17 = (float) jsonReader.r();
                                    f15 = f17;
                                } else {
                                    pointF3 = pointF8;
                                    jsonReader.c();
                                    f15 = (float) jsonReader.r();
                                    f17 = jsonReader.I() == token2 ? (float) jsonReader.r() : f15;
                                    jsonReader.f();
                                }
                            }
                            pointF8 = pointF3;
                        }
                        pointF6 = new PointF(f14, f15);
                        pointF7 = new PointF(f16, f17);
                        jsonReader.j();
                    } else {
                        pointF4 = s.e(jsonReader, f11);
                    }
                    z12 = z13;
                    break;
                case 4:
                    if (jsonReader.I() != JsonReader.Token.BEGIN_OBJECT) {
                        pointF5 = s.e(jsonReader, f11);
                        break;
                    } else {
                        jsonReader.e();
                        float f18 = 0.0f;
                        float f19 = 0.0f;
                        float f21 = 0.0f;
                        float f22 = 0.0f;
                        while (jsonReader.k()) {
                            int S2 = jsonReader.S(f57942e);
                            if (S2 != 0) {
                                z11 = z12;
                                if (S2 != 1) {
                                    jsonReader.V();
                                } else {
                                    JsonReader.Token I3 = jsonReader.I();
                                    JsonReader.Token token3 = JsonReader.Token.NUMBER;
                                    if (I3 == token3) {
                                        f22 = (float) jsonReader.r();
                                        f19 = f22;
                                    } else {
                                        jsonReader.c();
                                        PointF pointF12 = pointF10;
                                        float r11 = (float) jsonReader.r();
                                        f22 = jsonReader.I() == token3 ? (float) jsonReader.r() : r11;
                                        jsonReader.f();
                                        pointF10 = pointF12;
                                        f19 = r11;
                                    }
                                }
                            } else {
                                z11 = z12;
                                PointF pointF13 = pointF10;
                                JsonReader.Token I4 = jsonReader.I();
                                JsonReader.Token token4 = JsonReader.Token.NUMBER;
                                if (I4 == token4) {
                                    pointF10 = pointF13;
                                    f21 = (float) jsonReader.r();
                                    f18 = f21;
                                } else {
                                    pointF10 = pointF13;
                                    jsonReader.c();
                                    float r12 = (float) jsonReader.r();
                                    if (jsonReader.I() == token4) {
                                        f12 = r12;
                                        f21 = (float) jsonReader.r();
                                    } else {
                                        f12 = r12;
                                        f21 = f12;
                                    }
                                    jsonReader.f();
                                    f18 = f12;
                                }
                            }
                            z12 = z11;
                        }
                        PointF pointF14 = new PointF(f18, f19);
                        PointF pointF15 = new PointF(f21, f22);
                        jsonReader.j();
                        pointF9 = pointF15;
                        pointF8 = pointF14;
                        break;
                    }
                case 5:
                    if (jsonReader.w() != 1) {
                        z12 = false;
                        break;
                    } else {
                        z12 = true;
                        break;
                    }
                case 6:
                    pointF10 = s.e(jsonReader, f11);
                    break;
                case 7:
                    pointF11 = s.e(jsonReader, f11);
                    break;
                default:
                    jsonReader.V();
                    break;
            }
        }
        boolean z14 = z12;
        PointF pointF16 = pointF8;
        jsonReader.j();
        if (z14) {
            interpolator2 = f57939b;
            t11 = t12;
        } else {
            if (pointF4 != null && pointF5 != null) {
                interpolator = b(pointF4, pointF5);
            } else {
                if (pointF6 != null && pointF7 != null && pointF16 != null && pointF9 != null) {
                    b11 = b(pointF6, pointF16);
                    b12 = b(pointF7, pointF9);
                    t11 = t13;
                    interpolator2 = null;
                    if (b11 != null || b12 == null) {
                        pointF = pointF10;
                        pointF2 = pointF11;
                        aVar = new k1.a<>(kVar, t12, t11, interpolator2, f13, null);
                    } else {
                        pointF2 = pointF11;
                        pointF = pointF10;
                        aVar = new k1.a<>(kVar, t12, t11, b11, b12, f13, null);
                    }
                    aVar.f64889o = pointF;
                    aVar.f64890p = pointF2;
                    return aVar;
                }
                interpolator = f57939b;
            }
            interpolator2 = interpolator;
            t11 = t13;
        }
        b11 = null;
        b12 = null;
        if (b11 != null) {
        }
        pointF = pointF10;
        pointF2 = pointF11;
        aVar = new k1.a<>(kVar, t12, t11, interpolator2, f13, null);
        aVar.f64889o = pointF;
        aVar.f64890p = pointF2;
        return aVar;
    }

    public static <T> k1.a<T> f(JsonReader jsonReader, float f11, n0<T> n0Var) throws IOException {
        return new k1.a<>(n0Var.a(jsonReader, f11));
    }

    public static SparseArrayCompat<WeakReference<Interpolator>> g() {
        if (f57940c == null) {
            f57940c = new SparseArrayCompat<>();
        }
        return f57940c;
    }

    public static void h(int i11, WeakReference<Interpolator> weakReference) {
        synchronized (t.class) {
            f57940c.put(i11, weakReference);
        }
    }
}
