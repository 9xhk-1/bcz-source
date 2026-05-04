package h1;

import android.graphics.Color;
import com.airbnb.lottie.parser.moshi.JsonReader;
import java.io.IOException;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public class g implements n0<Integer> {

    /* renamed from: a, reason: collision with root package name */
    public static final g f57900a = new g();

    @Override // h1.n0
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public Integer a(JsonReader jsonReader, float f11) throws IOException {
        boolean z11 = jsonReader.I() == JsonReader.Token.BEGIN_ARRAY;
        if (z11) {
            jsonReader.c();
        }
        double r11 = jsonReader.r();
        double r12 = jsonReader.r();
        double r13 = jsonReader.r();
        double r14 = jsonReader.I() == JsonReader.Token.NUMBER ? jsonReader.r() : 1.0d;
        if (z11) {
            jsonReader.f();
        }
        if (r11 <= 1.0d && r12 <= 1.0d && r13 <= 1.0d) {
            r11 *= 255.0d;
            r12 *= 255.0d;
            r13 *= 255.0d;
            if (r14 <= 1.0d) {
                r14 *= 255.0d;
            }
        }
        return Integer.valueOf(Color.argb((int) r14, (int) r11, (int) r12, (int) r13));
    }
}
