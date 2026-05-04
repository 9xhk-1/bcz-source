package h1;

import com.airbnb.lottie.parser.moshi.JsonReader;
import java.io.IOException;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public class n {

    /* renamed from: a, reason: collision with root package name */
    public static final JsonReader.a f57928a = JsonReader.a.a("fFamily", "fName", "fStyle", "ascent");

    public static c1.b a(JsonReader jsonReader) throws IOException {
        jsonReader.e();
        String str = null;
        String str2 = null;
        float f11 = 0.0f;
        String str3 = null;
        while (jsonReader.k()) {
            int S = jsonReader.S(f57928a);
            if (S == 0) {
                str = jsonReader.E();
            } else if (S == 1) {
                str3 = jsonReader.E();
            } else if (S == 2) {
                str2 = jsonReader.E();
            } else if (S != 3) {
                jsonReader.U();
                jsonReader.V();
            } else {
                f11 = (float) jsonReader.r();
            }
        }
        jsonReader.j();
        return new c1.b(str, str3, str2, f11);
    }
}
