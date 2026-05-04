package h1;

import android.graphics.PointF;
import com.airbnb.lottie.parser.moshi.JsonReader;
import java.io.IOException;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public class d0 {

    /* renamed from: a, reason: collision with root package name */
    public static final JsonReader.a f57894a = JsonReader.a.a("nm", "p", "s", en.r.f50027a, "hd");

    public static e1.f a(JsonReader jsonReader, com.airbnb.lottie.k kVar) throws IOException {
        String str = null;
        d1.m<PointF, PointF> mVar = null;
        d1.f fVar = null;
        d1.b bVar = null;
        boolean z11 = false;
        while (jsonReader.k()) {
            int S = jsonReader.S(f57894a);
            if (S == 0) {
                str = jsonReader.E();
            } else if (S == 1) {
                mVar = a.b(jsonReader, kVar);
            } else if (S == 2) {
                fVar = d.i(jsonReader, kVar);
            } else if (S == 3) {
                bVar = d.e(jsonReader, kVar);
            } else if (S != 4) {
                jsonReader.V();
            } else {
                z11 = jsonReader.q();
            }
        }
        return new e1.f(str, mVar, fVar, bVar, z11);
    }
}
