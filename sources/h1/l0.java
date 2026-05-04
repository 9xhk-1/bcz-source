package h1;

import com.airbnb.lottie.model.content.ShapeStroke;
import com.airbnb.lottie.parser.moshi.JsonReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public class l0 {

    /* renamed from: a, reason: collision with root package name */
    public static final JsonReader.a f57923a = JsonReader.a.a("nm", "c", "w", "o", "lc", "lj", "ml", "hd", "d");

    /* renamed from: b, reason: collision with root package name */
    public static final JsonReader.a f57924b = JsonReader.a.a("n", "v");

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r15v0 */
    /* JADX WARN: Type inference failed for: r15v1, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r15v2 */
    /* JADX WARN: Type inference failed for: r15v3, types: [d1.b] */
    /* JADX WARN: Type inference failed for: r15v4 */
    public static ShapeStroke a(JsonReader jsonReader, com.airbnb.lottie.k kVar) throws IOException {
        ?? r15;
        ArrayList arrayList = new ArrayList();
        String str = null;
        d1.b bVar = null;
        d1.a aVar = null;
        d1.b bVar2 = null;
        ShapeStroke.LineCapType lineCapType = null;
        ShapeStroke.LineJoinType lineJoinType = null;
        String str2 = null;
        float f11 = 0.0f;
        boolean z11 = false;
        d1.d dVar = null;
        while (jsonReader.k()) {
            switch (jsonReader.S(f57923a)) {
                case 0:
                    str = jsonReader.E();
                    break;
                case 1:
                    aVar = d.c(jsonReader, kVar);
                    break;
                case 2:
                    bVar2 = d.e(jsonReader, kVar);
                    break;
                case 3:
                    dVar = d.h(jsonReader, kVar);
                    break;
                case 4:
                    lineCapType = ShapeStroke.LineCapType.values()[jsonReader.w() - 1];
                    break;
                case 5:
                    lineJoinType = ShapeStroke.LineJoinType.values()[jsonReader.w() - 1];
                    break;
                case 6:
                    f11 = (float) jsonReader.r();
                    break;
                case 7:
                    z11 = jsonReader.q();
                    break;
                case 8:
                    jsonReader.c();
                    while (jsonReader.k()) {
                        jsonReader.e();
                        String str3 = str2;
                        r15 = str3;
                        while (jsonReader.k()) {
                            int S = jsonReader.S(f57924b);
                            if (S == 0) {
                                str3 = jsonReader.E();
                            } else if (S != 1) {
                                jsonReader.U();
                                jsonReader.V();
                            } else {
                                r15 = d.e(jsonReader, kVar);
                            }
                            r15 = r15;
                        }
                        jsonReader.j();
                        str3.getClass();
                        switch (str3) {
                            case "d":
                            case "g":
                                kVar.y(true);
                                arrayList.add(r15);
                                break;
                            case "o":
                                bVar = r15;
                                break;
                        }
                        str2 = null;
                    }
                    jsonReader.f();
                    if (arrayList.size() == 1) {
                        arrayList.add((d1.b) arrayList.get(0));
                        break;
                    }
                    break;
                default:
                    jsonReader.V();
                    continue;
            }
            str2 = null;
        }
        if (dVar == null) {
            dVar = new d1.d(Collections.singletonList(new k1.a(100)));
        }
        return new ShapeStroke(str, bVar, arrayList, aVar, dVar, bVar2, lineCapType, lineJoinType, f11, z11);
    }
}
