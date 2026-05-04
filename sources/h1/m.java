package h1;

import com.airbnb.lottie.parser.moshi.JsonReader;
import ix.g;
import java.io.IOException;
import java.util.ArrayList;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public class m {

    /* renamed from: a, reason: collision with root package name */
    public static final JsonReader.a f57925a = JsonReader.a.a("ch", g.b.f62794h, "w", "style", "fFamily", "data");

    /* renamed from: b, reason: collision with root package name */
    public static final JsonReader.a f57926b = JsonReader.a.a("shapes");

    public static c1.c a(JsonReader jsonReader, com.airbnb.lottie.k kVar) throws IOException {
        ArrayList arrayList = new ArrayList();
        jsonReader.e();
        double d11 = 0.0d;
        String str = null;
        String str2 = null;
        char c11 = 0;
        double d12 = 0.0d;
        while (jsonReader.k()) {
            int S = jsonReader.S(f57925a);
            if (S == 0) {
                c11 = jsonReader.E().charAt(0);
            } else if (S == 1) {
                d12 = jsonReader.r();
            } else if (S == 2) {
                d11 = jsonReader.r();
            } else if (S == 3) {
                str = jsonReader.E();
            } else if (S == 4) {
                str2 = jsonReader.E();
            } else if (S != 5) {
                jsonReader.U();
                jsonReader.V();
            } else {
                jsonReader.e();
                while (jsonReader.k()) {
                    if (jsonReader.S(f57926b) != 0) {
                        jsonReader.U();
                        jsonReader.V();
                    } else {
                        jsonReader.c();
                        while (jsonReader.k()) {
                            arrayList.add((e1.k) h.a(jsonReader, kVar));
                        }
                        jsonReader.f();
                    }
                }
                jsonReader.j();
            }
        }
        jsonReader.j();
        return new c1.c(arrayList, c11, d12, d11, str, str2);
    }
}
