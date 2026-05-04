package h1;

import com.airbnb.lottie.parser.moshi.JsonReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public class u {

    /* renamed from: a, reason: collision with root package name */
    public static JsonReader.a f57943a = JsonReader.a.a("k");

    public static <T> List<k1.a<T>> a(JsonReader jsonReader, com.airbnb.lottie.k kVar, float f11, n0<T> n0Var, boolean z11) throws IOException {
        JsonReader jsonReader2;
        com.airbnb.lottie.k kVar2;
        float f12;
        n0<T> n0Var2;
        boolean z12;
        ArrayList arrayList = new ArrayList();
        if (jsonReader.I() == JsonReader.Token.STRING) {
            kVar.a("Lottie doesn't support expressions.");
            return arrayList;
        }
        jsonReader.e();
        while (jsonReader.k()) {
            if (jsonReader.S(f57943a) != 0) {
                jsonReader.V();
            } else if (jsonReader.I() == JsonReader.Token.BEGIN_ARRAY) {
                jsonReader.c();
                if (jsonReader.I() == JsonReader.Token.NUMBER) {
                    JsonReader jsonReader3 = jsonReader;
                    com.airbnb.lottie.k kVar3 = kVar;
                    float f13 = f11;
                    n0<T> n0Var3 = n0Var;
                    boolean z13 = z11;
                    k1.a c11 = t.c(jsonReader3, kVar3, f13, n0Var3, false, z13);
                    jsonReader2 = jsonReader3;
                    kVar2 = kVar3;
                    f12 = f13;
                    n0Var2 = n0Var3;
                    z12 = z13;
                    arrayList.add(c11);
                } else {
                    jsonReader2 = jsonReader;
                    kVar2 = kVar;
                    f12 = f11;
                    n0Var2 = n0Var;
                    z12 = z11;
                    while (jsonReader2.k()) {
                        arrayList.add(t.c(jsonReader2, kVar2, f12, n0Var2, true, z12));
                    }
                }
                jsonReader2.f();
                jsonReader = jsonReader2;
                kVar = kVar2;
                f11 = f12;
                n0Var = n0Var2;
                z11 = z12;
            } else {
                JsonReader jsonReader4 = jsonReader;
                arrayList.add(t.c(jsonReader4, kVar, f11, n0Var, false, z11));
                jsonReader = jsonReader4;
            }
        }
        jsonReader.j();
        b(arrayList);
        return arrayList;
    }

    public static <T> void b(List<? extends k1.a<T>> list) {
        int i11;
        T t11;
        int size = list.size();
        int i12 = 0;
        while (true) {
            i11 = size - 1;
            if (i12 >= i11) {
                break;
            }
            k1.a<T> aVar = list.get(i12);
            i12++;
            k1.a<T> aVar2 = list.get(i12);
            aVar.f64882h = Float.valueOf(aVar2.f64881g);
            if (aVar.f64877c == null && (t11 = aVar2.f64876b) != null) {
                aVar.f64877c = t11;
                if (aVar instanceof z0.i) {
                    ((z0.i) aVar).i();
                }
            }
        }
        k1.a<T> aVar3 = list.get(i11);
        if ((aVar3.f64876b == null || aVar3.f64877c == null) && list.size() > 1) {
            list.remove(aVar3);
        }
    }
}
