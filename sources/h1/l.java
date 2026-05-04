package h1;

import com.airbnb.lottie.parser.moshi.JsonReader;
import java.io.IOException;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public class l implements n0<Float> {

    /* renamed from: a, reason: collision with root package name */
    public static final l f57922a = new l();

    @Override // h1.n0
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public Float a(JsonReader jsonReader, float f11) throws IOException {
        return Float.valueOf(s.g(jsonReader) * f11);
    }
}
