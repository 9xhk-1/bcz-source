package h1;

import android.graphics.Path;
import com.airbnb.lottie.parser.moshi.JsonReader;
import java.io.IOException;
import java.util.Collections;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public class i0 {

    /* renamed from: a, reason: collision with root package name */
    public static final JsonReader.a f57907a = JsonReader.a.a("nm", "c", "o", "fillEnabled", en.r.f50027a, "hd");

    public static e1.j a(JsonReader jsonReader, com.airbnb.lottie.k kVar) throws IOException {
        d1.d dVar = null;
        String str = null;
        d1.a aVar = null;
        boolean z11 = false;
        boolean z12 = false;
        int i11 = 1;
        while (jsonReader.k()) {
            int S = jsonReader.S(f57907a);
            if (S == 0) {
                str = jsonReader.E();
            } else if (S == 1) {
                aVar = d.c(jsonReader, kVar);
            } else if (S == 2) {
                dVar = d.h(jsonReader, kVar);
            } else if (S == 3) {
                z11 = jsonReader.q();
            } else if (S == 4) {
                i11 = jsonReader.w();
            } else if (S != 5) {
                jsonReader.U();
                jsonReader.V();
            } else {
                z12 = jsonReader.q();
            }
        }
        if (dVar == null) {
            dVar = new d1.d(Collections.singletonList(new k1.a(100)));
        }
        return new e1.j(str, z11, i11 == 1 ? Path.FillType.WINDING : Path.FillType.EVEN_ODD, aVar, dVar, z12);
    }
}
