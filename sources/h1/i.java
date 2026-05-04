package h1;

import com.airbnb.lottie.model.DocumentData;
import com.airbnb.lottie.parser.moshi.JsonReader;
import java.io.IOException;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public class i implements n0<DocumentData> {

    /* renamed from: a, reason: collision with root package name */
    public static final i f57905a = new i();

    /* renamed from: b, reason: collision with root package name */
    public static final JsonReader.a f57906b = JsonReader.a.a("t", "f", "s", "j", "tr", "lh", "ls", "fc", com.igexin.push.g.o.f38736e, "sw", "of");

    @Override // h1.n0
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public DocumentData a(JsonReader jsonReader, float f11) throws IOException {
        DocumentData.Justification justification = DocumentData.Justification.CENTER;
        jsonReader.e();
        DocumentData.Justification justification2 = justification;
        String str = null;
        String str2 = null;
        float f12 = 0.0f;
        float f13 = 0.0f;
        float f14 = 0.0f;
        float f15 = 0.0f;
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        boolean z11 = true;
        while (jsonReader.k()) {
            switch (jsonReader.S(f57906b)) {
                case 0:
                    str = jsonReader.E();
                    break;
                case 1:
                    str2 = jsonReader.E();
                    break;
                case 2:
                    f12 = (float) jsonReader.r();
                    break;
                case 3:
                    int w11 = jsonReader.w();
                    justification2 = DocumentData.Justification.CENTER;
                    if (w11 <= justification2.ordinal() && w11 >= 0) {
                        justification2 = DocumentData.Justification.values()[w11];
                        break;
                    }
                    break;
                case 4:
                    i11 = jsonReader.w();
                    break;
                case 5:
                    f13 = (float) jsonReader.r();
                    break;
                case 6:
                    f14 = (float) jsonReader.r();
                    break;
                case 7:
                    i12 = s.d(jsonReader);
                    break;
                case 8:
                    i13 = s.d(jsonReader);
                    break;
                case 9:
                    f15 = (float) jsonReader.r();
                    break;
                case 10:
                    z11 = jsonReader.q();
                    break;
                default:
                    jsonReader.U();
                    jsonReader.V();
                    break;
            }
        }
        jsonReader.j();
        return new DocumentData(str, str2, f12, justification2, i11, f13, f14, i12, i13, f15, z11);
    }
}
