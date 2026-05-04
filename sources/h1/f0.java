package h1;

import androidx.annotation.Nullable;
import com.airbnb.lottie.parser.moshi.JsonReader;
import java.io.IOException;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public class f0 {

    /* renamed from: a, reason: collision with root package name */
    public static final JsonReader.a f57899a = JsonReader.a.a("nm", en.r.f50027a, "hd");

    @Nullable
    public static e1.h a(JsonReader jsonReader, com.airbnb.lottie.k kVar) throws IOException {
        boolean z11 = false;
        String str = null;
        d1.b bVar = null;
        while (jsonReader.k()) {
            int S = jsonReader.S(f57899a);
            if (S == 0) {
                str = jsonReader.E();
            } else if (S == 1) {
                bVar = d.f(jsonReader, kVar, true);
            } else if (S != 2) {
                jsonReader.V();
            } else {
                z11 = jsonReader.q();
            }
        }
        if (z11) {
            return null;
        }
        return new e1.h(str, bVar);
    }
}
