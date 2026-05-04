package h1;

import androidx.annotation.Nullable;
import com.airbnb.lottie.parser.moshi.JsonReader;
import java.io.IOException;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public class e {

    /* renamed from: a, reason: collision with root package name */
    public static final JsonReader.a f57895a = JsonReader.a.a("ef");

    /* renamed from: b, reason: collision with root package name */
    public static final JsonReader.a f57896b = JsonReader.a.a(com.alipay.sdk.m.s.a.f11005s, "v");

    @Nullable
    public static e1.a a(JsonReader jsonReader, com.airbnb.lottie.k kVar) throws IOException {
        jsonReader.e();
        e1.a aVar = null;
        while (true) {
            boolean z11 = false;
            while (jsonReader.k()) {
                int S = jsonReader.S(f57896b);
                if (S != 0) {
                    if (S != 1) {
                        jsonReader.U();
                        jsonReader.V();
                    } else if (z11) {
                        aVar = new e1.a(d.e(jsonReader, kVar));
                    } else {
                        jsonReader.V();
                    }
                } else if (jsonReader.w() == 0) {
                    z11 = true;
                }
            }
            jsonReader.j();
            return aVar;
        }
    }

    @Nullable
    public static e1.a b(JsonReader jsonReader, com.airbnb.lottie.k kVar) throws IOException {
        e1.a aVar = null;
        while (jsonReader.k()) {
            if (jsonReader.S(f57895a) != 0) {
                jsonReader.U();
                jsonReader.V();
            } else {
                jsonReader.c();
                while (jsonReader.k()) {
                    e1.a a11 = a(jsonReader, kVar);
                    if (a11 != null) {
                        aVar = a11;
                    }
                }
                jsonReader.f();
            }
        }
        return aVar;
    }
}
