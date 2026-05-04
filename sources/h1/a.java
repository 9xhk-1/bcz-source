package h1;

import android.graphics.PointF;
import com.airbnb.lottie.parser.moshi.JsonReader;
import java.io.IOException;
import java.util.ArrayList;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    public static final JsonReader.a f57886a = JsonReader.a.a("k", "x", "y");

    public static d1.e a(JsonReader jsonReader, com.airbnb.lottie.k kVar) throws IOException {
        ArrayList arrayList = new ArrayList();
        if (jsonReader.I() == JsonReader.Token.BEGIN_ARRAY) {
            jsonReader.c();
            while (jsonReader.k()) {
                arrayList.add(z.a(jsonReader, kVar));
            }
            jsonReader.f();
            u.b(arrayList);
        } else {
            arrayList.add(new k1.a(s.e(jsonReader, j1.j.e())));
        }
        return new d1.e(arrayList);
    }

    public static d1.m<PointF, PointF> b(JsonReader jsonReader, com.airbnb.lottie.k kVar) throws IOException {
        jsonReader.e();
        d1.e eVar = null;
        d1.b bVar = null;
        boolean z11 = false;
        d1.b bVar2 = null;
        while (jsonReader.I() != JsonReader.Token.END_OBJECT) {
            int S = jsonReader.S(f57886a);
            if (S == 0) {
                eVar = a(jsonReader, kVar);
            } else if (S != 1) {
                if (S != 2) {
                    jsonReader.U();
                    jsonReader.V();
                } else if (jsonReader.I() == JsonReader.Token.STRING) {
                    jsonReader.V();
                    z11 = true;
                } else {
                    bVar = d.e(jsonReader, kVar);
                }
            } else if (jsonReader.I() == JsonReader.Token.STRING) {
                jsonReader.V();
                z11 = true;
            } else {
                bVar2 = d.e(jsonReader, kVar);
            }
        }
        jsonReader.j();
        if (z11) {
            kVar.a("Lottie doesn't support expressions.");
        }
        return eVar != null ? eVar : new d1.i(bVar2, bVar);
    }
}
