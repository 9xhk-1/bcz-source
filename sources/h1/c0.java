package h1;

import android.graphics.PointF;
import com.airbnb.lottie.model.content.PolystarShape;
import com.airbnb.lottie.parser.moshi.JsonReader;
import com.meizu.cloud.pushsdk.notification.model.AdvertisementOption;
import java.io.IOException;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public class c0 {

    /* renamed from: a, reason: collision with root package name */
    public static final JsonReader.a f57893a = JsonReader.a.a("nm", "sy", AdvertisementOption.PRIORITY_VALID_TIME, "p", en.r.f50027a, "or", "os", "ir", "is", "hd", "d");

    public static PolystarShape a(JsonReader jsonReader, com.airbnb.lottie.k kVar, int i11) throws IOException {
        boolean z11 = false;
        boolean z12 = i11 == 3;
        String str = null;
        PolystarShape.Type type = null;
        d1.b bVar = null;
        d1.m<PointF, PointF> mVar = null;
        d1.b bVar2 = null;
        d1.b bVar3 = null;
        d1.b bVar4 = null;
        d1.b bVar5 = null;
        d1.b bVar6 = null;
        while (jsonReader.k()) {
            switch (jsonReader.S(f57893a)) {
                case 0:
                    str = jsonReader.E();
                    break;
                case 1:
                    type = PolystarShape.Type.forValue(jsonReader.w());
                    break;
                case 2:
                    bVar = d.f(jsonReader, kVar, false);
                    break;
                case 3:
                    mVar = a.b(jsonReader, kVar);
                    break;
                case 4:
                    bVar2 = d.f(jsonReader, kVar, false);
                    break;
                case 5:
                    bVar4 = d.e(jsonReader, kVar);
                    break;
                case 6:
                    bVar6 = d.f(jsonReader, kVar, false);
                    break;
                case 7:
                    bVar3 = d.e(jsonReader, kVar);
                    break;
                case 8:
                    bVar5 = d.f(jsonReader, kVar, false);
                    break;
                case 9:
                    z11 = jsonReader.q();
                    break;
                case 10:
                    if (jsonReader.w() != 3) {
                        z12 = false;
                        break;
                    } else {
                        z12 = true;
                        break;
                    }
                default:
                    jsonReader.U();
                    jsonReader.V();
                    break;
            }
        }
        return new PolystarShape(str, type, bVar, mVar, bVar2, bVar3, bVar4, bVar5, bVar6, z11, z12);
    }
}
