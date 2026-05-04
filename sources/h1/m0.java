package h1;

import com.airbnb.lottie.model.content.ShapeTrimPath;
import com.airbnb.lottie.parser.moshi.JsonReader;
import java.io.IOException;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public class m0 {

    /* renamed from: a, reason: collision with root package name */
    public static final JsonReader.a f57927a = JsonReader.a.a("s", "e", "o", "nm", "m", "hd");

    public static ShapeTrimPath a(JsonReader jsonReader, com.airbnb.lottie.k kVar) throws IOException {
        String str = null;
        ShapeTrimPath.Type type = null;
        d1.b bVar = null;
        d1.b bVar2 = null;
        d1.b bVar3 = null;
        boolean z11 = false;
        while (jsonReader.k()) {
            int S = jsonReader.S(f57927a);
            if (S == 0) {
                bVar = d.f(jsonReader, kVar, false);
            } else if (S == 1) {
                bVar2 = d.f(jsonReader, kVar, false);
            } else if (S == 2) {
                bVar3 = d.f(jsonReader, kVar, false);
            } else if (S == 3) {
                str = jsonReader.E();
            } else if (S == 4) {
                type = ShapeTrimPath.Type.forId(jsonReader.w());
            } else if (S != 5) {
                jsonReader.V();
            } else {
                z11 = jsonReader.q();
            }
        }
        return new ShapeTrimPath(str, type, bVar, bVar2, bVar3, z11);
    }
}
