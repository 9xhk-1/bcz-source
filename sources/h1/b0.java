package h1;

import android.graphics.PointF;
import com.airbnb.lottie.parser.moshi.JsonReader;
import java.io.IOException;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public class b0 implements n0<PointF> {

    /* renamed from: a, reason: collision with root package name */
    public static final b0 f57890a = new b0();

    @Override // h1.n0
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public PointF a(JsonReader jsonReader, float f11) throws IOException {
        JsonReader.Token I = jsonReader.I();
        if (I == JsonReader.Token.BEGIN_ARRAY) {
            return s.e(jsonReader, f11);
        }
        if (I == JsonReader.Token.BEGIN_OBJECT) {
            return s.e(jsonReader, f11);
        }
        if (I == JsonReader.Token.NUMBER) {
            PointF pointF = new PointF(((float) jsonReader.r()) * f11, ((float) jsonReader.r()) * f11);
            while (jsonReader.k()) {
                jsonReader.V();
            }
            return pointF;
        }
        throw new IllegalArgumentException("Cannot convert json to point. Next token is " + I);
    }
}
