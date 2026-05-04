package h1;

import android.graphics.PointF;
import com.airbnb.lottie.parser.moshi.JsonReader;
import java.io.IOException;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public class f {

    /* renamed from: a, reason: collision with root package name */
    public static final JsonReader.a f57898a = JsonReader.a.a("nm", "p", "s", "hd", "d");

    public static e1.b a(JsonReader jsonReader, com.airbnb.lottie.k kVar, int i11) throws IOException {
        boolean z11 = i11 == 3;
        boolean z12 = false;
        String str = null;
        d1.m<PointF, PointF> mVar = null;
        d1.f fVar = null;
        while (jsonReader.k()) {
            int S = jsonReader.S(f57898a);
            if (S == 0) {
                str = jsonReader.E();
            } else if (S == 1) {
                mVar = a.b(jsonReader, kVar);
            } else if (S == 2) {
                fVar = d.i(jsonReader, kVar);
            } else if (S == 3) {
                z12 = jsonReader.q();
            } else if (S != 4) {
                jsonReader.U();
                jsonReader.V();
            } else {
                z11 = jsonReader.w() == 3;
            }
        }
        return new e1.b(str, mVar, fVar, z11, z12);
    }
}
