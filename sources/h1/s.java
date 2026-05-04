package h1;

import android.graphics.Color;
import android.graphics.PointF;
import androidx.annotation.ColorInt;
import com.airbnb.lottie.parser.moshi.JsonReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public class s {

    /* renamed from: a, reason: collision with root package name */
    public static final JsonReader.a f57936a = JsonReader.a.a("x", "y");

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f57937a;

        static {
            int[] iArr = new int[JsonReader.Token.values().length];
            f57937a = iArr;
            try {
                iArr[JsonReader.Token.NUMBER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f57937a[JsonReader.Token.BEGIN_ARRAY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f57937a[JsonReader.Token.BEGIN_OBJECT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public static PointF a(JsonReader jsonReader, float f11) throws IOException {
        jsonReader.c();
        float r11 = (float) jsonReader.r();
        float r12 = (float) jsonReader.r();
        while (jsonReader.I() != JsonReader.Token.END_ARRAY) {
            jsonReader.V();
        }
        jsonReader.f();
        return new PointF(r11 * f11, r12 * f11);
    }

    public static PointF b(JsonReader jsonReader, float f11) throws IOException {
        float r11 = (float) jsonReader.r();
        float r12 = (float) jsonReader.r();
        while (jsonReader.k()) {
            jsonReader.V();
        }
        return new PointF(r11 * f11, r12 * f11);
    }

    public static PointF c(JsonReader jsonReader, float f11) throws IOException {
        jsonReader.e();
        float f12 = 0.0f;
        float f13 = 0.0f;
        while (jsonReader.k()) {
            int S = jsonReader.S(f57936a);
            if (S == 0) {
                f12 = g(jsonReader);
            } else if (S != 1) {
                jsonReader.U();
                jsonReader.V();
            } else {
                f13 = g(jsonReader);
            }
        }
        jsonReader.j();
        return new PointF(f12 * f11, f13 * f11);
    }

    @ColorInt
    public static int d(JsonReader jsonReader) throws IOException {
        jsonReader.c();
        int r11 = (int) (jsonReader.r() * 255.0d);
        int r12 = (int) (jsonReader.r() * 255.0d);
        int r13 = (int) (jsonReader.r() * 255.0d);
        while (jsonReader.k()) {
            jsonReader.V();
        }
        jsonReader.f();
        return Color.argb(255, r11, r12, r13);
    }

    public static PointF e(JsonReader jsonReader, float f11) throws IOException {
        int i11 = a.f57937a[jsonReader.I().ordinal()];
        if (i11 == 1) {
            return b(jsonReader, f11);
        }
        if (i11 == 2) {
            return a(jsonReader, f11);
        }
        if (i11 == 3) {
            return c(jsonReader, f11);
        }
        throw new IllegalArgumentException("Unknown point starts with " + jsonReader.I());
    }

    public static List<PointF> f(JsonReader jsonReader, float f11) throws IOException {
        ArrayList arrayList = new ArrayList();
        jsonReader.c();
        while (jsonReader.I() == JsonReader.Token.BEGIN_ARRAY) {
            jsonReader.c();
            arrayList.add(e(jsonReader, f11));
            jsonReader.f();
        }
        jsonReader.f();
        return arrayList;
    }

    public static float g(JsonReader jsonReader) throws IOException {
        JsonReader.Token I = jsonReader.I();
        int i11 = a.f57937a[I.ordinal()];
        if (i11 == 1) {
            return (float) jsonReader.r();
        }
        if (i11 != 2) {
            throw new IllegalArgumentException("Unknown value for token of type " + I);
        }
        jsonReader.c();
        float r11 = (float) jsonReader.r();
        while (jsonReader.k()) {
            jsonReader.V();
        }
        jsonReader.f();
        return r11;
    }
}
