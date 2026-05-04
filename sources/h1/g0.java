package h1;

import com.airbnb.lottie.parser.moshi.JsonReader;
import java.io.IOException;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public class g0 implements n0<k1.k> {

    /* renamed from: a, reason: collision with root package name */
    public static final g0 f57901a = new g0();

    @Override // h1.n0
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public k1.k a(JsonReader jsonReader, float f11) throws IOException {
        boolean z11 = jsonReader.I() == JsonReader.Token.BEGIN_ARRAY;
        if (z11) {
            jsonReader.c();
        }
        float r11 = (float) jsonReader.r();
        float r12 = (float) jsonReader.r();
        while (jsonReader.k()) {
            jsonReader.V();
        }
        if (z11) {
            jsonReader.f();
        }
        return new k1.k((r11 / 100.0f) * f11, (r12 / 100.0f) * f11);
    }
}
