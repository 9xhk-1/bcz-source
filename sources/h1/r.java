package h1;

import com.airbnb.lottie.parser.moshi.JsonReader;
import java.io.IOException;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public class r implements n0<Integer> {

    /* renamed from: a, reason: collision with root package name */
    public static final r f57935a = new r();

    @Override // h1.n0
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public Integer a(JsonReader jsonReader, float f11) throws IOException {
        return Integer.valueOf(Math.round(s.g(jsonReader) * f11));
    }
}
