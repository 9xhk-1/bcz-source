package h1;

import com.airbnb.lottie.parser.moshi.JsonReader;
import java.io.IOException;
import java.util.List;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public class d {
    public static <T> List<k1.a<T>> a(JsonReader jsonReader, float f11, com.airbnb.lottie.k kVar, n0<T> n0Var) throws IOException {
        return u.a(jsonReader, kVar, f11, n0Var, false);
    }

    public static <T> List<k1.a<T>> b(JsonReader jsonReader, com.airbnb.lottie.k kVar, n0<T> n0Var) throws IOException {
        return u.a(jsonReader, kVar, 1.0f, n0Var, false);
    }

    public static d1.a c(JsonReader jsonReader, com.airbnb.lottie.k kVar) throws IOException {
        return new d1.a(b(jsonReader, kVar, g.f57900a));
    }

    public static d1.j d(JsonReader jsonReader, com.airbnb.lottie.k kVar) throws IOException {
        return new d1.j(b(jsonReader, kVar, i.f57905a));
    }

    public static d1.b e(JsonReader jsonReader, com.airbnb.lottie.k kVar) throws IOException {
        return f(jsonReader, kVar, true);
    }

    public static d1.b f(JsonReader jsonReader, com.airbnb.lottie.k kVar, boolean z11) throws IOException {
        return new d1.b(a(jsonReader, z11 ? j1.j.e() : 1.0f, kVar, l.f57922a));
    }

    public static d1.c g(JsonReader jsonReader, com.airbnb.lottie.k kVar, int i11) throws IOException {
        return new d1.c(b(jsonReader, kVar, new o(i11)));
    }

    public static d1.d h(JsonReader jsonReader, com.airbnb.lottie.k kVar) throws IOException {
        return new d1.d(b(jsonReader, kVar, r.f57935a));
    }

    public static d1.f i(JsonReader jsonReader, com.airbnb.lottie.k kVar) throws IOException {
        return new d1.f(u.a(jsonReader, kVar, j1.j.e(), b0.f57890a, true));
    }

    public static d1.g j(JsonReader jsonReader, com.airbnb.lottie.k kVar) throws IOException {
        return new d1.g((List<k1.a<k1.k>>) b(jsonReader, kVar, g0.f57901a));
    }

    public static d1.h k(JsonReader jsonReader, com.airbnb.lottie.k kVar) throws IOException {
        return new d1.h(a(jsonReader, j1.j.e(), kVar, h0.f57903a));
    }
}
