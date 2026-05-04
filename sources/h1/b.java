package h1;

import com.airbnb.lottie.parser.moshi.JsonReader;
import java.io.IOException;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public class b {

    /* renamed from: a, reason: collision with root package name */
    public static final JsonReader.a f57888a = JsonReader.a.a("a");

    /* renamed from: b, reason: collision with root package name */
    public static final JsonReader.a f57889b = JsonReader.a.a("fc", com.igexin.push.g.o.f38736e, "sw", "t");

    public static d1.k a(JsonReader jsonReader, com.airbnb.lottie.k kVar) throws IOException {
        jsonReader.e();
        d1.k kVar2 = null;
        while (jsonReader.k()) {
            if (jsonReader.S(f57888a) != 0) {
                jsonReader.U();
                jsonReader.V();
            } else {
                kVar2 = b(jsonReader, kVar);
            }
        }
        jsonReader.j();
        return kVar2 == null ? new d1.k(null, null, null, null) : kVar2;
    }

    public static d1.k b(JsonReader jsonReader, com.airbnb.lottie.k kVar) throws IOException {
        jsonReader.e();
        d1.a aVar = null;
        d1.a aVar2 = null;
        d1.b bVar = null;
        d1.b bVar2 = null;
        while (jsonReader.k()) {
            int S = jsonReader.S(f57889b);
            if (S == 0) {
                aVar = d.c(jsonReader, kVar);
            } else if (S == 1) {
                aVar2 = d.c(jsonReader, kVar);
            } else if (S == 2) {
                bVar = d.e(jsonReader, kVar);
            } else if (S != 3) {
                jsonReader.U();
                jsonReader.V();
            } else {
                bVar2 = d.e(jsonReader, kVar);
            }
        }
        jsonReader.j();
        return new d1.k(aVar, aVar2, bVar, bVar2);
    }
}
