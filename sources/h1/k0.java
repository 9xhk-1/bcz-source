package h1;

import com.airbnb.lottie.parser.moshi.JsonReader;
import java.io.IOException;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public class k0 {

    /* renamed from: a, reason: collision with root package name */
    public static JsonReader.a f57921a = JsonReader.a.a("nm", "ind", "ks", "hd");

    public static e1.l a(JsonReader jsonReader, com.airbnb.lottie.k kVar) throws IOException {
        String str = null;
        int i11 = 0;
        boolean z11 = false;
        d1.h hVar = null;
        while (jsonReader.k()) {
            int S = jsonReader.S(f57921a);
            if (S == 0) {
                str = jsonReader.E();
            } else if (S == 1) {
                i11 = jsonReader.w();
            } else if (S == 2) {
                hVar = d.k(jsonReader, kVar);
            } else if (S != 3) {
                jsonReader.V();
            } else {
                z11 = jsonReader.q();
            }
        }
        return new e1.l(str, i11, hVar, z11);
    }
}
