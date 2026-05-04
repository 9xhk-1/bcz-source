package h1;

import com.airbnb.lottie.model.content.GradientType;
import com.airbnb.lottie.model.content.ShapeStroke;
import com.airbnb.lottie.parser.moshi.JsonReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public class q {

    /* renamed from: a, reason: collision with root package name */
    public static final JsonReader.a f57932a = JsonReader.a.a("nm", "g", "o", "t", "s", "e", "w", "lc", "lj", "ml", "hd", "d");

    /* renamed from: b, reason: collision with root package name */
    public static final JsonReader.a f57933b = JsonReader.a.a("p", "k");

    /* renamed from: c, reason: collision with root package name */
    public static final JsonReader.a f57934c = JsonReader.a.a("n", "v");

    /* JADX WARN: Failed to find 'out' block for switch in B:5:0x0027. Please report as an issue. */
    public static com.airbnb.lottie.model.content.a a(JsonReader jsonReader, com.airbnb.lottie.k kVar) throws IOException {
        d1.d dVar;
        ArrayList arrayList = new ArrayList();
        GradientType gradientType = null;
        String str = null;
        d1.c cVar = null;
        d1.f fVar = null;
        d1.f fVar2 = null;
        d1.b bVar = null;
        ShapeStroke.LineCapType lineCapType = null;
        ShapeStroke.LineJoinType lineJoinType = null;
        d1.b bVar2 = null;
        float f11 = 0.0f;
        boolean z11 = false;
        d1.d dVar2 = null;
        while (jsonReader.k()) {
            GradientType gradientType2 = gradientType;
            switch (jsonReader.S(f57932a)) {
                case 0:
                    str = jsonReader.E();
                    gradientType = gradientType2;
                    break;
                case 1:
                    dVar = dVar2;
                    jsonReader.e();
                    int i11 = -1;
                    while (jsonReader.k()) {
                        int S = jsonReader.S(f57933b);
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
                    gradientType = gradientType2;
                    dVar2 = dVar;
                    break;
                case 2:
                    dVar2 = d.h(jsonReader, kVar);
                    gradientType = gradientType2;
                    break;
                case 3:
                    dVar = dVar2;
                    gradientType = jsonReader.w() == 1 ? GradientType.LINEAR : GradientType.RADIAL;
                    dVar2 = dVar;
                    break;
                case 4:
                    fVar = d.i(jsonReader, kVar);
                    gradientType = gradientType2;
                    break;
                case 5:
                    fVar2 = d.i(jsonReader, kVar);
                    gradientType = gradientType2;
                    break;
                case 6:
                    bVar = d.e(jsonReader, kVar);
                    gradientType = gradientType2;
                    break;
                case 7:
                    dVar = dVar2;
                    lineCapType = ShapeStroke.LineCapType.values()[jsonReader.w() - 1];
                    gradientType = gradientType2;
                    dVar2 = dVar;
                    break;
                case 8:
                    dVar = dVar2;
                    lineJoinType = ShapeStroke.LineJoinType.values()[jsonReader.w() - 1];
                    gradientType = gradientType2;
                    dVar2 = dVar;
                    break;
                case 9:
                    dVar = dVar2;
                    f11 = (float) jsonReader.r();
                    gradientType = gradientType2;
                    dVar2 = dVar;
                    break;
                case 10:
                    z11 = jsonReader.q();
                    gradientType = gradientType2;
                    break;
                case 11:
                    jsonReader.c();
                    while (jsonReader.k()) {
                        jsonReader.e();
                        String str2 = null;
                        d1.b bVar3 = null;
                        while (jsonReader.k()) {
                            int S2 = jsonReader.S(f57934c);
                            if (S2 != 0) {
                                d1.d dVar3 = dVar2;
                                if (S2 != 1) {
                                    jsonReader.U();
                                    jsonReader.V();
                                } else {
                                    bVar3 = d.e(jsonReader, kVar);
                                }
                                dVar2 = dVar3;
                            } else {
                                str2 = jsonReader.E();
                            }
                        }
                        d1.d dVar4 = dVar2;
                        jsonReader.j();
                        if (str2.equals("o")) {
                            bVar2 = bVar3;
                        } else if (str2.equals("d") || str2.equals("g")) {
                            kVar.y(true);
                            arrayList.add(bVar3);
                            dVar2 = dVar4;
                        }
                        dVar2 = dVar4;
                    }
                    dVar = dVar2;
                    jsonReader.f();
                    if (arrayList.size() == 1) {
                        arrayList.add((d1.b) arrayList.get(0));
                    }
                    gradientType = gradientType2;
                    dVar2 = dVar;
                    break;
                default:
                    jsonReader.U();
                    jsonReader.V();
                    gradientType = gradientType2;
                    break;
            }
        }
        d1.d dVar5 = dVar2;
        return new com.airbnb.lottie.model.content.a(str, gradientType, cVar, dVar5 == null ? new d1.d(Collections.singletonList(new k1.a(100))) : dVar5, fVar, fVar2, bVar, lineCapType, lineJoinType, f11, arrayList, bVar2, z11);
    }
}
