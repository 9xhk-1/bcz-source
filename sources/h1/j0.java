package h1;

import com.airbnb.lottie.parser.moshi.JsonReader;
import java.io.IOException;
import java.util.ArrayList;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public class j0 {

    /* renamed from: a, reason: collision with root package name */
    public static final JsonReader.a f57913a = JsonReader.a.a("nm", "hd", "it");

    public static e1.k a(JsonReader jsonReader, com.airbnb.lottie.k kVar) throws IOException {
        ArrayList arrayList = new ArrayList();
        String str = null;
        boolean z11 = false;
        while (jsonReader.k()) {
            int S = jsonReader.S(f57913a);
            if (S == 0) {
                str = jsonReader.E();
            } else if (S == 1) {
                z11 = jsonReader.q();
            } else if (S != 2) {
                jsonReader.V();
            } else {
                jsonReader.c();
                while (jsonReader.k()) {
                    e1.c a11 = h.a(jsonReader, kVar);
                    if (a11 != null) {
                        arrayList.add(a11);
                    }
                }
                jsonReader.f();
            }
        }
        return new e1.k(str, arrayList, z11);
    }
}
