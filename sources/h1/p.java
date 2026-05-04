package h1;

import android.graphics.Path;
import com.airbnb.lottie.model.content.GradientType;
import com.airbnb.lottie.parser.moshi.JsonReader;
import java.io.IOException;
import java.util.Collections;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public class p {

    /* renamed from: a, reason: collision with root package name */
    public static final JsonReader.a f57930a = JsonReader.a.a("nm", "g", "o", "t", "s", "e", en.r.f50027a, "hd");

    /* renamed from: b, reason: collision with root package name */
    public static final JsonReader.a f57931b = JsonReader.a.a("p", "k");

    public static e1.e a(JsonReader jsonReader, com.airbnb.lottie.k kVar) throws IOException {
        d1.d dVar = null;
        Path.FillType fillType = Path.FillType.WINDING;
        String str = null;
        GradientType gradientType = null;
        d1.c cVar = null;
        d1.f fVar = null;
        d1.f fVar2 = null;
        boolean z11 = false;
        while (jsonReader.k()) {
            switch (jsonReader.S(f57930a)) {
                case 0:
                    str = jsonReader.E();
                    break;
                case 1:
                    jsonReader.e();
                    int i11 = -1;
                    while (jsonReader.k()) {
                        int S = jsonReader.S(f57931b);
                        if (S == 0) {
                            i11 = jsonReader.w();
                        } else if (S != 1) {
                            jsonReader.U();
                            jsonReader.V();
                        } else {
                            cVar = d.g(jsonReader, kVar, i11);
                        }
                    }
                    jsonReader.j();
                    break;
                case 2:
                    dVar = d.h(jsonReader, kVar);
                    break;
                case 3:
                    gradientType = jsonReader.w() == 1 ? GradientType.LINEAR : GradientType.RADIAL;
                    break;
                case 4:
                    fVar = d.i(jsonReader, kVar);
                    break;
                case 5:
                    fVar2 = d.i(jsonReader, kVar);
                    break;
                case 6:
                    fillType = jsonReader.w() == 1 ? Path.FillType.WINDING : Path.FillType.EVEN_ODD;
                    break;
                case 7:
                    z11 = jsonReader.q();
                    break;
                default:
                    jsonReader.U();
                    jsonReader.V();
                    break;
            }
        }
        if (dVar == null) {
            dVar = new d1.d(Collections.singletonList(new k1.a(100)));
        }
        return new e1.e(str, gradientType, fillType, cVar, dVar, fVar, fVar2, null, null, z11);
    }
}
