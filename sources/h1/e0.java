package h1;

import com.airbnb.lottie.parser.moshi.JsonReader;
import java.io.IOException;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public class e0 {

    /* renamed from: a, reason: collision with root package name */
    public static final JsonReader.a f57897a = JsonReader.a.a("nm", "c", "o", "tr", "hd");

    public static e1.g a(JsonReader jsonReader, com.airbnb.lottie.k kVar) throws IOException {
        String str = null;
        d1.b bVar = null;
        d1.b bVar2 = null;
        d1.l lVar = null;
        boolean z11 = false;
        while (jsonReader.k()) {
            int S = jsonReader.S(f57897a);
            if (S == 0) {
                str = jsonReader.E();
            } else if (S == 1) {
                bVar = d.f(jsonReader, kVar, false);
            } else if (S == 2) {
                bVar2 = d.f(jsonReader, kVar, false);
            } else if (S == 3) {
                lVar = c.g(jsonReader, kVar);
            } else if (S != 4) {
                jsonReader.V();
            } else {
                z11 = jsonReader.q();
            }
        }
        return new e1.g(str, bVar, bVar2, lVar, z11);
    }
}
